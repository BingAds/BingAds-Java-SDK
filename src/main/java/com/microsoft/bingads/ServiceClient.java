package com.microsoft.bingads;

import java.util.logging.Logger;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashMap;
import java.util.List;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import jakarta.jws.WebService;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

import com.microsoft.bingads.internal.HeaderHandler;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.RestfulServiceFactory;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.restful.RestfulServiceClient;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception;
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
    private RestfulServiceClient restService;

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

    /**
     * Initializes a new instance of this class with the specified authorization data.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, Class<T> serviceInterface) {
        this(authorizationData, null, serviceInterface, true);
    }
    
    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface) {
    	this(authorizationData, environment, serviceInterface, true);
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
        
        if (enableRestApi) {
        	//restService = RestfulServiceFactory.createServiceClient(authorizationData, environment, serviceInterface);
        }
    }

    /**
     * Creates an object implementing the service interface that needs to be called.
     *
     * @return the service object implementing the service interface
     */
    public T getService() {
        authorizationData.validate();

        WebService webServiceAnnotation = serviceInterface.getAnnotation(WebService.class);

        final String ns = webServiceAnnotation.targetNamespace();

        final Map<String, String> headers = new HashMap<String, String>();

        headers.put("CustomerAccountId", Long.toString(authorizationData.getAccountId()));

        headers.put("CustomerId", Long.toString(authorizationData.getCustomerId()));

        headers.put("DeveloperToken", authorizationData.getDeveloperToken());

        refreshOAuthTokensIfNeeded();

        this.authorizationData.getAuthentication().addHeaders(new HeadersImpl() {
            @Override
            public void addHeader(String name, String value) {
                headers.put(name, value);
            }
        });

        service.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new HeaderHandler(ns, headers));
                handlerList.add(MessageHandler.getInstance());
                return handlerList;
            }
        });

        T port = serviceFactory.createProxyFromService(service, environment, serviceInterface);
        
        if (restService == null) {
        	return port;
        }
        else {
        	restService.setSoapService(port);
            
            return (T) Proxy.newProxyInstance(port.getClass().getClassLoader(), port.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args)  throws Throwable {
                	String methodName = method.getName();
                	Method delegationMethod = restService.getClass().getMethod(methodName, method.getParameterTypes());
                	Object response = null;
                	try {
                		response = delegationMethod.invoke(restService, args);
                	}
                	catch (Exception e)
                	{
                		throw e.getCause();
                	}
                	return response;
                }
            });
        } 
    }

    private void refreshOAuthTokensIfNeeded() {
        if (authorizationData.getAuthentication() instanceof OAuthWithAuthorizationCode) {
            OAuthWithAuthorizationCode auth = (OAuthWithAuthorizationCode) authorizationData.getAuthentication();

            auth.refreshTokensIfNeeded(false);
        }
    }

}
