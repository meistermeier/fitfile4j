// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXD_DATA_UNITS {
  _NO_UNITS(0, "no_units"),

  _LAPS(1, "laps"),

  _MILES_PER_HOUR(2, "miles_per_hour"),

  _KILOMETERS_PER_HOUR(3, "kilometers_per_hour"),

  _FEET_PER_HOUR(4, "feet_per_hour"),

  _METERS_PER_HOUR(5, "meters_per_hour"),

  _DEGREES_CELSIUS(6, "degrees_celsius"),

  _DEGREES_FARENHEIT(7, "degrees_farenheit"),

  _ZONE(8, "zone"),

  _GEAR(9, "gear"),

  _RPM(10, "rpm"),

  _BPM(11, "bpm"),

  _DEGREES(12, "degrees"),

  _MILLIMETERS(13, "millimeters"),

  _METERS(14, "meters"),

  _KILOMETERS(15, "kilometers"),

  _FEET(16, "feet"),

  _YARDS(17, "yards"),

  _KILOFEET(18, "kilofeet"),

  _MILES(19, "miles"),

  _TIME(20, "time"),

  _ENUM_TURN_TYPE(21, "enum_turn_type"),

  _PERCENT(22, "percent"),

  _WATTS(23, "watts"),

  _WATTS_PER_KILOGRAM(24, "watts_per_kilogram"),

  _ENUM_BATTERY_STATUS(25, "enum_battery_status"),

  _ENUM_BIKE_LIGHT_BEAM_ANGLE_MODE(26, "enum_bike_light_beam_angle_mode"),

  _ENUM_BIKE_LIGHT_BATTERY_STATUS(27, "enum_bike_light_battery_status"),

  _ENUM_BIKE_LIGHT_NETWORK_CONFIG_TYPE(28, "enum_bike_light_network_config_type"),

  _LIGHTS(29, "lights"),

  _SECONDS(30, "seconds"),

  _MINUTES(31, "minutes"),

  _HOURS(32, "hours"),

  _CALORIES(33, "calories"),

  _KILOJOULES(34, "kilojoules"),

  _MILLISECONDS(35, "milliseconds"),

  _SECOND_PER_MILE(36, "second_per_mile"),

  _SECOND_PER_KILOMETER(37, "second_per_kilometer"),

  _CENTIMETER(38, "centimeter"),

  _ENUM_COURSE_POINT(39, "enum_course_point"),

  _BRADIANS(40, "bradians"),

  _ENUM_SPORT(41, "enum_sport"),

  _INCHES_HG(42, "inches_hg"),

  _MM_HG(43, "mm_hg"),

  _MBARS(44, "mbars"),

  _HECTO_PASCALS(45, "hecto_pascals"),

  _FEET_PER_MIN(46, "feet_per_min"),

  _METERS_PER_MIN(47, "meters_per_min"),

  _METERS_PER_SEC(48, "meters_per_sec"),

  _EIGHT_CARDINAL(49, "eight_cardinal");

  private final int messageNumber;

  private final String messageName;

  EXD_DATA_UNITS(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static EXD_DATA_UNITS findById(int messageNumber) {
    for (EXD_DATA_UNITS name: EXD_DATA_UNITS.values()) {
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
