package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;
import java.util.Calendar;

public class AudienceCampaigns extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	
        // You'll need to add media before you can run this example. 
        // For details, see ImageMedia.java
        
        java.lang.Long LANDSCAPE_IMAGE_MEDIA_ID = 0L;
        java.lang.Long LANDSCAPE_LOGO_MEDIA_ID = 0L;
        java.lang.Long SQUARE_IMAGE_MEDIA_ID = 0L;
        java.lang.Long SQUARE_LOGO_MEDIA_ID = 0L;
        
        try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            // Setup an Audience campaign with one ad group and a responsive ad.
            
            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            // CampaignType must be set for Audience campaigns
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.AUDIENCE);
            campaign.setCampaignType(campaignTypes);
            // Languages must be set for Audience campaigns
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring languages = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            campaign.setDescription("Red shoes line.");
            campaign.setDailyBudget(50.0);
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

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
            // Language cannot be set for ad groups in Audience campaigns
            adGroup.setLanguage(null);
            // Network cannot be set for ad groups in Audience campaigns
            adGroup.setNetwork(null);
            // By including the corresponding TargetSettingDetail, 
            // this example sets the "target and bid" option for 
            // CompanyName, Industry, and JobFunction. We will only deliver ads to 
            // people who meet at least one of your criteria.
            // By default the "bid only" option is set for Audience, Age, and Gender.
            // We will deliver ads to all audiences, ages, and genders, if they meet
            // your company name, industry, or job function criteria. 
            ArrayOfSetting adGroupSettings = new ArrayOfSetting();
            TargetSetting adGroupTargetSetting = new TargetSetting();            
            ArrayOfTargetSettingDetail adGroupTargetSettingDetails = new ArrayOfTargetSettingDetail();
            
            TargetSettingDetail adGroupCompanyNameTargetSettingDetail = new TargetSettingDetail();
            adGroupCompanyNameTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.COMPANY_NAME);
            adGroupCompanyNameTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            adGroupTargetSettingDetails.getTargetSettingDetails().add(adGroupCompanyNameTargetSettingDetail);
            
            TargetSettingDetail adGroupIndustryTargetSettingDetail = new TargetSettingDetail();
            adGroupIndustryTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.INDUSTRY);
            adGroupIndustryTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            adGroupTargetSettingDetails.getTargetSettingDetails().add(adGroupIndustryTargetSettingDetail);
            
            TargetSettingDetail adGroupJobFunctionTargetSettingDetail = new TargetSettingDetail();
            adGroupJobFunctionTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.JOB_FUNCTION);
            adGroupJobFunctionTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
            adGroupTargetSettingDetails.getTargetSettingDetails().add(adGroupJobFunctionTargetSettingDetail);
            
            adGroupTargetSetting.setDetails(adGroupTargetSettingDetails);
            adGroupSettings.getSettings().add(adGroupTargetSetting);
            adGroup.setSettings(adGroupSettings);
            adGroups.getAdGroups().add(adGroup);

            ArrayOfAd ads = new ArrayOfAd();
            ResponsiveAd responsiveAd = new ResponsiveAd();
            // Not applicable for responsive ads
            responsiveAd.setAdFormatPreference(null);
            responsiveAd.setBusinessName("Contoso");
            responsiveAd.setCallToAction(CallToAction.ADD_TO_CART);
            // Not applicable for responsive ads
            responsiveAd.setDevicePreference(null);
            responsiveAd.setEditorialStatus(null);
            responsiveAd.setFinalAppUrls(null);            
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
            responsiveAd.setFinalMobileUrls(finalMobileUrls);
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            responsiveAd.setFinalUrls(finalUrls);
            responsiveAd.setForwardCompatibilityMap(null);
            responsiveAd.setHeadline("Fast & Easy Setup");
            responsiveAd.setId(null);
            responsiveAd.setLandscapeImageMediaId(LANDSCAPE_IMAGE_MEDIA_ID);
            responsiveAd.setLandscapeLogoMediaId(LANDSCAPE_LOGO_MEDIA_ID);
            responsiveAd.setLongHeadline("Find New Customers & Increase Sales!");
            responsiveAd.setSquareImageMediaId(SQUARE_IMAGE_MEDIA_ID);
            responsiveAd.setSquareLogoMediaId(SQUARE_LOGO_MEDIA_ID);
            responsiveAd.setStatus(null);
            responsiveAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
            responsiveAd.setTrackingUrlTemplate(null);
            responsiveAd.setType(null);
            responsiveAd.setUrlCustomParameters(null);
            ads.getAds().add(responsiveAd);

            // Add the campaign, ad group, and ad

            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(authorizationData.getAccountId(), campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups, false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors);

            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(adGroupIds.getLongs().get(0), ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);

            // Whether or not the "target and bid" option has been set for a given
            // criterion type group, you can set bid adjustments for specific criteria.
            
            ArrayOfAdGroupCriterion adGroupCriterions = new ArrayOfAdGroupCriterion();
            FixedBid criterionBid = new FixedBid();
            criterionBid.setAmount(0.50D);

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
            
            outputStatusMessage("Adding Ad Group Criteria . . . \n");
            CampaignManagementExampleHelper.outputArrayOfAdGroupCriterion(adGroupCriterions);
            ArrayList<AdGroupCriterionType> criterionType = new ArrayList<AdGroupCriterionType>();
            criterionType.add(AdGroupCriterionType.TARGETS);     
            AddAdGroupCriterionsResponse addAdGroupCriterionsResponse =
                CampaignManagementExampleHelper.addAdGroupCriterions(
                    adGroupCriterions, 
                    criterionType);
            ArrayOfNullableOflong adGroupCriterionIds = addAdGroupCriterionsResponse.getAdGroupCriterionIds();
            outputStatusMessage("New Ad Group Criterion Ids:\n");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupCriterionIds);
            outputStatusMessage("\nAddAdGroupCriterions Errors:\n");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addAdGroupCriterionsResponse.getNestedPartialErrors());

            // Delete the campaign, ad group, criteria, and ad that were previously added. 
            // You should remove this line if you want to view the added entities in the 
            // Bing Ads web application or another tool.

            ArrayOflong campaignIds = new com.microsoft.bingads.v12.campaignmanagement.ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), campaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", nullableCampaignIds.getLongs().get(0)));
            
            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
 }
