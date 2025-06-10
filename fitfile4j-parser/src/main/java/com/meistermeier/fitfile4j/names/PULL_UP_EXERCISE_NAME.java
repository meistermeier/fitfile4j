// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum PULL_UP_EXERCISE_NAME {

	_BANDED_PULL_UPS(0, "banded_pull_ups"),

	_30_DEGREE_LAT_PULLDOWN(1, "30_degree_lat_pulldown"),

	_BAND_ASSISTED_CHIN_UP(2, "band_assisted_chin_up"),

	_CLOSE_GRIP_CHIN_UP(3, "close_grip_chin_up"),

	_WEIGHTED_CLOSE_GRIP_CHIN_UP(4, "weighted_close_grip_chin_up"),

	_CLOSE_GRIP_LAT_PULLDOWN(5, "close_grip_lat_pulldown"),

	_CROSSOVER_CHIN_UP(6, "crossover_chin_up"),

	_WEIGHTED_CROSSOVER_CHIN_UP(7, "weighted_crossover_chin_up"),

	_EZ_BAR_PULLOVER(8, "ez_bar_pullover"),

	_HANGING_HURDLE(9, "hanging_hurdle"),

	_WEIGHTED_HANGING_HURDLE(10, "weighted_hanging_hurdle"),

	_KNEELING_LAT_PULLDOWN(11, "kneeling_lat_pulldown"),

	_KNEELING_UNDERHAND_GRIP_LAT_PULLDOWN(12, "kneeling_underhand_grip_lat_pulldown"),

	_LAT_PULLDOWN(13, "lat_pulldown"),

	_MIXED_GRIP_CHIN_UP(14, "mixed_grip_chin_up"),

	_WEIGHTED_MIXED_GRIP_CHIN_UP(15, "weighted_mixed_grip_chin_up"),

	_MIXED_GRIP_PULL_UP(16, "mixed_grip_pull_up"),

	_WEIGHTED_MIXED_GRIP_PULL_UP(17, "weighted_mixed_grip_pull_up"),

	_REVERSE_GRIP_PULLDOWN(18, "reverse_grip_pulldown"),

	_STANDING_CABLE_PULLOVER(19, "standing_cable_pullover"),

	_STRAIGHT_ARM_PULLDOWN(20, "straight_arm_pulldown"),

	_SWISS_BALL_EZ_BAR_PULLOVER(21, "swiss_ball_ez_bar_pullover"),

	_TOWEL_PULL_UP(22, "towel_pull_up"),

	_WEIGHTED_TOWEL_PULL_UP(23, "weighted_towel_pull_up"),

	_WEIGHTED_PULL_UP(24, "weighted_pull_up"),

	_WIDE_GRIP_LAT_PULLDOWN(25, "wide_grip_lat_pulldown"),

	_WIDE_GRIP_PULL_UP(26, "wide_grip_pull_up"),

	_WEIGHTED_WIDE_GRIP_PULL_UP(27, "weighted_wide_grip_pull_up"),

	_BURPEE_PULL_UP(28, "burpee_pull_up"),

	_WEIGHTED_BURPEE_PULL_UP(29, "weighted_burpee_pull_up"),

	_JUMPING_PULL_UPS(30, "jumping_pull_ups"),

	_WEIGHTED_JUMPING_PULL_UPS(31, "weighted_jumping_pull_ups"),

	_KIPPING_PULL_UP(32, "kipping_pull_up"),

	_WEIGHTED_KIPPING_PULL_UP(33, "weighted_kipping_pull_up"),

	_L_PULL_UP(34, "l_pull_up"),

	_WEIGHTED_L_PULL_UP(35, "weighted_l_pull_up"),

	_SUSPENDED_CHIN_UP(36, "suspended_chin_up"),

	_WEIGHTED_SUSPENDED_CHIN_UP(37, "weighted_suspended_chin_up"),

	_PULL_UP(38, "pull_up");

	private final int messageNumber;

	private final String messageName;

	PULL_UP_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static PULL_UP_EXERCISE_NAME findById(int messageNumber) {
		for (PULL_UP_EXERCISE_NAME name : PULL_UP_EXERCISE_NAME.values()) {
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
