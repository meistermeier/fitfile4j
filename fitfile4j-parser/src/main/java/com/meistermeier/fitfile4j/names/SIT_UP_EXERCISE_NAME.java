// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SIT_UP_EXERCISE_NAME {
  _ALTERNATING_SIT_UP(0, "alternating_sit_up"),

  _WEIGHTED_ALTERNATING_SIT_UP(1, "weighted_alternating_sit_up"),

  _BENT_KNEE_V_UP(2, "bent_knee_v_up"),

  _WEIGHTED_BENT_KNEE_V_UP(3, "weighted_bent_knee_v_up"),

  _BUTTERFLY_SIT_UP(4, "butterfly_sit_up"),

  _WEIGHTED_BUTTERFLY_SITUP(5, "weighted_butterfly_situp"),

  _CROSS_PUNCH_ROLL_UP(6, "cross_punch_roll_up"),

  _WEIGHTED_CROSS_PUNCH_ROLL_UP(7, "weighted_cross_punch_roll_up"),

  _CROSSED_ARMS_SIT_UP(8, "crossed_arms_sit_up"),

  _WEIGHTED_CROSSED_ARMS_SIT_UP(9, "weighted_crossed_arms_sit_up"),

  _GET_UP_SIT_UP(10, "get_up_sit_up"),

  _WEIGHTED_GET_UP_SIT_UP(11, "weighted_get_up_sit_up"),

  _HOVERING_SIT_UP(12, "hovering_sit_up"),

  _WEIGHTED_HOVERING_SIT_UP(13, "weighted_hovering_sit_up"),

  _KETTLEBELL_SIT_UP(14, "kettlebell_sit_up"),

  _MEDICINE_BALL_ALTERNATING_V_UP(15, "medicine_ball_alternating_v_up"),

  _MEDICINE_BALL_SIT_UP(16, "medicine_ball_sit_up"),

  _MEDICINE_BALL_V_UP(17, "medicine_ball_v_up"),

  _MODIFIED_SIT_UP(18, "modified_sit_up"),

  _NEGATIVE_SIT_UP(19, "negative_sit_up"),

  _ONE_ARM_FULL_SIT_UP(20, "one_arm_full_sit_up"),

  _RECLINING_CIRCLE(21, "reclining_circle"),

  _WEIGHTED_RECLINING_CIRCLE(22, "weighted_reclining_circle"),

  _REVERSE_CURL_UP(23, "reverse_curl_up"),

  _WEIGHTED_REVERSE_CURL_UP(24, "weighted_reverse_curl_up"),

  _SINGLE_LEG_SWISS_BALL_JACKKNIFE(25, "single_leg_swiss_ball_jackknife"),

  _WEIGHTED_SINGLE_LEG_SWISS_BALL_JACKKNIFE(26, "weighted_single_leg_swiss_ball_jackknife"),

  _THE_TEASER(27, "the_teaser"),

  _THE_TEASER_WEIGHTED(28, "the_teaser_weighted"),

  _THREE_PART_ROLL_DOWN(29, "three_part_roll_down"),

  _WEIGHTED_THREE_PART_ROLL_DOWN(30, "weighted_three_part_roll_down"),

  _V_UP(31, "v_up"),

  _WEIGHTED_V_UP(32, "weighted_v_up"),

  _WEIGHTED_RUSSIAN_TWIST_ON_SWISS_BALL(33, "weighted_russian_twist_on_swiss_ball"),

  _WEIGHTED_SIT_UP(34, "weighted_sit_up"),

  _X_ABS(35, "x_abs"),

  _WEIGHTED_X_ABS(36, "weighted_x_abs"),

  _SIT_UP(37, "sit_up");

  private final int messageNumber;

  private final String messageName;

  SIT_UP_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SIT_UP_EXERCISE_NAME findById(int messageNumber) {
    for (SIT_UP_EXERCISE_NAME name: SIT_UP_EXERCISE_NAME.values()) {
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
