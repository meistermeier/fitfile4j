// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FILE_FLAGS {
  _READ(2, "read"),

  _WRITE(4, "write"),

  _ERASE(8, "erase");

  private final int messageNumber;

  private final String messageName;

  FILE_FLAGS(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static FILE_FLAGS findById(int messageNumber) {
    for (FILE_FLAGS name: FILE_FLAGS.values()) {
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
