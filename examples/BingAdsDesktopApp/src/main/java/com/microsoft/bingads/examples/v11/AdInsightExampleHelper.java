package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.adinsight.*;

class AdInsightExampleHelper
{
    static ServiceClient<IAdInsightService> AdInsightService;
    static GetAuctionInsightDataResponse getAuctionInsightData(
        Selector selector) throws RemoteException, Exception
    {
        GetAuctionInsightDataRequest request = new GetAuctionInsightDataRequest();

        request.setSelector(selector);

        return AdInsightService.getService().getAuctionInsightData(request);
    }
    static GetBidLandscapeByAdGroupIdsResponse getBidLandscapeByAdGroupIds(
        ArrayOfAdGroupBidLandscapeInput adGroupBidLandscapeInputs) throws RemoteException, Exception
    {
        GetBidLandscapeByAdGroupIdsRequest request = new GetBidLandscapeByAdGroupIdsRequest();

        request.setAdGroupBidLandscapeInputs(adGroupBidLandscapeInputs);

        return AdInsightService.getService().getBidLandscapeByAdGroupIds(request);
    }
    static GetBidLandscapeByKeywordIdsResponse getBidLandscapeByKeywordIds(
        ArrayOflong keywordIds,
        java.lang.Boolean includeCurrentBid) throws RemoteException, Exception
    {
        GetBidLandscapeByKeywordIdsRequest request = new GetBidLandscapeByKeywordIdsRequest();

        request.setKeywordIds(keywordIds);
        request.setIncludeCurrentBid(includeCurrentBid);

        return AdInsightService.getService().getBidLandscapeByKeywordIds(request);
    }
    static GetBidOpportunitiesResponse getBidOpportunities(
        java.lang.Long adGroupId,
        java.lang.Long campaignId,
        ArrayList<BidOpportunityType> opportunityType) throws RemoteException, Exception
    {
        GetBidOpportunitiesRequest request = new GetBidOpportunitiesRequest();

        request.setAdGroupId(adGroupId);
        request.setCampaignId(campaignId);
        request.setOpportunityType(opportunityType);

        return AdInsightService.getService().getBidOpportunities(request);
    }
    static GetBudgetOpportunitiesResponse getBudgetOpportunities(
        java.lang.Long campaignId) throws RemoteException, Exception
    {
        GetBudgetOpportunitiesRequest request = new GetBudgetOpportunitiesRequest();

        request.setCampaignId(campaignId);

        return AdInsightService.getService().getBudgetOpportunities(request);
    }
    static GetDomainCategoriesResponse getDomainCategories(
        java.lang.String categoryName,
        java.lang.String domainName,
        java.lang.String language) throws RemoteException, Exception
    {
        GetDomainCategoriesRequest request = new GetDomainCategoriesRequest();

        request.setCategoryName(categoryName);
        request.setDomainName(domainName);
        request.setLanguage(language);

        return AdInsightService.getService().getDomainCategories(request);
    }
    static GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(
        ArrayOflong keywordIds,
        TargetAdPosition targetPositionForAds) throws RemoteException, Exception
    {
        GetEstimatedBidByKeywordIdsRequest request = new GetEstimatedBidByKeywordIdsRequest();

        request.setKeywordIds(keywordIds);
        request.setTargetPositionForAds(targetPositionForAds);

        return AdInsightService.getService().getEstimatedBidByKeywordIds(request);
    }
    static GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(
        ArrayOfKeywordAndMatchType keywords,
        TargetAdPosition targetPositionForAds,
        java.lang.String language,
        ArrayOfstring publisherCountries,
        Currency currency,
        java.lang.Long campaignId,
        java.lang.Long adGroupId,
        java.lang.String entityLevelBid) throws RemoteException, Exception
    {
        GetEstimatedBidByKeywordsRequest request = new GetEstimatedBidByKeywordsRequest();

        request.setKeywords(keywords);
        request.setTargetPositionForAds(targetPositionForAds);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setCurrency(currency);
        request.setCampaignId(campaignId);
        request.setAdGroupId(adGroupId);
        request.setEntityLevelBid(entityLevelBid);

        return AdInsightService.getService().getEstimatedBidByKeywords(request);
    }
    static GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(
        ArrayOflong keywordIds,
        java.lang.Double maxBid) throws RemoteException, Exception
    {
        GetEstimatedPositionByKeywordIdsRequest request = new GetEstimatedPositionByKeywordIdsRequest();

        request.setKeywordIds(keywordIds);
        request.setMaxBid(maxBid);

        return AdInsightService.getService().getEstimatedPositionByKeywordIds(request);
    }
    static GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(
        ArrayOfstring keywords,
        java.lang.Double maxBid,
        java.lang.String language,
        ArrayOfstring publisherCountries,
        Currency currency,
        ArrayOfMatchType matchTypes,
        java.lang.Long campaignId,
        java.lang.Long adGroupId) throws RemoteException, Exception
    {
        GetEstimatedPositionByKeywordsRequest request = new GetEstimatedPositionByKeywordsRequest();

        request.setKeywords(keywords);
        request.setMaxBid(maxBid);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setCurrency(currency);
        request.setMatchTypes(matchTypes);
        request.setCampaignId(campaignId);
        request.setAdGroupId(adGroupId);

        return AdInsightService.getService().getEstimatedPositionByKeywords(request);
    }
    static GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(
        ArrayOfstring keywords,
        TimeInterval timeInterval,
        AdPosition targetAdPosition,
        ArrayOfMatchType matchTypes,
        java.lang.String language,
        ArrayOfstring publisherCountries,
        ArrayOfstring devices) throws RemoteException, Exception
    {
        GetHistoricalKeywordPerformanceRequest request = new GetHistoricalKeywordPerformanceRequest();

        request.setKeywords(keywords);
        request.setTimeInterval(timeInterval);
        request.setTargetAdPosition(targetAdPosition);
        request.setMatchTypes(matchTypes);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setDevices(devices);

        return AdInsightService.getService().getHistoricalKeywordPerformance(request);
    }
    static GetHistoricalSearchCountResponse getHistoricalSearchCount(
        ArrayOfstring keywords,
        java.lang.String language,
        ArrayOfstring publisherCountries,
        DayMonthAndYear startDate,
        DayMonthAndYear endDate,
        java.lang.String timePeriodRollup,
        ArrayOfstring devices) throws RemoteException, Exception
    {
        GetHistoricalSearchCountRequest request = new GetHistoricalSearchCountRequest();

        request.setKeywords(keywords);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setStartDate(startDate);
        request.setEndDate(endDate);
        request.setTimePeriodRollup(timePeriodRollup);
        request.setDevices(devices);

        return AdInsightService.getService().getHistoricalSearchCount(request);
    }
    static GetKeywordCategoriesResponse getKeywordCategories(
        ArrayOfstring keywords,
        java.lang.String language,
        java.lang.String publisherCountry,
        java.lang.Integer maxCategories) throws RemoteException, Exception
    {
        GetKeywordCategoriesRequest request = new GetKeywordCategoriesRequest();

        request.setKeywords(keywords);
        request.setLanguage(language);
        request.setPublisherCountry(publisherCountry);
        request.setMaxCategories(maxCategories);

        return AdInsightService.getService().getKeywordCategories(request);
    }
    static GetKeywordDemographicsResponse getKeywordDemographics(
        ArrayOfstring keywords,
        java.lang.String language,
        java.lang.String publisherCountry,
        ArrayOfstring device) throws RemoteException, Exception
    {
        GetKeywordDemographicsRequest request = new GetKeywordDemographicsRequest();

        request.setKeywords(keywords);
        request.setLanguage(language);
        request.setPublisherCountry(publisherCountry);
        request.setDevice(device);

        return AdInsightService.getService().getKeywordDemographics(request);
    }
    static GetKeywordIdeaCategoriesResponse getKeywordIdeaCategories() throws RemoteException, Exception
    {
        GetKeywordIdeaCategoriesRequest request = new GetKeywordIdeaCategoriesRequest();


        return AdInsightService.getService().getKeywordIdeaCategories(request);
    }
    static GetKeywordIdeasResponse getKeywordIdeas(
        java.lang.Boolean expandIdeas,
        ArrayOfKeywordIdeaAttribute ideaAttributes,
        ArrayOfSearchParameter searchParameters) throws RemoteException, Exception
    {
        GetKeywordIdeasRequest request = new GetKeywordIdeasRequest();

        request.setExpandIdeas(expandIdeas);
        request.setIdeaAttributes(ideaAttributes);
        request.setSearchParameters(searchParameters);

        return AdInsightService.getService().getKeywordIdeas(request);
    }
    static GetKeywordLocationsResponse getKeywordLocations(
        ArrayOfstring keywords,
        java.lang.String language,
        java.lang.String publisherCountry,
        ArrayOfstring device,
        java.lang.Integer level,
        java.lang.String parentCountry,
        java.lang.Integer maxLocations) throws RemoteException, Exception
    {
        GetKeywordLocationsRequest request = new GetKeywordLocationsRequest();

        request.setKeywords(keywords);
        request.setLanguage(language);
        request.setPublisherCountry(publisherCountry);
        request.setDevice(device);
        request.setLevel(level);
        request.setParentCountry(parentCountry);
        request.setMaxLocations(maxLocations);

        return AdInsightService.getService().getKeywordLocations(request);
    }
    static GetKeywordOpportunitiesResponse getKeywordOpportunities(
        java.lang.Long adGroupId,
        java.lang.Long campaignId,
        ArrayList<KeywordOpportunityType> opportunityType) throws RemoteException, Exception
    {
        GetKeywordOpportunitiesRequest request = new GetKeywordOpportunitiesRequest();

        request.setAdGroupId(adGroupId);
        request.setCampaignId(campaignId);
        request.setOpportunityType(opportunityType);

        return AdInsightService.getService().getKeywordOpportunities(request);
    }
    static GetKeywordTrafficEstimatesResponse getKeywordTrafficEstimates(
        ArrayOfCampaignEstimator campaignEstimators) throws RemoteException, Exception
    {
        GetKeywordTrafficEstimatesRequest request = new GetKeywordTrafficEstimatesRequest();

        request.setCampaignEstimators(campaignEstimators);

        return AdInsightService.getService().getKeywordTrafficEstimates(request);
    }
    static SuggestKeywordsForUrlResponse suggestKeywordsForUrl(
        java.lang.String url,
        java.lang.String language,
        java.lang.Integer maxKeywords,
        java.lang.Double minConfidenceScore,
        java.lang.Boolean excludeBrand) throws RemoteException, Exception
    {
        SuggestKeywordsForUrlRequest request = new SuggestKeywordsForUrlRequest();

        request.setUrl(url);
        request.setLanguage(language);
        request.setMaxKeywords(maxKeywords);
        request.setMinConfidenceScore(minConfidenceScore);
        request.setExcludeBrand(excludeBrand);

        return AdInsightService.getService().suggestKeywordsForUrl(request);
    }
    static SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(
        ArrayOfstring keywords,
        java.lang.String language,
        ArrayOfstring publisherCountries,
        java.lang.Integer maxSuggestionsPerKeyword,
        java.lang.Integer suggestionType,
        java.lang.Boolean removeDuplicates,
        java.lang.Boolean excludeBrand,
        java.lang.Long adGroupId,
        java.lang.Long campaignId) throws RemoteException, Exception
    {
        SuggestKeywordsFromExistingKeywordsRequest request = new SuggestKeywordsFromExistingKeywordsRequest();

        request.setKeywords(keywords);
        request.setLanguage(language);
        request.setPublisherCountries(publisherCountries);
        request.setMaxSuggestionsPerKeyword(maxSuggestionsPerKeyword);
        request.setSuggestionType(suggestionType);
        request.setRemoveDuplicates(removeDuplicates);
        request.setExcludeBrand(excludeBrand);
        request.setAdGroupId(adGroupId);
        request.setCampaignId(campaignId);

        return AdInsightService.getService().suggestKeywordsFromExistingKeywords(request);
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfAdApiError(dataObject.getErrors());
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupBidLandscape(AdGroupBidLandscape dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupBidLandscapeType: %s", dataObject.getAdGroupBidLandscapeType()));
            outputDayMonthAndYear(dataObject.getStartDate());
            outputDayMonthAndYear(dataObject.getEndDate());
            outputArrayOfBidLandscapePoint(dataObject.getBidLandscapePoints());
        }
    }
    static void outputArrayOfAdGroupBidLandscape(ArrayOfAdGroupBidLandscape dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupBidLandscape dataObject : dataObjects.getAdGroupBidLandscapes())
            {
                outputAdGroupBidLandscape(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupBidLandscapeInput(AdGroupBidLandscapeInput dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupBidLandscapeType: %s", dataObject.getAdGroupBidLandscapeType()));
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
        }
    }
    static void outputArrayOfAdGroupBidLandscapeInput(ArrayOfAdGroupBidLandscapeInput dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupBidLandscapeInput dataObject : dataObjects.getAdGroupBidLandscapeInputs())
            {
                outputAdGroupBidLandscapeInput(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupEstimate(AdGroupEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputArrayOfKeywordEstimate(dataObject.getKeywordEstimates());
        }
    }
    static void outputArrayOfAdGroupEstimate(ArrayOfAdGroupEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupEstimate dataObject : dataObjects.getAdGroupEstimates())
            {
                outputAdGroupEstimate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupEstimator(AdGroupEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputArrayOfKeywordEstimator(dataObject.getKeywordEstimators());
            outputStatusMessage(String.format("MaxCpc: %s", dataObject.getMaxCpc()));
        }
    }
    static void outputArrayOfAdGroupEstimator(ArrayOfAdGroupEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupEstimator dataObject : dataObjects.getAdGroupEstimators())
            {
                outputAdGroupEstimator(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApiFaultDetail(ApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputArrayOfOperationError(dataObject.getOperationErrors());
        }
    }
    static void outputArrayOfApiFaultDetail(ArrayList<ApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFaultDetail dataObject : dataObjects)
            {
                outputApiFaultDetail(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFaultDetail)
            {
                outputApiFaultDetail((ApiFaultDetail)dataObject);
            }
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAuctionInsightKPINode(AuctionInsightKPINode dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfstring(dataObject.getDimensionNames());
            outputStatusMessage(String.format("ImpressionShare: %s", dataObject.getImpressionShare()));
            outputStatusMessage(String.format("OverlapRate: %s", dataObject.getOverlapRate()));
            outputStatusMessage(String.format("AveragePosition: %s", dataObject.getAveragePosition()));
            outputStatusMessage(String.format("AboveRate: %s", dataObject.getAboveRate()));
            outputStatusMessage(String.format("TopOfPageRate: %s", dataObject.getTopOfPageRate()));
        }
    }
    static void outputArrayOfAuctionInsightKPINode(ArrayOfAuctionInsightKPINode dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightKPINode dataObject : dataObjects.getAuctionInsightKPINodes())
            {
                outputAuctionInsightKPINode(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAuctionInsightResult(AuctionInsightResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("TotalNumEntries: %s", dataObject.getTotalNumEntries()));
            outputArrayOfAuctionInsightV2Entity(dataObject.getEntries());
            outputStatusMessage(String.format("UsedImpressions: %s", dataObject.getUsedImpressions()));
            outputStatusMessage(String.format("UsedKeywords: %s", dataObject.getUsedKeywords()));
        }
    }
    static void outputArrayOfAuctionInsightResult(ArrayList<AuctionInsightResult> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightResult dataObject : dataObjects)
            {
                outputAuctionInsightResult(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAuctionInsightV2Entity(AuctionInsightV2Entity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("DisplayDomain: %s", dataObject.getDisplayDomain()));
            outputAuctionInsightKPINode(dataObject.getAggregatedKPI());
            outputArrayOfAuctionInsightKPINode(dataObject.getKPIs());
        }
    }
    static void outputArrayOfAuctionInsightV2Entity(ArrayOfAuctionInsightV2Entity dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightV2Entity dataObject : dataObjects.getAuctionInsightV2Entities())
            {
                outputAuctionInsightV2Entity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfBatchError(ArrayOfBatchError dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchError dataObject : dataObjects.getBatchErrors())
            {
                outputBatchError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBidLandscapePoint(BidLandscapePoint dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Bid: %s", dataObject.getBid()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("TopImpressions: %s", dataObject.getTopImpressions()));
            outputStatusMessage(String.format("Currency: %s", dataObject.getCurrency()));
            outputStatusMessage(String.format("Cost: %s", dataObject.getCost()));
            outputStatusMessage(String.format("MarginalCPC: %s", dataObject.getMarginalCPC()));
        }
    }
    static void outputArrayOfBidLandscapePoint(ArrayOfBidLandscapePoint dataObjects)
    {
        if (null != dataObjects)
        {
            for (BidLandscapePoint dataObject : dataObjects.getBidLandscapePoints())
            {
                outputBidLandscapePoint(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBidOpportunity(BidOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("CurrentBid: %s", dataObject.getCurrentBid()));
            outputStatusMessage(String.format("EstimatedIncreaseInClicks: %s", dataObject.getEstimatedIncreaseInClicks()));
            outputStatusMessage(String.format("EstimatedIncreaseInCost: %s", dataObject.getEstimatedIncreaseInCost()));
            outputStatusMessage(String.format("EstimatedIncreaseInImpressions: %s", dataObject.getEstimatedIncreaseInImpressions()));
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("SuggestedBid: %s", dataObject.getSuggestedBid()));
        }
    }
    static void outputArrayOfBidOpportunity(ArrayOfBidOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (BidOpportunity dataObject : dataObjects.getBidOpportunities())
            {
                outputBidOpportunity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBroadMatchKeywordOpportunity(BroadMatchKeywordOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("AverageCTR: %s", dataObject.getAverageCTR()));
            outputStatusMessage(String.format("ClickShare: %s", dataObject.getClickShare()));
            outputStatusMessage(String.format("ImpressionShare: %s", dataObject.getImpressionShare()));
            outputStatusMessage(String.format("ReferenceKeywordBid: %s", dataObject.getReferenceKeywordBid()));
            outputStatusMessage(String.format("ReferenceKeywordId: %s", dataObject.getReferenceKeywordId()));
            outputStatusMessage(String.format("ReferenceKeywordMatchType: %s", dataObject.getReferenceKeywordMatchType()));
            outputArrayOfBroadMatchSearchQueryKPI(dataObject.getSearchQueryKPIs());
        }
    }
    static void outputArrayOfBroadMatchKeywordOpportunity(ArrayList<BroadMatchKeywordOpportunity> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BroadMatchKeywordOpportunity dataObject : dataObjects)
            {
                outputBroadMatchKeywordOpportunity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBroadMatchSearchQueryKPI(BroadMatchSearchQueryKPI dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AverageCTR: %s", dataObject.getAverageCTR()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("SRPV: %s", dataObject.getSRPV()));
            outputStatusMessage(String.format("SearchQuery: %s", dataObject.getSearchQuery()));
        }
    }
    static void outputArrayOfBroadMatchSearchQueryKPI(ArrayOfBroadMatchSearchQueryKPI dataObjects)
    {
        if (null != dataObjects)
        {
            for (BroadMatchSearchQueryKPI dataObject : dataObjects.getBroadMatchSearchQueryKPIs())
            {
                outputBroadMatchSearchQueryKPI(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBudgetOpportunity(BudgetOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfBudgetPoint(dataObject.getBudgetPoints());
            outputStatusMessage(String.format("BudgetType: %s", dataObject.getBudgetType()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("CurrentBudget: %s", dataObject.getCurrentBudget()));
            outputStatusMessage(String.format("IncreaseInClicks: %s", dataObject.getIncreaseInClicks()));
            outputStatusMessage(String.format("IncreaseInImpressions: %s", dataObject.getIncreaseInImpressions()));
            outputStatusMessage(String.format("PercentageIncreaseInClicks: %s", dataObject.getPercentageIncreaseInClicks()));
            outputStatusMessage(String.format("PercentageIncreaseInImpressions: %s", dataObject.getPercentageIncreaseInImpressions()));
            outputStatusMessage(String.format("RecommendedBudget: %s", dataObject.getRecommendedBudget()));
        }
    }
    static void outputArrayOfBudgetOpportunity(ArrayOfBudgetOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetOpportunity dataObject : dataObjects.getBudgetOpportunities())
            {
                outputBudgetOpportunity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBudgetPoint(BudgetPoint dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("BudgetAmount: %s", dataObject.getBudgetAmount()));
            outputStatusMessage(String.format("BudgetPointType: %s", dataObject.getBudgetPointType()));
            outputStatusMessage(String.format("EstimatedWeeklyClicks: %s", dataObject.getEstimatedWeeklyClicks()));
            outputStatusMessage(String.format("EstimatedWeeklyCost: %s", dataObject.getEstimatedWeeklyCost()));
            outputStatusMessage(String.format("EstimatedWeeklyImpressions: %s", dataObject.getEstimatedWeeklyImpressions()));
        }
    }
    static void outputArrayOfBudgetPoint(ArrayOfBudgetPoint dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetPoint dataObject : dataObjects.getBudgetPoints())
            {
                outputBudgetPoint(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCampaignEstimate(CampaignEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfAdGroupEstimate(dataObject.getAdGroupEstimates());
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
        }
    }
    static void outputArrayOfCampaignEstimate(ArrayOfCampaignEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignEstimate dataObject : dataObjects.getCampaignEstimates())
            {
                outputCampaignEstimate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCampaignEstimator(CampaignEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfAdGroupEstimator(dataObject.getAdGroupEstimators());
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputArrayOfCriterion(dataObject.getCriteria());
            outputStatusMessage(String.format("DailyBudget: %s", dataObject.getDailyBudget()));
            outputArrayOfNegativeKeyword(dataObject.getNegativeKeywords());
        }
    }
    static void outputArrayOfCampaignEstimator(ArrayOfCampaignEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignEstimator dataObject : dataObjects.getCampaignEstimators())
            {
                outputCampaignEstimator(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCategorySearchParameter(CategorySearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("CategoryId: %s", dataObject.getCategoryId()));
        }
    }
    static void outputArrayOfCategorySearchParameter(ArrayList<CategorySearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CategorySearchParameter dataObject : dataObjects)
            {
                outputCategorySearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCompetitionSearchParameter(CompetitionSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfCompetitionLevel(dataObject.getCompetitionLevels());
        }
    }
    static void outputArrayOfCompetitionSearchParameter(ArrayList<CompetitionSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CompetitionSearchParameter dataObject : dataObjects)
            {
                outputCompetitionSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCriterion(Criterion dataObject)
    {
        if (null != dataObject)
        {
            if(dataObject instanceof DeviceCriterion)
            {
                outputDeviceCriterion((DeviceCriterion)dataObject);
            }
            if(dataObject instanceof LanguageCriterion)
            {
                outputLanguageCriterion((LanguageCriterion)dataObject);
            }
            if(dataObject instanceof LocationCriterion)
            {
                outputLocationCriterion((LocationCriterion)dataObject);
            }
            if(dataObject instanceof NetworkCriterion)
            {
                outputNetworkCriterion((NetworkCriterion)dataObject);
            }
        }
    }
    static void outputArrayOfCriterion(ArrayOfCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (Criterion dataObject : dataObjects.getCriterions())
            {
                outputCriterion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDateRange(DateRange dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("MaxDate: %s", dataObject.getMaxDate()));
            outputStatusMessage(String.format("MinDate: %s", dataObject.getMinDate()));
        }
    }
    static void outputArrayOfDateRange(ArrayList<DateRange> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DateRange dataObject : dataObjects)
            {
                outputDateRange(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDateRangeSearchParameter(DateRangeSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputDayMonthAndYear(dataObject.getEndDate());
            outputDayMonthAndYear(dataObject.getStartDate());
        }
    }
    static void outputArrayOfDateRangeSearchParameter(ArrayList<DateRangeSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DateRangeSearchParameter dataObject : dataObjects)
            {
                outputDateRangeSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDayMonthAndYear(DayMonthAndYear dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("Month: %s", dataObject.getMonth()));
            outputStatusMessage(String.format("Year: %s", dataObject.getYear()));
        }
    }
    static void outputArrayOfDayMonthAndYear(ArrayList<DayMonthAndYear> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DayMonthAndYear dataObject : dataObjects)
            {
                outputDayMonthAndYear(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDeviceCriterion(DeviceCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("DeviceName: %s", dataObject.getDeviceName()));
        }
    }
    static void outputArrayOfDeviceCriterion(ArrayList<DeviceCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DeviceCriterion dataObject : dataObjects)
            {
                outputDeviceCriterion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDeviceSearchParameter(DeviceSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputDeviceCriterion(dataObject.getDevice());
        }
    }
    static void outputArrayOfDeviceSearchParameter(ArrayList<DeviceSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DeviceSearchParameter dataObject : dataObjects)
            {
                outputDeviceSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDomainCategory(DomainCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Bid: %s", dataObject.getBid()));
            outputStatusMessage(String.format("CategoryName: %s", dataObject.getCategoryName()));
            outputStatusMessage(String.format("Coverage: %s", dataObject.getCoverage()));
        }
    }
    static void outputArrayOfDomainCategory(ArrayOfDomainCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (DomainCategory dataObject : dataObjects.getDomainCategories())
            {
                outputDomainCategory(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputEstimatedBidAndTraffic(EstimatedBidAndTraffic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("MinClicksPerWeek: %s", dataObject.getMinClicksPerWeek()));
            outputStatusMessage(String.format("MaxClicksPerWeek: %s", dataObject.getMaxClicksPerWeek()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("MinImpressionsPerWeek: %s", dataObject.getMinImpressionsPerWeek()));
            outputStatusMessage(String.format("MaxImpressionsPerWeek: %s", dataObject.getMaxImpressionsPerWeek()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("MinTotalCostPerWeek: %s", dataObject.getMinTotalCostPerWeek()));
            outputStatusMessage(String.format("MaxTotalCostPerWeek: %s", dataObject.getMaxTotalCostPerWeek()));
            outputStatusMessage(String.format("Currency: %s", dataObject.getCurrency()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("EstimatedMinBid: %s", dataObject.getEstimatedMinBid()));
        }
    }
    static void outputArrayOfEstimatedBidAndTraffic(ArrayOfEstimatedBidAndTraffic dataObjects)
    {
        if (null != dataObjects)
        {
            for (EstimatedBidAndTraffic dataObject : dataObjects.getEstimatedBidAndTraffics())
            {
                outputEstimatedBidAndTraffic(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputEstimatedPositionAndTraffic(EstimatedPositionAndTraffic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("MinClicksPerWeek: %s", dataObject.getMinClicksPerWeek()));
            outputStatusMessage(String.format("MaxClicksPerWeek: %s", dataObject.getMaxClicksPerWeek()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("MinImpressionsPerWeek: %s", dataObject.getMinImpressionsPerWeek()));
            outputStatusMessage(String.format("MaxImpressionsPerWeek: %s", dataObject.getMaxImpressionsPerWeek()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("MinTotalCostPerWeek: %s", dataObject.getMinTotalCostPerWeek()));
            outputStatusMessage(String.format("MaxTotalCostPerWeek: %s", dataObject.getMaxTotalCostPerWeek()));
            outputStatusMessage(String.format("Currency: %s", dataObject.getCurrency()));
            outputStatusMessage(String.format("EstimatedAdPosition: %s", dataObject.getEstimatedAdPosition()));
        }
    }
    static void outputArrayOfEstimatedPositionAndTraffic(ArrayOfEstimatedPositionAndTraffic dataObjects)
    {
        if (null != dataObjects)
        {
            for (EstimatedPositionAndTraffic dataObject : dataObjects.getEstimatedPositionAndTraffics())
            {
                outputEstimatedPositionAndTraffic(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputExcludeAccountKeywordsSearchParameter(ExcludeAccountKeywordsSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("ExcludeAccountKeywords: %s", dataObject.getExcludeAccountKeywords()));
        }
    }
    static void outputArrayOfExcludeAccountKeywordsSearchParameter(ArrayList<ExcludeAccountKeywordsSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ExcludeAccountKeywordsSearchParameter dataObject : dataObjects)
            {
                outputExcludeAccountKeywordsSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputHistoricalSearchCountPeriodic(HistoricalSearchCountPeriodic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("SearchCount: %s", dataObject.getSearchCount()));
            outputDayMonthAndYear(dataObject.getDayMonthAndYear());
        }
    }
    static void outputArrayOfHistoricalSearchCountPeriodic(ArrayOfHistoricalSearchCountPeriodic dataObjects)
    {
        if (null != dataObjects)
        {
            for (HistoricalSearchCountPeriodic dataObject : dataObjects.getHistoricalSearchCountPeriodics())
            {
                outputHistoricalSearchCountPeriodic(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputIdeaTextSearchParameter(IdeaTextSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfKeyword(dataObject.getExcluded());
            outputArrayOfKeyword(dataObject.getIncluded());
        }
    }
    static void outputArrayOfIdeaTextSearchParameter(ArrayList<IdeaTextSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (IdeaTextSearchParameter dataObject : dataObjects)
            {
                outputIdeaTextSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputImpressionShareSearchParameter(ImpressionShareSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
        }
    }
    static void outputArrayOfImpressionShareSearchParameter(ArrayList<ImpressionShareSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ImpressionShareSearchParameter dataObject : dataObjects)
            {
                outputImpressionShareSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeyword(Keyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
        }
    }
    static void outputArrayOfKeyword(ArrayOfKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (Keyword dataObject : dataObjects.getKeywords())
            {
                outputKeyword(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordAndConfidence(KeywordAndConfidence dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("SuggestedKeyword: %s", dataObject.getSuggestedKeyword()));
            outputStatusMessage(String.format("ConfidenceScore: %s", dataObject.getConfidenceScore()));
        }
    }
    static void outputArrayOfKeywordAndConfidence(ArrayOfKeywordAndConfidence dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordAndConfidence dataObject : dataObjects.getKeywordAndConfidences())
            {
                outputKeywordAndConfidence(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordAndMatchType(KeywordAndMatchType dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("KeywordText: %s", dataObject.getKeywordText()));
            outputArrayOfMatchType(dataObject.getMatchTypes());
        }
    }
    static void outputArrayOfKeywordAndMatchType(ArrayOfKeywordAndMatchType dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordAndMatchType dataObject : dataObjects.getKeywordAndMatchTypes())
            {
                outputKeywordAndMatchType(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordBidLandscape(KeywordBidLandscape dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputDayMonthAndYear(dataObject.getStartDate());
            outputDayMonthAndYear(dataObject.getEndDate());
            outputArrayOfBidLandscapePoint(dataObject.getBidLandscapePoints());
        }
    }
    static void outputArrayOfKeywordBidLandscape(ArrayOfKeywordBidLandscape dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordBidLandscape dataObject : dataObjects.getKeywordBidLandscapes())
            {
                outputKeywordBidLandscape(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordCategory(KeywordCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Category: %s", dataObject.getCategory()));
            outputStatusMessage(String.format("ConfidenceScore: %s", dataObject.getConfidenceScore()));
        }
    }
    static void outputArrayOfKeywordCategory(ArrayOfKeywordCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordCategory dataObject : dataObjects.getKeywordCategories())
            {
                outputKeywordCategory(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordCategoryResult(KeywordCategoryResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfKeywordCategory(dataObject.getKeywordCategories());
        }
    }
    static void outputArrayOfKeywordCategoryResult(ArrayOfKeywordCategoryResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordCategoryResult dataObject : dataObjects.getKeywordCategoryResults())
            {
                outputKeywordCategoryResult(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordDemographic(KeywordDemographic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("Age1824: %s", dataObject.getAge1824()));
            outputStatusMessage(String.format("Age2534: %s", dataObject.getAge2534()));
            outputStatusMessage(String.format("Age3549: %s", dataObject.getAge3549()));
            outputStatusMessage(String.format("Age5064: %s", dataObject.getAge5064()));
            outputStatusMessage(String.format("Age65Plus: %s", dataObject.getAge65Plus()));
            outputStatusMessage(String.format("AgeUnknown: %s", dataObject.getAgeUnknown()));
            outputStatusMessage(String.format("Female: %s", dataObject.getFemale()));
            outputStatusMessage(String.format("Male: %s", dataObject.getMale()));
            outputStatusMessage(String.format("GenderUnknown: %s", dataObject.getGenderUnknown()));
        }
    }
    static void outputArrayOfKeywordDemographic(ArrayOfKeywordDemographic dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordDemographic dataObject : dataObjects.getKeywordDemographics())
            {
                outputKeywordDemographic(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordDemographicResult(KeywordDemographicResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfKeywordDemographic(dataObject.getKeywordDemographics());
        }
    }
    static void outputArrayOfKeywordDemographicResult(ArrayOfKeywordDemographicResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordDemographicResult dataObject : dataObjects.getKeywordDemographicResults())
            {
                outputKeywordDemographicResult(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordEstimate(KeywordEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputKeyword(dataObject.getKeyword());
            outputTrafficEstimate(dataObject.getMaximum());
            outputTrafficEstimate(dataObject.getMinimum());
        }
    }
    static void outputArrayOfKeywordEstimate(ArrayOfKeywordEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimate dataObject : dataObjects.getKeywordEstimates())
            {
                outputKeywordEstimate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordEstimatedBid(KeywordEstimatedBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfEstimatedBidAndTraffic(dataObject.getEstimatedBids());
        }
    }
    static void outputArrayOfKeywordEstimatedBid(ArrayOfKeywordEstimatedBid dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimatedBid dataObject : dataObjects.getKeywordEstimatedBids())
            {
                outputKeywordEstimatedBid(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordEstimatedPosition(KeywordEstimatedPosition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfEstimatedPositionAndTraffic(dataObject.getEstimatedPositions());
        }
    }
    static void outputArrayOfKeywordEstimatedPosition(ArrayOfKeywordEstimatedPosition dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimatedPosition dataObject : dataObjects.getKeywordEstimatedPositions())
            {
                outputKeywordEstimatedPosition(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordEstimator(KeywordEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputKeyword(dataObject.getKeyword());
            outputStatusMessage(String.format("MaxCpc: %s", dataObject.getMaxCpc()));
        }
    }
    static void outputArrayOfKeywordEstimator(ArrayOfKeywordEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimator dataObject : dataObjects.getKeywordEstimators())
            {
                outputKeywordEstimator(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordHistoricalPerformance(KeywordHistoricalPerformance dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfKeywordKPI(dataObject.getKeywordKPIs());
        }
    }
    static void outputArrayOfKeywordHistoricalPerformance(ArrayOfKeywordHistoricalPerformance dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordHistoricalPerformance dataObject : dataObjects.getKeywordHistoricalPerformances())
            {
                outputKeywordHistoricalPerformance(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordIdea(KeywordIdea dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", dataObject.getAdGroupName()));
            outputStatusMessage(String.format("AdImpressionShare: %s", dataObject.getAdImpressionShare()));
            outputStatusMessage(String.format("Competition: %s", dataObject.getCompetition()));
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOflong(dataObject.getMonthlySearchCounts());
            outputStatusMessage(String.format("Relevance: %s", dataObject.getRelevance()));
            outputStatusMessage(String.format("Source: %s", dataObject.getSource()));
            outputStatusMessage(String.format("SuggestedBid: %s", dataObject.getSuggestedBid()));
        }
    }
    static void outputArrayOfKeywordIdea(ArrayOfKeywordIdea dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdea dataObject : dataObjects.getKeywordIdeas())
            {
                outputKeywordIdea(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordIdeaCategory(KeywordIdeaCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("CategoryId: %s", dataObject.getCategoryId()));
            outputStatusMessage(String.format("CategoryName: %s", dataObject.getCategoryName()));
        }
    }
    static void outputArrayOfKeywordIdeaCategory(ArrayOfKeywordIdeaCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdeaCategory dataObject : dataObjects.getKeywordIdeaCategories())
            {
                outputKeywordIdeaCategory(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordIdEstimatedBid(KeywordIdEstimatedBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputKeywordEstimatedBid(dataObject.getKeywordEstimatedBid());
        }
    }
    static void outputArrayOfKeywordIdEstimatedBid(ArrayOfKeywordIdEstimatedBid dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdEstimatedBid dataObject : dataObjects.getKeywordIdEstimatedBids())
            {
                outputKeywordIdEstimatedBid(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordIdEstimatedPosition(KeywordIdEstimatedPosition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputKeywordEstimatedPosition(dataObject.getKeywordEstimatedPosition());
        }
    }
    static void outputArrayOfKeywordIdEstimatedPosition(ArrayOfKeywordIdEstimatedPosition dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdEstimatedPosition dataObject : dataObjects.getKeywordIdEstimatedPositions())
            {
                outputKeywordIdEstimatedPosition(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordKPI(KeywordKPI dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("AdPosition: %s", dataObject.getAdPosition()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("TotalCost: %s", dataObject.getTotalCost()));
            outputStatusMessage(String.format("AverageBid: %s", dataObject.getAverageBid()));
        }
    }
    static void outputArrayOfKeywordKPI(ArrayOfKeywordKPI dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordKPI dataObject : dataObjects.getKeywordKPIs())
            {
                outputKeywordKPI(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordLocation(KeywordLocation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("Percentage: %s", dataObject.getPercentage()));
        }
    }
    static void outputArrayOfKeywordLocation(ArrayOfKeywordLocation dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordLocation dataObject : dataObjects.getKeywordLocations())
            {
                outputKeywordLocation(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordLocationResult(KeywordLocationResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfKeywordLocation(dataObject.getKeywordLocations());
        }
    }
    static void outputArrayOfKeywordLocationResult(ArrayOfKeywordLocationResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordLocationResult dataObject : dataObjects.getKeywordLocationResults())
            {
                outputKeywordLocationResult(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordOpportunity(KeywordOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", dataObject.getAdGroupName()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("CampaignName: %s", dataObject.getCampaignName()));
            outputStatusMessage(String.format("Competition: %s", dataObject.getCompetition()));
            outputStatusMessage(String.format("EstimatedIncreaseInClicks: %s", dataObject.getEstimatedIncreaseInClicks()));
            outputStatusMessage(String.format("EstimatedIncreaseInCost: %s", dataObject.getEstimatedIncreaseInCost()));
            outputStatusMessage(String.format("EstimatedIncreaseInImpressions: %s", dataObject.getEstimatedIncreaseInImpressions()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("MonthlySearches: %s", dataObject.getMonthlySearches()));
            outputStatusMessage(String.format("SuggestedBid: %s", dataObject.getSuggestedBid()));
            outputStatusMessage(String.format("SuggestedKeyword: %s", dataObject.getSuggestedKeyword()));
            if(dataObject instanceof BroadMatchKeywordOpportunity)
            {
                outputBroadMatchKeywordOpportunity((BroadMatchKeywordOpportunity)dataObject);
            }
        }
    }
    static void outputArrayOfKeywordOpportunity(ArrayOfKeywordOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordOpportunity dataObject : dataObjects.getKeywordOpportunities())
            {
                outputKeywordOpportunity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordSearchCount(KeywordSearchCount dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfSearchCountsByAttributes(dataObject.getSearchCountsByAttributes());
        }
    }
    static void outputArrayOfKeywordSearchCount(ArrayOfKeywordSearchCount dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordSearchCount dataObject : dataObjects.getKeywordSearchCounts())
            {
                outputKeywordSearchCount(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordSuggestion(KeywordSuggestion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputArrayOfKeywordAndConfidence(dataObject.getSuggestionsAndConfidence());
        }
    }
    static void outputArrayOfKeywordSuggestion(ArrayOfKeywordSuggestion dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordSuggestion dataObject : dataObjects.getKeywordSuggestions())
            {
                outputKeywordSuggestion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputLanguageCriterion(LanguageCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
        }
    }
    static void outputArrayOfLanguageCriterion(ArrayOfLanguageCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (LanguageCriterion dataObject : dataObjects.getLanguageCriterions())
            {
                outputLanguageCriterion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputLanguageSearchParameter(LanguageSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfLanguageCriterion(dataObject.getLanguages());
        }
    }
    static void outputArrayOfLanguageSearchParameter(ArrayList<LanguageSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LanguageSearchParameter dataObject : dataObjects)
            {
                outputLanguageSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputLocationCriterion(LocationCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("LocationId: %s", dataObject.getLocationId()));
        }
    }
    static void outputArrayOfLocationCriterion(ArrayOfLocationCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationCriterion dataObject : dataObjects.getLocationCriterions())
            {
                outputLocationCriterion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputLocationSearchParameter(LocationSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfLocationCriterion(dataObject.getLocations());
        }
    }
    static void outputArrayOfLocationSearchParameter(ArrayList<LocationSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationSearchParameter dataObject : dataObjects)
            {
                outputLocationSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputNegativeKeyword(NegativeKeyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
        }
    }
    static void outputArrayOfNegativeKeyword(ArrayOfNegativeKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeyword dataObject : dataObjects.getNegativeKeywords())
            {
                outputNegativeKeyword(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputNetworkCriterion(NetworkCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Network: %s", dataObject.getNetwork()));
        }
    }
    static void outputArrayOfNetworkCriterion(ArrayList<NetworkCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NetworkCriterion dataObject : dataObjects)
            {
                outputNetworkCriterion(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputNetworkSearchParameter(NetworkSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputNetworkCriterion(dataObject.getNetwork());
        }
    }
    static void outputArrayOfNetworkSearchParameter(ArrayList<NetworkSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NetworkSearchParameter dataObject : dataObjects)
            {
                outputNetworkSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOpportunity(Opportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("OpportunityKey: %s", dataObject.getOpportunityKey()));
            if(dataObject instanceof BidOpportunity)
            {
                outputBidOpportunity((BidOpportunity)dataObject);
            }
            if(dataObject instanceof BudgetOpportunity)
            {
                outputBudgetOpportunity((BudgetOpportunity)dataObject);
            }
            if(dataObject instanceof KeywordOpportunity)
            {
                outputKeywordOpportunity((KeywordOpportunity)dataObject);
            }
        }
    }
    static void outputArrayOfOpportunity(ArrayList<Opportunity> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Opportunity dataObject : dataObjects)
            {
                outputOpportunity(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOrderBy(OrderBy dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("SortOrder: %s", dataObject.getSortOrder()));
            outputStatusMessage(String.format("SortingField: %s", dataObject.getSortingField()));
        }
    }
    static void outputArrayOfOrderBy(ArrayOfOrderBy dataObjects)
    {
        if (null != dataObjects)
        {
            for (OrderBy dataObject : dataObjects.getOrderBies())
            {
                outputOrderBy(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPredicate(Predicate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("FilteringField: %s", dataObject.getFilteringField()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputArrayOfstring(dataObject.getValues());
        }
    }
    static void outputArrayOfPredicate(ArrayOfPredicate dataObjects)
    {
        if (null != dataObjects)
        {
            for (Predicate dataObject : dataObjects.getPredicates())
            {
                outputPredicate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputQuerySearchParameter(QuerySearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfstring(dataObject.getQueries());
        }
    }
    static void outputArrayOfQuerySearchParameter(ArrayList<QuerySearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (QuerySearchParameter dataObject : dataObjects)
            {
                outputQuerySearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchCountsByAttributes(SearchCountsByAttributes dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputArrayOfHistoricalSearchCountPeriodic(dataObject.getHistoricalSearchCounts());
        }
    }
    static void outputArrayOfSearchCountsByAttributes(ArrayOfSearchCountsByAttributes dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCountsByAttributes dataObject : dataObjects.getSearchCountsByAttributes())
            {
                outputSearchCountsByAttributes(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchParameter(SearchParameter dataObject)
    {
        if (null != dataObject)
        {
            if(dataObject instanceof CategorySearchParameter)
            {
                outputCategorySearchParameter((CategorySearchParameter)dataObject);
            }
            if(dataObject instanceof CompetitionSearchParameter)
            {
                outputCompetitionSearchParameter((CompetitionSearchParameter)dataObject);
            }
            if(dataObject instanceof DateRangeSearchParameter)
            {
                outputDateRangeSearchParameter((DateRangeSearchParameter)dataObject);
            }
            if(dataObject instanceof DeviceSearchParameter)
            {
                outputDeviceSearchParameter((DeviceSearchParameter)dataObject);
            }
            if(dataObject instanceof ExcludeAccountKeywordsSearchParameter)
            {
                outputExcludeAccountKeywordsSearchParameter((ExcludeAccountKeywordsSearchParameter)dataObject);
            }
            if(dataObject instanceof IdeaTextSearchParameter)
            {
                outputIdeaTextSearchParameter((IdeaTextSearchParameter)dataObject);
            }
            if(dataObject instanceof ImpressionShareSearchParameter)
            {
                outputImpressionShareSearchParameter((ImpressionShareSearchParameter)dataObject);
            }
            if(dataObject instanceof LanguageSearchParameter)
            {
                outputLanguageSearchParameter((LanguageSearchParameter)dataObject);
            }
            if(dataObject instanceof LocationSearchParameter)
            {
                outputLocationSearchParameter((LocationSearchParameter)dataObject);
            }
            if(dataObject instanceof NetworkSearchParameter)
            {
                outputNetworkSearchParameter((NetworkSearchParameter)dataObject);
            }
            if(dataObject instanceof QuerySearchParameter)
            {
                outputQuerySearchParameter((QuerySearchParameter)dataObject);
            }
            if(dataObject instanceof SearchVolumeSearchParameter)
            {
                outputSearchVolumeSearchParameter((SearchVolumeSearchParameter)dataObject);
            }
            if(dataObject instanceof SuggestedBidSearchParameter)
            {
                outputSuggestedBidSearchParameter((SuggestedBidSearchParameter)dataObject);
            }
            if(dataObject instanceof UrlSearchParameter)
            {
                outputUrlSearchParameter((UrlSearchParameter)dataObject);
            }
        }
    }
    static void outputArrayOfSearchParameter(ArrayOfSearchParameter dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchParameter dataObject : dataObjects.getSearchParameters())
            {
                outputSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchVolumeSearchParameter(SearchVolumeSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
        }
    }
    static void outputArrayOfSearchVolumeSearchParameter(ArrayList<SearchVolumeSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchVolumeSearchParameter dataObject : dataObjects)
            {
                outputSearchVolumeSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSelector(Selector dataObject)
    {
        if (null != dataObject)
        {
            outputDateRange(dataObject.getDateRange());
            outputArrayOfField(dataObject.getGroupBy());
            outputArrayOfOrderBy(dataObject.getOrdering());
            outputPaging(dataObject.getPageInfo());
            outputArrayOfPredicate(dataObject.getPredicates());
            outputArrayOfField(dataObject.getSelectedFields());
        }
    }
    static void outputArrayOfSelector(ArrayList<Selector> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Selector dataObject : dataObjects)
            {
                outputSelector(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSuggestedBidSearchParameter(SuggestedBidSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
        }
    }
    static void outputArrayOfSuggestedBidSearchParameter(ArrayList<SuggestedBidSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SuggestedBidSearchParameter dataObject : dataObjects)
            {
                outputSuggestedBidSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputTrafficEstimate(TrafficEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AverageCpc: %s", dataObject.getAverageCpc()));
            outputStatusMessage(String.format("AveragePosition: %s", dataObject.getAveragePosition()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Ctr: %s", dataObject.getCtr()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("TotalCost: %s", dataObject.getTotalCost()));
        }
    }
    static void outputArrayOfTrafficEstimate(ArrayList<TrafficEstimate> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TrafficEstimate dataObject : dataObjects)
            {
                outputTrafficEstimate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUrlSearchParameter(UrlSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Url: %s", dataObject.getUrl()));
        }
    }
    static void outputArrayOfUrlSearchParameter(ArrayList<UrlSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UrlSearchParameter dataObject : dataObjects)
            {
                outputUrlSearchParameter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBidOpportunityType(BidOpportunityType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BidOpportunityType value : BidOpportunityType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBidOpportunityType(ArrayList<BidOpportunityType> valueSets)
    {
        if (null != valueSets)
        {
            for (BidOpportunityType valueSet : valueSets)
            {
                outputBidOpportunityType(valueSet);
            }
        }
    }
    static void outputBudgetPointType(BudgetPointType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BudgetPointType value : BudgetPointType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBudgetPointType(ArrayList<BudgetPointType> valueSets)
    {
        if (null != valueSets)
        {
            for (BudgetPointType valueSet : valueSets)
            {
                outputBudgetPointType(valueSet);
            }
        }
    }
    static void outputBudgetLimitType(BudgetLimitType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BudgetLimitType value : BudgetLimitType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBudgetLimitType(ArrayList<BudgetLimitType> valueSets)
    {
        if (null != valueSets)
        {
            for (BudgetLimitType valueSet : valueSets)
            {
                outputBudgetLimitType(valueSet);
            }
        }
    }
    static void outputKeywordOpportunityType(KeywordOpportunityType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordOpportunityType value : KeywordOpportunityType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordOpportunityType(ArrayList<KeywordOpportunityType> valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordOpportunityType valueSet : valueSets)
            {
                outputKeywordOpportunityType(valueSet);
            }
        }
    }
    static void outputTargetAdPosition(TargetAdPosition valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (TargetAdPosition value : TargetAdPosition.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfTargetAdPosition(ArrayList<TargetAdPosition> valueSets)
    {
        if (null != valueSets)
        {
            for (TargetAdPosition valueSet : valueSets)
            {
                outputTargetAdPosition(valueSet);
            }
        }
    }
    static void outputCurrency(Currency valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Currency value : Currency.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCurrency(ArrayList<Currency> valueSets)
    {
        if (null != valueSets)
        {
            for (Currency valueSet : valueSets)
            {
                outputCurrency(valueSet);
            }
        }
    }
    static void outputMatchType(MatchType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (MatchType value : MatchType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfMatchType(ArrayOfMatchType valueSets)
    {
        if (null != valueSets)
        {
            for (MatchType valueSet : valueSets.getMatchTypes())
            {
                outputMatchType(valueSet);
            }
        }
    }
    static void outputAdGroupBidLandscapeType(AdGroupBidLandscapeType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupBidLandscapeType value : AdGroupBidLandscapeType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupBidLandscapeType(ArrayList<AdGroupBidLandscapeType> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupBidLandscapeType valueSet : valueSets)
            {
                outputAdGroupBidLandscapeType(valueSet);
            }
        }
    }
    static void outputTimeInterval(TimeInterval valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (TimeInterval value : TimeInterval.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfTimeInterval(ArrayList<TimeInterval> valueSets)
    {
        if (null != valueSets)
        {
            for (TimeInterval valueSet : valueSets)
            {
                outputTimeInterval(valueSet);
            }
        }
    }
    static void outputAdPosition(AdPosition valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdPosition value : AdPosition.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdPosition(ArrayList<AdPosition> valueSets)
    {
        if (null != valueSets)
        {
            for (AdPosition valueSet : valueSets)
            {
                outputAdPosition(valueSet);
            }
        }
    }
    static void outputField(Field valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Field value : Field.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfField(ArrayOfField valueSets)
    {
        if (null != valueSets)
        {
            for (Field valueSet : valueSets.getFields())
            {
                outputField(valueSet);
            }
        }
    }
    static void outputSortOrder(SortOrder valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SortOrder value : SortOrder.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSortOrder(ArrayList<SortOrder> valueSets)
    {
        if (null != valueSets)
        {
            for (SortOrder valueSet : valueSets)
            {
                outputSortOrder(valueSet);
            }
        }
    }
    static void outputOperator(Operator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Operator value : Operator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfOperator(ArrayList<Operator> valueSets)
    {
        if (null != valueSets)
        {
            for (Operator valueSet : valueSets)
            {
                outputOperator(valueSet);
            }
        }
    }
    static void outputKeywordIdeaAttribute(KeywordIdeaAttribute valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordIdeaAttribute value : KeywordIdeaAttribute.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordIdeaAttribute(ArrayOfKeywordIdeaAttribute valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordIdeaAttribute valueSet : valueSets.getKeywordIdeaAttributes())
            {
                outputKeywordIdeaAttribute(valueSet);
            }
        }
    }
    static void outputNetworkType(NetworkType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (NetworkType value : NetworkType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfNetworkType(ArrayList<NetworkType> valueSets)
    {
        if (null != valueSets)
        {
            for (NetworkType valueSet : valueSets)
            {
                outputNetworkType(valueSet);
            }
        }
    }
    static void outputCompetitionLevel(CompetitionLevel valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CompetitionLevel value : CompetitionLevel.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCompetitionLevel(ArrayOfCompetitionLevel valueSets)
    {
        if (null != valueSets)
        {
            for (CompetitionLevel valueSet : valueSets.getCompetitionLevels())
            {
                outputCompetitionLevel(valueSet);
            }
        }
    }
    static void outputSourceType(SourceType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SourceType value : SourceType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSourceType(ArrayList<SourceType> valueSets)
    {
        if (null != valueSets)
        {
            for (SourceType valueSet : valueSets)
            {
                outputSourceType(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
    static void outputArrayOfstring(ArrayOfstring items)
    {
        if (null != items)
        {
            for (java.lang.String item : items.getStrings())
            {
                outputStatusMessage(String.format("Value of the string: %s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("Value of the long: %s", item));
            }
        }
    }
}