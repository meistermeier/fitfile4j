// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CONNECTIVITY_CAPABILITIES {
  _CONNECT_IQ_APP_DOWNLOAD(8192, "connect_iq_app_download"),

  _GPS_EPHEMERIS_DOWNLOAD(512, "gps_ephemeris_download"),

  _LIVE_TRACK(64, "live_track"),

  _INSTANT_INPUT(2147483648L, "instant_input"),

  _WEATHER_CONDITIONS(128, "weather_conditions"),

  _WEATHER_ALERTS(256, "weather_alerts"),

  _EXPLICIT_ARCHIVE(1024, "explicit_archive"),

  _SETUP_INCOMPLETE(2048, "setup_incomplete"),

  _CONTINUE_SYNC_AFTER_SOFTWARE_UPDATE(4096, "continue_sync_after_software_update"),

  _GOLF_COURSE_DOWNLOAD(16384, "golf_course_download"),

  _DEVICE_INITIATES_SYNC(32768, "device_initiates_sync"),

  _SWING_SENSOR_REMOTE(4194304, "swing_sensor_remote"),

  _INCIDENT_DETECTION(8388608, "incident_detection"),

  _AUDIO_PROMPTS(16777216, "audio_prompts"),

  _WIFI_VERIFICATION(33554432, "wifi_verification"),

  _TRUE_UP(67108864, "true_up"),

  _FIND_MY_WATCH(134217728, "find_my_watch"),

  _REMOTE_MANUAL_SYNC(268435456, "remote_manual_sync"),

  _LIVE_TRACK_AUTO_START(536870912, "live_track_auto_start"),

  _LIVE_TRACK_MESSAGING(1073741824, "live_track_messaging"),

  _BLUETOOTH(1, "bluetooth"),

  _CONNECT_IQ_WATCH_APP_DOWNLOAD(65536, "connect_iq_watch_app_download"),

  _BLUETOOTH_LE(2, "bluetooth_le"),

  _CONNECT_IQ_WIDGET_DOWNLOAD(131072, "connect_iq_widget_download"),

  _ANT(4, "ant"),

  _CONNECT_IQ_WATCH_FACE_DOWNLOAD(262144, "connect_iq_watch_face_download"),

  _ACTIVITY_UPLOAD(8, "activity_upload"),

  _CONNECT_IQ_DATA_FIELD_DOWNLOAD(524288, "connect_iq_data_field_download"),

  _COURSE_DOWNLOAD(16, "course_download"),

  _CONNECT_IQ_APP_MANAGMENT(1048576, "connect_iq_app_managment"),

  _WORKOUT_DOWNLOAD(32, "workout_download"),

  _SWING_SENSOR(2097152, "swing_sensor");

  private final long messageNumber;

  private final String messageName;

  CONNECTIVITY_CAPABILITIES(long messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CONNECTIVITY_CAPABILITIES findById(int messageNumber) {
    for (CONNECTIVITY_CAPABILITIES name: CONNECTIVITY_CAPABILITIES.values()) {
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
