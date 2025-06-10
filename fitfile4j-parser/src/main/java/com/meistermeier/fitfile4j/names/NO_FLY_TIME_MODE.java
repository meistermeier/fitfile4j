// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum NO_FLY_TIME_MODE {

	_STANDARD(0, "standard"),

	_FLAT_24_HOURS(1, "flat_24_hours");

	private final int messageNumber;

	private final String messageName;

	NO_FLY_TIME_MODE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static NO_FLY_TIME_MODE findById(int messageNumber) {
		for (NO_FLY_TIME_MODE name : NO_FLY_TIME_MODE.values()) {
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
