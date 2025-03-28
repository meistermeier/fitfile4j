package com.meistermeier.garmin4j;

import java.util.Map;

public record Message(int messageNumber, Map<Integer, Object> fields) {
}
