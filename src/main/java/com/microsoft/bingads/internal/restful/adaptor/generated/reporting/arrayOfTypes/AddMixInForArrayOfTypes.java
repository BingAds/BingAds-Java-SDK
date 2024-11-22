package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.arrayOfTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForArrayOfTypes {
	public static void AddMixInForArrayOfTypes() {
		AdaptorUtil.mapper
				.addMixIn(ArrayOfAccountPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignReportScope.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdDynamicTextPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroupReportScope.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroupPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeywordPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeywordPerformanceReportSort.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfDestinationUrlPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBudgetSummaryReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAgeGenderAudienceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProfessionalDemographicsAudienceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfUserLocationPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfPublisherUsagePerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSearchQueryPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfConversionPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfGoalsAndFunnelsReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfNegativeKeywordConflictReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSearchCampaignChangeHistoryReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionByAdReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionByKeywordReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudiencePerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionDetailReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfShareOfVoiceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductDimensionPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductPartitionPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductPartitionUnitPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductSearchQueryPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductMatchCountReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductNegativeKeywordConflictReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCallDetailReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfGeographicPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfDSASearchQueryPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfDSAAutoTargetPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfDSACategoryPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfHotelDimensionPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfHotelGroupPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupReportScope.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSearchInsightPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCategoryInsightsReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCategoryClickCoverageReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCombinationPerformanceReportColumn.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBatchError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfint.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdApiError.class, ArrayOfTypesMixIn.class)
				;
	}
}