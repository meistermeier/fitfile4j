// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LOCAL_DATE_TIME {
  _MIN(268435456, "min");

  private final int messageNumber;

  private final String messageName;

  LOCAL_DATE_TIME(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LOCAL_DATE_TIME findById(int messageNumber) {
    for (LOCAL_DATE_TIME name: LOCAL_DATE_TIME.values()) {
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
