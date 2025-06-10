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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class FitFile4jTest {

	final PrintStream originalOut = System.out;

	final PrintStream originalErr = System.err;

	final ByteArrayOutputStream out = new ByteArrayOutputStream();

	final ByteArrayOutputStream err = new ByteArrayOutputStream();

	@Nested
	@DisplayName("main command")
	class MainCommand {

		@BeforeEach
		void cleanOutput() throws Exception {
			out.reset();
			err.reset();
			System.setOut(new PrintStream(out));
			System.setErr(new PrintStream(err));
		}

		@AfterEach
		void cleanOutputAgain() {
			System.setOut(originalOut);
			System.setErr(originalErr);
		}

		@Test
		void reportMissingSubcommand() {
			var fitFile4j = new FitFile4j();
			new CommandLine(fitFile4j).execute();
			assertEquals("Please provide a subcommand", err.toString().split("\n")[0]);
		}

	}

	@Nested
	@DisplayName("database")
	class Database {

		String tempDbName = "test.db";

		File tempDb;

		@BeforeEach
		void cleanOutput() throws Exception {
			String[] tempDbNameParts = tempDbName.split("\\.");
			tempDb = File.createTempFile(tempDbNameParts[0], tempDbNameParts[1]);
			tempDb.delete();

			out.reset();
			err.reset();
			System.setOut(new PrintStream(out));
			System.setErr(new PrintStream(err));
		}

		@AfterEach
		void cleanOutputAgain() {
			tempDb.delete();
			System.setOut(originalOut);
			System.setErr(originalErr);
		}

		@Test
		void reportMissingSubcommand() {
			var fitFile4j = new FitFile4j();
			new CommandLine(fitFile4j).execute("database");
			assertEquals("Please provide a database subcommand", err.toString().split("\n")[0]);
		}

		@Test
		void migrationSucceeds() {
			var fitFile4j = new FitFile4j();
			var returnValue = new CommandLine(fitFile4j).execute("database", "create", "-d", tempDb.getAbsolutePath());
			assertEquals(0, returnValue);
			assertTrue(tempDb.exists());

			verifyMigrationHasContent(tempDb.getAbsolutePath());
		}

		@Test
		void migrationFailsWhenFileExists() {
			var fitFile4j = new FitFile4j();
			// initial duckdb db creation
			new CommandLine(fitFile4j).execute("database", "create", "-d", tempDb.getAbsolutePath());
			var returnValue = new CommandLine(fitFile4j).execute("database", "create", "-d", tempDb.getAbsolutePath());
			assertEquals(1, returnValue);
			assertTrue(tempDb.exists());
		}

		@Test
		void migrationSucceedsWithOverwrite() {
			var fitFile4j = new FitFile4j();
			// initial duckdb db creation
			new CommandLine(fitFile4j).execute("database", "create", "-d", tempDb.getAbsolutePath());
			var returnValue = new CommandLine(fitFile4j).execute("database", "create", "-d", tempDb.getAbsolutePath(),
					"-o");
			assertEquals(0, returnValue);
			assertTrue(tempDb.exists());

			verifyMigrationHasContent(tempDb.getAbsolutePath());
		}

		private static void verifyMigrationHasContent(String databasePath) {
			try (var connection = DriverManager.getConnection("jdbc:duckdb:" + databasePath);
					var statement = connection.prepareStatement("SHOW TABLES")) {
				assertTrue(statement.executeQuery().getFetchSize() > 0);
			}
			catch (Exception e) {
				fail(e);
			}
		}

	}

}
