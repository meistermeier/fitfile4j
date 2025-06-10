// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WKT_STEP_DURATION {

	_TIME(0, "time"),

	_DISTANCE(1, "distance"),

	_HR_LESS_THAN(2, "hr_less_than"),

	_HR_GREATER_THAN(3, "hr_greater_than"),

	_CALORIES(4, "calories"),

	_OPEN(5, "open"),

	_REPEAT_UNTIL_STEPS_CMPLT(6, "repeat_until_steps_cmplt"),

	_REPEAT_UNTIL_TIME(7, "repeat_until_time"),

	_REPEAT_UNTIL_DISTANCE(8, "repeat_until_distance"),

	_REPEAT_UNTIL_CALORIES(9, "repeat_until_calories"),

	_REPEAT_UNTIL_HR_LESS_THAN(10, "repeat_until_hr_less_than"),

	_REPEAT_UNTIL_HR_GREATER_THAN(11, "repeat_until_hr_greater_than"),

	_REPEAT_UNTIL_POWER_LESS_THAN(12, "repeat_until_power_less_than"),

	_REPEAT_UNTIL_POWER_GREATER_THAN(13, "repeat_until_power_greater_than"),

	_POWER_LESS_THAN(14, "power_less_than"),

	_POWER_GREATER_THAN(15, "power_greater_than"),

	_TRAINING_PEAKS_TSS(16, "training_peaks_tss"),

	_REPEAT_UNTIL_POWER_LAST_LAP_LESS_THAN(17, "repeat_until_power_last_lap_less_than"),

	_REPEAT_UNTIL_MAX_POWER_LAST_LAP_LESS_THAN(18, "repeat_until_max_power_last_lap_less_than"),

	_POWER_3S_LESS_THAN(19, "power_3s_less_than"),

	_POWER_10S_LESS_THAN(20, "power_10s_less_than"),

	_POWER_30S_LESS_THAN(21, "power_30s_less_than"),

	_POWER_3S_GREATER_THAN(22, "power_3s_greater_than"),

	_POWER_10S_GREATER_THAN(23, "power_10s_greater_than"),

	_POWER_30S_GREATER_THAN(24, "power_30s_greater_than"),

	_POWER_LAP_LESS_THAN(25, "power_lap_less_than"),

	_POWER_LAP_GREATER_THAN(26, "power_lap_greater_than"),

	_REPEAT_UNTIL_TRAINING_PEAKS_TSS(27, "repeat_until_training_peaks_tss"),

	_REPETITION_TIME(28, "repetition_time"),

	_REPS(29, "reps"),

	_TIME_ONLY(31, "time_only");

	private final int messageNumber;

	private final String messageName;

	WKT_STEP_DURATION(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WKT_STEP_DURATION findById(int messageNumber) {
		for (WKT_STEP_DURATION name : WKT_STEP_DURATION.values()) {
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
