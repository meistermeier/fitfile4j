// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SWITCH {

	_OFF(0, "off"),

	_ON(1, "on"),

	_AUTO(2, "auto");

	private final int messageNumber;

	private final String messageName;

	SWITCH(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SWITCH findById(int messageNumber) {
		for (SWITCH name : SWITCH.values()) {
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
