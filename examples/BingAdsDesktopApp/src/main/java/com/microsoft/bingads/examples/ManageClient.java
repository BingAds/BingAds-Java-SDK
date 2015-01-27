package com.microsoft.bingads.examples;

import java.rmi.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.customermanagement.*;

/// 
/// This example demonstrates how to use agency credentials to invite a client, 
/// and use client credentials to accept the invitation. 
/// Run this sample multiple times alternating between agency and client credentials 
/// to update and observe the status change, for example from LinkPending to LinkAccepted to Active. 
/// 
public class ManageClient {

    static AuthorizationData authorizationData;
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    
    private static long ClientAccountId = <ClientAccountIdGoesHere>;
        

    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
	        
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    ICustomerManagementService.class);
	        
            System.out.println("You must edit this example to provide the ClientAccountId for " +
                    "the client link.");
            System.out.println("When adding a client link, the client link's ManagingCustomerId is set to the CustomerId of the current " +
                    	"authenticated user, who must be a Super Admin of the agency.");
            System.out.println("Login as an agency Super Admin user to send a client link invitation, " +
                    	"or unlink an existing client link.");
            System.out.println("Login as a client Super Admin user to accept a client link invitation.\n");
 
            UpdateClientLinksResponse updateClientLinksResponse = null;

            // Specify the client link search criteria

            Paging pageInfo = new Paging();
            pageInfo.setIndex(0);    // The first page
            pageInfo.setSize(100);   // The first 100 client links for this page of results
            
            ArrayOfOrderBy ordering = new ArrayOfOrderBy();
            OrderBy orderBy = new OrderBy();
            orderBy.setField(OrderByField.NUMBER);
            orderBy.setOrder(SortOrder.ASCENDING);
            ordering.getOrderBies().add(orderBy);

            ArrayOfPredicate predicates = new ArrayOfPredicate();
            Predicate predicate = new Predicate();
            predicate.setField("ClientAccountId");
            predicate.setOperator(PredicateOperator.IN);
            predicate.setValue("" + ClientAccountId);
            predicates.getPredicates().add(predicate);
            
            // Search for client links that match the specified criteria.

            ArrayOfClientLink clientLinks = searchClientLinks(
                ordering,
                pageInfo,
                predicates);

            // Determine whether the agency is already managing the specified client account. 
            // If a link exists with status either Active, LinkInProgress, LinkPending, 
            // UnlinkInProgress, or UnlinkPending, the agency may not initiate a duplicate client link.

            ClientLink clientLink;
            boolean newLinkRequired = true;

            if (clientLinks.getClientLinks().size() > 0)
            {
                clientLink = clientLinks.getClientLinks().get(0);
                System.out.printf("Current ClientLink Status: %s.\n\n", clientLink.getStatus());
                printClientLinks(clientLinks);
                
                ArrayOfClientLink updateClientLinks = new ArrayOfClientLink();
                updateClientLinks.getClientLinks().add(clientLink);
                
                switch (clientLink.getStatus())
                {
                    // The agency may choose to initiate the unlink process, 
                    // which would terminate the existing relationship with the client. 
                    case ACTIVE:
                        clientLink.setStatus(ClientLinkStatus.UNLINK_REQUESTED);
                        updateClientLinksResponse = updateClientLinks(updateClientLinks);
                        System.out.println("UpdateClientLinks : UnlinkRequested.\n");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition or waiting for the StartDate.
                    case LINK_ACCEPTED:
                        System.out.println("The status is transitioning towards LinkInProgress.\n");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case LINK_IN_PROGRESS:
                        System.out.println("The status is transitioning towards Active.\n");
                        newLinkRequired = false;
                        break;
                    // When the status is LinkPending, either the agency or client may update the status.
                    // The agency may choose to cancel the client link invitation; however, in this sample 
                    // the client will accept the invitation. 
                    // If the client does not accept or decline the invitation within 30 days, and if the agency
                    // does not update the status to LinkCanceled, the system updates the status to LinkExpired.
                    case LINK_PENDING:
                        /*
                        clientLink.setStatus(ClientLinkStatus.LinkCanceled);
                        updateClientLinksResponse = UpdateClientLinks(updateClientLinks);
                        System.out.println("UpdateClientLinks: LinkCanceled.\n");
                         */
                        clientLink.setStatus(ClientLinkStatus.LINK_ACCEPTED);
                        updateClientLinksResponse = updateClientLinks(updateClientLinks);
                        System.out.println("UpdateClientLinks: LinkAccepted.\n");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case UNLINK_IN_PROGRESS:
                        System.out.println("The status is transitioning towards Inactive.\n");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case UNLINK_PENDING:
                        System.out.println("The status is transitioning towards Inactive.\n");
                        newLinkRequired = false;
                        break;
                    // The link lifecycle has ended.  
                    default:
                        System.out.println("A new client link invitation is required.\n");
                        break;
                }

                // Print errors if any occurred when updating the client link.
                if (updateClientLinksResponse != null)
                {
                    printPartialErrors(updateClientLinksResponse.getOperationErrors(),
                                       updateClientLinksResponse.getPartialErrors());
                }
            }

            // If no links exist between the agency and specified client account, or a link exists with status  
            // either Inactive, LinkCanceled, LinkDeclined, LinkExpired, or LinkFailed, then the agency must
            // initiate a new client link.

            if(newLinkRequired)
            {
                clientLink = new ClientLink();
                clientLink.setClientAccountId(ClientAccountId);
                clientLink.setManagingCustomerId(authorizationData.getCustomerId());
                clientLink.setIsBillToClient(true);
                clientLink.setName("My Client Link");
                clientLink.setStartDate(null);
                clientLink.setSuppressNotification(true);

                ArrayOfClientLink addClientLinks = new ArrayOfClientLink();
                addClientLinks.getClientLinks().add(clientLink);
                
                AddClientLinksResponse addClientLinksResponse = addClientLinks(addClientLinks);

                // Print errors if any occurred when adding the client link.
                printPartialErrors(addClientLinksResponse.getOperationErrors(), addClientLinksResponse.getPartialErrors());
                System.out.println("The user attempted to add a new ClientLink.\n");
            }

            // Get and print the current client link

            clientLinks = searchClientLinks(
                    ordering,
                    pageInfo,
                    predicates);

            printClientLinks(clientLinks);
        
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
            // Ignore fault exceptions that we already caught.

            if ( ex.getCause() instanceof AdApiFaultDetail_Exception ||
                 ex.getCause() instanceof ApiFault_Exception )
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

    // Searches client links for the customer of the current authenticated user,
    // filtered by the search criteria.

    static ArrayOfClientLink searchClientLinks(
        ArrayOfOrderBy ordering,
        Paging pageInfo,
        ArrayOfPredicate predicates) throws RemoteException, Exception
    {
        SearchClientLinksRequest request = new SearchClientLinksRequest();
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);
        request.setPredicates(predicates);
           
        return CustomerService.getService().searchClientLinks(request).getClientLinks();
    }

    // Initiates the client link process to manage the account of another customer. 
    // Sends an invitation from an agency to a potential client.

    static AddClientLinksResponse addClientLinks(ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        AddClientLinksRequest request = new AddClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerService.getService().addClientLinks(request);
    }

    // Using agency credentials, updates the status of the specified client links.

    static UpdateClientLinksResponse updateClientLinks(ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        UpdateClientLinksRequest request = new UpdateClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerService.getService().updateClientLinks(request);
    }

    // Prints a list of client links.

    private static void printClientLinks(ArrayOfClientLink clientLinks)
    {
        if (clientLinks == null)
        {
            return;
        }

        for (ClientLink clientLink : clientLinks.getClientLinks())
        {
            System.out.printf("Status: %s\n", clientLink.getStatus());
            System.out.printf("ClientAccountId: %s\n", clientLink.getClientAccountId());
            System.out.printf("ClientAccountNumber: %s\n", clientLink.getClientAccountNumber());
            System.out.printf("ManagingAgencyCustomerId: %s\n", clientLink.getManagingCustomerId());
            System.out.printf("ManagingCustomerNumber: %s\n", clientLink.getManagingCustomerNumber());
            System.out.print(clientLink.getIsBillToClient() ? "IsBillToClient: True\n" : "IsBillToClient: False\n");
            System.out.printf("InviterEmail: %s\n", clientLink.getInviterEmail());
            System.out.printf("InviterName: %s\n", clientLink.getInviterName());
            System.out.printf("InviterPhone: %s\n", clientLink.getInviterPhone());
            System.out.printf("LastModifiedByUserId: %s\n", clientLink.getLastModifiedByUserId());
            System.out.printf("Name: %s\n", clientLink.getName());
            System.out.printf("Note: %s\n", clientLink.getNote());
            System.out.print("\n");
        }
    }

    // Print errors if any occurred when adding or updating the client link.

    static void printPartialErrors(ArrayOfOperationError operationErrors, ArrayOfArrayOfOperationError partialErrors)
    {
        if (operationErrors == null)
        {
            return;
        }

        for (OperationError error : operationErrors.getOperationErrors())
        {
            System.out.print("OperationError");
            System.out.printf("Code: %d\nMessage: %s\n", error.getCode(), error.getMessage());
        }

        if (partialErrors == null)
        {
            return;
        }

        for (ArrayOfOperationError errors : partialErrors.getArrayOfOperationErrors())
        {
            if (errors != null)
            {
                for (OperationError error : errors.getOperationErrors())
                {
                    if (error != null)
                    {
                        System.out.print("OperationError");
                        System.out.printf("Code: %d\nMessage: %s\n", error.getCode(), error.getMessage());
                    }
                }
            }
        }
    }
}