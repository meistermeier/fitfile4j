// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXD_DESCRIPTORS {

	_BIKE_LIGHT_BATTERY_STATUS(0, "bike_light_battery_status"),

	_BEAM_ANGLE_STATUS(1, "beam_angle_status"),

	_BATERY_LEVEL(2, "batery_level"),

	_LIGHT_NETWORK_MODE(3, "light_network_mode"),

	_NUMBER_LIGHTS_CONNECTED(4, "number_lights_connected"),

	_CADENCE(5, "cadence"),

	_DISTANCE(6, "distance"),

	_ESTIMATED_TIME_OF_ARRIVAL(7, "estimated_time_of_arrival"),

	_HEADING(8, "heading"),

	_TIME(9, "time"),

	_BATTERY_LEVEL(10, "battery_level"),

	_TRAINER_RESISTANCE(11, "trainer_resistance"),

	_TRAINER_TARGET_POWER(12, "trainer_target_power"),

	_TIME_SEATED(13, "time_seated"),

	_TIME_STANDING(14, "time_standing"),

	_ELEVATION(15, "elevation"),

	_GRADE(16, "grade"),

	_ASCENT(17, "ascent"),

	_DESCENT(18, "descent"),

	_VERTICAL_SPEED(19, "vertical_speed"),

	_DI2_BATTERY_LEVEL(20, "di2_battery_level"),

	_FRONT_GEAR(21, "front_gear"),

	_REAR_GEAR(22, "rear_gear"),

	_GEAR_RATIO(23, "gear_ratio"),

	_HEART_RATE(24, "heart_rate"),

	_HEART_RATE_ZONE(25, "heart_rate_zone"),

	_TIME_IN_HEART_RATE_ZONE(26, "time_in_heart_rate_zone"),

	_HEART_RATE_RESERVE(27, "heart_rate_reserve"),

	_CALORIES(28, "calories"),

	_GPS_ACCURACY(29, "gps_accuracy"),

	_GPS_SIGNAL_STRENGTH(30, "gps_signal_strength"),

	_TEMPERATURE(31, "temperature"),

	_TIME_OF_DAY(32, "time_of_day"),

	_BALANCE(33, "balance"),

	_PEDAL_SMOOTHNESS(34, "pedal_smoothness"),

	_POWER(35, "power"),

	_FUNCTIONAL_THRESHOLD_POWER(36, "functional_threshold_power"),

	_INTENSITY_FACTOR(37, "intensity_factor"),

	_WORK(38, "work"),

	_POWER_RATIO(39, "power_ratio"),

	_NORMALIZED_POWER(40, "normalized_power"),

	_TRAINING_STRESS_SCORE(41, "training_stress_Score"),

	_TIME_ON_ZONE(42, "time_on_zone"),

	_SPEED(43, "speed"),

	_LAPS(44, "laps"),

	_REPS(45, "reps"),

	_WORKOUT_STEP(46, "workout_step"),

	_COURSE_DISTANCE(47, "course_distance"),

	_NAVIGATION_DISTANCE(48, "navigation_distance"),

	_COURSE_ESTIMATED_TIME_OF_ARRIVAL(49, "course_estimated_time_of_arrival"),

	_NAVIGATION_ESTIMATED_TIME_OF_ARRIVAL(50, "navigation_estimated_time_of_arrival"),

	_COURSE_TIME(51, "course_time"),

	_NAVIGATION_TIME(52, "navigation_time"),

	_COURSE_HEADING(53, "course_heading"),

	_NAVIGATION_HEADING(54, "navigation_heading"),

	_POWER_ZONE(55, "power_zone"),

	_TORQUE_EFFECTIVENESS(56, "torque_effectiveness"),

	_TIMER_TIME(57, "timer_time"),

	_POWER_WEIGHT_RATIO(58, "power_weight_ratio"),

	_LEFT_PLATFORM_CENTER_OFFSET(59, "left_platform_center_offset"),

	_RIGHT_PLATFORM_CENTER_OFFSET(60, "right_platform_center_offset"),

	_LEFT_POWER_PHASE_START_ANGLE(61, "left_power_phase_start_angle"),

	_RIGHT_POWER_PHASE_START_ANGLE(62, "right_power_phase_start_angle"),

	_LEFT_POWER_PHASE_FINISH_ANGLE(63, "left_power_phase_finish_angle"),

	_RIGHT_POWER_PHASE_FINISH_ANGLE(64, "right_power_phase_finish_angle"),

	_GEARS(65, "gears"),

	_PACE(66, "pace"),

	_TRAINING_EFFECT(67, "training_effect"),

	_VERTICAL_OSCILLATION(68, "vertical_oscillation"),

	_VERTICAL_RATIO(69, "vertical_ratio"),

	_GROUND_CONTACT_TIME(70, "ground_contact_time"),

	_LEFT_GROUND_CONTACT_TIME_BALANCE(71, "left_ground_contact_time_balance"),

	_RIGHT_GROUND_CONTACT_TIME_BALANCE(72, "right_ground_contact_time_balance"),

	_STRIDE_LENGTH(73, "stride_length"),

	_RUNNING_CADENCE(74, "running_cadence"),

	_PERFORMANCE_CONDITION(75, "performance_condition"),

	_COURSE_TYPE(76, "course_type"),

	_TIME_IN_POWER_ZONE(77, "time_in_power_zone"),

	_NAVIGATION_TURN(78, "navigation_turn"),

	_COURSE_LOCATION(79, "course_location"),

	_NAVIGATION_LOCATION(80, "navigation_location"),

	_COMPASS(81, "compass"),

	_GEAR_COMBO(82, "gear_combo"),

	_MUSCLE_OXYGEN(83, "muscle_oxygen"),

	_ICON(84, "icon"),

	_COMPASS_HEADING(85, "compass_heading"),

	_GPS_HEADING(86, "gps_heading"),

	_GPS_ELEVATION(87, "gps_elevation"),

	_ANAEROBIC_TRAINING_EFFECT(88, "anaerobic_training_effect"),

	_COURSE(89, "course"),

	_OFF_COURSE(90, "off_course"),

	_GLIDE_RATIO(91, "glide_ratio"),

	_VERTICAL_DISTANCE(92, "vertical_distance"),

	_VMG(93, "vmg"),

	_AMBIENT_PRESSURE(94, "ambient_pressure"),

	_PRESSURE(95, "pressure"),

	_VAM(96, "vam");

	private final int messageNumber;

	private final String messageName;

	EXD_DESCRIPTORS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EXD_DESCRIPTORS findById(int messageNumber) {
		for (EXD_DESCRIPTORS name : EXD_DESCRIPTORS.values()) {
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
