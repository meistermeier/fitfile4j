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


import org.flywaydb.core.Flyway;
import picocli.CommandLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

/**
 * Create database with migrations
 */
@CommandLine.Command(name = "create")
public class CreateDatabaseCommand implements Callable<Integer> {

	@CommandLine.Option(names = "-d", defaultValue = "something.db")
	String databaseFile;

	@CommandLine.Option(names = {"-o", "--overwrite"})
	boolean overwrite;

	@Override
	public Integer call() {
		if (Files.exists(Paths.get(databaseFile)) && !overwrite) {
			System.err.println("Database file already exists. If you want to overwrite it, use the command with the --overwrite flag.");
			return 1;
		}

		String jdbcUrl = "jdbc:duckdb:" + databaseFile;
		var flyway = Flyway.configure().dataSource(jdbcUrl, null, null).load();
		var migrationResult = flyway.migrate();
		if (migrationResult.success) {
			System.out.println("Migration successful.");
		}

		return 0;
	}
}
