// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum COMM_TIMEOUT_TYPE {

	_WILDCARD_PAIRING_TIMEOUT(0, "wildcard_pairing_timeout"),

	_PAIRING_TIMEOUT(1, "pairing_timeout"),

	_CONNECTION_LOST(2, "connection_lost"),

	_CONNECTION_TIMEOUT(3, "connection_timeout");

	private final int messageNumber;

	private final String messageName;

	COMM_TIMEOUT_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static COMM_TIMEOUT_TYPE findById(int messageNumber) {
		for (COMM_TIMEOUT_TYPE name : COMM_TIMEOUT_TYPE.values()) {
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
