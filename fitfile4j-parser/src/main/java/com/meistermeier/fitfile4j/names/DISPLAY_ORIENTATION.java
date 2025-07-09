// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DISPLAY_ORIENTATION {
	_AUTO(0, "auto"),

	_PORTRAIT(1, "portrait"),

	_LANDSCAPE(2, "landscape"),

	_PORTRAIT_FLIPPED(3, "portrait_flipped"),

	_LANDSCAPE_FLIPPED(4, "landscape_flipped");

	private final int messageNumber;

	private final String messageName;

	DISPLAY_ORIENTATION(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DISPLAY_ORIENTATION findById(int messageNumber) {
		for (DISPLAY_ORIENTATION name: DISPLAY_ORIENTATION.values()) {
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
