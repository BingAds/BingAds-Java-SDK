package com.microsoft.bingads.internal;

import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters);
}
