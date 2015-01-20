/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

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
