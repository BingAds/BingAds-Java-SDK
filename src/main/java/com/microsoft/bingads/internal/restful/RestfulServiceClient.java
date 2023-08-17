package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;
import com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail;
import com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail;
import com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception;
import com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail;
import com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception;
import com.microsoft.bingads.v13.campaignmanagement.ApplicationFault; 

public class RestfulServiceClient extends RestfulServiceClientExtension{
    private static final String SDK_Version = "0.0.1";

    protected static final String HttpPost = "POST";
    protected static final String HttpPut = "PUT";
    protected static final String HttpDelete = "DELETE";

    protected AuthorizationData authorizationData;

    protected ApiEnvironment environment;
    
    protected Object soapService;

    private Class serviceInterface;

    private HttpClient client = HttpClient.newHttpClient();
    
    private static boolean enableRestApi = true;
    
    private boolean enableFallbackToSoap;

    protected RestfulServiceClient(AuthorizationData authData, ApiEnvironment env, Class serviceInterface) {
        this.authorizationData = authData;
        this.environment = env;
        this.serviceInterface = serviceInterface;
        this.enableFallbackToSoap = ServiceUtils.getFallbackFlag();
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

    private String getServiceUrl(String entityEndpoint) {
        String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

        if (serviceUrl == null) {
            ServiceInfo serviceInfo = endpoints.get(serviceInterface);

            serviceUrl = serviceInfo.GetUrl(environment);
        }
        else {
        	URI uri = URI.create(serviceUrl);
            serviceUrl = "https://" + uri.getAuthority() + "/CampaignManagement/v13";
        }
        
        System.out.println(serviceUrl + entityEndpoint);
        return serviceUrl + entityEndpoint;
    }

    private List<String> buildHeaders() {
        List<String> headers = new ArrayList<String>();

        headers.add("Content-Type");
        headers.add("application/json");

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

        String userAgent = "BingAdsSDKJava " + SDK_Version;

        String javaVersion = System.getProperty("java.version");
        if (javaVersion.matches("\\d+[\\d|\\.|\\_]*\\d+")) {
            userAgent += " " + javaVersion;
        }
        headers.add("User-Agent");
        headers.add(userAgent);
    }
    
    private <Req, Resp> Resp callSoapMethod(Req request) {
    	Method method;
    	Object response = null;
    	String[] strs = request.getClass().getName().split("\\.");
    	String methodName = strs[strs.length - 1];
    	methodName = methodName.substring(0, 1).toLowerCase() + methodName.substring(1, methodName.length() - 7);
    	System.out.println("Run Soap");
    	System.out.println(methodName);
		try {
			method = soapService.getClass().getMethod(methodName, request.getClass());
			response = method.invoke(soapService, request);
		} catch (Exception e) {
			e.printStackTrace();
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
    	System.out.println("Run Soap");
    	System.out.println(methodName);
    	try {
    		method = soapService.getClass().getMethod(methodName, request.getClass());
			response = (Response<Resp>) method.invoke(soapService, request);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return response;
    }
    
    private <Req, Resp> Future<?> callSoapMethodAsync(Req request, AsyncHandler<Resp> asyncHandler)
    {
    	Method method;
    	Response<Resp> response = null;
    	String[] strs = request.getClass().getName().split("\\.");
    	String methodName = strs[strs.length - 1];
    	methodName = methodName.substring(0, 1).toLowerCase() + methodName.substring(1, methodName.length() - 7) + "Async";
    	System.out.println("Run Soap");
    	System.out.println(methodName);
    	try {
    		method = soapService.getClass().getMethod(methodName, request.getClass());
			response = (Response<Resp>) method.invoke(soapService, request);
			asyncHandler.handleResponse(response);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return response;
    }
    
    private void switchToSoapMethod()
    {
    	enableRestApi = false;
    	Timer timer = new Timer();
    	timer.schedule(new TimerTask() {
    		public void run() {
    			enableRestApi = true;
    		}
    	}, 3600000L);
    }
    
    protected <Req, Resp> Resp sendRequest(Req request, String entityEndpoint, String verb, Class respClass)
            throws Exception {
    	if (!enableRestApi && enableFallbackToSoap) {
    		return callSoapMethod(request);
    	}
    	System.out.println("Run Rest");
    	System.out.println(request.getClass().getName());
        String jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);
    	
        String[] headers = buildHeaders().toArray(new String[0]);

        HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(getServiceUrl(entityEndpoint))).headers(headers)
                .method(verb, BodyPublishers.ofString(jsonRequest)).build();

        HttpResponse<String> response = client.send(httpRequest, BodyHandlers.ofString());
        
        if (response.statusCode() == 400) {
        	throwException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), response);
        }
             
        if (response.statusCode() > 400 && enableFallbackToSoap) {
        	switchToSoapMethod();
        	return callSoapMethod(request);
        }
        
        return (Resp)AdaptorUtil.mapper.readValue(response.body(), respClass);
    }

