// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum STROKE_TYPE {

	_NO_EVENT(0, "no_event"),

	_OTHER(1, "other"),

	_SERVE(2, "serve"),

	_FOREHAND(3, "forehand"),

	_BACKHAND(4, "backhand"),

	_SMASH(5, "smash");

	private final int messageNumber;

	private final String messageName;

	STROKE_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static STROKE_TYPE findById(int messageNumber) {
		for (STROKE_TYPE name : STROKE_TYPE.values()) {
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
