package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Calendar;

public class ProfileCriteria extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            // Create an Audience campaign with one ad group.
                        
            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            // CampaignType must be set for Audience campaigns
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.AUDIENCE);
            campaign.setCampaignType(campaignTypes);
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
            // Network cannot be set for ad groups in Audience campaigns
            adGroup.setNetwork(null);
            // Sets the "target and bid" option for CompanyName, Industry, and JobFunction. 
            // Microsoft will only deliver ads to people who meet at least one of your criteria.
            // By default the "bid only" option is set for Audience, Age, and Gender.
            // Microsoft will deliver ads to all audiences, ages, and genders, if they meet
            // your company name, industry, or job function criteria. 
            ArrayOfSetting settings = new ArrayOfSetting();
            TargetSetting targetSetting = new TargetSetting();
            ArrayOfTargetSettingDetail targetSettingDetails = new ArrayOfTargetSettingDetail();
            TargetSettingDetail adGroupCompanyNameTargetSettingDetail = new TargetSettingDetail();
            adGroupCompanyNameTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.COMPANY_NAME);
            adGroupCompanyNameTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            targetSettingDetails.getTargetSettingDetails().add(adGroupCompanyNameTargetSettingDetail);
            TargetSettingDetail adGroupIndustryTargetSettingDetail = new TargetSettingDetail();
            adGroupIndustryTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.INDUSTRY);
            adGroupIndustryTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            targetSettingDetails.getTargetSettingDetails().add(adGroupIndustryTargetSettingDetail);
            TargetSettingDetail adGroupJobFunctionTargetSettingDetail = new TargetSettingDetail();
            adGroupJobFunctionTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.JOB_FUNCTION);
            adGroupJobFunctionTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            targetSettingDetails.getTargetSettingDetails().add(adGroupJobFunctionTargetSettingDetail);
            targetSetting.setDetails(targetSettingDetails);
            settings.getSettings().add(targetSetting);
            adGroup.setSettings(settings);
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

            // Whether or not the "target and bid" option has been set for a given
            // criterion type group, you can set bid adjustments for specific criteria.
            
            ArrayOfAdGroupCriterion adGroupCriterions = new ArrayOfAdGroupCriterion();
            BidMultiplier criterionBid = new BidMultiplier();
            criterionBid.setMultiplier(20D);

            // ProfileCriterion for CompanyName
            BiddableAdGroupCriterion adGroupCompanyNameCriterion = new BiddableAdGroupCriterion();
            adGroupCompanyNameCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
            adGroupCompanyNameCriterion.setCriterionBid(criterionBid);
            ProfileCriterion companyNameCriterion = new ProfileCriterion();
            companyNameCriterion.setProfileId(808251207L); // Microsoft
            ArrayList<ProfileType> companyProfileType = new ArrayList<ProfileType>();
            companyProfileType.add(ProfileType.COMPANY_NAME);
            companyNameCriterion.setProfileType(companyProfileType);
            adGroupCompanyNameCriterion.setCriterion(companyNameCriterion);
            adGroupCriterions.getAdGroupCriterions().add(adGroupCompanyNameCriterion);
           
            // ProfileCriterion for Industry
            BiddableAdGroupCriterion adGroupIndustryCriterion = new BiddableAdGroupCriterion();
            adGroupIndustryCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
            adGroupIndustryCriterion.setCriterionBid(criterionBid);
            ProfileCriterion industryCriterion = new ProfileCriterion();
            industryCriterion.setProfileId(807658654L); // Computer & Network Security
            ArrayList<ProfileType> industryProfileType = new ArrayList<ProfileType>();
            industryProfileType.add(ProfileType.INDUSTRY);
            industryCriterion.setProfileType(industryProfileType);
            adGroupIndustryCriterion.setCriterion(industryCriterion);
            adGroupCriterions.getAdGroupCriterions().add(adGroupIndustryCriterion);
            
            // ProfileCriterion for JobFunction
            BiddableAdGroupCriterion adGroupJobFunctionCriterion = new BiddableAdGroupCriterion();
            adGroupJobFunctionCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
            adGroupJobFunctionCriterion.setCriterionBid(criterionBid);
            ProfileCriterion jobFunctionCriterion = new ProfileCriterion();
            jobFunctionCriterion.setProfileId(807658477L); // Engineering
            ArrayList<ProfileType> jobFunctionProfileType = new ArrayList<ProfileType>();
            jobFunctionProfileType.add(ProfileType.JOB_FUNCTION);
            jobFunctionCriterion.setProfileType(jobFunctionProfileType);
            adGroupJobFunctionCriterion.setCriterion(jobFunctionCriterion);
            adGroupCriterions.getAdGroupCriterions().add(adGroupJobFunctionCriterion);
            
            // Exclude ages twenty-five through thirty-four.
            
            NegativeAdGroupCriterion adGroupNegativeAgeCriterion = new NegativeAdGroupCriterion();
            adGroupNegativeAgeCriterion.setAdGroupId(adGroupIds.getLongs().get(0));
            AgeCriterion ageCriterion = new AgeCriterion();
            ageCriterion.setAgeRange(AgeRange.TWENTY_FIVE_TO_THIRTY_FOUR);
            adGroupNegativeAgeCriterion.setCriterion(ageCriterion);
            adGroupCriterions.getAdGroupCriterions().add(adGroupNegativeAgeCriterion);
            
            outputStatusMessage("-----\nAddAdGroupCriterions:");
            CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
            ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
            criterionType.add(AdGroupCriterionType.TARGETS);     
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse = CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupCriterions, 
                    criterionType);
            ArrayOfNullableOflong adGroupCriterionIds = addAdGroupCriterionsResponse.getAdGroupCriterionIds();
            outputStatusMessage("AdGroupCriterionIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupCriterionIds);
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addAdGroupCriterionsResponse.getNestedPartialErrors());

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
