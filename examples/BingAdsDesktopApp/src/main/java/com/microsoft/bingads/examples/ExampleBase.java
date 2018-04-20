package com.microsoft.bingads.examples;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.examples.v12.BingAdsExceptionHelper;
import java.net.URL;

public class ExampleBase {

    protected static java.lang.String DeveloperToken = "BBD37VB98";
    protected static java.lang.String ClientId = "ClientIdGoesHere";
    protected static java.lang.String ClientState = "ClientStateGoesHere";
    protected static java.lang.String RefreshTokenPath = "refresh.txt";
    
    protected static ApiEnvironment API_ENVIRONMENT = ApiEnvironment.SANDBOX;
    
    protected static AuthorizationData authorizationData;
    
    public ExampleBase() {}

    // Prints the string to System.out
    protected static void outputStatusMessage(java.lang.String message){
        System.out.println(message);
    }
    
    // Sets the global authorization data instance with OAuthDesktopMobileAuthCodeGrant.
    protected static void authenticateWithOAuth() 
    {
        // Uncomment to view and troubleshoot the SOAP trace
        //System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        
        OAuthDesktopMobileAuthCodeGrant oAuthDesktopMobileAuthCodeGrant = new OAuthDesktopMobileAuthCodeGrant(ClientId, API_ENVIRONMENT);

        authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(oAuthDesktopMobileAuthCodeGrant);
        authorizationData.setDeveloperToken(DeveloperToken);
        
        try
        {
            java.lang.String refreshToken = readOAuthRefreshToken();
            if(refreshToken != null) 
            {
                ((OAuthDesktopMobileAuthCodeGrant)(authorizationData.getAuthentication())).requestAccessAndRefreshTokens(refreshToken);
                writeOAuthRefreshToken(((OAuthDesktopMobileAuthCodeGrant)(authorizationData.getAuthentication())).getOAuthTokens().getRefreshToken());
            }
            else
            {
                requestUserConsent();
            }
            
        }
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
    protected static void requestUserConsent() throws IOException
    {
        System.out.printf("You need to provide consent for the application to access your Bing Ads accounts. " +
              "Copy and paste this authorization endpoint into a web browser and sign in with a Microsoft account " +
              "with access to a Bing Ads account: \n\n%s" +
              "\n\nAfter you have granted consent in the web browser for the application to access your Bing Ads accounts, " +
              "please enter the response URI that includes the authorization 'code' parameter: \n\n", 
              ((OAuthDesktopMobileAuthCodeGrant)(authorizationData.getAuthentication())).getAuthorizationEndpoint());
        
        Scanner scanner = new Scanner(System.in);
        java.lang.String responseUri = scanner.nextLine();
        URL url = new URL(responseUri);
        
        OAuthTokens tokens = ((OAuthDesktopMobileAuthCodeGrant)(authorizationData.getAuthentication())).requestAccessAndRefreshTokens(url);
        writeOAuthRefreshToken(tokens.getRefreshToken());
    }
    
    protected static java.lang.String readOAuthRefreshToken() throws IOException
    {
        java.lang.String refreshToken = null;
                
        File file = new File(RefreshTokenPath);
        if(file.exists() && !file.isDirectory()) { 
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            refreshToken = bufferedReader.readLine();
        }
        
        return refreshToken;
    }
    
    protected static void writeOAuthRefreshToken(java.lang.String refreshToken) throws IOException
    {        
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(RefreshTokenPath), "utf-8"))) {
            writer.write(refreshToken);
        }
    }
}
