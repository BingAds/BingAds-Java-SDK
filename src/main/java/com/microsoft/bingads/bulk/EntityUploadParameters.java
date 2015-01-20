package com.microsoft.bingads.bulk;

import java.util.List;

import com.microsoft.bingads.bulk.entities.BulkEntity;
import java.io.File;

public class EntityUploadParameters {

    private List<BulkEntity> entities;

    private ResponseMode responseMode;

    private File resultFileDirectory;

    private String resultFileName;

    private boolean overwriteResultFile;
    
    public EntityUploadParameters() {
        responseMode = ResponseMode.ERRORS_AND_RESULTS;
    }

    public ResponseMode getResponseMode() {
        return responseMode;
    }

    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }

    public List<BulkEntity> getEntities() {
        return this.entities;
    }

    public void setEntities(List<BulkEntity> entities) {
        this.entities = entities;
    }

    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    public void setResultFileDirectory(File resultFileDirectory) {
        this.resultFileDirectory = resultFileDirectory;
    }

    public String getResultFileName() {
        return resultFileName;
    }

    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }

    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }

}
