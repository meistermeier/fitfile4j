// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum COURSE_CAPABILITIES {

	_PROCESSED(1L, "processed"),

	_VALID(2L, "valid"),

	_TIME(4L, "time"),

	_DISTANCE(8L, "distance"),

	_POSITION(16L, "position"),

	_HEART_RATE(32L, "heart_rate"),

	_POWER(64L, "power"),

	_CADENCE(128L, "cadence"),

	_TRAINING(256L, "training"),

	_NAVIGATION(512L, "navigation"),

	_BIKEWAY(1024L, "bikeway"),

	_AVIATION(4096L, "aviation");

	private final long messageNumber;

	private final String messageName;

	COURSE_CAPABILITIES(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static COURSE_CAPABILITIES findById(long messageNumber) {
		for (COURSE_CAPABILITIES name : COURSE_CAPABILITIES.values()) {
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
