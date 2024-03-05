package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.microsoft.bingads.v13.adinsight.IAdInsightService;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class RestfulServiceClient extends RestfulServiceClientExtension{
    protected static final String HttpPost = "POST";
    protected static final String HttpPut = "PUT";
    protected static final String HttpDelete = "DELETE";

    protected AuthorizationData authorizationData;

    protected ApiEnvironment environment;
    
    protected Object soapService;

    private Class serviceInterface;
    
    private ConcurrentHashMap<Class, Calendar> retryAfter = new ConcurrentHashMap<Class, Calendar>();
    
    private ArrayList<Integer> statusCodesForApplicationFault = new ArrayList<Integer>(Arrays.asList(400, 401, 403));
    
    private ArrayList<Integer> statusCodesForSwitchToSoap = new ArrayList<Integer>(Arrays.asList(404, 501));
    
    private CloseableHttpAsyncClient asyncClient = HttpAsyncClients.createDefault();
    
    private CloseableHttpClient httpClient = HttpClients.custom()
    												.setConnectionManager(new PoolingHttpClientConnectionManager())
    												.setConnectionManagerShared(true)
    												.build();
    
    private String userAgent;
    
    private boolean enableFallbackToSoap;

    protected RestfulServiceClient(AuthorizationData authData, ApiEnvironment env, Class serviceInterface) {
        this.authorizationData = authData;
        this.environment = env;
        this.serviceInterface = serviceInterface;
        this.enableFallbackToSoap = ServiceUtils.getFallbackFlag();
        this.userAgent = ServiceUtils.getUserAgent();
        switch (serviceInterface.getSimpleName()) {
        case "ICampaignManagementService":
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
        	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
        }
    }
    
    public void setSoapService(Object soapService)
    {
    	this.soapService = soapService;
    }

    private List<String> buildHeaders() {
        List<String> headers = new ArrayList<String>();

        //headers.add("Content-Type");
        //headers.add("application/json");

        headers.add("ApplicationToken");
        headers.add(authorizationData.getDeveloperToken());

        headers.add("CustomerId");
        headers.add(Long.toString(authorizationData.getCustomerId()));

        headers.add("CustomerAccountId");
        headers.add(Long.toString(authorizationData.getAccountId()));

        headers.add("DeveloperToken");
        headers.add(authorizationData.getDeveloperToken());

        this.authorizationData.getAuthentication().addHeaders(new HeadersImpl() {
            @Override
            public void addHeader(String name, String value) {
                headers.add(name);
                headers.add(value);
            }
        });

        addUserAgent(headers);

        return headers;
    }

    private <T> void addUserAgent(List<String> headers) {
        String actualUserAgent = "BingAdsSDKJava.RestApi";
        if (userAgent != null) {
        	actualUserAgent += "." + userAgent;
        } 
        
        String javaVersion = System.getProperty("java.version");
        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
        	actualUserAgent += "/" + javaVersion;
        }

        headers.add("User-Agent");
        headers.add(actualUserAgent);
    }
    
    private <Req, Resp> Resp callSoapMethod(Req request) throws Exception {
    	Method method;
    	Object response = null;
    	String[] strs = request.getClass().getName().split("\\.");
    	String methodName = strs[strs.length - 1];
    	methodName = methodName.substring(0, 1).toLowerCase() + methodName.substring(1, methodName.length() - 7);
		try {
			method = soapService.getClass().getMethod(methodName, request.getClass());
			response = method.invoke(soapService, request);
		} catch (Exception e) {
			throw (Exception)e.getCause();
		}
    	return (Resp)response;
    }
    
    private <Req, Resp> Response<Resp> callSoapMethodAsync(Req request)
    {
    	Method method;
    	Response<Resp> response = null;
    	String[] strs = request.getClass().getName().split("\\.");
    	String methodName = strs[strs.length - 1];
    	methodName = methodName.substring(0, 1).toLowerCase() + methodName.substring(1, methodName.length() - 7) + "Async";
    	try {
    		method = soapService.getClass().getMethod(methodName, request.getClass());
			response = (Response<Resp>) method.invoke(soapService, request);
    	} catch (Exception e) {
    		e.printStackTrace();
		}
    	
    	return response;
    }
    
    private HttpEntityEnclosingRequestBase asRequest(String request, String verb, String entityEndpoint)
    		throws Exception {
    	HttpEntityEnclosingRequestBase req = null;
    	URI uri = new URI(getServiceUrl(entityEndpoint));
    	StringEntity entity = new StringEntity(request, ContentType.APPLICATION_JSON);
    	List<String> headers = buildHeaders();
    	
    	switch (verb) {
    		case HttpPost:
    			req = new HttpPost(uri);
    			req.setEntity(entity);
    			break;
    		case HttpPut:
    			req = new HttpPut(uri);
    			req.setEntity(entity);
    			break;
    		case HttpDelete:
    			req = new HttpDeleteWithBody(uri);
    			req.setEntity(entity);
    			break;
    	}

    	if (req != null) {
    		for (int i = 0; i < headers.size(); i += 2) {
    			req.setHeader(headers.get(i), headers.get(i + 1));
    		}
    	}
    	
    	return req;
    }
    
    private void SetRetryAfterTime(Header header)
    {
    	String value = header != null ? header.getValue() : null;
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
    
    protected <Req, Resp> Resp sendRequest(Req request, String entityEndpoint, String verb, Class respClass)
            throws Exception {
    	if (retryAfter.get(serviceInterface) != null && enableFallbackToSoap
    		&& Calendar.getInstance().before(retryAfter.get(serviceInterface))) {
    		return callSoapMethod(request);
    	}

        String jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);
    	
        String[] headers = buildHeaders().toArray(new String[0]);

        HttpEntityEnclosingRequestBase req = asRequest(jsonRequest, verb, entityEndpoint);
        CloseableHttpResponse response = httpClient.execute(req);
        
        int statusCode = response.getStatusLine().getStatusCode();    
        Header header = response.getFirstHeader("Retry-After");
        if (statusCodesForSwitchToSoap.contains(statusCode)) {
        	SetRetryAfterTime(header);
        }
        
        
        if (statusCodesForApplicationFault.contains(statusCode)) {
        	throwException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), response);
        }
     
        if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) {
        	return callSoapMethod(request);
        }
        
        Resp resp = (Resp)AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(response.getEntity().getContent()), respClass);
        response.close();
        httpClient.close();
        return resp;
    }
    
    protected <Req, Resp> Future<?> sendRequestAsync(Req request, String entityEndpoint, String verb, Class respClass, AsyncHandler<Resp> asyncHandler)
            throws URISyntaxException, IOException, InterruptedException {
    	Response<Resp> resp = sendRequestAsync(request, entityEndpoint, verb, respClass);
    	asyncHandler.handleResponse(resp);
        return resp;
    }

    protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class respClass)
            throws URISyntaxException, IOException, InterruptedException {
    	if (retryAfter.get(serviceInterface) != null && enableFallbackToSoap
    		&& Calendar.getInstance().before(retryAfter.get(serviceInterface))) {
    		return callSoapMethodAsync(request);
    	}

    	String jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);
    	
    	HttpEntityEnclosingRequestBase req = null;
		try {
			req = asRequest(jsonRequest, verb, entityEndpoint);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		asyncClient.start();
    	Future<HttpResponse> future = asyncClient.execute(req, null);
    	
    	return new Response<Resp>() {

            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                // TODO Auto-generated method stub
                return future.cancel(mayInterruptIfRunning);
            }

            @Override
            public boolean isCancelled() {
                // TODO Auto-generated method stub
                return future.isCancelled();
            }

            @Override
            public boolean isDone() {
                // TODO Auto-generated method stub
                return future.isDone();
            }

            @Override
            public Resp get() throws InterruptedException, ExecutionException {
            	HttpResponse resp = null;
            	try {
            		resp = future.get();
            	} catch (InterruptedException e) {
            		System.out.println(e.getCause());
            	}
            	
            	int statusCode = resp.getStatusLine().getStatusCode(); 
            	Header header = resp.getFirstHeader("RetryAfter");
                if (statusCodesForSwitchToSoap.contains(statusCode)) {
                	SetRetryAfterTime(header);
                }
            	
            	      	
            	if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) {
            		try {
						Response<Resp> response = callSoapMethodAsync(request);
						return response.get();
					} catch (Exception e) {
						e.printStackTrace();
					}
            	}
            	else if (statusCodesForApplicationFault.contains(statusCode)) {
            		throwExecutionException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), resp);
            	}
            	  	
            	try {
            		return (Resp)AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(resp.getEntity().getContent()), respClass);
            	} catch (Exception e) {
					e.printStackTrace();
				}
            	
            	return null;
            }

            @Override
            public Resp get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            	HttpResponse resp = future.get(timeout, unit);
            	int statusCode = resp.getStatusLine().getStatusCode();  
            	Header header = resp.getFirstHeader("RetryAfter");
                if (statusCodesForSwitchToSoap.contains(statusCode)) {
                	SetRetryAfterTime(header);
                }
            		     	
            	if (statusCodesForSwitchToSoap.contains(statusCode) && enableFallbackToSoap) {
            		try {
						Response<Resp> response = callSoapMethodAsync(request);
						return response.get();
					} catch (Exception e) {
						e.printStackTrace();
					}
            	}
            	else if (statusCodesForApplicationFault.contains(statusCode)) {
            		throwExecutionException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), resp);
            	}
            	
            	try {
            		return (Resp)AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(resp.getEntity().getContent()), respClass);
            	} catch (Exception e) {
					e.printStackTrace();
				}
            	
            	return null;
            }

            @Override
            public Map<String, Object> getContext() {
                return null;
            }

        };
    }

    //
    // Service configuration.
    //

    private static final Map<Class<?>, ServiceInfo> ENDPOINTS = new HashMap<>();
    static {
        ENDPOINTS.put(ICustomerBillingService.class, new ServiceInfo(
                "https://clientcenter.api.bingads.microsoft.com/Billing/v13",
                "https://clientcenter.api.sandbox.bingads.microsoft.com/Billing/v13"));
        ENDPOINTS.put(ICustomerManagementService.class, new ServiceInfo(
                "https://clientcenter.api.bingads.microsoft.com/CustomerManagement/v13",
                "https://clientcenter.api.sandbox.bingads.microsoft.com/CustomerManagement/v13"));
        ENDPOINTS.put(IReportingService.class, new ServiceInfo(
                "https://reporting.api.bingads.microsoft.com/Reporting/v13",
                "https://reporting.api.sandbox.bingads.microsoft.com/Reporting/v13"));
        ENDPOINTS.put(ICampaignManagementService.class, new ServiceInfo(
                "https://campaign.api.bingads.microsoft.com/CampaignManagement/v13",
                "https://campaign.api.sandbox.bingads.microsoft.com/CampaignManagement/v13"));
        ENDPOINTS.put(IAdInsightService.class, new ServiceInfo(
                "https://adinsight.api.bingads.microsoft.com/AdInsight/v13",
                "https://adinsight.api.sandbox.bingads.microsoft.com/AdInsight/v13"));
        ENDPOINTS.put(IBulkService.class, new ServiceInfo(
                "https://bulk.api.bingads.microsoft.com/CampaignManagement/v13",
                "https://bulk.api.sandbox.bingads.microsoft.com/CampaignManagement/v13"));
        // End of v13
    }

    private String getServiceUrl(String entityEndpoint) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);
        if (serviceUrl == null) {
            serviceUrl = ENDPOINTS.get(serviceInterface).getUrl(environment);
        } else {
            URI uri = URI.create(serviceUrl);
            serviceUrl = "https://" + uri.getAuthority() + "/CampaignManagement/v13";
        }

        return serviceUrl + entityEndpoint;
    }
}
