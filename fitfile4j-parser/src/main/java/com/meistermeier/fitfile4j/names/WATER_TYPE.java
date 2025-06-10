// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WATER_TYPE {

	_FRESH(0, "fresh"),

	_SALT(1, "salt"),

	_EN13319(2, "en13319"),

	_CUSTOM(3, "custom");

	private final int messageNumber;

	private final String messageName;

	WATER_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WATER_TYPE findById(int messageNumber) {
		for (WATER_TYPE name : WATER_TYPE.values()) {
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
