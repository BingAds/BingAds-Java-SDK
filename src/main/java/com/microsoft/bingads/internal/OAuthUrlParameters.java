package com.microsoft.bingads.internal;

import java.net.URL;

class OAuthUrlParameters {

    private String clientId;

    private String responseType;

    private URL redirectionUri;

    public OAuthUrlParameters(String clientId, String responseType, URL redirectionUri) {
        this.clientId = clientId;

        this.responseType = responseType;
        
        this.redirectionUri = redirectionUri;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public URL getRedirectionUri() {
        return redirectionUri;
    }

    public void setRedirectionUri(URL redirectionUri) {
        this.redirectionUri = redirectionUri;
    }
}
