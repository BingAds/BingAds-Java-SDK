package com.microsoft.bingads.examples.v12;

import java.time.Instant;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class TargetCriterions extends ExampleBase {
        
    public static void main(java.lang.String[] args) 
    {
        ArrayList<CampaignCriterionType> allTargetCampaignCriterionTypes = new ArrayList<CampaignCriterionType>();
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.AGE);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.DAY_TIME);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.DEVICE);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.GENDER);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.LOCATION);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.LOCATION_INTENT);
        allTargetCampaignCriterionTypes.add(CampaignCriterionType.RADIUS);
                
        ArrayList<AdGroupCriterionType> allTargetAdGroupCriterionTypes = new ArrayList<AdGroupCriterionType>();
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.AGE);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.DAY_TIME);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.DEVICE);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.GENDER);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.LOCATION);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.LOCATION_INTENT);
        allTargetAdGroupCriterionTypes.add(AdGroupCriterionType.RADIUS);
        
        try
        {
            authorizationData = getAuthorizationData(null,null);
         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);
        
            ArrayOflong campaignIds = GetExampleCampaignIds(authorizationData);
                     
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaignTypes.add(CampaignType.SHOPPING);
            campaignTypes.add(CampaignType.SEARCH);
            
            // You can set campaignIds null to get all campaigns in the account, instead of 
            // adding and retrieving the example campaigns.
            
            ArrayOfCampaign getCampaigns = CampaignManagementExampleHelper.getCampaignsByIds(
                    authorizationData.getAccountId(),
                    campaignIds,
                    campaignTypes).getCampaigns();
            
            // Loop through all campaigns and ad groups to get the target criterion IDs.

            for(Campaign campaign: getCampaigns.getCampaigns())
            {
                // Set campaignCriterionIds null to get all criterions 
                // (of the specified target criterion type or types) for the current campaign.
                
                GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIdsResponse = CampaignManagementExampleHelper.getCampaignCriterionsByIds(
                    null, 
                    campaignIds.getLongs().get(0), 
                    allTargetCampaignCriterionTypes);
                ArrayOfCampaignCriterion campaignCriterions = getCampaignCriterionsByIdsResponse.getCampaignCriterions();

                // When you first create a campaign or ad group using the Bing Ads API, it will not have any 
                // criterions. Effectively, the brand new campaign and ad group target all ages, days, hours, 
                // devices, genders, and locations. As a best practice, you should consider at a minimum 
                // adding a campaign location criterion corresponding to the customer market country.
        		
                if (campaignCriterions == null || campaignCriterions.getCampaignCriterions().size() <= 0)
                {
                    campaignCriterions = new ArrayOfCampaignCriterion();

                    LocationCriterion locationCriterion = new LocationCriterion();
                    locationCriterion.setLocationId((long)190);
                    locationCriterion.setType("LocationCriterion");
        			
                    BidMultiplier criterionBid = new BidMultiplier();
                    criterionBid.setMultiplier(0.0);

                    BiddableCampaignCriterion firstBiddableCriterion = new BiddableCampaignCriterion();
                    firstBiddableCriterion.setCampaignId(campaign.getId());
                    firstBiddableCriterion.setCriterion(locationCriterion);
                    firstBiddableCriterion.setCriterionBid(criterionBid);
                    firstBiddableCriterion.setType("BiddableCampaignCriterion");

                    campaignCriterions.getCampaignCriterions().add(firstBiddableCriterion);

                    LocationIntentCriterion locationIntentCriterion = new LocationIntentCriterion();
                    locationIntentCriterion.setIntentOption(IntentOption.PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES);

                    BiddableCampaignCriterion secondBiddableCriterion = new BiddableCampaignCriterion();
                    secondBiddableCriterion.setCampaignId(campaign.getId());
                    secondBiddableCriterion.setCriterion(locationIntentCriterion);

                    campaignCriterions.getCampaignCriterions().add(secondBiddableCriterion);

                    ArrayList<CampaignCriterionType> criterionTypes = new ArrayList<CampaignCriterionType>();
		    criterionTypes.add(CampaignCriterionType.TARGETS);
                    AddCampaignCriterionsResponse addCriterionsResponse = CampaignManagementExampleHelper.addCampaignCriterions(campaignCriterions, criterionTypes);

                    // Capture the new criterion IDs.
        			
                    if(addCriterionsResponse.getCampaignCriterionIds().getLongs().isEmpty())
                    {
                        List<Long> criterionIds = addCriterionsResponse.getCampaignCriterionIds().getLongs();
                        for (int index = 0; index < criterionIds.size(); index++)
                        {
                            campaignCriterions.getCampaignCriterions().get(index).setId(criterionIds.get(index));
                        }
                    }
                }
        		
                // You can now store or output the campaign criterions.

                outputStatusMessage("Campaign Criterions: \n");
                CampaignManagementExampleHelper.outputArrayOfCampaignCriterion(campaignCriterions);
                
                List<AdGroup> adGroups = CampaignManagementExampleHelper.getAdGroupsByCampaignId(campaign.getId()).getAdGroups().getAdGroups();
                
                // Loop through all ad groups to get the target criterion IDs.
                
                for(AdGroup adGroup: adGroups)
                {
                    // Set adGroupCriterionIds null to get all criterions 
                    // (of the specified target criterion type or types) for the current ad group.
                    
                    ArrayOfAdGroupCriterion adGroupCriterions = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
                        null, 
                        adGroup.getId(), 
                        allTargetAdGroupCriterionTypes).getAdGroupCriterions();
                    
                    if(adGroupCriterions.getAdGroupCriterions().size() > 0)
                    {
                        // If the Smartphones device criterion already exists, we'll increase the bid multiplier by 5 percent.

                        ArrayOfAdGroupCriterion updateAdGroupCriterions = new ArrayOfAdGroupCriterion();

                        for(AdGroupCriterion adGroupCriterion: adGroupCriterions.getAdGroupCriterions())
                        {
                            if(adGroupCriterion.getCriterion() instanceof DeviceCriterion)
                            {
                                DeviceCriterion deviceCriterion = (DeviceCriterion) adGroupCriterion.getCriterion();
                                if(deviceCriterion.getDeviceName() == "Smartphones")
                                {
                                    double multiplier = ((BidMultiplier)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).getMultiplier();
                                    ((BidMultiplier)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).setMultiplier(multiplier * 1.05);
                                    updateAdGroupCriterions.getAdGroupCriterions().add(adGroupCriterion);
                                }
                            }
                        }

                        GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIdsResponse = null;

                        if(updateAdGroupCriterions.getAdGroupCriterions().size() > 0)
                        {
                            ArrayList<AdGroupCriterionType> adGroupCriterionTypes = new ArrayList<AdGroupCriterionType>();
                            adGroupCriterionTypes.add(AdGroupCriterionType.TARGETS);

                            UpdateAdGroupCriterionsResponse updateAdGroupCriterionsResponse = CampaignManagementExampleHelper.updateAdGroupCriterions(
                                    updateAdGroupCriterions, 
                                    adGroupCriterionTypes);
                        }

                        // You can now store or output the ad group criterions.

                        outputStatusMessage("Ad Group Criterions: ");
                        CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
                    }
                }
            }
            
            // Delete the campaign and ad group that were previously added. 

            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), campaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
                        
            outputStatusMessage("Program execution completed\n"); 
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
    
    private static ArrayOflong GetExampleCampaignIds(AuthorizationData authorizationData)
    {

    	ArrayOfCampaign campaigns = new ArrayOfCampaign();
    	
    	Campaign campaignOne = new Campaign();
    	campaignOne.setName("Campaign One " + Instant.now());
    	campaignOne.setDescription("Red shoes line.");
    	campaignOne.setDailyBudget(20.00);
    	campaignOne.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
    	campaignOne.setTimeZone("PacificTimeUSCanadaTijuana");
    	campaigns.getCampaigns().add(campaignOne);
    	
    	ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
    	
    	AdGroup shoesOne = new AdGroup();
    	Bid CpcBidOne = new Bid();
    	CpcBidOne.setAmount(0.09);
    	shoesOne.setName("Women's Shoe Sale One");
    	shoesOne.setLanguage("English");
    	shoesOne.setCpcBid(CpcBidOne);
    	adGroups.getAdGroups().add(shoesOne);
    	
    	AdGroup shoesTwo = new AdGroup();
    	Bid CpcBidTwo = new Bid();
    	CpcBidTwo.setAmount(0.09);
    	shoesTwo.setName("Women's Shoe Sale Two");
    	shoesTwo.setLanguage("English");
    	shoesTwo.setCpcBid(CpcBidTwo);
    	adGroups.getAdGroups().add(shoesTwo);
    	
    	AdGroup shoesThree = new AdGroup();
    	Bid CpcBidThree = new Bid();
    	CpcBidThree.setAmount(0.09);
    	shoesThree.setName("Women's Shoe Sale Three");
    	shoesThree.setLanguage("English");
    	shoesThree.setCpcBid(CpcBidThree);
    	adGroups.getAdGroups().add(shoesThree);
       
       // Add the campaigns and ad groups
       
       try
       {
            outputStatusMessage("Add campaigns:\n");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns,
                    false);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addCampaignsResponse.getPartialErrors());

            outputStatusMessage("Add ad groups:\n");
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups, false);
            ArrayOfNullableOflong nullableAdGroupIds = addAdGroupsResponse.getAdGroupIds();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableAdGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(addAdGroupsResponse.getPartialErrors());

            ArrayOflong campaignIds = new com.microsoft.bingads.v12.campaignmanagement.ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));

            return campaignIds;
        }
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
            return null;
        }
    }
}
