package com.microsoft.bingads.internal;

import java.net.URL;

import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters, boolean requireLiveConnect);
    
    URL getRedirectUrl(boolean requireLiveConnect);
}
