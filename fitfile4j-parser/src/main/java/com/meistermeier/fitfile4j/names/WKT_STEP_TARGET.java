// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WKT_STEP_TARGET {

	_SPEED(0, "speed"),

	_HEART_RATE(1, "heart_rate"),

	_OPEN(2, "open"),

	_CADENCE(3, "cadence"),

	_POWER(4, "power"),

	_GRADE(5, "grade"),

	_RESISTANCE(6, "resistance"),

	_POWER_3S(7, "power_3s"),

	_POWER_10S(8, "power_10s"),

	_POWER_30S(9, "power_30s"),

	_POWER_LAP(10, "power_lap"),

	_SWIM_STROKE(11, "swim_stroke"),

	_SPEED_LAP(12, "speed_lap"),

	_HEART_RATE_LAP(13, "heart_rate_lap");

	private final int messageNumber;

	private final String messageName;

	WKT_STEP_TARGET(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WKT_STEP_TARGET findById(int messageNumber) {
		for (WKT_STEP_TARGET name : WKT_STEP_TARGET.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public String getMessageName() {
		return this.messageName;
	}

}
