// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LENGTH_TYPE {
  _IDLE(0, "idle"),

  _ACTIVE(1, "active");

  private final int messageNumber;

  private final String messageName;

  LENGTH_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LENGTH_TYPE findById(int messageNumber) {
    for (LENGTH_TYPE name: LENGTH_TYPE.values()) {
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
