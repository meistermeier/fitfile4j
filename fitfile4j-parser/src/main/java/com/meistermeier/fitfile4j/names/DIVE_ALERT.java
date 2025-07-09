// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum DIVE_ALERT {
	_NDL_REACHED(0, "ndl_reached"),

	_GAS_SWITCH_PROMPTED(1, "gas_switch_prompted"),

	_NEAR_SURFACE(2, "near_surface"),

	_APPROACHING_NDL(3, "approaching_ndl"),

	_PO2_WARN(4, "po2_warn"),

	_PO2_CRIT_HIGH(5, "po2_crit_high"),

	_PO2_CRIT_LOW(6, "po2_crit_low"),

	_TIME_ALERT(7, "time_alert"),

	_DEPTH_ALERT(8, "depth_alert"),

	_DECO_CEILING_BROKEN(9, "deco_ceiling_broken"),

	_DECO_COMPLETE(10, "deco_complete"),

	_SAFETY_STOP_BROKEN(11, "safety_stop_broken"),

	_SAFETY_STOP_COMPLETE(12, "safety_stop_complete"),

	_CNS_WARNING(13, "cns_warning"),

	_CNS_CRITICAL(14, "cns_critical"),

	_OTU_WARNING(15, "otu_warning"),

	_OTU_CRITICAL(16, "otu_critical"),

	_ASCENT_CRITICAL(17, "ascent_critical"),

	_ALERT_DISMISSED_BY_KEY(18, "alert_dismissed_by_key"),

	_ALERT_DISMISSED_BY_TIMEOUT(19, "alert_dismissed_by_timeout"),

	_BATTERY_LOW(20, "battery_low"),

	_BATTERY_CRITICAL(21, "battery_critical"),

	_SAFETY_STOP_STARTED(22, "safety_stop_started"),

	_APPROACHING_FIRST_DECO_STOP(23, "approaching_first_deco_stop"),

	_SETPOINT_SWITCH_AUTO_LOW(24, "setpoint_switch_auto_low"),

	_SETPOINT_SWITCH_AUTO_HIGH(25, "setpoint_switch_auto_high"),

	_SETPOINT_SWITCH_MANUAL_LOW(26, "setpoint_switch_manual_low"),

	_SETPOINT_SWITCH_MANUAL_HIGH(27, "setpoint_switch_manual_high"),

	_AUTO_SETPOINT_SWITCH_IGNORED(28, "auto_setpoint_switch_ignored"),

	_SWITCHED_TO_OPEN_CIRCUIT(29, "switched_to_open_circuit"),

	_SWITCHED_TO_CLOSED_CIRCUIT(30, "switched_to_closed_circuit"),

	_TANK_BATTERY_LOW(32, "tank_battery_low"),

	_PO2_CCR_DIL_LOW(33, "po2_ccr_dil_low"),

	_DECO_STOP_CLEARED(34, "deco_stop_cleared"),

	_APNEA_NEUTRAL_BUOYANCY(35, "apnea_neutral_buoyancy"),

	_APNEA_TARGET_DEPTH(36, "apnea_target_depth"),

	_APNEA_SURFACE(37, "apnea_surface"),

	_APNEA_HIGH_SPEED(38, "apnea_high_speed"),

	_APNEA_LOW_SPEED(39, "apnea_low_speed");

	private final int messageNumber;

	private final String messageName;

	DIVE_ALERT(int messageNumber, String messageName) {
		this.messageNumber = messageNumber;
		this.messageName = messageName;
	}

	public static DIVE_ALERT findById(int messageNumber) {
		for (DIVE_ALERT name: DIVE_ALERT.values()) {
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
