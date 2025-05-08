// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WEATHER_REPORT {
  _CURRENT(0, "current"),

  _HOURLY_FORECAST(1, "hourly_forecast"),

  _DAILY_FORECAST(2, "daily_forecast");

  private final int messageNumber;

  private final String messageName;

  WEATHER_REPORT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WEATHER_REPORT findById(int messageNumber) {
    for (WEATHER_REPORT name: WEATHER_REPORT.values()) {
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
