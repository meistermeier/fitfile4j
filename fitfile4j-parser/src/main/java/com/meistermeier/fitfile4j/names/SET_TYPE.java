// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SET_TYPE {
  _REST(0, "rest"),

  _ACTIVE(1, "active");

  private final int messageNumber;

  private final String messageName;

  SET_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SET_TYPE findById(int messageNumber) {
    for (SET_TYPE name: SET_TYPE.values()) {
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
