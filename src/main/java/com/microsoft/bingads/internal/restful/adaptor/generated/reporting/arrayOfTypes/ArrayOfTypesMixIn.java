package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<AccountPerformanceReportColumn> getAccountPerformanceReportColumns();

            
	@JsonValue
	List<CampaignPerformanceReportColumn> getCampaignPerformanceReportColumns();

            
	@JsonValue
	List<CampaignReportScope> getCampaignReportScopes();

            
	@JsonValue
	List<AdDynamicTextPerformanceReportColumn> getAdDynamicTextPerformanceReportColumns();

            
	@JsonValue
	List<AdGroupReportScope> getAdGroupReportScopes();

            
	@JsonValue
	List<AdGroupPerformanceReportColumn> getAdGroupPerformanceReportColumns();

            
	@JsonValue
	List<AdPerformanceReportColumn> getAdPerformanceReportColumns();

            
	@JsonValue
	List<KeywordPerformanceReportColumn> getKeywordPerformanceReportColumns();

            
	@JsonValue
	List<KeywordPerformanceReportSort> getKeywordPerformanceReportSorts();

            
	@JsonValue
	List<DestinationUrlPerformanceReportColumn> getDestinationUrlPerformanceReportColumns();

            
	@JsonValue
	List<BudgetSummaryReportColumn> getBudgetSummaryReportColumns();

            
	@JsonValue
	List<AgeGenderAudienceReportColumn> getAgeGenderAudienceReportColumns();

            
	@JsonValue
	List<ProfessionalDemographicsAudienceReportColumn> getProfessionalDemographicsAudienceReportColumns();

            
	@JsonValue
	List<UserLocationPerformanceReportColumn> getUserLocationPerformanceReportColumns();

            
	@JsonValue
	List<PublisherUsagePerformanceReportColumn> getPublisherUsagePerformanceReportColumns();

            
	@JsonValue
	List<SearchQueryPerformanceReportColumn> getSearchQueryPerformanceReportColumns();

            
	@JsonValue
	List<ConversionPerformanceReportColumn> getConversionPerformanceReportColumns();

            
	@JsonValue
	List<GoalsAndFunnelsReportColumn> getGoalsAndFunnelsReportColumns();

            
	@JsonValue
	List<NegativeKeywordConflictReportColumn> getNegativeKeywordConflictReportColumns();

            
	@JsonValue
	List<SearchCampaignChangeHistoryReportColumn> getSearchCampaignChangeHistoryReportColumns();

            
	@JsonValue
	List<AdExtensionByAdReportColumn> getAdExtensionByAdReportColumns();

            
	@JsonValue
	List<AdExtensionByKeywordReportColumn> getAdExtensionByKeywordReportColumns();

            
	@JsonValue
	List<AudiencePerformanceReportColumn> getAudiencePerformanceReportColumns();

            
	@JsonValue
	List<AdExtensionDetailReportColumn> getAdExtensionDetailReportColumns();

            
	@JsonValue
	List<ShareOfVoiceReportColumn> getShareOfVoiceReportColumns();

            
	@JsonValue
	List<ProductDimensionPerformanceReportColumn> getProductDimensionPerformanceReportColumns();

            
	@JsonValue
	List<ProductPartitionPerformanceReportColumn> getProductPartitionPerformanceReportColumns();

            
	@JsonValue
	List<ProductPartitionUnitPerformanceReportColumn> getProductPartitionUnitPerformanceReportColumns();

            
	@JsonValue
	List<ProductSearchQueryPerformanceReportColumn> getProductSearchQueryPerformanceReportColumns();

            
	@JsonValue
	List<ProductMatchCountReportColumn> getProductMatchCountReportColumns();

            
	@JsonValue
	List<ProductNegativeKeywordConflictReportColumn> getProductNegativeKeywordConflictReportColumns();

            
	@JsonValue
	List<CallDetailReportColumn> getCallDetailReportColumns();

            
	@JsonValue
	List<GeographicPerformanceReportColumn> getGeographicPerformanceReportColumns();

            
	@JsonValue
	List<DSASearchQueryPerformanceReportColumn> getDSASearchQueryPerformanceReportColumns();

            
	@JsonValue
	List<DSAAutoTargetPerformanceReportColumn> getDSAAutoTargetPerformanceReportColumns();

            
	@JsonValue
	List<DSACategoryPerformanceReportColumn> getDSACategoryPerformanceReportColumns();

            
	@JsonValue
	List<HotelDimensionPerformanceReportColumn> getHotelDimensionPerformanceReportColumns();

            
	@JsonValue
	List<HotelGroupPerformanceReportColumn> getHotelGroupPerformanceReportColumns();

            
	@JsonValue
	List<AssetGroupPerformanceReportColumn> getAssetGroupPerformanceReportColumns();

            
	@JsonValue
	List<AssetGroupReportScope> getAssetGroupReportScopes();

            
	@JsonValue
	List<SearchInsightPerformanceReportColumn> getSearchInsightPerformanceReportColumns();

            
	@JsonValue
	List<AssetPerformanceReportColumn> getAssetPerformanceReportColumns();

            
	@JsonValue
	List<CategoryInsightsReportColumn> getCategoryInsightsReportColumns();

            
	@JsonValue
	List<CategoryClickCoverageReportColumn> getCategoryClickCoverageReportColumns();

            
	@JsonValue
	List<BatchError> getBatchErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<Integer> getInts();

            
	@JsonValue
	List<String> getStrings();

            
	@JsonValue
	List<AdApiError> getAdApiErrors();

        }