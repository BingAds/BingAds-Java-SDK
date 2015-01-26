package com.microsoft.bingads;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.internal.OAuthAuthorization;
import java.util.List;
import org.apache.cxf.headers.Header;
import org.apache.http.HttpRequest;

/**
 * The abstract base class for all authentication classes.
 *
 * Example: {{@link OAuthAuthorization} sets AuthenticationToken field
 *
 * @see ServiceClient<TClientType>
 * @see AuthorizationData
 * @see BulkServiceManager
 */
public abstract class Authentication {

    /**
     * Adds the required http header elements for the
     * corresponding bulk file upload operation.
     *
     * @param request The request to add headers onto
     */
    public abstract void addAuthenticationHeadersToFileUploadRequest(HttpRequest request);
    
    /**
     * Adds the required SOAP header elements for the
     * corresponding Bing Ads service operation.
     * 
     * @param headers
     * @param namespace
     */
    public abstract void addAuthenticationHeadersApiRequest(List<Header> headers, String namespace);
}
