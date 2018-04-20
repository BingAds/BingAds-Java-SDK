package com.microsoft.bingads.examples.v11;

import java.rmi.RemoteException;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v11.campaignmanagement.AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.LocationAdExtension;
import com.microsoft.bingads.v11.customermanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v11.customermanagement.ApiFault_Exception;
import com.microsoft.bingads.v11.customermanagement.ArrayOfAccount;
import com.microsoft.bingads.v11.customermanagement.ArrayOfPredicate;
import com.microsoft.bingads.v11.customermanagement.GetUserResponse;
import com.microsoft.bingads.v11.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v11.customermanagement.Paging;
import com.microsoft.bingads.v11.customermanagement.Predicate;
import com.microsoft.bingads.v11.customermanagement.PredicateOperator;
import com.microsoft.bingads.v11.customermanagement.SearchAccountsRequest;
import com.microsoft.bingads.v11.customermanagement.User;

public class ExampleBase extends com.microsoft.bingads.examples.ExampleBase {
    
    public ExampleBase(){}
    
    protected static AuthorizationData getAuthorizationData(
            java.lang.Long customerId, 
            java.lang.Long accountId) throws RemoteException, AdApiFaultDetail_Exception, ApiFault_Exception {
        
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

                GetUserResponse getUserResponse = CustomerManagementExampleHelper.getUser(null);
                User user = getUserResponse.getUser();

                // Search for the accounts that the user can access.

                ArrayOfPredicate predicates = new ArrayOfPredicate();
                Predicate predicate = new Predicate();
                predicate.setField("UserId");
                predicate.setOperator(PredicateOperator.EQUALS);
                predicate.setValue("" + user.getId());
                predicates.getPredicates().add(predicate);

                Paging paging = new Paging();
                paging.setIndex(0);
                paging.setSize(10);

                final SearchAccountsRequest searchAccountsRequest = new SearchAccountsRequest();
                searchAccountsRequest.setPredicates(predicates);
                searchAccountsRequest.setPageInfo(paging);

                ArrayOfAccount accounts = CustomerManagementExampleHelper.searchAccounts(predicates, null, paging).getAccounts();

                authorizationData.setCustomerId(accounts.getAccounts().get(0).getParentCustomerId());
                authorizationData.setAccountId(accounts.getAccounts().get(0).getId());
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
