// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WORKOUT_HR {
  _BPM_OFFSET(100, "bpm_offset");

  private final int messageNumber;

  private final String messageName;

  WORKOUT_HR(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WORKOUT_HR findById(int messageNumber) {
    for (WORKOUT_HR name: WORKOUT_HR.values()) {
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
