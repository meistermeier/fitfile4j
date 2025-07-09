// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SLEEP_LEVEL {
	_UNMEASURABLE(0, "unmeasurable"),

	_AWAKE(1, "awake"),

	_LIGHT(2, "light"),

	_DEEP(3, "deep"),

	_REM(4, "rem");

	private final int messageNumber;

	private final String messageName;

	SLEEP_LEVEL(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SLEEP_LEVEL findById(int messageNumber) {
		for (SLEEP_LEVEL name: SLEEP_LEVEL.values()) {
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
