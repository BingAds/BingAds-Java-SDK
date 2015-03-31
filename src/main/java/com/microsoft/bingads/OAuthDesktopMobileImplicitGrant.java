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
     */
    public OAuthDesktopMobileImplicitGrant(String clientId) {
        super(clientId, LiveComOAuthService.DESKTOP_REDIRECT_URL);
    }
}
