package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AppStore.
 */
public enum AppStore {

    GOOGLE_APP_STORE("GoogleAppStore"),
    APPLE_APP_STORE("AppleAppStore"),
    MICROSOFT_APP_STORE("MicrosoftAppStore");
        
    private final String value;

    AppStore(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppStore fromValue(String v) {
        for (AppStore c : AppStore.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}