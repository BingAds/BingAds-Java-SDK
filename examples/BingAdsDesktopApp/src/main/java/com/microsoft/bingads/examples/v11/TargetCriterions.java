package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.campaignmanagement.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryRequest;
import com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfDeviceOSTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupRequest;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfTarget;
import com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget;
import com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.Target;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class TargetCriterions extends ExampleBase {

    static ServiceClient<com.microsoft.bingads.v10.campaignmanagement.ICampaignManagementService> CampaignServiceV10;
    static ServiceClient<ICampaignManagementService> CampaignService; 
        
    public static void main(java.lang.String[] args) 
    {
    	AuthorizationData authorizationData;
        
        authorizationData = new AuthorizationData();
        authorizationData.setDeveloperToken(DeveloperToken);
        authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
        authorizationData.setCustomerId(CustomerId);
        authorizationData.setAccountId(AccountId);
         
        CampaignService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                ExampleBase.API_ENVIRONMENT,
                ICampaignManagementService.class);
        
        CampaignServiceV10 = new ServiceClient<com.microsoft.bingads.v10.campaignmanagement.ICampaignManagementService>(
                authorizationData, 
                ExampleBase.API_ENVIRONMENT,
                com.microsoft.bingads.v10.campaignmanagement.ICampaignManagementService.class);
                
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
            ArrayOflong campaignIds = GetExampleCampaignIds(authorizationData);
                     
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaignTypes.add(CampaignType.SHOPPING);
            campaignTypes.add(CampaignType.SEARCH_AND_CONTENT);
            
            // You can set campaignIds null to get all campaigns in the account, instead of 
            // adding and retrieving the example campaigns.
            
            ArrayOfCampaign getCampaigns = getCampaignsByIds(
                    authorizationData.getAccountId(),
                    campaignIds,
                    campaignTypes);
            
            // Loop through all campaigns and ad groups to get the target criterion IDs.

            for(Campaign campaign: getCampaigns.getCampaigns())
            {
                // Set campaignCriterionIds null to get all criterions 
                // (of the specified target criterion type or types) for the current campaign.
                
                GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIdsResponse = getCampaignCriterionsByIds(
                    campaignIds.getLongs().get(0), 
                    null, 
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
                    AddCampaignCriterionsResponse addCriterionsResponse = addCampaignCriterions(campaignCriterions, criterionTypes);

                    // If the campaign used to share target criterions with another campaign or ad group,
                    // and the add operation resulted in new target criterion identifiers for this campaign,
                    // then we need to get the new criterion IDs.

                    // Otherwise we only need to capture the new criterion IDs.
        			
                    if(addCriterionsResponse.getIsMigrated() == true)
                    {
                        campaignCriterions = getCampaignCriterionsByIds(
                            campaignIds.getLongs().get(0), 
                            null, 
                            allTargetCampaignCriterionTypes).getCampaignCriterions();
                    }
                    else if(addCriterionsResponse.getCampaignCriterionIds().getLongs().isEmpty())
                    {
                        List<Long> criterionIds = addCriterionsResponse.getCampaignCriterionIds().getLongs();
                        for (int index = 0; index < criterionIds.size(); index++)
                        {
                            campaignCriterions.getCampaignCriterions().get(index).setId(criterionIds.get(index));
                        }
                    }
                }
        		
                // You can now store or output the campaign criterions, whether or not they were 
                // migrated from a shared target library.

                outputStatusMessage("Campaign Criterions: \n");
                outputCampaignCriterions(campaignCriterions);
                
                List<AdGroup> adGroups = getAdGroupsByCampaignId(campaign.getId()).getAdGroups().getAdGroups();
                
                // Loop through all ad groups to get the target criterion IDs.
                
                for(AdGroup adGroup: adGroups)
                {
                    // Set adGroupCriterionIds null to get all criterions 
                    // (of the specified target criterion type or types) for the current ad group.
                    
                    ArrayOfAdGroupCriterion adGroupCriterions = getAdGroupCriterionsByIds(
                        adGroup.getId(), 
                        null, 
                        allTargetAdGroupCriterionTypes).getAdGroupCriterions();

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
        
                        UpdateAdGroupCriterionsResponse updateAdGroupCriterionsResponse = updateAdGroupCriterions(
                                updateAdGroupCriterions, 
                                adGroupCriterionTypes);

                        // If the ad group used to share target criterions with another campaign or ad group,
                        // and the update operation resulted in new target criterion identifiers for this ad group,
                        // then we need to get the new criterion IDs.

                	if (updateAdGroupCriterionsResponse.getIsMigrated())
                        {
                            getAdGroupCriterionsByIdsResponse = getAdGroupCriterionsByIds(
                                adGroup.getId(), 
                                null, 
                                allTargetAdGroupCriterionTypes);
                            adGroupCriterions = getAdGroupCriterionsByIdsResponse.getAdGroupCriterions();
                        }
                    }

                    // You can now store or output the ad group criterions, whether or not they were 
                    // migrated from a shared target library.

                    outputStatusMessage("Ad Group Criterions: ");
                    outputAdGroupCriterions(adGroupCriterions);
                }
            }
            
            // Delete the campaign and ad group that were previously added. 

            deleteCampaigns(authorizationData.getAccountId(), campaignIds);
            System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));
                        
            outputStatusMessage("Program execution completed\n"); 
        }
        // Catch authentication exceptions
        catch (OAuthTokenRequestException ex)
        {
            outputStatusMessage("Couldn't get OAuth tokens. Error: " + ex.getDetails().getError() + "/nDescription: " + ex.getDetails().getDescription());
        }
        // Catch Campaign Management service exceptions
        catch (ApiFaultDetail_Exception ex)
        {
            outputStatusMessage(ex.getMessage());
        }
        catch (AdApiFaultDetail_Exception ex)
        {
            outputStatusMessage(ex.getMessage());
        }
        catch (EditorialApiFaultDetail_Exception ex)
        {
            outputStatusMessage(ex.getMessage());
        }
        // Catch general exception
        catch(Exception e)
        {
            outputStatusMessage(e.getMessage());
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
    	Bid searchBidOne = new Bid();
    	searchBidOne.setAmount(0.09);
    	List<AdDistribution> distributionListOne = new ArrayList<AdDistribution>();
    	distributionListOne.add(AdDistribution.SEARCH);
    	shoesOne.setName("Women's Shoe Sale One");
    	shoesOne.setLanguage("English");
    	shoesOne.setSearchBid(searchBidOne);
    	shoesOne.setAdDistribution(distributionListOne);
    	adGroups.getAdGroups().add(shoesOne);
    	
    	AdGroup shoesTwo = new AdGroup();
    	Bid searchBidTwo = new Bid();
    	searchBidTwo.setAmount(0.09);
    	List<AdDistribution> distributionListTwo = new ArrayList<AdDistribution>();
    	distributionListTwo.add(AdDistribution.SEARCH);
    	shoesTwo.setName("Women's Shoe Sale Two");
    	shoesTwo.setLanguage("English");
    	shoesTwo.setSearchBid(searchBidTwo);
    	shoesTwo.setAdDistribution(distributionListTwo);
    	adGroups.getAdGroups().add(shoesTwo);
    	
    	AdGroup shoesThree = new AdGroup();
    	Bid searchBidThree = new Bid();
    	searchBidThree.setAmount(0.09);
    	List<AdDistribution> distributionListThree = new ArrayList<AdDistribution>();
    	distributionListThree.add(AdDistribution.SEARCH);
    	shoesThree.setName("Women's Shoe Sale Three");
    	shoesThree.setLanguage("English");
    	shoesThree.setSearchBid(searchBidThree);
    	shoesThree.setAdDistribution(distributionListThree);
    	adGroups.getAdGroups().add(shoesThree);
       
       // Add the campaigns and ad groups
       
       try
       {
            outputStatusMessage("Add campaigns:\n");
            AddCampaignsResponse addCampaignsResponse = addCampaigns(AccountId, campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            outputIds(nullableCampaignIds);
            outputPartialErrors(addCampaignsResponse.getPartialErrors());

            outputStatusMessage("Add ad groups:\n");
            AddAdGroupsResponse addAdGroupsResponse = addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups);
            ArrayOfNullableOflong nullableAdGroupIds = addAdGroupsResponse.getAdGroupIds();
            outputIds(nullableAdGroupIds);
            outputPartialErrors(addAdGroupsResponse.getPartialErrors());

            shareDeprecatedTargets(authorizationData, nullableAdGroupIds.getLongs());

            ArrayOflong campaignIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));

            return campaignIds;
        }
        catch(Exception e)
        {
            outputStatusMessage(e.getMessage());

            return null;
        }
    }
    
    // Adds one or more campaigns to the specified account.

    static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
    {
        AddCampaignsRequest request = new AddCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);

        return CampaignService.getService().addCampaigns(request);
    }

    // Deletes one or more campaigns from the specified account.

    static void deleteCampaigns(
            long accountId, 
            ArrayOflong campaignIds) throws RemoteException, Exception
    {
        DeleteCampaignsRequest request = new DeleteCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        CampaignService.getService().deleteCampaigns(request);
    }

    // Adds one or more ad groups to the specified campaign.

    static AddAdGroupsResponse addAdGroups(long campaignId, ArrayOfAdGroup adGroups) throws RemoteException, Exception
    {
        AddAdGroupsRequest request = new AddAdGroupsRequest();

        request.setCampaignId(campaignId);
        request.setAdGroups(adGroups);

        return CampaignService.getService().addAdGroups(request);
    }


    static ArrayOfCampaign getCampaignsByIds(
                long accountId, 
                ArrayOflong campaignIds,
                ArrayList<CampaignType> campaignType) throws RemoteException, Exception
    {
        GetCampaignsByIdsRequest request = new GetCampaignsByIdsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);
        request.setCampaignType(campaignType);

        return CampaignService.getService().getCampaignsByIds(request).getCampaigns();
    }

    static GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(long campaignId) throws RemoteException, Exception
    {
        GetAdGroupsByCampaignIdRequest request = new GetAdGroupsByCampaignIdRequest();

        request.setCampaignId(campaignId);

        return CampaignService.getService().getAdGroupsByCampaignId(request);
    }
    
    static AddAdGroupCriterionsResponse addAdGroupCriterions(
            ArrayOfAdGroupCriterion adGroupCriterions,
            ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        AddAdGroupCriterionsRequest request = new AddAdGroupCriterionsRequest();

        request.setAdGroupCriterions(adGroupCriterions);
        request.setCriterionType(criterionType);

        return CampaignService.getService().addAdGroupCriterions(request);
    }

    static GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(
        long adGroupId,
        ArrayOflong adGroupCriterionIds,
        ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        GetAdGroupCriterionsByIdsRequest request = new GetAdGroupCriterionsByIdsRequest();

        request.setAdGroupCriterionIds(adGroupCriterionIds);
        request.setAdGroupId(adGroupId);
        request.setCriterionType(criterionType);

        return CampaignService.getService().getAdGroupCriterionsByIds(request);
    }
    
    static AddCampaignCriterionsResponse addCampaignCriterions(
            ArrayOfCampaignCriterion campaignCriterions,
            ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        AddCampaignCriterionsRequest request = new AddCampaignCriterionsRequest();

        request.setCampaignCriterions(campaignCriterions);
        request.setCriterionType(criterionType);

        return CampaignService.getService().addCampaignCriterions(request);
    }

    static GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(
        long campaignId,
        ArrayOflong campaignCriterionIds,
        ArrayList<CampaignCriterionType> criterionType) throws RemoteException, Exception
    {
        GetCampaignCriterionsByIdsRequest request = new GetCampaignCriterionsByIdsRequest();

        request.setCampaignCriterionIds(campaignCriterionIds);
        request.setCampaignId(campaignId);
        request.setCriterionType(criterionType);

        return CampaignService.getService().getCampaignCriterionsByIds(request);
    }

    static UpdateAdGroupCriterionsResponse updateAdGroupCriterions(
            ArrayOfAdGroupCriterion adGroupCriterions,
            ArrayList<AdGroupCriterionType> criterionType) throws RemoteException, Exception
    {
        UpdateAdGroupCriterionsRequest request = new UpdateAdGroupCriterionsRequest();

        request.setAdGroupCriterions(adGroupCriterions);
        request.setCriterionType(criterionType);

        return CampaignService.getService().updateAdGroupCriterions(request);
    }
     
    private static java.lang.Long shareDeprecatedTargets(AuthorizationData authorizationData, List<Long> adGroupIds) throws AdApiFaultDetail_Exception, Exception
    {
    	DeviceOSTargetBid bid = new DeviceOSTargetBid();
    	bid.setBidAdjustment(20);
    	bid.setDeviceName("Computers");
    	
    	ArrayOfDeviceOSTargetBid bids = new ArrayOfDeviceOSTargetBid();
    	bids.getDeviceOSTargetBids().add(bid);
    	
    	DeviceOSTarget deviceOS = new DeviceOSTarget();
    	deviceOS.setBids(bids);
    	
    	Target sharedTarget = new Target();
    	sharedTarget.setName("My Target");
    	sharedTarget.setDeviceOS(deviceOS);
    	
    	ArrayOfTarget targets = new ArrayOfTarget();
    	targets.getTargets().add(sharedTarget);
    	
    	AddTargetsToLibraryRequest addTargetsToLibraryRequest = new AddTargetsToLibraryRequest();
    	addTargetsToLibraryRequest.setTargets(targets);
    	
    	AddTargetsToLibraryResponse addTargetsToLibraryResponse = CampaignServiceV10.getService().addTargetsToLibrary(addTargetsToLibraryRequest);
    	long sharedTargetId = addTargetsToLibraryResponse.getTargetIds().getLongs().get(0);
    	outputStatusMessage("Added Target Id: \n" + sharedTargetId);
    	
    	for(long adGroupId: adGroupIds)
    	{
            SetTargetToAdGroupRequest setTargetToAdGroupRequest = new SetTargetToAdGroupRequest();
            setTargetToAdGroupRequest.setAdGroupId(adGroupId);
            setTargetToAdGroupRequest.setTargetId(sharedTargetId);

            CampaignServiceV10.getService().setTargetToAdGroup(setTargetToAdGroupRequest);

            outputStatusMessage("Associated AdGroupId " + adGroupId + " with TargetId " + sharedTargetId + ".\n");
    	}
        
        return sharedTargetId;
    }
}