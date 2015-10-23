package com.microsoft.bingads.examples.v9;

import java.rmi.RemoteException;

import com.microsoft.bingads.campaignmanagement.*;

public class ExampleBaseV9 extends com.microsoft.bingads.examples.ExampleBase {
	
	public ExampleBaseV9(){}
	
	static void outputCampaign(Campaign campaign){
		if (campaign != null) {
			outputStatusMessage(String.format("BudgetType: %s", campaign.getBudgetType()));
            outputStatusMessage(String.format("CampaignType: %s", campaign.getCampaignType()));
            outputStatusMessage(String.format("DailyBudget: %s", campaign.getDailyBudget()));
            outputStatusMessage(String.format("Description: %s", campaign.getDescription()));
            outputStatusMessage(String.format("Id: %s", campaign.getId()));
            outputStatusMessage(String.format("MonthlyBudget: %s", campaign.getMonthlyBudget()));
            outputStatusMessage(String.format("Name: %s", campaign.getName()));
            outputStatusMessage(String.format("NativeBidAdjustment: %s", campaign.getNativeBidAdjustment()));
            outputStatusMessage("Settings: ");
            if (campaign.getSettings() != null)
            {
                for (Setting setting : campaign.getSettings().getSettings())
                {
                    if (setting instanceof ShoppingSetting)
                    {
                        outputStatusMessage("ShoppingSetting: ");
                        outputStatusMessage(String.format("Priority: %s", ((ShoppingSetting)setting).getPriority()));
                        outputStatusMessage(String.format("SalesCountryCode: %s", ((ShoppingSetting)setting).getSalesCountryCode()));
                        outputStatusMessage(String.format("StoreId: %s", ((ShoppingSetting)setting).getStoreId()));
                    }
                }
            }
            outputStatusMessage(String.format("Status: %s", campaign.getStatus()));
            outputStatusMessage(String.format("TimeZone: %s", campaign.getTimeZone()));
		}
	}
    
	static void outputAdGroup(AdGroup adGroup){
		if (adGroup != null) {
			if (adGroup.getAdDistribution() != null)
            {
                outputStatusMessage("AdDistribution: ");
                for (AdDistribution distribution : adGroup.getAdDistribution())
                {
                	outputStatusMessage(String.format("\t%s", distribution));
                }
            }
            outputStatusMessage(String.format("AdRotation: %s", 
            		adGroup.getAdRotation() != null ? adGroup.getAdRotation().getType() : null));
            outputStatusMessage(String.format("BiddingModel: %s", adGroup.getBiddingModel()));
            outputStatusMessage(String.format("ContentMatchBid: %s", 
            		adGroup.getContentMatchBid() != null ? adGroup.getContentMatchBid().getAmount() : null));
            if (adGroup.getEndDate() != null)
            {
                outputStatusMessage(String.format("EndDate: %s/%s/%s",
                adGroup.getEndDate().getMonth(),
                adGroup.getEndDate().getDay(),
                adGroup.getEndDate().getYear()));
            }
            outputStatusMessage(String.format("Id: %s", adGroup.getId()));
            outputStatusMessage(String.format("Language: %s", adGroup.getLanguage()));
            outputStatusMessage(String.format("Name: %s", adGroup.getName()));
            outputStatusMessage(String.format("NativeBidAdjustment: %s", adGroup.getNativeBidAdjustment()));
            outputStatusMessage(String.format("Network: %s", adGroup.getNetwork()));
            outputStatusMessage(String.format("PhraseMatchBid: %s", 
            		adGroup.getPhraseMatchBid() != null ? adGroup.getPhraseMatchBid().getAmount() : null));
            outputStatusMessage(String.format("PricingModel: %s", adGroup.getPricingModel()));
            if (adGroup.getStartDate() != null)
            {
                outputStatusMessage(String.format("StartDate: %s/%s/%s",
                adGroup.getStartDate().getMonth(),
                adGroup.getStartDate().getDay(),
                adGroup.getStartDate().getYear()));
            }
            outputStatusMessage(String.format("Status: %s", adGroup.getStatus()));
		}
	}
	
