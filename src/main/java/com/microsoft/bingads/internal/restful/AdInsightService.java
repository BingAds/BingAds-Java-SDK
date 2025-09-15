package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.adinsight.*;

public class AdInsightService extends RestfulServiceClient implements IAdInsightService {

	public AdInsightService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env, IAdInsightService.class);

    }
	
	Exception processFaultDetail(ApplicationFault faultDetail, boolean shouldThrow) 
			throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		String message = getFaultMessage(faultDetail.getTrackingId());

		if (faultDetail instanceof AdApiFaultDetail) {
			AdApiFaultDetail_Exception ex = new AdApiFaultDetail_Exception(message, (AdApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (faultDetail instanceof ApiFaultDetail) {
			ApiFaultDetail_Exception ex = new ApiFaultDetail_Exception(message, (ApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (shouldThrow) {
			throw new RuntimeException("Unknown fault type: " + faultDetail.getClass());
		}

		return null;
	}

	protected <Req, Resp> Resp sendRequest(Req request, String entityEndpoint, String verb, Class<Resp> respClass)
			throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ResponseInfo<Resp, ApplicationFault> responseInfo = getResponseInfo(request, entityEndpoint, verb, respClass, ApplicationFault.class);

		if (responseInfo == null) {
			return null;
		}

		ApplicationFault faultDetail = responseInfo.getFaultDetail();

		if (faultDetail != null) {
			processFaultDetail(faultDetail, true);
		}

		return responseInfo.getResponse();
	}
	
	private Exception getFaultException(ApplicationFault faultDetail) {
		try {
			Exception ex = processFaultDetail(faultDetail, false);

			return ex;
		} catch (Exception ex) {
			throw new InternalException(ex);
		}
	}

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), handler);
	}
		
	public GetBidOpportunitiesResponse getBidOpportunities(GetBidOpportunitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBidOpportunitiesResponse response = sendRequest(request, "/BidOpportunities/Query", HttpPost, GetBidOpportunitiesResponse.class);
		
		return response;
	}

    public Response<GetBidOpportunitiesResponse> getBidOpportunitiesAsync(GetBidOpportunitiesRequest request) {
		return sendRequestAsync(request, "/BidOpportunities/Query", HttpPost, GetBidOpportunitiesResponse.class, null);
	}

	public Future<?> getBidOpportunitiesAsync(GetBidOpportunitiesRequest request, AsyncHandler<GetBidOpportunitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidOpportunities/Query", HttpPost, GetBidOpportunitiesResponse.class, asyncHandler);
	}
	
    	
	public GetBudgetOpportunitiesResponse getBudgetOpportunities(GetBudgetOpportunitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBudgetOpportunitiesResponse response = sendRequest(request, "/BudgetOpportunities/Query", HttpPost, GetBudgetOpportunitiesResponse.class);
		
		return response;
	}

    public Response<GetBudgetOpportunitiesResponse> getBudgetOpportunitiesAsync(GetBudgetOpportunitiesRequest request) {
		return sendRequestAsync(request, "/BudgetOpportunities/Query", HttpPost, GetBudgetOpportunitiesResponse.class, null);
	}

	public Future<?> getBudgetOpportunitiesAsync(GetBudgetOpportunitiesRequest request, AsyncHandler<GetBudgetOpportunitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BudgetOpportunities/Query", HttpPost, GetBudgetOpportunitiesResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordOpportunitiesResponse getKeywordOpportunities(GetKeywordOpportunitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordOpportunitiesResponse response = sendRequest(request, "/KeywordOpportunities/Query", HttpPost, GetKeywordOpportunitiesResponse.class);
		
		return response;
	}

    public Response<GetKeywordOpportunitiesResponse> getKeywordOpportunitiesAsync(GetKeywordOpportunitiesRequest request) {
		return sendRequestAsync(request, "/KeywordOpportunities/Query", HttpPost, GetKeywordOpportunitiesResponse.class, null);
	}

	public Future<?> getKeywordOpportunitiesAsync(GetKeywordOpportunitiesRequest request, AsyncHandler<GetKeywordOpportunitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordOpportunities/Query", HttpPost, GetKeywordOpportunitiesResponse.class, asyncHandler);
	}
	
    	
	public GetEstimatedBidByKeywordIdsResponse getEstimatedBidByKeywordIds(GetEstimatedBidByKeywordIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEstimatedBidByKeywordIdsResponse response = sendRequest(request, "/EstimatedBid/QueryByKeywordIds", HttpPost, GetEstimatedBidByKeywordIdsResponse.class);
		
		return response;
	}

    public Response<GetEstimatedBidByKeywordIdsResponse> getEstimatedBidByKeywordIdsAsync(GetEstimatedBidByKeywordIdsRequest request) {
		return sendRequestAsync(request, "/EstimatedBid/QueryByKeywordIds", HttpPost, GetEstimatedBidByKeywordIdsResponse.class, null);
	}

	public Future<?> getEstimatedBidByKeywordIdsAsync(GetEstimatedBidByKeywordIdsRequest request, AsyncHandler<GetEstimatedBidByKeywordIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EstimatedBid/QueryByKeywordIds", HttpPost, GetEstimatedBidByKeywordIdsResponse.class, asyncHandler);
	}
	
    	
	public GetEstimatedPositionByKeywordIdsResponse getEstimatedPositionByKeywordIds(GetEstimatedPositionByKeywordIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEstimatedPositionByKeywordIdsResponse response = sendRequest(request, "/EstimatedPosition/QueryByKeywordIds", HttpPost, GetEstimatedPositionByKeywordIdsResponse.class);
		
		return response;
	}

    public Response<GetEstimatedPositionByKeywordIdsResponse> getEstimatedPositionByKeywordIdsAsync(GetEstimatedPositionByKeywordIdsRequest request) {
		return sendRequestAsync(request, "/EstimatedPosition/QueryByKeywordIds", HttpPost, GetEstimatedPositionByKeywordIdsResponse.class, null);
	}

	public Future<?> getEstimatedPositionByKeywordIdsAsync(GetEstimatedPositionByKeywordIdsRequest request, AsyncHandler<GetEstimatedPositionByKeywordIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EstimatedPosition/QueryByKeywordIds", HttpPost, GetEstimatedPositionByKeywordIdsResponse.class, asyncHandler);
	}
	
    	
	public GetEstimatedBidByKeywordsResponse getEstimatedBidByKeywords(GetEstimatedBidByKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEstimatedBidByKeywordsResponse response = sendRequest(request, "/EstimatedBid/QueryByKeywords", HttpPost, GetEstimatedBidByKeywordsResponse.class);
		
		return response;
	}

    public Response<GetEstimatedBidByKeywordsResponse> getEstimatedBidByKeywordsAsync(GetEstimatedBidByKeywordsRequest request) {
		return sendRequestAsync(request, "/EstimatedBid/QueryByKeywords", HttpPost, GetEstimatedBidByKeywordsResponse.class, null);
	}

	public Future<?> getEstimatedBidByKeywordsAsync(GetEstimatedBidByKeywordsRequest request, AsyncHandler<GetEstimatedBidByKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EstimatedBid/QueryByKeywords", HttpPost, GetEstimatedBidByKeywordsResponse.class, asyncHandler);
	}
	
    	
	public GetEstimatedPositionByKeywordsResponse getEstimatedPositionByKeywords(GetEstimatedPositionByKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEstimatedPositionByKeywordsResponse response = sendRequest(request, "/EstimatedPosition/QueryByKeywords", HttpPost, GetEstimatedPositionByKeywordsResponse.class);
		
		return response;
	}

    public Response<GetEstimatedPositionByKeywordsResponse> getEstimatedPositionByKeywordsAsync(GetEstimatedPositionByKeywordsRequest request) {
		return sendRequestAsync(request, "/EstimatedPosition/QueryByKeywords", HttpPost, GetEstimatedPositionByKeywordsResponse.class, null);
	}

	public Future<?> getEstimatedPositionByKeywordsAsync(GetEstimatedPositionByKeywordsRequest request, AsyncHandler<GetEstimatedPositionByKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EstimatedPosition/QueryByKeywords", HttpPost, GetEstimatedPositionByKeywordsResponse.class, asyncHandler);
	}
	
    	
	public GetBidLandscapeByAdGroupIdsResponse getBidLandscapeByAdGroupIds(GetBidLandscapeByAdGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBidLandscapeByAdGroupIdsResponse response = sendRequest(request, "/BidLandscape/QueryByAdGroupIds", HttpPost, GetBidLandscapeByAdGroupIdsResponse.class);
		
		return response;
	}

    public Response<GetBidLandscapeByAdGroupIdsResponse> getBidLandscapeByAdGroupIdsAsync(GetBidLandscapeByAdGroupIdsRequest request) {
		return sendRequestAsync(request, "/BidLandscape/QueryByAdGroupIds", HttpPost, GetBidLandscapeByAdGroupIdsResponse.class, null);
	}

	public Future<?> getBidLandscapeByAdGroupIdsAsync(GetBidLandscapeByAdGroupIdsRequest request, AsyncHandler<GetBidLandscapeByAdGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidLandscape/QueryByAdGroupIds", HttpPost, GetBidLandscapeByAdGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public GetBidLandscapeByKeywordIdsResponse getBidLandscapeByKeywordIds(GetBidLandscapeByKeywordIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBidLandscapeByKeywordIdsResponse response = sendRequest(request, "/BidLandscape/QueryByKeywordIds", HttpPost, GetBidLandscapeByKeywordIdsResponse.class);
		
		return response;
	}

    public Response<GetBidLandscapeByKeywordIdsResponse> getBidLandscapeByKeywordIdsAsync(GetBidLandscapeByKeywordIdsRequest request) {
		return sendRequestAsync(request, "/BidLandscape/QueryByKeywordIds", HttpPost, GetBidLandscapeByKeywordIdsResponse.class, null);
	}

	public Future<?> getBidLandscapeByKeywordIdsAsync(GetBidLandscapeByKeywordIdsRequest request, AsyncHandler<GetBidLandscapeByKeywordIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidLandscape/QueryByKeywordIds", HttpPost, GetBidLandscapeByKeywordIdsResponse.class, asyncHandler);
	}
	
    	
	public GetHistoricalKeywordPerformanceResponse getHistoricalKeywordPerformance(GetHistoricalKeywordPerformanceRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetHistoricalKeywordPerformanceResponse response = sendRequest(request, "/HistoricalKeywordPerformance/Query", HttpPost, GetHistoricalKeywordPerformanceResponse.class);
		
		return response;
	}

    public Response<GetHistoricalKeywordPerformanceResponse> getHistoricalKeywordPerformanceAsync(GetHistoricalKeywordPerformanceRequest request) {
		return sendRequestAsync(request, "/HistoricalKeywordPerformance/Query", HttpPost, GetHistoricalKeywordPerformanceResponse.class, null);
	}

	public Future<?> getHistoricalKeywordPerformanceAsync(GetHistoricalKeywordPerformanceRequest request, AsyncHandler<GetHistoricalKeywordPerformanceResponse> asyncHandler) {
		return sendRequestAsync(request, "/HistoricalKeywordPerformance/Query", HttpPost, GetHistoricalKeywordPerformanceResponse.class, asyncHandler);
	}
	
    	
	public GetHistoricalSearchCountResponse getHistoricalSearchCount(GetHistoricalSearchCountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetHistoricalSearchCountResponse response = sendRequest(request, "/HistoricalSearchCount/Query", HttpPost, GetHistoricalSearchCountResponse.class);
		
		return response;
	}

    public Response<GetHistoricalSearchCountResponse> getHistoricalSearchCountAsync(GetHistoricalSearchCountRequest request) {
		return sendRequestAsync(request, "/HistoricalSearchCount/Query", HttpPost, GetHistoricalSearchCountResponse.class, null);
	}

	public Future<?> getHistoricalSearchCountAsync(GetHistoricalSearchCountRequest request, AsyncHandler<GetHistoricalSearchCountResponse> asyncHandler) {
		return sendRequestAsync(request, "/HistoricalSearchCount/Query", HttpPost, GetHistoricalSearchCountResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordCategoriesResponse getKeywordCategories(GetKeywordCategoriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordCategoriesResponse response = sendRequest(request, "/KeywordCategories/Query", HttpPost, GetKeywordCategoriesResponse.class);
		
		return response;
	}

    public Response<GetKeywordCategoriesResponse> getKeywordCategoriesAsync(GetKeywordCategoriesRequest request) {
		return sendRequestAsync(request, "/KeywordCategories/Query", HttpPost, GetKeywordCategoriesResponse.class, null);
	}

	public Future<?> getKeywordCategoriesAsync(GetKeywordCategoriesRequest request, AsyncHandler<GetKeywordCategoriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordCategories/Query", HttpPost, GetKeywordCategoriesResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordDemographicsResponse getKeywordDemographics(GetKeywordDemographicsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordDemographicsResponse response = sendRequest(request, "/KeywordDemographics/Query", HttpPost, GetKeywordDemographicsResponse.class);
		
		return response;
	}

    public Response<GetKeywordDemographicsResponse> getKeywordDemographicsAsync(GetKeywordDemographicsRequest request) {
		return sendRequestAsync(request, "/KeywordDemographics/Query", HttpPost, GetKeywordDemographicsResponse.class, null);
	}

	public Future<?> getKeywordDemographicsAsync(GetKeywordDemographicsRequest request, AsyncHandler<GetKeywordDemographicsResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordDemographics/Query", HttpPost, GetKeywordDemographicsResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordLocationsResponse getKeywordLocations(GetKeywordLocationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordLocationsResponse response = sendRequest(request, "/KeywordLocations/Query", HttpPost, GetKeywordLocationsResponse.class);
		
		return response;
	}

    public Response<GetKeywordLocationsResponse> getKeywordLocationsAsync(GetKeywordLocationsRequest request) {
		return sendRequestAsync(request, "/KeywordLocations/Query", HttpPost, GetKeywordLocationsResponse.class, null);
	}

	public Future<?> getKeywordLocationsAsync(GetKeywordLocationsRequest request, AsyncHandler<GetKeywordLocationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordLocations/Query", HttpPost, GetKeywordLocationsResponse.class, asyncHandler);
	}
	
    	
	public SuggestKeywordsForUrlResponse suggestKeywordsForUrl(SuggestKeywordsForUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SuggestKeywordsForUrlResponse response = sendRequest(request, "/KeywordSuggestions/QueryByUrl", HttpPost, SuggestKeywordsForUrlResponse.class);
		
		return response;
	}

    public Response<SuggestKeywordsForUrlResponse> suggestKeywordsForUrlAsync(SuggestKeywordsForUrlRequest request) {
		return sendRequestAsync(request, "/KeywordSuggestions/QueryByUrl", HttpPost, SuggestKeywordsForUrlResponse.class, null);
	}

	public Future<?> suggestKeywordsForUrlAsync(SuggestKeywordsForUrlRequest request, AsyncHandler<SuggestKeywordsForUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordSuggestions/QueryByUrl", HttpPost, SuggestKeywordsForUrlResponse.class, asyncHandler);
	}
	
    	
	public SuggestKeywordsFromExistingKeywordsResponse suggestKeywordsFromExistingKeywords(SuggestKeywordsFromExistingKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SuggestKeywordsFromExistingKeywordsResponse response = sendRequest(request, "/KeywordSuggestions/QueryByKeywords", HttpPost, SuggestKeywordsFromExistingKeywordsResponse.class);
		
		return response;
	}

    public Response<SuggestKeywordsFromExistingKeywordsResponse> suggestKeywordsFromExistingKeywordsAsync(SuggestKeywordsFromExistingKeywordsRequest request) {
		return sendRequestAsync(request, "/KeywordSuggestions/QueryByKeywords", HttpPost, SuggestKeywordsFromExistingKeywordsResponse.class, null);
	}

	public Future<?> suggestKeywordsFromExistingKeywordsAsync(SuggestKeywordsFromExistingKeywordsRequest request, AsyncHandler<SuggestKeywordsFromExistingKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordSuggestions/QueryByKeywords", HttpPost, SuggestKeywordsFromExistingKeywordsResponse.class, asyncHandler);
	}
	
    	
	public GetAuctionInsightDataResponse getAuctionInsightData(GetAuctionInsightDataRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAuctionInsightDataResponse response = sendRequest(request, "/AuctionInsightData/Query", HttpPost, GetAuctionInsightDataResponse.class);
		
		return response;
	}

    public Response<GetAuctionInsightDataResponse> getAuctionInsightDataAsync(GetAuctionInsightDataRequest request) {
		return sendRequestAsync(request, "/AuctionInsightData/Query", HttpPost, GetAuctionInsightDataResponse.class, null);
	}

	public Future<?> getAuctionInsightDataAsync(GetAuctionInsightDataRequest request, AsyncHandler<GetAuctionInsightDataResponse> asyncHandler) {
		return sendRequestAsync(request, "/AuctionInsightData/Query", HttpPost, GetAuctionInsightDataResponse.class, asyncHandler);
	}
	
    	
	public GetDomainCategoriesResponse getDomainCategories(GetDomainCategoriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDomainCategoriesResponse response = sendRequest(request, "/DomainCategories/Query", HttpPost, GetDomainCategoriesResponse.class);
		
		return response;
	}

    public Response<GetDomainCategoriesResponse> getDomainCategoriesAsync(GetDomainCategoriesRequest request) {
		return sendRequestAsync(request, "/DomainCategories/Query", HttpPost, GetDomainCategoriesResponse.class, null);
	}

	public Future<?> getDomainCategoriesAsync(GetDomainCategoriesRequest request, AsyncHandler<GetDomainCategoriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/DomainCategories/Query", HttpPost, GetDomainCategoriesResponse.class, asyncHandler);
	}
	
    	
	public PutMetricDataResponse putMetricData(PutMetricDataRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		PutMetricDataResponse response = sendRequest(request, "/MetricData/Put", HttpPost, PutMetricDataResponse.class);
		
		return response;
	}

    public Response<PutMetricDataResponse> putMetricDataAsync(PutMetricDataRequest request) {
		return sendRequestAsync(request, "/MetricData/Put", HttpPost, PutMetricDataResponse.class, null);
	}

	public Future<?> putMetricDataAsync(PutMetricDataRequest request, AsyncHandler<PutMetricDataResponse> asyncHandler) {
		return sendRequestAsync(request, "/MetricData/Put", HttpPost, PutMetricDataResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordIdeaCategoriesResponse getKeywordIdeaCategories(GetKeywordIdeaCategoriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordIdeaCategoriesResponse response = sendRequest(request, "/KeywordIdeaCategories/Query", HttpPost, GetKeywordIdeaCategoriesResponse.class);
		
		return response;
	}

    public Response<GetKeywordIdeaCategoriesResponse> getKeywordIdeaCategoriesAsync(GetKeywordIdeaCategoriesRequest request) {
		return sendRequestAsync(request, "/KeywordIdeaCategories/Query", HttpPost, GetKeywordIdeaCategoriesResponse.class, null);
	}

	public Future<?> getKeywordIdeaCategoriesAsync(GetKeywordIdeaCategoriesRequest request, AsyncHandler<GetKeywordIdeaCategoriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordIdeaCategories/Query", HttpPost, GetKeywordIdeaCategoriesResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordIdeasResponse getKeywordIdeas(GetKeywordIdeasRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordIdeasResponse response = sendRequest(request, "/KeywordIdeas/Query", HttpPost, GetKeywordIdeasResponse.class);
		
		return response;
	}

    public Response<GetKeywordIdeasResponse> getKeywordIdeasAsync(GetKeywordIdeasRequest request) {
		return sendRequestAsync(request, "/KeywordIdeas/Query", HttpPost, GetKeywordIdeasResponse.class, null);
	}

	public Future<?> getKeywordIdeasAsync(GetKeywordIdeasRequest request, AsyncHandler<GetKeywordIdeasResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordIdeas/Query", HttpPost, GetKeywordIdeasResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordTrafficEstimatesResponse getKeywordTrafficEstimates(GetKeywordTrafficEstimatesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordTrafficEstimatesResponse response = sendRequest(request, "/KeywordTrafficEstimates/Query", HttpPost, GetKeywordTrafficEstimatesResponse.class);
		
		return response;
	}

    public Response<GetKeywordTrafficEstimatesResponse> getKeywordTrafficEstimatesAsync(GetKeywordTrafficEstimatesRequest request) {
		return sendRequestAsync(request, "/KeywordTrafficEstimates/Query", HttpPost, GetKeywordTrafficEstimatesResponse.class, null);
	}

	public Future<?> getKeywordTrafficEstimatesAsync(GetKeywordTrafficEstimatesRequest request, AsyncHandler<GetKeywordTrafficEstimatesResponse> asyncHandler) {
		return sendRequestAsync(request, "/KeywordTrafficEstimates/Query", HttpPost, GetKeywordTrafficEstimatesResponse.class, asyncHandler);
	}
	
    	
	public GetAutoApplyOptInStatusResponse getAutoApplyOptInStatus(GetAutoApplyOptInStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAutoApplyOptInStatusResponse response = sendRequest(request, "/AutoApplyOptInStatus/Query", HttpPost, GetAutoApplyOptInStatusResponse.class);
		
		return response;
	}

    public Response<GetAutoApplyOptInStatusResponse> getAutoApplyOptInStatusAsync(GetAutoApplyOptInStatusRequest request) {
		return sendRequestAsync(request, "/AutoApplyOptInStatus/Query", HttpPost, GetAutoApplyOptInStatusResponse.class, null);
	}

	public Future<?> getAutoApplyOptInStatusAsync(GetAutoApplyOptInStatusRequest request, AsyncHandler<GetAutoApplyOptInStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/AutoApplyOptInStatus/Query", HttpPost, GetAutoApplyOptInStatusResponse.class, asyncHandler);
	}
	
    	
	public SetAutoApplyOptInStatusResponse setAutoApplyOptInStatus(SetAutoApplyOptInStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetAutoApplyOptInStatusResponse response = sendRequest(request, "/AutoApplyOptInStatus/Set", HttpPost, SetAutoApplyOptInStatusResponse.class);
		
		return response;
	}

    public Response<SetAutoApplyOptInStatusResponse> setAutoApplyOptInStatusAsync(SetAutoApplyOptInStatusRequest request) {
		return sendRequestAsync(request, "/AutoApplyOptInStatus/Set", HttpPost, SetAutoApplyOptInStatusResponse.class, null);
	}

	public Future<?> setAutoApplyOptInStatusAsync(SetAutoApplyOptInStatusRequest request, AsyncHandler<SetAutoApplyOptInStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/AutoApplyOptInStatus/Set", HttpPost, SetAutoApplyOptInStatusResponse.class, asyncHandler);
	}
	
    	
	public GetPerformanceInsightsDetailDataByAccountIdResponse getPerformanceInsightsDetailDataByAccountId(GetPerformanceInsightsDetailDataByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetPerformanceInsightsDetailDataByAccountIdResponse response = sendRequest(request, "/PerformanceInsightsDetailData/QueryByAccountId", HttpPost, GetPerformanceInsightsDetailDataByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetPerformanceInsightsDetailDataByAccountIdResponse> getPerformanceInsightsDetailDataByAccountIdAsync(GetPerformanceInsightsDetailDataByAccountIdRequest request) {
		return sendRequestAsync(request, "/PerformanceInsightsDetailData/QueryByAccountId", HttpPost, GetPerformanceInsightsDetailDataByAccountIdResponse.class, null);
	}

	public Future<?> getPerformanceInsightsDetailDataByAccountIdAsync(GetPerformanceInsightsDetailDataByAccountIdRequest request, AsyncHandler<GetPerformanceInsightsDetailDataByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/PerformanceInsightsDetailData/QueryByAccountId", HttpPost, GetPerformanceInsightsDetailDataByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetRecommendationsResponse getRecommendations(GetRecommendationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetRecommendationsResponse response = sendRequest(request, "/Recommendations/Query", HttpPost, GetRecommendationsResponse.class);
		
		return response;
	}

    public Response<GetRecommendationsResponse> getRecommendationsAsync(GetRecommendationsRequest request) {
		return sendRequestAsync(request, "/Recommendations/Query", HttpPost, GetRecommendationsResponse.class, null);
	}

	public Future<?> getRecommendationsAsync(GetRecommendationsRequest request, AsyncHandler<GetRecommendationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Recommendations/Query", HttpPost, GetRecommendationsResponse.class, asyncHandler);
	}
	
    	
	public TagRecommendationsResponse tagRecommendations(TagRecommendationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		TagRecommendationsResponse response = sendRequest(request, "/Recommendations/Tag", HttpPost, TagRecommendationsResponse.class);
		
		return response;
	}

    public Response<TagRecommendationsResponse> tagRecommendationsAsync(TagRecommendationsRequest request) {
		return sendRequestAsync(request, "/Recommendations/Tag", HttpPost, TagRecommendationsResponse.class, null);
	}

	public Future<?> tagRecommendationsAsync(TagRecommendationsRequest request, AsyncHandler<TagRecommendationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Recommendations/Tag", HttpPost, TagRecommendationsResponse.class, asyncHandler);
	}
	
    	
	public GetTextAssetSuggestionsByFinalUrlsResponse getTextAssetSuggestionsByFinalUrls(GetTextAssetSuggestionsByFinalUrlsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetTextAssetSuggestionsByFinalUrlsResponse response = sendRequest(request, "/TextAssetSuggestions/QueryByFinalUrls", HttpPost, GetTextAssetSuggestionsByFinalUrlsResponse.class);
		
		return response;
	}

    public Response<GetTextAssetSuggestionsByFinalUrlsResponse> getTextAssetSuggestionsByFinalUrlsAsync(GetTextAssetSuggestionsByFinalUrlsRequest request) {
		return sendRequestAsync(request, "/TextAssetSuggestions/QueryByFinalUrls", HttpPost, GetTextAssetSuggestionsByFinalUrlsResponse.class, null);
	}

	public Future<?> getTextAssetSuggestionsByFinalUrlsAsync(GetTextAssetSuggestionsByFinalUrlsRequest request, AsyncHandler<GetTextAssetSuggestionsByFinalUrlsResponse> asyncHandler) {
		return sendRequestAsync(request, "/TextAssetSuggestions/QueryByFinalUrls", HttpPost, GetTextAssetSuggestionsByFinalUrlsResponse.class, asyncHandler);
	}
	
    	
	public ApplyRecommendationsResponse applyRecommendations(ApplyRecommendationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyRecommendationsResponse response = sendRequest(request, "/Recommendations/Apply", HttpPost, ApplyRecommendationsResponse.class);
		
		return response;
	}

    public Response<ApplyRecommendationsResponse> applyRecommendationsAsync(ApplyRecommendationsRequest request) {
		return sendRequestAsync(request, "/Recommendations/Apply", HttpPost, ApplyRecommendationsResponse.class, null);
	}

	public Future<?> applyRecommendationsAsync(ApplyRecommendationsRequest request, AsyncHandler<ApplyRecommendationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Recommendations/Apply", HttpPost, ApplyRecommendationsResponse.class, asyncHandler);
	}
	
    	
	public DismissRecommendationsResponse dismissRecommendations(DismissRecommendationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DismissRecommendationsResponse response = sendRequest(request, "/Recommendations/Dismiss", HttpPost, DismissRecommendationsResponse.class);
		
		return response;
	}

    public Response<DismissRecommendationsResponse> dismissRecommendationsAsync(DismissRecommendationsRequest request) {
		return sendRequestAsync(request, "/Recommendations/Dismiss", HttpPost, DismissRecommendationsResponse.class, null);
	}

	public Future<?> dismissRecommendationsAsync(DismissRecommendationsRequest request, AsyncHandler<DismissRecommendationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Recommendations/Dismiss", HttpPost, DismissRecommendationsResponse.class, asyncHandler);
	}
	
    	
	public RetrieveRecommendationsResponse retrieveRecommendations(RetrieveRecommendationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		RetrieveRecommendationsResponse response = sendRequest(request, "/Recommendations/Retrieve", HttpPost, RetrieveRecommendationsResponse.class);
		
		return response;
	}

    public Response<RetrieveRecommendationsResponse> retrieveRecommendationsAsync(RetrieveRecommendationsRequest request) {
		return sendRequestAsync(request, "/Recommendations/Retrieve", HttpPost, RetrieveRecommendationsResponse.class, null);
	}

	public Future<?> retrieveRecommendationsAsync(RetrieveRecommendationsRequest request, AsyncHandler<RetrieveRecommendationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Recommendations/Retrieve", HttpPost, RetrieveRecommendationsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceFullEstimationResponse getAudienceFullEstimation(GetAudienceFullEstimationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceFullEstimationResponse response = sendRequest(request, "/AudienceFullEstimation/Query", HttpPost, GetAudienceFullEstimationResponse.class);
		
		return response;
	}

    public Response<GetAudienceFullEstimationResponse> getAudienceFullEstimationAsync(GetAudienceFullEstimationRequest request) {
		return sendRequestAsync(request, "/AudienceFullEstimation/Query", HttpPost, GetAudienceFullEstimationResponse.class, null);
	}

	public Future<?> getAudienceFullEstimationAsync(GetAudienceFullEstimationRequest request, AsyncHandler<GetAudienceFullEstimationResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceFullEstimation/Query", HttpPost, GetAudienceFullEstimationResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceBreakdownResponse getAudienceBreakdown(GetAudienceBreakdownRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceBreakdownResponse response = sendRequest(request, "/AudienceBreakdown/Query", HttpPost, GetAudienceBreakdownResponse.class);
		
		return response;
	}

    public Response<GetAudienceBreakdownResponse> getAudienceBreakdownAsync(GetAudienceBreakdownRequest request) {
		return sendRequestAsync(request, "/AudienceBreakdown/Query", HttpPost, GetAudienceBreakdownResponse.class, null);
	}

	public Future<?> getAudienceBreakdownAsync(GetAudienceBreakdownRequest request, AsyncHandler<GetAudienceBreakdownResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceBreakdown/Query", HttpPost, GetAudienceBreakdownResponse.class, asyncHandler);
	}
	
    }