package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for HotelAdGroupType.
 */
public enum HotelAdGroupType {

    HOTEL_AD("HotelAd"),
    PROPERTY_AD("PropertyAd");
        
    private final String value;

    HotelAdGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelAdGroupType fromValue(String v) {
        for (HotelAdGroupType c : HotelAdGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}