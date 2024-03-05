package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;

public class ServiceInfo {
    
    private final String productionUrl;
    private final String sandboxUrl;

    public ServiceInfo(String productionUrl, String sandboxUrl) {
        this.productionUrl = productionUrl;
        this.sandboxUrl = sandboxUrl;
    }

    public String getProductionUrl() {
        return productionUrl;
    }

    public String getSandboxUrl() {
        return sandboxUrl;
    }

    public String getUrl(ApiEnvironment environment) {
        switch (environment) {
            case PRODUCTION:
                return productionUrl;
            case SANDBOX:
                if (sandboxUrl == null) {
                    throw new UnsupportedOperationException("The service is not available in " + environment.value());
                }
                return sandboxUrl;
            default:
                throw new IllegalArgumentException("Unsupported environment " + environment.value());
        }
    }
}
