// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DISPLAY_HEART {
  _BPM(0, "bpm"),

  _MAX(1, "max"),

  _RESERVE(2, "reserve");

  private final int messageNumber;

  private final String messageName;

  DISPLAY_HEART(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static DISPLAY_HEART findById(int messageNumber) {
    for (DISPLAY_HEART name: DISPLAY_HEART.values()) {
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
