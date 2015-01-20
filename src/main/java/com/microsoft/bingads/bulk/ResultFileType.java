package com.microsoft.bingads.bulk;

/**
 * Defines the possible types of result files.
 *
 */
public enum ResultFileType {

    /**
     * The result file represents the full sync of entities that were specified
     * in the download request.
     */
    FULL_DOWNLOAD,
    /**
     * The result file represents the partial sync of entities that were
     * specified in the download request.
     */
    PARTIAL_DOWNLOAD,
    /**
     * The result file represents the entities specified in the upload request,
     * or the corresponding errors, or both entities and errors.
     */
    UPLOAD;
}
