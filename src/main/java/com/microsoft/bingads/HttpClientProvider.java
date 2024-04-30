package com.microsoft.bingads;

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

import com.microsoft.bingads.internal.CxfUtils;
import com.microsoft.bingads.internal.ServiceFactoryImpl;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

public class HttpClientProvider {
    private Map<String, WebTarget> webTargetByService;

    public void initialize() {
        if (webTargetByService != null) {
            return;
        }

        ClientBuilder clientBuilder = configureClientBuilder(ClientBuilder.newBuilder());

        Client client = clientBuilder.build();

        webTargetByService = createWebTargets(client);
    }

    public WebTarget get(Class<?> serviceInterface, ApiEnvironment environment) {
        String key = getKey(serviceInterface, environment);

        return webTargetByService.get(key);
    }

    private static String getKey(Class<?> serviceInterface, ApiEnvironment environment) {
        return serviceInterface.getName() + "_" + environment.toString();
    }

    protected ClientBuilder configureClientBuilder(ClientBuilder clientBuilder) {
        String clientClassName = clientBuilder.getClass().getName();
        
        if (clientClassName.contains("org.apache.cxf")) {
            clientBuilder = clientBuilder.register(new GZIPFeature());
        }
        
        if (clientClassName.contains("org.glassfish.jersey")) {
            clientBuilder = clientBuilder.property("jersey.config.client.suppressHttpComplianceValidation", true); // allow DELETE requests with body
        }

        return clientBuilder
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES);
    }

    protected Map<String, WebTarget> createWebTargets(Client client) {
        boolean isCxf = client.getClass().getName().contains("org.apache.cxf");

        if (isCxf) {
            return CxfUtils.runOnNewBus(
                () -> initializeWebTargets(client),
                (logging) -> {
                    Set<String> headerNames = new HashSet<>();

                    headerNames.add("Authorization");
                    headerNames.add("Password");

                    logging.setSensitiveProtocolHeaderNames(headerNames);
                }
            );
        }

        return initializeWebTargets(client);
    }

    protected static Map<String, WebTarget> initializeWebTargets(Client client) {
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

                String restUrl = soapUrl.getProtocol() + "://" + soapUrl.getAuthority() + "/" + serviceInfo.getServiceNameAndVersion();

                String key = getKey(serviceInterface, environment);

                WebTarget webTarget = client.target(restUrl);

                webTarget.request();

                webTargets.put(key, webTarget);
            }
        }

        return webTargets;
    }
}