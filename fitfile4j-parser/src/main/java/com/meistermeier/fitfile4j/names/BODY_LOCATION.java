// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum BODY_LOCATION {
	_LEFT_LEG(0, "left_leg"),

	_LEFT_CALF(1, "left_calf"),

	_LEFT_SHIN(2, "left_shin"),

	_LEFT_HAMSTRING(3, "left_hamstring"),

	_LEFT_QUAD(4, "left_quad"),

	_LEFT_GLUTE(5, "left_glute"),

	_RIGHT_LEG(6, "right_leg"),

	_RIGHT_CALF(7, "right_calf"),

	_RIGHT_SHIN(8, "right_shin"),

	_RIGHT_HAMSTRING(9, "right_hamstring"),

	_RIGHT_QUAD(10, "right_quad"),

	_RIGHT_GLUTE(11, "right_glute"),

	_TORSO_BACK(12, "torso_back"),

	_LEFT_LOWER_BACK(13, "left_lower_back"),

	_LEFT_UPPER_BACK(14, "left_upper_back"),

	_RIGHT_LOWER_BACK(15, "right_lower_back"),

	_RIGHT_UPPER_BACK(16, "right_upper_back"),

	_TORSO_FRONT(17, "torso_front"),

	_LEFT_ABDOMEN(18, "left_abdomen"),

	_LEFT_CHEST(19, "left_chest"),

	_RIGHT_ABDOMEN(20, "right_abdomen"),

	_RIGHT_CHEST(21, "right_chest"),

	_LEFT_ARM(22, "left_arm"),

	_LEFT_SHOULDER(23, "left_shoulder"),

	_LEFT_BICEP(24, "left_bicep"),

	_LEFT_TRICEP(25, "left_tricep"),

	_LEFT_BRACHIORADIALIS(26, "left_brachioradialis"),

	_LEFT_FOREARM_EXTENSORS(27, "left_forearm_extensors"),

	_RIGHT_ARM(28, "right_arm"),

	_RIGHT_SHOULDER(29, "right_shoulder"),

	_RIGHT_BICEP(30, "right_bicep"),

	_RIGHT_TRICEP(31, "right_tricep"),

	_RIGHT_BRACHIORADIALIS(32, "right_brachioradialis"),

	_RIGHT_FOREARM_EXTENSORS(33, "right_forearm_extensors"),

	_NECK(34, "neck"),

	_THROAT(35, "throat"),

	_WAIST_MID_BACK(36, "waist_mid_back"),

	_WAIST_FRONT(37, "waist_front"),

	_WAIST_LEFT(38, "waist_left"),

	_WAIST_RIGHT(39, "waist_right");

	private final int messageNumber;

	private final String messageName;

	BODY_LOCATION(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static BODY_LOCATION findById(int messageNumber) {
		for (BODY_LOCATION name: BODY_LOCATION.values()) {
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
