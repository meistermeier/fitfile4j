// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HR_TYPE {
	_NORMAL(0, "normal"),

	_IRREGULAR(1, "irregular");

	private final int messageNumber;

	private final String messageName;

	HR_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HR_TYPE findById(int messageNumber) {
		for (HR_TYPE name: HR_TYPE.values()) {
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
