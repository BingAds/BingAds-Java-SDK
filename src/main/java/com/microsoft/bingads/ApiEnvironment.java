package com.microsoft.bingads;

/**
 * Represents Bing Ads API environment (Production or Sandbox).
 */
public enum ApiEnvironment {
    
    /**
     * Production
     */
    PRODUCTION("Production"),

    /**
     * Sandbox
     */
    SANDBOX("Sandbox");
        
    private final String value;

    ApiEnvironment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiEnvironment fromValue(String v) {
        for (ApiEnvironment c : ApiEnvironment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
