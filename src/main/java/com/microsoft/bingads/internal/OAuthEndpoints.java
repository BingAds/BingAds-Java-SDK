package com.microsoft.bingads.internal;

import java.net.MalformedURLException;
import java.net.URL;

public class OAuthEndpoints {
    private String desktopRedirectUrl;
    
    private String tokenRequestUrl;
    
    private String authorizationEndpointUrl;
    
    public OAuthEndpoints(String desktopRedirectUrl, String tokenRequestUrl, String authorizationEndpointUrl) {
        this.desktopRedirectUrl = desktopRedirectUrl;
        this.tokenRequestUrl = tokenRequestUrl;
        this.authorizationEndpointUrl = authorizationEndpointUrl;
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
}
