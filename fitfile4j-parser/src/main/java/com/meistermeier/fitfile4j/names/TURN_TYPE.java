// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum TURN_TYPE {
  _ARRIVING_IDX(0, "arriving_idx"),

  _ARRIVING_LEFT_IDX(1, "arriving_left_idx"),

  _ARRIVING_RIGHT_IDX(2, "arriving_right_idx"),

  _ARRIVING_VIA_IDX(3, "arriving_via_idx"),

  _ARRIVING_VIA_LEFT_IDX(4, "arriving_via_left_idx"),

  _ARRIVING_VIA_RIGHT_IDX(5, "arriving_via_right_idx"),

  _BEAR_KEEP_LEFT_IDX(6, "bear_keep_left_idx"),

  _BEAR_KEEP_RIGHT_IDX(7, "bear_keep_right_idx"),

  _CONTINUE_IDX(8, "continue_idx"),

  _EXIT_LEFT_IDX(9, "exit_left_idx"),

  _EXIT_RIGHT_IDX(10, "exit_right_idx"),

  _FERRY_IDX(11, "ferry_idx"),

  _ROUNDABOUT_45_IDX(12, "roundabout_45_idx"),

  _ROUNDABOUT_90_IDX(13, "roundabout_90_idx"),

  _ROUNDABOUT_135_IDX(14, "roundabout_135_idx"),

  _ROUNDABOUT_180_IDX(15, "roundabout_180_idx"),

  _ROUNDABOUT_225_IDX(16, "roundabout_225_idx"),

  _ROUNDABOUT_270_IDX(17, "roundabout_270_idx"),

  _ROUNDABOUT_315_IDX(18, "roundabout_315_idx"),

  _ROUNDABOUT_360_IDX(19, "roundabout_360_idx"),

  _ROUNDABOUT_NEG_45_IDX(20, "roundabout_neg_45_idx"),

  _ROUNDABOUT_NEG_90_IDX(21, "roundabout_neg_90_idx"),

  _ROUNDABOUT_NEG_135_IDX(22, "roundabout_neg_135_idx"),

  _ROUNDABOUT_NEG_180_IDX(23, "roundabout_neg_180_idx"),

  _ROUNDABOUT_NEG_225_IDX(24, "roundabout_neg_225_idx"),

  _ROUNDABOUT_NEG_270_IDX(25, "roundabout_neg_270_idx"),

  _ROUNDABOUT_NEG_315_IDX(26, "roundabout_neg_315_idx"),

  _ROUNDABOUT_NEG_360_IDX(27, "roundabout_neg_360_idx"),

  _ROUNDABOUT_GENERIC_IDX(28, "roundabout_generic_idx"),

  _ROUNDABOUT_NEG_GENERIC_IDX(29, "roundabout_neg_generic_idx"),

  _SHARP_TURN_LEFT_IDX(30, "sharp_turn_left_idx"),

  _SHARP_TURN_RIGHT_IDX(31, "sharp_turn_right_idx"),

  _TURN_LEFT_IDX(32, "turn_left_idx"),

  _TURN_RIGHT_IDX(33, "turn_right_idx"),

  _UTURN_LEFT_IDX(34, "uturn_left_idx"),

  _UTURN_RIGHT_IDX(35, "uturn_right_idx"),

  _ICON_INV_IDX(36, "icon_inv_idx"),

  _ICON_IDX_CNT(37, "icon_idx_cnt");

  private final int messageNumber;

  private final String messageName;

  TURN_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static TURN_TYPE findById(int messageNumber) {
    for (TURN_TYPE name: TURN_TYPE.values()) {
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
