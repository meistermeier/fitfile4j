// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HRV_STATUS {
	_NONE(0, "none"),

	_POOR(1, "poor"),

	_LOW(2, "low"),

	_UNBALANCED(3, "unbalanced"),

	_BALANCED(4, "balanced");

	private final int messageNumber;

	private final String messageName;

	HRV_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HRV_STATUS findById(int messageNumber) {
		for (HRV_STATUS name: HRV_STATUS.values()) {
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
