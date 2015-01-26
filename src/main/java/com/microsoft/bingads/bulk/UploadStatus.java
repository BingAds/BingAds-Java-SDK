package com.microsoft.bingads.bulk;

/**
 * Defines the possible status values of the bulk upload.
 */
public enum UploadStatus {

    /**
     * The upload completed with one or more errors.
     */
    COMPLETED("Completed"),
    /**
     * The upload completed with one or more errors. While the overall upload
     * was successful, one or more add or update errors could have occurred. As
     * a best practice you should request error information via the
     * {@link ResponseMode} element when calling the upload service and check
     * the result file for any errors.
     */
    COMPLETED_WITH_ERRORS("CompletedWithErrors"),
    /**
     * The entire upload failed due to an unexpected error. You may submit a new
     * upload with fewer entities or try again to submit the same upload later.
     */
    FAILED("Failed"),
    /**
     * The upload request has been received and is in the queue for processing.
     */
    FILE_UPLOADED("FileUploaded"),
    /**
     * The upload file has been accepted and the upload is in progress.
     */
    IN_PROGRESS("InProgress"),
    /**
     * The upload file has not been received for the corresponding RequestId.
     */
    PENDING_FILE_UPLOAD("PendingFileUpload"),
    /**
     * Reserved for future use.
     */
    ABORTED("Unknown"),
    /**
     * Reserved for future use.
     */
    EXPIRED("Unknown");

    private final String value;

    UploadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UploadStatus fromValue(String v) {
        for (UploadStatus c : UploadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
