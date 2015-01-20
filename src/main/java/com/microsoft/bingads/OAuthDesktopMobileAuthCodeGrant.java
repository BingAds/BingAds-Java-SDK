package com.microsoft.bingads;

import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.oauth.LiveComOAuthService;
import com.microsoft.bingads.internal.oauth.OAuthService;

/**
 * Implements the OAuth Authorization Code Grant Flow for desktop and mobile
 * applications {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
 *
 */
public class OAuthDesktopMobileAuthCodeGrant extends OAuthWithAuthorizationCode {

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
