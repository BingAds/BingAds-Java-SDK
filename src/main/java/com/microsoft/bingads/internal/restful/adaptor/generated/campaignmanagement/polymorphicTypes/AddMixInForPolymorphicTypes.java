package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForPolymorphicTypes {
	public static void AddMixInForPolymorphicTypes() {
		AdaptorUtil.mapper
				.addMixIn(Ad.class, AdPolymorphicTypesMixIn.class)
				.addMixIn(Asset.class, AssetPolymorphicTypesMixIn.class)
				.addMixIn(Setting.class, SettingPolymorphicTypesMixIn.class)
				.addMixIn(BiddingScheme.class, BiddingSchemePolymorphicTypesMixIn.class)
				.addMixIn(BatchError.class, BatchErrorPolymorphicTypesMixIn.class)
				.addMixIn(ApplicationFault.class, ApplicationFaultPolymorphicTypesMixIn.class)
				.addMixIn(CriterionBid.class, CriterionBidPolymorphicTypesMixIn.class)
				.addMixIn(AdExtension.class, AdExtensionPolymorphicTypesMixIn.class)
				.addMixIn(BatchErrorCollection.class, BatchErrorCollectionPolymorphicTypesMixIn.class)
				.addMixIn(Media.class, MediaPolymorphicTypesMixIn.class)
				.addMixIn(MediaRepresentation.class, MediaRepresentationPolymorphicTypesMixIn.class)
				.addMixIn(Criterion.class, CriterionPolymorphicTypesMixIn.class)
				.addMixIn(AdGroupCriterion.class, AdGroupCriterionPolymorphicTypesMixIn.class)
				.addMixIn(CriterionCashback.class, CriterionCashbackPolymorphicTypesMixIn.class)
				.addMixIn(SharedListItem.class, SharedListItemPolymorphicTypesMixIn.class)
				.addMixIn(SharedEntity.class, SharedEntityPolymorphicTypesMixIn.class)
				.addMixIn(SharedList.class, SharedListPolymorphicTypesMixIn.class)
				.addMixIn(CampaignCriterion.class, CampaignCriterionPolymorphicTypesMixIn.class)
				.addMixIn(AudienceGroupDimension.class, AudienceGroupDimensionPolymorphicTypesMixIn.class)
				.addMixIn(Audience.class, AudiencePolymorphicTypesMixIn.class)
				.addMixIn(RemarketingRule.class, RemarketingRulePolymorphicTypesMixIn.class)
				.addMixIn(RuleItem.class, RuleItemPolymorphicTypesMixIn.class)
				.addMixIn(ConversionGoal.class, ConversionGoalPolymorphicTypesMixIn.class)
				.addMixIn(ImportOption.class, ImportOptionPolymorphicTypesMixIn.class)
				.addMixIn(ImportJob.class, ImportJobPolymorphicTypesMixIn.class)
				;
	}
}