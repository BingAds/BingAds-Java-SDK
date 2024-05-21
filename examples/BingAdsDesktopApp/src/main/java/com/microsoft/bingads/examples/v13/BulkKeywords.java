package com.microsoft.bingads.examples.v13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.microsoft.bingads.v13.bulk.BulkEntityIterable;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.bulk.entities.BulkEntity;
import com.microsoft.bingads.v13.bulk.entities.BulkExpandedTextAd;
import com.microsoft.bingads.v13.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v13.campaignmanagement.AdGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.Bid;
import com.microsoft.bingads.v13.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v13.campaignmanagement.Campaign;
import com.microsoft.bingads.v13.campaignmanagement.CampaignStatus;
import com.microsoft.bingads.v13.campaignmanagement.Keyword;
import com.microsoft.bingads.v13.campaignmanagement.KeywordStatus;
import com.microsoft.bingads.v13.campaignmanagement.MatchType;

public class BulkKeywords extends BulkExampleBase {
	                
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
            campaign.setName("Summer Sunglasses " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            bulkCampaign.setCampaign(campaign);

            uploadEntities.add(bulkCampaign);
            
            // Add an ad group within the campaign.

            for (int k = 0 ;k < 2; k++) {
            	long adGroupId = adGroupIdKey + k;
	            BulkAdGroup bulkAdGroup = new BulkAdGroup();
	            bulkAdGroup.setCampaignId(campaignIdKey);
	            AdGroup adGroup = new AdGroup();
	            adGroup.setId(adGroupId);
	            adGroup.setName("Sunglasses Sale " + k);
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
	            
	            for (int i= 0; i < 10; i++)
	            {
		            BulkKeyword bulkKeyword = new BulkKeyword();
		            bulkKeyword.setAdGroupId(adGroupId);
		            Keyword keyword = new Keyword(); 
		            keyword.setBid(new Bid());
		            keyword.getBid().setAmount(0.47);
		            keyword.setParam2("10% Off" + i);
		            keyword.setMatchType(MatchType.PHRASE);
		            keyword.setText("Brand-A Sunglasses " + i);
		            bulkKeyword.setKeyword(keyword);
		            
		            uploadEntities.add(bulkKeyword);
	            }
            }
            
            // Upload and write the output

            outputStatusMessage("-----\nAdding the ad campaign, ad group, keyword...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            List<BulkCampaign> campaignResults = new ArrayList<>();
            List<BulkKeyword> keywordResults = new ArrayList<>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkKeyword) {                
                    keywordResults.add((BulkKeyword) entity);
                    outputBulkKeywordsSimplified(Arrays.asList((BulkKeyword) entity) );
                } else if (entity instanceof BulkCampaign) {                
                	campaignResults.add((BulkCampaign) entity);
                } 
            }
            downloadEntities.close();
            Reader.close();
            
            // Delete the Keywords

            uploadEntities = new ArrayList<>();
                        
            for (BulkKeyword bulkKeyword : keywordResults){
            	bulkKeyword.getKeyword().setStatus(KeywordStatus.DELETED);
                uploadEntities.add(bulkKeyword);
            }
            
            outputStatusMessage("-----\nDeleting the Keywords");
            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkKeyword) {
                	outputBulkKeywordsSimplified(Arrays.asList((BulkKeyword) entity) );
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
            outputStatusMessage("-----\nDeleting the campaign and everything it contains e.g., ad groups...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
                     
            downloadEntities.close();
            Reader.close();
            outputStatusMessage("-----\nDeleting the campaign and everything it contains Done");
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
