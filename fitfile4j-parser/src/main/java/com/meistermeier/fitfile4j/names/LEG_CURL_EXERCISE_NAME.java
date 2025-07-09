// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LEG_CURL_EXERCISE_NAME {
	_LEG_CURL(0, "leg_curl"),

	_WEIGHTED_LEG_CURL(1, "weighted_leg_curl"),

	_GOOD_MORNING(2, "good_morning"),

	_SEATED_BARBELL_GOOD_MORNING(3, "seated_barbell_good_morning"),

	_SINGLE_LEG_BARBELL_GOOD_MORNING(4, "single_leg_barbell_good_morning"),

	_SINGLE_LEG_SLIDING_LEG_CURL(5, "single_leg_sliding_leg_curl"),

	_SLIDING_LEG_CURL(6, "sliding_leg_curl"),

	_SPLIT_BARBELL_GOOD_MORNING(7, "split_barbell_good_morning"),

	_SPLIT_STANCE_EXTENSION(8, "split_stance_extension"),

	_STAGGERED_STANCE_GOOD_MORNING(9, "staggered_stance_good_morning"),

	_SWISS_BALL_HIP_RAISE_AND_LEG_CURL(10, "swiss_ball_hip_raise_and_leg_curl"),

	_ZERCHER_GOOD_MORNING(11, "zercher_good_morning");

	private final int messageNumber;

	private final String messageName;

	LEG_CURL_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LEG_CURL_EXERCISE_NAME findById(int messageNumber) {
		for (LEG_CURL_EXERCISE_NAME name: LEG_CURL_EXERCISE_NAME.values()) {
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
