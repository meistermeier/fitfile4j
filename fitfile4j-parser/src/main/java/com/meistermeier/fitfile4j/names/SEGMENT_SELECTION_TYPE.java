// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SEGMENT_SELECTION_TYPE {

	_STARRED(0, "starred"),

	_SUGGESTED(1, "suggested");

	private final int messageNumber;

	private final String messageName;

	SEGMENT_SELECTION_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SEGMENT_SELECTION_TYPE findById(int messageNumber) {
		for (SEGMENT_SELECTION_TYPE name : SEGMENT_SELECTION_TYPE.values()) {
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
