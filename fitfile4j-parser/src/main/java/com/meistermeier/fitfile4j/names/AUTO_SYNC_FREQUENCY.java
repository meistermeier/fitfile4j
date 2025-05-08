// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum AUTO_SYNC_FREQUENCY {
  _NEVER(0, "never"),

  _OCCASIONALLY(1, "occasionally"),

  _FREQUENT(2, "frequent"),

  _ONCE_A_DAY(3, "once_a_day"),

  _REMOTE(4, "remote");

  private final int messageNumber;

  private final String messageName;

  AUTO_SYNC_FREQUENCY(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static AUTO_SYNC_FREQUENCY findById(int messageNumber) {
    for (AUTO_SYNC_FREQUENCY name: AUTO_SYNC_FREQUENCY.values()) {
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
