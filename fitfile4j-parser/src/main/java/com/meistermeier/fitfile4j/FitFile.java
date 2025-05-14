/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.meistermeier.fitfile4j;

import com.meistermeier.fitfile4j.values.ValueReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * A parsed .fit file representation
 *
 * @param header   parsed header content
 * @param messages all recorded and parsed messages
 */
public record FitFile(Header header, List<Message> messages) {

	private static final int DEV_FIELD_DESCRIPTION_NUMBER = 206;

	private static final Logger LOGGER = LoggerFactory.getLogger(FitFile.class);

	/**
	 * Header of the .fit file
	 *
	 * @param length          length of the header
	 * @param protocolVersion .fit protocol version
	 * @param profileVersion  .fit SDK profile version
	 * @param dataSize        size of payload data, without header
	 * @param dataType        ".FIT" file, always for now
	 */
	public record Header(int length, int protocolVersion, String profileVersion, long dataSize, String dataType) {
	}

	/**
	 * Entry combines field and value
	 * @param field {@link Field} definition
	 * @param value value of this specific field within a message
	 */
	public record Entry(Field field, Object value) {

	}

	/**
	 * Represents the fields within a message
	 *
	 * @param fields all fields within a message
	 */
	public record Fields(Collection<Entry> fields) {

		public Optional<Entry> getFieldByFieldDefinitionNumber(int fieldDefinitionNumber) {
			for (Entry entry : fields) {
				if (entry.field().fieldDefinitionNumber == fieldDefinitionNumber && !entry.field().devField) {
					return Optional.of(entry);
				}
			}
			return Optional.empty();
		}
	}

	/**
	 * Message is a recorded entry in the .FIT file.
	 * There are repetitive ones like 'record' (msgNumber 20) or
	 * single ones like 'file_id' (msgNumber 0).
	 * The data itself won't tell before parsing finishes,
	 * how often which will appear.
	 * <p>
	 * Also, messages of the same type could have different fields.
	 *
	 * @param messageNumber the message number for this message type
	 * @param fields        all fields that are part of the message
	 */
	public record Message(int messageNumber, Fields fields) {
	}

	/**
	 * Field representation within a {@link Message}
	 * @param fieldName The given field name, if exists
	 * @param fieldDefinitionNumber The field definition number
	 * @param devField flag to indicate if this field is a development field
	 */
	public record Field(String fieldName, int fieldDefinitionNumber, boolean devField) {

		static Field from(String fieldName, FieldDefinition fieldDefinition) {
			return new Field(fieldName, fieldDefinition.fieldDefinitionNumber(), fieldDefinition.devField());
		}
	}

	/**
	 * Generate a {@link FitFile} from a stream.
	 *
	 * @param inputStream the stream consuming the .fit file
	 * @return {@link FitFile} with header and messages
	 * @throws IOException any unhandled exception on reading
	 */
	public static FitFile from(InputStream inputStream) throws IOException {
		var fitFileStream = new FitFileStream(inputStream);
		Header header = readHeader(fitFileStream);
		List<Message> messages = readMessages(fitFileStream);

		return new FitFile(
			header,
			messages
		);
	}

	/**
	 * Generate a {@link FitFile} from a file.
	 *
	 * @param file .fit file to read
	 * @return {@link FitFile} with header and messages
	 * @throws IOException any unhandled exception on reading
	 */
	public static FitFile from(File fileDefinition) throws IOException {
		return from(new FileInputStream(fileDefinition));
	}

