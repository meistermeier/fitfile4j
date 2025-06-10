// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_4 {

	_SAILING(1, "sailing"),

	_ICE_SKATING(2, "ice_skating"),

	_SKY_DIVING(4, "sky_diving"),

	_SNOWSHOEING(8, "snowshoeing"),

	_SNOWMOBILING(16, "snowmobiling"),

	_STAND_UP_PADDLEBOARDING(32, "stand_up_paddleboarding"),

	_SURFING(64, "surfing"),

	_WAKEBOARDING(128, "wakeboarding");

	private final int messageNumber;

	private final String messageName;

	SPORT_BITS_4(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT_BITS_4 findById(int messageNumber) {
		for (SPORT_BITS_4 name : SPORT_BITS_4.values()) {
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
