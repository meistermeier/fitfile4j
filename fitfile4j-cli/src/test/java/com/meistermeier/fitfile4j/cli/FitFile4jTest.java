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
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
