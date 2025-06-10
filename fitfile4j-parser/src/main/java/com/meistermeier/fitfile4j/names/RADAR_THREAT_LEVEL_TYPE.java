// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum RADAR_THREAT_LEVEL_TYPE {

	_THREAT_UNKNOWN(0, "threat_unknown"),

	_THREAT_NONE(1, "threat_none"),

	_THREAT_APPROACHING(2, "threat_approaching"),

	_THREAT_APPROACHING_FAST(3, "threat_approaching_fast");

	private final int messageNumber;

	private final String messageName;

	RADAR_THREAT_LEVEL_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static RADAR_THREAT_LEVEL_TYPE findById(int messageNumber) {
		for (RADAR_THREAT_LEVEL_TYPE name : RADAR_THREAT_LEVEL_TYPE.values()) {
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
