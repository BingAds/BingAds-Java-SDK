package com.microsoft.bingads.bulk;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ParentCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ResponseFuture;
import com.microsoft.bingads.internal.bulk.operations.BulkOperationStatusProvider;
import com.microsoft.bingads.internal.bulk.operations.BulkOperationTracker;
import com.microsoft.bingads.internal.bulk.operations.PollingBulkOperationTracker;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.ZipExtractor;

/**
 * The abstract base class that can be derived to represent a bulk operation requested by a user. You can use either the {@link BulkDownloadOperation} or {@link BulkUploadOperation} derived class to poll for the operation status, and then download the results file when available.
 *
 * @param <TStatus> type of bulk operation status is being tracked
 */
public abstract class BulkOperation<TStatus> {

    /**
     * Represents a user who intends to access the corresponding customer and account.
     */
    private AuthorizationData authorizationData;

    /**
     * The request identifier corresponding to the bulk upload or download, depending on the derived type.
     */
    private String requestId;

    /**
     * The identifier of the log entry that contains the details of the upload or download request.
     */
    private String trackingId;

    /**
     * The amount of time in milliseconds that the upload and download operations should wait before polling the Bulk service for status.
     */
    BulkOperationStatusProvider<TStatus> statusProvider;
    private HttpFileService httpFileService;
    private ZipExtractor zipExtractor;
    private Integer statusCheckIntervalInMs;

    private ServiceClient<IBulkService> serviceClient;

    private BulkOperationStatus<TStatus> finalStatus;

    protected BulkOperation(String requestId, AuthorizationData authorizationData) {
        this(requestId, authorizationData, null, null);
    }

    protected BulkOperation(String requestId, AuthorizationData authorizationData, BulkOperationStatusProvider<TStatus> statusProvider) {
        this(requestId, authorizationData, statusProvider, null);
    }

    protected BulkOperation(String requestId, AuthorizationData authorizationData, BulkOperationStatusProvider<TStatus> statusProvider, String trackingId) {
        this.statusProvider = statusProvider;
        this.requestId = requestId;
        this.authorizationData = authorizationData;
        this.trackingId = trackingId;

        this.serviceClient = new ServiceClient<IBulkService>(authorizationData, IBulkService.class);

        zipExtractor = new SimpleZipExtractor();

        httpFileService = new HttpClientHttpFileService();
    }

