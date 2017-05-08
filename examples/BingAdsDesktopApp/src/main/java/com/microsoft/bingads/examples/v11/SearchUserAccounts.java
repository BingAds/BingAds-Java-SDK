package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Arrays;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.customermanagement.*;

public class SearchUserAccounts extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    */
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            	         
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            GetUserResponse getUserResponse = getUser(null);
            User user = getUserResponse.getUser();

            // Search for the accounts that the user can access.
            
            ArrayOfAccount accounts = searchAccountsByUserId(user.getId());
            
            outputStatusMessage("The user can access the following Bing Ads accounts: \n");
            for (Account account : accounts.getAccounts())
            {
            	outputAccount(account);
            	
            	// Optionally you can find out which pilot features the customer is able to use. 
                // Each account could belong to a different customer, so use the customer ID in each account.
                ArrayOfint featurePilotFlags = getCustomerPilotFeatures((long)account.getParentCustomerId());
                outputStatusMessage("Customer Pilot flags:");
                outputStatusMessage(Arrays.toString(featurePilotFlags.getInts().toArray()));
                
                // Optionally you can update each account with a tracking template.
                //ArrayOfKeyValuePairOfstringstring accountFCM = new ArrayOfKeyValuePairOfstringstring();
                //KeyValuePairOfstringstring trackingUrlTemplate = new KeyValuePairOfstringstring();
                //trackingUrlTemplate.setKey("TrackingUrlTemplate");
                //trackingUrlTemplate.setValue("http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");
                //accountFCM.getKeyValuePairOfstringstrings().add(trackingUrlTemplate);
            
                //account.setForwardCompatibilityMap(accountFCM);
                //updateAccount(account);
                //outputStatusMessage(String.format("Updated the account with a TrackingUrlTemplate: %s\n", 
                //            trackingUrlTemplate.getValue()));
            }
            
            outputStatusMessage("Program execution completed\n"); 
        
        // Customer Management service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
	            outputStatusMessage("AdApiError\n");
	            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Customer Management service operations can throw ApiFault.
        } catch (ApiFault_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
	            outputStatusMessage("OperationError\n");
	            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
        } catch (RemoteException ex) {
            outputStatusMessage("Service communication error encountered: ");
            outputStatusMessage(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
             outputStatusMessage("Error encountered: ");
             outputStatusMessage(ex.getMessage());
             ex.printStackTrace();
        }
    }

    
    // Gets a User object by the specified Bing Ads user identifier.

    static GetUserResponse getUser(java.lang.Long userId) throws RemoteException, Exception {
        
    	GetUserRequest request = new GetUserRequest();
        
        request.setUserId(userId);

        return CustomerService.getService().getUser(request);
    }

    // Searches by UserId for accounts that the user can manage.
    
    static ArrayOfAccount searchAccountsByUserId(java.lang.Long userId) throws AdApiFaultDetail_Exception, ApiFault_Exception {       
		
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
    
    // Gets the list of pilot features that the customer is able to use.
    
    static ArrayOfint getCustomerPilotFeatures(java.lang.Long customerId) throws AdApiFaultDetail_Exception, ApiFault_Exception {       
		
        final GetCustomerPilotFeaturesRequest getCustomerPilotFeaturesRequest = new GetCustomerPilotFeaturesRequest();
        getCustomerPilotFeaturesRequest.setCustomerId(customerId);
        
		return CustomerService.getService().getCustomerPilotFeatures(getCustomerPilotFeaturesRequest).getFeaturePilotFlags();
	}
    
    // Updates the account.
    
    static UpdateAccountResponse updateAccount(Account account) throws AdApiFaultDetail_Exception, ApiFault_Exception {       
		
        final UpdateAccountRequest updateAccountRequest = new UpdateAccountRequest();
        updateAccountRequest.setAccount(account);
        
		return CustomerService.getService().updateAccount(updateAccountRequest);
	}

    // Outputs a subset of the properties of an Account data object.

    static void outputAccount(Account account) throws RemoteException, Exception {
    	outputStatusMessage(String.format("Account Id: %s", account.getId()));
    	outputStatusMessage(String.format("Account Number: %s", account.getNumber()));
    	outputStatusMessage(String.format("Account Name: %s", account.getName()));
    	outputStatusMessage(String.format("Account Parent Customer Id: %s\n", account.getParentCustomerId()));
    }
}
