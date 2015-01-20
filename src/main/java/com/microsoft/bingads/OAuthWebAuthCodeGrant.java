package com.microsoft.bingads;

import java.net.URL;

import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.oauth.OAuthService;
import java.util.List;

/**
 * Implements the OAuth Authorization Code Grant Flow for web applications
 * {@link "http://msdn.microsoft.com/en-us/library/dn277356.aspx"}
 *
 */
public class OAuthWebAuthCodeGrant extends OAuthWithAuthorizationCode {

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
