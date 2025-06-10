// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HIP_STABILITY_EXERCISE_NAME {

	_BAND_SIDE_LYING_LEG_RAISE(0, "band_side_lying_leg_raise"),

	_DEAD_BUG(1, "dead_bug"),

	_WEIGHTED_DEAD_BUG(2, "weighted_dead_bug"),

	_EXTERNAL_HIP_RAISE(3, "external_hip_raise"),

	_WEIGHTED_EXTERNAL_HIP_RAISE(4, "weighted_external_hip_raise"),

	_FIRE_HYDRANT_KICKS(5, "fire_hydrant_kicks"),

	_WEIGHTED_FIRE_HYDRANT_KICKS(6, "weighted_fire_hydrant_kicks"),

	_HIP_CIRCLES(7, "hip_circles"),

	_WEIGHTED_HIP_CIRCLES(8, "weighted_hip_circles"),

	_INNER_THIGH_LIFT(9, "inner_thigh_lift"),

	_WEIGHTED_INNER_THIGH_LIFT(10, "weighted_inner_thigh_lift"),

	_LATERAL_WALKS_WITH_BAND_AT_ANKLES(11, "lateral_walks_with_band_at_ankles"),

	_PRETZEL_SIDE_KICK(12, "pretzel_side_kick"),

	_WEIGHTED_PRETZEL_SIDE_KICK(13, "weighted_pretzel_side_kick"),

	_PRONE_HIP_INTERNAL_ROTATION(14, "prone_hip_internal_rotation"),

	_WEIGHTED_PRONE_HIP_INTERNAL_ROTATION(15, "weighted_prone_hip_internal_rotation"),

	_QUADRUPED(16, "quadruped"),

	_QUADRUPED_HIP_EXTENSION(17, "quadruped_hip_extension"),

	_WEIGHTED_QUADRUPED_HIP_EXTENSION(18, "weighted_quadruped_hip_extension"),

	_QUADRUPED_WITH_LEG_LIFT(19, "quadruped_with_leg_lift"),

	_WEIGHTED_QUADRUPED_WITH_LEG_LIFT(20, "weighted_quadruped_with_leg_lift"),

	_SIDE_LYING_LEG_RAISE(21, "side_lying_leg_raise"),

	_WEIGHTED_SIDE_LYING_LEG_RAISE(22, "weighted_side_lying_leg_raise"),

	_SLIDING_HIP_ADDUCTION(23, "sliding_hip_adduction"),

	_WEIGHTED_SLIDING_HIP_ADDUCTION(24, "weighted_sliding_hip_adduction"),

	_STANDING_ADDUCTION(25, "standing_adduction"),

	_WEIGHTED_STANDING_ADDUCTION(26, "weighted_standing_adduction"),

	_STANDING_CABLE_HIP_ABDUCTION(27, "standing_cable_hip_abduction"),

	_STANDING_HIP_ABDUCTION(28, "standing_hip_abduction"),

	_WEIGHTED_STANDING_HIP_ABDUCTION(29, "weighted_standing_hip_abduction"),

	_STANDING_REAR_LEG_RAISE(30, "standing_rear_leg_raise"),

	_WEIGHTED_STANDING_REAR_LEG_RAISE(31, "weighted_standing_rear_leg_raise"),

	_SUPINE_HIP_INTERNAL_ROTATION(32, "supine_hip_internal_rotation"),

	_WEIGHTED_SUPINE_HIP_INTERNAL_ROTATION(33, "weighted_supine_hip_internal_rotation");

	private final int messageNumber;

	private final String messageName;

	HIP_STABILITY_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HIP_STABILITY_EXERCISE_NAME findById(int messageNumber) {
		for (HIP_STABILITY_EXERCISE_NAME name : HIP_STABILITY_EXERCISE_NAME.values()) {
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
