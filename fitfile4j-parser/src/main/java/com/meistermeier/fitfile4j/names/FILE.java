// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FILE {
	_DEVICE(1, "device"),

	_SETTINGS(2, "settings"),

	_SPORT(3, "sport"),

	_ACTIVITY(4, "activity"),

	_WORKOUT(5, "workout"),

	_COURSE(6, "course"),

	_SCHEDULES(7, "schedules"),

	_WEIGHT(9, "weight"),

	_TOTALS(10, "totals"),

	_GOALS(11, "goals"),

	_BLOOD_PRESSURE(14, "blood_pressure"),

	_MONITORING_A(15, "monitoring_a"),

	_ACTIVITY_SUMMARY(20, "activity_summary"),

	_MONITORING_DAILY(28, "monitoring_daily"),

	_MONITORING_B(32, "monitoring_b"),

	_SEGMENT(34, "segment"),

	_SEGMENT_LIST(35, "segment_list"),

	_EXD_CONFIGURATION(40, "exd_configuration"),

	_MFG_RANGE_MIN(247, "mfg_range_min"),

	_MFG_RANGE_MAX(254, "mfg_range_max");

	private final int messageNumber;

	private final String messageName;

	FILE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static FILE findById(int messageNumber) {
		for (FILE name: FILE.values()) {
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
