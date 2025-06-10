// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum AUTO_ACTIVITY_DETECT {

	_NONE(0L, "none"),

	_RUNNING(1L, "running"),

	_CYCLING(2L, "cycling"),

	_SWIMMING(4L, "swimming"),

	_WALKING(8L, "walking"),

	_ELLIPTICAL(32L, "elliptical"),

	_SEDENTARY(1024L, "sedentary");

	private final long messageNumber;

	private final String messageName;

	AUTO_ACTIVITY_DETECT(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static AUTO_ACTIVITY_DETECT findById(long messageNumber) {
		for (AUTO_ACTIVITY_DETECT name : AUTO_ACTIVITY_DETECT.values()) {
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
