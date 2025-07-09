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

import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.cli.FitFile4j;
import picocli.CommandLine;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/**
 * Insert content of fit file into database
 */
@CommandLine.Command(name = "insert")
public class InsertFitFileCommand implements Callable<Integer> {

	private static final long FIT_TIME_OFFSET = 631065600000L;

	@CommandLine.Parameters
	File fitFileSource;

	@CommandLine.Option(names = "-d", defaultValue = FitFile4j.DEFAULT_DATABASE)
	String databaseFile;

	@Override
	public Integer call() throws Exception {
		if (!Files.exists(Paths.get(databaseFile))) {
			System.err.println("Database file does not exists. Please create one with the `db create` command.");
			return 1;
		}

		String jdbcUrl = "jdbc:duckdb:" + databaseFile;

		var fitFile = FitFile.from(fitFileSource);
		var sportMessage = fitFile.messages()
			.stream()
			.filter(m -> m.messageNumber() == 12)
			.findFirst()
			.get()
			.fields()
			.entries()
			.stream()
			.collect(Collectors.toMap(e -> e.field().fieldDefinitionNumber(), FitFile.Entry::value));
		var sportName = sportMessage.get(3);
		var sport = sportMessage.get(0);
		var subSport = sportMessage.get(1);

		var createFields = fitFile.messages()
			.stream()
			.filter(m -> m.messageNumber() == 0)
			.findFirst()
			.get()
			.fields()
			.entries()
			.stream()
			.collect(Collectors.toMap(e -> e.field().fieldDefinitionNumber(), FitFile.Entry::value));
		long id = (long) createFields.get(4);
		var createdAt = FIT_TIME_OFFSET + id * 1000;
		var product = createFields.get(2);

		var sessionInfo = fitFile.messages()
			.stream()
			.filter(m -> m.messageNumber() == 18)
			.findFirst()
			.get()
			.fields()
			.entries()
			.stream()
			.collect(Collectors.toMap(e -> e.field().fieldDefinitionNumber(), FitFile.Entry::value));
		float avgSpeed = 0f;
		if (sessionInfo.get(14) != null) {
			avgSpeed = (int) sessionInfo.get(14);
		} else {
			avgSpeed = (long) sessionInfo.get(124);
		}

		var duration = (long) sessionInfo.get(8);
		var distance = (long) sessionInfo.get(9);

		var records = fitFile.messages()
			.stream()
			.filter(m -> m.messageNumber() == 20)
			.map(m -> m.fields()
				.entries()
				.stream()
				.collect(Collectors.toMap(e -> e.field().fieldDefinitionNumber(), FitFile.Entry::value)))
			.toList();

		try (var connection = DriverManager.getConnection(jdbcUrl)) {

			try (var statement = connection.prepareStatement(
					"INSERT INTO FIT_ACTIVITY (id, sportName, sport, sub_sport, created_at) VALUES (?, ?, ?, ?, ?)")) {
				statement.setObject(1, id);
				statement.setObject(2, sportName);
				statement.setObject(3, sport);
				statement.setObject(4, subSport);
				statement.setObject(5, createdAt);
				statement.executeUpdate();
			}
			try (var statement = connection.prepareStatement(
					"INSERT INTO SESSION (activity_id, avg_speed, total_elapsed_time, total_distance) VALUES (?, ?, ?, ?)")) {
				statement.setObject(1, id);
				statement.setObject(2, avgSpeed);
				statement.setObject(3, duration);
				statement.setObject(4, distance);
				statement.executeUpdate();
			}
			try (var statement = connection.prepareStatement(
					"INSERT INTO RECORD (activity_id, lat, lng, speed, heart_rate, altitude) VALUES (?, ?, ?, ?, ?, ?)")) {
				for (Map<Integer, Object> r : records) {
					statement.setObject(1, id);
					statement.setObject(2, r.get(0));
					statement.setObject(3, r.get(1));
					statement.setObject(4, r.getOrDefault(6, r.get(73)));
					statement.setObject(5, r.get(3));
					statement.setObject(6, r.get(2));
					statement.addBatch();
				}
				statement.executeBatch();
			}
		}

		return 0;
	}

}
