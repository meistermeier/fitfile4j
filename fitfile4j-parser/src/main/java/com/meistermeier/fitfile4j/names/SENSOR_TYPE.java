// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SENSOR_TYPE {

	_ACCELEROMETER(0, "accelerometer"),

	_GYROSCOPE(1, "gyroscope"),

	_COMPASS(2, "compass"),

	_BAROMETER(3, "barometer");

	private final int messageNumber;

	private final String messageName;

	SENSOR_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SENSOR_TYPE findById(int messageNumber) {
		for (SENSOR_TYPE name : SENSOR_TYPE.values()) {
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
