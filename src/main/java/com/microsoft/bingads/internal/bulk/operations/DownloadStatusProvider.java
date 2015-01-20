package com.microsoft.bingads.internal.bulk.operations;

import com.microsoft.bingads.internal.functionalInterfaces.Function;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.DownloadStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.internal.ResponseFuture;
import com.microsoft.bingads.internal.StringExtensions;

public class DownloadStatusProvider implements BulkOperationStatusProvider<DownloadStatus> {

    private String requestId;
    private AuthorizationData authorizationData;

    public DownloadStatusProvider(String requestId, AuthorizationData authorizationData) {
        this.requestId = requestId;
        this.authorizationData = authorizationData;
    }

    @Override
    public Future<BulkOperationStatus<DownloadStatus>> getCurrentStatus(ServiceClient<IBulkService> serviceClient, AsyncCallback<BulkOperationStatus<DownloadStatus>> callback) {
        GetDetailedBulkDownloadStatusRequest request = new GetDetailedBulkDownloadStatusRequest();
        request.setRequestId(this.requestId);

        final ResponseFuture<BulkOperationStatus<DownloadStatus>> responseFuture = new ResponseFuture<BulkOperationStatus<DownloadStatus>>(callback);

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

                    responseFuture.setResult(status);
                } catch (Throwable e) {                    
                    responseFuture.setException(e);
                }
            }
        });

        return responseFuture;
    }

    @Override
    public boolean isFinalStatus(BulkOperationStatus<DownloadStatus> status) {
        if (status == null) {
            return false;
        }

        return status.getStatus() == DownloadStatus.COMPLETED || status.getStatus() == DownloadStatus.FAILED || status.getStatus() == DownloadStatus.FAILED_FULL_SYNC_REQUIRED;
    }
}
