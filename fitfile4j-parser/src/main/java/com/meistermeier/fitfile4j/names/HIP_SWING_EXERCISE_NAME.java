// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum HIP_SWING_EXERCISE_NAME {

	_SINGLE_ARM_KETTLEBELL_SWING(0, "single_arm_kettlebell_swing"),

	_SINGLE_ARM_DUMBBELL_SWING(1, "single_arm_dumbbell_swing"),

	_STEP_OUT_SWING(2, "step_out_swing");

	private final int messageNumber;

	private final String messageName;

	HIP_SWING_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static HIP_SWING_EXERCISE_NAME findById(int messageNumber) {
		for (HIP_SWING_EXERCISE_NAME name : HIP_SWING_EXERCISE_NAME.values()) {
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
