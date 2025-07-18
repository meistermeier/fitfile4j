// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_0 {
	_GENERIC(1, "generic"),

	_RUNNING(2, "running"),

	_CYCLING(4, "cycling"),

	_TRANSITION(8, "transition"),

	_FITNESS_EQUIPMENT(16, "fitness_equipment"),

	_SWIMMING(32, "swimming"),

	_BASKETBALL(64, "basketball"),

	_SOCCER(128, "soccer");

	private final int messageNumber;

	private final String messageName;

	SPORT_BITS_0(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_BITS_0 findById(int messageNumber) {
		for (SPORT_BITS_0 name: SPORT_BITS_0.values()) {
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
