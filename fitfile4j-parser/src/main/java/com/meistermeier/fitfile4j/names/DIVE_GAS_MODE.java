// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIVE_GAS_MODE {

	_OPEN_CIRCUIT(0, "open_circuit"),

	_CLOSED_CIRCUIT_DILUENT(1, "closed_circuit_diluent");

	private final int messageNumber;

	private final String messageName;

	DIVE_GAS_MODE(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DIVE_GAS_MODE findById(int messageNumber) {
		for (DIVE_GAS_MODE name : DIVE_GAS_MODE.values()) {
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
