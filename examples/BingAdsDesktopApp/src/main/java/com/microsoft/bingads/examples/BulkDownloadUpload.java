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
import java.net.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.zip.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.bulk.*;

public class BulkDownloadUpload {

    static AuthorizationData authorizationData;
    static ServiceClient<IBulkService> BulkService; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    

    // The full path to the bulk file.

    private static java.lang.String BulkFilePath = "c:\\bulk\\campaigns.zip";

    // The full path to the extracted bulk file.

    private static java.lang.String ExtractedFilePath = "C:\\bulk\\extracted\\accounts.tsv";
    
    // The full path to the upload result file.

    private static java.lang.String UploadResultFilePath = "C:\\bulk\\uploadresults.zip";

    // Specifies the bulk file format. 

    private static DownloadFileType FileFormat = DownloadFileType.TSV;

    
    /**
     * Bulk example that shows how to download and upload campaign data for
     * one or more campaigns.
     */
    public static void main(String[] args) {
        
    	String folder = BulkFilePath.substring(0, BulkFilePath.lastIndexOf('\\'));
        File dir = new File(folder);

        // Confirm that the download folder exist; otherwise, exit.

        if (!dir.exists())
        {
            System.out.println("The download folder does not exist. Ensure that the " +
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
	         
            BulkService = new ServiceClient<IBulkService>(
                    	authorizationData, 
                        IBulkService.class);
            
            // Use the bulk service to download a bulk file.
            
            Calendar lastSyncTimeInUtc = getLastSyncTime(ExtractedFilePath);
            
            ArrayList<DataScope> dataScope = new ArrayList<DataScope>();
            dataScope.add(DataScope.ENTITY_DATA);
            	
            ArrayList<BulkDownloadEntity> entities = new ArrayList<BulkDownloadEntity>();
            entities.add(BulkDownloadEntity.ADS);
            entities.add(BulkDownloadEntity.AD_GROUPS);
            entities.add(BulkDownloadEntity.CAMPAIGNS);
            entities.add(BulkDownloadEntity.KEYWORDS);
            
            java.lang.String formatVersion = "3.0";

            // You may include a non-null date range if the lastSyncTime is null, and the data scope includes   
            // either EntityPerformanceData, BidSuggestionsData, or QualityScoreData.  
            
            /*
            com.microsoft.bingads.bulk.Date customDateRangeStart = new com.microsoft.bingads.bulk.Date();
            customDateRangeStart.setDay(1);
            customDateRangeStart.setMonth(9);
            customDateRangeStart.setYear(2013);
            
            com.microsoft.bingads.bulk.Date customDateRangeEnd = new com.microsoft.bingads.bulk.Date();
            customDateRangeEnd.setDay(30);
            customDateRangeEnd.setMonth(9);
            customDateRangeEnd.setYear(2013);

            PerformanceStatsDateRange performanceStatsDateRange = new PerformanceStatsDateRange();
            performanceStatsDateRange.setCustomDateRangeStart(customDateRangeStart);
            performanceStatsDateRange.setCustomDateRangeEnd(customDateRangeEnd);
            */
            
            // GetDownloadRequestId helper method calls the corresponding Bing Ads service operation 
            // to request the download identifier.
            
            java.lang.String downloadRequestId = getDownloadRequestId(
                authorizationData.getAccountId(), 
                dataScope,
                entities,
                formatVersion,
                lastSyncTimeInUtc, 
                null //performanceStatsDateRange
                );


            System.out.printf("Download Request ID: %s\n\n", downloadRequestId);

            int waitTime = 1000 * 5 * 1; 
            boolean downloadSuccess = false;

            // This sample polls every 30 seconds up to 5 minutes.
            // In production you may poll the status every 1 to 2 minutes for up to one hour.
            // If the call succeeds, stop polling. If the call or 
            // download fails, the call throws a fault.

            for (int i = 0; i < 10; i++)
            {
                try {Thread.sleep(waitTime);}
                catch (InterruptedException ignore) {}

                // GetDownloadRequestStatus helper method calls the corresponding Bing Ads service operation 
                // to get the download status.
                java.lang.String downloadRequestStatus = getDownloadRequestStatus(downloadRequestId);

                System.out.printf("Download Request Status: %s\n", downloadRequestStatus);
                
                if ((downloadRequestStatus != null) && (downloadRequestStatus.equals("Completed")))
                {
                    downloadSuccess = true;
                    break;
                }
            }

            if (downloadSuccess)
            {
            	// GetDownloadUrl helper method calls the corresponding Bing Ads service operation 
                // to get the download Url.
                java.lang.String downloadUrl = getDownloadUrl(downloadRequestId);
                System.out.printf("Downloading from %s.\n\n", downloadUrl);
                downloadFile(downloadUrl, BulkFilePath);
                System.out.printf("The download file was written to %s.\n\n", BulkFilePath);
            }
            else  // InProgress
            {
                System.out.println("The request is taking longer than expected.");
                System.out.printf("Save the report ID (%s) and try again later.\n", downloadRequestId);
            }
            
            
            
            // You may unzip and update the downloaded bulk file or prepare a new file elsewhere.
            // Changes to the bulk file are not shown here.

            decompressFile(BulkFilePath, ExtractedFilePath);
            compressFile(ExtractedFilePath, BulkFilePath);


            // Use the bulk service to upload a bulk file.

            ResponseMode responseMode = ResponseMode.ERRORS_AND_RESULTS;

            GetBulkUploadUrlResponse uploadResponse = getBulkUploadUrl(responseMode);

            java.lang.String uploadRequestId = uploadResponse.getRequestId();
            java.lang.String uploadUrl = uploadResponse.getUploadUrl();

            System.out.printf("Uploading file from %s.\n\n", BulkFilePath);
            System.out.printf("Upload Request Id: %s\n\n", uploadRequestId);
            System.out.printf("Upload Url: %s\n\n", uploadUrl);

            uploadFile(uploadUrl, BulkFilePath);
            
            boolean uploadSuccess = false;

            // This sample polls every 30 seconds up to 5 minutes.
            // In production you may poll the status every 1 to 2 minutes for up to one hour.
            // If the call succeeds, stop polling. If the call or 
            // download fails, the call throws a fault.

            for (int i = 0; i < 10; i++)
            {
            	try {Thread.sleep(waitTime);}
                catch (InterruptedException ignore) {}

                // GetUploadRequestStatus helper method calls the corresponding Bing Ads service operation 
                // to get the upload status.
                java.lang.String uploadRequestStatus = getUploadRequestStatus(uploadRequestId);
                
                System.out.printf("Upload Request Status: %s\n", uploadRequestStatus);
                
                if ((uploadRequestStatus != null) && ((uploadRequestStatus.equals("Completed"))
                    || (uploadRequestStatus.equals("CompletedWithErrors"))))
                {
                    uploadSuccess = true;
                    break;
                }
            }
            
            if (uploadSuccess)
            {
                // GetUploadResultFileUrl helper method calls the corresponding Bing Ads service operation 
                // to get the upload result file Url.
                java.lang.String uploadResultFileUrl = getUploadResultFileUrl(uploadRequestId);
                downloadFile(uploadResultFileUrl, UploadResultFilePath);
                System.out.printf("The upload result file was written to %s\n\n.", UploadResultFilePath);
            }
            else // PendingFileUpload
            {
            	System.out.printf("The request is taking longer than expected.\n" +
                                    "Save the upload ID (%s) and try again later.\n\n", uploadRequestId);
            }           
        
        // Bulk service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                System.out.printf("AdApiError\n");
                System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
            }
        
        // Bulk service operations can throw ApiFaultDetail.
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

    // GetDownloadRequestId helper method calls the DownloadCampaignsByCampaignIds service operation 
    // to request the download identifier.

    private static java.lang.String getDownloadRequestId(
    		long accountId, 
    		ArrayList<DataScope> dataScope, 
    		ArrayList<BulkDownloadEntity> entities, 
    		java.lang.String formatVersion, 
    		Calendar lastSyncTime, 
    		PerformanceStatsDateRange dateRange) throws RemoteException, Exception
    {
        DownloadCampaignsByAccountIdsRequest request = new DownloadCampaignsByAccountIdsRequest();
        
        ArrayOflong accountIds = new ArrayOflong();
        accountIds.getLongs().add(accountId);
        request.setAccountIds(accountIds);
        request.setDataScope(dataScope);
        request.setDownloadFileType(FileFormat);
        request.setEntities(entities);
        request.setFormatVersion(formatVersion);
        request.setLastSyncTimeInUTC(lastSyncTime);
        request.setPerformanceStatsDateRange(dateRange);

        return BulkService.getService().downloadCampaignsByAccountIds(request).getDownloadRequestId();
    }

    // GetDownloadRequestStatus helper method calls the GetDetailedBulkDownloadStatus service operation 
    // to get the download request status.

    private static java.lang.String getDownloadRequestStatus(java.lang.String requestId)  throws RemoteException, Exception
    {
        GetDetailedBulkDownloadStatusRequest request = new GetDetailedBulkDownloadStatusRequest();
        
        request.setRequestId(requestId);
                    
        return BulkService.getService().getDetailedBulkDownloadStatus(request).getRequestStatus();
    }
    
    // GetDownloadUrl helper method calls the GetDetailedBulkDownloadStatus service operation 
    // to get the download Url.

    private static java.lang.String getDownloadUrl(java.lang.String requestId)  throws RemoteException, Exception
    {
        GetDetailedBulkDownloadStatusRequest request = new GetDetailedBulkDownloadStatusRequest();
        
        request.setRequestId(requestId);
                    
        return BulkService.getService().getDetailedBulkDownloadStatus(request).getResultFileUrl();
    }
    
    // GetBulkUploadUrl helper method calls the GetBulkUploadUrl service operation 
    // to request the upload identifier and upload Url via GetBulkUploadUrlResponse.

    private static GetBulkUploadUrlResponse getBulkUploadUrl(ResponseMode responseMode)  throws RemoteException, Exception
    {
    	GetBulkUploadUrlRequest request = new GetBulkUploadUrlRequest();
        
        request.setResponseMode(responseMode);
        request.setAccountId(AccountId);
                    
        return BulkService.getService().getBulkUploadUrl(request);
    }
    
    // GetUploadRequestStatus helper method calls the GetDetailedBulkUploadStatus service operation 
    // to get the upload request status.

    private static java.lang.String getUploadRequestStatus(java.lang.String requestId)  throws RemoteException, Exception
    {
    	GetDetailedBulkUploadStatusRequest request = new GetDetailedBulkUploadStatusRequest();
        
        request.setRequestId(requestId);
                    
        return BulkService.getService().getDetailedBulkUploadStatus(request).getRequestStatus();
    }
    
    // GetUploadResultFileUrl helper method calls the GetDetailedBulkUploadStatus service operation 
    // to get the upload result file Url.

    private static java.lang.String getUploadResultFileUrl(java.lang.String requestId)  throws RemoteException, Exception
    {
    	GetDetailedBulkUploadStatusRequest request = new GetDetailedBulkUploadStatusRequest();
        
        request.setRequestId(requestId);
                    
        return BulkService.getService().getDetailedBulkUploadStatus(request).getResultFileUrl();
    }
    
    // Using the URL returned by the GetBulkUploadUrl operation, 
    // POST the bulk file using a HTTP client. 
    
    private static void uploadFile(java.lang.String uploadUrl, java.lang.String filePath) throws IOException
    {
        final java.lang.String CRLF = "\r\n";
        URL url = new URL(uploadUrl);
        HttpURLConnection connection = null;
        
        FileInputStream reader = null;
        OutputStream out = null;
        PrintWriter writer = null;
        
        try
        {   
            // Set up the connection and headers
        	
            connection = (HttpURLConnection) url.openConnection();
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            connection.setDoInput(true);
        	
            connection.setRequestProperty("UserName", UserName);
            connection.setRequestProperty("Password", Password);
            connection.setRequestProperty("DeveloperToken", DeveloperToken);
            connection.setRequestProperty("CustomerId", Long.toString(CustomerId));
            connection.setRequestProperty("CustomerAccountId", Long.toString(AccountId));
        	
            // Content-Type must be multipart/form-data with custom boundary
        	
            java.lang.String boundary = "--------------------" + Long.toString(System.currentTimeMillis(), 16);
            java.lang.String contentType = "multipart/form-data; boundary=" + boundary;
            connection.setRequestProperty("Content-Type", contentType);
        	
            final int bufferSize = 100 * 1024;
            byte[] buffer = new byte[bufferSize];
            
            File file = new File(filePath);
            reader = new FileInputStream(file);
            out = connection.getOutputStream();
            writer = new PrintWriter(new OutputStreamWriter(out, "UTF-8"), true);
            
            // Add the file within the specified boundary
            
            writer.append("--" + boundary).append(CRLF);
            writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"").append(CRLF);
            writer.append("Content-Type: application/zip").append(CRLF);
            writer.append("Content-Transfer-Encoding: binary").append(CRLF);
            writer.append(CRLF);
            writer.flush();
            
            int count = 0;
            while ((count = reader.read(buffer)) != -1)
            {
            	out.write(buffer, 0, count);
            }
            
            out.flush();
            
            writer.append(CRLF).flush();
            writer.append("--" + boundary + "--").append(CRLF);
            writer.flush();
            
            System.out.printf("Upload Connection Response: %s\n", connection.getResponseMessage());
        }
        finally
        {
            reader.close();
            writer.flush();
            writer.close();
            out.flush();
            out.close();
        }
    }


    // Using the URL that the GetDetailedBulkDownloadStatus operation returned,
    // send an HTTP request to get the download data and write it
    // to the specified ZIP file.

    private static java.lang.String downloadFile(String downloadUrl, String filePath) throws IOException
    {
        URL url = new URL(downloadUrl);
        URLConnection request = null;
        int count = 0;
        BufferedInputStream reader = null;
        BufferedOutputStream writer = null;

        try
        {
            request = url.openConnection();

            reader = new BufferedInputStream(request.getInputStream());
            writer = new BufferedOutputStream(new FileOutputStream(filePath));

            final int bufferSize = 100 * 1024;
            byte[] buffer = new byte[bufferSize];

            while ((count = reader.read(buffer)) != -1)
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

        return filePath;
    }
    
    // Decompresses a ZIP Archive and writes the contents to the specified file path.

    private static void decompressFile(String fromZipArchive, String toExtractedFile) throws IOException
    {
    	ZipInputStream archive = new ZipInputStream(new FileInputStream(fromZipArchive));
    	FileOutputStream file = new FileOutputStream(toExtractedFile);
        
    	final int bufferSize = 100 * 1024;
        byte[] buffer = new byte[bufferSize];
        
        // Get the first entry in the ZIP input stream
        archive.getNextEntry();
        
    	// Move bytes from the ZIP archive
        int count = 0;
        while ((count = archive.read(buffer)) != -1) {
        	file.write(buffer, 0, count);
        }

        file.close();
        archive.closeEntry();
        archive.close();
    }

    // Compresses a bulk file to a ZIP Archive.

    private static void compressFile(String fromExtractedFile, String toZipArchive) throws IOException
    {
    	FileInputStream file = new FileInputStream(fromExtractedFile);
    	ZipOutputStream archive = new ZipOutputStream(new FileOutputStream(toZipArchive));
    	       
        final int bufferSize = 100 * 1024;
        byte[] buffer = new byte[bufferSize];
           
        // Begin entry in the ZIP output stream
        archive.putNextEntry(new ZipEntry((new File(fromExtractedFile)).getName()));

        // Move bytes to the ZIP archive
        int count = 0;
        while ((count = file.read(buffer)) != -1) {
        	archive.write(buffer, 0, count);
        }

        archive.closeEntry();
        archive.flush();
        archive.close();
        file.close();
    }


    // Get the time stamp of the last download from the previous
    // download file. The SyncTime node contains the time stamp.

    private static Calendar getLastSyncTime(String path) throws Exception
    {
        Calendar lastSyncTime = null;
        File downloadFile = new File(path);
        java.lang.String columnDelimiter = null;
        
        if(FileFormat.value().toString() == "Tsv"){
        	columnDelimiter = "\t";
        } else if(FileFormat.value().toString() == "Csv"){
        	columnDelimiter = ",";
        }

        if (downloadFile.exists())
        {
            BufferedReader reader = null;
            
            try
            {
                reader = new BufferedReader(new FileReader(path));

                int syncTimeColumn = 0;
                java.lang.String[] fields = null;

                // The first record contains column header information, for example "Type" and "Sync Time".
                java.lang.String record = reader.readLine();
                   
                if (record != null)
                {
                    fields = record.split(columnDelimiter);
                    int column = 0;

                    // Find the Sync Time column.
                    do
                    {
                        syncTimeColumn = (fields[column].equals("Sync Time")) ? column : syncTimeColumn;
                    } while (syncTimeColumn == 0 && (++column < fields.length));
                }

                // Look for the Account record after any other metadata.

                boolean isAccount = false;

                do
                {
                    record = reader.readLine();
                    fields = record.split(columnDelimiter);
                    if(fields[0].equals("Account"))
                    {
                        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY kk:mm:ss");
                        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                        lastSyncTime = sdf.getCalendar();
                        lastSyncTime.setTime(sdf.parse(fields[syncTimeColumn]));
                        isAccount = true;
                    }
                } while (!isAccount);
            }
            finally
            {
                reader.close();
            }
        }

        return lastSyncTime;
    }
}