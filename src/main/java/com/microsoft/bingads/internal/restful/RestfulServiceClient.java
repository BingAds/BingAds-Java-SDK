package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Function;

import jakarta.ws.rs.client.AsyncInvoker;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.InvocationCallback;
import jakarta.ws.rs.client.WebTarget;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceFactoryImpl;
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

    protected Map<String, String> headers;

    protected ApiEnvironment environment;

    private Class<?> serviceInterface;
    
    private static final ConcurrentHashMap<Class<?>, Calendar> retryAfter = new ConcurrentHashMap<Class<?>, Calendar>();
    
    private static final ArrayList<Integer> statusCodesForApplicationFault = new ArrayList<Integer>(Arrays.asList(400, 401, 403, 429, 500));
    
    private static final ArrayList<Integer> statusCodesForSwitchToSoap = new ArrayList<Integer>(Arrays.asList(404, 501));

    private static final String userAgent = getUserAgent();
    
    private boolean enableFallbackToSoap;

    static {
        com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    
        com.microsoft.bingads.internal.restful.adaptor.generated.bulk.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        com.microsoft.bingads.internal.restful.adaptor.generated.bulk.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    
        com.microsoft.bingads.internal.restful.adaptor.generated.reporting.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        com.microsoft.bingads.internal.restful.adaptor.generated.reporting.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    }

    protected RestfulServiceClient(Map<String, String> headers, ApiEnvironment env, Class<?> serviceInterface) {
        this.headers = headers;
        this.environment = env;
        this.serviceInterface = serviceInterface;
        this.enableFallbackToSoap = ServiceUtils.getFallbackFlag();
    }

    private static String getUserAgent() {
        String actualUserAgent = "BingAdsSDKJava.RestApi";

        String clientName = ServiceUtils.getClientName();

        if (clientName != null) {
        	actualUserAgent += "." + clientName;
        }

        actualUserAgent += "/" + ServiceFactoryImpl.VERSION;
        
        String javaVersion = System.getProperty("java.version");

        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
        	actualUserAgent += "_" + javaVersion;
        }

        return actualUserAgent;
    }

    private Invocation.Builder asRequest(String entityEndpointPath) {
        WebTarget targetForService = HttpClientFactory.get(serviceInterface, environment);

        Invocation.Builder builder = targetForService.path(entityEndpointPath).request();
        
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }

        builder.header("User-Agent", userAgent);

        return builder;
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

        Invocation.Builder builder = asRequest(entityEndpoint);

        jakarta.ws.rs.core.Response httpResponse;

        switch (verb) {
            case HttpPost:
                httpResponse = builder.post(Entity.json(jsonRequest));
                break;
            case HttpPut:
                httpResponse = builder.put(Entity.json(jsonRequest));
                break;
            case HttpDelete:
                httpResponse = builder.method("DELETE", Entity.json(jsonRequest));
                break;
            default:
                throw new InternalException("Unknown HTTP verb: " + verb);
        }

        int statusCode = httpResponse.getStatus();

        if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) {                
            SetRetryAfterTime(httpResponse.getHeaderString("RetryAfter"));

            httpResponse.close();

            return null;
        }
        
        ResponseInfo<TResponse, TFaultDetail> responseInfo = new ResponseInfo<>();

        if (statusCodesForApplicationFault.contains(statusCode)) {
            TFaultDetail faultDetail = parseStream((InputStream)httpResponse.getEntity(), faultDetailClass);

            responseInfo.setFaultDetail(faultDetail);

            return responseInfo;
        }

        if (statusCode >= 200 && statusCode <= 299) {
            TResponse response = parseStream((InputStream)httpResponse.getEntity(), responseClass);

            responseInfo.setResponse(response);

            return responseInfo;
        }

        throw new InternalException("Got unexpected status code " + statusCode + " with response content: " + httpResponse.readEntity(String.class));
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

        InvocationCallback<jakarta.ws.rs.core.Response> invocationCallback = new InvocationCallback<jakarta.ws.rs.core.Response>() {
            @Override
            public void completed(jakarta.ws.rs.core.Response httpResponse) {
                try {
                    int statusCode = httpResponse.getStatus();

                    if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) { 
                        httpResponse.close();
                        
                        SetRetryAfterTime(httpResponse.getHeaderString("RetryAfter"));
                        
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

                    String trackingIdHeader = httpResponse.getHeaderString(ServiceUtils.TRACKING_HEADER_NAME);
                    
                    if (statusCodesForApplicationFault.contains(statusCode)) {
                        TFaultDetail faultDetail = parseStream(httpResponse.readEntity(InputStream.class), faultDetailClass);

                        Exception exception = getException.apply(faultDetail);

                        responseFuture.setException(exception);

                        return;
                    }
                    
                    Map<String, Object> context = new HashMap<>();

                    context.put(ServiceUtils.TRACKING_KEY, trackingIdHeader);
                    
                    responseFuture.setContext(context);

                    if (statusCode >= 200 && statusCode <= 299) {
                        TResponse responseObj = parseStream(httpResponse.readEntity(InputStream.class), respClass);

                        responseFuture.setResult(responseObj);

                        return;
                    }

                    throw new InternalException("Got unexpected status code " + statusCode + " with response content: " + httpResponse.readEntity(String.class));
                } catch (Throwable e) {
                    responseFuture.setException(e);
                }
            }

            @Override
            public void failed(Throwable throwable) {
                responseFuture.setException(throwable);
            }
        };

        AsyncInvoker asyncInvoker = asRequest(entityEndpoint).async();

        switch (verb) {
            case HttpPost:
                asyncInvoker.post(Entity.json(jsonRequest), invocationCallback);
                break;
            case HttpPut:
                asyncInvoker.put(Entity.json(jsonRequest), invocationCallback);
                break;
            case HttpDelete:
                asyncInvoker.method("DELETE", Entity.json(jsonRequest), invocationCallback);
                break;
            default:
                throw new InternalException("Unknown HTTP verb: " + verb);
        }        
        
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
}
