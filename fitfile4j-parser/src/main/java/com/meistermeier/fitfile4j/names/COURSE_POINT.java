// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum COURSE_POINT {
	_GENERIC(0, "generic"),

	_SUMMIT(1, "summit"),

	_VALLEY(2, "valley"),

	_WATER(3, "water"),

	_FOOD(4, "food"),

	_DANGER(5, "danger"),

	_LEFT(6, "left"),

	_RIGHT(7, "right"),

	_STRAIGHT(8, "straight"),

	_FIRST_AID(9, "first_aid"),

	_FOURTH_CATEGORY(10, "fourth_category"),

	_THIRD_CATEGORY(11, "third_category"),

	_SECOND_CATEGORY(12, "second_category"),

	_FIRST_CATEGORY(13, "first_category"),

	_HORS_CATEGORY(14, "hors_category"),

	_SPRINT(15, "sprint"),

	_LEFT_FORK(16, "left_fork"),

	_RIGHT_FORK(17, "right_fork"),

	_MIDDLE_FORK(18, "middle_fork"),

	_SLIGHT_LEFT(19, "slight_left"),

	_SHARP_LEFT(20, "sharp_left"),

	_SLIGHT_RIGHT(21, "slight_right"),

	_SHARP_RIGHT(22, "sharp_right"),

	_U_TURN(23, "u_turn"),

	_SEGMENT_START(24, "segment_start"),

	_SEGMENT_END(25, "segment_end"),

	_CAMPSITE(27, "campsite"),

	_AID_STATION(28, "aid_station"),

	_REST_AREA(29, "rest_area"),

	_GENERAL_DISTANCE(30, "general_distance"),

	_SERVICE(31, "service"),

	_ENERGY_GEL(32, "energy_gel"),

	_SPORTS_DRINK(33, "sports_drink"),

	_MILE_MARKER(34, "mile_marker"),

	_CHECKPOINT(35, "checkpoint"),

	_SHELTER(36, "shelter"),

	_MEETING_SPOT(37, "meeting_spot"),

	_OVERLOOK(38, "overlook"),

	_TOILET(39, "toilet"),

	_SHOWER(40, "shower"),

	_GEAR(41, "gear"),

	_SHARP_CURVE(42, "sharp_curve"),

	_STEEP_INCLINE(43, "steep_incline"),

	_TUNNEL(44, "tunnel"),

	_BRIDGE(45, "bridge"),

	_OBSTACLE(46, "obstacle"),

	_CROSSING(47, "crossing"),

	_STORE(48, "store"),

	_TRANSITION(49, "transition"),

	_NAVAID(50, "navaid"),

	_TRANSPORT(51, "transport"),

	_ALERT(52, "alert"),

	_INFO(53, "info");

	private final int messageNumber;

	private final String messageName;

	COURSE_POINT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static COURSE_POINT findById(int messageNumber) {
		for (COURSE_POINT name: COURSE_POINT.values()) {
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
