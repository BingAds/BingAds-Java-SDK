package com.microsoft.bingads.examples.v9;

import java.util.concurrent.ExecutionException;
import java.net.*;
import java.io.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.reporting.AdApiError;
import com.microsoft.bingads.reporting.AdApiFaultDetail_Exception;
import com.microsoft.bingads.reporting.ApiFaultDetail_Exception;
import com.microsoft.bingads.reporting.BatchError;
import com.microsoft.bingads.reporting.OperationError;
import com.microsoft.bingads.reporting.*;

public class ReportRequests extends ExampleBaseV9 {

    static AuthorizationData authorizationData;
    static ReportingServiceManager ReportingServiceManager; 
        
    // The directory for the report file.
    static java.lang.String FileDirectory = "c:\\reports\\";

    // The name of the report file.
    static java.lang.String ResultFileName = "result.csv";
    
    // The report file extension type.
    static ReportFormat ReportFileFormat = ReportFormat.CSV; 

    public static void main(String[] args) {
        
    	// Confirm that the download folder exists; otherwise, exit.
    	
    	String folder = FileDirectory.substring(0, FileDirectory.lastIndexOf('\\'));
        File dir = new File(folder);

        if (!dir.exists())
        {
            System.out.println("The output folder does not exist. Ensure that the " +
                "folder exists and try again.");
            return;
        }

        try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);
	         
            ReportingServiceManager = new ReportingServiceManager(authorizationData);
            ReportingServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // You can submit one of the example reports, or build your own.
			ReportRequest reportRequest = getKeywordPerformanceReportRequest();
			
			ReportingDownloadParameters reportingDownloadParameters = new ReportingDownloadParameters();
			reportingDownloadParameters.setReportRequest(reportRequest);
			reportingDownloadParameters.setResultFileDirectory(new File(FileDirectory));
			reportingDownloadParameters.setResultFileName(ResultFileName);
			reportingDownloadParameters.setOverwriteResultFile(true);
                        
            // Option A - Background Completion with ReportingServiceManager
            // You can submit a download or upload request and the ReportingServiceManager will automatically 
            // return results. The ReportingServiceManager abstracts the details of checking for result file 
            // completion, and you don't have to write any code for results polling.

            outputStatusMessage("Awaiting Background Completion . . .");
            backgroundCompletion(reportingDownloadParameters);

            // Option B - Submit and Download with ReportingServiceManager
            // Submit the download request and then use the ReportingOperation result to 
            // track status yourself using GetStatusAsync.

            outputStatusMessage("Awaiting Submit and Download . . .");
            submitAndDownload(reportRequest);

            // Option C - Download Results with ReportingServiceManager
            // If for any reason you have to resume from a previous application state, 
            // you can use an existing download request identifier and use it 
            // to download the result file. Use TrackAsync to indicate that the application 
            // should wait to ensure that the download status is completed.

            // For example you might have previously retrieved a request ID using SubmitDownloadAsync.
            ReportingDownloadOperation reportingDownloadOperation = ReportingServiceManager.submitDownloadAsync(reportRequest, null).get();
            java.lang.String requestId = reportingDownloadOperation.getRequestId();

