// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CALF_RAISE_EXERCISE_NAME {
	_3_WAY_CALF_RAISE(0, "3_way_calf_raise"),

	_3_WAY_WEIGHTED_CALF_RAISE(1, "3_way_weighted_calf_raise"),

	_3_WAY_SINGLE_LEG_CALF_RAISE(2, "3_way_single_leg_calf_raise"),

	_3_WAY_WEIGHTED_SINGLE_LEG_CALF_RAISE(3, "3_way_weighted_single_leg_calf_raise"),

	_DONKEY_CALF_RAISE(4, "donkey_calf_raise"),

	_WEIGHTED_DONKEY_CALF_RAISE(5, "weighted_donkey_calf_raise"),

	_SEATED_CALF_RAISE(6, "seated_calf_raise"),

	_WEIGHTED_SEATED_CALF_RAISE(7, "weighted_seated_calf_raise"),

	_SEATED_DUMBBELL_TOE_RAISE(8, "seated_dumbbell_toe_raise"),

	_SINGLE_LEG_BENT_KNEE_CALF_RAISE(9, "single_leg_bent_knee_calf_raise"),

	_WEIGHTED_SINGLE_LEG_BENT_KNEE_CALF_RAISE(10, "weighted_single_leg_bent_knee_calf_raise"),

	_SINGLE_LEG_DECLINE_PUSH_UP(11, "single_leg_decline_push_up"),

	_SINGLE_LEG_DONKEY_CALF_RAISE(12, "single_leg_donkey_calf_raise"),

	_WEIGHTED_SINGLE_LEG_DONKEY_CALF_RAISE(13, "weighted_single_leg_donkey_calf_raise"),

	_SINGLE_LEG_HIP_RAISE_WITH_KNEE_HOLD(14, "single_leg_hip_raise_with_knee_hold"),

	_SINGLE_LEG_STANDING_CALF_RAISE(15, "single_leg_standing_calf_raise"),

	_SINGLE_LEG_STANDING_DUMBBELL_CALF_RAISE(16, "single_leg_standing_dumbbell_calf_raise"),

	_STANDING_BARBELL_CALF_RAISE(17, "standing_barbell_calf_raise"),

	_STANDING_CALF_RAISE(18, "standing_calf_raise"),

	_WEIGHTED_STANDING_CALF_RAISE(19, "weighted_standing_calf_raise"),

	_STANDING_DUMBBELL_CALF_RAISE(20, "standing_dumbbell_calf_raise");

	private final int messageNumber;

	private final String messageName;

	CALF_RAISE_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static CALF_RAISE_EXERCISE_NAME findById(int messageNumber) {
		for (CALF_RAISE_EXERCISE_NAME name: CALF_RAISE_EXERCISE_NAME.values()) {
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
