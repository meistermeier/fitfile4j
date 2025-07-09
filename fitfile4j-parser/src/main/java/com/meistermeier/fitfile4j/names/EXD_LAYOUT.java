// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXD_LAYOUT {
	_FULL_SCREEN(0, "full_screen"),

	_HALF_VERTICAL(1, "half_vertical"),

	_HALF_HORIZONTAL(2, "half_horizontal"),

	_HALF_VERTICAL_RIGHT_SPLIT(3, "half_vertical_right_split"),

	_HALF_HORIZONTAL_BOTTOM_SPLIT(4, "half_horizontal_bottom_split"),

	_FULL_QUARTER_SPLIT(5, "full_quarter_split"),

	_HALF_VERTICAL_LEFT_SPLIT(6, "half_vertical_left_split"),

	_HALF_HORIZONTAL_TOP_SPLIT(7, "half_horizontal_top_split"),

	_DYNAMIC(8, "dynamic");

	private final int messageNumber;

	private final String messageName;

	EXD_LAYOUT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EXD_LAYOUT findById(int messageNumber) {
		for (EXD_LAYOUT name: EXD_LAYOUT.values()) {
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
