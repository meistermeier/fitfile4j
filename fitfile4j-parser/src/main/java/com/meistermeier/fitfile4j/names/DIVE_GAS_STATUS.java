// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIVE_GAS_STATUS {

	_DISABLED(0, "disabled"),

	_ENABLED(1, "enabled"),

	_BACKUP_ONLY(2, "backup_only");

	private final int messageNumber;

	private final String messageName;

	DIVE_GAS_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DIVE_GAS_STATUS findById(int messageNumber) {
		for (DIVE_GAS_STATUS name : DIVE_GAS_STATUS.values()) {
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
