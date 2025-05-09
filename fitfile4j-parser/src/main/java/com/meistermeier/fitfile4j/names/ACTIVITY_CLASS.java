// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ACTIVITY_CLASS {
  _LEVEL(127, "level"),

  _LEVEL_MAX(100, "level_max"),

  _ATHLETE(128, "athlete");

  private final int messageNumber;

  private final String messageName;

  ACTIVITY_CLASS(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static ACTIVITY_CLASS findById(int messageNumber) {
    for (ACTIVITY_CLASS name: ACTIVITY_CLASS.values()) {
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
