package com.microsoft.bingads.examples.v13;

import java.rmi.RemoteException;
import java.io.IOException;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v13.campaignmanagement.AdExtension;
import com.microsoft.bingads.v13.campaignmanagement.LocationAdExtension;
import com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v13.customermanagement.ApiFault_Exception;
import com.microsoft.bingads.v13.customermanagement.ArrayOfAdvertiserAccount;
import com.microsoft.bingads.v13.customermanagement.ArrayOfPredicate;
import com.microsoft.bingads.v13.customermanagement.GetUserResponse;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.customermanagement.Paging;
import com.microsoft.bingads.v13.customermanagement.Predicate;
import com.microsoft.bingads.v13.customermanagement.PredicateOperator;
import com.microsoft.bingads.v13.customermanagement.SearchAccountsRequest;
import com.microsoft.bingads.v13.customermanagement.User;

public class ExampleBase extends com.microsoft.bingads.examples.ExampleBase {

    public ExampleBase(){}
    
    protected static AuthorizationData getAuthorizationData() throws IOException, RemoteException, AdApiFaultDetail_Exception, ApiFault_Exception {
                
        authenticateWithOAuth();
        
        // If the customer and account IDs are not set, 
        // we'll find one that the user can access below. 
        
        java.lang.Long customerId = null;
        java.lang.Long accountId = null;
                
        if(customerId != null && accountId != null){
            authorizationData.setCustomerId(customerId);
            authorizationData.setAccountId(accountId);
        }
        else{
            try
            {
                CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);

                GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(null);
                User user = getUserResponse.getUser();

                // Search for the accounts that the user can access.

                ArrayOfPredicate predicates = new ArrayOfPredicate();
                Predicate predicate = new Predicate();
                predicate.setField("UserId");
                predicate.setOperator(PredicateOperator.EQUALS);
                predicate.setValue("" + user.getId());
                predicates.getPredicates().add(predicate);

                // To retrieve more than 100 accounts, increase the page size up to 1,000.
                // To retrieve more than 1,000 accounts you'll need to implement paging.
                Paging paging = new Paging();
                paging.setIndex(0);
                paging.setSize(100);

                final SearchAccountsRequest searchAccountsRequest = new SearchAccountsRequest();
                searchAccountsRequest.setPredicates(predicates);
                searchAccountsRequest.setPageInfo(paging);

                ArrayOfAdvertiserAccount accounts = CustomerManagementExampleHelper.searchAccounts(
                    predicates, null, paging, null).getAccounts();

                authorizationData.setCustomerId(accounts.getAdvertiserAccounts().get(0).getParentCustomerId());
                authorizationData.setAccountId(accounts.getAdvertiserAccounts().get(0).getId());
            }
            catch (Exception ex) 
            {
                String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
                outputStatusMessage(faultXml);
                String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
                outputStatusMessage(message);
            }
        }
        
        return authorizationData;
    }
    
    static AdExtension setReadOnlyAdExtensionElementsToNull(AdExtension extension)
    {
        if (extension == null || extension.getId() == null)
        {
            return extension;
        }
        else
        {
            // Set to null for all extension types.
            extension.setVersion(null);

            if (extension instanceof LocationAdExtension)
            {
                ((LocationAdExtension)extension).setGeoCodeStatus(null);
            }
            return extension;
        }
    }    
}
