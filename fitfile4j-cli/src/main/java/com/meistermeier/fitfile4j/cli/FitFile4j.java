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

import com.meistermeier.fitfile4j.cli.commands.DatabaseCommand;
import com.meistermeier.fitfile4j.cli.commands.ImageCommand;
import com.meistermeier.fitfile4j.cli.commands.JsonCommand;
import picocli.CommandLine;
import picocli.CommandLine.Model.CommandSpec;

/**
 * Entry point for the fitfile4j command line tool
 */
@CommandLine.Command(
	name = "fitfile4j",
	version = "1.0-SNAPSHOT",
	subcommands = {
		DatabaseCommand.class,
		ImageCommand.class,
		JsonCommand.class
	},
	mixinStandardHelpOptions = true
)
public class FitFile4j implements Runnable {

	@CommandLine.Option(names = "--help", usageHelp = true, description = "display this help")
	boolean help;

	@CommandLine.Spec
	CommandSpec spec;

	@Override
	public void run() {
		throw new CommandLine.ParameterException(spec.commandLine(), "Please use a subcommand");
	}

	public static void main(String[] args) {
		System.exit(new CommandLine(new FitFile4j()).execute(args));
	}

}
