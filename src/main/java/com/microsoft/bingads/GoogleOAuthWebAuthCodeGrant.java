package com.microsoft.bingads;

import java.net.URL;

import com.microsoft.bingads.internal.OAuthService;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;

/**
 * Represents a Google OAuth authorization object implementing the authorization code grant flow for use in a web application. 
 */
public class GoogleOAuthWebAuthCodeGrant extends OAuthWithAuthorizationCode {
	
	public GoogleOAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, ApiEnvironment env) {
        super(clientId, clientSecret, redirectionUrl, env, OAuthScope.GOOGLE_OPENID, false);
    }
	
    public GoogleOAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, String refreshToken, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, clientSecret, redirectionUrl, refreshToken, env, oAuthScope, false);
    }
    
    /**
     * Creates new instance of the class that can be used in the {@link AuthorizationData} object.
     *
     * See this page for additional information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUrl redirect URL
     * @param env Bing Ads Environment
     * @param oAuthScope OAuth Scope
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */  
    public GoogleOAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, clientSecret, redirectionUrl, env, oAuthScope, false);
    }

    /**
     * Creates new instance of the class that can be used in the {@link AuthorizationData} object.
     *
     * See this page for additional information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUrl redirect URL
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * @param env Bing Ads Environment
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */ 
    public GoogleOAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, clientSecret, redirectionUrl, oauthTokens, env, oAuthScope, false);        
    }

    /**
     * Creates new instance of the class with a specified OAuthService object.
     *
     * See this page for additional information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUri redirect URL
     * @param oAuthService custom {@link OAuthService} object
     * @param env Bing Ads Environment
     * @param oAuthScope OAuth Scope
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */
    public GoogleOAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUri, OAuthService oAuthService, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, clientSecret, redirectionUri, oAuthService, env, oAuthScope, false);
    }
}
