// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DISPLAY_MEASURE {

	_METRIC(0, "metric"),

	_STATUTE(1, "statute"),

	_NAUTICAL(2, "nautical");

	private final int messageNumber;

	private final String messageName;

	DISPLAY_MEASURE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DISPLAY_MEASURE findById(int messageNumber) {
		for (DISPLAY_MEASURE name : DISPLAY_MEASURE.values()) {
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
