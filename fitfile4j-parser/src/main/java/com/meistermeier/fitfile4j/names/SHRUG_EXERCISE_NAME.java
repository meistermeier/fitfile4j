// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SHRUG_EXERCISE_NAME {
  _BARBELL_JUMP_SHRUG(0, "barbell_jump_shrug"),

  _BARBELL_SHRUG(1, "barbell_shrug"),

  _BARBELL_UPRIGHT_ROW(2, "barbell_upright_row"),

  _BEHIND_THE_BACK_SMITH_MACHINE_SHRUG(3, "behind_the_back_smith_machine_shrug"),

  _DUMBBELL_JUMP_SHRUG(4, "dumbbell_jump_shrug"),

  _DUMBBELL_SHRUG(5, "dumbbell_shrug"),

  _DUMBBELL_UPRIGHT_ROW(6, "dumbbell_upright_row"),

  _INCLINE_DUMBBELL_SHRUG(7, "incline_dumbbell_shrug"),

  _OVERHEAD_BARBELL_SHRUG(8, "overhead_barbell_shrug"),

  _OVERHEAD_DUMBBELL_SHRUG(9, "overhead_dumbbell_shrug"),

  _SCAPTION_AND_SHRUG(10, "scaption_and_shrug"),

  _SCAPULAR_RETRACTION(11, "scapular_retraction"),

  _SERRATUS_CHAIR_SHRUG(12, "serratus_chair_shrug"),

  _WEIGHTED_SERRATUS_CHAIR_SHRUG(13, "weighted_serratus_chair_shrug"),

  _SERRATUS_SHRUG(14, "serratus_shrug"),

  _WEIGHTED_SERRATUS_SHRUG(15, "weighted_serratus_shrug"),

  _WIDE_GRIP_JUMP_SHRUG(16, "wide_grip_jump_shrug");

  private final int messageNumber;

  private final String messageName;

  SHRUG_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SHRUG_EXERCISE_NAME findById(int messageNumber) {
    for (SHRUG_EXERCISE_NAME name: SHRUG_EXERCISE_NAME.values()) {
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
