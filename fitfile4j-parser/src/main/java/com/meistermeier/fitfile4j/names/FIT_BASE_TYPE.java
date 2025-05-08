// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum FIT_BASE_TYPE {
  _ENUM(0, "enum"),

  _SINT8(1, "sint8"),

  _UINT8(2, "uint8"),

  _SINT16(131, "sint16"),

  _UINT16(132, "uint16"),

  _SINT32(133, "sint32"),

  _UINT32(134, "uint32"),

  _STRING(7, "string"),

  _FLOAT32(136, "float32"),

  _FLOAT64(137, "float64"),

  _UINT8Z(10, "uint8z"),

  _UINT16Z(139, "uint16z"),

  _UINT32Z(140, "uint32z"),

  _BYTE(13, "byte"),

  _SINT64(142, "sint64"),

  _UINT64(143, "uint64"),

  _UINT64Z(144, "uint64z");

  private final int messageNumber;

  private final String messageName;

  FIT_BASE_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static FIT_BASE_TYPE findById(int messageNumber) {
    for (FIT_BASE_TYPE name: FIT_BASE_TYPE.values()) {
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
