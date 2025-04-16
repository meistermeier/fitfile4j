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
package com.meistermeier.fitfile4j.cli.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.FitFile.Message;
import com.meistermeier.fitfile4j.names.FieldName;
import com.meistermeier.fitfile4j.names.MessageName;

import java.io.IOException;
import java.util.Map;

/**
 * Jackson Module to serialize the data with names instead of just field and message numbers.
 */
public class FitFileModule extends SimpleModule {

	static class FitFileSerializer extends StdSerializer<FitFile> {

		protected FitFileSerializer() {
			super(FitFile.class);
		}

		@Override
		public void serialize(FitFile fitFile, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
			jsonGenerator.writeStartObject();

			jsonGenerator.writeObjectField("fields", fitFile.messages());
			jsonGenerator.writeEndObject();
		}
	}

	static class MessageSerializer extends StdSerializer<Message> {

		protected MessageSerializer() {
			super(Message.class);
		}

		@Override
		public void serialize(Message message, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeNumberField("message_number", message.messageNumber());
			var messageName = MessageName.findById(message.messageNumber());
			if (messageName != null) {
				jsonGenerator.writeStringField("message_name", messageName.getMessageName());
			}
			jsonGenerator.writeObjectFieldStart("fields");
			for (Map.Entry<FitFile.Field, Object> field : message.fields().entrySet()) {
				Object value = field.getValue();
				int i = field.getKey().fieldDefinitionNumber();

				FieldName fieldName = FieldName.findById(message.messageNumber(), field.getKey().fieldDefinitionNumber());
				var key = field.getKey().devField()
					? field.getKey().fieldName()
					: fieldName != null ? fieldName.getFieldName() : "" + field.getKey().fieldDefinitionNumber();
				jsonGenerator.writeObjectField(key, value);
			}
			jsonGenerator.writeEndObject();
			jsonGenerator.writeEndObject();
		}
	}

	public FitFileModule() {
		this.addSerializer(new FitFileSerializer());
		this.addSerializer(new MessageSerializer());
	}
}
