// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_EQUIPMENT {
	_NONE(0, "none"),

	_SWIM_FINS(1, "swim_fins"),

	_SWIM_KICKBOARD(2, "swim_kickboard"),

	_SWIM_PADDLES(3, "swim_paddles"),

	_SWIM_PULL_BUOY(4, "swim_pull_buoy"),

	_SWIM_SNORKEL(5, "swim_snorkel");

	private final int messageNumber;

	private final String messageName;

	WORKOUT_EQUIPMENT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WORKOUT_EQUIPMENT findById(int messageNumber) {
		for (WORKOUT_EQUIPMENT name: WORKOUT_EQUIPMENT.values()) {
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
