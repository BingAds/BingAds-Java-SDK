package com.microsoft.bingads.examples.v12;

import java.time.Instant;
import java.time.*;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.adinsight.ArrayOfDomainCategory;
import com.microsoft.bingads.v12.adinsight.GetDomainCategoriesResponse;
import com.microsoft.bingads.v12.campaignmanagement.*;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfBatchError;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v12.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v12.adinsight.*;

public class DynamicSearchCampaigns extends ExampleBase {
	
    public final static String DOMAIN_NAME = "contoso.com";
    public final static String LANGUAGE = "EN";
    
    public static void main(String[] args) {

        ArrayOfCampaign campaigns = null;
        ArrayOfAdGroup adGroups = null;
        
        try
        {      
            authorizationData = getAuthorizationData(null,null); 
        
            AdInsightExampleHelper.AdInsightService = new ServiceClient<IAdInsightService>(
                            authorizationData, 
                            API_ENVIRONMENT,
                            IAdInsightService.class);    

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                            authorizationData, 
                            API_ENVIRONMENT,
                            ICampaignManagementService.class);
        
            // To get started with dynamic search ads, first you'll need to add a new Campaign 
            // with its type set to DynamicSearchAds. When you create the campaign, you'll need to 
            // include a DynamicSearchAdsSetting that specifies the target web site domain and language.      
            campaigns = getExampleDSACampaigns();   	
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(authorizationData.getAccountId(), campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addCampaignsResponse.getPartialErrors());

            // Next, create a new AdGroup within the dynamic search ads campaign. 
            adGroups = getExampleAdGroups();
            AddAdGroupsResponse addAdGroupsReponse = CampaignManagementExampleHelper.addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups, false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsReponse.getAdGroupIds();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addAdGroupsReponse.getPartialErrors());

            // You can add one or more Webpage criterions to each ad group that helps determine 
            // whether or not to serve dynamic search ads.
            ArrayOfAdGroupCriterion adGroupCriterions = new ArrayOfAdGroupCriterion();	        
            BiddableAdGroupCriterion biddableAdGroupCriterion = getExampleAdGroupWebpagePositivePageContent(adGroupIds.getLongs().get(0));	        
            adGroupCriterions.getAdGroupCriterions().add(biddableAdGroupCriterion);

            // To discover the categories that you can use for Webpage criterion (positive or negative), 
            // use the GetDomainCategories operation with the Ad Insight service.
            
            GetDomainCategoriesResponse getDomainCategoriesResponse = AdInsightExampleHelper.getDomainCategories(null, DOMAIN_NAME, LANGUAGE);
            ArrayOfDomainCategory categories = getDomainCategoriesResponse.getCategories();

            // If any categories are available let's use one as a condition.
            if(categories.getDomainCategories().size() > 0)
            {
            	BiddableAdGroupCriterion adGroupWebpagePositiveCategory = getExampleAdGroupWebpagePositiveCategory(adGroupIds.getLongs().get(0), categories);
            	adGroupCriterions.getAdGroupCriterions().add(adGroupWebpagePositiveCategory);
            }
	        
            // If you want to exclude certain portions of your web site, you can add negative Webpage 
            // criterion at the campaign and ad group level.
            NegativeAdGroupCriterion adGroupWebpageNegativeUrl = getExampleAdGroupWebpageNegativeUrl(adGroupIds.getLongs().get(0));
            adGroupCriterions.getAdGroupCriterions().add(adGroupWebpageNegativeUrl);
            
            outputStatusMessage("Adding Ad Group Webpage Criterion . . . \n");
            CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
            
