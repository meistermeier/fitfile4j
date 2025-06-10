// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FIT_BASE_UNIT {

	_OTHER(0, "other"),

	_KILOGRAM(1, "kilogram"),

	_POUND(2, "pound");

	private final int messageNumber;

	private final String messageName;

	FIT_BASE_UNIT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static FIT_BASE_UNIT findById(int messageNumber) {
		for (FIT_BASE_UNIT name : FIT_BASE_UNIT.values()) {
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
