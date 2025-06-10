// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DEADLIFT_EXERCISE_NAME {

	_BARBELL_DEADLIFT(0, "barbell_deadlift"),

	_BARBELL_STRAIGHT_LEG_DEADLIFT(1, "barbell_straight_leg_deadlift"),

	_DUMBBELL_DEADLIFT(2, "dumbbell_deadlift"),

	_DUMBBELL_SINGLE_LEG_DEADLIFT_TO_ROW(3, "dumbbell_single_leg_deadlift_to_row"),

	_DUMBBELL_STRAIGHT_LEG_DEADLIFT(4, "dumbbell_straight_leg_deadlift"),

	_KETTLEBELL_FLOOR_TO_SHELF(5, "kettlebell_floor_to_shelf"),

	_ONE_ARM_ONE_LEG_DEADLIFT(6, "one_arm_one_leg_deadlift"),

	_RACK_PULL(7, "rack_pull"),

	_ROTATIONAL_DUMBBELL_STRAIGHT_LEG_DEADLIFT(8, "rotational_dumbbell_straight_leg_deadlift"),

	_SINGLE_ARM_DEADLIFT(9, "single_arm_deadlift"),

	_SINGLE_LEG_BARBELL_DEADLIFT(10, "single_leg_barbell_deadlift"),

	_SINGLE_LEG_BARBELL_STRAIGHT_LEG_DEADLIFT(11, "single_leg_barbell_straight_leg_deadlift"),

	_SINGLE_LEG_DEADLIFT_WITH_BARBELL(12, "single_leg_deadlift_with_barbell"),

	_SINGLE_LEG_RDL_CIRCUIT(13, "single_leg_rdl_circuit"),

	_SINGLE_LEG_ROMANIAN_DEADLIFT_WITH_DUMBBELL(14, "single_leg_romanian_deadlift_with_dumbbell"),

	_SUMO_DEADLIFT(15, "sumo_deadlift"),

	_SUMO_DEADLIFT_HIGH_PULL(16, "sumo_deadlift_high_pull"),

	_TRAP_BAR_DEADLIFT(17, "trap_bar_deadlift"),

	_WIDE_GRIP_BARBELL_DEADLIFT(18, "wide_grip_barbell_deadlift");

	private final int messageNumber;

	private final String messageName;

	DEADLIFT_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DEADLIFT_EXERCISE_NAME findById(int messageNumber) {
		for (DEADLIFT_EXERCISE_NAME name : DEADLIFT_EXERCISE_NAME.values()) {
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
