// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_POWER {
  _WATTS_OFFSET(1000, "watts_offset");

  private final int messageNumber;

  private final String messageName;

  WORKOUT_POWER(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WORKOUT_POWER findById(int messageNumber) {
    for (WORKOUT_POWER name: WORKOUT_POWER.values()) {
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
