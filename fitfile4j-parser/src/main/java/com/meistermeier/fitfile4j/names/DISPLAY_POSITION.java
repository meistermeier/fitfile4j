// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DISPLAY_POSITION {
	_DEGREE(0, "degree"),

	_DEGREE_MINUTE(1, "degree_minute"),

	_DEGREE_MINUTE_SECOND(2, "degree_minute_second"),

	_AUSTRIAN_GRID(3, "austrian_grid"),

	_BRITISH_GRID(4, "british_grid"),

	_DUTCH_GRID(5, "dutch_grid"),

	_HUNGARIAN_GRID(6, "hungarian_grid"),

	_FINNISH_GRID(7, "finnish_grid"),

	_GERMAN_GRID(8, "german_grid"),

	_ICELANDIC_GRID(9, "icelandic_grid"),

	_INDONESIAN_EQUATORIAL(10, "indonesian_equatorial"),

	_INDONESIAN_IRIAN(11, "indonesian_irian"),

	_INDONESIAN_SOUTHERN(12, "indonesian_southern"),

	_INDIA_ZONE_0(13, "india_zone_0"),

	_INDIA_ZONE_IA(14, "india_zone_IA"),

	_INDIA_ZONE_IB(15, "india_zone_IB"),

	_INDIA_ZONE_IIA(16, "india_zone_IIA"),

	_INDIA_ZONE_IIB(17, "india_zone_IIB"),

	_INDIA_ZONE_IIIA(18, "india_zone_IIIA"),

	_INDIA_ZONE_IIIB(19, "india_zone_IIIB"),

	_INDIA_ZONE_IVA(20, "india_zone_IVA"),

	_INDIA_ZONE_IVB(21, "india_zone_IVB"),

	_IRISH_TRANSVERSE(22, "irish_transverse"),

	_IRISH_GRID(23, "irish_grid"),

	_LORAN(24, "loran"),

	_MAIDENHEAD_GRID(25, "maidenhead_grid"),

	_MGRS_GRID(26, "mgrs_grid"),

	_NEW_ZEALAND_GRID(27, "new_zealand_grid"),

	_NEW_ZEALAND_TRANSVERSE(28, "new_zealand_transverse"),

	_QATAR_GRID(29, "qatar_grid"),

	_MODIFIED_SWEDISH_GRID(30, "modified_swedish_grid"),

	_SWEDISH_GRID(31, "swedish_grid"),

	_SOUTH_AFRICAN_GRID(32, "south_african_grid"),

	_SWISS_GRID(33, "swiss_grid"),

	_TAIWAN_GRID(34, "taiwan_grid"),

	_UNITED_STATES_GRID(35, "united_states_grid"),

	_UTM_UPS_GRID(36, "utm_ups_grid"),

	_WEST_MALAYAN(37, "west_malayan"),

	_BORNEO_RSO(38, "borneo_rso"),

	_ESTONIAN_GRID(39, "estonian_grid"),

	_LATVIAN_GRID(40, "latvian_grid"),

	_SWEDISH_REF_99_GRID(41, "swedish_ref_99_grid");

	private final int messageNumber;

	private final String messageName;

	DISPLAY_POSITION(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DISPLAY_POSITION findById(int messageNumber) {
		for (DISPLAY_POSITION name: DISPLAY_POSITION.values()) {
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
