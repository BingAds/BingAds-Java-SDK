package com.microsoft.bingads.v13.api.test.operations;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.EndpointReference;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.internal.restful.BulkService;
import com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByCampaignIdsRequest;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByCampaignIdsResponse;
import com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v13.bulk.GetBulkUploadUrlRequest;
import com.microsoft.bingads.v13.bulk.GetBulkUploadUrlResponse;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.bulk.UploadEntityRecordsRequest;
import com.microsoft.bingads.v13.bulk.UploadEntityRecordsResponse;

public class FakeBulkService extends BulkService implements IBulkService, BindingProvider {

    public FakeBulkService(Map<String, String> headers, ApiEnvironment env,
			java.util.function.Supplier<IBulkService> fallbackService) {
		super(headers, env);
	}

    /**
     * Name of the thread which delivers the responses to the async handlers,
     * if {@link #setDeliverResponsesOnSeparateThread(boolean)} is enabled.
     */
    public static final String RESPONSE_THREAD_NAME = "fake-bulk-response-thread";

    /**
     * Thread which delivers the responses, or null to deliver them on the calling thread.
     */
    private static ExecutorService responseThread;

	private static Consumer<GetBulkDownloadStatusRequest> onGetBulkDownloadStatus;
    private static Supplier<GetBulkDownloadStatusResponse> getBulkDownloadStatusResponse;    
    
    private static Supplier<GetBulkUploadStatusResponse> getBulkUploadStatusResponse;
    
    private static Supplier<GetBulkUploadUrlResponse> getBulkUploadUrlResponse;
    
    private static Consumer<DownloadCampaignsByAccountIdsRequest> onDownloadCampaignsByAccountIds;
    private static Supplier<DownloadCampaignsByAccountIdsResponse> getDownloadCampaignsByAccountIdsResponse;    
    
    private static Consumer<DownloadCampaignsByCampaignIdsRequest> onDownloadCampaignsByCampaignIds;
    private static Supplier<DownloadCampaignsByCampaignIdsResponse> getDownloadCampaignsByCampaignIdsResponse;    
    
    private static Supplier<List<StringHeader>> inboundHeadersSupplier;
        
