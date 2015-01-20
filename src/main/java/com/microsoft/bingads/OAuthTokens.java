package com.microsoft.bingads;

/**
 * Contains information about OAuth access tokens received from live.com
 * authorization service
 *
 */
public class OAuthTokens {

    /**
     * Default constructor. Takes all fields and sets them.
     *
     * @param accessToken Current token for accessing resources
     * @param accessTokenExpiresInSeconds Expiration period for the access token
     * in seconds
     * @param refreshToken Token to be provided to the service if a new access
     * token is required
     */
    public OAuthTokens(String accessToken, int accessTokenExpiresInSeconds,
            String refreshToken) {
        this.accessToken = accessToken;
        this.accessTokenExpiresInSeconds = accessTokenExpiresInSeconds;
        this.refreshToken = refreshToken;
    }

    /**
     * Access token that will be passed when calling API methods.
     */
    private String accessToken;

    /**
     * Expiration time for current access token in seconds.
     */
    private int accessTokenExpiresInSeconds;

    /**
     * Refresh token that will be passed to get an update access token
     */
    private String refreshToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getAccessTokenExpiresInSeconds() {
        return accessTokenExpiresInSeconds;
    }

    public void setAccessTokenExpiresInSeconds(int accessTokenExpiresInSeconds) {
        this.accessTokenExpiresInSeconds = accessTokenExpiresInSeconds;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
