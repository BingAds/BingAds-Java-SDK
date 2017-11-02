package com.microsoft.bingads;

/**
 * Contains information about OAuth access tokens received from the Microsoft Account authorization service.
 */
public class OAuthTokens {

    /**
     * Contains information about OAuth access tokens received from the Microsoft Account authorization service.
     *
     * @param accessToken OAuth access token that will be used for authorization in the Bing Ads services
     * @param accessTokenExpiresInSeconds expiration time for the corresponding access token in seconds
     * @param refreshToken OAuth refresh token that can be user to refresh an access token
     */
    public OAuthTokens(String accessToken, long accessTokenExpiresInSeconds, String refreshToken) {
        this.accessToken = accessToken;

        this.accessTokenExpiresInSeconds = accessTokenExpiresInSeconds;

        this.refreshToken = refreshToken;

        this.creationTimeStampInMilliseconds = System.currentTimeMillis();
    }

    private final String accessToken;

    private final long accessTokenExpiresInSeconds;

    private final String refreshToken;

    private final long creationTimeStampInMilliseconds;

    /**
     * Gets the OAuth access token that will be used for authorization in the Bing Ads services.
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Gets the remaining time before expiration for the corresponding access token in seconds.
     */
    public long getAccessTokenExpiresInSeconds() {
        return accessTokenExpiresInSeconds - (System.currentTimeMillis() - creationTimeStampInMilliseconds) / 1000;
    }

    /**
     * Gets the OAuth refresh token that can be user to refresh an access token.
     */
    public String getRefreshToken() {
        return refreshToken;
    }
}