    public static void reset() {
        setDeliverResponsesOnSeparateThread(false);

        getBulkUploadUrlResponse = new Supplier<GetBulkUploadUrlResponse>() {
            @Override
            public GetBulkUploadUrlResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };

        onGetBulkDownloadStatus = new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest t) {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getBulkDownloadStatusResponse = new Supplier<GetBulkDownloadStatusResponse>() {
            @Override
            public GetBulkDownloadStatusResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getBulkUploadStatusResponse = new Supplier<GetBulkUploadStatusResponse>() {
            @Override
            public GetBulkUploadStatusResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        onDownloadCampaignsByAccountIds = new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest t) {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getDownloadCampaignsByAccountIdsResponse = new Supplier<DownloadCampaignsByAccountIdsResponse>() {
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        onDownloadCampaignsByCampaignIds = new Consumer<DownloadCampaignsByCampaignIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByCampaignIdsRequest t) {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getDownloadCampaignsByCampaignIdsResponse = new Supplier<DownloadCampaignsByCampaignIdsResponse>() {
            @Override
            public DownloadCampaignsByCampaignIdsResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        inboundHeadersSupplier = new Supplier<List<StringHeader>>() {
            @Override
            public List<StringHeader> get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
    }
    
    /**
     * Deliver the responses on a separate thread (like the HTTP client does) instead of on the calling thread.
     * Exceptions thrown by the handlers get swallowed then, like the HTTP client does.
     */
    public static void setDeliverResponsesOnSeparateThread(boolean separateThread) {
        if (responseThread != null) {
            responseThread.shutdownNow();
            responseThread = null;
        }

        if (separateThread) {
            responseThread = Executors.newSingleThreadExecutor(new ThreadFactory() {
                @Override
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, RESPONSE_THREAD_NAME);
                    thread.setDaemon(true);
                    return thread;
                }
            });
        }
    }

    public static void setGetBulkUploadUrlResponse(Supplier<GetBulkUploadUrlResponse> value) {
        getBulkUploadUrlResponse = value;
    }

    public static Supplier<GetBulkDownloadStatusResponse> getGetBulkDownloadStatusResponse() {
        return getBulkDownloadStatusResponse;
    }

    public static void setGetBulkDownloadStatusResponse(Supplier<GetBulkDownloadStatusResponse> value) {
        getBulkDownloadStatusResponse = value;
    }
    
    public static Supplier<GetBulkUploadStatusResponse> getGetBulkUploadStatusResponse() {
        return getBulkUploadStatusResponse;
    }

    public static void setGetBulkUploadStatusResponse(Supplier<GetBulkUploadStatusResponse> value) {
        getBulkUploadStatusResponse = value;
    }

    public static Supplier<DownloadCampaignsByAccountIdsResponse> getGetDownloadCampaignsByAccountIdsResponse() {
        return getDownloadCampaignsByAccountIdsResponse;
    }

    public static void setGetDownloadCampaignsByAccountIdsResponse(Supplier<DownloadCampaignsByAccountIdsResponse> value) {
        getDownloadCampaignsByAccountIdsResponse = value;
    }

    public static Consumer<DownloadCampaignsByAccountIdsRequest> getOnDownloadCampaignsByAccountIdsRequest() {
        return onDownloadCampaignsByAccountIds;
    }

    public static void setOnDownloadCampaignsByAccountIdsRequest(Consumer<DownloadCampaignsByAccountIdsRequest> value) {
        onDownloadCampaignsByAccountIds = value;
    }

    public static Supplier<List<StringHeader>> getInboundHeadersSupplier() {
        return inboundHeadersSupplier;
    }

    public static void setInboundHeadersSupplier(Supplier<List<StringHeader>> aInboundHeadersSupplier) {
        inboundHeadersSupplier = aInboundHeadersSupplier;
    }

    public static Supplier<DownloadCampaignsByCampaignIdsResponse> getGetDownloadCampaignsByCampaignIdsResponse() {
        return getDownloadCampaignsByCampaignIdsResponse;
    }

    public static void setGetDownloadCampaignsByCampaignIdsResponse(Supplier<DownloadCampaignsByCampaignIdsResponse> value) {
        getDownloadCampaignsByCampaignIdsResponse = value;
    }

    public static Consumer<DownloadCampaignsByCampaignIdsRequest> getOnDownloadCampaignsByCampaignIdsRequest() {
        return onDownloadCampaignsByCampaignIds;
    }

    public static void setOnDownloadCampaignsByCampaignIdsRequest(Consumer<DownloadCampaignsByCampaignIdsRequest> value) {
        onDownloadCampaignsByCampaignIds = value;
    }

    public static Consumer<GetBulkDownloadStatusRequest> getOnGetBulkDownloadStatus() {
        return onGetBulkDownloadStatus;
    }

    public static void setOnGetBulkDownloadStatus(Consumer<GetBulkDownloadStatusRequest> aOnGetBulkDownloadStatus) {
        onGetBulkDownloadStatus = aOnGetBulkDownloadStatus;
    }
    
    @Override
    public Response<DownloadCampaignsByAccountIdsResponse> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest parameters, AsyncHandler<DownloadCampaignsByAccountIdsResponse> asyncHandler) {
        onDownloadCampaignsByAccountIds.accept(parameters);
        
        return respond(getDownloadCampaignsByAccountIdsResponse, asyncHandler);
    }

    @Override
    public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(DownloadCampaignsByAccountIdsRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<DownloadCampaignsByCampaignIdsResponse> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest parameters, AsyncHandler<DownloadCampaignsByCampaignIdsResponse> asyncHandler) {
        onDownloadCampaignsByCampaignIds.accept(parameters);
        
        return respond(getDownloadCampaignsByCampaignIdsResponse, asyncHandler);
    }

    @Override
    public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(DownloadCampaignsByCampaignIdsRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetBulkDownloadStatusResponse> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest parameters, AsyncHandler<GetBulkDownloadStatusResponse> asyncHandler) {
        onGetBulkDownloadStatus.accept(parameters);
        
        return respond(getBulkDownloadStatusResponse, asyncHandler);
    }

    @Override
    public GetBulkDownloadStatusResponse getBulkDownloadStatus(GetBulkDownloadStatusRequest parameters){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetBulkUploadUrlResponse> getBulkUploadUrlAsync(GetBulkUploadUrlRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getBulkUploadUrlAsync(GetBulkUploadUrlRequest parameters, AsyncHandler<GetBulkUploadUrlResponse> asyncHandler) {
        return respond(getBulkUploadUrlResponse, asyncHandler);
    }

    private static <T> Future<?> respond(Supplier<T> responseSupplier, final AsyncHandler<T> asyncHandler) {
        final CompleteResponse<T> response = new CompleteResponse<T>(responseSupplier.get(), getInboundHeadersSupplier().get());

        if (asyncHandler == null) {
            return response;
        }

        if (responseThread == null) {
            asyncHandler.handleResponse(response);

            return response;
        }

        return responseThread.submit(new Runnable() {
            @Override
            public void run() {
                asyncHandler.handleResponse(response);
            }
        });
    }

    @Override
    public GetBulkUploadUrlResponse getBulkUploadUrl(GetBulkUploadUrlRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(GetBulkUploadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Future<?> getBulkUploadStatusAsync(GetBulkUploadStatusRequest parameters, AsyncHandler<GetBulkUploadStatusResponse> asyncHandler) {
        return respond(getBulkUploadStatusResponse, asyncHandler);
    }


    @Override
    public GetBulkUploadStatusResponse getBulkUploadStatus(GetBulkUploadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public Map<String, Object> getRequestContext() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put(ServiceUtils.TRACKING_KEY, getInboundHeadersSupplier().get());
        }};
        
        return map;
    }

    @Override
    public Map<String, Object> getResponseContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Binding getBinding() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EndpointReference getEndpointReference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T extends EndpointReference> T getEndpointReference(Class<T> clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<UploadEntityRecordsResponse> uploadEntityRecordsAsync(UploadEntityRecordsRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Future<?> uploadEntityRecordsAsync(UploadEntityRecordsRequest parameters, AsyncHandler<UploadEntityRecordsResponse> asyncHandler) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UploadEntityRecordsResponse uploadEntityRecords(UploadEntityRecordsRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
}
