package com.microsoft.bingads;

import com.microsoft.bingads.internal.LiveComOAuthService;
import com.microsoft.bingads.internal.OAuthService;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;

/**
 * Represents an OAuth authorization object implementing the authorization code grant flow for use in a desktop or mobile application. 
 */
public class OAuthDesktopMobileAuthCodeGrant extends OAuthWithAuthorizationCode {

    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL, refreshToken);
    }

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
     *
     * @param clientId Client Id. See:
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1"}.
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL);
    }

    OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL, oAuthService);
    }
}
