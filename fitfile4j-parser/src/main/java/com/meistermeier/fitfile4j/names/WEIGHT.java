// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WEIGHT {
  _CALCULATING(65534, "calculating");

  private final int messageNumber;

  private final String messageName;

  WEIGHT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WEIGHT findById(int messageNumber) {
    for (WEIGHT name: WEIGHT.values()) {
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
