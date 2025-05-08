// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum WEATHER_SEVERE_TYPE {
  _UNSPECIFIED(0, "unspecified"),

  _TORNADO(1, "tornado"),

  _TSUNAMI(2, "tsunami"),

  _HURRICANE(3, "hurricane"),

  _EXTREME_WIND(4, "extreme_wind"),

  _TYPHOON(5, "typhoon"),

  _INLAND_HURRICANE(6, "inland_hurricane"),

  _HURRICANE_FORCE_WIND(7, "hurricane_force_wind"),

  _WATERSPOUT(8, "waterspout"),

  _SEVERE_THUNDERSTORM(9, "severe_thunderstorm"),

  _WRECKHOUSE_WINDS(10, "wreckhouse_winds"),

  _LES_SUETES_WIND(11, "les_suetes_wind"),

  _AVALANCHE(12, "avalanche"),

  _FLASH_FLOOD(13, "flash_flood"),

  _TROPICAL_STORM(14, "tropical_storm"),

  _INLAND_TROPICAL_STORM(15, "inland_tropical_storm"),

  _BLIZZARD(16, "blizzard"),

  _ICE_STORM(17, "ice_storm"),

  _FREEZING_RAIN(18, "freezing_rain"),

  _DEBRIS_FLOW(19, "debris_flow"),

  _FLASH_FREEZE(20, "flash_freeze"),

  _DUST_STORM(21, "dust_storm"),

  _HIGH_WIND(22, "high_wind"),

  _WINTER_STORM(23, "winter_storm"),

  _HEAVY_FREEZING_SPRAY(24, "heavy_freezing_spray"),

  _EXTREME_COLD(25, "extreme_cold"),

  _WIND_CHILL(26, "wind_chill"),

  _COLD_WAVE(27, "cold_wave"),

  _HEAVY_SNOW_ALERT(28, "heavy_snow_alert"),

  _LAKE_EFFECT_BLOWING_SNOW(29, "lake_effect_blowing_snow"),

  _SNOW_SQUALL(30, "snow_squall"),

  _LAKE_EFFECT_SNOW(31, "lake_effect_snow"),

  _WINTER_WEATHER(32, "winter_weather"),

  _SLEET(33, "sleet"),

  _SNOWFALL(34, "snowfall"),

  _SNOW_AND_BLOWING_SNOW(35, "snow_and_blowing_snow"),

  _BLOWING_SNOW(36, "blowing_snow"),

  _SNOW_ALERT(37, "snow_alert"),

  _ARCTIC_OUTFLOW(38, "arctic_outflow"),

  _FREEZING_DRIZZLE(39, "freezing_drizzle"),

  _STORM(40, "storm"),

  _STORM_SURGE(41, "storm_surge"),

  _RAINFALL(42, "rainfall"),

  _AREAL_FLOOD(43, "areal_flood"),

  _COASTAL_FLOOD(44, "coastal_flood"),

  _LAKESHORE_FLOOD(45, "lakeshore_flood"),

  _EXCESSIVE_HEAT(46, "excessive_heat"),

  _HEAT(47, "heat"),

  _WEATHER(48, "weather"),

  _HIGH_HEAT_AND_HUMIDITY(49, "high_heat_and_humidity"),

  _HUMIDEX_AND_HEALTH(50, "humidex_and_health"),

  _HUMIDEX(51, "humidex"),

  _GALE(52, "gale"),

  _FREEZING_SPRAY(53, "freezing_spray"),

  _SPECIAL_MARINE(54, "special_marine"),

  _SQUALL(55, "squall"),

  _STRONG_WIND(56, "strong_wind"),

  _LAKE_WIND(57, "lake_wind"),

  _MARINE_WEATHER(58, "marine_weather"),

  _WIND(59, "wind"),

  _SMALL_CRAFT_HAZARDOUS_SEAS(60, "small_craft_hazardous_seas"),

  _HAZARDOUS_SEAS(61, "hazardous_seas"),

  _SMALL_CRAFT(62, "small_craft"),

  _SMALL_CRAFT_WINDS(63, "small_craft_winds"),

  _SMALL_CRAFT_ROUGH_BAR(64, "small_craft_rough_bar"),

  _HIGH_WATER_LEVEL(65, "high_water_level"),

  _ASHFALL(66, "ashfall"),

  _FREEZING_FOG(67, "freezing_fog"),

  _DENSE_FOG(68, "dense_fog"),

  _DENSE_SMOKE(69, "dense_smoke"),

  _BLOWING_DUST(70, "blowing_dust"),

  _HARD_FREEZE(71, "hard_freeze"),

  _FREEZE(72, "freeze"),

  _FROST(73, "frost"),

  _FIRE_WEATHER(74, "fire_weather"),

  _FLOOD(75, "flood"),

  _RIP_TIDE(76, "rip_tide"),

  _HIGH_SURF(77, "high_surf"),

  _SMOG(78, "smog"),

  _AIR_QUALITY(79, "air_quality"),

  _BRISK_WIND(80, "brisk_wind"),

  _AIR_STAGNATION(81, "air_stagnation"),

  _LOW_WATER(82, "low_water"),

  _HYDROLOGICAL(83, "hydrological"),

  _SPECIAL_WEATHER(84, "special_weather");

  private final int messageNumber;

  private final String messageName;

  WEATHER_SEVERE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static WEATHER_SEVERE_TYPE findById(int messageNumber) {
    for (WEATHER_SEVERE_TYPE name: WEATHER_SEVERE_TYPE.values()) {
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
