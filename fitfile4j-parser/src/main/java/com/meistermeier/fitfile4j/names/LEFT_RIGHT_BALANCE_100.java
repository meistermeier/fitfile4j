// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LEFT_RIGHT_BALANCE_100 {
  _RIGHT(32768, "right"),

  _MASK(16383, "mask");

  private final int messageNumber;

  private final String messageName;

  LEFT_RIGHT_BALANCE_100(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LEFT_RIGHT_BALANCE_100 findById(int messageNumber) {
    for (LEFT_RIGHT_BALANCE_100 name: LEFT_RIGHT_BALANCE_100.values()) {
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
