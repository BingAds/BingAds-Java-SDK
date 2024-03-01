package com.microsoft.bingads.v13.reporting;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.ZipExtractor;

/**
 * Reserved for internal use.
 *
 * Represent a reporting download operation requested by a user. You can use it to poll for the download operation status, and then download the results file when available.
 *
 */
public class ReportingDownloadOperation {

    /**
     * The request identifier corresponding to the reporting download.
     */
    private final String requestId;

    /**
     * The identifier of the log entry that contains the details of the download request.
     */
    private final String trackingId;

    /**
     * The service to download files.
     */
    private final HttpFileService httpFileService;

    /**
     * The timeout in milliseconds of HttpClient download operation.
     */
    private final int downloadHttpTimeoutInMilliseconds;

    /**
      * To process download file.
      */
    private final ZipExtractor zipExtractor;

    /**
     * The client of reporting service.
     */
    private final ServiceClient<IReportingService> serviceClient;

    /**
     * The amount of time in milliseconds that the download operations should wait before polling the Reporting service for status.
     */
    private final int statusPollIntervalInMilliseconds;

    /**
     * Provide the status of the reporting download operation.
     */
    private final ReportingStatusProvider statusProvider;

    /**
 	 * The final status of reporting download operation.
 	 */
    private ReportingOperationStatus finalStatus;

    ReportingDownloadOperation(
            String requestId,
            String trackingId,
            ServiceClient<IReportingService> serviceClient,
            int statusPollIntervalInMilliseconds,
            HttpFileService httpFileService,
            int downloadHttpTimeoutInMilliseconds,
            ZipExtractor zipExtractor) {
        this.requestId = requestId;
        this.trackingId = trackingId;
        this.serviceClient = serviceClient;
        this.statusPollIntervalInMilliseconds = statusPollIntervalInMilliseconds;
        this.httpFileService = httpFileService;
        this.downloadHttpTimeoutInMilliseconds = downloadHttpTimeoutInMilliseconds;
        this.zipExtractor = zipExtractor;
        this.statusProvider = new ReportingStatusProvider(requestId);
    }

    /**
     * Runs asynchronously until the reporting service has finished processing the reporting download operation.
     *
     * @param callback A handler that will be called with the ReportingDownloadOperation when it has completed
     *
     * @return a Future that will be completed when the result file is available
     */
    public Future<ReportingOperationStatus> trackAsync(AsyncCallback<ReportingOperationStatus> callback) {
    	ReportingOperationTracker tracker = generateTracker();

        final ResultFuture<ReportingOperationStatus> resultFuture = new ResultFuture<ReportingOperationStatus>(callback);

        tracker.trackResultFileAsync(new ParentCallback<ReportingOperationStatus>(resultFuture) {
            @Override
            public void onSuccess(ReportingOperationStatus status) {

            	finalStatus = status;
                
                resultFuture.setResult(finalStatus);
            }
        });

        return resultFuture;
    }

    private ReportingOperationTracker generateTracker() {
    	ReportingOperationTracker tracker;

        tracker = new ReportingOperationTracker(statusProvider, this.serviceClient, this.statusPollIntervalInMilliseconds);

        return tracker;
    }

    /**
     * Gets the status of the reporting download operation.
     *
     * @return a {@link ReportingOperationStatus} object pointing to the current status of the reporting download operation in Future
     */
    public Future<ReportingOperationStatus> getStatusAsync(AsyncCallback<ReportingOperationStatus> callback) {
        final ResultFuture<ReportingOperationStatus> resultFuture = new ResultFuture<ReportingOperationStatus>(callback);

        if (finalStatus != null) {
        	
            resultFuture.setResult(this.finalStatus);

            return resultFuture;
        }

        statusProvider.getCurrentStatus(this.serviceClient, new ParentCallback<ReportingOperationStatus>(resultFuture) {
            @Override
            public void onSuccess(ReportingOperationStatus currentStatus) {
                if (statusProvider.isFinalStatus(currentStatus)) {
                    finalStatus = currentStatus;
                }

                resultFuture.setResult(currentStatus);
            }
        });

        return resultFuture;
    }

    

    /**
     * Downloads and optionally decompress the result file from the reporting download operation.
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
    
    private Future<File> downloadResultFileAsyncImpl(final File localResultDirectoryName, final String localResultFileName, final boolean decompress, final boolean overwrite, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        if (finalStatus == null) {
            getStatusAsync(new ParentCallback<ReportingOperationStatus>(resultFuture) {
                @Override
                public void onSuccess(ReportingOperationStatus result) throws IOException, URISyntaxException {
                    if (finalStatus == null) {
                    	
                        resultFuture.setException(new ReportingOperationInProgressException());

                        return;
                    }

                    File resultFile = downloadFileWithFinalStatus(localResultDirectoryName, localResultFileName, decompress, overwrite);

                    MessageHandler.getInstance().handleDirectMessage("Reporting Download... RequestId: " + requestId + "; DownloadUrl: " + finalStatus.getResultFileUrl() + "; LocalPath: " + localResultDirectoryName.getPath());

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
        if (!statusProvider.isSuccessStatus(finalStatus)) {
            
            throw new ReportingOperationCouldNotBeCompletedException((finalStatus.getStatus()));
        }

        // If the status is Success and the ResultFileUrl is null, then there is no data to download.
        if (statusProvider.isSuccessStatus(finalStatus) && !statusProvider.isResultFileUrl(finalStatus))
        {
            return null;
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
        
        return extractedFile;
    }

    private File downloadResultFileZip(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException {
        httpFileService.downloadFile(url, tempZipFile, overwrite, downloadHttpTimeoutInMilliseconds);

        return tempZipFile;
    }
    
    /**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @return the trackingId
	 */
	public String getTrackingId() {
		return trackingId;
	}

	/**
	 * @return the statusProvider
	 */
	public ReportingStatusProvider getStatusProvider() {
		return statusProvider;
	}

	/**
	 * @return the httpFileService
	 */
	public HttpFileService getHttpFileService() {
		return httpFileService;
	}

	/**
	 * @return the zipExtractor
	 */
	public ZipExtractor getZipExtractor() {
		return zipExtractor;
	}

	/**
	 * @return the serviceClient
	 */
	public ServiceClient<IReportingService> getServiceClient() {
		return serviceClient;
	}

	/**
	 * @return the finalStatus
	 */
	public ReportingOperationStatus getFinalStatus() {
		return finalStatus;
	}

	/**
	 * @param finalStatus the finalStatus to set
	 */
	public void setFinalStatus(ReportingOperationStatus finalStatus) {
		this.finalStatus = finalStatus;
	}

	/**
     * Gets the time interval in milliseconds between two status polling attempts. The default value is 5000 (5 second).
     */
    public int getStatusPollIntervalInMilliseconds() {
        return statusPollIntervalInMilliseconds;
    }

    /**
     * Gets the timeout of HttpClient download operation. The default value is 100000(100s).
     */
	public int getDownloadHttpTimeoutInMilliseconds() {
		return downloadHttpTimeoutInMilliseconds;
	}
}
