package com.microsoft.bingads;

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
     * Creates new instance of the class that can be used in the
     * {@link AuthorizationData} object.
     *
     * See this page for additional information on these values:
     * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
     *
     * @param clientId Client Id
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1"}
     * @param clientSecret Client Secret
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1"}
     * @param redirectionUrl Redirect URL
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1"}
     */
    public OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUrl) {
        super(clientId, clientSecret, redirectionUrl);
    }

    /**
     * Creates new instance of the class with a specified OAuthService object.
     *
     * See this page for additional information on these values:
     * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
     *
     * @param clientId Client Id
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1"}
     * @param clientSecret Client Secret
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-3.1"}
     * @param redirectionUri Redirect URL
     * {@link "http://tools.ietf.org/html/draft-ietf-oauth-v2-15#section-2.1.1"}
     * @param oAuthService Custom {@link OAuthService} object
     */
    OAuthWebAuthCodeGrant(String clientId, String clientSecret, URL redirectionUri, OAuthService oAuthService) {
        super(clientId, clientSecret, redirectionUri, oAuthService);
    }
}
