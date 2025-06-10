// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum INTENSITY {

	_ACTIVE(0, "active"),

	_REST(1, "rest"),

	_WARMUP(2, "warmup"),

	_COOLDOWN(3, "cooldown"),

	_RECOVERY(4, "recovery"),

	_INTERVAL(5, "interval"),

	_OTHER(6, "other");

	private final int messageNumber;

	private final String messageName;

	INTENSITY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static INTENSITY findById(int messageNumber) {
		for (INTENSITY name : INTENSITY.values()) {
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
