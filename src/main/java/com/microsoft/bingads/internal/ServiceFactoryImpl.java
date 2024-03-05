package com.microsoft.bingads.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

import javax.xml.namespace.QName;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;

import com.microsoft.bingads.v13.adinsight.IAdInsightService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.spi.Provider;

import static java.lang.String.format;
import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.TimeUnit.SECONDS;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class ServiceFactoryImpl implements ServiceFactory {

    private static final String VERSION = "13.0.18";

    private static final int DEFAULT_WS_CREATE_TIMEOUT_IN_SECOND = 60;

    private static final int WS_CREATE_RETRY_INTERVAL_IN_SECOND = 5;

    private static final int WS_CREATE_RETRY_TIMES = 3;

    private static Logger logger = Logger.getLogger(ServiceFactoryImpl.class.getName());

    //
    // Create service.
    //

    @Override
    public Service createService(Class<?> serviceInterface, ApiEnvironment env) {
        try {
            return createServiceWithRetry(serviceInterface, env);
        } catch (Exception e) {
            logger.log(SEVERE, e.getMessage(), e);
            throw new InternalException(e);
        }
    }

    // per #863657, Service.Create sometimes get hang. We implement timeout and retry for it.
    private Service createServiceWithRetry(Class<?> serviceInterface, ApiEnvironment env) throws Exception {
        ExecutorService pool = newCachedThreadPool();
        try {
            int timeout = 0;
            for (int retryLeft = WS_CREATE_RETRY_TIMES; retryLeft > 0; retryLeft--) {
                Future<Service> future = pool.submit(() -> createServiceInstance(serviceInterface, env));
                try {
                    // Linear increasing timeout.
                    timeout += DEFAULT_WS_CREATE_TIMEOUT_IN_SECOND;
                    return future.get(timeout, SECONDS);
                } catch (TimeoutException e) {
                    logger.log(INFO, format(
                            "Timeout. Failed to create %s in %d seconds for %s. %d retries left.",
                            serviceInterface.getSimpleName(), timeout, env.value(), retryLeft));
                    future.cancel(true);

                    if (retryLeft > 1) {
                        Thread.sleep(WS_CREATE_RETRY_INTERVAL_IN_SECOND * 1000);
                    }
                }
            }
        } finally {
            pool.shutdownNow();
        }

        throw new Exception(format("Failed to create %s for %s.", serviceInterface.getSimpleName(), env.value()));
    }

    /**
     * Create the {@link Service} instance.
     * Synchronized to avoid concurrency issues.
     */
    private synchronized Service createServiceInstance(Class<?> serviceInterface, ApiEnvironment env) throws Exception {
        boolean isCxf = Provider.provider().getClass().getName().contains("org.apache.cxf");
        QName qName = getServiceQname(serviceInterface);
        if (isCxf) {
            // CXF doesn't require WSDL url to be passed.
            return Service.create(qName);
        }

        URL url = getServiceWsdlUrl(serviceInterface, env);
        return Service.create(url, qName);
    }

    //
    // Create proxy.
    //

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
        Map<String, List<String>> headers = new HashMap<>();

        String userAgent = "BingAdsSDKJava " + VERSION;
        String javaVersion = System.getProperty("java.version");
        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
            // matches to 1.8.0_222, 11.0.2 and so on
            userAgent += " " + javaVersion;
        }
        headers.put("User-Agent", Arrays.asList(userAgent));

        ((BindingProvider) port).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
    }

    //
    // Service configuration.
    //

    private QName getServiceQname(Class<?> serviceInterface) {
        WebService webServiceAnnotation = serviceInterface.getAnnotation(WebService.class);

        String serviceName = webServiceAnnotation.name();
        if (serviceName.startsWith("I")) {
            serviceName = serviceName.substring(1);
        }

        return new QName(webServiceAnnotation.targetNamespace(), serviceName);
    }

    private static final Map<Class<?>, ServiceInfo> ENDPOINTS = new HashMap<>();
    static {
        ENDPOINTS.put(ICustomerBillingService.class, new ServiceInfo(
                "https://clientcenter.api.bingads.microsoft.com/Api/Billing/v13/CustomerBillingService.svc",
                "https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v13/CustomerBillingService.svc"));
        ENDPOINTS.put(ICustomerManagementService.class, new ServiceInfo(
                "https://clientcenter.api.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc",
                "https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc"));
        ENDPOINTS.put(IReportingService.class, new ServiceInfo(
                "https://reporting.api.bingads.microsoft.com/Api/Advertiser/Reporting/v13/ReportingService.svc",
                "https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v13/ReportingService.svc"));
        ENDPOINTS.put(ICampaignManagementService.class, new ServiceInfo(
                "https://campaign.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc",
                "https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc"));
        ENDPOINTS.put(IAdInsightService.class, new ServiceInfo(
                "https://adinsight.api.bingads.microsoft.com/Api/Advertiser/AdInsight/v13/AdInsightService.svc",
                "https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v13/AdInsightService.svc"));
        ENDPOINTS.put(com.microsoft.bingads.v13.bulk.IBulkService.class, new ServiceInfo(
                "https://bulk.api.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/BulkService.svc",
                "https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/BulkService.svc"));
        //End of v13
    }

    private String getServiceUrl(Class<?> serviceInterface, ApiEnvironment env) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);
        if (serviceUrl == null) {
            serviceUrl = ENDPOINTS.get(serviceInterface).getUrl(env);
        }
        return serviceUrl;
    }

    private URL getServiceWsdlUrl(Class<?> serviceInterface, ApiEnvironment env) throws MalformedURLException {
        return new URL(getServiceUrl(serviceInterface, env) + "?wsdl");
    }
}
