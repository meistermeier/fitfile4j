// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TIME_ZONE {
	_ALMATY(0, "almaty"),

	_BANGKOK(1, "bangkok"),

	_BOMBAY(2, "bombay"),

	_BRASILIA(3, "brasilia"),

	_CAIRO(4, "cairo"),

	_CAPE_VERDE_IS(5, "cape_verde_is"),

	_DARWIN(6, "darwin"),

	_ENIWETOK(7, "eniwetok"),

	_FIJI(8, "fiji"),

	_HONG_KONG(9, "hong_kong"),

	_ISLAMABAD(10, "islamabad"),

	_KABUL(11, "kabul"),

	_MAGADAN(12, "magadan"),

	_MID_ATLANTIC(13, "mid_atlantic"),

	_MOSCOW(14, "moscow"),

	_MUSCAT(15, "muscat"),

	_NEWFOUNDLAND(16, "newfoundland"),

	_SAMOA(17, "samoa"),

	_SYDNEY(18, "sydney"),

	_TEHRAN(19, "tehran"),

	_TOKYO(20, "tokyo"),

	_US_ALASKA(21, "us_alaska"),

	_US_ATLANTIC(22, "us_atlantic"),

	_US_CENTRAL(23, "us_central"),

	_US_EASTERN(24, "us_eastern"),

	_US_HAWAII(25, "us_hawaii"),

	_US_MOUNTAIN(26, "us_mountain"),

	_US_PACIFIC(27, "us_pacific"),

	_OTHER(28, "other"),

	_AUCKLAND(29, "auckland"),

	_KATHMANDU(30, "kathmandu"),

	_EUROPE_WESTERN_WET(31, "europe_western_wet"),

	_EUROPE_CENTRAL_CET(32, "europe_central_cet"),

	_EUROPE_EASTERN_EET(33, "europe_eastern_eet"),

	_JAKARTA(34, "jakarta"),

	_PERTH(35, "perth"),

	_ADELAIDE(36, "adelaide"),

	_BRISBANE(37, "brisbane"),

	_TASMANIA(38, "tasmania"),

	_ICELAND(39, "iceland"),

	_AMSTERDAM(40, "amsterdam"),

	_ATHENS(41, "athens"),

	_BARCELONA(42, "barcelona"),

	_BERLIN(43, "berlin"),

	_BRUSSELS(44, "brussels"),

	_BUDAPEST(45, "budapest"),

	_COPENHAGEN(46, "copenhagen"),

	_DUBLIN(47, "dublin"),

	_HELSINKI(48, "helsinki"),

	_LISBON(49, "lisbon"),

	_LONDON(50, "london"),

	_MADRID(51, "madrid"),

	_MUNICH(52, "munich"),

	_OSLO(53, "oslo"),

	_PARIS(54, "paris"),

	_PRAGUE(55, "prague"),

	_REYKJAVIK(56, "reykjavik"),

	_ROME(57, "rome"),

	_STOCKHOLM(58, "stockholm"),

	_VIENNA(59, "vienna"),

	_WARSAW(60, "warsaw"),

	_ZURICH(61, "zurich"),

	_QUEBEC(62, "quebec"),

	_ONTARIO(63, "ontario"),

	_MANITOBA(64, "manitoba"),

	_SASKATCHEWAN(65, "saskatchewan"),

	_ALBERTA(66, "alberta"),

	_BRITISH_COLUMBIA(67, "british_columbia"),

	_BOISE(68, "boise"),

	_BOSTON(69, "boston"),

	_CHICAGO(70, "chicago"),

	_DALLAS(71, "dallas"),

	_DENVER(72, "denver"),

	_KANSAS_CITY(73, "kansas_city"),

	_LAS_VEGAS(74, "las_vegas"),

	_LOS_ANGELES(75, "los_angeles"),

	_MIAMI(76, "miami"),

	_MINNEAPOLIS(77, "minneapolis"),

	_NEW_YORK(78, "new_york"),

	_NEW_ORLEANS(79, "new_orleans"),

	_PHOENIX(80, "phoenix"),

	_SANTA_FE(81, "santa_fe"),

	_SEATTLE(82, "seattle"),

	_WASHINGTON_DC(83, "washington_dc"),

	_US_ARIZONA(84, "us_arizona"),

	_CHITA(85, "chita"),

	_EKATERINBURG(86, "ekaterinburg"),

	_IRKUTSK(87, "irkutsk"),

	_KALININGRAD(88, "kaliningrad"),

	_KRASNOYARSK(89, "krasnoyarsk"),

	_NOVOSIBIRSK(90, "novosibirsk"),

	_PETROPAVLOVSK_KAMCHATSKIY(91, "petropavlovsk_kamchatskiy"),

	_SAMARA(92, "samara"),

	_VLADIVOSTOK(93, "vladivostok"),

	_MEXICO_CENTRAL(94, "mexico_central"),

	_MEXICO_MOUNTAIN(95, "mexico_mountain"),

	_MEXICO_PACIFIC(96, "mexico_pacific"),

	_CAPE_TOWN(97, "cape_town"),

	_WINKHOEK(98, "winkhoek"),

	_LAGOS(99, "lagos"),

	_RIYAHD(100, "riyahd"),

	_VENEZUELA(101, "venezuela"),

	_AUSTRALIA_LH(102, "australia_lh"),

	_SANTIAGO(103, "santiago"),

	_MANUAL(253, "manual"),

	_AUTOMATIC(254, "automatic");

	private final int messageNumber;

	private final String messageName;

	TIME_ZONE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static TIME_ZONE findById(int messageNumber) {
		for (TIME_ZONE name: TIME_ZONE.values()) {
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
