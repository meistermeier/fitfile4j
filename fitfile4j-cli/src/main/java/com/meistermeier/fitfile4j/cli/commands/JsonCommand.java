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
package com.meistermeier.fitfile4j.cli.commands;

import com.fasterxml.jackson.jr.ob.JSON;
import com.fasterxml.jackson.jr.ob.JacksonJrExtension;
import com.fasterxml.jackson.jr.ob.api.ExtensionContext;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.cli.json.FitFileWriterProvider;
import picocli.CommandLine;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Command to generate path images from fit file coordinates
 */
@CommandLine.Command(name = "json")
public class JsonCommand implements Callable<Integer> {

	@CommandLine.Parameters
	File fitFileSource;

	@CommandLine.Option(names = {"-n", "--names"}, description = "Resolves names of messages and fields")
	boolean names;

	@Override
	public Integer call() throws Exception {
		var fitFile = FitFile.from(fitFileSource);
		var json = JSON.builder().register(new JacksonJrExtension() {
				@Override
				protected void register(ExtensionContext extensionContext) {
					extensionContext.appendProvider(new FitFileWriterProvider(names));
				}
			})
			.build();
		System.out.println(json.asString(fitFile.messages()));
		return 0;
	}

}
