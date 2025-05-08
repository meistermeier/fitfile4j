// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LAP_TRIGGER {
  _MANUAL(0, "manual"),

  _TIME(1, "time"),

  _DISTANCE(2, "distance"),

  _POSITION_START(3, "position_start"),

  _POSITION_LAP(4, "position_lap"),

  _POSITION_WAYPOINT(5, "position_waypoint"),

  _POSITION_MARKED(6, "position_marked"),

  _SESSION_END(7, "session_end"),

  _FITNESS_EQUIPMENT(8, "fitness_equipment");

  private final int messageNumber;

  private final String messageName;

  LAP_TRIGGER(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static LAP_TRIGGER findById(int messageNumber) {
    for (LAP_TRIGGER name: LAP_TRIGGER.values()) {
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
