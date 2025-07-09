// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXERCISE_CATEGORY {
	_BENCH_PRESS(0, "bench_press"),

	_CALF_RAISE(1, "calf_raise"),

	_CARDIO(2, "cardio"),

	_CARRY(3, "carry"),

	_CHOP(4, "chop"),

	_CORE(5, "core"),

	_CRUNCH(6, "crunch"),

	_CURL(7, "curl"),

	_DEADLIFT(8, "deadlift"),

	_FLYE(9, "flye"),

	_HIP_RAISE(10, "hip_raise"),

	_HIP_STABILITY(11, "hip_stability"),

	_HIP_SWING(12, "hip_swing"),

	_HYPEREXTENSION(13, "hyperextension"),

	_LATERAL_RAISE(14, "lateral_raise"),

	_LEG_CURL(15, "leg_curl"),

	_LEG_RAISE(16, "leg_raise"),

	_LUNGE(17, "lunge"),

	_OLYMPIC_LIFT(18, "olympic_lift"),

	_PLANK(19, "plank"),

	_PLYO(20, "plyo"),

	_PULL_UP(21, "pull_up"),

	_PUSH_UP(22, "push_up"),

	_ROW(23, "row"),

	_SHOULDER_PRESS(24, "shoulder_press"),

	_SHOULDER_STABILITY(25, "shoulder_stability"),

	_SHRUG(26, "shrug"),

	_SIT_UP(27, "sit_up"),

	_SQUAT(28, "squat"),

	_TOTAL_BODY(29, "total_body"),

	_TRICEPS_EXTENSION(30, "triceps_extension"),

	_WARM_UP(31, "warm_up"),

	_RUN(32, "run"),

	_UNKNOWN(65534, "unknown");

	private final int messageNumber;

	private final String messageName;

	EXERCISE_CATEGORY(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EXERCISE_CATEGORY findById(int messageNumber) {
		for (EXERCISE_CATEGORY name: EXERCISE_CATEGORY.values()) {
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
