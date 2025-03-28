package com.meistermeier.garmin4j.reader;

import java.util.Arrays;
import java.util.List;

public enum ValueTypes {
    ENUM(1, 0, 0xFF, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    BYTE(1, 13, 0xFF, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    /*
    SINT8, 1, 1, 0x7F, i8, NumberValueS8, N
    */
    SINT8(1, 1, 0x7F, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readListSigned(endianness, value, Integer.class, 1);
            if (converted.stream().allMatch(c -> c == 0x7F)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumberSigned(endianness, value, Integer.class);
            if (converted == 0x7F) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT16(2, 131, 0x7FFF, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readListSigned(endianness, value, Integer.class, 2);
            if (converted.stream().allMatch(c -> c == 0x7FFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumberSigned(endianness, value, Integer.class);
            if (converted == 0x7FFF) {
                return "illegal value";
            }
            return converted;
        }
    }),

    SINT32(4, 133, 0x7FFFFFFL, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readListSigned(endianness, value, Long.class, 4);
            if (converted.stream().allMatch(c -> c == 0x7FFF_FFFFL)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumberSigned(endianness, value, Long.class);
            if (converted == 0x7FFFFFFFL) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT64(8, 142, Long.MAX_VALUE, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, Long.class, 8);
            if (converted.stream().allMatch(c -> c == Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value, Long.class);

            if (converted.equals(Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT8(1, 2, 0xFF, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT16(2, 132, 0xFFFF, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 2);
            if (converted.stream().allMatch(c -> c == 0xFFFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0xFFFF) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT32(4, 134, 0xFFFFFFFL, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readList(endianness, value, Long.class, 4);
            if (converted.stream().allMatch(c -> c == 0xFFFF_FFFFL)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value, Long.class);
            if (converted == 0xFFFFFFFFL) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT64(8, 143, Long.MAX_VALUE, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, Long.class, 8);
            if (converted.stream().allMatch(c -> c == Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value, Long.class);

            if (converted.equals(Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT8Z(1, 10, 0xFF, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT16Z(2, 139, 0x0000, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readList(endianness, value, Integer.class, 2);
            if (converted.stream().allMatch(c -> c == 0x0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value, Integer.class);
            if (converted == 0x0000) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT32Z(4, 140, 0x0000_0000, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readList(endianness, value, Long.class, 4);
            if (converted.stream().allMatch(c -> c == 0x0000_0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value, Long.class);
            if (converted == 0x0000_0000) {
                return "illegal value";
            }
            return converted;
        }
    }),

    UINT64Z(8, 144, 0x0000_0000_0000_0000, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, Long.class, 8);
            if (converted.stream().allMatch(c -> c == 0x0000_0000_0000_0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value, Long.class);

            if (converted.equals(0x0000_0000_0000_0000L)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    FLOAT32(4, 136, 0xFFFF_FFFF, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Float> converted = ValueReader.readList(endianness, value, Float.class, 8);
            if (converted.stream().allMatch(c -> c == 0xFFFF_FFFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Float converted = ValueReader.readNumber(endianness, value, Float.class);

            if (converted.equals((float)(0xFFFF_FFFF))) {
                return "illegal value";
            }
            return converted;
        }
    }),
    FLOAT64(8, 137, Float.MAX_VALUE, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Float> converted = ValueReader.readList(endianness, value, Float.class, 8);
            if (converted.stream().allMatch(c -> c == Float.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Float converted = ValueReader.readNumber(endianness, value, Float.class);

            if (converted.equals(Float.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    STRING(1, 7, 0x00, (value) -> (endianess) -> {
        StringBuilder sb = new StringBuilder();
        for (byte b : value) {
            if (b != 0x00) {
                sb.append(b);
            }
        }
        return sb.toString();
    });

    private final int typeWidth;
    private final int typeNumber;
    private final float illegalValue;
    private final ValueReader valueReader;

    ValueTypes(int typeWidth, int typeNumber, float illegalValue, ValueReader valueReader) {
        this.typeWidth = typeWidth;
        this.typeNumber = typeNumber;
        this.illegalValue = illegalValue;
        this.valueReader = valueReader;
    }

    public static ValueReader getReader(int typeNumber) {
        for (ValueTypes valueType : ValueTypes.values()) {
            if (valueType.typeNumber == typeNumber) {
                return valueType.valueReader;
            }
        }
        return null;
    }
}
