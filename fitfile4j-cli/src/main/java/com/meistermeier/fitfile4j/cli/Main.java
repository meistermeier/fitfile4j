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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meistermeier.fitfile4j.FitFile;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Simple cli application that takes a .fit file
 * as input, and generates a JSON representation from it.
 */
public class Main {

	public static void main(String[] args) {
		var objectMapper = new ObjectMapper().registerModule(new FitFileModule());
		var file = Path.of(args[0]).toFile();
		try (var fileInputStream = new FileInputStream(file);
			var inputStream = new ByteArrayInputStream(fileInputStream.readAllBytes())) {

			var fitFile = FitFile.from(inputStream);
			System.out.println(objectMapper.writeValueAsString(fitFile.header()));

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
