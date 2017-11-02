package com.microsoft.bingads.internal;

import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.NewOAuthTokensReceivedListener;
import com.microsoft.bingads.OAuthTokens;
import java.net.URL;
import java.util.Map;

/**
 * Implements the OAuth Authorization Code Grant Flow {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
 *
 */
public abstract class OAuthWithAuthorizationCode extends OAuthAuthorization {

    private static final long TIME_RESERVE_BEFORE_TOKEN_REFRESH_IN_SECONDS = 60;

    private static final String REFRESH_TOKEN = "refresh_token";

    private static final String AUTHORIZATION_CODE = "authorization_code";

    private static final String CODE = "code";
    
    private static final String STATE = "state";

    private OAuthService oauthService;

    private String clientId;

    private String clientSecret;

    private URL redirectionUri;
    
    /**
     * An opaque value used by the client to maintain state between the request and callback
     * */
    private String state;

    private NewOAuthTokensReceivedListener newTokensListener;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public URL getRedirectionUri() {
        return redirectionUri;
    }
    
    public String getState() {
    	return state;
    }
    
    public void setState(String state) {
    	this.state = state;
    }

    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, String refreshToken) {
        this(clientId, clientSecret, redirectionUri, new LiveComOAuthService());

        if (refreshToken == null) {
            throw new NullPointerException("refreshToken must not be null");
        }

        oAuthTokens = new OAuthTokens(null, 0, refreshToken);
    }
    
    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, OAuthTokens oauthTokens) {
        this(clientId, clientSecret, redirectionUri, new LiveComOAuthService());

        if(oauthTokens == null || oauthTokens.getRefreshToken() == null) {
        	throw new NullPointerException("OAuth tokens must not be null");     	
        } 
        
        oAuthTokens = new OAuthTokens(null, 0, oauthTokens.getRefreshToken());
    }

    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri) {
        this(clientId, clientSecret, redirectionUri, new LiveComOAuthService());
    }

    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, OAuthService oauthService) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectionUri = redirectionUri;
        this.oauthService = oauthService;
    }

    /**
     * Returns OAuth Authorization Endpoint that the user has to navigate to from the browser in order to get to the user consent page.
     *
     * @return OAuth Authorization Endpoint
     */
    @Override
    public URL getAuthorizationEndpoint() {
        return LiveComOAuthService.getAuthorizationEndpoint(new OAuthUrlParameters(this.clientId, CODE, this.redirectionUri, this.state));
    }

    /**
     * Retrieves OAuth tokens from authorization server using the authorization code provided by user.
     *
     * @param responseUrl Authorization response redirect Uri containing the authorization code. See: {{@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1.2"}}
     * @return OAuth tokens
     */
    public OAuthTokens requestAccessAndRefreshTokens(URL responseUrl) {
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
        ));

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
                redirectionUri,
                REFRESH_TOKEN,
                REFRESH_TOKEN,
                refreshToken
        ));

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
