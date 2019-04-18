package com.microsoft.bingads.examples.v13;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.adinsight.*;

class AdInsightExampleHelper
{
    static ServiceClient<IAdInsightService> AdInsightService;
    static GetAuctionInsightDataResponse getAuctionInsightData(
        EntityType entityType,
        ArrayOflong entityIds,
        ArrayOfSearchParameter searchParameters) throws RemoteException, Exception
    {
        GetAuctionInsightDataRequest request = new GetAuctionInsightDataRequest();

        request.setEntityType(entityType);
        request.setEntityIds(entityIds);
        request.setSearchParameters(searchParameters);

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
        ArrayOflong locationIds,
        CurrencyCode currencyCode,
        java.lang.Long campaignId,
        java.lang.Long adGroupId,
        java.lang.String entityLevelBid) throws RemoteException, Exception
    {
        GetEstimatedBidByKeywordsRequest request = new GetEstimatedBidByKeywordsRequest();

        request.setKeywords(keywords);
        request.setTargetPositionForAds(targetPositionForAds);
        request.setLanguage(language);
        request.setLocationIds(locationIds);
        request.setCurrencyCode(currencyCode);
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
        ArrayOflong locationIds,
        CurrencyCode currencyCode,
        ArrayOfMatchType matchTypes,
        java.lang.Long campaignId,
        java.lang.Long adGroupId) throws RemoteException, Exception
    {
        GetEstimatedPositionByKeywordsRequest request = new GetEstimatedPositionByKeywordsRequest();

        request.setKeywords(keywords);
        request.setMaxBid(maxBid);
        request.setLanguage(language);
        request.setLocationIds(locationIds);
        request.setCurrencyCode(currencyCode);
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
            outputStatusMessage("* * * Begin OutputAdApiError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputAdApiError * * *");
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiFaultDetail * * *");
            outputStatusMessage("Errors:");
            outputArrayOfAdApiError(dataObject.getErrors());
            outputStatusMessage("* * * End OutputAdApiFaultDetail * * *");
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
            }
        }
    }
    static void outputAdGroupBidLandscape(AdGroupBidLandscape dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupBidLandscape * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupBidLandscapeType: %s", dataObject.getAdGroupBidLandscapeType()));
            outputStatusMessage("StartDate:");
            outputDayMonthAndYear(dataObject.getStartDate());
            outputStatusMessage("EndDate:");
            outputDayMonthAndYear(dataObject.getEndDate());
            outputStatusMessage("BidLandscapePoints:");
            outputArrayOfBidLandscapePoint(dataObject.getBidLandscapePoints());
            outputStatusMessage("* * * End OutputAdGroupBidLandscape * * *");
        }
    }
    static void outputArrayOfAdGroupBidLandscape(ArrayOfAdGroupBidLandscape dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupBidLandscape dataObject : dataObjects.getAdGroupBidLandscapes())
            {
                outputAdGroupBidLandscape(dataObject);
            }
        }
    }
    static void outputAdGroupBidLandscapeInput(AdGroupBidLandscapeInput dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupBidLandscapeInput * * *");
            outputStatusMessage(String.format("AdGroupBidLandscapeType: %s", dataObject.getAdGroupBidLandscapeType()));
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("* * * End OutputAdGroupBidLandscapeInput * * *");
        }
    }
    static void outputArrayOfAdGroupBidLandscapeInput(ArrayOfAdGroupBidLandscapeInput dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupBidLandscapeInput dataObject : dataObjects.getAdGroupBidLandscapeInputs())
            {
                outputAdGroupBidLandscapeInput(dataObject);
            }
        }
    }
    static void outputAdGroupEstimate(AdGroupEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupEstimate * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("KeywordEstimates:");
            outputArrayOfKeywordEstimate(dataObject.getKeywordEstimates());
            outputStatusMessage("* * * End OutputAdGroupEstimate * * *");
        }
    }
    static void outputArrayOfAdGroupEstimate(ArrayOfAdGroupEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupEstimate dataObject : dataObjects.getAdGroupEstimates())
            {
                outputAdGroupEstimate(dataObject);
            }
        }
    }
    static void outputAdGroupEstimator(AdGroupEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupEstimator * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("KeywordEstimators:");
            outputArrayOfKeywordEstimator(dataObject.getKeywordEstimators());
            outputStatusMessage(String.format("MaxCpc: %s", dataObject.getMaxCpc()));
            outputStatusMessage("* * * End OutputAdGroupEstimator * * *");
        }
    }
    static void outputArrayOfAdGroupEstimator(ArrayOfAdGroupEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupEstimator dataObject : dataObjects.getAdGroupEstimators())
            {
                outputAdGroupEstimator(dataObject);
            }
        }
    }
    static void outputApiFaultDetail(ApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiFaultDetail * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            outputStatusMessage("* * * End OutputApiFaultDetail * * *");
        }
    }
    static void outputArrayOfApiFaultDetail(ArrayList<ApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFaultDetail dataObject : dataObjects)
            {
                outputApiFaultDetail(dataObject);
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApplicationFault * * *");
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFaultDetail)
            {
                outputApiFaultDetail((ApiFaultDetail)dataObject);
            }
            outputStatusMessage("* * * End OutputApplicationFault * * *");
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
            }
        }
    }
    static void outputAuctionInsightEntry(AuctionInsightEntry dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAuctionInsightEntry * * *");
            outputStatusMessage(String.format("DisplayDomain: %s", dataObject.getDisplayDomain()));
            outputStatusMessage("AggregatedKpi:");
            outputAuctionInsightKpi(dataObject.getAggregatedKpi());
            outputStatusMessage("SegmentedKpis:");
            outputArrayOfAuctionInsightKpi(dataObject.getSegmentedKpis());
            outputStatusMessage("* * * End OutputAuctionInsightEntry * * *");
        }
    }
    static void outputArrayOfAuctionInsightEntry(ArrayOfAuctionInsightEntry dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightEntry dataObject : dataObjects.getAuctionInsightEntries())
            {
                outputAuctionInsightEntry(dataObject);
            }
        }
    }
    static void outputAuctionInsightKpi(AuctionInsightKpi dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAuctionInsightKpi * * *");
            outputStatusMessage("Segments:");
            outputArrayOfstring(dataObject.getSegments());
            outputStatusMessage(String.format("ImpressionShare: %s", dataObject.getImpressionShare()));
            outputStatusMessage(String.format("OverlapRate: %s", dataObject.getOverlapRate()));
            outputStatusMessage(String.format("AveragePosition: %s", dataObject.getAveragePosition()));
            outputStatusMessage(String.format("AboveRate: %s", dataObject.getAboveRate()));
            outputStatusMessage(String.format("TopOfPageRate: %s", dataObject.getTopOfPageRate()));
            outputStatusMessage(String.format("OutrankingShare: %s", dataObject.getOutrankingShare()));
            outputStatusMessage("* * * End OutputAuctionInsightKpi * * *");
        }
    }
    static void outputArrayOfAuctionInsightKpi(ArrayOfAuctionInsightKpi dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightKpi dataObject : dataObjects.getAuctionInsightKpis())
            {
                outputAuctionInsightKpi(dataObject);
            }
        }
    }
    static void outputAuctionInsightResult(AuctionInsightResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAuctionInsightResult * * *");
            outputStatusMessage("Segments:");
            outputArrayOfAuctionSegment(dataObject.getSegments());
            outputStatusMessage("Entries:");
            outputArrayOfAuctionInsightEntry(dataObject.getEntries());
            outputStatusMessage(String.format("UsedImpressions: %s", dataObject.getUsedImpressions()));
            outputStatusMessage(String.format("UsedKeywords: %s", dataObject.getUsedKeywords()));
            outputStatusMessage("* * * End OutputAuctionInsightResult * * *");
        }
    }
    static void outputArrayOfAuctionInsightResult(ArrayList<AuctionInsightResult> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionInsightResult dataObject : dataObjects)
            {
                outputAuctionInsightResult(dataObject);
            }
        }
    }
    static void outputAuctionSegmentSearchParameter(AuctionSegmentSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAuctionSegmentSearchParameter * * *");
            outputStatusMessage(String.format("Segment: %s", dataObject.getSegment()));
            outputStatusMessage("* * * End OutputAuctionSegmentSearchParameter * * *");
        }
    }
    static void outputArrayOfAuctionSegmentSearchParameter(ArrayList<AuctionSegmentSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AuctionSegmentSearchParameter dataObject : dataObjects)
            {
                outputAuctionSegmentSearchParameter(dataObject);
            }
        }
    }
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBatchError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputBatchError * * *");
        }
    }
    static void outputArrayOfBatchError(ArrayOfBatchError dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchError dataObject : dataObjects.getBatchErrors())
            {
                outputBatchError(dataObject);
            }
        }
    }
    static void outputBidLandscapePoint(BidLandscapePoint dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBidLandscapePoint * * *");
            outputStatusMessage(String.format("Bid: %s", dataObject.getBid()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("TopImpressions: %s", dataObject.getTopImpressions()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("Cost: %s", dataObject.getCost()));
            outputStatusMessage(String.format("MarginalCPC: %s", dataObject.getMarginalCPC()));
            outputStatusMessage("* * * End OutputBidLandscapePoint * * *");
        }
    }
    static void outputArrayOfBidLandscapePoint(ArrayOfBidLandscapePoint dataObjects)
    {
        if (null != dataObjects)
        {
            for (BidLandscapePoint dataObject : dataObjects.getBidLandscapePoints())
            {
                outputBidLandscapePoint(dataObject);
            }
        }
    }
    static void outputBidOpportunity(BidOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBidOpportunity * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("CurrentBid: %s", dataObject.getCurrentBid()));
            outputStatusMessage(String.format("EstimatedIncreaseInClicks: %s", dataObject.getEstimatedIncreaseInClicks()));
            outputStatusMessage(String.format("EstimatedIncreaseInCost: %s", dataObject.getEstimatedIncreaseInCost()));
            outputStatusMessage(String.format("EstimatedIncreaseInImpressions: %s", dataObject.getEstimatedIncreaseInImpressions()));
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("SuggestedBid: %s", dataObject.getSuggestedBid()));
            outputStatusMessage("* * * End OutputBidOpportunity * * *");
        }
    }
    static void outputArrayOfBidOpportunity(ArrayOfBidOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (BidOpportunity dataObject : dataObjects.getBidOpportunities())
            {
                outputBidOpportunity(dataObject);
            }
        }
    }
    static void outputBroadMatchKeywordOpportunity(BroadMatchKeywordOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBroadMatchKeywordOpportunity * * *");
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("AverageCTR: %s", dataObject.getAverageCTR()));
            outputStatusMessage(String.format("ClickShare: %s", dataObject.getClickShare()));
            outputStatusMessage(String.format("ImpressionShare: %s", dataObject.getImpressionShare()));
            outputStatusMessage(String.format("ReferenceKeywordBid: %s", dataObject.getReferenceKeywordBid()));
            outputStatusMessage(String.format("ReferenceKeywordId: %s", dataObject.getReferenceKeywordId()));
            outputStatusMessage(String.format("ReferenceKeywordMatchType: %s", dataObject.getReferenceKeywordMatchType()));
            outputStatusMessage("SearchQueryKPIs:");
            outputArrayOfBroadMatchSearchQueryKPI(dataObject.getSearchQueryKPIs());
            outputStatusMessage("* * * End OutputBroadMatchKeywordOpportunity * * *");
        }
    }
    static void outputArrayOfBroadMatchKeywordOpportunity(ArrayList<BroadMatchKeywordOpportunity> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BroadMatchKeywordOpportunity dataObject : dataObjects)
            {
                outputBroadMatchKeywordOpportunity(dataObject);
            }
        }
    }
    static void outputBroadMatchSearchQueryKPI(BroadMatchSearchQueryKPI dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBroadMatchSearchQueryKPI * * *");
            outputStatusMessage(String.format("AverageCTR: %s", dataObject.getAverageCTR()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("SRPV: %s", dataObject.getSRPV()));
            outputStatusMessage(String.format("SearchQuery: %s", dataObject.getSearchQuery()));
            outputStatusMessage("* * * End OutputBroadMatchSearchQueryKPI * * *");
        }
    }
    static void outputArrayOfBroadMatchSearchQueryKPI(ArrayOfBroadMatchSearchQueryKPI dataObjects)
    {
        if (null != dataObjects)
        {
            for (BroadMatchSearchQueryKPI dataObject : dataObjects.getBroadMatchSearchQueryKPIs())
            {
                outputBroadMatchSearchQueryKPI(dataObject);
            }
        }
    }
    static void outputBudgetOpportunity(BudgetOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBudgetOpportunity * * *");
            outputStatusMessage("BudgetPoints:");
            outputArrayOfBudgetPoint(dataObject.getBudgetPoints());
            outputStatusMessage(String.format("BudgetType: %s", dataObject.getBudgetType()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("CurrentBudget: %s", dataObject.getCurrentBudget()));
            outputStatusMessage(String.format("IncreaseInClicks: %s", dataObject.getIncreaseInClicks()));
            outputStatusMessage(String.format("IncreaseInImpressions: %s", dataObject.getIncreaseInImpressions()));
            outputStatusMessage(String.format("PercentageIncreaseInClicks: %s", dataObject.getPercentageIncreaseInClicks()));
            outputStatusMessage(String.format("PercentageIncreaseInImpressions: %s", dataObject.getPercentageIncreaseInImpressions()));
            outputStatusMessage(String.format("RecommendedBudget: %s", dataObject.getRecommendedBudget()));
            outputStatusMessage("* * * End OutputBudgetOpportunity * * *");
        }
    }
    static void outputArrayOfBudgetOpportunity(ArrayOfBudgetOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetOpportunity dataObject : dataObjects.getBudgetOpportunities())
            {
                outputBudgetOpportunity(dataObject);
            }
        }
    }
    static void outputBudgetPoint(BudgetPoint dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBudgetPoint * * *");
            outputStatusMessage(String.format("BudgetAmount: %s", dataObject.getBudgetAmount()));
            outputStatusMessage(String.format("BudgetPointType: %s", dataObject.getBudgetPointType()));
            outputStatusMessage(String.format("EstimatedWeeklyClicks: %s", dataObject.getEstimatedWeeklyClicks()));
            outputStatusMessage(String.format("EstimatedWeeklyCost: %s", dataObject.getEstimatedWeeklyCost()));
            outputStatusMessage(String.format("EstimatedWeeklyImpressions: %s", dataObject.getEstimatedWeeklyImpressions()));
            outputStatusMessage("* * * End OutputBudgetPoint * * *");
        }
    }
    static void outputArrayOfBudgetPoint(ArrayOfBudgetPoint dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetPoint dataObject : dataObjects.getBudgetPoints())
            {
                outputBudgetPoint(dataObject);
            }
        }
    }
    static void outputCampaignEstimate(CampaignEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignEstimate * * *");
            outputStatusMessage("AdGroupEstimates:");
            outputArrayOfAdGroupEstimate(dataObject.getAdGroupEstimates());
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage("* * * End OutputCampaignEstimate * * *");
        }
    }
    static void outputArrayOfCampaignEstimate(ArrayOfCampaignEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignEstimate dataObject : dataObjects.getCampaignEstimates())
            {
                outputCampaignEstimate(dataObject);
            }
        }
    }
    static void outputCampaignEstimator(CampaignEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignEstimator * * *");
            outputStatusMessage("AdGroupEstimators:");
            outputArrayOfAdGroupEstimator(dataObject.getAdGroupEstimators());
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage("Criteria:");
            outputArrayOfCriterion(dataObject.getCriteria());
            outputStatusMessage(String.format("DailyBudget: %s", dataObject.getDailyBudget()));
            outputStatusMessage("NegativeKeywords:");
            outputArrayOfNegativeKeyword(dataObject.getNegativeKeywords());
            outputStatusMessage("* * * End OutputCampaignEstimator * * *");
        }
    }
    static void outputArrayOfCampaignEstimator(ArrayOfCampaignEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignEstimator dataObject : dataObjects.getCampaignEstimators())
            {
                outputCampaignEstimator(dataObject);
            }
        }
    }
    static void outputCategorySearchParameter(CategorySearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCategorySearchParameter * * *");
            outputStatusMessage(String.format("CategoryId: %s", dataObject.getCategoryId()));
            outputStatusMessage("* * * End OutputCategorySearchParameter * * *");
        }
    }
    static void outputArrayOfCategorySearchParameter(ArrayList<CategorySearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CategorySearchParameter dataObject : dataObjects)
            {
                outputCategorySearchParameter(dataObject);
            }
        }
    }
    static void outputCompetitionSearchParameter(CompetitionSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCompetitionSearchParameter * * *");
            outputStatusMessage("CompetitionLevels:");
            outputArrayOfCompetitionLevel(dataObject.getCompetitionLevels());
            outputStatusMessage("* * * End OutputCompetitionSearchParameter * * *");
        }
    }
    static void outputArrayOfCompetitionSearchParameter(ArrayList<CompetitionSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CompetitionSearchParameter dataObject : dataObjects)
            {
                outputCompetitionSearchParameter(dataObject);
            }
        }
    }
    static void outputCriterion(Criterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCriterion * * *");
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
            outputStatusMessage("* * * End OutputCriterion * * *");
        }
    }
    static void outputArrayOfCriterion(ArrayOfCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (Criterion dataObject : dataObjects.getCriterions())
            {
                outputCriterion(dataObject);
            }
        }
    }
    static void outputDateRangeSearchParameter(DateRangeSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDateRangeSearchParameter * * *");
            outputStatusMessage("EndDate:");
            outputDayMonthAndYear(dataObject.getEndDate());
            outputStatusMessage("StartDate:");
            outputDayMonthAndYear(dataObject.getStartDate());
            outputStatusMessage("* * * End OutputDateRangeSearchParameter * * *");
        }
    }
    static void outputArrayOfDateRangeSearchParameter(ArrayList<DateRangeSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DateRangeSearchParameter dataObject : dataObjects)
            {
                outputDateRangeSearchParameter(dataObject);
            }
        }
    }
    static void outputDayMonthAndYear(DayMonthAndYear dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDayMonthAndYear * * *");
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("Month: %s", dataObject.getMonth()));
            outputStatusMessage(String.format("Year: %s", dataObject.getYear()));
            outputStatusMessage("* * * End OutputDayMonthAndYear * * *");
        }
    }
    static void outputArrayOfDayMonthAndYear(ArrayList<DayMonthAndYear> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DayMonthAndYear dataObject : dataObjects)
            {
                outputDayMonthAndYear(dataObject);
            }
        }
    }
    static void outputDeviceCriterion(DeviceCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDeviceCriterion * * *");
            outputStatusMessage(String.format("DeviceName: %s", dataObject.getDeviceName()));
            outputStatusMessage("* * * End OutputDeviceCriterion * * *");
        }
    }
    static void outputArrayOfDeviceCriterion(ArrayList<DeviceCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DeviceCriterion dataObject : dataObjects)
            {
                outputDeviceCriterion(dataObject);
            }
        }
    }
    static void outputDeviceSearchParameter(DeviceSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDeviceSearchParameter * * *");
            outputStatusMessage("Device:");
            outputDeviceCriterion(dataObject.getDevice());
            outputStatusMessage("* * * End OutputDeviceSearchParameter * * *");
        }
    }
    static void outputArrayOfDeviceSearchParameter(ArrayList<DeviceSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DeviceSearchParameter dataObject : dataObjects)
            {
                outputDeviceSearchParameter(dataObject);
            }
        }
    }
    static void outputDomainCategory(DomainCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDomainCategory * * *");
            outputStatusMessage(String.format("Bid: %s", dataObject.getBid()));
            outputStatusMessage(String.format("CategoryName: %s", dataObject.getCategoryName()));
            outputStatusMessage(String.format("Coverage: %s", dataObject.getCoverage()));
            outputStatusMessage("* * * End OutputDomainCategory * * *");
        }
    }
    static void outputArrayOfDomainCategory(ArrayOfDomainCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (DomainCategory dataObject : dataObjects.getDomainCategories())
            {
                outputDomainCategory(dataObject);
            }
        }
    }
    static void outputEstimatedBidAndTraffic(EstimatedBidAndTraffic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEstimatedBidAndTraffic * * *");
            outputStatusMessage(String.format("MinClicksPerWeek: %s", dataObject.getMinClicksPerWeek()));
            outputStatusMessage(String.format("MaxClicksPerWeek: %s", dataObject.getMaxClicksPerWeek()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("MinImpressionsPerWeek: %s", dataObject.getMinImpressionsPerWeek()));
            outputStatusMessage(String.format("MaxImpressionsPerWeek: %s", dataObject.getMaxImpressionsPerWeek()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("MinTotalCostPerWeek: %s", dataObject.getMinTotalCostPerWeek()));
            outputStatusMessage(String.format("MaxTotalCostPerWeek: %s", dataObject.getMaxTotalCostPerWeek()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("EstimatedMinBid: %s", dataObject.getEstimatedMinBid()));
            outputStatusMessage("* * * End OutputEstimatedBidAndTraffic * * *");
        }
    }
    static void outputArrayOfEstimatedBidAndTraffic(ArrayOfEstimatedBidAndTraffic dataObjects)
    {
        if (null != dataObjects)
        {
            for (EstimatedBidAndTraffic dataObject : dataObjects.getEstimatedBidAndTraffics())
            {
                outputEstimatedBidAndTraffic(dataObject);
            }
        }
    }
    static void outputEstimatedPositionAndTraffic(EstimatedPositionAndTraffic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEstimatedPositionAndTraffic * * *");
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("MinClicksPerWeek: %s", dataObject.getMinClicksPerWeek()));
            outputStatusMessage(String.format("MaxClicksPerWeek: %s", dataObject.getMaxClicksPerWeek()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("MinImpressionsPerWeek: %s", dataObject.getMinImpressionsPerWeek()));
            outputStatusMessage(String.format("MaxImpressionsPerWeek: %s", dataObject.getMaxImpressionsPerWeek()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("MinTotalCostPerWeek: %s", dataObject.getMinTotalCostPerWeek()));
            outputStatusMessage(String.format("MaxTotalCostPerWeek: %s", dataObject.getMaxTotalCostPerWeek()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("EstimatedAdPosition: %s", dataObject.getEstimatedAdPosition()));
            outputStatusMessage("* * * End OutputEstimatedPositionAndTraffic * * *");
        }
    }
    static void outputArrayOfEstimatedPositionAndTraffic(ArrayOfEstimatedPositionAndTraffic dataObjects)
    {
        if (null != dataObjects)
        {
            for (EstimatedPositionAndTraffic dataObject : dataObjects.getEstimatedPositionAndTraffics())
            {
                outputEstimatedPositionAndTraffic(dataObject);
            }
        }
    }
    static void outputExcludeAccountKeywordsSearchParameter(ExcludeAccountKeywordsSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputExcludeAccountKeywordsSearchParameter * * *");
            outputStatusMessage(String.format("ExcludeAccountKeywords: %s", dataObject.getExcludeAccountKeywords()));
            outputStatusMessage("* * * End OutputExcludeAccountKeywordsSearchParameter * * *");
        }
    }
    static void outputArrayOfExcludeAccountKeywordsSearchParameter(ArrayList<ExcludeAccountKeywordsSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ExcludeAccountKeywordsSearchParameter dataObject : dataObjects)
            {
                outputExcludeAccountKeywordsSearchParameter(dataObject);
            }
        }
    }
    static void outputHistoricalSearchCountPeriodic(HistoricalSearchCountPeriodic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputHistoricalSearchCountPeriodic * * *");
            outputStatusMessage(String.format("SearchCount: %s", dataObject.getSearchCount()));
            outputStatusMessage("DayMonthAndYear:");
            outputDayMonthAndYear(dataObject.getDayMonthAndYear());
            outputStatusMessage("* * * End OutputHistoricalSearchCountPeriodic * * *");
        }
    }
    static void outputArrayOfHistoricalSearchCountPeriodic(ArrayOfHistoricalSearchCountPeriodic dataObjects)
    {
        if (null != dataObjects)
        {
            for (HistoricalSearchCountPeriodic dataObject : dataObjects.getHistoricalSearchCountPeriodics())
            {
                outputHistoricalSearchCountPeriodic(dataObject);
            }
        }
    }
    static void outputIdeaTextSearchParameter(IdeaTextSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputIdeaTextSearchParameter * * *");
            outputStatusMessage("Excluded:");
            outputArrayOfKeyword(dataObject.getExcluded());
            outputStatusMessage("Included:");
            outputArrayOfKeyword(dataObject.getIncluded());
            outputStatusMessage("* * * End OutputIdeaTextSearchParameter * * *");
        }
    }
    static void outputArrayOfIdeaTextSearchParameter(ArrayList<IdeaTextSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (IdeaTextSearchParameter dataObject : dataObjects)
            {
                outputIdeaTextSearchParameter(dataObject);
            }
        }
    }
    static void outputImpressionShareSearchParameter(ImpressionShareSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputImpressionShareSearchParameter * * *");
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
            outputStatusMessage("* * * End OutputImpressionShareSearchParameter * * *");
        }
    }
    static void outputArrayOfImpressionShareSearchParameter(ArrayList<ImpressionShareSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ImpressionShareSearchParameter dataObject : dataObjects)
            {
                outputImpressionShareSearchParameter(dataObject);
            }
        }
    }
    static void outputKeyword(Keyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeyword * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputKeyword * * *");
        }
    }
    static void outputArrayOfKeyword(ArrayOfKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (Keyword dataObject : dataObjects.getKeywords())
            {
                outputKeyword(dataObject);
            }
        }
    }
    static void outputKeywordAndConfidence(KeywordAndConfidence dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordAndConfidence * * *");
            outputStatusMessage(String.format("SuggestedKeyword: %s", dataObject.getSuggestedKeyword()));
            outputStatusMessage(String.format("ConfidenceScore: %s", dataObject.getConfidenceScore()));
            outputStatusMessage("* * * End OutputKeywordAndConfidence * * *");
        }
    }
    static void outputArrayOfKeywordAndConfidence(ArrayOfKeywordAndConfidence dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordAndConfidence dataObject : dataObjects.getKeywordAndConfidences())
            {
                outputKeywordAndConfidence(dataObject);
            }
        }
    }
    static void outputKeywordAndMatchType(KeywordAndMatchType dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordAndMatchType * * *");
            outputStatusMessage(String.format("KeywordText: %s", dataObject.getKeywordText()));
            outputStatusMessage("MatchTypes:");
            outputArrayOfMatchType(dataObject.getMatchTypes());
            outputStatusMessage("* * * End OutputKeywordAndMatchType * * *");
        }
    }
    static void outputArrayOfKeywordAndMatchType(ArrayOfKeywordAndMatchType dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordAndMatchType dataObject : dataObjects.getKeywordAndMatchTypes())
            {
                outputKeywordAndMatchType(dataObject);
            }
        }
    }
    static void outputKeywordBidLandscape(KeywordBidLandscape dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordBidLandscape * * *");
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputStatusMessage("StartDate:");
            outputDayMonthAndYear(dataObject.getStartDate());
            outputStatusMessage("EndDate:");
            outputDayMonthAndYear(dataObject.getEndDate());
            outputStatusMessage("BidLandscapePoints:");
            outputArrayOfBidLandscapePoint(dataObject.getBidLandscapePoints());
            outputStatusMessage("* * * End OutputKeywordBidLandscape * * *");
        }
    }
    static void outputArrayOfKeywordBidLandscape(ArrayOfKeywordBidLandscape dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordBidLandscape dataObject : dataObjects.getKeywordBidLandscapes())
            {
                outputKeywordBidLandscape(dataObject);
            }
        }
    }
    static void outputKeywordCategory(KeywordCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordCategory * * *");
            outputStatusMessage(String.format("Category: %s", dataObject.getCategory()));
            outputStatusMessage(String.format("ConfidenceScore: %s", dataObject.getConfidenceScore()));
            outputStatusMessage("* * * End OutputKeywordCategory * * *");
        }
    }
    static void outputArrayOfKeywordCategory(ArrayOfKeywordCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordCategory dataObject : dataObjects.getKeywordCategories())
            {
                outputKeywordCategory(dataObject);
            }
        }
    }
    static void outputKeywordCategoryResult(KeywordCategoryResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordCategoryResult * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("KeywordCategories:");
            outputArrayOfKeywordCategory(dataObject.getKeywordCategories());
            outputStatusMessage("* * * End OutputKeywordCategoryResult * * *");
        }
    }
    static void outputArrayOfKeywordCategoryResult(ArrayOfKeywordCategoryResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordCategoryResult dataObject : dataObjects.getKeywordCategoryResults())
            {
                outputKeywordCategoryResult(dataObject);
            }
        }
    }
    static void outputKeywordDemographic(KeywordDemographic dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordDemographic * * *");
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("EighteenToTwentyFour: %s", dataObject.getEighteenToTwentyFour()));
            outputStatusMessage(String.format("TwentyFiveToThirtyFour: %s", dataObject.getTwentyFiveToThirtyFour()));
            outputStatusMessage(String.format("ThirtyFiveToFourtyNine: %s", dataObject.getThirtyFiveToFourtyNine()));
            outputStatusMessage(String.format("FiftyToSixtyFour: %s", dataObject.getFiftyToSixtyFour()));
            outputStatusMessage(String.format("SixtyFiveAndAbove: %s", dataObject.getSixtyFiveAndAbove()));
            outputStatusMessage(String.format("AgeUnknown: %s", dataObject.getAgeUnknown()));
            outputStatusMessage(String.format("Female: %s", dataObject.getFemale()));
            outputStatusMessage(String.format("Male: %s", dataObject.getMale()));
            outputStatusMessage(String.format("GenderUnknown: %s", dataObject.getGenderUnknown()));
            outputStatusMessage("* * * End OutputKeywordDemographic * * *");
        }
    }
    static void outputArrayOfKeywordDemographic(ArrayOfKeywordDemographic dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordDemographic dataObject : dataObjects.getKeywordDemographics())
            {
                outputKeywordDemographic(dataObject);
            }
        }
    }
    static void outputKeywordDemographicResult(KeywordDemographicResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordDemographicResult * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("KeywordDemographics:");
            outputArrayOfKeywordDemographic(dataObject.getKeywordDemographics());
            outputStatusMessage("* * * End OutputKeywordDemographicResult * * *");
        }
    }
    static void outputArrayOfKeywordDemographicResult(ArrayOfKeywordDemographicResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordDemographicResult dataObject : dataObjects.getKeywordDemographicResults())
            {
                outputKeywordDemographicResult(dataObject);
            }
        }
    }
    static void outputKeywordEstimate(KeywordEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordEstimate * * *");
            outputStatusMessage("Keyword:");
            outputKeyword(dataObject.getKeyword());
            outputStatusMessage("Maximum:");
            outputTrafficEstimate(dataObject.getMaximum());
            outputStatusMessage("Minimum:");
            outputTrafficEstimate(dataObject.getMinimum());
            outputStatusMessage("* * * End OutputKeywordEstimate * * *");
        }
    }
    static void outputArrayOfKeywordEstimate(ArrayOfKeywordEstimate dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimate dataObject : dataObjects.getKeywordEstimates())
            {
                outputKeywordEstimate(dataObject);
            }
        }
    }
    static void outputKeywordEstimatedBid(KeywordEstimatedBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordEstimatedBid * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("EstimatedBids:");
            outputArrayOfEstimatedBidAndTraffic(dataObject.getEstimatedBids());
            outputStatusMessage("* * * End OutputKeywordEstimatedBid * * *");
        }
    }
    static void outputArrayOfKeywordEstimatedBid(ArrayOfKeywordEstimatedBid dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimatedBid dataObject : dataObjects.getKeywordEstimatedBids())
            {
                outputKeywordEstimatedBid(dataObject);
            }
        }
    }
    static void outputKeywordEstimatedPosition(KeywordEstimatedPosition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordEstimatedPosition * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("EstimatedPositions:");
            outputArrayOfEstimatedPositionAndTraffic(dataObject.getEstimatedPositions());
            outputStatusMessage("* * * End OutputKeywordEstimatedPosition * * *");
        }
    }
    static void outputArrayOfKeywordEstimatedPosition(ArrayOfKeywordEstimatedPosition dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimatedPosition dataObject : dataObjects.getKeywordEstimatedPositions())
            {
                outputKeywordEstimatedPosition(dataObject);
            }
        }
    }
    static void outputKeywordEstimator(KeywordEstimator dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordEstimator * * *");
            outputStatusMessage("Keyword:");
            outputKeyword(dataObject.getKeyword());
            outputStatusMessage(String.format("MaxCpc: %s", dataObject.getMaxCpc()));
            outputStatusMessage("* * * End OutputKeywordEstimator * * *");
        }
    }
    static void outputArrayOfKeywordEstimator(ArrayOfKeywordEstimator dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordEstimator dataObject : dataObjects.getKeywordEstimators())
            {
                outputKeywordEstimator(dataObject);
            }
        }
    }
    static void outputKeywordHistoricalPerformance(KeywordHistoricalPerformance dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordHistoricalPerformance * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("KeywordKPIs:");
            outputArrayOfKeywordKPI(dataObject.getKeywordKPIs());
            outputStatusMessage("* * * End OutputKeywordHistoricalPerformance * * *");
        }
    }
    static void outputArrayOfKeywordHistoricalPerformance(ArrayOfKeywordHistoricalPerformance dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordHistoricalPerformance dataObject : dataObjects.getKeywordHistoricalPerformances())
            {
                outputKeywordHistoricalPerformance(dataObject);
            }
        }
    }
    static void outputKeywordIdea(KeywordIdea dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordIdea * * *");
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", dataObject.getAdGroupName()));
            outputStatusMessage(String.format("AdImpressionShare: %s", dataObject.getAdImpressionShare()));
            outputStatusMessage(String.format("Competition: %s", dataObject.getCompetition()));
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("MonthlySearchCounts:");
            outputArrayOflong(dataObject.getMonthlySearchCounts());
            outputStatusMessage(String.format("Relevance: %s", dataObject.getRelevance()));
            outputStatusMessage(String.format("Source: %s", dataObject.getSource()));
            outputStatusMessage(String.format("SuggestedBid: %s", dataObject.getSuggestedBid()));
            outputStatusMessage("* * * End OutputKeywordIdea * * *");
        }
    }
    static void outputArrayOfKeywordIdea(ArrayOfKeywordIdea dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdea dataObject : dataObjects.getKeywordIdeas())
            {
                outputKeywordIdea(dataObject);
            }
        }
    }
    static void outputKeywordIdeaCategory(KeywordIdeaCategory dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordIdeaCategory * * *");
            outputStatusMessage(String.format("CategoryId: %s", dataObject.getCategoryId()));
            outputStatusMessage(String.format("CategoryName: %s", dataObject.getCategoryName()));
            outputStatusMessage("* * * End OutputKeywordIdeaCategory * * *");
        }
    }
    static void outputArrayOfKeywordIdeaCategory(ArrayOfKeywordIdeaCategory dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdeaCategory dataObject : dataObjects.getKeywordIdeaCategories())
            {
                outputKeywordIdeaCategory(dataObject);
            }
        }
    }
    static void outputKeywordIdEstimatedBid(KeywordIdEstimatedBid dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordIdEstimatedBid * * *");
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputStatusMessage("KeywordEstimatedBid:");
            outputKeywordEstimatedBid(dataObject.getKeywordEstimatedBid());
            outputStatusMessage("* * * End OutputKeywordIdEstimatedBid * * *");
        }
    }
    static void outputArrayOfKeywordIdEstimatedBid(ArrayOfKeywordIdEstimatedBid dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdEstimatedBid dataObject : dataObjects.getKeywordIdEstimatedBids())
            {
                outputKeywordIdEstimatedBid(dataObject);
            }
        }
    }
    static void outputKeywordIdEstimatedPosition(KeywordIdEstimatedPosition dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordIdEstimatedPosition * * *");
            outputStatusMessage(String.format("KeywordId: %s", dataObject.getKeywordId()));
            outputStatusMessage("KeywordEstimatedPosition:");
            outputKeywordEstimatedPosition(dataObject.getKeywordEstimatedPosition());
            outputStatusMessage("* * * End OutputKeywordIdEstimatedPosition * * *");
        }
    }
    static void outputArrayOfKeywordIdEstimatedPosition(ArrayOfKeywordIdEstimatedPosition dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordIdEstimatedPosition dataObject : dataObjects.getKeywordIdEstimatedPositions())
            {
                outputKeywordIdEstimatedPosition(dataObject);
            }
        }
    }
    static void outputKeywordKPI(KeywordKPI dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordKPI * * *");
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("AdPosition: %s", dataObject.getAdPosition()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("AverageCPC: %s", dataObject.getAverageCPC()));
            outputStatusMessage(String.format("CTR: %s", dataObject.getCTR()));
            outputStatusMessage(String.format("TotalCost: %s", dataObject.getTotalCost()));
            outputStatusMessage(String.format("AverageBid: %s", dataObject.getAverageBid()));
            outputStatusMessage("* * * End OutputKeywordKPI * * *");
        }
    }
    static void outputArrayOfKeywordKPI(ArrayOfKeywordKPI dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordKPI dataObject : dataObjects.getKeywordKPIs())
            {
                outputKeywordKPI(dataObject);
            }
        }
    }
    static void outputKeywordLocation(KeywordLocation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordLocation * * *");
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("Percentage: %s", dataObject.getPercentage()));
            outputStatusMessage("* * * End OutputKeywordLocation * * *");
        }
    }
    static void outputArrayOfKeywordLocation(ArrayOfKeywordLocation dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordLocation dataObject : dataObjects.getKeywordLocations())
            {
                outputKeywordLocation(dataObject);
            }
        }
    }
    static void outputKeywordLocationResult(KeywordLocationResult dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordLocationResult * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("KeywordLocations:");
            outputArrayOfKeywordLocation(dataObject.getKeywordLocations());
            outputStatusMessage("* * * End OutputKeywordLocationResult * * *");
        }
    }
    static void outputArrayOfKeywordLocationResult(ArrayOfKeywordLocationResult dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordLocationResult dataObject : dataObjects.getKeywordLocationResults())
            {
                outputKeywordLocationResult(dataObject);
            }
        }
    }
    static void outputKeywordOpportunity(KeywordOpportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordOpportunity * * *");
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
            outputStatusMessage("* * * End OutputKeywordOpportunity * * *");
        }
    }
    static void outputArrayOfKeywordOpportunity(ArrayOfKeywordOpportunity dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordOpportunity dataObject : dataObjects.getKeywordOpportunities())
            {
                outputKeywordOpportunity(dataObject);
            }
        }
    }
    static void outputKeywordSearchCount(KeywordSearchCount dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordSearchCount * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("SearchCountsByAttributes:");
            outputArrayOfSearchCountsByAttributes(dataObject.getSearchCountsByAttributes());
            outputStatusMessage("* * * End OutputKeywordSearchCount * * *");
        }
    }
    static void outputArrayOfKeywordSearchCount(ArrayOfKeywordSearchCount dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordSearchCount dataObject : dataObjects.getKeywordSearchCounts())
            {
                outputKeywordSearchCount(dataObject);
            }
        }
    }
    static void outputKeywordSuggestion(KeywordSuggestion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordSuggestion * * *");
            outputStatusMessage(String.format("Keyword: %s", dataObject.getKeyword()));
            outputStatusMessage("SuggestionsAndConfidence:");
            outputArrayOfKeywordAndConfidence(dataObject.getSuggestionsAndConfidence());
            outputStatusMessage("* * * End OutputKeywordSuggestion * * *");
        }
    }
    static void outputArrayOfKeywordSuggestion(ArrayOfKeywordSuggestion dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordSuggestion dataObject : dataObjects.getKeywordSuggestions())
            {
                outputKeywordSuggestion(dataObject);
            }
        }
    }
    static void outputLanguageCriterion(LanguageCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLanguageCriterion * * *");
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage("* * * End OutputLanguageCriterion * * *");
        }
    }
    static void outputArrayOfLanguageCriterion(ArrayOfLanguageCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (LanguageCriterion dataObject : dataObjects.getLanguageCriterions())
            {
                outputLanguageCriterion(dataObject);
            }
        }
    }
    static void outputLanguageSearchParameter(LanguageSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLanguageSearchParameter * * *");
            outputStatusMessage("Languages:");
            outputArrayOfLanguageCriterion(dataObject.getLanguages());
            outputStatusMessage("* * * End OutputLanguageSearchParameter * * *");
        }
    }
    static void outputArrayOfLanguageSearchParameter(ArrayList<LanguageSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LanguageSearchParameter dataObject : dataObjects)
            {
                outputLanguageSearchParameter(dataObject);
            }
        }
    }
    static void outputLocationCriterion(LocationCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLocationCriterion * * *");
            outputStatusMessage(String.format("LocationId: %s", dataObject.getLocationId()));
            outputStatusMessage("* * * End OutputLocationCriterion * * *");
        }
    }
    static void outputArrayOfLocationCriterion(ArrayOfLocationCriterion dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationCriterion dataObject : dataObjects.getLocationCriterions())
            {
                outputLocationCriterion(dataObject);
            }
        }
    }
    static void outputLocationSearchParameter(LocationSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputLocationSearchParameter * * *");
            outputStatusMessage("Locations:");
            outputArrayOfLocationCriterion(dataObject.getLocations());
            outputStatusMessage("* * * End OutputLocationSearchParameter * * *");
        }
    }
    static void outputArrayOfLocationSearchParameter(ArrayList<LocationSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (LocationSearchParameter dataObject : dataObjects)
            {
                outputLocationSearchParameter(dataObject);
            }
        }
    }
    static void outputNegativeKeyword(NegativeKeyword dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeKeyword * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("MatchType: %s", dataObject.getMatchType()));
            outputStatusMessage(String.format("Text: %s", dataObject.getText()));
            outputStatusMessage("* * * End OutputNegativeKeyword * * *");
        }
    }
    static void outputArrayOfNegativeKeyword(ArrayOfNegativeKeyword dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeyword dataObject : dataObjects.getNegativeKeywords())
            {
                outputNegativeKeyword(dataObject);
            }
        }
    }
    static void outputNetworkCriterion(NetworkCriterion dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNetworkCriterion * * *");
            outputStatusMessage(String.format("Network: %s", dataObject.getNetwork()));
            outputStatusMessage("* * * End OutputNetworkCriterion * * *");
        }
    }
    static void outputArrayOfNetworkCriterion(ArrayList<NetworkCriterion> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NetworkCriterion dataObject : dataObjects)
            {
                outputNetworkCriterion(dataObject);
            }
        }
    }
    static void outputNetworkSearchParameter(NetworkSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNetworkSearchParameter * * *");
            outputStatusMessage("Network:");
            outputNetworkCriterion(dataObject.getNetwork());
            outputStatusMessage("* * * End OutputNetworkSearchParameter * * *");
        }
    }
    static void outputArrayOfNetworkSearchParameter(ArrayList<NetworkSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NetworkSearchParameter dataObject : dataObjects)
            {
                outputNetworkSearchParameter(dataObject);
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOperationError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputOperationError * * *");
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
            }
        }
    }
    static void outputOpportunity(Opportunity dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOpportunity * * *");
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
            outputStatusMessage("* * * End OutputOpportunity * * *");
        }
    }
    static void outputArrayOfOpportunity(ArrayList<Opportunity> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Opportunity dataObject : dataObjects)
            {
                outputOpportunity(dataObject);
            }
        }
    }
    static void outputQuerySearchParameter(QuerySearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputQuerySearchParameter * * *");
            outputStatusMessage("Queries:");
            outputArrayOfstring(dataObject.getQueries());
            outputStatusMessage("* * * End OutputQuerySearchParameter * * *");
        }
    }
    static void outputArrayOfQuerySearchParameter(ArrayList<QuerySearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (QuerySearchParameter dataObject : dataObjects)
            {
                outputQuerySearchParameter(dataObject);
            }
        }
    }
    static void outputSearchCountsByAttributes(SearchCountsByAttributes dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchCountsByAttributes * * *");
            outputStatusMessage(String.format("Device: %s", dataObject.getDevice()));
            outputStatusMessage("HistoricalSearchCounts:");
            outputArrayOfHistoricalSearchCountPeriodic(dataObject.getHistoricalSearchCounts());
            outputStatusMessage("* * * End OutputSearchCountsByAttributes * * *");
        }
    }
    static void outputArrayOfSearchCountsByAttributes(ArrayOfSearchCountsByAttributes dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCountsByAttributes dataObject : dataObjects.getSearchCountsByAttributes())
            {
                outputSearchCountsByAttributes(dataObject);
            }
        }
    }
    static void outputSearchParameter(SearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchParameter * * *");
            if(dataObject instanceof AuctionSegmentSearchParameter)
            {
                outputAuctionSegmentSearchParameter((AuctionSegmentSearchParameter)dataObject);
            }
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
            outputStatusMessage("* * * End OutputSearchParameter * * *");
        }
    }
    static void outputArrayOfSearchParameter(ArrayOfSearchParameter dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchParameter dataObject : dataObjects.getSearchParameters())
            {
                outputSearchParameter(dataObject);
            }
        }
    }
    static void outputSearchVolumeSearchParameter(SearchVolumeSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchVolumeSearchParameter * * *");
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
            outputStatusMessage("* * * End OutputSearchVolumeSearchParameter * * *");
        }
    }
    static void outputArrayOfSearchVolumeSearchParameter(ArrayList<SearchVolumeSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchVolumeSearchParameter dataObject : dataObjects)
            {
                outputSearchVolumeSearchParameter(dataObject);
            }
        }
    }
    static void outputSuggestedBidSearchParameter(SuggestedBidSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSuggestedBidSearchParameter * * *");
            outputStatusMessage(String.format("Maximum: %s", dataObject.getMaximum()));
            outputStatusMessage(String.format("Minimum: %s", dataObject.getMinimum()));
            outputStatusMessage("* * * End OutputSuggestedBidSearchParameter * * *");
        }
    }
    static void outputArrayOfSuggestedBidSearchParameter(ArrayList<SuggestedBidSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SuggestedBidSearchParameter dataObject : dataObjects)
            {
                outputSuggestedBidSearchParameter(dataObject);
            }
        }
    }
    static void outputTrafficEstimate(TrafficEstimate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputTrafficEstimate * * *");
            outputStatusMessage(String.format("AverageCpc: %s", dataObject.getAverageCpc()));
            outputStatusMessage(String.format("AveragePosition: %s", dataObject.getAveragePosition()));
            outputStatusMessage(String.format("Clicks: %s", dataObject.getClicks()));
            outputStatusMessage(String.format("Ctr: %s", dataObject.getCtr()));
            outputStatusMessage(String.format("Impressions: %s", dataObject.getImpressions()));
            outputStatusMessage(String.format("TotalCost: %s", dataObject.getTotalCost()));
            outputStatusMessage("* * * End OutputTrafficEstimate * * *");
        }
    }
    static void outputArrayOfTrafficEstimate(ArrayList<TrafficEstimate> dataObjects)
    {
        if (null != dataObjects)
        {
            for (TrafficEstimate dataObject : dataObjects)
            {
                outputTrafficEstimate(dataObject);
            }
        }
    }
    static void outputUrlSearchParameter(UrlSearchParameter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUrlSearchParameter * * *");
            outputStatusMessage(String.format("Url: %s", dataObject.getUrl()));
            outputStatusMessage("* * * End OutputUrlSearchParameter * * *");
        }
    }
    static void outputArrayOfUrlSearchParameter(ArrayList<UrlSearchParameter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UrlSearchParameter dataObject : dataObjects)
            {
                outputUrlSearchParameter(dataObject);
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
    static void outputCurrencyCode(CurrencyCode valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CurrencyCode value : CurrencyCode.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCurrencyCode(ArrayList<CurrencyCode> valueSets)
    {
        if (null != valueSets)
        {
            for (CurrencyCode valueSet : valueSets)
            {
                outputCurrencyCode(valueSet);
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
    static void outputEntityType(EntityType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (EntityType value : EntityType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfEntityType(ArrayList<EntityType> valueSets)
    {
        if (null != valueSets)
        {
            for (EntityType valueSet : valueSets)
            {
                outputEntityType(valueSet);
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
    static void outputAuctionSegment(AuctionSegment valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AuctionSegment value : AuctionSegment.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAuctionSegment(ArrayOfAuctionSegment valueSets)
    {
        if (null != valueSets)
        {
            for (AuctionSegment valueSet : valueSets.getAuctionSegments())
            {
                outputAuctionSegment(valueSet);
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
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
}