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
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, boolean useMsaProd) {
        this(clientId, refreshToken, defaultEnv, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken) {
        this(clientId, refreshToken, defaultEnv, true);
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
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env, boolean useMsaProd) {
    	super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, (env == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), refreshToken, env, OAuthScope.MSADS_MANAGE, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, env == ApiEnvironment.SANDBOX ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), refreshToken, env, OAuthScope.MSADS_MANAGE, true);
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
    public OAuthDesktopMobileAuthCodeGrant(String clientId, boolean useMsaProd) {
        this(clientId, defaultEnv, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId) {
        this(clientId, defaultEnv, true);
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

    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env, boolean useMsaProd) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, (env == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), env, OAuthScope.MSADS_MANAGE, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, env == ApiEnvironment.SANDBOX ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), env, OAuthScope.MSADS_MANAGE, true);
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
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, boolean useMsaProd) {
        this(clientId, oauthTokens, defaultEnv, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens) {
        this(clientId, oauthTokens, defaultEnv, true);
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
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env, boolean useMsaProd) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, (env == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), oauthTokens, env, OAuthScope.MSADS_MANAGE, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, env == ApiEnvironment.SANDBOX ? OAuthScope.MSA_PROD : OAuthScope.MSADS_MANAGE).getDesktopRedirectUrl(), oauthTokens, env, OAuthScope.MSADS_MANAGE, true);
    }

    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService, ApiEnvironment env, OAuthScope oAuthScope, boolean useMsaProd) {
        super(clientId, null, oAuthService.getRedirectUrl((env == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD : oAuthScope), oAuthService, env, oAuthScope, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, null, oAuthService.getRedirectUrl(env == ApiEnvironment.SANDBOX ? OAuthScope.MSA_PROD : oAuthScope), oAuthService, env, oAuthScope, true);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env, OAuthScope oAuthScope, boolean useMsaProd) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, (env == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD : oAuthScope).getDesktopRedirectUrl(), refreshToken, env, oAuthScope, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, env == ApiEnvironment.SANDBOX ? OAuthScope.MSA_PROD : oAuthScope).getDesktopRedirectUrl(), refreshToken, env, oAuthScope, true);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope, boolean useMsaProd) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, oAuthScope).getDesktopRedirectUrl(), oauthTokens, env, oAuthScope, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, oAuthScope).getDesktopRedirectUrl(), oauthTokens, env, oAuthScope, true);
    }

    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env, OAuthScope oAuthScope, boolean useMsaProd) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, oAuthScope).getDesktopRedirectUrl(), env, oAuthScope, useMsaProd);
    }
    
    public OAuthDesktopMobileAuthCodeGrant(String clientId, ApiEnvironment env, OAuthScope oAuthScope) {
        super(clientId, null, OAuthEndpointHelper.getOauthEndpoint(env, oAuthScope).getDesktopRedirectUrl(), env, oAuthScope, true);
    }
}
