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

/**
 * Provides an interface for calling the methods of the specified Bing Ads service.
 *
 * @param <T> The Bing Ads service interface that should be called. For example, ICampaignManagementService.
 */
public class ServiceClient<T> {

    private final AuthorizationData authorizationData;

    private final Class<T> serviceInterface;
    private final Service service;
    private final ServiceFactory serviceFactory;
    private ApiEnvironment environment;

    /**
     * Gets the Bing Ads API environment.
     *
     * @return
     */
    public ApiEnvironment getEnvironment() {
        return environment;
    }

    /**
     * Gets the data representing a user who intends to call the API.
     *
     * @return
     */
    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    /**
     * Initializes a new instance of this class with the specified authorization data.
     *
     * @param authorizationData
     * @param serviceInterface
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
     * @param authorizationData
     * @param environment
     * @param serviceInterface
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
     * @return
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
