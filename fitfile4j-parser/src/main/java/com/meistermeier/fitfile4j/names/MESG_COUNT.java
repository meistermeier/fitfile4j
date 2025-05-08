// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum MESG_COUNT {
  _NUM_PER_FILE(0, "num_per_file"),

  _MAX_PER_FILE(1, "max_per_file"),

  _MAX_PER_FILE_TYPE(2, "max_per_file_type");

  private final int messageNumber;

  private final String messageName;

  MESG_COUNT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static MESG_COUNT findById(int messageNumber) {
    for (MESG_COUNT name: MESG_COUNT.values()) {
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
