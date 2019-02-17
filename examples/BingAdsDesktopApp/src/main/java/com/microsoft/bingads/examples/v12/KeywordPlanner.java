package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.adinsight.*;

public class KeywordPlanner extends ExampleBase {
    
    public static void main(java.lang.String[] args) {
   	 
    	try
        {
            authorizationData = getAuthorizationData(); 
	         
            AdInsightExampleHelper.AdInsightService = new ServiceClient<IAdInsightService>(
                    authorizationData, 
                    API_ENVIRONMENT,
                    IAdInsightService.class);
            	         
            // Use the GetKeywordIdeaCategories operation to get a list of valid category identifiers.
            // A category identifier will be used in the CategorySearchParameter below.
            
            outputStatusMessage("-----\nGetKeywordIdeaCategories:");
            GetKeywordIdeaCategoriesResponse getKeywordIdeaCategoriesResponse = AdInsightExampleHelper.getKeywordIdeaCategories();
            if(getKeywordIdeaCategoriesResponse == null){
                outputStatusMessage(String.format("This example requires keyword categories."));
                return;
            }
            java.lang.Long categoryId = (long)(getKeywordIdeaCategoriesResponse.getKeywordIdeaCategories().getKeywordIdeaCategories().get(0).getCategoryId());
            outputStatusMessage(String.format("CategoryId %s will be used in the CategorySearchParameter below", categoryId));

            // You must specify the attributes that you want in each returned KeywordIdea.

            ArrayOfKeywordIdeaAttribute ideaAttributes = new ArrayOfKeywordIdeaAttribute();
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.AD_GROUP_ID);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.AD_GROUP_NAME);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.AD_IMPRESSION_SHARE);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.COMPETITION);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.KEYWORD);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.MONTHLY_SEARCH_COUNTS);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.RELEVANCE);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.SOURCE);
            ideaAttributes.getKeywordIdeaAttributes().add(KeywordIdeaAttribute.SUGGESTED_BID);
                        
            // Only one of each SearchParameter type can be specified per call. 

            ArrayOfSearchParameter searchParameters = new ArrayOfSearchParameter();
            
            // Determines the start and end month for MonthlySearchCounts data returned with each KeywordIdea.
            // The date range search parameter is optional. If you do not include the DateRangeSearchParameter 
            // in the GetKeywordIdeas request, then you will not be able to confirm whether the first list item 
            // within MonthlySearchCounts is data for the previous month, or the month prior. If the date range is 
            // specified and the most recent month's data is not yet available, then GetKeywordIdeas will return an error.

            Calendar calendar = Calendar.getInstance();
            DateRangeSearchParameter dateRangeSearchParameter = new DateRangeSearchParameter();
            DayMonthAndYear endDate = new DayMonthAndYear();
            endDate.setDay(30);
            endDate.setMonth(9);
            endDate.setYear(2018);
            DayMonthAndYear startDate = new DayMonthAndYear();
            startDate.setDay(1);
            startDate.setMonth(9);
            startDate.setYear(2018);
            dateRangeSearchParameter.setEndDate(endDate);
            dateRangeSearchParameter.setStartDate(startDate);            
            searchParameters.getSearchParameters().add(dateRangeSearchParameter);

            // The CategorySearchParameter corresponds to filling in 'Your product category' under
            // 'Search for new keywords using a phrase, website, or category' in the 
            // Bing Ads web application's Keyword Planner tool.
            // One or more CategorySearchParameter, QuerySearchParameter, or UrlSearchParameter is required.

            CategorySearchParameter categorySearchParameter = new CategorySearchParameter();
            // Use the GetKeywordIdeaCategories operation (e.g., above) to get a list of valid category identifiers.
            categorySearchParameter.setCategoryId(categoryId);            
            searchParameters.getSearchParameters().add(categorySearchParameter);

            // The QuerySearchParameter corresponds to filling in 'Product or service' under
            // 'Search for new keywords using a phrase, website, or category' in the 
            // Bing Ads web application's Keyword Planner tool.
            // One or more CategorySearchParameter, QuerySearchParameter, or UrlSearchParameter is required.
            // When calling GetKeywordIdeas, if ExpandIdeas = false the QuerySearchParameter is required. 

            QuerySearchParameter querySearchParameter = new QuerySearchParameter();
            ArrayOfstring queries = new ArrayOfstring();
            queries.getStrings().add("tennis");
            queries.getStrings().add("tennis shoes");
            queries.getStrings().add("running");
            queries.getStrings().add("running shoes");
            queries.getStrings().add("cross training");          
            querySearchParameter.setQueries(queries);            
            searchParameters.getSearchParameters().add(querySearchParameter);
            
            // The UrlSearchParameter corresponds to filling in 'Your landing page' under
            // 'Search for new keywords using a phrase, website, or category' in the 
            // Bing Ads web application's Keyword Planner tool.
            // One or more CategorySearchParameter, QuerySearchParameter, or UrlSearchParameter is required.

            UrlSearchParameter urlSearchParameter = new UrlSearchParameter();
            urlSearchParameter.setUrl("contoso.com");            
            searchParameters.getSearchParameters().add(urlSearchParameter);
            
            // The LanguageSearchParameter, LocationSearchParameter, and NetworkSearchParameter
            // correspond to the 'Keyword Planner' -> 'Search for new keywords using a phrase, website, or category' ->
            // 'Targeting' workflow in the Bing Ads web application.
            // Each of these search parameters are required.

            LanguageSearchParameter languageSearchParameter = new LanguageSearchParameter();
            ArrayOfLanguageCriterion languages = new ArrayOfLanguageCriterion();
            LanguageCriterion englishLanguage =  new LanguageCriterion();
            englishLanguage.setLanguage("English");  
            // You must specify exactly one language
            languages.getLanguageCriterions().add(englishLanguage);
            languageSearchParameter.setLanguages(languages);               
            searchParameters.getSearchParameters().add(languageSearchParameter);
                    
            LocationSearchParameter locationSearchParameter = new LocationSearchParameter();
            ArrayOfLocationCriterion locations = new ArrayOfLocationCriterion();
            LocationCriterion unitedStatesLocationCriterion = new LocationCriterion();
            // United States
            unitedStatesLocationCriterion.setLocationId(190L);
            // You must specify between 1 and 100 locations
            locations.getLocationCriterions().add(unitedStatesLocationCriterion);
            locationSearchParameter.setLocations(locations);                   
            searchParameters.getSearchParameters().add(locationSearchParameter);
                    
            NetworkSearchParameter networkSearchParameter = new NetworkSearchParameter();
            NetworkCriterion networkCriterion = new NetworkCriterion();
            networkCriterion.setNetwork(NetworkType.OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH);
            networkSearchParameter.setNetwork(networkCriterion);            
            searchParameters.getSearchParameters().add(networkSearchParameter);
            
            // The CompetitionSearchParameter, ExcludeAccountKeywordsSearchParameter, IdeaTextSearchParameter, 
            // ImpressionShareSearchParameter, SearchVolumeSearchParameter, and SuggestedBidSearchParameter  
            // correspond to the 'Keyword Planner' -> 'Search for new keywords using a phrase, website, or category' -> 
            // 'Search options' workflow in the Bing Ads web application.
            // Use these options to refine what keywords we suggest. You can limit the keywords by historical data, 
            // hide keywords already in your account, and include or exclude specific keywords.
            // Each of these search parameters are optional.

            CompetitionSearchParameter competitionSearchParameter = new CompetitionSearchParameter();
            ArrayOfCompetitionLevel competitionLevels = new ArrayOfCompetitionLevel();
            competitionLevels.getCompetitionLevels().add(CompetitionLevel.LOW);
            competitionLevels.getCompetitionLevels().add(CompetitionLevel.MEDIUM);
            competitionLevels.getCompetitionLevels().add(CompetitionLevel.HIGH);
            competitionSearchParameter.setCompetitionLevels(competitionLevels);            
            searchParameters.getSearchParameters().add(competitionSearchParameter);
            
            ExcludeAccountKeywordsSearchParameter excludeAccountKeywordsSearchParameter = new ExcludeAccountKeywordsSearchParameter();
            excludeAccountKeywordsSearchParameter.setExcludeAccountKeywords(false);
            searchParameters.getSearchParameters().add(excludeAccountKeywordsSearchParameter);
            
            
            IdeaTextSearchParameter ideaTextSearchParameter = new IdeaTextSearchParameter();
            // The match type is required. Only Broad is supported.
            ArrayOfKeyword excludedKeywords = new ArrayOfKeyword();
            Keyword excludedKeyword1 = new Keyword();
            excludedKeyword1.setText("tennis court");
            excludedKeyword1.setMatchType(MatchType.BROAD);
            excludedKeywords.getKeywords().add(excludedKeyword1);
            Keyword excludedKeyword2 = new Keyword();
            excludedKeyword2.setText("tennis pro");
            excludedKeyword2.setMatchType(MatchType.BROAD);
            excludedKeywords.getKeywords().add(excludedKeyword2);
            ArrayOfKeyword includedKeywords = new ArrayOfKeyword();
            Keyword includedKeyword1 = new Keyword();
            includedKeyword1.setText("athletic clothing");
            includedKeyword1.setMatchType(MatchType.BROAD);
            includedKeywords.getKeywords().add(includedKeyword1);
            Keyword includedKeyword2 = new Keyword();
            includedKeyword2.setText("athletic shoes");
            includedKeyword2.setMatchType(MatchType.BROAD);
            includedKeywords.getKeywords().add(includedKeyword2);
            ideaTextSearchParameter.setExcluded(excludedKeywords);
            ideaTextSearchParameter.setIncluded(includedKeywords);
            searchParameters.getSearchParameters().add(ideaTextSearchParameter);
            
            // Equivalent of '0 <= value <= 50'
            ImpressionShareSearchParameter impressionShareSearchParameter = new ImpressionShareSearchParameter();
            impressionShareSearchParameter.setMaximum(50D);
            impressionShareSearchParameter.setMinimum(0D);
            searchParameters.getSearchParameters().add(impressionShareSearchParameter);
            
            // Equivalent of 'value >= 50'
            SearchVolumeSearchParameter searchVolumeSearchParameter = new SearchVolumeSearchParameter();
            searchVolumeSearchParameter.setMaximum(null);
            searchVolumeSearchParameter.setMinimum(50L);
            searchParameters.getSearchParameters().add(searchVolumeSearchParameter);
                        
            // Equivalent of both 'value <= 50' and '0 <= value <= 50'
            SuggestedBidSearchParameter suggestedBidSearchParameter = new SuggestedBidSearchParameter();
            suggestedBidSearchParameter.setMaximum(50D);
            suggestedBidSearchParameter.setMinimum(null);
            searchParameters.getSearchParameters().add(suggestedBidSearchParameter);

            // Setting the device criterion is not available in the 
            // 'Keyword Planner' -> 'Search for new keywords using a phrase, website, or category'
            // workflow in the Bing Ads web application.
            // The DeviceSearchParameter is optional and by default the keyword ideas data
            // are aggregated for all devices.
            
            DeviceSearchParameter deviceSearchParameter = new DeviceSearchParameter();
            DeviceCriterion deviceCriterion = new DeviceCriterion();
            // Possible values are All, Computers, Tablets, Smartphones
            deviceCriterion.setDeviceName("All");
            deviceSearchParameter.setDevice(deviceCriterion);
            searchParameters.getSearchParameters().add(deviceSearchParameter);

            // If ExpandIdeas is false, the QuerySearchParameter is required.

            outputStatusMessage("-----\nGetKeywordIdeas:");
            GetKeywordIdeasResponse getKeywordIdeasResponse = AdInsightExampleHelper.getKeywordIdeas(
                true,
                ideaAttributes,
                searchParameters);

            ArrayOfKeywordIdea keywordIdeas = getKeywordIdeasResponse.getKeywordIdeas();
            if(keywordIdeas == null || keywordIdeas.getKeywordIdeas().size() < 1)
            {
                outputStatusMessage("No keyword ideas are available for the search parameters.");
                return;
            }
            outputStatusMessage("KeywordIdeas:");
            AdInsightExampleHelper.outputArrayOfKeywordIdea(keywordIdeas);

            // Let's get traffic estimates for each returned keyword idea.

            // The returned ad group ID within each keyword idea will either be null or negative.
            // Negative identifiers can be used to map the keyword ideas into suggested new ad groups. 
            // A null ad group identifier indicates that the keyword idea was sourced from your 
            // keyword idea search parameter.

            // In this example we will use the suggested ad groups to request traffic estimates.
            // Each of the seed keyword ideas will be submitted in the same ad group.

            ArrayOflong keywordIdeaAdGroupIds = new ArrayOflong();
            for(KeywordIdea keywordIdea : keywordIdeas.getKeywordIdeas()){
                keywordIdeaAdGroupIds.getLongs().add(keywordIdea.getAdGroupId());
            }
            ArrayList<java.lang.Long> adGroupIds = new ArrayList<java.lang.Long>(new HashSet<Long>(keywordIdeaAdGroupIds.getLongs()));
            
            int adGroupEstimatorCount = adGroupIds.size();
            int seedOffset = adGroupIds.contains(null) ? 0 : 1;

            AdGroupEstimator[] adGroupEstimators = new AdGroupEstimator[adGroupEstimatorCount];
            for(int index = 0; index < adGroupEstimatorCount; index++)
            {
                adGroupEstimators[index] = new AdGroupEstimator();
                
                // The AdGroupId is reserved for future use.
                // The traffic estimates are not based on any specific ad group. 
                adGroupEstimators[index].setAdGroupId(null);
                
                // Optionally you can set an ad group level max CPC (maximum search bid)
                adGroupEstimators[index].setMaxCpc(5.00D);
                
                // We will add new keyword estimators while iterating the keyword ideas below.
                ArrayOfKeywordEstimator keywordEstimators = new ArrayOfKeywordEstimator();
                adGroupEstimators[index].setKeywordEstimators(keywordEstimators);
            }

            for(KeywordIdea keywordIdea : keywordIdeas.getKeywordIdeas())
            {
                KeywordEstimator keywordEstimator = new KeywordEstimator();
                Keyword keyword = new Keyword();
                // The keyword Id is reserved for future use.
                // The returned estimates are not based on any specific keyword.
                keyword.setId(null);
                // The match type is required. Exact, Broad, and Phrase are supported.
                keyword.setMatchType(MatchType.EXACT);
                // Use the suggested keyword
                keyword.setText(keywordIdea.getKeyword());
                keywordEstimator.setKeyword(keyword);
                double maxCpc = keywordIdea.getSuggestedBid() > 0.04 ? 
                        keywordIdea.getSuggestedBid() : null;
                keywordEstimator.setMaxCpc(maxCpc);
                
                long index = keywordIdea.getAdGroupId() != null ? -(long)keywordIdea.getAdGroupId() - seedOffset : 0;

                adGroupEstimators[(int)index].getKeywordEstimators().getKeywordEstimators().add(keywordEstimator);
            }

            // Currently you can include only one CampaignEstimator per service call.

            ArrayOfCampaignEstimator campaigns = new ArrayOfCampaignEstimator();
            CampaignEstimator campaignEstimator = new CampaignEstimator();
                        
            // Let's use the ad group and keyword estimators that were sourced from keyword ideas above.
            ArrayOfAdGroupEstimator adGroups = new ArrayOfAdGroupEstimator();
            for(int index = 0; index < adGroupEstimatorCount; index++)
            {
                adGroups.getAdGroupEstimators().add(adGroupEstimators[index]);
            }
            campaignEstimator.setAdGroupEstimators(adGroups);
           
            // The CampaignId is reserved for future use.
            // The returned estimates are not based on any specific campaign.
            campaignEstimator.setCampaignId(null);

            campaignEstimator.setDailyBudget(50.00D);

            ArrayOfNegativeKeyword negativeKeywords = new ArrayOfNegativeKeyword();
            NegativeKeyword negativeKeyword = new NegativeKeyword();
            negativeKeyword.setText("foo");
            negativeKeyword.setMatchType(MatchType.EXACT);
            negativeKeywords.getNegativeKeywords().add(negativeKeyword);            
            campaignEstimator.setNegativeKeywords(negativeKeywords);

            // The location, language, and network criterions are required for traffic estimates.

            ArrayOfCriterion trafficEstimateCriteria = new ArrayOfCriterion();
            // You must specify between 1 and 100 locations
            trafficEstimateCriteria.getCriterions().add(unitedStatesLocationCriterion);
            // You must specify exactly one language criterion
            trafficEstimateCriteria.getCriterions().add(englishLanguage);
            // You must specify exactly one network criterion
            trafficEstimateCriteria.getCriterions().add(networkCriterion);
            // Optionally you can specify exactly one device.
            // If you do not specify a device, the returned traffic estimates 
            // are aggregated for all devices.
            // The "All" device name is equivalent to omitting the DeviceCriterion.
            trafficEstimateCriteria.getCriterions().add(deviceCriterion);
            campaignEstimator.setCriteria(trafficEstimateCriteria);
            
            campaigns.getCampaignEstimators().add(campaignEstimator);
            
            outputStatusMessage("-----\nGetKeywordTrafficEstimates:");
            GetKeywordTrafficEstimatesResponse getKeywordTrafficEstimatesResponse = AdInsightExampleHelper.getKeywordTrafficEstimates(
                    campaigns);
            outputStatusMessage("CampaignEstimates:");
            AdInsightExampleHelper.outputArrayOfCampaignEstimate(getKeywordTrafficEstimatesResponse.getCampaignEstimates());        
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }
}
