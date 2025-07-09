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
import com.fasterxml.jackson.jr.ob.api.ReaderWriterProvider;
import com.fasterxml.jackson.jr.ob.api.ValueWriter;
import com.fasterxml.jackson.jr.ob.impl.JSONWriter;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.names.FieldName;
import com.meistermeier.fitfile4j.names.MESG_NUM;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Jackson Module to serialize the data with names instead of just field and message
 * numbers.
 */
public class FitFileWriterProvider extends ReaderWriterProvider {

	private final boolean withNames;

	public FitFileWriterProvider(boolean withNames) {
		this.withNames = withNames;
	}

	@Override
	public ValueWriter findValueWriter(JSONWriter jsonWriter, Class<?> aClass) {

		if (aClass == FitFile.Message.class) {
			return new MessageWriter(withNames);
		}
		return super.findValueWriter(jsonWriter, aClass);
	}

	static class MessageWriter implements ValueWriter {

		private final boolean withNames;

		public MessageWriter(boolean withNames) {
			this.withNames = withNames;
		}

		@Override
		public void writeValue(JSONWriter jsonWriter, JsonGenerator jsonGenerator, Object o) throws IOException {
			var message = (FitFile.Message) o;
			jsonGenerator.writeStartObject();
			jsonGenerator.writeNumberField("message_number", message.messageNumber());
			if (withNames) {
				var messageName = MESG_NUM.findById(message.messageNumber());
				if (messageName != null) {
					jsonGenerator.writeStringField("message_name", messageName.getMessageName());
				}
			}
			jsonGenerator.writeObjectFieldStart("entries");
			for (FitFile.Entry entry : message.fields().entries()) {
				Object value = entry.value();
				String key;
				if (withNames) {
					FieldName fieldName = FieldName.findById(message.messageNumber(),
							entry.field().fieldDefinitionNumber());
					key = entry.field().devField() ? entry.field().fieldName()
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
						} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException
								| IllegalArgumentException e) {
							throw new RuntimeException(e);
						}
					}
				} else {
					key = "" + entry.field().fieldDefinitionNumber();
				}
				jsonGenerator.writeFieldName(key);
				jsonWriter.writeValue(value);
			}
			jsonGenerator.writeEndObject();
			jsonGenerator.writeEndObject();
		}

		@Override
		public Class<?> valueType() {
			return FitFile.class;
		}

	}

}
