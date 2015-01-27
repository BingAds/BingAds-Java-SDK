package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.adintelligence.IAdIntelligenceService;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.optimizer.IOptimizerService;
import com.microsoft.bingads.reporting.IReportingService;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.message.Message;

class ServiceFactoryImpl implements ServiceFactory {
    
    private static final String VERSION = "9.3.0";

    private static final Map<Class, ServiceInfo> endpoints = new HashMap<Class, ServiceInfo>() {
        {
            put(IAdIntelligenceService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/AdIntelligence/v9/AdIntelligenceService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/AdIntelligence/v9/AdIntelligenceService.svc");
                }
            });

            put(IBulkService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/BulkService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/BulkService.svc");
                }
            });

            put(ICampaignManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/CampaignManagementService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/CampaignManagementService.svc");
                }
            });

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

            put(IOptimizerService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/Optimizer/v9/OptimizerService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Optimizer/v9/OptimizerService.svc");
                }
            });

            put(IReportingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://api.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc");
                    setSandboxUrl("https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc");
                }
            });
        }
    };

    @Override
    public Service createService(Class serviceInterface) {
        QName qName = getServiceQname(serviceInterface);

        return Service.create(qName);
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
        
        ((Client) port).getRequestContext().put(Message.PROTOCOL_HEADERS, headers);
    }
}
