// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TIME_MODE {
  _HOUR12(0, "hour12"),

  _HOUR24(1, "hour24"),

  _MILITARY(2, "military"),

  _HOUR_12_WITH_SECONDS(3, "hour_12_with_seconds"),

  _HOUR_24_WITH_SECONDS(4, "hour_24_with_seconds"),

  _UTC(5, "utc");

  private final int messageNumber;

  private final String messageName;

  TIME_MODE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static TIME_MODE findById(int messageNumber) {
    for (TIME_MODE name: TIME_MODE.values()) {
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
