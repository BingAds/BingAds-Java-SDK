package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Map;

import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.internal.oauth.LiveComOAuthService;
import com.microsoft.bingads.internal.oauth.OAuthRequestParameters;
import com.microsoft.bingads.internal.oauth.OAuthService;
import com.microsoft.bingads.internal.oauth.OAuthUrlParameters;

/**
 * Implements the OAuth Authorization Code Grant Flow
 * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
 *
 */
public abstract class OAuthWithAuthorizationCode extends OAuthAuthorization {

    private static final String REFRESH_TOKEN = "refresh_token";

    private static final String AUTHORIZATION_CODE = "authorization_code";

    private static final String CODE = "code";

    private OAuthService oauthService;

    private String clientId;

    private String clientSecret;

    private URL redirectionUri;

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public URL getRedirectionUri() {
        return redirectionUri;
    }

    protected OAuthWithAuthorizationCode(String clientId, String clientSecret,
            URL redirectionUri) {
        this(clientId, clientSecret, redirectionUri, new LiveComOAuthService());
    }

    protected OAuthWithAuthorizationCode(String clientId, String clientSecret, URL redirectionUri, OAuthService oauthService) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectionUri = redirectionUri;
        this.oauthService = oauthService;
    }

    /**
     * Returns OAuth Authorization Endpoint that the user has to navigate to
     * from the browser in order to get to the user consent page.
     *
     * @return OAuth Authorization Endpoint
     */
    @Override
    public URL getAuthorizationEndpoint() {
        return LiveComOAuthService.getAuthorizationEndpoint(new OAuthUrlParameters(this.clientId, CODE, this.redirectionUri));
    }

    /**
     * Retrieves OAuth tokens from authorization server using the authorization
     * code provided by user.
     *
     * @param responseUri Authorization response redirect Uri containing the
     * authorization code. See:
     * {{@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1.2"}}
     * @return OAuth tokengs
     */
    public OAuthTokens requestAccessAndRefreshTokens(URL responseUrl) {
        Map<String, String> queryParts;
        queryParts = URLExtensions.parseQuery(responseUrl);

        String code = queryParts.get(CODE);

        this.oAuthTokens = this.oauthService.getAccessTokens(new OAuthRequestParameters(
                clientId,
                clientSecret,
                redirectionUri,
                AUTHORIZATION_CODE,
                CODE,
                code
        ));

        return oAuthTokens;
    }

    /**
     * Retrieves OAuth tokens from authorization server using the refresh token
     * provided by user.
     *
     * @param refreshToken Refresh token. See
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-6"}.
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

        return oAuthTokens;
    }

    /**
     * Retrieves OAuth tokens from authorization server using the last known
     * refresh token from the current session.
     *
     * <blockquote>
     * When the current access token expires, it needs to be refreshed. It can
     * be refreshed using the refresh token that was receive before (either
     * provided directly by user or retrieved using the authorization code). The
     * {@link ServiceClient<TClientType>} detects access token expiration and
     * calls this method to refresh it.
     * </blockquote>
     *
     * @return OAuth tokens
     */
    public OAuthTokens refreshAccessToken() {
        return requestAccessAndRefreshTokens(oAuthTokens.getRefreshToken());
    }

}
