// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum ANTPLUS_DEVICE_TYPE {

	_ANTFS(1, "antfs"),

	_BIKE_POWER(11, "bike_power"),

	_ENVIRONMENT_SENSOR_LEGACY(12, "environment_sensor_legacy"),

	_MULTI_SPORT_SPEED_DISTANCE(15, "multi_sport_speed_distance"),

	_CONTROL(16, "control"),

	_FITNESS_EQUIPMENT(17, "fitness_equipment"),

	_BLOOD_PRESSURE(18, "blood_pressure"),

	_GEOCACHE_NODE(19, "geocache_node"),

	_LIGHT_ELECTRIC_VEHICLE(20, "light_electric_vehicle"),

	_ENV_SENSOR(25, "env_sensor"),

	_RACQUET(26, "racquet"),

	_CONTROL_HUB(27, "control_hub"),

	_MUSCLE_OXYGEN(31, "muscle_oxygen"),

	_SHIFTING(34, "shifting"),

	_BIKE_LIGHT_MAIN(35, "bike_light_main"),

	_BIKE_LIGHT_SHARED(36, "bike_light_shared"),

	_EXD(38, "exd"),

	_BIKE_RADAR(40, "bike_radar"),

	_BIKE_AERO(46, "bike_aero"),

	_WEIGHT_SCALE(119, "weight_scale"),

	_HEART_RATE(120, "heart_rate"),

	_BIKE_SPEED_CADENCE(121, "bike_speed_cadence"),

	_BIKE_CADENCE(122, "bike_cadence"),

	_BIKE_SPEED(123, "bike_speed"),

	_STRIDE_SPEED_DISTANCE(124, "stride_speed_distance");

	private final int messageNumber;

	private final String messageName;

	ANTPLUS_DEVICE_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static ANTPLUS_DEVICE_TYPE findById(int messageNumber) {
		for (ANTPLUS_DEVICE_TYPE name : ANTPLUS_DEVICE_TYPE.values()) {
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
