// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_EVENT {

	_UNCATEGORIZED(0, "uncategorized"),

	_GEOCACHING(1, "geocaching"),

	_FITNESS(2, "fitness"),

	_RECREATION(3, "recreation"),

	_RACE(4, "race"),

	_SPECIAL_EVENT(5, "special_event"),

	_TRAINING(6, "training"),

	_TRANSPORTATION(7, "transportation"),

	_TOURING(8, "touring");

	private final int messageNumber;

	private final String messageName;

	SPORT_EVENT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_EVENT findById(int messageNumber) {
		for (SPORT_EVENT name : SPORT_EVENT.values()) {
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
