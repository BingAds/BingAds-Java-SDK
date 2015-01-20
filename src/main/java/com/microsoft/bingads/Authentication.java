package com.microsoft.bingads;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.internal.OAuthAuthorization;
import java.util.List;
import org.apache.cxf.headers.Header;

/**
 * The abstract base class for all authentication classes. You can use this
 * class to dynamically instantiate a derived authentication class at run time.
 * This class cannot be instantiated, and instead you should use either {@link OAuthDesktopMobileAuthCodeGrant}, {@link OAuthDesktopMobileImplicitGrant},
 * {@link OAuthWebAuthCodeGrant}, or {@link PasswordAuthentication} which extend
 * this class.
 *
 * Example: {{@link OAuthAuthorization} sets AuthenticationToken field
 *
 * @see ServiceClient<TClientType>
 * @see AuthorizationData
 * @see BulkServiceManager
 */
public abstract class Authentication {

    /**
     * Adds the required web client authentication header elements for the
     * corresponding bulk file upload operation. The header elements that the
     * method sets will differ depending on the type of authentication. For
     * example if you use one of the OAuth classes, the AuthenticationToken
     * header will be set by this method, whereas the UserName and Password
     * headers will remain empty.
     *
     * @param request The request to add headers onto
     */
    public abstract void addAuthenticationHeadersToFileUploadRequest(HttpRequest request);
    
    public abstract void addAuthenticationHeadersApiRequest(List<Header> headers, String namespace);

    public String getUserName() {
        return null;
    }

    public String getPassword() {
        return null;
    }

    public String getAuthenticationToken() {
        return null;
    }
}
