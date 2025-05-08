// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CAMERA_ORIENTATION_TYPE {
  _CAMERA_ORIENTATION_0(0, "camera_orientation_0"),

  _CAMERA_ORIENTATION_90(1, "camera_orientation_90"),

  _CAMERA_ORIENTATION_180(2, "camera_orientation_180"),

  _CAMERA_ORIENTATION_270(3, "camera_orientation_270");

  private final int messageNumber;

  private final String messageName;

  CAMERA_ORIENTATION_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CAMERA_ORIENTATION_TYPE findById(int messageNumber) {
    for (CAMERA_ORIENTATION_TYPE name: CAMERA_ORIENTATION_TYPE.values()) {
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
