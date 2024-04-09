package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.jetty.client.InputStreamResponseListener;
import org.eclipse.jetty.client.Request;
import org.eclipse.jetty.client.Response.HeadersListener;
import org.eclipse.jetty.client.StringRequestContent;
import org.eclipse.jetty.http.HttpMethod;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

class ResponseInfo<TResponse, TFaultDetail> {
    private TResponse response;

    public TResponse getResponse() {
        return response;
    }

    public void setResponse(TResponse response) {
        this.response = response;
    }

    private TFaultDetail faultDetail;

    public TFaultDetail getFaultDetail() {
        return faultDetail;
    }

    public void setFaultDetail(TFaultDetail faultDetail) {
        this.faultDetail = faultDetail;
    }
}

class RestfulServiceClient {
    protected static final String HttpPost = "POST";
    protected static final String HttpPut = "PUT";
    protected static final String HttpDelete = "DELETE";

    protected Authentication authentication;

    protected Map<String, String> headers;

    protected ApiEnvironment environment;

    private Class<?> serviceInterface;
    
    private static final ConcurrentHashMap<Class<?>, Calendar> retryAfter = new ConcurrentHashMap<Class<?>, Calendar>();
    
    private static final ArrayList<Integer> statusCodesForApplicationFault = new ArrayList<Integer>(Arrays.asList(400, 401, 403, 429, 500));
    
    private static final ArrayList<Integer> statusCodesForSwitchToSoap = new ArrayList<Integer>(Arrays.asList(404, 501));

    private static final String userAgent = ServiceUtils.getUserAgent();
    
    private boolean enableFallbackToSoap;

    protected RestfulServiceClient(Authentication authentication, Map<String, String> headers, ApiEnvironment env, Class<?> serviceInterface) {
        this.authentication = authentication;
        this.headers = headers;
        this.environment = env;
        this.serviceInterface = serviceInterface;
        this.enableFallbackToSoap = ServiceUtils.getFallbackFlag();
        switch (serviceInterface.getSimpleName()) {
        case "ICampaignManagementService":
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
        case "IBulkService":
        	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
        case "IReportingService":
        	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
        }
    }   

    private String getServiceUrl(String entityEndpoint) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

        if (serviceUrl == null) {
            ServiceInfo serviceInfo = endpoints.get(serviceInterface);

            serviceUrl = serviceInfo.GetUrl(environment);
        }
        else {
        	URI uri = URI.create(serviceUrl);
            serviceUrl = "https://" + uri.getAuthority() + serviceNameAndVersion.get(serviceInterface);
        }
        
