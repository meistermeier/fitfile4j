// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WEATHER_SEVERITY {
	_UNKNOWN(0, "unknown"),

	_WARNING(1, "warning"),

	_WATCH(2, "watch"),

	_ADVISORY(3, "advisory"),

	_STATEMENT(4, "statement");

	private final int messageNumber;

	private final String messageName;

	WEATHER_SEVERITY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WEATHER_SEVERITY findById(int messageNumber) {
		for (WEATHER_SEVERITY name: WEATHER_SEVERITY.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public Integer getMessageNumber() {
		return this.messageNumber;
	}

	public String getMessageName() {
		return this.messageName;
	}
}
