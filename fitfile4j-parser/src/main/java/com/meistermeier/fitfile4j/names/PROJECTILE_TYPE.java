// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum PROJECTILE_TYPE {
  _ARROW(0, "arrow"),

  _RIFLE_CARTRIDGE(1, "rifle_cartridge"),

  _PISTOL_CARTRIDGE(2, "pistol_cartridge"),

  _SHOTSHELL(3, "shotshell"),

  _AIR_RIFLE_PELLET(4, "air_rifle_pellet"),

  _OTHER(5, "other");

  private final int messageNumber;

  private final String messageName;

  PROJECTILE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static PROJECTILE_TYPE findById(int messageNumber) {
    for (PROJECTILE_TYPE name: PROJECTILE_TYPE.values()) {
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
