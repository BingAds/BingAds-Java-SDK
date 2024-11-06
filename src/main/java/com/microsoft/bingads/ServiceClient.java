package com.microsoft.bingads;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

import com.microsoft.bingads.internal.HeaderHandler;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.utilities.Lazy;
import com.microsoft.bingads.v13.adinsight.IAdInsightService;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;

/**
 * Provides an interface for calling the methods of the specified Bing Ads service.
 * <p>
 *     Note: Valid value of {@link T} are:
 *     <ul>
 *         <li>{@link IAdInsightService}</li>
 *         <li>{@link IBulkService}</li>
 *         <li>{@link ICampaignManagementService}</li>
 *         <li>{@link ICustomerBillingService}</li>
 *         <li>{@link ICustomerManagementService}</li>
 *         <li>{@link IReportingService}</li>
 *     </ul>
 *
 * </p>
 *
 * @param <T> The Bing Ads service interface that should be called. For example, {@link ICampaignManagementService}.
 *
 */
public class ServiceClient<T> {
    private final AuthorizationData authorizationData;

    private final Class<T> serviceInterface;
    private final ServiceFactory serviceFactory;
    private ApiEnvironment environment;
    private final Lazy<Service> service;

    /**
     * Gets the Bing Ads API environment.
     */
    public ApiEnvironment getEnvironment() {
        return environment;
    }

    /**
     * Gets the data representing a user who intends to call the API.
     */
    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    private static boolean getDisableRestApi(Class<?> serviceClass) {
        if (serviceClass == IAdInsightService.class) {
            return true;
        }
        return ServiceUtils.getDisableRestApi(serviceClass);
    }

    /**
     * Initializes a new instance of this class with the specified authorization data.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, Class<T> serviceInterface) {
        this(authorizationData, null, serviceInterface);
    }    

    /**
     * Initializes a new instance of this class with the specified authorization data and Bing Ads API environment.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param environment Bing Ads API environment
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface) {
        this.authorizationData = authorizationData;
        this.serviceInterface = serviceInterface;
        
        if (environment == null) {
            if (authorizationData.getAuthentication() != null) {
                environment = authorizationData.getAuthentication().getEnvironment();
            }
        }

        if (environment == null) {
            environment = ServiceUtils.getEnvironmentFromConfig();
        }

        if (environment == null) {
            environment = ApiEnvironment.PRODUCTION;
        }

        this.environment = environment;

        serviceFactory = ServiceFactoryFactory.createServiceFactory();

        service = new Lazy<Service>(() -> {
            Service newService = serviceFactory.createService(this.serviceInterface, this.environment);

            newService.setHandlerResolver(new HandlerResolver() {
                @Override
                public List<Handler> getHandlerChain(PortInfo portInfo) {
                    return Arrays.asList(HeaderHandler.getInstance(), MessageHandler.getInstance());
                }
            });

            return newService;
        });
    }

    /**
     * Creates an object implementing the service interface that needs to be called.
     *
     * @return the service object implementing the service interface
     */
    public T getService() {
        authorizationData.validate();

        final Map<String, String> headers = buildHeaders();

        if (getDisableRestApi(serviceInterface)) {
            return createSoapPort(headers);
        }
        
        return createRestService(headers);        
    }

    private Map<String, String> buildHeaders() {
        final Map<String, String> headers = new HashMap<String, String>();

        headers.put("CustomerAccountId", Long.toString(authorizationData.getAccountId()));

        headers.put("CustomerId", Long.toString(authorizationData.getCustomerId()));

        headers.put("DeveloperToken", authorizationData.getDeveloperToken());

        Authentication authentication = authorizationData.getAuthentication();

        if (authentication instanceof OAuthWithAuthorizationCode) {
            ((OAuthWithAuthorizationCode) authentication).refreshTokensIfNeeded(false);            
        }

        authentication.addHeaders(new HeadersImpl() {
            @Override
            public void addHeader(String name, String value) {
                headers.put(name, value);
            }
        });

        return headers;
    }

    T createSoapPort(Map<String, String> headers) {
        T port = serviceFactory.createProxyFromService(service.getValue(), environment, serviceInterface);

        ((BindingProvider) port).getRequestContext().put(ServiceUtils.REQUEST_HEADERS_KEY, headers);

        return port;
    }

    T createRestService(Map<String, String> headers) {        
        return RestfulServiceFactory.createServiceClient(headers, environment, serviceInterface, () -> createSoapPort(headers));
    }
}
