// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE_BITS_2 {
  _LATVIAN(16, "latvian"),

  _UKRAINIAN(32, "ukrainian"),

  _ARABIC(64, "arabic"),

  _FARSI(128, "farsi"),

  _SLOVENIAN(1, "slovenian"),

  _SWEDISH(2, "swedish"),

  _RUSSIAN(4, "russian"),

  _TURKISH(8, "turkish");

  private final int messageNumber;

  private final String messageName;

  LANGUAGE_BITS_2(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LANGUAGE_BITS_2 findById(int messageNumber) {
    for (LANGUAGE_BITS_2 name: LANGUAGE_BITS_2.values()) {
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
