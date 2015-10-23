package com.microsoft.bingads.v10.api.test.operations;


import com.microsoft.bingads.v10.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.v10.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.v10.bulk.DownloadCampaignsByCampaignIdsRequest;
import com.microsoft.bingads.v10.bulk.DownloadCampaignsByCampaignIdsResponse;
import com.microsoft.bingads.v10.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.v10.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v10.bulk.GetBulkUploadUrlRequest;
import com.microsoft.bingads.v10.bulk.GetBulkUploadUrlResponse;
import com.microsoft.bingads.v10.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v10.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v10.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.v10.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v10.bulk.IBulkService;
import com.microsoft.bingads.api.test.operations.CompleteResponse;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusResponse;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.EndpointReference;
import javax.xml.ws.Response;
import org.apache.cxf.headers.Header;

public class FakeBulkService implements IBulkService, BindingProvider {

    private static Consumer<GetBulkDownloadStatusRequest> onGetBulkDownloadStatus;
    private static Supplier<GetBulkDownloadStatusResponse> getBulkDownloadStatusResponse;    
    
    private static Supplier<GetBulkUploadStatusResponse> getBulkUploadStatusResponse;
    
    private static Consumer<DownloadCampaignsByAccountIdsRequest> onDownloadCampaignsByAccountIds;
    private static Supplier<DownloadCampaignsByAccountIdsResponse> getDownloadCampaignsByAccountIdsResponse;    
    
    private static Consumer<DownloadCampaignsByCampaignIdsRequest> onDownloadCampaignsByCampaignIds;
    private static Supplier<DownloadCampaignsByCampaignIdsResponse> getDownloadCampaignsByCampaignIdsResponse;    
    
    private static Supplier<List<Header>> inboundHeadersSupplier;
        
    public static void reset() {
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
        
        inboundHeadersSupplier = new Supplier<List<Header>>() {
            @Override
            public List<Header> get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
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

    public static Supplier<List<Header>> getInboundHeadersSupplier() {
        return inboundHeadersSupplier;
    }

    public static void setInboundHeadersSupplier(Supplier<List<Header>> aInboundHeadersSupplier) {
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
        
        Response response = new CompleteResponse(getDownloadCampaignsByAccountIdsResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
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
        
        Response response = new CompleteResponse(getDownloadCampaignsByCampaignIdsResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
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
        
        Response response = new CompleteResponse(getBulkDownloadStatusResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Response response = new CompleteResponse(getBulkUploadStatusResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
    }


    @Override
    public GetBulkUploadStatusResponse getBulkUploadStatus(GetBulkUploadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public Map<String, Object> getRequestContext() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put(Header.HEADER_LIST, getInboundHeadersSupplier().get());
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
}
