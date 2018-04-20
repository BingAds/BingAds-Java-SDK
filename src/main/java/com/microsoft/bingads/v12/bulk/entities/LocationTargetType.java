package com.microsoft.bingads.v12.bulk.entities;

/**
 * Location target type, determines whether a string location is a City, State etc.
 */
public enum LocationTargetType {
    POSTAL_CODE("PostalCode"),
    CITY("City"),
    METRO_AREA("MetroArea"),
    STATE("State"),
    COUNTRY("Country");
        
    private final String value;

    LocationTargetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationTargetType fromValue(String v) {
        for (LocationTargetType c : LocationTargetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
