// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum MAX_MET_CATEGORY {
  _GENERIC(0, "generic"),

  _CYCLING(1, "cycling");

  private final int messageNumber;

  private final String messageName;

  MAX_MET_CATEGORY(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static MAX_MET_CATEGORY findById(int messageNumber) {
    for (MAX_MET_CATEGORY name: MAX_MET_CATEGORY.values()) {
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
