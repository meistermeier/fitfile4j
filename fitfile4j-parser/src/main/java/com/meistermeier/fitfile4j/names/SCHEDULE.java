// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SCHEDULE {
  _WORKOUT(0, "workout"),

  _COURSE(1, "course");

  private final int messageNumber;

  private final String messageName;

  SCHEDULE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SCHEDULE findById(int messageNumber) {
    for (SCHEDULE name: SCHEDULE.values()) {
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
