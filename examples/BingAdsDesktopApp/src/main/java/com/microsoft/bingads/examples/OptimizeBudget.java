package com.microsoft.bingads.examples;

import java.rmi.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.campaignmanagement.AdApiError;
import com.microsoft.bingads.campaignmanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.campaignmanagement.ApiFaultDetail_Exception;
import com.microsoft.bingads.campaignmanagement.BatchError;
import com.microsoft.bingads.campaignmanagement.OperationError;
import com.microsoft.bingads.optimizer.*;

public class OptimizeBudget{

    static AuthorizationData authorizationData;
    static ServiceClient<IOptimizerService> OptimizerService; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;

    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);
	         
            OptimizerService = new ServiceClient<IOptimizerService>(
                    authorizationData, 
                    IOptimizerService.class);
	         
            // Get the budget opportunities which have not expired for the specified account.

            ArrayOfBudgetOpportunity opportunities = getBudgetOpportunities(AccountId);
            ArrayOfstring opportunityKeys = new ArrayOfstring();
            
            if (opportunities.getBudgetOpportunities().size() == 0)
            {
                System.out.println("There are no opportunities which have not yet expired for the specified account.");
            }
            else
            {
            	for (BudgetOpportunity budgetOpportunity : opportunities.getBudgetOpportunities())
                {
                    // Add the opportunity keys to an array
                	
                    if (budgetOpportunity != null)
                    {
                        System.out.printf("OpportunityKey: %s", budgetOpportunity.getOpportunityKey());
                        opportunityKeys.getStrings().add(budgetOpportunity.getOpportunityKey());
                    }
                }

                // Apply the suggested budget opportunities.
                
                applyOpportunities(AccountId, opportunityKeys);
            }
        
        // Optimizer service operations can throw AdApiFaultDetail.
        } catch (AdApiFaultDetail_Exception ex) {
	        System.out.println("The operation failed with the following faults:\n");
	
	        for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
	        {
	            System.out.printf("AdApiError\n");
	            System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
	        }

	    // Optimizer service operations can throw ApiFaultDetail.
        } catch (ApiFaultDetail_Exception ex) {
            System.out.println("The operation failed with the following faults:\n");

            for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                System.out.printf("BatchError at Index: %d\n", error.getIndex());
                System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
            }

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
            // Ignore fault exceptions that we already caught.

            if ( ex.getCause() instanceof AdApiFaultDetail_Exception ||
                 ex.getCause() instanceof ApiFaultDetail_Exception )
            {
                ;
            }
            else
            {
                System.out.println("Error encountered: ");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    // Gets the budget opportunities which have not expired for the specified account.

    public static ArrayOfBudgetOpportunity getBudgetOpportunities(long accountId) throws RemoteException, Exception
    {
        GetBudgetOpportunitiesRequest request = new GetBudgetOpportunitiesRequest();
        
        request.setAccountId(accountId);

        return OptimizerService.getService().getBudgetOpportunities(request).getOpportunities();
    }

    // Apply opportunties for the specified account.

    public static void applyOpportunities(long accountId, ArrayOfstring opportunityKeys) throws RemoteException, Exception
    {
        ApplyOpportunitiesRequest request = new ApplyOpportunitiesRequest();
        
        request.setAccountId(accountId);
        request.setOpportunityKeys(opportunityKeys);

        OptimizerService.getService().applyOpportunities(request);
    }
}
