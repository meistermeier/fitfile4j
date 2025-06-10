// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum POWER_PHASE_TYPE {

	_POWER_PHASE_START_ANGLE(0, "power_phase_start_angle"),

	_POWER_PHASE_END_ANGLE(1, "power_phase_end_angle"),

	_POWER_PHASE_ARC_LENGTH(2, "power_phase_arc_length"),

	_POWER_PHASE_CENTER(3, "power_phase_center");

	private final int messageNumber;

	private final String messageName;

	POWER_PHASE_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static POWER_PHASE_TYPE findById(int messageNumber) {
		for (POWER_PHASE_TYPE name : POWER_PHASE_TYPE.values()) {
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
