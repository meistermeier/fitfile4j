// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum RUN_EXERCISE_NAME {

	_RUN(0, "run"),

	_WALK(1, "walk"),

	_JOG(2, "jog"),

	_SPRINT(3, "sprint");

	private final int messageNumber;

	private final String messageName;

	RUN_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static RUN_EXERCISE_NAME findById(int messageNumber) {
		for (RUN_EXERCISE_NAME name : RUN_EXERCISE_NAME.values()) {
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