    protected <Req, Resp> Future<?> sendRequestAsync(Req request, String entityEndpoint, String verb, Class respClass, AsyncHandler<Resp> asyncHandler)
            throws URISyntaxException, IOException, InterruptedException {
    	if (!enableRestApi && enableFallbackToSoap) {
    		return callSoapMethodAsync(request, asyncHandler);
    	}
    	Response<Resp> resp = sendRequestAsync(request, entityEndpoint, verb, respClass);
    	asyncHandler.handleResponse(resp);
        return resp;
    }

    protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class respClass)
            throws URISyntaxException, IOException, InterruptedException {
    	if (!enableRestApi) {
    		return callSoapMethodAsync(request);
    	}
    	System.out.println("Run Rest");
    	System.out.println(request.getClass().getName());
    	String jsonRequest = AdaptorUtil.mapper.writeValueAsString(request);

        String[] headers = buildHeaders().toArray(new String[0]);

        HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(getServiceUrl(entityEndpoint))).headers(headers)
                .method(verb, BodyPublishers.ofString(jsonRequest)).build();

        CompletableFuture<HttpResponse<String>> resp = client.sendAsync(httpRequest, new BodyHandler<String>() {
            @Override
            public BodySubscriber<String> apply(ResponseInfo responseInfo) {
            	Response<Resp> response = null;
            	String resp = null;
            	
            	if (responseInfo.statusCode() > 400 && enableFallbackToSoap) {
            		switchToSoapMethod();
            		try {
						response = callSoapMethodAsync(request);
						resp = AdaptorUtil.mapper.writeValueAsString(response.get());
					} catch (Exception e) {
						e.printStackTrace();
					} 
            	}
            	
                return asJSONString(resp);
            }
        });

        return new Response<Resp>() {

            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                // TODO Auto-generated method stub
                return resp.cancel(mayInterruptIfRunning);
            }

            @Override
            public boolean isCancelled() {
                // TODO Auto-generated method stub
                return resp.isCancelled();
            }

            @Override
            public boolean isDone() {
                // TODO Auto-generated method stub
                return resp.isDone();
            }

            @Override
            public Resp get() throws InterruptedException, ExecutionException {
                // TODO Auto-generated method stub
            	HttpResponse<String> res = resp.get();
            	if (res.statusCode() == 400) {
            		throwExecutionException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), res);
            	}
            	return (Resp) asJSON(res.body(), respClass);
            }

            @Override
            public Resp get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                // TODO Auto-generated method stub
            	HttpResponse<String> res = resp.get();
            	if (res.statusCode() == 400) {
            		throwExecutionException(serviceInterface.getName().replace(serviceInterface.getSimpleName(), ""), res);
            	}
                return (Resp)resp.get(timeout, unit).body();
            }

            @Override
            public Map<String, Object> getContext() {
                return null;
            }

        };
    }
    
    private static <Resp> Resp asJSON(String response, Class<Resp> respClass) {
    	try {
			return (Resp)AdaptorUtil.mapper.readValue(response, respClass);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }

    private static <Resp> HttpResponse.BodySubscriber<Resp> asJSONString(Resp response) {
        HttpResponse.BodySubscriber<InputStream> upstream = HttpResponse.BodySubscribers.ofInputStream();
        
        return (BodySubscriber<Resp>) HttpResponse.BodySubscribers.mapping(upstream, (InputStream body) -> {
            try {
            	if (response != null) {
            		return AdaptorUtil.mapper.writeValueAsString(response);
            	}
            	
            	Reader reader = new InputStreamReader(body, "UTF-8");
            	int intValueOfChar;
                String targetString = "";
                while ((intValueOfChar = reader.read()) != -1) {
                    targetString += (char) intValueOfChar;
                }
                reader.close();
                return targetString;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
    }

    private static final Map<Class, ServiceInfo> endpoints = new HashMap<Class, ServiceInfo>() {
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
                    setProductionUrl("https://bulk.api.bingads.microsoft.com/CampaignManagement/v13");
                    setSandboxUrl("https://bulk.api.sandbox.bingads.microsoft.com/CampaignManagement/v13");
                }
            });
            // End of v13
        }
    };

}
