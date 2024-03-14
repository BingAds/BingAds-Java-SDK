package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForArrayOfTypes {
	public static void AddMixInForArrayOfTypes() {
		AdaptorUtil.mapper
				.addMixIn(ArrayOfAppUrl.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomParameter.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetLink.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfTargetSettingDetail.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaign.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSetting.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBatchError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOperationError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignNegativeSites.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroup.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfFrequencyCapSettings.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroupNegativeSites.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAd.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfEditorialError.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdType.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyword.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfEntityIdToParentIdAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfEditorialReasonCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfEditorialReason.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAccountMigrationStatusesInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfMigrationStatusInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAccountProperty.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAccountPropertyName.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtension.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfDayTime.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfPriceTableRow.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionIdentity.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBatchErrorCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionIdToEntityIdAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionEditorialReasonCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionEditorialReason.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionAssociationCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdExtensionAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfMedia.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfMediaMetaData.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfMediaRepresentation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfArrayOfMediaAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfMediaAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroupCriterion.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfProductCondition.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfWebpageCondition.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdGroupCriterionAction.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupListingGroupAction.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupListingGroup.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBMCStore.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfEntityNegativeKeyword.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfNegativeKeyword.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfIdCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSharedEntity.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSharedListItem.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfSharedEntityAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignSize.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignCriterion.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBudget.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfBidStrategy.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudienceGroup.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudienceGroupDimension.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAgeRange.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfGenderType.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudienceInfo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroup.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupEditorialReasonCollection.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAssetGroupEditorialReason.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudienceGroupAssetGroupAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAudience.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomerAccountShare.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomerAccountShareAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfRuleItemGroup.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfRuleItem.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCombinationRule.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCustomerListItem.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfUetTag.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfConversionGoal.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOfflineConversion.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOfflineConversionAdjustment.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfOnlineConversionAdjustment.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfLabel.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfLabelAssociation.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfExperiment.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCompany.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfImportJob.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignAdGroupIds.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfImportResult.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfImportEntityStatistics.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfVideo.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfCampaignConversionGoal.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValueOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValuePairOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfArrayOfKeyValuePairOfstringstring.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfKeyValuePairOflonglong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfNullableOflong.class, ArrayOfTypesMixIn.class)
				.addMixIn(ArrayOfAdApiError.class, ArrayOfTypesMixIn.class)
				;
	}
}