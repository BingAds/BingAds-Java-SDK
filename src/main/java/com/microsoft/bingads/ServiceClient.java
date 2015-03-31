package com.microsoft.bingads;

import com.microsoft.bingads.internal.HttpHeaders;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import com.microsoft.bingads.adintelligence.IAdIntelligenceService;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.optimizer.IOptimizerService;
import com.microsoft.bingads.reporting.IReportingService;

/**
 * Provides an interface for calling the methods of the specified Bing Ads service.
 * <p>
 *     Note: Valid value of {@link T} are:
 *     <ul>
 *         <li>{@link IAdIntelligenceService}</li>
 *         <li>{@link IBulkService}</li>
 *         <li>{@link ICampaignManagementService}</li>
 *         <li>{@link ICustomerBillingService}</li>
 *         <li>{@link ICustomerManagementService}</li>
 *         <li>{@link IOptimizerService}</li>
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
        this(authorizationData, ApiEnvironment.PRODUCTION, serviceInterface);

        ApiEnvironment environmentFromConfig = getEnvironmentFromConfig();

        if (environmentFromConfig != null) {
            this.environment = environmentFromConfig;
        }
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
        this.environment = environment;

        serviceFactory = ServiceFactoryFactory.createServiceFactory();

        service = serviceFactory.createService(serviceInterface);
    }

    /**
     * Creates an object implementing the service interface that needs to be called.
     *
     * @return the service object implementing the service interface
     */
    public T getService() {
        try {
            authorizationData.validate();

            T port = serviceFactory.createProxyFromService(service, environment, serviceInterface);

            WebService webServiceAnnotation = serviceInterface.getAnnotation(WebService.class);

            final String ns = webServiceAnnotation.targetNamespace();

            final List<Header> apacheHeaders = new ArrayList<Header>();

            if (this.authorizationData.getAccountId() != 0) {
                apacheHeaders.add(new Header(new QName(ns, "CustomerAccountId"), Long.toString(this.authorizationData.getAccountId()), new JAXBDataBinding(String.class)));
            }

            if (this.authorizationData.getCustomerId() != 0) {
                apacheHeaders.add(new Header(new QName(ns, "CustomerId"), Long.toString(this.authorizationData.getCustomerId()), new JAXBDataBinding(String.class)));
            }

            apacheHeaders.add(new Header(new QName(ns, "DeveloperToken"), this.authorizationData.getDeveloperToken(), new JAXBDataBinding(String.class)));

            refreshOAuthTokensIfNeeded();            

            this.authorizationData.getAuthentication().addHeaders(new HeadersImpl() {
                @Override
                public void addHeader(String name, String value) {
                    try {
                        apacheHeaders.add(new Header(new QName(ns, name), value, new JAXBDataBinding(String.class)));
                    } catch (JAXBException ex) {
                        throw new InternalException(ex);
                    }
                }
            });

            ((BindingProvider) port).getRequestContext().put(org.apache.cxf.headers.Header.HEADER_LIST, apacheHeaders);

            return port;
        } catch (JAXBException ex) {
            throw new InternalException(ex);
        }
    }

    private void refreshOAuthTokensIfNeeded() {
        if (authorizationData.getAuthentication() instanceof OAuthWithAuthorizationCode) {
            OAuthWithAuthorizationCode auth = (OAuthWithAuthorizationCode) authorizationData.getAuthentication();

            auth.refreshTokensIfNeeded(false);
        }
    }

    private ApiEnvironment getEnvironmentFromConfig() {
        InputStream input = null;
        try {
            input = this.getClass().getClassLoader().getResourceAsStream("bingads.properties");

            if (input == null) {
                return null;
            }

            Properties props = new Properties();

            props.load(input);

            String envString = props.getProperty("environment");

            if (envString == null) {
                return null;
            }

            return ApiEnvironment.fromValue(envString);
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                throw new InternalException(ex);
            }
        }
    }
}
