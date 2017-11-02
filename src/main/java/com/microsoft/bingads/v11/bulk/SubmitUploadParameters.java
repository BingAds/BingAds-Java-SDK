package com.microsoft.bingads.v11.bulk;

import java.io.File;

import com.microsoft.bingads.v11.bulk.ResponseMode;

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
     */
    public ResponseMode getResponseMode() {
        return responseMode;
    }

    /**
     * Sets whether the bulk service should return upload errors with the corresponding entity data.
     */
    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }
    
    /**
     * Gets the fully qualified local path of the upload file.
     */
    public File getUploadFilePath() {
        return uploadFilePath;
    }

    /**
     * Sets the fully qualified local path of the upload file.
     */
    public void setUploadFilePath(File uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    /**
     * Gets whether the upload file should be compressed before uploading. The default value is True.
     */
    public boolean getCompressUploadFile() {
        return compressUploadFile;
    }

    /**
     * Sets whether the upload file should be compressed before uploading. The default value is True.
     */
    public void setCompressUploadFile(boolean compressUploadFile) {
        this.compressUploadFile = compressUploadFile;
    }
}
