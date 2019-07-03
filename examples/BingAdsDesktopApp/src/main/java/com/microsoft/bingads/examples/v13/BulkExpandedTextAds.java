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
            
            // Setup an ad customizer feed that can be referenced later in the ad copy. 
            
            BulkFeed bulkFeed = new BulkFeed();
            List<BulkFeed.FeedCustomAttribute> customAttributes = new ArrayList<BulkFeed.FeedCustomAttribute>();
            BulkFeed.FeedCustomAttribute attribute1 = new BulkFeed.FeedCustomAttribute();
            attribute1.setFeedAttributeType("String");
            attribute1.setName("Product");
            customAttributes.add(attribute1);
            BulkFeed.FeedCustomAttribute attribute2 = new BulkFeed.FeedCustomAttribute();
            attribute2.setFeedAttributeType("String");
            attribute2.setName("Materials_Lightweight");
            customAttributes.add(attribute2);
            BulkFeed.FeedCustomAttribute attribute3 = new BulkFeed.FeedCustomAttribute();
            attribute3.setFeedAttributeType("String");
            attribute3.setName("Description_Lightweight");
            customAttributes.add(attribute3);
            BulkFeed.FeedCustomAttribute attribute4 = new BulkFeed.FeedCustomAttribute();
            attribute4.setFeedAttributeType("Int64");
            attribute4.setName("Finishes");
            customAttributes.add(attribute4);
            BulkFeed.FeedCustomAttribute attribute5 = new BulkFeed.FeedCustomAttribute();
            attribute5.setFeedAttributeType("Price");
            attribute5.setName("StartPrice");
            customAttributes.add(attribute5);
            bulkFeed.setCustomAttributes(customAttributes);
            bulkFeed.setId(feedIdKey);
            bulkFeed.setName("My AdCustomizerFeed " + System.currentTimeMillis());
            bulkFeed.setStatus(Status.ACTIVE);
            bulkFeed.setSubType("AdCustomizerFeed");
                        
            uploadEntities.add(bulkFeed);
            
            
            BulkFeedItem bulkFeedItem = new BulkFeedItem();
            bulkFeedItem.setClientId("YourClientIdGoesHere");
            bulkFeedItem.setFeedId(feedIdKey);
            bulkFeedItem.setCustomAttributes("{\"Product\":\"Contoso 900\","
                    + "\"Materials_Lightweight\":\"titanium or acetate\","
                    + "\"Description_Lightweight\":\"Stylish, lightweight shades\","
                    + "\"Finishes\":8,"
                    + "\"StartPrice\":\"$24.99\"}");
            ArrayOfDayTime dayTimeRanges = new ArrayOfDayTime();
            DayTime monday = new DayTime();
            monday.setDay(Day.MONDAY);
            monday.setStartHour(9);
            monday.setStartMinute(Minute.ZERO);
            monday.setEndHour(21);
            monday.setEndMinute(Minute.ZERO);
            dayTimeRanges.getDayTimes().add(monday);
            bulkFeedItem.setDayTimeRanges(dayTimeRanges);
            bulkFeedItem.setIntentOption(IntentOption.PEOPLE_IN);
            bulkFeedItem.setKeyword("lightweight sunglasses");
            bulkFeedItem.setLocationId(190L);
            bulkFeedItem.setMatchType(MatchType.BROAD);
            bulkFeedItem.setStatus(Status.ACTIVE);  
            
            uploadEntities.add(bulkFeedItem);
            
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

            BulkAdGroup bulkAdGroup = new BulkAdGroup();
            bulkAdGroup.setCampaignId(campaignIdKey);
            AdGroup adGroup = new AdGroup();
            adGroup.setId(adGroupIdKey);
            adGroup.setName("Sunglasses Sale");
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
            keyword.setText("Brand-A Sunglasses");
            bulkKeyword.setKeyword(keyword);
            
            uploadEntities.add(bulkKeyword);

            BulkExpandedTextAd bulkExpandedTextAd = new BulkExpandedTextAd();
            bulkExpandedTextAd.setAdGroupId(adGroupIdKey);
            ExpandedTextAd expandedTextAd = new ExpandedTextAd();
            ArrayOfstring finalUrls = new ArrayOfstring();
            finalUrls.getStrings().add("https://www.contoso.com");
            expandedTextAd.setFinalUrls(finalUrls);
            expandedTextAd.setTitlePart1("The latest {=Sunglasses.Product}s");
            expandedTextAd.setTitlePart2("In {=Sunglasses.Materials_Lightweight}");
            expandedTextAd.setTitlePart3(null);
            expandedTextAd.setText("{=Sunglasses.Description_Lightweight} in {=Sunglasses.Finishes} finishes.");
            expandedTextAd.setTextPart2("Starting at only {=Sunglasses.StartPrice}!");
            expandedTextAd.setPath1("deals");
            expandedTextAd.setPath2(null);            
            bulkExpandedTextAd.setExpandedTextAd(expandedTextAd);
            
            uploadEntities.add(bulkExpandedTextAd);
            
            // Upload and write the output

            outputStatusMessage("-----\nAdding the ad customizer feed, campaign, ad group, keyword, and ad...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            List<BulkFeed> feedResults = new ArrayList<>();
            List<BulkCampaign> campaignResults = new ArrayList<>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkFeed) {
                        feedResults.add((BulkFeed) entity);
                        outputBulkFeeds(Arrays.asList((BulkFeed) entity) );
                }
                else if (entity instanceof BulkFeedItem) {
                        outputBulkFeedItems(Arrays.asList((BulkFeedItem) entity) );
                }
                else if (entity instanceof BulkCampaign) {
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
            
            // Delete the feed and campaign and everything it contains e.g., ad groups and ads. 

            uploadEntities = new ArrayList<>();
            
            for (BulkFeed feedResult : feedResults){
                feedResult.setStatus(Status.DELETED);
                uploadEntities.add(feedResult);
            }
            
            for (BulkCampaign campaignResult : campaignResults){
                campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
                uploadEntities.add(campaignResult);
            }

            // Upload and write the output
            
            outputStatusMessage("-----\nDeleting the feed and campaign and everything it contains e.g., ad groups and ads...");

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
