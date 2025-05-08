// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPO2_MEASUREMENT_TYPE {
  _OFF_WRIST(0, "off_wrist"),

  _SPOT_CHECK(1, "spot_check"),

  _CONTINUOUS_CHECK(2, "continuous_check"),

  _PERIODIC(3, "periodic");

  private final int messageNumber;

  private final String messageName;

  SPO2_MEASUREMENT_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SPO2_MEASUREMENT_TYPE findById(int messageNumber) {
    for (SPO2_MEASUREMENT_TYPE name: SPO2_MEASUREMENT_TYPE.values()) {
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
