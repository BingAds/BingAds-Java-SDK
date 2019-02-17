package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.customermanagement.*;

// How to use agency credentials to invite a client, 
// and use client credentials to accept the invitation. 
// Run this sample multiple times alternating between agency and client credentials 
// to update and observe the status change, for example from LinkPending to LinkAccepted to Active. 

public class ClientLinks extends ExampleBase {

    static AuthorizationData authorizationData; 
    
    // REQUIRED: The Client Account Id that you want to access. 
    private static long ClientAccountId = 0; 
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData(); 
	        
            CustomerManagementExampleHelper.CustomerManagementService = new ServiceClient<ICustomerManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
	        
            outputStatusMessage("You must edit this example to provide the ClientAccountId for the client link." +
                    "When adding a client link, the client link's ManagingCustomerId is set to the CustomerId " +
                    "of the current authenticated user, who must be a Super Admin of the agency." +
                    "Login as an agency Super Admin user to send a client link invitation, or unlink an existing client link." +
                    "Login as a client Super Admin user to accept a client link invitation.");
 
            UpdateClientLinksResponse updateClientLinksResponse = null;

            // Set the client link search criteria.

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
            
            // Search for client links that match the criteria.

            outputStatusMessage("-----\nSearchClientLinks:");
            ArrayOfClientLink clientLinks = CustomerManagementExampleHelper.searchClientLinks(
                predicates,
                ordering,
                pageInfo).getClientLinks();
            outputStatusMessage("ClientLinks:");
            CustomerManagementExampleHelper.outputArrayOfClientLink(clientLinks);

            // Determine whether the agency is already managing the specified client account. 
            // If a link exists with status either Active, LinkInProgress, LinkPending, 
            // UnlinkInProgress, or UnlinkPending, the agency may not initiate a duplicate client link.

            ClientLink clientLink;
            boolean newLinkRequired = true;

            if (clientLinks.getClientLinks().size() > 0)
            {
                clientLink = clientLinks.getClientLinks().get(0);
                outputStatusMessage("Using the first client link as an example.");
                outputStatusMessage(String.format("Current ClientLink Status: %s.", clientLink.getStatus()));
                
                ArrayOfClientLink updateClientLinks = new ArrayOfClientLink();                
                
                switch (clientLink.getStatus())
                {
                    // The agency may choose to initiate the unlink process, 
                    // which would terminate the existing relationship with the client. 
                    case ACTIVE:
                        clientLink.setStatus(ClientLinkStatus.UNLINK_REQUESTED);
                        updateClientLinks.getClientLinks().add(clientLink);
                        outputStatusMessage("-----\nUpdateClientLinks:");
                        updateClientLinksResponse = CustomerManagementExampleHelper.updateClientLinks(
                                updateClientLinks);
                        outputStatusMessage("UpdateClientLinks : UnlinkRequested.");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition or waiting for the StartDate.
                    case LINK_ACCEPTED:
                        outputStatusMessage("The status is transitioning towards LinkInProgress.");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case LINK_IN_PROGRESS:
                        outputStatusMessage("The status is transitioning towards Active.");
                        newLinkRequired = false;
                        break;
                    // When the status is LinkPending, either the agency or client may update the status.
                    // The agency may choose to cancel the client link invitation; however, in this example 
                    // the client will accept the invitation. 
                    // If the client does not accept or decline the invitation within 30 days, and if the agency
                    // does not update the status to LinkCanceled, the system updates the status to LinkExpired.
                    case LINK_PENDING:
                        clientLink.setStatus(ClientLinkStatus.LINK_ACCEPTED);
                        updateClientLinks.getClientLinks().add(clientLink);
                        outputStatusMessage("-----\nUpdateClientLinks:");
                        updateClientLinksResponse = CustomerManagementExampleHelper.updateClientLinks(
                                updateClientLinks);
                        outputStatusMessage("UpdateClientLinks: LinkAccepted.");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case UNLINK_IN_PROGRESS:
                        outputStatusMessage("The status is transitioning towards Inactive.");
                        newLinkRequired = false;
                        break;
                    // Waiting on a system status transition.
                    case UNLINK_PENDING:
                        outputStatusMessage("The status is transitioning towards Inactive.");
                        newLinkRequired = false;
                        break;
                    // The link lifecycle has ended.  
                    default:
                        outputStatusMessage("A new client link invitation is required.");
                        break;
                }

                // Print errors if any occurred when updating the client link.
                if (updateClientLinksResponse != null)
                {
                    outputStatusMessage("OperationErrors:");   
                    CustomerManagementExampleHelper.outputArrayOfOperationError(updateClientLinksResponse.getOperationErrors());   
                    outputStatusMessage("PartialErrors:");
                    for(ArrayOfOperationError operationErrors: updateClientLinksResponse.getPartialErrors().getArrayOfOperationErrors())
                    {
                        CustomerManagementExampleHelper.outputArrayOfOperationError(operationErrors);   
                    }
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
                
                outputStatusMessage("-----\nAddClientLinks:");
                AddClientLinksResponse addClientLinksResponse = CustomerManagementExampleHelper.addClientLinks(
                        addClientLinks);
                outputStatusMessage("OperationErrors:");                    
                CustomerManagementExampleHelper.outputArrayOfOperationError(addClientLinksResponse.getOperationErrors());   
                outputStatusMessage("PartialErrors:");
                for(ArrayOfOperationError operationErrors: addClientLinksResponse.getPartialErrors().getArrayOfOperationErrors())
                {
                    CustomerManagementExampleHelper.outputArrayOfOperationError(operationErrors);   
                }
            }

            // Output the client links after any status updates above.

            outputStatusMessage("-----\nSearchClientLinks:");
            clientLinks = CustomerManagementExampleHelper.searchClientLinks(
                predicates,
                ordering,
                pageInfo).getClientLinks();
            outputStatusMessage("ClientLinks:");
            CustomerManagementExampleHelper.outputArrayOfClientLink(clientLinks);
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}
