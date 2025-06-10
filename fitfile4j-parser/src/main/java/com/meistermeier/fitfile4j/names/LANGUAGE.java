// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum LANGUAGE {

	_ENGLISH(0, "english"),

	_FRENCH(1, "french"),

	_ITALIAN(2, "italian"),

	_GERMAN(3, "german"),

	_SPANISH(4, "spanish"),

	_CROATIAN(5, "croatian"),

	_CZECH(6, "czech"),

	_DANISH(7, "danish"),

	_DUTCH(8, "dutch"),

	_FINNISH(9, "finnish"),

	_GREEK(10, "greek"),

	_HUNGARIAN(11, "hungarian"),

	_NORWEGIAN(12, "norwegian"),

	_POLISH(13, "polish"),

	_PORTUGUESE(14, "portuguese"),

	_SLOVAKIAN(15, "slovakian"),

	_SLOVENIAN(16, "slovenian"),

	_SWEDISH(17, "swedish"),

	_RUSSIAN(18, "russian"),

	_TURKISH(19, "turkish"),

	_LATVIAN(20, "latvian"),

	_UKRAINIAN(21, "ukrainian"),

	_ARABIC(22, "arabic"),

	_FARSI(23, "farsi"),

	_BULGARIAN(24, "bulgarian"),

	_ROMANIAN(25, "romanian"),

	_CHINESE(26, "chinese"),

	_JAPANESE(27, "japanese"),

	_KOREAN(28, "korean"),

	_TAIWANESE(29, "taiwanese"),

	_THAI(30, "thai"),

	_HEBREW(31, "hebrew"),

	_BRAZILIAN_PORTUGUESE(32, "brazilian_portuguese"),

	_INDONESIAN(33, "indonesian"),

	_MALAYSIAN(34, "malaysian"),

	_VIETNAMESE(35, "vietnamese"),

	_BURMESE(36, "burmese"),

	_MONGOLIAN(37, "mongolian"),

	_CUSTOM(254, "custom");

	private final int messageNumber;

	private final String messageName;

	LANGUAGE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static LANGUAGE findById(int messageNumber) {
		for (LANGUAGE name : LANGUAGE.values()) {
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
