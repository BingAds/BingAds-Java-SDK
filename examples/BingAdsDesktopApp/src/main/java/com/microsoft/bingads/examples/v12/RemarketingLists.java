package com.microsoft.bingads.examples.v12;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class RemarketingLists extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);

            // To discover all remarketing lists that the user can associate with ad groups in the current account (per CustomerAccountId header), 
            // set RemarketingListIds to null when calling the GetRemarketingLists operation.

            ArrayList<AudienceType> audienceType = new ArrayList<AudienceType>();
            audienceType.add(AudienceType.REMARKETING_LIST);
            ArrayOfAudience remarketingLists = CampaignManagementExampleHelper.getAudiencesByIds(null, audienceType).getAudiences();

            // You must already have at least one remarketing list for the remainder of this example. 

            if (remarketingLists.getAudiences()== null || remarketingLists.getAudiences().size() < 1)
            {
                outputStatusMessage("You do not have any remarketing lists that the current user can associate with ad groups.\n");
                return;
            }
                
            // Add an ad group in a campaign. The ad group will later be associated with remarketing lists. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Summer shoes line.");
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);
            
            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Women's Red Shoes");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            adGroup.setLanguage("English");
            // Applicable for all audiences that are associated with this ad group. Set TargetAndBid to True 
            // if you want to show ads only to people included in the remarketing list, with the option to change
            // the bid amount. 
            ArrayOfSetting settings = new ArrayOfSetting();
            TargetSetting targetSetting = new TargetSetting();
            ArrayOfTargetSettingDetail targetSettingDetails = new ArrayOfTargetSettingDetail();
            TargetSettingDetail adGroupAudienceTargetSettingDetail = new TargetSettingDetail();
            adGroupAudienceTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.AUDIENCE);
            adGroupAudienceTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            targetSettingDetails.getTargetSettingDetails().add(adGroupAudienceTargetSettingDetail);
            targetSetting.setDetails(targetSettingDetails);
            settings.getSettings().add(targetSetting);
            adGroup.setSettings(settings);
            adGroups.getAdGroups().add(adGroup);
            
            // Add the campaign, ad group, keywords, and ads

            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(), 
                    campaigns,
                    false);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);
            
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(campaignIds.getLongs().get(0), adGroups, false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors);            

            // If the campaign or ad group add operations failed then we cannot continue this example. 

            if (addAdGroupsResponse.getAdGroupIds() == null || addAdGroupsResponse.getAdGroupIds().getLongs().size() < 1)
            {
                return;
            }

            ArrayOfAdGroupCriterion adGroupRemarketingListAssociations = new ArrayOfAdGroupCriterion();

            // This example associates all of the remarketing lists with the new ad group.

            for (Audience remarketingList : remarketingLists.getAudiences())
            {
                if (remarketingList.getId() != null)
                {
                    BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
                    biddableAdGroupCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
                    AudienceCriterion audienceCriterion = new AudienceCriterion();
                    audienceCriterion.setAudienceId(remarketingList.getId());
                    audienceCriterion.setAudienceType(audienceType);
                    biddableAdGroupCriterion.setCriterion(audienceCriterion);
                    BidMultiplier bidMultiplier = new BidMultiplier();
                    bidMultiplier.setMultiplier(20D);
                    biddableAdGroupCriterion.setCriterionBid(bidMultiplier);
                    biddableAdGroupCriterion.setStatus(AdGroupCriterionStatus.PAUSED);
                                        
                    adGroupRemarketingListAssociations.getAdGroupCriterions().add(biddableAdGroupCriterion);

                    outputStatusMessage("\nAssociating the following remarketing list with the ad group.\n");
                    CampaignManagementExampleHelper.outputRemarketingList((RemarketingList)remarketingList);
                }
            }
            
            ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
            criterionType.add(AdGroupCriterionType.AUDIENCE);
            
            ArrayList<AdGroupCriterionType> getCriterionType = new ArrayList<AdGroupCriterionType>();
            getCriterionType.add(AdGroupCriterionType.REMARKETING_LIST);

            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupRemarketingListAssociations,
                    criterionType);

            ArrayOflong adGroupCriterionIds = new ArrayOflong();
            for (java.lang.Long id : addAdGroupCriterionsResponse.getAdGroupCriterionIds().getLongs())
            {
                adGroupCriterionIds.getLongs().add(id);
            }
                        
            GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIdsResponse = CampaignManagementExampleHelper.getAdGroupCriterionsByIds(
                    adGroupCriterionIds,
                    adGroupIds.getLongs().get(0), 
                    getCriterionType);
            
            for (AdGroupCriterion adGroupRemarketingListAssociation : 
                    getAdGroupCriterionsByIdsResponse.getAdGroupCriterions().getAdGroupCriterions())
            {
                outputStatusMessage("\nThe following ad group remarketing list association was added.\n");
                CampaignManagementExampleHelper.outputAdGroupCriterion(adGroupRemarketingListAssociation);
            }

            // You can store the association IDs which can be used to update or delete associations later. 

            ArrayOfNullableOflong nullableAdGroupCriterionIds = addAdGroupCriterionsResponse.getAdGroupCriterionIds();

            // If the associations were added and retrieved successfully let's practice updating and deleting one of them.

            if (nullableAdGroupCriterionIds.getLongs() != null && nullableAdGroupCriterionIds.getLongs().size() > 0)
            {
                ArrayOfAdGroupCriterion adGroupRemarketingListAssociationsUpdates = new ArrayOfAdGroupCriterion();
                
                BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
                biddableAdGroupCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
                AudienceCriterion audienceCriterion = new AudienceCriterion();
                audienceCriterion.setAudienceType(audienceType);
                biddableAdGroupCriterion.setCriterion(audienceCriterion);
                BidMultiplier bidMultiplier = new BidMultiplier();
                bidMultiplier.setMultiplier(10D);
                biddableAdGroupCriterion.setCriterionBid(bidMultiplier);
                biddableAdGroupCriterion.setId(nullableAdGroupCriterionIds.getLongs().get(0));
                biddableAdGroupCriterion.setStatus(AdGroupCriterionStatus.ACTIVE);
                
                adGroupRemarketingListAssociationsUpdates.getAdGroupCriterions().add(biddableAdGroupCriterion);

                CampaignManagementExampleHelper.updateAdGroupCriterions(
                        adGroupRemarketingListAssociationsUpdates, 
                        criterionType);

                CampaignManagementExampleHelper.deleteAdGroupCriterions(
                        adGroupCriterionIds, 
                        adGroupIds.getLongs().get(0), 
                        criterionType);
            }

            // Delete the campaign, ad group, and ad group remarketing list associations that were previously added. 
            // The remarketing lists will not be deleted.
            // You should remove this line if you want to view the added entities in the 
            // Bing Ads web application or another tool.

            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), deleteCampaignIds);
            System.out.printf("Deleted CampaignId %d\n", campaignIds.getLongs().get(0));

            outputStatusMessage("Program execution completed\n"); 
         
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
 }
