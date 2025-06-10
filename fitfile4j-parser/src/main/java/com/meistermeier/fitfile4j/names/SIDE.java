// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SIDE {

	_RIGHT(0, "right"),

	_LEFT(1, "left");

	private final int messageNumber;

	private final String messageName;

	SIDE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SIDE findById(int messageNumber) {
		for (SIDE name : SIDE.values()) {
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
