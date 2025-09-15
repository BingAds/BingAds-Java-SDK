package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.adinsight.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<BidOpportunity> getBidOpportunities();

            
	@JsonValue
	List<BatchError> getBatchErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<BudgetOpportunity> getBudgetOpportunities();

            
	@JsonValue
	List<BudgetPoint> getBudgetPoints();

            
	@JsonValue
	List<KeywordOpportunity> getKeywordOpportunities();

            
	@JsonValue
	List<BroadMatchSearchQueryKPI> getBroadMatchSearchQueryKPIs();

            
	@JsonValue
	List<KeywordIdEstimatedBid> getKeywordIdEstimatedBids();

            
	@JsonValue
	List<EstimatedBidAndTraffic> getEstimatedBidAndTraffics();

            
	@JsonValue
	List<KeywordIdEstimatedPosition> getKeywordIdEstimatedPositions();

            
	@JsonValue
	List<EstimatedPositionAndTraffic> getEstimatedPositionAndTraffics();

            
	@JsonValue
	List<KeywordAndMatchType> getKeywordAndMatchTypes();

            
	@JsonValue
	List<MatchType> getMatchTypes();

            
	@JsonValue
	List<KeywordEstimatedBid> getKeywordEstimatedBids();

            
	@JsonValue
	List<KeywordEstimatedPosition> getKeywordEstimatedPositions();

            
	@JsonValue
	List<AdGroupBidLandscapeInput> getAdGroupBidLandscapeInputs();

            
	@JsonValue
	List<AdGroupBidLandscape> getAdGroupBidLandscapes();

            
	@JsonValue
	List<BidLandscapePoint> getBidLandscapePoints();

            
	@JsonValue
	List<KeywordBidLandscape> getKeywordBidLandscapes();

            
	@JsonValue
	List<KeywordHistoricalPerformance> getKeywordHistoricalPerformances();

            
	@JsonValue
	List<KeywordKPI> getKeywordKPIs();

            
	@JsonValue
	List<KeywordSearchCount> getKeywordSearchCounts();

            
	@JsonValue
	List<SearchCountsByAttributes> getSearchCountsByAttributes();

            
	@JsonValue
	List<HistoricalSearchCountPeriodic> getHistoricalSearchCountPeriodics();

            
	@JsonValue
	List<KeywordCategoryResult> getKeywordCategoryResults();

            
	@JsonValue
	List<KeywordCategory> getKeywordCategories();

            
	@JsonValue
	List<KeywordDemographicResult> getKeywordDemographicResults();

            
	@JsonValue
	List<KeywordDemographic> getKeywordDemographics();

            
	@JsonValue
	List<KeywordLocationResult> getKeywordLocationResults();

            
	@JsonValue
	List<KeywordLocation> getKeywordLocations();

            
	@JsonValue
	List<KeywordAndConfidence> getKeywordAndConfidences();

            
	@JsonValue
	List<KeywordSuggestion> getKeywordSuggestions();

            
	@JsonValue
	List<SearchParameter> getSearchParameters();

            
	@JsonValue
	List<Keyword> getKeywords();

            
	@JsonValue
	List<LocationCriterion> getLocationCriterions();

            
	@JsonValue
	List<LanguageCriterion> getLanguageCriterions();

            
	@JsonValue
	List<CompetitionLevel> getCompetitionLevels();

            
	@JsonValue
	List<AuctionSegment> getAuctionSegments();

            
	@JsonValue
	List<AuctionInsightEntry> getAuctionInsightEntries();

            
	@JsonValue
	List<AuctionInsightKpi> getAuctionInsightKpis();

            
	@JsonValue
	List<DomainCategory> getDomainCategories();

            
	@JsonValue
	List<MetricData> getMetricDatas();

            
	@JsonValue
	List<KeywordIdeaCategory> getKeywordIdeaCategories();

            
	@JsonValue
	List<KeywordIdeaAttribute> getKeywordIdeaAttributes();

            
	@JsonValue
	List<KeywordIdea> getKeywordIdeas();

            
	@JsonValue
	List<CampaignEstimator> getCampaignEstimators();

            
	@JsonValue
	List<AdGroupEstimator> getAdGroupEstimators();

            
	@JsonValue
	List<KeywordEstimator> getKeywordEstimators();

            
	@JsonValue
	List<Criterion> getCriterions();

            
	@JsonValue
	List<NegativeKeyword> getNegativeKeywords();

            
	@JsonValue
	List<CampaignEstimate> getCampaignEstimates();

            
	@JsonValue
	List<AdGroupEstimate> getAdGroupEstimates();

            
	@JsonValue
	List<KeywordEstimate> getKeywordEstimates();

            
	@JsonValue
	List<AutoApplyRecommendationsInfo> getAutoApplyRecommendationsInfos();

            
	@JsonValue
	List<PerformanceInsightsDetail> getPerformanceInsightsDetails();

            
	@JsonValue
	List<PerformanceInsightsMessageParameter> getPerformanceInsightsMessageParameters();

            
	@JsonValue
	List<EntityDetail> getEntityDetails();

            
	@JsonValue
	List<PerformanceInsightsMessage> getPerformanceInsightsMessages();

            
	@JsonValue
	List<Recommendation> getRecommendations();

            
	@JsonValue
	List<RecommendationInfo> getRecommendationInfos();

            
	@JsonValue
	List<TextAssetSuggestions> getTextAssetSuggestions();

            
	@JsonValue
	List<ApplyRecommendationEntity> getApplyRecommendationEntities();

            
	@JsonValue
	List<DismissRecommendationEntity> getDismissRecommendationEntities();

            
	@JsonValue
	List<RecommendationBase> getRecommendationBases();

            
	@JsonValue
	List<AgeEnum> getAgeEna();

            
	@JsonValue
	List<GenderEnum> getGenderEna();

            
	@JsonValue
	List<RadiusTarget> getRadiusTargets();

            
	@JsonValue
	List<DecimalRoundedRangeResultByType> getDecimalRoundedRangeResultByTypes();

            
	@JsonValue
	List<RangeResultByTypeOfdouble> getRangeResultByTypeOfdoubles();

            
	@JsonValue
	List<DecimalRoundedByType> getDecimalRoundedByTypes();

            
	@JsonValue
	List<LocationInfo> getLocationInfos();

            
	@JsonValue
	List<AdApiError> getAdApiErrors();

            
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<String> getStrings();

            
	@JsonValue
	List<Integer> getInts();

        }