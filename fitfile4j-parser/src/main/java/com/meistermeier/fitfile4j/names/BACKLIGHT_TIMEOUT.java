// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BACKLIGHT_TIMEOUT {

	_INFINITE(0, "infinite");

	private final int messageNumber;

	private final String messageName;

	BACKLIGHT_TIMEOUT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BACKLIGHT_TIMEOUT findById(int messageNumber) {
		for (BACKLIGHT_TIMEOUT name : BACKLIGHT_TIMEOUT.values()) {
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
