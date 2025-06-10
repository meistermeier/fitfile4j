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

import com.meistermeier.fitfile4j.cli.FitFile4j;
import picocli.CommandLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;

/**
 * Create database with migrations
 */
@CommandLine.Command(name = "create")
public class CreateDatabaseCommand implements Callable<Integer> {

	@CommandLine.Option(names = "-d", defaultValue = FitFile4j.DEFAULT_DATABASE)
	String databaseFile;

	@CommandLine.Option(names = { "-o", "--overwrite" })
	boolean overwrite;

	@Override
	public Integer call() {
		Path databasePath = Paths.get(databaseFile);
		if (Files.exists(databasePath) && !overwrite) {
			System.err.println(
					"Database file already exists. If you want to overwrite it, use the command with the --overwrite flag.");
			return 1;
		}

		if (overwrite) {
			try {
				Files.delete(databasePath);
			}
			catch (IOException e) {
				throw new RuntimeException("Could not delete database file " + databasePath.toAbsolutePath(), e);
			}
		}
		String jdbcUrl = "jdbc:duckdb:" + databaseFile;
		try (var connection = DriverManager.getConnection(jdbcUrl)) {
			var migrationFolder = Path.of(CreateDatabaseCommand.class.getResource("/db/migration/").getFile());
			for (File migration : migrationFolder.toFile().listFiles()) {
				var lines = new BufferedReader(new FileReader(migration)).lines().toList();
				var statementBuilder = new StringBuilder();

				for (String line : lines) {
					statementBuilder.append(line);
					if (line.endsWith("\n")) {
						var statement = connection.prepareStatement(statementBuilder.toString());
						statement.executeUpdate();
						statement.close();
					}
				}
			}
		}
		catch (SQLException | FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return 0;
	}

}
