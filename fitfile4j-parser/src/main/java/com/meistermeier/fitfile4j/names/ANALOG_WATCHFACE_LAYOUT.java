// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ANALOG_WATCHFACE_LAYOUT {
	_MINIMAL(0, "minimal"),

	_TRADITIONAL(1, "traditional"),

	_MODERN(2, "modern");

	private final int messageNumber;

	private final String messageName;

	ANALOG_WATCHFACE_LAYOUT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ANALOG_WATCHFACE_LAYOUT findById(int messageNumber) {
		for (ANALOG_WATCHFACE_LAYOUT name: ANALOG_WATCHFACE_LAYOUT.values()) {
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
