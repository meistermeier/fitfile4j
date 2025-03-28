package com.meistermeier.garmin4j.cli;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.meistermeier.garmin4j.FitFile;
import com.meistermeier.garmin4j.Message;

import java.io.IOException;
import java.util.Map;

public class FitFileModule extends SimpleModule {

    public static class FitFileSerializer extends StdSerializer<FitFile> {

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

    public static class MessageSerializer extends StdSerializer<Message> {

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

    public FitFileModule() {
        this.addSerializer(new FitFileSerializer());
        this.addSerializer(new MessageSerializer());
    }
}
