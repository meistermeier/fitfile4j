// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CURL_EXERCISE_NAME {
  _ALTERNATING_DUMBBELL_BICEPS_CURL(0, "alternating_dumbbell_biceps_curl"),

  _ALTERNATING_DUMBBELL_BICEPS_CURL_ON_SWISS_BALL(1, "alternating_dumbbell_biceps_curl_on_swiss_ball"),

  _ALTERNATING_INCLINE_DUMBBELL_BICEPS_CURL(2, "alternating_incline_dumbbell_biceps_curl"),

  _BARBELL_BICEPS_CURL(3, "barbell_biceps_curl"),

  _BARBELL_REVERSE_WRIST_CURL(4, "barbell_reverse_wrist_curl"),

  _BARBELL_WRIST_CURL(5, "barbell_wrist_curl"),

  _BEHIND_THE_BACK_BARBELL_REVERSE_WRIST_CURL(6, "behind_the_back_barbell_reverse_wrist_curl"),

  _BEHIND_THE_BACK_ONE_ARM_CABLE_CURL(7, "behind_the_back_one_arm_cable_curl"),

  _CABLE_BICEPS_CURL(8, "cable_biceps_curl"),

  _CABLE_HAMMER_CURL(9, "cable_hammer_curl"),

  _CHEATING_BARBELL_BICEPS_CURL(10, "cheating_barbell_biceps_curl"),

  _CLOSE_GRIP_EZ_BAR_BICEPS_CURL(11, "close_grip_ez_bar_biceps_curl"),

  _CROSS_BODY_DUMBBELL_HAMMER_CURL(12, "cross_body_dumbbell_hammer_curl"),

  _DEAD_HANG_BICEPS_CURL(13, "dead_hang_biceps_curl"),

  _DECLINE_HAMMER_CURL(14, "decline_hammer_curl"),

  _DUMBBELL_BICEPS_CURL_WITH_STATIC_HOLD(15, "dumbbell_biceps_curl_with_static_hold"),

  _DUMBBELL_HAMMER_CURL(16, "dumbbell_hammer_curl"),

  _DUMBBELL_REVERSE_WRIST_CURL(17, "dumbbell_reverse_wrist_curl"),

  _DUMBBELL_WRIST_CURL(18, "dumbbell_wrist_curl"),

  _EZ_BAR_PREACHER_CURL(19, "ez_bar_preacher_curl"),

  _FORWARD_BEND_BICEPS_CURL(20, "forward_bend_biceps_curl"),

  _HAMMER_CURL_TO_PRESS(21, "hammer_curl_to_press"),

  _INCLINE_DUMBBELL_BICEPS_CURL(22, "incline_dumbbell_biceps_curl"),

  _INCLINE_OFFSET_THUMB_DUMBBELL_CURL(23, "incline_offset_thumb_dumbbell_curl"),

  _KETTLEBELL_BICEPS_CURL(24, "kettlebell_biceps_curl"),

  _LYING_CONCENTRATION_CABLE_CURL(25, "lying_concentration_cable_curl"),

  _ONE_ARM_PREACHER_CURL(26, "one_arm_preacher_curl"),

  _PLATE_PINCH_CURL(27, "plate_pinch_curl"),

  _PREACHER_CURL_WITH_CABLE(28, "preacher_curl_with_cable"),

  _REVERSE_EZ_BAR_CURL(29, "reverse_ez_bar_curl"),

  _REVERSE_GRIP_WRIST_CURL(30, "reverse_grip_wrist_curl"),

  _REVERSE_GRIP_BARBELL_BICEPS_CURL(31, "reverse_grip_barbell_biceps_curl"),

  _SEATED_ALTERNATING_DUMBBELL_BICEPS_CURL(32, "seated_alternating_dumbbell_biceps_curl"),

  _SEATED_DUMBBELL_BICEPS_CURL(33, "seated_dumbbell_biceps_curl"),

  _SEATED_REVERSE_DUMBBELL_CURL(34, "seated_reverse_dumbbell_curl"),

  _SPLIT_STANCE_OFFSET_PINKY_DUMBBELL_CURL(35, "split_stance_offset_pinky_dumbbell_curl"),

  _STANDING_ALTERNATING_DUMBBELL_CURLS(36, "standing_alternating_dumbbell_curls"),

  _STANDING_DUMBBELL_BICEPS_CURL(37, "standing_dumbbell_biceps_curl"),

  _STANDING_EZ_BAR_BICEPS_CURL(38, "standing_ez_bar_biceps_curl"),

  _STATIC_CURL(39, "static_curl"),

  _SWISS_BALL_DUMBBELL_OVERHEAD_TRICEPS_EXTENSION(40, "swiss_ball_dumbbell_overhead_triceps_extension"),

  _SWISS_BALL_EZ_BAR_PREACHER_CURL(41, "swiss_ball_ez_bar_preacher_curl"),

  _TWISTING_STANDING_DUMBBELL_BICEPS_CURL(42, "twisting_standing_dumbbell_biceps_curl"),

  _WIDE_GRIP_EZ_BAR_BICEPS_CURL(43, "wide_grip_ez_bar_biceps_curl");

  private final int messageNumber;

  private final String messageName;

  CURL_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CURL_EXERCISE_NAME findById(int messageNumber) {
    for (CURL_EXERCISE_NAME name: CURL_EXERCISE_NAME.values()) {
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
