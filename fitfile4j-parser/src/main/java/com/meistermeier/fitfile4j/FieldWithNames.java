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
package com.meistermeier.fitfile4j;

import com.meistermeier.fitfile4j.names.FieldName;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Represents a field with its name and value.
 * It will resolve the value of an enum from the Garmin SDK information if possible.
 *
 * @param fieldName name of field
 * @param value value of field, translated enum value, if possible
 */
public record FieldWithNames(String fieldName, Object value) {

	/**
	 * @param message the parsed message
	 * @param entry an entry of the message
	 * @return wrapper with resolved field name and enum value, if possible
	 */
	public static FieldWithNames resolve(FitFile.Message message, FitFile.Entry entry) {
		var value = entry.value();
		FieldName fieldName = FieldName.findById(message.messageNumber(),
			entry.field().fieldDefinitionNumber());
		String name = entry.field().devField() ? entry.field().fieldName()
			: fieldName != null ? fieldName.getFieldName() : "" + entry.field().fieldDefinitionNumber();
		// Content warning: You will enter reflection hell here
		if (fieldName != null && fieldName.getEnumType() != null) {
			try {
				Method findMethod = null;
				try {
					findMethod = fieldName.getEnumType().getMethod("findById", int.class);
				} catch (NoSuchMethodException e) {
					findMethod = fieldName.getEnumType().getMethod("findById", long.class);
				}
				var result = findMethod.invoke(fieldName.getEnumType(), value);
				if (result != null) {
					var messageName = fieldName.getEnumType().getMethod("getMessageName");
					value = messageName.invoke(result);
				}
			} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
				throw new RuntimeException(e);
			}
		}
		return new FieldWithNames(name, value);
	}
}
