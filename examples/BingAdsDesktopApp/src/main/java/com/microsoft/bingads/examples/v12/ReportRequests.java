package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.v12.reporting.*;
import com.microsoft.bingads.v12.reporting.Report;
import com.microsoft.bingads.v12.reporting.ReportingDownloadOperation; 
import com.microsoft.bingads.v12.reporting.ReportingOperationStatus;
import com.microsoft.bingads.v12.reporting.ReportingDownloadParameters; 
import com.microsoft.bingads.v12.reporting.ReportRecord;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.HashSet;
import java.util.Objects;
import java.net.*;
import java.io.*;

import javax.xml.stream.XMLStreamException;

import org.apache.commons.text.WordUtils;
import org.apache.commons.lang3.StringUtils;

public class ReportRequests extends ExampleBase {

    static ReportingServiceManager ReportingServiceManager; 
        
    // The reportRequest file extension type.
    final static ReportFormat ReportFileFormat = ReportFormat.CSV; 
    
    // The directory for the reportRequest file.
    static java.lang.String FileDirectory = "c:\\reports\\";

    // The name of the reportRequest file.
    static java.lang.String ResultFileName = "result." + ReportFileFormat.toString().toLowerCase();    
    
    // The maximum amount of time (in milliseconds) that you want to wait for the reportRequest download.
    static int TimeoutInMilliseconds = 3600000;
  
