package com.microsoft.bingads.v12.bulk;

import java.util.List;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.v12.internal.bulk.DownloadStatusProvider;

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
     * @param authorizationData Represents a user who intends to access the
     * corresponding customer and account.     
     */
    public BulkDownloadOperation(String requestId, AuthorizationData authorizationData) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData));
    }

    public BulkDownloadOperation(String requestId, AuthorizationData authorizationData, ApiEnvironment apiEnvironment) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData), null, apiEnvironment);
    }
    
    BulkDownloadOperation(String requestId, AuthorizationData authorizationData, String trackingId) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData), trackingId);
    }
    
    BulkDownloadOperation(String requestId, AuthorizationData authorizationData, String trackingId, ApiEnvironment apiEnvironment) {
    	super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData), trackingId, apiEnvironment);
    }
    
    @Override
    RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, DownloadStatus status) {
        return new BulkDownloadCouldNotBeCompletedException(errors, status);
    }
}
