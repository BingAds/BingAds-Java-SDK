package com.microsoft.bingads.examples.v12;

import java.net.*;
import java.io.*;
import java.util.Calendar;
import java.util.TimeZone;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;
import java.util.ArrayList;

/**
 * This example demonstrates how to download the comma separated value (CSV) file that contains profile data 
 * that can be used with Bing Ads profile criteria.
 */
    
public class DownloadProfileData extends ExampleBase {
    
    // The full path to the profile data.

    private static final java.lang.String LOCAL_FILE= "c:\\profiledata\\profiledata.csv";

    // The language and locale of the profile data available for download.
    // This example uses 'en' (English). 

    private static final java.lang.String LANGUAGE_LOCALE = "en";
    
    public static void main(java.lang.String[] args) {
   	
        try
        {
            authorizationData = getAuthorizationData(null,null); 

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);
            
            // Supported profile types are CompanyName, Industry, and JobFunction
            ArrayList<ProfileType> profileTypes = new ArrayList<ProfileType>();
            profileTypes.add(ProfileType.COMPANY_NAME);
            
            GetProfileDataFileUrlResponse getProfileDataFileUrlResponse = CampaignManagementExampleHelper.getProfileDataFileUrl(
                    LANGUAGE_LOCALE,
                    profileTypes);

            // Going forward you should track the date and time of the previous download,  
            // and compare it with the last modified time provided by the service.
            Calendar previousSyncTimeUtc = Calendar.getInstance();
            previousSyncTimeUtc.setTimeZone(TimeZone.getTimeZone("GMT"));
            previousSyncTimeUtc.set(2018, 4, 26, 0, 0, 0);

            java.lang.String fileUrl = getProfileDataFileUrlResponse.getFileUrl();
            Calendar fileUrlExpiryTimeUtc = getProfileDataFileUrlResponse.getFileUrlExpiryTimeUtc();
            Calendar lastModifiedTimeUtc = getProfileDataFileUrlResponse.getLastModifiedTimeUtc();

            outputStatusMessage(String.format("FileUrl: %s\n", fileUrl));
            outputStatusMessage(String.format("FileUrlExpiryTimeUtc: %s\n", fileUrlExpiryTimeUtc.getTime().toString()));
            outputStatusMessage(String.format("LastModifiedTimeUtc: %s\n", lastModifiedTimeUtc.getTime().toString()));

            // Download the file if it was modified since the previous download.
            if (lastModifiedTimeUtc.compareTo(previousSyncTimeUtc) < 0)
            {
                downloadFile(fileUrl, LOCAL_FILE);
            }
            
            outputStatusMessage("Program execution completed\n"); 
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }    
    
    // Downloads a file from the remote file URL to a local file URL.
    
    static void downloadFile(java.lang.String fileUrl, java.lang.String localFile) 
    {
        HttpURLConnection connection = null;
        BufferedInputStream reader = null;
        BufferedOutputStream writer = null;
        
        try {
            URL url = new URL(fileUrl);
            connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) 
            {
                outputStatusMessage(String.format("Downloaded the profile data to %s.\n", localFile));
                reader = new BufferedInputStream(connection.getInputStream());
                writer = new BufferedOutputStream(new FileOutputStream(localFile));

                final int bufferSize = 100 * 1024;
                byte[] buffer = new byte[bufferSize];
                int count = 0;            

                while ((count = reader.read(buffer)) != -1)
                {
                    writer.write(buffer, 0, count);
                }
            } 
            else
            {
                outputStatusMessage(String.format("HTTP Response Code: %s\n", connection.getResponseCode()));  
                outputStatusMessage(String.format("HTTP Response Message: %s\n", connection.getResponseMessage()));  
            } 
        } 
        catch (IOException ex) {
            outputStatusMessage(String.format("IO Exception encountered: %s", ex.getMessage()));
        } 
        catch (Exception ex) {
            outputStatusMessage(String.format("Error encountered: %s", ex.getMessage()));
        } 
        finally {
            try {
                if (reader != null) reader.close();
                if (writer != null)
                {
                    writer.flush();
                    writer.close();
                }
            } 
            catch (IOException ex) {
            	outputStatusMessage(String.format("IO Exception encountered: %s", ex.getMessage()));
            }
        }  
    }
}
