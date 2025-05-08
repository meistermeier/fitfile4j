// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum GENDER {
  _FEMALE(0, "female"),

  _MALE(1, "male");

  private final int messageNumber;

  private final String messageName;

  GENDER(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static GENDER findById(int messageNumber) {
    for (GENDER name: GENDER.values()) {
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
