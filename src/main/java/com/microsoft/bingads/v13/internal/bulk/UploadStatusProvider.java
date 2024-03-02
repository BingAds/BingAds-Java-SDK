package com.microsoft.bingads.v13.internal.bulk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.v13.bulk.BulkOperationStatus;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusRequest;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.bulk.UploadStatus;

public class UploadStatusProvider implements BulkOperationStatusProvider<UploadStatus> {

    private final String requestId;

    private final ServiceClient<IBulkService> serviceClient;

    /**
     * The amount of time in milliseconds that the upload and download operations should wait before polling the Bulk service for status.
     */
    private final int statusPollIntervalInMilliseconds;

    public UploadStatusProvider(
            String requestId,
            ServiceClient<IBulkService> serviceClient,
            int statusPollIntervalInMilliseconds) {
        this.requestId = requestId;
        this.serviceClient = serviceClient;
        this.statusPollIntervalInMilliseconds = statusPollIntervalInMilliseconds;
    }

    @Override
    public int getStatusPollIntervalInMilliseconds() {
        return statusPollIntervalInMilliseconds;
    }

    @Override
    public Future<BulkOperationStatus<UploadStatus>> getCurrentStatus(AsyncCallback<BulkOperationStatus<UploadStatus>> callback) {
    	GetBulkUploadStatusRequest request = new GetBulkUploadStatusRequest();
        request.setRequestId(this.requestId);

        final ResultFuture<BulkOperationStatus<UploadStatus>> resultFuture = new ResultFuture<BulkOperationStatus<UploadStatus>>(callback);
        
        serviceClient.getService().getBulkUploadStatusAsync(request, new AsyncHandler<GetBulkUploadStatusResponse>() {
        	
            @Override
            public void handleResponse(Response<GetBulkUploadStatusResponse> result) {
            	
                try {
                    GetBulkUploadStatusResponse statusResponse = result.get();
                    
                    BulkOperationStatus<UploadStatus> status = new BulkOperationStatus<UploadStatus>(
                        UploadStatus.fromValue(statusResponse.getRequestStatus()),
                        statusResponse.getPercentComplete(),
                        statusResponse.getResultFileUrl(),
                            ServiceUtils.GetTrackingId(result),
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
