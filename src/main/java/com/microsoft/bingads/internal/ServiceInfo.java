package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;

public class ServiceInfo {
    
    private String productionUrl;
    
    private String sandboxUrl;     
    
    private String serviceNameAndVersion;

    public String getProductionUrl() {
        return productionUrl;
    }

    public void setProductionUrl(String productionUrl) {
        this.productionUrl = productionUrl;
    }

    public String getSandboxUrl() {
        return sandboxUrl;
    }

    public void setSandboxUrl(String sandboxUrl) {
        this.sandboxUrl = sandboxUrl;
    }

    public String getServiceNameAndVersion() {
        return serviceNameAndVersion;
    }

    public void setServiceNameAndVersion(String serviceNameAndVersion) {
        this.serviceNameAndVersion = serviceNameAndVersion;
    }
        
    public String GetUrl(ApiEnvironment environment) {
        switch (environment) {
            case SANDBOX:
                if (getSandboxUrl() == null) {
                    throw new UnsupportedOperationException("The service is not available in Sandbox");
                }
            
                return getSandboxUrl();
            case PRODUCTION:
                return getProductionUrl();
            default:
                throw new UnsupportedOperationException("Unknown environment name: " + environment);
        }
    }
}
