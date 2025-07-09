// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum MAX_MET_HEART_RATE_SOURCE {
	_WHR(0, "whr"),

	_HRM(1, "hrm");

	private final int messageNumber;

	private final String messageName;

	MAX_MET_HEART_RATE_SOURCE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static MAX_MET_HEART_RATE_SOURCE findById(int messageNumber) {
		for (MAX_MET_HEART_RATE_SOURCE name: MAX_MET_HEART_RATE_SOURCE.values()) {
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
