// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXD_QUALIFIERS {
	_NO_QUALIFIER(0, "no_qualifier"),

	_INSTANTANEOUS(1, "instantaneous"),

	_AVERAGE(2, "average"),

	_LAP(3, "lap"),

	_MAXIMUM(4, "maximum"),

	_MAXIMUM_AVERAGE(5, "maximum_average"),

	_MAXIMUM_LAP(6, "maximum_lap"),

	_LAST_LAP(7, "last_lap"),

	_AVERAGE_LAP(8, "average_lap"),

	_TO_DESTINATION(9, "to_destination"),

	_TO_GO(10, "to_go"),

	_TO_NEXT(11, "to_next"),

	_NEXT_COURSE_POINT(12, "next_course_point"),

	_TOTAL(13, "total"),

	_THREE_SECOND_AVERAGE(14, "three_second_average"),

	_TEN_SECOND_AVERAGE(15, "ten_second_average"),

	_THIRTY_SECOND_AVERAGE(16, "thirty_second_average"),

	_PERCENT_MAXIMUM(17, "percent_maximum"),

	_PERCENT_MAXIMUM_AVERAGE(18, "percent_maximum_average"),

	_LAP_PERCENT_MAXIMUM(19, "lap_percent_maximum"),

	_ELAPSED(20, "elapsed"),

	_SUNRISE(21, "sunrise"),

	_SUNSET(22, "sunset"),

	_COMPARED_TO_VIRTUAL_PARTNER(23, "compared_to_virtual_partner"),

	_MAXIMUM_24H(24, "maximum_24h"),

	_MINIMUM_24H(25, "minimum_24h"),

	_MINIMUM(26, "minimum"),

	_FIRST(27, "first"),

	_SECOND(28, "second"),

	_THIRD(29, "third"),

	_SHIFTER(30, "shifter"),

	_LAST_SPORT(31, "last_sport"),

	_MOVING(32, "moving"),

	_STOPPED(33, "stopped"),

	_ESTIMATED_TOTAL(34, "estimated_total"),

	_ZONE_9(242, "zone_9"),

	_ZONE_8(243, "zone_8"),

	_ZONE_7(244, "zone_7"),

	_ZONE_6(245, "zone_6"),

	_ZONE_5(246, "zone_5"),

	_ZONE_4(247, "zone_4"),

	_ZONE_3(248, "zone_3"),

	_ZONE_2(249, "zone_2"),

	_ZONE_1(250, "zone_1");

	private final int messageNumber;

	private final String messageName;

	EXD_QUALIFIERS(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EXD_QUALIFIERS findById(int messageNumber) {
		for (EXD_QUALIFIERS name: EXD_QUALIFIERS.values()) {
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
