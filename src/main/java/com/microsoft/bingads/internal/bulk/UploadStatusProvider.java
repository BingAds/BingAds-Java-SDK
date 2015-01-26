package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.bulk.UploadStatus;
import com.microsoft.bingads.internal.ResultFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class UploadStatusProvider implements BulkOperationStatusProvider<UploadStatus> {

    private final String requestId;      

    public UploadStatusProvider(String requestId) {
        this.requestId = requestId;        
    }

    @Override
    public Future<BulkOperationStatus<UploadStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<UploadStatus>> callback) {
        GetDetailedBulkUploadStatusRequest request = new GetDetailedBulkUploadStatusRequest();
        request.setRequestId(this.requestId);

        final ResultFuture<BulkOperationStatus<UploadStatus>> resultFuture = new ResultFuture<BulkOperationStatus<UploadStatus>>(callback);

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
