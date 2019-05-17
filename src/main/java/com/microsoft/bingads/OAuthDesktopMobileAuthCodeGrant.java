package com.microsoft.bingads;

import com.microsoft.bingads.internal.OAuthEndpointHelper;
import com.microsoft.bingads.internal.OAuthService;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;

/**
 * Represents an OAuth authorization object implementing the authorization code grant flow for use in a desktop or mobile application. 
 */
public class OAuthDesktopMobileAuthCodeGrant extends OAuthWithAuthorizationCode {

    /**
     * Creates new instance of the class with the specified clientId and refreshToken.
     *
     * This class implements the authorization code grant flow for Managing User Authentication with OAuth
     * documented at <a href="http://go.microsoft.com/fwlink/?LinkID=511609">http://go.microsoft.com/fwlink/?LinkID=511609</a>.
     * This is a standard OAuth 2.0 flow and is defined in detail in the
     * Authorization Code Grant section of the OAuth 2.0 spec at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=511609">http://go.microsoft.com/fwlink/?LinkID=511609</a>.
     * For more information about registering a Bing Ads application,
     * see <a href="http://go.microsoft.com/fwlink/?LinkID=511607">http://go.microsoft.com/fwlink/?LinkID=511607</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param refreshToken the refresh token that should be used to request an access token
     * 
     * @see <a href="https://tools.ietf.org/html/rfc6749#section-4.1">https://tools.ietf.org/html/rfc6749#section-4.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken) {
        this(clientId, refreshToken, ApiEnvironment.PRODUCTION);
    }
    
    
    /**
     * Creates new instance of the class with the specified clientId and refreshToken.
     *
     * This class implements the authorization code grant flow for Managing User Authentication with OAuth
     * documented at <a href="http://go.microsoft.com/fwlink/?LinkID=511609">http://go.microsoft.com/fwlink/?LinkID=511609</a>.
     * This is a standard OAuth 2.0 flow and is defined in detail in the
     * Authorization Code Grant section of the OAuth 2.0 spec at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=511609">http://go.microsoft.com/fwlink/?LinkID=511609</a>.
     * For more information about registering a Bing Ads application,
     * see <a href="http://go.microsoft.com/fwlink/?LinkID=511607">http://go.microsoft.com/fwlink/?LinkID=511607</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param refreshToken the refresh token that should be used to request an access token
     * @param env Bing Ads Environment
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, false).getDesktopRedirectUrl(), refreshToken, env, false);
    }

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId) {
        this(clientId, ApiEnvironment.PRODUCTION);
    }

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param env Bing Ads Environment
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */

    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, false).getDesktopRedirectUrl(), env, false);
    }
    
    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens) {
        this(clientId, oauthTokens, ApiEnvironment.PRODUCTION);
    }
    
    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * <a href="https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12">https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, false).getDesktopRedirectUrl(), oauthTokens, env, false);
    }

    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService, ApiEnvironment env, boolean requireLiveConnect) {
        super(clientId, null, oAuthService.getRedirectUrl(requireLiveConnect), oAuthService, env, requireLiveConnect);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env, boolean requireLiveConnect) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, requireLiveConnect).getDesktopRedirectUrl(), refreshToken, env, requireLiveConnect);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env, boolean requireLiveConnect) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, requireLiveConnect).getDesktopRedirectUrl(), oauthTokens, env, requireLiveConnect);
    }

    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env, boolean requireLiveConnect) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, requireLiveConnect).getDesktopRedirectUrl(), env, requireLiveConnect);
    }

}
