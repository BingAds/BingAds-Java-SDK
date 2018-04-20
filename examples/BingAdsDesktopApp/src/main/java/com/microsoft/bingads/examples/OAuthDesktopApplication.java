package com.microsoft.bingads.examples;

import com.microsoft.bingads.ApiEnvironment;
import java.net.URL;
import java.rmi.RemoteException;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.NewOAuthTokensReceivedListener;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.internal.MessageHandler;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class OAuthDesktopApplication extends Application {

    private boolean alreadyHaveRedirect = false;
    
    static AuthorizationData authorizationData;
    
    private static java.lang.String ClientId = "ClientIdGoesHere";
    private static java.lang.String ClientState = "ClientStateGoesHere";

    @Override
    public void start(Stage primaryStage) {
        MessageHandler.getInstance().setTraceOn(true);

    	// Create an instance of OAuthDesktopMobileAuthCodeGrant that will be used to manage Microsoft Account user authorization. 
    	// Replace ClientId with the value configured when you registered your application. 
		
        final OAuthDesktopMobileAuthCodeGrant oAuthDesktopMobileAuthCodeGrant = new OAuthDesktopMobileAuthCodeGrant(ClientId, ApiEnvironment.SANDBOX);
                
        // It is recommended that you specify a non guessable 'state' request parameter to help prevent
        // cross site request forgery (CSRF). 
        oAuthDesktopMobileAuthCodeGrant.setState(ClientState);
        
        oAuthDesktopMobileAuthCodeGrant.setNewTokensListener(new NewOAuthTokensReceivedListener() {
            @Override
            public void onNewOAuthTokensReceived(OAuthTokens newTokens) {
                   java.lang.String refreshTime = new java.text.SimpleDateFormat(
                       "MM/dd/yyyy HH:mm:ss").format(new java.util.Date());
                   
                   System.out.printf("New access token retreival time: %s\n", refreshTime);
                   System.out.printf("New access token: %s\n", newTokens.getAccessToken());
                   System.out.printf("New access token expires in %s seconds\n", newTokens.getAccessTokenExpiresInSeconds());
                   System.out.printf("You should securely store this new refresh token: %s\n", newTokens.getRefreshToken());      
            }
        });
        
        // WebView is a Node that manages a WebEngine and displays its content. 
        // For more information, see javafx.scene.web at https://docs.oracle.com/javafx/2/api/javafx/scene/web/WebView.html
        
        WebView webView = new WebView();       

        webView.getEngine().setOnStatusChanged(new EventHandler<WebEvent<String>>() {
        	
            // You may need to override the handle method depending on your project and JRE settings
            //@Override 
            public void handle(WebEvent<String> event) {
                if (event.getSource() instanceof WebEngine) {
                    try {
                        WebEngine webEngine = (WebEngine) event.getSource();
                        String webEngineLocation = webEngine.getLocation();
                        URL url = new URL(webEngineLocation); 

                        System.out.println(url);

                        // In this example, we handle WebEvents until redirection is complete 
                        // and OAuthTokens are retreived.
                        if (url.getPath().equals("/oauth20_desktop.srf")) {
                            // Open issue: WebView raises two events for each url. 
                        	// TODO: Filter only one of them.
                            if (alreadyHaveRedirect) {
                            	System.out.println("Program execution completed\n");
                                return;
                            }

                            if (oAuthDesktopMobileAuthCodeGrant.getState() != ClientState)
                                throw new Exception("The OAuth response state does not match the client request state.");
                            
                            alreadyHaveRedirect = true;

                            // To get the initial access and refresh tokens you must call 
                            // requestAccessAndRefreshTokens with the authorization redirection URL. 
							
                            OAuthTokens tokens = oAuthDesktopMobileAuthCodeGrant.requestAccessAndRefreshTokens(url);                      
                        }
                        
                        System.out.println("Program execution completed\n"); 
                    
                    } catch (RemoteException ex) {
                        System.out.println("Service communication error encountered: ");
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    } catch (Exception ex) {
                        System.out.println("Error encountered: ");
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Request user consent by connecting to the Microsoft Account authorization endpoint through a web browser. 
		
        URL authorizationEndpoint = oAuthDesktopMobileAuthCodeGrant.getAuthorizationEndpoint();
		
        webView.getEngine().load(authorizationEndpoint.toString());
		
        // The user will be prompted through the Microsoft Account authorization web browser control to grant permissions for your application
        // to manage their Bing Ads accounts. The authorization service calls back to your application with the redirection URI, which 
        // includes an authorization code if the user authorized your application to manage their Bing Ads accounts. 
		
        Scene scene = new Scene(webView, 800, 600);
		
        primaryStage.setTitle("Bing Ads Web Application Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Launch the application
    
    public static void main(String[] args) {
        launch(args);
    }
}
