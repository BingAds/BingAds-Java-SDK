/**
 * 
 */
package com.microsoft.bingads.v12.reporting;

/**
 * This exception is thrown if an attempt was made to poll for a completed reporting results file and the reporting service returns a failed status.
 *
 */
public class ReportingOperationCouldNotBeCompletedException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ReportRequestStatusType status;

    public ReportingOperationCouldNotBeCompletedException(ReportRequestStatusType status) {
        this.status = status;
    }

    public ReportingOperationCouldNotBeCompletedException(ReportRequestStatusType status, String message) {
        super(message);
        this.status = status;
    }

    public ReportRequestStatusType getStatus() {
        return status;
    }
}
