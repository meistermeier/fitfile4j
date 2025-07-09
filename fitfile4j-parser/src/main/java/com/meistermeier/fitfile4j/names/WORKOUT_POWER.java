// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_POWER {
	_WATTS_OFFSET(1000L, "watts_offset");

	private final long messageNumber;

	private final String messageName;

	WORKOUT_POWER(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WORKOUT_POWER findById(long messageNumber) {
		for (WORKOUT_POWER name: WORKOUT_POWER.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public Long getMessageNumber() {
		return this.messageNumber;
	}

	public String getMessageName() {
		return this.messageName;
	}
}
