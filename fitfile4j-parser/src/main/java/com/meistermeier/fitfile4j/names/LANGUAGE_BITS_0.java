// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE_BITS_0 {
  _ENGLISH(1, "english"),

  _FRENCH(2, "french"),

  _ITALIAN(4, "italian"),

  _GERMAN(8, "german"),

  _SPANISH(16, "spanish"),

  _CROATIAN(32, "croatian"),

  _CZECH(64, "czech"),

  _DANISH(128, "danish");

  private final int messageNumber;

  private final String messageName;

  LANGUAGE_BITS_0(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LANGUAGE_BITS_0 findById(int messageNumber) {
    for (LANGUAGE_BITS_0 name: LANGUAGE_BITS_0.values()) {
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
