package com.microsoft.bingads.examples.v12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;

import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.bulk.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class BulkRemarketingLists extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.REMARKETING_LISTS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);
            downloadParameters.setResultFileDirectory(new File(FileDirectory));
            downloadParameters.setResultFileName(DownloadFileName);
            downloadParameters.setOverwriteResultFile(true);
            downloadParameters.setLastSyncTimeInUTC(null);

            outputStatusMessage("-----\nDownloading all remarketing lists that the current user can associate with ad groups.");
            
            File bulkFilePath = BulkServiceManager.downloadFileAsync(
                    downloadParameters, 
                    null, 
                    null).get();
            
            Reader = new BulkFileReader(
                    bulkFilePath, 
                    ResultFileType.FULL_DOWNLOAD, 
                    BulkDownloadFileType);
            
            outputStatusMessage("Download results:");
            
            downloadEntities = Reader.getEntities();

            List<BulkRemarketingList> remarketingListResults = new ArrayList<BulkRemarketingList>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkRemarketingList) {
                    remarketingListResults.add((BulkRemarketingList) entity);
                    outputBulkRemarketingLists(Arrays.asList((BulkRemarketingList) entity) );
                }
            }
            
            downloadEntities.close();
            Reader.close();

            // You must already have at least one remarketing list. 
            
            if (remarketingListResults.size() < 1)
            {
                return;
            }
            
            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            // Add an ad group in a campaign. The ad group will later be associated with remarketing lists.
            
            BulkCampaign bulkCampaign = new BulkCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setId(campaignIdKey);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            bulkCampaign.setCampaign(campaign);

            uploadEntities.add(bulkCampaign);

            BulkAdGroup bulkAdGroup = new BulkAdGroup();
            bulkAdGroup.setCampaignId(campaignIdKey);
            AdGroup adGroup = new AdGroup();
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            adGroup.setId(adGroupIdKey);
            adGroup.setName("Women's Red Shoe Sale");
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            adGroup.setStartDate(null);            
            // Applicable for all remarketing lists that are associated with this ad group. TargetAndBid indicates 
            // that you want to show ads only to people included in the remarketing list, with the option to change
            // the bid amount. Ads in this ad group will only show to people included in the remarketing list.
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
            bulkAdGroup.setAdGroup(adGroup);
            
            uploadEntities.add(bulkAdGroup);

            // For example, associate all of the remarketing lists with the new ad group.

            for (BulkRemarketingList bulkRemarketingList : remarketingListResults) {
                if(bulkRemarketingList.getRemarketingList() != null && bulkRemarketingList.getRemarketingList().getId() != null)
                {
                    BulkAdGroupRemarketingListAssociation bulkAdGroupRemarketingListAssociation = new BulkAdGroupRemarketingListAssociation();
                    bulkAdGroupRemarketingListAssociation.setClientId("MyBulkAdGroupRemarketingListAssociation " + bulkRemarketingList.getRemarketingList().getId());
                    BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
                    biddableAdGroupCriterion.setAdGroupId(adGroupIdKey);
                    AudienceCriterion audienceCriterion = new AudienceCriterion();
                    audienceCriterion.setAudienceId(bulkRemarketingList.getRemarketingList().getId());
                    ArrayList<AudienceType> audienceType = new ArrayList<AudienceType>();
                    audienceType.add(AudienceType.REMARKETING_LIST);
                    audienceCriterion.setAudienceType(audienceType);
                    biddableAdGroupCriterion.setCriterion(audienceCriterion);
                    BidMultiplier bidMultiplier = new BidMultiplier();
                    bidMultiplier.setMultiplier(20D);
                    biddableAdGroupCriterion.setCriterionBid(bidMultiplier);
                    biddableAdGroupCriterion.setStatus(AdGroupCriterionStatus.PAUSED);
                    bulkAdGroupRemarketingListAssociation.setBiddableAdGroupCriterion(biddableAdGroupCriterion);

                    uploadEntities.add(bulkAdGroupRemarketingListAssociation);
                }
            }

            outputStatusMessage("\nAdding campaign, ad group, and ad group remarketing list associations...");

            // Upload and write the output

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();

            outputStatusMessage("Upload results:");
            
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                    campaignResults.add((BulkCampaign) entity);
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
                else if (entity instanceof BulkAdGroup) {
                    outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                }
                else if (entity instanceof BulkAdGroupRemarketingListAssociation) {
                    outputBulkAdGroupRemarketingListAssociations(Arrays.asList((BulkAdGroupRemarketingListAssociation) entity) );
                }
            }
            
            downloadEntities.close();
            Reader.close();

            // Delete the campaign and everything it contains e.g., ad groups and ads.   

            uploadEntities = new ArrayList<BulkEntity>();
            
            for (BulkCampaign campaignResult : campaignResults){
                campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
                uploadEntities.add(campaignResult);
            }

            // Upload and write the output
            
            outputStatusMessage("-----\nDeleting the campaign and everything it contains e.g., ad groups and ads...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
            }
            
            downloadEntities.close();
            Reader.close();
        }
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    outputStatusMessage(ex.getMessage());
                }
            }
        }
    }
}
