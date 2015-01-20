package com.microsoft.bingads.internal.bulk.operations;

import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.bulk.UploadStatus;
import com.microsoft.bingads.internal.ResponseFuture;

public class UploadStatusProvider implements BulkOperationStatusProvider<UploadStatus> {

    private final String requestId;      

    public UploadStatusProvider(String requestId) {
        this.requestId = requestId;        
    }

    @Override
    public Future<BulkOperationStatus<UploadStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<UploadStatus>> callback) {
        GetDetailedBulkUploadStatusRequest request = new GetDetailedBulkUploadStatusRequest();
        request.setRequestId(this.requestId);

        final ResponseFuture<BulkOperationStatus<UploadStatus>> responseFuture = new ResponseFuture<BulkOperationStatus<UploadStatus>>(callback);

        serviceClient.getService().getDetailedBulkUploadStatusAsync(request, new AsyncHandler<GetDetailedBulkUploadStatusResponse>() {

            @Override
            public void handleResponse(Response<GetDetailedBulkUploadStatusResponse> result) {
                try {
                    GetDetailedBulkUploadStatusResponse statusResponse = result.get();

                    BulkOperationStatus<UploadStatus> status = new BulkOperationStatus<UploadStatus>();

                    status.setStatus(UploadStatus.fromValue(statusResponse.getRequestStatus()));
                    status.setResultFileUrl(statusResponse.getResultFileUrl());
                    status.setPercentComplete(statusResponse.getPercentComplete());
                    status.setErrors(statusResponse.getErrors());

                    responseFuture.setResult(status);
                } catch (Throwable e) {
                    responseFuture.setException(e);
                }
            }
        });

        return responseFuture;
    }

    @Override
    public boolean isFinalStatus(BulkOperationStatus<UploadStatus> currentStatus) {        
        return currentStatus.getStatus() == UploadStatus.COMPLETED || 
               currentStatus.getStatus() == UploadStatus.COMPLETED_WITH_ERRORS || 
               currentStatus.getStatus() == UploadStatus.FAILED ||
               currentStatus.getStatus() == UploadStatus.EXPIRED ||
               currentStatus.getStatus() == UploadStatus.ABORTED;
    }

}
