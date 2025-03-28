package com.meistermeier.garmin4j.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meistermeier.garmin4j.FitFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger("Garmin Example");

    public static void main(String[] args) {
        var objectMapper = new ObjectMapper();
        objectMapper.registerModule(new FitFileModule());
        var file = Path.of("/Users/gerritmeier/projects/garmin_test_activities/raw_run.fit").toFile();
        try (var fileInputStream = new FileInputStream(file);
             var inputStream = new ByteArrayInputStream(fileInputStream.readAllBytes())) {

            var fitFile = FitFile.from(inputStream);
//            FileOutputStream fos = new FileOutputStream("test.json");
//            fos.write(objectMapper.writeValueAsString(fitFile.messages()).getBytes(StandardCharsets.UTF_8));
//            fos.close();
//            LOGGER.debug("{}", fitFile.messages());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
