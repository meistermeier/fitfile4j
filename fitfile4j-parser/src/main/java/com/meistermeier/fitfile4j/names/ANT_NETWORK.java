// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ANT_NETWORK {

	_PUBLIC(0, "public"),

	_ANTPLUS(1, "antplus"),

	_ANTFS(2, "antfs"),

	_PRIVATE(3, "private");

	private final int messageNumber;

	private final String messageName;

	ANT_NETWORK(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ANT_NETWORK findById(int messageNumber) {
		for (ANT_NETWORK name : ANT_NETWORK.values()) {
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
