// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum GOAL_RECURRENCE {

	_OFF(0, "off"),

	_DAILY(1, "daily"),

	_WEEKLY(2, "weekly"),

	_MONTHLY(3, "monthly"),

	_YEARLY(4, "yearly"),

	_CUSTOM(5, "custom");

	private final int messageNumber;

	private final String messageName;

	GOAL_RECURRENCE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static GOAL_RECURRENCE findById(int messageNumber) {
		for (GOAL_RECURRENCE name : GOAL_RECURRENCE.values()) {
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
