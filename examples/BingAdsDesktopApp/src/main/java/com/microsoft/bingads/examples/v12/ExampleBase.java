package com.microsoft.bingads.examples.v12;

import java.rmi.RemoteException;
import java.io.IOException;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v12.campaignmanagement.AdExtension;
import com.microsoft.bingads.v12.campaignmanagement.LocationAdExtension;
import com.microsoft.bingads.v12.customermanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v12.customermanagement.ApiFault_Exception;
import com.microsoft.bingads.v12.customermanagement.ArrayOfAdvertiserAccount;
import com.microsoft.bingads.v12.customermanagement.ArrayOfPredicate;
import com.microsoft.bingads.v12.customermanagement.GetUserResponse;
import com.microsoft.bingads.v12.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v12.customermanagement.Paging;
import com.microsoft.bingads.v12.customermanagement.Predicate;
import com.microsoft.bingads.v12.customermanagement.PredicateOperator;
import com.microsoft.bingads.v12.customermanagement.SearchAccountsRequest;
import com.microsoft.bingads.v12.customermanagement.User;

public class ExampleBase extends com.microsoft.bingads.examples.ExampleBase {

    public ExampleBase(){}
    
    protected static AuthorizationData getAuthorizationData(
            java.lang.Long customerId, 
            java.lang.Long accountId) throws IOException, RemoteException, AdApiFaultDetail_Exception, ApiFault_Exception {
                
        authenticateWithOAuth();
                
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

                GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(null, true);
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

                ArrayOfAdvertiserAccount accounts = CustomerManagementExampleHelper.searchAccounts(predicates, null, paging).getAccounts();

                authorizationData.setCustomerId(accounts.getAdvertiserAccounts().get(0).getParentCustomerId());
                authorizationData.setAccountId(accounts.getAdvertiserAccounts().get(0).getId());
            }
                catch (Exception ex) {
                String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
                String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
                ex.printStackTrace();
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
