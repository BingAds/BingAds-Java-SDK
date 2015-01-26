package com.microsoft.bingads.internal;

import com.microsoft.bingads.OAuthTokens;
import java.net.URL;
import java.util.Map;

/**
 * Implements the OAuth Implicit Code Grant Flow
 * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
 *
 */
public abstract class OAuthImplicitGrant extends OAuthAuthorization {

    private static final String EXPIRES_IN = "expires_in";
    private static final String ACCESS_TOKEN = "access_token";
    private static final String TOKEN = "token";
    private String clientId;
    private URL redirectionUri;

    public OAuthImplicitGrant(String clientId, URL redirectionUri) {
        this.clientId = clientId;
        this.redirectionUri = redirectionUri;
    }

    /**
     * Returns OAuth Authorization Endpoint that the user has to navigate to
     * from the browser in order to get to the user consent page.
     *
     * @return OAuth Authorization Endpoint
     */
    @Override
    public URL getAuthorizationEndpoint() {
        return LiveComOAuthService.getAuthorizationEndpoint(new OAuthUrlParameters(this.clientId, TOKEN, this.redirectionUri));
    }

    public OAuthTokens extractAccessTokenFromUrl(URL redirectionUri) {
        Map<String, String> fragmentParts;
        fragmentParts = URLExtensions.parseFragment(redirectionUri);

        this.oAuthTokens = new OAuthTokens(
                fragmentParts.get(ACCESS_TOKEN),
                Integer.parseInt(fragmentParts.get(EXPIRES_IN)),
                null
        );

        return oAuthTokens;
    }
}
