package com.microsoft.bingads.examples.v13;

import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class ResponsiveSearchAds extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(); 
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);
            
            // Create a Search campaign with one ad group and a responsive search ad.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Everyone's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns);            
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            // Add an ad group within the campaign.
            
            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Everyone's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
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

            // The responsive search ad descriptions and headlines are stored as text assets. 
            // You must set between 2-4 descriptions and 3-15 headlines.
            
            ArrayOfAd ads = new ArrayOfAd();
            ResponsiveSearchAd responsiveSearchAd = new ResponsiveSearchAd();            
            ArrayOfAssetLink descriptionAssetLinks = new ArrayOfAssetLink();
            AssetLink descriptionAssetLinkA = new AssetLink();
            TextAsset descriptionTextAssetA = new TextAsset();
            descriptionTextAssetA.setText("Find New Customers & Increase Sales!");
            descriptionAssetLinkA.setAsset(descriptionTextAssetA);
            descriptionAssetLinkA.setPinnedField("Description1");
            descriptionAssetLinks.getAssetLinks().add(descriptionAssetLinkA);
            AssetLink descriptionAssetLinkB = new AssetLink();
            TextAsset descriptionTextAssetB = new TextAsset();
            descriptionTextAssetB.setText("Start Advertising on Contoso Today.");
            descriptionAssetLinkB.setAsset(descriptionTextAssetB);
            descriptionAssetLinkB.setPinnedField("Description2");
            descriptionAssetLinks.getAssetLinks().add(descriptionAssetLinkB);
            responsiveSearchAd.setDescriptions(descriptionAssetLinks);
            ArrayOfAssetLink headlineAssetLinks = new ArrayOfAssetLink();
            AssetLink headlineAssetLinkA = new AssetLink();
            TextAsset headlineTextAssetA = new TextAsset();
            headlineTextAssetA.setText("Contoso");
            headlineAssetLinkA.setAsset(headlineTextAssetA);
            headlineAssetLinkA.setPinnedField("Headline1");
            headlineAssetLinks.getAssetLinks().add(headlineAssetLinkA);
            AssetLink headlineAssetLinkB = new AssetLink();
            TextAsset headlineTextAssetB = new TextAsset();
            headlineTextAssetB.setText("Quick & Easy Setup");
            headlineAssetLinkB.setAsset(headlineTextAssetB);
            headlineAssetLinkB.setPinnedField(null);
            headlineAssetLinks.getAssetLinks().add(headlineAssetLinkB);
            AssetLink headlineAssetLinkC = new AssetLink();
            TextAsset headlineTextAssetC = new TextAsset();
            headlineTextAssetC.setText("Seemless Integration");
            headlineAssetLinkC.setAsset(headlineTextAssetC);
            headlineAssetLinkC.setPinnedField(null);
            headlineAssetLinks.getAssetLinks().add(headlineAssetLinkC);
            responsiveSearchAd.setHeadlines(headlineAssetLinks);
            responsiveSearchAd.setPath1("seattle");
            responsiveSearchAd.setPath2("shoe sale");
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("https://www.contoso.com/womenshoesale");
            responsiveSearchAd.setFinalUrls(finalUrls);
            ads.getAds().add(responsiveSearchAd);

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
