package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Map;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.OAuthScope;
import com.microsoft.bingads.OAuthTokens;

/**
 * Represents an OAuth authorization object implementing the implicit grant flow for use in a desktop or mobile application.
 *
 * <p>
 *     You can use an instance of this class as the {@link AuthorizationData#getAuthentication"} method
 *     of an {@link AuthorizationData} object to authenticate with Bing Ads services.
 *     In this case the AuthenticationToken request header will be set to the corresponding {@link OAuthTokens#getAccessToken} value.
 * </p>
 *
 * <p>
 *      This class implements the implicit grant flow for Managing User Authentication with OAuth
 *      documented at <a href="http://go.microsoft.com/fwlink/?LinkID=511608">http://go.microsoft.com/fwlink/?LinkID=511608</a>.
 *      This is a standard OAuth 2.0 flow and is defined in detail in the Authorization Code Grant section of the OAuth 2.0 spec at
 *      <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1</a>.
 *      For more information about registering a Bing Ads application, see
 *      <a href="http://go.microsoft.com/fwlink/?LinkID=511607">http://go.microsoft.com/fwlink/?LinkID=511607</a>.
 * </p>
 */
public abstract class OAuthImplicitGrant extends OAuthAuthorization {

    private static final String EXPIRES_IN = "expires_in";

    private static final String ACCESS_TOKEN = "access_token";

    private static final String TOKEN = "token";
    
    private final String clientId;

    private final URL redirectionUri;
    
    private final OAuthScope oAuthScope;
    
    protected OAuthImplicitGrant(String clientId, URL redirectionUri, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope) {
    	this(clientId, redirectionUri, oauthTokens, env, oAuthScope, true);
    }
    
    protected OAuthImplicitGrant(String clientId, URL redirectionUri, OAuthTokens oauthTokens, ApiEnvironment env, OAuthScope oAuthScope, boolean useMsaProd) {
        super(env);
        
        this.clientId = clientId;

        this.redirectionUri = redirectionUri;
        
        this.oAuthTokens = oauthTokens;
        
        this.oAuthScope = (environment == ApiEnvironment.SANDBOX && useMsaProd) ? OAuthScope.MSA_PROD: oAuthScope;
    }
    
    /**
     * Gets the Microsoft Account authorization endpoint where the user should be navigated to give his or her consent.
     *
     * @return The Microsoft Account authorization endpoint of type {@link URL}.
     */
    @Override
    public URL getAuthorizationEndpoint() {
        return OAuthEndpointHelper.getAuthorizationEndpoint(
                new OAuthUrlParameters(this.clientId, TOKEN, this.redirectionUri, this.getState()),
                this.getEnvironment(),
                this.oAuthScope,
                this.getTenant());
    }

    /**
     * Extracts the access token from the specified <see cref="Uri"/>.
     *
     * @param redirectionUri the redirect {@link URL} that contains an access token
     *
     * @return the {@link OAuthTokens} object
     */
    public OAuthTokens extractAccessTokenFromUrl(URL redirectionUri) {
        Map<String, String> fragmentParts;
        fragmentParts = URLExtensions.parseFragment(redirectionUri);
        
        if(!fragmentParts.containsKey(ACCESS_TOKEN)) {
        	throw new UnsupportedOperationException(ErrorMessages.UriDoesntContainAccessToken);
        }
        
        if(!fragmentParts.containsKey(EXPIRES_IN)) {
        	throw new UnsupportedOperationException(ErrorMessages.UriDoesntContainExpiresIn);
        }
        
        this.oAuthTokens = new OAuthTokens(
                fragmentParts.get(ACCESS_TOKEN),
                Integer.parseInt(fragmentParts.get(EXPIRES_IN)),
                null
        );

        return oAuthTokens;
    }
}
