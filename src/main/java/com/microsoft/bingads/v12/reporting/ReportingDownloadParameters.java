package com.microsoft.bingads.v12.reporting;

import java.io.File;

/**
 * Describes the available parameters when performing a download, such as the type of result file directory and result name that you want to download. 
 */
public class ReportingDownloadParameters {

	/**
	 * The base class of ReportRequest is to represent the type of reporting request.
	 */
    private ReportRequest reportRequest;
    
    private File resultFileDirectory;
    
    private String resultFileName;
    
    private boolean overwriteResultFile;

	/**
	 * @return the reportRequest
	 */
	public ReportRequest getReportRequest() {
		return reportRequest;
	}

	/**
	 * @param reportRequest the reportRequest to set
	 */
	public void setReportRequest(ReportRequest reportRequest) {
		this.reportRequest = reportRequest;
	}
	
	/**
	 * @return the resultFileDirectory
	 */
	public File getResultFileDirectory() {
		return resultFileDirectory;
	}

	/**
	 * @param resultFileDirectory the resultFileDirectory to set
	 */
	public void setResultFileDirectory(File resultFileDirectory) {
		this.resultFileDirectory = resultFileDirectory;
	}

	/**
	 * @return the resultFileName
	 */
	public String getResultFileName() {
		return resultFileName;
	}

	/**
	 * @param resultFileName the resultFileName to set
	 */
	public void setResultFileName(String resultFileName) {
		this.resultFileName = resultFileName;
	}

	/**
	 * @return the overwriteResultFile
	 */
	public boolean getOverwriteResultFile() {
		return overwriteResultFile;
	}

	/**
	 * @param overwriteResultFile the overwriteResultFile to set
	 */
	public void setOverwriteResultFile(boolean overwriteResultFile) {
		this.overwriteResultFile = overwriteResultFile;
	}
    
}
