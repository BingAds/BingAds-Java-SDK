package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.adinsight.ArrayOfDomainCategory;
import com.microsoft.bingads.v12.adinsight.GetDomainCategoriesResponse;
import com.microsoft.bingads.v12.campaignmanagement.*;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfBatchError;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v12.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v12.adinsight.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class DynamicSearchAds extends ExampleBase {
	
    public final static String DOMAIN_NAME = "contoso.com";
    public final static String LANGUAGE = "EN";
    
    public static void main(String[] args) {

        try
        {      
            authorizationData = getAuthorizationData(); 
        
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
            // include a DynamicSearchAdsSetting that specifies the target website domain and language.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            List<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaign.setCampaignType(campaignTypes);
            campaign.setDailyBudget(50.00);
            campaign.setDescription("Red shoes line.");
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring languages = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            DynamicSearchAdsSetting dynamicSearchAdsSetting = new DynamicSearchAdsSetting();
            dynamicSearchAdsSetting.setDomainName("contoso.com");
            dynamicSearchAdsSetting.setLanguage("English");
            ArrayOfSetting arrayOfSetting = new ArrayOfSetting();
            arrayOfSetting.getSettings().add(dynamicSearchAdsSetting);
            campaign.setSettings(arrayOfSetting);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns,
                    true);            
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            // Create a new ad group within the dynamic search ads campaign. 
            
            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Women's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            adGroups.getAdGroups().add(adGroup);
            
            outputStatusMessage("-----\nAddAdGroups:");
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(
                    campaignIds.getLongs().get(0), 
                    adGroups, 
                    false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors); 

            // You can add one or more Webpage criteria to each ad group that helps determine 
            // whether or not to serve dynamic search ads.
            
            ArrayOfAdGroupCriterion adGroupCriterions = new ArrayOfAdGroupCriterion();	        
            BiddableAdGroupCriterion adGroupWebpagePositivePageContent = getExampleAdGroupWebpagePositivePageContent(adGroupIds.getLongs().get(0));	        
            adGroupCriterions.getAdGroupCriterions().add(adGroupWebpagePositivePageContent);

            // To discover the categories that you can use for Webpage criterion (positive or negative), 
            // use the GetDomainCategories operation with the Ad Insight service.
            
            outputStatusMessage("-----\nGetDomainCategories:");
            GetDomainCategoriesResponse getDomainCategoriesResponse = AdInsightExampleHelper.getDomainCategories(
                    null, 
                    DOMAIN_NAME, 
                    LANGUAGE);
            ArrayOfDomainCategory categories = getDomainCategoriesResponse.getCategories();
            outputStatusMessage("Categories:");
            AdInsightExampleHelper.outputArrayOfDomainCategory(categories);

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
            
            ArrayList<AdGroupCriterionType> adGroupCriterionTypes = new ArrayList<AdGroupCriterionType>();
            adGroupCriterionTypes.add(AdGroupCriterionType.WEBPAGE);
            
            outputStatusMessage("-----\nAddAdGroupCriterions:");
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupCriterions, 
                    adGroupCriterionTypes);
            outputStatusMessage("AdGroupCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addAdGroupCriterionsResponse.getAdGroupCriterionIds());
            ArrayOfBatchErrorCollection adGroupCriterionErrors = addAdGroupCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(adGroupCriterionErrors);
            
            // The negative Webpage criterion at the campaign level applies to all ad groups 
            // within the campaign; however, if you define ad group level negative Webpage criterion, 
            // the campaign criterion is ignored for that ad group.
            
            ArrayOfCampaignCriterion campaignCriterions = new ArrayOfCampaignCriterion();
            NegativeCampaignCriterion negativeCampaignCriterion = getExampleCampaignWebpageNegativeUrl(campaignIds.getLongs().get(0));
            campaignCriterions.getCampaignCriterions().add(negativeCampaignCriterion);
            
            ArrayList<CampaignCriterionType> campaignCriterionTypes = new ArrayList<CampaignCriterionType>();
            campaignCriterionTypes.add(CampaignCriterionType.WEBPAGE);
            
            outputStatusMessage("-----\nAddCampaignCriterions:");
            AddCampaignCriterionsResponse addCampaignCriterionsResponse = CampaignManagementExampleHelper.addCampaignCriterions(
                    campaignCriterions, 
                    campaignCriterionTypes);
            outputStatusMessage("CampaignCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(addCampaignCriterionsResponse.getCampaignCriterionIds());
            ArrayOfBatchErrorCollection campaignCriterionErrors = addCampaignCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(campaignCriterionErrors);
            
            // Finally you must add at least one DynamicSearchAd into the ad group. The ad title and display URL 
            // are generated automatically based on the website domain and language that you want to target.
            
            ArrayOfAd ads = new ArrayOfAd();
            DynamicSearchAd dynamicSearchAd  = new DynamicSearchAd();
            dynamicSearchAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
            dynamicSearchAd.setPath1("seattle");
            dynamicSearchAd.setPath2("shoe sale");
            // You cannot set FinalUrls. The Final URL will be a dynamically selected landing page.
            // The final URL is distinct from the path that customers will see and click on in your ad.
            dynamicSearchAd.setFinalUrls(null);            
            ads.getAds().add(dynamicSearchAd);
            
            outputStatusMessage("-----\nAddAds:");
            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(
                    adGroupIds.getLongs().get(0), 
                    ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            outputStatusMessage("AdIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);
            
            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d", deleteCampaignIds.getLongs().get(0))); 
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
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
        // You can choose whether you want the criterion argument to match partial URLs, 
        // page content, page title, or categories that Bing thinks applies to your website.
        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(DOMAIN_NAME);
        webpageCondition.setOperand(WebpageConditionOperand.URL);
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        // If you do not specify any name, then it will be set to a concatenated list of conditions. 
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

        return campaignWebpageNegativeUrl;
    }
}
