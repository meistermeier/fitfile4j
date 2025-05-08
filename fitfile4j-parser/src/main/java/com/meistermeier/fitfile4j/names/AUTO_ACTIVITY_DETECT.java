// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum AUTO_ACTIVITY_DETECT {
  _NONE(0, "none"),

  _ELLIPTICAL(32, "elliptical"),

  _SEDENTARY(1024, "sedentary"),

  _RUNNING(1, "running"),

  _CYCLING(2, "cycling"),

  _SWIMMING(4, "swimming"),

  _WALKING(8, "walking");

  private final int messageNumber;

  private final String messageName;

  AUTO_ACTIVITY_DETECT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static AUTO_ACTIVITY_DETECT findById(int messageNumber) {
    for (AUTO_ACTIVITY_DETECT name: AUTO_ACTIVITY_DETECT.values()) {
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
