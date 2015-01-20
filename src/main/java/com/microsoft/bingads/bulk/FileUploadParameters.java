package com.microsoft.bingads.bulk;

import java.io.File;

public class FileUploadParameters {

    private SubmitUploadParameters submitUploadParameters = new SubmitUploadParameters();                
    
    /**
     * The directory where the file will be downloaded.
     */
    private File resultFileDirectory;

    /**
     * The name of the download result file.
     */
    private String resultFileName;

    private boolean overwriteResultFile;
    
    public SubmitUploadParameters getSubmitUploadParameters() {
        return submitUploadParameters;
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
    
    public ResponseMode getResponseMode() {
        return submitUploadParameters.getResponseMode();
    }
    
    public void setResponseMode(ResponseMode value) {
        submitUploadParameters.setResponseMode(value);
    }
    
    public File getUploadFilePath() {
        return submitUploadParameters.getUploadFilePath();
    }
    
    public void setUploadFilePath(File value) {
        submitUploadParameters.setUploadFilePath(value);
    }

    public boolean getCompressUploadFile() {
        return submitUploadParameters.getCompressUploadFile();
    }

    public void setCompressUploadFile(boolean compressUploadFile) {
        submitUploadParameters.setCompressUploadFile(compressUploadFile);
    }

    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }
}