	static void outputProductAd(ProductAd productAd){
		if (productAd != null) {
			outputStatusMessage(String.format("DevicePreference: %s", productAd.getDevicePreference()));
            outputStatusMessage(String.format("EditorialStatus: %s", productAd.getEditorialStatus()));
            outputStatusMessage(String.format("Id: %s", productAd.getId()));
            outputStatusMessage(String.format("PromotionalText: %s", productAd.getPromotionalText()));
            outputStatusMessage(String.format("Status: %s", productAd.getStatus()));
		}
	}
	
	static void outputCampaignCriterionWithProductScope(CampaignCriterion campaignCriterion){
		if (campaignCriterion != null) {
			outputStatusMessage(String.format("BidAdjustment: %s", campaignCriterion.getBidAdjustment()));
            outputStatusMessage(String.format("CampaignId: %s", campaignCriterion.getCampaignId()));
            outputStatusMessage(String.format("CampaignCriterion Id: %s", campaignCriterion.getId()));
            outputStatusMessage(String.format("CampaignCriterion Type: %s", campaignCriterion.getType()));

            // Output the Campaign Management ProductScope Object
            outputProductScope((ProductScope)campaignCriterion.getCriterion());
		}
	}
	
	static void outputProductScope(ProductScope productScope){
		if (productScope != null) {
			outputStatusMessage("Product Conditions: ");
			for (ProductCondition condition : productScope.getConditions().getProductConditions())
            {
				outputStatusMessage(String.format("\tOperand: %s", condition.getOperand()));
				outputStatusMessage(String.format("\tAttribute: %s", condition.getAttribute()));
            }
		}
	}
	
	static void outputAdGroupCriterionWithProductPartition(AdGroupCriterion adGroupCriterion){
		if (adGroupCriterion != null) {
			outputStatusMessage(String.format("AdGroup Id: %s", adGroupCriterion.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupCriterion Id: %s", adGroupCriterion.getId()));
            outputStatusMessage(String.format("AdGroupCriterion Type: %s", adGroupCriterion.getType()));
            
            if(adGroupCriterion instanceof BiddableAdGroupCriterion){
            	outputStatusMessage(String.format("DestinationUrl: %s", ((BiddableAdGroupCriterion)adGroupCriterion).getDestinationUrl()));

                // Output the Campaign Management FixedBid Object
                outputFixedBid((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid());
            }
            
            // Output the Campaign Management ProductPartition Object
            outputProductPartition((ProductPartition)adGroupCriterion.getCriterion());
		}
	}
	
	static void outputProductPartition(ProductPartition productPartition){
		if (productPartition != null) {
			outputStatusMessage(String.format("AdGroup Id: %s", productPartition.getParentCriterionId()));
            outputStatusMessage(String.format("AdGroupCriterion Id: %s", productPartition.getPartitionType()));
            if (productPartition.getCondition() != null) {
    			outputStatusMessage("Condition: ");
    			outputStatusMessage(String.format("\tOperand: %s", productPartition.getCondition().getOperand()));
				outputStatusMessage(String.format("\tAttribute: %s", productPartition.getCondition().getAttribute()));
    		}
		}
	}
	
	static void outputFixedBid(FixedBid fixedBid){
		if (fixedBid != null && fixedBid.getBid() != null) {
			outputStatusMessage(String.format("Bid Amount: %s", fixedBid.getBid().getAmount()));
		}
	}
	
	// Prints the campaign identifiers, as well as any partial errors

    static void outputCampaignsWithPartialErrors(ArrayOfCampaign campaigns, ArrayOfNullableOflong campaignIds, ArrayOfBatchError partialErrors)
    {
        if (campaignIds == null)
        {
            return;
        }

        // Print the identifier of each successfully added campaign.

        for (int index = 0; index < campaigns.getCampaigns().size(); index++ )
        {
            // The array of keyword identifiers equals the size of the attempted campaigns. If the element 
            // is not null, the campaign at that index was added successfully and has a campaign identifier. 

            if (campaignIds.getLongs().get(index) != null)
            {
                outputStatusMessage(String.format("Campaign[%d] (Name:%s) successfully added and assigned CampaignId %d\n", 
                    index,  
                    campaigns.getCampaigns().get(index).getName(),
                    campaignIds.getLongs().get(index)));
            }
        }

        // Print the error details for any campaign not successfully added.
        // Note also that multiple error reasons may exist for the same attempted campaign.

        for (BatchError error : partialErrors.getBatchErrors())
        {
            // The index of the partial errors is equal to the index of the list
            // specified in the call to AddCampaigns.

            outputStatusMessage(String.format("\nCampaign[%d] (Name:%s) not added due to the following error:\n", 
           		 error.getIndex(), campaigns.getCampaigns().get(error.getIndex()).getName()));

            outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode()));
            }
        }

        outputStatusMessage("");
    }
    
