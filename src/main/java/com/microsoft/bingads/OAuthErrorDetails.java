/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

/**
 * Represents details of an error returned from the Microsoft Account authorization server.
 */
public class OAuthErrorDetails {
    
    private String error;
    
    private String description;
    
    /**
     * Gets the error code of the OAuth error.
     * @return
     */
    public String getError() {
        return error;
    }
    
    /**
     * Reserved for internal use.
     * @param value
     */
    public void setError(String value) {
        error = value;
    }
    
    /**
     * Gets the description of the OAuth error.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Reserved for internal use.
     * @param value
     */
    public void setDescription(String value) {
        description = value;
    }
}
