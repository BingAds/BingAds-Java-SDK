package com.microsoft.bingads.examples.v11;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class NegativeKeywords extends ExampleBase {

    static AuthorizationData authorizationData;
    	
    public static void main(java.lang.String[] args) {
	 
        try
        {
            authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // Specify a campaign. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Summer shoes line.");
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);
			
            // Add the campaign
			 
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(AccountId, campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);
            
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
                 CampaignManagementExampleHelper.addNegativeKeywordsToEntities(entityNegativeKeywords);
            if (addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors() == null
                 || addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors().getBatchErrorCollections().size() == 0)
            {
                outputStatusMessage("Added an exclusive set of negative keywords to the Campaign.\n");
                CampaignManagementExampleHelper.outputArrayOfIdCollection(addNegativeKeywordsToEntitiesResponse.getNegativeKeywordIds());
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors());
            }

            GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIdsResponse = 
                 CampaignManagementExampleHelper.getNegativeKeywordsByEntityIds(campaignIds, "Campaign", AccountId);
            if (getNegativeKeywordsByEntityIdsResponse.getPartialErrors() == null
                 || getNegativeKeywordsByEntityIdsResponse.getPartialErrors().getBatchErrors().size() == 0)
            {
                outputStatusMessage("Retrieved an exclusive set of negative keywords for the Campaign.\n");
                CampaignManagementExampleHelper.outputArrayOfEntityNegativeKeyword(getNegativeKeywordsByEntityIdsResponse.getEntityNegativeKeywords());
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(getNegativeKeywordsByEntityIdsResponse.getPartialErrors());
            }

            // If you attempt to delete a negative keyword without an identifier the operation will
            // succeed but will return partial errors corresponding to the index of the negative keyword
            // that was not deleted. 
            ArrayOfBatchErrorCollection nestedPartialErrors = CampaignManagementExampleHelper.deleteNegativeKeywordsFromEntities(entityNegativeKeywords).getNestedPartialErrors();
            if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
            {
                outputStatusMessage("Deleted an exclusive set of negative keywords from the Campaign.\n");
            }
            else
            {
                outputStatusMessage("Attempt to DeleteNegativeKeywordsFromEntities without NegativeKeyword identifier partially fails by design.\n");
                CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(nestedPartialErrors);
            }

            // Delete the negative keywords with identifiers that were returned above.
            nestedPartialErrors = CampaignManagementExampleHelper.deleteNegativeKeywordsFromEntities(
                 getNegativeKeywordsByEntityIdsResponse.getEntityNegativeKeywords()).getNestedPartialErrors();
            if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
            {
                outputStatusMessage("Deleted an exclusive set of negative keywords from the Campaign.\n");
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(nestedPartialErrors);
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

            AddSharedEntityResponse addSharedEntityResponse = CampaignManagementExampleHelper.addSharedEntity(negativeKeywordList, sharedListItems);
            long sharedEntityId = addSharedEntityResponse.getSharedEntityId();
            ArrayOflong listItemIds = addSharedEntityResponse.getListItemIds();

            outputStatusMessage(String.format("NegativeKeywordList successfully added to account library and assigned identifer %d\n\n", sharedEntityId));
            CampaignManagementExampleHelper.outputArrayOfSharedListItem(sharedListItems);
            CampaignManagementExampleHelper.outputArrayOflong(listItemIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addSharedEntityResponse.getPartialErrors());

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            negativeKeywordList.setId(sharedEntityId);

            sharedListItems = CampaignManagementExampleHelper.getListItemsBySharedList(negativeKeywordList).getListItems();
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                outputStatusMessage("None\n");
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfSharedListItem(sharedListItems);
            }             

            // To update the list of negative keywords, you must either add or remove from the list
            // using the respective AddListItemsToSharedList or DeleteListItemsFromSharedList operations.
            // To remove the negative keywords from the list pass the negative keyword identifers
            // and negative keyword list (SharedEntity) identifer.

            ArrayOfBatchError partialErrors = CampaignManagementExampleHelper.deleteListItemsFromSharedList(listItemIds, negativeKeywordList).getPartialErrors();
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                outputStatusMessage("Deleted most recently added negative keywords from negative keyword list.\n");

            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(partialErrors);
            }

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            sharedListItems = CampaignManagementExampleHelper.getListItemsBySharedList(negativeKeywordList).getListItems();
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                outputStatusMessage("None\n");
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfSharedListItem(sharedListItems);
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

            AddListItemsToSharedListResponse addListItemsToSharedListResponse = CampaignManagementExampleHelper.addListItemsToSharedList(
                 sharedListItems,
                 negativeKeywordList);
            listItemIds = addListItemsToSharedListResponse.getListItemIds();

            outputStatusMessage(String.format("List items shared to NegativeKeywordList (ID=%d)\n\n", sharedEntityId));
            CampaignManagementExampleHelper.outputArrayOfSharedListItem(sharedListItems);
            CampaignManagementExampleHelper.outputArrayOflong(listItemIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addListItemsToSharedListResponse.getPartialErrors());

            outputStatusMessage("Negative keywords currently in NegativeKeywordList:");
            sharedListItems = CampaignManagementExampleHelper.getListItemsBySharedList(negativeKeywordList).getListItems();
            if (sharedListItems == null || sharedListItems.getSharedListItems().size() == 0)
            {
                outputStatusMessage("None\n");
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfSharedListItem(sharedListItems);
            }

            // You can update the name of the negative keyword list. 

            negativeKeywordList.setName("My Updated Negative Keyword List");
            negativeKeywordList.setType("NegativeKeywordList");

            ArrayOfSharedEntity sharedEntities = new ArrayOfSharedEntity();
            sharedEntities.getSharedEntities().add(negativeKeywordList);
            partialErrors = CampaignManagementExampleHelper.updateSharedEntities(sharedEntities).getPartialErrors();
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                outputStatusMessage(String.format("Updated Negative Keyword List Name to %s.\n\n", negativeKeywordList.getName()));
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(partialErrors);
            }

            // Get and print the negative keyword lists and return the list of identifiers.

            final java.lang.String sharedEntityType = "NegativeKeywordList";
            sharedEntities = CampaignManagementExampleHelper.getSharedEntitiesByAccountId(sharedEntityType).getSharedEntities();
            CampaignManagementExampleHelper.outputArrayOfSharedEntity(sharedEntities);
			
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

            partialErrors = CampaignManagementExampleHelper.setSharedEntityAssociations(associations).getPartialErrors();
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                outputStatusMessage(String.format("Associated CampaignId %d with Negative Keyword List Id %d.\n\n", 
                        campaignIds.getLongs().get(0), sharedEntityId));
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(partialErrors);
            }

            // Get and print the associations either by Campaign or NegativeKeywordList identifier.
            GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIdsResponse = 
                 CampaignManagementExampleHelper.getSharedEntityAssociationsByEntityIds(campaignIds, "Campaign", "NegativeKeywordList");
            CampaignManagementExampleHelper.outputArrayOfSharedEntityAssociation(getSharedEntityAssociationsByEntityIdsResponse.getAssociations());
            CampaignManagementExampleHelper.outputArrayOfBatchError(getSharedEntityAssociationsByEntityIdsResponse.getPartialErrors());

            // Get the associations of the most recently added shared entity.
            ArrayOflong associatedSharedEntityIds = new ArrayOflong();
            associatedSharedEntityIds.getLongs().add(sharedEntityIds.getLongs().get(sharedEntityIds.getLongs().size()-1));
            GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIdsResponse = 
                CampaignManagementExampleHelper.getSharedEntityAssociationsBySharedEntityIds("Campaign", associatedSharedEntityIds, "NegativeKeywordList");
            CampaignManagementExampleHelper.outputArrayOfSharedEntityAssociation(getSharedEntityAssociationsBySharedEntityIdsResponse.getAssociations());
            CampaignManagementExampleHelper.outputArrayOfBatchError(getSharedEntityAssociationsBySharedEntityIdsResponse.getPartialErrors());

            // Explicitly delete the association between the campaign and the negative keyword list.

            partialErrors = CampaignManagementExampleHelper.deleteSharedEntityAssociations(associations).getPartialErrors();
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                outputStatusMessage("Deleted NegativeKeywordList associations\n");
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(partialErrors);
            }

            // Delete the campaign and any remaining assocations. 
			
            CampaignManagementExampleHelper.deleteCampaigns(AccountId, campaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
			
            // DeleteCampaigns does not delete the negative keyword list from the account's library. 
            // Call the DeleteSharedEntities operation to delete the shared entities.

            partialErrors = CampaignManagementExampleHelper.deleteSharedEntities(sharedEntities).getPartialErrors();
            if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
            {
                 outputStatusMessage(String.format("Deleted Negative Keyword List (SharedEntity) Id %d\n\n", sharedEntityId));
            }
            else
            {
                CampaignManagementExampleHelper.outputArrayOfBatchError(partialErrors);
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
