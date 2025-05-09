// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT_BITS_1 {
  _TENNIS(1, "tennis"),

  _AMERICAN_FOOTBALL(2, "american_football"),

  _TRAINING(4, "training"),

  _WALKING(8, "walking"),

  _CROSS_COUNTRY_SKIING(16, "cross_country_skiing"),

  _ALPINE_SKIING(32, "alpine_skiing"),

  _SNOWBOARDING(64, "snowboarding"),

  _ROWING(128, "rowing");

  private final int messageNumber;

  private final String messageName;

  SPORT_BITS_1(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SPORT_BITS_1 findById(int messageNumber) {
    for (SPORT_BITS_1 name: SPORT_BITS_1.values()) {
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
