// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum CORE_EXERCISE_NAME {

	_ABS_JABS(0, "abs_jabs"),

	_WEIGHTED_ABS_JABS(1, "weighted_abs_jabs"),

	_ALTERNATING_PLATE_REACH(2, "alternating_plate_reach"),

	_BARBELL_ROLLOUT(3, "barbell_rollout"),

	_WEIGHTED_BARBELL_ROLLOUT(4, "weighted_barbell_rollout"),

	_BODY_BAR_OBLIQUE_TWIST(5, "body_bar_oblique_twist"),

	_CABLE_CORE_PRESS(6, "cable_core_press"),

	_CABLE_SIDE_BEND(7, "cable_side_bend"),

	_SIDE_BEND(8, "side_bend"),

	_WEIGHTED_SIDE_BEND(9, "weighted_side_bend"),

	_CRESCENT_CIRCLE(10, "crescent_circle"),

	_WEIGHTED_CRESCENT_CIRCLE(11, "weighted_crescent_circle"),

	_CYCLING_RUSSIAN_TWIST(12, "cycling_russian_twist"),

	_WEIGHTED_CYCLING_RUSSIAN_TWIST(13, "weighted_cycling_russian_twist"),

	_ELEVATED_FEET_RUSSIAN_TWIST(14, "elevated_feet_russian_twist"),

	_WEIGHTED_ELEVATED_FEET_RUSSIAN_TWIST(15, "weighted_elevated_feet_russian_twist"),

	_HALF_TURKISH_GET_UP(16, "half_turkish_get_up"),

	_KETTLEBELL_WINDMILL(17, "kettlebell_windmill"),

	_KNEELING_AB_WHEEL(18, "kneeling_ab_wheel"),

	_WEIGHTED_KNEELING_AB_WHEEL(19, "weighted_kneeling_ab_wheel"),

	_MODIFIED_FRONT_LEVER(20, "modified_front_lever"),

	_OPEN_KNEE_TUCKS(21, "open_knee_tucks"),

	_WEIGHTED_OPEN_KNEE_TUCKS(22, "weighted_open_knee_tucks"),

	_SIDE_ABS_LEG_LIFT(23, "side_abs_leg_lift"),

	_WEIGHTED_SIDE_ABS_LEG_LIFT(24, "weighted_side_abs_leg_lift"),

	_SWISS_BALL_JACKKNIFE(25, "swiss_ball_jackknife"),

	_WEIGHTED_SWISS_BALL_JACKKNIFE(26, "weighted_swiss_ball_jackknife"),

	_SWISS_BALL_PIKE(27, "swiss_ball_pike"),

	_WEIGHTED_SWISS_BALL_PIKE(28, "weighted_swiss_ball_pike"),

	_SWISS_BALL_ROLLOUT(29, "swiss_ball_rollout"),

	_WEIGHTED_SWISS_BALL_ROLLOUT(30, "weighted_swiss_ball_rollout"),

	_TRIANGLE_HIP_PRESS(31, "triangle_hip_press"),

	_WEIGHTED_TRIANGLE_HIP_PRESS(32, "weighted_triangle_hip_press"),

	_TRX_SUSPENDED_JACKKNIFE(33, "trx_suspended_jackknife"),

	_WEIGHTED_TRX_SUSPENDED_JACKKNIFE(34, "weighted_trx_suspended_jackknife"),

	_U_BOAT(35, "u_boat"),

	_WEIGHTED_U_BOAT(36, "weighted_u_boat"),

	_WINDMILL_SWITCHES(37, "windmill_switches"),

	_WEIGHTED_WINDMILL_SWITCHES(38, "weighted_windmill_switches"),

	_ALTERNATING_SLIDE_OUT(39, "alternating_slide_out"),

	_WEIGHTED_ALTERNATING_SLIDE_OUT(40, "weighted_alternating_slide_out"),

	_GHD_BACK_EXTENSIONS(41, "ghd_back_extensions"),

	_WEIGHTED_GHD_BACK_EXTENSIONS(42, "weighted_ghd_back_extensions"),

	_OVERHEAD_WALK(43, "overhead_walk"),

	_INCHWORM(44, "inchworm"),

	_WEIGHTED_MODIFIED_FRONT_LEVER(45, "weighted_modified_front_lever"),

	_RUSSIAN_TWIST(46, "russian_twist"),

	_ABDOMINAL_LEG_ROTATIONS(47, "abdominal_leg_rotations"),

	_ARM_AND_LEG_EXTENSION_ON_KNEES(48, "arm_and_leg_extension_on_knees"),

	_BICYCLE(49, "bicycle"),

	_BICEP_CURL_WITH_LEG_EXTENSION(50, "bicep_curl_with_leg_extension"),

	_CAT_COW(51, "cat_cow"),

	_CORKSCREW(52, "corkscrew"),

	_CRISS_CROSS(53, "criss_cross"),

	_CRISS_CROSS_WITH_BALL(54, "criss_cross_with_ball"),

	_DOUBLE_LEG_STRETCH(55, "double_leg_stretch"),

	_KNEE_FOLDS(56, "knee_folds"),

	_LOWER_LIFT(57, "lower_lift"),

	_NECK_PULL(58, "neck_pull"),

	_PELVIC_CLOCKS(59, "pelvic_clocks"),

	_ROLL_OVER(60, "roll_over"),

	_ROLL_UP(61, "roll_up"),

	_ROLLING(62, "rolling"),

	_ROWING_1(63, "rowing_1"),

	_ROWING_2(64, "rowing_2"),

	_SCISSORS(65, "scissors"),

	_SINGLE_LEG_CIRCLES(66, "single_leg_circles"),

	_SINGLE_LEG_STRETCH(67, "single_leg_stretch"),

	_SNAKE_TWIST_1_AND_2(68, "snake_twist_1_and_2"),

	_SWAN(69, "swan"),

	_SWIMMING(70, "swimming"),

	_TEASER(71, "teaser"),

	_THE_HUNDRED(72, "the_hundred");

	private final int messageNumber;

	private final String messageName;

	CORE_EXERCISE_NAME(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static CORE_EXERCISE_NAME findById(int messageNumber) {
		for (CORE_EXERCISE_NAME name : CORE_EXERCISE_NAME.values()) {
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
