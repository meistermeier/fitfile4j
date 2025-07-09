// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LOCAL_DATE_TIME {
	_MIN(268435456L, "min");

	private final long messageNumber;

	private final String messageName;

	LOCAL_DATE_TIME(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LOCAL_DATE_TIME findById(long messageNumber) {
		for (LOCAL_DATE_TIME name: LOCAL_DATE_TIME.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public Long getMessageNumber() {
		return this.messageNumber;
	}

	public String getMessageName() {
		return this.messageName;
	}
}
