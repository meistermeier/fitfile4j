package com.meistermeier.fitfile4j.names;

/**
 * Name of messages to be mapped from their ids
 */
public enum MessageName {
  FILE_ID(0, "file_id"),

  CAPABILITIES(1, "capabilities"),

  DEVICE_SETTINGS(2, "device_settings"),

  DIVE_SETTINGS(258, "dive_settings"),

  USER_PROFILE(3, "user_profile"),

  DIVE_GAS(259, "dive_gas"),

  HRM_PROFILE(4, "hrm_profile"),

  SDM_PROFILE(5, "sdm_profile"),

  BIKE_PROFILE(6, "bike_profile"),

  DIVE_ALARM(262, "dive_alarm"),

  ZONES_TARGET(7, "zones_target"),

  HR_ZONE(8, "hr_zone"),

  EXERCISE_TITLE(264, "exercise_title"),

  POWER_ZONE(9, "power_zone"),

  MET_ZONE(10, "met_zone"),

  SPORT(12, "sport"),

  DIVE_SUMMARY(268, "dive_summary"),

  SPO2_DATA(269, "spo2_data"),

  GOAL(15, "goal"),

  SESSION(18, "session"),

  LAP(19, "lap"),

  SLEEP_LEVEL(275, "sleep_level"),

  RECORD(20, "record"),

  EVENT(21, "event"),

  DEVICE_INFO(23, "device_info"),

  WORKOUT(26, "workout"),

  WORKOUT_STEP(27, "workout_step"),

  SCHEDULE(28, "schedule"),

  JUMP(285, "jump"),

  WEIGHT_SCALE(30, "weight_scale"),

  COURSE(31, "course"),

  COURSE_POINT(32, "course_point"),

  TOTALS(33, "totals"),

  AAD_ACCEL_FEATURES(289, "aad_accel_features"),

  ACTIVITY(34, "activity"),

  BEAT_INTERVALS(290, "beat_intervals"),

  SOFTWARE(35, "software"),

  FILE_CAPABILITIES(37, "file_capabilities"),

  MESG_CAPABILITIES(38, "mesg_capabilities"),

  FIELD_CAPABILITIES(39, "field_capabilities"),

  RESPIRATION_RATE(297, "respiration_rate"),

  HSA_ACCELEROMETER_DATA(302, "hsa_accelerometer_data"),

  HSA_STEP_DATA(304, "hsa_step_data"),

  FILE_CREATOR(49, "file_creator"),

  HSA_SPO2_DATA(305, "hsa_spo2_data"),

  HSA_STRESS_DATA(306, "hsa_stress_data"),

  BLOOD_PRESSURE(51, "blood_pressure"),

  HSA_RESPIRATION_DATA(307, "hsa_respiration_data"),

  HSA_HEART_RATE_DATA(308, "hsa_heart_rate_data"),

  SPEED_ZONE(53, "speed_zone"),

  MONITORING(55, "monitoring"),

  SPLIT(312, "split"),

  SPLIT_SUMMARY(313, "split_summary"),

  HSA_BODY_BATTERY_DATA(314, "hsa_body_battery_data"),

  HSA_EVENT(315, "hsa_event"),

  CLIMB_PRO(317, "climb_pro"),

  TANK_UPDATE(319, "tank_update"),

  TANK_SUMMARY(323, "tank_summary"),

  TRAINING_FILE(72, "training_file"),

  HRV(78, "hrv"),

  ANT_RX(80, "ant_rx"),

  ANT_TX(81, "ant_tx"),

  ANT_CHANNEL_ID(82, "ant_channel_id"),

  SLEEP_ASSESSMENT(346, "sleep_assessment"),

  LENGTH(101, "length"),

  MONITORING_INFO(103, "monitoring_info"),

  PAD(105, "pad"),

  SLAVE_DEVICE(106, "slave_device"),

  HRV_STATUS_SUMMARY(370, "hrv_status_summary"),

