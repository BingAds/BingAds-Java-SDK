package com.microsoft.bingads.examples.v9;

import java.net.URL;
import java.rmi.RemoteException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import com.microsoft.bingads.*;
import com.microsoft.bingads.customermanagement.*;

public class OAuthDesktopApplication extends Application {

    private boolean alreadyHaveRedirect = false;
    
    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static java.lang.String ClientId = "<ClientIdGoesHere>";

    @Override
    public void start(Stage primaryStage) {

    	// Create an instance of OAuthDesktopMobileAuthCodeGrant that will be used to manage Microsoft Account user authorization. 
    	// Replace ClientId with the value configured when you registered your application. 
		
        final OAuthDesktopMobileAuthCodeGrant oAuthDesktopMobileAuthCodeGrant = new OAuthDesktopMobileAuthCodeGrant(ClientId);
    	
        oAuthDesktopMobileAuthCodeGrant.setNewTokensListener(new NewOAuthTokensReceivedListener() {
            @Override
            public void onNewOAuthTokensReceived(OAuthTokens newTokens) {
                   java.lang.String newAccessToken = newTokens.getAccessToken();
                   java.lang.String newRefreshToken = newTokens.getRefreshToken();
                   java.lang.String refreshTime = new java.text.SimpleDateFormat(
                		   "MM/dd/yyyy HH:mm:ss").format(new java.util.Date());
                   
                   System.out.printf("Token refresh time: %s\n", refreshTime);
                   System.out.printf("New access token: %s\n", newAccessToken);
                   System.out.printf("You should securely store this new refresh token: %s\n", newRefreshToken);
                   
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

                        if (url.getPath().equals("/oauth20_desktop.srf")) {
                            //issue: WebView raises two events for each url. Need to figure out how to filter only one of them.
                            if (alreadyHaveRedirect) {
                                return;
                            }

                            alreadyHaveRedirect = true;

                            // To get the initial access and refresh tokens you must call requestAccessAndRefreshTokens with the authorization redirection URL. 
							
                            OAuthTokens tokens = oAuthDesktopMobileAuthCodeGrant.requestAccessAndRefreshTokens(url);
							
                            System.out.println("Access token: " + tokens.getAccessToken());
                            System.out.println("Refresh token: " + tokens.getRefreshToken());
										
                            authorizationData = new AuthorizationData();
                            authorizationData.setDeveloperToken(DeveloperToken);
                            authorizationData.setAuthentication(oAuthDesktopMobileAuthCodeGrant);
										
                            CustomerService = new ServiceClient<ICustomerManagementService>(
                                    authorizationData, 
                                    ICustomerManagementService.class);
							
                            User user = getUser(null);
							
                            // Search for the accounts that the user can access.
							
                            ArrayOfAccount accounts = searchAccountsByUserId(user.getId());

                            System.out.println("The user can access the following Bing Ads accounts: \n");
                            printAccounts(accounts);
                        
                        }
                   
                    // Customer Management service operations can throw AdApiFaultDetail.
                    } catch (AdApiFaultDetail_Exception ex) {
                        System.out.println("The operation failed with the following faults:\n");

                        for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
                        {
            	            System.out.printf("AdApiError\n");
            	            System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
                        }
                    
                    // Customer Management service operations can throw ApiFault.
                    } catch (ApiFault_Exception ex) {
                        System.out.println("The operation failed with the following faults:\n");

                        for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
                        {
            	            System.out.printf("OperationError\n");
            	            System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
                        }
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
        // For example the callback URI includes an access token as follows if the user granted permissions for your application to manage 
        // their Bing Ads accounts: https://login.live.com/oauth20_desktop.srf?code=Access-Code-Provided-Here&lc=1033. 
		
        Scene scene = new Scene(webView, 800, 600);
		
        primaryStage.setTitle("Bing Ads Web Application Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // Gets a User object by the specified Bing Ads user identifier.

    static User getUser(java.lang.Long userId) throws RemoteException, Exception
    {
        GetUserRequest request = new GetUserRequest();
        
        request.setUserId(userId);

        return CustomerService.getService().getUser(request).getUser();
    }

    // Searches by UserId for accounts that the user can manage.
    
    static ArrayOfAccount searchAccountsByUserId(java.lang.Long userId) throws AdApiFaultDetail_Exception, ApiFault_Exception{       
		
        ArrayOfPredicate predicates = new ArrayOfPredicate();
        Predicate predicate = new Predicate();
        predicate.setField("UserId");
        predicate.setOperator(PredicateOperator.EQUALS);
        predicate.setValue("" + userId);
        predicates.getPredicates().add(predicate);
        
        Paging paging = new Paging();
        paging.setIndex(0);
        paging.setSize(10);
		
        final SearchAccountsRequest searchAccountsRequest = new SearchAccountsRequest();
        searchAccountsRequest.setPredicates(predicates);
        searchAccountsRequest.setPageInfo(paging);
        
        return CustomerService.getService().searchAccounts(searchAccountsRequest).getAccounts();
    }

    // Outputs the account and parent customer identifiers for the specified accounts.

    static void printAccounts(ArrayOfAccount accounts) throws RemoteException, Exception
    {
        for (Account account : accounts.getAccounts())
        {
        	System.out.printf("AccountId: %d\n", account.getId());
        	System.out.printf("CustomerId: %d\n\n", account.getParentCustomerId());
        }
    }

    // Launch the application
    
    public static void main(String[] args) {
        launch(args);
    }
}
