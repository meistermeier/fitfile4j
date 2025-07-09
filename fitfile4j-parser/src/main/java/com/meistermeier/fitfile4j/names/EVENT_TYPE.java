// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EVENT_TYPE {
	_START(0, "start"),

	_STOP(1, "stop"),

	_CONSECUTIVE_DEPRECIATED(2, "consecutive_depreciated"),

	_MARKER(3, "marker"),

	_STOP_ALL(4, "stop_all"),

	_BEGIN_DEPRECIATED(5, "begin_depreciated"),

	_END_DEPRECIATED(6, "end_depreciated"),

	_END_ALL_DEPRECIATED(7, "end_all_depreciated"),

	_STOP_DISABLE(8, "stop_disable"),

	_STOP_DISABLE_ALL(9, "stop_disable_all");

	private final int messageNumber;

	private final String messageName;

	EVENT_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static EVENT_TYPE findById(int messageNumber) {
		for (EVENT_TYPE name: EVENT_TYPE.values()) {
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
