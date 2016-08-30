package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.reporting.IReportingService;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.spi.Provider;

class ServiceFactoryImpl implements ServiceFactory {

    private static final String VERSION = "10.4.8";

    private static final Map<Class, ServiceInfo> endpoints = new HashMap<Class, ServiceInfo>() {
        {
            put(ICustomerBillingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/Api/Billing/v9/CustomerBillingService.svc");
                }
            });

            put(ICustomerManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v9/CustomerManagementService.svc");
                    setSandboxUrl("https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v9/CustomerManagementService.svc");
                }
            });

            put(IReportingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc");
                }
            });
            put(com.microsoft.bingads.v10.campaignmanagement.ICampaignManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://campaign.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/CampaignManagementService.svc");
                    setSandboxUrl("https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/CampaignManagementService.svc");
                }
            });
            put(com.microsoft.bingads.v10.adinsight.IAdInsightService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://adinsight.api.bingads.microsoft.com/Api/Advertiser/AdInsight/V10/AdInsightService.svc");
                    setSandboxUrl("https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/V10/AdInsightService.svc");
                }
            });
            put(com.microsoft.bingads.v10.bulk.IBulkService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/BulkService.svc");
                    setSandboxUrl("https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/BulkService.svc");
                }
            });
        }
    };

    @Override
    public Service createService(Class serviceInterface, ApiEnvironment env) {
        QName qName = getServiceQname(serviceInterface);

        // CXF doesn't require WSDL url to be passed
        if (Provider.provider().getClass().getName().contains("org.apache.cxf")) {
           return Service.create(qName);
        }

        try {
            return Service.create(new URL(getServiceUrl(serviceInterface, env) + "?wsdl"), qName);
        } catch (MalformedURLException e) {
            throw new InternalException(e);
        }        
    }

    private String getServiceUrl(Class serviceInterface, ApiEnvironment env) {
        String serviceUrl = getServiceUrlFromConfig(serviceInterface);

        if (serviceUrl == null) {
            ServiceInfo serviceInfo = endpoints.get(serviceInterface);

            serviceUrl = serviceInfo.GetUrl(env);
        }

        return serviceUrl;
    }

    private QName getServiceQname(Class serviceInterface) {
        WebService webServiceAnnotation = (WebService) serviceInterface.getAnnotation(WebService.class);

        String serviceName = webServiceAnnotation.name();
        if (serviceName.startsWith("I")) {
            serviceName = serviceName.substring(1);
        }

        QName qName = new QName(webServiceAnnotation.targetNamespace(), serviceName);

        return qName;
    }

    @Override
    public <T> T createProxyFromService(Service service, ApiEnvironment env, Class<T> serviceInterface) {
        T port = service.getPort(serviceInterface);

        String serviceUrl = getServiceUrl(serviceInterface, env);

        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);

        addUserAgent(port);

        return port;
    }

    private String getServiceUrlFromConfig(Class serviceInterface) {
        InputStream input = null;
        try {
            input = this.getClass().getClassLoader().getResourceAsStream("bingads.properties");

            if (input == null) {
                return null;
            }

            Properties props = new Properties();

            props.load(input);

            return props.getProperty(serviceInterface.getCanonicalName() + ".url");
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ServiceFactoryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private <T> void addUserAgent(T port) {
        Map<String, List> headers = new HashMap<String, List>();

        headers.put("User-Agent", Arrays.asList("BingAdsSDKJava " + VERSION));

        ((BindingProvider) port).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    }
}