	private static Header readHeader(FitFileStream inputStream) {
		try {
			// be sure to have a marker for legacy headers
			var header = inputStream.readNBytes(12);
			var headerSize = Byte.toUnsignedInt(header[0]);
			var protocolVersion = header[1] >> 4;

			var profileField1 = Byte.toUnsignedInt(header[2]);
			var profileField2 = Byte.toUnsignedInt(header[3]) << 8;
			var profileFieldsCombined = profileField1 + profileField2;
			var profileVersion = "%s.%s".formatted(profileFieldsCombined / 100, profileFieldsCombined % 100);

			var dataSize = Byte.toUnsignedLong(header[4])
				+ (Byte.toUnsignedLong(header[5]) << 8)
				+ (Byte.toUnsignedLong(header[6]) << 16)
				+ (Byte.toUnsignedLong(header[7]) << 24);

			var dataType = new String(new char[]{(char) header[8], (char) header[9], (char) header[10], (char) header[11]});
			if (headerSize == 14) {
				// crc but ignored for now
				inputStream.readNBytes(2);
			}

			return new Header(headerSize, protocolVersion, profileVersion, dataSize, dataType);
		} catch (IOException e) {
			throw new RuntimeException("Could not read header", e);
		}
	}

	private record FieldDefinition(int fieldDefinitionNumber, int baseType, int readLength, boolean devField) {
	}

	private record DeveloperField(int developerDataIndex, int fieldDefinitionNumber, int fitBaseTypeId, String fieldName) {
	}

	private record MessageDefinition(int messageNumber, List<FieldDefinition> fieldDefinitions, int endianness) {
		public Message readMessage(FitFileStream inputStream, List<DeveloperField> developerFields) throws IOException {
			var fields = new ArrayList<Entry>();
			String fieldName = null;
			for (FieldDefinition fieldDefinition : fieldDefinitions) {
				var fieldBuffer = inputStream.readNBytes(fieldDefinition.readLength());
				int baseType = fieldDefinition.baseType();
				if (fieldDefinition.devField() && messageNumber() != DEV_FIELD_DESCRIPTION_NUMBER && messageNumber() != 207) {
					var possibleDevField = developerFields.stream()
						.filter(df -> df.developerDataIndex() == fieldDefinition.baseType()
							&& fieldDefinition.fieldDefinitionNumber() == df.fieldDefinitionNumber())
						.findFirst();
					if (possibleDevField.isPresent()) {
						baseType = possibleDevField.get().fitBaseTypeId();
						fieldName = possibleDevField.get().fieldName();
					} else {
						fieldName = "dev__" + fieldDefinition.fieldDefinitionNumber();
					}
				}
				var valueReader = ValueReader.getReader(baseType);
				if (LOGGER.isTraceEnabled()) {
					LOGGER.trace("Reading {} as {} with {}", fieldDefinition.fieldDefinitionNumber(), baseType, fieldBuffer.length);
				}
				Object apply = valueReader.read(fieldBuffer).apply(endianness);
				if (!apply.equals("illegal value")) {
					if (fieldName == null) {
						fieldName = "" + fieldDefinition.fieldDefinitionNumber();
					}
					fields.add(new Entry(Field.from(fieldName, fieldDefinition), apply));
				}
			}

			return new Message(messageNumber, new Fields(fields));
		}
	}

