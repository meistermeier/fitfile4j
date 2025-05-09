// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_CAPABILITIES {
  _INTERVAL(1L, "interval"),

  _CUSTOM(2L, "custom"),

  _FITNESS_EQUIPMENT(4L, "fitness_equipment"),

  _FIRSTBEAT(8L, "firstbeat"),

  _NEW_LEAF(16L, "new_leaf"),

  _TCX(32L, "tcx"),

  _SPEED(128L, "speed"),

  _HEART_RATE(256L, "heart_rate"),

  _DISTANCE(512L, "distance"),

  _CADENCE(1024L, "cadence"),

  _POWER(2048L, "power"),

  _GRADE(4096L, "grade"),

  _RESISTANCE(8192L, "resistance"),

  _PROTECTED(16384L, "protected");

  private final long messageNumber;

  private final String messageName;

  WORKOUT_CAPABILITIES(long messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WORKOUT_CAPABILITIES findById(long messageNumber) {
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
