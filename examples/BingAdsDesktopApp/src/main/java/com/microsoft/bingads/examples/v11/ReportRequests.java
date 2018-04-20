package com.microsoft.bingads.examples.v11;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.net.*;
import java.io.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.v11.reporting.AdApiError;
import com.microsoft.bingads.v11.reporting.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v11.reporting.ApiFaultDetail_Exception;
import com.microsoft.bingads.v11.reporting.BatchError;
import com.microsoft.bingads.v11.reporting.OperationError;
import com.microsoft.bingads.v11.reporting.*;

public class ReportRequests extends ExampleBase {

    static ReportingServiceManager ReportingServiceManager; 
    
    // The directory for the report file.
    static java.lang.String FileDirectory = "c:\\reports\\";

    // The name of the report file.
    static java.lang.String ResultFileName = "result";
    
    // The report file extension type.
    static ReportFormat ReportFileFormat = ReportFormat.CSV; 
    
    // The maximum amount of time (in milliseconds) that you want to wait for the report download.
    static int TimeoutInMilliseconds = 3600000;

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
            authorizationData = getAuthorizationData(null,null);
	         
            ReportingServiceManager = new ReportingServiceManager(authorizationData, API_ENVIRONMENT);
            ReportingServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // You can submit one of the example reports, or build your own.
            ReportRequest reportRequest = getKeywordPerformanceReportRequest();

            ReportingDownloadParameters reportingDownloadParameters = new ReportingDownloadParameters();
            reportingDownloadParameters.setReportRequest(reportRequest);
            reportingDownloadParameters.setResultFileDirectory(new File(FileDirectory));
            reportingDownloadParameters.setResultFileName(ResultFileName);
            reportingDownloadParameters.setOverwriteResultFile(true);
                        
            // Option A - Background Completion with ReportingServiceManager
            // You can submit a download request and the ReportingServiceManager will automatically 
            // return results. The ReportingServiceManager abstracts the details of checking for result file 
            // completion, and you don't have to write any code for results polling.

            outputStatusMessage("Awaiting Background Completion . . .");
            backgroundCompletionAsync(reportingDownloadParameters);

            // Option B - Submit and Download with ReportingServiceManager
            // Submit the download request and then use the ReportingDownloadOperation result to 
            // track status until the report is complete e.g. either using
            // trackAsync or getStatusAsync.

            outputStatusMessage("Awaiting Submit and Download . . .");
            submitAndDownloadAsync(reportRequest);

            // Option C - Download Results with ReportingServiceManager
            // If for any reason you have to resume from a previous application state, 
            // you can use an existing download request identifier and use it 
            // to download the result file. 

            // For example you might have previously retrieved a request ID using submitDownloadAsync.
            ReportingDownloadOperation reportingDownloadOperation = 
            		ReportingServiceManager.submitDownloadAsync(reportRequest, null).get();
            java.lang.String requestId = reportingDownloadOperation.getRequestId();

            // Given the request ID above, you can resume the workflow and download the report.
            // The report request identifier is valid for two days. 
            // If you do not download the report within two days, you must request the report again.
            outputStatusMessage("Awaiting Download Results . . .");
            downloadResultsAsync(requestId);
            
            outputStatusMessage("Program execution completed\n"); 
        
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
    
    // You can submit a download request and the ReportingServiceManager will automatically 
    // return results. The ReportingServiceManager abstracts the details of checking for result file 
    // completion, and you don't have to write any code for results polling.
    private static void backgroundCompletionAsync(ReportingDownloadParameters reportingDownloadParameters) 
    		throws ExecutionException, InterruptedException, TimeoutException {
    	// You may optionally cancel the downloadFileAsync operation after a specified time interval.
        File resultFile = ReportingServiceManager.downloadFileAsync(
                        reportingDownloadParameters, 
                        null).get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);
        
