package com.microsoft.bingads.v13.bulk.entities;

/**
 * Provides possible attribute types for bulk Ad Customizer Attributes.
 */
public enum AttributeType {
	UNKNOW("Unknow"),
	NUMBER("Number"),
	STRING("String"),
	PRICE("Price"),
	PERCENT("Percent");
	
	private final String value;

	AttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeType fromValue(String v) {
        for (AttributeType c : AttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        return UNKNOW;
    }
}
