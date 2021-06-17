package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Map;

import com.microsoft.bingads.OAuthScope;
import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters, OAuthScope oAuthScope, String tenant, Map<String, String> additionalParams);
    
    URL getRedirectUrl(OAuthScope oAuthScope);
}
