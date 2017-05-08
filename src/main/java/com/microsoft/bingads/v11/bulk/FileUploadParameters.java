package com.microsoft.bingads.v11.bulk;

import java.io.File;


/**
 * Describes the available parameters when submitting a file for upload, such as the path of the upload result file. 
 */
public class FileUploadParameters {

    private final SubmitUploadParameters submitUploadParameters = new SubmitUploadParameters();
    
    private File resultFileDirectory;

    private String resultFileName;

    private boolean overwriteResultFile;

    /**
     * Reserved for internal use.
     */
    SubmitUploadParameters getSubmitUploadParameters() {
        return submitUploadParameters;
    }

    /**
     * Gets the directory where the file will be downloaded.
     */
    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    /**
     * Sets the directory where the file will be downloaded.
     */
    public void setResultFileDirectory(File resultFileDirectory) {
        this.resultFileDirectory = resultFileDirectory;
    }

    /**
     * Gets the name of the local result file.
     */
    public String getResultFileName() {
        return resultFileName;
    }

    /**
     * Sets the name of the local result file.
     */
    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }
    
    /**
     * Gets whether the bulk service should return success and error results or only error results.
     */
    public ResponseMode getResponseMode() {
        return submitUploadParameters.getResponseMode();
    }
    
    /**
     * Sets whether the bulk service should return success and error results or only error results.
     */
    public void setResponseMode(ResponseMode value) {
        submitUploadParameters.setResponseMode(value);
    }
    
    /**
     * Gets the fully qualified local path of the upload file.
     */
    public File getUploadFilePath() {
        return submitUploadParameters.getUploadFilePath();
    }
    
    /**
     * Sets the fully qualified local path of the upload file.
     */
    public void setUploadFilePath(File value) {
        submitUploadParameters.setUploadFilePath(value);
    }

    /**
     * Get whether the upload file should be compressed before uploading. The default value is True.
     */
    public boolean getCompressUploadFile() {
        return submitUploadParameters.getCompressUploadFile();
    }

    /**
     * Set whether the upload file should be compressed before uploading. The default value is True.
     */
    public void setCompressUploadFile(boolean compressUploadFile) {
        submitUploadParameters.setCompressUploadFile(compressUploadFile);
    }

    /**
     * Gets whether the local result file should be overwritten if it already exists.
     */
    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    /**
     * Gets whether the local result file should be overwritten if it already exists.
     */
    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }
}
