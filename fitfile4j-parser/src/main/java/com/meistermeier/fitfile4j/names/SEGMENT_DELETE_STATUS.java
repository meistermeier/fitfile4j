// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SEGMENT_DELETE_STATUS {

	_DO_NOT_DELETE(0, "do_not_delete"),

	_DELETE_ONE(1, "delete_one"),

	_DELETE_ALL(2, "delete_all");

	private final int messageNumber;

	private final String messageName;

	SEGMENT_DELETE_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SEGMENT_DELETE_STATUS findById(int messageNumber) {
		for (SEGMENT_DELETE_STATUS name : SEGMENT_DELETE_STATUS.values()) {
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
