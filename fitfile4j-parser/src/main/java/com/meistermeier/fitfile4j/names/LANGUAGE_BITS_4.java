// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE_BITS_4 {
	_BRAZILIAN_PORTUGUESE(1, "brazilian_portuguese"),

	_INDONESIAN(2, "indonesian"),

	_MALAYSIAN(4, "malaysian"),

	_VIETNAMESE(8, "vietnamese"),

	_BURMESE(16, "burmese"),

	_MONGOLIAN(32, "mongolian");

	private final int messageNumber;

	private final String messageName;

	LANGUAGE_BITS_4(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LANGUAGE_BITS_4 findById(int messageNumber) {
		for (LANGUAGE_BITS_4 name: LANGUAGE_BITS_4.values()) {
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
