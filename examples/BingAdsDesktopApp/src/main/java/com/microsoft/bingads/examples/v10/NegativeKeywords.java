package com.microsoft.bingads.examples.v10;

import java.rmi.*;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class NegativeKeywords extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    	
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */

    public static void main(java.lang.String[] args) {
	 
        try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);

            CampaignService = new ServiceClient<ICampaignManagementService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);

            // Specify a campaign. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Summer shoes line.");
            campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
            campaign.setMonthlyBudget(1000.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaign.setDaylightSaving(true);
            campaigns.getCampaigns().add(campaign);
			
            // Add the campaign
			 
            AddCampaignsResponse addCampaignsResponse = addCampaigns(AccountId, campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputCampaignsWithPartialErrors(campaigns, nullableCampaignIds, campaignErrors);
            
            ArrayOflong campaignIds = new ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
			
            // You may choose to associate an exclusive set of negative keywords to an individual campaign 
            // or ad group. An exclusive set of negative keywords cannot be shared with other campaigns 
            // or ad groups. This sample only associates negative keywords with a campaign.

            ArrayOfNegativeKeyword negativeKeywords = new ArrayOfNegativeKeyword();
            NegativeKeyword negativeKeyword = new NegativeKeyword();
            negativeKeyword.setMatchType(MatchType.PHRASE);
            negativeKeyword.setText("auto");
            negativeKeywords.getNegativeKeywords().add(negativeKeyword);

            ArrayOfEntityNegativeKeyword entityNegativeKeywords = new ArrayOfEntityNegativeKeyword();
            EntityNegativeKeyword entityNegativeKeyword = new EntityNegativeKeyword();
            entityNegativeKeyword.setEntityId(campaignIds.getLongs().get(0));
            entityNegativeKeyword.setEntityType("Campaign");
            entityNegativeKeyword.setNegativeKeywords(negativeKeywords);
            entityNegativeKeywords.getEntityNegativeKeywords().add(entityNegativeKeyword);

            AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntitiesResponse = 
                 addNegativeKeywordsToEntities(entityNegativeKeywords);
            if (addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors() == null
                 || addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors().getBatchErrorCollections().size() == 0)
            {
                    outputStatusMessage("Added an exclusive set of negative keywords to the Campaign.\n");
                    outputNegativeKeywordIds(addNegativeKeywordsToEntitiesResponse.getNegativeKeywordIds());
            }
            else
            {
                    outputNestedPartialErrors(addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors());
            }

            GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIdsResponse = 
                 getNegativeKeywordsByEntityIds(campaignIds, "Campaign", AccountId);
            if (getNegativeKeywordsByEntityIdsResponse.getPartialErrors() == null
                 || getNegativeKeywordsByEntityIdsResponse.getPartialErrors().getBatchErrors().size() == 0)
            {
                    outputStatusMessage("Retrieved an exclusive set of negative keywords for the Campaign.\n");
                    outputEntityNegativeKeywords(getNegativeKeywordsByEntityIdsResponse.getEntityNegativeKeywords());
            }
            else
            {
                    outputPartialErrors(getNegativeKeywordsByEntityIdsResponse.getPartialErrors());
            }

            // If you attempt to delete a negative keyword without an identifier the operation will
            // succeed but will return partial errors corresponding to the index of the negative keyword
            // that was not deleted. 
            ArrayOfBatchErrorCollection nestedPartialErrors = deleteNegativeKeywordsFromEntities(entityNegativeKeywords);
            if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
            {
                    outputStatusMessage("Deleted an exclusive set of negative keywords from the Campaign.\n");
            }
            else
            {
                    outputStatusMessage("Attempt to DeleteNegativeKeywordsFromEntities without NegativeKeyword identifier partially fails by design.\n");
                    outputNestedPartialErrors(nestedPartialErrors);
            }

            // Delete the negative keywords with identifiers that were returned above.
            nestedPartialErrors = deleteNegativeKeywordsFromEntities(
                 getNegativeKeywordsByEntityIdsResponse.getEntityNegativeKeywords());
            if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
            {
                    outputStatusMessage("Deleted an exclusive set of negative keywords from the Campaign.\n");
            }
            else
            {
                    outputNestedPartialErrors(nestedPartialErrors);
            }

            // Negative keywords can also be added and deleted from a shared negative keyword list. 
            // The negative keyword list can be shared or associated with multiple campaigns.
            // NegativeKeywordList inherits from SharedList which inherits from SharedEntity.

            NegativeKeywordList negativeKeywordList = new NegativeKeywordList();
            negativeKeywordList.setName("My Negative Keyword List " + System.currentTimeMillis());
            negativeKeywordList.setType("NegativeKeywordList");

            ArrayOfSharedListItem sharedListItems = new ArrayOfSharedListItem();
            NegativeKeyword negativeKeyword1 = new NegativeKeyword();
            negativeKeyword1.setText("car");
            negativeKeyword1.setType("NegativeKeyword");
            negativeKeyword1.setMatchType(MatchType.EXACT);
            sharedListItems.getSharedListItems().add(negativeKeyword1);
            NegativeKeyword negativeKeyword2 = new NegativeKeyword();
            negativeKeyword2.setText("car");
            negativeKeyword2.setType("NegativeKeyword");
            negativeKeyword2.setMatchType(MatchType.PHRASE);
            sharedListItems.getSharedListItems().add(negativeKeyword2);

            // You can create a new list for negative keywords with or without negative keywords.

            AddSharedEntityResponse addSharedEntityResponse = addSharedEntity(negativeKeywordList, sharedListItems);
            long sharedEntityId = addSharedEntityResponse.getSharedEntityId();
            ArrayOflong listItemIds = addSharedEntityResponse.getListItemIds();

            outputStatusMessage(String.format("NegativeKeywordList successfully added to account library and assigned identifer %d\n\n", sharedEntityId));

            outputNegativeKeywordIdsWithPartialErrors(
                 sharedEntityId,
                 sharedListItems, 
                 listItemIds, 
                 addSharedEntityResponse.getPartialErrors());

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            negativeKeywordList.setId(sharedEntityId);

            sharedListItems = getListItemsBySharedList(negativeKeywordList);
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                    outputStatusMessage("None\n");
            }
            else
            {
                    outputSharedListItems(sharedListItems);
            }             

            // To update the list of negative keywords, you must either add or remove from the list
            // using the respective AddListItemsToSharedList or DeleteListItemsFromSharedList operations.
            // To remove the negative keywords from the list pass the negative keyword identifers
            // and negative keyword list (SharedEntity) identifer.

            ArrayOfBatchError partialErrors = deleteListItemsFromSharedList(listItemIds, negativeKeywordList);
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                    outputStatusMessage("Deleted most recently added negative keywords from negative keyword list.\n");

            }
            else
            {
                    outputPartialErrors(partialErrors);
            }

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            sharedListItems = getListItemsBySharedList(negativeKeywordList);
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                    outputStatusMessage("None\n");
            }
            else
            {
                    outputSharedListItems(sharedListItems);
            }

            // Whether you created the list with or without negative keywords, more can be added 
            // using the AddListItemsToSharedList operation.

            sharedListItems = new ArrayOfSharedListItem();
            negativeKeyword1 = new NegativeKeyword();
            negativeKeyword1.setText("auto");
            negativeKeyword1.setType("NegativeKeyword");
            negativeKeyword1.setMatchType(MatchType.EXACT);
            sharedListItems.getSharedListItems().add(negativeKeyword1);
            negativeKeyword2 = new NegativeKeyword();
            negativeKeyword2.setText("auto");
            negativeKeyword2.setType("NegativeKeyword");
            negativeKeyword2.setMatchType(MatchType.PHRASE);
            sharedListItems.getSharedListItems().add(negativeKeyword2);

            AddListItemsToSharedListResponse addListItemsToSharedListResponse = addListItemsToSharedList(
                 sharedListItems,
                 negativeKeywordList);
            listItemIds = addListItemsToSharedListResponse.getListItemIds();

            outputNegativeKeywordIdsWithPartialErrors(
                 sharedEntityId,
                 sharedListItems, 
                 listItemIds, 
                 addListItemsToSharedListResponse.getPartialErrors());

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            sharedListItems = getListItemsBySharedList(negativeKeywordList);
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                    outputStatusMessage("None\n");
            }
            else
            {
                    outputSharedListItems(sharedListItems);
            }

            // You can update the name of the negative keyword list. 

            negativeKeywordList.setName("My Updated Negative Keyword List");
            negativeKeywordList.setType("NegativeKeywordList");

            ArrayOfSharedEntity sharedEntities = new ArrayOfSharedEntity();
            sharedEntities.getSharedEntities().add(negativeKeywordList);
            partialErrors = updateSharedEntities(sharedEntities);
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                    outputStatusMessage(String.format("Updated Negative Keyword List Name to %s.\n\n", negativeKeywordList.getName()));
            }
            else
            {
                    outputPartialErrors(partialErrors);
            }

            // Get and print the negative keyword lists and return the list of identifiers.

            final java.lang.String sharedEntityType = "NegativeKeywordList";
            sharedEntities = getSharedEntitiesByAccountId(sharedEntityType);
            outputSharedEntityIdentifiers(sharedEntities);
			
            ArrayOflong sharedEntityIds = new ArrayOflong();
            for (int index = 0; index < sharedEntities.getSharedEntities().size(); index++)
            {
                SharedEntity sharedEntity = sharedEntities.getSharedEntities().get(index);
                if (sharedEntity.getId() != null)
                {
                    sharedEntityIds.getLongs().add((long)sharedEntity.getId());
                }
            }
			    
            // Negative keywords were added to the negative keyword list above. You can associate the 
            // shared list of negative keywords with a campaign with or without negative keywords. 
            // Shared negative keyword lists cannot be associated with an ad group. An ad group can only 
            // be assigned an exclusive set of negative keywords. 

            ArrayOfSharedEntityAssociation associations = new ArrayOfSharedEntityAssociation();
            SharedEntityAssociation association = new SharedEntityAssociation();
            association.setEntityId(campaignIds.getLongs().get(0));
            association.setEntityType("Campaign");
            association.setSharedEntityId(sharedEntityId);
            association.setSharedEntityType("NegativeKeywordList");
            associations.getSharedEntityAssociations().add(association);

            partialErrors = setSharedEntityAssociations(associations);
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                    outputStatusMessage(String.format("Associated CampaignId %d with Negative Keyword List Id %d.\n\n", 
                             campaignIds.getLongs().get(0), sharedEntityId));
            }
            else
            {
                    outputPartialErrors(partialErrors);
            }

            // Get and print the associations either by Campaign or NegativeKeywordList identifier.
            GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIdsResponse = 
                 getSharedEntityAssociationsByEntityIds(campaignIds, "Campaign", "NegativeKeywordList");
            outputSharedEntityAssociations(getSharedEntityAssociationsByEntityIdsResponse.getAssociations());
            outputPartialErrors(getSharedEntityAssociationsByEntityIdsResponse.getPartialErrors());

            // Get the associations of the most recently added shared entity.
            ArrayOflong associatedSharedEntityIds = new ArrayOflong();
            associatedSharedEntityIds.getLongs().add(sharedEntityIds.getLongs().get(sharedEntityIds.getLongs().size()-1));
            GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIdsResponse = 
                 getSharedEntityAssociationsBySharedEntityIds("Campaign", associatedSharedEntityIds, "NegativeKeywordList");
            outputSharedEntityAssociations(getSharedEntityAssociationsBySharedEntityIdsResponse.getAssociations());
            outputPartialErrors(getSharedEntityAssociationsBySharedEntityIdsResponse.getPartialErrors());

            // Explicitly delete the association between the campaign and the negative keyword list.

            partialErrors = deleteSharedEntityAssociations(associations);
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                    outputStatusMessage("Deleted NegativeKeywordList associations\n");
            }
            else
            {
                    outputPartialErrors(partialErrors);
            }

            // Delete the campaign and any remaining assocations. 
			
            deleteCampaigns(AccountId, campaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
			
            // DeleteCampaigns does not delete the negative keyword list from the account's library. 
            // Call the DeleteSharedEntities operation to delete the shared entities.

            partialErrors = deleteSharedEntities(sharedEntities);
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                 outputStatusMessage(String.format("Deleted Negative Keyword List (SharedEntity) Id %d\n\n", sharedEntityId));
            }
            else
            {
                    outputPartialErrors(partialErrors);
            }

            outputStatusMessage("Program execution completed\n"); 
			 
            // Campaign Management service operations can throw AdApiFaultDetail.
            } catch (AdApiFaultDetail_Exception ex) {
                    outputStatusMessage("The operation failed with the following faults:\n");

                    for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
                    {
                            outputStatusMessage("AdApiError\n");
                            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                    }

            // Campaign Management service operations can throw ApiFaultDetail.
            } catch (ApiFaultDetail_Exception ex) {
                    outputStatusMessage("The operation failed with the following faults:\n");

                    for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
                    {
                            outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                    }

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

	//Adds one or more campaigns to the specified account.
	
	static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
	{
	    AddCampaignsRequest request = new AddCampaignsRequest();
	    
	    // Set the request information.
	
	    request.setAccountId(accountId);
	    request.setCampaigns(campaigns);
	
	    return CampaignService.getService().addCampaigns(request);
	}
     
     // Deletes one or more campaigns from the specified account.

     static void deleteCampaigns(long accountId, ArrayOflong campaignIds) throws RemoteException, Exception
     {
    	 DeleteCampaignsRequest request = new DeleteCampaignsRequest();
         
         request.setAccountId(accountId);
         request.setCampaignIds(campaignIds);

         CampaignService.getService().deleteCampaigns(request);
     }

     // Adds list items such as negative keywords to the corresponding list.

     static AddListItemsToSharedListResponse addListItemsToSharedList(
    		 ArrayOfSharedListItem listItems, 
            SharedList sharedList) throws RemoteException, Exception
     {
    	 AddListItemsToSharedListRequest request = new AddListItemsToSharedListRequest();
         
         request.setListItems(listItems);
         request.setSharedList(sharedList);
         
         return CampaignService.getService().addListItemsToSharedList(request);
     }

     // Adds a shared entity such as a negative keyword list to the account's library. 
     // Lists in the account's library can be associated with any campaign within the account.

     static AddSharedEntityResponse addSharedEntity(
            SharedEntity sharedEntity,
            ArrayOfSharedListItem listItems) throws RemoteException, Exception
     {
    	 AddSharedEntityRequest request = new AddSharedEntityRequest();
         
         request.setSharedEntity(sharedEntity);
         request.setListItems(listItems);
         
         return CampaignService.getService().addSharedEntity(request);
     }

     // Deletes list items such as negative keywords from the corresponding list. 

     static ArrayOfBatchError deleteListItemsFromSharedList(
    		ArrayOflong listItemIds, 
            SharedList sharedList) throws RemoteException, Exception
     {
    	 DeleteListItemsFromSharedListRequest request = new DeleteListItemsFromSharedListRequest();
         
         request.setListItemIds(listItemIds);
         request.setSharedList(sharedList);
         
         return CampaignService.getService().deleteListItemsFromSharedList(request).getPartialErrors();
     }

     // Deletes shared entities such as negative keyword lists from the account's library.

     static ArrayOfBatchError deleteSharedEntities(ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
     {
    	 DeleteSharedEntitiesRequest request = new DeleteSharedEntitiesRequest();
         
         request.setSharedEntities(sharedEntities);
         
         return CampaignService.getService().deleteSharedEntities(request).getPartialErrors();
     }

     // Removes the association between a shared entity such as a negative keyword list and an entity such as a campaign. 

     static ArrayOfBatchError deleteSharedEntityAssociations(ArrayOfSharedEntityAssociation associations) throws RemoteException, Exception
     {
    	 DeleteSharedEntityAssociationsRequest request = new DeleteSharedEntityAssociationsRequest();
         
         request.setAssociations(associations);
         
         return CampaignService.getService().deleteSharedEntityAssociations(request).getPartialErrors();
     }

     // Gets the list items such as the negative keywords of a negative keyword list. 

     static ArrayOfSharedListItem getListItemsBySharedList(SharedList sharedList) throws RemoteException, Exception
     {
    	 GetListItemsBySharedListRequest request = new GetListItemsBySharedListRequest();
         
         request.setSharedList(sharedList);
         
         return CampaignService.getService().getListItemsBySharedList(request).getListItems();
     }

     // Gets the shared entities such as negative keyword lists from the account's library.  

     static ArrayOfSharedEntity getSharedEntitiesByAccountId(java.lang.String sharedEntityType) throws RemoteException, Exception
     {
    	 GetSharedEntitiesByAccountIdRequest request = new GetSharedEntitiesByAccountIdRequest();
         
         request.setSharedEntityType(sharedEntityType);
         
         return CampaignService.getService().getSharedEntitiesByAccountId(request).getSharedEntities();
     }

     // Gets associations between a campaign and a shared entity such as a negative keyword list. 
     // You can request associations by associated entity identifiers.

     static GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(
    		ArrayOflong entityIds,
            java.lang.String entityType, 
            java.lang.String sharedEntityType) throws RemoteException, Exception
     {
    	 GetSharedEntityAssociationsByEntityIdsRequest request = new GetSharedEntityAssociationsByEntityIdsRequest();
         
         request.setEntityIds(entityIds);
         request.setEntityType(entityType);
         request.setSharedEntityType(sharedEntityType);
         
         return CampaignService.getService().getSharedEntityAssociationsByEntityIds(request);
     }

     // Gets associations between a campaign and a shared entity such as a negative keyword list. 
     // You can request associations by shared entity identifiers.

     static GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(
            java.lang.String entityType, 
            ArrayOflong sharedEntityIds,
            java.lang.String sharedEntityType) throws RemoteException, Exception
     {
    	 GetSharedEntityAssociationsBySharedEntityIdsRequest request = new GetSharedEntityAssociationsBySharedEntityIdsRequest();
         
         request.setEntityType(entityType);
         request.setSharedEntityIds(sharedEntityIds);
         request.setSharedEntityType(sharedEntityType);
         
         return CampaignService.getService().getSharedEntityAssociationsBySharedEntityIds(request);
     }

     // Sets the association between a campaign and a shared entity such as a negative keyword list. 

     static ArrayOfBatchError setSharedEntityAssociations(ArrayOfSharedEntityAssociation associations) throws RemoteException, Exception
     {
    	 SetSharedEntityAssociationsRequest request = new SetSharedEntityAssociationsRequest();
         
         request.setAssociations(associations);
         
         return CampaignService.getService().setSharedEntityAssociations(request).getPartialErrors();
     }

     // Updates shared entities such as negative keyword lists within the account's library. 

     static ArrayOfBatchError updateSharedEntities(ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
     {
    	 UpdateSharedEntitiesRequest request = new UpdateSharedEntitiesRequest();
         
         request.setSharedEntities(sharedEntities);
         
         return CampaignService.getService().updateSharedEntities(request).getPartialErrors();
     }

     // Adds negative keywords to the specified campaign or ad group.  

     static AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(ArrayOfEntityNegativeKeyword entityNegativeKeywords) throws RemoteException, Exception
     {
    	 AddNegativeKeywordsToEntitiesRequest request = new AddNegativeKeywordsToEntitiesRequest();
         
         request.setEntityNegativeKeywords(entityNegativeKeywords);
         
         return CampaignService.getService().addNegativeKeywordsToEntities(request);
     }

     // Deletes negative keywords from the specified campaign or ad group.  

     static ArrayOfBatchErrorCollection deleteNegativeKeywordsFromEntities(ArrayOfEntityNegativeKeyword entityNegativeKeywords) throws RemoteException, Exception
     {
    	 DeleteNegativeKeywordsFromEntitiesRequest request = new DeleteNegativeKeywordsFromEntitiesRequest();
         
         request.setEntityNegativeKeywords(entityNegativeKeywords);
         
         return CampaignService.getService().deleteNegativeKeywordsFromEntities(request).getNestedPartialErrors();
     }

     // Gets the negative keywords that are only associated with the specified campaigns or ad groups.  

     static GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(
    		ArrayOflong entityIds, 
            java.lang.String entityType, 
            long parentEntityId) throws RemoteException, Exception
     {
    	 GetNegativeKeywordsByEntityIdsRequest request = new GetNegativeKeywordsByEntityIdsRequest();
         
         request.setEntityIds(entityIds);
         request.setEntityType(entityType);
         request.setParentEntityId(parentEntityId);
         
         return CampaignService.getService().getNegativeKeywordsByEntityIds(request);
     }
 }