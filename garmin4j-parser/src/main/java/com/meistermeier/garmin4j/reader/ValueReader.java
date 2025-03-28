package com.meistermeier.garmin4j.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public interface ValueReader {

    ValueReader DEFAULT_INSTANCE = (a) -> {
        return (endianness) -> a;
    };

    Function<Integer, Object> read(byte[] input);

    static <T> List<T> readList(int endianness, byte[] input, Class<T> numberClass, int typeLength) {
        List<T> result = new ArrayList<>();
        for (var i = 0; i < input.length; i+=typeLength) {
            result.add(readNumber(endianness, Arrays.copyOfRange(input, i, i + typeLength), numberClass));
        }
        return result;
    }
    static <T> T readNumber(int endianness, byte[] input, Class<T> numberClass) {
        if (endianness == 0) {
            if (input.length <= 3) {
                Integer result = 0;
                for (var i = 0; i < input.length; i++) {
                    result += (Byte.toUnsignedInt(input[i]) << 8 * i);
                }
                return numberClass.cast(result);
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
                return numberClass.cast(result);
            } else {
                Long result = 0L;
                for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
                    result += (Byte.toUnsignedLong(input[i]) << 8 * x);
                }
                return numberClass.cast(result);
            }
        }
    }
    static <T> List<T> readListSigned(int endianness, byte[] input, Class<T> numberClass, int typeLength) {
        List<T> result = new ArrayList<>();
        for (var i = 0; i < input.length; i+=typeLength) {
            result.add(readNumberSigned(endianness, Arrays.copyOfRange(input, i, i + typeLength), numberClass));
        }
        return result;
    }
    static <T> T readNumberSigned(int endianness, byte[] input, Class<T> numberClass) {
        if (endianness == 0) {
            if (input.length <= 3) {
                Integer result = 0;
                for (var i = 0; i < input.length; i++) {
                    result += (input[i]) << 8 * i;
                }
                return numberClass.cast(result);
            } else {
                Long result = 0L;
                for (var i = 0; i < input.length; i++) {
                    result += ((long) input[i]) << 8 * i;
                }
                return (T) result;
            }
        } else {
            if (input.length < 3) {
                Integer result = 0;
                for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
                    result += (input[i]) << 8 * x;
                }
                return numberClass.cast(result);
            } else {
                Long result = 0L;
                for (int i = input.length - 1, x = 0; i >= 0; i--, x++) {
                    result += ((long) input[i]) << 8 * x;
                }
                return numberClass.cast(result);
            }
        }
    }

}
