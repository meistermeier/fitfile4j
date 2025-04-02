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
package com.meistermeier.fitfile4j.values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Support for reading field values of messages.
 * A reader can be obtained by a type number with {@link ValueReader#getReader}.
 */
public interface ValueReader {

	ValueReader DEFAULT_INSTANCE = (input) -> (endianness) -> input;

	Function<Integer, Object> read(byte[] input);

	Map<Integer, ValueReader> valueReaderCache = new HashMap<>(ValueTypes.values().length);

	{
		for (ValueTypes valueType : ValueTypes.values()) {
			valueReaderCache.put(valueType.typeNumber, valueType.valueReader);
		}
	}

	static ValueReader getReader(int typeNumber) {
		return valueReaderCache.computeIfAbsent(typeNumber, (typeNumberToSearch) -> {
			for (ValueTypes valueType : ValueTypes.values()) {
				if (valueType.typeNumber == typeNumberToSearch) {
					return valueType.valueReader;
				}
			}
			return DEFAULT_INSTANCE;
		});
	}

	static <T> List<T> readList(int endianness, byte[] input, int typeLength) {
		List<T> result = new ArrayList<>();
		for (var i = 0; i < input.length; i += typeLength) {
			result.add(readNumber(endianness, Arrays.copyOfRange(input, i, i + typeLength)));
		}
		return result;
	}

	@SuppressWarnings({"unchecked"})
	static <T> T readNumber(int endianness, byte[] input) {
		if (endianness == 0) {
			if (input.length <= 3) {
				Integer result = 0;
				for (var i = 0; i < input.length; i++) {
					result += (Byte.toUnsignedInt(input[i]) << 8 * i);
				}
				return (T) result;
			} else {
				Long result = 0L;
				for (var i = 0; i < input.length; i++) {
					result += (Byte.toUnsignedLong(input[i]) << 8 * i);
				}
				return (T) result;
			}
		} else {
			if (input.length < 3) {
				Integer result = 0;
				for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
					result += (Byte.toUnsignedInt(input[i]) << 8 * x);
				}
				return (T) result;
			} else {
				Long result = 0L;
				for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
					result += (Byte.toUnsignedLong(input[i]) << 8 * x);
				}
				return (T) result;
			}
		}
	}

	static List<Float> readListFloat(int endianness, byte[] input, int typeLength) {
		List<Float> result = new ArrayList<>();
		for (var i = 0; i < input.length; i += typeLength) {
			result.add(readNumberFloat(endianness, Arrays.copyOfRange(input, i, i + typeLength)));
		}
		return result;
	}

	static Float readNumberFloat(int endianness, byte[] input) {
		Float result = 0f;
		if (endianness == 0) {
			for (var i = 0; i < input.length; i++) {
				result += (Byte.toUnsignedLong(input[i]) << 8 * i);
			}
		} else {
			for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
				result += (Byte.toUnsignedLong(input[i]) << 8 * x);
			}
		}
		return result;
	}

}
