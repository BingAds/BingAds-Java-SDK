package com.microsoft.bingads.internal;

import java.net.URL;

import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters);
    
    URL getRedirectUrl();
}
