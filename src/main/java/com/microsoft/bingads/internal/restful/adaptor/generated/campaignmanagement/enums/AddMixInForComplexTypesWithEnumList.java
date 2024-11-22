package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class AddMixInForComplexTypesWithEnumList {
	public static void AddMixInForComplexTypesWithEnumList() {
		AdaptorUtil.mapper
				.addMixIn(GetCampaignsByAccountIdRequest.class, GetCampaignsByAccountIdRequestEnumsMixIn.class)
				.addMixIn(GetCampaignsByIdsRequest.class, GetCampaignsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAdGroupsByIdsRequest.class, GetAdGroupsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAdGroupsByCampaignIdRequest.class, GetAdGroupsByCampaignIdRequestEnumsMixIn.class)
				.addMixIn(GetAdsByEditorialStatusRequest.class, GetAdsByEditorialStatusRequestEnumsMixIn.class)
				.addMixIn(GetAdsByIdsRequest.class, GetAdsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAdsByAdGroupIdRequest.class, GetAdsByAdGroupIdRequestEnumsMixIn.class)
				.addMixIn(GetAdExtensionsByIdsRequest.class, GetAdExtensionsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAdExtensionsAssociationsRequest.class, GetAdExtensionsAssociationsRequestEnumsMixIn.class)
				.addMixIn(GetAdExtensionIdsByAccountIdRequest.class, GetAdExtensionIdsByAccountIdRequestEnumsMixIn.class)
				.addMixIn(GetMediaMetaDataByAccountIdRequest.class, GetMediaMetaDataByAccountIdRequestEnumsMixIn.class)
				.addMixIn(GetMediaMetaDataByIdsRequest.class, GetMediaMetaDataByIdsRequestEnumsMixIn.class)
				.addMixIn(GetMediaAssociationsRequest.class, GetMediaAssociationsRequestEnumsMixIn.class)
				.addMixIn(GetAdGroupCriterionsByIdsRequest.class, GetAdGroupCriterionsByIdsRequestEnumsMixIn.class)
				.addMixIn(AddAdGroupCriterionsRequest.class, AddAdGroupCriterionsRequestEnumsMixIn.class)
				.addMixIn(UpdateAdGroupCriterionsRequest.class, UpdateAdGroupCriterionsRequestEnumsMixIn.class)
				.addMixIn(DeleteAdGroupCriterionsRequest.class, DeleteAdGroupCriterionsRequestEnumsMixIn.class)
				.addMixIn(GetBMCStoresByCustomerIdRequest.class, GetBMCStoresByCustomerIdRequestEnumsMixIn.class)
				.addMixIn(AddCampaignCriterionsRequest.class, AddCampaignCriterionsRequestEnumsMixIn.class)
				.addMixIn(UpdateCampaignCriterionsRequest.class, UpdateCampaignCriterionsRequestEnumsMixIn.class)
				.addMixIn(DeleteCampaignCriterionsRequest.class, DeleteCampaignCriterionsRequestEnumsMixIn.class)
				.addMixIn(GetCampaignCriterionsByIdsRequest.class, GetCampaignCriterionsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAssetGroupsByIdsRequest.class, GetAssetGroupsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetAssetGroupsByCampaignIdRequest.class, GetAssetGroupsByCampaignIdRequestEnumsMixIn.class)
				.addMixIn(GetAudiencesByIdsRequest.class, GetAudiencesByIdsRequestEnumsMixIn.class)
				.addMixIn(GetConversionGoalsByIdsRequest.class, GetConversionGoalsByIdsRequestEnumsMixIn.class)
				.addMixIn(GetConversionGoalsByTagIdsRequest.class, GetConversionGoalsByTagIdsRequestEnumsMixIn.class)
				.addMixIn(GetProfileDataFileUrlRequest.class, GetProfileDataFileUrlRequestEnumsMixIn.class)
				.addMixIn(GetImportResultsRequest.class, GetImportResultsRequestEnumsMixIn.class)
				.addMixIn(GetImportJobsByIdsRequest.class, GetImportJobsByIdsRequestEnumsMixIn.class)
				.addMixIn(CreateResponsiveAdRecommendationRequest.class, CreateResponsiveAdRecommendationRequestEnumsMixIn.class)
				.addMixIn(AppInstallAd.class, AppInstallAdEnumsMixIn.class)
				.addMixIn(ResponsiveAd.class, ResponsiveAdEnumsMixIn.class)
				.addMixIn(HotelSetting.class, HotelSettingEnumsMixIn.class)
				.addMixIn(AppSetting.class, AppSettingEnumsMixIn.class)
				.addMixIn(Campaign.class, CampaignEnumsMixIn.class)
				.addMixIn(AppAdExtension.class, AppAdExtensionEnumsMixIn.class)
				.addMixIn(MediaAssociation.class, MediaAssociationEnumsMixIn.class)
				.addMixIn(AudienceCriterion.class, AudienceCriterionEnumsMixIn.class)
				.addMixIn(ProfileCriterion.class, ProfileCriterionEnumsMixIn.class)
				.addMixIn(BidStrategy.class, BidStrategyEnumsMixIn.class)
				.addMixIn(AudienceInfo.class, AudienceInfoEnumsMixIn.class)
				.addMixIn(Audience.class, AudienceEnumsMixIn.class)
				.addMixIn(ProductAudience.class, ProductAudienceEnumsMixIn.class)
				.addMixIn(ConversionGoal.class, ConversionGoalEnumsMixIn.class)
				.addMixIn(AppInstallGoal.class, AppInstallGoalEnumsMixIn.class)
				.addMixIn(DataExclusion.class, DataExclusionEnumsMixIn.class)
				.addMixIn(SeasonalityAdjustment.class, SeasonalityAdjustmentEnumsMixIn.class)
				.addMixIn(AudienceConditionItem.class, AudienceConditionItemEnumsMixIn.class)
				.addMixIn(DeviceCondition.class, DeviceConditionEnumsMixIn.class)
				.addMixIn(ArrayOfDeviceType.class, ArrayOfDeviceTypeEnumsMixIn.class)
				;
	}
}