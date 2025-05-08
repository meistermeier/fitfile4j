// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum GAS_CONSUMPTION_RATE_TYPE {
  _PRESSURE_SAC(0, "pressure_sac"),

  _VOLUME_SAC(1, "volume_sac"),

  _RMV(2, "rmv");

  private final int messageNumber;

  private final String messageName;

  GAS_CONSUMPTION_RATE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static GAS_CONSUMPTION_RATE_TYPE findById(int messageNumber) {
    for (GAS_CONSUMPTION_RATE_TYPE name: GAS_CONSUMPTION_RATE_TYPE.values()) {
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
