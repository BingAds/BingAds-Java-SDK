package com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.polymorphicTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.adinsight.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForPolymorphicTypes {
	public static void AddMixInForPolymorphicTypes() {
		AdaptorUtil.mapper
				.addMixIn(ApplicationFault.class, ApplicationFaultPolymorphicTypesMixIn.class)
				.addMixIn(KeywordOpportunity.class, KeywordOpportunityPolymorphicTypesMixIn.class)
				.addMixIn(SearchParameter.class, SearchParameterPolymorphicTypesMixIn.class)
				.addMixIn(Criterion.class, CriterionPolymorphicTypesMixIn.class)
				.addMixIn(PerformanceInsightsMessageParameter.class, PerformanceInsightsMessageParameterPolymorphicTypesMixIn.class)
				.addMixIn(Recommendation.class, RecommendationPolymorphicTypesMixIn.class)
				.addMixIn(RecommendationInfo.class, RecommendationInfoPolymorphicTypesMixIn.class)
				.addMixIn(RecommendationBase.class, RecommendationBasePolymorphicTypesMixIn.class)
				;
	}
}