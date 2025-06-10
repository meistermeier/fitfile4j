// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HIP_RAISE_EXERCISE_NAME {

	_BARBELL_HIP_THRUST_ON_FLOOR(0, "barbell_hip_thrust_on_floor"),

	_BARBELL_HIP_THRUST_WITH_BENCH(1, "barbell_hip_thrust_with_bench"),

	_BENT_KNEE_SWISS_BALL_REVERSE_HIP_RAISE(2, "bent_knee_swiss_ball_reverse_hip_raise"),

	_WEIGHTED_BENT_KNEE_SWISS_BALL_REVERSE_HIP_RAISE(3, "weighted_bent_knee_swiss_ball_reverse_hip_raise"),

	_BRIDGE_WITH_LEG_EXTENSION(4, "bridge_with_leg_extension"),

	_WEIGHTED_BRIDGE_WITH_LEG_EXTENSION(5, "weighted_bridge_with_leg_extension"),

	_CLAM_BRIDGE(6, "clam_bridge"),

	_FRONT_KICK_TABLETOP(7, "front_kick_tabletop"),

	_WEIGHTED_FRONT_KICK_TABLETOP(8, "weighted_front_kick_tabletop"),

	_HIP_EXTENSION_AND_CROSS(9, "hip_extension_and_cross"),

	_WEIGHTED_HIP_EXTENSION_AND_CROSS(10, "weighted_hip_extension_and_cross"),

	_HIP_RAISE(11, "hip_raise"),

	_WEIGHTED_HIP_RAISE(12, "weighted_hip_raise"),

	_HIP_RAISE_WITH_FEET_ON_SWISS_BALL(13, "hip_raise_with_feet_on_swiss_ball"),

	_WEIGHTED_HIP_RAISE_WITH_FEET_ON_SWISS_BALL(14, "weighted_hip_raise_with_feet_on_swiss_ball"),

	_HIP_RAISE_WITH_HEAD_ON_BOSU_BALL(15, "hip_raise_with_head_on_bosu_ball"),

	_WEIGHTED_HIP_RAISE_WITH_HEAD_ON_BOSU_BALL(16, "weighted_hip_raise_with_head_on_bosu_ball"),

	_HIP_RAISE_WITH_HEAD_ON_SWISS_BALL(17, "hip_raise_with_head_on_swiss_ball"),

	_WEIGHTED_HIP_RAISE_WITH_HEAD_ON_SWISS_BALL(18, "weighted_hip_raise_with_head_on_swiss_ball"),

	_HIP_RAISE_WITH_KNEE_SQUEEZE(19, "hip_raise_with_knee_squeeze"),

	_WEIGHTED_HIP_RAISE_WITH_KNEE_SQUEEZE(20, "weighted_hip_raise_with_knee_squeeze"),

	_INCLINE_REAR_LEG_EXTENSION(21, "incline_rear_leg_extension"),

	_WEIGHTED_INCLINE_REAR_LEG_EXTENSION(22, "weighted_incline_rear_leg_extension"),

	_KETTLEBELL_SWING(23, "kettlebell_swing"),

	_MARCHING_HIP_RAISE(24, "marching_hip_raise"),

	_WEIGHTED_MARCHING_HIP_RAISE(25, "weighted_marching_hip_raise"),

	_MARCHING_HIP_RAISE_WITH_FEET_ON_A_SWISS_BALL(26, "marching_hip_raise_with_feet_on_a_swiss_ball"),

	_WEIGHTED_MARCHING_HIP_RAISE_WITH_FEET_ON_A_SWISS_BALL(27, "weighted_marching_hip_raise_with_feet_on_a_swiss_ball"),

	_REVERSE_HIP_RAISE(28, "reverse_hip_raise"),

	_WEIGHTED_REVERSE_HIP_RAISE(29, "weighted_reverse_hip_raise"),

	_SINGLE_LEG_HIP_RAISE(30, "single_leg_hip_raise"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE(31, "weighted_single_leg_hip_raise"),

	_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_BENCH(32, "single_leg_hip_raise_with_foot_on_bench"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_BENCH(33, "weighted_single_leg_hip_raise_with_foot_on_bench"),

	_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_BOSU_BALL(34, "single_leg_hip_raise_with_foot_on_bosu_ball"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_BOSU_BALL(35, "weighted_single_leg_hip_raise_with_foot_on_bosu_ball"),

	_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_FOAM_ROLLER(36, "single_leg_hip_raise_with_foot_on_foam_roller"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_FOAM_ROLLER(37,
			"weighted_single_leg_hip_raise_with_foot_on_foam_roller"),

	_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_MEDICINE_BALL(38, "single_leg_hip_raise_with_foot_on_medicine_ball"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE_WITH_FOOT_ON_MEDICINE_BALL(39,
			"weighted_single_leg_hip_raise_with_foot_on_medicine_ball"),

	_SINGLE_LEG_HIP_RAISE_WITH_HEAD_ON_BOSU_BALL(40, "single_leg_hip_raise_with_head_on_bosu_ball"),

	_WEIGHTED_SINGLE_LEG_HIP_RAISE_WITH_HEAD_ON_BOSU_BALL(41, "weighted_single_leg_hip_raise_with_head_on_bosu_ball"),

	_WEIGHTED_CLAM_BRIDGE(42, "weighted_clam_bridge"),

	_SINGLE_LEG_SWISS_BALL_HIP_RAISE_AND_LEG_CURL(43, "single_leg_swiss_ball_hip_raise_and_leg_curl"),

	_CLAMS(44, "clams"),

	_INNER_THIGH_CIRCLES(45, "inner_thigh_circles"),

	_INNER_THIGH_SIDE_LIFT(46, "inner_thigh_side_lift"),

	_LEG_CIRCLES(47, "leg_circles"),

	_LEG_LIFT(48, "leg_lift"),

	_LEG_LIFT_IN_EXTERNAL_ROTATION(49, "leg_lift_in_external_rotation");

	private final int messageNumber;

	private final String messageName;

	HIP_RAISE_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HIP_RAISE_EXERCISE_NAME findById(int messageNumber) {
		for (HIP_RAISE_EXERCISE_NAME name : HIP_RAISE_EXERCISE_NAME.values()) {
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
