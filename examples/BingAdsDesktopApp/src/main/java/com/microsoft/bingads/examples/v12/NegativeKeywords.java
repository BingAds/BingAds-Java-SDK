package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class NegativeKeywords extends ExampleBase {
    	
    public static void main(java.lang.String[] args) {
	 
        try
        {
            authorizationData = getAuthorizationData();

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // Add a campaign that will later be associated with negative keywords. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setDescription("Red shoes line.");
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns,
                    false);            
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);
            
            ArrayOflong campaignIds = new ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
			
            // You may choose to associate an exclusive set of negative keywords to an individual campaign 
            // or ad group. An exclusive set of negative keywords cannot be shared with other campaigns 
            // or ad groups. This example only associates negative keywords with a campaign.

            ArrayOfNegativeKeyword negativeKeywords = new ArrayOfNegativeKeyword();
            NegativeKeyword autoPhrase = new NegativeKeyword();
            autoPhrase.setMatchType(MatchType.PHRASE);
            autoPhrase.setText("auto");
            negativeKeywords.getNegativeKeywords().add(autoPhrase);
            NegativeKeyword autoExact = new NegativeKeyword();
            autoExact.setMatchType(MatchType.EXACT);
            autoExact.setText("auto");
            negativeKeywords.getNegativeKeywords().add(autoExact);
            ArrayOfEntityNegativeKeyword entityNegativeKeywords = new ArrayOfEntityNegativeKeyword();
            EntityNegativeKeyword entityNegativeKeyword = new EntityNegativeKeyword();
            entityNegativeKeyword.setEntityId(nullableCampaignIds.getLongs().get(0));
            entityNegativeKeyword.setEntityType("Campaign");
            entityNegativeKeyword.setNegativeKeywords(negativeKeywords);
            entityNegativeKeywords.getEntityNegativeKeywords().add(entityNegativeKeyword);

            outputStatusMessage("-----\nAddNegativeKeywordsToEntities:");
            AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntitiesResponse = CampaignManagementExampleHelper.addNegativeKeywordsToEntities(
                    entityNegativeKeywords);
            outputStatusMessage("Added an exclusive set of negative keywords to the Campaign.");
            outputStatusMessage("NegativeKeywordIds:");
            CampaignManagementExampleHelper.outputArrayOfIdCollection(addNegativeKeywordsToEntitiesResponse.getNegativeKeywordIds());
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addNegativeKeywordsToEntitiesResponse.getNestedPartialErrors());
            
            // If you attempt to delete a negative keyword without an identifier the operation will return
            // partial errors corresponding to the index of the negative keyword that was not deleted. 
            
            outputStatusMessage("-----\nDeleteNegativeKeywordsFromEntities:");
            ArrayOfBatchErrorCollection nestedPartialErrors = CampaignManagementExampleHelper.deleteNegativeKeywordsFromEntities(
                    entityNegativeKeywords).getNestedPartialErrors();
            outputStatusMessage("Attempt to DeleteNegativeKeywordsFromEntities without NegativeKeyword identifier partially fails by design.");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(nestedPartialErrors);       

            // Negative keywords can also be added and deleted from a shared negative keyword list. 
            // The negative keyword list can be shared or associated with multiple campaigns.
            // NegativeKeywordList inherits from SharedList which inherits from SharedEntity.

            NegativeKeywordList negativeKeywordList = new NegativeKeywordList();
            negativeKeywordList.setName("My Negative Keyword List " + System.currentTimeMillis());
            negativeKeywordList.setType("NegativeKeywordList");

            ArrayOfSharedListItem sharedListItems = new ArrayOfSharedListItem();
            NegativeKeyword carExact = new NegativeKeyword();
            carExact.setText("car");
            carExact.setType("NegativeKeyword");
            carExact.setMatchType(MatchType.EXACT);
            sharedListItems.getSharedListItems().add(carExact);
            NegativeKeyword carPhrase = new NegativeKeyword();
            carPhrase.setText("car");
            carPhrase.setType("NegativeKeyword");
            carPhrase.setMatchType(MatchType.PHRASE);
            sharedListItems.getSharedListItems().add(carPhrase);

            // Add a negative keyword list that can be shared.

            outputStatusMessage("-----\nAddSharedEntity:");
            AddSharedEntityResponse addSharedEntityResponse = CampaignManagementExampleHelper.addSharedEntity(
                    negativeKeywordList, 
                    sharedListItems);
            long sharedEntityId = addSharedEntityResponse.getSharedEntityId();
            ArrayOflong listItemIds = addSharedEntityResponse.getListItemIds();
            outputStatusMessage(String.format(
                "NegativeKeywordList added to account library and assigned identifer {0}",
                sharedEntityId)
            );

            // Negative keywords were added to the negative keyword list above. You can associate the 
            // shared list of negative keywords with a campaign with or without negative keywords. 
            // Shared negative keyword lists cannot be associated with an ad group. An ad group can only 
            // be assigned an exclusive set of negative keywords. 

            ArrayOfSharedEntityAssociation associations = new ArrayOfSharedEntityAssociation();
            SharedEntityAssociation association = new SharedEntityAssociation();
            association.setEntityId(nullableCampaignIds.getLongs().get(0));
            association.setEntityType("Campaign");
            association.setSharedEntityId(sharedEntityId);
            association.setSharedEntityType("NegativeKeywordList");
            associations.getSharedEntityAssociations().add(association);

            outputStatusMessage("-----\nSetSharedEntityAssociations:");
            ArrayOfBatchError partialErrors = CampaignManagementExampleHelper.setSharedEntityAssociations(
                associations).getPartialErrors();
            outputStatusMessage(String.format(
                "Associated CampaignId %d with Negative Keyword List Id %d.", 
                nullableCampaignIds.getLongs().get(0), sharedEntityId)
            );

            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d", deleteCampaignIds.getLongs().get(0))); 
            
            // DeleteCampaigns does not delete the negative keyword list from the account's library. 
            // Call the DeleteSharedEntities operation to delete the negative keyword list.

            outputStatusMessage("-----\nDeleteSharedEntities:");
            ArrayOfSharedEntity sharedEntities = new ArrayOfSharedEntity();
            negativeKeywordList.setId(sharedEntityId);
            sharedEntities.getSharedEntities().add(negativeKeywordList);
            partialErrors = CampaignManagementExampleHelper.deleteSharedEntities(
                    sharedEntities).getPartialErrors();
            outputStatusMessage(String.format("Deleted Negative Keyword List Id %d", sharedEntityId));		 
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
 }
