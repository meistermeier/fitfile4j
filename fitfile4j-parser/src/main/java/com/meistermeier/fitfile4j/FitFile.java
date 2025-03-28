package com.meistermeier.fitfile4j;

import com.meistermeier.fitfile4j.reader.ValueReader;
import com.meistermeier.fitfile4j.reader.ValueTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

import static java.lang.Byte.toUnsignedInt;
import static java.lang.Byte.toUnsignedLong;

public record FitFile(Header header, List<Message> messages) {

    private static final Logger LOGGER = LoggerFactory.getLogger(FitFile.class);

    public record Header(int length, int protocolVersion, String profileVersion, long dataSize, String dataType) {
    }

    public record Message(int messageNumber, Map<Integer, Object> fields) {
    }

    public static FitFile from(ByteArrayInputStream inputStream) throws IOException {
        Header header = readHeader(inputStream);
        List<Message> messages = readMessages(inputStream);

        return new FitFile(
                header,
                messages
        );
    }

    private static Header readHeader(ByteArrayInputStream inputStream) {
        try {
            var header = inputStream.readNBytes(14);
            var headerSize = toUnsignedInt(header[0]);
            var protocolVersion = header[1] >> 4;

            var profileField1 = toUnsignedInt(header[2]);
            var profileField2 = toUnsignedInt(header[3]) << 8;
            var profileFieldsCombined = profileField1 + profileField2;
            var profileVersion = "%s.%s".formatted(profileFieldsCombined / 100, profileFieldsCombined % 100);

            var dataSize = toUnsignedLong(header[4])
                    + (toUnsignedLong(header[5]) << 8)
                    + (toUnsignedLong(header[6]) << 16)
                    + (toUnsignedLong(header[7]) << 24);

            var dataType = new String(new char[]{(char) header[8], (char) header[9], (char) header[10], (char) header[11]});

            return new Header(headerSize, protocolVersion, profileVersion, dataSize, dataType);
        } catch (IOException e) {
            throw new RuntimeException("Could not read header", e);
        }
    }

    private record FieldDefinition(int fieldDefinitionNumber, int baseType, int readLength) {}

    private record MessageDefinition(int messageNumber, List<FieldDefinition> fieldDefinitions, int endianness) {

        public Message readMessage(ByteArrayInputStream inputStream) throws IOException {
            var fields = new HashMap<Integer, Object>();
            for (FieldDefinition fieldDefinition : fieldDefinitions) {
                var fieldBuffer = inputStream.readNBytes(fieldDefinition.readLength());
                var valueReader = Optional.ofNullable(ValueTypes.getReader(fieldDefinition.baseType)).orElse(ValueReader.DEFAULT_INSTANCE);
                Object apply = valueReader.read(fieldBuffer).apply(endianness);
                if (!apply.equals("illegal value")) {
                    fields.put(fieldDefinition.fieldDefinitionNumber, apply);
                }
            }

            return new Message(messageNumber, fields);
        }
    }

    private static List<Message> readMessages(ByteArrayInputStream inputStream) throws IOException {
        var messageDefinitions = new HashMap<Integer, MessageDefinition>();
        var messages = new ArrayList<Message>();
        while (inputStream.available() > 0) {

            if (inputStream.available() == 2) {
                // todo crc
                break;
            }
            var recordHeader = RecordHeader.readRecordHeaderByte(inputStream);
            if (recordHeader.isDefinitionMessage()) {
                // unused but move the read head in a readable way
                // also this is documented as unused
                @SuppressWarnings("unused")
                var _reserved = inputStream.read();
                var endianness = inputStream.read();
                var typeFields = inputStream.readNBytes(2);
                var localMessageType = endianness == 0
                        ? toUnsignedInt(typeFields[0]) + (toUnsignedInt(typeFields[1]) << 8)
                        : toUnsignedInt(typeFields[1]) + (toUnsignedInt(typeFields[0]) << 8);

                var numberOfFields = inputStream.read();
                var fieldDefinitions = new ArrayList<FieldDefinition>();
                for (var i = 0; i < numberOfFields; i++) {
                    var fieldDefinitionNumber = inputStream.read();
                    var fieldLength = inputStream.read();
                    var baseType = inputStream.read();

                    FieldDefinition fieldDefinition = new FieldDefinition(fieldDefinitionNumber, baseType, fieldLength);
                    LOGGER.trace("{}", fieldDefinition);
                    fieldDefinitions.add(fieldDefinition);
                }
                messageDefinitions.put(recordHeader.localMessageNumber(), new MessageDefinition(localMessageType, fieldDefinitions, endianness));


            } else {
                if (!messageDefinitions.containsKey(recordHeader.localMessageNumber())) {
                    throw new IllegalStateException("Local message number %d not found.".formatted(recordHeader.localMessageNumber()));
                }
                var messageDefinition = messageDefinitions.get(recordHeader.localMessageNumber());
                LOGGER.trace("{}", messageDefinition);
                messages.add(messageDefinition.readMessage(inputStream));
            }
        }
        return messages;
    }

    private record RecordHeader(int headerType, int developerFlag, int localMessageNumber,
                                boolean isDefinitionMessage) {

        private static RecordHeader readRecordHeaderByte(ByteArrayInputStream inputStream) {
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
