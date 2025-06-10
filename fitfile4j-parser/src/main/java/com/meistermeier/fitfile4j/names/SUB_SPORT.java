// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SUB_SPORT {

	_GENERIC(0, "generic"),

	_TREADMILL(1, "treadmill"),

	_STREET(2, "street"),

	_TRAIL(3, "trail"),

	_TRACK(4, "track"),

	_SPIN(5, "spin"),

	_INDOOR_CYCLING(6, "indoor_cycling"),

	_ROAD(7, "road"),

	_MOUNTAIN(8, "mountain"),

	_DOWNHILL(9, "downhill"),

	_RECUMBENT(10, "recumbent"),

	_CYCLOCROSS(11, "cyclocross"),

	_HAND_CYCLING(12, "hand_cycling"),

	_TRACK_CYCLING(13, "track_cycling"),

	_INDOOR_ROWING(14, "indoor_rowing"),

	_ELLIPTICAL(15, "elliptical"),

	_STAIR_CLIMBING(16, "stair_climbing"),

	_LAP_SWIMMING(17, "lap_swimming"),

	_OPEN_WATER(18, "open_water"),

	_FLEXIBILITY_TRAINING(19, "flexibility_training"),

	_STRENGTH_TRAINING(20, "strength_training"),

	_WARM_UP(21, "warm_up"),

	_MATCH(22, "match"),

	_EXERCISE(23, "exercise"),

	_CHALLENGE(24, "challenge"),

	_INDOOR_SKIING(25, "indoor_skiing"),

	_CARDIO_TRAINING(26, "cardio_training"),

	_INDOOR_WALKING(27, "indoor_walking"),

	_E_BIKE_FITNESS(28, "e_bike_fitness"),

	_BMX(29, "bmx"),

	_CASUAL_WALKING(30, "casual_walking"),

	_SPEED_WALKING(31, "speed_walking"),

	_BIKE_TO_RUN_TRANSITION(32, "bike_to_run_transition"),

	_RUN_TO_BIKE_TRANSITION(33, "run_to_bike_transition"),

	_SWIM_TO_BIKE_TRANSITION(34, "swim_to_bike_transition"),

	_ATV(35, "atv"),

	_MOTOCROSS(36, "motocross"),

	_BACKCOUNTRY(37, "backcountry"),

	_RESORT(38, "resort"),

	_RC_DRONE(39, "rc_drone"),

	_WINGSUIT(40, "wingsuit"),

	_WHITEWATER(41, "whitewater"),

	_SKATE_SKIING(42, "skate_skiing"),

	_YOGA(43, "yoga"),

	_PILATES(44, "pilates"),

	_INDOOR_RUNNING(45, "indoor_running"),

	_GRAVEL_CYCLING(46, "gravel_cycling"),

	_E_BIKE_MOUNTAIN(47, "e_bike_mountain"),

	_COMMUTING(48, "commuting"),

	_MIXED_SURFACE(49, "mixed_surface"),

	_NAVIGATE(50, "navigate"),

	_TRACK_ME(51, "track_me"),

	_MAP(52, "map"),

	_SINGLE_GAS_DIVING(53, "single_gas_diving"),

	_MULTI_GAS_DIVING(54, "multi_gas_diving"),

	_GAUGE_DIVING(55, "gauge_diving"),

	_APNEA_DIVING(56, "apnea_diving"),

	_APNEA_HUNTING(57, "apnea_hunting"),

	_VIRTUAL_ACTIVITY(58, "virtual_activity"),

	_OBSTACLE(59, "obstacle"),

	_BREATHING(62, "breathing"),

	_SAIL_RACE(65, "sail_race"),

	_ULTRA(67, "ultra"),

	_INDOOR_CLIMBING(68, "indoor_climbing"),

	_BOULDERING(69, "bouldering"),

	_HIIT(70, "hiit"),

	_AMRAP(73, "amrap"),

	_EMOM(74, "emom"),

	_TABATA(75, "tabata"),

	_PICKLEBALL(84, "pickleball"),

	_PADEL(85, "padel"),

	_INDOOR_WHEELCHAIR_WALK(86, "indoor_wheelchair_walk"),

	_INDOOR_WHEELCHAIR_RUN(87, "indoor_wheelchair_run"),

	_INDOOR_HAND_CYCLING(88, "indoor_hand_cycling"),

	_SQUASH(94, "squash"),

	_BADMINTON(95, "badminton"),

	_RACQUETBALL(96, "racquetball"),

	_TABLE_TENNIS(97, "table_tennis"),

	_FLY_CANOPY(110, "fly_canopy"),

	_FLY_PARAGLIDE(111, "fly_paraglide"),

	_FLY_PARAMOTOR(112, "fly_paramotor"),

	_FLY_PRESSURIZED(113, "fly_pressurized"),

	_FLY_NAVIGATE(114, "fly_navigate"),

	_FLY_TIMER(115, "fly_timer"),

	_FLY_ALTIMETER(116, "fly_altimeter"),

	_FLY_WX(117, "fly_wx"),

	_FLY_VFR(118, "fly_vfr"),

	_FLY_IFR(119, "fly_ifr"),

	_ALL(254, "all");

	private final int messageNumber;

	private final String messageName;

	SUB_SPORT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SUB_SPORT findById(int messageNumber) {
		for (SUB_SPORT name : SUB_SPORT.values()) {
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
