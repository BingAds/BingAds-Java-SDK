package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.v13.adinsight.ArrayOfDomainCategory;
import com.microsoft.bingads.v13.adinsight.GetDomainCategoriesResponse;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.v13.bulk.entities.*;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.bulk.BulkEntityIterable;
import static com.microsoft.bingads.examples.v13.BulkExampleBase.BulkServiceManager;
import com.microsoft.bingads.v13.adinsight.IAdInsightService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;

public class BulkDynamicSearchAds extends BulkExampleBase {
	           
    public final static String DOMAIN_NAME = "contoso.com";
    public final static String LANGUAGE = "EN";
    
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();
            
            AdInsightExampleHelper.AdInsightService = new ServiceClient<IAdInsightService>(
                            authorizationData, 
                            API_ENVIRONMENT,
                            IAdInsightService.class); 

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);
            
            List<BulkEntity> uploadEntities = new ArrayList<>();
            
            // Setup a page feed that can be associated with one or more campaigns. 
            
            BulkFeed bulkFeed = new BulkFeed();
            List<BulkFeed.FeedCustomAttribute> customAttributes = new ArrayList<BulkFeed.FeedCustomAttribute>();
            BulkFeed.FeedCustomAttribute attribute1 = new BulkFeed.FeedCustomAttribute();
            attribute1.setFeedAttributeType("Url");
            attribute1.setName("Page Url");
            customAttributes.add(attribute1);
            BulkFeed.FeedCustomAttribute attribute2 = new BulkFeed.FeedCustomAttribute();
            attribute2.setFeedAttributeType("StringList");
            attribute2.setName("Custom Label");
            customAttributes.add(attribute2);            
            bulkFeed.setCustomAttributes(customAttributes);
            bulkFeed.setId(feedIdKey);
            bulkFeed.setName("My PageFeed " + System.currentTimeMillis());
            bulkFeed.setStatus(Status.ACTIVE);
            bulkFeed.setSubType("PageFeed");
                        
            uploadEntities.add(bulkFeed);
            
            
            BulkFeedItem bulkFeedItem = new BulkFeedItem();
            bulkFeedItem.setFeedId(feedIdKey);
            bulkFeedItem.setCustomAttributes(
                String.format(
                    "{\"Page Url\":\"https://%s/3001\",\"Custom Label\":[\"Label_1_3001\",\"Label_2_3001\"]}", 
                    DOMAIN_NAME
                )
            );
            bulkFeedItem.setStatus(Status.ACTIVE);  
            
            uploadEntities.add(bulkFeedItem);
            
            // To get started with dynamic search ads, first you'll need to add a new Campaign 
            // with its type set to DynamicSearchAds. When you create the campaign, you'll need to 
            // include a DynamicSearchAdsSetting that specifies the target website domain and language.
            // Page feeds can be associated at the campaign level via 'Source' and 'Page Feed Ids'.
            
            BulkCampaign bulkCampaign = new BulkCampaign();
            Campaign campaign = new Campaign();
            campaign.setId(campaignIdKey);
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            List<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaign.setCampaignType(campaignTypes);
            campaign.setDailyBudget(50.00);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring languages = 
                    new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
            // Set the target website domain and language.
            // Be sure to set the Source to AdvertiserSuppliedUrls or All, 
            // otherwise the PageFeedIds will be ignored. 
            DynamicSearchAdsSetting dynamicSearchAdsSetting = new DynamicSearchAdsSetting();
            dynamicSearchAdsSetting.setDomainName("contoso.com");
            dynamicSearchAdsSetting.setLanguage("English");
            dynamicSearchAdsSetting.setSource(DynamicSearchAdsSource.ALL);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOflong pageFeedIds = 
                    new com.microsoft.bingads.v13.campaignmanagement.ArrayOflong();
            pageFeedIds.getLongs().add(feedIdKey);
            dynamicSearchAdsSetting.setPageFeedIds(pageFeedIds);
            ArrayOfSetting arrayOfSetting = new ArrayOfSetting();
            arrayOfSetting.getSettings().add(dynamicSearchAdsSetting);
            campaign.setSettings(arrayOfSetting);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            bulkCampaign.setCampaign(campaign);

            uploadEntities.add(bulkCampaign);
            
            // Create a new ad group within the dynamic search ads campaign. 

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
            
            // Create an auto target based on the custom label feed items created above e.g., "Label_1_3001".
            
            BulkAdGroupDynamicSearchAdTarget adGroupWebpagePositiveCustomLabel = 
                    getExampleAdGroupWebpagePositiveCustomLabel(adGroupIdKey);
            uploadEntities.add(adGroupWebpagePositiveCustomLabel);
            
            // To discover the categories that you can use for Webpage criterion (positive or negative), 
            // use the GetDomainCategories operation with the Ad Insight service.
            
            outputStatusMessage("-----\nGetDomainCategories:");
            GetDomainCategoriesResponse getDomainCategoriesResponse = AdInsightExampleHelper.getDomainCategories(
                    null, 
                    DOMAIN_NAME, 
                    LANGUAGE);
            ArrayOfDomainCategory categories = getDomainCategoriesResponse.getCategories();
            outputStatusMessage("Categories:");
            AdInsightExampleHelper.outputArrayOfDomainCategory(categories);

            // If any categories are available let's use one as a condition.
            if(categories.getDomainCategories().size() > 0)
            {
            	BulkAdGroupDynamicSearchAdTarget adGroupWebpagePositiveCategory = 
                    getExampleAdGroupWebpagePositiveCategory(adGroupIdKey, categories);
                uploadEntities.add(adGroupWebpagePositiveCategory);
            }
	        
            // If you want to exclude certain portions of your web site, you can add negative Webpage 
            // criterion at the campaign and ad group level.            
            
            BulkAdGroupNegativeDynamicSearchAdTarget adGroupWebpageNegativeUrl = 
                    getExampleAdGroupWebpageNegativeUrl(adGroupIdKey);
            uploadEntities.add(adGroupWebpageNegativeUrl);
            
            // Finally you must add at least one Dynamic Search Ad into the ad group. The ad title and display URL 
            // are generated automatically based on the website domain and language that you want to target.
            
            BulkDynamicSearchAd bulkDynamicSearchAd = new BulkDynamicSearchAd();
            bulkDynamicSearchAd.setAdGroupId(adGroupIdKey);
            DynamicSearchAd dynamicSearchAd  = new DynamicSearchAd();
            dynamicSearchAd.setText("Find New Customers & Increase Sales!");
            dynamicSearchAd.setTextPart2("Start Advertising on Contoso Today.");
            dynamicSearchAd.setPath1("seattle");
            dynamicSearchAd.setPath2("shoe sale");
            // You cannot set FinalUrls for dynamic search ads. 
            // The Final URL will be a dynamically selected landing page.
            // The final URL is distinct from the path that customers will see and click on in your ad.
            dynamicSearchAd.setFinalUrls(null); 
            bulkDynamicSearchAd.setAd(dynamicSearchAd);
            uploadEntities.add(bulkDynamicSearchAd);
            
            // Upload and write the output

            outputStatusMessage("-----\nAdding page feed, campaign, ad group, criterions, and ads...");

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
                else if (entity instanceof BulkAdGroupNegativeDynamicSearchAdTarget) {
                        outputBulkAdGroupNegativeDynamicSearchAdTargets(Arrays.asList((BulkAdGroupNegativeDynamicSearchAdTarget) entity) );
                }
                else if (entity instanceof BulkAdGroupDynamicSearchAdTarget) {
                        outputBulkAdGroupDynamicSearchAdTargets(Arrays.asList((BulkAdGroupDynamicSearchAdTarget) entity) );
                }
                else if (entity instanceof BulkDynamicSearchAd) {
                        outputBulkDynamicSearchAds(Arrays.asList((BulkDynamicSearchAd) entity) );
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
            
            outputStatusMessage("-----\nDeleting page feed, DSA campaign, and all contained entities...");

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkFeed) {
                    outputBulkFeeds(Arrays.asList((BulkFeed) entity) );
                }
                else if (entity instanceof BulkCampaign) {
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
    
    protected static BulkAdGroupDynamicSearchAdTarget getExampleAdGroupWebpagePositiveCustomLabel(long adGroupId)
    {
        BulkAdGroupDynamicSearchAdTarget bulkAdGroupDynamicSearchAdTarget = new BulkAdGroupDynamicSearchAdTarget();
        BiddableAdGroupCriterion adGroupWebpagePositiveCustomLabel = new BiddableAdGroupCriterion();
        adGroupWebpagePositiveCustomLabel.setAdGroupId(adGroupId);
        FixedBid criterionBid = new FixedBid();
        criterionBid.setAmount(0.50);
        adGroupWebpagePositiveCustomLabel.setCriterionBid(criterionBid);
        WebpageCondition condition = new WebpageCondition();
        condition.setOperand(WebpageConditionOperand.CUSTOM_LABEL);
        condition.setArgument("Label_1_3001");
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(condition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName("Ad Group Webpage Positive Custom Label Criterion");
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpagePositiveCustomLabel.setCriterion(criterion);
        bulkAdGroupDynamicSearchAdTarget.setBiddableAdGroupCriterion(adGroupWebpagePositiveCustomLabel);

        return bulkAdGroupDynamicSearchAdTarget;
    }

    protected static BulkAdGroupDynamicSearchAdTarget getExampleAdGroupWebpagePositiveCategory(long adGroupId, ArrayOfDomainCategory categories)
    {
        BulkAdGroupDynamicSearchAdTarget bulkAdGroupDynamicSearchAdTarget = new BulkAdGroupDynamicSearchAdTarget();
        BiddableAdGroupCriterion adGroupWebpagePositiveCategory = new BiddableAdGroupCriterion();
        adGroupWebpagePositiveCategory.setAdGroupId(adGroupId);
        FixedBid criterionBid = new FixedBid();
        criterionBid.setAmount(0.50);
        adGroupWebpagePositiveCategory.setCriterionBid(criterionBid);
        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(categories.getDomainCategories().get(0).getCategoryName());
        webpageCondition.setOperand(WebpageConditionOperand.CATEGORY);
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        webpageParameter.setCriterionName("Ad Group Webpage Positive Category Criterion");
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpagePositiveCategory.setCriterion(criterion);
        bulkAdGroupDynamicSearchAdTarget.setBiddableAdGroupCriterion(adGroupWebpagePositiveCategory);

        return bulkAdGroupDynamicSearchAdTarget;
    }

    protected static BulkAdGroupNegativeDynamicSearchAdTarget getExampleAdGroupWebpageNegativeUrl(long adGroupId)
    {
        BulkAdGroupNegativeDynamicSearchAdTarget bulkAdGroupNegativeDynamicSearchAdTarget = new BulkAdGroupNegativeDynamicSearchAdTarget();
        NegativeAdGroupCriterion adGroupWebpageNegativeUrl = new NegativeAdGroupCriterion();
        adGroupWebpageNegativeUrl.setAdGroupId(adGroupId);
        // You can choose whether you want the criterion argument to match partial URLs, 
        // page content, page title, or categories that Bing thinks applies to your website.
        WebpageCondition webpageCondition = new WebpageCondition();
        webpageCondition.setArgument(String.format("https://%s/3001", DOMAIN_NAME));
        webpageCondition.setOperand(WebpageConditionOperand.URL);
        ArrayOfWebpageCondition conditions = new ArrayOfWebpageCondition();
        conditions.getWebpageConditions().add(webpageCondition);
        WebpageParameter webpageParameter = new WebpageParameter();
        webpageParameter.setConditions(conditions);
        // If you do not specify any name, then it will be set to a concatenated list of conditions. 
        webpageParameter.setCriterionName(null);
        Webpage criterion = new Webpage();
        criterion.setParameter(webpageParameter);
        adGroupWebpageNegativeUrl.setCriterion(criterion);
        bulkAdGroupNegativeDynamicSearchAdTarget.setNegativeAdGroupCriterion(adGroupWebpageNegativeUrl);

        return bulkAdGroupNegativeDynamicSearchAdTarget;
    }
}
