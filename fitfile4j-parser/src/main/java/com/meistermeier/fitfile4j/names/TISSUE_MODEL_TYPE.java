// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TISSUE_MODEL_TYPE {
	_ZHL_16C(0, "zhl_16c");

	private final int messageNumber;

	private final String messageName;

	TISSUE_MODEL_TYPE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static TISSUE_MODEL_TYPE findById(int messageNumber) {
		for (TISSUE_MODEL_TYPE name: TISSUE_MODEL_TYPE.values()) {
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
