// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WEATHER_STATUS {
	_CLEAR(0, "clear"),

	_PARTLY_CLOUDY(1, "partly_cloudy"),

	_MOSTLY_CLOUDY(2, "mostly_cloudy"),

	_RAIN(3, "rain"),

	_SNOW(4, "snow"),

	_WINDY(5, "windy"),

	_THUNDERSTORMS(6, "thunderstorms"),

	_WINTRY_MIX(7, "wintry_mix"),

	_FOG(8, "fog"),

	_HAZY(11, "hazy"),

	_HAIL(12, "hail"),

	_SCATTERED_SHOWERS(13, "scattered_showers"),

	_SCATTERED_THUNDERSTORMS(14, "scattered_thunderstorms"),

	_UNKNOWN_PRECIPITATION(15, "unknown_precipitation"),

	_LIGHT_RAIN(16, "light_rain"),

	_HEAVY_RAIN(17, "heavy_rain"),

	_LIGHT_SNOW(18, "light_snow"),

	_HEAVY_SNOW(19, "heavy_snow"),

	_LIGHT_RAIN_SNOW(20, "light_rain_snow"),

	_HEAVY_RAIN_SNOW(21, "heavy_rain_snow"),

	_CLOUDY(22, "cloudy");

	private final int messageNumber;

	private final String messageName;

	WEATHER_STATUS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static WEATHER_STATUS findById(int messageNumber) {
		for (WEATHER_STATUS name: WEATHER_STATUS.values()) {
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
