package com.microsoft.bingads;

/**
 * Represents a user who intends to access the corresponding customer and
 * account. An instance of this class is required to authenticate with Bing Ads
 * if you are using either {@link ServiceClient<TServiceClient>} or
 * {@link BulkServiceManager}.
 *
 */
public class AuthorizationData {

    /**
     * Used to authenticate in calls to the Bing Ads web services. If the type
     * of authentication is one of the OAuth derived classes
     * ({@link OAuthDesktopMobileAuthCodeGrant}, {@link OAuthDesktopMobileImplicitGrant},
     * or {@link OAuthWebAuthCodeGrant}, then the AccessToken of the
     * authentication instance must be used as the AuthenticationToken header
     * element in calls to the Bing Ads web services.
     *
     * If the type of authentication is {@link PasswordAuthentication} then the
     * UserName and Password header elements must be used in calls to the Bing
     * Ads web services.
     */
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

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getDeveloperToken() {
        return developerToken;
    }

    public void setDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
    }

    public void validate() {
        if (authentication == null) {
            throw new IllegalStateException(ErrorMessages.UserDataAuthenticationIsNull);
        }

        if (developerToken == null) {
            throw new IllegalStateException(ErrorMessages.UserDataDeveloperTokenIsNull);
        }
    }
}
