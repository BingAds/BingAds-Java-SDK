package com.microsoft.bingads.examples.v10;

import java.rmi.RemoteException;

import com.microsoft.bingads.v10.campaignmanagement.*;

public class ExampleBase extends com.microsoft.bingads.examples.ExampleBase {
	
	public ExampleBase(){}
	
	static void outputCampaign(Campaign campaign){
            if (campaign != null) {
                outputBiddingScheme(campaign.getBiddingScheme());
                outputStatusMessage(String.format("BudgetId: %s", campaign.getBudgetId()));
                outputStatusMessage(String.format("BudgetType: %s", campaign.getBudgetType()));
                if(campaign.getCampaignType() != null){
                    outputStatusMessage(String.format("CampaignType: %s", campaign.getCampaignType().toArray()[0]));
                }
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
        
        
        static void outputBudget(Budget budget)
        {
            if (budget != null)
            {
                outputStatusMessage(String.format("Amount: %s", budget.getAmount()));
                outputStatusMessage(String.format("AssociationCount: %s", budget.getAssociationCount()));
                outputStatusMessage(String.format("BudgetType: %s", budget.getBudgetType()));
                outputStatusMessage(String.format("Id: %s", budget.getId()));
                outputStatusMessage(String.format("Name: %s\n", budget.getName()));
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
                outputBiddingScheme(adGroup.getBiddingScheme());
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
                outputStatusMessage(String.format("PricingModel: %s", adGroup.getPricingModel()));
                outputStatusMessage(String.format("SearchBid: %s", 
                            adGroup.getSearchBid() != null ? adGroup.getSearchBid().getAmount() : null));
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
    	if (campaigns == null || campaignIds == null || campaigns.getCampaigns().size() != campaignIds.getLongs().size())
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
    	if (adGroups == null || adGroupIds == null || adGroups.getAdGroups().size() != adGroupIds.getLongs().size())
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
    
    static void outputKeyword(Keyword keyword){
        if (keyword != null) {
                outputStatusMessage(String.format("Bid.Amount: %s", keyword.getBid() != null ? keyword.getBid().getAmount() : 0)
            );
            outputBiddingScheme(keyword.getBiddingScheme());
            outputStatusMessage(String.format("DestinationUrl: %s", keyword.getDestinationUrl()));
            outputStatusMessage(String.format("EditorialStatus: %s", keyword.getEditorialStatus()));
            outputStatusMessage("FinalMobileUrls: ");
            if (keyword.getFinalMobileUrls() != null)
            {
                for(java.lang.String finalMobileUrl : keyword.getFinalMobileUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalMobileUrl));
                }
            }

            outputStatusMessage("FinalUrls: ");
            if (keyword.getFinalUrls() != null)
            {
                for(java.lang.String finalUrl : keyword.getFinalUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalUrl));
                }
            }
            outputStatusMessage("ForwardCompatibilityMap: ");
            if (keyword.getForwardCompatibilityMap() != null)
            {
                for(KeyValuePairOfstringstring pair : keyword.getForwardCompatibilityMap().getKeyValuePairOfstringstrings())
                {
                    outputStatusMessage(String.format("Key: %s", pair.getKey()));
                    outputStatusMessage(String.format("Value: %s", pair.getValue()));
                }
            }
            outputStatusMessage(String.format("Id: %s", keyword.getId()));
            outputStatusMessage(String.format("MatchType: %s", keyword.getMatchType()));
            outputStatusMessage(String.format("Param1: %s", keyword.getParam1()));
            outputStatusMessage(String.format("Param2: %s", keyword.getParam2()));
            outputStatusMessage(String.format("Param3: %s", keyword.getParam3()));
            outputStatusMessage(String.format("Status: %s", keyword.getStatus()));
            outputStatusMessage(String.format("Text: %s", keyword.getText()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", keyword.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters: ");
            if (keyword.getUrlCustomParameters() != null && keyword.getUrlCustomParameters().getParameters() != null)
            {
                for(CustomParameter customParameter : keyword.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
        }
    }

    // Prints the keyword identifiers, as well as any partial errors

    static void outputKeywordsWithPartialErrors(ArrayOfKeyword keywords, ArrayOfNullableOflong keywordIds, ArrayOfBatchError partialErrors)
    {
    	if (keywords == null || keywordIds == null || keywords.getKeywords().size() != keywordIds.getLongs().size())
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
    	if (ads == null || adIds == null || ads.getAds().size() != adIds.getLongs().size())
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
                outputStatusMessage(String.format("DestinationUrl: %s", ((TextAd)ads.getAds().get(index)).getDestinationUrl()));
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
                
                Ad ad = ads.getAds().get(index);
                
                outputStatusMessage("FinalMobileUrls: ");
                if (ad.getFinalMobileUrls() != null)
                {
                    for (java.lang.String finalMobileUrl : ad.getFinalMobileUrls().getStrings())
                    {
                        outputStatusMessage(String.format("\t%s", finalMobileUrl));
                    }
                }

                outputStatusMessage("FinalUrls: ");
                if (ad.getFinalUrls() != null)
                {
                    for (java.lang.String finalUrl : ad.getFinalUrls().getStrings())
                    {
                        outputStatusMessage(String.format("\t%s", finalUrl));
                    }
                }
                outputStatusMessage(String.format("TrackingUrlTemplate: %s", ad.getTrackingUrlTemplate()));
                outputStatusMessage("UrlCustomParameters: ");
                if (ad.getUrlCustomParameters() != null &&
                		ad.getUrlCustomParameters().getParameters() != null)
                {
                    for (CustomParameter customParameter : ad.getUrlCustomParameters().getParameters().getCustomParameters())
                    {
                    	outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    	outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                    }
                }
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
    
    static void outputAdExtensionsWithEditorialReasons(
            ArrayOfAdExtension adExtensions, 
            ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection){
        
        int index = 0;                     

        for (AdExtension extension : adExtensions.getAdExtensions())
        {
            if (extension == null || extension.getId() == null)
            {
                outputStatusMessage("Extension is null or invalid.");
            }
            else
            {
                if (extension instanceof AppAdExtension)
                {
                    outputAppAdExtension((AppAdExtension)extension);
                }
                else if (extension instanceof CallAdExtension)
                {
                    outputCallAdExtension((CallAdExtension)extension);
                }
                else if (extension instanceof CalloutAdExtension)
                {
                    outputCalloutAdExtension((CalloutAdExtension)extension);
                }
                else if (extension instanceof ImageAdExtension)
                {
                    outputImageAdExtension((ImageAdExtension)extension);
                }
                else if (extension instanceof LocationAdExtension)
                {
                    outputLocationAdExtension((LocationAdExtension)extension);
                }
                else if (extension instanceof ReviewAdExtension)
                {
                    outputReviewAdExtension((ReviewAdExtension)extension);
                }
                else if (extension instanceof SiteLinksAdExtension)
                {
                    outputSiteLinksAdExtension((SiteLinksAdExtension)extension);
                }
                else if (extension instanceof Sitelink2AdExtension)
                {
                    outputSitelink2AdExtension((Sitelink2AdExtension)extension);
                }
                else if (extension instanceof StructuredSnippetAdExtension)
                {
                    outputStructuredSnippetAdExtension((StructuredSnippetAdExtension)extension);
                }
                else
                {
                    outputStatusMessage("Unknown extension type");
                }

                if (adExtensionEditorialReasonCollection != null 
                        && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().size() > 0
                        && adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index) != null)
                {
                    outputStatusMessage("\n");

                    // Print any editorial rejection reasons for the corresponding extension. This sample 
                    // assumes the same list index for adExtensions and adExtensionEditorialReasonCollection
                    // as defined above.

                    for (AdExtensionEditorialReason adExtensionEditorialReason : 
                            adExtensionEditorialReasonCollection.getAdExtensionEditorialReasonCollections().get(index).getReasons().getAdExtensionEditorialReasons())
                    {
                        if (adExtensionEditorialReason != null &&
                            adExtensionEditorialReason.getPublisherCountries() != null)
                        {
                            outputStatusMessage("Editorial Rejection Location: " + adExtensionEditorialReason.getLocation());
                            outputStatusMessage("Editorial Rejection PublisherCountries: ");
                            for (java.lang.String publisherCountry : adExtensionEditorialReason.getPublisherCountries().getStrings())
                            {
                                    outputStatusMessage("  " + publisherCountry);
                            }
                            outputStatusMessage("Editorial Rejection ReasonCode: " + adExtensionEditorialReason.getReasonCode());
                            outputStatusMessage("Editorial Rejection Term: " + adExtensionEditorialReason.getTerm());
                            outputStatusMessage("\n");
                        }
                    }
                }
            }

            outputStatusMessage("");

            index++;
        }
    }
    
    static void outputAdExtension(AdExtension extension){
        if (extension != null) {
            outputStatusMessage(String.format("Id: %s", extension.getId()));
            outputStatusMessage(String.format("Type: %s", extension.getType()));
            outputStatusMessage("ForwardCompatibilityMap: ");
            if(extension.getForwardCompatibilityMap() != null){
                for (KeyValuePairOfstringstring pair : extension.getForwardCompatibilityMap().getKeyValuePairOfstringstrings()){
                    outputStatusMessage(String.format("Key: %s", pair.getKey()));
                    outputStatusMessage(String.format("Value: %s", pair.getValue()));
                }
            }
            outputStatusMessage("Scheduling: ");
            if (extension.getScheduling() != null)
            {
                outputSchedule(extension.getScheduling());
            }
            outputStatusMessage(String.format("Status: %s", extension.getStatus()));
            outputStatusMessage(String.format("Version: %s", extension.getVersion()));
        }
    }
    
    static void outputSchedule(Schedule schedule)
    {
        if (schedule != null)
        {
            if (schedule.getDayTimeRanges() != null) 
            {
                for (DayTime dayTime : schedule.getDayTimeRanges().getDayTimes())
                {
                    outputStatusMessage(String.format("Day: %s", dayTime.getDay()));
                    outputStatusMessage(String.format("EndHour: %s", dayTime.getEndHour()));
                    outputStatusMessage(String.format("EndMinute: %s", dayTime.getEndMinute()));
                    outputStatusMessage(String.format("StartHour: %s", dayTime.getStartHour()));
                    outputStatusMessage(String.format("StartMinute: %s", dayTime.getStartMinute()));
                }
            }
            if (schedule.getEndDate() != null)
            {
                outputStatusMessage(String.format("EndDate: %s/%s/%s",
                schedule.getEndDate().getMonth(),
                schedule.getEndDate().getDay(),
                schedule.getEndDate().getYear()));
            }
            if (schedule.getStartDate() != null)
            {
                outputStatusMessage(String.format("StartDate: %s/%s/%s",
                schedule.getStartDate().getMonth(),
                schedule.getStartDate().getDay(),
                schedule.getStartDate().getYear()));
            }
            boolean useSearcherTimeZone = 
                (schedule.getUseSearcherTimeZone() != null && (boolean)schedule.getUseSearcherTimeZone()) ? true : false;
            outputStatusMessage(String.format("UseSearcherTimeZone: %s", useSearcherTimeZone));
        }
    }
    
    static void outputAppAdExtension(AppAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the AppAdExtension
            outputStatusMessage(String.format("AppPlatform: %s", extension.getAppPlatform()));
            outputStatusMessage(String.format("AppStoreId: %s", extension.getAppStoreId()));
            outputStatusMessage(String.format("DestinationUrl: %s", extension.getDestinationUrl()));
            outputStatusMessage(String.format("DevicePreference: %s", extension.getDevicePreference()));
            outputStatusMessage(String.format("DisplayText: %s", extension.getDisplayText()));
            outputStatusMessage("FinalMobileUrls: ");
            if (extension.getFinalMobileUrls() != null)
            {
                for (java.lang.String finalMobileUrl : extension.getFinalMobileUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalMobileUrl));
                }
            }
            outputStatusMessage("FinalUrls: ");
            if (extension.getFinalUrls() != null)
            {
                for (java.lang.String finalUrl : extension.getFinalUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalUrl));
                }
            }
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", extension.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters: ");
            if (extension.getUrlCustomParameters() != null &&
                            extension.getUrlCustomParameters().getParameters() != null)
            {
                for (CustomParameter customParameter : extension.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
        }
    }
    
    static void outputCallAdExtension(CallAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the CallAdExtension
            outputStatusMessage(String.format("CountryCode: %s", extension.getCountryCode()));
            outputStatusMessage(String.format("DevicePreference: %s", extension.getDevicePreference()));
            outputStatusMessage(String.format("IsCallOnly: %s", extension.getIsCallOnly()));
            outputStatusMessage(String.format("IsCallTrackingEnabled: %s", extension.getIsCallTrackingEnabled()));
            outputStatusMessage(String.format("PhoneNumber: %s", extension.getPhoneNumber()));
            outputStatusMessage(String.format("RequireTollFreeTrackingNumber: %s", extension.getRequireTollFreeTrackingNumber()));
        }
    }
    
    static void outputCalloutAdExtension(CalloutAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the CalloutAdExtension
            outputStatusMessage(String.format("Callout Text: %s", extension.getText()));
        }
    }
    
    static void outputImageAdExtension(ImageAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the ImageAdExtension
            outputStatusMessage(String.format("AppPlatform: %s", extension.getAlternativeText()));
            outputStatusMessage(String.format("AppStoreId: %s", extension.getDescription()));
            outputStatusMessage(String.format("DestinationUrl: %s", extension.getDestinationUrl()));
            outputStatusMessage("FinalMobileUrls: ");
            if (extension.getFinalMobileUrls() != null)
            {
                for (java.lang.String finalMobileUrl : extension.getFinalMobileUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalMobileUrl));
                }
            }
            outputStatusMessage("FinalUrls: ");
            if (extension.getFinalUrls() != null)
            {
                for (java.lang.String finalUrl : extension.getFinalUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalUrl));
                }
            }
            outputStatusMessage("ImageMediaIds: ");
            if (extension.getFinalUrls() != null)
            {
                for (java.lang.Long id : extension.getImageMediaIds().getLongs())
                {
                    outputStatusMessage(String.format("\t%s", id));
                }
            }
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", extension.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters: ");
            if (extension.getUrlCustomParameters() != null &&
                            extension.getUrlCustomParameters().getParameters() != null)
            {
                for (CustomParameter customParameter : extension.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
        }
    }
	
    static void outputLocationAdExtension(LocationAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the LocationAdExtension
            outputStatusMessage("Address: ");
            if(extension.getAddress() != null){
                outputStatusMessage(String.format("Street: %s", extension.getAddress().getStreetAddress()));
                outputStatusMessage(String.format("City: %s", extension.getAddress().getCityName()));
                outputStatusMessage(String.format("State: %s", extension.getAddress().getProvinceName()));
                outputStatusMessage(String.format("Country: %s", extension.getAddress().getCountryCode()));
                outputStatusMessage(String.format("Zip code: %s", extension.getAddress().getPostalCode()));
            }
            outputStatusMessage(String.format("Company name: %s", extension.getCompanyName()));
            outputStatusMessage(String.format("Phone number: %s", extension.getPhoneNumber()));
            outputStatusMessage(String.format("Business coordinates determined?: %s", extension.getGeoCodeStatus()));
            if(extension.getGeoPoint() != null){
                outputStatusMessage("GeoPoint: ");
                outputStatusMessage(String.format("\tLatitudeInMicroDegrees: %s", 
                                extension.getGeoPoint().getLatitudeInMicroDegrees()));
                outputStatusMessage(String.format("\tLongitudeInMicroDegrees: %s", 
                                extension.getGeoPoint().getLongitudeInMicroDegrees()));
            }
            outputStatusMessage(String.format("Map icon ID: %s", extension.getIconMediaId()));
            outputStatusMessage(String.format("Business image ID: %s", extension.getImageMediaId()));
        }
    }

    static void outputReviewAdExtension(ReviewAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the ReviewAdExtension
            outputStatusMessage(String.format("IsExact: %s", extension.getIsExact()));
            outputStatusMessage(String.format("Source: %s", extension.getSource()));
            outputStatusMessage(String.format("Text: %s", extension.getText()));
            outputStatusMessage(String.format("Url: %s", extension.getUrl()));
        }
    }
    
    static void outputStructuredSnippetAdExtension(StructuredSnippetAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the StructuredSnippetAdExtension
            outputStatusMessage(String.format("Header: %s", extension.getHeader()));
            outputStatusMessage("Values: ");
            if (extension.getValues() != null)
            {
                for (java.lang.String value : extension.getValues().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", value));
                }
            }
        }
    }

    static void outputSiteLinksAdExtension(SiteLinksAdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the SiteLinksAdExtension
            if(extension.getSiteLinks() != null){
                    outputSiteLinks(extension.getSiteLinks().getSiteLinks());
            }	
        }
    }
    
    static void outputSitelink2AdExtension(Sitelink2AdExtension extension){
        if (extension != null) {
            // Output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // Output properties that are specific to the Sitelink2AdExtension
            outputStatusMessage(String.format("Description1: %s", extension.getDescription1()));
            outputStatusMessage(String.format("Description2: %s", extension.getDescription2()));
            outputStatusMessage(String.format("DestinationUrl: %s", extension.getDestinationUrl()));
            outputStatusMessage(String.format("DevicePreference: %s", extension.getDevicePreference()));
            outputStatusMessage(String.format("DisplayText: %s", extension.getDisplayText()));
            outputStatusMessage("FinalMobileUrls: ");
            if (extension.getFinalMobileUrls() != null)
            {
                for (java.lang.String finalMobileUrl : extension.getFinalMobileUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalMobileUrl));
                }
            }
            outputStatusMessage("FinalUrls: ");
            if (extension.getFinalUrls() != null)
            {
                for (java.lang.String finalUrl : extension.getFinalUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalUrl));
                }
            }
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", extension.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters: ");
            if (extension.getUrlCustomParameters() != null &&
                            extension.getUrlCustomParameters().getParameters() != null)
            {
                for (CustomParameter customParameter : extension.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
            outputStatusMessage("");
        }
    }

    static void outputSiteLinks(Iterable<SiteLink> siteLinks){
        if (siteLinks != null) {
            for (SiteLink siteLink : siteLinks)
            {
                outputStatusMessage(String.format("Description1: %s", siteLink.getDescription1()));
                outputStatusMessage(String.format("Description2: %s", siteLink.getDescription2()));
                outputStatusMessage(String.format("DestinationUrl: %s", siteLink.getDestinationUrl()));
                outputStatusMessage(String.format("DevicePreference: %s", siteLink.getDevicePreference()));
                outputStatusMessage(String.format("DisplayText: %s", siteLink.getDisplayText()));
                outputStatusMessage("FinalMobileUrls: ");
                if (siteLink.getFinalMobileUrls() != null)
                {
                    for (java.lang.String finalMobileUrl : siteLink.getFinalMobileUrls().getStrings())
                    {
                        outputStatusMessage(String.format("\t%s", finalMobileUrl));
                    }
                }
                outputStatusMessage("FinalUrls: ");
                if (siteLink.getFinalUrls() != null)
                {
                    for (java.lang.String finalUrl : siteLink.getFinalUrls().getStrings())
                    {
                        outputStatusMessage(String.format("\t%s", finalUrl));
                    }
                }
                outputStatusMessage(String.format("TrackingUrlTemplate: %s", siteLink.getTrackingUrlTemplate()));
                outputStatusMessage("UrlCustomParameters: ");
                if (siteLink.getUrlCustomParameters() != null &&
                                siteLink.getUrlCustomParameters().getParameters() != null)
                {
                    for (CustomParameter customParameter : siteLink.getUrlCustomParameters().getParameters().getCustomParameters())
                    {
                        outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                        outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                    }
                }
                outputStatusMessage("");
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
    
    static void outputRemarketingList(RemarketingList remarketingList){
        if (remarketingList != null) {
            outputStatusMessage(String.format("Description: %s", remarketingList.getDescription()));
            outputStatusMessage("ForwardCompatibilityMap:");
            if(remarketingList.getForwardCompatibilityMap() != null){
                for (KeyValuePairOfstringstring pair : remarketingList.getForwardCompatibilityMap().getKeyValuePairOfstringstrings()){
                    outputStatusMessage(String.format("Key: %s", pair.getKey()));
                    outputStatusMessage(String.format("Value: %s", pair.getValue()));
                }
            }
            outputStatusMessage(String.format("Id: %s", remarketingList.getId()));
            outputStatusMessage(String.format("MembershipDuration: %s", remarketingList.getMembershipDuration()));
            outputStatusMessage(String.format("Name: %s", remarketingList.getName()));
            outputStatusMessage(String.format("ParentId: %s", remarketingList.getParentId()));
            outputStatusMessage(String.format("Scope: %s", remarketingList.getScope()));
            outputStatusMessage(String.format("TagId: %s\n", remarketingList.getTagId()));
        }
    }
    
    static void outputAdGroupRemarketingListAssociation(AdGroupRemarketingListAssociation adGroupRemarketingListAssociation){
        if (adGroupRemarketingListAssociation != null) {
            outputStatusMessage(String.format("AdGroupId: %s", adGroupRemarketingListAssociation.getAdGroupId()));
            outputStatusMessage(String.format("BidAdjustment: %s", adGroupRemarketingListAssociation.getBidAdjustment()));
            outputStatusMessage(String.format("Id: %s", adGroupRemarketingListAssociation.getId()));
            outputStatusMessage(String.format("RemarketingListId: %s", adGroupRemarketingListAssociation.getRemarketingListId()));
            outputStatusMessage(String.format("Status: %s\n", adGroupRemarketingListAssociation.getStatus()));
        }
    }
    
    static void outputBiddingScheme(BiddingScheme biddingScheme){
        if (biddingScheme == null)
            return;
    	if (biddingScheme instanceof EnhancedCpcBiddingScheme) {
            outputStatusMessage("BiddingScheme Type: EnhancedCpc");
    	} else if (biddingScheme instanceof InheritFromParentBiddingScheme) {;
            outputStatusMessage("BiddingScheme Type: InheritFromParent");
    	} else if (biddingScheme instanceof MaxConversionsBiddingScheme) {
            outputStatusMessage("BiddingScheme Type: MaxConversions");
    	} else if (biddingScheme instanceof ManualCpcBiddingScheme) {
            outputStatusMessage("BiddingScheme Type: ManualCpc");
    	} else if (biddingScheme instanceof TargetCpaBiddingScheme) {
            outputStatusMessage("BiddingScheme Type: TargetCpa");
    	} else if (biddingScheme instanceof MaxClicksBiddingScheme) {
            outputStatusMessage("BiddingScheme Type: MaxClicks");
    	} else {
            outputStatusMessage("BiddingScheme Type: Unknown bidding scheme");
    	}
    }
    
    static void outputAccountMigrationStatusesInfo(AccountMigrationStatusesInfo accountMigrationStatusesInfo)
    {
        if (accountMigrationStatusesInfo != null)
        {
            outputStatusMessage(String.format("AccountId: %s", accountMigrationStatusesInfo.getAccountId()));
            for (MigrationStatusInfo migrationStatusInfo : accountMigrationStatusesInfo.getMigrationStatusInfo().getMigrationStatusInfos())
            {
                outputMigrationStatusInfo(migrationStatusInfo);
            }
        }
    }

    static void outputMigrationStatusInfo(MigrationStatusInfo migrationStatusInfo)
    {
        if (migrationStatusInfo != null)
        {
            outputStatusMessage(String.format("MigrationType: %s", migrationStatusInfo.getMigrationType()));
            outputStatusMessage(String.format("StartTimeInUtc: %s", migrationStatusInfo.getStartTimeInUtc()));
            outputStatusMessage(String.format("Status: %s\n", migrationStatusInfo.getStatus()));
        }
    }
    
    static void outputUetTag(UetTag uetTag)
    {
        if (uetTag != null)
        {
            outputStatusMessage(String.format("Description: %s", uetTag.getDescription()));
            outputStatusMessage(String.format("Id: %s", uetTag.getId()));
            outputStatusMessage(String.format("Name: %s", uetTag.getName()));
            outputStatusMessage(String.format("TrackingNoScript: %s", uetTag.getTrackingNoScript()));
            outputStatusMessage(String.format("TrackingScript: %s", uetTag.getTrackingScript()));
            outputStatusMessage(String.format("TrackingStatus: %s\n", uetTag.getTrackingStatus()));
        }
    }

    static void outputConversionGoal(ConversionGoal conversionGoal)
    {
        if (conversionGoal != null)
        {
            outputStatusMessage(String.format("ConversionWindowInMinutes: %s", conversionGoal.getConversionWindowInMinutes()));
            outputStatusMessage(String.format("CountType: %s", conversionGoal.getCountType()));
            outputStatusMessage(String.format("Id: %s", conversionGoal.getId()));
            outputStatusMessage(String.format("Name: %s", conversionGoal.getName()));
            outputConversionGoalRevenue(conversionGoal.getRevenue());
            outputStatusMessage(String.format("Scope: %s", conversionGoal.getScope()));
            outputStatusMessage(String.format("Status: %s", conversionGoal.getStatus()));
            outputStatusMessage(String.format("TagId: %s", conversionGoal.getTagId()));
            outputStatusMessage(String.format("TrackingStatus: %s", conversionGoal.getTrackingStatus()));
            if(conversionGoal.getType() != null){
                outputStatusMessage(String.format("Type: %s", conversionGoal.getType().toArray()[0]));
            }

            if (conversionGoal instanceof AppInstallGoal)
            {
                outputStatusMessage(String.format("AppPlatform: %s", ((AppInstallGoal)conversionGoal).getAppPlatform()));
                outputStatusMessage(String.format("AppStoreId: %s\n", ((AppInstallGoal)conversionGoal).getAppStoreId()));
            }
            else if (conversionGoal instanceof DurationGoal)
            {
                outputStatusMessage(String.format("MinimumDurationInSeconds: %s\n", ((DurationGoal)conversionGoal).getMinimumDurationInSeconds()));
            }
            else if (conversionGoal instanceof EventGoal)
            {
                outputStatusMessage(String.format("ActionExpression: %s", ((EventGoal)conversionGoal).getActionExpression()));
                outputStatusMessage(String.format("ActionOperator: %s", ((EventGoal)conversionGoal).getActionOperator()));
                outputStatusMessage(String.format("CategoryExpression: %s", ((EventGoal)conversionGoal).getCategoryExpression()));
                outputStatusMessage(String.format("CategoryOperator: %s", ((EventGoal)conversionGoal).getCategoryOperator()));
                outputStatusMessage(String.format("LabelExpression: %s", ((EventGoal)conversionGoal).getLabelExpression()));
                outputStatusMessage(String.format("LabelOperator: %s", ((EventGoal)conversionGoal).getLabelOperator()));
                outputStatusMessage(String.format("Value: %s", ((EventGoal)conversionGoal).getValue()));
                outputStatusMessage(String.format("ValueOperator: %s\n", ((EventGoal)conversionGoal).getValueOperator()));
            }
            else if (conversionGoal instanceof PagesViewedPerVisitGoal)
            {
                outputStatusMessage(String.format("MinimumPagesViewed: %s\n", ((PagesViewedPerVisitGoal)conversionGoal).getMinimumPagesViewed()));
            }
            else if (conversionGoal instanceof UrlGoal)
            {
                outputStatusMessage(String.format("UrlExpression: %s", ((UrlGoal)conversionGoal).getUrlExpression()));
                outputStatusMessage(String.format("UrlOperator: %s\n", ((UrlGoal)conversionGoal).getUrlOperator()));
            }
        }
    }

    static void outputConversionGoalRevenue(ConversionGoalRevenue conversionGoalRevenue)
    {
        if (conversionGoalRevenue != null)
        {
            outputStatusMessage(String.format("CurrencyCode: %s", conversionGoalRevenue.getCurrencyCode()));
            outputStatusMessage(String.format("Type: %s", conversionGoalRevenue.getType()));
            outputStatusMessage(String.format("Value: %s", conversionGoalRevenue.getValue()));
        }
    }
}
