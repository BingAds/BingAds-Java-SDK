package com.microsoft.bingads;

import com.microsoft.bingads.internal.HeaderHandler;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceUtils;

import java.util.logging.Logger;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

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

        service = serviceFactory.createService(serviceInterface, environment);
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

        return port;
    }

    private void refreshOAuthTokensIfNeeded() {
        if (authorizationData.getAuthentication() instanceof OAuthWithAuthorizationCode) {
            OAuthWithAuthorizationCode auth = (OAuthWithAuthorizationCode) authorizationData.getAuthentication();

            auth.refreshTokensIfNeeded(false);
        }
    }

}
