// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LOCAL_DEVICE_TYPE {
  _GPS(0, "gps"),

  _GLONASS(1, "glonass"),

  _GPS_GLONASS(2, "gps_glonass"),

  _ACCELEROMETER(3, "accelerometer"),

  _BAROMETER(4, "barometer"),

  _TEMPERATURE(5, "temperature"),

  _WHR(10, "whr"),

  _SENSOR_HUB(12, "sensor_hub");

  private final int messageNumber;

  private final String messageName;

  LOCAL_DEVICE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LOCAL_DEVICE_TYPE findById(int messageNumber) {
    for (LOCAL_DEVICE_TYPE name: LOCAL_DEVICE_TYPE.values()) {
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
