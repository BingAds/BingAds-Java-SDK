package com.microsoft.bingads.examples.v11;

import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.campaignmanagement.*;
import java.util.HashSet;
import java.util.List;

public class KeywordsAds extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = getAuthorizationData(null,null); 
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    	authorizationData, 
                        API_ENVIRONMENT,
                        ICampaignManagementService.class);
                        
            // Let's create a new budget and share it with a new campaign.

            ArrayOfNullableOflong budgetIds = new ArrayOfNullableOflong();
                        
            ArrayOfBudget budgets = new ArrayOfBudget();
            Budget addBudget = new Budget();
            addBudget.setAmount(new java.math.BigDecimal(50));
            addBudget.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            addBudget.setName("My Shared Budget " + System.currentTimeMillis());
            budgets.getBudgets().add(addBudget);

            budgetIds = CampaignManagementExampleHelper.addBudgets(budgets).getBudgetIds();
            

            // Specify a campaign. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Red shoes line.");
            // You must choose to set either the shared  budget ID or daily amount.
            // You can set one or the other, but you may not set both.
            campaign.setBudgetId(budgetIds.getLongs().size() > 0 ? budgetIds.getLongs().get(0) : 0L);
            campaign.setDailyBudget(budgetIds.getLongs().size() > 0 ? 0.0 : 50.0);
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
             
            // You can set your campaign bid strategy to Enhanced CPC (EnhancedCpcBiddingScheme) 
            // and then, at any time, set an individual ad group or keyword bid strategy to 
            // Manual CPC (ManualCpcBiddingScheme).
            // For campaigns you can use either of the EnhancedCpcBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then ManualCpcBiddingScheme is used by default.
            campaign.setBiddingScheme(new EnhancedCpcBiddingScheme());
             
            // Used with FinalUrls shown in the expanded text ads that we will add below.
            campaign.setTrackingUrlTemplate(
                "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

            campaigns.getCampaigns().add(campaign);

            // Specify an ad group. 

            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Women's Red Shoes");
            ArrayList<AdDistribution> adDistribution = new ArrayList<AdDistribution>();
            adDistribution.add(AdDistribution.SEARCH);
            adGroup.setAdDistribution(adDistribution);
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v11.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid searchBid = new Bid();
            searchBid.setAmount(0.09);
            adGroup.setSearchBid(searchBid);
            adGroup.setLanguage("English");
            
            // For ad groups you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            adGroup.setBiddingScheme(new ManualCpcBiddingScheme());

            //You could use a tracking template which would override the campaign level
            //tracking template. Tracking templates defined for lower level entities 
            //override those set for higher level entities.
            //In this example we are using the campaign level tracking template.
            adGroup.setTrackingUrlTemplate(null);

            adGroups.getAdGroups().add(adGroup);

            // In this example only the second keyword should succeed. The Text of the first keyword exceeds the limit,
            // and the third keyword is a duplicate of the second keyword. 

            ArrayOfKeyword keywords = new ArrayOfKeyword();

            Keyword keyword1 = new Keyword();
            keyword1.setBid(new Bid());
            keyword1.getBid().setAmount(0.47);
            keyword1.setParam2("10% Off");
            keyword1.setMatchType(MatchType.BROAD);
            keyword1.setText("Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes " +
                             "Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes " +
                             "Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes Brand-A Shoes");
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keyword1.setBiddingScheme(new InheritFromParentBiddingScheme());
            keywords.getKeywords().add(keyword1);

            Keyword keyword2 = new Keyword();
            keyword2.setBid(new Bid());
            keyword2.getBid().setAmount(0.47);
            keyword2.setParam2("10% Off");
            keyword2.setMatchType(MatchType.PHRASE);
            keyword2.setText("Brand-A Shoes");
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keyword2.setBiddingScheme(new InheritFromParentBiddingScheme());
            keywords.getKeywords().add(keyword2);

            Keyword keyword3 = new Keyword();
            keyword3.setBid(new Bid());
            keyword3.getBid().setAmount(0.47);
            keyword3.setParam2("10% Off");
            keyword3.setMatchType(MatchType.PHRASE);
            keyword3.setText("Brand-A Shoes");
            // For keywords you can use either of the InheritFromParentBiddingScheme or ManualCpcBiddingScheme objects. 
            // If you do not set this element, then InheritFromParentBiddingScheme is used by default.
            keyword3.setBiddingScheme(new InheritFromParentBiddingScheme());
            keywords.getKeywords().add(keyword3);


            // In this example only the first 3 ads should succeed. 
            // The TitlePart2 of the fourth ad is empty and not valid,
            // and the fifth ad is a duplicate of the second ad. 

            ArrayOfAd ads = new ArrayOfAd();

            for(int i=0; i < 5; i++){
                ExpandedTextAd expandedTextAd = new ExpandedTextAd();
                expandedTextAd.setTitlePart1("Contoso");
                expandedTextAd.setTitlePart2("Fast & Easy Setup");
                expandedTextAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
                expandedTextAd.setPath1("seattle");
                expandedTextAd.setPath2("shoe sale");

                // With FinalUrls you can separate the tracking template, custom parameters, and 
                // landing page URLs. 
                com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
                finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
                expandedTextAd.setFinalUrls(finalUrls);

                // Final Mobile URLs can also be used if you want to direct the user to a different page 
                // for mobile devices.
                com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
                finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
                expandedTextAd.setFinalMobileUrls(finalMobileUrls);

                // You could use a tracking template which would override the campaign level
                // tracking template. Tracking templates defined for lower level entities 
                // override those set for higher level entities.
                // In this example we are using the campaign level tracking template.
                expandedTextAd.setTrackingUrlTemplate(null);

                // Set custom parameters that are specific to this ad, 
                // and can be used by the ad, ad group, campaign, or account level tracking template. 
                // In this example we are using the campaign level tracking template.
                CustomParameters urlCustomParameters = new CustomParameters();
                CustomParameter customParameter1 = new CustomParameter();
                customParameter1.setKey("promoCode");
                customParameter1.setValue("PROMO" + (i+1));
                ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
                customParameters.getCustomParameters().add(customParameter1);
                CustomParameter customParameter2 = new CustomParameter();
                customParameter2.setKey("season");
                customParameter2.setValue("summer");
                customParameters.getCustomParameters().add(customParameter2);
                urlCustomParameters.setParameters(customParameters);
                expandedTextAd.setUrlCustomParameters(urlCustomParameters);

                ads.getAds().add(expandedTextAd);
            }

            ((ExpandedTextAd)(ads.getAds().get(1))).setTitlePart2("Quick & Easy Setup");
            ((ExpandedTextAd)(ads.getAds().get(2))).setTitlePart2("Fast & Simple Setup");
            ((ExpandedTextAd)(ads.getAds().get(3))).setTitlePart2("");
            ((ExpandedTextAd)(ads.getAds().get(4))).setTitlePart2("Quick & Easy Setup");


            // Add the campaign, ad group, keywords, and ads

            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(authorizationData.getAccountId(), campaigns);
            ArrayOfNullableOflong nullableCampaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(nullableCampaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(nullableCampaignIds.getLongs().get(0), adGroups);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors);

            AddKeywordsResponse addKeywordsResponse = CampaignManagementExampleHelper.addKeywords(adGroupIds.getLongs().get(0), keywords);
            ArrayOfNullableOflong keywordIds = addKeywordsResponse.getKeywordIds();
            ArrayOfBatchError keywordErrors = addKeywordsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(keywordIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(keywordErrors);

            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(adGroupIds.getLongs().get(0), ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);


            // Here is a simple example that updates the campaign budget.
            // If the campaign has a shared budget you cannot update the Campaign budget amount,
            // and you must instead update the amount in the Budget object. If you try to update 
            // the budget amount of a campaign that has a shared budget, the service will return 
            // the CampaignServiceCannotUpdateSharedBudget error code.
            
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.DYNAMIC_SEARCH_ADS);
            campaignTypes.add(CampaignType.SHOPPING);
            campaignTypes.add(CampaignType.SEARCH_AND_CONTENT);
                        
            ArrayOfCampaign getCampaigns = CampaignManagementExampleHelper.getCampaignsByAccountId(
                authorizationData.getAccountId(),
                campaignTypes).getCampaigns();

            ArrayOfCampaign updateCampaigns = new ArrayOfCampaign();
            ArrayOfBudget updateBudgets = new ArrayOfBudget();
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong campaignIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong getBudgetIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            
            // Increase existing budgets by 20%
            for (Campaign getCampaign : getCampaigns.getCampaigns())
            {
                // If the campaign has a shared budget, let's add the budget ID to the list we will update later.
                if (getCampaign != null && getCampaign.getBudgetId() != null && getCampaign.getBudgetId() > 0)
                {
                    getBudgetIds.getLongs().add((long)getCampaign.getBudgetId());
                }
                // If the campaign has its own budget, let's add it to the list of campaigns to update later.
                else if(getCampaign != null)
                {
                    Campaign updateCampaign = new Campaign();
                    updateCampaign.setDailyBudget(getCampaign.getDailyBudget() * 1.2);
                    updateCampaign.setId(getCampaign.getId());
                    
                    updateCampaigns.getCampaigns().add(updateCampaign);
                }
            }

            // Update shared budgets in Budget objects.
            if (getBudgetIds.getLongs() != null && getBudgetIds.getLongs().size() > 0)
            {
                ArrayList<java.lang.Long> distinctBudgetIds = new ArrayList<java.lang.Long>(new HashSet<Long>(getBudgetIds.getLongs()));
                com.microsoft.bingads.v11.campaignmanagement.ArrayOflong getDistinctBudgetIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
                for(java.lang.Long id : distinctBudgetIds){
                    getDistinctBudgetIds.getLongs().add(id);
                }
                ArrayOfBudget getBudgets = CampaignManagementExampleHelper.getBudgetsByIds(getDistinctBudgetIds).getBudgets();

                outputStatusMessage("List of shared budgets BEFORE update:\n");
                for (Budget budget : getBudgets.getBudgets())
                {
                    outputStatusMessage("Budget:");
                    CampaignManagementExampleHelper.outputBudget(budget);
                }

                outputStatusMessage("List of campaigns that share each budget:\n");
                ArrayOfIdCollection getCampaignIdCollection = CampaignManagementExampleHelper.getCampaignIdsByBudgetIds(getDistinctBudgetIds).getCampaignIdCollection();
                for(int index = 0; index < getCampaignIdCollection.getIdCollections().size(); index++)
                {
                    outputStatusMessage(String.format("BudgetId: %s", getDistinctBudgetIds.getLongs().get(index)));
                    outputStatusMessage("Campaign Ids:");
                    if(getCampaignIdCollection.getIdCollections().get(index) != null)
                    {
                        for (java.lang.Long id : getCampaignIdCollection.getIdCollections().get(index).getIds().getLongs())
                        {
                            outputStatusMessage(String.format("\t%s", id));
                        }
                    }
                }

                for (Budget budget : getBudgets.getBudgets())
                {
                    if (budget != null)
                    {
                        // Increase budget by 20 %
                        budget.setAmount(new java.math.BigDecimal(budget.getAmount().doubleValue() * 1.2));
                        updateBudgets.getBudgets().add(budget);
                    }
                }
                CampaignManagementExampleHelper.updateBudgets(updateBudgets);

                getBudgets = CampaignManagementExampleHelper.getBudgetsByIds(getDistinctBudgetIds).getBudgets();

                outputStatusMessage("List of shared budgets AFTER update:\n");
                for (Budget budget : getBudgets.getBudgets())
                {
                    outputStatusMessage("Budget:");
                    CampaignManagementExampleHelper.outputBudget(budget);
                }
            }

            // Update unshared budgets in Campaign objects.
            if(updateCampaigns.getCampaigns() != null && updateCampaigns.getCampaigns().size() > 0)
            {
                // The UpdateCampaigns operation only accepts 100 Campaign objects per call. 
                // To simply the example we will update the first 100.
                int maxIndex = updateCampaigns.getCampaigns().size() < 100 ? updateCampaigns.getCampaigns().size() : 99;
                List<Campaign> campaignSubList = updateCampaigns.getCampaigns().subList(0, maxIndex);
                updateCampaigns = new ArrayOfCampaign();
                for (Campaign updateCampaign : campaignSubList){
                    updateCampaigns.getCampaigns().add(updateCampaign);
                    campaignIds.getLongs().add((long)updateCampaign.getId());
                }
                
                CampaignManagementExampleHelper.updateCampaigns(authorizationData.getAccountId(), updateCampaigns);
                                
                campaigns = CampaignManagementExampleHelper.getCampaignsByIds(authorizationData.getAccountId(),
                    campaignIds,
                    campaignTypes).getCampaigns();

                outputStatusMessage("List of campaigns with unshared budget AFTER budget update:\n");
                for (Campaign getCampaign : getCampaigns.getCampaigns())
                {
                    outputStatusMessage("Campaign:");
                    CampaignManagementExampleHelper.outputCampaign(getCampaign);
                }
            }

            // Update the Text for the 3 successfully created ads, and update some UrlCustomParameters.

            ArrayOfAd updateAds = new ArrayOfAd();

            ExpandedTextAd updateExpandedTextAd1 = new ExpandedTextAd();
            updateExpandedTextAd1.setId(adIds.getLongs().get(0));
            updateExpandedTextAd1.setText("Huge Savings on All Red Shoes.");
            // Set the UrlCustomParameters element to null or empty to retain any 
            // existing custom parameters.
            CustomParameters urlCustomParameters1 = null;
            updateExpandedTextAd1.setUrlCustomParameters(urlCustomParameters1);
            updateAds.getAds().add(updateExpandedTextAd1);

            ExpandedTextAd updateExpandedTextAd2 = new ExpandedTextAd();
            updateExpandedTextAd2.setId(adIds.getLongs().get(1));
            updateExpandedTextAd2.setText("Huge Savings on All Red Shoes.");
            // To remove all custom parameters, set the Parameters element of the 
            // CustomParameters object to null or empty.
            CustomParameters urlCustomParameters2 = new CustomParameters();
            ArrayOfCustomParameter customParameters2 = null;
            urlCustomParameters2.setParameters(customParameters2);
            updateExpandedTextAd2.setUrlCustomParameters(urlCustomParameters2);
            updateAds.getAds().add(updateExpandedTextAd2);

            ExpandedTextAd updateExpandedTextAd3 = new ExpandedTextAd();
            updateExpandedTextAd3.setId(adIds.getLongs().get(2));
            updateExpandedTextAd3.setText("Huge Savings on All Red Shoes.");
            // To remove a subset of custom parameters, specify the custom parameters that 
            // you want to keep in the Parameters element of the CustomParameters object.
            CustomParameters urlCustomParameters3 = new CustomParameters();
            CustomParameter customParameter3 = new CustomParameter();
            customParameter3.setKey("promoCode");
            customParameter3.setValue("updatedpromo");
            ArrayOfCustomParameter customParameters3 = new ArrayOfCustomParameter();
            customParameters3.getCustomParameters().add(customParameter3);
            urlCustomParameters3.setParameters(customParameters3);
            updateExpandedTextAd3.setUrlCustomParameters(urlCustomParameters3);
            updateAds.getAds().add(updateExpandedTextAd3);

            // As an exercise you can step through using the debugger and view the results.

            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong updateAdGroupIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            updateAdGroupIds.getLongs().add(adGroupIds.getLongs().get(0));

            ArrayOfAdType adTypes = new ArrayOfAdType();
            adTypes.getAdTypes().add(AdType.EXPANDED_TEXT);            
            GetAdsByAdGroupIdResponse getAdsByAdGroupIdResponse = CampaignManagementExampleHelper.getAdsByAdGroupId(adGroupIds.getLongs().get(0), adTypes);
            UpdateAdsResponse updateAdsResponse = CampaignManagementExampleHelper.updateAds(adGroupIds.getLongs().get(0), updateAds);
            getAdsByAdGroupIdResponse = CampaignManagementExampleHelper.getAdsByAdGroupId(adGroupIds.getLongs().get(0), adTypes);


            // Here is a simple example that updates the keyword bid to use the ad group bid.

            Keyword updateKeyword = new Keyword();
            updateKeyword.setId(keywordIds.getLongs().get(0));
            updateKeyword.setBid(new Bid());
            updateKeyword.getBid().setAmount(null);
            ArrayOfKeyword updateKeywords = new ArrayOfKeyword();
            updateKeywords.getKeywords().add(updateKeyword);

            // As an exercise you can step through using the debugger and view the results.

            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong updateKeywordIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            updateKeywordIds.getLongs().add(keywordIds.getLongs().get(0));
            
            GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupIdResponse = CampaignManagementExampleHelper.getKeywordsByAdGroupId(adGroupIds.getLongs().get(0), null);
            UpdateKeywordsResponse updateKeywordsResponse = CampaignManagementExampleHelper.updateKeywords(adGroupIds.getLongs().get(0), updateKeywords);
            getKeywordsByAdGroupIdResponse = CampaignManagementExampleHelper.getKeywordsByAdGroupId(adGroupIds.getLongs().get(0), null);      


            // Delete the campaign, ad group, keyword, and ad that were previously added. 
            // You should remove this line if you want to view the added entities in the 
            // Bing Ads web application or another tool.

            campaignIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            campaignIds.getLongs().add(nullableCampaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), campaignIds);
            System.out.printf("Deleted CampaignId %d\n", nullableCampaignIds.getLongs().get(0));
            
            // This sample will attempt to delete the budget that was created above.
            if(budgetIds.getLongs().size() > 0){
                com.microsoft.bingads.v11.campaignmanagement.ArrayOflong deleteBudgetIds = 
                        new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
                deleteBudgetIds.getLongs().add(budgetIds.getLongs().get(0));
                CampaignManagementExampleHelper.deleteBudgets(deleteBudgetIds);
                System.out.printf("Deleted BudgetId %d\n", deleteBudgetIds.getLongs().get(0));
            }
            
            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }    
 }
