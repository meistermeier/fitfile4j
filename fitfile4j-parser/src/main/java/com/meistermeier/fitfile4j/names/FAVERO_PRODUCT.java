// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FAVERO_PRODUCT {
  _ASSIOMA_UNO(10, "assioma_uno"),

  _ASSIOMA_DUO(12, "assioma_duo");

  private final int messageNumber;

  private final String messageName;

  FAVERO_PRODUCT(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static FAVERO_PRODUCT findById(int messageNumber) {
    for (FAVERO_PRODUCT name: FAVERO_PRODUCT.values()) {
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
