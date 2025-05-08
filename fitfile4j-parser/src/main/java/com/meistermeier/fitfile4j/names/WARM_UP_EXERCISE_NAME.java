// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WARM_UP_EXERCISE_NAME {
  _QUADRUPED_ROCKING(0, "quadruped_rocking"),

  _NECK_TILTS(1, "neck_tilts"),

  _ANKLE_CIRCLES(2, "ankle_circles"),

  _ANKLE_DORSIFLEXION_WITH_BAND(3, "ankle_dorsiflexion_with_band"),

  _ANKLE_INTERNAL_ROTATION(4, "ankle_internal_rotation"),

  _ARM_CIRCLES(5, "arm_circles"),

  _BENT_OVER_REACH_TO_SKY(6, "bent_over_reach_to_sky"),

  _CAT_CAMEL(7, "cat_camel"),

  _ELBOW_TO_FOOT_LUNGE(8, "elbow_to_foot_lunge"),

  _FORWARD_AND_BACKWARD_LEG_SWINGS(9, "forward_and_backward_leg_swings"),

  _GROINERS(10, "groiners"),

  _INVERTED_HAMSTRING_STRETCH(11, "inverted_hamstring_stretch"),

  _LATERAL_DUCK_UNDER(12, "lateral_duck_under"),

  _NECK_ROTATIONS(13, "neck_rotations"),

  _OPPOSITE_ARM_AND_LEG_BALANCE(14, "opposite_arm_and_leg_balance"),

  _REACH_ROLL_AND_LIFT(15, "reach_roll_and_lift"),

  _SCORPION(16, "scorpion"),

  _SHOULDER_CIRCLES(17, "shoulder_circles"),

  _SIDE_TO_SIDE_LEG_SWINGS(18, "side_to_side_leg_swings"),

  _SLEEPER_STRETCH(19, "sleeper_stretch"),

  _SLIDE_OUT(20, "slide_out"),

  _SWISS_BALL_HIP_CROSSOVER(21, "swiss_ball_hip_crossover"),

  _SWISS_BALL_REACH_ROLL_AND_LIFT(22, "swiss_ball_reach_roll_and_lift"),

  _SWISS_BALL_WINDSHIELD_WIPERS(23, "swiss_ball_windshield_wipers"),

  _THORACIC_ROTATION(24, "thoracic_rotation"),

  _WALKING_HIGH_KICKS(25, "walking_high_kicks"),

  _WALKING_HIGH_KNEES(26, "walking_high_knees"),

  _WALKING_KNEE_HUGS(27, "walking_knee_hugs"),

  _WALKING_LEG_CRADLES(28, "walking_leg_cradles"),

  _WALKOUT(29, "walkout"),

  _WALKOUT_FROM_PUSH_UP_POSITION(30, "walkout_from_push_up_position");

  private final int messageNumber;

  private final String messageName;

  WARM_UP_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WARM_UP_EXERCISE_NAME findById(int messageNumber) {
    for (WARM_UP_EXERCISE_NAME name: WARM_UP_EXERCISE_NAME.values()) {
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
