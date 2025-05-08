// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BIKE_LIGHT_BEAM_ANGLE_MODE {
  _MANUAL(0, "manual"),

  _AUTO(1, "auto");

  private final int messageNumber;

  private final String messageName;

  BIKE_LIGHT_BEAM_ANGLE_MODE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static BIKE_LIGHT_BEAM_ANGLE_MODE findById(int messageNumber) {
    for (BIKE_LIGHT_BEAM_ANGLE_MODE name: BIKE_LIGHT_BEAM_ANGLE_MODE.values()) {
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
