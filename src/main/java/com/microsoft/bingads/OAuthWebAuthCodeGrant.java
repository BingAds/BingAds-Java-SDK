package com.microsoft.bingads;

import com.microsoft.bingads.internal.LiveComOAuthService;
import com.microsoft.bingads.internal.OAuthService;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import java.net.URL;

/**
 * Represents an OAuth authorization object implementing the authorization code grant flow for use in a web application. 
 */
public class OAuthWebAuthCodeGrant extends OAuthWithAuthorizationCode {

    public OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, String refreshToken) {
        super(clientId, clientSecret, redirectionUrl, refreshToken);
    }

    /**
     * Creates new instance of the class that can be used in the {@link AuthorizationData} object.
     *
     * See this page for additional information on these values:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUrl redirect URL
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */
    public OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl) {
        super(clientId, clientSecret, redirectionUrl);
    }
    
    /**
     * Creates new instance of the class that can be used in the {@link AuthorizationData} object.
     *
     * See this page for additional information on these values:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUrl redirect URL
     * @param oauthTokens contains information about OAuth access tokens received from the Microsoft Account authorization service
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */
    public OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl, OAuthTokens oauthTokens) {
    	super(clientId, clientSecret, redirectionUrl, oauthTokens);        
    }
    
    /**
     * Creates new instance of the class with a specified OAuthService object.
     *
     * See this page for additional information on these values:
     * <a href="http://msdn.microsoft.com/en-us/library/dn277356.aspx">http://msdn.microsoft.com/en-us/library/dn277356.aspx</a>
     *
     * @param clientId client id
     * @param clientSecret client secret
     * @param redirectionUri redirect URL
     * @param oAuthService custom {@link OAuthService} object
     *
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1</a>
     * @see <a href="http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1">http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1</a>
     */
    OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUri, OAuthService oAuthService) {
        super(clientId, clientSecret, redirectionUri, oAuthService);
    }
}
