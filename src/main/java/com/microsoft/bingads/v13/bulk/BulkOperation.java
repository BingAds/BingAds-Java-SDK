package com.microsoft.bingads.v13.bulk;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import com.microsoft.bingads.v13.internal.bulk.BulkOperationStatusProvider;
import com.microsoft.bingads.v13.internal.bulk.BulkOperationTracker;
import com.microsoft.bingads.v13.internal.bulk.PollingBulkOperationTracker;

/**
 * Reserved for internal use.
 *
 * The abstract base class that can be derived to represent a bulk operation requested by a user. You can use either the {@link BulkDownloadOperation} or {@link BulkUploadOperation} derived class to poll for the operation status, and then download the results file when available.
 *
 * @param <TStatus> type of bulk operation status is being tracked
 */
public abstract class BulkOperation<TStatus> {

    /**
     * The request identifier corresponding to the bulk upload or download, depending on the derived type.
     */
    private final String requestId;

    /**
     * The identifier of the log entry that contains the details of the upload or download request.
     */
    private final String trackingId;

    private final HttpFileService httpFileService;

    /**
     * The timeout in milliseconds of HttpClient download operation.
     */
    private final int downloadHttpTimeoutInMilliseconds;

    private final ZipExtractor zipExtractor;

    private final BulkOperationStatusProvider<TStatus> statusProvider;

    private BulkOperationStatus<TStatus> finalStatus;

    BulkOperation(
            String requestId,
            String trackingId,
            HttpFileService httpFileService,
            int downloadHttpTimeoutInMilliseconds,
            ZipExtractor zipExtractor,
            BulkOperationStatusProvider<TStatus> statusProvider) {
        this.requestId = requestId;
        this.trackingId = trackingId;
        this.httpFileService = httpFileService;
        this.downloadHttpTimeoutInMilliseconds = downloadHttpTimeoutInMilliseconds;
        this.zipExtractor = zipExtractor;
        this.statusProvider = statusProvider;
    }

