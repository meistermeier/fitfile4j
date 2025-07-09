// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_2 {
	_MOUNTAINEERING(1, "mountaineering"),

	_HIKING(2, "hiking"),

	_MULTISPORT(4, "multisport"),

	_PADDLING(8, "paddling"),

	_FLYING(16, "flying"),

	_E_BIKING(32, "e_biking"),

	_MOTORCYCLING(64, "motorcycling"),

	_BOATING(128, "boating");

	private final int messageNumber;

	private final String messageName;

	SPORT_BITS_2(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_BITS_2 findById(int messageNumber) {
		for (SPORT_BITS_2 name: SPORT_BITS_2.values()) {
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
