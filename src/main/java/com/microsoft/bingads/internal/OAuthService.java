package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Map;

import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters, boolean requireLiveConnect, String tenant, Map<String, String> additionalParams);
    
    URL getRedirectUrl(boolean requireLiveConnect);
}