            ArrayList<AdGroupCriterionType> adGroupCriterionTypes = new ArrayList<AdGroupCriterionType>();
            adGroupCriterionTypes.add(AdGroupCriterionType.WEBPAGE);
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(adGroupCriterions, adGroupCriterionTypes);
            outputStatusMessage("New Ad Group Criterion Ids:\n");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addAdGroupCriterionsResponse.getAdGroupCriterionIds());
            ArrayOfBatchErrorCollection adGroupCriterionErrors = addAdGroupCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("\nAddAdGroupCriterions Errors:\n");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(adGroupCriterionErrors);
            
            // The negative Webpage criterion at the campaign level applies to all ad groups 
            // within the campaign; however, if you define ad group level negative Webpage criterion, 
            // the campaign criterion is ignored for that ad group.
            ArrayOfCampaignCriterion campaignCriterions = new ArrayOfCampaignCriterion();
            NegativeCampaignCriterion negativeCampaignCriterion = getExampleCampaignWebpageNegativeUrl(nullableCampaignIds.getLongs().get(0));
            campaignCriterions.getCampaignCriterions().add(negativeCampaignCriterion);
            
            outputStatusMessage("Adding Campaign Webpage Criterion . . . \n");
            CampaignManagementExampleHelper.outputArrayOfCampaignCriterion(campaignCriterions);
            
            ArrayList<CampaignCriterionType> campaignCriterionTypes = new ArrayList<CampaignCriterionType>();
            campaignCriterionTypes.add(CampaignCriterionType.WEBPAGE);
            AddCampaignCriterionsResponse addCampaignCriterionsResponse = CampaignManagementExampleHelper.addCampaignCriterions(campaignCriterions, campaignCriterionTypes);
            outputStatusMessage("\nNew Campaign Criterion Ids:\n");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addCampaignCriterionsResponse.getCampaignCriterionIds());
            ArrayOfBatchErrorCollection campaignCriterionErrors = addCampaignCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("\nAddCampaignCriterions Errors:\n");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(campaignCriterionErrors);
            
            // Finally you can add a DynamicSearchAd into the ad group. The ad title and display URL 
            // are generated automatically based on the web site domain and language that you want to target.
            DynamicSearchAd dynamicSearchAd = getExampleDynamicSearchAd();
            ArrayOfAd ads = new ArrayOfAd();
            ads.getAds().add(dynamicSearchAd);
            
            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(adGroupIds.getLongs().get(0), ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);
            
            // Retrieve the Webpage criterion for the campaign.
            GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIdsResponse = CampaignManagementExampleHelper.getCampaignCriterionsByIds(
                    null,
                    nullableCampaignIds.getLongs().get(0),
                    campaignCriterionTypes);
            
            outputStatusMessage("Retrieving the Campaign Webpage Criterions that we added . . . \n");
            campaignCriterions = getCampaignCriterionsByIdsResponse.getCampaignCriterions();
            CampaignManagementExampleHelper.outputArrayOfCampaignCriterion(campaignCriterions);
            
            // Retrieve the Webpage criterion for the ad group and then test some update scenarios.
            
            GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIdsResponse = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
                null,
                adGroupIds.getLongs().get(0),
                adGroupCriterionTypes);
            
            outputStatusMessage("Retrieving the Ad Group Webpage Criterions that we added . . . \n");
            adGroupCriterions = getAdGroupCriterionsByIdsResponse.getAdGroupCriterions();
            CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
            
            // You can update the Webpage criterion name but cannot update the conditions. 
            // To update the conditions you must delete the criterion and add a new criterion.
            // This method will attempt two updates. One will fail and the other will succeed.
            
            // You can update the bid for BiddableAdGroupCriterion
            FixedBid updatedBid = new FixedBid();
            updatedBid.setAmount(0.75);

            // You can update the Webpage criterion name but cannot update the conditions. 
            // To update the conditions you must delete the criterion and add a new criterion.

            // This update attempt will return an error.
            Webpage updateCriterionAttemptFailure = new Webpage();
            WebpageCondition webpageCondition = new WebpageCondition();
            webpageCondition.setArgument("Books");
            webpageCondition.setOperand(WebpageConditionOperand.PAGE_CONTENT);
            ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
            conditions.getWebpageConditions().add(webpageCondition);
            WebpageParameter failureParameter = new WebpageParameter();
            failureParameter.setConditions(conditions);
            failureParameter.setCriterionName("Update Attempt Failure");
            updateCriterionAttemptFailure.setParameter(failureParameter);

            // This update attempt will succeed.
            Webpage updateCriterionAttemptSuccess = new Webpage();
            WebpageParameter successParameter = new WebpageParameter();
            successParameter.setCriterionName("Update Attempt Success");
            updateCriterionAttemptSuccess.setParameter(successParameter);
            
            for(AdGroupCriterion adGroupCriterion: adGroupCriterions.getAdGroupCriterions())
            {
                if(adGroupCriterion instanceof BiddableAdGroupCriterion)
                {
                    ((BiddableAdGroupCriterion) adGroupCriterion).setCriterionBid(updatedBid);
                    ((BiddableAdGroupCriterion) adGroupCriterion).setCriterion(updateCriterionAttemptSuccess);
                }
                else
                {
                    ((NegativeAdGroupCriterion) adGroupCriterion).setCriterion(updateCriterionAttemptFailure);
                }
            }     
            
            outputStatusMessage("Updating Ad Group Webpage Criterion . . . \n");
            CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
                        
            UpdateAdGroupCriterionsResponse updateAdGroupCriterionsResponse = CampaignManagementExampleHelper.updateAdGroupCriterions(adGroupCriterions, adGroupCriterionTypes);
            adGroupCriterionErrors = updateAdGroupCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("UpdateAdGroupCriterions Errors:\n");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(adGroupCriterionErrors);
            
            // Delete the campaign, ad group, criterion, and ad that were previously added. 
            // You should remove this operation if you want to view the added entities in the 
            // Bing Ads web application or another tool.
            ArrayOflong campaignIds = new com.microsoft.bingads.v12.campaignmanagement.ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), campaignIds);
            System.out.printf("Deleted CampaignId %d\n", nullableCampaignIds.getLongs().get(0));
            
            outputStatusMessage("Program execution completed\n"); 
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }    

    protected static ArrayOfCampaign getExampleDSACampaigns()
    {
        Campaign campaign = new Campaign();	

        List<CampaignType> campaignTypes = new ArrayList<CampaignType>();
        campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
        campaign.setCampaignType(campaignTypes);

        DynamicSearchAdsSetting dynamicSearchAdsSetting = new DynamicSearchAdsSetting();
        dynamicSearchAdsSetting.setDomainName("contoso.com");
        dynamicSearchAdsSetting.setLanguage("English");
        ArrayOfSetting arrayOfSetting = new ArrayOfSetting();
        arrayOfSetting.getSettings().add(dynamicSearchAdsSetting);
        campaign.setSettings(arrayOfSetting);

        campaign.setName("Women's Shoes " + Instant.now());
        campaign.setDescription("Red shoes line.");

        // You must choose to set either the shared  budget ID or daily amount.
        // You can set one or the other, but you may not set both.
        campaign.setBudgetId(null);
        campaign.setDailyBudget(50.0);
        campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);

        // You can set your campaign bid strategy to Enhanced CPC (EnhancedCpcBiddingScheme) 
        // and then, at any time, set an individual ad group bid strategy to 
        // Manual CPC (ManualCpcBiddingScheme).
        campaign.setBiddingScheme(new EnhancedCpcBiddingScheme());

        campaign.setTimeZone("PacificTimeUSCanadaTijuana");

        // Used with CustomParameters defined in lower level entities such as ads.
        campaign.setTrackingUrlTemplate("http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

        ArrayOfCampaign campaigns = new ArrayOfCampaign();
        campaigns.getCampaigns().add(campaign);

        return campaigns;
    }

    protected static ArrayOfAdGroup getExampleAdGroups()
    {
        AdGroup adGroup = new AdGroup();

        adGroup.setName("Women's Red Shoe Sale");
        
        adGroup.setStartDate(null);

        Date endDate = new Date();
        endDate.setDay(31);
        endDate.setMonth(12);
        endDate.setYear(Year.now().getValue() + 1);
        adGroup.setEndDate(endDate);

        Bid bid = new Bid();
        bid.setAmount(0.09);
        adGroup.setCpcBid(bid);

        adGroup.setLanguage("English");
        adGroup.setBiddingScheme(new ManualCpcBiddingScheme());

        ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
        adGroups.getAdGroups().add(adGroup);

        return adGroups;
    }

    protected static BiddableAdGroupCriterion getExampleAdGroupWebpagePositivePageContent(long adGroupId)
    {
        BiddableAdGroupCriterion adGroupWebpagePositivePageContent = new BiddableAdGroupCriterion();

        adGroupWebpagePositivePageContent.setAdGroupId(adGroupId);

        FixedBid criterionBid = new FixedBid();
        criterionBid.setAmount(0.50);
        adGroupWebpagePositivePageContent.setCriterionBid(criterionBid);

        WebpageCondition condition = new WebpageCondition();
        condition.setOperand(WebpageConditionOperand.PAGE_CONTENT);
        condition.setArgument("flowers");
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(condition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName("Ad Group Webpage Positive Page Content Criterion");
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpagePositivePageContent.setCriterion(criterion);

        // DestinationUrl and FinalUrls are not supported with Webpage criterion. 
        // The Final URL is dynamically created at the ad level.
        adGroupWebpagePositivePageContent.setDestinationUrl(null);
        adGroupWebpagePositivePageContent.setFinalUrls(null);

        // You could use a tracking template which would override the campaign level
        // tracking template. Tracking templates defined for lower-level entities 
        // override those set for higher-level entities.
        // In this example we are using the campaign-level tracking template.
        adGroupWebpagePositivePageContent.setTrackingUrlTemplate(null);

        // Set custom parameters that are specific to this Webpage criterion, 
        // and can be used by the criterion, ad group, campaign, or account level tracking template. 
        // In this example we are using the campaign level tracking template.
        CustomParameter promoCode = new CustomParameter();
        promoCode.setKey("promoCode");
        promoCode.setValue("PROMO1");
        CustomParameter season = new CustomParameter();
        season.setKey("season");
        season.setValue("summer");
        CustomParameters urlCustomParameters = new CustomParameters();
        ArrayOfCustomParameter parameters = new ArrayOfCustomParameter();
        parameters.getCustomParameters().add(promoCode);
        parameters.getCustomParameters().add(season);
        urlCustomParameters.setParameters(parameters);
        adGroupWebpagePositivePageContent.setUrlCustomParameters(urlCustomParameters);

        return adGroupWebpagePositivePageContent;
    }

    protected static BiddableAdGroupCriterion getExampleAdGroupWebpagePositiveCategory(long adGroupId, ArrayOfDomainCategory categories)
    {
        BiddableAdGroupCriterion adGroupWebpagePositiveCategory = new BiddableAdGroupCriterion();

        adGroupWebpagePositiveCategory.setAdGroupId(adGroupId);

        FixedBid criterionBid = new FixedBid();
        criterionBid.setAmount(0.50);
        adGroupWebpagePositiveCategory.setCriterionBid(criterionBid);

        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(categories.getDomainCategories().get(0).getCategoryName());
        webpageCondition.setOperand(WebpageConditionOperand.CATEGORY);
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName("Ad Group Webpage Positive Category Criterion");
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpagePositiveCategory.setCriterion(criterion);

        return adGroupWebpagePositiveCategory;
    }

    protected static NegativeAdGroupCriterion getExampleAdGroupWebpageNegativeUrl(long adGroupId)
    {
        NegativeAdGroupCriterion adGroupWebpageNegativeUrl = new NegativeAdGroupCriterion();

        adGroupWebpageNegativeUrl.setAdGroupId(adGroupId);

        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(DOMAIN_NAME);
        webpageCondition.setOperand(WebpageConditionOperand.URL);
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName(null);
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpageNegativeUrl.setCriterion(criterion);

        return adGroupWebpageNegativeUrl;
    }

    protected static NegativeCampaignCriterion getExampleCampaignWebpageNegativeUrl(long campaignId)
    {
        NegativeCampaignCriterion campaignWebpageNegativeUrl  = new NegativeCampaignCriterion();

        campaignWebpageNegativeUrl.setCampaignId(campaignId);

        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(DOMAIN_NAME + "\\seattle");
        webpageCondition.setOperand(WebpageConditionOperand.URL);
        WebpageParameter webpageParameter = new WebpageParameter();
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName("Campaign Negative Webpage Url Criterion");
        Webpage webpage = new Webpage();
        webpage.setParameter(webpageParameter);
        campaignWebpageNegativeUrl.setCriterion(webpage);

        return campaignWebpageNegativeUrl ;
    }

    protected static DynamicSearchAd getExampleDynamicSearchAd()
    {
        DynamicSearchAd dynamicSearchAd  = new DynamicSearchAd();

        dynamicSearchAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
        dynamicSearchAd.setPath1("seattle");
        dynamicSearchAd.setPath2("shoe sale");

        // You cannot set FinalUrls. The Final URL will be a dynamically selected landing page.
        // The final URL is distinct from the path that customers will see and click on in your ad.
        dynamicSearchAd.setFinalUrls(null);

        // You could use a tracking template which would override the campaign level
        // tracking template. Tracking templates defined for lower level entities 
        // override those set for higher level entities.
        // In this example we are using the campaign level tracking template.
        dynamicSearchAd.setTrackingUrlTemplate(null);

        // Set custom parameters that are specific to this ad, 
        // and can be used by the ad, webpage, ad group, campaign, or account level tracking template. 
        // In this example we are using the campaign level tracking template.
        CustomParameter promoCode = new CustomParameter();
        promoCode.setKey("promoCode");
        promoCode.setValue("PROMO1");
        CustomParameter season = new CustomParameter();
        season.setKey("season");
        season.setValue("summer");        
        ArrayOfCustomParameter arrayOfCustomParameter = new ArrayOfCustomParameter();
        arrayOfCustomParameter.getCustomParameters().add(promoCode);
        arrayOfCustomParameter.getCustomParameters().add(season);     
        CustomParameters customParameters = new CustomParameters();
        customParameters.setParameters(arrayOfCustomParameter);
        dynamicSearchAd.setUrlCustomParameters(customParameters);

        return dynamicSearchAd;
    }

}
