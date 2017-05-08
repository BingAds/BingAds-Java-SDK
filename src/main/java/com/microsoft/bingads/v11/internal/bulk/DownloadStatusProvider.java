package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.DownloadStatus;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v11.bulk.IBulkService;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;

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
        GetBulkDownloadStatusRequest request = new GetBulkDownloadStatusRequest();
        request.setRequestId(this.requestId);

        final ResultFuture<BulkOperationStatus<DownloadStatus>> resultFuture = new ResultFuture<BulkOperationStatus<DownloadStatus>>(callback);

        serviceClient.getService().getBulkDownloadStatusAsync(request, new AsyncHandler<GetBulkDownloadStatusResponse>() {
            @Override
            public void handleResponse(Response<GetBulkDownloadStatusResponse> result) {
                try {
                    GetBulkDownloadStatusResponse statusResponse = result.get();
                    
                    String trackingId = ServiceUtils.GetTrackingId(result);

                    BulkOperationStatus<DownloadStatus> status = new BulkOperationStatus<DownloadStatus>(
                            DownloadStatus.fromValue(statusResponse.getRequestStatus()),
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
