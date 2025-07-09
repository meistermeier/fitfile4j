// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_6 {
	_FLOOR_CLIMBING(1, "floor_climbing");

	private final int messageNumber;

	private final String messageName;

	SPORT_BITS_6(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_BITS_6 findById(int messageNumber) {
		for (SPORT_BITS_6 name: SPORT_BITS_6.values()) {
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
