package com.microsoft.bingads;

/**
 * Allows to handle the event when new OAuth tokens are received (for example as a result of refresh).
 */
public abstract class NewOAuthTokensReceivedListener {

    /**
     * This method will be called when new OAuthTokens are available.
     * @param newOAuthTokens New OAuth tokens.
     */
    public abstract void onNewOAuthTokensReceived(OAuthTokens newOAuthTokens);
}
