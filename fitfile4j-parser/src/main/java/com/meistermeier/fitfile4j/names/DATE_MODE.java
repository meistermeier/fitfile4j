// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DATE_MODE {

	_DAY_MONTH(0, "day_month"),

	_MONTH_DAY(1, "month_day");

	private final int messageNumber;

	private final String messageName;

	DATE_MODE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DATE_MODE findById(int messageNumber) {
		for (DATE_MODE name : DATE_MODE.values()) {
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
