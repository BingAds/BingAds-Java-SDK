package com.microsoft.bingads.internal;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import java.net.URL;

/**
 * The abstract base class for all OAuth authentication classes.
 *
 * <p>
 *     You can use this class to dynamically instantiate a derived OAuth authentication class at run time.
 *     This class cannot be instantiated, and instead you should use either {@link OAuthDesktopMobileAuthCodeGrant},
 *     {@link OAuthDesktopMobileImplicitGrant}, or {@link OAuthWebAuthCodeGrant}, which extend this class.
 * </p>
 *
 * @see OAuthDesktopMobileAuthCodeGrant
 * @see OAuthDesktopMobileImplicitGrant
 * @see OAuthWebAuthCodeGrant
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

    /**
     * Gets information about OAuth access tokens received from the Microsoft Account authorization service.
     */
    public OAuthTokens getOAuthTokens() {
        return oAuthTokens;
    }

    /**
     * Sets information about OAuth access tokens received from the Microsoft Account authorization service.
     */
    protected void setOAuthTokens(OAuthTokens oAuthTokens) {
        this.oAuthTokens = oAuthTokens;
    }
    
    public String getAuthenticationToken() {
        return this.oAuthTokens.getAccessToken();
    }

    /**
     * Adds the AuthenticationToken header element for the corresponding bulk file upload operation.
     *
     * @param headersImplementation the headers collection to which authentication requests should be added
     */
    @Override
    public void addHeaders(HeadersImpl headersImplementation) {
        headersImplementation.addHeader(HttpHeaders.AUTHENTICATION_TOKEN, this.getOAuthTokens().getAccessToken());
    }
}
