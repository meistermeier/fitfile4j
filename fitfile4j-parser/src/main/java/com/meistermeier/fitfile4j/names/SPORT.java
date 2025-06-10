// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SPORT {

	_GENERIC(0, "generic"),

	_RUNNING(1, "running"),

	_CYCLING(2, "cycling"),

	_TRANSITION(3, "transition"),

	_FITNESS_EQUIPMENT(4, "fitness_equipment"),

	_SWIMMING(5, "swimming"),

	_BASKETBALL(6, "basketball"),

	_SOCCER(7, "soccer"),

	_TENNIS(8, "tennis"),

	_AMERICAN_FOOTBALL(9, "american_football"),

	_TRAINING(10, "training"),

	_WALKING(11, "walking"),

	_CROSS_COUNTRY_SKIING(12, "cross_country_skiing"),

	_ALPINE_SKIING(13, "alpine_skiing"),

	_SNOWBOARDING(14, "snowboarding"),

	_ROWING(15, "rowing"),

	_MOUNTAINEERING(16, "mountaineering"),

	_HIKING(17, "hiking"),

	_MULTISPORT(18, "multisport"),

	_PADDLING(19, "paddling"),

	_FLYING(20, "flying"),

	_E_BIKING(21, "e_biking"),

	_MOTORCYCLING(22, "motorcycling"),

	_BOATING(23, "boating"),

	_DRIVING(24, "driving"),

	_GOLF(25, "golf"),

	_HANG_GLIDING(26, "hang_gliding"),

	_HORSEBACK_RIDING(27, "horseback_riding"),

	_HUNTING(28, "hunting"),

	_FISHING(29, "fishing"),

	_INLINE_SKATING(30, "inline_skating"),

	_ROCK_CLIMBING(31, "rock_climbing"),

	_SAILING(32, "sailing"),

	_ICE_SKATING(33, "ice_skating"),

	_SKY_DIVING(34, "sky_diving"),

	_SNOWSHOEING(35, "snowshoeing"),

	_SNOWMOBILING(36, "snowmobiling"),

	_STAND_UP_PADDLEBOARDING(37, "stand_up_paddleboarding"),

	_SURFING(38, "surfing"),

	_WAKEBOARDING(39, "wakeboarding"),

	_WATER_SKIING(40, "water_skiing"),

	_KAYAKING(41, "kayaking"),

	_RAFTING(42, "rafting"),

	_WINDSURFING(43, "windsurfing"),

	_KITESURFING(44, "kitesurfing"),

	_TACTICAL(45, "tactical"),

	_JUMPMASTER(46, "jumpmaster"),

	_BOXING(47, "boxing"),

	_FLOOR_CLIMBING(48, "floor_climbing"),

	_BASEBALL(49, "baseball"),

	_DIVING(53, "diving"),

	_HIIT(62, "hiit"),

	_RACKET(64, "racket"),

	_WHEELCHAIR_PUSH_WALK(65, "wheelchair_push_walk"),

	_WHEELCHAIR_PUSH_RUN(66, "wheelchair_push_run"),

	_MEDITATION(67, "meditation"),

	_DISC_GOLF(69, "disc_golf"),

	_CRICKET(71, "cricket"),

	_RUGBY(72, "rugby"),

	_HOCKEY(73, "hockey"),

	_LACROSSE(74, "lacrosse"),

	_VOLLEYBALL(75, "volleyball"),

	_WATER_TUBING(76, "water_tubing"),

	_WAKESURFING(77, "wakesurfing"),

	_MIXED_MARTIAL_ARTS(80, "mixed_martial_arts"),

	_SNORKELING(82, "snorkeling"),

	_DANCE(83, "dance"),

	_JUMP_ROPE(84, "jump_rope"),

	_ALL(254, "all");

	private final int messageNumber;

	private final String messageName;

	SPORT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SPORT findById(int messageNumber) {
		for (SPORT name : SPORT.values()) {
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
