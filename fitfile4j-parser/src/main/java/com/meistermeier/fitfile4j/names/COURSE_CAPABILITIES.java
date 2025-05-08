// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum COURSE_CAPABILITIES {
  _POSITION(16, "position"),

  _HEART_RATE(32, "heart_rate"),

  _POWER(64, "power"),

  _CADENCE(128, "cadence"),

  _TRAINING(256, "training"),

  _NAVIGATION(512, "navigation"),

  _BIKEWAY(1024, "bikeway"),

  _AVIATION(4096, "aviation"),

  _PROCESSED(1, "processed"),

  _VALID(2, "valid"),

  _TIME(4, "time"),

  _DISTANCE(8, "distance");

  private final int messageNumber;

  private final String messageName;

  COURSE_CAPABILITIES(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static COURSE_CAPABILITIES findById(int messageNumber) {
    for (COURSE_CAPABILITIES name: COURSE_CAPABILITIES.values()) {
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
