package com.meistermeier.garmin4j.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meistermeier.garmin4j.FitFile;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        var objectMapper = new ObjectMapper().registerModule(new FitFileModule());
        var file = Path.of("/Users/gerritmeier/projects/garmin_test_activities/raw_run.fit").toFile();
        try (var fileInputStream = new FileInputStream(file);
             var inputStream = new ByteArrayInputStream(fileInputStream.readAllBytes())) {

            var fitFile = FitFile.from(inputStream);
            System.out.println(objectMapper.writeValueAsString(fitFile.messages()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
