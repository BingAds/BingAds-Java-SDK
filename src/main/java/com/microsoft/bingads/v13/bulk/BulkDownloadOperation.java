package com.microsoft.bingads.v13.bulk;

import java.util.List;

import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import com.microsoft.bingads.v13.internal.bulk.Config;
import com.microsoft.bingads.v13.internal.bulk.DownloadStatusProvider;

/**
 * Represents a bulk download operation requested by a user. You can use this
 * class to poll for the download status, and then download the file when
 * available.
 *
 * <p>
 * Example: The {@link BulkServiceManager#submitDownloadAsync}
 * method returns an instance of this class. If for any reason you do not want
 * to wait for the file to be prepared for download, for example if your
 * application quits unexpectedly or you have other tasks to process, you can
 * use an instance of {@link BulkDownloadOperation} to download the file when it
 * is available
 * </p>
 *
 */
public class BulkDownloadOperation extends BulkOperation<DownloadStatus> {

    /**
     * Initializes a new instance of this class with the specified
     * requestId and AuthorizationData.
     *
     * @param requestId The identifier of a download request that has previously
     * been submitted.
     */
    public BulkDownloadOperation(String requestId, ServiceClient<IBulkService> serviceClient, int statusPollIntervalInMilliseconds) {
        this(
                requestId,
                null,
                new HttpClientHttpFileService(),
                Config.DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS,
                new SimpleZipExtractor(),
                serviceClient,
                statusPollIntervalInMilliseconds);
    }

    BulkDownloadOperation(
            String requestId,
            String trackingId,
            HttpFileService httpFileService,
            int downloadHttpTimeoutInMilliseconds,
            ZipExtractor zipExtractor,
            ServiceClient<IBulkService> serviceClient,
            int statusPollIntervalInMilliseconds) {
    	super(
                requestId,
                trackingId,
                httpFileService,
                downloadHttpTimeoutInMilliseconds,
                zipExtractor,
                new DownloadStatusProvider(requestId, serviceClient, statusPollIntervalInMilliseconds));
    }
    
    @Override
    RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, DownloadStatus status) {
        return new BulkDownloadCouldNotBeCompletedException(errors, status);
    }
}
