package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForComplexTypesWithEnumList {
	public static void AddMixInForComplexTypesWithEnumList() {
		AdaptorUtil.mapper
				.addMixIn(AccountPerformanceReportFilter.class, AccountPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(CampaignPerformanceReportFilter.class, CampaignPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AdDynamicTextPerformanceReportFilter.class, AdDynamicTextPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AdGroupPerformanceReportFilter.class, AdGroupPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AdPerformanceReportFilter.class, AdPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(KeywordPerformanceReportFilter.class, KeywordPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(DestinationUrlPerformanceReportFilter.class, DestinationUrlPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AgeGenderAudienceReportFilter.class, AgeGenderAudienceReportFilterEnumsMixIn.class)
				.addMixIn(ProfessionalDemographicsAudienceReportFilter.class, ProfessionalDemographicsAudienceReportFilterEnumsMixIn.class)
				.addMixIn(UserLocationPerformanceReportFilter.class, UserLocationPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(PublisherUsagePerformanceReportFilter.class, PublisherUsagePerformanceReportFilterEnumsMixIn.class)
				.addMixIn(SearchQueryPerformanceReportFilter.class, SearchQueryPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(ConversionPerformanceReportFilter.class, ConversionPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(GoalsAndFunnelsReportFilter.class, GoalsAndFunnelsReportFilterEnumsMixIn.class)
				.addMixIn(NegativeKeywordConflictReportFilter.class, NegativeKeywordConflictReportFilterEnumsMixIn.class)
				.addMixIn(SearchCampaignChangeHistoryReportFilter.class, SearchCampaignChangeHistoryReportFilterEnumsMixIn.class)
				.addMixIn(AdExtensionByAdReportFilter.class, AdExtensionByAdReportFilterEnumsMixIn.class)
				.addMixIn(AdExtensionByKeywordReportFilter.class, AdExtensionByKeywordReportFilterEnumsMixIn.class)
				.addMixIn(AudiencePerformanceReportFilter.class, AudiencePerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AdExtensionDetailReportFilter.class, AdExtensionDetailReportFilterEnumsMixIn.class)
				.addMixIn(ShareOfVoiceReportFilter.class, ShareOfVoiceReportFilterEnumsMixIn.class)
				.addMixIn(ProductDimensionPerformanceReportFilter.class, ProductDimensionPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(ProductPartitionPerformanceReportFilter.class, ProductPartitionPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(ProductPartitionUnitPerformanceReportFilter.class, ProductPartitionUnitPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(ProductSearchQueryPerformanceReportFilter.class, ProductSearchQueryPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(ProductNegativeKeywordConflictReportFilter.class, ProductNegativeKeywordConflictReportFilterEnumsMixIn.class)
				.addMixIn(CallDetailReportFilter.class, CallDetailReportFilterEnumsMixIn.class)
				.addMixIn(GeographicPerformanceReportFilter.class, GeographicPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(DSASearchQueryPerformanceReportFilter.class, DSASearchQueryPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(DSAAutoTargetPerformanceReportFilter.class, DSAAutoTargetPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(DSACategoryPerformanceReportFilter.class, DSACategoryPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(HotelDimensionPerformanceReportFilter.class, HotelDimensionPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(HotelGroupPerformanceReportFilter.class, HotelGroupPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AssetGroupPerformanceReportFilter.class, AssetGroupPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(SearchInsightPerformanceReportFilter.class, SearchInsightPerformanceReportFilterEnumsMixIn.class)
				.addMixIn(AppsPerformanceReportFilter.class, AppsPerformanceReportFilterEnumsMixIn.class)
				;
	}
}