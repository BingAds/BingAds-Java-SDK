/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal;

import com.microsoft.bingads.bulk.BulkDownloadEntity;

public enum ApiEnvironment {
    
    PRODUCTION("Production"),
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