            // Given the request ID above, you can resume the workflow and download the report.
            // The report request identifier is valid for two days. 
            // If you do not download the report within two days, you must request the report again.
            outputStatusMessage("Awaiting Download Results . . .");
            downloadResults(requestId, authorizationData);
        
        } catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				outputStatusMessage("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					outputStatusMessage("AdApiError\n");
					outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
							error.getCode(), error.getErrorCode(), error.getMessage()));
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
				outputStatusMessage("The operation failed with the following faults:\n");
				
				for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
				{
					outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
					outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
				}
				
				for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
				{
					outputStatusMessage("OperationError\n");
					outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
				}
			} else {
				ee.printStackTrace();	
			}
		} catch (OAuthTokenRequestException ex) {
			outputStatusMessage(String.format("Couldn't get OAuth tokens. Error: {0}. Description: {1}", 
					ex.getDetails().getError(), ex.getDetails().getDescription()));
			ex.printStackTrace();
		} catch (ReportingOperationInProgressException ex) {
			outputStatusMessage("The result file for the reporting operation is not yet available for download.");
			ex.printStackTrace();
		} catch (ReportingOperationCouldNotBeCompletedException ex) {
			outputStatusMessage(String.format("ReportingOperationCouldNotBeCompletedException Message: {0}", ex.getMessage()));
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (URISyntaxException ex) {
			ex.printStackTrace();
		}
        
    }
    
    // You can submit a download or upload request and the ReportingServiceManager will automatically 
    // return results. The ReportingServiceManager abstracts the details of checking for result file 
    // completion, and you don't have to write any code for results polling.
    private static void backgroundCompletion(ReportingDownloadParameters reportingDownloadParameters) 
    		throws ExecutionException, InterruptedException {
		File resultFile = ReportingServiceManager.downloadFileAsync(
				reportingDownloadParameters, 
				null).get();
		
		outputStatusMessage(String.format("Download result file: %s\n", resultFile.getName()));
    }
    
    // Submit the download request and then use the ReportingDownloadOperation result to 
    // track status yourself using GetStatusAsync.
    private static void submitAndDownload(ReportRequest reportRequest) 
    		throws ExecutionException, InterruptedException, URISyntaxException, IOException {
		ReportingDownloadOperation reportingDownloadOperation = ReportingServiceManager.submitDownloadAsync(
				reportRequest,
				null).get();
		
		ReportingOperationStatus reportingOperationStatus;
		int waitTime = 5000;
		        
		// This sample polls every 5 seconds up to 2 minutes.
		        
		for (int i = 0; i < 24; i++)
		{
		    Thread.sleep(waitTime);
		
		    reportingOperationStatus = reportingDownloadOperation.getStatusAsync(null).get();
		
		    if (reportingOperationStatus.getStatus() == ReportRequestStatusType.SUCCESS)
		    {
		        break;
		    }
		}
		
		File resultFile = reportingDownloadOperation.downloadResultFileAsync(
		    new File(FileDirectory),
		    ResultFileName,
		    true,  // Set this value to true if you want to decompress the ZIP file.
		    true,  // Set this value true if you want to overwrite the named file.
		    null).get();
		
		outputStatusMessage(String.format("Download result file: %s\n", resultFile.getName()));

    }
    
    // If for any reason you have to resume from a previous application state, 
    // you can use an existing download request identifier and use it 
    // to download the result file. Use TrackAsync to indicate that the application 
    // should wait to ensure that the download status is completed.
    private static void downloadResults(java.lang.String requestId, AuthorizationData authorizationData) 
    		throws ExecutionException, InterruptedException, URISyntaxException, IOException {
    	
		ReportingDownloadOperation reportingDownloadOperation = new ReportingDownloadOperation(requestId, authorizationData);
		
		reportingDownloadOperation.setStatusPollIntervalInMilliseconds(5000);
		
		ReportingOperationStatus reportingOperationStatus = reportingDownloadOperation.trackAsync(null).get();
		
		File resultFile = reportingDownloadOperation.downloadResultFileAsync(
		    new File(FileDirectory),
		    ResultFileName,
		    true,  // Set this value to true if you want to decompress the ZIP file.
		    true,  // Set this value true if you want to overwrite the named file.
		    null).get();
		
		outputStatusMessage(String.format("Download result file: %s", resultFile.getName()));
		outputStatusMessage(String.format("Status: %s", reportingOperationStatus.getStatus()));
		outputStatusMessage(String.format("TrackingId: %s\n", reportingOperationStatus.getTrackingId()));
    }

    private static ReportRequest getKeywordPerformanceReportRequest(){
    	KeywordPerformanceReportRequest report = new KeywordPerformanceReportRequest();
        
        report.setFormat(ReportFileFormat);
        report.setReportName("My Keyword Performance Report");
        report.setReturnOnlyCompleteData(false);
        report.setAggregation(ReportAggregation.DAILY);

        ArrayOflong accountIds = new ArrayOflong();
        accountIds.getLongs().add(authorizationData.getAccountId());
        
        report.setScope(new AccountThroughAdGroupReportScope());
        report.getScope().setAccountIds(accountIds);
        report.getScope().setCampaigns(null);
        report.getScope().setAdGroups(null);         

        report.setTime(new ReportTime());
        report.getTime().setPredefinedTime(ReportTimePeriod.YESTERDAY);
        
        // You may either use a custom date range or predefined time.
        //report.getTime().setCustomDateRangeStart(new Date());
        //report.getTime().getCustomDateRangeStart().setMonth(9);
        //report.getTime().getCustomDateRangeStart().setDay(1);
        //report.getTime().getCustomDateRangeStart().setYear(2017);
        //report.getTime().setCustomDateRangeEnd(new Date());
        //report.getTime().getCustomDateRangeEnd().setMonth(9);
        //report.getTime().getCustomDateRangeEnd().setDay(30);
        //report.getTime().getCustomDateRangeEnd().setYear(2017);
        
        // If you specify a filter, results may differ from data you see in the Bing Ads web application
        //report.setFilter(new KeywordPerformanceReportFilter());
        //ArrayList<DeviceTypeReportFilter> deviceTypes = new ArrayList<DeviceTypeReportFilter>();
        //deviceTypes.add(DeviceTypeReportFilter.COMPUTER);
        //deviceTypes.add(DeviceTypeReportFilter.SMART_PHONE);
        //report.getFilter().setDeviceType(deviceTypes);

        // Specify the attribute and data report columns.
        
        ArrayOfKeywordPerformanceReportColumn keywordPerformanceReportColumns = new ArrayOfKeywordPerformanceReportColumn();
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.TIME_PERIOD);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ACCOUNT_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CAMPAIGN_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.DEVICE_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.BID_MATCH_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CLICKS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.IMPRESSIONS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CTR);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AVERAGE_CPC);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.SPEND);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.QUALITY_SCORE);
        report.setColumns(keywordPerformanceReportColumns);
        
        // You may optionally sort by any KeywordPerformanceReportColumn, and optionally
        // specify the maximum number of rows to return in the sorted report. 

        KeywordPerformanceReportSort keywordPerformanceReportSort = new KeywordPerformanceReportSort();
        keywordPerformanceReportSort.setSortColumn(KeywordPerformanceReportColumn.CLICKS);
        keywordPerformanceReportSort.setSortOrder(SortOrder.ASCENDING);
        ArrayOfKeywordPerformanceReportSort keywordPerformanceReportSorts = new ArrayOfKeywordPerformanceReportSort();
        keywordPerformanceReportSorts.getKeywordPerformanceReportSorts().add(keywordPerformanceReportSort);
        report.setSort(keywordPerformanceReportSorts);
        
        report.setMaxRows(10);
        
        return report;
    }
}