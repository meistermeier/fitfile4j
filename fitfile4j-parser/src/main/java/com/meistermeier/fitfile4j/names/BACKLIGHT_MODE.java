// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BACKLIGHT_MODE {

	_OFF(0, "off"),

	_MANUAL(1, "manual"),

	_KEY_AND_MESSAGES(2, "key_and_messages"),

	_AUTO_BRIGHTNESS(3, "auto_brightness"),

	_SMART_NOTIFICATIONS(4, "smart_notifications"),

	_KEY_AND_MESSAGES_NIGHT(5, "key_and_messages_night"),

	_KEY_AND_MESSAGES_AND_SMART_NOTIFICATIONS(6, "key_and_messages_and_smart_notifications");

	private final int messageNumber;

	private final String messageName;

	BACKLIGHT_MODE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BACKLIGHT_MODE findById(int messageNumber) {
		for (BACKLIGHT_MODE name : BACKLIGHT_MODE.values()) {
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
