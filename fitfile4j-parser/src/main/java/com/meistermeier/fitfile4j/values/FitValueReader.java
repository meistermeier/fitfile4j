package com.meistermeier.fitfile4j.values;

import java.util.function.Function;

/**
 * @author Gerrit Meier
 */
public class FitValueReader {

	static <T extends Number> T readValue(int endianness, byte[] input, Class<T> type, Function<Byte, T> converter) {
			if (endianness == 0) {
					T result = type.cast(0);
					for (var i = 0; i < input.length; i++) {
						result += type.cast(converter.apply(input[i]));
					}
					return (T) result;
			} else {
					T result = 0L;
					for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
						result += (Byte.toUnsignedLong(input[i]) << 8 * x);
					}
					return (T) result;
			}
	}
}
