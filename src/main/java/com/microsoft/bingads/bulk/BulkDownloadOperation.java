package com.microsoft.bingads.bulk;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.internal.bulk.operations.DownloadStatusProvider;

/**
 * Represents a bulk download operation requested by a user. You can use this
 * class to poll for the download status, and then download the file when
 * available.
 *
 * Example: The {@link BulkServiceManager#submitDownload(DownloadParameters)}
 * method returns an instance of this class. If for any reason you do not want
 * to wait for the file to be prepared for download, for example if your
 * application quits unexpectedly or you have other tasks to process, you can
 * use an instance of {@link BulkDownloadOperation} to download the file when it
 * is available
 *
 */
public class BulkDownloadOperation extends BulkOperation<DownloadStatus> {

    /**
     * Initializes a new instance of this class with the specified
     * <paramref name="requestId"/> and <see cref="AuthorizationData"/>.
     *
     * @param requestId The identifier of a download request that has previously
     * been submitted.
     * @param authorizationData Represents a user who intends to access the
     * corresponding customer and account.
     * @param service The BulkServiceManager object
     */
    public BulkDownloadOperation(String requestId, AuthorizationData authorizationData) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData));
    }

    protected BulkDownloadOperation(String requestId, AuthorizationData authorizationData, String trackingId) {
        super(requestId, authorizationData, new DownloadStatusProvider(requestId, authorizationData), trackingId);
    }
}
