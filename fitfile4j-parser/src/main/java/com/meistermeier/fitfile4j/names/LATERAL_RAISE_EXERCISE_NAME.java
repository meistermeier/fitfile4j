// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LATERAL_RAISE_EXERCISE_NAME {

	_45_DEGREE_CABLE_EXTERNAL_ROTATION(0, "45_degree_cable_external_rotation"),

	_ALTERNATING_LATERAL_RAISE_WITH_STATIC_HOLD(1, "alternating_lateral_raise_with_static_hold"),

	_BAR_MUSCLE_UP(2, "bar_muscle_up"),

	_BENT_OVER_LATERAL_RAISE(3, "bent_over_lateral_raise"),

	_CABLE_DIAGONAL_RAISE(4, "cable_diagonal_raise"),

	_CABLE_FRONT_RAISE(5, "cable_front_raise"),

	_CALORIE_ROW(6, "calorie_row"),

	_COMBO_SHOULDER_RAISE(7, "combo_shoulder_raise"),

	_DUMBBELL_DIAGONAL_RAISE(8, "dumbbell_diagonal_raise"),

	_DUMBBELL_V_RAISE(9, "dumbbell_v_raise"),

	_FRONT_RAISE(10, "front_raise"),

	_LEANING_DUMBBELL_LATERAL_RAISE(11, "leaning_dumbbell_lateral_raise"),

	_LYING_DUMBBELL_RAISE(12, "lying_dumbbell_raise"),

	_MUSCLE_UP(13, "muscle_up"),

	_ONE_ARM_CABLE_LATERAL_RAISE(14, "one_arm_cable_lateral_raise"),

	_OVERHAND_GRIP_REAR_LATERAL_RAISE(15, "overhand_grip_rear_lateral_raise"),

	_PLATE_RAISES(16, "plate_raises"),

	_RING_DIP(17, "ring_dip"),

	_WEIGHTED_RING_DIP(18, "weighted_ring_dip"),

	_RING_MUSCLE_UP(19, "ring_muscle_up"),

	_WEIGHTED_RING_MUSCLE_UP(20, "weighted_ring_muscle_up"),

	_ROPE_CLIMB(21, "rope_climb"),

	_WEIGHTED_ROPE_CLIMB(22, "weighted_rope_climb"),

	_SCAPTION(23, "scaption"),

	_SEATED_LATERAL_RAISE(24, "seated_lateral_raise"),

	_SEATED_REAR_LATERAL_RAISE(25, "seated_rear_lateral_raise"),

	_SIDE_LYING_LATERAL_RAISE(26, "side_lying_lateral_raise"),

	_STANDING_LIFT(27, "standing_lift"),

	_SUSPENDED_ROW(28, "suspended_row"),

	_UNDERHAND_GRIP_REAR_LATERAL_RAISE(29, "underhand_grip_rear_lateral_raise"),

	_WALL_SLIDE(30, "wall_slide"),

	_WEIGHTED_WALL_SLIDE(31, "weighted_wall_slide"),

	_ARM_CIRCLES(32, "arm_circles"),

	_SHAVING_THE_HEAD(33, "shaving_the_head");

	private final int messageNumber;

	private final String messageName;

	LATERAL_RAISE_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LATERAL_RAISE_EXERCISE_NAME findById(int messageNumber) {
		for (LATERAL_RAISE_EXERCISE_NAME name : LATERAL_RAISE_EXERCISE_NAME.values()) {
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
