package com.microsoft.bingads.v13.reporting;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.microsoft.bingads.v13.bulk.IBulkService;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

public class ReportingStatusProvider{

    private final String requestId;

    private final ServiceClient<IReportingService> serviceClient;

    /**
     * The amount of time in milliseconds that the upload and download operations should wait before polling the Bulk service for status.
     */
    private final int statusPollIntervalInMilliseconds;

    public ReportingStatusProvider(
            String requestId,
            ServiceClient<IReportingService> serviceClient,
            int statusPollIntervalInMilliseconds) {
        this.requestId = requestId;
        this.serviceClient = serviceClient;
        this.statusPollIntervalInMilliseconds = statusPollIntervalInMilliseconds;
    }

    public int getStatusPollIntervalInMilliseconds() {
        return statusPollIntervalInMilliseconds;
    }

    public Future<ReportingOperationStatus> getCurrentStatus(AsyncCallback<ReportingOperationStatus> callback) {
        PollGenerateReportRequest request = new PollGenerateReportRequest();
        request.setReportRequestId(this.requestId);

        final ResultFuture<ReportingOperationStatus> resultFuture = new ResultFuture<ReportingOperationStatus>(callback);

        serviceClient.getService().pollGenerateReportAsync(request, new AsyncHandler<PollGenerateReportResponse>() {
            @Override
            public void handleResponse(Response<PollGenerateReportResponse> result) {
                try {
                    PollGenerateReportResponse statusResponse = result.get();
                    
                    String trackingId = ServiceUtils.GetTrackingId(result);
                    
                    ReportingOperationStatus status = new ReportingOperationStatus(
                    		ReportRequestStatusType.fromValue(statusResponse.getReportRequestStatus().getStatus().value()),
                            statusResponse.getReportRequestStatus().getReportDownloadUrl(),
                            trackingId                            
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

    public boolean isFinalStatus(ReportingOperationStatus status) {
        if (status == null) {
            return false;
        }

        return status.getStatus() == ReportRequestStatusType.SUCCESS || status.getStatus() == ReportRequestStatusType.ERROR;
    }

    public boolean isSuccessStatus(ReportingOperationStatus status) {
        return status.getStatus() == ReportRequestStatusType.SUCCESS;
    }

    public boolean isResultFileUrl(ReportingOperationStatus status) {
        return status.getResultFileUrl() != null;
    }
}
