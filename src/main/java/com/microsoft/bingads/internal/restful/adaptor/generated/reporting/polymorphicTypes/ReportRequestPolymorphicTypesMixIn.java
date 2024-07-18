package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.polymorphicTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.*;

@JsonTypeInfo(
	      use = JsonTypeInfo.Id.NAME, 
	      include = JsonTypeInfo.As.EXISTING_PROPERTY, 
		  property = "Type")
	    @JsonSubTypes({
						
			@JsonSubTypes.Type(value = AccountPerformanceReportRequest.class, name = "AccountPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = CampaignPerformanceReportRequest.class, name = "CampaignPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AdDynamicTextPerformanceReportRequest.class, name = "AdDynamicTextPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AdGroupPerformanceReportRequest.class, name = "AdGroupPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AdPerformanceReportRequest.class, name = "AdPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = KeywordPerformanceReportRequest.class, name = "KeywordPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = DestinationUrlPerformanceReportRequest.class, name = "DestinationUrlPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = BudgetSummaryReportRequest.class, name = "BudgetSummaryReportRequest"),
						
			@JsonSubTypes.Type(value = AgeGenderAudienceReportRequest.class, name = "AgeGenderAudienceReportRequest"),
						
			@JsonSubTypes.Type(value = ProfessionalDemographicsAudienceReportRequest.class, name = "ProfessionalDemographicsAudienceReportRequest"),
						
			@JsonSubTypes.Type(value = UserLocationPerformanceReportRequest.class, name = "UserLocationPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = PublisherUsagePerformanceReportRequest.class, name = "PublisherUsagePerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = SearchQueryPerformanceReportRequest.class, name = "SearchQueryPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = ConversionPerformanceReportRequest.class, name = "ConversionPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = GoalsAndFunnelsReportRequest.class, name = "GoalsAndFunnelsReportRequest"),
						
			@JsonSubTypes.Type(value = NegativeKeywordConflictReportRequest.class, name = "NegativeKeywordConflictReportRequest"),
						
			@JsonSubTypes.Type(value = SearchCampaignChangeHistoryReportRequest.class, name = "SearchCampaignChangeHistoryReportRequest"),
						
			@JsonSubTypes.Type(value = AdExtensionByAdReportRequest.class, name = "AdExtensionByAdReportRequest"),
						
			@JsonSubTypes.Type(value = AdExtensionByKeywordReportRequest.class, name = "AdExtensionByKeywordReportRequest"),
						
			@JsonSubTypes.Type(value = AudiencePerformanceReportRequest.class, name = "AudiencePerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AdExtensionDetailReportRequest.class, name = "AdExtensionDetailReportRequest"),
						
			@JsonSubTypes.Type(value = ShareOfVoiceReportRequest.class, name = "ShareOfVoiceReportRequest"),
						
			@JsonSubTypes.Type(value = ProductDimensionPerformanceReportRequest.class, name = "ProductDimensionPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = ProductPartitionPerformanceReportRequest.class, name = "ProductPartitionPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = ProductPartitionUnitPerformanceReportRequest.class, name = "ProductPartitionUnitPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = ProductSearchQueryPerformanceReportRequest.class, name = "ProductSearchQueryPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = ProductMatchCountReportRequest.class, name = "ProductMatchCountReportRequest"),
						
			@JsonSubTypes.Type(value = ProductNegativeKeywordConflictReportRequest.class, name = "ProductNegativeKeywordConflictReportRequest"),
						
			@JsonSubTypes.Type(value = CallDetailReportRequest.class, name = "CallDetailReportRequest"),
						
			@JsonSubTypes.Type(value = GeographicPerformanceReportRequest.class, name = "GeographicPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = DSASearchQueryPerformanceReportRequest.class, name = "DSASearchQueryPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = DSAAutoTargetPerformanceReportRequest.class, name = "DSAAutoTargetPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = DSACategoryPerformanceReportRequest.class, name = "DSACategoryPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = HotelDimensionPerformanceReportRequest.class, name = "HotelDimensionPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = HotelGroupPerformanceReportRequest.class, name = "HotelGroupPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AssetGroupPerformanceReportRequest.class, name = "AssetGroupPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = SearchInsightPerformanceReportRequest.class, name = "SearchInsightPerformanceReportRequest"),
						
			@JsonSubTypes.Type(value = AssetPerformanceReportRequest.class, name = "AssetPerformanceReportRequest"),
				    })
@JsonInclude(JsonInclude.Include.NON_NULL)

public interface ReportRequestPolymorphicTypesMixIn{

}