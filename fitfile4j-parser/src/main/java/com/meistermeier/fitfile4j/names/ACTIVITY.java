// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ACTIVITY {

	_MANUAL(0, "manual"),

	_AUTO_MULTI_SPORT(1, "auto_multi_sport");

	private final int messageNumber;

	private final String messageName;

	ACTIVITY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ACTIVITY findById(int messageNumber) {
		for (ACTIVITY name : ACTIVITY.values()) {
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
