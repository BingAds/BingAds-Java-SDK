package com.microsoft.bingads.examples;

import java.net.*;
import java.io.*;

/**
 * This example demonstrates how to download the comma separated value (CSV) file that contains geographical location information 
 * that can be used with Bing Ads location targeting.
 */
    
public class GeographicalLocations{

    // The full path to the geographical locations file.

    private static java.lang.String LocalFile= "c:\\geolocations\\geolocations.csv";

    // The Url of the geographical locations file available for download.
    // This example uses 'en' (English). Supported locales are 'zh-Hant' (Traditional Chinese), 'en' (English), 'fr' (French), 
    // 'de' (German), 'it' (Italian), 'pt-BR' (Portuguese - Brazil), and 'es' (Spanish). 

    private static java.lang.String FileUrl = "https://api.bingads.microsoft.com/Api/SystemCodes/v1/en/GeoLocations.csv";
    
    // The ETag from a previous download, if known. The ETag is not required to run this example.

    private static java.lang.String ETag= "<ETagGoesHere>";

    
    public static void main(String[] args) 
    {
        HttpURLConnection connection = null;
        BufferedInputStream reader = null;
        BufferedOutputStream writer = null;

        try
        {
            URL url = new URL(FileUrl);
            connection = (HttpURLConnection) url.openConnection();
            
            // You can set a request condition on either the last modified time or ETag of the file at the Url.        

            connection.setRequestProperty("If-None-Match", "\"" + ETag + "\"");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) 
            {
                System.out.printf("Current ETag: %s\n", connection.getHeaderField("ETag"));
                System.out.printf("Downloaded the geographical locations to %s.\n", LocalFile);
                reader = new BufferedInputStream(connection.getInputStream());
                writer = new BufferedOutputStream(new FileOutputStream(LocalFile));

                final int bufferSize = 100 * 1024;
                byte[] buffer = new byte[bufferSize];
                int count = 0;            
            
                while ((count = reader.read(buffer)) != -1)
                {
                    writer.write(buffer, 0, count);
                }
            } 
            else if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_MODIFIED) 
            {
                System.out.printf("Current ETag: %s\n", connection.getHeaderField("ETag"));  
                System.out.println("The locations file has not been modified since last download.\n");
            }          
        } catch (IOException ex) {
            System.out.println("IO exception encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error encountered: ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try
            {
                if (reader != null) reader.close();
                if (writer != null)
                {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException ex) {
            	ex.printStackTrace();
            }
        }  
    }    
}