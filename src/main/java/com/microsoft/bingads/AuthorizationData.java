package com.microsoft.bingads;

import com.microsoft.bingads.internal.ErrorMessages;

/**
 * Represents a user who intends to access the corresponding customer and
 * account. An instance of this class is required to authenticate with Bing Ads
 * if you are using either {@link ServiceClient} or
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
    private long accountId;

    /**
     * The identifier of the customer that owns the account. Used as the
     * CustomerId header element in calls to the Bing Ads web services.
     */
    private long customerId;

    /**
     * The Bing Ads developer access token. Used as the DeveloperToken header
     * element in calls to the Bing Ads web services.
     */
    private String developerToken;

    /**
     *
     * Gets the object representing the authentication method that should be used in calls to the Bing Ads web services.
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the object representing the authentication method that should be used in calls to the Bing Ads web services.
     */
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Gets the identifier of the account that owns the entities in the request. This value is used as the CustomerAccountId header in calls to the Bing Ads web services.
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the identifier of the account that owns the entities in the request. This value is used as the CustomerAccountId header in calls to the Bing Ads web services.
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the identifier of the customer that owns the account. This value is used as the CustomerId header element in calls to the Bing Ads web services.
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the identifier of the customer that owns the account. This value is used as the CustomerId header element in calls to the Bing Ads web services.
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the Bing Ads developer access token. This value is used as the DeveloperToken header element in calls to the Bing Ads web services.
     */
    public String getDeveloperToken() {
        return developerToken;
    }

    /**
     * Sets the Bing Ads developer access token. This value is used as the DeveloperToken header element in calls to the Bing Ads web services.
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
