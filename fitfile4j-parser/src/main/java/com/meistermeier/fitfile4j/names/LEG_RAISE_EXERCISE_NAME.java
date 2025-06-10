// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LEG_RAISE_EXERCISE_NAME {

	_HANGING_KNEE_RAISE(0, "hanging_knee_raise"),

	_HANGING_LEG_RAISE(1, "hanging_leg_raise"),

	_WEIGHTED_HANGING_LEG_RAISE(2, "weighted_hanging_leg_raise"),

	_HANGING_SINGLE_LEG_RAISE(3, "hanging_single_leg_raise"),

	_WEIGHTED_HANGING_SINGLE_LEG_RAISE(4, "weighted_hanging_single_leg_raise"),

	_KETTLEBELL_LEG_RAISES(5, "kettlebell_leg_raises"),

	_LEG_LOWERING_DRILL(6, "leg_lowering_drill"),

	_WEIGHTED_LEG_LOWERING_DRILL(7, "weighted_leg_lowering_drill"),

	_LYING_STRAIGHT_LEG_RAISE(8, "lying_straight_leg_raise"),

	_WEIGHTED_LYING_STRAIGHT_LEG_RAISE(9, "weighted_lying_straight_leg_raise"),

	_MEDICINE_BALL_LEG_DROPS(10, "medicine_ball_leg_drops"),

	_QUADRUPED_LEG_RAISE(11, "quadruped_leg_raise"),

	_WEIGHTED_QUADRUPED_LEG_RAISE(12, "weighted_quadruped_leg_raise"),

	_REVERSE_LEG_RAISE(13, "reverse_leg_raise"),

	_WEIGHTED_REVERSE_LEG_RAISE(14, "weighted_reverse_leg_raise"),

	_REVERSE_LEG_RAISE_ON_SWISS_BALL(15, "reverse_leg_raise_on_swiss_ball"),

	_WEIGHTED_REVERSE_LEG_RAISE_ON_SWISS_BALL(16, "weighted_reverse_leg_raise_on_swiss_ball"),

	_SINGLE_LEG_LOWERING_DRILL(17, "single_leg_lowering_drill"),

	_WEIGHTED_SINGLE_LEG_LOWERING_DRILL(18, "weighted_single_leg_lowering_drill"),

	_WEIGHTED_HANGING_KNEE_RAISE(19, "weighted_hanging_knee_raise"),

	_LATERAL_STEPOVER(20, "lateral_stepover"),

	_WEIGHTED_LATERAL_STEPOVER(21, "weighted_lateral_stepover");

	private final int messageNumber;

	private final String messageName;

	LEG_RAISE_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LEG_RAISE_EXERCISE_NAME findById(int messageNumber) {
		for (LEG_RAISE_EXERCISE_NAME name : LEG_RAISE_EXERCISE_NAME.values()) {
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
