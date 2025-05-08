// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum USER_LOCAL_ID {
  _LOCAL_MIN(0, "local_min"),

  _STATIONARY_MIN(16, "stationary_min"),

  _PORTABLE_MIN(256, "portable_min"),

  _PORTABLE_MAX(65534, "portable_max"),

  _LOCAL_MAX(15, "local_max"),

  _STATIONARY_MAX(255, "stationary_max");

  private final int messageNumber;

  private final String messageName;

  USER_LOCAL_ID(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static USER_LOCAL_ID findById(int messageNumber) {
    for (USER_LOCAL_ID name: USER_LOCAL_ID.values()) {
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
