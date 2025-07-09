// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_3 {
	_DRIVING(1, "driving"),

	_GOLF(2, "golf"),

	_HANG_GLIDING(4, "hang_gliding"),

	_HORSEBACK_RIDING(8, "horseback_riding"),

	_HUNTING(16, "hunting"),

	_FISHING(32, "fishing"),

	_INLINE_SKATING(64, "inline_skating"),

	_ROCK_CLIMBING(128, "rock_climbing");

	private final int messageNumber;

	private final String messageName;

	SPORT_BITS_3(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_BITS_3 findById(int messageNumber) {
		for (SPORT_BITS_3 name: SPORT_BITS_3.values()) {
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
