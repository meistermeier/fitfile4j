// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_5 {
  _WATER_SKIING(1, "water_skiing"),

  _KAYAKING(2, "kayaking"),

  _RAFTING(4, "rafting"),

  _WINDSURFING(8, "windsurfing"),

  _KITESURFING(16, "kitesurfing"),

  _TACTICAL(32, "tactical"),

  _JUMPMASTER(64, "jumpmaster"),

  _BOXING(128, "boxing");

  private final int messageNumber;

  private final String messageName;

  SPORT_BITS_5(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SPORT_BITS_5 findById(int messageNumber) {
    for (SPORT_BITS_5 name: SPORT_BITS_5.values()) {
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
