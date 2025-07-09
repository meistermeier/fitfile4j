// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CARDIO_EXERCISE_NAME {
	_BOB_AND_WEAVE_CIRCLE(0, "bob_and_weave_circle"),

	_WEIGHTED_BOB_AND_WEAVE_CIRCLE(1, "weighted_bob_and_weave_circle"),

	_CARDIO_CORE_CRAWL(2, "cardio_core_crawl"),

	_WEIGHTED_CARDIO_CORE_CRAWL(3, "weighted_cardio_core_crawl"),

	_DOUBLE_UNDER(4, "double_under"),

	_WEIGHTED_DOUBLE_UNDER(5, "weighted_double_under"),

	_JUMP_ROPE(6, "jump_rope"),

	_WEIGHTED_JUMP_ROPE(7, "weighted_jump_rope"),

	_JUMP_ROPE_CROSSOVER(8, "jump_rope_crossover"),

	_WEIGHTED_JUMP_ROPE_CROSSOVER(9, "weighted_jump_rope_crossover"),

	_JUMP_ROPE_JOG(10, "jump_rope_jog"),

	_WEIGHTED_JUMP_ROPE_JOG(11, "weighted_jump_rope_jog"),

	_JUMPING_JACKS(12, "jumping_jacks"),

	_WEIGHTED_JUMPING_JACKS(13, "weighted_jumping_jacks"),

	_SKI_MOGULS(14, "ski_moguls"),

	_WEIGHTED_SKI_MOGULS(15, "weighted_ski_moguls"),

	_SPLIT_JACKS(16, "split_jacks"),

	_WEIGHTED_SPLIT_JACKS(17, "weighted_split_jacks"),

	_SQUAT_JACKS(18, "squat_jacks"),

	_WEIGHTED_SQUAT_JACKS(19, "weighted_squat_jacks"),

	_TRIPLE_UNDER(20, "triple_under"),

	_WEIGHTED_TRIPLE_UNDER(21, "weighted_triple_under");

	private final int messageNumber;

	private final String messageName;

	CARDIO_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static CARDIO_EXERCISE_NAME findById(int messageNumber) {
		for (CARDIO_EXERCISE_NAME name: CARDIO_EXERCISE_NAME.values()) {
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
