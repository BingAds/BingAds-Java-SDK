package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.bulk.DownloadCampaignsByCampaignIdsRequest;
import com.microsoft.bingads.bulk.DownloadCampaignsByCampaignIdsResponse;
import com.microsoft.bingads.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.bulk.GetBulkUploadUrlRequest;
import com.microsoft.bingads.bulk.GetBulkUploadUrlResponse;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusResponse;
import com.microsoft.bingads.bulk.GetDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDownloadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;
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

    private static Consumer<GetDetailedBulkDownloadStatusRequest> onGetDetailedBulkDownloadStatus;
    private static Supplier<GetDetailedBulkDownloadStatusResponse> getDetailedBulkDownloadStatusResponse;    
    
    private static Supplier<GetDetailedBulkUploadStatusResponse> getDetailedBulkUploadStatusResponse;
    
    private static Consumer<DownloadCampaignsByAccountIdsRequest> onDownloadCampaignsByAccountIds;
    private static Supplier<DownloadCampaignsByAccountIdsResponse> getDownloadCampaignsByAccountIdsResponse;    
    
    private static Consumer<DownloadCampaignsByCampaignIdsRequest> onDownloadCampaignsByCampaignIds;
    private static Supplier<DownloadCampaignsByCampaignIdsResponse> getDownloadCampaignsByCampaignIdsResponse;    
    
    private static Supplier<List<Header>> inboundHeadersSupplier;
        
    public static void reset() {
        onGetDetailedBulkDownloadStatus = new Consumer<GetDetailedBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetDetailedBulkDownloadStatusRequest t) {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getDetailedBulkDownloadStatusResponse = new Supplier<GetDetailedBulkDownloadStatusResponse>() {
            @Override
            public GetDetailedBulkDownloadStatusResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };
        
        getDetailedBulkUploadStatusResponse = new Supplier<GetDetailedBulkUploadStatusResponse>() {
            @Override
            public GetDetailedBulkUploadStatusResponse get() {
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
    
    public static Supplier<GetDetailedBulkDownloadStatusResponse> getGetDetailedBulkDownloadStatusResponse() {
        return getDetailedBulkDownloadStatusResponse;
    }

    public static void setGetDetailedBulkDownloadStatusResponse(Supplier<GetDetailedBulkDownloadStatusResponse> value) {
        getDetailedBulkDownloadStatusResponse = value;
    }
    
    public static Supplier<GetDetailedBulkUploadStatusResponse> getGetDetailedBulkUploadStatusResponse() {
        return getDetailedBulkUploadStatusResponse;
    }

    public static void setGetDetailedBulkUploadStatusResponse(Supplier<GetDetailedBulkUploadStatusResponse> value) {
        getDetailedBulkUploadStatusResponse = value;
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

    public static Consumer<GetDetailedBulkDownloadStatusRequest> getOnGetDetailedBulkDownloadStatus() {
        return onGetDetailedBulkDownloadStatus;
    }

    public static void setOnGetDetailedBulkDownloadStatus(Consumer<GetDetailedBulkDownloadStatusRequest> aOnGetDetailedBulkDownloadStatus) {
        onGetDetailedBulkDownloadStatus = aOnGetDetailedBulkDownloadStatus;
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
    public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(DownloadCampaignsByAccountIdsRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
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
    public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(DownloadCampaignsByCampaignIdsRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetDownloadStatusResponse> getDownloadStatusAsync(GetDownloadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getDownloadStatusAsync(GetDownloadStatusRequest parameters, AsyncHandler<GetDownloadStatusResponse> asyncHandler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GetDownloadStatusResponse getDownloadStatus(GetDownloadStatusRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetDetailedBulkDownloadStatusResponse> getDetailedBulkDownloadStatusAsync(GetDetailedBulkDownloadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getDetailedBulkDownloadStatusAsync(GetDetailedBulkDownloadStatusRequest parameters, AsyncHandler<GetDetailedBulkDownloadStatusResponse> asyncHandler) {
        onGetDetailedBulkDownloadStatus.accept(parameters);
        
        Response response = new CompleteResponse(getDetailedBulkDownloadStatusResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
    }

    @Override
    public GetDetailedBulkDownloadStatusResponse getDetailedBulkDownloadStatus(GetDetailedBulkDownloadStatusRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
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
    public GetBulkUploadUrlResponse getBulkUploadUrl(GetBulkUploadUrlRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(GetBulkUploadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getBulkUploadStatusAsync(GetBulkUploadStatusRequest parameters, AsyncHandler<GetBulkUploadStatusResponse> asyncHandler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GetBulkUploadStatusResponse getBulkUploadStatus(GetBulkUploadStatusRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<GetDetailedBulkUploadStatusResponse> getDetailedBulkUploadStatusAsync(GetDetailedBulkUploadStatusRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<?> getDetailedBulkUploadStatusAsync(GetDetailedBulkUploadStatusRequest parameters, AsyncHandler<GetDetailedBulkUploadStatusResponse> asyncHandler) {
        Response response = new CompleteResponse(getDetailedBulkUploadStatusResponse.get(), getInboundHeadersSupplier().get());
        
        if (asyncHandler != null) {
            asyncHandler.handleResponse(response);
        }
        
        return response;
    }

    @Override
    public GetDetailedBulkUploadStatusResponse getDetailedBulkUploadStatus(GetDetailedBulkUploadStatusRequest parameters) throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
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
