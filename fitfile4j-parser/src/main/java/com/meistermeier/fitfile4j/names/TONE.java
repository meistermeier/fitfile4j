// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TONE {
  _OFF(0, "off"),

  _TONE(1, "tone"),

  _VIBRATE(2, "vibrate"),

  _TONE_AND_VIBRATE(3, "tone_and_vibrate");

  private final int messageNumber;

  private final String messageName;

  TONE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static TONE findById(int messageNumber) {
    for (TONE name: TONE.values()) {
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
