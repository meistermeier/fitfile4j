package com.meistermeier.garmin4j.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public interface ValueReader {

    ValueReader DEFAULT_INSTANCE = (input) -> (endianness) -> input;

    Function<Integer, Object> read(byte[] input);

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

}
