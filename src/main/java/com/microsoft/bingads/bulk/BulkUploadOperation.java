package com.microsoft.bingads.bulk;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.internal.bulk.operations.UploadStatusProvider;

/**
 * Represents a bulk upload operation requested by a user. You can use this
 * class to poll for the upload status, and then download the upload results
 * file when available.
 *
 * Example: {@link BulkService#submitUpload} method returns an instance of this
 * class. If for any reason you do not want to wait for the file to finish
 * uploading, for example if your application quits unexpectedly or you have
 * other tasks to process, you can use an instance of
 * {@link BulkUploadOperation} to download the upload results file when it is
 * available.
 *
 */
public class BulkUploadOperation extends BulkOperation<UploadStatus> {

    /**
     * Initializes a new instance of this class with the specified requestId and
     * {@link UserData}.
     *
     * @param requestId The identifier of an upload request that has previously
     * been submitted.
     * @param authorizationData Represents a user who intends to access the
     * corresponding customer and account.
     */
    public BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service) {
        this(requestId, authorizationData, service, null);
    }

    protected BulkUploadOperation(String requestId, AuthorizationData authorizationData, IBulkService service, String trackingId) {
        super(requestId, authorizationData, new UploadStatusProvider(requestId), trackingId);
    }
}
