package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.campaignmanagement.*;
import com.microsoft.bingads.internal.restful.adaptor.*;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValueOfstringstring.KeyValueOfstringstring;

@JsonInclude(JsonInclude.Include.NON_NULL)
interface ArrayOfTypesMixIn{
	    
	@JsonValue
	List<AppUrl> getAppUrls();

            
	@JsonValue
	List<CustomParameter> getCustomParameters();

            
	@JsonValue
	List<AssetLink> getAssetLinks();

            
	@JsonValue
	List<TargetSettingDetail> getTargetSettingDetails();

            
	@JsonValue
	List<Campaign> getCampaigns();

            
	@JsonValue
	List<Setting> getSettings();

            
	@JsonValue
	List<BatchError> getBatchErrors();

            
	@JsonValue
	List<OperationError> getOperationErrors();

            
	@JsonValue
	List<CampaignNegativeSites> getCampaignNegativeSites();

            
	@JsonValue
	List<AdGroup> getAdGroups();

            
	@JsonValue
	List<FrequencyCapSettings> getFrequencyCapSettings();

            
	@JsonValue
	List<AdGroupNegativeSites> getAdGroupNegativeSites();

            
	@JsonValue
	List<Ad> getAds();

            
	@JsonValue
	List<EditorialError> getEditorialErrors();

            
	@JsonValue
	List<AdType> getAdTypes();

            
	@JsonValue
	List<Keyword> getKeywords();

            
	@JsonValue
	List<EntityIdToParentIdAssociation> getEntityIdToParentIdAssociations();

            
	@JsonValue
	List<EditorialReasonCollection> getEditorialReasonCollections();

            
	@JsonValue
	List<EditorialReason> getEditorialReasons();

            
	@JsonValue
	List<AccountMigrationStatusesInfo> getAccountMigrationStatusesInfos();

            
	@JsonValue
	List<MigrationStatusInfo> getMigrationStatusInfos();

            
	@JsonValue
	List<AccountProperty> getAccountProperties();

            
	@JsonValue
	List<AccountPropertyName> getAccountPropertyNames();

            
	@JsonValue
	List<AdExtension> getAdExtensions();

            
	@JsonValue
	List<DayTime> getDayTimes();

            
	@JsonValue
	List<PriceTableRow> getPriceTableRows();

            
	@JsonValue
	List<AdExtensionIdentity> getAdExtensionIdentities();

            
	@JsonValue
	List<BatchErrorCollection> getBatchErrorCollections();

            
	@JsonValue
	List<AdExtensionIdToEntityIdAssociation> getAdExtensionIdToEntityIdAssociations();

            
	@JsonValue
	List<AdExtensionEditorialReasonCollection> getAdExtensionEditorialReasonCollections();

            
	@JsonValue
	List<AdExtensionEditorialReason> getAdExtensionEditorialReasons();

            
	@JsonValue
	List<AdExtensionAssociationCollection> getAdExtensionAssociationCollections();

            
	@JsonValue
	List<AdExtensionAssociation> getAdExtensionAssociations();

            
	@JsonValue
	List<Media> getMedias();

            
	@JsonValue
	List<MediaMetaData> getMediaMetaDatas();

            
	@JsonValue
	List<MediaRepresentation> getMediaRepresentations();

            
	@JsonValue
	List<ArrayOfMediaAssociation> getArrayOfMediaAssociations();

            
	@JsonValue
	List<MediaAssociation> getMediaAssociations();

            
	@JsonValue
	List<AdGroupCriterion> getAdGroupCriterions();

            
	@JsonValue
	List<ProductCondition> getProductConditions();

            
	@JsonValue
	List<WebpageCondition> getWebpageConditions();

            
	@JsonValue
	List<AdGroupCriterionAction> getAdGroupCriterionActions();

            
	@JsonValue
	List<AssetGroupListingGroupAction> getAssetGroupListingGroupActions();

            
	@JsonValue
	List<AssetGroupListingGroup> getAssetGroupListingGroups();

            
	@JsonValue
	List<BMCStore> getBMCStores();

            
	@JsonValue
	List<EntityNegativeKeyword> getEntityNegativeKeywords();

            
	@JsonValue
	List<NegativeKeyword> getNegativeKeywords();

            
	@JsonValue
	List<IdCollection> getIdCollections();

            
	@JsonValue
	List<SharedEntity> getSharedEntities();

            
	@JsonValue
	List<SharedListItem> getSharedListItems();

            
	@JsonValue
	List<SharedEntityAssociation> getSharedEntityAssociations();

            
	@JsonValue
	List<CampaignSize> getCampaignSizes();

            
	@JsonValue
	List<CampaignCriterion> getCampaignCriterions();

            
	@JsonValue
	List<Budget> getBudgets();

            
	@JsonValue
	List<BidStrategy> getBidStrategies();

            
	@JsonValue
	List<AudienceGroup> getAudienceGroups();

            
	@JsonValue
	List<AudienceGroupDimension> getAudienceGroupDimensions();

            
	@JsonValue
	List<AgeRange> getAgeRanges();

            
	@JsonValue
	List<GenderType> getGenderTypes();

            
	@JsonValue
	List<AudienceInfo> getAudienceInfos();

            
	@JsonValue
	List<AssetGroup> getAssetGroups();

            
	@JsonValue
	List<AssetGroupSearchTheme> getAssetGroupSearchThemes();

            
	@JsonValue
	List<AssetGroupEditorialReasonCollection> getAssetGroupEditorialReasonCollections();

            
	@JsonValue
	List<AssetGroupEditorialReason> getAssetGroupEditorialReasons();

            
	@JsonValue
	List<AudienceGroupAssetGroupAssociation> getAudienceGroupAssetGroupAssociations();

            
	@JsonValue
	List<Audience> getAudiences();

            
	@JsonValue
	List<CustomerAccountShare> getCustomerAccountShares();

            
	@JsonValue
	List<CustomerAccountShareAssociation> getCustomerAccountShareAssociations();

            
	@JsonValue
	List<RuleItemGroup> getRuleItemGroups();

            
	@JsonValue
	List<RuleItem> getRuleItems();

            
	@JsonValue
	List<CombinationRule> getCombinationRules();

            
	@JsonValue
	List<UetTag> getUetTags();

            
	@JsonValue
	List<ConversionGoal> getConversionGoals();

            
	@JsonValue
	List<OfflineConversion> getOfflineConversions();

            
	@JsonValue
	List<OfflineConversionAdjustment> getOfflineConversionAdjustments();

            
	@JsonValue
	List<OnlineConversionAdjustment> getOnlineConversionAdjustments();

            
	@JsonValue
	List<Label> getLabels();

            
	@JsonValue
	List<LabelAssociation> getLabelAssociations();

            
	@JsonValue
	List<Experiment> getExperiments();

            
	@JsonValue
	List<Company> getCompanies();

            
	@JsonValue
	List<ImportJob> getImportJobs();

            
	@JsonValue
	List<CampaignAdGroupIds> getCampaignAdGroupIds();

            
	@JsonValue
	List<ImportResult> getImportResults();

            
	@JsonValue
	List<ImportEntityStatistics> getImportEntityStatistics();

            
	@JsonValue
	List<Video> getVideos();

            
	@JsonValue
	List<CampaignConversionGoal> getCampaignConversionGoals();

            
	@JsonValue
	List<DataExclusion> getDataExclusions();

            
	@JsonValue
	List<CampaignAssociation> getCampaignAssociations();

            
	@JsonValue
	List<SeasonalityAdjustment> getSeasonalityAdjustments();

            
	@JsonValue
	List<String> getStrings();

            
	@JsonValue
	List<Long> getLongs();

            
	@JsonValue
	List<KeyValueOfstringstring> getKeyValueOfstringstrings();

            
	@JsonValue
	List<KeyValuePairOfstringstring> getKeyValuePairOfstringstrings();

            
	@JsonValue
	List<ArrayOfKeyValuePairOfstringstring> getArrayOfKeyValuePairOfstringstrings();

            
	@JsonValue
	List<KeyValuePairOflonglong> getKeyValuePairOflonglongs();

                    
	@JsonValue
	List<AdApiError> getAdApiErrors();

        }