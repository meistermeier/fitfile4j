// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CHOP_EXERCISE_NAME {
  _CABLE_PULL_THROUGH(0, "cable_pull_through"),

  _CABLE_ROTATIONAL_LIFT(1, "cable_rotational_lift"),

  _CABLE_WOODCHOP(2, "cable_woodchop"),

  _CROSS_CHOP_TO_KNEE(3, "cross_chop_to_knee"),

  _WEIGHTED_CROSS_CHOP_TO_KNEE(4, "weighted_cross_chop_to_knee"),

  _DUMBBELL_CHOP(5, "dumbbell_chop"),

  _HALF_KNEELING_ROTATION(6, "half_kneeling_rotation"),

  _WEIGHTED_HALF_KNEELING_ROTATION(7, "weighted_half_kneeling_rotation"),

  _HALF_KNEELING_ROTATIONAL_CHOP(8, "half_kneeling_rotational_chop"),

  _HALF_KNEELING_ROTATIONAL_REVERSE_CHOP(9, "half_kneeling_rotational_reverse_chop"),

  _HALF_KNEELING_STABILITY_CHOP(10, "half_kneeling_stability_chop"),

  _HALF_KNEELING_STABILITY_REVERSE_CHOP(11, "half_kneeling_stability_reverse_chop"),

  _KNEELING_ROTATIONAL_CHOP(12, "kneeling_rotational_chop"),

  _KNEELING_ROTATIONAL_REVERSE_CHOP(13, "kneeling_rotational_reverse_chop"),

  _KNEELING_STABILITY_CHOP(14, "kneeling_stability_chop"),

  _KNEELING_WOODCHOPPER(15, "kneeling_woodchopper"),

  _MEDICINE_BALL_WOOD_CHOPS(16, "medicine_ball_wood_chops"),

  _POWER_SQUAT_CHOPS(17, "power_squat_chops"),

  _WEIGHTED_POWER_SQUAT_CHOPS(18, "weighted_power_squat_chops"),

  _STANDING_ROTATIONAL_CHOP(19, "standing_rotational_chop"),

  _STANDING_SPLIT_ROTATIONAL_CHOP(20, "standing_split_rotational_chop"),

  _STANDING_SPLIT_ROTATIONAL_REVERSE_CHOP(21, "standing_split_rotational_reverse_chop"),

  _STANDING_STABILITY_REVERSE_CHOP(22, "standing_stability_reverse_chop");

  private final int messageNumber;

  private final String messageName;

  CHOP_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CHOP_EXERCISE_NAME findById(int messageNumber) {
    for (CHOP_EXERCISE_NAME name: CHOP_EXERCISE_NAME.values()) {
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
