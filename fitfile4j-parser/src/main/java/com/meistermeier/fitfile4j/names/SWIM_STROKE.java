// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SWIM_STROKE {

	_FREESTYLE(0, "freestyle"),

	_BACKSTROKE(1, "backstroke"),

	_BREASTSTROKE(2, "breaststroke"),

	_BUTTERFLY(3, "butterfly"),

	_DRILL(4, "drill"),

	_MIXED(5, "mixed"),

	_IM(6, "im");

	private final int messageNumber;

	private final String messageName;

	SWIM_STROKE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SWIM_STROKE findById(int messageNumber) {
		for (SWIM_STROKE name : SWIM_STROKE.values()) {
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
