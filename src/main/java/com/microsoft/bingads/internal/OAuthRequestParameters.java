package com.microsoft.bingads.internal;

import java.net.URL;

class OAuthRequestParameters {

    private String clientId;
    private String clientSecret;
    private URL redirectionUri;
    private String grantType;
    private String grantParamName;
    private String grantValue;

    public OAuthRequestParameters(String clientId, String clientSecret,
            URL redirectionUri, String grantType, String grantParamName, String grantValue) {
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

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public URL getRedirectionUri() {
        return redirectionUri;
    }

    public void setRedirectionUri(URL redirectionUri) {
        this.redirectionUri = redirectionUri;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getGrantParamName() {
        return grantParamName;
    }

    public void setGrantParamName(String grantParamName) {
        this.grantParamName = grantParamName;
    }

    public String getGrantValue() {
        return grantValue;
    }

    public void setGrantValue(String grantValue) {
        this.grantValue = grantValue;
    }
}
