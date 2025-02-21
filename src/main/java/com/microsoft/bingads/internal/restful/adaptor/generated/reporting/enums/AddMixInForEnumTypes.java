package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(ReportFormat.class, ReportFormatMixIn.class)
				.addMixIn(ReportAggregation.class, ReportAggregationMixIn.class)
				.addMixIn(AccountPerformanceReportColumn.class, AccountPerformanceReportColumnMixIn.class)
				.addMixIn(AccountStatusReportFilter.class, AccountStatusReportFilterMixIn.class)
				.addMixIn(AdDistributionReportFilter.class, AdDistributionReportFilterMixIn.class)
				.addMixIn(DeviceOSReportFilter.class, DeviceOSReportFilterMixIn.class)
				.addMixIn(DeviceTypeReportFilter.class, DeviceTypeReportFilterMixIn.class)
				.addMixIn(ReportTimePeriod.class, ReportTimePeriodMixIn.class)
				.addMixIn(ReportTimeZone.class, ReportTimeZoneMixIn.class)
				.addMixIn(CampaignPerformanceReportColumn.class, CampaignPerformanceReportColumnMixIn.class)
				.addMixIn(CampaignStatusReportFilter.class, CampaignStatusReportFilterMixIn.class)
				.addMixIn(AdDynamicTextPerformanceReportColumn.class, AdDynamicTextPerformanceReportColumnMixIn.class)
				.addMixIn(AdGroupStatusReportFilter.class, AdGroupStatusReportFilterMixIn.class)
				.addMixIn(AdStatusReportFilter.class, AdStatusReportFilterMixIn.class)
				.addMixIn(AdTypeReportFilter.class, AdTypeReportFilterMixIn.class)
				.addMixIn(KeywordStatusReportFilter.class, KeywordStatusReportFilterMixIn.class)
				.addMixIn(LanguageReportFilter.class, LanguageReportFilterMixIn.class)
				.addMixIn(AdGroupPerformanceReportColumn.class, AdGroupPerformanceReportColumnMixIn.class)
				.addMixIn(AdPerformanceReportColumn.class, AdPerformanceReportColumnMixIn.class)
				.addMixIn(KeywordPerformanceReportColumn.class, KeywordPerformanceReportColumnMixIn.class)
				.addMixIn(BidMatchTypeReportFilter.class, BidMatchTypeReportFilterMixIn.class)
				.addMixIn(BidStrategyTypeReportFilter.class, BidStrategyTypeReportFilterMixIn.class)
				.addMixIn(DeliveredMatchTypeReportFilter.class, DeliveredMatchTypeReportFilterMixIn.class)
				.addMixIn(SortOrder.class, SortOrderMixIn.class)
				.addMixIn(DestinationUrlPerformanceReportColumn.class, DestinationUrlPerformanceReportColumnMixIn.class)
				.addMixIn(BudgetSummaryReportColumn.class, BudgetSummaryReportColumnMixIn.class)
				.addMixIn(AgeGenderAudienceReportColumn.class, AgeGenderAudienceReportColumnMixIn.class)
				.addMixIn(ProfessionalDemographicsAudienceReportColumn.class, ProfessionalDemographicsAudienceReportColumnMixIn.class)
				.addMixIn(UserLocationPerformanceReportColumn.class, UserLocationPerformanceReportColumnMixIn.class)
				.addMixIn(PublisherUsagePerformanceReportColumn.class, PublisherUsagePerformanceReportColumnMixIn.class)
				.addMixIn(AssetGroupStatusReportFilter.class, AssetGroupStatusReportFilterMixIn.class)
				.addMixIn(SearchQueryPerformanceReportColumn.class, SearchQueryPerformanceReportColumnMixIn.class)
				.addMixIn(ConversionPerformanceReportColumn.class, ConversionPerformanceReportColumnMixIn.class)
				.addMixIn(GoalsAndFunnelsReportColumn.class, GoalsAndFunnelsReportColumnMixIn.class)
				.addMixIn(NegativeKeywordConflictReportColumn.class, NegativeKeywordConflictReportColumnMixIn.class)
				.addMixIn(SearchCampaignChangeHistoryReportColumn.class, SearchCampaignChangeHistoryReportColumnMixIn.class)
				.addMixIn(ChangeTypeReportFilter.class, ChangeTypeReportFilterMixIn.class)
				.addMixIn(ChangeEntityReportFilter.class, ChangeEntityReportFilterMixIn.class)
				.addMixIn(AdExtensionByAdReportColumn.class, AdExtensionByAdReportColumnMixIn.class)
				.addMixIn(AdExtensionByKeywordReportColumn.class, AdExtensionByKeywordReportColumnMixIn.class)
				.addMixIn(AudiencePerformanceReportColumn.class, AudiencePerformanceReportColumnMixIn.class)
				.addMixIn(AdExtensionDetailReportColumn.class, AdExtensionDetailReportColumnMixIn.class)
				.addMixIn(ShareOfVoiceReportColumn.class, ShareOfVoiceReportColumnMixIn.class)
				.addMixIn(ProductDimensionPerformanceReportColumn.class, ProductDimensionPerformanceReportColumnMixIn.class)
				.addMixIn(ProductPartitionPerformanceReportColumn.class, ProductPartitionPerformanceReportColumnMixIn.class)
				.addMixIn(CampaignTypeReportFilter.class, CampaignTypeReportFilterMixIn.class)
				.addMixIn(ProductPartitionUnitPerformanceReportColumn.class, ProductPartitionUnitPerformanceReportColumnMixIn.class)
				.addMixIn(ProductSearchQueryPerformanceReportColumn.class, ProductSearchQueryPerformanceReportColumnMixIn.class)
				.addMixIn(ProductMatchCountReportColumn.class, ProductMatchCountReportColumnMixIn.class)
				.addMixIn(ProductNegativeKeywordConflictReportColumn.class, ProductNegativeKeywordConflictReportColumnMixIn.class)
				.addMixIn(CallDetailReportColumn.class, CallDetailReportColumnMixIn.class)
				.addMixIn(GeographicPerformanceReportColumn.class, GeographicPerformanceReportColumnMixIn.class)
				.addMixIn(DSASearchQueryPerformanceReportColumn.class, DSASearchQueryPerformanceReportColumnMixIn.class)
				.addMixIn(DSAAutoTargetPerformanceReportColumn.class, DSAAutoTargetPerformanceReportColumnMixIn.class)
				.addMixIn(DynamicAdTargetStatusReportFilter.class, DynamicAdTargetStatusReportFilterMixIn.class)
				.addMixIn(DSACategoryPerformanceReportColumn.class, DSACategoryPerformanceReportColumnMixIn.class)
				.addMixIn(HotelDimensionPerformanceReportColumn.class, HotelDimensionPerformanceReportColumnMixIn.class)
				.addMixIn(HotelGroupPerformanceReportColumn.class, HotelGroupPerformanceReportColumnMixIn.class)
				.addMixIn(AssetGroupPerformanceReportColumn.class, AssetGroupPerformanceReportColumnMixIn.class)
				.addMixIn(SearchInsightPerformanceReportColumn.class, SearchInsightPerformanceReportColumnMixIn.class)
				.addMixIn(AssetPerformanceReportColumn.class, AssetPerformanceReportColumnMixIn.class)
				.addMixIn(CategoryInsightsReportColumn.class, CategoryInsightsReportColumnMixIn.class)
				.addMixIn(CategoryClickCoverageReportColumn.class, CategoryClickCoverageReportColumnMixIn.class)
				.addMixIn(CombinationPerformanceReportColumn.class, CombinationPerformanceReportColumnMixIn.class)
				.addMixIn(ReportRequestStatusType.class, ReportRequestStatusTypeMixIn.class)
				;
	}
}