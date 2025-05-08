// auto-generated file from Profile.xlsx
package com.meistermeier.fitfile4j.names;

public enum EXD_DISPLAY_TYPE {
  _NUMERICAL(0, "numerical"),

  _SIMPLE(1, "simple"),

  _GRAPH(2, "graph"),

  _BAR(3, "bar"),

  _CIRCLE_GRAPH(4, "circle_graph"),

  _VIRTUAL_PARTNER(5, "virtual_partner"),

  _BALANCE(6, "balance"),

  _STRING_LIST(7, "string_list"),

  _STRING(8, "string"),

  _SIMPLE_DYNAMIC_ICON(9, "simple_dynamic_icon"),

  _GAUGE(10, "gauge");

  private final int messageNumber;

  private final String messageName;

  EXD_DISPLAY_TYPE(int messageNumber, String messageName) {
    this.messageNumber = messageNumber;
    this.messageName = messageName;
  }

  public static EXD_DISPLAY_TYPE findById(int messageNumber) {
    for (EXD_DISPLAY_TYPE name: EXD_DISPLAY_TYPE.values()) {
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
