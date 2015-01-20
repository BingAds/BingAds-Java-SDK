package com.microsoft.bingads.internal;

import java.net.URL;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import com.microsoft.bingads.internal.oauth.HttpHeaders;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import org.apache.cxf.jaxb.JAXBDataBinding;

/**
 * Authenticates API request by setting its AuthenticationToken to OAuth access
 * token.
 *
 * See also: {{@link OAuthDesktopMobileImplicitGrant}} See also:
 * {{@link OAuthDesktopMobileAuthCodeGrant}} See also:
 * {{@link OAuthWebAuthCodeGrant}} See also: {{@link OAuthWebImplicitGrant}}
 *
 */
public abstract class OAuthAuthorization extends Authentication {

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
     * {@link OAuthWithAuthorizationCode}}
     */
    protected OAuthTokens oAuthTokens;

    public OAuthTokens getOAuthTokens() {
        return oAuthTokens;
    }

    protected void setOAuthTokens(OAuthTokens oAuthTokens) {
        this.oAuthTokens = oAuthTokens;
    }

    @Override
    public String getAuthenticationToken() {
        return this.oAuthTokens.getAccessToken();
    }

    @Override
    public void addAuthenticationHeadersToFileUploadRequest(HttpRequest request) {
        request.addHeader(HttpHeaders.AUTHENTICATION_TOKEN, this.getOAuthTokens().getAccessToken());
    }
    
    @Override
    public void addAuthenticationHeadersApiRequest(List<org.apache.cxf.headers.Header> headers, String namespace) {
        try {        
            headers.add(new org.apache.cxf.headers.Header(new QName(namespace, HttpHeaders.AUTHENTICATION_TOKEN), this.getOAuthTokens().getAccessToken(), new JAXBDataBinding(String.class)));
        } catch (JAXBException ex) {
            throw new InternalException(ex);
        }
    }
}
