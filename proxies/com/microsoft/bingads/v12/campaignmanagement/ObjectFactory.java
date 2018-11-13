
package com.microsoft.bingads.v12.campaignmanagement;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.bingads.v12.campaignmanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfEntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfEntityNegativeKeyword");
    private final static QName _DynamicSearchAdsSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DynamicSearchAdsSetting");
    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ApiFaultDetail");
    private final static QName _MaxConversionsBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MaxConversionsBiddingScheme");
    private final static QName _AdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupNegativeSites");
    private final static QName _AdExtensionsTypeFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionsTypeFilter");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _AssociationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AssociationType");
    private final static QName _Webpage_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Webpage");
    private final static QName _InMarketAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "InMarketAudience");
    private final static QName _Date_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Date");
    private final static QName _AgeCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AgeCriterion");
    private final static QName _ArrayOfRuleItemGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfRuleItemGroup");
    private final static QName _PageVisitorsWhoVisitedAnotherPageRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PageVisitorsWhoVisitedAnotherPageRule");
    private final static QName _MediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MediaMetaData");
    private final static QName _UetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "UetTag");
    private final static QName _NegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "NegativeKeyword");
    private final static QName _EventGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EventGoal");
    private final static QName _CampaignAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignAdditionalField");
    private final static QName _SitelinkAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SitelinkAdExtension");
    private final static QName _ActionAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ActionAdExtension");
    private final static QName _ArrayOfEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfEditorialReason");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfBatchError");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _AccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AccountMigrationStatusesInfo");
    private final static QName _ResponsiveSearchAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ResponsiveSearchAd");
    private final static QName _DistanceUnit_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DistanceUnit");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _BiddableCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BiddableCampaignCriterion");
    private final static QName _ArrayOfSharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfSharedEntityAssociation");
    private final static QName _ArrayOfAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtension");
    private final static QName _MigrationStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MigrationStatus");
    private final static QName _ArrayOfAdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdGroupNegativeSites");
    private final static QName _NegativeCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "NegativeCampaignCriterion");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfOperationError");
    private final static QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ReviewAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ReviewAdExtension");
    private final static QName _AdGroupCriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupCriterionType");
    private final static QName _NegativeAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "NegativeAdGroupCriterion");
    private final static QName _StringOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "StringOperator");
    private final static QName _ArrayOfSharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfSharedListItem");
    private final static QName _AudienceType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AudienceType");
    private final static QName _AdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionEditorialReasonCollection");
    private final static QName _EntityType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EntityType");
    private final static QName _MigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MigrationStatusInfo");
    private final static QName _ArrayOfIdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfIdCollection");
    private final static QName _ArrayOfSharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfSharedEntity");
    private final static QName _BidOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BidOption");
    private final static QName _ArrayOfMigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfMigrationStatusInfo");
    private final static QName _ExpandedTextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ExpandedTextAd");
    private final static QName _OfflineConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "OfflineConversionGoal");
    private final static QName _Media_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Media");
    private final static QName _Paging_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Paging");
    private final static QName _Setting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Setting");
    private final static QName _ArrayOfCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfCampaignCriterion");
    private final static QName _Experiment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Experiment");
    private final static QName _ConversionGoalRevenueType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalRevenueType");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _PageVisitorsRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PageVisitorsRule");
    private final static QName _ArrayOfLabel_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfLabel");
    private final static QName _CustomParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomParameter");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ApplicationToken");
    private final static QName _EntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EntityNegativeKeyword");
    private final static QName _AdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupCriterion");
    private final static QName _ArrayOfAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdGroupCriterion");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _LocationCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "LocationCriterion");
    private final static QName _ProductAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductAd");
    private final static QName _GenderCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "GenderCriterion");
    private final static QName _AdExtensionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionStatus");
    private final static QName _BusinessGeoCodeStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BusinessGeoCodeStatus");
    private final static QName _FixedBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "FixedBid");
    private final static QName _ArrayOfPriceTableRow_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfPriceTableRow");
    private final static QName _ArrayOfArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfArrayOfMediaAssociation");
    private final static QName _EntityIdToParentIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EntityIdToParentIdAssociation");
    private final static QName _EditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EditorialReasonCollection");
    private final static QName _ArrayOfEntityIdToParentIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfEntityIdToParentIdAssociation");
    private final static QName _Day_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Day");
    private final static QName _ArrayOfAdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionIdentity");
    private final static QName _AdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionAssociation");
    private final static QName _BiddableAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BiddableAdGroupCriterion");
    private final static QName _ActionAdExtensionActionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ActionAdExtensionActionType");
    private final static QName _CriterionTypeGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CriterionTypeGroup");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _RuleItemGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "RuleItemGroup");
    private final static QName _GenderType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "GenderType");
    private final static QName _ProductPartition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductPartition");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _EditorialApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EditorialApiFaultDetail");
    private final static QName _ConversionGoalStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalStatus");
    private final static QName _CampaignCriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignCriterionType");
    private final static QName _AppInstallAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AppInstallAd");
    private final static QName _CallToAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CallToAction");
    private final static QName _Keyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Keyword");
    private final static QName _AdEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdEditorialStatus");
    private final static QName _ArrayOfExperiment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfExperiment");
    private final static QName _SimilarRemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SimilarRemarketingList");
    private final static QName _SharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SharedEntity");
    private final static QName _WebpageCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "WebpageCondition");
    private final static QName _AdGroupCriterionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupCriterionEditorialStatus");
    private final static QName _ProfileCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProfileCriterion");
    private final static QName _ProductScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductScope");
    private final static QName _OfflineConversion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "OfflineConversion");
    private final static QName _Minute_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Minute");
    private final static QName _MediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MediaAssociation");
    private final static QName _TextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TextAd");
    private final static QName _BidMultiplier_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BidMultiplier");
    private final static QName _CampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignSize");
    private final static QName _CampaignStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignStatus");
    private final static QName _ArrayOfRuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfRuleItem");
    private final static QName _AssetLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AssetLink");
    private final static QName _ArrayOfAdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdType");
    private final static QName _ConversionGoalRevenue_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalRevenue");
    private final static QName _AdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionAssociationCollection");
    private final static QName _ItemAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ItemAction");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomerId");
    private final static QName _AdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionIdentity");
    private final static QName _AdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionIdToEntityIdAssociation");
    private final static QName _ArrayOfAdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionEditorialReason");
    private final static QName _InStoreTransactionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "InStoreTransactionGoal");
    private final static QName _ArrayOfAdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionAssociationCollection");
    private final static QName _Asset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Asset");
    private final static QName _RuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "RuleItem");
    private final static QName _DayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DayTime");
    private final static QName _Network_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Network");
    private final static QName _ArrayOfAdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionEditorialReasonCollection");
    private final static QName _WebpageConditionOperand_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "WebpageConditionOperand");
    private final static QName _ArrayOfAdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdGroupCriterionAction");
    private final static QName _AppInstallGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AppInstallGoal");
    private final static QName _MaxClicksBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MaxClicksBiddingScheme");
    private final static QName _EntityScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EntityScope");
    private final static QName _Image_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Image");
    private final static QName _TargetCpaBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TargetCpaBiddingScheme");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Address_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Address");
    private final static QName _ConversionGoalType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalType");
    private final static QName _ArrayOfLabelAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfLabelAssociation");
    private final static QName _ArrayOfAccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAccountMigrationStatusesInfo");
    private final static QName _EditorialErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EditorialErrorCollection");
    private final static QName _ArrayOfAdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionIdToEntityIdAssociation");
    private final static QName _AdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionEditorialReason");
    private final static QName _Schedule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Schedule");
    private final static QName _AdGroupPrivacyStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupPrivacyStatus");
    private final static QName _PriceUnit_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PriceUnit");
    private final static QName _CoOpSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CoOpSetting");
    private final static QName _AccountProperty_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AccountProperty");
    private final static QName _CustomAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomAudience");
    private final static QName _CriterionBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CriterionBid");
    private final static QName _InheritFromParentBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "InheritFromParentBiddingScheme");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _AppUrl_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AppUrl");
    private final static QName _AudienceCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AudienceCriterion");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "UserName");
    private final static QName _ArrayOfEditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfEditorialError");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Password");
    private final static QName _ProductAudienceType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductAudienceType");
    private final static QName _Bid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Bid");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomerAccountId");
    private final static QName _MediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MediaRepresentation");
    private final static QName _ArrayOfOfflineConversion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfOfflineConversion");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Criterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Criterion");
    private final static QName _KeywordStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "KeywordStatus");
    private final static QName _ArrayOfCampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfCampaignSize");
    private final static QName _ArrayOfSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfSetting");
    private final static QName _ExpressionOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ExpressionOperator");
    private final static QName _ManualCpcBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ManualCpcBiddingScheme");
    private final static QName _CalloutAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CalloutAdExtension");
    private final static QName _UetTagTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "UetTagTrackingStatus");
    private final static QName _ResponsiveAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ResponsiveAd");
    private final static QName _AdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroup");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfBMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfBMCStore");
    private final static QName _PriceTableRow_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PriceTableRow");
    private final static QName _PriceAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PriceAdExtension");
    private final static QName _CampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignCriterion");
    private final static QName _EditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EditorialReason");
    private final static QName _ConversionGoalTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalTrackingStatus");
    private final static QName _AdExtensionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtensionEditorialStatus");
    private final static QName _ArrayOfTargetSettingDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfTargetSettingDetail");
    private final static QName _TargetSettingDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TargetSettingDetail");
    private final static QName _WebpageParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "WebpageParameter");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfMediaRepresentation");
    private final static QName _Campaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Campaign");
    private final static QName _ArrayOfAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAd");
    private final static QName _PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PageVisitorsWhoDidNotVisitAnotherPageRule");
    private final static QName _SharedList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SharedList");
    private final static QName _ImageAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ImageAdExtension");
    private final static QName _DynamicSearchAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DynamicSearchAd");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _RemarketingRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "RemarketingRule");
    private final static QName _ArrayOfBatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfBatchErrorCollection");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _ProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductCondition");
    private final static QName _PagesViewedPerVisitGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PagesViewedPerVisitGoal");
    private final static QName _CallAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CallAdExtension");
    private final static QName _CampaignType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignType");
    private final static QName _SharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SharedEntityAssociation");
    private final static QName _ArrayOfCustomParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfCustomParameter");
    private final static QName _AppAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AppAdExtension");
    private final static QName _MediaEnabledEntityFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MediaEnabledEntityFilter");
    private final static QName _GeoPoint_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "GeoPoint");
    private final static QName _ConversionGoalCountType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoalCountType");
    private final static QName _ImageMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ImageMediaRepresentation");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _DurationGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DurationGoal");
    private final static QName _ArrayOfNullableOflong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    private final static QName _ArrayOfCampaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfCampaign");
    private final static QName _AdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdExtension");
    private final static QName _CampaignCriterionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignCriterionStatus");
    private final static QName _ProductAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductAudience");
    private final static QName _AdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdType");
    private final static QName _ArrayOfBudget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfBudget");
    private final static QName _Label_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Label");
    private final static QName _ArrayOfNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfNegativeKeyword");
    private final static QName _BiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BiddingScheme");
    private final static QName _DynamicSearchAdsSource_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DynamicSearchAdsSource");
    private final static QName _ArrayOfProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfProductCondition");
    private final static QName _ArrayOfKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfKeyword");
    private final static QName _SharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "SharedListItem");
    private final static QName _PriceQualifier_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PriceQualifier");
    private final static QName _AccountPropertyName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AccountPropertyName");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DeveloperToken");
    private final static QName _ArrayOfAppUrl_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAppUrl");
    private final static QName _CampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CampaignNegativeSites");
    private final static QName _MatchType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "MatchType");
    private final static QName _ValueOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ValueOperator");
    private final static QName _AppealStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AppealStatus");
    private final static QName _EnhancedCpcBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EnhancedCpcBiddingScheme");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "OperationError");
    private final static QName _ArrayOfMediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfMediaMetaData");
    private final static QName _NegativeKeywordList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "NegativeKeywordList");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BatchError");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ProfileType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProfileType");
    private final static QName _AdRotationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdRotationType");
    private final static QName _ArrayOfMedia_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfMedia");
    private final static QName _CustomParameters_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomParameters");
    private final static QName _ArrayOfAccountPropertyName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAccountPropertyName");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfConversionGoal");
    private final static QName _AdStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdStatus");
    private final static QName _Budget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Budget");
    private final static QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private final static QName _ConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ConversionGoal");
    private final static QName _TextAsset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TextAsset");
    private final static QName _ArrayOfUetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfUetTag");
    private final static QName _PriceExtensionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "PriceExtensionType");
    private final static QName _StructuredSnippetAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "StructuredSnippetAdExtension");
    private final static QName _AgeRange_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AgeRange");
    private final static QName _Ad_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Ad");
    private final static QName _AdGroupStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupStatus");
    private final static QName _CustomEventsRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "CustomEventsRule");
    private final static QName _LocationAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "LocationAdExtension");
    private final static QName _ArrayOfAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAudience");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _BMCStoreSubType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BMCStoreSubType");
    private final static QName _ArrayOfAdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdGroup");
    private final static QName _IdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "IdCollection");
    private final static QName _RadiusCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "RadiusCriterion");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BatchErrorCollection");
    private final static QName _AdRotation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdRotation");
    private final static QName _ArrayOfAssetLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAssetLink");
    private final static QName _BudgetLimitType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BudgetLimitType");
    private final static QName _NumberOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "NumberOperator");
    private final static QName _ProductPartitionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ProductPartitionType");
    private final static QName _ArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfMediaAssociation");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TrackingId");
    private final static QName _AssetLinkEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AssetLinkEditorialStatus");
    private final static QName _ArrayOfAdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAdExtensionAssociation");
    private final static QName _AdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupCriterionAction");
    private final static QName _IntentOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "IntentOption");
    private final static QName _Audience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "Audience");
    private final static QName _LabelAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "LabelAssociation");
    private final static QName _ShoppingSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ShoppingSetting");
    private final static QName _KeywordEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "KeywordEditorialStatus");
    private final static QName _ArrayOfWebpageCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfWebpageCondition");
    private final static QName _StringRuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "StringRuleItem");
    private final static QName _ArrayOfEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfEditorialReasonCollection");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _RemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "RemarketingList");
    private final static QName _ArrayOfCampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfCampaignNegativeSites");
    private final static QName _AdAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdAdditionalField");
    private final static QName _LocationIntentCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "LocationIntentCriterion");
    private final static QName _TargetSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "TargetSetting");
    private final static QName _ArrayOfDayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfDayTime");
    private final static QName _ArrayOfAccountProperty_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "ArrayOfAccountProperty");
    private final static QName _AdGroupCriterionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AdGroupCriterionStatus");
    private final static QName _UrlGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "UrlGoal");
    private final static QName _EditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "EditorialError");
    private final static QName _DayTimeCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DayTimeCriterion");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "AuthenticationToken");
    private final static QName _BMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "BMCStore");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DeviceCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v12", "DeviceCriterion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v12.campaignmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link NonNegativeInteger }
     * 
     */
    public NonNegativeInteger createNonNegativeInteger() {
        return new NonNegativeInteger();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link ENTITY }
     * 
     */
    public ENTITY createENTITY() {
        return new ENTITY();
    }

    /**
     * Create an instance of {@link NegativeInteger }
     * 
     */
    public NegativeInteger createNegativeInteger() {
        return new NegativeInteger();
    }

    /**
     * Create an instance of {@link ENTITIES }
     * 
     */
    public ENTITIES createENTITIES() {
        return new ENTITIES();
    }

    /**
     * Create an instance of {@link UnsignedLong }
     * 
     */
    public UnsignedLong createUnsignedLong() {
        return new UnsignedLong();
    }

    /**
     * Create an instance of {@link IDREFS }
     * 
     */
    public IDREFS createIDREFS() {
        return new IDREFS();
    }

    /**
     * Create an instance of {@link NonPositiveInteger }
     * 
     */
    public NonPositiveInteger createNonPositiveInteger() {
        return new NonPositiveInteger();
    }

    /**
     * Create an instance of {@link NMTOKEN }
     * 
     */
    public NMTOKEN createNMTOKEN() {
        return new NMTOKEN();
    }

    /**
     * Create an instance of {@link NMTOKENS }
     * 
     */
    public NMTOKENS createNMTOKENS() {
        return new NMTOKENS();
    }

    /**
     * Create an instance of {@link PositiveInteger }
     * 
     */
    public PositiveInteger createPositiveInteger() {
        return new PositiveInteger();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionsResponse }
     * 
     */
    public ApplyOfflineConversionsResponse createApplyOfflineConversionsResponse() {
        return new ApplyOfflineConversionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
    }

    /**
     * Create an instance of {@link DeleteAdsResponse }
     * 
     */
    public DeleteAdsResponse createDeleteAdsResponse() {
        return new DeleteAdsResponse();
    }

    /**
     * Create an instance of {@link GetAdGroupsByIdsRequest }
     * 
     */
    public GetAdGroupsByIdsRequest createGetAdGroupsByIdsRequest() {
        return new GetAdGroupsByIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link DayTimeCriterion }
     * 
     */
    public DayTimeCriterion createDayTimeCriterion() {
        return new DayTimeCriterion();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByIdsResponse }
     * 
     */
    public GetMediaMetaDataByIdsResponse createGetMediaMetaDataByIdsResponse() {
        return new GetMediaMetaDataByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMediaMetaData }
     * 
     */
    public ArrayOfMediaMetaData createArrayOfMediaMetaData() {
        return new ArrayOfMediaMetaData();
    }

    /**
     * Create an instance of {@link EditorialError }
     * 
     */
    public EditorialError createEditorialError() {
        return new EditorialError();
    }

    /**
     * Create an instance of {@link UrlGoal }
     * 
     */
    public UrlGoal createUrlGoal() {
        return new UrlGoal();
    }

    /**
     * Create an instance of {@link TargetSetting }
     * 
     */
    public TargetSetting createTargetSetting() {
        return new TargetSetting();
    }

    /**
     * Create an instance of {@link ArrayOfDayTime }
     * 
     */
    public ArrayOfDayTime createArrayOfDayTime() {
        return new ArrayOfDayTime();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesByAccountIdRequest }
     * 
     */
    public GetSharedEntitiesByAccountIdRequest createGetSharedEntitiesByAccountIdRequest() {
        return new GetSharedEntitiesByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetCampaignsByIdsResponse }
     * 
     */
    public GetCampaignsByIdsResponse createGetCampaignsByIdsResponse() {
        return new GetCampaignsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCampaign }
     * 
     */
    public ArrayOfCampaign createArrayOfCampaign() {
        return new ArrayOfCampaign();
    }

    /**
     * Create an instance of {@link UpdateAdsResponse }
     * 
     */
    public UpdateAdsResponse createUpdateAdsResponse() {
        return new UpdateAdsResponse();
    }

    /**
     * Create an instance of {@link DeleteAudiencesRequest }
     * 
     */
    public DeleteAudiencesRequest createDeleteAudiencesRequest() {
        return new DeleteAudiencesRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByTagIdsResponse }
     * 
     */
    public GetConversionGoalsByTagIdsResponse createGetConversionGoalsByTagIdsResponse() {
        return new GetConversionGoalsByTagIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConversionGoal }
     * 
     */
    public ArrayOfConversionGoal createArrayOfConversionGoal() {
        return new ArrayOfConversionGoal();
    }

    /**
     * Create an instance of {@link GetConfigValueRequest }
     * 
     */
    public GetConfigValueRequest createGetConfigValueRequest() {
        return new GetConfigValueRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialReasonCollection }
     * 
     */
    public ArrayOfEditorialReasonCollection createArrayOfEditorialReasonCollection() {
        return new ArrayOfEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link GetCampaignCriterionsByIdsRequest }
     * 
     */
    public GetCampaignCriterionsByIdsRequest createGetCampaignCriterionsByIdsRequest() {
        return new GetCampaignCriterionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetUetTagsByIdsRequest }
     * 
     */
    public GetUetTagsByIdsRequest createGetUetTagsByIdsRequest() {
        return new GetUetTagsByIdsRequest();
    }

    /**
     * Create an instance of {@link LabelAssociation }
     * 
     */
    public LabelAssociation createLabelAssociation() {
        return new LabelAssociation();
    }

    /**
     * Create an instance of {@link GetCampaignsByAccountIdRequest }
     * 
     */
    public GetCampaignsByAccountIdRequest createGetCampaignsByAccountIdRequest() {
        return new GetCampaignsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link AddNegativeKeywordsToEntitiesRequest }
     * 
     */
    public AddNegativeKeywordsToEntitiesRequest createAddNegativeKeywordsToEntitiesRequest() {
        return new AddNegativeKeywordsToEntitiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEntityNegativeKeyword }
     * 
     */
    public ArrayOfEntityNegativeKeyword createArrayOfEntityNegativeKeyword() {
        return new ArrayOfEntityNegativeKeyword();
    }

    /**
     * Create an instance of {@link Audience }
     * 
     */
    public Audience createAudience() {
        return new Audience();
    }

    /**
     * Create an instance of {@link AddKeywordsResponse }
     * 
     */
    public AddKeywordsResponse createAddKeywordsResponse() {
        return new AddKeywordsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfNullableOflong }
     * 
     */
    public ArrayOfNullableOflong createArrayOfNullableOflong() {
        return new ArrayOfNullableOflong();
    }

    /**
     * Create an instance of {@link UpdateUetTagsResponse }
     * 
     */
    public UpdateUetTagsResponse createUpdateUetTagsResponse() {
        return new UpdateUetTagsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMediaAssociation }
     * 
     */
    public ArrayOfMediaAssociation createArrayOfMediaAssociation() {
        return new ArrayOfMediaAssociation();
    }

    /**
     * Create an instance of {@link GetAccountMigrationStatusesRequest }
     * 
     */
    public GetAccountMigrationStatusesRequest createGetAccountMigrationStatusesRequest() {
        return new GetAccountMigrationStatusesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAssetLink }
     * 
     */
    public ArrayOfAssetLink createArrayOfAssetLink() {
        return new ArrayOfAssetLink();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByAccountIdResponse }
     * 
     */
    public GetMediaMetaDataByAccountIdResponse createGetMediaMetaDataByAccountIdResponse() {
        return new GetMediaMetaDataByAccountIdResponse();
    }

    /**
     * Create an instance of {@link DeleteBudgetsResponse }
     * 
     */
    public DeleteBudgetsResponse createDeleteBudgetsResponse() {
        return new DeleteBudgetsResponse();
    }

    /**
     * Create an instance of {@link AddKeywordsRequest }
     * 
     */
    public AddKeywordsRequest createAddKeywordsRequest() {
        return new AddKeywordsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeyword }
     * 
     */
    public ArrayOfKeyword createArrayOfKeyword() {
        return new ArrayOfKeyword();
    }

    /**
     * Create an instance of {@link DeleteAdGroupsResponse }
     * 
     */
    public DeleteAdGroupsResponse createDeleteAdGroupsResponse() {
        return new DeleteAdGroupsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroup }
     * 
     */
    public ArrayOfAdGroup createArrayOfAdGroup() {
        return new ArrayOfAdGroup();
    }

    /**
     * Create an instance of {@link IdCollection }
     * 
     */
    public IdCollection createIdCollection() {
        return new IdCollection();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByAdGroupIdsRequest }
     * 
     */
    public GetNegativeSitesByAdGroupIdsRequest createGetNegativeSitesByAdGroupIdsRequest() {
        return new GetNegativeSitesByAdGroupIdsRequest();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToAdGroupsResponse }
     * 
     */
    public SetNegativeSitesToAdGroupsResponse createSetNegativeSitesToAdGroupsResponse() {
        return new SetNegativeSitesToAdGroupsResponse();
    }

    /**
     * Create an instance of {@link GetAccountMigrationStatusesResponse }
     * 
     */
    public GetAccountMigrationStatusesResponse createGetAccountMigrationStatusesResponse() {
        return new GetAccountMigrationStatusesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountMigrationStatusesInfo }
     * 
     */
    public ArrayOfAccountMigrationStatusesInfo createArrayOfAccountMigrationStatusesInfo() {
        return new ArrayOfAccountMigrationStatusesInfo();
    }

    /**
     * Create an instance of {@link CustomEventsRule }
     * 
     */
    public CustomEventsRule createCustomEventsRule() {
        return new CustomEventsRule();
    }

    /**
     * Create an instance of {@link Ad }
     * 
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link ArrayOfUetTag }
     * 
     */
    public ArrayOfUetTag createArrayOfUetTag() {
        return new ArrayOfUetTag();
    }

    /**
     * Create an instance of {@link GetAdExtensionsEditorialReasonsResponse }
     * 
     */
    public GetAdExtensionsEditorialReasonsResponse createGetAdExtensionsEditorialReasonsResponse() {
        return new GetAdExtensionsEditorialReasonsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionEditorialReasonCollection }
     * 
     */
    public ArrayOfAdExtensionEditorialReasonCollection createArrayOfAdExtensionEditorialReasonCollection() {
        return new ArrayOfAdExtensionEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link Budget }
     * 
     */
    public Budget createBudget() {
        return new Budget();
    }

    /**
     * Create an instance of {@link AddUetTagsResponse }
     * 
     */
    public AddUetTagsResponse createAddUetTagsResponse() {
        return new AddUetTagsResponse();
    }

    /**
     * Create an instance of {@link UpdateConversionGoalsResponse }
     * 
     */
    public UpdateConversionGoalsResponse createUpdateConversionGoalsResponse() {
        return new UpdateConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link DeleteMediaResponse }
     * 
     */
    public DeleteMediaResponse createDeleteMediaResponse() {
        return new DeleteMediaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMedia }
     * 
     */
    public ArrayOfMedia createArrayOfMedia() {
        return new ArrayOfMedia();
    }

    /**
     * Create an instance of {@link AddConversionGoalsRequest }
     * 
     */
    public AddConversionGoalsRequest createAddConversionGoalsRequest() {
        return new AddConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link NegativeKeywordList }
     * 
     */
    public NegativeKeywordList createNegativeKeywordList() {
        return new NegativeKeywordList();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link EnhancedCpcBiddingScheme }
     * 
     */
    public EnhancedCpcBiddingScheme createEnhancedCpcBiddingScheme() {
        return new EnhancedCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link GetAdExtensionsByIdsRequest }
     * 
     */
    public GetAdExtensionsByIdsRequest createGetAdExtensionsByIdsRequest() {
        return new GetAdExtensionsByIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAppUrl }
     * 
     */
    public ArrayOfAppUrl createArrayOfAppUrl() {
        return new ArrayOfAppUrl();
    }

    /**
     * Create an instance of {@link DeleteLabelsResponse }
     * 
     */
    public DeleteLabelsResponse createDeleteLabelsResponse() {
        return new DeleteLabelsResponse();
    }

    /**
     * Create an instance of {@link AddListItemsToSharedListResponse }
     * 
     */
    public AddListItemsToSharedListResponse createAddListItemsToSharedListResponse() {
        return new AddListItemsToSharedListResponse();
    }

    /**
     * Create an instance of {@link SharedListItem }
     * 
     */
    public SharedListItem createSharedListItem() {
        return new SharedListItem();
    }

    /**
     * Create an instance of {@link GetAdGroupCriterionsByIdsResponse }
     * 
     */
    public GetAdGroupCriterionsByIdsResponse createGetAdGroupCriterionsByIdsResponse() {
        return new GetAdGroupCriterionsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupCriterion }
     * 
     */
    public ArrayOfAdGroupCriterion createArrayOfAdGroupCriterion() {
        return new ArrayOfAdGroupCriterion();
    }

    /**
     * Create an instance of {@link ArrayOfProductCondition }
     * 
     */
    public ArrayOfProductCondition createArrayOfProductCondition() {
        return new ArrayOfProductCondition();
    }

    /**
     * Create an instance of {@link ArrayOfNegativeKeyword }
     * 
     */
    public ArrayOfNegativeKeyword createArrayOfNegativeKeyword() {
        return new ArrayOfNegativeKeyword();
    }

    /**
     * Create an instance of {@link DeleteListItemsFromSharedListResponse }
     * 
     */
    public DeleteListItemsFromSharedListResponse createDeleteListItemsFromSharedListResponse() {
        return new DeleteListItemsFromSharedListResponse();
    }

    /**
     * Create an instance of {@link UpdateExperimentsRequest }
     * 
     */
    public UpdateExperimentsRequest createUpdateExperimentsRequest() {
        return new UpdateExperimentsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfExperiment }
     * 
     */
    public ArrayOfExperiment createArrayOfExperiment() {
        return new ArrayOfExperiment();
    }

    /**
     * Create an instance of {@link ProductAudience }
     * 
     */
    public ProductAudience createProductAudience() {
        return new ProductAudience();
    }

    /**
     * Create an instance of {@link DurationGoal }
     * 
     */
    public DurationGoal createDurationGoal() {
        return new DurationGoal();
    }

    /**
     * Create an instance of {@link GeoPoint }
     * 
     */
    public GeoPoint createGeoPoint() {
        return new GeoPoint();
    }

    /**
     * Create an instance of {@link AddMediaResponse }
     * 
     */
    public AddMediaResponse createAddMediaResponse() {
        return new AddMediaResponse();
    }

    /**
     * Create an instance of {@link GetGeoLocationsFileUrlRequest }
     * 
     */
    public GetGeoLocationsFileUrlRequest createGetGeoLocationsFileUrlRequest() {
        return new GetGeoLocationsFileUrlRequest();
    }

    /**
     * Create an instance of {@link AddLabelsResponse }
     * 
     */
    public AddLabelsResponse createAddLabelsResponse() {
        return new AddLabelsResponse();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByAdGroupIdsResponse }
     * 
     */
    public GetNegativeSitesByAdGroupIdsResponse createGetNegativeSitesByAdGroupIdsResponse() {
        return new GetNegativeSitesByAdGroupIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupNegativeSites }
     * 
     */
    public ArrayOfAdGroupNegativeSites createArrayOfAdGroupNegativeSites() {
        return new ArrayOfAdGroupNegativeSites();
    }

    /**
     * Create an instance of {@link GetAudiencesByIdsRequest }
     * 
     */
    public GetAudiencesByIdsRequest createGetAudiencesByIdsRequest() {
        return new GetAudiencesByIdsRequest();
    }

    /**
     * Create an instance of {@link AppAdExtension }
     * 
     */
    public AppAdExtension createAppAdExtension() {
        return new AppAdExtension();
    }

    /**
     * Create an instance of {@link ArrayOfCustomParameter }
     * 
     */
    public ArrayOfCustomParameter createArrayOfCustomParameter() {
        return new ArrayOfCustomParameter();
    }

    /**
     * Create an instance of {@link GetKeywordsByIdsResponse }
     * 
     */
    public GetKeywordsByIdsResponse createGetKeywordsByIdsResponse() {
        return new GetKeywordsByIdsResponse();
    }

    /**
     * Create an instance of {@link CallAdExtension }
     * 
     */
    public CallAdExtension createCallAdExtension() {
        return new CallAdExtension();
    }

    /**
     * Create an instance of {@link ProductCondition }
     * 
     */
    public ProductCondition createProductCondition() {
        return new ProductCondition();
    }

    /**
     * Create an instance of {@link ArrayOfBatchErrorCollection }
     * 
     */
    public ArrayOfBatchErrorCollection createArrayOfBatchErrorCollection() {
        return new ArrayOfBatchErrorCollection();
    }

    /**
     * Create an instance of {@link RemarketingRule }
     * 
     */
    public RemarketingRule createRemarketingRule() {
        return new RemarketingRule();
    }

    /**
     * Create an instance of {@link GetMediaAssociationsResponse }
     * 
     */
    public GetMediaAssociationsResponse createGetMediaAssociationsResponse() {
        return new GetMediaAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfMediaAssociation }
     * 
     */
    public ArrayOfArrayOfMediaAssociation createArrayOfArrayOfMediaAssociation() {
        return new ArrayOfArrayOfMediaAssociation();
    }

    /**
     * Create an instance of {@link DynamicSearchAd }
     * 
     */
    public DynamicSearchAd createDynamicSearchAd() {
        return new DynamicSearchAd();
    }

    /**
     * Create an instance of {@link ImageAdExtension }
     * 
     */
    public ImageAdExtension createImageAdExtension() {
        return new ImageAdExtension();
    }

    /**
     * Create an instance of {@link ArrayOfAd }
     * 
     */
    public ArrayOfAd createArrayOfAd() {
        return new ArrayOfAd();
    }

    /**
     * Create an instance of {@link GetListItemsBySharedListRequest }
     * 
     */
    public GetListItemsBySharedListRequest createGetListItemsBySharedListRequest() {
        return new GetListItemsBySharedListRequest();
    }

    /**
     * Create an instance of {@link SharedList }
     * 
     */
    public SharedList createSharedList() {
        return new SharedList();
    }

    /**
     * Create an instance of {@link WebpageParameter }
     * 
     */
    public WebpageParameter createWebpageParameter() {
        return new WebpageParameter();
    }

    /**
     * Create an instance of {@link AddAdGroupCriterionsRequest }
     * 
     */
    public AddAdGroupCriterionsRequest createAddAdGroupCriterionsRequest() {
        return new AddAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link TargetSettingDetail }
     * 
     */
    public TargetSettingDetail createTargetSettingDetail() {
        return new TargetSettingDetail();
    }

    /**
     * Create an instance of {@link EditorialReason }
     * 
     */
    public EditorialReason createEditorialReason() {
        return new EditorialReason();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsBySharedEntityIdsResponse }
     * 
     */
    public GetSharedEntityAssociationsBySharedEntityIdsResponse createGetSharedEntityAssociationsBySharedEntityIdsResponse() {
        return new GetSharedEntityAssociationsBySharedEntityIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSharedEntityAssociation }
     * 
     */
    public ArrayOfSharedEntityAssociation createArrayOfSharedEntityAssociation() {
        return new ArrayOfSharedEntityAssociation();
    }

    /**
     * Create an instance of {@link ArrayOfBMCStore }
     * 
     */
    public ArrayOfBMCStore createArrayOfBMCStore() {
        return new ArrayOfBMCStore();
    }

    /**
     * Create an instance of {@link AddListItemsToSharedListRequest }
     * 
     */
    public AddListItemsToSharedListRequest createAddListItemsToSharedListRequest() {
        return new AddListItemsToSharedListRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSharedListItem }
     * 
     */
    public ArrayOfSharedListItem createArrayOfSharedListItem() {
        return new ArrayOfSharedListItem();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link MediaRepresentation }
     * 
     */
    public MediaRepresentation createMediaRepresentation() {
        return new MediaRepresentation();
    }

    /**
     * Create an instance of {@link GetExperimentsByIdsRequest }
     * 
     */
    public GetExperimentsByIdsRequest createGetExperimentsByIdsRequest() {
        return new GetExperimentsByIdsRequest();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link DeleteSharedEntitiesResponse }
     * 
     */
    public DeleteSharedEntitiesResponse createDeleteSharedEntitiesResponse() {
        return new DeleteSharedEntitiesResponse();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link UpdateKeywordsRequest }
     * 
     */
    public UpdateKeywordsRequest createUpdateKeywordsRequest() {
        return new UpdateKeywordsRequest();
    }

    /**
     * Create an instance of {@link AudienceCriterion }
     * 
     */
    public AudienceCriterion createAudienceCriterion() {
        return new AudienceCriterion();
    }

    /**
     * Create an instance of {@link AddAdGroupsResponse }
     * 
     */
    public AddAdGroupsResponse createAddAdGroupsResponse() {
        return new AddAdGroupsResponse();
    }

    /**
     * Create an instance of {@link CriterionBid }
     * 
     */
    public CriterionBid createCriterionBid() {
        return new CriterionBid();
    }

    /**
     * Create an instance of {@link AccountProperty }
     * 
     */
    public AccountProperty createAccountProperty() {
        return new AccountProperty();
    }

    /**
     * Create an instance of {@link GetKeywordsByEditorialStatusRequest }
     * 
     */
    public GetKeywordsByEditorialStatusRequest createGetKeywordsByEditorialStatusRequest() {
        return new GetKeywordsByEditorialStatusRequest();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link GetCampaignSizesByAccountIdResponse }
     * 
     */
    public GetCampaignSizesByAccountIdResponse createGetCampaignSizesByAccountIdResponse() {
        return new GetCampaignSizesByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignSize }
     * 
     */
    public ArrayOfCampaignSize createArrayOfCampaignSize() {
        return new ArrayOfCampaignSize();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionIdToEntityIdAssociation }
     * 
     */
    public ArrayOfAdExtensionIdToEntityIdAssociation createArrayOfAdExtensionIdToEntityIdAssociation() {
        return new ArrayOfAdExtensionIdToEntityIdAssociation();
    }

    /**
     * Create an instance of {@link AddAdExtensionsResponse }
     * 
     */
    public AddAdExtensionsResponse createAddAdExtensionsResponse() {
        return new AddAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionIdentity }
     * 
     */
    public ArrayOfAdExtensionIdentity createArrayOfAdExtensionIdentity() {
        return new ArrayOfAdExtensionIdentity();
    }

    /**
     * Create an instance of {@link DeleteCampaignCriterionsRequest }
     * 
     */
    public DeleteCampaignCriterionsRequest createDeleteCampaignCriterionsRequest() {
        return new DeleteCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link EditorialErrorCollection }
     * 
     */
    public EditorialErrorCollection createEditorialErrorCollection() {
        return new EditorialErrorCollection();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link TargetCpaBiddingScheme }
     * 
     */
    public TargetCpaBiddingScheme createTargetCpaBiddingScheme() {
        return new TargetCpaBiddingScheme();
    }

    /**
     * Create an instance of {@link UpdateKeywordsResponse }
     * 
     */
    public UpdateKeywordsResponse createUpdateKeywordsResponse() {
        return new UpdateKeywordsResponse();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link AppInstallGoal }
     * 
     */
    public AppInstallGoal createAppInstallGoal() {
        return new AppInstallGoal();
    }

    /**
     * Create an instance of {@link DayTime }
     * 
     */
    public DayTime createDayTime() {
        return new DayTime();
    }

    /**
     * Create an instance of {@link RuleItem }
     * 
     */
    public RuleItem createRuleItem() {
        return new RuleItem();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link ApplyProductPartitionActionsRequest }
     * 
     */
    public ApplyProductPartitionActionsRequest createApplyProductPartitionActionsRequest() {
        return new ApplyProductPartitionActionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupCriterionAction }
     * 
     */
    public ArrayOfAdGroupCriterionAction createArrayOfAdGroupCriterionAction() {
        return new ArrayOfAdGroupCriterionAction();
    }

    /**
     * Create an instance of {@link InStoreTransactionGoal }
     * 
     */
    public InStoreTransactionGoal createInStoreTransactionGoal() {
        return new InStoreTransactionGoal();
    }

    /**
     * Create an instance of {@link DeleteBudgetsRequest }
     * 
     */
    public DeleteBudgetsRequest createDeleteBudgetsRequest() {
        return new DeleteBudgetsRequest();
    }

    /**
     * Create an instance of {@link AdExtensionIdToEntityIdAssociation }
     * 
     */
    public AdExtensionIdToEntityIdAssociation createAdExtensionIdToEntityIdAssociation() {
        return new AdExtensionIdToEntityIdAssociation();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsRequest }
     * 
     */
    public GetSharedEntityAssociationsByEntityIdsRequest createGetSharedEntityAssociationsByEntityIdsRequest() {
        return new GetSharedEntityAssociationsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link AddLabelsRequest }
     * 
     */
    public AddLabelsRequest createAddLabelsRequest() {
        return new AddLabelsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfLabel }
     * 
     */
    public ArrayOfLabel createArrayOfLabel() {
        return new ArrayOfLabel();
    }

    /**
     * Create an instance of {@link AddCampaignsRequest }
     * 
     */
    public AddCampaignsRequest createAddCampaignsRequest() {
        return new AddCampaignsRequest();
    }

    /**
     * Create an instance of {@link AddAdsRequest }
     * 
     */
    public AddAdsRequest createAddAdsRequest() {
        return new AddAdsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdGroupCriterionsRequest }
     * 
     */
    public DeleteAdGroupCriterionsRequest createDeleteAdGroupCriterionsRequest() {
        return new DeleteAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsAssociationsResponse }
     * 
     */
    public DeleteAdExtensionsAssociationsResponse createDeleteAdExtensionsAssociationsResponse() {
        return new DeleteAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link AddBudgetsRequest }
     * 
     */
    public AddBudgetsRequest createAddBudgetsRequest() {
        return new AddBudgetsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBudget }
     * 
     */
    public ArrayOfBudget createArrayOfBudget() {
        return new ArrayOfBudget();
    }

    /**
     * Create an instance of {@link ConversionGoalRevenue }
     * 
     */
    public ConversionGoalRevenue createConversionGoalRevenue() {
        return new ConversionGoalRevenue();
    }

    /**
     * Create an instance of {@link ArrayOfAdType }
     * 
     */
    public ArrayOfAdType createArrayOfAdType() {
        return new ArrayOfAdType();
    }

    /**
     * Create an instance of {@link AppealEditorialRejectionsRequest }
     * 
     */
    public AppealEditorialRejectionsRequest createAppealEditorialRejectionsRequest() {
        return new AppealEditorialRejectionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEntityIdToParentIdAssociation }
     * 
     */
    public ArrayOfEntityIdToParentIdAssociation createArrayOfEntityIdToParentIdAssociation() {
        return new ArrayOfEntityIdToParentIdAssociation();
    }

    /**
     * Create an instance of {@link CampaignSize }
     * 
     */
    public CampaignSize createCampaignSize() {
        return new CampaignSize();
    }

    /**
     * Create an instance of {@link GetExperimentsByIdsResponse }
     * 
     */
    public GetExperimentsByIdsResponse createGetExperimentsByIdsResponse() {
        return new GetExperimentsByIdsResponse();
    }

    /**
     * Create an instance of {@link UpdateBudgetsRequest }
     * 
     */
    public UpdateBudgetsRequest createUpdateBudgetsRequest() {
        return new UpdateBudgetsRequest();
    }

    /**
     * Create an instance of {@link GetCampaignSizesByAccountIdRequest }
     * 
     */
    public GetCampaignSizesByAccountIdRequest createGetCampaignSizesByAccountIdRequest() {
        return new GetCampaignSizesByAccountIdRequest();
    }

    /**
     * Create an instance of {@link MediaAssociation }
     * 
     */
    public MediaAssociation createMediaAssociation() {
        return new MediaAssociation();
    }

    /**
     * Create an instance of {@link GetAdExtensionsByIdsResponse }
     * 
     */
    public GetAdExtensionsByIdsResponse createGetAdExtensionsByIdsResponse() {
        return new GetAdExtensionsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtension }
     * 
     */
    public ArrayOfAdExtension createArrayOfAdExtension() {
        return new ArrayOfAdExtension();
    }

    /**
     * Create an instance of {@link UpdateAdExtensionsRequest }
     * 
     */
    public UpdateAdExtensionsRequest createUpdateAdExtensionsRequest() {
        return new UpdateAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsRequest }
     * 
     */
    public DeleteAdExtensionsRequest createDeleteAdExtensionsRequest() {
        return new DeleteAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link UpdateBudgetsResponse }
     * 
     */
    public UpdateBudgetsResponse createUpdateBudgetsResponse() {
        return new UpdateBudgetsResponse();
    }

    /**
     * Create an instance of {@link SimilarRemarketingList }
     * 
     */
    public SimilarRemarketingList createSimilarRemarketingList() {
        return new SimilarRemarketingList();
    }

    /**
     * Create an instance of {@link EditorialApiFaultDetail }
     * 
     */
    public EditorialApiFaultDetail createEditorialApiFaultDetail() {
        return new EditorialApiFaultDetail();
    }

    /**
     * Create an instance of {@link RuleItemGroup }
     * 
     */
    public RuleItemGroup createRuleItemGroup() {
        return new RuleItemGroup();
    }

    /**
     * Create an instance of {@link GetAdGroupCriterionsByIdsRequest }
     * 
     */
    public GetAdGroupCriterionsByIdsRequest createGetAdGroupCriterionsByIdsRequest() {
        return new GetAdGroupCriterionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetProfileDataFileUrlRequest }
     * 
     */
    public GetProfileDataFileUrlRequest createGetProfileDataFileUrlRequest() {
        return new GetProfileDataFileUrlRequest();
    }

    /**
     * Create an instance of {@link AddNegativeKeywordsToEntitiesResponse }
     * 
     */
    public AddNegativeKeywordsToEntitiesResponse createAddNegativeKeywordsToEntitiesResponse() {
        return new AddNegativeKeywordsToEntitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIdCollection }
     * 
     */
    public ArrayOfIdCollection createArrayOfIdCollection() {
        return new ArrayOfIdCollection();
    }

    /**
     * Create an instance of {@link GetAdsByEditorialStatusRequest }
     * 
     */
    public GetAdsByEditorialStatusRequest createGetAdsByEditorialStatusRequest() {
        return new GetAdsByEditorialStatusRequest();
    }

    /**
     * Create an instance of {@link AddCampaignsResponse }
     * 
     */
    public AddCampaignsResponse createAddCampaignsResponse() {
        return new AddCampaignsResponse();
    }

    /**
     * Create an instance of {@link AddAdGroupCriterionsResponse }
     * 
     */
    public AddAdGroupCriterionsResponse createAddAdGroupCriterionsResponse() {
        return new AddAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdRequest }
     * 
     */
    public GetAdExtensionIdsByAccountIdRequest createGetAdExtensionIdsByAccountIdRequest() {
        return new GetAdExtensionIdsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link EntityIdToParentIdAssociation }
     * 
     */
    public EntityIdToParentIdAssociation createEntityIdToParentIdAssociation() {
        return new EntityIdToParentIdAssociation();
    }

    /**
     * Create an instance of {@link GetBSCCountriesResponse }
     * 
     */
    public GetBSCCountriesResponse createGetBSCCountriesResponse() {
        return new GetBSCCountriesResponse();
    }

    /**
     * Create an instance of {@link FixedBid }
     * 
     */
    public FixedBid createFixedBid() {
        return new FixedBid();
    }

    /**
     * Create an instance of {@link ProductAd }
     * 
     */
    public ProductAd createProductAd() {
        return new ProductAd();
    }

    /**
     * Create an instance of {@link GetAdGroupsByCampaignIdResponse }
     * 
     */
    public GetAdGroupsByCampaignIdResponse createGetAdGroupsByCampaignIdResponse() {
        return new GetAdGroupsByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link GetMediaAssociationsRequest }
     * 
     */
    public GetMediaAssociationsRequest createGetMediaAssociationsRequest() {
        return new GetMediaAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetKeywordsByAdGroupIdResponse }
     * 
     */
    public GetKeywordsByAdGroupIdResponse createGetKeywordsByAdGroupIdResponse() {
        return new GetKeywordsByAdGroupIdResponse();
    }

    /**
     * Create an instance of {@link UpdateConversionGoalsRequest }
     * 
     */
    public UpdateConversionGoalsRequest createUpdateConversionGoalsRequest() {
        return new UpdateConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link AdGroupCriterion }
     * 
     */
    public AdGroupCriterion createAdGroupCriterion() {
        return new AdGroupCriterion();
    }

    /**
     * Create an instance of {@link UpdateAdGroupsRequest }
     * 
     */
    public UpdateAdGroupsRequest createUpdateAdGroupsRequest() {
        return new UpdateAdGroupsRequest();
    }

    /**
     * Create an instance of {@link CustomParameter }
     * 
     */
    public CustomParameter createCustomParameter() {
        return new CustomParameter();
    }

    /**
     * Create an instance of {@link GetKeywordsByIdsRequest }
     * 
     */
    public GetKeywordsByIdsRequest createGetKeywordsByIdsRequest() {
        return new GetKeywordsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetEditorialReasonsByIdsRequest }
     * 
     */
    public GetEditorialReasonsByIdsRequest createGetEditorialReasonsByIdsRequest() {
        return new GetEditorialReasonsByIdsRequest();
    }

    /**
     * Create an instance of {@link PageVisitorsRule }
     * 
     */
    public PageVisitorsRule createPageVisitorsRule() {
        return new PageVisitorsRule();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignCriterion }
     * 
     */
    public ArrayOfCampaignCriterion createArrayOfCampaignCriterion() {
        return new ArrayOfCampaignCriterion();
    }

    /**
     * Create an instance of {@link Experiment }
     * 
     */
    public Experiment createExperiment() {
        return new Experiment();
    }

    /**
     * Create an instance of {@link ArrayOfMigrationStatusInfo }
     * 
     */
    public ArrayOfMigrationStatusInfo createArrayOfMigrationStatusInfo() {
        return new ArrayOfMigrationStatusInfo();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByLabelIdsResponse }
     * 
     */
    public GetLabelAssociationsByLabelIdsResponse createGetLabelAssociationsByLabelIdsResponse() {
        return new GetLabelAssociationsByLabelIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLabelAssociation }
     * 
     */
    public ArrayOfLabelAssociation createArrayOfLabelAssociation() {
        return new ArrayOfLabelAssociation();
    }

    /**
     * Create an instance of {@link AdExtensionEditorialReasonCollection }
     * 
     */
    public AdExtensionEditorialReasonCollection createAdExtensionEditorialReasonCollection() {
        return new AdExtensionEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link GetProfileDataFileUrlResponse }
     * 
     */
    public GetProfileDataFileUrlResponse createGetProfileDataFileUrlResponse() {
        return new GetProfileDataFileUrlResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaignsResponse }
     * 
     */
    public UpdateCampaignsResponse createUpdateCampaignsResponse() {
        return new UpdateCampaignsResponse();
    }

    /**
     * Create an instance of {@link NegativeAdGroupCriterion }
     * 
     */
    public NegativeAdGroupCriterion createNegativeAdGroupCriterion() {
        return new NegativeAdGroupCriterion();
    }

    /**
     * Create an instance of {@link UpdateCampaignsRequest }
     * 
     */
    public UpdateCampaignsRequest createUpdateCampaignsRequest() {
        return new UpdateCampaignsRequest();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToAdGroupsRequest }
     * 
     */
    public SetNegativeSitesToAdGroupsRequest createSetNegativeSitesToAdGroupsRequest() {
        return new SetNegativeSitesToAdGroupsRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdResponse }
     * 
     */
    public GetAdExtensionIdsByAccountIdResponse createGetAdExtensionIdsByAccountIdResponse() {
        return new GetAdExtensionIdsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link BiddableCampaignCriterion }
     * 
     */
    public BiddableCampaignCriterion createBiddableCampaignCriterion() {
        return new BiddableCampaignCriterion();
    }

    /**
     * Create an instance of {@link ApplyProductPartitionActionsResponse }
     * 
     */
    public ApplyProductPartitionActionsResponse createApplyProductPartitionActionsResponse() {
        return new ApplyProductPartitionActionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialReason }
     * 
     */
    public ArrayOfEditorialReason createArrayOfEditorialReason() {
        return new ArrayOfEditorialReason();
    }

    /**
     * Create an instance of {@link NegativeKeyword }
     * 
     */
    public NegativeKeyword createNegativeKeyword() {
        return new NegativeKeyword();
    }

    /**
     * Create an instance of {@link EventGoal }
     * 
     */
    public EventGoal createEventGoal() {
        return new EventGoal();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoVisitedAnotherPageRule }
     * 
     */
    public PageVisitorsWhoVisitedAnotherPageRule createPageVisitorsWhoVisitedAnotherPageRule() {
        return new PageVisitorsWhoVisitedAnotherPageRule();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsResponse }
     * 
     */
    public GetSharedEntityAssociationsByEntityIdsResponse createGetSharedEntityAssociationsByEntityIdsResponse() {
        return new GetSharedEntityAssociationsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link SetLabelAssociationsRequest }
     * 
     */
    public SetLabelAssociationsRequest createSetLabelAssociationsRequest() {
        return new SetLabelAssociationsRequest();
    }

    /**
     * Create an instance of {@link UpdateAudiencesRequest }
     * 
     */
    public UpdateAudiencesRequest createUpdateAudiencesRequest() {
        return new UpdateAudiencesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAudience }
     * 
     */
    public ArrayOfAudience createArrayOfAudience() {
        return new ArrayOfAudience();
    }

    /**
     * Create an instance of {@link GetEditorialReasonsByIdsResponse }
     * 
     */
    public GetEditorialReasonsByIdsResponse createGetEditorialReasonsByIdsResponse() {
        return new GetEditorialReasonsByIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdGroupsRequest }
     * 
     */
    public DeleteAdGroupsRequest createDeleteAdGroupsRequest() {
        return new DeleteAdGroupsRequest();
    }

    /**
     * Create an instance of {@link AdGroupNegativeSites }
     * 
     */
    public AdGroupNegativeSites createAdGroupNegativeSites() {
        return new AdGroupNegativeSites();
    }

    /**
     * Create an instance of {@link AddAudiencesRequest }
     * 
     */
    public AddAudiencesRequest createAddAudiencesRequest() {
        return new AddAudiencesRequest();
    }

    /**
     * Create an instance of {@link MaxConversionsBiddingScheme }
     * 
     */
    public MaxConversionsBiddingScheme createMaxConversionsBiddingScheme() {
        return new MaxConversionsBiddingScheme();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByLabelIdsRequest }
     * 
     */
    public GetLabelAssociationsByLabelIdsRequest createGetLabelAssociationsByLabelIdsRequest() {
        return new GetLabelAssociationsByLabelIdsRequest();
    }

    /**
     * Create an instance of {@link DynamicSearchAdsSetting }
     * 
     */
    public DynamicSearchAdsSetting createDynamicSearchAdsSetting() {
        return new DynamicSearchAdsSetting();
    }

    /**
     * Create an instance of {@link DeviceCriterion }
     * 
     */
    public DeviceCriterion createDeviceCriterion() {
        return new DeviceCriterion();
    }

    /**
     * Create an instance of {@link BMCStore }
     * 
     */
    public BMCStore createBMCStore() {
        return new BMCStore();
    }

    /**
     * Create an instance of {@link GetCampaignCriterionsByIdsResponse }
     * 
     */
    public GetCampaignCriterionsByIdsResponse createGetCampaignCriterionsByIdsResponse() {
        return new GetCampaignCriterionsByIdsResponse();
    }

    /**
     * Create an instance of {@link AddCampaignCriterionsRequest }
     * 
     */
    public AddCampaignCriterionsRequest createAddCampaignCriterionsRequest() {
        return new AddCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountProperty }
     * 
     */
    public ArrayOfAccountProperty createArrayOfAccountProperty() {
        return new ArrayOfAccountProperty();
    }

    /**
     * Create an instance of {@link LocationIntentCriterion }
     * 
     */
    public LocationIntentCriterion createLocationIntentCriterion() {
        return new LocationIntentCriterion();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignNegativeSites }
     * 
     */
    public ArrayOfCampaignNegativeSites createArrayOfCampaignNegativeSites() {
        return new ArrayOfCampaignNegativeSites();
    }

    /**
     * Create an instance of {@link UpdateCampaignCriterionsResponse }
     * 
     */
    public UpdateCampaignCriterionsResponse createUpdateCampaignCriterionsResponse() {
        return new UpdateCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link AddAudiencesResponse }
     * 
     */
    public AddAudiencesResponse createAddAudiencesResponse() {
        return new AddAudiencesResponse();
    }

    /**
     * Create an instance of {@link RemarketingList }
     * 
     */
    public RemarketingList createRemarketingList() {
        return new RemarketingList();
    }

    /**
     * Create an instance of {@link UpdateLabelsRequest }
     * 
     */
    public UpdateLabelsRequest createUpdateLabelsRequest() {
        return new UpdateLabelsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfWebpageCondition }
     * 
     */
    public ArrayOfWebpageCondition createArrayOfWebpageCondition() {
        return new ArrayOfWebpageCondition();
    }

    /**
     * Create an instance of {@link StringRuleItem }
     * 
     */
    public StringRuleItem createStringRuleItem() {
        return new StringRuleItem();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionsRequest }
     * 
     */
    public ApplyOfflineConversionsRequest createApplyOfflineConversionsRequest() {
        return new ApplyOfflineConversionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOfflineConversion }
     * 
     */
    public ArrayOfOfflineConversion createArrayOfOfflineConversion() {
        return new ArrayOfOfflineConversion();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsResponse }
     * 
     */
    public DeleteAdExtensionsResponse createDeleteAdExtensionsResponse() {
        return new DeleteAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link DeleteMediaRequest }
     * 
     */
    public DeleteMediaRequest createDeleteMediaRequest() {
        return new DeleteMediaRequest();
    }

    /**
     * Create an instance of {@link ShoppingSetting }
     * 
     */
    public ShoppingSetting createShoppingSetting() {
        return new ShoppingSetting();
    }

    /**
     * Create an instance of {@link GetKeywordsByAdGroupIdRequest }
     * 
     */
    public GetKeywordsByAdGroupIdRequest createGetKeywordsByAdGroupIdRequest() {
        return new GetKeywordsByAdGroupIdRequest();
    }

    /**
     * Create an instance of {@link GetBudgetsByIdsResponse }
     * 
     */
    public GetBudgetsByIdsResponse createGetBudgetsByIdsResponse() {
        return new GetBudgetsByIdsResponse();
    }

    /**
     * Create an instance of {@link AdGroupCriterionAction }
     * 
     */
    public AdGroupCriterionAction createAdGroupCriterionAction() {
        return new AdGroupCriterionAction();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionAssociation }
     * 
     */
    public ArrayOfAdExtensionAssociation createArrayOfAdExtensionAssociation() {
        return new ArrayOfAdExtensionAssociation();
    }

    /**
     * Create an instance of {@link UpdateAdGroupCriterionsResponse }
     * 
     */
    public UpdateAdGroupCriterionsResponse createUpdateAdGroupCriterionsResponse() {
        return new UpdateAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link AddSharedEntityResponse }
     * 
     */
    public AddSharedEntityResponse createAddSharedEntityResponse() {
        return new AddSharedEntityResponse();
    }

    /**
     * Create an instance of {@link SetSharedEntityAssociationsResponse }
     * 
     */
    public SetSharedEntityAssociationsResponse createSetSharedEntityAssociationsResponse() {
        return new SetSharedEntityAssociationsResponse();
    }

    /**
     * Create an instance of {@link AdRotation }
     * 
     */
    public AdRotation createAdRotation() {
        return new AdRotation();
    }

    /**
     * Create an instance of {@link BatchErrorCollection }
     * 
     */
    public BatchErrorCollection createBatchErrorCollection() {
        return new BatchErrorCollection();
    }

    /**
     * Create an instance of {@link RadiusCriterion }
     * 
     */
    public RadiusCriterion createRadiusCriterion() {
        return new RadiusCriterion();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByIdsRequest }
     * 
     */
    public GetConversionGoalsByIdsRequest createGetConversionGoalsByIdsRequest() {
        return new GetConversionGoalsByIdsRequest();
    }

    /**
     * Create an instance of {@link LocationAdExtension }
     * 
     */
    public LocationAdExtension createLocationAdExtension() {
        return new LocationAdExtension();
    }

    /**
     * Create an instance of {@link StructuredSnippetAdExtension }
     * 
     */
    public StructuredSnippetAdExtension createStructuredSnippetAdExtension() {
        return new StructuredSnippetAdExtension();
    }

    /**
     * Create an instance of {@link TextAsset }
     * 
     */
    public TextAsset createTextAsset() {
        return new TextAsset();
    }

    /**
     * Create an instance of {@link ConversionGoal }
     * 
     */
    public ConversionGoal createConversionGoal() {
        return new ConversionGoal();
    }

    /**
     * Create an instance of {@link SetAdExtensionsAssociationsResponse }
     * 
     */
    public SetAdExtensionsAssociationsResponse createSetAdExtensionsAssociationsResponse() {
        return new SetAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link CustomParameters }
     * 
     */
    public CustomParameters createCustomParameters() {
        return new CustomParameters();
    }

    /**
     * Create an instance of {@link ArrayOfAccountPropertyName }
     * 
     */
    public ArrayOfAccountPropertyName createArrayOfAccountPropertyName() {
        return new ArrayOfAccountPropertyName();
    }

    /**
     * Create an instance of {@link UpdateAudiencesResponse }
     * 
     */
    public UpdateAudiencesResponse createUpdateAudiencesResponse() {
        return new UpdateAudiencesResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionsAssociationsRequest }
     * 
     */
    public GetAdExtensionsAssociationsRequest createGetAdExtensionsAssociationsRequest() {
        return new GetAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetBMCStoresByCustomerIdResponse }
     * 
     */
    public GetBMCStoresByCustomerIdResponse createGetBMCStoresByCustomerIdResponse() {
        return new GetBMCStoresByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link BatchError }
     * 
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link UpdateAdExtensionsResponse }
     * 
     */
    public UpdateAdExtensionsResponse createUpdateAdExtensionsResponse() {
        return new UpdateAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link CampaignNegativeSites }
     * 
     */
    public CampaignNegativeSites createCampaignNegativeSites() {
        return new CampaignNegativeSites();
    }

    /**
     * Create an instance of {@link AddExperimentsRequest }
     * 
     */
    public AddExperimentsRequest createAddExperimentsRequest() {
        return new AddExperimentsRequest();
    }

    /**
     * Create an instance of {@link SetAdExtensionsAssociationsRequest }
     * 
     */
    public SetAdExtensionsAssociationsRequest createSetAdExtensionsAssociationsRequest() {
        return new SetAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link BiddingScheme }
     * 
     */
    public BiddingScheme createBiddingScheme() {
        return new BiddingScheme();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link GetAdsByAdGroupIdRequest }
     * 
     */
    public GetAdsByAdGroupIdRequest createGetAdsByAdGroupIdRequest() {
        return new GetAdsByAdGroupIdRequest();
    }

    /**
     * Create an instance of {@link AdExtension }
     * 
     */
    public AdExtension createAdExtension() {
        return new AdExtension();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBudgetIdsResponse }
     * 
     */
    public GetCampaignIdsByBudgetIdsResponse createGetCampaignIdsByBudgetIdsResponse() {
        return new GetCampaignIdsByBudgetIdsResponse();
    }

    /**
     * Create an instance of {@link ImageMediaRepresentation }
     * 
     */
    public ImageMediaRepresentation createImageMediaRepresentation() {
        return new ImageMediaRepresentation();
    }

    /**
     * Create an instance of {@link UpdateAdGroupsResponse }
     * 
     */
    public UpdateAdGroupsResponse createUpdateAdGroupsResponse() {
        return new UpdateAdGroupsResponse();
    }

    /**
     * Create an instance of {@link SharedEntityAssociation }
     * 
     */
    public SharedEntityAssociation createSharedEntityAssociation() {
        return new SharedEntityAssociation();
    }

    /**
     * Create an instance of {@link AddAdExtensionsRequest }
     * 
     */
    public AddAdExtensionsRequest createAddAdExtensionsRequest() {
        return new AddAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link PagesViewedPerVisitGoal }
     * 
     */
    public PagesViewedPerVisitGoal createPagesViewedPerVisitGoal() {
        return new PagesViewedPerVisitGoal();
    }

    /**
     * Create an instance of {@link GetAdsByEditorialStatusResponse }
     * 
     */
    public GetAdsByEditorialStatusResponse createGetAdsByEditorialStatusResponse() {
        return new GetAdsByEditorialStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateSharedEntitiesRequest }
     * 
     */
    public UpdateSharedEntitiesRequest createUpdateSharedEntitiesRequest() {
        return new UpdateSharedEntitiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSharedEntity }
     * 
     */
    public ArrayOfSharedEntity createArrayOfSharedEntity() {
        return new ArrayOfSharedEntity();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByAccountIdRequest }
     * 
     */
    public GetMediaMetaDataByAccountIdRequest createGetMediaMetaDataByAccountIdRequest() {
        return new GetMediaMetaDataByAccountIdRequest();
    }

    /**
     * Create an instance of {@link DeleteLabelAssociationsResponse }
     * 
     */
    public DeleteLabelAssociationsResponse createDeleteLabelAssociationsResponse() {
        return new DeleteLabelAssociationsResponse();
    }

    /**
     * Create an instance of {@link DeleteNegativeKeywordsFromEntitiesRequest }
     * 
     */
    public DeleteNegativeKeywordsFromEntitiesRequest createDeleteNegativeKeywordsFromEntitiesRequest() {
        return new DeleteNegativeKeywordsFromEntitiesRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByTagIdsRequest }
     * 
     */
    public GetConversionGoalsByTagIdsRequest createGetConversionGoalsByTagIdsRequest() {
        return new GetConversionGoalsByTagIdsRequest();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByIdsRequest }
     * 
     */
    public GetMediaMetaDataByIdsRequest createGetMediaMetaDataByIdsRequest() {
        return new GetMediaMetaDataByIdsRequest();
    }

    /**
     * Create an instance of {@link SetAccountPropertiesRequest }
     * 
     */
    public SetAccountPropertiesRequest createSetAccountPropertiesRequest() {
        return new SetAccountPropertiesRequest();
    }

    /**
     * Create an instance of {@link SetAccountPropertiesResponse }
     * 
     */
    public SetAccountPropertiesResponse createSetAccountPropertiesResponse() {
        return new SetAccountPropertiesResponse();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoDidNotVisitAnotherPageRule }
     * 
     */
    public PageVisitorsWhoDidNotVisitAnotherPageRule createPageVisitorsWhoDidNotVisitAnotherPageRule() {
        return new PageVisitorsWhoDidNotVisitAnotherPageRule();
    }

    /**
     * Create an instance of {@link UpdateCampaignCriterionsRequest }
     * 
     */
    public UpdateCampaignCriterionsRequest createUpdateCampaignCriterionsRequest() {
        return new UpdateCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToCampaignsRequest }
     * 
     */
    public SetNegativeSitesToCampaignsRequest createSetNegativeSitesToCampaignsRequest() {
        return new SetNegativeSitesToCampaignsRequest();
    }

    /**
     * Create an instance of {@link GetUetTagsByIdsResponse }
     * 
     */
    public GetUetTagsByIdsResponse createGetUetTagsByIdsResponse() {
        return new GetUetTagsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMediaRepresentation }
     * 
     */
    public ArrayOfMediaRepresentation createArrayOfMediaRepresentation() {
        return new ArrayOfMediaRepresentation();
    }

    /**
     * Create an instance of {@link ArrayOfTargetSettingDetail }
     * 
     */
    public ArrayOfTargetSettingDetail createArrayOfTargetSettingDetail() {
        return new ArrayOfTargetSettingDetail();
    }

    /**
     * Create an instance of {@link CampaignCriterion }
     * 
     */
    public CampaignCriterion createCampaignCriterion() {
        return new CampaignCriterion();
    }

    /**
     * Create an instance of {@link PriceAdExtension }
     * 
     */
    public PriceAdExtension createPriceAdExtension() {
        return new PriceAdExtension();
    }

    /**
     * Create an instance of {@link PriceTableRow }
     * 
     */
    public PriceTableRow createPriceTableRow() {
        return new PriceTableRow();
    }

    /**
     * Create an instance of {@link AdGroup }
     * 
     */
    public AdGroup createAdGroup() {
        return new AdGroup();
    }

    /**
     * Create an instance of {@link ResponsiveAd }
     * 
     */
    public ResponsiveAd createResponsiveAd() {
        return new ResponsiveAd();
    }

    /**
     * Create an instance of {@link ManualCpcBiddingScheme }
     * 
     */
    public ManualCpcBiddingScheme createManualCpcBiddingScheme() {
        return new ManualCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link CalloutAdExtension }
     * 
     */
    public CalloutAdExtension createCalloutAdExtension() {
        return new CalloutAdExtension();
    }

    /**
     * Create an instance of {@link UpdateUetTagsRequest }
     * 
     */
    public UpdateUetTagsRequest createUpdateUetTagsRequest() {
        return new UpdateUetTagsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSetting }
     * 
     */
    public ArrayOfSetting createArrayOfSetting() {
        return new ArrayOfSetting();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToCampaignsResponse }
     * 
     */
    public SetNegativeSitesToCampaignsResponse createSetNegativeSitesToCampaignsResponse() {
        return new SetNegativeSitesToCampaignsResponse();
    }

    /**
     * Create an instance of {@link GetAdGroupsByIdsResponse }
     * 
     */
    public GetAdGroupsByIdsResponse createGetAdGroupsByIdsResponse() {
        return new GetAdGroupsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetNegativeKeywordsByEntityIdsResponse }
     * 
     */
    public GetNegativeKeywordsByEntityIdsResponse createGetNegativeKeywordsByEntityIdsResponse() {
        return new GetNegativeKeywordsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link GetBudgetsByIdsRequest }
     * 
     */
    public GetBudgetsByIdsRequest createGetBudgetsByIdsRequest() {
        return new GetBudgetsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdGroupsByCampaignIdRequest }
     * 
     */
    public GetAdGroupsByCampaignIdRequest createGetAdGroupsByCampaignIdRequest() {
        return new GetAdGroupsByCampaignIdRequest();
    }

    /**
     * Create an instance of {@link GetAdsByIdsResponse }
     * 
     */
    public GetAdsByIdsResponse createGetAdsByIdsResponse() {
        return new GetAdsByIdsResponse();
    }

    /**
     * Create an instance of {@link AddSharedEntityRequest }
     * 
     */
    public AddSharedEntityRequest createAddSharedEntityRequest() {
        return new AddSharedEntityRequest();
    }

    /**
     * Create an instance of {@link SharedEntity }
     * 
     */
    public SharedEntity createSharedEntity() {
        return new SharedEntity();
    }

    /**
     * Create an instance of {@link DeleteCampaignsRequest }
     * 
     */
    public DeleteCampaignsRequest createDeleteCampaignsRequest() {
        return new DeleteCampaignsRequest();
    }

    /**
     * Create an instance of {@link DeleteSharedEntityAssociationsResponse }
     * 
     */
    public DeleteSharedEntityAssociationsResponse createDeleteSharedEntityAssociationsResponse() {
        return new DeleteSharedEntityAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialError }
     * 
     */
    public ArrayOfEditorialError createArrayOfEditorialError() {
        return new ArrayOfEditorialError();
    }

    /**
     * Create an instance of {@link GetBSCCountriesRequest }
     * 
     */
    public GetBSCCountriesRequest createGetBSCCountriesRequest() {
        return new GetBSCCountriesRequest();
    }

    /**
     * Create an instance of {@link AppUrl }
     * 
     */
    public AppUrl createAppUrl() {
        return new AppUrl();
    }

    /**
     * Create an instance of {@link GetCampaignsByIdsRequest }
     * 
     */
    public GetCampaignsByIdsRequest createGetCampaignsByIdsRequest() {
        return new GetCampaignsByIdsRequest();
    }

    /**
     * Create an instance of {@link InheritFromParentBiddingScheme }
     * 
     */
    public InheritFromParentBiddingScheme createInheritFromParentBiddingScheme() {
        return new InheritFromParentBiddingScheme();
    }

    /**
     * Create an instance of {@link CustomAudience }
     * 
     */
    public CustomAudience createCustomAudience() {
        return new CustomAudience();
    }

    /**
     * Create an instance of {@link CoOpSetting }
     * 
     */
    public CoOpSetting createCoOpSetting() {
        return new CoOpSetting();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsBySharedEntityIdsRequest }
     * 
     */
    public GetSharedEntityAssociationsBySharedEntityIdsRequest createGetSharedEntityAssociationsBySharedEntityIdsRequest() {
        return new GetSharedEntityAssociationsBySharedEntityIdsRequest();
    }

    /**
     * Create an instance of {@link AdExtensionEditorialReason }
     * 
     */
    public AdExtensionEditorialReason createAdExtensionEditorialReason() {
        return new AdExtensionEditorialReason();
    }

    /**
     * Create an instance of {@link UpdateAdGroupCriterionsRequest }
     * 
     */
    public UpdateAdGroupCriterionsRequest createUpdateAdGroupCriterionsRequest() {
        return new UpdateAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link MaxClicksBiddingScheme }
     * 
     */
    public MaxClicksBiddingScheme createMaxClicksBiddingScheme() {
        return new MaxClicksBiddingScheme();
    }

    /**
     * Create an instance of {@link GetAccountPropertiesResponse }
     * 
     */
    public GetAccountPropertiesResponse createGetAccountPropertiesResponse() {
        return new GetAccountPropertiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionAssociationCollection }
     * 
     */
    public ArrayOfAdExtensionAssociationCollection createArrayOfAdExtensionAssociationCollection() {
        return new ArrayOfAdExtensionAssociationCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionEditorialReason }
     * 
     */
    public ArrayOfAdExtensionEditorialReason createArrayOfAdExtensionEditorialReason() {
        return new ArrayOfAdExtensionEditorialReason();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByCampaignIdsRequest }
     * 
     */
    public GetNegativeSitesByCampaignIdsRequest createGetNegativeSitesByCampaignIdsRequest() {
        return new GetNegativeSitesByCampaignIdsRequest();
    }

    /**
     * Create an instance of {@link AddAdsResponse }
     * 
     */
    public AddAdsResponse createAddAdsResponse() {
        return new AddAdsResponse();
    }

    /**
     * Create an instance of {@link AdExtensionIdentity }
     * 
     */
    public AdExtensionIdentity createAdExtensionIdentity() {
        return new AdExtensionIdentity();
    }

    /**
     * Create an instance of {@link GetNegativeKeywordsByEntityIdsRequest }
     * 
     */
    public GetNegativeKeywordsByEntityIdsRequest createGetNegativeKeywordsByEntityIdsRequest() {
        return new GetNegativeKeywordsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link DeleteSharedEntitiesRequest }
     * 
     */
    public DeleteSharedEntitiesRequest createDeleteSharedEntitiesRequest() {
        return new DeleteSharedEntitiesRequest();
    }

    /**
     * Create an instance of {@link AddUetTagsRequest }
     * 
     */
    public AddUetTagsRequest createAddUetTagsRequest() {
        return new AddUetTagsRequest();
    }

    /**
     * Create an instance of {@link GetAdsByIdsRequest }
     * 
     */
    public GetAdsByIdsRequest createGetAdsByIdsRequest() {
        return new GetAdsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionsAssociationsResponse }
     * 
     */
    public GetAdExtensionsAssociationsResponse createGetAdExtensionsAssociationsResponse() {
        return new GetAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByCampaignIdsResponse }
     * 
     */
    public GetNegativeSitesByCampaignIdsResponse createGetNegativeSitesByCampaignIdsResponse() {
        return new GetNegativeSitesByCampaignIdsResponse();
    }

    /**
     * Create an instance of {@link GetLabelsByIdsResponse }
     * 
     */
    public GetLabelsByIdsResponse createGetLabelsByIdsResponse() {
        return new GetLabelsByIdsResponse();
    }

    /**
     * Create an instance of {@link AdExtensionAssociationCollection }
     * 
     */
    public AdExtensionAssociationCollection createAdExtensionAssociationCollection() {
        return new AdExtensionAssociationCollection();
    }

    /**
     * Create an instance of {@link DeleteKeywordsRequest }
     * 
     */
    public DeleteKeywordsRequest createDeleteKeywordsRequest() {
        return new DeleteKeywordsRequest();
    }

    /**
     * Create an instance of {@link AssetLink }
     * 
     */
    public AssetLink createAssetLink() {
        return new AssetLink();
    }

    /**
     * Create an instance of {@link GetBMCStoresByCustomerIdRequest }
     * 
     */
    public GetBMCStoresByCustomerIdRequest createGetBMCStoresByCustomerIdRequest() {
        return new GetBMCStoresByCustomerIdRequest();
    }

    /**
     * Create an instance of {@link DeleteNegativeKeywordsFromEntitiesResponse }
     * 
     */
    public DeleteNegativeKeywordsFromEntitiesResponse createDeleteNegativeKeywordsFromEntitiesResponse() {
        return new DeleteNegativeKeywordsFromEntitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItem }
     * 
     */
    public ArrayOfRuleItem createArrayOfRuleItem() {
        return new ArrayOfRuleItem();
    }

    /**
     * Create an instance of {@link DeleteLabelAssociationsRequest }
     * 
     */
    public DeleteLabelAssociationsRequest createDeleteLabelAssociationsRequest() {
        return new DeleteLabelAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetCampaignsByAccountIdResponse }
     * 
     */
    public GetCampaignsByAccountIdResponse createGetCampaignsByAccountIdResponse() {
        return new GetCampaignsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link BidMultiplier }
     * 
     */
    public BidMultiplier createBidMultiplier() {
        return new BidMultiplier();
    }

    /**
     * Create an instance of {@link TextAd }
     * 
     */
    public TextAd createTextAd() {
        return new TextAd();
    }

    /**
     * Create an instance of {@link UpdateExperimentsResponse }
     * 
     */
    public UpdateExperimentsResponse createUpdateExperimentsResponse() {
        return new UpdateExperimentsResponse();
    }

    /**
     * Create an instance of {@link SetSharedEntityAssociationsRequest }
     * 
     */
    public SetSharedEntityAssociationsRequest createSetSharedEntityAssociationsRequest() {
        return new SetSharedEntityAssociationsRequest();
    }

    /**
     * Create an instance of {@link AddCampaignCriterionsResponse }
     * 
     */
    public AddCampaignCriterionsResponse createAddCampaignCriterionsResponse() {
        return new AddCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link ProductScope }
     * 
     */
    public ProductScope createProductScope() {
        return new ProductScope();
    }

    /**
     * Create an instance of {@link OfflineConversion }
     * 
     */
    public OfflineConversion createOfflineConversion() {
        return new OfflineConversion();
    }

    /**
     * Create an instance of {@link ProfileCriterion }
     * 
     */
    public ProfileCriterion createProfileCriterion() {
        return new ProfileCriterion();
    }

    /**
     * Create an instance of {@link WebpageCondition }
     * 
     */
    public WebpageCondition createWebpageCondition() {
        return new WebpageCondition();
    }

    /**
     * Create an instance of {@link DeleteCampaignCriterionsResponse }
     * 
     */
    public DeleteCampaignCriterionsResponse createDeleteCampaignCriterionsResponse() {
        return new DeleteCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link AppInstallAd }
     * 
     */
    public AppInstallAd createAppInstallAd() {
        return new AppInstallAd();
    }

    /**
     * Create an instance of {@link DeleteAdGroupCriterionsResponse }
     * 
     */
    public DeleteAdGroupCriterionsResponse createDeleteAdGroupCriterionsResponse() {
        return new DeleteAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link ProductPartition }
     * 
     */
    public ProductPartition createProductPartition() {
        return new ProductPartition();
    }

    /**
     * Create an instance of {@link DeleteExperimentsResponse }
     * 
     */
    public DeleteExperimentsResponse createDeleteExperimentsResponse() {
        return new DeleteExperimentsResponse();
    }

    /**
     * Create an instance of {@link AddAdGroupsRequest }
     * 
     */
    public AddAdGroupsRequest createAddAdGroupsRequest() {
        return new AddAdGroupsRequest();
    }

    /**
     * Create an instance of {@link BiddableAdGroupCriterion }
     * 
     */
    public BiddableAdGroupCriterion createBiddableAdGroupCriterion() {
        return new BiddableAdGroupCriterion();
    }

    /**
     * Create an instance of {@link AdExtensionAssociation }
     * 
     */
    public AdExtensionAssociation createAdExtensionAssociation() {
        return new AdExtensionAssociation();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBudgetIdsRequest }
     * 
     */
    public GetCampaignIdsByBudgetIdsRequest createGetCampaignIdsByBudgetIdsRequest() {
        return new GetCampaignIdsByBudgetIdsRequest();
    }

    /**
     * Create an instance of {@link GetConfigValueResponse }
     * 
     */
    public GetConfigValueResponse createGetConfigValueResponse() {
        return new GetConfigValueResponse();
    }

    /**
     * Create an instance of {@link EditorialReasonCollection }
     * 
     */
    public EditorialReasonCollection createEditorialReasonCollection() {
        return new EditorialReasonCollection();
    }

    /**
     * Create an instance of {@link GetGeoLocationsFileUrlResponse }
     * 
     */
    public GetGeoLocationsFileUrlResponse createGetGeoLocationsFileUrlResponse() {
        return new GetGeoLocationsFileUrlResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPriceTableRow }
     * 
     */
    public ArrayOfPriceTableRow createArrayOfPriceTableRow() {
        return new ArrayOfPriceTableRow();
    }

    /**
     * Create an instance of {@link DeleteAudiencesResponse }
     * 
     */
    public DeleteAudiencesResponse createDeleteAudiencesResponse() {
        return new DeleteAudiencesResponse();
    }

    /**
     * Create an instance of {@link DeleteListItemsFromSharedListRequest }
     * 
     */
    public DeleteListItemsFromSharedListRequest createDeleteListItemsFromSharedListRequest() {
        return new DeleteListItemsFromSharedListRequest();
    }

    /**
     * Create an instance of {@link GenderCriterion }
     * 
     */
    public GenderCriterion createGenderCriterion() {
        return new GenderCriterion();
    }

    /**
     * Create an instance of {@link SetLabelAssociationsResponse }
     * 
     */
    public SetLabelAssociationsResponse createSetLabelAssociationsResponse() {
        return new SetLabelAssociationsResponse();
    }

    /**
     * Create an instance of {@link LocationCriterion }
     * 
     */
    public LocationCriterion createLocationCriterion() {
        return new LocationCriterion();
    }

    /**
     * Create an instance of {@link DeleteKeywordsResponse }
     * 
     */
    public DeleteKeywordsResponse createDeleteKeywordsResponse() {
        return new DeleteKeywordsResponse();
    }

    /**
     * Create an instance of {@link EntityNegativeKeyword }
     * 
     */
    public EntityNegativeKeyword createEntityNegativeKeyword() {
        return new EntityNegativeKeyword();
    }

    /**
     * Create an instance of {@link DeleteCampaignsResponse }
     * 
     */
    public DeleteCampaignsResponse createDeleteCampaignsResponse() {
        return new DeleteCampaignsResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionsEditorialReasonsRequest }
     * 
     */
    public GetAdExtensionsEditorialReasonsRequest createGetAdExtensionsEditorialReasonsRequest() {
        return new GetAdExtensionsEditorialReasonsRequest();
    }

    /**
     * Create an instance of {@link Setting }
     * 
     */
    public Setting createSetting() {
        return new Setting();
    }

    /**
     * Create an instance of {@link Media }
     * 
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link ExpandedTextAd }
     * 
     */
    public ExpandedTextAd createExpandedTextAd() {
        return new ExpandedTextAd();
    }

    /**
     * Create an instance of {@link AddBudgetsResponse }
     * 
     */
    public AddBudgetsResponse createAddBudgetsResponse() {
        return new AddBudgetsResponse();
    }

    /**
     * Create an instance of {@link OfflineConversionGoal }
     * 
     */
    public OfflineConversionGoal createOfflineConversionGoal() {
        return new OfflineConversionGoal();
    }

    /**
     * Create an instance of {@link UpdateSharedEntitiesResponse }
     * 
     */
    public UpdateSharedEntitiesResponse createUpdateSharedEntitiesResponse() {
        return new UpdateSharedEntitiesResponse();
    }

    /**
     * Create an instance of {@link MigrationStatusInfo }
     * 
     */
    public MigrationStatusInfo createMigrationStatusInfo() {
        return new MigrationStatusInfo();
    }

    /**
     * Create an instance of {@link AppealEditorialRejectionsResponse }
     * 
     */
    public AppealEditorialRejectionsResponse createAppealEditorialRejectionsResponse() {
        return new AppealEditorialRejectionsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsAssociationsRequest }
     * 
     */
    public DeleteAdExtensionsAssociationsRequest createDeleteAdExtensionsAssociationsRequest() {
        return new DeleteAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdsRequest }
     * 
     */
    public DeleteAdsRequest createDeleteAdsRequest() {
        return new DeleteAdsRequest();
    }

    /**
     * Create an instance of {@link AddExperimentsResponse }
     * 
     */
    public AddExperimentsResponse createAddExperimentsResponse() {
        return new AddExperimentsResponse();
    }

    /**
     * Create an instance of {@link DeleteLabelsRequest }
     * 
     */
    public DeleteLabelsRequest createDeleteLabelsRequest() {
        return new DeleteLabelsRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByIdsResponse }
     * 
     */
    public GetConversionGoalsByIdsResponse createGetConversionGoalsByIdsResponse() {
        return new GetConversionGoalsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByEntityIdsRequest }
     * 
     */
    public GetLabelAssociationsByEntityIdsRequest createGetLabelAssociationsByEntityIdsRequest() {
        return new GetLabelAssociationsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link ReviewAdExtension }
     * 
     */
    public ReviewAdExtension createReviewAdExtension() {
        return new ReviewAdExtension();
    }

    /**
     * Create an instance of {@link ArrayOfOperationError }
     * 
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
    }

    /**
     * Create an instance of {@link GetKeywordsByEditorialStatusResponse }
     * 
     */
    public GetKeywordsByEditorialStatusResponse createGetKeywordsByEditorialStatusResponse() {
        return new GetKeywordsByEditorialStatusResponse();
    }

    /**
     * Create an instance of {@link NegativeCampaignCriterion }
     * 
     */
    public NegativeCampaignCriterion createNegativeCampaignCriterion() {
        return new NegativeCampaignCriterion();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByEntityIdsResponse }
     * 
     */
    public GetLabelAssociationsByEntityIdsResponse createGetLabelAssociationsByEntityIdsResponse() {
        return new GetLabelAssociationsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link GetListItemsBySharedListResponse }
     * 
     */
    public GetListItemsBySharedListResponse createGetListItemsBySharedListResponse() {
        return new GetListItemsBySharedListResponse();
    }

    /**
     * Create an instance of {@link GetLabelsByIdsRequest }
     * 
     */
    public GetLabelsByIdsRequest createGetLabelsByIdsRequest() {
        return new GetLabelsByIdsRequest();
    }

    /**
     * Create an instance of {@link ResponsiveSearchAd }
     * 
     */
    public ResponsiveSearchAd createResponsiveSearchAd() {
        return new ResponsiveSearchAd();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesByAccountIdResponse }
     * 
     */
    public GetSharedEntitiesByAccountIdResponse createGetSharedEntitiesByAccountIdResponse() {
        return new GetSharedEntitiesByAccountIdResponse();
    }

    /**
     * Create an instance of {@link AccountMigrationStatusesInfo }
     * 
     */
    public AccountMigrationStatusesInfo createAccountMigrationStatusesInfo() {
        return new AccountMigrationStatusesInfo();
    }

    /**
     * Create an instance of {@link SitelinkAdExtension }
     * 
     */
    public SitelinkAdExtension createSitelinkAdExtension() {
        return new SitelinkAdExtension();
    }

    /**
     * Create an instance of {@link ActionAdExtension }
     * 
     */
    public ActionAdExtension createActionAdExtension() {
        return new ActionAdExtension();
    }

    /**
     * Create an instance of {@link AddMediaRequest }
     * 
     */
    public AddMediaRequest createAddMediaRequest() {
        return new AddMediaRequest();
    }

    /**
     * Create an instance of {@link GetAudiencesByIdsResponse }
     * 
     */
    public GetAudiencesByIdsResponse createGetAudiencesByIdsResponse() {
        return new GetAudiencesByIdsResponse();
    }

    /**
     * Create an instance of {@link UetTag }
     * 
     */
    public UetTag createUetTag() {
        return new UetTag();
    }

    /**
     * Create an instance of {@link UpdateLabelsResponse }
     * 
     */
    public UpdateLabelsResponse createUpdateLabelsResponse() {
        return new UpdateLabelsResponse();
    }

    /**
     * Create an instance of {@link MediaMetaData }
     * 
     */
    public MediaMetaData createMediaMetaData() {
        return new MediaMetaData();
    }

    /**
     * Create an instance of {@link AddConversionGoalsResponse }
     * 
     */
    public AddConversionGoalsResponse createAddConversionGoalsResponse() {
        return new AddConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link GetAdsByAdGroupIdResponse }
     * 
     */
    public GetAdsByAdGroupIdResponse createGetAdsByAdGroupIdResponse() {
        return new GetAdsByAdGroupIdResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link AgeCriterion }
     * 
     */
    public AgeCriterion createAgeCriterion() {
        return new AgeCriterion();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItemGroup }
     * 
     */
    public ArrayOfRuleItemGroup createArrayOfRuleItemGroup() {
        return new ArrayOfRuleItemGroup();
    }

    /**
     * Create an instance of {@link InMarketAudience }
     * 
     */
    public InMarketAudience createInMarketAudience() {
        return new InMarketAudience();
    }

    /**
     * Create an instance of {@link Webpage }
     * 
     */
    public Webpage createWebpage() {
        return new Webpage();
    }

    /**
     * Create an instance of {@link DeleteSharedEntityAssociationsRequest }
     * 
     */
    public DeleteSharedEntityAssociationsRequest createDeleteSharedEntityAssociationsRequest() {
        return new DeleteSharedEntityAssociationsRequest();
    }

    /**
     * Create an instance of {@link UpdateAdsRequest }
     * 
     */
    public UpdateAdsRequest createUpdateAdsRequest() {
        return new UpdateAdsRequest();
    }

    /**
     * Create an instance of {@link GetAccountPropertiesRequest }
     * 
     */
    public GetAccountPropertiesRequest createGetAccountPropertiesRequest() {
        return new GetAccountPropertiesRequest();
    }

    /**
     * Create an instance of {@link DeleteExperimentsRequest }
     * 
     */
    public DeleteExperimentsRequest createDeleteExperimentsRequest() {
        return new DeleteExperimentsRequest();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringstring }
     * 
     */
    public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
        return new KeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfstringstring }
     * 
     */
    public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring() {
        return new ArrayOfKeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Char }
     * 
     */
    public Char createChar() {
        return new Char();
    }

    /**
     * Create an instance of {@link Guid }
     * 
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link ApplicationFault }
     * 
     */
    public ApplicationFault createApplicationFault() {
        return new ApplicationFault();
    }

    /**
     * Create an instance of {@link AdApiError }
     * 
     */
    public AdApiError createAdApiError() {
        return new AdApiError();
    }

    /**
     * Create an instance of {@link ArrayOfAdApiError }
     * 
     */
    public ArrayOfAdApiError createArrayOfAdApiError() {
        return new ArrayOfAdApiError();
    }

    /**
     * Create an instance of {@link AdApiFaultDetail }
     * 
     */
    public AdApiFaultDetail createAdApiFaultDetail() {
        return new AdApiFaultDetail();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfEntityNegativeKeyword")
    public JAXBElement<ArrayOfEntityNegativeKeyword> createArrayOfEntityNegativeKeyword(ArrayOfEntityNegativeKeyword value) {
        return new JAXBElement<ArrayOfEntityNegativeKeyword>(_ArrayOfEntityNegativeKeyword_QNAME, ArrayOfEntityNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DynamicSearchAdsSetting")
    public JAXBElement<DynamicSearchAdsSetting> createDynamicSearchAdsSetting(DynamicSearchAdsSetting value) {
        return new JAXBElement<DynamicSearchAdsSetting>(_DynamicSearchAdsSetting_QNAME, DynamicSearchAdsSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxConversionsBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MaxConversionsBiddingScheme")
    public JAXBElement<MaxConversionsBiddingScheme> createMaxConversionsBiddingScheme(MaxConversionsBiddingScheme value) {
        return new JAXBElement<MaxConversionsBiddingScheme>(_MaxConversionsBiddingScheme_QNAME, MaxConversionsBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupNegativeSites")
    public JAXBElement<AdGroupNegativeSites> createAdGroupNegativeSites(AdGroupNegativeSites value) {
        return new JAXBElement<AdGroupNegativeSites>(_AdGroupNegativeSites_QNAME, AdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionsTypeFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionsTypeFilter")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<AdExtensionsTypeFilter>> createAdExtensionsTypeFilter(Collection<AdExtensionsTypeFilter> value) {
        return new JAXBElement<Collection<AdExtensionsTypeFilter>>(_AdExtensionsTypeFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AssociationType")
    public JAXBElement<AssociationType> createAssociationType(AssociationType value) {
        return new JAXBElement<AssociationType>(_AssociationType_QNAME, AssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Webpage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Webpage")
    public JAXBElement<Webpage> createWebpage(Webpage value) {
        return new JAXBElement<Webpage>(_Webpage_QNAME, Webpage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InMarketAudience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "InMarketAudience")
    public JAXBElement<InMarketAudience> createInMarketAudience(InMarketAudience value) {
        return new JAXBElement<InMarketAudience>(_InMarketAudience_QNAME, InMarketAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AgeCriterion")
    public JAXBElement<AgeCriterion> createAgeCriterion(AgeCriterion value) {
        return new JAXBElement<AgeCriterion>(_AgeCriterion_QNAME, AgeCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItemGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfRuleItemGroup")
    public JAXBElement<ArrayOfRuleItemGroup> createArrayOfRuleItemGroup(ArrayOfRuleItemGroup value) {
        return new JAXBElement<ArrayOfRuleItemGroup>(_ArrayOfRuleItemGroup_QNAME, ArrayOfRuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoVisitedAnotherPageRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PageVisitorsWhoVisitedAnotherPageRule")
    public JAXBElement<PageVisitorsWhoVisitedAnotherPageRule> createPageVisitorsWhoVisitedAnotherPageRule(PageVisitorsWhoVisitedAnotherPageRule value) {
        return new JAXBElement<PageVisitorsWhoVisitedAnotherPageRule>(_PageVisitorsWhoVisitedAnotherPageRule_QNAME, PageVisitorsWhoVisitedAnotherPageRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MediaMetaData")
    public JAXBElement<MediaMetaData> createMediaMetaData(MediaMetaData value) {
        return new JAXBElement<MediaMetaData>(_MediaMetaData_QNAME, MediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "UetTag")
    public JAXBElement<UetTag> createUetTag(UetTag value) {
        return new JAXBElement<UetTag>(_UetTag_QNAME, UetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "NegativeKeyword")
    public JAXBElement<NegativeKeyword> createNegativeKeyword(NegativeKeyword value) {
        return new JAXBElement<NegativeKeyword>(_NegativeKeyword_QNAME, NegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EventGoal")
    public JAXBElement<EventGoal> createEventGoal(EventGoal value) {
        return new JAXBElement<EventGoal>(_EventGoal_QNAME, EventGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignAdditionalField")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<CampaignAdditionalField>> createCampaignAdditionalField(Collection<CampaignAdditionalField> value) {
        return new JAXBElement<Collection<CampaignAdditionalField>>(_CampaignAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitelinkAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SitelinkAdExtension")
    public JAXBElement<SitelinkAdExtension> createSitelinkAdExtension(SitelinkAdExtension value) {
        return new JAXBElement<SitelinkAdExtension>(_SitelinkAdExtension_QNAME, SitelinkAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ActionAdExtension")
    public JAXBElement<ActionAdExtension> createActionAdExtension(ActionAdExtension value) {
        return new JAXBElement<ActionAdExtension>(_ActionAdExtension_QNAME, ActionAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfEditorialReason")
    public JAXBElement<ArrayOfEditorialReason> createArrayOfEditorialReason(ArrayOfEditorialReason value) {
        return new JAXBElement<ArrayOfEditorialReason>(_ArrayOfEditorialReason_QNAME, ArrayOfEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountMigrationStatusesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AccountMigrationStatusesInfo")
    public JAXBElement<AccountMigrationStatusesInfo> createAccountMigrationStatusesInfo(AccountMigrationStatusesInfo value) {
        return new JAXBElement<AccountMigrationStatusesInfo>(_AccountMigrationStatusesInfo_QNAME, AccountMigrationStatusesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiveSearchAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ResponsiveSearchAd")
    public JAXBElement<ResponsiveSearchAd> createResponsiveSearchAd(ResponsiveSearchAd value) {
        return new JAXBElement<ResponsiveSearchAd>(_ResponsiveSearchAd_QNAME, ResponsiveSearchAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DistanceUnit")
    public JAXBElement<DistanceUnit> createDistanceUnit(DistanceUnit value) {
        return new JAXBElement<DistanceUnit>(_DistanceUnit_QNAME, DistanceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddableCampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BiddableCampaignCriterion")
    public JAXBElement<BiddableCampaignCriterion> createBiddableCampaignCriterion(BiddableCampaignCriterion value) {
        return new JAXBElement<BiddableCampaignCriterion>(_BiddableCampaignCriterion_QNAME, BiddableCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntityAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfSharedEntityAssociation")
    public JAXBElement<ArrayOfSharedEntityAssociation> createArrayOfSharedEntityAssociation(ArrayOfSharedEntityAssociation value) {
        return new JAXBElement<ArrayOfSharedEntityAssociation>(_ArrayOfSharedEntityAssociation_QNAME, ArrayOfSharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtension")
    public JAXBElement<ArrayOfAdExtension> createArrayOfAdExtension(ArrayOfAdExtension value) {
        return new JAXBElement<ArrayOfAdExtension>(_ArrayOfAdExtension_QNAME, ArrayOfAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MigrationStatus")
    public JAXBElement<MigrationStatus> createMigrationStatus(MigrationStatus value) {
        return new JAXBElement<MigrationStatus>(_MigrationStatus_QNAME, MigrationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdGroupNegativeSites")
    public JAXBElement<ArrayOfAdGroupNegativeSites> createArrayOfAdGroupNegativeSites(ArrayOfAdGroupNegativeSites value) {
        return new JAXBElement<ArrayOfAdGroupNegativeSites>(_ArrayOfAdGroupNegativeSites_QNAME, ArrayOfAdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeCampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "NegativeCampaignCriterion")
    public JAXBElement<NegativeCampaignCriterion> createNegativeCampaignCriterion(NegativeCampaignCriterion value) {
        return new JAXBElement<NegativeCampaignCriterion>(_NegativeCampaignCriterion_QNAME, NegativeCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringstring")
    public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring value) {
        return new JAXBElement<KeyValuePairOfstringstring>(_KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviewAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ReviewAdExtension")
    public JAXBElement<ReviewAdExtension> createReviewAdExtension(ReviewAdExtension value) {
        return new JAXBElement<ReviewAdExtension>(_ReviewAdExtension_QNAME, ReviewAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupCriterionType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupCriterionType")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<AdGroupCriterionType>> createAdGroupCriterionType(Collection<AdGroupCriterionType> value) {
        return new JAXBElement<Collection<AdGroupCriterionType>>(_AdGroupCriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "NegativeAdGroupCriterion")
    public JAXBElement<NegativeAdGroupCriterion> createNegativeAdGroupCriterion(NegativeAdGroupCriterion value) {
        return new JAXBElement<NegativeAdGroupCriterion>(_NegativeAdGroupCriterion_QNAME, NegativeAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "StringOperator")
    public JAXBElement<StringOperator> createStringOperator(StringOperator value) {
        return new JAXBElement<StringOperator>(_StringOperator_QNAME, StringOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfSharedListItem")
    public JAXBElement<ArrayOfSharedListItem> createArrayOfSharedListItem(ArrayOfSharedListItem value) {
        return new JAXBElement<ArrayOfSharedListItem>(_ArrayOfSharedListItem_QNAME, ArrayOfSharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AudienceType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AudienceType")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<AudienceType>> createAudienceType(Collection<AudienceType> value) {
        return new JAXBElement<Collection<AudienceType>>(_AudienceType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionEditorialReasonCollection")
    public JAXBElement<AdExtensionEditorialReasonCollection> createAdExtensionEditorialReasonCollection(AdExtensionEditorialReasonCollection value) {
        return new JAXBElement<AdExtensionEditorialReasonCollection>(_AdExtensionEditorialReasonCollection_QNAME, AdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EntityType")
    public JAXBElement<EntityType> createEntityType(EntityType value) {
        return new JAXBElement<EntityType>(_EntityType_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MigrationStatusInfo")
    public JAXBElement<MigrationStatusInfo> createMigrationStatusInfo(MigrationStatusInfo value) {
        return new JAXBElement<MigrationStatusInfo>(_MigrationStatusInfo_QNAME, MigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfIdCollection")
    public JAXBElement<ArrayOfIdCollection> createArrayOfIdCollection(ArrayOfIdCollection value) {
        return new JAXBElement<ArrayOfIdCollection>(_ArrayOfIdCollection_QNAME, ArrayOfIdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfSharedEntity")
    public JAXBElement<ArrayOfSharedEntity> createArrayOfSharedEntity(ArrayOfSharedEntity value) {
        return new JAXBElement<ArrayOfSharedEntity>(_ArrayOfSharedEntity_QNAME, ArrayOfSharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BidOption")
    public JAXBElement<BidOption> createBidOption(BidOption value) {
        return new JAXBElement<BidOption>(_BidOption_QNAME, BidOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMigrationStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfMigrationStatusInfo")
    public JAXBElement<ArrayOfMigrationStatusInfo> createArrayOfMigrationStatusInfo(ArrayOfMigrationStatusInfo value) {
        return new JAXBElement<ArrayOfMigrationStatusInfo>(_ArrayOfMigrationStatusInfo_QNAME, ArrayOfMigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpandedTextAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ExpandedTextAd")
    public JAXBElement<ExpandedTextAd> createExpandedTextAd(ExpandedTextAd value) {
        return new JAXBElement<ExpandedTextAd>(_ExpandedTextAd_QNAME, ExpandedTextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineConversionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "OfflineConversionGoal")
    public JAXBElement<OfflineConversionGoal> createOfflineConversionGoal(OfflineConversionGoal value) {
        return new JAXBElement<OfflineConversionGoal>(_OfflineConversionGoal_QNAME, OfflineConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Media }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Media")
    public JAXBElement<Media> createMedia(Media value) {
        return new JAXBElement<Media>(_Media_QNAME, Media.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<Paging>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Setting")
    public JAXBElement<Setting> createSetting(Setting value) {
        return new JAXBElement<Setting>(_Setting_QNAME, Setting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfCampaignCriterion")
    public JAXBElement<ArrayOfCampaignCriterion> createArrayOfCampaignCriterion(ArrayOfCampaignCriterion value) {
        return new JAXBElement<ArrayOfCampaignCriterion>(_ArrayOfCampaignCriterion_QNAME, ArrayOfCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Experiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Experiment")
    public JAXBElement<Experiment> createExperiment(Experiment value) {
        return new JAXBElement<Experiment>(_Experiment_QNAME, Experiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalRevenueType")
    public JAXBElement<ConversionGoalRevenueType> createConversionGoalRevenueType(ConversionGoalRevenueType value) {
        return new JAXBElement<ConversionGoalRevenueType>(_ConversionGoalRevenueType_QNAME, ConversionGoalRevenueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PageVisitorsRule")
    public JAXBElement<PageVisitorsRule> createPageVisitorsRule(PageVisitorsRule value) {
        return new JAXBElement<PageVisitorsRule>(_PageVisitorsRule_QNAME, PageVisitorsRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLabel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfLabel")
    public JAXBElement<ArrayOfLabel> createArrayOfLabel(ArrayOfLabel value) {
        return new JAXBElement<ArrayOfLabel>(_ArrayOfLabel_QNAME, ArrayOfLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomParameter")
    public JAXBElement<CustomParameter> createCustomParameter(CustomParameter value) {
        return new JAXBElement<CustomParameter>(_CustomParameter_QNAME, CustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EntityNegativeKeyword")
    public JAXBElement<EntityNegativeKeyword> createEntityNegativeKeyword(EntityNegativeKeyword value) {
        return new JAXBElement<EntityNegativeKeyword>(_EntityNegativeKeyword_QNAME, EntityNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupCriterion")
    public JAXBElement<AdGroupCriterion> createAdGroupCriterion(AdGroupCriterion value) {
        return new JAXBElement<AdGroupCriterion>(_AdGroupCriterion_QNAME, AdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdGroupCriterion")
    public JAXBElement<ArrayOfAdGroupCriterion> createArrayOfAdGroupCriterion(ArrayOfAdGroupCriterion value) {
        return new JAXBElement<ArrayOfAdGroupCriterion>(_ArrayOfAdGroupCriterion_QNAME, ArrayOfAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "LocationCriterion")
    public JAXBElement<LocationCriterion> createLocationCriterion(LocationCriterion value) {
        return new JAXBElement<LocationCriterion>(_LocationCriterion_QNAME, LocationCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductAd")
    public JAXBElement<ProductAd> createProductAd(ProductAd value) {
        return new JAXBElement<ProductAd>(_ProductAd_QNAME, ProductAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "GenderCriterion")
    public JAXBElement<GenderCriterion> createGenderCriterion(GenderCriterion value) {
        return new JAXBElement<GenderCriterion>(_GenderCriterion_QNAME, GenderCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionStatus")
    public JAXBElement<AdExtensionStatus> createAdExtensionStatus(AdExtensionStatus value) {
        return new JAXBElement<AdExtensionStatus>(_AdExtensionStatus_QNAME, AdExtensionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessGeoCodeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BusinessGeoCodeStatus")
    public JAXBElement<BusinessGeoCodeStatus> createBusinessGeoCodeStatus(BusinessGeoCodeStatus value) {
        return new JAXBElement<BusinessGeoCodeStatus>(_BusinessGeoCodeStatus_QNAME, BusinessGeoCodeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "FixedBid")
    public JAXBElement<FixedBid> createFixedBid(FixedBid value) {
        return new JAXBElement<FixedBid>(_FixedBid_QNAME, FixedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceTableRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfPriceTableRow")
    public JAXBElement<ArrayOfPriceTableRow> createArrayOfPriceTableRow(ArrayOfPriceTableRow value) {
        return new JAXBElement<ArrayOfPriceTableRow>(_ArrayOfPriceTableRow_QNAME, ArrayOfPriceTableRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfArrayOfMediaAssociation")
    public JAXBElement<ArrayOfArrayOfMediaAssociation> createArrayOfArrayOfMediaAssociation(ArrayOfArrayOfMediaAssociation value) {
        return new JAXBElement<ArrayOfArrayOfMediaAssociation>(_ArrayOfArrayOfMediaAssociation_QNAME, ArrayOfArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdToParentIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EntityIdToParentIdAssociation")
    public JAXBElement<EntityIdToParentIdAssociation> createEntityIdToParentIdAssociation(EntityIdToParentIdAssociation value) {
        return new JAXBElement<EntityIdToParentIdAssociation>(_EntityIdToParentIdAssociation_QNAME, EntityIdToParentIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EditorialReasonCollection")
    public JAXBElement<EditorialReasonCollection> createEditorialReasonCollection(EditorialReasonCollection value) {
        return new JAXBElement<EditorialReasonCollection>(_EditorialReasonCollection_QNAME, EditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityIdToParentIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfEntityIdToParentIdAssociation")
    public JAXBElement<ArrayOfEntityIdToParentIdAssociation> createArrayOfEntityIdToParentIdAssociation(ArrayOfEntityIdToParentIdAssociation value) {
        return new JAXBElement<ArrayOfEntityIdToParentIdAssociation>(_ArrayOfEntityIdToParentIdAssociation_QNAME, ArrayOfEntityIdToParentIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Day }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Day")
    public JAXBElement<Day> createDay(Day value) {
        return new JAXBElement<Day>(_Day_QNAME, Day.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionIdentity")
    public JAXBElement<ArrayOfAdExtensionIdentity> createArrayOfAdExtensionIdentity(ArrayOfAdExtensionIdentity value) {
        return new JAXBElement<ArrayOfAdExtensionIdentity>(_ArrayOfAdExtensionIdentity_QNAME, ArrayOfAdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionAssociation")
    public JAXBElement<AdExtensionAssociation> createAdExtensionAssociation(AdExtensionAssociation value) {
        return new JAXBElement<AdExtensionAssociation>(_AdExtensionAssociation_QNAME, AdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddableAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BiddableAdGroupCriterion")
    public JAXBElement<BiddableAdGroupCriterion> createBiddableAdGroupCriterion(BiddableAdGroupCriterion value) {
        return new JAXBElement<BiddableAdGroupCriterion>(_BiddableAdGroupCriterion_QNAME, BiddableAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionAdExtensionActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ActionAdExtensionActionType")
    public JAXBElement<ActionAdExtensionActionType> createActionAdExtensionActionType(ActionAdExtensionActionType value) {
        return new JAXBElement<ActionAdExtensionActionType>(_ActionAdExtensionActionType_QNAME, ActionAdExtensionActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionTypeGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CriterionTypeGroup")
    public JAXBElement<CriterionTypeGroup> createCriterionTypeGroup(CriterionTypeGroup value) {
        return new JAXBElement<CriterionTypeGroup>(_CriterionTypeGroup_QNAME, CriterionTypeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItemGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "RuleItemGroup")
    public JAXBElement<RuleItemGroup> createRuleItemGroup(RuleItemGroup value) {
        return new JAXBElement<RuleItemGroup>(_RuleItemGroup_QNAME, RuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "GenderType")
    public JAXBElement<GenderType> createGenderType(GenderType value) {
        return new JAXBElement<GenderType>(_GenderType_QNAME, GenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductPartition")
    public JAXBElement<ProductPartition> createProductPartition(ProductPartition value) {
        return new JAXBElement<ProductPartition>(_ProductPartition_QNAME, ProductPartition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EditorialApiFaultDetail")
    public JAXBElement<EditorialApiFaultDetail> createEditorialApiFaultDetail(EditorialApiFaultDetail value) {
        return new JAXBElement<EditorialApiFaultDetail>(_EditorialApiFaultDetail_QNAME, EditorialApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalStatus")
    public JAXBElement<ConversionGoalStatus> createConversionGoalStatus(ConversionGoalStatus value) {
        return new JAXBElement<ConversionGoalStatus>(_ConversionGoalStatus_QNAME, ConversionGoalStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignCriterionType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignCriterionType")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<CampaignCriterionType>> createCampaignCriterionType(Collection<CampaignCriterionType> value) {
        return new JAXBElement<Collection<CampaignCriterionType>>(_CampaignCriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AppInstallAd")
    public JAXBElement<AppInstallAd> createAppInstallAd(AppInstallAd value) {
        return new JAXBElement<AppInstallAd>(_AppInstallAd_QNAME, AppInstallAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CallToAction")
    public JAXBElement<CallToAction> createCallToAction(CallToAction value) {
        return new JAXBElement<CallToAction>(_CallToAction_QNAME, CallToAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Keyword")
    public JAXBElement<Keyword> createKeyword(Keyword value) {
        return new JAXBElement<Keyword>(_Keyword_QNAME, Keyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdEditorialStatus")
    public JAXBElement<AdEditorialStatus> createAdEditorialStatus(AdEditorialStatus value) {
        return new JAXBElement<AdEditorialStatus>(_AdEditorialStatus_QNAME, AdEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExperiment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfExperiment")
    public JAXBElement<ArrayOfExperiment> createArrayOfExperiment(ArrayOfExperiment value) {
        return new JAXBElement<ArrayOfExperiment>(_ArrayOfExperiment_QNAME, ArrayOfExperiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimilarRemarketingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SimilarRemarketingList")
    public JAXBElement<SimilarRemarketingList> createSimilarRemarketingList(SimilarRemarketingList value) {
        return new JAXBElement<SimilarRemarketingList>(_SimilarRemarketingList_QNAME, SimilarRemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SharedEntity")
    public JAXBElement<SharedEntity> createSharedEntity(SharedEntity value) {
        return new JAXBElement<SharedEntity>(_SharedEntity_QNAME, SharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "WebpageCondition")
    public JAXBElement<WebpageCondition> createWebpageCondition(WebpageCondition value) {
        return new JAXBElement<WebpageCondition>(_WebpageCondition_QNAME, WebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupCriterionEditorialStatus")
    public JAXBElement<AdGroupCriterionEditorialStatus> createAdGroupCriterionEditorialStatus(AdGroupCriterionEditorialStatus value) {
        return new JAXBElement<AdGroupCriterionEditorialStatus>(_AdGroupCriterionEditorialStatus_QNAME, AdGroupCriterionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProfileCriterion")
    public JAXBElement<ProfileCriterion> createProfileCriterion(ProfileCriterion value) {
        return new JAXBElement<ProfileCriterion>(_ProfileCriterion_QNAME, ProfileCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductScope")
    public JAXBElement<ProductScope> createProductScope(ProductScope value) {
        return new JAXBElement<ProductScope>(_ProductScope_QNAME, ProductScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "OfflineConversion")
    public JAXBElement<OfflineConversion> createOfflineConversion(OfflineConversion value) {
        return new JAXBElement<OfflineConversion>(_OfflineConversion_QNAME, OfflineConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Minute")
    public JAXBElement<Minute> createMinute(Minute value) {
        return new JAXBElement<Minute>(_Minute_QNAME, Minute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MediaAssociation")
    public JAXBElement<MediaAssociation> createMediaAssociation(MediaAssociation value) {
        return new JAXBElement<MediaAssociation>(_MediaAssociation_QNAME, MediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TextAd")
    public JAXBElement<TextAd> createTextAd(TextAd value) {
        return new JAXBElement<TextAd>(_TextAd_QNAME, TextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidMultiplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BidMultiplier")
    public JAXBElement<BidMultiplier> createBidMultiplier(BidMultiplier value) {
        return new JAXBElement<BidMultiplier>(_BidMultiplier_QNAME, BidMultiplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignSize")
    public JAXBElement<CampaignSize> createCampaignSize(CampaignSize value) {
        return new JAXBElement<CampaignSize>(_CampaignSize_QNAME, CampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignStatus")
    public JAXBElement<CampaignStatus> createCampaignStatus(CampaignStatus value) {
        return new JAXBElement<CampaignStatus>(_CampaignStatus_QNAME, CampaignStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfRuleItem")
    public JAXBElement<ArrayOfRuleItem> createArrayOfRuleItem(ArrayOfRuleItem value) {
        return new JAXBElement<ArrayOfRuleItem>(_ArrayOfRuleItem_QNAME, ArrayOfRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AssetLink")
    public JAXBElement<AssetLink> createAssetLink(AssetLink value) {
        return new JAXBElement<AssetLink>(_AssetLink_QNAME, AssetLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdType")
    public JAXBElement<ArrayOfAdType> createArrayOfAdType(ArrayOfAdType value) {
        return new JAXBElement<ArrayOfAdType>(_ArrayOfAdType_QNAME, ArrayOfAdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalRevenue")
    public JAXBElement<ConversionGoalRevenue> createConversionGoalRevenue(ConversionGoalRevenue value) {
        return new JAXBElement<ConversionGoalRevenue>(_ConversionGoalRevenue_QNAME, ConversionGoalRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionAssociationCollection")
    public JAXBElement<AdExtensionAssociationCollection> createAdExtensionAssociationCollection(AdExtensionAssociationCollection value) {
        return new JAXBElement<AdExtensionAssociationCollection>(_AdExtensionAssociationCollection_QNAME, AdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ItemAction")
    public JAXBElement<ItemAction> createItemAction(ItemAction value) {
        return new JAXBElement<ItemAction>(_ItemAction_QNAME, ItemAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionIdentity")
    public JAXBElement<AdExtensionIdentity> createAdExtensionIdentity(AdExtensionIdentity value) {
        return new JAXBElement<AdExtensionIdentity>(_AdExtensionIdentity_QNAME, AdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdToEntityIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionIdToEntityIdAssociation")
    public JAXBElement<AdExtensionIdToEntityIdAssociation> createAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<AdExtensionIdToEntityIdAssociation>(_AdExtensionIdToEntityIdAssociation_QNAME, AdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionEditorialReason")
    public JAXBElement<ArrayOfAdExtensionEditorialReason> createArrayOfAdExtensionEditorialReason(ArrayOfAdExtensionEditorialReason value) {
        return new JAXBElement<ArrayOfAdExtensionEditorialReason>(_ArrayOfAdExtensionEditorialReason_QNAME, ArrayOfAdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InStoreTransactionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "InStoreTransactionGoal")
    public JAXBElement<InStoreTransactionGoal> createInStoreTransactionGoal(InStoreTransactionGoal value) {
        return new JAXBElement<InStoreTransactionGoal>(_InStoreTransactionGoal_QNAME, InStoreTransactionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionAssociationCollection")
    public JAXBElement<ArrayOfAdExtensionAssociationCollection> createArrayOfAdExtensionAssociationCollection(ArrayOfAdExtensionAssociationCollection value) {
        return new JAXBElement<ArrayOfAdExtensionAssociationCollection>(_ArrayOfAdExtensionAssociationCollection_QNAME, ArrayOfAdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Asset")
    public JAXBElement<Asset> createAsset(Asset value) {
        return new JAXBElement<Asset>(_Asset_QNAME, Asset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "RuleItem")
    public JAXBElement<RuleItem> createRuleItem(RuleItem value) {
        return new JAXBElement<RuleItem>(_RuleItem_QNAME, RuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DayTime")
    public JAXBElement<DayTime> createDayTime(DayTime value) {
        return new JAXBElement<DayTime>(_DayTime_QNAME, DayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Network }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Network")
    public JAXBElement<Network> createNetwork(Network value) {
        return new JAXBElement<Network>(_Network_QNAME, Network.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionEditorialReasonCollection")
    public JAXBElement<ArrayOfAdExtensionEditorialReasonCollection> createArrayOfAdExtensionEditorialReasonCollection(ArrayOfAdExtensionEditorialReasonCollection value) {
        return new JAXBElement<ArrayOfAdExtensionEditorialReasonCollection>(_ArrayOfAdExtensionEditorialReasonCollection_QNAME, ArrayOfAdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "WebpageConditionOperand")
    public JAXBElement<WebpageConditionOperand> createWebpageConditionOperand(WebpageConditionOperand value) {
        return new JAXBElement<WebpageConditionOperand>(_WebpageConditionOperand_QNAME, WebpageConditionOperand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterionAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdGroupCriterionAction")
    public JAXBElement<ArrayOfAdGroupCriterionAction> createArrayOfAdGroupCriterionAction(ArrayOfAdGroupCriterionAction value) {
        return new JAXBElement<ArrayOfAdGroupCriterionAction>(_ArrayOfAdGroupCriterionAction_QNAME, ArrayOfAdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AppInstallGoal")
    public JAXBElement<AppInstallGoal> createAppInstallGoal(AppInstallGoal value) {
        return new JAXBElement<AppInstallGoal>(_AppInstallGoal_QNAME, AppInstallGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxClicksBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MaxClicksBiddingScheme")
    public JAXBElement<MaxClicksBiddingScheme> createMaxClicksBiddingScheme(MaxClicksBiddingScheme value) {
        return new JAXBElement<MaxClicksBiddingScheme>(_MaxClicksBiddingScheme_QNAME, MaxClicksBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EntityScope")
    public JAXBElement<EntityScope> createEntityScope(EntityScope value) {
        return new JAXBElement<EntityScope>(_EntityScope_QNAME, EntityScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCpaBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TargetCpaBiddingScheme")
    public JAXBElement<TargetCpaBiddingScheme> createTargetCpaBiddingScheme(TargetCpaBiddingScheme value) {
        return new JAXBElement<TargetCpaBiddingScheme>(_TargetCpaBiddingScheme_QNAME, TargetCpaBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalType")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<ConversionGoalType>> createConversionGoalType(Collection<ConversionGoalType> value) {
        return new JAXBElement<Collection<ConversionGoalType>>(_ConversionGoalType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLabelAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfLabelAssociation")
    public JAXBElement<ArrayOfLabelAssociation> createArrayOfLabelAssociation(ArrayOfLabelAssociation value) {
        return new JAXBElement<ArrayOfLabelAssociation>(_ArrayOfLabelAssociation_QNAME, ArrayOfLabelAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountMigrationStatusesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAccountMigrationStatusesInfo")
    public JAXBElement<ArrayOfAccountMigrationStatusesInfo> createArrayOfAccountMigrationStatusesInfo(ArrayOfAccountMigrationStatusesInfo value) {
        return new JAXBElement<ArrayOfAccountMigrationStatusesInfo>(_ArrayOfAccountMigrationStatusesInfo_QNAME, ArrayOfAccountMigrationStatusesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialErrorCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EditorialErrorCollection")
    public JAXBElement<EditorialErrorCollection> createEditorialErrorCollection(EditorialErrorCollection value) {
        return new JAXBElement<EditorialErrorCollection>(_EditorialErrorCollection_QNAME, EditorialErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdToEntityIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionIdToEntityIdAssociation")
    public JAXBElement<ArrayOfAdExtensionIdToEntityIdAssociation> createArrayOfAdExtensionIdToEntityIdAssociation(ArrayOfAdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<ArrayOfAdExtensionIdToEntityIdAssociation>(_ArrayOfAdExtensionIdToEntityIdAssociation_QNAME, ArrayOfAdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionEditorialReason")
    public JAXBElement<AdExtensionEditorialReason> createAdExtensionEditorialReason(AdExtensionEditorialReason value) {
        return new JAXBElement<AdExtensionEditorialReason>(_AdExtensionEditorialReason_QNAME, AdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Schedule")
    public JAXBElement<Schedule> createSchedule(Schedule value) {
        return new JAXBElement<Schedule>(_Schedule_QNAME, Schedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPrivacyStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupPrivacyStatus")
    public JAXBElement<AdGroupPrivacyStatus> createAdGroupPrivacyStatus(AdGroupPrivacyStatus value) {
        return new JAXBElement<AdGroupPrivacyStatus>(_AdGroupPrivacyStatus_QNAME, AdGroupPrivacyStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PriceUnit")
    public JAXBElement<PriceUnit> createPriceUnit(PriceUnit value) {
        return new JAXBElement<PriceUnit>(_PriceUnit_QNAME, PriceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoOpSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CoOpSetting")
    public JAXBElement<CoOpSetting> createCoOpSetting(CoOpSetting value) {
        return new JAXBElement<CoOpSetting>(_CoOpSetting_QNAME, CoOpSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AccountProperty")
    public JAXBElement<AccountProperty> createAccountProperty(AccountProperty value) {
        return new JAXBElement<AccountProperty>(_AccountProperty_QNAME, AccountProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomAudience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomAudience")
    public JAXBElement<CustomAudience> createCustomAudience(CustomAudience value) {
        return new JAXBElement<CustomAudience>(_CustomAudience_QNAME, CustomAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CriterionBid")
    public JAXBElement<CriterionBid> createCriterionBid(CriterionBid value) {
        return new JAXBElement<CriterionBid>(_CriterionBid_QNAME, CriterionBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InheritFromParentBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "InheritFromParentBiddingScheme")
    public JAXBElement<InheritFromParentBiddingScheme> createInheritFromParentBiddingScheme(InheritFromParentBiddingScheme value) {
        return new JAXBElement<InheritFromParentBiddingScheme>(_InheritFromParentBiddingScheme_QNAME, InheritFromParentBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdApiError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ArrayOfAdApiError")
    public JAXBElement<ArrayOfAdApiError> createArrayOfAdApiError(ArrayOfAdApiError value) {
        return new JAXBElement<ArrayOfAdApiError>(_ArrayOfAdApiError_QNAME, ArrayOfAdApiError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AppUrl")
    public JAXBElement<AppUrl> createAppUrl(AppUrl value) {
        return new JAXBElement<AppUrl>(_AppUrl_QNAME, AppUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AudienceCriterion")
    public JAXBElement<AudienceCriterion> createAudienceCriterion(AudienceCriterion value) {
        return new JAXBElement<AudienceCriterion>(_AudienceCriterion_QNAME, AudienceCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfEditorialError")
    public JAXBElement<ArrayOfEditorialError> createArrayOfEditorialError(ArrayOfEditorialError value) {
        return new JAXBElement<ArrayOfEditorialError>(_ArrayOfEditorialError_QNAME, ArrayOfEditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProductAudienceType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductAudienceType")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<ProductAudienceType>> createProductAudienceType(Collection<ProductAudienceType> value) {
        return new JAXBElement<Collection<ProductAudienceType>>(_ProductAudienceType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Bid")
    public JAXBElement<Bid> createBid(Bid value) {
        return new JAXBElement<Bid>(_Bid_QNAME, Bid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MediaRepresentation")
    public JAXBElement<MediaRepresentation> createMediaRepresentation(MediaRepresentation value) {
        return new JAXBElement<MediaRepresentation>(_MediaRepresentation_QNAME, MediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfOfflineConversion")
    public JAXBElement<ArrayOfOfflineConversion> createArrayOfOfflineConversion(ArrayOfOfflineConversion value) {
        return new JAXBElement<ArrayOfOfflineConversion>(_ArrayOfOfflineConversion_QNAME, ArrayOfOfflineConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Criterion")
    public JAXBElement<Criterion> createCriterion(Criterion value) {
        return new JAXBElement<Criterion>(_Criterion_QNAME, Criterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "KeywordStatus")
    public JAXBElement<KeywordStatus> createKeywordStatus(KeywordStatus value) {
        return new JAXBElement<KeywordStatus>(_KeywordStatus_QNAME, KeywordStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfCampaignSize")
    public JAXBElement<ArrayOfCampaignSize> createArrayOfCampaignSize(ArrayOfCampaignSize value) {
        return new JAXBElement<ArrayOfCampaignSize>(_ArrayOfCampaignSize_QNAME, ArrayOfCampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfSetting")
    public JAXBElement<ArrayOfSetting> createArrayOfSetting(ArrayOfSetting value) {
        return new JAXBElement<ArrayOfSetting>(_ArrayOfSetting_QNAME, ArrayOfSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ExpressionOperator")
    public JAXBElement<ExpressionOperator> createExpressionOperator(ExpressionOperator value) {
        return new JAXBElement<ExpressionOperator>(_ExpressionOperator_QNAME, ExpressionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpcBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ManualCpcBiddingScheme")
    public JAXBElement<ManualCpcBiddingScheme> createManualCpcBiddingScheme(ManualCpcBiddingScheme value) {
        return new JAXBElement<ManualCpcBiddingScheme>(_ManualCpcBiddingScheme_QNAME, ManualCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalloutAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CalloutAdExtension")
    public JAXBElement<CalloutAdExtension> createCalloutAdExtension(CalloutAdExtension value) {
        return new JAXBElement<CalloutAdExtension>(_CalloutAdExtension_QNAME, CalloutAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTagTrackingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "UetTagTrackingStatus")
    public JAXBElement<UetTagTrackingStatus> createUetTagTrackingStatus(UetTagTrackingStatus value) {
        return new JAXBElement<UetTagTrackingStatus>(_UetTagTrackingStatus_QNAME, UetTagTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiveAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ResponsiveAd")
    public JAXBElement<ResponsiveAd> createResponsiveAd(ResponsiveAd value) {
        return new JAXBElement<ResponsiveAd>(_ResponsiveAd_QNAME, ResponsiveAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroup")
    public JAXBElement<AdGroup> createAdGroup(AdGroup value) {
        return new JAXBElement<AdGroup>(_AdGroup_QNAME, AdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBMCStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfBMCStore")
    public JAXBElement<ArrayOfBMCStore> createArrayOfBMCStore(ArrayOfBMCStore value) {
        return new JAXBElement<ArrayOfBMCStore>(_ArrayOfBMCStore_QNAME, ArrayOfBMCStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceTableRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PriceTableRow")
    public JAXBElement<PriceTableRow> createPriceTableRow(PriceTableRow value) {
        return new JAXBElement<PriceTableRow>(_PriceTableRow_QNAME, PriceTableRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PriceAdExtension")
    public JAXBElement<PriceAdExtension> createPriceAdExtension(PriceAdExtension value) {
        return new JAXBElement<PriceAdExtension>(_PriceAdExtension_QNAME, PriceAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignCriterion")
    public JAXBElement<CampaignCriterion> createCampaignCriterion(CampaignCriterion value) {
        return new JAXBElement<CampaignCriterion>(_CampaignCriterion_QNAME, CampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EditorialReason")
    public JAXBElement<EditorialReason> createEditorialReason(EditorialReason value) {
        return new JAXBElement<EditorialReason>(_EditorialReason_QNAME, EditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalTrackingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalTrackingStatus")
    public JAXBElement<ConversionGoalTrackingStatus> createConversionGoalTrackingStatus(ConversionGoalTrackingStatus value) {
        return new JAXBElement<ConversionGoalTrackingStatus>(_ConversionGoalTrackingStatus_QNAME, ConversionGoalTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtensionEditorialStatus")
    public JAXBElement<AdExtensionEditorialStatus> createAdExtensionEditorialStatus(AdExtensionEditorialStatus value) {
        return new JAXBElement<AdExtensionEditorialStatus>(_AdExtensionEditorialStatus_QNAME, AdExtensionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetSettingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfTargetSettingDetail")
    public JAXBElement<ArrayOfTargetSettingDetail> createArrayOfTargetSettingDetail(ArrayOfTargetSettingDetail value) {
        return new JAXBElement<ArrayOfTargetSettingDetail>(_ArrayOfTargetSettingDetail_QNAME, ArrayOfTargetSettingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetSettingDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TargetSettingDetail")
    public JAXBElement<TargetSettingDetail> createTargetSettingDetail(TargetSettingDetail value) {
        return new JAXBElement<TargetSettingDetail>(_TargetSettingDetail_QNAME, TargetSettingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "WebpageParameter")
    public JAXBElement<WebpageParameter> createWebpageParameter(WebpageParameter value) {
        return new JAXBElement<WebpageParameter>(_WebpageParameter_QNAME, WebpageParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfMediaRepresentation")
    public JAXBElement<ArrayOfMediaRepresentation> createArrayOfMediaRepresentation(ArrayOfMediaRepresentation value) {
        return new JAXBElement<ArrayOfMediaRepresentation>(_ArrayOfMediaRepresentation_QNAME, ArrayOfMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Campaign")
    public JAXBElement<Campaign> createCampaign(Campaign value) {
        return new JAXBElement<Campaign>(_Campaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAd")
    public JAXBElement<ArrayOfAd> createArrayOfAd(ArrayOfAd value) {
        return new JAXBElement<ArrayOfAd>(_ArrayOfAd_QNAME, ArrayOfAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoDidNotVisitAnotherPageRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PageVisitorsWhoDidNotVisitAnotherPageRule")
    public JAXBElement<PageVisitorsWhoDidNotVisitAnotherPageRule> createPageVisitorsWhoDidNotVisitAnotherPageRule(PageVisitorsWhoDidNotVisitAnotherPageRule value) {
        return new JAXBElement<PageVisitorsWhoDidNotVisitAnotherPageRule>(_PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME, PageVisitorsWhoDidNotVisitAnotherPageRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SharedList")
    public JAXBElement<SharedList> createSharedList(SharedList value) {
        return new JAXBElement<SharedList>(_SharedList_QNAME, SharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ImageAdExtension")
    public JAXBElement<ImageAdExtension> createImageAdExtension(ImageAdExtension value) {
        return new JAXBElement<ImageAdExtension>(_ImageAdExtension_QNAME, ImageAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DynamicSearchAd")
    public JAXBElement<DynamicSearchAd> createDynamicSearchAd(DynamicSearchAd value) {
        return new JAXBElement<DynamicSearchAd>(_DynamicSearchAd_QNAME, DynamicSearchAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "RemarketingRule")
    public JAXBElement<RemarketingRule> createRemarketingRule(RemarketingRule value) {
        return new JAXBElement<RemarketingRule>(_RemarketingRule_QNAME, RemarketingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchErrorCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfBatchErrorCollection")
    public JAXBElement<ArrayOfBatchErrorCollection> createArrayOfBatchErrorCollection(ArrayOfBatchErrorCollection value) {
        return new JAXBElement<ArrayOfBatchErrorCollection>(_ArrayOfBatchErrorCollection_QNAME, ArrayOfBatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiError")
    public JAXBElement<AdApiError> createAdApiError(AdApiError value) {
        return new JAXBElement<AdApiError>(_AdApiError_QNAME, AdApiError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductCondition")
    public JAXBElement<ProductCondition> createProductCondition(ProductCondition value) {
        return new JAXBElement<ProductCondition>(_ProductCondition_QNAME, ProductCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagesViewedPerVisitGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PagesViewedPerVisitGoal")
    public JAXBElement<PagesViewedPerVisitGoal> createPagesViewedPerVisitGoal(PagesViewedPerVisitGoal value) {
        return new JAXBElement<PagesViewedPerVisitGoal>(_PagesViewedPerVisitGoal_QNAME, PagesViewedPerVisitGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CallAdExtension")
    public JAXBElement<CallAdExtension> createCallAdExtension(CallAdExtension value) {
        return new JAXBElement<CallAdExtension>(_CallAdExtension_QNAME, CallAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<CampaignType>> createCampaignType(Collection<CampaignType> value) {
        return new JAXBElement<Collection<CampaignType>>(_CampaignType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntityAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SharedEntityAssociation")
    public JAXBElement<SharedEntityAssociation> createSharedEntityAssociation(SharedEntityAssociation value) {
        return new JAXBElement<SharedEntityAssociation>(_SharedEntityAssociation_QNAME, SharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfCustomParameter")
    public JAXBElement<ArrayOfCustomParameter> createArrayOfCustomParameter(ArrayOfCustomParameter value) {
        return new JAXBElement<ArrayOfCustomParameter>(_ArrayOfCustomParameter_QNAME, ArrayOfCustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AppAdExtension")
    public JAXBElement<AppAdExtension> createAppAdExtension(AppAdExtension value) {
        return new JAXBElement<AppAdExtension>(_AppAdExtension_QNAME, AppAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaEnabledEntityFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MediaEnabledEntityFilter")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<MediaEnabledEntityFilter>> createMediaEnabledEntityFilter(Collection<MediaEnabledEntityFilter> value) {
        return new JAXBElement<Collection<MediaEnabledEntityFilter>>(_MediaEnabledEntityFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "GeoPoint")
    public JAXBElement<GeoPoint> createGeoPoint(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_GeoPoint_QNAME, GeoPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalCountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoalCountType")
    public JAXBElement<ConversionGoalCountType> createConversionGoalCountType(ConversionGoalCountType value) {
        return new JAXBElement<ConversionGoalCountType>(_ConversionGoalCountType_QNAME, ConversionGoalCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageMediaRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ImageMediaRepresentation")
    public JAXBElement<ImageMediaRepresentation> createImageMediaRepresentation(ImageMediaRepresentation value) {
        return new JAXBElement<ImageMediaRepresentation>(_ImageMediaRepresentation_QNAME, ImageMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DurationGoal")
    public JAXBElement<DurationGoal> createDurationGoal(DurationGoal value) {
        return new JAXBElement<DurationGoal>(_DurationGoal_QNAME, DurationGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ArrayOfNullableOflong")
    public JAXBElement<ArrayOfNullableOflong> createArrayOfNullableOflong(ArrayOfNullableOflong value) {
        return new JAXBElement<ArrayOfNullableOflong>(_ArrayOfNullableOflong_QNAME, ArrayOfNullableOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfCampaign")
    public JAXBElement<ArrayOfCampaign> createArrayOfCampaign(ArrayOfCampaign value) {
        return new JAXBElement<ArrayOfCampaign>(_ArrayOfCampaign_QNAME, ArrayOfCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdExtension")
    public JAXBElement<AdExtension> createAdExtension(AdExtension value) {
        return new JAXBElement<AdExtension>(_AdExtension_QNAME, AdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignCriterionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignCriterionStatus")
    public JAXBElement<CampaignCriterionStatus> createCampaignCriterionStatus(CampaignCriterionStatus value) {
        return new JAXBElement<CampaignCriterionStatus>(_CampaignCriterionStatus_QNAME, CampaignCriterionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAudience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductAudience")
    public JAXBElement<ProductAudience> createProductAudience(ProductAudience value) {
        return new JAXBElement<ProductAudience>(_ProductAudience_QNAME, ProductAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdType")
    public JAXBElement<AdType> createAdType(AdType value) {
        return new JAXBElement<AdType>(_AdType_QNAME, AdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfBudget")
    public JAXBElement<ArrayOfBudget> createArrayOfBudget(ArrayOfBudget value) {
        return new JAXBElement<ArrayOfBudget>(_ArrayOfBudget_QNAME, ArrayOfBudget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Label")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<Label>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfNegativeKeyword")
    public JAXBElement<ArrayOfNegativeKeyword> createArrayOfNegativeKeyword(ArrayOfNegativeKeyword value) {
        return new JAXBElement<ArrayOfNegativeKeyword>(_ArrayOfNegativeKeyword_QNAME, ArrayOfNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BiddingScheme")
    public JAXBElement<BiddingScheme> createBiddingScheme(BiddingScheme value) {
        return new JAXBElement<BiddingScheme>(_BiddingScheme_QNAME, BiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DynamicSearchAdsSource")
    public JAXBElement<DynamicSearchAdsSource> createDynamicSearchAdsSource(DynamicSearchAdsSource value) {
        return new JAXBElement<DynamicSearchAdsSource>(_DynamicSearchAdsSource_QNAME, DynamicSearchAdsSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfProductCondition")
    public JAXBElement<ArrayOfProductCondition> createArrayOfProductCondition(ArrayOfProductCondition value) {
        return new JAXBElement<ArrayOfProductCondition>(_ArrayOfProductCondition_QNAME, ArrayOfProductCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfKeyword")
    public JAXBElement<ArrayOfKeyword> createArrayOfKeyword(ArrayOfKeyword value) {
        return new JAXBElement<ArrayOfKeyword>(_ArrayOfKeyword_QNAME, ArrayOfKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "SharedListItem")
    public JAXBElement<SharedListItem> createSharedListItem(SharedListItem value) {
        return new JAXBElement<SharedListItem>(_SharedListItem_QNAME, SharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceQualifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PriceQualifier")
    public JAXBElement<PriceQualifier> createPriceQualifier(PriceQualifier value) {
        return new JAXBElement<PriceQualifier>(_PriceQualifier_QNAME, PriceQualifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPropertyName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AccountPropertyName")
    public JAXBElement<AccountPropertyName> createAccountPropertyName(AccountPropertyName value) {
        return new JAXBElement<AccountPropertyName>(_AccountPropertyName_QNAME, AccountPropertyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAppUrl")
    public JAXBElement<ArrayOfAppUrl> createArrayOfAppUrl(ArrayOfAppUrl value) {
        return new JAXBElement<ArrayOfAppUrl>(_ArrayOfAppUrl_QNAME, ArrayOfAppUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CampaignNegativeSites")
    public JAXBElement<CampaignNegativeSites> createCampaignNegativeSites(CampaignNegativeSites value) {
        return new JAXBElement<CampaignNegativeSites>(_CampaignNegativeSites_QNAME, CampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "MatchType")
    public JAXBElement<MatchType> createMatchType(MatchType value) {
        return new JAXBElement<MatchType>(_MatchType_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ValueOperator")
    public JAXBElement<ValueOperator> createValueOperator(ValueOperator value) {
        return new JAXBElement<ValueOperator>(_ValueOperator_QNAME, ValueOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppealStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AppealStatus")
    public JAXBElement<AppealStatus> createAppealStatus(AppealStatus value) {
        return new JAXBElement<AppealStatus>(_AppealStatus_QNAME, AppealStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCpcBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EnhancedCpcBiddingScheme")
    public JAXBElement<EnhancedCpcBiddingScheme> createEnhancedCpcBiddingScheme(EnhancedCpcBiddingScheme value) {
        return new JAXBElement<EnhancedCpcBiddingScheme>(_EnhancedCpcBiddingScheme_QNAME, EnhancedCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfMediaMetaData")
    public JAXBElement<ArrayOfMediaMetaData> createArrayOfMediaMetaData(ArrayOfMediaMetaData value) {
        return new JAXBElement<ArrayOfMediaMetaData>(_ArrayOfMediaMetaData_QNAME, ArrayOfMediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "NegativeKeywordList")
    public JAXBElement<NegativeKeywordList> createNegativeKeywordList(NegativeKeywordList value) {
        return new JAXBElement<NegativeKeywordList>(_NegativeKeywordList_QNAME, NegativeKeywordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Calendar> createDateTime(Calendar value) {
        return new JAXBElement<Calendar>(_DateTime_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProfileType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProfileType")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<ProfileType>> createProfileType(Collection<ProfileType> value) {
        return new JAXBElement<Collection<ProfileType>>(_ProfileType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdRotationType")
    public JAXBElement<AdRotationType> createAdRotationType(AdRotationType value) {
        return new JAXBElement<AdRotationType>(_AdRotationType_QNAME, AdRotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfMedia")
    public JAXBElement<ArrayOfMedia> createArrayOfMedia(ArrayOfMedia value) {
        return new JAXBElement<ArrayOfMedia>(_ArrayOfMedia_QNAME, ArrayOfMedia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomParameters")
    public JAXBElement<CustomParameters> createCustomParameters(CustomParameters value) {
        return new JAXBElement<CustomParameters>(_CustomParameters_QNAME, CustomParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPropertyName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAccountPropertyName")
    public JAXBElement<ArrayOfAccountPropertyName> createArrayOfAccountPropertyName(ArrayOfAccountPropertyName value) {
        return new JAXBElement<ArrayOfAccountPropertyName>(_ArrayOfAccountPropertyName_QNAME, ArrayOfAccountPropertyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Char }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Char> createChar(Char value) {
        return new JAXBElement<Char>(_Char_QNAME, Char.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfConversionGoal")
    public JAXBElement<ArrayOfConversionGoal> createArrayOfConversionGoal(ArrayOfConversionGoal value) {
        return new JAXBElement<ArrayOfConversionGoal>(_ArrayOfConversionGoal_QNAME, ArrayOfConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdStatus")
    public JAXBElement<AdStatus> createAdStatus(AdStatus value) {
        return new JAXBElement<AdStatus>(_AdStatus_QNAME, AdStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Budget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Budget")
    public JAXBElement<Budget> createBudget(Budget value) {
        return new JAXBElement<Budget>(_Budget_QNAME, Budget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringstring")
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_ArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfKeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ConversionGoal")
    public JAXBElement<ConversionGoal> createConversionGoal(ConversionGoal value) {
        return new JAXBElement<ConversionGoal>(_ConversionGoal_QNAME, ConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TextAsset")
    public JAXBElement<TextAsset> createTextAsset(TextAsset value) {
        return new JAXBElement<TextAsset>(_TextAsset_QNAME, TextAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUetTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfUetTag")
    public JAXBElement<ArrayOfUetTag> createArrayOfUetTag(ArrayOfUetTag value) {
        return new JAXBElement<ArrayOfUetTag>(_ArrayOfUetTag_QNAME, ArrayOfUetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "PriceExtensionType")
    public JAXBElement<PriceExtensionType> createPriceExtensionType(PriceExtensionType value) {
        return new JAXBElement<PriceExtensionType>(_PriceExtensionType_QNAME, PriceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSnippetAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "StructuredSnippetAdExtension")
    public JAXBElement<StructuredSnippetAdExtension> createStructuredSnippetAdExtension(StructuredSnippetAdExtension value) {
        return new JAXBElement<StructuredSnippetAdExtension>(_StructuredSnippetAdExtension_QNAME, StructuredSnippetAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AgeRange")
    public JAXBElement<AgeRange> createAgeRange(AgeRange value) {
        return new JAXBElement<AgeRange>(_AgeRange_QNAME, AgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Ad")
    public JAXBElement<Ad> createAd(Ad value) {
        return new JAXBElement<Ad>(_Ad_QNAME, Ad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupStatus")
    public JAXBElement<AdGroupStatus> createAdGroupStatus(AdGroupStatus value) {
        return new JAXBElement<AdGroupStatus>(_AdGroupStatus_QNAME, AdGroupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomEventsRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "CustomEventsRule")
    public JAXBElement<CustomEventsRule> createCustomEventsRule(CustomEventsRule value) {
        return new JAXBElement<CustomEventsRule>(_CustomEventsRule_QNAME, CustomEventsRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "LocationAdExtension")
    public JAXBElement<LocationAdExtension> createLocationAdExtension(LocationAdExtension value) {
        return new JAXBElement<LocationAdExtension>(_LocationAdExtension_QNAME, LocationAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAudience")
    public JAXBElement<ArrayOfAudience> createArrayOfAudience(ArrayOfAudience value) {
        return new JAXBElement<ArrayOfAudience>(_ArrayOfAudience_QNAME, ArrayOfAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<UnsignedLong> createUnsignedLong(UnsignedLong value) {
        return new JAXBElement<UnsignedLong>(_UnsignedLong_QNAME, UnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCStoreSubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BMCStoreSubType")
    public JAXBElement<BMCStoreSubType> createBMCStoreSubType(BMCStoreSubType value) {
        return new JAXBElement<BMCStoreSubType>(_BMCStoreSubType_QNAME, BMCStoreSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdGroup")
    public JAXBElement<ArrayOfAdGroup> createArrayOfAdGroup(ArrayOfAdGroup value) {
        return new JAXBElement<ArrayOfAdGroup>(_ArrayOfAdGroup_QNAME, ArrayOfAdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "IdCollection")
    public JAXBElement<IdCollection> createIdCollection(IdCollection value) {
        return new JAXBElement<IdCollection>(_IdCollection_QNAME, IdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadiusCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "RadiusCriterion")
    public JAXBElement<RadiusCriterion> createRadiusCriterion(RadiusCriterion value) {
        return new JAXBElement<RadiusCriterion>(_RadiusCriterion_QNAME, RadiusCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchErrorCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BatchErrorCollection")
    public JAXBElement<BatchErrorCollection> createBatchErrorCollection(BatchErrorCollection value) {
        return new JAXBElement<BatchErrorCollection>(_BatchErrorCollection_QNAME, BatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdRotation")
    public JAXBElement<AdRotation> createAdRotation(AdRotation value) {
        return new JAXBElement<AdRotation>(_AdRotation_QNAME, AdRotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAssetLink")
    public JAXBElement<ArrayOfAssetLink> createArrayOfAssetLink(ArrayOfAssetLink value) {
        return new JAXBElement<ArrayOfAssetLink>(_ArrayOfAssetLink_QNAME, ArrayOfAssetLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<BudgetLimitType>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "NumberOperator")
    public JAXBElement<NumberOperator> createNumberOperator(NumberOperator value) {
        return new JAXBElement<NumberOperator>(_NumberOperator_QNAME, NumberOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ProductPartitionType")
    public JAXBElement<ProductPartitionType> createProductPartitionType(ProductPartitionType value) {
        return new JAXBElement<ProductPartitionType>(_ProductPartitionType_QNAME, ProductPartitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfMediaAssociation")
    public JAXBElement<ArrayOfMediaAssociation> createArrayOfMediaAssociation(ArrayOfMediaAssociation value) {
        return new JAXBElement<ArrayOfMediaAssociation>(_ArrayOfMediaAssociation_QNAME, ArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetLinkEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AssetLinkEditorialStatus")
    public JAXBElement<AssetLinkEditorialStatus> createAssetLinkEditorialStatus(AssetLinkEditorialStatus value) {
        return new JAXBElement<AssetLinkEditorialStatus>(_AssetLinkEditorialStatus_QNAME, AssetLinkEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAdExtensionAssociation")
    public JAXBElement<ArrayOfAdExtensionAssociation> createArrayOfAdExtensionAssociation(ArrayOfAdExtensionAssociation value) {
        return new JAXBElement<ArrayOfAdExtensionAssociation>(_ArrayOfAdExtensionAssociation_QNAME, ArrayOfAdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupCriterionAction")
    public JAXBElement<AdGroupCriterionAction> createAdGroupCriterionAction(AdGroupCriterionAction value) {
        return new JAXBElement<AdGroupCriterionAction>(_AdGroupCriterionAction_QNAME, AdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntentOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "IntentOption")
    public JAXBElement<IntentOption> createIntentOption(IntentOption value) {
        return new JAXBElement<IntentOption>(_IntentOption_QNAME, IntentOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Audience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "Audience")
    public JAXBElement<Audience> createAudience(Audience value) {
        return new JAXBElement<Audience>(_Audience_QNAME, Audience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "LabelAssociation")
    public JAXBElement<LabelAssociation> createLabelAssociation(LabelAssociation value) {
        return new JAXBElement<LabelAssociation>(_LabelAssociation_QNAME, LabelAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ShoppingSetting")
    public JAXBElement<ShoppingSetting> createShoppingSetting(ShoppingSetting value) {
        return new JAXBElement<ShoppingSetting>(_ShoppingSetting_QNAME, ShoppingSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "KeywordEditorialStatus")
    public JAXBElement<KeywordEditorialStatus> createKeywordEditorialStatus(KeywordEditorialStatus value) {
        return new JAXBElement<KeywordEditorialStatus>(_KeywordEditorialStatus_QNAME, KeywordEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWebpageCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfWebpageCondition")
    public JAXBElement<ArrayOfWebpageCondition> createArrayOfWebpageCondition(ArrayOfWebpageCondition value) {
        return new JAXBElement<ArrayOfWebpageCondition>(_ArrayOfWebpageCondition_QNAME, ArrayOfWebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringRuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "StringRuleItem")
    public JAXBElement<StringRuleItem> createStringRuleItem(StringRuleItem value) {
        return new JAXBElement<StringRuleItem>(_StringRuleItem_QNAME, StringRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfEditorialReasonCollection")
    public JAXBElement<ArrayOfEditorialReasonCollection> createArrayOfEditorialReasonCollection(ArrayOfEditorialReasonCollection value) {
        return new JAXBElement<ArrayOfEditorialReasonCollection>(_ArrayOfEditorialReasonCollection_QNAME, ArrayOfEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiFaultDetail")
    public JAXBElement<AdApiFaultDetail> createAdApiFaultDetail(AdApiFaultDetail value) {
        return new JAXBElement<AdApiFaultDetail>(_AdApiFaultDetail_QNAME, AdApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ApplicationFault")
    public JAXBElement<ApplicationFault> createApplicationFault(ApplicationFault value) {
        return new JAXBElement<ApplicationFault>(_ApplicationFault_QNAME, ApplicationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "RemarketingList")
    public JAXBElement<RemarketingList> createRemarketingList(RemarketingList value) {
        return new JAXBElement<RemarketingList>(_RemarketingList_QNAME, RemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfCampaignNegativeSites")
    public JAXBElement<ArrayOfCampaignNegativeSites> createArrayOfCampaignNegativeSites(ArrayOfCampaignNegativeSites value) {
        return new JAXBElement<ArrayOfCampaignNegativeSites>(_ArrayOfCampaignNegativeSites_QNAME, ArrayOfCampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdAdditionalField")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<AdAdditionalField>> createAdAdditionalField(Collection<AdAdditionalField> value) {
        return new JAXBElement<Collection<AdAdditionalField>>(_AdAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationIntentCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "LocationIntentCriterion")
    public JAXBElement<LocationIntentCriterion> createLocationIntentCriterion(LocationIntentCriterion value) {
        return new JAXBElement<LocationIntentCriterion>(_LocationIntentCriterion_QNAME, LocationIntentCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "TargetSetting")
    public JAXBElement<TargetSetting> createTargetSetting(TargetSetting value) {
        return new JAXBElement<TargetSetting>(_TargetSetting_QNAME, TargetSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfDayTime")
    public JAXBElement<ArrayOfDayTime> createArrayOfDayTime(ArrayOfDayTime value) {
        return new JAXBElement<ArrayOfDayTime>(_ArrayOfDayTime_QNAME, ArrayOfDayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "ArrayOfAccountProperty")
    public JAXBElement<ArrayOfAccountProperty> createArrayOfAccountProperty(ArrayOfAccountProperty value) {
        return new JAXBElement<ArrayOfAccountProperty>(_ArrayOfAccountProperty_QNAME, ArrayOfAccountProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AdGroupCriterionStatus")
    public JAXBElement<AdGroupCriterionStatus> createAdGroupCriterionStatus(AdGroupCriterionStatus value) {
        return new JAXBElement<AdGroupCriterionStatus>(_AdGroupCriterionStatus_QNAME, AdGroupCriterionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "UrlGoal")
    public JAXBElement<UrlGoal> createUrlGoal(UrlGoal value) {
        return new JAXBElement<UrlGoal>(_UrlGoal_QNAME, UrlGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "EditorialError")
    public JAXBElement<EditorialError> createEditorialError(EditorialError value) {
        return new JAXBElement<EditorialError>(_EditorialError_QNAME, EditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTimeCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DayTimeCriterion")
    public JAXBElement<DayTimeCriterion> createDayTimeCriterion(DayTimeCriterion value) {
        return new JAXBElement<DayTimeCriterion>(_DayTimeCriterion_QNAME, DayTimeCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "BMCStore")
    public JAXBElement<BMCStore> createBMCStore(BMCStore value) {
        return new JAXBElement<BMCStore>(_BMCStore_QNAME, BMCStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v12", name = "DeviceCriterion")
    public JAXBElement<DeviceCriterion> createDeviceCriterion(DeviceCriterion value) {
        return new JAXBElement<DeviceCriterion>(_DeviceCriterion_QNAME, DeviceCriterion.class, null, value);
    }

}
