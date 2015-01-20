/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

public class OAuthTokenRequestException extends RuntimeException {
    
    private final OAuthErrorDetails details;
    
    public OAuthTokenRequestException(String message, OAuthErrorDetails details) {
        super(message);
        
        this.details = details;
    }
    
    public OAuthErrorDetails getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return super.toString() + ". Details: " + details.getError() + " - " + details.getDescription();
    }        
}
