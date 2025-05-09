// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ANT_CHANNEL_ID {
  _ANT_EXTENDED_DEVICE_NUMBER_UPPER_NIBBLE(4026531840L, "ant_extended_device_number_upper_nibble"),

  _ANT_TRANSMISSION_TYPE_LOWER_NIBBLE(251658240L, "ant_transmission_type_lower_nibble"),

  _ANT_DEVICE_TYPE(16711680L, "ant_device_type"),

  _ANT_DEVICE_NUMBER(65535L, "ant_device_number");

  private final long messageNumber;

  private final String messageName;

  ANT_CHANNEL_ID(long messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static ANT_CHANNEL_ID findById(long messageNumber) {
    for (ANT_CHANNEL_ID name: ANT_CHANNEL_ID.values()) {
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
