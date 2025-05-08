// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SHOULDER_STABILITY_EXERCISE_NAME {
  _90_DEGREE_CABLE_EXTERNAL_ROTATION(0, "90_degree_cable_external_rotation"),

  _BAND_EXTERNAL_ROTATION(1, "band_external_rotation"),

  _BAND_INTERNAL_ROTATION(2, "band_internal_rotation"),

  _BENT_ARM_LATERAL_RAISE_AND_EXTERNAL_ROTATION(3, "bent_arm_lateral_raise_and_external_rotation"),

  _CABLE_EXTERNAL_ROTATION(4, "cable_external_rotation"),

  _DUMBBELL_FACE_PULL_WITH_EXTERNAL_ROTATION(5, "dumbbell_face_pull_with_external_rotation"),

  _FLOOR_I_RAISE(6, "floor_i_raise"),

  _WEIGHTED_FLOOR_I_RAISE(7, "weighted_floor_i_raise"),

  _FLOOR_T_RAISE(8, "floor_t_raise"),

  _WEIGHTED_FLOOR_T_RAISE(9, "weighted_floor_t_raise"),

  _FLOOR_Y_RAISE(10, "floor_y_raise"),

  _WEIGHTED_FLOOR_Y_RAISE(11, "weighted_floor_y_raise"),

  _INCLINE_I_RAISE(12, "incline_i_raise"),

  _WEIGHTED_INCLINE_I_RAISE(13, "weighted_incline_i_raise"),

  _INCLINE_L_RAISE(14, "incline_l_raise"),

  _WEIGHTED_INCLINE_L_RAISE(15, "weighted_incline_l_raise"),

  _INCLINE_T_RAISE(16, "incline_t_raise"),

  _WEIGHTED_INCLINE_T_RAISE(17, "weighted_incline_t_raise"),

  _INCLINE_W_RAISE(18, "incline_w_raise"),

  _WEIGHTED_INCLINE_W_RAISE(19, "weighted_incline_w_raise"),

  _INCLINE_Y_RAISE(20, "incline_y_raise"),

  _WEIGHTED_INCLINE_Y_RAISE(21, "weighted_incline_y_raise"),

  _LYING_EXTERNAL_ROTATION(22, "lying_external_rotation"),

  _SEATED_DUMBBELL_EXTERNAL_ROTATION(23, "seated_dumbbell_external_rotation"),

  _STANDING_L_RAISE(24, "standing_l_raise"),

  _SWISS_BALL_I_RAISE(25, "swiss_ball_i_raise"),

  _WEIGHTED_SWISS_BALL_I_RAISE(26, "weighted_swiss_ball_i_raise"),

  _SWISS_BALL_T_RAISE(27, "swiss_ball_t_raise"),

  _WEIGHTED_SWISS_BALL_T_RAISE(28, "weighted_swiss_ball_t_raise"),

  _SWISS_BALL_W_RAISE(29, "swiss_ball_w_raise"),

  _WEIGHTED_SWISS_BALL_W_RAISE(30, "weighted_swiss_ball_w_raise"),

  _SWISS_BALL_Y_RAISE(31, "swiss_ball_y_raise"),

  _WEIGHTED_SWISS_BALL_Y_RAISE(32, "weighted_swiss_ball_y_raise");

  private final int messageNumber;

  private final String messageName;

  SHOULDER_STABILITY_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SHOULDER_STABILITY_EXERCISE_NAME findById(int messageNumber) {
    for (SHOULDER_STABILITY_EXERCISE_NAME name: SHOULDER_STABILITY_EXERCISE_NAME.values()) {
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
