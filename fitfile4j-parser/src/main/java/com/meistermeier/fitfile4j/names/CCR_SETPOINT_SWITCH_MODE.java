// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CCR_SETPOINT_SWITCH_MODE {
  _MANUAL(0, "manual"),

  _AUTOMATIC(1, "automatic");

  private final int messageNumber;

  private final String messageName;

  CCR_SETPOINT_SWITCH_MODE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CCR_SETPOINT_SWITCH_MODE findById(int messageNumber) {
    for (CCR_SETPOINT_SWITCH_MODE name: CCR_SETPOINT_SWITCH_MODE.values()) {
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
