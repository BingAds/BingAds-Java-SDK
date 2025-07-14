package com.microsoft.bingads.internal;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.xml.namespace.QName;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;

import jakarta.jws.WebService;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.spi.Provider;

public class ServiceFactoryImpl {

    public static final String VERSION = "13.0.25";
    
    private static final int DEFAULT_WS_CREATE_TIMEOUT_IN_SECOND = 60;
    
    private static final int WS_CREATE_RETRY_INTERVAL_IN_SECOND = 5;
    
    private static final int WS_CREATE_RETRY_TIMES = 3;

    public static final Map<Class<?>, ServiceInfo> endpoints = new HashMap<Class<?>, ServiceInfo>() {
        {
            put(com.microsoft.bingads.v13.customerbilling.ICustomerBillingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/Api/Billing/v13/CustomerBillingService.svc");
                    setSandboxUrl("https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v13/CustomerBillingService.svc");
                    setServiceNameAndVersion("CustomerBilling/v13");
                }
            });

            put(com.microsoft.bingads.v13.customermanagement.ICustomerManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc");
                    setSandboxUrl("https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc");
                    setServiceNameAndVersion("CustomerManagement/v13");
                }
            });

            put(com.microsoft.bingads.v13.reporting.IReportingService.class, new ServiceInfo() {
                {
                	setProductionUrl("https://reporting.api.bingads.microsoft.com/Api/Advertiser/Reporting/v13/ReportingService.svc");
                    setSandboxUrl("https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v13/ReportingService.svc");
                    setServiceNameAndVersion("Reporting/v13");
                }
            });
            put(com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://campaign.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc");
                    setSandboxUrl("https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc");
                    setServiceNameAndVersion("CampaignManagement/v13");
                }
            });
            put(com.microsoft.bingads.v13.adinsight.IAdInsightService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://adinsight.api.bingads.microsoft.com/Api/Advertiser/AdInsight/v13/AdInsightService.svc");
                    setSandboxUrl("https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v13/AdInsightService.svc");
                    setServiceNameAndVersion("AdInsight/v13");
                }
            });
            put(com.microsoft.bingads.v13.bulk.IBulkService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/BulkService.svc");
                    setSandboxUrl("https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/BulkService.svc");
                    setServiceNameAndVersion("Bulk/v13");
                }
            });
			//End of v13
        }
    };


    private String getServiceUrl(Class serviceInterface, ApiEnvironment env) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

        if (serviceUrl == null) {
            ServiceInfo serviceInfo = endpoints.get(serviceInterface);

            serviceUrl = serviceInfo.GetUrl(env);
        }

        return serviceUrl;
    }


    /**
     * Inherited class could set timeout properties by override this method.
     * @param port Proxy supports Service T
     */
    protected <T> void configServiceProxy(T port) {
        // By default nothing is add here.
    }

}
