package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

import java.util.Calendar;
import java.util.ArrayList;

public class TargetCriterions extends ExampleBase {
        
    public static void main(java.lang.String[] args) 
    {        
        try
        {
            authorizationData = getAuthorizationData();
         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);
        
            // Setup a campaign with one ad group.

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
            
            // When you first create a campaign or ad group using the Bing Ads API, it will not have any 
            // target criteria. Effectively, the brand new campaign and ad group target all ages, days, hours, 
            // devices, genders, and locations. As a best practice, you should consider at a minimum 
            // adding a campaign location criterion corresponding to the customer market country.
            
            ArrayOfCampaignCriterion campaignCriterions = new ArrayOfCampaignCriterion();      
            BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
            biddableCampaignCriterion.setCampaignId(campaignIds.getLongs().get(0));            
            LocationCriterion biddableLocationCriterion = new LocationCriterion();
            biddableLocationCriterion.setLocationId((long)190); // United States
            biddableLocationCriterion.setType("LocationCriterion");        			
            BidMultiplier criterionBid = new BidMultiplier();
            criterionBid.setMultiplier(20D);
            biddableCampaignCriterion.setCriterionBid(criterionBid);
            biddableCampaignCriterion.setCriterion(biddableLocationCriterion);            
            campaignCriterions.getCampaignCriterions().add(biddableCampaignCriterion);
            
            ArrayList<CampaignCriterionType> criterionTypes = new ArrayList<CampaignCriterionType>();
            criterionTypes.add(CampaignCriterionType.TARGETS);
            
            outputStatusMessage("-----\nAddCampaignCriterions:");
            AddCampaignCriterionsResponse addCriterionsResponse = CampaignManagementExampleHelper.addCampaignCriterions(
                    campaignCriterions, 
                    criterionTypes);
            ArrayOfNullableOflong campaignCriterionIds = addCriterionsResponse.getCampaignCriterionIds();
            ArrayOfBatchErrorCollection campaignCriterionErrors = addCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("CampaignCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignCriterionIds);
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(campaignCriterionErrors); 
            
            // A negative location criterion is an excluded location.
            // Ads in this ad group will not be shown to people in Redmond, WA.
            
            ArrayOfAdGroupCriterion adGroupCriterions = new ArrayOfAdGroupCriterion();   
            NegativeAdGroupCriterion negativeAdGroupCriterion = new NegativeAdGroupCriterion();
            negativeAdGroupCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
            LocationCriterion negativeLocationCriterion = new LocationCriterion();
            negativeLocationCriterion.setLocationId((long)190); // Redmond|Washington|United States
            negativeLocationCriterion.setType("LocationCriterion"); negativeAdGroupCriterion.setCriterion(negativeLocationCriterion);
            adGroupCriterions.getAdGroupCriterions().add(negativeAdGroupCriterion);
            
            ArrayList<AdGroupCriterionType> adGroupCriterionTypes = new ArrayList<AdGroupCriterionType>();
            adGroupCriterionTypes.add(AdGroupCriterionType.TARGETS);
            
            outputStatusMessage("-----\nAddCampaignCriterions:");
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupCriterions, 
                    adGroupCriterionTypes);
            ArrayOfNullableOflong adGroupCriterionIds = addAdGroupCriterionsResponse.getAdGroupCriterionIds();
            ArrayOfBatchErrorCollection adGroupCriterionErrors = addAdGroupCriterionsResponse.getNestedPartialErrors();
            outputStatusMessage("CampaignCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupCriterionIds);
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(adGroupCriterionErrors); 
            
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
