// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum AUTOLAP_TRIGGER {

	_TIME(0, "time"),

	_DISTANCE(1, "distance"),

	_POSITION_START(2, "position_start"),

	_POSITION_LAP(3, "position_lap"),

	_POSITION_WAYPOINT(4, "position_waypoint"),

	_POSITION_MARKED(5, "position_marked"),

	_OFF(6, "off"),

	_AUTO_SELECT(13, "auto_select");

	private final int messageNumber;

	private final String messageName;

	AUTOLAP_TRIGGER(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static AUTOLAP_TRIGGER findById(int messageNumber) {
		for (AUTOLAP_TRIGGER name : AUTOLAP_TRIGGER.values()) {
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
