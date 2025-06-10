// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ACTIVITY_LEVEL {

	_LOW(0, "low"),

	_MEDIUM(1, "medium"),

	_HIGH(2, "high");

	private final int messageNumber;

	private final String messageName;

	ACTIVITY_LEVEL(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ACTIVITY_LEVEL findById(int messageNumber) {
		for (ACTIVITY_LEVEL name : ACTIVITY_LEVEL.values()) {
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
