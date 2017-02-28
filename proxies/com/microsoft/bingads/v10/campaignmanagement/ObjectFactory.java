
package com.microsoft.bingads.v10.campaignmanagement;

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
 * generated in the com.microsoft.bingads.v10.campaignmanagement package. 
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

    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApiFaultDetail");
    private final static QName _ArrayOfEntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEntityNegativeKeyword");
    private final static QName _DynamicSearchAdsSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DynamicSearchAdsSetting");
    private final static QName _AdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupNegativeSites");
    private final static QName _CustomParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameter");
    private final static QName _CityTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTarget");
    private final static QName _AdGroupRemarketingListAssociationStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupRemarketingListAssociationStatus");
    private final static QName _AssociationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AssociationType");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _AdExtensionsTypeFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionsTypeFilter");
    private final static QName _Date_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Date");
    private final static QName _RemarketingTargetingSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "RemarketingTargetingSetting");
    private final static QName _MediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaMetaData");
    private final static QName _ArrayOfStateTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfStateTargetBid");
    private final static QName _ArrayOfEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialReason");
    private final static QName _UetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "UetTag");
    private final static QName _NegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeyword");
    private final static QName _EventGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EventGoal");
    private final static QName _CampaignAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignAdditionalField");
    private final static QName _AgeTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTarget");
    private final static QName _EntityIdToParentIdAssociation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EntityIdToParentIdAssociation");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBatchError");
    private final static QName _DistanceUnit_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DistanceUnit");
    private final static QName _AccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AccountMigrationStatusesInfo");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _GenderTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTarget");
    private final static QName _ArrayOfCityTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCityTargetBid");
    private final static QName _ArrayOfSharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedEntityAssociation");
    private final static QName _ImpressionsPerDayRange_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImpressionsPerDayRange");
    private final static QName _MigrationStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatus");
    private final static QName _ArrayOfAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtension");
    private final static QName _ArrayOfSiteLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSiteLink");
    private final static QName _NegativeCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeCampaignCriterion");
    private final static QName _ArrayOfAdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupNegativeSites");
    private final static QName _CountryTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTarget");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfOperationError");
    private final static QName _PageVisitorsRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "PageVisitorsRule");
    private final static QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AdGroupRemarketingListAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupRemarketingListAssociation");
    private final static QName _ReviewAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ReviewAdExtension");
    private final static QName _NegativeAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeAdGroupCriterion");
    private final static QName _StringOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "StringOperator");
    private final static QName _ArrayOfSharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedListItem");
    private final static QName _EntityType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityType");
    private final static QName _AdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReasonCollection");
    private final static QName _MigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MigrationStatusInfo");
    private final static QName _ArrayOfIdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfIdCollection");
    private final static QName _ArrayOfSharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSharedEntity");
    private final static QName _RadiusTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTargetBid");
    private final static QName _ExpandedTextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ExpandedTextAd");
    private final static QName _Media_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Media");
    private final static QName _PlacementDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "PlacementDetail");
    private final static QName _ArrayOfMigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMigrationStatusInfo");
    private final static QName _ConversionGoalRevenueType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalRevenueType");
    private final static QName _Setting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Setting");
    private final static QName _ArrayOfCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignCriterion");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _AdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterion");
    private final static QName _ArrayOfAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupCriterion");
    private final static QName _MaxConversionsBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxConversionsBiddingScheme");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ApplicationToken");
    private final static QName _EntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityNegativeKeyword");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Webpage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "Webpage");
    private final static QName _ProductAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductAd");
    private final static QName _AdExtensionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionStatus");
    private final static QName _PageVisitorsWhoVisitedAnotherPageRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "PageVisitorsWhoVisitedAnotherPageRule");
    private final static QName _ArrayOfPlacementDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPlacementDetail");
    private final static QName _BusinessGeoCodeStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BusinessGeoCodeStatus");
    private final static QName _FixedBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "FixedBid");
    private final static QName _ArrayOfRuleItemGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfRuleItemGroup");
    private final static QName _ArrayOfArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfArrayOfMediaAssociation");
    private final static QName _ArrayOfArrayOfPlacementDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfArrayOfPlacementDetail");
    private final static QName _EditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReasonCollection");
    private final static QName _DayTimeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTargetBid");
    private final static QName _Day_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Day");
    private final static QName _RuleItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "RuleItem");
    private final static QName _AdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociation");
    private final static QName _ArrayOfAdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionIdentity");
    private final static QName _BiddableAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddableAdGroupCriterion");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _GenderType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderType");
    private final static QName _ProductPartition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductPartition");
    private final static QName _TargetCpaBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "TargetCpaBiddingScheme");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ConversionGoalStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalStatus");
    private final static QName _Dimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Dimension");
    private final static QName _MaxClicksBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "MaxClicksBiddingScheme");
    private final static QName _EditorialApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialApiFaultDetail");
    private final static QName _AppInstallAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppInstallAd");
    private final static QName _Keyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Keyword");
    private final static QName _CampaignCriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterionType");
    private final static QName _AdEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdEditorialStatus");
    private final static QName _AdGroupCriterionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionEditorialStatus");
    private final static QName _SharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntity");
    private final static QName _Minute_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Minute");
    private final static QName _ProductScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductScope");
    private final static QName _Target_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Target");
    private final static QName _PricingModel_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "PricingModel");
    private final static QName _MediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaAssociation");
    private final static QName _TextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "TextAd");
    private final static QName _CampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignSize");
    private final static QName _CampaignStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignStatus");
    private final static QName _ArrayOfAdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdType");
    private final static QName _ArrayOfAdGroupRemarketingListAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupRemarketingListAssociation");
    private final static QName _SiteLinksAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLinksAdExtension");
    private final static QName _AdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAssociationCollection");
    private final static QName _ConversionGoalRevenue_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalRevenue");
    private final static QName _AdExtensionAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionAdditionalField");
    private final static QName _WebpageCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "WebpageCondition");
    private final static QName _KeywordAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "KeywordAdditionalField");
    private final static QName _CityTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CityTargetBid");
    private final static QName _ItemAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ItemAction");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CustomerId");
    private final static QName _AdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdentity");
    private final static QName _ArrayOfRuleItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfRuleItem");
    private final static QName _AdGroupAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupAdditionalField");
    private final static QName _AdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionIdToEntityIdAssociation");
    private final static QName _ArrayOfAdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionEditorialReason");
    private final static QName _ArrayOfEntityIdToParentIdAssociation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfEntityIdToParentIdAssociation");
    private final static QName _ArrayOfAdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionAssociationCollection");
    private final static QName _WebpageConditionOperand_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "WebpageConditionOperand");
    private final static QName _ArrayOfAdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroupCriterionAction");
    private final static QName _DayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTime");
    private final static QName _Network_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Network");
    private final static QName _ArrayOfAdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionEditorialReasonCollection");
    private final static QName _ArrayOfRemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfRemarketingList");
    private final static QName _Image_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Image");
    private final static QName _BiddingModel_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BiddingModel");
    private final static QName _AppInstallGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppInstallGoal");
    private final static QName _EntityScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EntityScope");
    private final static QName _RuleItemGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "RuleItemGroup");
    private final static QName _LocationTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "LocationTarget");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _CountryTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CountryTargetBid");
    private final static QName _PostalCodeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTargetBid");
    private final static QName _Address_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Address");
    private final static QName _ArrayOfPostalCodeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfPostalCodeTargetBid");
    private final static QName _ConversionGoalType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalType");
    private final static QName _ArrayOfAccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAccountMigrationStatusesInfo");
    private final static QName _AdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialReason");
    private final static QName _ArrayOfCustomParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfCustomParameter");
    private final static QName _ArrayOfAdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionIdToEntityIdAssociation");
    private final static QName _Schedule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Schedule");
    private final static QName _ArrayOfDeviceOSTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDeviceOSTargetBid");
    private final static QName _CriterionBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionBid");
    private final static QName _ArrayOfMetroAreaTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMetroAreaTargetBid");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _BiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "BiddingScheme");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "UserName");
    private final static QName _ArrayOfEditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialError");
    private final static QName _ArrayOfSitePlacement_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSitePlacement");
    private final static QName _Bid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Bid");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Password");
    private final static QName _WebpageParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "WebpageParameter");
    private final static QName _ArrayOfGenderTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfGenderTargetBid");
    private final static QName _Criterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Criterion");
    private final static QName _PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "PageVisitorsWhoDidNotVisitAnotherPageRule");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CustomerAccountId");
    private final static QName _MediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaRepresentation");
    private final static QName _ArrayOfSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfSetting");
    private final static QName _KeywordStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "KeywordStatus");
    private final static QName _ArrayOfMediaType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaType");
    private final static QName _ArrayOfCampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignSize");
    private final static QName _CalloutAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CalloutAdExtension");
    private final static QName _UetTagTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "UetTagTrackingStatus");
    private final static QName _ArrayOfRadiusTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfRadiusTargetBid");
    private final static QName _ExpressionOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ExpressionOperator");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroup");
    private final static QName _ArrayOfBMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBMCStore");
    private final static QName _EditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialReason");
    private final static QName _CampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignCriterion");
    private final static QName _ConversionGoalTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalTrackingStatus");
    private final static QName _AdExtensionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtensionEditorialStatus");
    private final static QName _RemarketingRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "RemarketingRule");
    private final static QName _DeviceOSTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTarget");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaRepresentation");
    private final static QName _SharedList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedList");
    private final static QName _Campaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Campaign");
    private final static QName _ArrayOfAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAd");
    private final static QName _ImageAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageAdExtension");
    private final static QName _ManualCpcBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ManualCpcBiddingScheme");
    private final static QName _DynamicSearchAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DynamicSearchAd");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfBatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBatchErrorCollection");
    private final static QName _ProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductCondition");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _CallAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CallAdExtension");
    private final static QName _DayTimeTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DayTimeTarget");
    private final static QName _ArrayOfDayTimeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDayTimeTargetBid");
    private final static QName _PagesViewedPerVisitGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "PagesViewedPerVisitGoal");
    private final static QName _CampaignType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignType");
    private final static QName _SharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedEntityAssociation");
    private final static QName _CriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CriterionType");
    private final static QName _AppAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppAdExtension");
    private final static QName _GeoPoint_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "GeoPoint");
    private final static QName _ConversionGoalCountType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoalCountType");
    private final static QName _ImageMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ImageMediaRepresentation");
    private final static QName _MediaEnabledEntityFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaEnabledEntityFilter");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfCampaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaign");
    private final static QName _AdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdExtension");
    private final static QName _DurationGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DurationGoal");
    private final static QName _ArrayOfNullableOflong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    private final static QName _AdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdType");
    private final static QName _ArrayOfBudget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfBudget");
    private final static QName _InheritFromParentBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "InheritFromParentBiddingScheme");
    private final static QName _ArrayOfProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfProductCondition");
    private final static QName _ArrayOfNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfNegativeKeyword");
    private final static QName _AppUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "AppUrl");
    private final static QName _SitePlacement_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacement");
    private final static QName _ArrayOfKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfKeyword");
    private final static QName _SharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SharedListItem");
    private final static QName _StateTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTarget");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeveloperToken");
    private final static QName _ArrayOfWebpageCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfWebpageCondition");
    private final static QName _StringRuleItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "StringRuleItem");
    private final static QName _CampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "CampaignNegativeSites");
    private final static QName _AdDistribution_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdDistribution");
    private final static QName _MatchType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MatchType");
    private final static QName _ArrayOfDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDimension");
    private final static QName _ValueOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ValueOperator");
    private final static QName _AppealStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AppealStatus");
    private final static QName _ArrayOfTargetInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfTargetInfo");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "OperationError");
    private final static QName _ArrayOfMediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaMetaData");
    private final static QName _MetroAreaTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTarget");
    private final static QName _RadiusTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "RadiusTarget");
    private final static QName _ArrayOfCountryTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCountryTargetBid");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _NegativeKeywordList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "NegativeKeywordList");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchError");
    private final static QName _AgeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeTargetBid");
    private final static QName _AdRotationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotationType");
    private final static QName _ArrayOfConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfConversionGoal");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Sitelink2AdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Sitelink2AdExtension");
    private final static QName _ArrayOfMedia_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMedia");
    private final static QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private final static QName _AdStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdStatus");
    private final static QName _Budget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Budget");
    private final static QName _ConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ConversionGoal");
    private final static QName _DeviceOSTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "DeviceOSTargetBid");
    private final static QName _ArrayOfUetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfUetTag");
    private final static QName _StructuredSnippetAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "StructuredSnippetAdExtension");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _AgeRange_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AgeRange");
    private final static QName _Ad_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "Ad");
    private final static QName _AdGroupStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupStatus");
    private final static QName _LocationAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "LocationAdExtension");
    private final static QName _StateTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "StateTargetBid");
    private final static QName _ArrayOfAdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdGroup");
    private final static QName _IdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "IdCollection");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PostalCodeTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "PostalCodeTarget");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CustomParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomParameters");
    private final static QName _AdRotation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdRotation");
    private final static QName _BatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BatchErrorCollection");
    private final static QName _NumberOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "NumberOperator");
    private final static QName _BudgetLimitType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BudgetLimitType");
    private final static QName _TargetInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "TargetInfo");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "TrackingId");
    private final static QName _ProductPartitionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ProductPartitionType");
    private final static QName _ArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfMediaAssociation");
    private final static QName _ArrayOfAdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAdExtensionAssociation");
    private final static QName _AdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionAction");
    private final static QName _IntentOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "IntentOption");
    private final static QName _CustomEventsRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "CustomEventsRule");
    private final static QName _KeywordEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "KeywordEditorialStatus");
    private final static QName _ArrayOfTarget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfTarget");
    private final static QName _RemarketingListAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "RemarketingListAdditionalField");
    private final static QName _ShoppingSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ShoppingSetting");
    private final static QName _ArrayOfEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfEditorialReasonCollection");
    private final static QName _ArrayOfAppUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "ArrayOfAppUrl");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _MediaType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MediaType");
    private final static QName _GenderTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "GenderTargetBid");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _SiteLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SiteLink");
    private final static QName _EnhancedCpcBiddingScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", "EnhancedCpcBiddingScheme");
    private final static QName _RemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "RemarketingList");
    private final static QName _ArrayOfAgeTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfAgeTargetBid");
    private final static QName _ArrayOfCampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfCampaignNegativeSites");
    private final static QName _AdGroupCriterionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AdGroupCriterionStatus");
    private final static QName _UrlGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "UrlGoal");
    private final static QName _ArrayOfDayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "ArrayOfDayTime");
    private final static QName _SitePlacementStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "SitePlacementStatus");
    private final static QName _EditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "EditorialError");
    private final static QName _MetroAreaTargetBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "MetroAreaTargetBid");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "AuthenticationToken");
    private final static QName _BMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v10", "BMCStore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v10.campaignmanagement
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link DeleteAdsResponse }
     * 
     */
    public DeleteAdsResponse createDeleteAdsResponse() {
        return new DeleteAdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
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
     * Create an instance of {@link DeleteRemarketingListsResponse }
     * 
     */
    public DeleteRemarketingListsResponse createDeleteRemarketingListsResponse() {
        return new DeleteRemarketingListsResponse();
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
     * Create an instance of {@link ArrayOfAgeTargetBid }
     * 
     */
    public ArrayOfAgeTargetBid createArrayOfAgeTargetBid() {
        return new ArrayOfAgeTargetBid();
    }

    /**
     * Create an instance of {@link UpdateAdsResponse }
     * 
     */
    public UpdateAdsResponse createUpdateAdsResponse() {
        return new UpdateAdsResponse();
    }

    /**
     * Create an instance of {@link SiteLink }
     * 
     */
    public SiteLink createSiteLink() {
        return new SiteLink();
    }

    /**
     * Create an instance of {@link AddTargetsToLibraryResponse }
     * 
     */
    public AddTargetsToLibraryResponse createAddTargetsToLibraryResponse() {
        return new AddTargetsToLibraryResponse();
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
     * Create an instance of {@link GenderTargetBid }
     * 
     */
    public GenderTargetBid createGenderTargetBid() {
        return new GenderTargetBid();
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
     * Create an instance of {@link AddKeywordsResponse }
     * 
     */
    public AddKeywordsResponse createAddKeywordsResponse() {
        return new AddKeywordsResponse();
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
     * Create an instance of {@link StateTargetBid }
     * 
     */
    public StateTargetBid createStateTargetBid() {
        return new StateTargetBid();
    }

    /**
     * Create an instance of {@link PostalCodeTarget }
     * 
     */
    public PostalCodeTarget createPostalCodeTarget() {
        return new PostalCodeTarget();
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
     * Create an instance of {@link Sitelink2AdExtension }
     * 
     */
    public Sitelink2AdExtension createSitelink2AdExtension() {
        return new Sitelink2AdExtension();
    }

    /**
     * Create an instance of {@link ArrayOfMedia }
     * 
     */
    public ArrayOfMedia createArrayOfMedia() {
        return new ArrayOfMedia();
    }

    /**
     * Create an instance of {@link AgeTargetBid }
     * 
     */
    public AgeTargetBid createAgeTargetBid() {
        return new AgeTargetBid();
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
     * Create an instance of {@link RadiusTarget }
     * 
     */
    public RadiusTarget createRadiusTarget() {
        return new RadiusTarget();
    }

    /**
     * Create an instance of {@link GetTargetsInfoFromLibraryRequest }
     * 
     */
    public GetTargetsInfoFromLibraryRequest createGetTargetsInfoFromLibraryRequest() {
        return new GetTargetsInfoFromLibraryRequest();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link GetAdExtensionsByIdsRequest }
     * 
     */
    public GetAdExtensionsByIdsRequest createGetAdExtensionsByIdsRequest() {
        return new GetAdExtensionsByIdsRequest();
    }

    /**
     * Create an instance of {@link AddListItemsToSharedListResponse }
     * 
     */
    public AddListItemsToSharedListResponse createAddListItemsToSharedListResponse() {
        return new AddListItemsToSharedListResponse();
    }

    /**
     * Create an instance of {@link SitePlacement }
     * 
     */
    public SitePlacement createSitePlacement() {
        return new SitePlacement();
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
     * Create an instance of {@link DeleteRemarketingListsRequest }
     * 
     */
    public DeleteRemarketingListsRequest createDeleteRemarketingListsRequest() {
        return new DeleteRemarketingListsRequest();
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
     * Create an instance of {@link AppAdExtension }
     * 
     */
    public AppAdExtension createAppAdExtension() {
        return new AppAdExtension();
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
     * Create an instance of {@link DayTimeTarget }
     * 
     */
    public DayTimeTarget createDayTimeTarget() {
        return new DayTimeTarget();
    }

    /**
     * Create an instance of {@link ArrayOfDayTimeTargetBid }
     * 
     */
    public ArrayOfDayTimeTargetBid createArrayOfDayTimeTargetBid() {
        return new ArrayOfDayTimeTargetBid();
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
     * Create an instance of {@link GetPlacementDetailsForUrlsResponse }
     * 
     */
    public GetPlacementDetailsForUrlsResponse createGetPlacementDetailsForUrlsResponse() {
        return new GetPlacementDetailsForUrlsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfPlacementDetail }
     * 
     */
    public ArrayOfArrayOfPlacementDetail createArrayOfArrayOfPlacementDetail() {
        return new ArrayOfArrayOfPlacementDetail();
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
     * Create an instance of {@link UpdateTargetsInLibraryResponse }
     * 
     */
    public UpdateTargetsInLibraryResponse createUpdateTargetsInLibraryResponse() {
        return new UpdateTargetsInLibraryResponse();
    }

    /**
     * Create an instance of {@link GetMediaByIdsRequest }
     * 
     */
    public GetMediaByIdsRequest createGetMediaByIdsRequest() {
        return new GetMediaByIdsRequest();
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
     * Create an instance of {@link AddAdGroupCriterionsRequest }
     * 
     */
    public AddAdGroupCriterionsRequest createAddAdGroupCriterionsRequest() {
        return new AddAdGroupCriterionsRequest();
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
     * Create an instance of {@link ArrayOfRadiusTargetBid }
     * 
     */
    public ArrayOfRadiusTargetBid createArrayOfRadiusTargetBid() {
        return new ArrayOfRadiusTargetBid();
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
     * Create an instance of {@link DeleteTargetFromCampaignResponse }
     * 
     */
    public DeleteTargetFromCampaignResponse createDeleteTargetFromCampaignResponse() {
        return new DeleteTargetFromCampaignResponse();
    }

    /**
     * Create an instance of {@link AddAdGroupsResponse }
     * 
     */
    public AddAdGroupsResponse createAddAdGroupsResponse() {
        return new AddAdGroupsResponse();
    }

    /**
     * Create an instance of {@link AddSitePlacementsRequest }
     * 
     */
    public AddSitePlacementsRequest createAddSitePlacementsRequest() {
        return new AddSitePlacementsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSitePlacement }
     * 
     */
    public ArrayOfSitePlacement createArrayOfSitePlacement() {
        return new ArrayOfSitePlacement();
    }

    /**
     * Create an instance of {@link CriterionBid }
     * 
     */
    public CriterionBid createCriterionBid() {
        return new CriterionBid();
    }

    /**
     * Create an instance of {@link ArrayOfMetroAreaTargetBid }
     * 
     */
    public ArrayOfMetroAreaTargetBid createArrayOfMetroAreaTargetBid() {
        return new ArrayOfMetroAreaTargetBid();
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
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfPostalCodeTargetBid }
     * 
     */
    public ArrayOfPostalCodeTargetBid createArrayOfPostalCodeTargetBid() {
        return new ArrayOfPostalCodeTargetBid();
    }

    /**
     * Create an instance of {@link DeleteTargetFromCampaignRequest }
     * 
     */
    public DeleteTargetFromCampaignRequest createDeleteTargetFromCampaignRequest() {
        return new DeleteTargetFromCampaignRequest();
    }

    /**
     * Create an instance of {@link LocationTarget }
     * 
     */
    public LocationTarget createLocationTarget() {
        return new LocationTarget();
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
     * Create an instance of {@link UpdateRemarketingListsResponse }
     * 
     */
    public UpdateRemarketingListsResponse createUpdateRemarketingListsResponse() {
        return new UpdateRemarketingListsResponse();
    }

    /**
     * Create an instance of {@link UpdateTargetsInLibraryRequest }
     * 
     */
    public UpdateTargetsInLibraryRequest createUpdateTargetsInLibraryRequest() {
        return new UpdateTargetsInLibraryRequest();
    }

    /**
     * Create an instance of {@link ArrayOfTarget }
     * 
     */
    public ArrayOfTarget createArrayOfTarget() {
        return new ArrayOfTarget();
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
     * Create an instance of {@link GetAdGroupRemarketingListAssociationsResponse }
     * 
     */
    public GetAdGroupRemarketingListAssociationsResponse createGetAdGroupRemarketingListAssociationsResponse() {
        return new GetAdGroupRemarketingListAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupRemarketingListAssociation }
     * 
     */
    public ArrayOfAdGroupRemarketingListAssociation createArrayOfAdGroupRemarketingListAssociation() {
        return new ArrayOfAdGroupRemarketingListAssociation();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsRequest }
     * 
     */
    public GetSharedEntityAssociationsByEntityIdsRequest createGetSharedEntityAssociationsByEntityIdsRequest() {
        return new GetSharedEntityAssociationsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link AddCampaignsRequest }
     * 
     */
    public AddCampaignsRequest createAddCampaignsRequest() {
        return new AddCampaignsRequest();
    }

    /**
     * Create an instance of {@link GetSitePlacementsByAdGroupIdResponse }
     * 
     */
    public GetSitePlacementsByAdGroupIdResponse createGetSitePlacementsByAdGroupIdResponse() {
        return new GetSitePlacementsByAdGroupIdResponse();
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
     * Create an instance of {@link CityTargetBid }
     * 
     */
    public CityTargetBid createCityTargetBid() {
        return new CityTargetBid();
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
     * Create an instance of {@link AddTargetsToLibraryRequest }
     * 
     */
    public AddTargetsToLibraryRequest createAddTargetsToLibraryRequest() {
        return new AddTargetsToLibraryRequest();
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
     * Create an instance of {@link SetTargetToAdGroupRequest }
     * 
     */
    public SetTargetToAdGroupRequest createSetTargetToAdGroupRequest() {
        return new SetTargetToAdGroupRequest();
    }

    /**
     * Create an instance of {@link GetRemarketingListsRequest }
     * 
     */
    public GetRemarketingListsRequest createGetRemarketingListsRequest() {
        return new GetRemarketingListsRequest();
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
     * Create an instance of {@link UpdateBudgetsRequest }
     * 
     */
    public UpdateBudgetsRequest createUpdateBudgetsRequest() {
        return new UpdateBudgetsRequest();
    }

    /**
     * Create an instance of {@link SetTargetToCampaignResponse }
     * 
     */
    public SetTargetToCampaignResponse createSetTargetToCampaignResponse() {
        return new SetTargetToCampaignResponse();
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
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
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
     * Create an instance of {@link EditorialApiFaultDetail }
     * 
     */
    public EditorialApiFaultDetail createEditorialApiFaultDetail() {
        return new EditorialApiFaultDetail();
    }

    /**
     * Create an instance of {@link GetAdGroupCriterionsByIdsRequest }
     * 
     */
    public GetAdGroupCriterionsByIdsRequest createGetAdGroupCriterionsByIdsRequest() {
        return new GetAdGroupCriterionsByIdsRequest();
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
     * Create an instance of {@link DeleteSitePlacementsRequest }
     * 
     */
    public DeleteSitePlacementsRequest createDeleteSitePlacementsRequest() {
        return new DeleteSitePlacementsRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdRequest }
     * 
     */
    public GetAdExtensionIdsByAccountIdRequest createGetAdExtensionIdsByAccountIdRequest() {
        return new GetAdExtensionIdsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetBSCCountriesResponse }
     * 
     */
    public GetBSCCountriesResponse createGetBSCCountriesResponse() {
        return new GetBSCCountriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link FixedBid }
     * 
     */
    public FixedBid createFixedBid() {
        return new FixedBid();
    }

    /**
     * Create an instance of {@link ArrayOfPlacementDetail }
     * 
     */
    public ArrayOfPlacementDetail createArrayOfPlacementDetail() {
        return new ArrayOfPlacementDetail();
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
     * Create an instance of {@link ArrayOfCampaignCriterion }
     * 
     */
    public ArrayOfCampaignCriterion createArrayOfCampaignCriterion() {
        return new ArrayOfCampaignCriterion();
    }

    /**
     * Create an instance of {@link ArrayOfMigrationStatusInfo }
     * 
     */
    public ArrayOfMigrationStatusInfo createArrayOfMigrationStatusInfo() {
        return new ArrayOfMigrationStatusInfo();
    }

    /**
     * Create an instance of {@link RadiusTargetBid }
     * 
     */
    public RadiusTargetBid createRadiusTargetBid() {
        return new RadiusTargetBid();
    }

    /**
     * Create an instance of {@link AdExtensionEditorialReasonCollection }
     * 
     */
    public AdExtensionEditorialReasonCollection createAdExtensionEditorialReasonCollection() {
        return new AdExtensionEditorialReasonCollection();
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
     * Create an instance of {@link GetTargetsByAdGroupIdsResponse }
     * 
     */
    public GetTargetsByAdGroupIdsResponse createGetTargetsByAdGroupIdsResponse() {
        return new GetTargetsByAdGroupIdsResponse();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToAdGroupsRequest }
     * 
     */
    public SetNegativeSitesToAdGroupsRequest createSetNegativeSitesToAdGroupsRequest() {
        return new SetNegativeSitesToAdGroupsRequest();
    }

    /**
     * Create an instance of {@link GetMediaByIdsResponse }
     * 
     */
    public GetMediaByIdsResponse createGetMediaByIdsResponse() {
        return new GetMediaByIdsResponse();
    }

    /**
     * Create an instance of {@link CountryTarget }
     * 
     */
    public CountryTarget createCountryTarget() {
        return new CountryTarget();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdResponse }
     * 
     */
    public GetAdExtensionIdsByAccountIdResponse createGetAdExtensionIdsByAccountIdResponse() {
        return new GetAdExtensionIdsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ImpressionsPerDayRange }
     * 
     */
    public ImpressionsPerDayRange createImpressionsPerDayRange() {
        return new ImpressionsPerDayRange();
    }

    /**
     * Create an instance of {@link ArrayOfSiteLink }
     * 
     */
    public ArrayOfSiteLink createArrayOfSiteLink() {
        return new ArrayOfSiteLink();
    }

    /**
     * Create an instance of {@link UpdateAdGroupRemarketingListAssociationsResponse }
     * 
     */
    public UpdateAdGroupRemarketingListAssociationsResponse createUpdateAdGroupRemarketingListAssociationsResponse() {
        return new UpdateAdGroupRemarketingListAssociationsResponse();
    }

    /**
     * Create an instance of {@link ApplyProductPartitionActionsResponse }
     * 
     */
    public ApplyProductPartitionActionsResponse createApplyProductPartitionActionsResponse() {
        return new ApplyProductPartitionActionsResponse();
    }

    /**
     * Create an instance of {@link GenderTarget }
     * 
     */
    public GenderTarget createGenderTarget() {
        return new GenderTarget();
    }

    /**
     * Create an instance of {@link GetSitePlacementsByIdsResponse }
     * 
     */
    public GetSitePlacementsByIdsResponse createGetSitePlacementsByIdsResponse() {
        return new GetSitePlacementsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialReason }
     * 
     */
    public ArrayOfEditorialReason createArrayOfEditorialReason() {
        return new ArrayOfEditorialReason();
    }

    /**
     * Create an instance of {@link ArrayOfStateTargetBid }
     * 
     */
    public ArrayOfStateTargetBid createArrayOfStateTargetBid() {
        return new ArrayOfStateTargetBid();
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
     * Create an instance of {@link GetTargetsByIdsResponse }
     * 
     */
    public GetTargetsByIdsResponse createGetTargetsByIdsResponse() {
        return new GetTargetsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsResponse }
     * 
     */
    public GetSharedEntityAssociationsByEntityIdsResponse createGetSharedEntityAssociationsByEntityIdsResponse() {
        return new GetSharedEntityAssociationsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link SetTargetToAdGroupResponse }
     * 
     */
    public SetTargetToAdGroupResponse createSetTargetToAdGroupResponse() {
        return new SetTargetToAdGroupResponse();
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
     * Create an instance of {@link CityTarget }
     * 
     */
    public CityTarget createCityTarget() {
        return new CityTarget();
    }

    /**
     * Create an instance of {@link DynamicSearchAdsSetting }
     * 
     */
    public DynamicSearchAdsSetting createDynamicSearchAdsSetting() {
        return new DynamicSearchAdsSetting();
    }

    /**
     * Create an instance of {@link BMCStore }
     * 
     */
    public BMCStore createBMCStore() {
        return new BMCStore();
    }

    /**
     * Create an instance of {@link GetTargetsInfoFromLibraryResponse }
     * 
     */
    public GetTargetsInfoFromLibraryResponse createGetTargetsInfoFromLibraryResponse() {
        return new GetTargetsInfoFromLibraryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTargetInfo }
     * 
     */
    public ArrayOfTargetInfo createArrayOfTargetInfo() {
        return new ArrayOfTargetInfo();
    }

    /**
     * Create an instance of {@link MetroAreaTargetBid }
     * 
     */
    public MetroAreaTargetBid createMetroAreaTargetBid() {
        return new MetroAreaTargetBid();
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
     * Create an instance of {@link RemarketingList }
     * 
     */
    public RemarketingList createRemarketingList() {
        return new RemarketingList();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
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
     * Create an instance of {@link DeleteSitePlacementsResponse }
     * 
     */
    public DeleteSitePlacementsResponse createDeleteSitePlacementsResponse() {
        return new DeleteSitePlacementsResponse();
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
     * Create an instance of {@link TargetInfo }
     * 
     */
    public TargetInfo createTargetInfo() {
        return new TargetInfo();
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
     * Create an instance of {@link AddAdGroupRemarketingListAssociationsRequest }
     * 
     */
    public AddAdGroupRemarketingListAssociationsRequest createAddAdGroupRemarketingListAssociationsRequest() {
        return new AddAdGroupRemarketingListAssociationsRequest();
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
     * Create an instance of {@link DeviceOSTargetBid }
     * 
     */
    public DeviceOSTargetBid createDeviceOSTargetBid() {
        return new DeviceOSTargetBid();
    }

    /**
     * Create an instance of {@link UpdateSitePlacementsRequest }
     * 
     */
    public UpdateSitePlacementsRequest createUpdateSitePlacementsRequest() {
        return new UpdateSitePlacementsRequest();
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
     * Create an instance of {@link DeleteTargetFromAdGroupResponse }
     * 
     */
    public DeleteTargetFromAdGroupResponse createDeleteTargetFromAdGroupResponse() {
        return new DeleteTargetFromAdGroupResponse();
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
     * Create an instance of {@link ArrayOfCountryTargetBid }
     * 
     */
    public ArrayOfCountryTargetBid createArrayOfCountryTargetBid() {
        return new ArrayOfCountryTargetBid();
    }

    /**
     * Create an instance of {@link MetroAreaTarget }
     * 
     */
    public MetroAreaTarget createMetroAreaTarget() {
        return new MetroAreaTarget();
    }

    /**
     * Create an instance of {@link UpdateAdExtensionsResponse }
     * 
     */
    public UpdateAdExtensionsResponse createUpdateAdExtensionsResponse() {
        return new UpdateAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link SetTargetToCampaignRequest }
     * 
     */
    public SetTargetToCampaignRequest createSetTargetToCampaignRequest() {
        return new SetTargetToCampaignRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDimension }
     * 
     */
    public ArrayOfDimension createArrayOfDimension() {
        return new ArrayOfDimension();
    }

    /**
     * Create an instance of {@link CampaignNegativeSites }
     * 
     */
    public CampaignNegativeSites createCampaignNegativeSites() {
        return new CampaignNegativeSites();
    }

    /**
     * Create an instance of {@link SetAdExtensionsAssociationsRequest }
     * 
     */
    public SetAdExtensionsAssociationsRequest createSetAdExtensionsAssociationsRequest() {
        return new SetAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetSitePlacementsByIdsRequest }
     * 
     */
    public GetSitePlacementsByIdsRequest createGetSitePlacementsByIdsRequest() {
        return new GetSitePlacementsByIdsRequest();
    }

    /**
     * Create an instance of {@link StateTarget }
     * 
     */
    public StateTarget createStateTarget() {
        return new StateTarget();
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
     * Create an instance of {@link AddSitePlacementsResponse }
     * 
     */
    public AddSitePlacementsResponse createAddSitePlacementsResponse() {
        return new AddSitePlacementsResponse();
    }

    /**
     * Create an instance of {@link AddAdGroupRemarketingListAssociationsResponse }
     * 
     */
    public AddAdGroupRemarketingListAssociationsResponse createAddAdGroupRemarketingListAssociationsResponse() {
        return new AddAdGroupRemarketingListAssociationsResponse();
    }

    /**
     * Create an instance of {@link SharedEntityAssociation }
     * 
     */
    public SharedEntityAssociation createSharedEntityAssociation() {
        return new SharedEntityAssociation();
    }

    /**
     * Create an instance of {@link GetSitePlacementsByAdGroupIdRequest }
     * 
     */
    public GetSitePlacementsByAdGroupIdRequest createGetSitePlacementsByAdGroupIdRequest() {
        return new GetSitePlacementsByAdGroupIdRequest();
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
     * Create an instance of {@link GetAdGroupRemarketingListAssociationsRequest }
     * 
     */
    public GetAdGroupRemarketingListAssociationsRequest createGetAdGroupRemarketingListAssociationsRequest() {
        return new GetAdGroupRemarketingListAssociationsRequest();
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
     * Create an instance of {@link GetTargetsByAdGroupIdsRequest }
     * 
     */
    public GetTargetsByAdGroupIdsRequest createGetTargetsByAdGroupIdsRequest() {
        return new GetTargetsByAdGroupIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMediaRepresentation }
     * 
     */
    public ArrayOfMediaRepresentation createArrayOfMediaRepresentation() {
        return new ArrayOfMediaRepresentation();
    }

    /**
     * Create an instance of {@link DeviceOSTarget }
     * 
     */
    public DeviceOSTarget createDeviceOSTarget() {
        return new DeviceOSTarget();
    }

    /**
     * Create an instance of {@link CampaignCriterion }
     * 
     */
    public CampaignCriterion createCampaignCriterion() {
        return new CampaignCriterion();
    }

    /**
     * Create an instance of {@link AdGroup }
     * 
     */
    public AdGroup createAdGroup() {
        return new AdGroup();
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
     * Create an instance of {@link ArrayOfMediaType }
     * 
     */
    public ArrayOfMediaType createArrayOfMediaType() {
        return new ArrayOfMediaType();
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
     * Create an instance of {@link ArrayOfGenderTargetBid }
     * 
     */
    public ArrayOfGenderTargetBid createArrayOfGenderTargetBid() {
        return new ArrayOfGenderTargetBid();
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
     * Create an instance of {@link GetCampaignsByIdsRequest }
     * 
     */
    public GetCampaignsByIdsRequest createGetCampaignsByIdsRequest() {
        return new GetCampaignsByIdsRequest();
    }

    /**
     * Create an instance of {@link UpdateSitePlacementsResponse }
     * 
     */
    public UpdateSitePlacementsResponse createUpdateSitePlacementsResponse() {
        return new UpdateSitePlacementsResponse();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsBySharedEntityIdsRequest }
     * 
     */
    public GetSharedEntityAssociationsBySharedEntityIdsRequest createGetSharedEntityAssociationsBySharedEntityIdsRequest() {
        return new GetSharedEntityAssociationsBySharedEntityIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDeviceOSTargetBid }
     * 
     */
    public ArrayOfDeviceOSTargetBid createArrayOfDeviceOSTargetBid() {
        return new ArrayOfDeviceOSTargetBid();
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
     * Create an instance of {@link PostalCodeTargetBid }
     * 
     */
    public PostalCodeTargetBid createPostalCodeTargetBid() {
        return new PostalCodeTargetBid();
    }

    /**
     * Create an instance of {@link CountryTargetBid }
     * 
     */
    public CountryTargetBid createCountryTargetBid() {
        return new CountryTargetBid();
    }

    /**
     * Create an instance of {@link GetTargetsByIdsRequest }
     * 
     */
    public GetTargetsByIdsRequest createGetTargetsByIdsRequest() {
        return new GetTargetsByIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfRemarketingList }
     * 
     */
    public ArrayOfRemarketingList createArrayOfRemarketingList() {
        return new ArrayOfRemarketingList();
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
     * Create an instance of {@link SiteLinksAdExtension }
     * 
     */
    public SiteLinksAdExtension createSiteLinksAdExtension() {
        return new SiteLinksAdExtension();
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
     * Create an instance of {@link GetCampaignsByAccountIdResponse }
     * 
     */
    public GetCampaignsByAccountIdResponse createGetCampaignsByAccountIdResponse() {
        return new GetCampaignsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link TextAd }
     * 
     */
    public TextAd createTextAd() {
        return new TextAd();
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
     * Create an instance of {@link GetTargetsByCampaignIdsResponse }
     * 
     */
    public GetTargetsByCampaignIdsResponse createGetTargetsByCampaignIdsResponse() {
        return new GetTargetsByCampaignIdsResponse();
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
     * Create an instance of {@link Dimension }
     * 
     */
    public Dimension createDimension() {
        return new Dimension();
    }

    /**
     * Create an instance of {@link ProductPartition }
     * 
     */
    public ProductPartition createProductPartition() {
        return new ProductPartition();
    }

    /**
     * Create an instance of {@link DeleteTargetsFromLibraryResponse }
     * 
     */
    public DeleteTargetsFromLibraryResponse createDeleteTargetsFromLibraryResponse() {
        return new DeleteTargetsFromLibraryResponse();
    }

    /**
     * Create an instance of {@link UpdateAdGroupRemarketingListAssociationsRequest }
     * 
     */
    public UpdateAdGroupRemarketingListAssociationsRequest createUpdateAdGroupRemarketingListAssociationsRequest() {
        return new UpdateAdGroupRemarketingListAssociationsRequest();
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
     * Create an instance of {@link GetTargetsByCampaignIdsRequest }
     * 
     */
    public GetTargetsByCampaignIdsRequest createGetTargetsByCampaignIdsRequest() {
        return new GetTargetsByCampaignIdsRequest();
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
     * Create an instance of {@link DayTimeTargetBid }
     * 
     */
    public DayTimeTargetBid createDayTimeTargetBid() {
        return new DayTimeTargetBid();
    }

    /**
     * Create an instance of {@link DeleteListItemsFromSharedListRequest }
     * 
     */
    public DeleteListItemsFromSharedListRequest createDeleteListItemsFromSharedListRequest() {
        return new DeleteListItemsFromSharedListRequest();
    }

    /**
     * Create an instance of {@link AddRemarketingListsResponse }
     * 
     */
    public AddRemarketingListsResponse createAddRemarketingListsResponse() {
        return new AddRemarketingListsResponse();
    }

    /**
     * Create an instance of {@link DeleteKeywordsResponse }
     * 
     */
    public DeleteKeywordsResponse createDeleteKeywordsResponse() {
        return new DeleteKeywordsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdGroupRemarketingListAssociationsRequest }
     * 
     */
    public DeleteAdGroupRemarketingListAssociationsRequest createDeleteAdGroupRemarketingListAssociationsRequest() {
        return new DeleteAdGroupRemarketingListAssociationsRequest();
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
     * Create an instance of {@link AddRemarketingListsRequest }
     * 
     */
    public AddRemarketingListsRequest createAddRemarketingListsRequest() {
        return new AddRemarketingListsRequest();
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
     * Create an instance of {@link PlacementDetail }
     * 
     */
    public PlacementDetail createPlacementDetail() {
        return new PlacementDetail();
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
     * Create an instance of {@link GetPlacementDetailsForUrlsRequest }
     * 
     */
    public GetPlacementDetailsForUrlsRequest createGetPlacementDetailsForUrlsRequest() {
        return new GetPlacementDetailsForUrlsRequest();
    }

    /**
     * Create an instance of {@link DeleteTargetsFromLibraryRequest }
     * 
     */
    public DeleteTargetsFromLibraryRequest createDeleteTargetsFromLibraryRequest() {
        return new DeleteTargetsFromLibraryRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByIdsResponse }
     * 
     */
    public GetConversionGoalsByIdsResponse createGetConversionGoalsByIdsResponse() {
        return new GetConversionGoalsByIdsResponse();
    }

    /**
     * Create an instance of {@link AdGroupRemarketingListAssociation }
     * 
     */
    public AdGroupRemarketingListAssociation createAdGroupRemarketingListAssociation() {
        return new AdGroupRemarketingListAssociation();
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
     * Create an instance of {@link UpdateRemarketingListsRequest }
     * 
     */
    public UpdateRemarketingListsRequest createUpdateRemarketingListsRequest() {
        return new UpdateRemarketingListsRequest();
    }

    /**
     * Create an instance of {@link GetListItemsBySharedListResponse }
     * 
     */
    public GetListItemsBySharedListResponse createGetListItemsBySharedListResponse() {
        return new GetListItemsBySharedListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCityTargetBid }
     * 
     */
    public ArrayOfCityTargetBid createArrayOfCityTargetBid() {
        return new ArrayOfCityTargetBid();
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
     * Create an instance of {@link AgeTarget }
     * 
     */
    public AgeTarget createAgeTarget() {
        return new AgeTarget();
    }

    /**
     * Create an instance of {@link AddMediaRequest }
     * 
     */
    public AddMediaRequest createAddMediaRequest() {
        return new AddMediaRequest();
    }

    /**
     * Create an instance of {@link UetTag }
     * 
     */
    public UetTag createUetTag() {
        return new UetTag();
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
     * Create an instance of {@link GetRemarketingListsResponse }
     * 
     */
    public GetRemarketingListsResponse createGetRemarketingListsResponse() {
        return new GetRemarketingListsResponse();
    }

    /**
     * Create an instance of {@link DeleteTargetFromAdGroupRequest }
     * 
     */
    public DeleteTargetFromAdGroupRequest createDeleteTargetFromAdGroupRequest() {
        return new DeleteTargetFromAdGroupRequest();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
    }

    /**
     * Create an instance of {@link DeleteAdGroupRemarketingListAssociationsResponse }
     * 
     */
    public DeleteAdGroupRemarketingListAssociationsResponse createDeleteAdGroupRemarketingListAssociationsResponse() {
        return new DeleteAdGroupRemarketingListAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItem }
     * 
     */
    public ArrayOfRuleItem createArrayOfRuleItem() {
        return new ArrayOfRuleItem();
    }

    /**
     * Create an instance of {@link CustomEventsRule }
     * 
     */
    public CustomEventsRule createCustomEventsRule() {
        return new CustomEventsRule();
    }

    /**
     * Create an instance of {@link EntityIdToParentIdAssociation }
     * 
     */
    public EntityIdToParentIdAssociation createEntityIdToParentIdAssociation() {
        return new EntityIdToParentIdAssociation();
    }

    /**
     * Create an instance of {@link BiddingScheme }
     * 
     */
    public BiddingScheme createBiddingScheme() {
        return new BiddingScheme();
    }

    /**
     * Create an instance of {@link TargetCpaBiddingScheme }
     * 
     */
    public TargetCpaBiddingScheme createTargetCpaBiddingScheme() {
        return new TargetCpaBiddingScheme();
    }

    /**
     * Create an instance of {@link ManualCpcBiddingScheme }
     * 
     */
    public ManualCpcBiddingScheme createManualCpcBiddingScheme() {
        return new ManualCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link MaxClicksBiddingScheme }
     * 
     */
    public MaxClicksBiddingScheme createMaxClicksBiddingScheme() {
        return new MaxClicksBiddingScheme();
    }

    /**
     * Create an instance of {@link RuleItem }
     * 
     */
    public RuleItem createRuleItem() {
        return new RuleItem();
    }

    /**
     * Create an instance of {@link ArrayOfCustomParameter }
     * 
     */
    public ArrayOfCustomParameter createArrayOfCustomParameter() {
        return new ArrayOfCustomParameter();
    }

    /**
     * Create an instance of {@link CustomParameter }
     * 
     */
    public CustomParameter createCustomParameter() {
        return new CustomParameter();
    }

    /**
     * Create an instance of {@link CustomParameters }
     * 
     */
    public CustomParameters createCustomParameters() {
        return new CustomParameters();
    }

    /**
     * Create an instance of {@link ArrayOfWebpageCondition }
     * 
     */
    public ArrayOfWebpageCondition createArrayOfWebpageCondition() {
        return new ArrayOfWebpageCondition();
    }

    /**
     * Create an instance of {@link WebpageCondition }
     * 
     */
    public WebpageCondition createWebpageCondition() {
        return new WebpageCondition();
    }

    /**
     * Create an instance of {@link StringRuleItem }
     * 
     */
    public StringRuleItem createStringRuleItem() {
        return new StringRuleItem();
    }

    /**
     * Create an instance of {@link PageVisitorsRule }
     * 
     */
    public PageVisitorsRule createPageVisitorsRule() {
        return new PageVisitorsRule();
    }

    /**
     * Create an instance of {@link RemarketingRule }
     * 
     */
    public RemarketingRule createRemarketingRule() {
        return new RemarketingRule();
    }

    /**
     * Create an instance of {@link AppUrl }
     * 
     */
    public AppUrl createAppUrl() {
        return new AppUrl();
    }

    /**
     * Create an instance of {@link InheritFromParentBiddingScheme }
     * 
     */
    public InheritFromParentBiddingScheme createInheritFromParentBiddingScheme() {
        return new InheritFromParentBiddingScheme();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoVisitedAnotherPageRule }
     * 
     */
    public PageVisitorsWhoVisitedAnotherPageRule createPageVisitorsWhoVisitedAnotherPageRule() {
        return new PageVisitorsWhoVisitedAnotherPageRule();
    }

    /**
     * Create an instance of {@link RuleItemGroup }
     * 
     */
    public RuleItemGroup createRuleItemGroup() {
        return new RuleItemGroup();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItemGroup }
     * 
     */
    public ArrayOfRuleItemGroup createArrayOfRuleItemGroup() {
        return new ArrayOfRuleItemGroup();
    }

    /**
     * Create an instance of {@link EnhancedCpcBiddingScheme }
     * 
     */
    public EnhancedCpcBiddingScheme createEnhancedCpcBiddingScheme() {
        return new EnhancedCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoDidNotVisitAnotherPageRule }
     * 
     */
    public PageVisitorsWhoDidNotVisitAnotherPageRule createPageVisitorsWhoDidNotVisitAnotherPageRule() {
        return new PageVisitorsWhoDidNotVisitAnotherPageRule();
    }

    /**
     * Create an instance of {@link Webpage }
     * 
     */
    public Webpage createWebpage() {
        return new Webpage();
    }

    /**
     * Create an instance of {@link ArrayOfAppUrl }
     * 
     */
    public ArrayOfAppUrl createArrayOfAppUrl() {
        return new ArrayOfAppUrl();
    }

    /**
     * Create an instance of {@link MaxConversionsBiddingScheme }
     * 
     */
    public MaxConversionsBiddingScheme createMaxConversionsBiddingScheme() {
        return new MaxConversionsBiddingScheme();
    }

    /**
     * Create an instance of {@link WebpageParameter }
     * 
     */
    public WebpageParameter createWebpageParameter() {
        return new WebpageParameter();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfEntityNegativeKeyword")
    public JAXBElement<ArrayOfEntityNegativeKeyword> createArrayOfEntityNegativeKeyword(ArrayOfEntityNegativeKeyword value) {
        return new JAXBElement<ArrayOfEntityNegativeKeyword>(_ArrayOfEntityNegativeKeyword_QNAME, ArrayOfEntityNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DynamicSearchAdsSetting")
    public JAXBElement<DynamicSearchAdsSetting> createDynamicSearchAdsSetting(DynamicSearchAdsSetting value) {
        return new JAXBElement<DynamicSearchAdsSetting>(_DynamicSearchAdsSetting_QNAME, DynamicSearchAdsSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupNegativeSites")
    public JAXBElement<AdGroupNegativeSites> createAdGroupNegativeSites(AdGroupNegativeSites value) {
        return new JAXBElement<AdGroupNegativeSites>(_AdGroupNegativeSites_QNAME, AdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "CustomParameter")
    public JAXBElement<CustomParameter> createCustomParameter(CustomParameter value) {
        return new JAXBElement<CustomParameter>(_CustomParameter_QNAME, CustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CityTarget")
    public JAXBElement<CityTarget> createCityTarget(CityTarget value) {
        return new JAXBElement<CityTarget>(_CityTarget_QNAME, CityTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupRemarketingListAssociationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupRemarketingListAssociationStatus")
    public JAXBElement<AdGroupRemarketingListAssociationStatus> createAdGroupRemarketingListAssociationStatus(AdGroupRemarketingListAssociationStatus value) {
        return new JAXBElement<AdGroupRemarketingListAssociationStatus>(_AdGroupRemarketingListAssociationStatus_QNAME, AdGroupRemarketingListAssociationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AssociationType")
    public JAXBElement<AssociationType> createAssociationType(AssociationType value) {
        return new JAXBElement<AssociationType>(_AssociationType_QNAME, AssociationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionsTypeFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionsTypeFilter")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<AdExtensionsTypeFilter>> createAdExtensionsTypeFilter(Collection<AdExtensionsTypeFilter> value) {
        return new JAXBElement<Collection<AdExtensionsTypeFilter>>(_AdExtensionsTypeFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingTargetingSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "RemarketingTargetingSetting")
    public JAXBElement<RemarketingTargetingSetting> createRemarketingTargetingSetting(RemarketingTargetingSetting value) {
        return new JAXBElement<RemarketingTargetingSetting>(_RemarketingTargetingSetting_QNAME, RemarketingTargetingSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MediaMetaData")
    public JAXBElement<MediaMetaData> createMediaMetaData(MediaMetaData value) {
        return new JAXBElement<MediaMetaData>(_MediaMetaData_QNAME, MediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStateTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfStateTargetBid")
    public JAXBElement<ArrayOfStateTargetBid> createArrayOfStateTargetBid(ArrayOfStateTargetBid value) {
        return new JAXBElement<ArrayOfStateTargetBid>(_ArrayOfStateTargetBid_QNAME, ArrayOfStateTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfEditorialReason")
    public JAXBElement<ArrayOfEditorialReason> createArrayOfEditorialReason(ArrayOfEditorialReason value) {
        return new JAXBElement<ArrayOfEditorialReason>(_ArrayOfEditorialReason_QNAME, ArrayOfEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "UetTag")
    public JAXBElement<UetTag> createUetTag(UetTag value) {
        return new JAXBElement<UetTag>(_UetTag_QNAME, UetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "NegativeKeyword")
    public JAXBElement<NegativeKeyword> createNegativeKeyword(NegativeKeyword value) {
        return new JAXBElement<NegativeKeyword>(_NegativeKeyword_QNAME, NegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EventGoal")
    public JAXBElement<EventGoal> createEventGoal(EventGoal value) {
        return new JAXBElement<EventGoal>(_EventGoal_QNAME, EventGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignAdditionalField")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<CampaignAdditionalField>> createCampaignAdditionalField(Collection<CampaignAdditionalField> value) {
        return new JAXBElement<Collection<CampaignAdditionalField>>(_CampaignAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AgeTarget")
    public JAXBElement<AgeTarget> createAgeTarget(AgeTarget value) {
        return new JAXBElement<AgeTarget>(_AgeTarget_QNAME, AgeTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdToParentIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "EntityIdToParentIdAssociation")
    public JAXBElement<EntityIdToParentIdAssociation> createEntityIdToParentIdAssociation(EntityIdToParentIdAssociation value) {
        return new JAXBElement<EntityIdToParentIdAssociation>(_EntityIdToParentIdAssociation_QNAME, EntityIdToParentIdAssociation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DistanceUnit")
    public JAXBElement<DistanceUnit> createDistanceUnit(DistanceUnit value) {
        return new JAXBElement<DistanceUnit>(_DistanceUnit_QNAME, DistanceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountMigrationStatusesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AccountMigrationStatusesInfo")
    public JAXBElement<AccountMigrationStatusesInfo> createAccountMigrationStatusesInfo(AccountMigrationStatusesInfo value) {
        return new JAXBElement<AccountMigrationStatusesInfo>(_AccountMigrationStatusesInfo_QNAME, AccountMigrationStatusesInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "GenderTarget")
    public JAXBElement<GenderTarget> createGenderTarget(GenderTarget value) {
        return new JAXBElement<GenderTarget>(_GenderTarget_QNAME, GenderTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCityTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCityTargetBid")
    public JAXBElement<ArrayOfCityTargetBid> createArrayOfCityTargetBid(ArrayOfCityTargetBid value) {
        return new JAXBElement<ArrayOfCityTargetBid>(_ArrayOfCityTargetBid_QNAME, ArrayOfCityTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntityAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSharedEntityAssociation")
    public JAXBElement<ArrayOfSharedEntityAssociation> createArrayOfSharedEntityAssociation(ArrayOfSharedEntityAssociation value) {
        return new JAXBElement<ArrayOfSharedEntityAssociation>(_ArrayOfSharedEntityAssociation_QNAME, ArrayOfSharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpressionsPerDayRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ImpressionsPerDayRange")
    public JAXBElement<ImpressionsPerDayRange> createImpressionsPerDayRange(ImpressionsPerDayRange value) {
        return new JAXBElement<ImpressionsPerDayRange>(_ImpressionsPerDayRange_QNAME, ImpressionsPerDayRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MigrationStatus")
    public JAXBElement<MigrationStatus> createMigrationStatus(MigrationStatus value) {
        return new JAXBElement<MigrationStatus>(_MigrationStatus_QNAME, MigrationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtension")
    public JAXBElement<ArrayOfAdExtension> createArrayOfAdExtension(ArrayOfAdExtension value) {
        return new JAXBElement<ArrayOfAdExtension>(_ArrayOfAdExtension_QNAME, ArrayOfAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSiteLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSiteLink")
    public JAXBElement<ArrayOfSiteLink> createArrayOfSiteLink(ArrayOfSiteLink value) {
        return new JAXBElement<ArrayOfSiteLink>(_ArrayOfSiteLink_QNAME, ArrayOfSiteLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeCampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "NegativeCampaignCriterion")
    public JAXBElement<NegativeCampaignCriterion> createNegativeCampaignCriterion(NegativeCampaignCriterion value) {
        return new JAXBElement<NegativeCampaignCriterion>(_NegativeCampaignCriterion_QNAME, NegativeCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdGroupNegativeSites")
    public JAXBElement<ArrayOfAdGroupNegativeSites> createArrayOfAdGroupNegativeSites(ArrayOfAdGroupNegativeSites value) {
        return new JAXBElement<ArrayOfAdGroupNegativeSites>(_ArrayOfAdGroupNegativeSites_QNAME, ArrayOfAdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CountryTarget")
    public JAXBElement<CountryTarget> createCountryTarget(CountryTarget value) {
        return new JAXBElement<CountryTarget>(_CountryTarget_QNAME, CountryTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "PageVisitorsRule")
    public JAXBElement<PageVisitorsRule> createPageVisitorsRule(PageVisitorsRule value) {
        return new JAXBElement<PageVisitorsRule>(_PageVisitorsRule_QNAME, PageVisitorsRule.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupRemarketingListAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupRemarketingListAssociation")
    public JAXBElement<AdGroupRemarketingListAssociation> createAdGroupRemarketingListAssociation(AdGroupRemarketingListAssociation value) {
        return new JAXBElement<AdGroupRemarketingListAssociation>(_AdGroupRemarketingListAssociation_QNAME, AdGroupRemarketingListAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviewAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ReviewAdExtension")
    public JAXBElement<ReviewAdExtension> createReviewAdExtension(ReviewAdExtension value) {
        return new JAXBElement<ReviewAdExtension>(_ReviewAdExtension_QNAME, ReviewAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "NegativeAdGroupCriterion")
    public JAXBElement<NegativeAdGroupCriterion> createNegativeAdGroupCriterion(NegativeAdGroupCriterion value) {
        return new JAXBElement<NegativeAdGroupCriterion>(_NegativeAdGroupCriterion_QNAME, NegativeAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "StringOperator")
    public JAXBElement<StringOperator> createStringOperator(StringOperator value) {
        return new JAXBElement<StringOperator>(_StringOperator_QNAME, StringOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSharedListItem")
    public JAXBElement<ArrayOfSharedListItem> createArrayOfSharedListItem(ArrayOfSharedListItem value) {
        return new JAXBElement<ArrayOfSharedListItem>(_ArrayOfSharedListItem_QNAME, ArrayOfSharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EntityType")
    public JAXBElement<EntityType> createEntityType(EntityType value) {
        return new JAXBElement<EntityType>(_EntityType_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionEditorialReasonCollection")
    public JAXBElement<AdExtensionEditorialReasonCollection> createAdExtensionEditorialReasonCollection(AdExtensionEditorialReasonCollection value) {
        return new JAXBElement<AdExtensionEditorialReasonCollection>(_AdExtensionEditorialReasonCollection_QNAME, AdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MigrationStatusInfo")
    public JAXBElement<MigrationStatusInfo> createMigrationStatusInfo(MigrationStatusInfo value) {
        return new JAXBElement<MigrationStatusInfo>(_MigrationStatusInfo_QNAME, MigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfIdCollection")
    public JAXBElement<ArrayOfIdCollection> createArrayOfIdCollection(ArrayOfIdCollection value) {
        return new JAXBElement<ArrayOfIdCollection>(_ArrayOfIdCollection_QNAME, ArrayOfIdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSharedEntity")
    public JAXBElement<ArrayOfSharedEntity> createArrayOfSharedEntity(ArrayOfSharedEntity value) {
        return new JAXBElement<ArrayOfSharedEntity>(_ArrayOfSharedEntity_QNAME, ArrayOfSharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadiusTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "RadiusTargetBid")
    public JAXBElement<RadiusTargetBid> createRadiusTargetBid(RadiusTargetBid value) {
        return new JAXBElement<RadiusTargetBid>(_RadiusTargetBid_QNAME, RadiusTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpandedTextAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ExpandedTextAd")
    public JAXBElement<ExpandedTextAd> createExpandedTextAd(ExpandedTextAd value) {
        return new JAXBElement<ExpandedTextAd>(_ExpandedTextAd_QNAME, ExpandedTextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Media }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Media")
    public JAXBElement<Media> createMedia(Media value) {
        return new JAXBElement<Media>(_Media_QNAME, Media.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "PlacementDetail")
    public JAXBElement<PlacementDetail> createPlacementDetail(PlacementDetail value) {
        return new JAXBElement<PlacementDetail>(_PlacementDetail_QNAME, PlacementDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMigrationStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMigrationStatusInfo")
    public JAXBElement<ArrayOfMigrationStatusInfo> createArrayOfMigrationStatusInfo(ArrayOfMigrationStatusInfo value) {
        return new JAXBElement<ArrayOfMigrationStatusInfo>(_ArrayOfMigrationStatusInfo_QNAME, ArrayOfMigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalRevenueType")
    public JAXBElement<ConversionGoalRevenueType> createConversionGoalRevenueType(ConversionGoalRevenueType value) {
        return new JAXBElement<ConversionGoalRevenueType>(_ConversionGoalRevenueType_QNAME, ConversionGoalRevenueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Setting")
    public JAXBElement<Setting> createSetting(Setting value) {
        return new JAXBElement<Setting>(_Setting_QNAME, Setting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCampaignCriterion")
    public JAXBElement<ArrayOfCampaignCriterion> createArrayOfCampaignCriterion(ArrayOfCampaignCriterion value) {
        return new JAXBElement<ArrayOfCampaignCriterion>(_ArrayOfCampaignCriterion_QNAME, ArrayOfCampaignCriterion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<Guid>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupCriterion")
    public JAXBElement<AdGroupCriterion> createAdGroupCriterion(AdGroupCriterion value) {
        return new JAXBElement<AdGroupCriterion>(_AdGroupCriterion_QNAME, AdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdGroupCriterion")
    public JAXBElement<ArrayOfAdGroupCriterion> createArrayOfAdGroupCriterion(ArrayOfAdGroupCriterion value) {
        return new JAXBElement<ArrayOfAdGroupCriterion>(_ArrayOfAdGroupCriterion_QNAME, ArrayOfAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxConversionsBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "MaxConversionsBiddingScheme")
    public JAXBElement<MaxConversionsBiddingScheme> createMaxConversionsBiddingScheme(MaxConversionsBiddingScheme value) {
        return new JAXBElement<MaxConversionsBiddingScheme>(_MaxConversionsBiddingScheme_QNAME, MaxConversionsBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EntityNegativeKeyword")
    public JAXBElement<EntityNegativeKeyword> createEntityNegativeKeyword(EntityNegativeKeyword value) {
        return new JAXBElement<EntityNegativeKeyword>(_EntityNegativeKeyword_QNAME, EntityNegativeKeyword.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Webpage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "Webpage")
    public JAXBElement<Webpage> createWebpage(Webpage value) {
        return new JAXBElement<Webpage>(_Webpage_QNAME, Webpage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ProductAd")
    public JAXBElement<ProductAd> createProductAd(ProductAd value) {
        return new JAXBElement<ProductAd>(_ProductAd_QNAME, ProductAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionStatus")
    public JAXBElement<AdExtensionStatus> createAdExtensionStatus(AdExtensionStatus value) {
        return new JAXBElement<AdExtensionStatus>(_AdExtensionStatus_QNAME, AdExtensionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoVisitedAnotherPageRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "PageVisitorsWhoVisitedAnotherPageRule")
    public JAXBElement<PageVisitorsWhoVisitedAnotherPageRule> createPageVisitorsWhoVisitedAnotherPageRule(PageVisitorsWhoVisitedAnotherPageRule value) {
        return new JAXBElement<PageVisitorsWhoVisitedAnotherPageRule>(_PageVisitorsWhoVisitedAnotherPageRule_QNAME, PageVisitorsWhoVisitedAnotherPageRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlacementDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfPlacementDetail")
    public JAXBElement<ArrayOfPlacementDetail> createArrayOfPlacementDetail(ArrayOfPlacementDetail value) {
        return new JAXBElement<ArrayOfPlacementDetail>(_ArrayOfPlacementDetail_QNAME, ArrayOfPlacementDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessGeoCodeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BusinessGeoCodeStatus")
    public JAXBElement<BusinessGeoCodeStatus> createBusinessGeoCodeStatus(BusinessGeoCodeStatus value) {
        return new JAXBElement<BusinessGeoCodeStatus>(_BusinessGeoCodeStatus_QNAME, BusinessGeoCodeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "FixedBid")
    public JAXBElement<FixedBid> createFixedBid(FixedBid value) {
        return new JAXBElement<FixedBid>(_FixedBid_QNAME, FixedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItemGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfRuleItemGroup")
    public JAXBElement<ArrayOfRuleItemGroup> createArrayOfRuleItemGroup(ArrayOfRuleItemGroup value) {
        return new JAXBElement<ArrayOfRuleItemGroup>(_ArrayOfRuleItemGroup_QNAME, ArrayOfRuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfArrayOfMediaAssociation")
    public JAXBElement<ArrayOfArrayOfMediaAssociation> createArrayOfArrayOfMediaAssociation(ArrayOfArrayOfMediaAssociation value) {
        return new JAXBElement<ArrayOfArrayOfMediaAssociation>(_ArrayOfArrayOfMediaAssociation_QNAME, ArrayOfArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfPlacementDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfArrayOfPlacementDetail")
    public JAXBElement<ArrayOfArrayOfPlacementDetail> createArrayOfArrayOfPlacementDetail(ArrayOfArrayOfPlacementDetail value) {
        return new JAXBElement<ArrayOfArrayOfPlacementDetail>(_ArrayOfArrayOfPlacementDetail_QNAME, ArrayOfArrayOfPlacementDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EditorialReasonCollection")
    public JAXBElement<EditorialReasonCollection> createEditorialReasonCollection(EditorialReasonCollection value) {
        return new JAXBElement<EditorialReasonCollection>(_EditorialReasonCollection_QNAME, EditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTimeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DayTimeTargetBid")
    public JAXBElement<DayTimeTargetBid> createDayTimeTargetBid(DayTimeTargetBid value) {
        return new JAXBElement<DayTimeTargetBid>(_DayTimeTargetBid_QNAME, DayTimeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Day }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Day")
    public JAXBElement<Day> createDay(Day value) {
        return new JAXBElement<Day>(_Day_QNAME, Day.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "RuleItem")
    public JAXBElement<RuleItem> createRuleItem(RuleItem value) {
        return new JAXBElement<RuleItem>(_RuleItem_QNAME, RuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionAssociation")
    public JAXBElement<AdExtensionAssociation> createAdExtensionAssociation(AdExtensionAssociation value) {
        return new JAXBElement<AdExtensionAssociation>(_AdExtensionAssociation_QNAME, AdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionIdentity")
    public JAXBElement<ArrayOfAdExtensionIdentity> createArrayOfAdExtensionIdentity(ArrayOfAdExtensionIdentity value) {
        return new JAXBElement<ArrayOfAdExtensionIdentity>(_ArrayOfAdExtensionIdentity_QNAME, ArrayOfAdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddableAdGroupCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BiddableAdGroupCriterion")
    public JAXBElement<BiddableAdGroupCriterion> createBiddableAdGroupCriterion(BiddableAdGroupCriterion value) {
        return new JAXBElement<BiddableAdGroupCriterion>(_BiddableAdGroupCriterion_QNAME, BiddableAdGroupCriterion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "GenderType")
    public JAXBElement<GenderType> createGenderType(GenderType value) {
        return new JAXBElement<GenderType>(_GenderType_QNAME, GenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ProductPartition")
    public JAXBElement<ProductPartition> createProductPartition(ProductPartition value) {
        return new JAXBElement<ProductPartition>(_ProductPartition_QNAME, ProductPartition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCpaBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "TargetCpaBiddingScheme")
    public JAXBElement<TargetCpaBiddingScheme> createTargetCpaBiddingScheme(TargetCpaBiddingScheme value) {
        return new JAXBElement<TargetCpaBiddingScheme>(_TargetCpaBiddingScheme_QNAME, TargetCpaBiddingScheme.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalStatus")
    public JAXBElement<ConversionGoalStatus> createConversionGoalStatus(ConversionGoalStatus value) {
        return new JAXBElement<ConversionGoalStatus>(_ConversionGoalStatus_QNAME, ConversionGoalStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Dimension")
    public JAXBElement<Dimension> createDimension(Dimension value) {
        return new JAXBElement<Dimension>(_Dimension_QNAME, Dimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxClicksBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "MaxClicksBiddingScheme")
    public JAXBElement<MaxClicksBiddingScheme> createMaxClicksBiddingScheme(MaxClicksBiddingScheme value) {
        return new JAXBElement<MaxClicksBiddingScheme>(_MaxClicksBiddingScheme_QNAME, MaxClicksBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EditorialApiFaultDetail")
    public JAXBElement<EditorialApiFaultDetail> createEditorialApiFaultDetail(EditorialApiFaultDetail value) {
        return new JAXBElement<EditorialApiFaultDetail>(_EditorialApiFaultDetail_QNAME, EditorialApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AppInstallAd")
    public JAXBElement<AppInstallAd> createAppInstallAd(AppInstallAd value) {
        return new JAXBElement<AppInstallAd>(_AppInstallAd_QNAME, AppInstallAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Keyword")
    public JAXBElement<Keyword> createKeyword(Keyword value) {
        return new JAXBElement<Keyword>(_Keyword_QNAME, Keyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignCriterionType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignCriterionType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<CampaignCriterionType>> createCampaignCriterionType(Collection<CampaignCriterionType> value) {
        return new JAXBElement<Collection<CampaignCriterionType>>(_CampaignCriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdEditorialStatus")
    public JAXBElement<AdEditorialStatus> createAdEditorialStatus(AdEditorialStatus value) {
        return new JAXBElement<AdEditorialStatus>(_AdEditorialStatus_QNAME, AdEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupCriterionEditorialStatus")
    public JAXBElement<AdGroupCriterionEditorialStatus> createAdGroupCriterionEditorialStatus(AdGroupCriterionEditorialStatus value) {
        return new JAXBElement<AdGroupCriterionEditorialStatus>(_AdGroupCriterionEditorialStatus_QNAME, AdGroupCriterionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SharedEntity")
    public JAXBElement<SharedEntity> createSharedEntity(SharedEntity value) {
        return new JAXBElement<SharedEntity>(_SharedEntity_QNAME, SharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Minute")
    public JAXBElement<Minute> createMinute(Minute value) {
        return new JAXBElement<Minute>(_Minute_QNAME, Minute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ProductScope")
    public JAXBElement<ProductScope> createProductScope(ProductScope value) {
        return new JAXBElement<ProductScope>(_ProductScope_QNAME, ProductScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Target }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Target")
    public JAXBElement<Target> createTarget(Target value) {
        return new JAXBElement<Target>(_Target_QNAME, Target.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "PricingModel")
    public JAXBElement<PricingModel> createPricingModel(PricingModel value) {
        return new JAXBElement<PricingModel>(_PricingModel_QNAME, PricingModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MediaAssociation")
    public JAXBElement<MediaAssociation> createMediaAssociation(MediaAssociation value) {
        return new JAXBElement<MediaAssociation>(_MediaAssociation_QNAME, MediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "TextAd")
    public JAXBElement<TextAd> createTextAd(TextAd value) {
        return new JAXBElement<TextAd>(_TextAd_QNAME, TextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignSize")
    public JAXBElement<CampaignSize> createCampaignSize(CampaignSize value) {
        return new JAXBElement<CampaignSize>(_CampaignSize_QNAME, CampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignStatus")
    public JAXBElement<CampaignStatus> createCampaignStatus(CampaignStatus value) {
        return new JAXBElement<CampaignStatus>(_CampaignStatus_QNAME, CampaignStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdType")
    public JAXBElement<ArrayOfAdType> createArrayOfAdType(ArrayOfAdType value) {
        return new JAXBElement<ArrayOfAdType>(_ArrayOfAdType_QNAME, ArrayOfAdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupRemarketingListAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdGroupRemarketingListAssociation")
    public JAXBElement<ArrayOfAdGroupRemarketingListAssociation> createArrayOfAdGroupRemarketingListAssociation(ArrayOfAdGroupRemarketingListAssociation value) {
        return new JAXBElement<ArrayOfAdGroupRemarketingListAssociation>(_ArrayOfAdGroupRemarketingListAssociation_QNAME, ArrayOfAdGroupRemarketingListAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteLinksAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SiteLinksAdExtension")
    public JAXBElement<SiteLinksAdExtension> createSiteLinksAdExtension(SiteLinksAdExtension value) {
        return new JAXBElement<SiteLinksAdExtension>(_SiteLinksAdExtension_QNAME, SiteLinksAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionAssociationCollection")
    public JAXBElement<AdExtensionAssociationCollection> createAdExtensionAssociationCollection(AdExtensionAssociationCollection value) {
        return new JAXBElement<AdExtensionAssociationCollection>(_AdExtensionAssociationCollection_QNAME, AdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalRevenue")
    public JAXBElement<ConversionGoalRevenue> createConversionGoalRevenue(ConversionGoalRevenue value) {
        return new JAXBElement<ConversionGoalRevenue>(_ConversionGoalRevenue_QNAME, ConversionGoalRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionAdditionalField")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<AdExtensionAdditionalField>> createAdExtensionAdditionalField(Collection<AdExtensionAdditionalField> value) {
        return new JAXBElement<Collection<AdExtensionAdditionalField>>(_AdExtensionAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "WebpageCondition")
    public JAXBElement<WebpageCondition> createWebpageCondition(WebpageCondition value) {
        return new JAXBElement<WebpageCondition>(_WebpageCondition_QNAME, WebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "KeywordAdditionalField")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<KeywordAdditionalField>> createKeywordAdditionalField(Collection<KeywordAdditionalField> value) {
        return new JAXBElement<Collection<KeywordAdditionalField>>(_KeywordAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CityTargetBid")
    public JAXBElement<CityTargetBid> createCityTargetBid(CityTargetBid value) {
        return new JAXBElement<CityTargetBid>(_CityTargetBid_QNAME, CityTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ItemAction")
    public JAXBElement<ItemAction> createItemAction(ItemAction value) {
        return new JAXBElement<ItemAction>(_ItemAction_QNAME, ItemAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionIdentity")
    public JAXBElement<AdExtensionIdentity> createAdExtensionIdentity(AdExtensionIdentity value) {
        return new JAXBElement<AdExtensionIdentity>(_AdExtensionIdentity_QNAME, AdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfRuleItem")
    public JAXBElement<ArrayOfRuleItem> createArrayOfRuleItem(ArrayOfRuleItem value) {
        return new JAXBElement<ArrayOfRuleItem>(_ArrayOfRuleItem_QNAME, ArrayOfRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupAdditionalField")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AdGroupAdditionalField>> createAdGroupAdditionalField(Collection<AdGroupAdditionalField> value) {
        return new JAXBElement<Collection<AdGroupAdditionalField>>(_AdGroupAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdToEntityIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionIdToEntityIdAssociation")
    public JAXBElement<AdExtensionIdToEntityIdAssociation> createAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<AdExtensionIdToEntityIdAssociation>(_AdExtensionIdToEntityIdAssociation_QNAME, AdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionEditorialReason")
    public JAXBElement<ArrayOfAdExtensionEditorialReason> createArrayOfAdExtensionEditorialReason(ArrayOfAdExtensionEditorialReason value) {
        return new JAXBElement<ArrayOfAdExtensionEditorialReason>(_ArrayOfAdExtensionEditorialReason_QNAME, ArrayOfAdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityIdToParentIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfEntityIdToParentIdAssociation")
    public JAXBElement<ArrayOfEntityIdToParentIdAssociation> createArrayOfEntityIdToParentIdAssociation(ArrayOfEntityIdToParentIdAssociation value) {
        return new JAXBElement<ArrayOfEntityIdToParentIdAssociation>(_ArrayOfEntityIdToParentIdAssociation_QNAME, ArrayOfEntityIdToParentIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionAssociationCollection")
    public JAXBElement<ArrayOfAdExtensionAssociationCollection> createArrayOfAdExtensionAssociationCollection(ArrayOfAdExtensionAssociationCollection value) {
        return new JAXBElement<ArrayOfAdExtensionAssociationCollection>(_ArrayOfAdExtensionAssociationCollection_QNAME, ArrayOfAdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "WebpageConditionOperand")
    public JAXBElement<WebpageConditionOperand> createWebpageConditionOperand(WebpageConditionOperand value) {
        return new JAXBElement<WebpageConditionOperand>(_WebpageConditionOperand_QNAME, WebpageConditionOperand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterionAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdGroupCriterionAction")
    public JAXBElement<ArrayOfAdGroupCriterionAction> createArrayOfAdGroupCriterionAction(ArrayOfAdGroupCriterionAction value) {
        return new JAXBElement<ArrayOfAdGroupCriterionAction>(_ArrayOfAdGroupCriterionAction_QNAME, ArrayOfAdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DayTime")
    public JAXBElement<DayTime> createDayTime(DayTime value) {
        return new JAXBElement<DayTime>(_DayTime_QNAME, DayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Network }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Network")
    public JAXBElement<Network> createNetwork(Network value) {
        return new JAXBElement<Network>(_Network_QNAME, Network.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionEditorialReasonCollection")
    public JAXBElement<ArrayOfAdExtensionEditorialReasonCollection> createArrayOfAdExtensionEditorialReasonCollection(ArrayOfAdExtensionEditorialReasonCollection value) {
        return new JAXBElement<ArrayOfAdExtensionEditorialReasonCollection>(_ArrayOfAdExtensionEditorialReasonCollection_QNAME, ArrayOfAdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemarketingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfRemarketingList")
    public JAXBElement<ArrayOfRemarketingList> createArrayOfRemarketingList(ArrayOfRemarketingList value) {
        return new JAXBElement<ArrayOfRemarketingList>(_ArrayOfRemarketingList_QNAME, ArrayOfRemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddingModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BiddingModel")
    public JAXBElement<BiddingModel> createBiddingModel(BiddingModel value) {
        return new JAXBElement<BiddingModel>(_BiddingModel_QNAME, BiddingModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AppInstallGoal")
    public JAXBElement<AppInstallGoal> createAppInstallGoal(AppInstallGoal value) {
        return new JAXBElement<AppInstallGoal>(_AppInstallGoal_QNAME, AppInstallGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EntityScope")
    public JAXBElement<EntityScope> createEntityScope(EntityScope value) {
        return new JAXBElement<EntityScope>(_EntityScope_QNAME, EntityScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItemGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "RuleItemGroup")
    public JAXBElement<RuleItemGroup> createRuleItemGroup(RuleItemGroup value) {
        return new JAXBElement<RuleItemGroup>(_RuleItemGroup_QNAME, RuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "LocationTarget")
    public JAXBElement<LocationTarget> createLocationTarget(LocationTarget value) {
        return new JAXBElement<LocationTarget>(_LocationTarget_QNAME, LocationTarget.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CountryTargetBid")
    public JAXBElement<CountryTargetBid> createCountryTargetBid(CountryTargetBid value) {
        return new JAXBElement<CountryTargetBid>(_CountryTargetBid_QNAME, CountryTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "PostalCodeTargetBid")
    public JAXBElement<PostalCodeTargetBid> createPostalCodeTargetBid(PostalCodeTargetBid value) {
        return new JAXBElement<PostalCodeTargetBid>(_PostalCodeTargetBid_QNAME, PostalCodeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostalCodeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfPostalCodeTargetBid")
    public JAXBElement<ArrayOfPostalCodeTargetBid> createArrayOfPostalCodeTargetBid(ArrayOfPostalCodeTargetBid value) {
        return new JAXBElement<ArrayOfPostalCodeTargetBid>(_ArrayOfPostalCodeTargetBid_QNAME, ArrayOfPostalCodeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalType")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<ConversionGoalType>> createConversionGoalType(Collection<ConversionGoalType> value) {
        return new JAXBElement<Collection<ConversionGoalType>>(_ConversionGoalType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountMigrationStatusesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAccountMigrationStatusesInfo")
    public JAXBElement<ArrayOfAccountMigrationStatusesInfo> createArrayOfAccountMigrationStatusesInfo(ArrayOfAccountMigrationStatusesInfo value) {
        return new JAXBElement<ArrayOfAccountMigrationStatusesInfo>(_ArrayOfAccountMigrationStatusesInfo_QNAME, ArrayOfAccountMigrationStatusesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionEditorialReason")
    public JAXBElement<AdExtensionEditorialReason> createAdExtensionEditorialReason(AdExtensionEditorialReason value) {
        return new JAXBElement<AdExtensionEditorialReason>(_AdExtensionEditorialReason_QNAME, AdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfCustomParameter")
    public JAXBElement<ArrayOfCustomParameter> createArrayOfCustomParameter(ArrayOfCustomParameter value) {
        return new JAXBElement<ArrayOfCustomParameter>(_ArrayOfCustomParameter_QNAME, ArrayOfCustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdToEntityIdAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionIdToEntityIdAssociation")
    public JAXBElement<ArrayOfAdExtensionIdToEntityIdAssociation> createArrayOfAdExtensionIdToEntityIdAssociation(ArrayOfAdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<ArrayOfAdExtensionIdToEntityIdAssociation>(_ArrayOfAdExtensionIdToEntityIdAssociation_QNAME, ArrayOfAdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Schedule")
    public JAXBElement<Schedule> createSchedule(Schedule value) {
        return new JAXBElement<Schedule>(_Schedule_QNAME, Schedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceOSTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfDeviceOSTargetBid")
    public JAXBElement<ArrayOfDeviceOSTargetBid> createArrayOfDeviceOSTargetBid(ArrayOfDeviceOSTargetBid value) {
        return new JAXBElement<ArrayOfDeviceOSTargetBid>(_ArrayOfDeviceOSTargetBid_QNAME, ArrayOfDeviceOSTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CriterionBid")
    public JAXBElement<CriterionBid> createCriterionBid(CriterionBid value) {
        return new JAXBElement<CriterionBid>(_CriterionBid_QNAME, CriterionBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetroAreaTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMetroAreaTargetBid")
    public JAXBElement<ArrayOfMetroAreaTargetBid> createArrayOfMetroAreaTargetBid(ArrayOfMetroAreaTargetBid value) {
        return new JAXBElement<ArrayOfMetroAreaTargetBid>(_ArrayOfMetroAreaTargetBid_QNAME, ArrayOfMetroAreaTargetBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "BiddingScheme")
    public JAXBElement<BiddingScheme> createBiddingScheme(BiddingScheme value) {
        return new JAXBElement<BiddingScheme>(_BiddingScheme_QNAME, BiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfEditorialError")
    public JAXBElement<ArrayOfEditorialError> createArrayOfEditorialError(ArrayOfEditorialError value) {
        return new JAXBElement<ArrayOfEditorialError>(_ArrayOfEditorialError_QNAME, ArrayOfEditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSitePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSitePlacement")
    public JAXBElement<ArrayOfSitePlacement> createArrayOfSitePlacement(ArrayOfSitePlacement value) {
        return new JAXBElement<ArrayOfSitePlacement>(_ArrayOfSitePlacement_QNAME, ArrayOfSitePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Bid")
    public JAXBElement<Bid> createBid(Bid value) {
        return new JAXBElement<Bid>(_Bid_QNAME, Bid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "WebpageParameter")
    public JAXBElement<WebpageParameter> createWebpageParameter(WebpageParameter value) {
        return new JAXBElement<WebpageParameter>(_WebpageParameter_QNAME, WebpageParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenderTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfGenderTargetBid")
    public JAXBElement<ArrayOfGenderTargetBid> createArrayOfGenderTargetBid(ArrayOfGenderTargetBid value) {
        return new JAXBElement<ArrayOfGenderTargetBid>(_ArrayOfGenderTargetBid_QNAME, ArrayOfGenderTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Criterion")
    public JAXBElement<Criterion> createCriterion(Criterion value) {
        return new JAXBElement<Criterion>(_Criterion_QNAME, Criterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoDidNotVisitAnotherPageRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "PageVisitorsWhoDidNotVisitAnotherPageRule")
    public JAXBElement<PageVisitorsWhoDidNotVisitAnotherPageRule> createPageVisitorsWhoDidNotVisitAnotherPageRule(PageVisitorsWhoDidNotVisitAnotherPageRule value) {
        return new JAXBElement<PageVisitorsWhoDidNotVisitAnotherPageRule>(_PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME, PageVisitorsWhoDidNotVisitAnotherPageRule.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MediaRepresentation")
    public JAXBElement<MediaRepresentation> createMediaRepresentation(MediaRepresentation value) {
        return new JAXBElement<MediaRepresentation>(_MediaRepresentation_QNAME, MediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfSetting")
    public JAXBElement<ArrayOfSetting> createArrayOfSetting(ArrayOfSetting value) {
        return new JAXBElement<ArrayOfSetting>(_ArrayOfSetting_QNAME, ArrayOfSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "KeywordStatus")
    public JAXBElement<KeywordStatus> createKeywordStatus(KeywordStatus value) {
        return new JAXBElement<KeywordStatus>(_KeywordStatus_QNAME, KeywordStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMediaType")
    public JAXBElement<ArrayOfMediaType> createArrayOfMediaType(ArrayOfMediaType value) {
        return new JAXBElement<ArrayOfMediaType>(_ArrayOfMediaType_QNAME, ArrayOfMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCampaignSize")
    public JAXBElement<ArrayOfCampaignSize> createArrayOfCampaignSize(ArrayOfCampaignSize value) {
        return new JAXBElement<ArrayOfCampaignSize>(_ArrayOfCampaignSize_QNAME, ArrayOfCampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalloutAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CalloutAdExtension")
    public JAXBElement<CalloutAdExtension> createCalloutAdExtension(CalloutAdExtension value) {
        return new JAXBElement<CalloutAdExtension>(_CalloutAdExtension_QNAME, CalloutAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTagTrackingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "UetTagTrackingStatus")
    public JAXBElement<UetTagTrackingStatus> createUetTagTrackingStatus(UetTagTrackingStatus value) {
        return new JAXBElement<UetTagTrackingStatus>(_UetTagTrackingStatus_QNAME, UetTagTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRadiusTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfRadiusTargetBid")
    public JAXBElement<ArrayOfRadiusTargetBid> createArrayOfRadiusTargetBid(ArrayOfRadiusTargetBid value) {
        return new JAXBElement<ArrayOfRadiusTargetBid>(_ArrayOfRadiusTargetBid_QNAME, ArrayOfRadiusTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ExpressionOperator")
    public JAXBElement<ExpressionOperator> createExpressionOperator(ExpressionOperator value) {
        return new JAXBElement<ExpressionOperator>(_ExpressionOperator_QNAME, ExpressionOperator.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroup")
    public JAXBElement<AdGroup> createAdGroup(AdGroup value) {
        return new JAXBElement<AdGroup>(_AdGroup_QNAME, AdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBMCStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfBMCStore")
    public JAXBElement<ArrayOfBMCStore> createArrayOfBMCStore(ArrayOfBMCStore value) {
        return new JAXBElement<ArrayOfBMCStore>(_ArrayOfBMCStore_QNAME, ArrayOfBMCStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EditorialReason")
    public JAXBElement<EditorialReason> createEditorialReason(EditorialReason value) {
        return new JAXBElement<EditorialReason>(_EditorialReason_QNAME, EditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignCriterion")
    public JAXBElement<CampaignCriterion> createCampaignCriterion(CampaignCriterion value) {
        return new JAXBElement<CampaignCriterion>(_CampaignCriterion_QNAME, CampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalTrackingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalTrackingStatus")
    public JAXBElement<ConversionGoalTrackingStatus> createConversionGoalTrackingStatus(ConversionGoalTrackingStatus value) {
        return new JAXBElement<ConversionGoalTrackingStatus>(_ConversionGoalTrackingStatus_QNAME, ConversionGoalTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtensionEditorialStatus")
    public JAXBElement<AdExtensionEditorialStatus> createAdExtensionEditorialStatus(AdExtensionEditorialStatus value) {
        return new JAXBElement<AdExtensionEditorialStatus>(_AdExtensionEditorialStatus_QNAME, AdExtensionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "RemarketingRule")
    public JAXBElement<RemarketingRule> createRemarketingRule(RemarketingRule value) {
        return new JAXBElement<RemarketingRule>(_RemarketingRule_QNAME, RemarketingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceOSTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DeviceOSTarget")
    public JAXBElement<DeviceOSTarget> createDeviceOSTarget(DeviceOSTarget value) {
        return new JAXBElement<DeviceOSTarget>(_DeviceOSTarget_QNAME, DeviceOSTarget.class, null, value);
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMediaRepresentation")
    public JAXBElement<ArrayOfMediaRepresentation> createArrayOfMediaRepresentation(ArrayOfMediaRepresentation value) {
        return new JAXBElement<ArrayOfMediaRepresentation>(_ArrayOfMediaRepresentation_QNAME, ArrayOfMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SharedList")
    public JAXBElement<SharedList> createSharedList(SharedList value) {
        return new JAXBElement<SharedList>(_SharedList_QNAME, SharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Campaign")
    public JAXBElement<Campaign> createCampaign(Campaign value) {
        return new JAXBElement<Campaign>(_Campaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAd")
    public JAXBElement<ArrayOfAd> createArrayOfAd(ArrayOfAd value) {
        return new JAXBElement<ArrayOfAd>(_ArrayOfAd_QNAME, ArrayOfAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ImageAdExtension")
    public JAXBElement<ImageAdExtension> createImageAdExtension(ImageAdExtension value) {
        return new JAXBElement<ImageAdExtension>(_ImageAdExtension_QNAME, ImageAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpcBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ManualCpcBiddingScheme")
    public JAXBElement<ManualCpcBiddingScheme> createManualCpcBiddingScheme(ManualCpcBiddingScheme value) {
        return new JAXBElement<ManualCpcBiddingScheme>(_ManualCpcBiddingScheme_QNAME, ManualCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DynamicSearchAd")
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchErrorCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfBatchErrorCollection")
    public JAXBElement<ArrayOfBatchErrorCollection> createArrayOfBatchErrorCollection(ArrayOfBatchErrorCollection value) {
        return new JAXBElement<ArrayOfBatchErrorCollection>(_ArrayOfBatchErrorCollection_QNAME, ArrayOfBatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ProductCondition")
    public JAXBElement<ProductCondition> createProductCondition(ProductCondition value) {
        return new JAXBElement<ProductCondition>(_ProductCondition_QNAME, ProductCondition.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CallAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CallAdExtension")
    public JAXBElement<CallAdExtension> createCallAdExtension(CallAdExtension value) {
        return new JAXBElement<CallAdExtension>(_CallAdExtension_QNAME, CallAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTimeTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DayTimeTarget")
    public JAXBElement<DayTimeTarget> createDayTimeTarget(DayTimeTarget value) {
        return new JAXBElement<DayTimeTarget>(_DayTimeTarget_QNAME, DayTimeTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTimeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfDayTimeTargetBid")
    public JAXBElement<ArrayOfDayTimeTargetBid> createArrayOfDayTimeTargetBid(ArrayOfDayTimeTargetBid value) {
        return new JAXBElement<ArrayOfDayTimeTargetBid>(_ArrayOfDayTimeTargetBid_QNAME, ArrayOfDayTimeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagesViewedPerVisitGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "PagesViewedPerVisitGoal")
    public JAXBElement<PagesViewedPerVisitGoal> createPagesViewedPerVisitGoal(PagesViewedPerVisitGoal value) {
        return new JAXBElement<PagesViewedPerVisitGoal>(_PagesViewedPerVisitGoal_QNAME, PagesViewedPerVisitGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignType")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<CampaignType>> createCampaignType(Collection<CampaignType> value) {
        return new JAXBElement<Collection<CampaignType>>(_CampaignType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntityAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SharedEntityAssociation")
    public JAXBElement<SharedEntityAssociation> createSharedEntityAssociation(SharedEntityAssociation value) {
        return new JAXBElement<SharedEntityAssociation>(_SharedEntityAssociation_QNAME, SharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CriterionType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CriterionType")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<CriterionType>> createCriterionType(Collection<CriterionType> value) {
        return new JAXBElement<Collection<CriterionType>>(_CriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AppAdExtension")
    public JAXBElement<AppAdExtension> createAppAdExtension(AppAdExtension value) {
        return new JAXBElement<AppAdExtension>(_AppAdExtension_QNAME, AppAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "GeoPoint")
    public JAXBElement<GeoPoint> createGeoPoint(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_GeoPoint_QNAME, GeoPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalCountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoalCountType")
    public JAXBElement<ConversionGoalCountType> createConversionGoalCountType(ConversionGoalCountType value) {
        return new JAXBElement<ConversionGoalCountType>(_ConversionGoalCountType_QNAME, ConversionGoalCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageMediaRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ImageMediaRepresentation")
    public JAXBElement<ImageMediaRepresentation> createImageMediaRepresentation(ImageMediaRepresentation value) {
        return new JAXBElement<ImageMediaRepresentation>(_ImageMediaRepresentation_QNAME, ImageMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaEnabledEntityFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MediaEnabledEntityFilter")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<MediaEnabledEntityFilter>> createMediaEnabledEntityFilter(Collection<MediaEnabledEntityFilter> value) {
        return new JAXBElement<Collection<MediaEnabledEntityFilter>>(_MediaEnabledEntityFilter_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCampaign")
    public JAXBElement<ArrayOfCampaign> createArrayOfCampaign(ArrayOfCampaign value) {
        return new JAXBElement<ArrayOfCampaign>(_ArrayOfCampaign_QNAME, ArrayOfCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdExtension")
    public JAXBElement<AdExtension> createAdExtension(AdExtension value) {
        return new JAXBElement<AdExtension>(_AdExtension_QNAME, AdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DurationGoal")
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdType")
    public JAXBElement<AdType> createAdType(AdType value) {
        return new JAXBElement<AdType>(_AdType_QNAME, AdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfBudget")
    public JAXBElement<ArrayOfBudget> createArrayOfBudget(ArrayOfBudget value) {
        return new JAXBElement<ArrayOfBudget>(_ArrayOfBudget_QNAME, ArrayOfBudget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InheritFromParentBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "InheritFromParentBiddingScheme")
    public JAXBElement<InheritFromParentBiddingScheme> createInheritFromParentBiddingScheme(InheritFromParentBiddingScheme value) {
        return new JAXBElement<InheritFromParentBiddingScheme>(_InheritFromParentBiddingScheme_QNAME, InheritFromParentBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfProductCondition")
    public JAXBElement<ArrayOfProductCondition> createArrayOfProductCondition(ArrayOfProductCondition value) {
        return new JAXBElement<ArrayOfProductCondition>(_ArrayOfProductCondition_QNAME, ArrayOfProductCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfNegativeKeyword")
    public JAXBElement<ArrayOfNegativeKeyword> createArrayOfNegativeKeyword(ArrayOfNegativeKeyword value) {
        return new JAXBElement<ArrayOfNegativeKeyword>(_ArrayOfNegativeKeyword_QNAME, ArrayOfNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "AppUrl")
    public JAXBElement<AppUrl> createAppUrl(AppUrl value) {
        return new JAXBElement<AppUrl>(_AppUrl_QNAME, AppUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitePlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SitePlacement")
    public JAXBElement<SitePlacement> createSitePlacement(SitePlacement value) {
        return new JAXBElement<SitePlacement>(_SitePlacement_QNAME, SitePlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfKeyword")
    public JAXBElement<ArrayOfKeyword> createArrayOfKeyword(ArrayOfKeyword value) {
        return new JAXBElement<ArrayOfKeyword>(_ArrayOfKeyword_QNAME, ArrayOfKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SharedListItem")
    public JAXBElement<SharedListItem> createSharedListItem(SharedListItem value) {
        return new JAXBElement<SharedListItem>(_SharedListItem_QNAME, SharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "StateTarget")
    public JAXBElement<StateTarget> createStateTarget(StateTarget value) {
        return new JAXBElement<StateTarget>(_StateTarget_QNAME, StateTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWebpageCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfWebpageCondition")
    public JAXBElement<ArrayOfWebpageCondition> createArrayOfWebpageCondition(ArrayOfWebpageCondition value) {
        return new JAXBElement<ArrayOfWebpageCondition>(_ArrayOfWebpageCondition_QNAME, ArrayOfWebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringRuleItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "StringRuleItem")
    public JAXBElement<StringRuleItem> createStringRuleItem(StringRuleItem value) {
        return new JAXBElement<StringRuleItem>(_StringRuleItem_QNAME, StringRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "CampaignNegativeSites")
    public JAXBElement<CampaignNegativeSites> createCampaignNegativeSites(CampaignNegativeSites value) {
        return new JAXBElement<CampaignNegativeSites>(_CampaignNegativeSites_QNAME, CampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdDistribution }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdDistribution")
    @XmlJavaTypeAdapter(Adapter13 .class)
    public JAXBElement<Collection<AdDistribution>> createAdDistribution(Collection<AdDistribution> value) {
        return new JAXBElement<Collection<AdDistribution>>(_AdDistribution_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MatchType")
    public JAXBElement<MatchType> createMatchType(MatchType value) {
        return new JAXBElement<MatchType>(_MatchType_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfDimension")
    public JAXBElement<ArrayOfDimension> createArrayOfDimension(ArrayOfDimension value) {
        return new JAXBElement<ArrayOfDimension>(_ArrayOfDimension_QNAME, ArrayOfDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ValueOperator")
    public JAXBElement<ValueOperator> createValueOperator(ValueOperator value) {
        return new JAXBElement<ValueOperator>(_ValueOperator_QNAME, ValueOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppealStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AppealStatus")
    public JAXBElement<AppealStatus> createAppealStatus(AppealStatus value) {
        return new JAXBElement<AppealStatus>(_AppealStatus_QNAME, AppealStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfTargetInfo")
    public JAXBElement<ArrayOfTargetInfo> createArrayOfTargetInfo(ArrayOfTargetInfo value) {
        return new JAXBElement<ArrayOfTargetInfo>(_ArrayOfTargetInfo_QNAME, ArrayOfTargetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMediaMetaData")
    public JAXBElement<ArrayOfMediaMetaData> createArrayOfMediaMetaData(ArrayOfMediaMetaData value) {
        return new JAXBElement<ArrayOfMediaMetaData>(_ArrayOfMediaMetaData_QNAME, ArrayOfMediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetroAreaTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MetroAreaTarget")
    public JAXBElement<MetroAreaTarget> createMetroAreaTarget(MetroAreaTarget value) {
        return new JAXBElement<MetroAreaTarget>(_MetroAreaTarget_QNAME, MetroAreaTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadiusTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "RadiusTarget")
    public JAXBElement<RadiusTarget> createRadiusTarget(RadiusTarget value) {
        return new JAXBElement<RadiusTarget>(_RadiusTarget_QNAME, RadiusTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCountryTargetBid")
    public JAXBElement<ArrayOfCountryTargetBid> createArrayOfCountryTargetBid(ArrayOfCountryTargetBid value) {
        return new JAXBElement<ArrayOfCountryTargetBid>(_ArrayOfCountryTargetBid_QNAME, ArrayOfCountryTargetBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "NegativeKeywordList")
    public JAXBElement<NegativeKeywordList> createNegativeKeywordList(NegativeKeywordList value) {
        return new JAXBElement<NegativeKeywordList>(_NegativeKeywordList_QNAME, NegativeKeywordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AgeTargetBid")
    public JAXBElement<AgeTargetBid> createAgeTargetBid(AgeTargetBid value) {
        return new JAXBElement<AgeTargetBid>(_AgeTargetBid_QNAME, AgeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdRotationType")
    public JAXBElement<AdRotationType> createAdRotationType(AdRotationType value) {
        return new JAXBElement<AdRotationType>(_AdRotationType_QNAME, AdRotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfConversionGoal")
    public JAXBElement<ArrayOfConversionGoal> createArrayOfConversionGoal(ArrayOfConversionGoal value) {
        return new JAXBElement<ArrayOfConversionGoal>(_ArrayOfConversionGoal_QNAME, ArrayOfConversionGoal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Sitelink2AdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Sitelink2AdExtension")
    public JAXBElement<Sitelink2AdExtension> createSitelink2AdExtension(Sitelink2AdExtension value) {
        return new JAXBElement<Sitelink2AdExtension>(_Sitelink2AdExtension_QNAME, Sitelink2AdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMedia")
    public JAXBElement<ArrayOfMedia> createArrayOfMedia(ArrayOfMedia value) {
        return new JAXBElement<ArrayOfMedia>(_ArrayOfMedia_QNAME, ArrayOfMedia.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdStatus")
    public JAXBElement<AdStatus> createAdStatus(AdStatus value) {
        return new JAXBElement<AdStatus>(_AdStatus_QNAME, AdStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Budget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Budget")
    public JAXBElement<Budget> createBudget(Budget value) {
        return new JAXBElement<Budget>(_Budget_QNAME, Budget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ConversionGoal")
    public JAXBElement<ConversionGoal> createConversionGoal(ConversionGoal value) {
        return new JAXBElement<ConversionGoal>(_ConversionGoal_QNAME, ConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceOSTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "DeviceOSTargetBid")
    public JAXBElement<DeviceOSTargetBid> createDeviceOSTargetBid(DeviceOSTargetBid value) {
        return new JAXBElement<DeviceOSTargetBid>(_DeviceOSTargetBid_QNAME, DeviceOSTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUetTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfUetTag")
    public JAXBElement<ArrayOfUetTag> createArrayOfUetTag(ArrayOfUetTag value) {
        return new JAXBElement<ArrayOfUetTag>(_ArrayOfUetTag_QNAME, ArrayOfUetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSnippetAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "StructuredSnippetAdExtension")
    public JAXBElement<StructuredSnippetAdExtension> createStructuredSnippetAdExtension(StructuredSnippetAdExtension value) {
        return new JAXBElement<StructuredSnippetAdExtension>(_StructuredSnippetAdExtension_QNAME, StructuredSnippetAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AgeRange")
    public JAXBElement<AgeRange> createAgeRange(AgeRange value) {
        return new JAXBElement<AgeRange>(_AgeRange_QNAME, AgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "Ad")
    public JAXBElement<Ad> createAd(Ad value) {
        return new JAXBElement<Ad>(_Ad_QNAME, Ad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupStatus")
    public JAXBElement<AdGroupStatus> createAdGroupStatus(AdGroupStatus value) {
        return new JAXBElement<AdGroupStatus>(_AdGroupStatus_QNAME, AdGroupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationAdExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "LocationAdExtension")
    public JAXBElement<LocationAdExtension> createLocationAdExtension(LocationAdExtension value) {
        return new JAXBElement<LocationAdExtension>(_LocationAdExtension_QNAME, LocationAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "StateTargetBid")
    public JAXBElement<StateTargetBid> createStateTargetBid(StateTargetBid value) {
        return new JAXBElement<StateTargetBid>(_StateTargetBid_QNAME, StateTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdGroup")
    public JAXBElement<ArrayOfAdGroup> createArrayOfAdGroup(ArrayOfAdGroup value) {
        return new JAXBElement<ArrayOfAdGroup>(_ArrayOfAdGroup_QNAME, ArrayOfAdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "IdCollection")
    public JAXBElement<IdCollection> createIdCollection(IdCollection value) {
        return new JAXBElement<IdCollection>(_IdCollection_QNAME, IdCollection.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "PostalCodeTarget")
    public JAXBElement<PostalCodeTarget> createPostalCodeTarget(PostalCodeTarget value) {
        return new JAXBElement<PostalCodeTarget>(_PostalCodeTarget_QNAME, PostalCodeTarget.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "CustomParameters")
    public JAXBElement<CustomParameters> createCustomParameters(CustomParameters value) {
        return new JAXBElement<CustomParameters>(_CustomParameters_QNAME, CustomParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdRotation")
    public JAXBElement<AdRotation> createAdRotation(AdRotation value) {
        return new JAXBElement<AdRotation>(_AdRotation_QNAME, AdRotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchErrorCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BatchErrorCollection")
    public JAXBElement<BatchErrorCollection> createBatchErrorCollection(BatchErrorCollection value) {
        return new JAXBElement<BatchErrorCollection>(_BatchErrorCollection_QNAME, BatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "NumberOperator")
    public JAXBElement<NumberOperator> createNumberOperator(NumberOperator value) {
        return new JAXBElement<NumberOperator>(_NumberOperator_QNAME, NumberOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<BudgetLimitType>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "TargetInfo")
    public JAXBElement<TargetInfo> createTargetInfo(TargetInfo value) {
        return new JAXBElement<TargetInfo>(_TargetInfo_QNAME, TargetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ProductPartitionType")
    public JAXBElement<ProductPartitionType> createProductPartitionType(ProductPartitionType value) {
        return new JAXBElement<ProductPartitionType>(_ProductPartitionType_QNAME, ProductPartitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfMediaAssociation")
    public JAXBElement<ArrayOfMediaAssociation> createArrayOfMediaAssociation(ArrayOfMediaAssociation value) {
        return new JAXBElement<ArrayOfMediaAssociation>(_ArrayOfMediaAssociation_QNAME, ArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAdExtensionAssociation")
    public JAXBElement<ArrayOfAdExtensionAssociation> createArrayOfAdExtensionAssociation(ArrayOfAdExtensionAssociation value) {
        return new JAXBElement<ArrayOfAdExtensionAssociation>(_ArrayOfAdExtensionAssociation_QNAME, ArrayOfAdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupCriterionAction")
    public JAXBElement<AdGroupCriterionAction> createAdGroupCriterionAction(AdGroupCriterionAction value) {
        return new JAXBElement<AdGroupCriterionAction>(_AdGroupCriterionAction_QNAME, AdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntentOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "IntentOption")
    public JAXBElement<IntentOption> createIntentOption(IntentOption value) {
        return new JAXBElement<IntentOption>(_IntentOption_QNAME, IntentOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomEventsRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "CustomEventsRule")
    public JAXBElement<CustomEventsRule> createCustomEventsRule(CustomEventsRule value) {
        return new JAXBElement<CustomEventsRule>(_CustomEventsRule_QNAME, CustomEventsRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEditorialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "KeywordEditorialStatus")
    public JAXBElement<KeywordEditorialStatus> createKeywordEditorialStatus(KeywordEditorialStatus value) {
        return new JAXBElement<KeywordEditorialStatus>(_KeywordEditorialStatus_QNAME, KeywordEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfTarget")
    public JAXBElement<ArrayOfTarget> createArrayOfTarget(ArrayOfTarget value) {
        return new JAXBElement<ArrayOfTarget>(_ArrayOfTarget_QNAME, ArrayOfTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link RemarketingListAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "RemarketingListAdditionalField")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<RemarketingListAdditionalField>> createRemarketingListAdditionalField(Collection<RemarketingListAdditionalField> value) {
        return new JAXBElement<Collection<RemarketingListAdditionalField>>(_RemarketingListAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ShoppingSetting")
    public JAXBElement<ShoppingSetting> createShoppingSetting(ShoppingSetting value) {
        return new JAXBElement<ShoppingSetting>(_ShoppingSetting_QNAME, ShoppingSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReasonCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfEditorialReasonCollection")
    public JAXBElement<ArrayOfEditorialReasonCollection> createArrayOfEditorialReasonCollection(ArrayOfEditorialReasonCollection value) {
        return new JAXBElement<ArrayOfEditorialReasonCollection>(_ArrayOfEditorialReasonCollection_QNAME, ArrayOfEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "ArrayOfAppUrl")
    public JAXBElement<ArrayOfAppUrl> createArrayOfAppUrl(ArrayOfAppUrl value) {
        return new JAXBElement<ArrayOfAppUrl>(_ArrayOfAppUrl_QNAME, ArrayOfAppUrl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MediaType")
    public JAXBElement<MediaType> createMediaType(MediaType value) {
        return new JAXBElement<MediaType>(_MediaType_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "GenderTargetBid")
    public JAXBElement<GenderTargetBid> createGenderTargetBid(GenderTargetBid value) {
        return new JAXBElement<GenderTargetBid>(_GenderTargetBid_QNAME, GenderTargetBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SiteLink")
    public JAXBElement<SiteLink> createSiteLink(SiteLink value) {
        return new JAXBElement<SiteLink>(_SiteLink_QNAME, SiteLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCpcBiddingScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V10", name = "EnhancedCpcBiddingScheme")
    public JAXBElement<EnhancedCpcBiddingScheme> createEnhancedCpcBiddingScheme(EnhancedCpcBiddingScheme value) {
        return new JAXBElement<EnhancedCpcBiddingScheme>(_EnhancedCpcBiddingScheme_QNAME, EnhancedCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "RemarketingList")
    public JAXBElement<RemarketingList> createRemarketingList(RemarketingList value) {
        return new JAXBElement<RemarketingList>(_RemarketingList_QNAME, RemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfAgeTargetBid")
    public JAXBElement<ArrayOfAgeTargetBid> createArrayOfAgeTargetBid(ArrayOfAgeTargetBid value) {
        return new JAXBElement<ArrayOfAgeTargetBid>(_ArrayOfAgeTargetBid_QNAME, ArrayOfAgeTargetBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignNegativeSites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfCampaignNegativeSites")
    public JAXBElement<ArrayOfCampaignNegativeSites> createArrayOfCampaignNegativeSites(ArrayOfCampaignNegativeSites value) {
        return new JAXBElement<ArrayOfCampaignNegativeSites>(_ArrayOfCampaignNegativeSites_QNAME, ArrayOfCampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AdGroupCriterionStatus")
    public JAXBElement<AdGroupCriterionStatus> createAdGroupCriterionStatus(AdGroupCriterionStatus value) {
        return new JAXBElement<AdGroupCriterionStatus>(_AdGroupCriterionStatus_QNAME, AdGroupCriterionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "UrlGoal")
    public JAXBElement<UrlGoal> createUrlGoal(UrlGoal value) {
        return new JAXBElement<UrlGoal>(_UrlGoal_QNAME, UrlGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "ArrayOfDayTime")
    public JAXBElement<ArrayOfDayTime> createArrayOfDayTime(ArrayOfDayTime value) {
        return new JAXBElement<ArrayOfDayTime>(_ArrayOfDayTime_QNAME, ArrayOfDayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitePlacementStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "SitePlacementStatus")
    public JAXBElement<SitePlacementStatus> createSitePlacementStatus(SitePlacementStatus value) {
        return new JAXBElement<SitePlacementStatus>(_SitePlacementStatus_QNAME, SitePlacementStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "EditorialError")
    public JAXBElement<EditorialError> createEditorialError(EditorialError value) {
        return new JAXBElement<EditorialError>(_EditorialError_QNAME, EditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetroAreaTargetBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "MetroAreaTargetBid")
    public JAXBElement<MetroAreaTargetBid> createMetroAreaTargetBid(MetroAreaTargetBid value) {
        return new JAXBElement<MetroAreaTargetBid>(_MetroAreaTargetBid_QNAME, MetroAreaTargetBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v10", name = "BMCStore")
    public JAXBElement<BMCStore> createBMCStore(BMCStore value) {
        return new JAXBElement<BMCStore>(_BMCStore_QNAME, BMCStore.class, null, value);
    }

}
