// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum MESSAGE_INDEX {
	_SELECTED(32768, "selected"),

	_RESERVED(28672, "reserved"),

	_MASK(4095, "mask");

	private final int messageNumber;

	private final String messageName;

	MESSAGE_INDEX(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static MESSAGE_INDEX findById(int messageNumber) {
		for (MESSAGE_INDEX name: MESSAGE_INDEX.values()) {
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
