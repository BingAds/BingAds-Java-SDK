package com.microsoft.bingads.internal;

import java.net.MalformedURLException;
import java.net.URL;

public class OAuthEndpoints {
    private String desktopRedirectUrl;
    
    private String tokenRequestUrl;
    
    private String authorizationEndpointUrl;
    
    private String scope;
    
    public OAuthEndpoints(String desktopRedirectUrl, String tokenRequestUrl, String authorizationEndpointUrl, String scope) {
        this.desktopRedirectUrl = desktopRedirectUrl;
        this.tokenRequestUrl = tokenRequestUrl;
        this.authorizationEndpointUrl = authorizationEndpointUrl;
        this.scope = scope;
    }

    public URL getDesktopRedirectUrl() {
        try {
            return new URL(desktopRedirectUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTokenRequestUrl() {
        return tokenRequestUrl;
    }

    public String getAuthorizationEndpointUrl() {
        return authorizationEndpointUrl;
    }
    
    public String getScope() {
        return this.scope;
    }
}
