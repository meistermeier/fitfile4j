// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SUPPORTED_EXD_SCREEN_LAYOUTS {
  _HALF_HORIZONTAL_BOTTOM_SPLIT(16, "half_horizontal_bottom_split"),

  _FULL_QUARTER_SPLIT(32, "full_quarter_split"),

  _HALF_VERTICAL_LEFT_SPLIT(64, "half_vertical_left_split"),

  _HALF_HORIZONTAL_TOP_SPLIT(128, "half_horizontal_top_split"),

  _FULL_SCREEN(1, "full_screen"),

  _HALF_VERTICAL(2, "half_vertical"),

  _HALF_HORIZONTAL(4, "half_horizontal"),

  _HALF_VERTICAL_RIGHT_SPLIT(8, "half_vertical_right_split");

  private final int messageNumber;

  private final String messageName;

  SUPPORTED_EXD_SCREEN_LAYOUTS(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static SUPPORTED_EXD_SCREEN_LAYOUTS findById(int messageNumber) {
    for (SUPPORTED_EXD_SCREEN_LAYOUTS name: SUPPORTED_EXD_SCREEN_LAYOUTS.values()) {
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
