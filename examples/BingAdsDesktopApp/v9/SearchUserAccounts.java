package com.microsoft.bingads.examples.v9;

import java.rmi.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.customermanagement.*;

public class SearchUserAccounts extends ExampleBaseV9 {

    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            	         
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    ICustomerManagementService.class);
 
            User user = getUser(null);

            // Search for the accounts that the user can access.
            
            ArrayOfAccount accounts = searchAccountsByUserId(user.getId());
            
            System.out.println("The user can access the following Bing Ads accounts: \n");
            printAccounts(accounts);
        
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

    
    // Gets a User object by the specified Bing Ads user identifier.

    static User getUser(java.lang.Long userId) throws RemoteException, Exception {
        
    	GetUserRequest request = new GetUserRequest();
        
        request.setUserId(userId);

        return CustomerService.getService().getUser(request).getUser();
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

    // Outputs the account and parent customer identifiers for the specified accounts.

    static void printAccounts(ArrayOfAccount accounts) throws RemoteException, Exception {
        
    	for (Account account : accounts.getAccounts())
        {
        	System.out.printf("AccountId: %d\n", account.getId());
        	System.out.printf("CustomerId: %d\n\n", account.getParentCustomerId());
        }
    }
}