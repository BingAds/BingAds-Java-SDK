package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Map;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.NewOAuthTokensReceivedListener;
import com.microsoft.bingads.OAuthScope;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.ServiceClient;

/**
 * Implements the OAuth Authorization Code Grant Flow {@link "https://docs.microsoft.com/en-us/bingads/guides/authentication-oauth?view=bingads-12"}
 *
 */
public abstract class OAuthWithAuthorizationCode extends OAuthAuthorization {

    private static final long TIME_RESERVE_BEFORE_TOKEN_REFRESH_IN_SECONDS = 60;

    private static final String REFRESH_TOKEN = "refresh_token";

    private static final String AUTHORIZATION_CODE = "authorization_code";

    private static final String CODE = "code";
    
    private OAuthService oauthService;

    private String clientId;

    private String clientSecret;
    
    private URL redirectionUri;
    
    private OAuthScope oAuthScope;
    

    private NewOAuthTokensReceivedListener newTokensListener;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    
    public OAuthScope getOAuthScope() {
        return oAuthScope;
    }
    
    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, String refreshToken, ApiEnvironment env, OAuthScope oAuthScope) {
        this(clientId, clientSecret, redirectionUri, env, oAuthScope);

        if (refreshToken == null) {
            throw new NullPointerException("refreshToken must not be null");
        }

        oAuthTokens = new OAuthTokens(null, 0, refreshToken);
    }
    
    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope) {

        this(clientId, clientSecret, redirectionUri, env, oAuthScope);
        if(oauthTokens == null || oauthTokens.getRefreshToken() == null) {
        	throw new NullPointerException("OAuth tokens must not be null");     	
        }

        oAuthTokens = new OAuthTokens(oauthTokens.getAccessToken(), oauthTokens.getAccessTokenExpiresInSeconds(), oauthTokens.getRefreshToken());
    }
    
    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, ApiEnvironment env, OAuthScope oAuthScope) {
        super(env);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectionUri = redirectionUri;
        this.oauthService = new UriOAuthService(environment);
        this.oAuthScope = oAuthScope;
    }
    
    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, OAuthService oauthService, ApiEnvironment env, OAuthScope oAuthScope) {
        super(env);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectionUri = redirectionUri;
        this.oauthService = oauthService;
        this.oAuthScope = oAuthScope;
    }

    /**
     * Returns OAuth Authorization Endpoint that the user has to navigate to from the browser in order to get to the user consent page.
     *
     * @return OAuth Authorization Endpoint
     */
    @Override
    public URL getAuthorizationEndpoint() {
        return OAuthEndpointHelper.getAuthorizationEndpoint(
                new OAuthUrlParameters(this.clientId, CODE, this.redirectionUri, this.getState()),
                this.getEnvironment(),
                this.oAuthScope,
                this.getTenant());
    }

    /**
     * Retrieves OAuth tokens from authorization server using the authorization code provided by user.
     *
     * @param responseUrl Authorization response redirect Uri containing the authorization code. See: {{@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1.2"}}
     * @return OAuth tokens
     */
    public OAuthTokens requestAccessAndRefreshTokens(URL responseUrl) {
        return requestAccessAndRefreshTokens(responseUrl, null);
    }
    

    /**
     * Retrieves OAuth tokens from authorization server using the authorization code provided by user.
     *
     * @param responseUrl Authorization response redirect Uri containing the authorization code. See: {{@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1.2"}}
     * @param additionalParams Additional parameters in format of Key/Value. Such as "code_verifier" can leverage this parameter
     * @return OAuth tokens
     */
    public OAuthTokens requestAccessAndRefreshTokens(URL responseUrl, Map<String, String> additionalParams) {
        Map<String, String> queryParts;
        queryParts = URLExtensions.parseQuery(responseUrl);
        
        if(!queryParts.containsKey(CODE)) {
            throw new IllegalArgumentException(ErrorMessages.UriDoesntContainCode);
        }      
        String code = queryParts.get(CODE);

        this.oAuthTokens = this.oauthService.getAccessTokens(new OAuthRequestParameters(
                clientId,
                clientSecret,
                redirectionUri,
                AUTHORIZATION_CODE,
                CODE,
                code
        ), this.oAuthScope, this.getTenant(), additionalParams);

        raiseNewTokensEventIfNeeded();

        return oAuthTokens;
    }

    /**
     * Retrieves OAuth tokens from authorization server using the refresh token provided by user.
     *
     * @param refreshToken Refresh token. See {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-6"}.
     * @return OAuth tokens
     */
    public OAuthTokens requestAccessAndRefreshTokens(String refreshToken) {
        this.oAuthTokens = this.oauthService.getAccessTokens(new OAuthRequestParameters(
                clientId,
                clientSecret,
                null,
                REFRESH_TOKEN,
                REFRESH_TOKEN,
                refreshToken
        ), this.oAuthScope, this.getTenant(), null);

        raiseNewTokensEventIfNeeded();

        return oAuthTokens;
    }

    /**
     * Retrieves OAuth tokens from authorization server using the last known refresh token from the current session.
     *
     * <blockquote>
     * When the current access token expires, it needs to be refreshed. It can be refreshed using the refresh token that was receive before (either provided directly by user or retrieved using the authorization code). The {@link ServiceClient} detects access token expiration and calls this method to refresh it.
     * </blockquote>
     *
     * @param forceRefresh
     * @return OAuth tokens
     */
    public OAuthTokens refreshTokensIfNeeded(boolean forceRefresh) {
        if (oAuthTokens == null) {
            throw new IllegalStateException("No OAuth tokens to refresh. Please request tokens first using requestAccessAndRefreshTokens()");
        }

        if (forceRefresh
                || oAuthTokens.getAccessToken() == null
                || oAuthTokens.getAccessTokenExpiresInSeconds() < TIME_RESERVE_BEFORE_TOKEN_REFRESH_IN_SECONDS) {
            requestAccessAndRefreshTokens(oAuthTokens.getRefreshToken());
        }

        return oAuthTokens;
    }

    private void raiseNewTokensEventIfNeeded() {
        if (newTokensListener != null) {
            newTokensListener.onNewOAuthTokensReceived(oAuthTokens);
        }
    }

    public NewOAuthTokensReceivedListener getNewTokensListener() {
        return newTokensListener;
    }

    public void setNewTokensListener(NewOAuthTokensReceivedListener newTokensListener) {
        this.newTokensListener = newTokensListener;
    }
    

}