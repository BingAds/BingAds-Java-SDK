/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal;

import javax.xml.namespace.QName;

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