    // Prints the ad group identifiers, as well as any partial errors

    static void outputAdGroupsWithPartialErrors(ArrayOfAdGroup adGroups, ArrayOfNullableOflong adGroupIds, ArrayOfBatchError partialErrors)
    {
        if (adGroupIds == null)
        {
            return;
        }

        // Print the identifier of each successfully added ad group.

        for (int index = 0; index < adGroups.getAdGroups().size(); index++ )
        {
            // The array of ad group identifiers equals the size of the attempted ad group. If the element 
            // is not null, the ad group at that index was added successfully and has an ad group identifier. 

            if (adGroupIds.getLongs().get(index) != null)
            {
                outputStatusMessage(String.format("AdGroup[%d] (Name:%s) successfully added and assigned AdGroupId %d\n", 
                    index,  
                    adGroups.getAdGroups().get(index).getName(),
                    adGroupIds.getLongs().get(index)));
            }
        }

        // Print the error details for any ad group not successfully added.
        // Note also that multiple error reasons may exist for the same attempted ad group.

        for (BatchError error : partialErrors.getBatchErrors())
        {
            // The index of the partial errors is equal to the index of the list
            // specified in the call to AddAdGroups.

            outputStatusMessage(String.format("\nAdGroup[%d] (Name:%s) not added due to the following error:\n", 
           		 error.getIndex(), adGroups.getAdGroups().get(error.getIndex()).getName()));

            outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode()));
            }
        }

        outputStatusMessage("");
    }

    // Prints the keyword identifiers, as well as any partial errors

    static void outputKeywordsWithPartialErrors(ArrayOfKeyword keywords, ArrayOfNullableOflong keywordIds, ArrayOfBatchError partialErrors)
    {
        if (keywordIds == null)
        {
            return;
        }

        // Print the identifier of each successfully added keyword.

        for (int index = 0; index < keywords.getKeywords().size(); index++ )
        {
            // The array of keyword identifiers equals the size of the attempted keywords. If the element 
            // is not null, the keyword at that index was added successfully and has a keyword identifier. 

            if (keywordIds.getLongs().get(index) != null)
            {
                outputStatusMessage(String.format("Keyword[%d] (Text:%s) successfully added and assigned KeywordId %d\n", 
                    index,  
                    keywords.getKeywords().get(index).getText(),
                    keywordIds.getLongs().get(index)));
            }
        }

        // Print the error details for any keyword not successfully added.
        // Note also that multiple error reasons may exist for the same attempted keyword.

        for (BatchError error : partialErrors.getBatchErrors())
        {
            // The index of the partial errors is equal to the index of the list
            // specified in the call to AddKeywords.

            outputStatusMessage(String.format("\nKeyword[%d] (Text:%s) not added due to the following error:\n", 
           		 error.getIndex(), keywords.getKeywords().get(error.getIndex()).getText()));

            outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode()));
            }
        }

        outputStatusMessage("");
    }

    // Prints the ad identifiers, as well as any partial errors

    static void outputAdsWithPartialErrors(ArrayOfAd ads, ArrayOfNullableOflong adIds, ArrayOfBatchError partialErrors)
    {
        if (adIds == null)
        {
            return;
        }

        java.lang.String[] attributeValues = new java.lang.String[ads.getAds().size()];

        for (int index = 0; index < ads.getAds().size(); index++ )
        {
            // Determine the type of ad. Prepare the corresponding attribute value to be printed,
            // both for successful new ads and partial errors. 

            if (ads.getAds().get(index) instanceof TextAd)
            {
                attributeValues[index] = "Title:" + ((TextAd)ads.getAds().get(index)).getTitle();
            }
            else if (ads.getAds().get(index) instanceof ProductAd)
            {
                attributeValues[index] = "PromotionalText:" + ((ProductAd)ads.getAds().get(index)).getPromotionalText();
            }
            else
            {
                attributeValues[index] = "Unknown Ad Type";
            }

            // The array of ad identifiers equals the size of the attempted ads. If the element 
            // is not null, the ad at that index was added successfully and has an ad identifier. 

            if (adIds.getLongs().get(index) != null)
            {
                outputStatusMessage(String.format("Ad[%d] (%s) successfully added and assigned AdId %d\n", 
                    index, 
                    attributeValues[index], 
                    adIds.getLongs().get(index)));
            }
        }

        // Print the error details for any ad not successfully added.
        // Note also that multiple error reasons may exist for the same attempted ad.

        for (BatchError error : partialErrors.getBatchErrors())
        {
            // The index of the partial errors is equal to the index of the list
            // specified in the call to AddAds.

            outputStatusMessage(String.format("\nAd[%d] (%s) not added due to the following error:\n", error.getIndex(), attributeValues[error.getIndex()]));

            outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %d\n", ((EditorialError)(error)).getReasonCode()));
            }
        }
        outputStatusMessage("");
    }
    
    static void outputAppAdExtension(AppAdExtension extension){
		if (extension != null) {
			outputStatusMessage(String.format("AppPlatform: %s\n", extension.getAppPlatform()));
			outputStatusMessage(String.format("AppStoreId: %s\n", extension.getAppStoreId()));
			outputStatusMessage(String.format("DestinationUrl: %s\n", extension.getDestinationUrl()));
			outputStatusMessage(String.format("DevicePreference: %s\n", extension.getDevicePreference()));
			outputStatusMessage(String.format("DisplayText: %s\n", extension.getDisplayText()));
			outputStatusMessage(String.format("Id: %s\n", extension.getId()));
			outputStatusMessage(String.format("Status: %s\n", extension.getStatus()));
			outputStatusMessage(String.format("Version: %s\n", extension.getVersion()));
		}
	}
    
    static void outputCallAdExtension(CallAdExtension extension){
		if (extension != null) {
			outputStatusMessage(String.format("Phone number: %s\n", extension.getPhoneNumber()));
            outputStatusMessage(String.format("Country: %s\n", extension.getCountryCode()));
            outputStatusMessage(String.format("Is only clickable item: %s\n", extension.getIsCallOnly()));
		}
	}
	
	static void outputLocationAdExtension(LocationAdExtension extension){
		if (extension != null) {
			if(extension.getAddress() != null){
				outputStatusMessage(String.format("Street: %s\n", extension.getAddress().getStreetAddress()));
	            outputStatusMessage(String.format("City: %s\n", extension.getAddress().getCityName()));
	            outputStatusMessage(String.format("State: %s\n", extension.getAddress().getProvinceName()));
	            outputStatusMessage(String.format("Country: %s\n", extension.getAddress().getCountryCode()));
	            outputStatusMessage(String.format("Zip code: %s\n", extension.getAddress().getPostalCode()));
			}
			outputStatusMessage(String.format("Company name: %s\n", extension.getCompanyName()));
            outputStatusMessage(String.format("Phone number: %s\n", extension.getPhoneNumber()));
            outputStatusMessage(String.format("Business coordinates determined?: %s\n", extension.getGeoCodeStatus()));
            if(extension.getGeoPoint() != null){
            	outputStatusMessage("GeoPoint: ");
            	outputStatusMessage(String.format("LatitudeInMicroDegrees: %s\n", 
            			extension.getGeoPoint().getLatitudeInMicroDegrees()));
            	outputStatusMessage(String.format("LongitudeInMicroDegrees: %s\n", 
            			extension.getGeoPoint().getLongitudeInMicroDegrees()));
            }
            outputStatusMessage(String.format("Map icon ID: %s\n", extension.getIconMediaId()));
            outputStatusMessage(String.format("Business image ID: %s\n", extension.getImageMediaId()));
		}
	}
	
	static void outputSiteLinksAdExtension(SiteLinksAdExtension extension){
		if (extension != null && extension.getSiteLinks() != null) {
			for (SiteLink sLink : extension.getSiteLinks().getSiteLinks())
            {
                outputStatusMessage(String.format("  Display URL: %s\n", sLink.getDisplayText()));
                outputStatusMessage(String.format("  Destination URL: %s\n", sLink.getDestinationUrl()));
            }
		}
	}
	
	static void outputSiteLinks(Iterable<SiteLink> siteLinks){
		if (siteLinks != null) {
			for (SiteLink siteLink : siteLinks)
            {
                outputStatusMessage(String.format("  Display URL: %s\n", siteLink.getDisplayText()));
                outputStatusMessage(String.format("  Destination URL: %s\n", siteLink.getDestinationUrl()));
            }
		}
	}
	
    // Outputs the negative keyword identifiers added to each campaign or ad group entity. 
    // The IdCollection items are available by calling AddNegativeKeywordsToEntities.  

    static void outputNegativeKeywordIds(ArrayOfIdCollection idCollections)
    {
        if (idCollections == null)
        {
            return;
        }

        for (int index = 0; index < idCollections.getIdCollections().size(); index++)
        {
            outputStatusMessage(String.format("NegativeKeyword Ids at entity index %d:\n\n", index));
            for (long id : idCollections.getIdCollections().get(index).getIds().getLongs())
            {
                outputStatusMessage(String.format("\tId: %d\n\n", id));
            }
        }
    }

    // Outputs the negative keywords  

    static void outputNegativeKeywords(ArrayOfNegativeKeyword negativeKeywords)
    {
        if (negativeKeywords == null)
        {
            return;
        }

        for (NegativeKeyword negativeKeyword : negativeKeywords.getNegativeKeywords())
        {
            outputStatusMessage(String.format("\tNegativeKeyword Text: %s\n", negativeKeyword.getText()));
            outputStatusMessage(String.format("\tId: %d\n", negativeKeyword.getId()));
            outputStatusMessage(String.format("\tMatchType: %s\n\n", negativeKeyword.getMatchType()));
        }
    }
    
    // Outputs the shared list items e.g. negative keywords  
    
    static void outputSharedListItems(ArrayOfSharedListItem sharedListItems)
    {
        if (sharedListItems == null)
        {
            return;
        }

        for (SharedListItem sharedListItem : sharedListItems.getSharedListItems())
        {
            if(sharedListItem instanceof NegativeKeyword)
            {
                outputStatusMessage(String.format("\tNegativeKeyword Text: %s\n", ((NegativeKeyword)sharedListItem).getText()));
                outputStatusMessage(String.format("\tId: %d\n", ((NegativeKeyword)sharedListItem).getId()));
                outputStatusMessage(String.format("\tMatchType: %s\n\n", ((NegativeKeyword)sharedListItem).getMatchType()));
            }
        }
    }
    
    // Outputs a list of EntityNegativeKeyword objects  

    static void outputEntityNegativeKeywords(ArrayOfEntityNegativeKeyword entityNegativeKeywords)
    {
        if (entityNegativeKeywords == null)
        {
            return;
        }

        outputStatusMessage("EntityNegativeKeyword items:\n");
        for (EntityNegativeKeyword entityNegativeKeyword : entityNegativeKeywords.getEntityNegativeKeywords())
        {
            outputStatusMessage(String.format("\tEntityId: %d\n", entityNegativeKeyword.getEntityId()));
            outputStatusMessage(String.format("\tEntityType: %s\n\n", entityNegativeKeyword.getEntityType()));
            outputNegativeKeywords(entityNegativeKeyword.getNegativeKeywords());
        }
    }

    // Outputs a list of EntityNegativeKeyword objects  

    static void outputSharedEntityIdentifiers(ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
    {
   	 if (sharedEntities != null)
        {
   		 for (int index = 0; index < sharedEntities.getSharedEntities().size(); index++)
            {
                SharedEntity sharedEntity = sharedEntities.getSharedEntities().get(index);
                if (sharedEntity.getId() != null)
                {
                    outputStatusMessage(String.format("SharedEntity[%d] (%s) has SharedEntity Id %d.\n\n",
                                      index,
                                      sharedEntities.getSharedEntities().get(index).getName(),
                                      sharedEntities.getSharedEntities().get(index).getId()));
                }
            }
        }
    }

    // Outputs a list of BatchError objects that represent partial errors while managing negative keywords.

    static void outputPartialErrors(ArrayOfBatchError partialErrors)
    {
        if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
        {
            return;
        }

        outputStatusMessage("BatchError (PartialErrors) items:\n");
        for (BatchError error : partialErrors.getBatchErrors())
        {
            outputStatusMessage(String.format("\tIndex: %d\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %d\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %d\n\n", ((EditorialError)(error)).getReasonCode()));
            }
        }
    }

    // Outputs the list item identifiers, as well as any partial errors  

    static void outputNegativeKeywordIdsWithPartialErrors(
           long sharedListId,
           ArrayOfSharedListItem sharedListItems, 
           ArrayOflong sharedListItemIds, 
           ArrayOfBatchError partialErrors)
    {
        if (sharedListItemIds == null)
        {
            return;
        }

        for (int index = 0; index < sharedListItems.getSharedListItems().size(); index++)
        {
            // Determine if the SharedListItem is a NegativeKeyword.
            if (sharedListItems.getSharedListItems().get(index) instanceof NegativeKeyword)
            {
                // Determine if the corresponding index has a valid identifier
                if(sharedListItemIds.getLongs().get(index) > 0)
                {
                    outputStatusMessage(String.format("NegativeKeyword[%d] (%s) successfully added to NegativeKeywordList (%d) and assigned Negative Keyword Id %d.\n",
                                  index,
                                  ((NegativeKeyword)(sharedListItems.getSharedListItems().get(index))).getText(),
                                  sharedListId,
                                  sharedListItemIds.getLongs().get(index)));
                }
            }
            else
            {
                outputStatusMessage("SharedListItem is not a NegativeKeyword.");
            }
        }

        outputStatusMessage("");

        outputPartialErrors(partialErrors);
    }

    // Outputs a list of SharedEntityAssociation objects.

    static void outputSharedEntityAssociations(ArrayOfSharedEntityAssociation associations)
    {
        if (associations == null || associations.getSharedEntityAssociations().size() == 0)
        {
            return;
        }

        outputStatusMessage("SharedEntityAssociation items:\n");
        for (SharedEntityAssociation sharedEntityAssociation : associations.getSharedEntityAssociations())
        {
            outputStatusMessage(String.format("\tEntityId: %d\n", sharedEntityAssociation.getEntityId()));
            outputStatusMessage(String.format("\tEntityType: %s\n", sharedEntityAssociation.getEntityType()));
            outputStatusMessage(String.format("\tSharedEntityId: %d\n", sharedEntityAssociation.getSharedEntityId()));
            outputStatusMessage(String.format("\tSharedEntityType: %s\n\n", sharedEntityAssociation.getSharedEntityType()));
        }
    }

    // Outputs a list of BatchErrorCollection objects that represent partial errors while managing 
    // negative keywords.

    static void outputNestedPartialErrors(ArrayOfBatchErrorCollection nestedPartialErrors)
    {
        if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
        {
            return;
        }

        outputStatusMessage("BatchErrorCollection (NestedPartialErrors) items:\n");
        for (BatchErrorCollection collection : nestedPartialErrors.getBatchErrorCollections())
        {
            // The top level list index corresponds to the campaign or ad group index identifier.
            if (collection != null)
            {
                if (collection.getCode() != null)
                {
                    outputStatusMessage(String.format("\tIndex: %d\n", collection.getIndex()));
                    outputStatusMessage(String.format("\tCode: %d\n", collection.getCode()));
                    outputStatusMessage(String.format("\tErrorCode: %s\n", collection.getErrorCode()));
                    outputStatusMessage(String.format("\tMessage: %s\n\n", collection.getMessage()));
                }

                outputPartialErrors(collection.getBatchErrors());
            }
        }         
    }
}