    /**
     * Runs asynchronously until the bulk service has finished processing the bulk operation.
     *
     * @param callback A handler that will be called with the BulkOperation when it has completed
     *
     * @return a Future that will be completed when the result file is available
     */
    public Future<BulkOperationStatus<TStatus>> trackAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        return trackAsync(null, callback);
    }

    /**
     * Runs asynchronously until the bulk service has finished processing the bulk operation.
     *
     * @param progress An object to be updated with the progress of the operation
     * @param callback A handler that will be called with the BulkOperation when it has completed
     *
     * @return a Future that will be completed when the result file is available
     */
    public Future<BulkOperationStatus<TStatus>> trackAsync(Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        BulkOperationTracker<TStatus> tracker = generateTracker(progress);

        final ResultFuture<BulkOperationStatus<TStatus>> resultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(callback);

        tracker.trackResultFileAsync(new ParentCallback<BulkOperationStatus<TStatus>>(resultFuture) {
            @Override
            public void onSuccess(BulkOperationStatus<TStatus> status) {
                finalStatus = status;

                resultFuture.setResult(finalStatus);
            }
        });

        return resultFuture;
    }

    private BulkOperationTracker<TStatus> generateTracker(Progress<BulkOperationProgressInfo> progress) {
        BulkOperationTracker<TStatus> tracker;

        tracker = new PollingBulkOperationTracker<TStatus>(statusProvider, progress);

        return tracker;
    }

    /**
     * Gets the status of the bulk operation.
     *
     * @return the current status of the bulk operation
     */
    public Future<BulkOperationStatus<TStatus>> getStatusAsync(AsyncCallback<BulkOperationStatus<TStatus>> callback) {
        final ResultFuture<BulkOperationStatus<TStatus>> resultFuture = new ResultFuture<BulkOperationStatus<TStatus>>(callback);

        if (finalStatus != null) {
            resultFuture.setResult(this.finalStatus);

            return resultFuture;
        }
        
       
        statusProvider.getCurrentStatus(new ParentCallback<BulkOperationStatus<TStatus>>(resultFuture) {
            @Override
            
            public void onSuccess(BulkOperationStatus<TStatus> currentStatus) {
            	
                if (statusProvider.isFinalStatus(currentStatus)) {
                    finalStatus = currentStatus;
                }

                resultFuture.setResult(currentStatus);
            }
        });

        return resultFuture;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    BulkOperationStatusProvider<TStatus> getStatusProvider() {
        return statusProvider;
    }

    HttpFileService getHttpFileService() {
        return httpFileService;
    }


    ZipExtractor getZipExtractor() {
        return zipExtractor;
    }

    /**
     * Gets the timeout of HttpClient download operation. The default value is 100000(100s).
     */
	public int getDownloadHttpTimeoutInMilliseconds() {
		return downloadHttpTimeoutInMilliseconds;
	}

	/**
     * Downloads and optionally decompress the result file from the bulk operation
     * @param localResultDirectoryName the directory to place the result file in
     * @param localResultFileName the name to use for final result file
     * @param decompress indicates whether the result file should be unzipped
     * @param callback {@link AsyncCallback} object with {@link File}
     *
     * @return a {@link File} object pointing to the result file wrapped in Future
     *
     * @throws IOException
     * @throws URISyntaxException
     */
    public Future<File> downloadResultFileAsync(File localResultDirectoryName, String localResultFileName, boolean decompress, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        return downloadResultFileAsync(localResultDirectoryName, localResultFileName, decompress, false, callback);
    }

    /**
     * Downloads and optionally decompress the result file from the bulk operation, allows to overwrite the local result file.
     *
     * @param localResultDirectoryName the directory to place the result file in
     * @param localResultFileName the name to use for final result file
     * @param decompress indicates whether the result file should be unzipped
     * @param overwrite indicates whether can overwrite if target file exists
     * @param callback {@link AsyncCallback} object with {@link File}
     *
     * @return a {@link File} object pointing to the result file wrapped in Future
     */
    public Future<File> downloadResultFileAsync(File localResultDirectoryName, String localResultFileName, boolean decompress, boolean overwrite, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        return downloadResultFileAsyncImpl(localResultDirectoryName, localResultFileName, decompress, overwrite, callback);
    }

    abstract RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, TStatus status);

    private Future<File> downloadResultFileAsyncImpl(final File
            localResultDirectoryName, final String localResultFileName, final boolean decompress, final boolean overwrite, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        if (finalStatus == null) {
            getStatusAsync(new ParentCallback<BulkOperationStatus<TStatus>>(resultFuture) {
                @Override
                public void onSuccess(BulkOperationStatus<TStatus> result) throws IOException, URISyntaxException {
                    if (finalStatus == null) {
                        resultFuture.setException(new BulkOperationInProgressException());

                        return;
                    }

                    File resultFile = downloadFileWithFinalStatus(localResultDirectoryName, localResultFileName, decompress, overwrite);

                    resultFuture.setResult(resultFile);
                }
            });
        } else {
            File resultFile = downloadFileWithFinalStatus(localResultDirectoryName, localResultFileName, decompress, overwrite);

            resultFuture.setResult(resultFile);
        }

        return resultFuture;
    }

    private File downloadFileWithFinalStatus(File localResultDirectoryName, String localResultFileName, final boolean decompress, final boolean overwrite) throws IOException, URISyntaxException {
        if (!statusProvider.isSuccessStatus(finalStatus.getStatus())) {
            List<OperationError> errors = finalStatus.getErrors();

            throw getOperationCouldNotBeCompletedException(errors, finalStatus.getStatus());
        }

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
        }
        
        File extractedFile = zipExtractor.extractFirstEntryToFile(zipResultPath, fullPath, localResultFileName == null, overwrite);
        
        zipResultPath.delete();
        
        MessageHandler.getInstance().handleDirectMessage("Bulk Download... RequestId: " + requestId + "; DownloadUrl: " + finalStatus.getResultFileUrl() + "; LocalPath: " + localResultDirectoryName.getPath());

        return extractedFile;
    }

    private File downloadResultFileZip(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException {
        httpFileService.downloadFile(url, tempZipFile, overwrite, downloadHttpTimeoutInMilliseconds);

        return tempZipFile;
    }
}
