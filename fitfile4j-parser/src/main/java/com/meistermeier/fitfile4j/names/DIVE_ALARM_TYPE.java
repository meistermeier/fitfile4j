// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIVE_ALARM_TYPE {

	_DEPTH(0, "depth"),

	_TIME(1, "time"),

	_SPEED(2, "speed");

	private final int messageNumber;

	private final String messageName;

	DIVE_ALARM_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DIVE_ALARM_TYPE findById(int messageNumber) {
		for (DIVE_ALARM_TYPE name : DIVE_ALARM_TYPE.values()) {
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
