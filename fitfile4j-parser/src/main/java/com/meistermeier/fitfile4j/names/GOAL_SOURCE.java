// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum GOAL_SOURCE {
	_AUTO(0, "auto"),

	_COMMUNITY(1, "community"),

	_USER(2, "user");

	private final int messageNumber;

	private final String messageName;

	GOAL_SOURCE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static GOAL_SOURCE findById(int messageNumber) {
		for (GOAL_SOURCE name: GOAL_SOURCE.values()) {
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
