package com.microsoft.bingads;

/**
 * Represents a user who intends to access the corresponding customer and
 * account. An instance of this class is required to authenticate with Bing Ads
 * if you are using either {@link ServiceClient<TServiceClient>} or
 * {@link BulkServiceManager}.
 *
 */
public class AuthorizationData {
    
    private Authentication authentication;

    /**
     * The identifier of the account that owns the entities in the request. Used
     * as the CustomerAccountId header element in calls to the Bing Ads web
     * services.
     */
    private Long accountId;

    /**
     * The identifier of the customer that owns the account. Used as the
     * CustomerId header element in calls to the Bing Ads web services.
     */
    private Long customerId;

    /**
     * The Bing Ads developer access token. Used as the DeveloperToken header
     * element in calls to the Bing Ads web services.
     */
    private String developerToken;

    /**
     *
     * Gets the object representing the authentication method that should be used in calls to the Bing Ads web services.
     * @return
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the object representing the authentication method that should be used in calls to the Bing Ads web services.
     * @param authentication
     */
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Gets the identifier of the account that owns the entities in the request. This value is used as the CustomerAccountId header in calls to the Bing Ads web services.
     * @return
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the identifier of the account that owns the entities in the request. This value is used as the CustomerAccountId header in calls to the Bing Ads web services.
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the identifier of the customer that owns the account. This value is used as the CustomerId header element in calls to the Bing Ads web services.
     * @return
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the identifier of the customer that owns the account. This value is used as the CustomerId header element in calls to the Bing Ads web services.
     * @param customerId
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the Bing Ads developer access token. This value is used as the DeveloperToken header element in calls to the Bing Ads web services.
     * @return
     */
    public String getDeveloperToken() {
        return developerToken;
    }

    /**
     * Sets the Bing Ads developer access token. This value is used as the DeveloperToken header element in calls to the Bing Ads web services.
     * @param developerToken
     */
    public void setDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
    }

    /**
     * Reserved for internal use.
     */
    public void validate() {
        if (authentication == null) {
            throw new IllegalStateException(ErrorMessages.UserDataAuthenticationIsNull);
        }

        if (developerToken == null) {
            throw new IllegalStateException(ErrorMessages.UserDataDeveloperTokenIsNull);
        }
    }
}
