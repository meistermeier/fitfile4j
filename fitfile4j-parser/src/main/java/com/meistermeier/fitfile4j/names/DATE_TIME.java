// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DATE_TIME {

	_MIN(268435456L, "min");

	private final long messageNumber;

	private final String messageName;

	DATE_TIME(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DATE_TIME findById(long messageNumber) {
		for (DATE_TIME name : DATE_TIME.values()) {
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
