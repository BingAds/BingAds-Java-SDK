package com.microsoft.bingads;

/**
 * This exception is thrown if an error was returned from the Microsoft Account authorization server.
 * To resolve this exception you can first check the stack trace to see the error details, in case there is some action you can take to resolve the issue.
 * For example you might have specified an invalid client ID.
 */
public class OAuthTokenRequestException extends RuntimeException {
    
    private final OAuthErrorDetails details;
    
    /**
     * Initializes a new instance of the OAuthTokenRequestException with the specified error message and OAuth error details.
     *
     * @param message the error message returned by the client library
     * @param details the details of an error returned from the Microsoft Account authorization server
     */
    public OAuthTokenRequestException(String message, OAuthErrorDetails details) {
        super(message);
        
        this.details = details;
    }
    
    /**
     * Gets details of an error returned from the Microsoft Account authorization server.
     */
    public OAuthErrorDetails getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return super.toString() + ". Details: " + details.getError() + " - " + details.getDescription();
    }        
}
