package com.microsoft.bingads;

import com.microsoft.bingads.internal.LiveComOAuthService;
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
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId, String refreshToken) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL, refreshToken);
    }

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL);
    }

    OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL, oAuthService);
    }
}
