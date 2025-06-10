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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.util.concurrent.Callable;

/**
 * Delete entry from database by id (=timestamp)
 */
@CommandLine.Command(name = "delete")
public class DeleteCommand implements Callable<Integer> {

	@CommandLine.Parameters
	Long id;

	@CommandLine.Option(names = "-d", defaultValue = FitFile4j.DEFAULT_DATABASE)
	String databaseFile;

	@Override
	public Integer call() throws Exception {
		if (!Files.exists(Paths.get(databaseFile))) {
			System.err.println("Database file does not exists. Please create one with the `db create` command.");
			return 1;
		}

		String jdbcUrl = "jdbc:duckdb:" + databaseFile;

		try (var connection = DriverManager.getConnection(jdbcUrl)) {

			try (var statement = connection.prepareStatement("DELETE FROM SESSION where activity_id = ?")) {
				statement.setObject(1, id);
				statement.executeUpdate();
			}
			try (var statement = connection.prepareStatement("DELETE FROM RECORD where activity_id = ?")) {
				statement.setObject(1, id);
				statement.executeUpdate();
			}
			try (var statement = connection.prepareStatement("DELETE FROM FIT_ACTIVITY where id = ?")) {
				statement.setObject(1, id);
				statement.executeUpdate();
			}
		}

		return 0;
	}

}
