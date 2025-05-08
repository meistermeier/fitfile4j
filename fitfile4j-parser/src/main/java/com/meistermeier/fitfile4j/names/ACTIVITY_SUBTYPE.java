// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ACTIVITY_SUBTYPE {
  _GENERIC(0, "generic"),

  _TREADMILL(1, "treadmill"),

  _STREET(2, "street"),

  _TRAIL(3, "trail"),

  _TRACK(4, "track"),

  _SPIN(5, "spin"),

  _INDOOR_CYCLING(6, "indoor_cycling"),

  _ROAD(7, "road"),

  _MOUNTAIN(8, "mountain"),

  _DOWNHILL(9, "downhill"),

  _RECUMBENT(10, "recumbent"),

  _CYCLOCROSS(11, "cyclocross"),

  _HAND_CYCLING(12, "hand_cycling"),

  _TRACK_CYCLING(13, "track_cycling"),

  _INDOOR_ROWING(14, "indoor_rowing"),

  _ELLIPTICAL(15, "elliptical"),

  _STAIR_CLIMBING(16, "stair_climbing"),

  _LAP_SWIMMING(17, "lap_swimming"),

  _OPEN_WATER(18, "open_water"),

  _ALL(254, "all");

  private final int messageNumber;

  private final String messageName;

  ACTIVITY_SUBTYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static ACTIVITY_SUBTYPE findById(int messageNumber) {
    for (ACTIVITY_SUBTYPE name: ACTIVITY_SUBTYPE.values()) {
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
