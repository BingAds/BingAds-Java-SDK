package com.microsoft.bingads.v12.internal.bulk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.v12.bulk.BulkOperationStatus;
import com.microsoft.bingads.v12.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.v12.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v12.bulk.IBulkService;
import com.microsoft.bingads.v12.bulk.UploadStatus;

public class UploadStatusProvider implements BulkOperationStatusProvider<UploadStatus> {

    private final String requestId;      

    public UploadStatusProvider(String requestId) {
        this.requestId = requestId;        
    }

    @Override
    public Future<BulkOperationStatus<UploadStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<UploadStatus>> callback) {
    	GetBulkUploadStatusRequest request = new GetBulkUploadStatusRequest();
        request.setRequestId(this.requestId);

        final ResultFuture<BulkOperationStatus<UploadStatus>> resultFuture = new ResultFuture<BulkOperationStatus<UploadStatus>>(callback);
        
        serviceClient.getService().getBulkUploadStatusAsync(request, new AsyncHandler<GetBulkUploadStatusResponse>() {
        	
            @Override
            public void handleResponse(Response<GetBulkUploadStatusResponse> result) {
            	
                try {
                    GetBulkUploadStatusResponse statusResponse = result.get();
                    
                    String trackingId = ServiceUtils.GetTrackingId(result);

                    BulkOperationStatus<UploadStatus> status = new BulkOperationStatus<UploadStatus>(
                        UploadStatus.fromValue(statusResponse.getRequestStatus()),
                        statusResponse.getPercentComplete(),
                        statusResponse.getResultFileUrl(),
                        trackingId,
                        statusResponse.getErrors() != null ? statusResponse.getErrors().getOperationErrors() : null
                    );                   

                    resultFuture.setResult(status);
                } catch (InterruptedException e) {
                    resultFuture.setException(e);
                } catch (ExecutionException e) {
                    resultFuture.setException(e);
                }
            }
        });

        return resultFuture;
    }

    @Override
    public boolean isFinalStatus(BulkOperationStatus<UploadStatus> currentStatus) {        
        return currentStatus.getStatus() == UploadStatus.COMPLETED || 
               currentStatus.getStatus() == UploadStatus.COMPLETED_WITH_ERRORS || 
               currentStatus.getStatus() == UploadStatus.FAILED ||
               currentStatus.getStatus() == UploadStatus.EXPIRED ||
               currentStatus.getStatus() == UploadStatus.ABORTED;
    }

    @Override
    public boolean isSuccessStatus(UploadStatus status) {
        return status == UploadStatus.COMPLETED || status == UploadStatus.COMPLETED_WITH_ERRORS;
    }
}