	private static List<Message> readMessages(FitFileStream inputStream) throws IOException {
		var messageDefinitions = new HashMap<Integer, MessageDefinition>();
		var messages = new ArrayList<Message>();
		var developerFields = new ArrayList<DeveloperField>();
		while (inputStream.available() > 0) {

			if (inputStream.available() == 2) {
				LOGGER.debug("done");
				break;
			} else if (inputStream.available() < 2) {
				LOGGER.warn("The file is probably corrupted because the last pair of bytes (CRC) is incomplete.");
			}
			var recordHeader = RecordHeader.readRecordHeaderByte(inputStream);
			LOGGER.trace("{}", recordHeader);
			if (recordHeader.isDefinitionMessage()) {
				// unused but move the read head in a readable way
				// also this is documented as unused
				@SuppressWarnings("unused")
				var _reserved = inputStream.read();
				var endianness = inputStream.read();
				var typeFields = inputStream.readNBytes(2);
				var messageNumber = endianness == 0
					? Byte.toUnsignedInt(typeFields[0]) + (Byte.toUnsignedInt(typeFields[1]) << 8)
					: Byte.toUnsignedInt(typeFields[1]) + (Byte.toUnsignedInt(typeFields[0]) << 8);

				var numberOfFields = inputStream.read();
				var fieldDefinitions = new ArrayList<FieldDefinition>();
				LOGGER.trace("Got {} fields for message number {}", numberOfFields, messageNumber);
				for (var i = 0; i < numberOfFields; i++) {
					var fieldDefinitionNumber = inputStream.read();
					var fieldLength = inputStream.read();
					var baseType = inputStream.read();

					FieldDefinition fieldDefinition = new FieldDefinition(fieldDefinitionNumber, baseType, fieldLength, false);
					LOGGER.trace("{}", fieldDefinition);
					fieldDefinitions.add(fieldDefinition);
				}
				if (recordHeader.developerFlag() == 1) {
					var numberOfDeveloperFields = inputStream.read();
					LOGGER.trace("There are {} dev fields", numberOfDeveloperFields);
					for (var i = 0; i < numberOfDeveloperFields; i++) {
						var devFieldDefinitionNumber = inputStream.read();
						var devFieldLength = inputStream.read();
						var devIndex = inputStream.read();
						var fieldDefinition = new FieldDefinition(devFieldDefinitionNumber, devIndex, devFieldLength, true);
						fieldDefinitions.add(fieldDefinition);
					}
				}
				LOGGER.trace("local message number set {} read pos {}", recordHeader.localMessageNumber, inputStream.pos());
				messageDefinitions.put(recordHeader.localMessageNumber(), new MessageDefinition(messageNumber, fieldDefinitions, endianness));

			} else {
				LOGGER.trace("local message number get {} read pos {}", recordHeader.localMessageNumber, inputStream.pos());
				if (!messageDefinitions.containsKey(recordHeader.localMessageNumber())) {
					throw new IllegalStateException("Local message number %d not found.".formatted(recordHeader.localMessageNumber()));
				}
				var messageDefinition = messageDefinitions.get(recordHeader.localMessageNumber());
				LOGGER.trace("{}", messageDefinition);
				Message message = messageDefinition.readMessage(inputStream, developerFields);

				if (messageDefinition.messageNumber == DEV_FIELD_DESCRIPTION_NUMBER) {
					try {
						var developerDataIndex = (int) message.fields.getFieldByFieldDefinitionNumber(0).get().value();
						var fieldDefinitionNumber = (int) message.fields.getFieldByFieldDefinitionNumber(1).get().value();
						var fitBaseTypeId = (int) message.fields.getFieldByFieldDefinitionNumber(2).get().value();
						var fieldName = (String) message.fields.getFieldByFieldDefinitionNumber(3).get().value();
						developerFields.add(new DeveloperField(developerDataIndex, fieldDefinitionNumber, fitBaseTypeId, fieldName));
					} catch (ClassCastException e) {
						throw new IllegalArgumentException("could not read developer field" + messageDefinition, e);
					}
				}
				messages.add(message);
			}
		}
		return messages;
	}

	private record RecordHeader(int headerType, int developerFlag, int localMessageNumber,
								boolean isDefinitionMessage) {

		private static RecordHeader readRecordHeaderByte(FitFileStream inputStream) throws IOException {
			var recordHeaderByte = inputStream.read();
			var headerType = (recordHeaderByte >> 7) & 1;
			var developerFlag = (recordHeaderByte >> 5) & 1;
			var localMessageNumber = recordHeaderByte & 0x0F;
			var isDefinitionMessage = ((recordHeaderByte >> 6) & 1) == 1;
			if (headerType == 1) {
				throw new IllegalArgumentException("timestamp headers are not supported right now.");
			}

			RecordHeader recordHeader = new RecordHeader(headerType, developerFlag, localMessageNumber, isDefinitionMessage);
			LOGGER.trace("{}", recordHeader);
			return recordHeader;
		}
	}

}
