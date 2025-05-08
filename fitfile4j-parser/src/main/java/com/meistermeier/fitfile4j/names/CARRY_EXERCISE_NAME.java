// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CARRY_EXERCISE_NAME {
  _BAR_HOLDS(0, "bar_holds"),

  _FARMERS_WALK(1, "farmers_walk"),

  _FARMERS_WALK_ON_TOES(2, "farmers_walk_on_toes"),

  _HEX_DUMBBELL_HOLD(3, "hex_dumbbell_hold"),

  _OVERHEAD_CARRY(4, "overhead_carry");

  private final int messageNumber;

  private final String messageName;

  CARRY_EXERCISE_NAME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CARRY_EXERCISE_NAME findById(int messageNumber) {
    for (CARRY_EXERCISE_NAME name: CARRY_EXERCISE_NAME.values()) {
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
