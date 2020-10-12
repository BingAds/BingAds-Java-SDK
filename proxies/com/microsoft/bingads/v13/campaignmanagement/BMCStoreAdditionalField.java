package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for BMCStoreAdditionalField.
 */
public enum BMCStoreAdditionalField {

    GLOBAL_STORE("GlobalStore");
        
    private final String value;

    BMCStoreAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BMCStoreAdditionalField fromValue(String v) {
        for (BMCStoreAdditionalField c : BMCStoreAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}