package com.microsoft.bingads;

import com.microsoft.bingads.internal.LiveComOAuthService;
import com.microsoft.bingads.internal.OAuthImplicitGrant;

/**
 * Represents an OAuth authorization object implementing the implicit grant flow for use in a desktop or mobile application.  
 */
public class OAuthDesktopMobileImplicitGrant extends OAuthImplicitGrant {

    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId) {
        super(clientId, LiveComOAuthService.DESKTOP_REDIRECT_URL, null);
    }
    
    /**
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object. See this page for additional
     * information on these values:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId the client identifier corresponding to your registered application
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     * 
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     */
    public OAuthDesktopMobileImplicitGrant(String clientId, OAuthTokens oauthTokens) {
        super(clientId, LiveComOAuthService.DESKTOP_REDIRECT_URL, oauthTokens);
    }   
}
