package com.microsoft.bingads.internal;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import java.net.URL;

/**
 * Authenticates API request by setting its AuthenticationToken to OAuth access
 * token.
 *
 * See also: {{@link OAuthDesktopMobileImplicitGrant}} See also:
 * {{@link OAuthDesktopMobileAuthCodeGrant}} See also:
 * {{@link OAuthWebAuthCodeGrant}} See also: {{@link OAuthWebImplicitGrant}}
 *
 */
abstract class OAuthAuthorization extends Authentication {

    /**
     * Returns OAuth Authorization Endpoint that the user has to navigate to
     * from the browser in order to get to the user consent page.
     *
     * @return OAuth Authorization Endpoint
     */
    public abstract URL getAuthorizationEndpoint();

    /**
     * OAuth tokens received from live.com authorization service.
     *
     * Populated by derived classes {@link OAuthDesktopMobileImplicitGrant} and
     * {@link OAuthWithAuthorizationCode}
     */
    protected OAuthTokens oAuthTokens;

    public OAuthTokens getOAuthTokens() {
        return oAuthTokens;
    }

    protected void setOAuthTokens(OAuthTokens oAuthTokens) {
        this.oAuthTokens = oAuthTokens;
    }
    
    public String getAuthenticationToken() {
        return this.oAuthTokens.getAccessToken();
    }
   
    @Override
    public void addHeaders(HeadersImpl headersImplementation) {
        headersImplementation.addHeader(HttpHeaders.AUTHENTICATION_TOKEN, this.getOAuthTokens().getAccessToken());
    }
}
