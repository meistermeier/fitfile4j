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
import com.meistermeier.fitfile4j.names.MESG_NUM;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

		private final boolean withNames;

		protected MessageSerializer(boolean withNames) {
			super(Message.class);
			this.withNames = withNames;
		}

		@Override
		public void serialize(Message message, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
			jsonGenerator.writeStartObject();
			jsonGenerator.writeNumberField("message_number", message.messageNumber());
			if (withNames) {
				var messageName = MESG_NUM.findById(message.messageNumber());
				if (messageName != null) {
					jsonGenerator.writeStringField("message_name", messageName.getMessageName());
				}
			}
			jsonGenerator.writeObjectFieldStart("fields");
			for (FitFile.Entry entry : message.fields().fields()) {
				Object value = entry.value();
				String key;
				if (withNames) {
					FieldName fieldName = FieldName.findById(message.messageNumber(), entry.field().fieldDefinitionNumber());
					key = entry.field().devField()
						? entry.field().fieldName()
						: fieldName != null ? fieldName.getFieldName() : "" + entry.field().fieldDefinitionNumber();
					// Content warning: You will enter reflection hell here
					if (fieldName != null && fieldName.getEnumType() != null) {
						try {
							Method findMethod = null;
							try {
								findMethod = fieldName.getEnumType().getMethod("findById", int.class);
							} catch (NoSuchMethodException e) {
								findMethod = fieldName.getEnumType().getMethod("findById", long.class);
							}
							var result = findMethod.invoke(fieldName.getEnumType(), value);
							if (result != null) {
								var name = fieldName.getEnumType().getMethod("getMessageName");
								value = name.invoke(result);
							}
						} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
							throw new RuntimeException(e);
						}
					}
				} else {
					key = "" + entry.field().fieldDefinitionNumber();
				}
				jsonGenerator.writeObjectField(key, value);
			}
			jsonGenerator.writeEndObject();
			jsonGenerator.writeEndObject();
		}
	}

	public FitFileModule(boolean withNames) {
		this.addSerializer(new FitFileSerializer());
		this.addSerializer(new MessageSerializer(withNames));
	}
}
