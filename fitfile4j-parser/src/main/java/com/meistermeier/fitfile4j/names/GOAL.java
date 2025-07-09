// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum GOAL {
	_TIME(0, "time"),

	_DISTANCE(1, "distance"),

	_CALORIES(2, "calories"),

	_FREQUENCY(3, "frequency"),

	_STEPS(4, "steps"),

	_ASCENT(5, "ascent"),

	_ACTIVE_MINUTES(6, "active_minutes");

	private final int messageNumber;

	private final String messageName;

	GOAL(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static GOAL findById(int messageNumber) {
		for (GOAL name: GOAL.values()) {
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
