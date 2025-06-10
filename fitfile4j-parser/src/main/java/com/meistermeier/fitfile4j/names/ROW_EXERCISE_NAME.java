// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ROW_EXERCISE_NAME {

	_BARBELL_STRAIGHT_LEG_DEADLIFT_TO_ROW(0, "barbell_straight_leg_deadlift_to_row"),

	_CABLE_ROW_STANDING(1, "cable_row_standing"),

	_DUMBBELL_ROW(2, "dumbbell_row"),

	_ELEVATED_FEET_INVERTED_ROW(3, "elevated_feet_inverted_row"),

	_WEIGHTED_ELEVATED_FEET_INVERTED_ROW(4, "weighted_elevated_feet_inverted_row"),

	_FACE_PULL(5, "face_pull"),

	_FACE_PULL_WITH_EXTERNAL_ROTATION(6, "face_pull_with_external_rotation"),

	_INVERTED_ROW_WITH_FEET_ON_SWISS_BALL(7, "inverted_row_with_feet_on_swiss_ball"),

	_WEIGHTED_INVERTED_ROW_WITH_FEET_ON_SWISS_BALL(8, "weighted_inverted_row_with_feet_on_swiss_ball"),

	_KETTLEBELL_ROW(9, "kettlebell_row"),

	_MODIFIED_INVERTED_ROW(10, "modified_inverted_row"),

	_WEIGHTED_MODIFIED_INVERTED_ROW(11, "weighted_modified_inverted_row"),

	_NEUTRAL_GRIP_ALTERNATING_DUMBBELL_ROW(12, "neutral_grip_alternating_dumbbell_row"),

	_ONE_ARM_BENT_OVER_ROW(13, "one_arm_bent_over_row"),

	_ONE_LEGGED_DUMBBELL_ROW(14, "one_legged_dumbbell_row"),

	_RENEGADE_ROW(15, "renegade_row"),

	_REVERSE_GRIP_BARBELL_ROW(16, "reverse_grip_barbell_row"),

	_ROPE_HANDLE_CABLE_ROW(17, "rope_handle_cable_row"),

	_SEATED_CABLE_ROW(18, "seated_cable_row"),

	_SEATED_DUMBBELL_ROW(19, "seated_dumbbell_row"),

	_SINGLE_ARM_CABLE_ROW(20, "single_arm_cable_row"),

	_SINGLE_ARM_CABLE_ROW_AND_ROTATION(21, "single_arm_cable_row_and_rotation"),

	_SINGLE_ARM_INVERTED_ROW(22, "single_arm_inverted_row"),

	_WEIGHTED_SINGLE_ARM_INVERTED_ROW(23, "weighted_single_arm_inverted_row"),

	_SINGLE_ARM_NEUTRAL_GRIP_DUMBBELL_ROW(24, "single_arm_neutral_grip_dumbbell_row"),

	_SINGLE_ARM_NEUTRAL_GRIP_DUMBBELL_ROW_AND_ROTATION(25, "single_arm_neutral_grip_dumbbell_row_and_rotation"),

	_SUSPENDED_INVERTED_ROW(26, "suspended_inverted_row"),

	_WEIGHTED_SUSPENDED_INVERTED_ROW(27, "weighted_suspended_inverted_row"),

	_T_BAR_ROW(28, "t_bar_row"),

	_TOWEL_GRIP_INVERTED_ROW(29, "towel_grip_inverted_row"),

	_WEIGHTED_TOWEL_GRIP_INVERTED_ROW(30, "weighted_towel_grip_inverted_row"),

	_UNDERHAND_GRIP_CABLE_ROW(31, "underhand_grip_cable_row"),

	_V_GRIP_CABLE_ROW(32, "v_grip_cable_row"),

	_WIDE_GRIP_SEATED_CABLE_ROW(33, "wide_grip_seated_cable_row");

	private final int messageNumber;

	private final String messageName;

	ROW_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ROW_EXERCISE_NAME findById(int messageNumber) {
		for (ROW_EXERCISE_NAME name : ROW_EXERCISE_NAME.values()) {
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
