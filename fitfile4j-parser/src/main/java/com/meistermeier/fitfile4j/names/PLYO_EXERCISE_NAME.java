// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum PLYO_EXERCISE_NAME {
	_ALTERNATING_JUMP_LUNGE(0, "alternating_jump_lunge"),

	_WEIGHTED_ALTERNATING_JUMP_LUNGE(1, "weighted_alternating_jump_lunge"),

	_BARBELL_JUMP_SQUAT(2, "barbell_jump_squat"),

	_BODY_WEIGHT_JUMP_SQUAT(3, "body_weight_jump_squat"),

	_WEIGHTED_JUMP_SQUAT(4, "weighted_jump_squat"),

	_CROSS_KNEE_STRIKE(5, "cross_knee_strike"),

	_WEIGHTED_CROSS_KNEE_STRIKE(6, "weighted_cross_knee_strike"),

	_DEPTH_JUMP(7, "depth_jump"),

	_WEIGHTED_DEPTH_JUMP(8, "weighted_depth_jump"),

	_DUMBBELL_JUMP_SQUAT(9, "dumbbell_jump_squat"),

	_DUMBBELL_SPLIT_JUMP(10, "dumbbell_split_jump"),

	_FRONT_KNEE_STRIKE(11, "front_knee_strike"),

	_WEIGHTED_FRONT_KNEE_STRIKE(12, "weighted_front_knee_strike"),

	_HIGH_BOX_JUMP(13, "high_box_jump"),

	_WEIGHTED_HIGH_BOX_JUMP(14, "weighted_high_box_jump"),

	_ISOMETRIC_EXPLOSIVE_BODY_WEIGHT_JUMP_SQUAT(15, "isometric_explosive_body_weight_jump_squat"),

	_WEIGHTED_ISOMETRIC_EXPLOSIVE_JUMP_SQUAT(16, "weighted_isometric_explosive_jump_squat"),

	_LATERAL_LEAP_AND_HOP(17, "lateral_leap_and_hop"),

	_WEIGHTED_LATERAL_LEAP_AND_HOP(18, "weighted_lateral_leap_and_hop"),

	_LATERAL_PLYO_SQUATS(19, "lateral_plyo_squats"),

	_WEIGHTED_LATERAL_PLYO_SQUATS(20, "weighted_lateral_plyo_squats"),

	_LATERAL_SLIDE(21, "lateral_slide"),

	_WEIGHTED_LATERAL_SLIDE(22, "weighted_lateral_slide"),

	_MEDICINE_BALL_OVERHEAD_THROWS(23, "medicine_ball_overhead_throws"),

	_MEDICINE_BALL_SIDE_THROW(24, "medicine_ball_side_throw"),

	_MEDICINE_BALL_SLAM(25, "medicine_ball_slam"),

	_SIDE_TO_SIDE_MEDICINE_BALL_THROWS(26, "side_to_side_medicine_ball_throws"),

	_SIDE_TO_SIDE_SHUFFLE_JUMP(27, "side_to_side_shuffle_jump"),

	_WEIGHTED_SIDE_TO_SIDE_SHUFFLE_JUMP(28, "weighted_side_to_side_shuffle_jump"),

	_SQUAT_JUMP_ONTO_BOX(29, "squat_jump_onto_box"),

	_WEIGHTED_SQUAT_JUMP_ONTO_BOX(30, "weighted_squat_jump_onto_box"),

	_SQUAT_JUMPS_IN_AND_OUT(31, "squat_jumps_in_and_out"),

	_WEIGHTED_SQUAT_JUMPS_IN_AND_OUT(32, "weighted_squat_jumps_in_and_out");

	private final int messageNumber;

	private final String messageName;

	PLYO_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static PLYO_EXERCISE_NAME findById(int messageNumber) {
		for (PLYO_EXERCISE_NAME name: PLYO_EXERCISE_NAME.values()) {
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
