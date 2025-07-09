// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DISPLAY_POWER {
	_WATTS(0, "watts"),

	_PERCENT_FTP(1, "percent_ftp");

	private final int messageNumber;

	private final String messageName;

	DISPLAY_POWER(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DISPLAY_POWER findById(int messageNumber) {
		for (DISPLAY_POWER name: DISPLAY_POWER.values()) {
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
