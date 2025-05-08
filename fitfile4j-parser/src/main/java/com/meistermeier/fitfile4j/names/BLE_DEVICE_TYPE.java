// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BLE_DEVICE_TYPE {
  _CONNECTED_GPS(0, "connected_gps"),

  _HEART_RATE(1, "heart_rate"),

  _BIKE_POWER(2, "bike_power"),

  _BIKE_SPEED_CADENCE(3, "bike_speed_cadence"),

  _BIKE_SPEED(4, "bike_speed"),

  _BIKE_CADENCE(5, "bike_cadence"),

  _FOOTPOD(6, "footpod"),

  _BIKE_TRAINER(7, "bike_trainer");

  private final int messageNumber;

  private final String messageName;

  BLE_DEVICE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static BLE_DEVICE_TYPE findById(int messageNumber) {
    for (BLE_DEVICE_TYPE name: BLE_DEVICE_TYPE.values()) {
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