  HRV_VALUE(371, "hrv_value"),

  RAW_BBI(372, "raw_bbi"),

  DEVICE_AUX_BATTERY_INFO(375, "device_aux_battery_info"),

  HSA_GYROSCOPE_DATA(376, "hsa_gyroscope_data"),

  CONNECTIVITY(127, "connectivity"),

  WEATHER_CONDITIONS(128, "weather_conditions"),

  WEATHER_ALERT(129, "weather_alert"),

  CADENCE_ZONE(131, "cadence_zone"),

  CHRONO_SHOT_SESSION(387, "chrono_shot_session"),

  HR(132, "hr"),

  CHRONO_SHOT_DATA(388, "chrono_shot_data"),

  HSA_CONFIGURATION_DATA(389, "hsa_configuration_data"),

  DIVE_APNEA_ALARM(393, "dive_apnea_alarm"),

  SEGMENT_LAP(142, "segment_lap"),

  SKIN_TEMP_OVERNIGHT(398, "skin_temp_overnight"),

  MEMO_GLOB(145, "memo_glob"),

  SEGMENT_ID(148, "segment_id"),

  SEGMENT_LEADERBOARD_ENTRY(149, "segment_leaderboard_entry"),

  SEGMENT_POINT(150, "segment_point"),

  SEGMENT_FILE(151, "segment_file"),

  HSA_WRIST_TEMPERATURE_DATA(409, "hsa_wrist_temperature_data"),

  WORKOUT_SESSION(158, "workout_session"),

  WATCHFACE_SETTINGS(159, "watchface_settings"),

  GPS_METADATA(160, "gps_metadata"),

  CAMERA_EVENT(161, "camera_event"),

  TIMESTAMP_CORRELATION(162, "timestamp_correlation"),

  GYROSCOPE_DATA(164, "gyroscope_data"),

  ACCELEROMETER_DATA(165, "accelerometer_data"),

  THREE_D_SENSOR_CALIBRATION(167, "three_d_sensor_calibration"),

  VIDEO_FRAME(169, "video_frame"),

  OBDII_DATA(174, "obdii_data"),

  NMEA_SENTENCE(177, "nmea_sentence"),

  AVIATION_ATTITUDE(178, "aviation_attitude"),

  VIDEO(184, "video"),

  VIDEO_TITLE(185, "video_title"),

  VIDEO_DESCRIPTION(186, "video_description"),

  VIDEO_CLIP(187, "video_clip"),

  OHR_SETTINGS(188, "ohr_settings"),

  EXD_SCREEN_CONFIGURATION(200, "exd_screen_configuration"),

  EXD_DATA_FIELD_CONFIGURATION(201, "exd_data_field_configuration"),

  EXD_DATA_CONCEPT_CONFIGURATION(202, "exd_data_concept_configuration"),

  FIELD_DESCRIPTION(206, "field_description"),

  DEVELOPER_DATA_ID(207, "developer_data_id"),

  MAGNETOMETER_DATA(208, "magnetometer_data"),

  BAROMETER_DATA(209, "barometer_data"),

  ONE_D_SENSOR_CALIBRATION(210, "one_d_sensor_calibration"),

  MONITORING_HR_DATA(211, "monitoring_hr_data"),

  TIME_IN_ZONE(216, "time_in_zone"),

  SET(225, "set"),

  STRESS_LEVEL(227, "stress_level"),

  MAX_MET_DATA(229, "max_met_data");

  private final int messageNumber;

  private final String fieldName;

  MessageName(int messageNumber, String fieldName) {
    this.messageNumber = messageNumber;
    this.fieldName = fieldName;
  }

  public static MessageName findById(int messageNumber) {
    for (MessageName name: MessageName.values()) {
    	if (name.messageNumber == messageNumber) {
    		return name;
    	}
    }
    return null;
  }

  public String getFieldName() {
    return this.fieldName;
  }
}
