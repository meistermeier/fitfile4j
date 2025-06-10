// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DEVICE_INDEX {

	_CREATOR(0, "creator");

	private final int messageNumber;

	private final String messageName;

	DEVICE_INDEX(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DEVICE_INDEX findById(int messageNumber) {
		for (DEVICE_INDEX name : DEVICE_INDEX.values()) {
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
