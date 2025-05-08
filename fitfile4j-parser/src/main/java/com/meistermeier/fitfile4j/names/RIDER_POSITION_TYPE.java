// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum RIDER_POSITION_TYPE {
  _SEATED(0, "seated"),

  _STANDING(1, "standing"),

  _TRANSITION_TO_SEATED(2, "transition_to_seated"),

  _TRANSITION_TO_STANDING(3, "transition_to_standing");

  private final int messageNumber;

  private final String messageName;

  RIDER_POSITION_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static RIDER_POSITION_TYPE findById(int messageNumber) {
    for (RIDER_POSITION_TYPE name: RIDER_POSITION_TYPE.values()) {
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
