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
module fitfile4j.cli {

	requires fitfile4j;
	requires org.slf4j;
	requires info.picocli;
	requires java.desktop;
	requires java.sql;
	requires com.fasterxml.jackson.jr.ob;
	requires com.fasterxml.jackson.core;
	requires duckdb.jdbc;

	// picocli
	opens com.meistermeier.fitfile4j.cli;
	opens com.meistermeier.fitfile4j.cli.commands;
	// flyway migration resources
	opens db.migration;

}
