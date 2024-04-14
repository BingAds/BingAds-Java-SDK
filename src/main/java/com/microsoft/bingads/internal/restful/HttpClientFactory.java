package com.microsoft.bingads.internal.restful;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.cxf.transport.common.gzip.GZIPFeature;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.internal.CxfUtils;
import com.microsoft.bingads.internal.ServiceFactoryImpl;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

class HttpClientFactory {
    private static final Map<String, WebTarget> WebTargetByService = initialize();

    public static WebTarget get(Class<?> serviceInterface, ApiEnvironment environment) {
        String key = getKey(serviceInterface, environment);

        return WebTargetByService.get(key);
    }

    private static Map<String, WebTarget> initialize() {
        Client client = ClientBuilder.newBuilder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES)
            .executorService(Executors.newCachedThreadPool(
                (Runnable r) -> {
                    Thread t = new Thread(r);
                    t.setDaemon(true);
                    return t;
                }
            ))
            .property("jersey.config.client.suppressHttpComplianceValidation", true) // allow DELETE requests with body
            .build();

        boolean isCxf = client.getClass().getName().contains("org.apache.cxf");

        if (isCxf) {
            client.register(new GZIPFeature());

            return CxfUtils.runOnNewBus(
                () -> initializeWebTargets(client), 
                (logging) -> { 
                    Set<String> headerNames = new HashSet<>();
                    
                    headerNames.add("AuthenticationToken");
                    headerNames.add("Password");

                    logging.setSensitiveProtocolHeaderNames(headerNames); 
                }
            );
        }

        return initializeWebTargets(client);
    }

    private static String getKey(Class<?> serviceInterface, ApiEnvironment environment) {
        return serviceInterface.getName() + "_" + environment.toString();
    }

    private static Map<String, WebTarget> initializeWebTargets(Client client) {
        Map<String, WebTarget> webTargets = new HashMap<>();

        for (ApiEnvironment environment : Arrays.asList(ApiEnvironment.PRODUCTION, ApiEnvironment.SANDBOX)) {    
            for (Map.Entry<Class<?>, ServiceInfo> endpoint : ServiceFactoryImpl.endpoints.entrySet()) {
                Class<?> serviceInterface = endpoint.getKey();

                ServiceInfo serviceInfo = endpoint.getValue();
            
                String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

                if (serviceUrl == null) {
                    serviceUrl = serviceInfo.GetUrl(environment);
                }

                URL soapUrl;
                try {
                    soapUrl = new URL(serviceUrl);
                } catch (MalformedURLException e) {
                    throw new InternalException(e);
                }

                String restUrl = soapUrl.getProtocol() + "://" + soapUrl.getAuthority() + "/" + serviceInfo.getServiceNameAndVersion() + "/";
            
                String key = getKey(serviceInterface, environment);

                WebTarget webTarget = client.target(restUrl);

                webTargets.put(key, webTarget);
            }
        }

        return webTargets;
    }
}