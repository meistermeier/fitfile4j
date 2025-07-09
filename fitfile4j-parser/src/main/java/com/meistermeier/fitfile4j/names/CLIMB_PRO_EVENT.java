// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CLIMB_PRO_EVENT {
	_APPROACH(0, "approach"),

	_START(1, "start"),

	_COMPLETE(2, "complete");

	private final int messageNumber;

	private final String messageName;

	CLIMB_PRO_EVENT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static CLIMB_PRO_EVENT findById(int messageNumber) {
		for (CLIMB_PRO_EVENT name: CLIMB_PRO_EVENT.values()) {
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
