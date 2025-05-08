// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE_BITS_1 {
  _NORWEGIAN(16, "norwegian"),

  _POLISH(32, "polish"),

  _PORTUGUESE(64, "portuguese"),

  _SLOVAKIAN(128, "slovakian"),

  _DUTCH(1, "dutch"),

  _FINNISH(2, "finnish"),

  _GREEK(4, "greek"),

  _HUNGARIAN(8, "hungarian");

  private final int messageNumber;

  private final String messageName;

  LANGUAGE_BITS_1(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LANGUAGE_BITS_1 findById(int messageNumber) {
    for (LANGUAGE_BITS_1 name: LANGUAGE_BITS_1.values()) {
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