    /**
     * Create a tracker which is polls for the progress of a remote operation and returns the final status when the remote operation is complete
     *
     * @param callback A handler that will be called with the BulkOperation when it has completed
     * @return a Future that will be completed when the result file is available
     */
    public Future<BulkOperationStatus<TStatus>> trackAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        return trackAsync(null, callback);
    }

    /**
     * Create a tracker which is polls for the progress of a remote operation and returns the final status when the remote operation is complete
     *
     * @param progress An object to be updated with the progress of the operation
     * @param callback A handler that will be called with the BulkOperation when it has completed
     * @return a Future that will be completed when the result file is available
     */
    public Future<BulkOperationStatus<TStatus>> trackAsync(Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        BulkOperationTracker<TStatus> tracker = generateTracker(progress);

        final ResponseFuture<BulkOperationStatus<TStatus>> responseFuture = new ResponseFuture<BulkOperationStatus<TStatus>>(callback);

        tracker.trackResultFileAsync(new ParentCallback<BulkOperationStatus<TStatus>>(responseFuture) {
            @Override
            public void onSuccess(BulkOperationStatus<TStatus> status) {
                finalStatus = status;

                responseFuture.setResult(finalStatus);
            }
        });

        return responseFuture;
    }

    private BulkOperationTracker<TStatus> generateTracker(Progress<BulkOperationProgressInfo> progress) {
        BulkOperationTracker<TStatus> tracker;

        if (this.statusCheckIntervalInMs != null) {
            tracker = new PollingBulkOperationTracker<TStatus>(statusProvider, this.serviceClient, progress, this.statusCheckIntervalInMs);
        } else {
            tracker = new PollingBulkOperationTracker<TStatus>(statusProvider, this.serviceClient, progress);
        }

        return tracker;
    }

    /**
     * Polls the status provider directly and gets the most up to date status
     *
     * @return the current status of the bulk operation
     */
    public Future<BulkOperationStatus<TStatus>> getStatusAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        final ResponseFuture<BulkOperationStatus<TStatus>> responseFuture = new ResponseFuture<BulkOperationStatus<TStatus>>(callback);

        if (finalStatus != null) {
            responseFuture.setResult(this.finalStatus);

            return responseFuture;
        }

        statusProvider.getCurrentStatus(this.serviceClient, new ParentCallback<BulkOperationStatus<TStatus>>(responseFuture) {
            @Override
            public void onSuccess(BulkOperationStatus<TStatus> currentStatus) {
                if (statusProvider.isFinalStatus(currentStatus)) {
                    finalStatus = currentStatus;
                }

                responseFuture.setResult(currentStatus);
            }
        });

        return responseFuture;
    }

    public AuthorizationData getUserData() {
        return authorizationData;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public BulkOperationStatusProvider<TStatus> getStatusProvider() {
        return statusProvider;
    }

    protected void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    void setStatusProvider(BulkOperationStatusProvider<TStatus> statusProvider) {
        this.statusProvider = statusProvider;
    }

    public HttpFileService getHttpFileService() {
        return httpFileService;
    }

    public void setHttpFileService(HttpFileService httpFileService) {
        this.httpFileService = httpFileService;
    }

    public ZipExtractor getZipExtractor() {
        return zipExtractor;
    }

    public void setZipExtractor(ZipExtractor zipExtractor) {
        this.zipExtractor = zipExtractor;
    }

    public Integer getStatusCheckIntervalInMs() {
        return statusCheckIntervalInMs;
    }

    public void setStatusCheckIntervalInMs(Integer statusCheckIntervalInMs) {
        this.statusCheckIntervalInMs = statusCheckIntervalInMs;
    }

    public Future<File> downloadResultFileAsync(File localResultDirectoryName, String localResultFileName, boolean decompress, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        return downloadResultFileAsync(localResultDirectoryName, localResultFileName, decompress, false, callback);
    }

    /**
     * Downloads and optionally decompress the result file from the bulk operation
     *
     * @param localResultDirectoryName The directory to place the result file in
     * @param localResultFileName The name to use for final result file
     * @param decompress indicates whether the result file should be unzipped
     * @return a File object pointing to the result file
     */
    public Future<File> downloadResultFileAsync(File localResultDirectoryName, String localResultFileName, boolean decompress, boolean overwrite, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        return downloadResultFileAsyncImpl(localResultDirectoryName, localResultFileName, decompress, overwrite, callback);
    }

    private Future<File> downloadResultFileAsyncImpl(final File localResultDirectoryName, final String localResultFileName, final boolean decompress, final boolean overwrite, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        final ResponseFuture<File> responseFuture = new ResponseFuture<File>(callback);

        if (finalStatus == null) {
            getStatusAsync(new ParentCallback<BulkOperationStatus<TStatus>>(responseFuture) {
                @Override
                public void onSuccess(BulkOperationStatus<TStatus> result) throws IOException, URISyntaxException {
                    if (finalStatus == null) {
                        responseFuture.setException(new IllegalStateException("Operation wasn't completed!"));

                        return;
                    }

                    File resultFile = downloadFileWithFinalStatus(localResultDirectoryName, localResultFileName, decompress, overwrite);

                    responseFuture.setResult(resultFile);
                }
            });
        } else {
            File resultFile = downloadFileWithFinalStatus(localResultDirectoryName, localResultFileName, decompress, overwrite);

            responseFuture.setResult(resultFile);
        }

        return responseFuture;
    }

    private File downloadFileWithFinalStatus(File localResultDirectoryName, String localResultFileName, final boolean decompress, final boolean overwrite) throws IOException, URISyntaxException {
        String effectiveFileName;

        if (localResultFileName == null) {
            effectiveFileName = requestId;
        } else {
            effectiveFileName = localResultFileName;
        }

        final File fullPath = new File(localResultDirectoryName, effectiveFileName);

        final File zipResultPath = new File(localResultDirectoryName, effectiveFileName + ".zip");        
        
        downloadResultFileZip(finalStatus.getResultFileUrl(), zipResultPath, overwrite);

        if (!decompress) {
            return zipResultPath;
        } else {
            return zipExtractor.extractFirstEntryToFile(zipResultPath, fullPath, localResultFileName == null, overwrite);
        }
    }

    private File downloadResultFileZip(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException {
        if (httpFileService == null) {
            httpFileService = new HttpClientHttpFileService();
        }

        httpFileService.downloadFile(url, tempZipFile, overwrite);

        return tempZipFile;
    }
}
