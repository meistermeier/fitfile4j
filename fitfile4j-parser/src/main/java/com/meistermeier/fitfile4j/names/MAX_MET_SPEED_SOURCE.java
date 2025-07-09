// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum MAX_MET_SPEED_SOURCE {
	_ONBOARD_GPS(0, "onboard_gps"),

	_CONNECTED_GPS(1, "connected_gps"),

	_CADENCE(2, "cadence");

	private final int messageNumber;

	private final String messageName;

	MAX_MET_SPEED_SOURCE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static MAX_MET_SPEED_SOURCE findById(int messageNumber) {
		for (MAX_MET_SPEED_SOURCE name: MAX_MET_SPEED_SOURCE.values()) {
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
