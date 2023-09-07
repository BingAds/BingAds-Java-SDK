package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;

public class ServiceInfo {
    
    private String productionUrl;
    
    private String sandboxUrl;        

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
                throw new UnsupportedOperationException("The service is not available in Sandbox");
        }
    }
}
