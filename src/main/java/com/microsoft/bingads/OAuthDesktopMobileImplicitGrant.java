package com.microsoft.bingads;

import com.microsoft.bingads.internal.OAuthEndpointHelper;
import com.microsoft.bingads.internal.OAuthImplicitGrant;

/**
 * Represents an OAuth authorization object implementing the implicit grant flow for use in a desktop or mobile application.  
 */
public class OAuthDesktopMobileImplicitGrant extends OAuthImplicitGrant {

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * 
     * @see <a href="https://tools.ietf.org/html/rfc6749#section-4.1">https://tools.ietf.org/html/rfc6749#section-4.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId) {
        this(clientId, defaultEnv);
    }
    
    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param env Bing Ads Environment
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId, ApiEnvironment env) {
        this(clientId, null, env, OAuthScope.MSADS_MANAGE);
    }


    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId, OAuthTokens oauthTokens) {
        this(clientId, oauthTokens, defaultEnv);
    }   
    
    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * @param env Bing Ads Environment
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env) {
        this(clientId, oauthTokens, env, OAuthScope.MSADS_MANAGE);
    }

    public OAuthDesktopMobileImplicitGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, OAuthEndpointHelper.getOauthEndpoint(env,  oAuthScope).getDesktopRedirectUrl(), oauthTokens, env, oAuthScope);
    }
}
