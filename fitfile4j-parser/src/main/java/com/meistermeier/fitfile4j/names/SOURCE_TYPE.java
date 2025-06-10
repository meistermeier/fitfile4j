// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SOURCE_TYPE {

	_ANT(0, "ant"),

	_ANTPLUS(1, "antplus"),

	_BLUETOOTH(2, "bluetooth"),

	_BLUETOOTH_LOW_ENERGY(3, "bluetooth_low_energy"),

	_WIFI(4, "wifi"),

	_LOCAL(5, "local");

	private final int messageNumber;

	private final String messageName;

	SOURCE_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SOURCE_TYPE findById(int messageNumber) {
		for (SOURCE_TYPE name : SOURCE_TYPE.values()) {
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
