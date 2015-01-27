package com.microsoft.bingads.internal;

import com.fasterxml.jackson.annotation.JsonProperty;

class OAuthErrorDetailsContract {
    
    @JsonProperty("error")
    private String error;
    
    @JsonProperty("error_description")
    private String description;
    
    public String getError() {
        return error;
    }
    
    public String getDescription() {
        return description;
    }
}
