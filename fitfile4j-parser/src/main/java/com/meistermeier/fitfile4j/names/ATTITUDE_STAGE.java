// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ATTITUDE_STAGE {
	_FAILED(0, "failed"),

	_ALIGNING(1, "aligning"),

	_DEGRADED(2, "degraded"),

	_VALID(3, "valid");

	private final int messageNumber;

	private final String messageName;

	ATTITUDE_STAGE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ATTITUDE_STAGE findById(int messageNumber) {
		for (ATTITUDE_STAGE name: ATTITUDE_STAGE.values()) {
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