    public static void main(String[] args) {

    	// Confirm that the download folder exists; otherwise, exit.
    	
    	String folder = FileDirectory.substring(0, FileDirectory.lastIndexOf('\\'));
        File dir = new File(folder);

        if (!dir.exists())
        {
            System.out.println("The output folder does not exist. Ensure that the folder exists and try again.");
            return;
        }

        try
        {            
            authorizationData = getAuthorizationData();
            
            ReportingServiceManager = new ReportingServiceManager(authorizationData, API_ENVIRONMENT);
            ReportingServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // You can submit one of the example reports, or build your own.
            ReportRequest reportRequest = getReportRequest(authorizationData.getAccountId());

            ReportingDownloadParameters reportingDownloadParameters = new ReportingDownloadParameters();
            reportingDownloadParameters.setReportRequest(reportRequest);
            reportingDownloadParameters.setResultFileDirectory(new File(FileDirectory));
            reportingDownloadParameters.setResultFileName(ResultFileName);
            reportingDownloadParameters.setOverwriteResultFile(true);
            
            // Option A - Background Completion with ReportingServiceManager
            // You can submit a download request and the ReportingServiceManager will automatically 
            // return results. The ReportingServiceManager abstracts the details of checking for result file 
            // completion, and you don't have to write any code for results polling.

//            outputStatusMessage("Awaiting Background Completion . . .");
//            backgroundCompletionAsync(reportingDownloadParameters);

            // Option B - Submit and Download with ReportingServiceManager
            // Submit the download request and then use the ReportingDownloadOperation result to 
            // track status until the download is complete e.g. either using
            // trackAsync or getStatusAsync.

//            outputStatusMessage("Awaiting Submit and Download . . .");
//            submitAndDownloadAsync(reportRequest);

            // Option C - Download Results with ReportingServiceManager
            // If for any reason you have to resume from a previous application state, 
            // you can use an existing download request identifier and use it 
            // to download the result file. Use trackAsync to indicate that the application 
            // should wait to ensure that the download status is completed.

            // For example you might have previously retrieved a request ID using submitDownloadAsync.
//            ReportingDownloadOperation reportingDownloadOperation = ReportingServiceManager.submitDownloadAsync(reportRequest, null).get();
//            java.lang.String requestId = reportingDownloadOperation.getRequestId();

            // Given the request ID above, you can resume the workflow and download the reportRequest.
            // The reportRequest request identifier is valid for two days. 
            // If you do not download the reportRequest within two days, you must request it again.
//            outputStatusMessage("Awaiting Download Results . . .");
//            downloadResultsAsync(requestId);

            // Option D - Download the reportRequest in memory with ReportingServiceManager.downloadReportAsync
            // The downloadReportAsync helper function downloads the reportRequest and summarizes results.
            outputStatusMessage("Awaiting downloadReportAsync . . .");
            downloadReportAsync(reportingDownloadParameters);   
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
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
        
        if(resultFile != null && !Objects.equals(resultFile.getName(), ""))
        {
            outputStatusMessage(String.format("Download result file: %s\n", resultFile.getName()));
        }
        else
        {
            outputStatusMessage("No report data for the submitted request\n");
        }
    }
    
    // Submit the download request and then use the ReportingDownloadOperation result to 
    // track status until the reportRequest is complete e.g. either using
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

//        ReportingOperationStatus reportingOperationStatus;
//
//        for (int i = 0; i < 24; i++)
//        {
//            Thread.sleep(5000);
//            reportingOperationStatus = reportingDownloadOperation.getStatusAsync(null).get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);
//            if (reportingOperationStatus.getStatus() == ReportRequestStatusType.SUCCESS)
//            {
//                break;
//            }
//        }

        File resultFile = reportingDownloadOperation.downloadResultFileAsync(
            new File(FileDirectory),
            ResultFileName,
            true, // Set this value to true if you want to decompress the ZIP file.
            true,  // Set this value true if you want to overwrite the named file.
            null).get();
	
        if(resultFile != null && !Objects.equals(resultFile.getName(), ""))
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
        ReportingOperationStatus reportingOperationStatus = reportingDownloadOperation.trackAsync(null)
                .get(TimeoutInMilliseconds, TimeUnit.MILLISECONDS);

        File resultFile = reportingDownloadOperation.downloadResultFileAsync(
            new File(FileDirectory),
            ResultFileName,
            true, // Set this value to true if you want to decompress the ZIP file
            true,  // Set this value true if you want to overwrite the named file.
            null).get();

        if(resultFile != null && !Objects.equals(resultFile.getName(), ""))
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
    
    // Download the reportRequest in memory with ReportingServiceManager.downloadReportAsync
    // The downloadReportAsync helper function downloads the reportRequest and summarizes results.
    static void downloadReportAsync(ReportingDownloadParameters reportingDownloadParameters) throws IOException, InterruptedException, ExecutionException, XMLStreamException, CouldNotGetReportingMetadataException, InvalidColumnException
    {
        // You can get a Report object by submitting a new download request via ReportingServiceManager. 
        // Although in this case you will not work directly with the file, under the covers a request is 
        // submitted to the Reporting service and the reportRequest file is downloaded to a local directory. 

        Report reportContainer = ReportingServiceManager.downloadReportAsync(
                reportingDownloadParameters, 
                null).get(); 

        // Otherwise if you already have a reportRequest file that was downloaded via the API, 
        // you can get a Report object via the ReportFileReader. 

//        ReportFileReader reader = new ReportFileReader(
//                reportingDownloadParameters.getResultFileDirectory() + "\\" + reportingDownloadParameters.getResultFileName(), 
//                reportingDownloadParameters.getReportRequest().getFormat());
//        Report reportContainer = reader.getReport();

        if(reportContainer == null)
        {
            outputStatusMessage("There is no report data for the submitted report request parameters.");
            return;
        }

        // Once you have a Report object via either workflow above, you can access the metadata and reportRequest records. 

        // Output the reportRequest metadata

        java.lang.Long recordCount = reportContainer.getReportRecordCount();
        outputStatusMessage(String.format("ReportName: %s", reportContainer.getReportName()));
        outputStatusMessage(String.format("ReportTimeStart: %s", reportContainer.getReportTimeStart()));
        outputStatusMessage(String.format("ReportTimeEnd: %s", reportContainer.getReportTimeEnd()));
        outputStatusMessage(String.format("LastCompletedAvailableDate: %s", reportContainer.getLastCompletedAvailableDate().toString()));
        outputStatusMessage(String.format("ReportAggregation: %s", enumCaseToPascalCase(reportContainer.getReportAggregation().toString())));
        outputStatusMessage(String.format("ReportColumns: %s", String.join("; ", reportContainer.getReportColumns())));
        outputStatusMessage(String.format("ReportRecordCount: %s", recordCount));

        // Analyze and output performance statistics
        
        if(Arrays.asList(reportContainer.getReportColumns()).contains("Impressions")){
            Iterable<ReportRecord> reportRecordIterable = reportContainer.getReportRecords();

            int totalImpressions = 0;
            int totalClicks = 0;
            HashSet<String> distinctDevices = new HashSet<>();
            HashSet<String> distinctNetworks = new HashSet<>();
            for (ReportRecord record : reportRecordIterable)
            {
                totalImpressions += record.getIntegerValue("Impressions");
                totalClicks += record.getIntegerValue("Clicks");
                distinctDevices.add(record.getStringValue("DeviceType"));
                distinctNetworks.add(record.getStringValue("Network"));
            }

            outputStatusMessage(String.format("Total Impressions: %s", totalImpressions));
            outputStatusMessage(String.format("Total Clicks: %s", totalClicks));
            outputStatusMessage(String.format("Average Impressions: %s", totalImpressions * 1.0 / recordCount));
            outputStatusMessage(String.format("Average Clicks: %s", totalClicks * 1.0 / recordCount));
            outputStatusMessage(String.format("Distinct Devices: %s", String.join("; ", distinctDevices)));
            outputStatusMessage(String.format("Distinct Networks: %s", String.join("; ", distinctNetworks)));
        }       

        // Be sure to close the reportRequest before you attempt to clean up files within the working directory.

        reportContainer.close();

        // The cleanupTempFiles method removes all files (not sub-directories) within the working
        // directory, whether or not the files were created by this ReportingServiceManager instance. 
        // If you are using a cloud service such as Microsoft Azure you'll want to ensure you do not
        // exceed the file or directory limits. 

        //ReportingServiceManager.cleanupTempFiles();
    }
        
    private static java.lang.String enumCaseToPascalCase(java.lang.String text) {
        return StringUtils.remove(WordUtils.capitalizeFully(text, '_'), "_");
    }
    
    private static ReportRequest getReportRequest(java.lang.Long accountId)
    {
        ReportAggregation aggregation = ReportAggregation.DAILY;
        java.lang.Boolean excludeColumnHeaders = false;
        java.lang.Boolean excludeReportFooter = false;
        java.lang.Boolean excludeReportHeader = false;
        ReportTime time = new ReportTime();
        // You can either use a custom date range or predefined time.
        time.setPredefinedTime(ReportTimePeriod.YESTERDAY);
        time.setReportTimeZone(ReportTimeZone.PACIFIC_TIME_US_CANADA_TIJUANA);
        java.lang.Boolean returnOnlyCompleteData = false;
        
        AdPerformanceReportRequest adPerformanceReportRequest = getAdPerformanceReportRequest(
            accountId,
            aggregation,
            excludeColumnHeaders,
            excludeReportFooter,
            excludeReportHeader,
            ReportFileFormat,
            returnOnlyCompleteData,
            time);
        
        KeywordPerformanceReportRequest keywordPerformanceReportRequest = getKeywordPerformanceReportRequest(
            accountId,
            aggregation,
            excludeColumnHeaders,
            excludeReportFooter,
            excludeReportHeader,
            ReportFileFormat,
            returnOnlyCompleteData,
            time);
                            
        return keywordPerformanceReportRequest;        
    }
    
    private static AdPerformanceReportRequest getAdPerformanceReportRequest(
            java.lang.Long accountId,
            ReportAggregation aggregation,
            java.lang.Boolean excludeColumnHeaders,
            java.lang.Boolean excludeReportFooter,
            java.lang.Boolean excludeReportHeader,
            ReportFormat format,
            java.lang.Boolean returnOnlyCompleteData,
            ReportTime time)
    {
        AdPerformanceReportRequest reportRequest = new AdPerformanceReportRequest();
        
        reportRequest.setAggregation(aggregation);
        reportRequest.setExcludeColumnHeaders(excludeColumnHeaders);
        reportRequest.setExcludeReportFooter(excludeReportFooter);
        reportRequest.setExcludeReportHeader(excludeReportHeader);
        reportRequest.setFormat(format);
        reportRequest.setReturnOnlyCompleteData(returnOnlyCompleteData);
        reportRequest.setTime(time);
        reportRequest.setReportName("My Ad Performance Report");
        ArrayOflong accountIds = new ArrayOflong();
        accountIds.getLongs().add(accountId);
        reportRequest.setScope(new AccountThroughAdGroupReportScope());
        reportRequest.getScope().setAccountIds(accountIds);
        reportRequest.getScope().setCampaigns(null);
        reportRequest.getScope().setAdGroups(null);        
        AdPerformanceReportFilter filter = new AdPerformanceReportFilter();
        reportRequest.setFilter(filter);
        ArrayOfAdPerformanceReportColumn adPerformanceReportColumns = new ArrayOfAdPerformanceReportColumn(); 
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.ACCOUNT_NAME);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.ACCOUNT_NUMBER);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.ACCOUNT_ID);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.TIME_PERIOD);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CAMPAIGN_NAME);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CAMPAIGN_ID);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_GROUP_NAME);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_GROUP_ID);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_ID);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_TYPE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.DESTINATION_URL);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CURRENCY_CODE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.DELIVERED_MATCH_TYPE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_DISTRIBUTION);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.IMPRESSIONS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CLICKS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CTR);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AVERAGE_CPC);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.SPEND);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AVERAGE_POSITION);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CONVERSIONS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CONVERSION_RATE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.COST_PER_CONVERSION);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.BID_MATCH_TYPE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.DEVICE_TYPE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.LANGUAGE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CAMPAIGN_STATUS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.ACCOUNT_STATUS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_GROUP_STATUS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.AD_STATUS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.NETWORK);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.TOP_VS_OTHER);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.DEVICE_OS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.ASSISTS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.REVENUE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.RETURN_ON_AD_SPEND);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.COST_PER_ASSIST);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.REVENUE_PER_CONVERSION);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.REVENUE_PER_ASSIST);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.TRACKING_TEMPLATE);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.CUSTOM_PARAMETERS);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.FINAL_URL);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.FINAL_MOBILE_URL);
        adPerformanceReportColumns.getAdPerformanceReportColumns().add(AdPerformanceReportColumn.FINAL_APP_URL);
        reportRequest.setColumns(adPerformanceReportColumns);
        
        return reportRequest;
    }
            
    private static KeywordPerformanceReportRequest getKeywordPerformanceReportRequest(
            java.lang.Long accountId,
            ReportAggregation aggregation,
            java.lang.Boolean excludeColumnHeaders,
            java.lang.Boolean excludeReportFooter,
            java.lang.Boolean excludeReportHeader,
            ReportFormat format,
            java.lang.Boolean returnOnlyCompleteData,
            ReportTime time)
    {
        KeywordPerformanceReportRequest reportRequest = new KeywordPerformanceReportRequest();
        
        reportRequest.setAggregation(aggregation);
        reportRequest.setExcludeColumnHeaders(excludeColumnHeaders);
        reportRequest.setExcludeReportFooter(excludeReportFooter);
        reportRequest.setExcludeReportHeader(excludeReportHeader);
        reportRequest.setFormat(format);
        reportRequest.setReturnOnlyCompleteData(returnOnlyCompleteData);
        reportRequest.setTime(time);
        reportRequest.setReportName("My Keyword Performance Report");
        ArrayOflong accountIds = new ArrayOflong();
        accountIds.getLongs().add(accountId);
        reportRequest.setScope(new AccountThroughAdGroupReportScope());
        reportRequest.getScope().setAccountIds(accountIds);
        reportRequest.getScope().setCampaigns(null);
        reportRequest.getScope().setAdGroups(null);        
        KeywordPerformanceReportFilter filter = new KeywordPerformanceReportFilter();
        reportRequest.setFilter(filter);
        ArrayOfKeywordPerformanceReportColumn keywordPerformanceReportColumns = new ArrayOfKeywordPerformanceReportColumn(); 
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ACCOUNT_NAME);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ACCOUNT_NUMBER);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ACCOUNT_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.TIME_PERIOD);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CAMPAIGN_NAME);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CAMPAIGN_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_GROUP_NAME);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_GROUP_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_ID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.DESTINATION_URL);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CURRENT_MAX_CPC);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CURRENCY_CODE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.DELIVERED_MATCH_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_DISTRIBUTION);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.IMPRESSIONS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CLICKS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CTR);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AVERAGE_CPC);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.SPEND);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AVERAGE_POSITION);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CONVERSIONS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CONVERSION_RATE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.COST_PER_CONVERSION);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.BID_MATCH_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.DEVICE_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.QUALITY_SCORE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.EXPECTED_CTR);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_RELEVANCE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.LANDING_PAGE_EXPERIENCE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.LANGUAGE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.HISTORICAL_QUALITY_SCORE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.HISTORICAL_EXPECTED_CTR);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.HISTORICAL_AD_RELEVANCE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.HISTORICAL_LANDING_PAGE_EXPERIENCE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.QUALITY_IMPACT);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CAMPAIGN_STATUS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ACCOUNT_STATUS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.AD_GROUP_STATUS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD_STATUS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.NETWORK);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.TOP_VS_OTHER);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.DEVICE_OS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.ASSISTS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.REVENUE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.RETURN_ON_AD_SPEND);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.COST_PER_ASSIST);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.REVENUE_PER_CONVERSION);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.REVENUE_PER_ASSIST);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.TRACKING_TEMPLATE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.CUSTOM_PARAMETERS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.FINAL_URL);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.FINAL_MOBILE_URL);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.FINAL_APP_URL);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.BID_STRATEGY_TYPE);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.KEYWORD_LABELS);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.MAINLINE_1_BID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.MAINLINE_BID);
        keywordPerformanceReportColumns.getKeywordPerformanceReportColumns().add(KeywordPerformanceReportColumn.FIRST_PAGE_BID);
        reportRequest.setColumns(keywordPerformanceReportColumns);
        
        return reportRequest;
    }
}
