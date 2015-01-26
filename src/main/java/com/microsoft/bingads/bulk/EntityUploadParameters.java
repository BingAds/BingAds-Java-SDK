package com.microsoft.bingads.bulk;

import com.microsoft.bingads.bulk.entities.BulkEntity;
import java.io.File;

/**
 * Describes the available parameters when submitting entities for upload, such as the entities that you want to upload.
 */
public class EntityUploadParameters {

    private Iterable<BulkEntity> entities;

    private ResponseMode responseMode;

    private File resultFileDirectory;

    private String resultFileName;

    private boolean overwriteResultFile;
    
    /**
     * Initializes a new instance of this class.
     */
    public EntityUploadParameters() {
        responseMode = ResponseMode.ERRORS_AND_RESULTS;
    }

    /**
     * Gets whether the bulk service should return success and error results or only error results.
     * @return
     */
    public ResponseMode getResponseMode() {
        return responseMode;
    }

    /**
     * Sets whether the bulk service should return success and error results or only error results.
     * @param responseMode
     */
    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }

    /**
     * Gets the list of bulk entities that you want to upload.
     * @return
     */
    public Iterable<BulkEntity> getEntities() {
        return this.entities;
    }

    /**
     * Sets the list of bulk entities that you want to upload.
     * @param entities
     */
    public void setEntities(Iterable<BulkEntity> entities) {
        this.entities = entities;
    }

    /**
     * Gets the directory where the result file will be downloaded.
     * @return
     */
    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    /**
     * Sets the directory where the result file will be downloaded.
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
     * Gets whether the local result file should be overwritten if it already exists.
     * @return
     */
    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    /**
     * Sets whether the local result file should be overwritten if it already exists.
     * @param overwriteResultFile
     */
    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }

}
