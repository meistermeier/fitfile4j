// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TIMER_TRIGGER {
	_MANUAL(0, "manual"),

	_AUTO(1, "auto"),

	_FITNESS_EQUIPMENT(2, "fitness_equipment");

	private final int messageNumber;

	private final String messageName;

	TIMER_TRIGGER(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static TIMER_TRIGGER findById(int messageNumber) {
		for (TIMER_TRIGGER name: TIMER_TRIGGER.values()) {
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
