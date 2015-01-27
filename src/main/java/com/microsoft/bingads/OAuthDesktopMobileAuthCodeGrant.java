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
     * documented at {@link http://go.microsoft.com/fwlink/?LinkID=511609}. This is a standard OAuth 2.0 flow and is defined in detail in the
     * Authorization Code Grant section of the OAuth 2.0 spec at {@link http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-4.1}.
     * For more information about registering a Bing Ads application, see {@link http://go.microsoft.com/fwlink/?LinkID=511607}.
     * @param clientId For more information about using a client identifier for authentication, see the Client Password Authentication section of the OAuth 2.0 spec at {@link http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1}.
     * @param refreshToken
     */
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
     * @param clientId Client Id. See: <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileAuthCodeGrant(String clientId) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL);
    }

    OAuthDesktopMobileAuthCodeGrant(String clientId, OAuthService oAuthService) {
        super(clientId, null, LiveComOAuthService.DESKTOP_REDIRECT_URL, oAuthService);
    }
}
