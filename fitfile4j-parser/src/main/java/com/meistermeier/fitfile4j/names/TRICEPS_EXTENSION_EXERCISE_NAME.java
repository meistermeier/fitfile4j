// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TRICEPS_EXTENSION_EXERCISE_NAME {

	_BENCH_DIP(0, "bench_dip"),

	_WEIGHTED_BENCH_DIP(1, "weighted_bench_dip"),

	_BODY_WEIGHT_DIP(2, "body_weight_dip"),

	_CABLE_KICKBACK(3, "cable_kickback"),

	_CABLE_LYING_TRICEPS_EXTENSION(4, "cable_lying_triceps_extension"),

	_CABLE_OVERHEAD_TRICEPS_EXTENSION(5, "cable_overhead_triceps_extension"),

	_DUMBBELL_KICKBACK(6, "dumbbell_kickback"),

	_DUMBBELL_LYING_TRICEPS_EXTENSION(7, "dumbbell_lying_triceps_extension"),

	_EZ_BAR_OVERHEAD_TRICEPS_EXTENSION(8, "ez_bar_overhead_triceps_extension"),

	_INCLINE_DIP(9, "incline_dip"),

	_WEIGHTED_INCLINE_DIP(10, "weighted_incline_dip"),

	_INCLINE_EZ_BAR_LYING_TRICEPS_EXTENSION(11, "incline_ez_bar_lying_triceps_extension"),

	_LYING_DUMBBELL_PULLOVER_TO_EXTENSION(12, "lying_dumbbell_pullover_to_extension"),

	_LYING_EZ_BAR_TRICEPS_EXTENSION(13, "lying_ez_bar_triceps_extension"),

	_LYING_TRICEPS_EXTENSION_TO_CLOSE_GRIP_BENCH_PRESS(14, "lying_triceps_extension_to_close_grip_bench_press"),

	_OVERHEAD_DUMBBELL_TRICEPS_EXTENSION(15, "overhead_dumbbell_triceps_extension"),

	_RECLINING_TRICEPS_PRESS(16, "reclining_triceps_press"),

	_REVERSE_GRIP_PRESSDOWN(17, "reverse_grip_pressdown"),

	_REVERSE_GRIP_TRICEPS_PRESSDOWN(18, "reverse_grip_triceps_pressdown"),

	_ROPE_PRESSDOWN(19, "rope_pressdown"),

	_SEATED_BARBELL_OVERHEAD_TRICEPS_EXTENSION(20, "seated_barbell_overhead_triceps_extension"),

	_SEATED_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION(21, "seated_dumbbell_overhead_triceps_extension"),

	_SEATED_EZ_BAR_OVERHEAD_TRICEPS_EXTENSION(22, "seated_ez_bar_overhead_triceps_extension"),

	_SEATED_SINGLE_ARM_OVERHEAD_DUMBBELL_EXTENSION(23, "seated_single_arm_overhead_dumbbell_extension"),

	_SINGLE_ARM_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION(24, "single_arm_dumbbell_overhead_triceps_extension"),

	_SINGLE_DUMBBELL_SEATED_OVERHEAD_TRICEPS_EXTENSION(25, "single_dumbbell_seated_overhead_triceps_extension"),

	_SINGLE_LEG_BENCH_DIP_AND_KICK(26, "single_leg_bench_dip_and_kick"),

	_WEIGHTED_SINGLE_LEG_BENCH_DIP_AND_KICK(27, "weighted_single_leg_bench_dip_and_kick"),

	_SINGLE_LEG_DIP(28, "single_leg_dip"),

	_WEIGHTED_SINGLE_LEG_DIP(29, "weighted_single_leg_dip"),

	_STATIC_LYING_TRICEPS_EXTENSION(30, "static_lying_triceps_extension"),

	_SUSPENDED_DIP(31, "suspended_dip"),

	_WEIGHTED_SUSPENDED_DIP(32, "weighted_suspended_dip"),

	_SWISS_BALL_DUMBBELL_LYING_TRICEPS_EXTENSION(33, "swiss_ball_dumbbell_lying_triceps_extension"),

	_SWISS_BALL_EZ_BAR_LYING_TRICEPS_EXTENSION(34, "swiss_ball_ez_bar_lying_triceps_extension"),

	_SWISS_BALL_EZ_BAR_OVERHEAD_TRICEPS_EXTENSION(35, "swiss_ball_ez_bar_overhead_triceps_extension"),

	_TABLETOP_DIP(36, "tabletop_dip"),

	_WEIGHTED_TABLETOP_DIP(37, "weighted_tabletop_dip"),

	_TRICEPS_EXTENSION_ON_FLOOR(38, "triceps_extension_on_floor"),

	_TRICEPS_PRESSDOWN(39, "triceps_pressdown"),

	_WEIGHTED_DIP(40, "weighted_dip");

	private final int messageNumber;

	private final String messageName;

	TRICEPS_EXTENSION_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static TRICEPS_EXTENSION_EXERCISE_NAME findById(int messageNumber) {
		for (TRICEPS_EXTENSION_EXERCISE_NAME name : TRICEPS_EXTENSION_EXERCISE_NAME.values()) {
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
