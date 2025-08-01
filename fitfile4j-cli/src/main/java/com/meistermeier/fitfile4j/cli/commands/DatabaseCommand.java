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

import picocli.CommandLine;

/**
 * Command to generate path images from fit file coordinates
 */
@CommandLine.Command(name = "database", aliases = { "db" },
		subcommands = { CreateDatabaseCommand.class, InsertFitFileCommand.class, DeleteCommand.class })
public class DatabaseCommand implements Runnable {

	@CommandLine.Spec
	CommandLine.Model.CommandSpec spec;

	@Override
	public void run() {
		throw new CommandLine.ParameterException(spec.commandLine(), "Please provide a database subcommand");
	}

}
