// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ACTIVITY_TYPE {
	_GENERIC(0, "generic"),

	_RUNNING(1, "running"),

	_CYCLING(2, "cycling"),

	_TRANSITION(3, "transition"),

	_FITNESS_EQUIPMENT(4, "fitness_equipment"),

	_SWIMMING(5, "swimming"),

	_WALKING(6, "walking"),

	_SEDENTARY(8, "sedentary"),

	_ALL(254, "all");

	private final int messageNumber;

	private final String messageName;

	ACTIVITY_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ACTIVITY_TYPE findById(int messageNumber) {
		for (ACTIVITY_TYPE name: ACTIVITY_TYPE.values()) {
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
