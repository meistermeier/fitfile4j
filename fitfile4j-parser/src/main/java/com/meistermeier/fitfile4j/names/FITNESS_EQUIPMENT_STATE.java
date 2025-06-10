// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FITNESS_EQUIPMENT_STATE {

	_READY(0, "ready"),

	_IN_USE(1, "in_use"),

	_PAUSED(2, "paused"),

	_UNKNOWN(3, "unknown");

	private final int messageNumber;

	private final String messageName;

	FITNESS_EQUIPMENT_STATE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static FITNESS_EQUIPMENT_STATE findById(int messageNumber) {
		for (FITNESS_EQUIPMENT_STATE name : FITNESS_EQUIPMENT_STATE.values()) {
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
