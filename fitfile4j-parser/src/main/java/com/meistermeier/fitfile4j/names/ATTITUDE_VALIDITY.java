// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ATTITUDE_VALIDITY {
	_TRACK_ANGLE_HEADING_VALID(1, "track_angle_heading_valid"),

	_PITCH_VALID(2, "pitch_valid"),

	_ROLL_VALID(4, "roll_valid"),

	_LATERAL_BODY_ACCEL_VALID(8, "lateral_body_accel_valid"),

	_NORMAL_BODY_ACCEL_VALID(16, "normal_body_accel_valid"),

	_TURN_RATE_VALID(32, "turn_rate_valid"),

	_HW_FAIL(64, "hw_fail"),

	_MAG_INVALID(128, "mag_invalid"),

	_NO_GPS(256, "no_gps"),

	_GPS_INVALID(512, "gps_invalid"),

	_SOLUTION_COASTING(1024, "solution_coasting"),

	_TRUE_TRACK_ANGLE(2048, "true_track_angle"),

	_MAGNETIC_HEADING(4096, "magnetic_heading");

	private final int messageNumber;

	private final String messageName;

	ATTITUDE_VALIDITY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ATTITUDE_VALIDITY findById(int messageNumber) {
		for (ATTITUDE_VALIDITY name: ATTITUDE_VALIDITY.values()) {
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
