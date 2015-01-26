package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.DownloadStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.internal.ResultFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class DownloadStatusProvider implements BulkOperationStatusProvider<DownloadStatus> {

    private final String requestId;
    
    private final AuthorizationData authorizationData;

    public DownloadStatusProvider(String requestId, AuthorizationData authorizationData) {
        this.requestId = requestId;
        this.authorizationData = authorizationData;
    }

    @Override
    public Future<BulkOperationStatus<DownloadStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<DownloadStatus>> callback) {
        GetDetailedBulkDownloadStatusRequest request = new GetDetailedBulkDownloadStatusRequest();
        request.setRequestId(this.requestId);

        final ResultFuture<BulkOperationStatus<DownloadStatus>> resultFuture = new ResultFuture<BulkOperationStatus<DownloadStatus>>(callback);

        serviceClient.getService().getDetailedBulkDownloadStatusAsync(request, new AsyncHandler<GetDetailedBulkDownloadStatusResponse>() {
            @Override
            public void handleResponse(Response<GetDetailedBulkDownloadStatusResponse> result) {
                try {
                    GetDetailedBulkDownloadStatusResponse statusResponse = result.get();

                    BulkOperationStatus<DownloadStatus> status = new BulkOperationStatus<DownloadStatus>();

                    status.setStatus(DownloadStatus.fromValue(statusResponse.getRequestStatus()));
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
    public boolean isFinalStatus(BulkOperationStatus<DownloadStatus> status) {
        if (status == null) {
            return false;
        }

        return status.getStatus() == DownloadStatus.COMPLETED || status.getStatus() == DownloadStatus.FAILED || status.getStatus() == DownloadStatus.FAILED_FULL_SYNC_REQUIRED;
    }

    @Override
    public boolean isSuccessStatus(DownloadStatus status) {
        return status == DownloadStatus.COMPLETED;
    }
}
