// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPLIT_TYPE {

	_ASCENT_SPLIT(1, "ascent_split"),

	_DESCENT_SPLIT(2, "descent_split"),

	_INTERVAL_ACTIVE(3, "interval_active"),

	_INTERVAL_REST(4, "interval_rest"),

	_INTERVAL_WARMUP(5, "interval_warmup"),

	_INTERVAL_COOLDOWN(6, "interval_cooldown"),

	_INTERVAL_RECOVERY(7, "interval_recovery"),

	_INTERVAL_OTHER(8, "interval_other"),

	_CLIMB_ACTIVE(9, "climb_active"),

	_CLIMB_REST(10, "climb_rest"),

	_SURF_ACTIVE(11, "surf_active"),

	_RUN_ACTIVE(12, "run_active"),

	_RUN_REST(13, "run_rest"),

	_WORKOUT_ROUND(14, "workout_round"),

	_RWD_RUN(17, "rwd_run"),

	_RWD_WALK(18, "rwd_walk"),

	_WINDSURF_ACTIVE(21, "windsurf_active"),

	_RWD_STAND(22, "rwd_stand"),

	_TRANSITION(23, "transition"),

	_SKI_LIFT_SPLIT(28, "ski_lift_split"),

	_SKI_RUN_SPLIT(29, "ski_run_split");

	private final int messageNumber;

	private final String messageName;

	SPLIT_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPLIT_TYPE findById(int messageNumber) {
		for (SPLIT_TYPE name : SPLIT_TYPE.values()) {
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
