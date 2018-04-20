package com.microsoft.bingads.v12.bulk;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.v12.internal.bulk.UploadStatusProvider;


import java.util.List;

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
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     */
	public BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service) {
        this(requestId, authorizationData, service, null, null);
    }
    
    public BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service, ApiEnvironment apiEnvironment) {
    	this(requestId, authorizationData, service, null, apiEnvironment);
    }

    protected BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service, String trackingId) {
    	this(requestId, authorizationData, service, trackingId, null);
    }
    
    protected BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service, String trackingId, ApiEnvironment apiEnvironment) {
        super(requestId, authorizationData, new UploadStatusProvider(requestId), trackingId, apiEnvironment);
    }

    @Override
    RuntimeException getOperationCouldNotBeCompletedException(List<OperationError> errors, UploadStatus status) {
        return new BulkUploadCouldNotBeCompletedException(errors, status);
    }
}
