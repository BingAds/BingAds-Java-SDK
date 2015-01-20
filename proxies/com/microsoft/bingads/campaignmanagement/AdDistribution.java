package com.microsoft.bingads.campaignmanagement;

public enum AdDistribution {

    SEARCH("Search"),
    CONTENT("Content");
        
    private final String value;

    AdDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdDistribution fromValue(String v) {
        for (AdDistribution c : AdDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}