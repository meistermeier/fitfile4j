// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EVENT {
	_TIMER(0, "timer"),

	_WORKOUT(3, "workout"),

	_WORKOUT_STEP(4, "workout_step"),

	_POWER_DOWN(5, "power_down"),

	_POWER_UP(6, "power_up"),

	_OFF_COURSE(7, "off_course"),

	_SESSION(8, "session"),

	_LAP(9, "lap"),

	_COURSE_POINT(10, "course_point"),

	_BATTERY(11, "battery"),

	_VIRTUAL_PARTNER_PACE(12, "virtual_partner_pace"),

	_HR_HIGH_ALERT(13, "hr_high_alert"),

	_HR_LOW_ALERT(14, "hr_low_alert"),

	_SPEED_HIGH_ALERT(15, "speed_high_alert"),

	_SPEED_LOW_ALERT(16, "speed_low_alert"),

	_CAD_HIGH_ALERT(17, "cad_high_alert"),

	_CAD_LOW_ALERT(18, "cad_low_alert"),

	_POWER_HIGH_ALERT(19, "power_high_alert"),

	_POWER_LOW_ALERT(20, "power_low_alert"),

	_RECOVERY_HR(21, "recovery_hr"),

	_BATTERY_LOW(22, "battery_low"),

	_TIME_DURATION_ALERT(23, "time_duration_alert"),

	_DISTANCE_DURATION_ALERT(24, "distance_duration_alert"),

	_CALORIE_DURATION_ALERT(25, "calorie_duration_alert"),

	_ACTIVITY(26, "activity"),

	_FITNESS_EQUIPMENT(27, "fitness_equipment"),

	_LENGTH(28, "length"),

	_USER_MARKER(32, "user_marker"),

	_SPORT_POINT(33, "sport_point"),

	_CALIBRATION(36, "calibration"),

	_FRONT_GEAR_CHANGE(42, "front_gear_change"),

	_REAR_GEAR_CHANGE(43, "rear_gear_change"),

	_RIDER_POSITION_CHANGE(44, "rider_position_change"),

	_ELEV_HIGH_ALERT(45, "elev_high_alert"),

	_ELEV_LOW_ALERT(46, "elev_low_alert"),

	_COMM_TIMEOUT(47, "comm_timeout"),

	_AUTO_ACTIVITY_DETECT(54, "auto_activity_detect"),

	_DIVE_ALERT(56, "dive_alert"),

	_DIVE_GAS_SWITCHED(57, "dive_gas_switched"),

	_TANK_PRESSURE_RESERVE(71, "tank_pressure_reserve"),

	_TANK_PRESSURE_CRITICAL(72, "tank_pressure_critical"),

	_TANK_LOST(73, "tank_lost"),

	_RADAR_THREAT_ALERT(75, "radar_threat_alert"),

	_TANK_BATTERY_LOW(76, "tank_battery_low"),

	_TANK_POD_CONNECTED(81, "tank_pod_connected"),

	_TANK_POD_DISCONNECTED(82, "tank_pod_disconnected");

	private final int messageNumber;

	private final String messageName;

	EVENT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EVENT findById(int messageNumber) {
		for (EVENT name: EVENT.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public Integer getMessageNumber() {
		return this.messageNumber;
	}

	public String getMessageName() {
		return this.messageName;
	}
}
