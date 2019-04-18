package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.v13.bulk.entities.*;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.bulk.BulkEntityIterable;
import static com.microsoft.bingads.examples.v13.BulkExampleBase.BulkServiceManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;

public class BulkExpandedTextAds extends BulkExampleBase {
	                
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);
            
            List<BulkEntity> uploadEntities = new ArrayList<>();
            
            // Add a search campaign.
            
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
            
            // Add an ad group within the campaign.

            BulkAdGroup bulkAdGroup = new BulkAdGroup();
            bulkAdGroup.setCampaignId(campaignIdKey);
            AdGroup adGroup = new AdGroup();
            adGroup.setId(adGroupIdKey);
            adGroup.setName("Women's Red Shoe Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            bulkAdGroup.setAdGroup(adGroup);
            
            uploadEntities.add(bulkAdGroup);
            
            // Add keywords and ads within the ad group.
            
            BulkKeyword bulkKeyword = new BulkKeyword();
            bulkKeyword.setAdGroupId(adGroupIdKey);
            Keyword keyword = new Keyword(); 
            keyword.setBid(new Bid());
            keyword.getBid().setAmount(0.47);
            keyword.setParam2("10% Off");
            keyword.setMatchType(MatchType.PHRASE);
            keyword.setText("Brand-A Shoes");
            bulkKeyword.setKeyword(keyword);
            
            uploadEntities.add(bulkKeyword);

            BulkExpandedTextAd bulkExpandedTextAd = new BulkExpandedTextAd();
            bulkExpandedTextAd.setAdGroupId(adGroupIdKey);
            ExpandedTextAd expandedTextAd = new ExpandedTextAd();
            ArrayOfstring finalUrls = new ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            expandedTextAd.setFinalUrls(finalUrls);
            expandedTextAd.setTitlePart1("Contoso");
            expandedTextAd.setTitlePart2("Quick & Easy Setup");
            expandedTextAd.setTitlePart3("Seemless Integration");
            expandedTextAd.setText("Find New Customers & Increase Sales!");
            expandedTextAd.setTextPart2("Start Advertising on Contoso Today.");
            expandedTextAd.setPath1("seattle");
            expandedTextAd.setPath2("shoe sale");            
            bulkExpandedTextAd.setExpandedTextAd(expandedTextAd);
            
            uploadEntities.add(bulkExpandedTextAd);
            
            // Upload and write the output

            outputStatusMessage("-----\nAdding campaign, ad group, keyword, and ad...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            List<BulkCampaign> campaignResults = new ArrayList<>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                        campaignResults.add((BulkCampaign) entity);
                        outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
                else if (entity instanceof BulkAdGroup) {
                        outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                }
                else if (entity instanceof BulkKeyword) {
                        outputBulkKeywords(Arrays.asList((BulkKeyword) entity) );
                }
                else if (entity instanceof BulkExpandedTextAd) {
                        outputBulkExpandedTextAds(Arrays.asList((BulkExpandedTextAd) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
            
            // Delete the campaign and everything it contains e.g., ad groups and ads.   

            uploadEntities = new ArrayList<>();
            
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
