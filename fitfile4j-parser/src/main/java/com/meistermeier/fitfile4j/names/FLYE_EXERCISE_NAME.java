// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FLYE_EXERCISE_NAME {
  _CABLE_CROSSOVER(0, "cable_crossover"),

  _DECLINE_DUMBBELL_FLYE(1, "decline_dumbbell_flye"),

  _DUMBBELL_FLYE(2, "dumbbell_flye"),

  _INCLINE_DUMBBELL_FLYE(3, "incline_dumbbell_flye"),

  _KETTLEBELL_FLYE(4, "kettlebell_flye"),

  _KNEELING_REAR_FLYE(5, "kneeling_rear_flye"),

  _SINGLE_ARM_STANDING_CABLE_REVERSE_FLYE(6, "single_arm_standing_cable_reverse_flye"),

  _SWISS_BALL_DUMBBELL_FLYE(7, "swiss_ball_dumbbell_flye"),

  _ARM_ROTATIONS(8, "arm_rotations"),

  _HUG_A_TREE(9, "hug_a_tree");

  private final int messageNumber;

  private final String messageName;

  FLYE_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static FLYE_EXERCISE_NAME findById(int messageNumber) {
    for (FLYE_EXERCISE_NAME name: FLYE_EXERCISE_NAME.values()) {
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
