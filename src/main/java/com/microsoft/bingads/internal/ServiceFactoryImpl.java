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

public class ServiceFactoryImpl implements ServiceFactory {

    public static final String VERSION = "13.0.24.1";
    
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

    @Override
    public Service createService(Class serviceInterface, ApiEnvironment env)
    {
        try {
            return createServiceWithRetry(serviceInterface, env);
        } catch (Exception e) {
            e.printStackTrace();
            throw new InternalException(e);
        }
    }

    // per #863657, Service.Create sometimes get hang. We implement timeout and retry for it.
    private Service createServiceWithRetry(Class serviceInterface, ApiEnvironment env) throws Exception {
        final QName qName = getServiceQname(serviceInterface);
        final boolean isCxf = Provider.provider().getClass().getName().contains("org.apache.cxf");
        final URL url = (isCxf ? null : new URL(getServiceUrl(serviceInterface, env) + "?wsdl"));

        int retryLeft = WS_CREATE_RETRY_TIMES;
        int timeout = 0;
        ExecutorService pool = Executors.newSingleThreadExecutor();

        try {
            while (retryLeft > 0) {
                retryLeft--;
                timeout = prolongTimeout(timeout);
                Future<Service> future = pool.submit(new Callable<Service>() {
                    public Service call() throws Exception {
                        if (isCxf) {
                            return CxfUtils.runOnNewBus(
                                // CXF doesn't require WSDL url to be passed
                                () -> Service.create(qName), 
                                (logging) -> { 
                                    Set<String> elementNames = new HashSet<>();
                    
                                    elementNames.add("AuthenticationToken");
                                    elementNames.add("Password");

                                    logging.setSensitiveElementNames(elementNames); 
                                }
                            );
                        } 
                            
                        return Service.create(url, qName);
                    }
                });

                try {
                    return future.get(timeout, TimeUnit.SECONDS);
                } catch (TimeoutException e) {
                    System.out.println(String.format("Timeout. Failed to create web service %s in %d seconds for %s. retry left %d",
                            serviceInterface.getName(), timeout, env.value(), retryLeft));
                    future.cancel(true);

                    try {
                        if (retryLeft > 0) {
                            Thread.sleep(WS_CREATE_RETRY_INTERVAL_IN_SECOND * 1000);
                        }
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        } finally {
            pool.shutdown();
        }
        throw new Exception(String.format("Failed to create Service %s for %s!", serviceInterface.getName(), env.value()));
    }

    private int prolongTimeout(int timeout) {
        return timeout + DEFAULT_WS_CREATE_TIMEOUT_IN_SECOND;
    }

    private String getServiceUrl(Class serviceInterface, ApiEnvironment env) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

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
        configServiceProxy(port);
        addUserAgent(port);

        return port;
    }

    /**
     * Inherited class could set timeout properties by override this method.
     * @param port Proxy supports Service T
     */
    protected <T> void configServiceProxy(T port) {
        // By default nothing is add here.
    }

    private <T> void addUserAgent(T port) {
        Map<String, List> headers = new HashMap<String, List>();
        
        String userAgent = "BingAdsSDKJava " + VERSION;

        String javaVersion = System.getProperty("java.version");
        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
            // matches to 1.8.0_222, 11.0.2 and so on
            userAgent += " " + javaVersion;
        }
        headers.put("User-Agent", Arrays.asList(userAgent));

        ((BindingProvider) port).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    }
}
