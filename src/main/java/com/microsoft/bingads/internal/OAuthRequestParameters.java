package com.microsoft.bingads.internal;

import java.net.URL;

class OAuthRequestParameters {

    private final String clientId;

    private final String clientSecret;

    private final URL redirectionUri;

    private final String grantType;

    private final String grantParamName;

    private final String grantValue;

    public OAuthRequestParameters(String clientId, String clientSecret, URL redirectionUri, String grantType, String grantParamName, String grantValue) {
        this.clientId = clientId;

        this.clientSecret = clientSecret;

        this.redirectionUri = redirectionUri;

        this.grantType = grantType;

        this.grantParamName = grantParamName;
        
        this.grantValue = grantValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OAuthRequestParameters other = (OAuthRequestParameters) obj;
        if (clientId == null) {
            if (other.clientId != null) {
                return false;
            }
        } else if (!clientId.equals(other.clientId)) {
            return false;
        }
        if (clientSecret == null) {
            if (other.clientSecret != null) {
                return false;
            }
        } else if (!clientSecret.equals(other.clientSecret)) {
            return false;
        }
        if (grantParamName == null) {
            if (other.grantParamName != null) {
                return false;
            }
        } else if (!grantParamName.equals(other.grantParamName)) {
            return false;
        }
        if (grantType == null) {
            if (other.grantType != null) {
                return false;
            }
        } else if (!grantType.equals(other.grantType)) {
            return false;
        }
        if (grantValue == null) {
            if (other.grantValue != null) {
                return false;
            }
        } else if (!grantValue.equals(other.grantValue)) {
            return false;
        }
        if (redirectionUri == null) {
            if (other.redirectionUri != null) {
                return false;
            }
        } else if (!redirectionUri.equals(other.redirectionUri)) {
            return false;
        }
        return true;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public URL getRedirectionUri() {
        return redirectionUri;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getGrantParamName() {
        return grantParamName;
    }

    public String getGrantValue() {
        return grantValue;
    }
}
