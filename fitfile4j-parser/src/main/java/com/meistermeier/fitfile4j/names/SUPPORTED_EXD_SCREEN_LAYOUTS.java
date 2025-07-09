// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum SUPPORTED_EXD_SCREEN_LAYOUTS {
	_FULL_SCREEN(1L, "full_screen"),

	_HALF_VERTICAL(2L, "half_vertical"),

	_HALF_HORIZONTAL(4L, "half_horizontal"),

	_HALF_VERTICAL_RIGHT_SPLIT(8L, "half_vertical_right_split"),

	_HALF_HORIZONTAL_BOTTOM_SPLIT(16L, "half_horizontal_bottom_split"),

	_FULL_QUARTER_SPLIT(32L, "full_quarter_split"),

	_HALF_VERTICAL_LEFT_SPLIT(64L, "half_vertical_left_split"),

	_HALF_HORIZONTAL_TOP_SPLIT(128L, "half_horizontal_top_split");

	private final long messageNumber;

	private final String messageName;

	SUPPORTED_EXD_SCREEN_LAYOUTS(long messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static SUPPORTED_EXD_SCREEN_LAYOUTS findById(long messageNumber) {
		for (SUPPORTED_EXD_SCREEN_LAYOUTS name: SUPPORTED_EXD_SCREEN_LAYOUTS.values()) {
			if (name.messageNumber == messageNumber) {
				return name;
			}
		}
		return null;
	}

	public Long getMessageNumber() {
		return this.messageNumber;
	}

	public String getMessageName() {
		return this.messageName;
	}
}
