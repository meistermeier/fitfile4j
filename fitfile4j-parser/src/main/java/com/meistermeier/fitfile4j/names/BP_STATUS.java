// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BP_STATUS {

	_NO_ERROR(0, "no_error"),

	_ERROR_INCOMPLETE_DATA(1, "error_incomplete_data"),

	_ERROR_NO_MEASUREMENT(2, "error_no_measurement"),

	_ERROR_DATA_OUT_OF_RANGE(3, "error_data_out_of_range"),

	_ERROR_IRREGULAR_HEART_RATE(4, "error_irregular_heart_rate");

	private final int messageNumber;

	private final String messageName;

	BP_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BP_STATUS findById(int messageNumber) {
		for (BP_STATUS name : BP_STATUS.values()) {
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
