// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SHOULDER_PRESS_EXERCISE_NAME {
  _ALTERNATING_DUMBBELL_SHOULDER_PRESS(0, "alternating_dumbbell_shoulder_press"),

  _ARNOLD_PRESS(1, "arnold_press"),

  _BARBELL_FRONT_SQUAT_TO_PUSH_PRESS(2, "barbell_front_squat_to_push_press"),

  _BARBELL_PUSH_PRESS(3, "barbell_push_press"),

  _BARBELL_SHOULDER_PRESS(4, "barbell_shoulder_press"),

  _DEAD_CURL_PRESS(5, "dead_curl_press"),

  _DUMBBELL_ALTERNATING_SHOULDER_PRESS_AND_TWIST(6, "dumbbell_alternating_shoulder_press_and_twist"),

  _DUMBBELL_HAMMER_CURL_TO_LUNGE_TO_PRESS(7, "dumbbell_hammer_curl_to_lunge_to_press"),

  _DUMBBELL_PUSH_PRESS(8, "dumbbell_push_press"),

  _FLOOR_INVERTED_SHOULDER_PRESS(9, "floor_inverted_shoulder_press"),

  _WEIGHTED_FLOOR_INVERTED_SHOULDER_PRESS(10, "weighted_floor_inverted_shoulder_press"),

  _INVERTED_SHOULDER_PRESS(11, "inverted_shoulder_press"),

  _WEIGHTED_INVERTED_SHOULDER_PRESS(12, "weighted_inverted_shoulder_press"),

  _ONE_ARM_PUSH_PRESS(13, "one_arm_push_press"),

  _OVERHEAD_BARBELL_PRESS(14, "overhead_barbell_press"),

  _OVERHEAD_DUMBBELL_PRESS(15, "overhead_dumbbell_press"),

  _SEATED_BARBELL_SHOULDER_PRESS(16, "seated_barbell_shoulder_press"),

  _SEATED_DUMBBELL_SHOULDER_PRESS(17, "seated_dumbbell_shoulder_press"),

  _SINGLE_ARM_DUMBBELL_SHOULDER_PRESS(18, "single_arm_dumbbell_shoulder_press"),

  _SINGLE_ARM_STEP_UP_AND_PRESS(19, "single_arm_step_up_and_press"),

  _SMITH_MACHINE_OVERHEAD_PRESS(20, "smith_machine_overhead_press"),

  _SPLIT_STANCE_HAMMER_CURL_TO_PRESS(21, "split_stance_hammer_curl_to_press"),

  _SWISS_BALL_DUMBBELL_SHOULDER_PRESS(22, "swiss_ball_dumbbell_shoulder_press"),

  _WEIGHT_PLATE_FRONT_RAISE(23, "weight_plate_front_raise");

  private final int messageNumber;

  private final String messageName;

  SHOULDER_PRESS_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SHOULDER_PRESS_EXERCISE_NAME findById(int messageNumber) {
    for (SHOULDER_PRESS_EXERCISE_NAME name: SHOULDER_PRESS_EXERCISE_NAME.values()) {
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
