// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIGITAL_WATCHFACE_LAYOUT {
  _TRADITIONAL(0, "traditional"),

  _MODERN(1, "modern"),

  _BOLD(2, "bold");

  private final int messageNumber;

  private final String messageName;

  DIGITAL_WATCHFACE_LAYOUT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static DIGITAL_WATCHFACE_LAYOUT findById(int messageNumber) {
    for (DIGITAL_WATCHFACE_LAYOUT name: DIGITAL_WATCHFACE_LAYOUT.values()) {
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
