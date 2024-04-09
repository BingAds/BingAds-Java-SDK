package com.microsoft.bingads;

import java.util.logging.Logger;
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
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceUtils;
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
    private static Logger logger = Logger.getLogger(ServiceClient.class.getName());

    private final AuthorizationData authorizationData;

    private final Class<T> serviceInterface;
    private final Service service;
    private final ServiceFactory serviceFactory;
    private ApiEnvironment environment;
    private T restService;

    private boolean enableRestApi;

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

    private static HashMap<Class<?>, Boolean> EnableRestApiDefault = new HashMap<Class<?>, Boolean>() {{
        put(ICampaignManagementService.class, false);
        put(IBulkService.class, false);
        put(IReportingService.class, false);
        put(ICustomerManagementService.class, false);
        put(ICustomerBillingService.class, false);
        put(IAdInsightService.class, false);
    }};

    public static void setRestApiEnabledDefault(Class<?> serviceClass, boolean restApiEnabled) {
        EnableRestApiDefault.replace(serviceClass, restApiEnabled);
    }

    public static boolean getRestApiEnabledDefault(Class<?> serviceClass) {
        Boolean restApiEnabled = EnableRestApiDefault.get(serviceClass);

        if (restApiEnabled == null) {
            return false;
        }

        return restApiEnabled;
    }

    /**
     * Initializes a new instance of this class with the specified authorization data.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, Class<T> serviceInterface) {
        this(authorizationData, null, serviceInterface, getRestApiEnabledDefault(serviceInterface));
    }
    
    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface) {
    	this(authorizationData, environment, serviceInterface, getRestApiEnabledDefault(serviceInterface));
    }

    /**
     * Initializes a new instance of this class with the specified authorization data and Bing Ads API environment.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param environment Bing Ads API environment
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface, boolean enableRestApi) {
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

        service = serviceFactory.createService(serviceInterface, environment);

        service.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                return Arrays.asList(HeaderHandler.getInstance(), MessageHandler.getInstance());
            }
        });

        this.enableRestApi = enableRestApi;
    }

    /**
     * Creates an object implementing the service interface that needs to be called.
     *
     * @return the service object implementing the service interface
     */
    public T getService() {
        authorizationData.validate();

        final Map<String, String> headers = new HashMap<String, String>();

        headers.put("CustomerAccountId", Long.toString(authorizationData.getAccountId()));

        headers.put("CustomerId", Long.toString(authorizationData.getCustomerId()));

        headers.put("DeveloperToken", authorizationData.getDeveloperToken());
        
        if (!enableRestApi) {
        	return createSoapPort(headers);
        }
        else {       	
            return createRestService(headers);
        } 
    }

    T createSoapPort(Map<String, String> headers) {
        T port = serviceFactory.createProxyFromService(service, environment, serviceInterface);

        ((BindingProvider) port).getRequestContext().put(ServiceUtils.REQUEST_HEADERS_KEY, headers);

        ((BindingProvider) port).getRequestContext().put(ServiceUtils.REQUEST_AUTHENTICATION_KEY, this.authorizationData.getAuthentication());

        return port;
    }

    T createRestService(Map<String, String> headers) {        
        return RestfulServiceFactory.createServiceClient(authorizationData.getAuthentication(), headers, environment, serviceInterface, () -> createSoapPort(headers));
    }
}
