package com.microsoft.bingads.bulk;

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
     * @return
     */
    public SubmitUploadParameters getSubmitUploadParameters() {
        return submitUploadParameters;
    }

    /**
     * Gets the directory where the file will be downloaded.
     * @return
     */
    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    /**
     * Sets the directory where the file will be downloaded.
     * @param resultFileDirectory
     */
    public void setResultFileDirectory(File resultFileDirectory) {
        this.resultFileDirectory = resultFileDirectory;
    }

    /**
     * Gets the name of the local result file.
     * @return
     */
    public String getResultFileName() {
        return resultFileName;
    }

    /**
     * Sets the name of the local result file.
     * @param resultFileName
     */
    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }
    
    /**
     * Gets whether the bulk service should return success and error results or only error results.
     * @return
     */
    public ResponseMode getResponseMode() {
        return submitUploadParameters.getResponseMode();
    }
    
    /**
     * Sets whether the bulk service should return success and error results or only error results.
     * @param value
     */
    public void setResponseMode(ResponseMode value) {
        submitUploadParameters.setResponseMode(value);
    }
    
    /**
     * Gets the fully qualified local path of the upload file.
     * @return
     */
    public File getUploadFilePath() {
        return submitUploadParameters.getUploadFilePath();
    }
    
    /**
     * Sets the fully qualified local path of the upload file.
     * @param value
     */
    public void setUploadFilePath(File value) {
        submitUploadParameters.setUploadFilePath(value);
    }

    /**
     * Get whether the upload file should be compressed before uploading. The default value is True.
     * @return
     */
    public boolean getCompressUploadFile() {
        return submitUploadParameters.getCompressUploadFile();
    }

    /**
     * Set whether the upload file should be compressed before uploading. The default value is True.
     * @param compressUploadFile
     */
    public void setCompressUploadFile(boolean compressUploadFile) {
        submitUploadParameters.setCompressUploadFile(compressUploadFile);
    }

    /**
     * Gets whether the local result file should be overwritten if it already exists.
     * @return
     */
    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    /**
     * Gets whether the local result file should be overwritten if it already exists.
     * @param overwriteResultFile
     */
    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }
}
