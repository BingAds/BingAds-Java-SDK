package com.microsoft.bingads.bulk;

import com.microsoft.bingads.bulk.ResponseMode;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import java.io.File;

/**
 * The abstract base class for all upload parameter classes. You can use this class to dynamically instantiate a derived upload parameters class at run time. This class cannot be instantiated, and instead you should use either {@link EntityUploadParameters} or {@link FileUploadParameters}.
 *
 */
public class SubmitUploadParameters {

    /**
     * Determines whether the bulk service should return upload errors with the corresponding {@link BulkEntity} data.
     *
     * For possible values, see ResponseMode Value Set at http://go.microsoft.com/fwlink/?LinkId=511681.
     *
     * If not specified, this property is set to ErrorsAndResults.
     */
    private ResponseMode responseMode;

    private File uploadFilePath;

    private boolean compressUploadFile;

    /**
     * Initializes a new instance of the class derived from
     * <see cref="UploadParameters"/>.
     */
    protected SubmitUploadParameters() {
        responseMode = ResponseMode.ERRORS_AND_RESULTS;

        compressUploadFile = true;
    }

    public ResponseMode getResponseMode() {
        return responseMode;
    }

    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }
    
    public File getUploadFilePath() {
        return uploadFilePath;
    }

    public void setUploadFilePath(File uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    public boolean getCompressUploadFile() {
        return compressUploadFile;
    }

    public void setCompressUploadFile(boolean compressUploadFile) {
        this.compressUploadFile = compressUploadFile;
    }
}
