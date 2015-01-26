package com.microsoft.bingads.campaignmanagement;

/**
 * Enum class for MediaEnabledEntityFilter.
 */
public enum MediaEnabledEntityFilter {

    IMAGE_AD_EXTENSION("ImageAdExtension");
        
    private final String value;

    MediaEnabledEntityFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaEnabledEntityFilter fromValue(String v) {
        for (MediaEnabledEntityFilter c : MediaEnabledEntityFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}