        if(resultFile != null && resultFile.getName() != "")
        {
            outputStatusMessage(String.format("Download result file: %s\n", resultFile.getName()));
        }
        else
        {
            outputStatusMessage("No report data for the submitted request\n");
        }
    }
    
    // Submit the download request and then use the ReportingDownloadOperation result to 
    // track status until the report is complete e.g. either using
    // trackAsync or getStatusAsync.
    private static void submitAndDownloadAsync(ReportRequest reportRequest) 
        throws ExecutionException, InterruptedException, URISyntaxException, IOException, TimeoutException {
        ReportingDownloadOperation reportingDownloadOperation = ReportingServiceManager.submitDownloadAsync(
                        reportRequest,
                        null).get();

        // You may optionally cancel the trackAsync operation after a specified time interval.
        ReportingOperationStatus reportingOperationStatus = 
                        reportingDownloadOperation.trackAsync(null).get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);

        // You can use trackAsync to poll until complete as shown above, 
        // or use custom polling logic with getStatusAsync as shown below.

//		ReportingOperationStatus reportingOperationStatus;
//		
//		for (int i = 0; i < 24; i++)
//		{
//		    Thread.sleep(5000);
//		    reportingOperationStatus = reportingDownloadOperation.getStatusAsync(null).get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);
//		    if (reportingOperationStatus.getStatus() == ReportRequestStatusType.SUCCESS)
//		    {
//		        break;
//		    }
//		}

        File resultFile = reportingDownloadOperation.downloadResultFileAsync(
            new File(FileDirectory),
            ResultFileName,
            true, // Set this value to true if you want to decompress the ZIP file.
            true,  // Set this value true if you want to overwrite the named file.
            null).get();
	
        if(resultFile != null && resultFile.getName() != "")
        {
            outputStatusMessage(String.format("Download result file: %s\n", resultFile.getName()));
        }
        else
        {
            outputStatusMessage("No report data for the submitted request\n");
        }
    }
    
    // If for any reason you have to resume from a previous application state, 
    // you can use an existing download request identifier and use it 
    // to download the result file. Use trackAsync to indicate that the application 
    // should wait to ensure that the download status is completed.
    private static void downloadResultsAsync(java.lang.String requestId) 
        throws ExecutionException, InterruptedException, URISyntaxException, IOException, TimeoutException {

        ReportingDownloadOperation reportingDownloadOperation = new ReportingDownloadOperation(requestId, authorizationData, API_ENVIRONMENT);

        reportingDownloadOperation.setStatusPollIntervalInMilliseconds(5000);

        // You can use trackAsync to poll until complete as shown here, 
    // or use custom polling logic with getStatusAsync.

        // You may optionally cancel the trackAsync operation after a specified time interval.
        ReportingOperationStatus reportingOperationStatus = 
                        reportingDownloadOperation.trackAsync(null).get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);

        File resultFile = reportingDownloadOperation.downloadResultFileAsync(
            new File(FileDirectory),
            ResultFileName,
            true, // Set this value to true if you want to decompress the ZIP file
            true,  // Set this value true if you want to overwrite the named file.
            null).get();

        if(resultFile != null && resultFile.getName() != "")
        {
            outputStatusMessage(String.format("Download result file: %s", resultFile.getName()));
            outputStatusMessage(String.format("Status: %s", reportingOperationStatus.getStatus()));
            outputStatusMessage(String.format("TrackingId: %s\n", reportingOperationStatus.getTrackingId()));
        }
        else
        {
            outputStatusMessage("No report data for the submitted request\n");
        }
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
        //Calendar calendar = Calendar.getInstance();
        //report.getTime().setCustomDateRangeStart(new Date());
        //report.getTime().getCustomDateRangeStart().setMonth(1);
        //report.getTime().getCustomDateRangeStart().setDay(1);
        //report.getTime().getCustomDateRangeStart().setYear(calendar.get(Calendar.YEAR)-1);
        //report.getTime().setCustomDateRangeEnd(new Date());
        //report.getTime().getCustomDateRangeEnd().setMonth(12);
        //report.getTime().getCustomDateRangeEnd().setDay(31);
        //report.getTime().getCustomDateRangeEnd().setYear(calendar.get(Calendar.YEAR)-1);
        
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
