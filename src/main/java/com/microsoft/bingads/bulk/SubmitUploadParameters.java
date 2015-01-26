package com.microsoft.bingads.bulk;

import java.io.File;

/**
 * Describes the minimum available parameters when submitting a file for upload, such as the path of the upload file. 
 */
public class SubmitUploadParameters {

    private ResponseMode responseMode;

    private File uploadFilePath;

    private boolean compressUploadFile;

    /**
     * Initializes a new instance of the class
     */
    protected SubmitUploadParameters() {
        responseMode = ResponseMode.ERRORS_AND_RESULTS;

        compressUploadFile = true;
    }

    /**
     * Gets whether the bulk service should return upload errors with the corresponding entity data.
     * @return
     */
    public ResponseMode getResponseMode() {
        return responseMode;
    }

    /**
     * Sets whether the bulk service should return upload errors with the corresponding entity data.
     * @param responseMode
     */
    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }
    
    /**
     * Gets the fully qualified local path of the upload file.
     * @return
     */
    public File getUploadFilePath() {
        return uploadFilePath;
    }

    /**
     * Sets the fully qualified local path of the upload file.
     * @param uploadFilePath
     */
    public void setUploadFilePath(File uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    /**
     * Gets whether the upload file should be compressed before uploading. The default value is True.
     * @return
     */
    public boolean getCompressUploadFile() {
        return compressUploadFile;
    }

    /**
     * Sets whether the upload file should be compressed before uploading. The default value is True.
     * @param compressUploadFile
     */
    public void setCompressUploadFile(boolean compressUploadFile) {
        this.compressUploadFile = compressUploadFile;
    }
}
