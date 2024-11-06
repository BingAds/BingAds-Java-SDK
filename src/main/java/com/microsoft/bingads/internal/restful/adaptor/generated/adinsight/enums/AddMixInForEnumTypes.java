package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.adinsight.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForEnumTypes {
	public static void AddMixInForEnumTypes() {
		AdaptorUtil.mapper
				.addMixIn(BidOpportunityType.class, BidOpportunityTypeMixIn.class)
				.addMixIn(BudgetPointType.class, BudgetPointTypeMixIn.class)
				.addMixIn(BudgetLimitType.class, BudgetLimitTypeMixIn.class)
				.addMixIn(KeywordOpportunityType.class, KeywordOpportunityTypeMixIn.class)
				.addMixIn(TargetAdPosition.class, TargetAdPositionMixIn.class)
				.addMixIn(CurrencyCode.class, CurrencyCodeMixIn.class)
				.addMixIn(MatchType.class, MatchTypeMixIn.class)
				.addMixIn(AdGroupBidLandscapeType.class, AdGroupBidLandscapeTypeMixIn.class)
				.addMixIn(TimeInterval.class, TimeIntervalMixIn.class)
				.addMixIn(AdPosition.class, AdPositionMixIn.class)
				.addMixIn(EntityType.class, EntityTypeMixIn.class)
				.addMixIn(NetworkType.class, NetworkTypeMixIn.class)
				.addMixIn(CompetitionLevel.class, CompetitionLevelMixIn.class)
				.addMixIn(AuctionSegment.class, AuctionSegmentMixIn.class)
				.addMixIn(AuctionInsightKpiAdditionalField.class, AuctionInsightKpiAdditionalFieldMixIn.class)
				.addMixIn(KeywordIdeaAttribute.class, KeywordIdeaAttributeMixIn.class)
				.addMixIn(SourceType.class, SourceTypeMixIn.class)
				.addMixIn(KPIType.class, KPITypeMixIn.class)
				.addMixIn(PerformanceInsightsMessageTemplateId.class, PerformanceInsightsMessageTemplateIdMixIn.class)
				.addMixIn(ParameterType.class, ParameterTypeMixIn.class)
				.addMixIn(PerformanceInsightsUrlCategory.class, PerformanceInsightsUrlCategoryMixIn.class)
				.addMixIn(PerformanceInsightsUrlId.class, PerformanceInsightsUrlIdMixIn.class)
				.addMixIn(PerformanceInsightsEntityType.class, PerformanceInsightsEntityTypeMixIn.class)
				.addMixIn(RecommendationType.class, RecommendationTypeMixIn.class)
				.addMixIn(AgeEnum.class, AgeEnumMixIn.class)
				.addMixIn(GenderEnum.class, GenderEnumMixIn.class)
				.addMixIn(RadiusUnit.class, RadiusUnitMixIn.class)
				.addMixIn(Currency.class, CurrencyMixIn.class)
				.addMixIn(ScaleUnit.class, ScaleUnitMixIn.class)
				;
	}
}