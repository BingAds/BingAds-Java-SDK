package com.microsoft.bingads.examples.v13;

import java.util.Arrays;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.customermanagement.*;
import java.util.ArrayList;
import java.util.HashSet;

public class SearchUserAccounts extends ExampleBase {
        
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData();
            	         
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            outputStatusMessage("-----\nGetUser:");
            GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(
                    null);
            User user = getUserResponse.getUser();
            outputStatusMessage("User:");
            CustomerManagementExampleHelper.outputUser(user);
            outputStatusMessage("CustomerRoles:");
            CustomerManagementExampleHelper.outputArrayOfCustomerRole(getUserResponse.getCustomerRoles());

            // Search for the accounts that the user can access.
            // To retrieve more than 100 accounts, increase the page size up to 1,000.
            // To retrieve more than 1,000 accounts you'll need to add paging.
            
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
        
            outputStatusMessage("-----\nSearchAccounts:");
            ArrayOfAdvertiserAccount accounts = CustomerManagementExampleHelper.searchAccounts(
                    predicates, 
                    null, 
                    paging,
                    null).getAccounts();
            outputStatusMessage("Accounts:");
            CustomerManagementExampleHelper.outputArrayOfAdvertiserAccount(accounts);
            
            ArrayOflong customerIds = new ArrayOflong();
            for (AdvertiserAccount account : accounts.getAdvertiserAccounts())
            {
                customerIds.getLongs().add(account.getParentCustomerId());
            }            
            ArrayList<java.lang.Long> distinctCustomerIds = new ArrayList<java.lang.Long>(new HashSet<Long>(customerIds.getLongs()));
                        
            for (java.lang.Long customerId : distinctCustomerIds)
            {
                // You can find out which pilot features the customer is able to use. 
                // Each account could belong to a different customer, so use the customer ID in each account.
                outputStatusMessage("-----\nGetCustomerPilotFeatures:");
                outputStatusMessage(String.format("Requested by CustomerId: %s", customerId));
                ArrayOfint featurePilotFlags = CustomerManagementExampleHelper.getCustomerPilotFeatures(customerId).getFeaturePilotFlags();
                outputStatusMessage("Customer Pilot flags:");
                outputStatusMessage(Arrays.toString(featurePilotFlags.getInts().toArray()));
            }      
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}
