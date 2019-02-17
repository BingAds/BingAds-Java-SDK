package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;
import java.util.HashSet;
import java.util.List;

public class ExpandedTextAds extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(); 
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);
            
            // Add a search campaign.

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
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            // Add an ad group within the campaign.
            
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
            outputStatusMessage("AdGroupIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors); 

            // Add keywords and ads within the ad group.
            
            ArrayOfKeyword keywords = new ArrayOfKeyword();
            Keyword keyword = new Keyword();
            keyword.setBid(new Bid());
            keyword.getBid().setAmount(0.47);
            keyword.setParam2("10% Off");
            keyword.setMatchType(MatchType.PHRASE);
            keyword.setText("Brand-A Shoes");
            keywords.getKeywords().add(keyword);

            outputStatusMessage("-----\nAddKeywords:");
            AddKeywordsResponse addKeywordsResponse = CampaignManagementExampleHelper.addKeywords(
                    adGroupIds.getLongs().get(0), 
                    keywords, 
                    false);
            ArrayOfNullableOflong keywordIds = addKeywordsResponse.getKeywordIds();
            ArrayOfBatchError keywordErrors = addKeywordsResponse.getPartialErrors();
            outputStatusMessage("KeywordIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(keywordIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(keywordErrors);

            ArrayOfAd ads = new ArrayOfAd();
            ExpandedTextAd expandedTextAd = new ExpandedTextAd();
            expandedTextAd.setTitlePart1("Contoso");
            expandedTextAd.setTitlePart2("Quick & Easy Setup");
            expandedTextAd.setTitlePart3("Seemless Integration");
            expandedTextAd.setText("Find New Customers & Increase Sales!");
            expandedTextAd.setTextPart2("Start Advertising on Contoso Today.");
            expandedTextAd.setPath1("seattle");
            expandedTextAd.setPath2("shoe sale");
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            expandedTextAd.setFinalUrls(finalUrls);
            ads.getAds().add(expandedTextAd);

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
 }
