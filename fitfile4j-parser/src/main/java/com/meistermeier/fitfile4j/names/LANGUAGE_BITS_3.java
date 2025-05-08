// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE_BITS_3 {
  _KOREAN(16, "korean"),

  _TAIWANESE(32, "taiwanese"),

  _THAI(64, "thai"),

  _HEBREW(128, "hebrew"),

  _BULGARIAN(1, "bulgarian"),

  _ROMANIAN(2, "romanian"),

  _CHINESE(4, "chinese"),

  _JAPANESE(8, "japanese");

  private final int messageNumber;

  private final String messageName;

  LANGUAGE_BITS_3(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LANGUAGE_BITS_3 findById(int messageNumber) {
    for (LANGUAGE_BITS_3 name: LANGUAGE_BITS_3.values()) {
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
