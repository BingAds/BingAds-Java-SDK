package com.microsoft.bingads.internal;

import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;

/**
 * Reserved for internal use. 
 */
public class ErrorMessages {
	public static final String UriDoesntContainCode = "Uri passed doesn't contain code param. Please make sure the uri has a code in it, for example http://myurl.com?code=123";

    public static final String UriDoesntContainAccessToken = "Uri passed doesn't contain access_token param. Please make sure the has an access_token param in it";

    public static final String UriDoesntContainExpiresIn = "Uri passed doesn't contain expires_in param. Please make sure the has an expires_in param in it";

    public static final String UriDoesntContainState = "Uri passed doesn't contain state param while authentication requires a state verification. Please make sure the uri has a state in it, for example http://myurl.com?code=123&state=MyState";

    public static final String UriDoesntMatchState = "The state passed in Uri does not match the state value specified in authentication";


    public static final String UserDataAuthenticationIsNull = "User Data Authentication is null";
    
    public static final String UserDataDeveloperTokenIsNull = "User Data Developer Token is null";
    
    public static final String OAuthError = "Couldn't request OAuth AccessTokens. Please use the getDetails() method to get more information";
    
    public static final String FormatVersionIsNotSupported = "Format version is not supported: ";

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
