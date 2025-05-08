// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TOTAL_BODY_EXERCISE_NAME {
  _BURPEE(0, "burpee"),

  _WEIGHTED_BURPEE(1, "weighted_burpee"),

  _BURPEE_BOX_JUMP(2, "burpee_box_jump"),

  _WEIGHTED_BURPEE_BOX_JUMP(3, "weighted_burpee_box_jump"),

  _HIGH_PULL_BURPEE(4, "high_pull_burpee"),

  _MAN_MAKERS(5, "man_makers"),

  _ONE_ARM_BURPEE(6, "one_arm_burpee"),

  _SQUAT_THRUSTS(7, "squat_thrusts"),

  _WEIGHTED_SQUAT_THRUSTS(8, "weighted_squat_thrusts"),

  _SQUAT_PLANK_PUSH_UP(9, "squat_plank_push_up"),

  _WEIGHTED_SQUAT_PLANK_PUSH_UP(10, "weighted_squat_plank_push_up"),

  _STANDING_T_ROTATION_BALANCE(11, "standing_t_rotation_balance"),

  _WEIGHTED_STANDING_T_ROTATION_BALANCE(12, "weighted_standing_t_rotation_balance");

  private final int messageNumber;

  private final String messageName;

  TOTAL_BODY_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static TOTAL_BODY_EXERCISE_NAME findById(int messageNumber) {
    for (TOTAL_BODY_EXERCISE_NAME name: TOTAL_BODY_EXERCISE_NAME.values()) {
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
