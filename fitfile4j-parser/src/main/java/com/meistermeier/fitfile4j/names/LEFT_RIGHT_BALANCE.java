// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LEFT_RIGHT_BALANCE {
  _RIGHT(128, "right"),

  _MASK(127, "mask");

  private final int messageNumber;

  private final String messageName;

  LEFT_RIGHT_BALANCE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LEFT_RIGHT_BALANCE findById(int messageNumber) {
    for (LEFT_RIGHT_BALANCE name: LEFT_RIGHT_BALANCE.values()) {
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
