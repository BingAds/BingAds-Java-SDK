/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
