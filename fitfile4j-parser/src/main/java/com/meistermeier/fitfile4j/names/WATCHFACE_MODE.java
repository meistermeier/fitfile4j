// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WATCHFACE_MODE {
  _DIGITAL(0, "digital"),

  _ANALOG(1, "analog"),

  _CONNECT_IQ(2, "connect_iq"),

  _DISABLED(3, "disabled");

  private final int messageNumber;

  private final String messageName;

  WATCHFACE_MODE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WATCHFACE_MODE findById(int messageNumber) {
    for (WATCHFACE_MODE name: WATCHFACE_MODE.values()) {
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
