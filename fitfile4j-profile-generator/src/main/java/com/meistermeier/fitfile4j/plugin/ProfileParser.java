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

import org.dhatim.fastexcel.reader.ExcelReaderException;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ProfileParser {

	private final String profileSource;

	private static final List<String> LONG_VALUES = List.of("UINT32", "UINT32Z", "SINT32", "UINT64", "SINT64");

	ProfileParser(String profileSource) {
		this.profileSource = profileSource;
	}

	record Type(Long value, String name, boolean longType) {

	}

	Map<String, Collection<Type>> parseTypes() throws IOException {
		Map<String, Collection<Type>> types = new HashMap<>();
		try (var workbook = new ReadableWorkbook(new File(profileSource))) {
			workbook.findSheet("Types").ifPresent(wb -> {
				try {
					String currentType = null;
					boolean longType = false;
					for (Row row : wb.read()) {
						// skip first row
						if (row.getRowNum() == 0) {
							continue;
						}
						String cellValue = row.getCell(0).asString();
						if (!cellValue.isBlank()) {
							if (currentType != null && types.get(currentType).isEmpty()) {
								types.remove(currentType);
							}
							currentType = cellValue.toUpperCase();
							longType = LONG_VALUES.contains(row.getCellText(1).toUpperCase());
							types.put(currentType, new ArrayList<>());
						} else if (currentType != null) {
							try {
								String cellText = row.getCellText(3).trim();
								types.get(currentType)
									.add(new Type(cellText.startsWith("0x")
											? Long.parseLong(cellText.replaceAll("0x", ""), 16)
											: Long.parseLong(cellText), row.getCellText(2), longType));
							} catch (ExcelReaderException e) {
								System.err.println("nope");
							}
						}
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			});
			return types;
		}
	}

	record FieldName(Long messageNumber, Integer fieldNumber, String name, String enumType) {
	}

	List<FieldName> parseFieldNames(Collection<Type> types) throws IOException {
		var messageNames = types.stream().collect(Collectors.toUnmodifiableMap(type -> type.name, type -> type.value));
		List<FieldName> fieldNames = new ArrayList<>();

		try (var workbook = new ReadableWorkbook(new File(profileSource))) {
			workbook.findSheet("Messages").ifPresent(wb -> {
				try {
					Long currentMessage = null;
					for (Row row : wb.read()) {
						String cellValue = row.getCell(0).asString();
						if (!cellValue.isBlank()) {
							currentMessage = messageNames.get(cellValue);
							continue;
						}
						if (row.getCellRawValue(1).isPresent() && !row.getCellRawValue(1).get().isEmpty()) {
							fieldNames.add(new FieldName(currentMessage,
									row.getCellAsNumber(1)
										.map(BigDecimal::intValue)
										.orElseThrow(() -> new RuntimeException("could not convert field")),
									row.getCellText(2), row.getCellText(3)));
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
