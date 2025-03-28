package com.meistermeier.garmin4j.reader;

import java.util.List;

public enum ValueTypes {
    ENUM(0, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    BYTE(13, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT8(1, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, 1);
            if (converted.stream().allMatch(c -> c == 0x7F)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0x7F) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT16(131, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readList(endianness, value, 2);
            if (converted.stream().allMatch(c -> c == 0x7FFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0x7FFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT32(133, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readList(endianness, value, 4);
            if (converted.stream().allMatch(c -> c == 0x7FFF_FFFFL)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);
            if (converted == 0x7FFFFFFFL) {
                return "illegal value";
            }
            return converted;
        }
    }),
    SINT64(142, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, 8);
            if (converted.stream().allMatch(c -> c == Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);

            if (converted.equals(Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT8(2, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT16(132, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readList(endianness, value, 2);
            if (converted.stream().allMatch(c -> c == 0xFFFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFFFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT32(134, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readList(endianness, value, 4);
            if (converted.stream().allMatch(c -> c == 0xFFFF_FFFFL)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFFFFFFFFL) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT64(143, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, 8);
            if (converted.stream().allMatch(c -> c == Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);

            if (converted.equals(Long.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT8Z(10, (value) -> (endianness) -> {
        if (value.length > 1) {
            List<Integer> converted = ValueReader.readList(endianness, value, 1);
            if (converted.stream().allMatch(c -> c == 0xFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0xFF) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT16Z(139, (value) -> (endianness) -> {
        if (value.length > 2) {
            List<Integer> converted = ValueReader.readList(endianness, value, 2);
            if (converted.stream().allMatch(c -> c == 0x0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Integer converted = ValueReader.readNumber(endianness, value);
            if (converted == 0x0000) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT32Z(140, (value) -> (endianness) -> {
        if (value.length > 4) {
            List<Long> converted = ValueReader.readList(endianness, value, 4);
            if (converted.stream().allMatch(c -> c == 0x0000_0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);
            if (converted == 0x0000_0000) {
                return "illegal value";
            }
            return converted;
        }
    }),
    UINT64Z(144, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Long> converted = ValueReader.readList(endianness, value, 8);
            if (converted.stream().allMatch(c -> c == 0x0000_0000_0000_0000)) {
                return "illegal value";
            }
            return converted;
        } else {
            Long converted = ValueReader.readNumber(endianness, value);

            if (converted.equals(0x0000_0000_0000_0000L)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    FLOAT32(136, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Float> converted = ValueReader.readList(endianness, value, 8);
            if (converted.stream().allMatch(c -> c == 0xFFFF_FFFF)) {
                return "illegal value";
            }
            return converted;
        } else {
            Float converted = ValueReader.readNumber(endianness, value);

            if (converted.equals((float)(0xFFFF_FFFF))) {
                return "illegal value";
            }
            return converted;
        }
    }),
    FLOAT64(137, (value) -> (endianness) -> {
        if (value.length > 8) {
            List<Float> converted = ValueReader.readList(endianness, value, 8);
            if (converted.stream().allMatch(c -> c == Float.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        } else {
            Float converted = ValueReader.readNumber(endianness, value);

            if (converted.equals(Float.MAX_VALUE)) {
                return "illegal value";
            }
            return converted;
        }
    }),
    STRING(7, (value) -> (endianess) -> {
        StringBuilder sb = new StringBuilder();
        for (byte b : value) {
            if (b != 0x00) {
                sb.append(Character.valueOf((char) b));
            }
        }
        return sb.toString();
    });

    private final int typeNumber;
    private final ValueReader valueReader;

    ValueTypes(int typeNumber, ValueReader valueReader) {
        this.typeNumber = typeNumber;
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
