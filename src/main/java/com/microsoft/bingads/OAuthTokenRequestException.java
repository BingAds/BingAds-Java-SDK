/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

/**
 * This exception is thrown if an error was returned from the Microsoft Account authorization server.
 */
public class OAuthTokenRequestException extends RuntimeException {
    
    private final OAuthErrorDetails details;
    
    /**
     * Initializes a new instance of the OAuthTokenRequestException with the specified error message and OAuth error details.
     * @param message
     * @param details
     */
    public OAuthTokenRequestException(String message, OAuthErrorDetails details) {
        super(message);
        
        this.details = details;
    }
    
    /**
     * Gets details of an error returned from the Microsoft Account authorization server.
     * @return
     */
    public OAuthErrorDetails getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return super.toString() + ". Details: " + details.getError() + " - " + details.getDescription();
    }        
}
