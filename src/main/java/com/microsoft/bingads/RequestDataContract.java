package com.microsoft.bingads;

public class RequestDataContract {

    private String accountId;
    private String customerId;
    private String authenticationToken;
    private String userName;
    private String password;
    private String developerToken;
    private int retriesLeft;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeveloperToken() {
        return developerToken;
    }

    public void setDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
    }

    public int getRetriesLeft() {
        return retriesLeft;
    }

    public void setRetriesLeft(int retriesLeft) {
        this.retriesLeft = retriesLeft;
    }
}
