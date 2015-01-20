package com.microsoft.bingads;

import com.microsoft.bingads.internal.ApiEnvironment;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceFactoryImpl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.Headers;
import org.apache.cxf.version.Version;

public class ServiceClient<T> {

    private final AuthorizationData authorizationData;

    private final Class<T> serviceInterface;
    private final Service service;
    private final ServiceFactory serviceFactory;
    private ApiEnvironment environment;

    public ApiEnvironment getEnvironment() {
        return environment;
    }

    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    public ServiceClient(AuthorizationData authorizationData, Class<T> serviceInterface) {
        this(authorizationData, ApiEnvironment.PRODUCTION, serviceInterface);
        
        ApiEnvironment environmentFromConfig = getEnvironmentFromConfig();
        
        if (environmentFromConfig != null) {
            this.environment = environmentFromConfig;
        }
    }

    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface) {
        this.authorizationData = authorizationData;
        this.serviceInterface = serviceInterface;
        this.environment = environment;                

        serviceFactory = ServiceFactoryFactory.createServiceFactory();

        service = serviceFactory.createService(serviceInterface);
    }

    public T getService() {
        try {
            authorizationData.validate();

            T port = serviceFactory.createProxyFromService(service, environment, serviceInterface);

            WebService webServiceAnnotation = serviceInterface.getAnnotation(WebService.class);

            String ns = webServiceAnnotation.targetNamespace();

            List<Header> apacheHeaders = new ArrayList<Header>();

            if (this.authorizationData.getAccountId() != null) {
                apacheHeaders.add(new Header(new QName(ns, "CustomerAccountId"), this.authorizationData.getAccountId().toString(), new JAXBDataBinding(String.class)));
            }
            
            if (this.authorizationData.getCustomerId() != null) {
                apacheHeaders.add(new Header(new QName(ns, "CustomerId"), this.authorizationData.getCustomerId().toString(), new JAXBDataBinding(String.class)));
            }
                        
            apacheHeaders.add(new Header(new QName(ns, "DeveloperToken"), this.authorizationData.getDeveloperToken(), new JAXBDataBinding(String.class)));

            this.authorizationData.getAuthentication().addAuthenticationHeadersApiRequest(apacheHeaders, ns);           
            
            ((BindingProvider) port).getRequestContext().put(org.apache.cxf.headers.Header.HEADER_LIST, apacheHeaders);
            
            return port;
        } catch (JAXBException ex) {
            throw new InternalException(ex);
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
