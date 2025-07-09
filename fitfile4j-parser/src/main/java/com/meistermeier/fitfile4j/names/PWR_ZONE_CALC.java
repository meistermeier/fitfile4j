// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum PWR_ZONE_CALC {
	_CUSTOM(0, "custom"),

	_PERCENT_FTP(1, "percent_ftp");

	private final int messageNumber;

	private final String messageName;

	PWR_ZONE_CALC(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static PWR_ZONE_CALC findById(int messageNumber) {
		for (PWR_ZONE_CALC name: PWR_ZONE_CALC.values()) {
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
