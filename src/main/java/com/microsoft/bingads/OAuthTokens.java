package com.microsoft.bingads;

import com.fasterxml.jackson.databind.JsonNode;

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
        this(accessToken, accessTokenExpiresInSeconds, refreshToken, null);
    }

    /**
     * Contains information about OAuth access tokens received from the Microsoft Account authorization service.
     *
     * @param accessToken OAuth access token that will be used for authorization in the Bing Ads services
     * @param accessTokenExpiresInSeconds expiration time for the corresponding access token in seconds
     * @param refreshToken OAuth refresh token that can be user to refresh an access token
     * @param node Whole json response along with the get access token request
     */
    public OAuthTokens(String accessToken, long accessTokenExpiresInSeconds, String refreshToken, JsonNode node) {
        this.accessToken = accessToken;

        this.accessTokenExpiresInSeconds = accessTokenExpiresInSeconds;

        this.refreshToken = refreshToken;

        this.creationTimeStampInMilliseconds = System.currentTimeMillis();

        this.responseJson = node;
    }

    private final String accessToken;

    private final long accessTokenExpiresInSeconds;

    private final String refreshToken;

    private final long creationTimeStampInMilliseconds;

    private final JsonNode responseJson;

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

    /**
     * Gets OAuth additional attribute that got along with access token.
     */
    public JsonNode getResponseJson() {
        return responseJson;
    }

}
