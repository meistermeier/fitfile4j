// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum OLYMPIC_LIFT_EXERCISE_NAME {
  _BARBELL_HANG_POWER_CLEAN(0, "barbell_hang_power_clean"),

  _BARBELL_HANG_SQUAT_CLEAN(1, "barbell_hang_squat_clean"),

  _BARBELL_POWER_CLEAN(2, "barbell_power_clean"),

  _BARBELL_POWER_SNATCH(3, "barbell_power_snatch"),

  _BARBELL_SQUAT_CLEAN(4, "barbell_squat_clean"),

  _CLEAN_AND_JERK(5, "clean_and_jerk"),

  _BARBELL_HANG_POWER_SNATCH(6, "barbell_hang_power_snatch"),

  _BARBELL_HANG_PULL(7, "barbell_hang_pull"),

  _BARBELL_HIGH_PULL(8, "barbell_high_pull"),

  _BARBELL_SNATCH(9, "barbell_snatch"),

  _BARBELL_SPLIT_JERK(10, "barbell_split_jerk"),

  _CLEAN(11, "clean"),

  _DUMBBELL_CLEAN(12, "dumbbell_clean"),

  _DUMBBELL_HANG_PULL(13, "dumbbell_hang_pull"),

  _ONE_HAND_DUMBBELL_SPLIT_SNATCH(14, "one_hand_dumbbell_split_snatch"),

  _PUSH_JERK(15, "push_jerk"),

  _SINGLE_ARM_DUMBBELL_SNATCH(16, "single_arm_dumbbell_snatch"),

  _SINGLE_ARM_HANG_SNATCH(17, "single_arm_hang_snatch"),

  _SINGLE_ARM_KETTLEBELL_SNATCH(18, "single_arm_kettlebell_snatch"),

  _SPLIT_JERK(19, "split_jerk"),

  _SQUAT_CLEAN_AND_JERK(20, "squat_clean_and_jerk");

  private final int messageNumber;

  private final String messageName;

  OLYMPIC_LIFT_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static OLYMPIC_LIFT_EXERCISE_NAME findById(int messageNumber) {
    for (OLYMPIC_LIFT_EXERCISE_NAME name: OLYMPIC_LIFT_EXERCISE_NAME.values()) {
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
