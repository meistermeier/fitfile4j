// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CONNECTIVITY_CAPABILITIES {
  _BLUETOOTH(1L, "bluetooth"),

  _BLUETOOTH_LE(2L, "bluetooth_le"),

  _ANT(4L, "ant"),

  _ACTIVITY_UPLOAD(8L, "activity_upload"),

  _COURSE_DOWNLOAD(16L, "course_download"),

  _WORKOUT_DOWNLOAD(32L, "workout_download"),

  _LIVE_TRACK(64L, "live_track"),

  _WEATHER_CONDITIONS(128L, "weather_conditions"),

  _WEATHER_ALERTS(256L, "weather_alerts"),

  _GPS_EPHEMERIS_DOWNLOAD(512L, "gps_ephemeris_download"),

  _EXPLICIT_ARCHIVE(1024L, "explicit_archive"),

  _SETUP_INCOMPLETE(2048L, "setup_incomplete"),

  _CONTINUE_SYNC_AFTER_SOFTWARE_UPDATE(4096L, "continue_sync_after_software_update"),

  _CONNECT_IQ_APP_DOWNLOAD(8192L, "connect_iq_app_download"),

  _GOLF_COURSE_DOWNLOAD(16384L, "golf_course_download"),

  _DEVICE_INITIATES_SYNC(32768L, "device_initiates_sync"),

  _CONNECT_IQ_WATCH_APP_DOWNLOAD(65536L, "connect_iq_watch_app_download"),

  _CONNECT_IQ_WIDGET_DOWNLOAD(131072L, "connect_iq_widget_download"),

  _CONNECT_IQ_WATCH_FACE_DOWNLOAD(262144L, "connect_iq_watch_face_download"),

  _CONNECT_IQ_DATA_FIELD_DOWNLOAD(524288L, "connect_iq_data_field_download"),

  _CONNECT_IQ_APP_MANAGMENT(1048576L, "connect_iq_app_managment"),

  _SWING_SENSOR(2097152L, "swing_sensor"),

  _SWING_SENSOR_REMOTE(4194304L, "swing_sensor_remote"),

  _INCIDENT_DETECTION(8388608L, "incident_detection"),

  _AUDIO_PROMPTS(16777216L, "audio_prompts"),

  _WIFI_VERIFICATION(33554432L, "wifi_verification"),

  _TRUE_UP(67108864L, "true_up"),

  _FIND_MY_WATCH(134217728L, "find_my_watch"),

  _REMOTE_MANUAL_SYNC(268435456L, "remote_manual_sync"),

  _LIVE_TRACK_AUTO_START(536870912L, "live_track_auto_start"),

  _LIVE_TRACK_MESSAGING(1073741824L, "live_track_messaging"),

  _INSTANT_INPUT(2147483648L, "instant_input");

  private final long messageNumber;

  private final String messageName;

  CONNECTIVITY_CAPABILITIES(long messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static CONNECTIVITY_CAPABILITIES findById(long messageNumber) {
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
