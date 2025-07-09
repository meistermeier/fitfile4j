// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SESSION_TRIGGER {
	_ACTIVITY_END(0, "activity_end"),

	_MANUAL(1, "manual"),

	_AUTO_MULTI_SPORT(2, "auto_multi_sport"),

	_FITNESS_EQUIPMENT(3, "fitness_equipment");

	private final int messageNumber;

	private final String messageName;

	SESSION_TRIGGER(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SESSION_TRIGGER findById(int messageNumber) {
		for (SESSION_TRIGGER name: SESSION_TRIGGER.values()) {
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
