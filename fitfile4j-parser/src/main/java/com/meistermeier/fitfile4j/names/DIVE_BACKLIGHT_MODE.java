// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIVE_BACKLIGHT_MODE {
  _AT_DEPTH(0, "at_depth"),

  _ALWAYS_ON(1, "always_on");

  private final int messageNumber;

  private final String messageName;

  DIVE_BACKLIGHT_MODE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static DIVE_BACKLIGHT_MODE findById(int messageNumber) {
    for (DIVE_BACKLIGHT_MODE name: DIVE_BACKLIGHT_MODE.values()) {
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
