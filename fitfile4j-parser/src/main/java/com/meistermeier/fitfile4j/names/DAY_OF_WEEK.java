// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DAY_OF_WEEK {

	_SUNDAY(0, "sunday"),

	_MONDAY(1, "monday"),

	_TUESDAY(2, "tuesday"),

	_WEDNESDAY(3, "wednesday"),

	_THURSDAY(4, "thursday"),

	_FRIDAY(5, "friday"),

	_SATURDAY(6, "saturday");

	private final int messageNumber;

	private final String messageName;

	DAY_OF_WEEK(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DAY_OF_WEEK findById(int messageNumber) {
		for (DAY_OF_WEEK name : DAY_OF_WEEK.values()) {
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
