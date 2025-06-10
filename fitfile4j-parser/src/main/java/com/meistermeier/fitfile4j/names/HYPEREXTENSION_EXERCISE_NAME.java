// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HYPEREXTENSION_EXERCISE_NAME {

	_BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH(0, "back_extension_with_opposite_arm_and_leg_reach"),

	_WEIGHTED_BACK_EXTENSION_WITH_OPPOSITE_ARM_AND_LEG_REACH(1,
			"weighted_back_extension_with_opposite_arm_and_leg_reach"),

	_BASE_ROTATIONS(2, "base_rotations"),

	_WEIGHTED_BASE_ROTATIONS(3, "weighted_base_rotations"),

	_BENT_KNEE_REVERSE_HYPEREXTENSION(4, "bent_knee_reverse_hyperextension"),

	_WEIGHTED_BENT_KNEE_REVERSE_HYPEREXTENSION(5, "weighted_bent_knee_reverse_hyperextension"),

	_HOLLOW_HOLD_AND_ROLL(6, "hollow_hold_and_roll"),

	_WEIGHTED_HOLLOW_HOLD_AND_ROLL(7, "weighted_hollow_hold_and_roll"),

	_KICKS(8, "kicks"),

	_WEIGHTED_KICKS(9, "weighted_kicks"),

	_KNEE_RAISES(10, "knee_raises"),

	_WEIGHTED_KNEE_RAISES(11, "weighted_knee_raises"),

	_KNEELING_SUPERMAN(12, "kneeling_superman"),

	_WEIGHTED_KNEELING_SUPERMAN(13, "weighted_kneeling_superman"),

	_LAT_PULL_DOWN_WITH_ROW(14, "lat_pull_down_with_row"),

	_MEDICINE_BALL_DEADLIFT_TO_REACH(15, "medicine_ball_deadlift_to_reach"),

	_ONE_ARM_ONE_LEG_ROW(16, "one_arm_one_leg_row"),

	_ONE_ARM_ROW_WITH_BAND(17, "one_arm_row_with_band"),

	_OVERHEAD_LUNGE_WITH_MEDICINE_BALL(18, "overhead_lunge_with_medicine_ball"),

	_PLANK_KNEE_TUCKS(19, "plank_knee_tucks"),

	_WEIGHTED_PLANK_KNEE_TUCKS(20, "weighted_plank_knee_tucks"),

	_SIDE_STEP(21, "side_step"),

	_WEIGHTED_SIDE_STEP(22, "weighted_side_step"),

	_SINGLE_LEG_BACK_EXTENSION(23, "single_leg_back_extension"),

	_WEIGHTED_SINGLE_LEG_BACK_EXTENSION(24, "weighted_single_leg_back_extension"),

	_SPINE_EXTENSION(25, "spine_extension"),

	_WEIGHTED_SPINE_EXTENSION(26, "weighted_spine_extension"),

	_STATIC_BACK_EXTENSION(27, "static_back_extension"),

	_WEIGHTED_STATIC_BACK_EXTENSION(28, "weighted_static_back_extension"),

	_SUPERMAN_FROM_FLOOR(29, "superman_from_floor"),

	_WEIGHTED_SUPERMAN_FROM_FLOOR(30, "weighted_superman_from_floor"),

	_SWISS_BALL_BACK_EXTENSION(31, "swiss_ball_back_extension"),

	_WEIGHTED_SWISS_BALL_BACK_EXTENSION(32, "weighted_swiss_ball_back_extension"),

	_SWISS_BALL_HYPEREXTENSION(33, "swiss_ball_hyperextension"),

	_WEIGHTED_SWISS_BALL_HYPEREXTENSION(34, "weighted_swiss_ball_hyperextension"),

	_SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT(35, "swiss_ball_opposite_arm_and_leg_lift"),

	_WEIGHTED_SWISS_BALL_OPPOSITE_ARM_AND_LEG_LIFT(36, "weighted_swiss_ball_opposite_arm_and_leg_lift"),

	_SUPERMAN_ON_SWISS_BALL(37, "superman_on_swiss_ball"),

	_COBRA(38, "cobra"),

	_SUPINE_FLOOR_BARRE(39, "supine_floor_barre");

	private final int messageNumber;

	private final String messageName;

	HYPEREXTENSION_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HYPEREXTENSION_EXERCISE_NAME findById(int messageNumber) {
		for (HYPEREXTENSION_EXERCISE_NAME name : HYPEREXTENSION_EXERCISE_NAME.values()) {
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
