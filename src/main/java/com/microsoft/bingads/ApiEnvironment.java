package com.microsoft.bingads;

import java.util.Arrays;

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
        return Arrays.stream(values()).filter((env) -> env.value.equals(v)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(v));
    }
}
