// Copyright 2015 Microsoft Corporation 

// Licensed under the Apache License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at 

//    http://www.apache.org/licenses/LICENSE-2.0 

// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions and 
// limitations under the License. 

package com.microsoft.bingads.examples;

import java.rmi.*;
import java.util.ArrayList;
import java.net.*;
import java.io.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.reporting.*;

public class KeywordPerformance {

    static AuthorizationData authorizationData;
    static ServiceClient<IReportingService> ReportingService; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    private static long[] CampaignIds = { <CommaDelimitedCampaignIdsGoHere> };
        
    // Specify the file to download the report to. The file is
    // compressed so use the .zip file extension.

    private static java.lang.String DownloadPath = "c:\\reports\\keywordperf.zip";

    public static void main(String[] args) {
        
    	// Confirm that the download folder exists; otherwise, exit.
    	
    	String folder = DownloadPath.substring(0, DownloadPath.lastIndexOf('\\'));
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
	         
            ReportingService = new ServiceClient<IReportingService>(
                    authorizationData, 
                    IReportingService.class);

            // Build a keyword performance report request, including Format, ReportName, Aggregation,
            // Scope, Time, Filter, and Columns.

            KeywordPerformanceReportRequest report = new KeywordPerformanceReportRequest();
            
            report.setFormat(ReportFormat.TSV);
            report.setReportName("My Keyword Performance Report");
            report.setReturnOnlyCompleteData(false);
            report.setAggregation(ReportAggregation.DAILY);

            report.setScope(new AccountThroughAdGroupReportScope());
            report.getScope().setAccountIds(null);
            report.getScope().setAdGroups(null);

            ArrayOfCampaignReportScope campaignReportScopes = new ArrayOfCampaignReportScope();
            for(long campaignId : CampaignIds){
            	CampaignReportScope campaignReportScope = new CampaignReportScope();
            	campaignReportScope.setCampaignId(campaignId);
            	campaignReportScope.setAccountId(AccountId);
            }
            report.getScope().setCampaigns(campaignReportScopes);
            

            report.setTime(new ReportTime());
            report.getTime().setPredefinedTime(ReportTimePeriod.YESTERDAY);
            
            // You may either use a custom date range or predefined time.
            //report.getTime().setCustomDateRangeStart(new Date());
            //report.getTime().getCustomDateRangeStart().setMonth(9);
            //report.getTime().getCustomDateRangeStart().setDay(1);
            //report.getTime().getCustomDateRangeStart().setYear(2013);
            //report.getTime().setCustomDateRangeEnd(new Date());
            //report.getTime().getCustomDateRangeEnd().setMonth(9);
            //report.getTime().getCustomDateRangeEnd().setDay(30);
            //report.getTime().getCustomDateRangeEnd().setYear(2013);
            
            report.setFilter(new KeywordPerformanceReportFilter());
            ArrayList<DeviceTypeReportFilter> deviceTypes = new ArrayList<DeviceTypeReportFilter>();
            deviceTypes.add(DeviceTypeReportFilter.COMPUTER);
            deviceTypes.add(DeviceTypeReportFilter.SMART_PHONE);
            report.getFilter().setDeviceType(deviceTypes);

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
            
            // SubmitGenerateReport helper method calls the corresponding Bing Ads ReportingService.getService() operation 
            // to request the report identifier. The identifier is used to check report generation status
            // before downloading the report. 

            java.lang.String reportRequestId  = submitGenerateReport(report);
            
            System.out.println("Report Request ID: " + reportRequestId + "\n");
            
            int waitTime = 1000 * 30 * 1;  
            ReportRequestStatus reportRequestStatus = null;

            // This sample polls every 30 seconds up to 5 minutes.
            // In production you may poll the status every 1 to 2 minutes for up to one hour.
            // If the call succeeds, stop polling. If the call or 
            // download fails, the call throws a fault.

            for (int i = 0; i < 10; i++)
            {
                try {Thread.sleep(waitTime);}
                catch (InterruptedException ignore) {}

                reportRequestStatus = pollGenerateReport(reportRequestId);

                System.out.printf("Report Request Status: %s\n", reportRequestStatus);

                if (reportRequestStatus.getStatus() == ReportRequestStatusType.SUCCESS ||
                	reportRequestStatus.getStatus() == ReportRequestStatusType.ERROR)
                {
                    break;
                }
            }

            if (reportRequestStatus != null)
            {
                if (reportRequestStatus.getStatus() == ReportRequestStatusType.SUCCESS)
                {
                    	java.lang.String reportDownloadUrl = reportRequestStatus.getReportDownloadUrl();
                    System.out.printf("Downloading from %s.\n", reportDownloadUrl);
                    downloadReport(reportDownloadUrl, DownloadPath);
                    System.out.printf("The report was written to %s.\n", DownloadPath);
                }
                else if (reportRequestStatus.getStatus() == ReportRequestStatusType.ERROR)
                {
                    System.out.println("The request failed. Try requesting the report " +
                        "later.\nIf the request continues to fail, contact support.");
                }
                else  // Pending
                {
                    System.out.println("The request is taking longer than expected.");
                    System.out.printf("Save the report ID (%s) and try again later.", reportRequestId);
                }
            }
        
        // Reporting service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                System.out.printf("AdApiError\n");
                System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
            }
        
        // Reporting service operations can throw ApiFaultDetail.
        } catch (ApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                System.out.printf("BatchError at Index: %d\n", error.getIndex());
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }

            for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                System.out.printf("OperationError\n");
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }
        } catch (RemoteException ex) {
            System.out.println("Service communication error encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("IO exception encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            // Ignore fault exceptions that we already caught.

            if ( ex.getCause() instanceof AdApiFaultDetail_Exception ||
                 ex.getCause() instanceof ApiFaultDetail_Exception )
            {
                ;
            }
            else
            {
                System.out.println("Error encountered: ");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }


    // Request the report and returns the ReportRequestId that can be used to check report
    // status and then used to download the report.

    public static java.lang.String submitGenerateReport(ReportRequest report) throws RemoteException, Exception
    {
        SubmitGenerateReportRequest request = new SubmitGenerateReportRequest();
        
        request.setReportRequest(report);
        
        return ReportingService.getService().submitGenerateReport(request).getReportRequestId();
    }

    // Checks the status of a report request. Returns a data object that contains both
    // report status and download URL. 

    public static ReportRequestStatus pollGenerateReport(java.lang.String reportRequestId) throws RemoteException, Exception
    {
        PollGenerateReportRequest request = new PollGenerateReportRequest();
          
        request.setReportRequestId(reportRequestId);
        
        return ReportingService.getService().pollGenerateReport(request).getReportRequestStatus();
    }

    // Using the URL that the PollGenerateReport operation returned,
    // send an HTTP request to get the report and write it to the specified
    // ZIP file.

    public static java.lang.String downloadReport(java.lang.String reportDownloadUrl, java.lang.String downloadPath) throws IOException
    {
        URL url = new URL(reportDownloadUrl);
        URLConnection request = null;
        int count = 0;
        BufferedInputStream reader = null;
        BufferedOutputStream writer = null;

        try
        {
            request = url.openConnection();

            reader = new BufferedInputStream(request.getInputStream());
            writer = new BufferedOutputStream(new FileOutputStream(downloadPath));

            final int bufferSize = 100 * 1024;
            byte[] buffer = new byte[bufferSize];

            while (-1 != (count = reader.read(buffer, 0, bufferSize)))
            {
                writer.write(buffer, 0, count);
            }
        }
        finally
        {
            reader.close();
            writer.flush();
            writer.close();
        }

        return downloadPath;
    }
}