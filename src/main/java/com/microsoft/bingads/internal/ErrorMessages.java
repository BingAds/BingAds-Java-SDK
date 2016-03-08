package com.microsoft.bingads.internal;

import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;

/**
 * Reserved for internal use. 
 */
public class ErrorMessages {

    public static final String UserDataAuthenticationIsNull = "User Data Authentication is null";
    public static final String UserDataDeveloperTokenIsNull = "User Data Developer Token is null";
    
    public static final String OAuthError = "Couldn't request OAuth AccessTokens. Please use the getDetails() method to get more information";

    private ErrorMessages() {
    }

    public static String getFullOAuthAccessTokenNotRequestedMessage(Class oAuthType) {

        String classAndMethod = "the corresponding OAuth class method"; // in the case we add a new OAuth class and forget to update this method

        if (OAuthWithAuthorizationCode.class.isAssignableFrom(oAuthType)) {
            classAndMethod = OAuthWithAuthorizationCode.class.getName() + ".requestAccessAndRefreshTokens";
        } else if (OAuthDesktopMobileImplicitGrant.class.isAssignableFrom(oAuthType)) {
            classAndMethod = OAuthDesktopMobileImplicitGrant.class.getName() + ".extractAccessTokenFromUri";
        }

        return "OAuth access token hasn't been requested. Please request it using " + classAndMethod + " before calling this method";
    }

    public static String getPropertyMustNotBeNullMessage(String entityType,
            String propertyName) {
        return String.format("Property %s.%s must not be null when calling writeEntity.", entityType, propertyName);
    }

    public static String getListMustNotBeEmptyMessage(String entityType,
            String propertyName) {
        return String.format("List %s.%s must not be null or empty when calling WriteEntity.", entityType, propertyName);
    }

}
