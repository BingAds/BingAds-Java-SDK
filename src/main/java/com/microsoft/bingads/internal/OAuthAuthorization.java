package com.microsoft.bingads.internal;

import java.net.URL;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import com.microsoft.bingads.internal.ServiceUtils;

/**
 * The abstract base class for all OAuth authentication classes.
 *
 * <p>
 *     You can use this class to dynamically instantiate a derived OAuth authentication class at run time.
 *     This class cannot be instantiated, and instead you should use either {@link OAuthDesktopMobileAuthCodeGrant},
 *     {@link OAuthDesktopMobileImplicitGrant}, or {@link OAuthWebAuthCodeGrant}, which extend this class.
 * </p>
 *
 * @see OAuthDesktopMobileAuthCodeGrant
 * @see OAuthDesktopMobileImplicitGrant
 * @see OAuthWebAuthCodeGrant
 */
abstract class OAuthAuthorization extends Authentication {

	protected static ApiEnvironment defaultEnv = ServiceUtils.getEnvironmentFromConfig() == ApiEnvironment.SANDBOX ? ApiEnvironment.SANDBOX : ApiEnvironment.PRODUCTION;
	
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
     * {@link OAuthWithAuthorizationCode}
     */
    protected OAuthTokens oAuthTokens;
    
    protected ApiEnvironment environment;

    private String tenant;

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
    
    public String getTenant() {
        return this.tenant == null? "common" : this.tenant;
    }
        
    /**
     * An opaque value used by the client to maintain state between the request and callback
     * */
    private String state;
    

    public void setState( String state) {
        this.state = state;
    }
    
    public String getState() {
        return this.state;
    }

    /**
     * Gets information about OAuth access tokens received from the Microsoft Account authorization service.
     */
    public OAuthTokens getOAuthTokens() {
        return oAuthTokens;
    }
    
    public OAuthAuthorization(ApiEnvironment env) {
    	this.environment = env;
    }

    /**
     * Sets information about OAuth access tokens received from the Microsoft Account authorization service.
     */
    protected void setOAuthTokens(OAuthTokens oAuthTokens) {
        this.oAuthTokens = oAuthTokens;
    }
    
    public String getAuthenticationToken() {
        return this.oAuthTokens.getAccessToken();
    }

    /**
     * Adds the AuthenticationToken header element for the corresponding bulk file upload operation.
     *
     * @param headersImplementation the headers collection to which authentication requests should be added
     */
    @Override
    public void addHeaders(HeadersImpl headersImplementation) {
        headersImplementation.addHeader(HttpHeaders.AUTHENTICATION_TOKEN, this.getOAuthTokens().getAccessToken());
    }

    @Override
    
    public ApiEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ApiEnvironment environment) {
    	this.environment = environment;
    }
    
    
}
