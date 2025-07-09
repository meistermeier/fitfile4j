// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SEGMENT_LAP_STATUS {
	_END(0, "end"),

	_FAIL(1, "fail");

	private final int messageNumber;

	private final String messageName;

	SEGMENT_LAP_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SEGMENT_LAP_STATUS findById(int messageNumber) {
		for (SEGMENT_LAP_STATUS name: SEGMENT_LAP_STATUS.values()) {
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
