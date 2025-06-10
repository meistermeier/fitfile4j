// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SEGMENT_LEADERBOARD_TYPE {

	_OVERALL(0, "overall"),

	_PERSONAL_BEST(1, "personal_best"),

	_CONNECTIONS(2, "connections"),

	_GROUP(3, "group"),

	_CHALLENGER(4, "challenger"),

	_KOM(5, "kom"),

	_QOM(6, "qom"),

	_PR(7, "pr"),

	_GOAL(8, "goal"),

	_CARROT(9, "carrot"),

	_CLUB_LEADER(10, "club_leader"),

	_RIVAL(11, "rival"),

	_LAST(12, "last"),

	_RECENT_BEST(13, "recent_best"),

	_COURSE_RECORD(14, "course_record");

	private final int messageNumber;

	private final String messageName;

	SEGMENT_LEADERBOARD_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SEGMENT_LEADERBOARD_TYPE findById(int messageNumber) {
		for (SEGMENT_LEADERBOARD_TYPE name : SEGMENT_LEADERBOARD_TYPE.values()) {
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
