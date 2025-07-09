// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BENCH_PRESS_EXERCISE_NAME {
	_ALTERNATING_DUMBBELL_CHEST_PRESS_ON_SWISS_BALL(0, "alternating_dumbbell_chest_press_on_swiss_ball"),

	_BARBELL_BENCH_PRESS(1, "barbell_bench_press"),

	_BARBELL_BOARD_BENCH_PRESS(2, "barbell_board_bench_press"),

	_BARBELL_FLOOR_PRESS(3, "barbell_floor_press"),

	_CLOSE_GRIP_BARBELL_BENCH_PRESS(4, "close_grip_barbell_bench_press"),

	_DECLINE_DUMBBELL_BENCH_PRESS(5, "decline_dumbbell_bench_press"),

	_DUMBBELL_BENCH_PRESS(6, "dumbbell_bench_press"),

	_DUMBBELL_FLOOR_PRESS(7, "dumbbell_floor_press"),

	_INCLINE_BARBELL_BENCH_PRESS(8, "incline_barbell_bench_press"),

	_INCLINE_DUMBBELL_BENCH_PRESS(9, "incline_dumbbell_bench_press"),

	_INCLINE_SMITH_MACHINE_BENCH_PRESS(10, "incline_smith_machine_bench_press"),

	_ISOMETRIC_BARBELL_BENCH_PRESS(11, "isometric_barbell_bench_press"),

	_KETTLEBELL_CHEST_PRESS(12, "kettlebell_chest_press"),

	_NEUTRAL_GRIP_DUMBBELL_BENCH_PRESS(13, "neutral_grip_dumbbell_bench_press"),

	_NEUTRAL_GRIP_DUMBBELL_INCLINE_BENCH_PRESS(14, "neutral_grip_dumbbell_incline_bench_press"),

	_ONE_ARM_FLOOR_PRESS(15, "one_arm_floor_press"),

	_WEIGHTED_ONE_ARM_FLOOR_PRESS(16, "weighted_one_arm_floor_press"),

	_PARTIAL_LOCKOUT(17, "partial_lockout"),

	_REVERSE_GRIP_BARBELL_BENCH_PRESS(18, "reverse_grip_barbell_bench_press"),

	_REVERSE_GRIP_INCLINE_BENCH_PRESS(19, "reverse_grip_incline_bench_press"),

	_SINGLE_ARM_CABLE_CHEST_PRESS(20, "single_arm_cable_chest_press"),

	_SINGLE_ARM_DUMBBELL_BENCH_PRESS(21, "single_arm_dumbbell_bench_press"),

	_SMITH_MACHINE_BENCH_PRESS(22, "smith_machine_bench_press"),

	_SWISS_BALL_DUMBBELL_CHEST_PRESS(23, "swiss_ball_dumbbell_chest_press"),

	_TRIPLE_STOP_BARBELL_BENCH_PRESS(24, "triple_stop_barbell_bench_press"),

	_WIDE_GRIP_BARBELL_BENCH_PRESS(25, "wide_grip_barbell_bench_press"),

	_ALTERNATING_DUMBBELL_CHEST_PRESS(26, "alternating_dumbbell_chest_press");

	private final int messageNumber;

	private final String messageName;

	BENCH_PRESS_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BENCH_PRESS_EXERCISE_NAME findById(int messageNumber) {
		for (BENCH_PRESS_EXERCISE_NAME name: BENCH_PRESS_EXERCISE_NAME.values()) {
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
