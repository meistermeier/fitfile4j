// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HR_ZONE_CALC {
	_CUSTOM(0, "custom"),

	_PERCENT_MAX_HR(1, "percent_max_hr"),

	_PERCENT_HRR(2, "percent_hrr"),

	_PERCENT_LTHR(3, "percent_lthr");

	private final int messageNumber;

	private final String messageName;

	HR_ZONE_CALC(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HR_ZONE_CALC findById(int messageNumber) {
		for (HR_ZONE_CALC name: HR_ZONE_CALC.values()) {
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
