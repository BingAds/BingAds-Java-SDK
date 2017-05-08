package com.microsoft.bingads.examples.v11;

import java.rmi.RemoteException;

import com.microsoft.bingads.v11.campaignmanagement.*;

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

    static void outputBiddableAdGroupCriterion(BiddableAdGroupCriterion criterion)
    {
        if (criterion != null)
        {
            // output inherited properties of the AdGroupCriterion base class.
            outputAdGroupCriterion(criterion);

            // output properties that are specific to the BiddableAdGroupCriterion
            outputCriterionBid(criterion.getCriterionBid());

            outputStatusMessage(String.format("DestinationUrl: %s", criterion.getDestinationUrl()));
            outputStatusMessage(String.format("EditorialStatus: %s", criterion.getEditorialStatus()));
            outputStatusMessage("FinalMobileUrls: ");
            if (criterion.getFinalMobileUrls() != null)
            {
                for(java.lang.String finalMobileUrl : criterion.getFinalMobileUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalMobileUrl));
                }
            }

            outputStatusMessage("FinalUrls: ");
            if (criterion.getFinalUrls() != null)
            {
                for(java.lang.String finalUrl : criterion.getFinalUrls().getStrings())
                {
                    outputStatusMessage(String.format("\t%s", finalUrl));
                }
            }
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", criterion.getTrackingUrlTemplate()));
            outputStatusMessage("UrlCustomParameters: ");
            if (criterion.getUrlCustomParameters() != null && criterion.getUrlCustomParameters().getParameters() != null)
            {
                for(CustomParameter customParameter : criterion.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
        }
    }

    static void outputNegativeAdGroupCriterion(NegativeAdGroupCriterion criterion)
    {
        if (criterion != null)
        {
            // output inherited properties of the AdGroupCriterion base class.
            outputAdGroupCriterion(criterion);

            // There aren't any properties that are specific to the NegativeAdGroupCriterion
        }
    }

    static void outputAdGroupCriterion(AdGroupCriterion criterion)
    {
        if (criterion != null)
        {
            outputStatusMessage(String.format("AdGroupId: %s", criterion.getAdGroupId()));
            outputCriterion(criterion.getCriterion());
            outputStatusMessage(String.format("Id: %s", criterion.getId()));
            outputStatusMessage(String.format("Status: %s", criterion.getStatus()));
            outputStatusMessage(String.format("AdGroupCriterion Type: %s", criterion.getType()));
        }
    }
    
    static void outputBiddableCampaignCriterion(BiddableCampaignCriterion criterion)
    {
        if (criterion != null)
        {
            // output inherited properties of the CampaignCriterion base class.
            outputCampaignCriterion(criterion);

            // output properties that are specific to the BiddableCampaignCriterion
            outputCriterionBid(criterion.getCriterionBid());
        }
    }

    static void outputNegativeCampaignCriterion(NegativeCampaignCriterion criterion)
    {
        if (criterion != null)
        {
            // output inherited properties of the CampaignCriterion base class.
            outputCampaignCriterion(criterion);

            // There aren't any properties that are specific to the NegativeCampaignCriterion
        }
    }

    static void outputCampaignCriterion(CampaignCriterion criterion)
    {
        if (criterion != null)
        {
            outputStatusMessage(String.format("CampaignId: %s", criterion.getCampaignId()));
            outputCriterion(criterion.getCriterion());
            outputStatusMessage("ForwardCompatibilityMap: ");
            if (criterion.getForwardCompatibilityMap() != null)
            {
                for(KeyValuePairOfstringstring pair : criterion.getForwardCompatibilityMap().getKeyValuePairOfstringstrings())
                {
                    outputStatusMessage(String.format("Key: %s", pair.getKey()));
                    outputStatusMessage(String.format("Value: %s", pair.getValue()));
                }
            }
            outputStatusMessage(String.format("Id: %s", criterion.getId()));
            outputStatusMessage(String.format("Status: %s", criterion.getStatus()));
            outputStatusMessage(String.format("CampaignCriterion Type: %s", criterion.getType()));
        }
    }

    static void outputCriterion(Criterion criterion)
    {
        if (criterion != null)
        {
            outputStatusMessage(String.format("Criterion Type: %s", criterion.getType()));
            if (criterion instanceof ProductPartition)
            {
                outputProductPartition((ProductPartition)criterion);
            }
            else if (criterion instanceof ProductScope)
            {
                outputProductScope((ProductScope)criterion);
            }
            else if (criterion instanceof Webpage)
            {
                outputWebpage((Webpage)criterion);
            }
            else if (criterion instanceof AudienceCriterion)
            {
                outputAudienceCriterion((AudienceCriterion)criterion);
            }
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

    static void outputProductPartition(ProductPartition productPartition){
        if (productPartition != null) {
            outputStatusMessage(String.format("ParentCriterionId: %s", productPartition.getParentCriterionId()));
            outputStatusMessage(String.format("PartitionType: %s", productPartition.getPartitionType()));
            if (productPartition.getCondition() != null) {
                outputStatusMessage("Condition: ");
                outputStatusMessage(String.format("\tOperand: %s", productPartition.getCondition().getOperand()));
                outputStatusMessage(String.format("\tAttribute: %s", productPartition.getCondition().getAttribute()));
            }
        }
    }
    
    static void outputWebpage(Webpage webpage){
        if (webpage != null && webpage.getParameter() != null && webpage.getParameter().getConditions() != null) {
            outputStatusMessage(String.format("Webpage CriterionName: %s", webpage.getParameter().getCriterionName()));
            outputStatusMessage("Webpage Conditions: ");
            for (WebpageCondition condition : webpage.getParameter().getConditions().getWebpageConditions())
            {
                outputStatusMessage(String.format("\tOperand: %s", condition.getOperand()));
                outputStatusMessage(String.format("\tArgument: %s", condition.getArgument()));
            }
        }
    }
    
    static void outputAudienceCriterion(AudienceCriterion audienceCriterion){
        if (audienceCriterion != null) {
            outputStatusMessage(String.format("AudienceId: %s", audienceCriterion.getAudienceId()));
            outputStatusMessage(String.format("AudienceType: %s", audienceCriterion.getAudienceType()));
        }
    }

    static void outputCriterionBid(CriterionBid criterionBid)
    {
        if (criterionBid != null)
        {
            outputStatusMessage(String.format("CriterionBid Type: %s", criterionBid.getType()));
            if (criterionBid instanceof FixedBid)
            {
                outputFixedBid((FixedBid)criterionBid);
            }
            else if (criterionBid instanceof BidMultiplier)
            {
                outputBidMultiplier((BidMultiplier)criterionBid);
            }            
        }
    }

    static void outputFixedBid(FixedBid fixedBid){
        if (fixedBid != null) {
                outputStatusMessage(String.format("Fixed Bid Amount: %s", fixedBid.getAmount()));
        }
    }

    static void outputBidMultiplier(BidMultiplier bidMultiplier)
    {
        if (bidMultiplier != null)
        {
            outputStatusMessage(String.format("Bid Multiplier: %s", bidMultiplier.getMultiplier()));
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
                outputStatusMessage(String.format("Campaign[%s] (Name:%s) successfully added and assigned CampaignId %s\n", 
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

            outputStatusMessage(String.format("\nCampaign[%s] (Name:%s) not added due to the following error:\n", 
           		 error.getIndex(), campaigns.getCampaigns().get(error.getIndex()).getName()));

            outputStatusMessage(String.format("\tIndex: %s\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %s\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %s\n", ((EditorialError)(error)).getReasonCode()));
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
                outputStatusMessage(String.format("AdGroup[%s] (Name:%s) successfully added and assigned AdGroupId %s\n", 
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

            outputStatusMessage(String.format("\nAdGroup[%s] (Name:%s) not added due to the following error:\n", 
           		 error.getIndex(), adGroups.getAdGroups().get(error.getIndex()).getName()));

            outputStatusMessage(String.format("\tIndex: %s\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %s\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %s\n", ((EditorialError)(error)).getReasonCode()));
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
                outputStatusMessage(String.format("Keyword[%s] (Text:%s) successfully added and assigned KeywordId %s\n", 
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

            outputStatusMessage(String.format("\nKeyword[%s] (Text:%s) not added due to the following error:\n", 
           		 error.getIndex(), keywords.getKeywords().get(error.getIndex()).getText()));

            outputStatusMessage(String.format("\tIndex: %s\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %s\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %s\n", ((EditorialError)(error)).getReasonCode()));
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

        for (int index = 0; index < ads.getAds().size(); index++ )
        {
            if (ads.getAds().get(index) instanceof ExpandedTextAd)
            {
                outputExpandedTextAd((ExpandedTextAd)(ads.getAds().get(index)));
            }
            else if (ads.getAds().get(index) instanceof ProductAd)
            {
                outputProductAd((ProductAd)(ads.getAds().get(index)));
            }
            else if (ads.getAds().get(index) instanceof TextAd)
            {
                outputTextAd((TextAd)(ads.getAds().get(index)));
            }
            else
            {
                outputStatusMessage("Unknown Ad Type");
            }
        }

        // Print the error details for any ad not successfully added.
        // Note also that multiple error reasons may exist for the same attempted ad.

        for (BatchError error : partialErrors.getBatchErrors())
        {
            // The index of the partial errors is equal to the index of the list
            // specified in the call to AddAds.

            outputStatusMessage(String.format("\nAd[%s] not added due to the following error:\n", error.getIndex()));

            outputStatusMessage(String.format("\tIndex: %s\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %s\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %s\n", ((EditorialError)(error)).getReasonCode()));
            }
        }
        outputStatusMessage("");
    }
    
    static void outputAd(Ad ad){
        if(ad != null){
            outputStatusMessage(String.format("DevicePreference: %s", ad.getDevicePreference()));
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
            outputStatusMessage(String.format("Status: %s", ad.getStatus()));
            outputStatusMessage(String.format("TrackingUrlTemplate: %s", ad.getTrackingUrlTemplate()));
            outputStatusMessage(String.format("Type: %s", ad.getType()));
            outputStatusMessage("UrlCustomParameters: ");
            if (ad.getUrlCustomParameters() != null && ad.getUrlCustomParameters().getParameters() != null)
            {
                for (CustomParameter customParameter : ad.getUrlCustomParameters().getParameters().getCustomParameters())
                {
                    outputStatusMessage(String.format("\tKey: %s", customParameter.getKey()));
                    outputStatusMessage(String.format("\tValue: %s", customParameter.getValue()));
                }
            }
        }
    }
    
    static void outputExpandedTextAd(ExpandedTextAd ad){
        if (ad != null) {
            // output inherited properties of the Ad base class.
            outputAd(ad);
            
            // output properties that are specific to the ExpandedTextAd
            outputStatusMessage(String.format("DisplayUrl: %s", ad.getDisplayUrl()));
            outputStatusMessage(String.format("Path1: %s", ad.getPath1()));
            outputStatusMessage(String.format("Path2: %s", ad.getPath2()));
            outputStatusMessage(String.format("Text: %s", ad.getText()));
            outputStatusMessage(String.format("TitlePart1: %s", ad.getTitlePart1()));
            outputStatusMessage(String.format("TitlePart2: %s", ad.getTitlePart2()));
        }
    }
    
    static void outputProductAd(ProductAd ad){
        if (ad != null) {
            // output inherited properties of the Ad base class.
            outputAd(ad);
            
            // output properties that are specific to the ProductAd
            outputStatusMessage(String.format("PromotionalText: %s", ad.getPromotionalText()));
        }
    }
    
    static void outputTextAd(TextAd ad){
        if (ad != null) {
            // output inherited properties of the Ad base class.
            outputAd(ad);
            
            // output properties that are specific to the TextAd
            outputStatusMessage(String.format("DestinationUrl: %s", ad.getDestinationUrl()));
            outputStatusMessage(String.format("DisplayUrl: %s", ad.getDisplayUrl()));
            outputStatusMessage(String.format("Text: %s", ad.getText()));
            outputStatusMessage(String.format("Title: %s", ad.getTitle()));
        }
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the AppAdExtension
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the CallAdExtension
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the CalloutAdExtension
            outputStatusMessage(String.format("Callout Text: %s", extension.getText()));
        }
    }
    
    static void outputImageAdExtension(ImageAdExtension extension){
        if (extension != null) {
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the ImageAdExtension
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the LocationAdExtension
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the ReviewAdExtension
            outputStatusMessage(String.format("IsExact: %s", extension.getIsExact()));
            outputStatusMessage(String.format("Source: %s", extension.getSource()));
            outputStatusMessage(String.format("Text: %s", extension.getText()));
            outputStatusMessage(String.format("Url: %s", extension.getUrl()));
        }
    }
    
    static void outputStructuredSnippetAdExtension(StructuredSnippetAdExtension extension){
        if (extension != null) {
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the StructuredSnippetAdExtension
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
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the SiteLinksAdExtension
            if(extension.getSiteLinks() != null){
                    outputSiteLinks(extension.getSiteLinks().getSiteLinks());
            }	
        }
    }
    
    static void outputSitelink2AdExtension(Sitelink2AdExtension extension){
        if (extension != null) {
            // output inherited properties of the AdExtension base class.
            outputAdExtension(extension);
            
            // output properties that are specific to the Sitelink2AdExtension
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
    
	
    // outputs the negative keyword identifiers added to each campaign or ad group entity. 
    // The IdCollection items are available by calling AddNegativeKeywordsToEntities.  

    static void outputNegativeKeywordIds(ArrayOfIdCollection idCollections)
    {
        if (idCollections == null)
        {
            return;
        }

        for (int index = 0; index < idCollections.getIdCollections().size(); index++)
        {
            outputStatusMessage(String.format("NegativeKeyword Ids at entity index %s:\n\n", index));
            for (long id : idCollections.getIdCollections().get(index).getIds().getLongs())
            {
                outputStatusMessage(String.format("\tId: %s\n\n", id));
            }
        }
    }

    // outputs the negative keywords  

    static void outputNegativeKeywords(ArrayOfNegativeKeyword negativeKeywords)
    {
        if (negativeKeywords == null)
        {
            return;
        }

        for (NegativeKeyword negativeKeyword : negativeKeywords.getNegativeKeywords())
        {
            outputStatusMessage(String.format("\tNegativeKeyword Text: %s\n", negativeKeyword.getText()));
            outputStatusMessage(String.format("\tId: %s\n", negativeKeyword.getId()));
            outputStatusMessage(String.format("\tMatchType: %s\n\n", negativeKeyword.getMatchType()));
        }
    }
    
    // outputs the shared list items e.g. negative keywords  
    
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
                outputStatusMessage(String.format("\tId: %s\n", ((NegativeKeyword)sharedListItem).getId()));
                outputStatusMessage(String.format("\tMatchType: %s\n\n", ((NegativeKeyword)sharedListItem).getMatchType()));
            }
        }
    }
    
    // outputs a list of EntityNegativeKeyword objects  

    static void outputEntityNegativeKeywords(ArrayOfEntityNegativeKeyword entityNegativeKeywords)
    {
        if (entityNegativeKeywords == null)
        {
            return;
        }

        outputStatusMessage("EntityNegativeKeyword items:\n");
        for (EntityNegativeKeyword entityNegativeKeyword : entityNegativeKeywords.getEntityNegativeKeywords())
        {
            outputStatusMessage(String.format("\tEntityId: %s\n", entityNegativeKeyword.getEntityId()));
            outputStatusMessage(String.format("\tEntityType: %s\n\n", entityNegativeKeyword.getEntityType()));
            outputNegativeKeywords(entityNegativeKeyword.getNegativeKeywords());
        }
    }

    // outputs a list of EntityNegativeKeyword objects  

    static void outputSharedEntityIdentifiers(ArrayOfSharedEntity sharedEntities) throws RemoteException, Exception
    {
   	 if (sharedEntities != null)
        {
   		 for (int index = 0; index < sharedEntities.getSharedEntities().size(); index++)
            {
                SharedEntity sharedEntity = sharedEntities.getSharedEntities().get(index);
                if (sharedEntity.getId() != null)
                {
                    outputStatusMessage(String.format("SharedEntity[%s] (%s) has SharedEntity Id %s.\n\n",
                                      index,
                                      sharedEntities.getSharedEntities().get(index).getName(),
                                      sharedEntities.getSharedEntities().get(index).getId()));
                }
            }
        }
    }

    // outputs a list of BatchError objects that represent partial errors while managing negative keywords.

    static void outputPartialErrors(ArrayOfBatchError partialErrors)
    {
        if (partialErrors == null || partialErrors.getBatchErrors().size() == 0)
        {
            return;
        }

        outputStatusMessage("BatchError (PartialErrors) items:\n");
        for (BatchError error : partialErrors.getBatchErrors())
        {
            outputStatusMessage(String.format("\tIndex: %s\n", error.getIndex()));
            outputStatusMessage(String.format("\tCode: %s\n", error.getCode()));
            outputStatusMessage(String.format("\tErrorCode: %s\n", error.getErrorCode()));
            outputStatusMessage(String.format("\tMessage: %s\n\n", error.getMessage()));

            // In the case of an EditorialError, more details are available
            if (error.getType().equals("EditorialError") && error.getErrorCode().equals("CampaignServiceEditorialValidationError"))
            {
                outputStatusMessage(String.format("\tDisapprovedText: %s\n", ((EditorialError)(error)).getDisapprovedText()));
                outputStatusMessage(String.format("\tLocation: %s\n", ((EditorialError)(error)).getLocation()));
                outputStatusMessage(String.format("\tPublisherCountry: %s\n", ((EditorialError)(error)).getPublisherCountry()));
                outputStatusMessage(String.format("\tReasonCode: %s\n\n", ((EditorialError)(error)).getReasonCode()));
            }
        }
    }

    // outputs the list item identifiers, as well as any partial errors  

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
                    outputStatusMessage(String.format("NegativeKeyword[%s] (%s) successfully added to NegativeKeywordList (%s) and assigned Negative Keyword Id %s.\n",
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

    // outputs a list of SharedEntityAssociation objects.

    static void outputSharedEntityAssociations(ArrayOfSharedEntityAssociation associations)
    {
        if (associations == null || associations.getSharedEntityAssociations().size() == 0)
        {
            return;
        }

        outputStatusMessage("SharedEntityAssociation items:\n");
        for (SharedEntityAssociation sharedEntityAssociation : associations.getSharedEntityAssociations())
        {
            outputStatusMessage(String.format("\tEntityId: %s\n", sharedEntityAssociation.getEntityId()));
            outputStatusMessage(String.format("\tEntityType: %s\n", sharedEntityAssociation.getEntityType()));
            outputStatusMessage(String.format("\tSharedEntityId: %s\n", sharedEntityAssociation.getSharedEntityId()));
            outputStatusMessage(String.format("\tSharedEntityType: %s\n\n", sharedEntityAssociation.getSharedEntityType()));
        }
    }

    // outputs a list of BatchErrorCollection objects

    static void outputBatchErrorCollections(ArrayOfBatchErrorCollection nestedPartialErrors)
    {
        if (nestedPartialErrors == null || nestedPartialErrors.getBatchErrorCollections().size() == 0)
        {
            return;
        }

        outputStatusMessage("BatchErrorCollection (NestedPartialErrors) items:\n");
        for (BatchErrorCollection collection : nestedPartialErrors.getBatchErrorCollections())
        {
            if (collection != null)
            {
                if (collection.getCode() != null)
                {
                    outputStatusMessage(String.format("\tIndex: %s\n", collection.getIndex()));
                    outputStatusMessage(String.format("\tCode: %s\n", collection.getCode()));
                    outputStatusMessage(String.format("\tErrorCode: %s\n", collection.getErrorCode()));
                    outputStatusMessage(String.format("\tMessage: %s\n\n", collection.getMessage()));
                }

                outputPartialErrors(collection.getBatchErrors());
            }
        }         
    }
    
    static void outputRemarketingList(RemarketingList remarketingList){
        if (remarketingList != null) {
            // Output inherited properties of the Audience base class.
            outputAudience(remarketingList);

            // Output properties that are specific to the RemarketingList
            outputStatusMessage(String.format("TagId: %s", remarketingList.getTagId()));
            outputRemarketingRule(remarketingList.getRule());
            outputStatusMessage("\n");
        }
    }
    
    static void outputRemarketingRule(RemarketingRule remarketingRule)
    {
        if (remarketingRule != null)
        {
            outputStatusMessage(String.format("Type: %s", remarketingRule.getType()));

            if (remarketingRule instanceof CustomEventsRule)
            {
                CustomEventsRule customEventsRule = (CustomEventsRule)remarketingRule;
                outputStatusMessage(String.format("Action: %s", customEventsRule.getAction()));
                outputStatusMessage(String.format("ActionOperator: %s", customEventsRule.getActionOperator()));
                outputStatusMessage(String.format("Category: %s", customEventsRule.getCategory()));
                outputStatusMessage(String.format("CategoryOperator: %s", customEventsRule.getCategoryOperator()));
                outputStatusMessage(String.format("Label: %s", customEventsRule.getLabel()));
                outputStatusMessage(String.format("LabelOperator: %s", customEventsRule.getLabelOperator()));
                outputStatusMessage(String.format("Value: %s", customEventsRule.getValue()));
                outputStatusMessage(String.format("ValueOperator: %s", customEventsRule.getValueOperator()));
            }
            else if (remarketingRule instanceof PageVisitorsRule)
            {
                PageVisitorsRule pageVisitorsRule = (PageVisitorsRule)remarketingRule;
                if (pageVisitorsRule.getRuleItemGroups() != null)
                {
                    outputStatusMessage("RuleItemGroups: ");
                    outputRuleItemGroups(pageVisitorsRule.getRuleItemGroups());
                }
            }
            else if (remarketingRule instanceof PageVisitorsWhoDidNotVisitAnotherPageRule)
            {
                PageVisitorsWhoDidNotVisitAnotherPageRule pageVisitorsWhoDidNotVisitAnotherPageRule = (PageVisitorsWhoDidNotVisitAnotherPageRule)remarketingRule;
                if (pageVisitorsWhoDidNotVisitAnotherPageRule.getExcludeRuleItemGroups() != null)
                {
                    outputStatusMessage("ExcludeRuleItemGroups: ");
                    outputRuleItemGroups(pageVisitorsWhoDidNotVisitAnotherPageRule.getExcludeRuleItemGroups());
                }
                if (pageVisitorsWhoDidNotVisitAnotherPageRule.getIncludeRuleItemGroups() != null)
                {
                    outputStatusMessage("IncludeRuleItemGroups: ");
                    outputRuleItemGroups(pageVisitorsWhoDidNotVisitAnotherPageRule.getIncludeRuleItemGroups());
                }
            }
            else if (remarketingRule instanceof PageVisitorsWhoVisitedAnotherPageRule)
            {
                PageVisitorsWhoVisitedAnotherPageRule pageVisitorsWhoVisitedAnotherPageRule = (PageVisitorsWhoVisitedAnotherPageRule)remarketingRule;
                if (pageVisitorsWhoVisitedAnotherPageRule.getAnotherRuleItemGroups() != null)
                {
                    outputStatusMessage("AnotherRuleItemGroups: ");
                    outputRuleItemGroups(pageVisitorsWhoVisitedAnotherPageRule.getAnotherRuleItemGroups());
                }
                if (pageVisitorsWhoVisitedAnotherPageRule.getRuleItemGroups() != null)
                {
                    outputStatusMessage("RuleItemGroups: ");
                    outputRuleItemGroups(pageVisitorsWhoVisitedAnotherPageRule.getRuleItemGroups());
                }
            }
            else
            {
                outputStatusMessage("Unknown remarketing rule type.");
            }
        }
    }

    static void outputRuleItemGroups(ArrayOfRuleItemGroup ruleItemGroups)
    {
        if (ruleItemGroups != null)
        {
            for (RuleItemGroup ruleItemGroup : ruleItemGroups.getRuleItemGroups())
            {
                if (ruleItemGroup.getItems() != null)
                {
                    for (RuleItem ruleItem : ruleItemGroup.getItems().getRuleItems())
                    {
                        if (ruleItem instanceof StringRuleItem)
                        {
                            outputStatusMessage("\tRuleItem:");
                            outputStatusMessage(String.format("\tOperand: %s", ((StringRuleItem) ruleItem).getOperand()));
                            outputStatusMessage(String.format("\tOperator: %s", ((StringRuleItem) ruleItem).getOperator()));
                            outputStatusMessage(String.format("\tValue: %s\n", ((StringRuleItem) ruleItem).getValue()));
                        }
                        else
                        {
                            outputStatusMessage("Unknown remarketing rule item type.");
                        }
                    }
                }
            }
        }
    }
    
    static void outputAudience(Audience audience){
        if (audience != null) {
            outputStatusMessage(String.format("Description: %s", audience.getDescription()));
            outputStatusMessage("ForwardCompatibilityMap:");
            if(audience.getForwardCompatibilityMap() != null){
                for (KeyValuePairOfstringstring pair : audience.getForwardCompatibilityMap().getKeyValuePairOfstringstrings()){
                    outputStatusMessage(String.format("Key: %s", pair.getKey()));
                    outputStatusMessage(String.format("Value: %s", pair.getValue()));
                }
            }
            outputStatusMessage(String.format("Id: %s", audience.getId()));
            outputStatusMessage(String.format("MembershipDuration: %s", audience.getMembershipDuration()));
            outputStatusMessage(String.format("Name: %s", audience.getName()));
            outputStatusMessage(String.format("ParentId: %s", audience.getParentId()));
            outputStatusMessage(String.format("Scope: %s", audience.getScope()));
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
