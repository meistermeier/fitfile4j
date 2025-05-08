// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum AUTOSCROLL {
  _NONE(0, "none"),

  _SLOW(1, "slow"),

  _MEDIUM(2, "medium"),

  _FAST(3, "fast");

  private final int messageNumber;

  private final String messageName;

  AUTOSCROLL(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static AUTOSCROLL findById(int messageNumber) {
    for (AUTOSCROLL name: AUTOSCROLL.values()) {
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
