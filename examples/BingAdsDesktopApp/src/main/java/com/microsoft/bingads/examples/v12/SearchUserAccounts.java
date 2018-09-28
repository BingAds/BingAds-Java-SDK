package com.microsoft.bingads.examples.v12;

import java.util.Arrays;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.customermanagement.*;

public class SearchUserAccounts extends ExampleBase {
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData(null,null);
            	         
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(null);
            User user = getUserResponse.getUser();

            // Search for the accounts that the user can access.
            // To retrieve more than 100 accounts, increase the page size up to 1,000.
            // To retrieve more than 1,000 accounts you'll need to implement paging.
            
            ArrayOfPredicate predicates = new ArrayOfPredicate();
            Predicate predicate = new Predicate();
            predicate.setField("UserId");
            predicate.setOperator(PredicateOperator.EQUALS);
            predicate.setValue("" + user.getId());
            predicates.getPredicates().add(predicate);

            Paging paging = new Paging();
            paging.setIndex(0);
            paging.setSize(100);

            final SearchAccountsRequest searchAccountsRequest = new SearchAccountsRequest();
            searchAccountsRequest.setPredicates(predicates);
            searchAccountsRequest.setPageInfo(paging);
        
            ArrayOfAdvertiserAccount accounts = CustomerManagementExampleHelper.searchAccounts(predicates, null, paging).getAccounts();
            
            outputStatusMessage("The user can access the following Bing Ads accounts: \n");
            for (AdvertiserAccount account : accounts.getAdvertiserAccounts())
            {
            	CustomerManagementExampleHelper.outputAdvertiserAccount(account);
            	
            	// Optionally you can find out which pilot features the customer is able to use. 
                // Each account could belong to a different customer, so use the customer ID in each account.
                ArrayOfint featurePilotFlags = CustomerManagementExampleHelper.getCustomerPilotFeatures((long)account.getParentCustomerId()).getFeaturePilotFlags();
                outputStatusMessage("Customer Pilot flags:");
                outputStatusMessage(Arrays.toString(featurePilotFlags.getInts().toArray()));
            }
            
            outputStatusMessage("Program execution completed\n");         
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
}
