package com.microsoft.bingads.v13.bulk;

import java.util.List;

import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import com.microsoft.bingads.v13.internal.bulk.Config;
import com.microsoft.bingads.v13.internal.bulk.UploadStatusProvider;

/**
 * Represents a bulk upload operation requested by a user.
 *
 * <p>
 * Example: {@link BulkServiceManager#submitUploadAsync} method returns an instance of this
 * class. If for any reason you do not want to wait for the file to finish
 * uploading, for example if your application quits unexpectedly or you have
 * other tasks to process, you can use an instance of
 * {@link BulkUploadOperation} to download the upload results file when it is
 * available.
 * </p>
 *
 */
public class BulkUploadOperation extends BulkOperation<UploadStatus> {

    /**
     * Initializes a new instance of this class with the specified requestId and authorization data.
     *
     * @param requestId The identifier of an upload request that has previously been submitted.
     */
	public BulkUploadOperation(String requestId, ServiceClient<IBulkService> serviceClient, int statusPollIntervalInMilliseconds) {
        this(
                requestId,
                null,
                serviceClient,
                statusPollIntervalInMilliseconds,
                new HttpClientHttpFileService(),
                Config.DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS,
                new SimpleZipExtractor());
    }
    
    BulkUploadOperation(
            String requestId,
            String trackingId,
            ServiceClient<IBulkService> serviceClient,
            int statusPollIntervalInMilliseconds,
            HttpFileService httpFileService,
            int downloadHttpTimeoutInMilliseconds,
            ZipExtractor zipExtractor) {
        super(
                requestId,
                trackingId,
                serviceClient,
                statusPollIntervalInMilliseconds,
                httpFileService,
                downloadHttpTimeoutInMilliseconds,
                zipExtractor,
                new UploadStatusProvider(requestId));
    }

    @Override
    RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, UploadStatus status) {
        return new BulkUploadCouldNotBeCompletedException(errors, status);
    }
}
