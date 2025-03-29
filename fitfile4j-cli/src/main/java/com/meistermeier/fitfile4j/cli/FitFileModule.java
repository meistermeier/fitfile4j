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
package com.meistermeier.fitfile4j.cli;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.FitFile.Message;

import java.io.IOException;
import java.util.Map;

class FitFileModule extends SimpleModule {

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
			jsonGenerator.writeObjectFieldStart("fields");
			for (Map.Entry<Integer, Object> field : message.fields().entrySet()) {
				Object value = field.getValue();
				jsonGenerator.writeObjectField(field.getKey().toString(), value);
			}
			jsonGenerator.writeEndObject();
			jsonGenerator.writeEndObject();
		}
	}

	FitFileModule() {
		this.addSerializer(new FitFileSerializer());
		this.addSerializer(new MessageSerializer());
	}
}