        return serviceUrl + entityEndpoint;
    }

    private static String getFullUserAgent() {
        String actualUserAgent = "BingAdsSDKJava.RestApi";
        if (userAgent != null) {
        	actualUserAgent += "." + userAgent;
        } 
        
        String javaVersion = System.getProperty("java.version");
        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
        	actualUserAgent += "/" + javaVersion;
        }

        return actualUserAgent;
    }
    
    private Request asRequest(String request, String verb, String entityEndpoint) {
        HttpMethod method;

        switch (verb) {
            case HttpPost:
                method = HttpMethod.POST;
                break;
            case HttpPut:
                method = HttpMethod.PUT;
                break;
            case HttpDelete:
                method = HttpMethod.DELETE;
                break;
            default:
                throw new InternalException("Unknown HTTP verb: " + verb);
        }

        String uri = getServiceUrl(entityEndpoint);

        Request req = HttpClientFactory.get()            
            .newRequest(uri)
            .method(method)
            .body(new StringRequestContent("application/json", request));

        if (authentication instanceof OAuthWithAuthorizationCode) {
            OAuthWithAuthorizationCode auth = (OAuthWithAuthorizationCode) authentication;

            auth.refreshTokensIfNeeded(false);            
        }

        req.headers(h -> {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                h.put(entry.getKey(), entry.getValue());
            }

            authentication.addHeaders(new HeadersImpl() {
                @Override
                public void addHeader(String name, String value) {
                    h.put(name, value);
                }
            });

            h.put("User-Agent", getFullUserAgent());
        });

        return req;
    }

    private void SetRetryAfterTime(String value)
    {    	
    	int delta;
    	try {
    		delta = Integer.parseInt(value);
    	} catch (NumberFormatException e) {
    		delta = 3600;
    	}
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.SECOND, delta);
    	retryAfter.put(serviceInterface, cal);
    }
    
    protected <TRequest, TResponse, TFaultDetail> ResponseInfo<TResponse, TFaultDetail> getResponseInfo(TRequest request, String entityEndpoint, String verb, Class<TResponse> responseClass, Class<TFaultDetail> faultDetailClass) {
        if (retryAfter.get(serviceInterface) != null && enableFallbackToSoap
            && Calendar.getInstance().before(retryAfter.get(serviceInterface))) {
            return null;
        }

        String jsonRequest;
        try {
            jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            throw new InternalException(e);
        }

        Request httpRequest = asRequest(jsonRequest, verb, entityEndpoint);

        InputStreamResponseListener listener = new InputStreamResponseListener();

        httpRequest.send(listener);
        
        org.eclipse.jetty.client.Response httpResponse;
        try {
            httpResponse = listener.get(5, TimeUnit.MINUTES);
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            throw new InternalException(e);
        }

        int statusCode = httpResponse.getStatus();

        if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) {                
            SetRetryAfterTime(httpResponse.getHeaders().get("RetryAfter"));

            return null;
        }
        
        ResponseInfo<TResponse, TFaultDetail> responseInfo = new ResponseInfo<>();

        if (statusCodesForApplicationFault.contains(statusCode)) {
            TFaultDetail faultDetail = parseStream(listener.getInputStream(), faultDetailClass);

            responseInfo.setFaultDetail(faultDetail);

            return responseInfo;
        }

        if (statusCode >= 200 && statusCode <= 299) {
            TResponse response = parseStream(listener.getInputStream(), responseClass);

            responseInfo.setResponse(response);

            return responseInfo;
        }

        throw new InternalException("Unexpected HTTP status code: " + statusCode);
    }

    protected String getFaultMessage(String trackingId) {
		return "An error occurred while executing the request. Please check the exception Detail property for more information. TrackingId: " + trackingId;
	}

    protected <T> T parseStream(InputStream stream, Class<T> resultClass) {
        try {
            return AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(stream), resultClass);
        } catch (IOException e) {
            throw new InternalException(e);
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                throw new InternalException(e);
            }
        }
    }

    protected <TRequest, TResponse, TFaultDetail> Response<TResponse> processRequestAsync(TRequest request, String entityEndpoint, String verb, Class<TResponse> respClass, Class<TFaultDetail> faultDetailClass, Function<TFaultDetail, Exception> getException, BiFunction<TRequest, AsyncHandler<TResponse>, Future<?>> soapMethod, AsyncHandler<TResponse> handler) {        
        ResponseFuture<TResponse> responseFuture = new ResponseFuture<TResponse>(); 

        if (handler != null) {
            responseFuture.setHandler(handler);
        }

        Calendar retryAfterTime = retryAfter.get(serviceInterface);

        if (retryAfterTime != null && Calendar.getInstance().before(retryAfterTime)) {
            soapMethod.apply(request, new AsyncHandler<TResponse>() {
                @Override
                public void handleResponse(Response<TResponse> soapResponse) {
                    try {
                        responseFuture.setContext(soapResponse.getContext());                        

                        responseFuture.setResult(soapResponse.get());
                    } catch (Throwable e) {
                        responseFuture.setException(e);
                    }
                }
            });

            return responseFuture;
        }

        String jsonRequest;
        try {
            jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            throw new InternalException(e);
        }

        InputStreamResponseListener listener = new InputStreamResponseListener();

        Request httpRequest = asRequest(jsonRequest, verb, entityEndpoint).onResponseHeaders(new HeadersListener() {
            @Override
            public void onHeaders(org.eclipse.jetty.client.Response httpResponse) {
                try {
                    int statusCode = httpResponse.getStatus();

                    if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) { 
                        httpResponse.abort(new IOException("REST API method not supported, will fallback"));
                        
                        SetRetryAfterTime(httpResponse.getHeaders().get("RetryAfter"));
                        
                        soapMethod.apply(request, new AsyncHandler<TResponse>() {
                            @Override
                            public void handleResponse(Response<TResponse> soapResponse) {
                                try {
                                    responseFuture.setContext(soapResponse.getContext());

                                    responseFuture.setResult(soapResponse.get());
                                } catch (Throwable e) {
                                    responseFuture.setException(e);
                                }
                            }
                        });

                        return;
                    }

                    String trackingIdHeader = httpResponse.getHeaders().get(ServiceUtils.TRACKING_HEADER_NAME);
                    
                    CompletableFuture.runAsync(() -> {                    
                        if (statusCodesForApplicationFault.contains(statusCode)) {
                            TFaultDetail faultDetail = parseStream(listener.getInputStream(), faultDetailClass);

                            Exception exception = getException.apply(faultDetail);

                            responseFuture.setException(exception);

                            return;
                        }
                        
                        Map<String, Object> context = new HashMap<>();

                        context.put(ServiceUtils.TRACKING_KEY, trackingIdHeader);
                        
                        responseFuture.setContext(context);

                        if (statusCode >= 200 && statusCode <= 299) {
                            TResponse responseObj = parseStream(listener.getInputStream(), respClass);

                            responseFuture.setResult(responseObj);

                            return;
                        }

                        throw new InternalException("Unexpected HTTP status code: " + statusCode);
                    })
                    .whenComplete((r, e) -> { 
                        if (e != null) {
                            responseFuture.setException(e); 
                        }
                    });
                } catch (Throwable e) {
                    responseFuture.setException(e);
                }
            }
        });

        httpRequest.send(listener);
        
        return responseFuture;
    }

    static class ResponseFuture<T> extends ResultFuture<T> implements Response<T> {
        private Map<String, Object> context = null;

        public ResponseFuture() {
            super(null);
        }

        public void setHandler(AsyncHandler<T> handler) {
            super.handler = new AsyncCallback<T>() {
                @Override
                public void onCompleted(Future<T> result) {
                    handler.handleResponse(new Response<T>() {
                        @Override
                        public boolean cancel(boolean mayInterruptIfRunning) {
                            return result.cancel(mayInterruptIfRunning);
                        }

                        @Override
                        public boolean isCancelled() {
                            return result.isCancelled();
                        }

                        @Override
                        public boolean isDone() {
                            return result.isDone();
                        }

                        @Override
                        public T get() throws InterruptedException, ExecutionException {
                            return result.get();
                        }

                        @Override
                        public T get(long timeout, TimeUnit unit)
                                throws InterruptedException, ExecutionException, TimeoutException {
                            return result.get(timeout, unit);
                        }

                        @Override
                        public Map<String, Object> getContext() {
                            return context;
                        }
                    });
                }

            };
        }

        @Override
        public Map<String, Object> getContext() {
            return context;
        }

        void setContext(Map<String, Object> context) {
            this.context = context;
        }
    }
    
    private static final Map<Class<?>, String> serviceNameAndVersion = new HashMap<Class<?>, String>() {
    	{
    		put(com.microsoft.bingads.v13.customerbilling.ICustomerBillingService.class, "/Billing/v13");

    		put(com.microsoft.bingads.v13.customermanagement.ICustomerManagementService.class, "/CustomerManagement/v13");
    		
    		put(com.microsoft.bingads.v13.reporting.IReportingService.class, "/Reporting/v13");
    		
    		put(com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService.class, "/CampaignManagement/v13");
    		
    		put(com.microsoft.bingads.v13.adinsight.IAdInsightService.class, "/AdInsight/v13");
    		
    		put(com.microsoft.bingads.v13.bulk.IBulkService.class, "/Bulk/v13");
    	}
    };

    private static final Map<Class<?>, ServiceInfo> endpoints = new HashMap<Class<?>, ServiceInfo>() {
        {

            put(com.microsoft.bingads.v13.customerbilling.ICustomerBillingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/Billing/v13");
                    setSandboxUrl("https://clientcenter.api.sandbox.bingads.microsoft.com/Billing/v13");
                }
            });
            put(com.microsoft.bingads.v13.customermanagement.ICustomerManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://clientcenter.api.bingads.microsoft.com/CustomerManagement/v13");
                    setSandboxUrl("https://clientcenter.api.sandbox.bingads.microsoft.com/CustomerManagement/v13");
                }
            });
            put(com.microsoft.bingads.v13.reporting.IReportingService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://reporting.api.bingads.microsoft.com/Reporting/v13");
                    setSandboxUrl("https://reporting.api.sandbox.bingads.microsoft.com/Reporting/v13");
                }
            });
            put(com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://campaign.api.bingads.microsoft.com/CampaignManagement/v13");
                    setSandboxUrl("https://campaign.api.sandbox.bingads.microsoft.com/CampaignManagement/v13");
                }
            });
            put(com.microsoft.bingads.v13.adinsight.IAdInsightService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://adinsight.api.bingads.microsoft.com/AdInsight/v13");
                    setSandboxUrl("https://adinsight.api.sandbox.bingads.microsoft.com/AdInsight/v13");
                }
            });
            put(com.microsoft.bingads.v13.bulk.IBulkService.class, new ServiceInfo() {
                {
                    setProductionUrl("https://bulk.api.bingads.microsoft.com/Bulk/v13");
                    setSandboxUrl("https://bulk.api.sandbox.bingads.microsoft.com/Bulk/v13");
                }
            });            
        }
    };

}
