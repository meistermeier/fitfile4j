// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BATTERY_STATUS {
	_NEW(1, "new"),

	_GOOD(2, "good"),

	_OK(3, "ok"),

	_LOW(4, "low"),

	_CRITICAL(5, "critical"),

	_CHARGING(6, "charging"),

	_UNKNOWN(7, "unknown");

	private final int messageNumber;

	private final String messageName;

	BATTERY_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BATTERY_STATUS findById(int messageNumber) {
		for (BATTERY_STATUS name: BATTERY_STATUS.values()) {
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
