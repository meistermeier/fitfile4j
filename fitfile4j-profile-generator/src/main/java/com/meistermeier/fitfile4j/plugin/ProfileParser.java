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
package com.meistermeier.fitfile4j.plugin;

import org.dhatim.fastexcel.reader.CellType;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ProfileParser {

	private static final String MESSAGE_NUMBER_KEY = "mesg_num";
	private final String profileSource;

	ProfileParser(String profileSource) {
		this.profileSource = profileSource;
	}

	Map<Integer, String> parseMessageNames() throws IOException {
		Map<Integer, String> messageNames = new HashMap<>();
		try (var workbook = new ReadableWorkbook(new File(profileSource))) {
			workbook.findSheet("Types")
				.ifPresent(wb -> {
					try {
						boolean startFound = false;
						for (Row row : wb.read()) {
							String cellValue = row.getCell(0).asString();
							if (MESSAGE_NUMBER_KEY.equals(cellValue)) {
								startFound = true;
							} else if (!cellValue.isBlank() && !messageNames.isEmpty()) {
								break;
							} else if (startFound && row.getCell(3).getType().equals(CellType.NUMBER)) {
								messageNames.put(row.getCell(3).asNumber().intValue(), row.getCellText(2));
							}
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				});
			return messageNames;
		}
	}

	record FieldName(Integer messageNumber, Integer fieldNumber, String name) {
	}

	List<FieldName> parseFieldNames(Map<Integer, String> parsedMessageNames) throws IOException {
		var messageNames = parsedMessageNames.entrySet().stream()
			.collect(Collectors.toUnmodifiableMap(Map.Entry::getValue, Map.Entry::getKey));
		List<FieldName> fieldNames = new ArrayList<>();

		try (var workbook = new ReadableWorkbook(new File(profileSource))) {
			workbook.findSheet("Messages")
				.ifPresent(wb -> {
					try {
						Integer currentMessage = null;
						for (Row row : wb.read()) {
							String cellValue = row.getCell(0).asString();
							if (!cellValue.isBlank()) {
								currentMessage = messageNames.get(cellValue);
								continue;
							}
							if (row.getCellRawValue(1).isPresent() && !row.getCellRawValue(1).get().isEmpty()) {
								fieldNames.add(new FieldName(currentMessage, row.getCellAsNumber(1).map(BigDecimal::intValue).orElseThrow(() -> new RuntimeException("could not convert field")), row.getCellText(2)));
							}
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				});
			return fieldNames;
		}
	}
}
