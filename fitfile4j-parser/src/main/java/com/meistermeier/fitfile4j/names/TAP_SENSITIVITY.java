// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TAP_SENSITIVITY {
	_HIGH(0, "high"),

	_MEDIUM(1, "medium"),

	_LOW(2, "low");

	private final int messageNumber;

	private final String messageName;

	TAP_SENSITIVITY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static TAP_SENSITIVITY findById(int messageNumber) {
		for (TAP_SENSITIVITY name: TAP_SENSITIVITY.values()) {
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
