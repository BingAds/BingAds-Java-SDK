package com.microsoft.bingads.internal.oauth;

import com.microsoft.bingads.OAuthTokens;

public interface OAuthService {

    OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters);
}
