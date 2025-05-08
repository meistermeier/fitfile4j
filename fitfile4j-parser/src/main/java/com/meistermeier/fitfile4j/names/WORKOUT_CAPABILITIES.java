// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_CAPABILITIES {
  _SPEED(128, "speed"),

  _HEART_RATE(256, "heart_rate"),

  _DISTANCE(512, "distance"),

  _CADENCE(1024, "cadence"),

  _POWER(2048, "power"),

  _GRADE(4096, "grade"),

  _RESISTANCE(8192, "resistance"),

  _PROTECTED(16384, "protected"),

  _INTERVAL(1, "interval"),

  _CUSTOM(2, "custom"),

  _FITNESS_EQUIPMENT(4, "fitness_equipment"),

  _FIRSTBEAT(8, "firstbeat"),

  _NEW_LEAF(16, "new_leaf"),

  _TCX(32, "tcx");

  private final int messageNumber;

  private final String messageName;

  WORKOUT_CAPABILITIES(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WORKOUT_CAPABILITIES findById(int messageNumber) {
    for (WORKOUT_CAPABILITIES name: WORKOUT_CAPABILITIES.values()) {
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
