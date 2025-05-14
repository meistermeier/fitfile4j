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
import com.meistermeier.fitfile4j.cli.commands.DatabaseCommand;
import com.meistermeier.fitfile4j.cli.commands.ImageCommand;
import com.meistermeier.fitfile4j.cli.json.FitFileModule;
import picocli.CommandLine;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Entry point for the fitfile4j command line tool
 */
@CommandLine.Command(
	subcommands = {DatabaseCommand.class, ImageCommand.class}
)
public class FitFile4j implements Callable<Integer> {

	@CommandLine.Option(names = {"-f", "--file"})
	File fitFile;

	@CommandLine.Option(names = {"-j", "--json"})
	boolean jsonExport;

	@CommandLine.Option(names = {"-n", "--names"})
	boolean names;

	@Override
	public Integer call() throws Exception {
		var fitContent = FitFile.from(fitFile);
		if (jsonExport) {
			var objectMapper = new ObjectMapper().registerModule(new FitFileModule(names));
			System.out.println(objectMapper.writeValueAsString(fitContent.messages()));
		}
		return 0;
	}

	public File getFitFile() {
		return fitFile;
	}

	public static void main(String[] args) {
		new CommandLine(new FitFile4j()).execute(args);
	}
}
