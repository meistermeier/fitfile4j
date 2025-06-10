// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BIKE_LIGHT_NETWORK_CONFIG_TYPE {

	_AUTO(0, "auto"),

	_INDIVIDUAL(4, "individual"),

	_HIGH_VISIBILITY(5, "high_visibility"),

	_TRAIL(6, "trail");

	private final int messageNumber;

	private final String messageName;

	BIKE_LIGHT_NETWORK_CONFIG_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BIKE_LIGHT_NETWORK_CONFIG_TYPE findById(int messageNumber) {
		for (BIKE_LIGHT_NETWORK_CONFIG_TYPE name : BIKE_LIGHT_NETWORK_CONFIG_TYPE.values()) {
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
