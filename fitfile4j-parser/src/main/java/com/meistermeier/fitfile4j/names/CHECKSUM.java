// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CHECKSUM {
  _CLEAR(0, "clear"),

  _OK(1, "ok");

  private final int messageNumber;

  private final String messageName;

  CHECKSUM(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CHECKSUM findById(int messageNumber) {
    for (CHECKSUM name: CHECKSUM.values()) {
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
