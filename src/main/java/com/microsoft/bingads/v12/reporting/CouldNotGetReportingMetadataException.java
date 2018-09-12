package com.microsoft.bingads.v12.reporting;

/**
 */
public class CouldNotGetReportingMetadataException extends Exception {
    public CouldNotGetReportingMetadataException(String metadataName) {
        super(String.format("The report header property %s is empty or not found in the file.", metadataName));
    }

    public CouldNotGetReportingMetadataException(String metadataName, Throwable cause) {
        super(String.format("The report header property %s is empty or not found in the file.", metadataName), cause);
    }
}
