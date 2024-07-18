
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.bingads.v13.campaignmanagement package. 
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

    private static final QName _TextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TextAd");
    private static final QName _Ad_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Ad");
    private static final QName _AdEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdEditorialStatus");
    private static final QName _ArrayOfAppUrl_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAppUrl");
    private static final QName _AppUrl_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AppUrl");
    private static final QName _AdStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdStatus");
    private static final QName _AdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdType");
    private static final QName _CustomParameters_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomParameters");
    private static final QName _ArrayOfCustomParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCustomParameter");
    private static final QName _CustomParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomParameter");
    private static final QName _ProductAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductAd");
    private static final QName _HotelAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelAd");
    private static final QName _AppInstallAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AppInstallAd");
    private static final QName _ExpandedTextAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ExpandedTextAd");
    private static final QName _DynamicSearchAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DynamicSearchAd");
    private static final QName _ResponsiveAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ResponsiveAd");
    private static final QName _AdSubType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdSubType");
    private static final QName _CallToAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CallToAction");
    private static final QName _LanguageName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LanguageName");
    private static final QName _ArrayOfAssetLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetLink");
    private static final QName _AssetLink_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetLink");
    private static final QName _Asset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Asset");
    private static final QName _TextAsset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TextAsset");
    private static final QName _ImageAsset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImageAsset");
    private static final QName _VideoAsset_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VideoAsset");
    private static final QName _AssetLinkEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetLinkEditorialStatus");
    private static final QName _VerifiedTrackingSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VerifiedTrackingSetting");
    private static final QName _Setting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Setting");
    private static final QName _ShoppingSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ShoppingSetting");
    private static final QName _DynamicFeedSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DynamicFeedSetting");
    private static final QName _DynamicSearchAdsSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DynamicSearchAdsSetting");
    private static final QName _DynamicSearchAdsSource_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DynamicSearchAdsSource");
    private static final QName _TargetSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TargetSetting");
    private static final QName _ArrayOfTargetSettingDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfTargetSettingDetail");
    private static final QName _TargetSettingDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TargetSettingDetail");
    private static final QName _CriterionTypeGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CriterionTypeGroup");
    private static final QName _CoOpSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CoOpSetting");
    private static final QName _BidOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BidOption");
    private static final QName _DisclaimerSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DisclaimerSetting");
    private static final QName _HotelSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelSetting");
    private static final QName _HotelAdGroupType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelAdGroupType");
    private static final QName _ResponsiveSearchAdsSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ResponsiveSearchAdsSetting");
    private static final QName _PerformanceMaxSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PerformanceMaxSetting");
    private static final QName _CallToActionSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CallToActionSetting");
    private static final QName _VanityPharmaSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VanityPharmaSetting");
    private static final QName _VanityPharmaDisplayUrlMode_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VanityPharmaDisplayUrlMode");
    private static final QName _VanityPharmaWebsiteDescription_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VanityPharmaWebsiteDescription");
    private static final QName _ResponsiveSearchAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ResponsiveSearchAd");
    private static final QName _ArrayOfCampaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaign");
    private static final QName _Campaign_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Campaign");
    private static final QName _BiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BiddingScheme");
    private static final QName _MaxClicksBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MaxClicksBiddingScheme");
    private static final QName _Bid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Bid");
    private static final QName _MaxConversionsBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MaxConversionsBiddingScheme");
    private static final QName _TargetCpaBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TargetCpaBiddingScheme");
    private static final QName _ManualCpcBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ManualCpcBiddingScheme");
    private static final QName _EnhancedCpcBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EnhancedCpcBiddingScheme");
    private static final QName _ManualCpvBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ManualCpvBiddingScheme");
    private static final QName _ManualCpmBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ManualCpmBiddingScheme");
    private static final QName _InheritFromParentBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "InheritFromParentBiddingScheme");
    private static final QName _TargetRoasBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TargetRoasBiddingScheme");
    private static final QName _MaxRoasBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MaxRoasBiddingScheme");
    private static final QName _MaxConversionValueBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MaxConversionValueBiddingScheme");
    private static final QName _TargetImpressionShareBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TargetImpressionShareBiddingScheme");
    private static final QName _PercentCpcBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PercentCpcBiddingScheme");
    private static final QName _CommissionBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CommissionBiddingScheme");
    private static final QName _ManualCpaBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ManualCpaBiddingScheme");
    private static final QName _CostPerSaleBiddingScheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CostPerSaleBiddingScheme");
    private static final QName _BudgetLimitType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BudgetLimitType");
    private static final QName _CampaignStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignStatus");
    private static final QName _CampaignType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignType");
    private static final QName _ArrayOfSetting_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfSetting");
    private static final QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ApplicationToken");
    private static final QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AuthenticationToken");
    private static final QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerAccountId");
    private static final QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerId");
    private static final QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DeveloperToken");
    private static final QName _Password_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Password");
    private static final QName _UserName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "UserName");
    private static final QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBatchError");
    private static final QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BatchError");
    private static final QName _EditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialError");
    private static final QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TrackingId");
    private static final QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ApiFaultDetail");
    private static final QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfOperationError");
    private static final QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OperationError");
    private static final QName _CampaignAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignAdditionalField");
    private static final QName _ArrayOfCampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignNegativeSites");
    private static final QName _CampaignNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignNegativeSites");
    private static final QName _ArrayOfAdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdGroup");
    private static final QName _AdGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroup");
    private static final QName _AdRotation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdRotation");
    private static final QName _AdRotationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdRotationType");
    private static final QName _RateBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RateBid");
    private static final QName _CriterionBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CriterionBid");
    private static final QName _FixedBid_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FixedBid");
    private static final QName _BidMultiplier_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BidMultiplier");
    private static final QName _RateAmount_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RateAmount");
    private static final QName _Date_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Date");
    private static final QName _ArrayOfFrequencyCapSettings_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfFrequencyCapSettings");
    private static final QName _FrequencyCapSettings_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FrequencyCapSettings");
    private static final QName _FrequencyCapTimeGranularity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FrequencyCapTimeGranularity");
    private static final QName _Network_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Network");
    private static final QName _AdGroupPrivacyStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupPrivacyStatus");
    private static final QName _AdGroupStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupStatus");
    private static final QName _AdGroupAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupAdditionalField");
    private static final QName _ArrayOfAdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdGroupNegativeSites");
    private static final QName _AdGroupNegativeSites_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupNegativeSites");
    private static final QName _CompressionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CompressionType");
    private static final QName _ArrayOfAd_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAd");
    private static final QName _EditorialApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialApiFaultDetail");
    private static final QName _ArrayOfEditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfEditorialError");
    private static final QName _ArrayOfAdType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdType");
    private static final QName _AdAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdAdditionalField");
    private static final QName _ArrayOfKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfKeyword");
    private static final QName _Keyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Keyword");
    private static final QName _KeywordEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "KeywordEditorialStatus");
    private static final QName _MatchType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MatchType");
    private static final QName _KeywordStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "KeywordStatus");
    private static final QName _ArrayOfEntityIdToParentIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfEntityIdToParentIdAssociation");
    private static final QName _EntityIdToParentIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EntityIdToParentIdAssociation");
    private static final QName _EntityType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EntityType");
    private static final QName _ArrayOfEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfEditorialReasonCollection");
    private static final QName _EditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialReasonCollection");
    private static final QName _AppealStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AppealStatus");
    private static final QName _ArrayOfEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfEditorialReason");
    private static final QName _EditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialReason");
    private static final QName _ArrayOfAccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAccountMigrationStatusesInfo");
    private static final QName _AccountMigrationStatusesInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AccountMigrationStatusesInfo");
    private static final QName _ArrayOfMigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfMigrationStatusInfo");
    private static final QName _MigrationStatusInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MigrationStatusInfo");
    private static final QName _MigrationStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MigrationStatus");
    private static final QName _ArrayOfAccountProperty_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAccountProperty");
    private static final QName _AccountProperty_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AccountProperty");
    private static final QName _AccountPropertyName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AccountPropertyName");
    private static final QName _ArrayOfAccountPropertyName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAccountPropertyName");
    private static final QName _ArrayOfAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtension");
    private static final QName _AdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtension");
    private static final QName _Schedule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Schedule");
    private static final QName _ArrayOfDayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfDayTime");
    private static final QName _DayTime_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DayTime");
    private static final QName _Day_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Day");
    private static final QName _Minute_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Minute");
    private static final QName _AdExtensionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionStatus");
    private static final QName _LocationAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LocationAdExtension");
    private static final QName _Address_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Address");
    private static final QName _BusinessGeoCodeStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BusinessGeoCodeStatus");
    private static final QName _GeoPoint_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GeoPoint");
    private static final QName _CallAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CallAdExtension");
    private static final QName _ImageAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImageAdExtension");
    private static final QName _AppAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AppAdExtension");
    private static final QName _ReviewAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ReviewAdExtension");
    private static final QName _CalloutAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CalloutAdExtension");
    private static final QName _SitelinkAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SitelinkAdExtension");
    private static final QName _ActionAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ActionAdExtension");
    private static final QName _ActionAdExtensionActionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ActionAdExtensionActionType");
    private static final QName _StructuredSnippetAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "StructuredSnippetAdExtension");
    private static final QName _PriceAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PriceAdExtension");
    private static final QName _PriceExtensionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PriceExtensionType");
    private static final QName _ArrayOfPriceTableRow_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfPriceTableRow");
    private static final QName _PriceTableRow_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PriceTableRow");
    private static final QName _PriceQualifier_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PriceQualifier");
    private static final QName _PriceUnit_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PriceUnit");
    private static final QName _PromotionAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PromotionAdExtension");
    private static final QName _PromotionDiscountModifier_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PromotionDiscountModifier");
    private static final QName _PromotionOccasion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PromotionOccasion");
    private static final QName _FilterLinkAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FilterLinkAdExtension");
    private static final QName _AdExtensionHeaderType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionHeaderType");
    private static final QName _FlyerAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FlyerAdExtension");
    private static final QName _VideoAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "VideoAdExtension");
    private static final QName _DisclaimerAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DisclaimerAdExtension");
    private static final QName _LogoAdExtension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LogoAdExtension");
    private static final QName _ArrayOfAdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionIdentity");
    private static final QName _AdExtensionIdentity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionIdentity");
    private static final QName _ArrayOfBatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBatchErrorCollection");
    private static final QName _BatchErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BatchErrorCollection");
    private static final QName _EditorialErrorCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialErrorCollection");
    private static final QName _AdExtensionsTypeFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionsTypeFilter");
    private static final QName _AdExtensionAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionAdditionalField");
    private static final QName _ArrayOfAdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionIdToEntityIdAssociation");
    private static final QName _AdExtensionIdToEntityIdAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionIdToEntityIdAssociation");
    private static final QName _AssociationType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssociationType");
    private static final QName _ArrayOfAdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionEditorialReasonCollection");
    private static final QName _AdExtensionEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionEditorialReasonCollection");
    private static final QName _ArrayOfAdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionEditorialReason");
    private static final QName _AdExtensionEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionEditorialReason");
    private static final QName _ArrayOfAdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionAssociationCollection");
    private static final QName _AdExtensionAssociationCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionAssociationCollection");
    private static final QName _ArrayOfAdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdExtensionAssociation");
    private static final QName _AdExtensionAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionAssociation");
    private static final QName _AdExtensionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdExtensionEditorialStatus");
    private static final QName _ArrayOfMedia_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfMedia");
    private static final QName _Media_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Media");
    private static final QName _Image_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Image");
    private static final QName _MediaEnabledEntityFilter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MediaEnabledEntityFilter");
    private static final QName _Paging_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Paging");
    private static final QName _MediaAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MediaAdditionalField");
    private static final QName _ArrayOfMediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfMediaMetaData");
    private static final QName _MediaMetaData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MediaMetaData");
    private static final QName _ArrayOfMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfMediaRepresentation");
    private static final QName _MediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MediaRepresentation");
    private static final QName _ImageMediaRepresentation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImageMediaRepresentation");
    private static final QName _ArrayOfArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfArrayOfMediaAssociation");
    private static final QName _ArrayOfMediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfMediaAssociation");
    private static final QName _MediaAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "MediaAssociation");
    private static final QName _AdGroupCriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupCriterionType");
    private static final QName _CriterionAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CriterionAdditionalField");
    private static final QName _ArrayOfAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdGroupCriterion");
    private static final QName _AdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupCriterion");
    private static final QName _Criterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Criterion");
    private static final QName _ProductPartition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductPartition");
    private static final QName _ProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductCondition");
    private static final QName _ProductPartitionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductPartitionType");
    private static final QName _HotelGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelGroup");
    private static final QName _HotelListing_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelListing");
    private static final QName _HotelListingType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelListingType");
    private static final QName _HotelAdvanceBookingWindowCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelAdvanceBookingWindowCriterion");
    private static final QName _HotelCheckInDateCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelCheckInDateCriterion");
    private static final QName _HotelCheckInDayCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelCheckInDayCriterion");
    private static final QName _HotelDateSelectionTypeCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelDateSelectionTypeCriterion");
    private static final QName _HotelDateSelectionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelDateSelectionType");
    private static final QName _HotelLengthOfStayCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "HotelLengthOfStayCriterion");
    private static final QName _ProductScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductScope");
    private static final QName _ArrayOfProductCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfProductCondition");
    private static final QName _Webpage_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Webpage");
    private static final QName _WebpageParameter_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "WebpageParameter");
    private static final QName _ArrayOfWebpageCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfWebpageCondition");
    private static final QName _WebpageCondition_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "WebpageCondition");
    private static final QName _WebpageConditionOperand_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "WebpageConditionOperand");
    private static final QName _WebpageConditionOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "WebpageConditionOperator");
    private static final QName _AgeCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AgeCriterion");
    private static final QName _AgeRange_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AgeRange");
    private static final QName _DeviceCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DeviceCriterion");
    private static final QName _DayTimeCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DayTimeCriterion");
    private static final QName _GenderCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GenderCriterion");
    private static final QName _GenderType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GenderType");
    private static final QName _RadiusCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RadiusCriterion");
    private static final QName _DistanceUnit_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DistanceUnit");
    private static final QName _LocationCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LocationCriterion");
    private static final QName _LocationIntentCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LocationIntentCriterion");
    private static final QName _IntentOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "IntentOption");
    private static final QName _AudienceCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceCriterion");
    private static final QName _AudienceType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceType");
    private static final QName _ProfileCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProfileCriterion");
    private static final QName _ProfileType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProfileType");
    private static final QName _StoreCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "StoreCriterion");
    private static final QName _DealCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DealCriterion");
    private static final QName _GenreCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GenreCriterion");
    private static final QName _AdGroupCriterionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupCriterionStatus");
    private static final QName _BiddableAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BiddableAdGroupCriterion");
    private static final QName _AdGroupCriterionEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupCriterionEditorialStatus");
    private static final QName _CriterionCashback_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CriterionCashback");
    private static final QName _CashbackAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CashbackAdjustment");
    private static final QName _NegativeAdGroupCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NegativeAdGroupCriterion");
    private static final QName _ArrayOfAdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAdGroupCriterionAction");
    private static final QName _AdGroupCriterionAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AdGroupCriterionAction");
    private static final QName _ItemAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ItemAction");
    private static final QName _ArrayOfAssetGroupListingGroupAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroupListingGroupAction");
    private static final QName _AssetGroupListingGroupAction_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupListingGroupAction");
    private static final QName _AssetGroupListingGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupListingGroup");
    private static final QName _AssetGroupListingType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupListingType");
    private static final QName _ArrayOfAssetGroupListingGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroupListingGroup");
    private static final QName _BMCStoreAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BMCStoreAdditionalField");
    private static final QName _ArrayOfBMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBMCStore");
    private static final QName _BMCStore_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BMCStore");
    private static final QName _BMCStoreSubType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BMCStoreSubType");
    private static final QName _ArrayOfEntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfEntityNegativeKeyword");
    private static final QName _EntityNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EntityNegativeKeyword");
    private static final QName _ArrayOfNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfNegativeKeyword");
    private static final QName _NegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NegativeKeyword");
    private static final QName _SharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SharedListItem");
    private static final QName _NegativeSite_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NegativeSite");
    private static final QName _BrandItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BrandItem");
    private static final QName _ArrayOfIdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfIdCollection");
    private static final QName _IdCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "IdCollection");
    private static final QName _ArrayOfSharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfSharedEntity");
    private static final QName _SharedEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SharedEntity");
    private static final QName _SharedList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SharedList");
    private static final QName _NegativeKeywordList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NegativeKeywordList");
    private static final QName _PlacementExclusionList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PlacementExclusionList");
    private static final QName _AccountNegativeKeywordList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AccountNegativeKeywordList");
    private static final QName _BrandList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BrandList");
    private static final QName _EntityScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EntityScope");
    private static final QName _ArrayOfSharedListItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfSharedListItem");
    private static final QName _ArrayOfSharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfSharedEntityAssociation");
    private static final QName _SharedEntityAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SharedEntityAssociation");
    private static final QName _ArrayOfCampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignSize");
    private static final QName _CampaignSize_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignSize");
    private static final QName _ArrayOfCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignCriterion");
    private static final QName _CampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignCriterion");
    private static final QName _CampaignCriterionStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignCriterionStatus");
    private static final QName _NegativeCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NegativeCampaignCriterion");
    private static final QName _BiddableCampaignCriterion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BiddableCampaignCriterion");
    private static final QName _CampaignCriterionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignCriterionType");
    private static final QName _ArrayOfBudget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBudget");
    private static final QName _Budget_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Budget");
    private static final QName _ArrayOfBidStrategy_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBidStrategy");
    private static final QName _BidStrategy_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BidStrategy");
    private static final QName _ArrayOfAudienceGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAudienceGroup");
    private static final QName _AudienceGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceGroup");
    private static final QName _ArrayOfAudienceGroupDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAudienceGroupDimension");
    private static final QName _AudienceGroupDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceGroupDimension");
    private static final QName _AudienceGroupDimensionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceGroupDimensionType");
    private static final QName _AgeDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AgeDimension");
    private static final QName _ArrayOfAgeRange_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAgeRange");
    private static final QName _GenderDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GenderDimension");
    private static final QName _ArrayOfGenderType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfGenderType");
    private static final QName _AudienceDimension_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceDimension");
    private static final QName _ArrayOfAudienceInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAudienceInfo");
    private static final QName _AudienceInfo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceInfo");
    private static final QName _ArrayOfAssetGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroup");
    private static final QName _AssetGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroup");
    private static final QName _ArrayOfAssetGroupSearchTheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroupSearchTheme");
    private static final QName _AssetGroupSearchTheme_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupSearchTheme");
    private static final QName _AssetGroupEditorialStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupEditorialStatus");
    private static final QName _AssetGroupStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupStatus");
    private static final QName _AssetGroupAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupAdditionalField");
    private static final QName _ArrayOfAssetGroupEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroupEditorialReasonCollection");
    private static final QName _AssetGroupEditorialReasonCollection_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupEditorialReasonCollection");
    private static final QName _ArrayOfAssetGroupEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAssetGroupEditorialReason");
    private static final QName _AssetGroupEditorialReason_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AssetGroupEditorialReason");
    private static final QName _ArrayOfAudienceGroupAssetGroupAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAudienceGroupAssetGroupAssociation");
    private static final QName _AudienceGroupAssetGroupAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceGroupAssetGroupAssociation");
    private static final QName _ArrayOfAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfAudience");
    private static final QName _Audience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Audience");
    private static final QName _CustomerShare_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerShare");
    private static final QName _ArrayOfCustomerAccountShare_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCustomerAccountShare");
    private static final QName _CustomerAccountShare_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerAccountShare");
    private static final QName _ArrayOfCustomerAccountShareAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCustomerAccountShareAssociation");
    private static final QName _CustomerAccountShareAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerAccountShareAssociation");
    private static final QName _RemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RemarketingList");
    private static final QName _RemarketingRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RemarketingRule");
    private static final QName _PageVisitorsRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PageVisitorsRule");
    private static final QName _NormalForm_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NormalForm");
    private static final QName _ArrayOfRuleItemGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfRuleItemGroup");
    private static final QName _RuleItemGroup_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RuleItemGroup");
    private static final QName _ArrayOfRuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfRuleItem");
    private static final QName _RuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "RuleItem");
    private static final QName _StringRuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "StringRuleItem");
    private static final QName _StringOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "StringOperator");
    private static final QName _NumberRuleItem_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NumberRuleItem");
    private static final QName _NumberOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "NumberOperator");
    private static final QName _PageVisitorsWhoVisitedAnotherPageRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PageVisitorsWhoVisitedAnotherPageRule");
    private static final QName _PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PageVisitorsWhoDidNotVisitAnotherPageRule");
    private static final QName _CustomEventsRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomEventsRule");
    private static final QName _CustomAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomAudience");
    private static final QName _InMarketAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "InMarketAudience");
    private static final QName _ProductAudience_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductAudience");
    private static final QName _ProductAudienceType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ProductAudienceType");
    private static final QName _SimilarRemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SimilarRemarketingList");
    private static final QName _CombinedList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CombinedList");
    private static final QName _ArrayOfCombinationRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCombinationRule");
    private static final QName _CombinationRule_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CombinationRule");
    private static final QName _LogicalOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LogicalOperator");
    private static final QName _CustomerList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerList");
    private static final QName _ImpressionBasedRemarketingList_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImpressionBasedRemarketingList");
    private static final QName _ImpressionBasedEntityType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImpressionBasedEntityType");
    private static final QName _AudienceAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AudienceAdditionalField");
    private static final QName _CustomerListUserData_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerListUserData");
    private static final QName _CustomerListActionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerListActionType");
    private static final QName _CustomerListItemSubType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerListItemSubType");
    private static final QName _ArrayOfUetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfUetTag");
    private static final QName _UetTag_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "UetTag");
    private static final QName _UetTagTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "UetTagTrackingStatus");
    private static final QName _ConversionGoalType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalType");
    private static final QName _ConversionGoalAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalAdditionalField");
    private static final QName _ArrayOfConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfConversionGoal");
    private static final QName _ConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoal");
    private static final QName _AttributionModelType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AttributionModelType");
    private static final QName _ConversionGoalCountType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalCountType");
    private static final QName _ConversionGoalCategory_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalCategory");
    private static final QName _ConversionGoalRevenue_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalRevenue");
    private static final QName _ConversionGoalRevenueType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalRevenueType");
    private static final QName _ConversionGoalStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalStatus");
    private static final QName _ConversionGoalTrackingStatus_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ConversionGoalTrackingStatus");
    private static final QName _UrlGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "UrlGoal");
    private static final QName _ExpressionOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ExpressionOperator");
    private static final QName _DurationGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DurationGoal");
    private static final QName _PagesViewedPerVisitGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "PagesViewedPerVisitGoal");
    private static final QName _EventGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EventGoal");
    private static final QName _ValueOperator_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ValueOperator");
    private static final QName _AppInstallGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AppInstallGoal");
    private static final QName _OfflineConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OfflineConversionGoal");
    private static final QName _InStoreTransactionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "InStoreTransactionGoal");
    private static final QName _ArrayOfOfflineConversion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfOfflineConversion");
    private static final QName _OfflineConversion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OfflineConversion");
    private static final QName _ArrayOfOfflineConversionAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfOfflineConversionAdjustment");
    private static final QName _OfflineConversionAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OfflineConversionAdjustment");
    private static final QName _ArrayOfOnlineConversionAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfOnlineConversionAdjustment");
    private static final QName _OnlineConversionAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OnlineConversionAdjustment");
    private static final QName _ArrayOfLabel_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfLabel");
    private static final QName _Label_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Label");
    private static final QName _ArrayOfLabelAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfLabelAssociation");
    private static final QName _LabelAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "LabelAssociation");
    private static final QName _ArrayOfExperiment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfExperiment");
    private static final QName _Experiment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Experiment");
    private static final QName _ArrayOfCompany_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCompany");
    private static final QName _Company_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Company");
    private static final QName _ArrayOfImportJob_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfImportJob");
    private static final QName _ImportJob_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportJob");
    private static final QName _Frequency_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Frequency");
    private static final QName _ImportOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportOption");
    private static final QName _GoogleImportOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GoogleImportOption");
    private static final QName _ImportSearchAndReplaceForStringProperty_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportSearchAndReplaceForStringProperty");
    private static final QName _FileImportOption_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FileImportOption");
    private static final QName _GoogleImportJob_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "GoogleImportJob");
    private static final QName _ArrayOfCampaignAdGroupIds_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignAdGroupIds");
    private static final QName _CampaignAdGroupIds_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignAdGroupIds");
    private static final QName _FileImportJob_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "FileImportJob");
    private static final QName _ImportAdditionalField_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportAdditionalField");
    private static final QName _ArrayOfImportResult_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfImportResult");
    private static final QName _ImportResult_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportResult");
    private static final QName _ArrayOfImportEntityStatistics_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfImportEntityStatistics");
    private static final QName _ImportEntityStatistics_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportEntityStatistics");
    private static final QName _ImportEntityType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ImportEntityType");
    private static final QName _ArrayOfVideo_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfVideo");
    private static final QName _Video_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Video");
    private static final QName _ArrayOfCampaignConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignConversionGoal");
    private static final QName _CampaignConversionGoal_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignConversionGoal");
    private static final QName _ArrayOfDataExclusion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfDataExclusion");
    private static final QName _DataExclusion_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DataExclusion");
    private static final QName _ArrayOfCampaignAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignAssociation");
    private static final QName _CampaignAssociation_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignAssociation");
    private static final QName _DeviceType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DeviceType");
    private static final QName _ArrayOfSeasonalityAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfSeasonalityAdjustment");
    private static final QName _SeasonalityAdjustment_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "SeasonalityAdjustment");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private static final QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private static final QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private static final QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private static final QName _ArrayOfArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfArrayOfKeyValuePairOfstringstring");
    private static final QName _ArrayOfKeyValuePairOflonglong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOflonglong");
    private static final QName _KeyValuePairOflonglong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOflonglong");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _ArrayOfNullableOflong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    private static final QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private static final QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private static final QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private static final QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.campaignmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValueOfstringstring }
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link Language }
     * 
     * @return
     *     the new instance of {@link Language }
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link IDREFS }
     * 
     * @return
     *     the new instance of {@link IDREFS }
     */
    public IDREFS createIDREFS() {
        return new IDREFS();
    }

    /**
     * Create an instance of {@link ENTITIES }
     * 
     * @return
     *     the new instance of {@link ENTITIES }
     */
    public ENTITIES createENTITIES() {
        return new ENTITIES();
    }

    /**
     * Create an instance of {@link NMTOKEN }
     * 
     * @return
     *     the new instance of {@link NMTOKEN }
     */
    public NMTOKEN createNMTOKEN() {
        return new NMTOKEN();
    }

    /**
     * Create an instance of {@link NMTOKENS }
     * 
     * @return
     *     the new instance of {@link NMTOKENS }
     */
    public NMTOKENS createNMTOKENS() {
        return new NMTOKENS();
    }

    /**
     * Create an instance of {@link Name }
     * 
     * @return
     *     the new instance of {@link Name }
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     * @return
     *     the new instance of {@link NCName }
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link ENTITY }
     * 
     * @return
     *     the new instance of {@link ENTITY }
     */
    public ENTITY createENTITY() {
        return new ENTITY();
    }

    /**
     * Create an instance of {@link NonPositiveInteger }
     * 
     * @return
     *     the new instance of {@link NonPositiveInteger }
     */
    public NonPositiveInteger createNonPositiveInteger() {
        return new NonPositiveInteger();
    }

    /**
     * Create an instance of {@link NegativeInteger }
     * 
     * @return
     *     the new instance of {@link NegativeInteger }
     */
    public NegativeInteger createNegativeInteger() {
        return new NegativeInteger();
    }

    /**
     * Create an instance of {@link NonNegativeInteger }
     * 
     * @return
     *     the new instance of {@link NonNegativeInteger }
     */
    public NonNegativeInteger createNonNegativeInteger() {
        return new NonNegativeInteger();
    }

    /**
     * Create an instance of {@link UnsignedLong }
     * 
     * @return
     *     the new instance of {@link UnsignedLong }
     */
    public UnsignedLong createUnsignedLong() {
        return new UnsignedLong();
    }

    /**
     * Create an instance of {@link PositiveInteger }
     * 
     * @return
     *     the new instance of {@link PositiveInteger }
     */
    public PositiveInteger createPositiveInteger() {
        return new PositiveInteger();
    }

    /**
     * Create an instance of {@link TextAd }
     * 
     * @return
     *     the new instance of {@link TextAd }
     */
    public TextAd createTextAd() {
        return new TextAd();
    }

    /**
     * Create an instance of {@link Ad }
     * 
     * @return
     *     the new instance of {@link Ad }
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link ArrayOfAppUrl }
     * 
     * @return
     *     the new instance of {@link ArrayOfAppUrl }
     */
    public ArrayOfAppUrl createArrayOfAppUrl() {
        return new ArrayOfAppUrl();
    }

    /**
     * Create an instance of {@link AppUrl }
     * 
     * @return
     *     the new instance of {@link AppUrl }
     */
    public AppUrl createAppUrl() {
        return new AppUrl();
    }

    /**
     * Create an instance of {@link CustomParameters }
     * 
     * @return
     *     the new instance of {@link CustomParameters }
     */
    public CustomParameters createCustomParameters() {
        return new CustomParameters();
    }

    /**
     * Create an instance of {@link ArrayOfCustomParameter }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomParameter }
     */
    public ArrayOfCustomParameter createArrayOfCustomParameter() {
        return new ArrayOfCustomParameter();
    }

    /**
     * Create an instance of {@link CustomParameter }
     * 
     * @return
     *     the new instance of {@link CustomParameter }
     */
    public CustomParameter createCustomParameter() {
        return new CustomParameter();
    }

    /**
     * Create an instance of {@link ProductAd }
     * 
     * @return
     *     the new instance of {@link ProductAd }
     */
    public ProductAd createProductAd() {
        return new ProductAd();
    }

    /**
     * Create an instance of {@link HotelAd }
     * 
     * @return
     *     the new instance of {@link HotelAd }
     */
    public HotelAd createHotelAd() {
        return new HotelAd();
    }

    /**
     * Create an instance of {@link AppInstallAd }
     * 
     * @return
     *     the new instance of {@link AppInstallAd }
     */
    public AppInstallAd createAppInstallAd() {
        return new AppInstallAd();
    }

    /**
     * Create an instance of {@link ExpandedTextAd }
     * 
     * @return
     *     the new instance of {@link ExpandedTextAd }
     */
    public ExpandedTextAd createExpandedTextAd() {
        return new ExpandedTextAd();
    }

    /**
     * Create an instance of {@link DynamicSearchAd }
     * 
     * @return
     *     the new instance of {@link DynamicSearchAd }
     */
    public DynamicSearchAd createDynamicSearchAd() {
        return new DynamicSearchAd();
    }

    /**
     * Create an instance of {@link ResponsiveAd }
     * 
     * @return
     *     the new instance of {@link ResponsiveAd }
     */
    public ResponsiveAd createResponsiveAd() {
        return new ResponsiveAd();
    }

    /**
     * Create an instance of {@link ArrayOfAssetLink }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetLink }
     */
    public ArrayOfAssetLink createArrayOfAssetLink() {
        return new ArrayOfAssetLink();
    }

    /**
     * Create an instance of {@link AssetLink }
     * 
     * @return
     *     the new instance of {@link AssetLink }
     */
    public AssetLink createAssetLink() {
        return new AssetLink();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     * @return
     *     the new instance of {@link Asset }
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link TextAsset }
     * 
     * @return
     *     the new instance of {@link TextAsset }
     */
    public TextAsset createTextAsset() {
        return new TextAsset();
    }

    /**
     * Create an instance of {@link ImageAsset }
     * 
     * @return
     *     the new instance of {@link ImageAsset }
     */
    public ImageAsset createImageAsset() {
        return new ImageAsset();
    }

    /**
     * Create an instance of {@link VideoAsset }
     * 
     * @return
     *     the new instance of {@link VideoAsset }
     */
    public VideoAsset createVideoAsset() {
        return new VideoAsset();
    }

    /**
     * Create an instance of {@link VerifiedTrackingSetting }
     * 
     * @return
     *     the new instance of {@link VerifiedTrackingSetting }
     */
    public VerifiedTrackingSetting createVerifiedTrackingSetting() {
        return new VerifiedTrackingSetting();
    }

    /**
     * Create an instance of {@link Setting }
     * 
     * @return
     *     the new instance of {@link Setting }
     */
    public Setting createSetting() {
        return new Setting();
    }

    /**
     * Create an instance of {@link ShoppingSetting }
     * 
     * @return
     *     the new instance of {@link ShoppingSetting }
     */
    public ShoppingSetting createShoppingSetting() {
        return new ShoppingSetting();
    }

    /**
     * Create an instance of {@link DynamicFeedSetting }
     * 
     * @return
     *     the new instance of {@link DynamicFeedSetting }
     */
    public DynamicFeedSetting createDynamicFeedSetting() {
        return new DynamicFeedSetting();
    }

    /**
     * Create an instance of {@link DynamicSearchAdsSetting }
     * 
     * @return
     *     the new instance of {@link DynamicSearchAdsSetting }
     */
    public DynamicSearchAdsSetting createDynamicSearchAdsSetting() {
        return new DynamicSearchAdsSetting();
    }

    /**
     * Create an instance of {@link TargetSetting }
     * 
     * @return
     *     the new instance of {@link TargetSetting }
     */
    public TargetSetting createTargetSetting() {
        return new TargetSetting();
    }

    /**
     * Create an instance of {@link ArrayOfTargetSettingDetail }
     * 
     * @return
     *     the new instance of {@link ArrayOfTargetSettingDetail }
     */
    public ArrayOfTargetSettingDetail createArrayOfTargetSettingDetail() {
        return new ArrayOfTargetSettingDetail();
    }

    /**
     * Create an instance of {@link TargetSettingDetail }
     * 
     * @return
     *     the new instance of {@link TargetSettingDetail }
     */
    public TargetSettingDetail createTargetSettingDetail() {
        return new TargetSettingDetail();
    }

    /**
     * Create an instance of {@link CoOpSetting }
     * 
     * @return
     *     the new instance of {@link CoOpSetting }
     */
    public CoOpSetting createCoOpSetting() {
        return new CoOpSetting();
    }

    /**
     * Create an instance of {@link DisclaimerSetting }
     * 
     * @return
     *     the new instance of {@link DisclaimerSetting }
     */
    public DisclaimerSetting createDisclaimerSetting() {
        return new DisclaimerSetting();
    }

    /**
     * Create an instance of {@link HotelSetting }
     * 
     * @return
     *     the new instance of {@link HotelSetting }
     */
    public HotelSetting createHotelSetting() {
        return new HotelSetting();
    }

    /**
     * Create an instance of {@link ResponsiveSearchAdsSetting }
     * 
     * @return
     *     the new instance of {@link ResponsiveSearchAdsSetting }
     */
    public ResponsiveSearchAdsSetting createResponsiveSearchAdsSetting() {
        return new ResponsiveSearchAdsSetting();
    }

    /**
     * Create an instance of {@link PerformanceMaxSetting }
     * 
     * @return
     *     the new instance of {@link PerformanceMaxSetting }
     */
    public PerformanceMaxSetting createPerformanceMaxSetting() {
        return new PerformanceMaxSetting();
    }

    /**
     * Create an instance of {@link CallToActionSetting }
     * 
     * @return
     *     the new instance of {@link CallToActionSetting }
     */
    public CallToActionSetting createCallToActionSetting() {
        return new CallToActionSetting();
    }

    /**
     * Create an instance of {@link VanityPharmaSetting }
     * 
     * @return
     *     the new instance of {@link VanityPharmaSetting }
     */
    public VanityPharmaSetting createVanityPharmaSetting() {
        return new VanityPharmaSetting();
    }

    /**
     * Create an instance of {@link ResponsiveSearchAd }
     * 
     * @return
     *     the new instance of {@link ResponsiveSearchAd }
     */
    public ResponsiveSearchAd createResponsiveSearchAd() {
        return new ResponsiveSearchAd();
    }

    /**
     * Create an instance of {@link AddCampaignsRequest }
     * 
     * @return
     *     the new instance of {@link AddCampaignsRequest }
     */
    public AddCampaignsRequest createAddCampaignsRequest() {
        return new AddCampaignsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaign }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaign }
     */
    public ArrayOfCampaign createArrayOfCampaign() {
        return new ArrayOfCampaign();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     * @return
     *     the new instance of {@link Campaign }
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link BiddingScheme }
     * 
     * @return
     *     the new instance of {@link BiddingScheme }
     */
    public BiddingScheme createBiddingScheme() {
        return new BiddingScheme();
    }

    /**
     * Create an instance of {@link MaxClicksBiddingScheme }
     * 
     * @return
     *     the new instance of {@link MaxClicksBiddingScheme }
     */
    public MaxClicksBiddingScheme createMaxClicksBiddingScheme() {
        return new MaxClicksBiddingScheme();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     * @return
     *     the new instance of {@link Bid }
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link MaxConversionsBiddingScheme }
     * 
     * @return
     *     the new instance of {@link MaxConversionsBiddingScheme }
     */
    public MaxConversionsBiddingScheme createMaxConversionsBiddingScheme() {
        return new MaxConversionsBiddingScheme();
    }

    /**
     * Create an instance of {@link TargetCpaBiddingScheme }
     * 
     * @return
     *     the new instance of {@link TargetCpaBiddingScheme }
     */
    public TargetCpaBiddingScheme createTargetCpaBiddingScheme() {
        return new TargetCpaBiddingScheme();
    }

    /**
     * Create an instance of {@link ManualCpcBiddingScheme }
     * 
     * @return
     *     the new instance of {@link ManualCpcBiddingScheme }
     */
    public ManualCpcBiddingScheme createManualCpcBiddingScheme() {
        return new ManualCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link EnhancedCpcBiddingScheme }
     * 
     * @return
     *     the new instance of {@link EnhancedCpcBiddingScheme }
     */
    public EnhancedCpcBiddingScheme createEnhancedCpcBiddingScheme() {
        return new EnhancedCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link ManualCpvBiddingScheme }
     * 
     * @return
     *     the new instance of {@link ManualCpvBiddingScheme }
     */
    public ManualCpvBiddingScheme createManualCpvBiddingScheme() {
        return new ManualCpvBiddingScheme();
    }

    /**
     * Create an instance of {@link ManualCpmBiddingScheme }
     * 
     * @return
     *     the new instance of {@link ManualCpmBiddingScheme }
     */
    public ManualCpmBiddingScheme createManualCpmBiddingScheme() {
        return new ManualCpmBiddingScheme();
    }

    /**
     * Create an instance of {@link InheritFromParentBiddingScheme }
     * 
     * @return
     *     the new instance of {@link InheritFromParentBiddingScheme }
     */
    public InheritFromParentBiddingScheme createInheritFromParentBiddingScheme() {
        return new InheritFromParentBiddingScheme();
    }

    /**
     * Create an instance of {@link TargetRoasBiddingScheme }
     * 
     * @return
     *     the new instance of {@link TargetRoasBiddingScheme }
     */
    public TargetRoasBiddingScheme createTargetRoasBiddingScheme() {
        return new TargetRoasBiddingScheme();
    }

    /**
     * Create an instance of {@link MaxRoasBiddingScheme }
     * 
     * @return
     *     the new instance of {@link MaxRoasBiddingScheme }
     */
    public MaxRoasBiddingScheme createMaxRoasBiddingScheme() {
        return new MaxRoasBiddingScheme();
    }

    /**
     * Create an instance of {@link MaxConversionValueBiddingScheme }
     * 
     * @return
     *     the new instance of {@link MaxConversionValueBiddingScheme }
     */
    public MaxConversionValueBiddingScheme createMaxConversionValueBiddingScheme() {
        return new MaxConversionValueBiddingScheme();
    }

    /**
     * Create an instance of {@link TargetImpressionShareBiddingScheme }
     * 
     * @return
     *     the new instance of {@link TargetImpressionShareBiddingScheme }
     */
    public TargetImpressionShareBiddingScheme createTargetImpressionShareBiddingScheme() {
        return new TargetImpressionShareBiddingScheme();
    }

    /**
     * Create an instance of {@link PercentCpcBiddingScheme }
     * 
     * @return
     *     the new instance of {@link PercentCpcBiddingScheme }
     */
    public PercentCpcBiddingScheme createPercentCpcBiddingScheme() {
        return new PercentCpcBiddingScheme();
    }

    /**
     * Create an instance of {@link CommissionBiddingScheme }
     * 
     * @return
     *     the new instance of {@link CommissionBiddingScheme }
     */
    public CommissionBiddingScheme createCommissionBiddingScheme() {
        return new CommissionBiddingScheme();
    }

    /**
     * Create an instance of {@link ManualCpaBiddingScheme }
     * 
     * @return
     *     the new instance of {@link ManualCpaBiddingScheme }
     */
    public ManualCpaBiddingScheme createManualCpaBiddingScheme() {
        return new ManualCpaBiddingScheme();
    }

    /**
     * Create an instance of {@link CostPerSaleBiddingScheme }
     * 
     * @return
     *     the new instance of {@link CostPerSaleBiddingScheme }
     */
    public CostPerSaleBiddingScheme createCostPerSaleBiddingScheme() {
        return new CostPerSaleBiddingScheme();
    }

    /**
     * Create an instance of {@link ArrayOfSetting }
     * 
     * @return
     *     the new instance of {@link ArrayOfSetting }
     */
    public ArrayOfSetting createArrayOfSetting() {
        return new ArrayOfSetting();
    }

    /**
     * Create an instance of {@link AddCampaignsResponse }
     * 
     * @return
     *     the new instance of {@link AddCampaignsResponse }
     */
    public AddCampaignsResponse createAddCampaignsResponse() {
        return new AddCampaignsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfNullableOflong }
     * 
     * @return
     *     the new instance of {@link ArrayOfNullableOflong }
     */
    public ArrayOfNullableOflong createArrayOfNullableOflong() {
        return new ArrayOfNullableOflong();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     * @return
     *     the new instance of {@link ArrayOfBatchError }
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
    }

    /**
     * Create an instance of {@link BatchError }
     * 
     * @return
     *     the new instance of {@link BatchError }
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link EditorialError }
     * 
     * @return
     *     the new instance of {@link EditorialError }
     */
    public EditorialError createEditorialError() {
        return new EditorialError();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     * @return
     *     the new instance of {@link ApiFaultDetail }
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
    }

    /**
     * Create an instance of {@link ArrayOfOperationError }
     * 
     * @return
     *     the new instance of {@link ArrayOfOperationError }
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     * @return
     *     the new instance of {@link OperationError }
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link GetCampaignsByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignsByAccountIdRequest }
     */
    public GetCampaignsByAccountIdRequest createGetCampaignsByAccountIdRequest() {
        return new GetCampaignsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetCampaignsByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignsByAccountIdResponse }
     */
    public GetCampaignsByAccountIdResponse createGetCampaignsByAccountIdResponse() {
        return new GetCampaignsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link GetCampaignsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignsByIdsRequest }
     */
    public GetCampaignsByIdsRequest createGetCampaignsByIdsRequest() {
        return new GetCampaignsByIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     * @return
     *     the new instance of {@link ArrayOflong }
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link GetCampaignsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignsByIdsResponse }
     */
    public GetCampaignsByIdsResponse createGetCampaignsByIdsResponse() {
        return new GetCampaignsByIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteCampaignsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignsRequest }
     */
    public DeleteCampaignsRequest createDeleteCampaignsRequest() {
        return new DeleteCampaignsRequest();
    }

    /**
     * Create an instance of {@link DeleteCampaignsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignsResponse }
     */
    public DeleteCampaignsResponse createDeleteCampaignsResponse() {
        return new DeleteCampaignsResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaignsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateCampaignsRequest }
     */
    public UpdateCampaignsRequest createUpdateCampaignsRequest() {
        return new UpdateCampaignsRequest();
    }

    /**
     * Create an instance of {@link UpdateCampaignsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateCampaignsResponse }
     */
    public UpdateCampaignsResponse createUpdateCampaignsResponse() {
        return new UpdateCampaignsResponse();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByCampaignIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetNegativeSitesByCampaignIdsRequest }
     */
    public GetNegativeSitesByCampaignIdsRequest createGetNegativeSitesByCampaignIdsRequest() {
        return new GetNegativeSitesByCampaignIdsRequest();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByCampaignIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetNegativeSitesByCampaignIdsResponse }
     */
    public GetNegativeSitesByCampaignIdsResponse createGetNegativeSitesByCampaignIdsResponse() {
        return new GetNegativeSitesByCampaignIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignNegativeSites }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignNegativeSites }
     */
    public ArrayOfCampaignNegativeSites createArrayOfCampaignNegativeSites() {
        return new ArrayOfCampaignNegativeSites();
    }

    /**
     * Create an instance of {@link CampaignNegativeSites }
     * 
     * @return
     *     the new instance of {@link CampaignNegativeSites }
     */
    public CampaignNegativeSites createCampaignNegativeSites() {
        return new CampaignNegativeSites();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToCampaignsRequest }
     * 
     * @return
     *     the new instance of {@link SetNegativeSitesToCampaignsRequest }
     */
    public SetNegativeSitesToCampaignsRequest createSetNegativeSitesToCampaignsRequest() {
        return new SetNegativeSitesToCampaignsRequest();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToCampaignsResponse }
     * 
     * @return
     *     the new instance of {@link SetNegativeSitesToCampaignsResponse }
     */
    public SetNegativeSitesToCampaignsResponse createSetNegativeSitesToCampaignsResponse() {
        return new SetNegativeSitesToCampaignsResponse();
    }

    /**
     * Create an instance of {@link GetConfigValueRequest }
     * 
     * @return
     *     the new instance of {@link GetConfigValueRequest }
     */
    public GetConfigValueRequest createGetConfigValueRequest() {
        return new GetConfigValueRequest();
    }

    /**
     * Create an instance of {@link GetConfigValueResponse }
     * 
     * @return
     *     the new instance of {@link GetConfigValueResponse }
     */
    public GetConfigValueResponse createGetConfigValueResponse() {
        return new GetConfigValueResponse();
    }

    /**
     * Create an instance of {@link GetBSCCountriesRequest }
     * 
     * @return
     *     the new instance of {@link GetBSCCountriesRequest }
     */
    public GetBSCCountriesRequest createGetBSCCountriesRequest() {
        return new GetBSCCountriesRequest();
    }

    /**
     * Create an instance of {@link GetBSCCountriesResponse }
     * 
     * @return
     *     the new instance of {@link GetBSCCountriesResponse }
     */
    public GetBSCCountriesResponse createGetBSCCountriesResponse() {
        return new GetBSCCountriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfstring }
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link AddAdGroupsRequest }
     * 
     * @return
     *     the new instance of {@link AddAdGroupsRequest }
     */
    public AddAdGroupsRequest createAddAdGroupsRequest() {
        return new AddAdGroupsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroup }
     */
    public ArrayOfAdGroup createArrayOfAdGroup() {
        return new ArrayOfAdGroup();
    }

    /**
     * Create an instance of {@link AdGroup }
     * 
     * @return
     *     the new instance of {@link AdGroup }
     */
    public AdGroup createAdGroup() {
        return new AdGroup();
    }

    /**
     * Create an instance of {@link AdRotation }
     * 
     * @return
     *     the new instance of {@link AdRotation }
     */
    public AdRotation createAdRotation() {
        return new AdRotation();
    }

    /**
     * Create an instance of {@link RateBid }
     * 
     * @return
     *     the new instance of {@link RateBid }
     */
    public RateBid createRateBid() {
        return new RateBid();
    }

    /**
     * Create an instance of {@link CriterionBid }
     * 
     * @return
     *     the new instance of {@link CriterionBid }
     */
    public CriterionBid createCriterionBid() {
        return new CriterionBid();
    }

    /**
     * Create an instance of {@link FixedBid }
     * 
     * @return
     *     the new instance of {@link FixedBid }
     */
    public FixedBid createFixedBid() {
        return new FixedBid();
    }

    /**
     * Create an instance of {@link BidMultiplier }
     * 
     * @return
     *     the new instance of {@link BidMultiplier }
     */
    public BidMultiplier createBidMultiplier() {
        return new BidMultiplier();
    }

    /**
     * Create an instance of {@link RateAmount }
     * 
     * @return
     *     the new instance of {@link RateAmount }
     */
    public RateAmount createRateAmount() {
        return new RateAmount();
    }

    /**
     * Create an instance of {@link Date }
     * 
     * @return
     *     the new instance of {@link Date }
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link ArrayOfFrequencyCapSettings }
     * 
     * @return
     *     the new instance of {@link ArrayOfFrequencyCapSettings }
     */
    public ArrayOfFrequencyCapSettings createArrayOfFrequencyCapSettings() {
        return new ArrayOfFrequencyCapSettings();
    }

    /**
     * Create an instance of {@link FrequencyCapSettings }
     * 
     * @return
     *     the new instance of {@link FrequencyCapSettings }
     */
    public FrequencyCapSettings createFrequencyCapSettings() {
        return new FrequencyCapSettings();
    }

    /**
     * Create an instance of {@link AddAdGroupsResponse }
     * 
     * @return
     *     the new instance of {@link AddAdGroupsResponse }
     */
    public AddAdGroupsResponse createAddAdGroupsResponse() {
        return new AddAdGroupsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdGroupsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAdGroupsRequest }
     */
    public DeleteAdGroupsRequest createDeleteAdGroupsRequest() {
        return new DeleteAdGroupsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdGroupsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAdGroupsResponse }
     */
    public DeleteAdGroupsResponse createDeleteAdGroupsResponse() {
        return new DeleteAdGroupsResponse();
    }

    /**
     * Create an instance of {@link GetAdGroupsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdGroupsByIdsRequest }
     */
    public GetAdGroupsByIdsRequest createGetAdGroupsByIdsRequest() {
        return new GetAdGroupsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdGroupsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdGroupsByIdsResponse }
     */
    public GetAdGroupsByIdsResponse createGetAdGroupsByIdsResponse() {
        return new GetAdGroupsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetAdGroupsByCampaignIdRequest }
     * 
     * @return
     *     the new instance of {@link GetAdGroupsByCampaignIdRequest }
     */
    public GetAdGroupsByCampaignIdRequest createGetAdGroupsByCampaignIdRequest() {
        return new GetAdGroupsByCampaignIdRequest();
    }

    /**
     * Create an instance of {@link GetAdGroupsByCampaignIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAdGroupsByCampaignIdResponse }
     */
    public GetAdGroupsByCampaignIdResponse createGetAdGroupsByCampaignIdResponse() {
        return new GetAdGroupsByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link UpdateAdGroupsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAdGroupsRequest }
     */
    public UpdateAdGroupsRequest createUpdateAdGroupsRequest() {
        return new UpdateAdGroupsRequest();
    }

    /**
     * Create an instance of {@link UpdateAdGroupsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAdGroupsResponse }
     */
    public UpdateAdGroupsResponse createUpdateAdGroupsResponse() {
        return new UpdateAdGroupsResponse();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByAdGroupIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetNegativeSitesByAdGroupIdsRequest }
     */
    public GetNegativeSitesByAdGroupIdsRequest createGetNegativeSitesByAdGroupIdsRequest() {
        return new GetNegativeSitesByAdGroupIdsRequest();
    }

    /**
     * Create an instance of {@link GetNegativeSitesByAdGroupIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetNegativeSitesByAdGroupIdsResponse }
     */
    public GetNegativeSitesByAdGroupIdsResponse createGetNegativeSitesByAdGroupIdsResponse() {
        return new GetNegativeSitesByAdGroupIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupNegativeSites }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroupNegativeSites }
     */
    public ArrayOfAdGroupNegativeSites createArrayOfAdGroupNegativeSites() {
        return new ArrayOfAdGroupNegativeSites();
    }

    /**
     * Create an instance of {@link AdGroupNegativeSites }
     * 
     * @return
     *     the new instance of {@link AdGroupNegativeSites }
     */
    public AdGroupNegativeSites createAdGroupNegativeSites() {
        return new AdGroupNegativeSites();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToAdGroupsRequest }
     * 
     * @return
     *     the new instance of {@link SetNegativeSitesToAdGroupsRequest }
     */
    public SetNegativeSitesToAdGroupsRequest createSetNegativeSitesToAdGroupsRequest() {
        return new SetNegativeSitesToAdGroupsRequest();
    }

    /**
     * Create an instance of {@link SetNegativeSitesToAdGroupsResponse }
     * 
     * @return
     *     the new instance of {@link SetNegativeSitesToAdGroupsResponse }
     */
    public SetNegativeSitesToAdGroupsResponse createSetNegativeSitesToAdGroupsResponse() {
        return new SetNegativeSitesToAdGroupsResponse();
    }

    /**
     * Create an instance of {@link GetGeoLocationsFileUrlRequest }
     * 
     * @return
     *     the new instance of {@link GetGeoLocationsFileUrlRequest }
     */
    public GetGeoLocationsFileUrlRequest createGetGeoLocationsFileUrlRequest() {
        return new GetGeoLocationsFileUrlRequest();
    }

    /**
     * Create an instance of {@link GetGeoLocationsFileUrlResponse }
     * 
     * @return
     *     the new instance of {@link GetGeoLocationsFileUrlResponse }
     */
    public GetGeoLocationsFileUrlResponse createGetGeoLocationsFileUrlResponse() {
        return new GetGeoLocationsFileUrlResponse();
    }

    /**
     * Create an instance of {@link AddAdsRequest }
     * 
     * @return
     *     the new instance of {@link AddAdsRequest }
     */
    public AddAdsRequest createAddAdsRequest() {
        return new AddAdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAd }
     * 
     * @return
     *     the new instance of {@link ArrayOfAd }
     */
    public ArrayOfAd createArrayOfAd() {
        return new ArrayOfAd();
    }

    /**
     * Create an instance of {@link AddAdsResponse }
     * 
     * @return
     *     the new instance of {@link AddAdsResponse }
     */
    public AddAdsResponse createAddAdsResponse() {
        return new AddAdsResponse();
    }

    /**
     * Create an instance of {@link EditorialApiFaultDetail }
     * 
     * @return
     *     the new instance of {@link EditorialApiFaultDetail }
     */
    public EditorialApiFaultDetail createEditorialApiFaultDetail() {
        return new EditorialApiFaultDetail();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialError }
     * 
     * @return
     *     the new instance of {@link ArrayOfEditorialError }
     */
    public ArrayOfEditorialError createArrayOfEditorialError() {
        return new ArrayOfEditorialError();
    }

    /**
     * Create an instance of {@link DeleteAdsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAdsRequest }
     */
    public DeleteAdsRequest createDeleteAdsRequest() {
        return new DeleteAdsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAdsResponse }
     */
    public DeleteAdsResponse createDeleteAdsResponse() {
        return new DeleteAdsResponse();
    }

    /**
     * Create an instance of {@link GetAdsByEditorialStatusRequest }
     * 
     * @return
     *     the new instance of {@link GetAdsByEditorialStatusRequest }
     */
    public GetAdsByEditorialStatusRequest createGetAdsByEditorialStatusRequest() {
        return new GetAdsByEditorialStatusRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdType }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdType }
     */
    public ArrayOfAdType createArrayOfAdType() {
        return new ArrayOfAdType();
    }

    /**
     * Create an instance of {@link GetAdsByEditorialStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetAdsByEditorialStatusResponse }
     */
    public GetAdsByEditorialStatusResponse createGetAdsByEditorialStatusResponse() {
        return new GetAdsByEditorialStatusResponse();
    }

    /**
     * Create an instance of {@link GetAdsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdsByIdsRequest }
     */
    public GetAdsByIdsRequest createGetAdsByIdsRequest() {
        return new GetAdsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdsByIdsResponse }
     */
    public GetAdsByIdsResponse createGetAdsByIdsResponse() {
        return new GetAdsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetAdsByAdGroupIdRequest }
     * 
     * @return
     *     the new instance of {@link GetAdsByAdGroupIdRequest }
     */
    public GetAdsByAdGroupIdRequest createGetAdsByAdGroupIdRequest() {
        return new GetAdsByAdGroupIdRequest();
    }

    /**
     * Create an instance of {@link GetAdsByAdGroupIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAdsByAdGroupIdResponse }
     */
    public GetAdsByAdGroupIdResponse createGetAdsByAdGroupIdResponse() {
        return new GetAdsByAdGroupIdResponse();
    }

    /**
     * Create an instance of {@link UpdateAdsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAdsRequest }
     */
    public UpdateAdsRequest createUpdateAdsRequest() {
        return new UpdateAdsRequest();
    }

    /**
     * Create an instance of {@link UpdateAdsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAdsResponse }
     */
    public UpdateAdsResponse createUpdateAdsResponse() {
        return new UpdateAdsResponse();
    }

    /**
     * Create an instance of {@link AddKeywordsRequest }
     * 
     * @return
     *     the new instance of {@link AddKeywordsRequest }
     */
    public AddKeywordsRequest createAddKeywordsRequest() {
        return new AddKeywordsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeyword }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyword }
     */
    public ArrayOfKeyword createArrayOfKeyword() {
        return new ArrayOfKeyword();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     * @return
     *     the new instance of {@link Keyword }
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link AddKeywordsResponse }
     * 
     * @return
     *     the new instance of {@link AddKeywordsResponse }
     */
    public AddKeywordsResponse createAddKeywordsResponse() {
        return new AddKeywordsResponse();
    }

    /**
     * Create an instance of {@link DeleteKeywordsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteKeywordsRequest }
     */
    public DeleteKeywordsRequest createDeleteKeywordsRequest() {
        return new DeleteKeywordsRequest();
    }

    /**
     * Create an instance of {@link DeleteKeywordsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteKeywordsResponse }
     */
    public DeleteKeywordsResponse createDeleteKeywordsResponse() {
        return new DeleteKeywordsResponse();
    }

    /**
     * Create an instance of {@link GetKeywordsByEditorialStatusRequest }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByEditorialStatusRequest }
     */
    public GetKeywordsByEditorialStatusRequest createGetKeywordsByEditorialStatusRequest() {
        return new GetKeywordsByEditorialStatusRequest();
    }

    /**
     * Create an instance of {@link GetKeywordsByEditorialStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByEditorialStatusResponse }
     */
    public GetKeywordsByEditorialStatusResponse createGetKeywordsByEditorialStatusResponse() {
        return new GetKeywordsByEditorialStatusResponse();
    }

    /**
     * Create an instance of {@link GetKeywordsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByIdsRequest }
     */
    public GetKeywordsByIdsRequest createGetKeywordsByIdsRequest() {
        return new GetKeywordsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetKeywordsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByIdsResponse }
     */
    public GetKeywordsByIdsResponse createGetKeywordsByIdsResponse() {
        return new GetKeywordsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetKeywordsByAdGroupIdRequest }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByAdGroupIdRequest }
     */
    public GetKeywordsByAdGroupIdRequest createGetKeywordsByAdGroupIdRequest() {
        return new GetKeywordsByAdGroupIdRequest();
    }

    /**
     * Create an instance of {@link GetKeywordsByAdGroupIdResponse }
     * 
     * @return
     *     the new instance of {@link GetKeywordsByAdGroupIdResponse }
     */
    public GetKeywordsByAdGroupIdResponse createGetKeywordsByAdGroupIdResponse() {
        return new GetKeywordsByAdGroupIdResponse();
    }

    /**
     * Create an instance of {@link UpdateKeywordsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateKeywordsRequest }
     */
    public UpdateKeywordsRequest createUpdateKeywordsRequest() {
        return new UpdateKeywordsRequest();
    }

    /**
     * Create an instance of {@link UpdateKeywordsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateKeywordsResponse }
     */
    public UpdateKeywordsResponse createUpdateKeywordsResponse() {
        return new UpdateKeywordsResponse();
    }

    /**
     * Create an instance of {@link AppealEditorialRejectionsRequest }
     * 
     * @return
     *     the new instance of {@link AppealEditorialRejectionsRequest }
     */
    public AppealEditorialRejectionsRequest createAppealEditorialRejectionsRequest() {
        return new AppealEditorialRejectionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEntityIdToParentIdAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfEntityIdToParentIdAssociation }
     */
    public ArrayOfEntityIdToParentIdAssociation createArrayOfEntityIdToParentIdAssociation() {
        return new ArrayOfEntityIdToParentIdAssociation();
    }

    /**
     * Create an instance of {@link EntityIdToParentIdAssociation }
     * 
     * @return
     *     the new instance of {@link EntityIdToParentIdAssociation }
     */
    public EntityIdToParentIdAssociation createEntityIdToParentIdAssociation() {
        return new EntityIdToParentIdAssociation();
    }

    /**
     * Create an instance of {@link AppealEditorialRejectionsResponse }
     * 
     * @return
     *     the new instance of {@link AppealEditorialRejectionsResponse }
     */
    public AppealEditorialRejectionsResponse createAppealEditorialRejectionsResponse() {
        return new AppealEditorialRejectionsResponse();
    }

    /**
     * Create an instance of {@link GetEditorialReasonsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetEditorialReasonsByIdsRequest }
     */
    public GetEditorialReasonsByIdsRequest createGetEditorialReasonsByIdsRequest() {
        return new GetEditorialReasonsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetEditorialReasonsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetEditorialReasonsByIdsResponse }
     */
    public GetEditorialReasonsByIdsResponse createGetEditorialReasonsByIdsResponse() {
        return new GetEditorialReasonsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfEditorialReasonCollection }
     */
    public ArrayOfEditorialReasonCollection createArrayOfEditorialReasonCollection() {
        return new ArrayOfEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link EditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link EditorialReasonCollection }
     */
    public EditorialReasonCollection createEditorialReasonCollection() {
        return new EditorialReasonCollection();
    }

    /**
     * Create an instance of {@link ArrayOfEditorialReason }
     * 
     * @return
     *     the new instance of {@link ArrayOfEditorialReason }
     */
    public ArrayOfEditorialReason createArrayOfEditorialReason() {
        return new ArrayOfEditorialReason();
    }

    /**
     * Create an instance of {@link EditorialReason }
     * 
     * @return
     *     the new instance of {@link EditorialReason }
     */
    public EditorialReason createEditorialReason() {
        return new EditorialReason();
    }

    /**
     * Create an instance of {@link GetAccountMigrationStatusesRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountMigrationStatusesRequest }
     */
    public GetAccountMigrationStatusesRequest createGetAccountMigrationStatusesRequest() {
        return new GetAccountMigrationStatusesRequest();
    }

    /**
     * Create an instance of {@link GetAccountMigrationStatusesResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountMigrationStatusesResponse }
     */
    public GetAccountMigrationStatusesResponse createGetAccountMigrationStatusesResponse() {
        return new GetAccountMigrationStatusesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountMigrationStatusesInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountMigrationStatusesInfo }
     */
    public ArrayOfAccountMigrationStatusesInfo createArrayOfAccountMigrationStatusesInfo() {
        return new ArrayOfAccountMigrationStatusesInfo();
    }

    /**
     * Create an instance of {@link AccountMigrationStatusesInfo }
     * 
     * @return
     *     the new instance of {@link AccountMigrationStatusesInfo }
     */
    public AccountMigrationStatusesInfo createAccountMigrationStatusesInfo() {
        return new AccountMigrationStatusesInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMigrationStatusInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfMigrationStatusInfo }
     */
    public ArrayOfMigrationStatusInfo createArrayOfMigrationStatusInfo() {
        return new ArrayOfMigrationStatusInfo();
    }

    /**
     * Create an instance of {@link MigrationStatusInfo }
     * 
     * @return
     *     the new instance of {@link MigrationStatusInfo }
     */
    public MigrationStatusInfo createMigrationStatusInfo() {
        return new MigrationStatusInfo();
    }

    /**
     * Create an instance of {@link SetAccountPropertiesRequest }
     * 
     * @return
     *     the new instance of {@link SetAccountPropertiesRequest }
     */
    public SetAccountPropertiesRequest createSetAccountPropertiesRequest() {
        return new SetAccountPropertiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountProperty }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountProperty }
     */
    public ArrayOfAccountProperty createArrayOfAccountProperty() {
        return new ArrayOfAccountProperty();
    }

    /**
     * Create an instance of {@link AccountProperty }
     * 
     * @return
     *     the new instance of {@link AccountProperty }
     */
    public AccountProperty createAccountProperty() {
        return new AccountProperty();
    }

    /**
     * Create an instance of {@link SetAccountPropertiesResponse }
     * 
     * @return
     *     the new instance of {@link SetAccountPropertiesResponse }
     */
    public SetAccountPropertiesResponse createSetAccountPropertiesResponse() {
        return new SetAccountPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetAccountPropertiesRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountPropertiesRequest }
     */
    public GetAccountPropertiesRequest createGetAccountPropertiesRequest() {
        return new GetAccountPropertiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountPropertyName }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountPropertyName }
     */
    public ArrayOfAccountPropertyName createArrayOfAccountPropertyName() {
        return new ArrayOfAccountPropertyName();
    }

    /**
     * Create an instance of {@link GetAccountPropertiesResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountPropertiesResponse }
     */
    public GetAccountPropertiesResponse createGetAccountPropertiesResponse() {
        return new GetAccountPropertiesResponse();
    }

    /**
     * Create an instance of {@link AddAdExtensionsRequest }
     * 
     * @return
     *     the new instance of {@link AddAdExtensionsRequest }
     */
    public AddAdExtensionsRequest createAddAdExtensionsRequest() {
        return new AddAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtension }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtension }
     */
    public ArrayOfAdExtension createArrayOfAdExtension() {
        return new ArrayOfAdExtension();
    }

    /**
     * Create an instance of {@link AdExtension }
     * 
     * @return
     *     the new instance of {@link AdExtension }
     */
    public AdExtension createAdExtension() {
        return new AdExtension();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     * @return
     *     the new instance of {@link Schedule }
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ArrayOfDayTime }
     * 
     * @return
     *     the new instance of {@link ArrayOfDayTime }
     */
    public ArrayOfDayTime createArrayOfDayTime() {
        return new ArrayOfDayTime();
    }

    /**
     * Create an instance of {@link DayTime }
     * 
     * @return
     *     the new instance of {@link DayTime }
     */
    public DayTime createDayTime() {
        return new DayTime();
    }

    /**
     * Create an instance of {@link LocationAdExtension }
     * 
     * @return
     *     the new instance of {@link LocationAdExtension }
     */
    public LocationAdExtension createLocationAdExtension() {
        return new LocationAdExtension();
    }

    /**
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link GeoPoint }
     * 
     * @return
     *     the new instance of {@link GeoPoint }
     */
    public GeoPoint createGeoPoint() {
        return new GeoPoint();
    }

    /**
     * Create an instance of {@link CallAdExtension }
     * 
     * @return
     *     the new instance of {@link CallAdExtension }
     */
    public CallAdExtension createCallAdExtension() {
        return new CallAdExtension();
    }

    /**
     * Create an instance of {@link ImageAdExtension }
     * 
     * @return
     *     the new instance of {@link ImageAdExtension }
     */
    public ImageAdExtension createImageAdExtension() {
        return new ImageAdExtension();
    }

    /**
     * Create an instance of {@link AppAdExtension }
     * 
     * @return
     *     the new instance of {@link AppAdExtension }
     */
    public AppAdExtension createAppAdExtension() {
        return new AppAdExtension();
    }

    /**
     * Create an instance of {@link ReviewAdExtension }
     * 
     * @return
     *     the new instance of {@link ReviewAdExtension }
     */
    public ReviewAdExtension createReviewAdExtension() {
        return new ReviewAdExtension();
    }

    /**
     * Create an instance of {@link CalloutAdExtension }
     * 
     * @return
     *     the new instance of {@link CalloutAdExtension }
     */
    public CalloutAdExtension createCalloutAdExtension() {
        return new CalloutAdExtension();
    }

    /**
     * Create an instance of {@link SitelinkAdExtension }
     * 
     * @return
     *     the new instance of {@link SitelinkAdExtension }
     */
    public SitelinkAdExtension createSitelinkAdExtension() {
        return new SitelinkAdExtension();
    }

    /**
     * Create an instance of {@link ActionAdExtension }
     * 
     * @return
     *     the new instance of {@link ActionAdExtension }
     */
    public ActionAdExtension createActionAdExtension() {
        return new ActionAdExtension();
    }

    /**
     * Create an instance of {@link StructuredSnippetAdExtension }
     * 
     * @return
     *     the new instance of {@link StructuredSnippetAdExtension }
     */
    public StructuredSnippetAdExtension createStructuredSnippetAdExtension() {
        return new StructuredSnippetAdExtension();
    }

    /**
     * Create an instance of {@link PriceAdExtension }
     * 
     * @return
     *     the new instance of {@link PriceAdExtension }
     */
    public PriceAdExtension createPriceAdExtension() {
        return new PriceAdExtension();
    }

    /**
     * Create an instance of {@link ArrayOfPriceTableRow }
     * 
     * @return
     *     the new instance of {@link ArrayOfPriceTableRow }
     */
    public ArrayOfPriceTableRow createArrayOfPriceTableRow() {
        return new ArrayOfPriceTableRow();
    }

    /**
     * Create an instance of {@link PriceTableRow }
     * 
     * @return
     *     the new instance of {@link PriceTableRow }
     */
    public PriceTableRow createPriceTableRow() {
        return new PriceTableRow();
    }

    /**
     * Create an instance of {@link PromotionAdExtension }
     * 
     * @return
     *     the new instance of {@link PromotionAdExtension }
     */
    public PromotionAdExtension createPromotionAdExtension() {
        return new PromotionAdExtension();
    }

    /**
     * Create an instance of {@link FilterLinkAdExtension }
     * 
     * @return
     *     the new instance of {@link FilterLinkAdExtension }
     */
    public FilterLinkAdExtension createFilterLinkAdExtension() {
        return new FilterLinkAdExtension();
    }

    /**
     * Create an instance of {@link FlyerAdExtension }
     * 
     * @return
     *     the new instance of {@link FlyerAdExtension }
     */
    public FlyerAdExtension createFlyerAdExtension() {
        return new FlyerAdExtension();
    }

    /**
     * Create an instance of {@link VideoAdExtension }
     * 
     * @return
     *     the new instance of {@link VideoAdExtension }
     */
    public VideoAdExtension createVideoAdExtension() {
        return new VideoAdExtension();
    }

    /**
     * Create an instance of {@link DisclaimerAdExtension }
     * 
     * @return
     *     the new instance of {@link DisclaimerAdExtension }
     */
    public DisclaimerAdExtension createDisclaimerAdExtension() {
        return new DisclaimerAdExtension();
    }

    /**
     * Create an instance of {@link LogoAdExtension }
     * 
     * @return
     *     the new instance of {@link LogoAdExtension }
     */
    public LogoAdExtension createLogoAdExtension() {
        return new LogoAdExtension();
    }

    /**
     * Create an instance of {@link AddAdExtensionsResponse }
     * 
     * @return
     *     the new instance of {@link AddAdExtensionsResponse }
     */
    public AddAdExtensionsResponse createAddAdExtensionsResponse() {
        return new AddAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionIdentity }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionIdentity }
     */
    public ArrayOfAdExtensionIdentity createArrayOfAdExtensionIdentity() {
        return new ArrayOfAdExtensionIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfBatchErrorCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfBatchErrorCollection }
     */
    public ArrayOfBatchErrorCollection createArrayOfBatchErrorCollection() {
        return new ArrayOfBatchErrorCollection();
    }

    /**
     * Create an instance of {@link AdExtensionIdentity }
     * 
     * @return
     *     the new instance of {@link AdExtensionIdentity }
     */
    public AdExtensionIdentity createAdExtensionIdentity() {
        return new AdExtensionIdentity();
    }

    /**
     * Create an instance of {@link BatchErrorCollection }
     * 
     * @return
     *     the new instance of {@link BatchErrorCollection }
     */
    public BatchErrorCollection createBatchErrorCollection() {
        return new BatchErrorCollection();
    }

    /**
     * Create an instance of {@link EditorialErrorCollection }
     * 
     * @return
     *     the new instance of {@link EditorialErrorCollection }
     */
    public EditorialErrorCollection createEditorialErrorCollection() {
        return new EditorialErrorCollection();
    }

    /**
     * Create an instance of {@link GetAdExtensionsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsByIdsRequest }
     */
    public GetAdExtensionsByIdsRequest createGetAdExtensionsByIdsRequest() {
        return new GetAdExtensionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsByIdsResponse }
     */
    public GetAdExtensionsByIdsResponse createGetAdExtensionsByIdsResponse() {
        return new GetAdExtensionsByIdsResponse();
    }

    /**
     * Create an instance of {@link UpdateAdExtensionsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAdExtensionsRequest }
     */
    public UpdateAdExtensionsRequest createUpdateAdExtensionsRequest() {
        return new UpdateAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link UpdateAdExtensionsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAdExtensionsResponse }
     */
    public UpdateAdExtensionsResponse createUpdateAdExtensionsResponse() {
        return new UpdateAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAdExtensionsRequest }
     */
    public DeleteAdExtensionsRequest createDeleteAdExtensionsRequest() {
        return new DeleteAdExtensionsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAdExtensionsResponse }
     */
    public DeleteAdExtensionsResponse createDeleteAdExtensionsResponse() {
        return new DeleteAdExtensionsResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionsEditorialReasonsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsEditorialReasonsRequest }
     */
    public GetAdExtensionsEditorialReasonsRequest createGetAdExtensionsEditorialReasonsRequest() {
        return new GetAdExtensionsEditorialReasonsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionIdToEntityIdAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionIdToEntityIdAssociation }
     */
    public ArrayOfAdExtensionIdToEntityIdAssociation createArrayOfAdExtensionIdToEntityIdAssociation() {
        return new ArrayOfAdExtensionIdToEntityIdAssociation();
    }

    /**
     * Create an instance of {@link AdExtensionIdToEntityIdAssociation }
     * 
     * @return
     *     the new instance of {@link AdExtensionIdToEntityIdAssociation }
     */
    public AdExtensionIdToEntityIdAssociation createAdExtensionIdToEntityIdAssociation() {
        return new AdExtensionIdToEntityIdAssociation();
    }

    /**
     * Create an instance of {@link GetAdExtensionsEditorialReasonsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsEditorialReasonsResponse }
     */
    public GetAdExtensionsEditorialReasonsResponse createGetAdExtensionsEditorialReasonsResponse() {
        return new GetAdExtensionsEditorialReasonsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionEditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionEditorialReasonCollection }
     */
    public ArrayOfAdExtensionEditorialReasonCollection createArrayOfAdExtensionEditorialReasonCollection() {
        return new ArrayOfAdExtensionEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link AdExtensionEditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link AdExtensionEditorialReasonCollection }
     */
    public AdExtensionEditorialReasonCollection createAdExtensionEditorialReasonCollection() {
        return new AdExtensionEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionEditorialReason }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionEditorialReason }
     */
    public ArrayOfAdExtensionEditorialReason createArrayOfAdExtensionEditorialReason() {
        return new ArrayOfAdExtensionEditorialReason();
    }

    /**
     * Create an instance of {@link AdExtensionEditorialReason }
     * 
     * @return
     *     the new instance of {@link AdExtensionEditorialReason }
     */
    public AdExtensionEditorialReason createAdExtensionEditorialReason() {
        return new AdExtensionEditorialReason();
    }

    /**
     * Create an instance of {@link SetAdExtensionsAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link SetAdExtensionsAssociationsRequest }
     */
    public SetAdExtensionsAssociationsRequest createSetAdExtensionsAssociationsRequest() {
        return new SetAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link SetAdExtensionsAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link SetAdExtensionsAssociationsResponse }
     */
    public SetAdExtensionsAssociationsResponse createSetAdExtensionsAssociationsResponse() {
        return new SetAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionsAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsAssociationsRequest }
     */
    public GetAdExtensionsAssociationsRequest createGetAdExtensionsAssociationsRequest() {
        return new GetAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionsAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionsAssociationsResponse }
     */
    public GetAdExtensionsAssociationsResponse createGetAdExtensionsAssociationsResponse() {
        return new GetAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionAssociationCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionAssociationCollection }
     */
    public ArrayOfAdExtensionAssociationCollection createArrayOfAdExtensionAssociationCollection() {
        return new ArrayOfAdExtensionAssociationCollection();
    }

    /**
     * Create an instance of {@link AdExtensionAssociationCollection }
     * 
     * @return
     *     the new instance of {@link AdExtensionAssociationCollection }
     */
    public AdExtensionAssociationCollection createAdExtensionAssociationCollection() {
        return new AdExtensionAssociationCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionAssociation }
     */
    public ArrayOfAdExtensionAssociation createArrayOfAdExtensionAssociation() {
        return new ArrayOfAdExtensionAssociation();
    }

    /**
     * Create an instance of {@link AdExtensionAssociation }
     * 
     * @return
     *     the new instance of {@link AdExtensionAssociation }
     */
    public AdExtensionAssociation createAdExtensionAssociation() {
        return new AdExtensionAssociation();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAdExtensionsAssociationsRequest }
     */
    public DeleteAdExtensionsAssociationsRequest createDeleteAdExtensionsAssociationsRequest() {
        return new DeleteAdExtensionsAssociationsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdExtensionsAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAdExtensionsAssociationsResponse }
     */
    public DeleteAdExtensionsAssociationsResponse createDeleteAdExtensionsAssociationsResponse() {
        return new DeleteAdExtensionsAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionIdsByAccountIdRequest }
     */
    public GetAdExtensionIdsByAccountIdRequest createGetAdExtensionIdsByAccountIdRequest() {
        return new GetAdExtensionIdsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetAdExtensionIdsByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAdExtensionIdsByAccountIdResponse }
     */
    public GetAdExtensionIdsByAccountIdResponse createGetAdExtensionIdsByAccountIdResponse() {
        return new GetAdExtensionIdsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link AddMediaRequest }
     * 
     * @return
     *     the new instance of {@link AddMediaRequest }
     */
    public AddMediaRequest createAddMediaRequest() {
        return new AddMediaRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMedia }
     * 
     * @return
     *     the new instance of {@link ArrayOfMedia }
     */
    public ArrayOfMedia createArrayOfMedia() {
        return new ArrayOfMedia();
    }

    /**
     * Create an instance of {@link Media }
     * 
     * @return
     *     the new instance of {@link Media }
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link Image }
     * 
     * @return
     *     the new instance of {@link Image }
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link AddMediaResponse }
     * 
     * @return
     *     the new instance of {@link AddMediaResponse }
     */
    public AddMediaResponse createAddMediaResponse() {
        return new AddMediaResponse();
    }

    /**
     * Create an instance of {@link DeleteMediaRequest }
     * 
     * @return
     *     the new instance of {@link DeleteMediaRequest }
     */
    public DeleteMediaRequest createDeleteMediaRequest() {
        return new DeleteMediaRequest();
    }

    /**
     * Create an instance of {@link DeleteMediaResponse }
     * 
     * @return
     *     the new instance of {@link DeleteMediaResponse }
     */
    public DeleteMediaResponse createDeleteMediaResponse() {
        return new DeleteMediaResponse();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetMediaMetaDataByAccountIdRequest }
     */
    public GetMediaMetaDataByAccountIdRequest createGetMediaMetaDataByAccountIdRequest() {
        return new GetMediaMetaDataByAccountIdRequest();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     * @return
     *     the new instance of {@link Paging }
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetMediaMetaDataByAccountIdResponse }
     */
    public GetMediaMetaDataByAccountIdResponse createGetMediaMetaDataByAccountIdResponse() {
        return new GetMediaMetaDataByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMediaMetaData }
     * 
     * @return
     *     the new instance of {@link ArrayOfMediaMetaData }
     */
    public ArrayOfMediaMetaData createArrayOfMediaMetaData() {
        return new ArrayOfMediaMetaData();
    }

    /**
     * Create an instance of {@link MediaMetaData }
     * 
     * @return
     *     the new instance of {@link MediaMetaData }
     */
    public MediaMetaData createMediaMetaData() {
        return new MediaMetaData();
    }

    /**
     * Create an instance of {@link ArrayOfMediaRepresentation }
     * 
     * @return
     *     the new instance of {@link ArrayOfMediaRepresentation }
     */
    public ArrayOfMediaRepresentation createArrayOfMediaRepresentation() {
        return new ArrayOfMediaRepresentation();
    }

    /**
     * Create an instance of {@link MediaRepresentation }
     * 
     * @return
     *     the new instance of {@link MediaRepresentation }
     */
    public MediaRepresentation createMediaRepresentation() {
        return new MediaRepresentation();
    }

    /**
     * Create an instance of {@link ImageMediaRepresentation }
     * 
     * @return
     *     the new instance of {@link ImageMediaRepresentation }
     */
    public ImageMediaRepresentation createImageMediaRepresentation() {
        return new ImageMediaRepresentation();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetMediaMetaDataByIdsRequest }
     */
    public GetMediaMetaDataByIdsRequest createGetMediaMetaDataByIdsRequest() {
        return new GetMediaMetaDataByIdsRequest();
    }

    /**
     * Create an instance of {@link GetMediaMetaDataByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetMediaMetaDataByIdsResponse }
     */
    public GetMediaMetaDataByIdsResponse createGetMediaMetaDataByIdsResponse() {
        return new GetMediaMetaDataByIdsResponse();
    }

    /**
     * Create an instance of {@link GetMediaAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link GetMediaAssociationsRequest }
     */
    public GetMediaAssociationsRequest createGetMediaAssociationsRequest() {
        return new GetMediaAssociationsRequest();
    }

    /**
     * Create an instance of {@link GetMediaAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link GetMediaAssociationsResponse }
     */
    public GetMediaAssociationsResponse createGetMediaAssociationsResponse() {
        return new GetMediaAssociationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfMediaAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfArrayOfMediaAssociation }
     */
    public ArrayOfArrayOfMediaAssociation createArrayOfArrayOfMediaAssociation() {
        return new ArrayOfArrayOfMediaAssociation();
    }

    /**
     * Create an instance of {@link ArrayOfMediaAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfMediaAssociation }
     */
    public ArrayOfMediaAssociation createArrayOfMediaAssociation() {
        return new ArrayOfMediaAssociation();
    }

    /**
     * Create an instance of {@link MediaAssociation }
     * 
     * @return
     *     the new instance of {@link MediaAssociation }
     */
    public MediaAssociation createMediaAssociation() {
        return new MediaAssociation();
    }

    /**
     * Create an instance of {@link GetAdGroupCriterionsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAdGroupCriterionsByIdsRequest }
     */
    public GetAdGroupCriterionsByIdsRequest createGetAdGroupCriterionsByIdsRequest() {
        return new GetAdGroupCriterionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAdGroupCriterionsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAdGroupCriterionsByIdsResponse }
     */
    public GetAdGroupCriterionsByIdsResponse createGetAdGroupCriterionsByIdsResponse() {
        return new GetAdGroupCriterionsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupCriterion }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroupCriterion }
     */
    public ArrayOfAdGroupCriterion createArrayOfAdGroupCriterion() {
        return new ArrayOfAdGroupCriterion();
    }

    /**
     * Create an instance of {@link AdGroupCriterion }
     * 
     * @return
     *     the new instance of {@link AdGroupCriterion }
     */
    public AdGroupCriterion createAdGroupCriterion() {
        return new AdGroupCriterion();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     * @return
     *     the new instance of {@link Criterion }
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link ProductPartition }
     * 
     * @return
     *     the new instance of {@link ProductPartition }
     */
    public ProductPartition createProductPartition() {
        return new ProductPartition();
    }

    /**
     * Create an instance of {@link ProductCondition }
     * 
     * @return
     *     the new instance of {@link ProductCondition }
     */
    public ProductCondition createProductCondition() {
        return new ProductCondition();
    }

    /**
     * Create an instance of {@link HotelGroup }
     * 
     * @return
     *     the new instance of {@link HotelGroup }
     */
    public HotelGroup createHotelGroup() {
        return new HotelGroup();
    }

    /**
     * Create an instance of {@link HotelListing }
     * 
     * @return
     *     the new instance of {@link HotelListing }
     */
    public HotelListing createHotelListing() {
        return new HotelListing();
    }

    /**
     * Create an instance of {@link HotelAdvanceBookingWindowCriterion }
     * 
     * @return
     *     the new instance of {@link HotelAdvanceBookingWindowCriterion }
     */
    public HotelAdvanceBookingWindowCriterion createHotelAdvanceBookingWindowCriterion() {
        return new HotelAdvanceBookingWindowCriterion();
    }

    /**
     * Create an instance of {@link HotelCheckInDateCriterion }
     * 
     * @return
     *     the new instance of {@link HotelCheckInDateCriterion }
     */
    public HotelCheckInDateCriterion createHotelCheckInDateCriterion() {
        return new HotelCheckInDateCriterion();
    }

    /**
     * Create an instance of {@link HotelCheckInDayCriterion }
     * 
     * @return
     *     the new instance of {@link HotelCheckInDayCriterion }
     */
    public HotelCheckInDayCriterion createHotelCheckInDayCriterion() {
        return new HotelCheckInDayCriterion();
    }

    /**
     * Create an instance of {@link HotelDateSelectionTypeCriterion }
     * 
     * @return
     *     the new instance of {@link HotelDateSelectionTypeCriterion }
     */
    public HotelDateSelectionTypeCriterion createHotelDateSelectionTypeCriterion() {
        return new HotelDateSelectionTypeCriterion();
    }

    /**
     * Create an instance of {@link HotelLengthOfStayCriterion }
     * 
     * @return
     *     the new instance of {@link HotelLengthOfStayCriterion }
     */
    public HotelLengthOfStayCriterion createHotelLengthOfStayCriterion() {
        return new HotelLengthOfStayCriterion();
    }

    /**
     * Create an instance of {@link ProductScope }
     * 
     * @return
     *     the new instance of {@link ProductScope }
     */
    public ProductScope createProductScope() {
        return new ProductScope();
    }

    /**
     * Create an instance of {@link ArrayOfProductCondition }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductCondition }
     */
    public ArrayOfProductCondition createArrayOfProductCondition() {
        return new ArrayOfProductCondition();
    }

    /**
     * Create an instance of {@link Webpage }
     * 
     * @return
     *     the new instance of {@link Webpage }
     */
    public Webpage createWebpage() {
        return new Webpage();
    }

    /**
     * Create an instance of {@link WebpageParameter }
     * 
     * @return
     *     the new instance of {@link WebpageParameter }
     */
    public WebpageParameter createWebpageParameter() {
        return new WebpageParameter();
    }

    /**
     * Create an instance of {@link ArrayOfWebpageCondition }
     * 
     * @return
     *     the new instance of {@link ArrayOfWebpageCondition }
     */
    public ArrayOfWebpageCondition createArrayOfWebpageCondition() {
        return new ArrayOfWebpageCondition();
    }

    /**
     * Create an instance of {@link WebpageCondition }
     * 
     * @return
     *     the new instance of {@link WebpageCondition }
     */
    public WebpageCondition createWebpageCondition() {
        return new WebpageCondition();
    }

    /**
     * Create an instance of {@link AgeCriterion }
     * 
     * @return
     *     the new instance of {@link AgeCriterion }
     */
    public AgeCriterion createAgeCriterion() {
        return new AgeCriterion();
    }

    /**
     * Create an instance of {@link DeviceCriterion }
     * 
     * @return
     *     the new instance of {@link DeviceCriterion }
     */
    public DeviceCriterion createDeviceCriterion() {
        return new DeviceCriterion();
    }

    /**
     * Create an instance of {@link DayTimeCriterion }
     * 
     * @return
     *     the new instance of {@link DayTimeCriterion }
     */
    public DayTimeCriterion createDayTimeCriterion() {
        return new DayTimeCriterion();
    }

    /**
     * Create an instance of {@link GenderCriterion }
     * 
     * @return
     *     the new instance of {@link GenderCriterion }
     */
    public GenderCriterion createGenderCriterion() {
        return new GenderCriterion();
    }

    /**
     * Create an instance of {@link RadiusCriterion }
     * 
     * @return
     *     the new instance of {@link RadiusCriterion }
     */
    public RadiusCriterion createRadiusCriterion() {
        return new RadiusCriterion();
    }

    /**
     * Create an instance of {@link LocationCriterion }
     * 
     * @return
     *     the new instance of {@link LocationCriterion }
     */
    public LocationCriterion createLocationCriterion() {
        return new LocationCriterion();
    }

    /**
     * Create an instance of {@link LocationIntentCriterion }
     * 
     * @return
     *     the new instance of {@link LocationIntentCriterion }
     */
    public LocationIntentCriterion createLocationIntentCriterion() {
        return new LocationIntentCriterion();
    }

    /**
     * Create an instance of {@link AudienceCriterion }
     * 
     * @return
     *     the new instance of {@link AudienceCriterion }
     */
    public AudienceCriterion createAudienceCriterion() {
        return new AudienceCriterion();
    }

    /**
     * Create an instance of {@link ProfileCriterion }
     * 
     * @return
     *     the new instance of {@link ProfileCriterion }
     */
    public ProfileCriterion createProfileCriterion() {
        return new ProfileCriterion();
    }

    /**
     * Create an instance of {@link StoreCriterion }
     * 
     * @return
     *     the new instance of {@link StoreCriterion }
     */
    public StoreCriterion createStoreCriterion() {
        return new StoreCriterion();
    }

    /**
     * Create an instance of {@link DealCriterion }
     * 
     * @return
     *     the new instance of {@link DealCriterion }
     */
    public DealCriterion createDealCriterion() {
        return new DealCriterion();
    }

    /**
     * Create an instance of {@link GenreCriterion }
     * 
     * @return
     *     the new instance of {@link GenreCriterion }
     */
    public GenreCriterion createGenreCriterion() {
        return new GenreCriterion();
    }

    /**
     * Create an instance of {@link BiddableAdGroupCriterion }
     * 
     * @return
     *     the new instance of {@link BiddableAdGroupCriterion }
     */
    public BiddableAdGroupCriterion createBiddableAdGroupCriterion() {
        return new BiddableAdGroupCriterion();
    }

    /**
     * Create an instance of {@link CriterionCashback }
     * 
     * @return
     *     the new instance of {@link CriterionCashback }
     */
    public CriterionCashback createCriterionCashback() {
        return new CriterionCashback();
    }

    /**
     * Create an instance of {@link CashbackAdjustment }
     * 
     * @return
     *     the new instance of {@link CashbackAdjustment }
     */
    public CashbackAdjustment createCashbackAdjustment() {
        return new CashbackAdjustment();
    }

    /**
     * Create an instance of {@link NegativeAdGroupCriterion }
     * 
     * @return
     *     the new instance of {@link NegativeAdGroupCriterion }
     */
    public NegativeAdGroupCriterion createNegativeAdGroupCriterion() {
        return new NegativeAdGroupCriterion();
    }

    /**
     * Create an instance of {@link AddAdGroupCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link AddAdGroupCriterionsRequest }
     */
    public AddAdGroupCriterionsRequest createAddAdGroupCriterionsRequest() {
        return new AddAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link AddAdGroupCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link AddAdGroupCriterionsResponse }
     */
    public AddAdGroupCriterionsResponse createAddAdGroupCriterionsResponse() {
        return new AddAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link UpdateAdGroupCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAdGroupCriterionsRequest }
     */
    public UpdateAdGroupCriterionsRequest createUpdateAdGroupCriterionsRequest() {
        return new UpdateAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link UpdateAdGroupCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAdGroupCriterionsResponse }
     */
    public UpdateAdGroupCriterionsResponse createUpdateAdGroupCriterionsResponse() {
        return new UpdateAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link DeleteAdGroupCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAdGroupCriterionsRequest }
     */
    public DeleteAdGroupCriterionsRequest createDeleteAdGroupCriterionsRequest() {
        return new DeleteAdGroupCriterionsRequest();
    }

    /**
     * Create an instance of {@link DeleteAdGroupCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAdGroupCriterionsResponse }
     */
    public DeleteAdGroupCriterionsResponse createDeleteAdGroupCriterionsResponse() {
        return new DeleteAdGroupCriterionsResponse();
    }

    /**
     * Create an instance of {@link ApplyProductPartitionActionsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyProductPartitionActionsRequest }
     */
    public ApplyProductPartitionActionsRequest createApplyProductPartitionActionsRequest() {
        return new ApplyProductPartitionActionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupCriterionAction }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroupCriterionAction }
     */
    public ArrayOfAdGroupCriterionAction createArrayOfAdGroupCriterionAction() {
        return new ArrayOfAdGroupCriterionAction();
    }

    /**
     * Create an instance of {@link AdGroupCriterionAction }
     * 
     * @return
     *     the new instance of {@link AdGroupCriterionAction }
     */
    public AdGroupCriterionAction createAdGroupCriterionAction() {
        return new AdGroupCriterionAction();
    }

    /**
     * Create an instance of {@link ApplyProductPartitionActionsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyProductPartitionActionsResponse }
     */
    public ApplyProductPartitionActionsResponse createApplyProductPartitionActionsResponse() {
        return new ApplyProductPartitionActionsResponse();
    }

    /**
     * Create an instance of {@link ApplyHotelGroupActionsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyHotelGroupActionsRequest }
     */
    public ApplyHotelGroupActionsRequest createApplyHotelGroupActionsRequest() {
        return new ApplyHotelGroupActionsRequest();
    }

    /**
     * Create an instance of {@link ApplyHotelGroupActionsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyHotelGroupActionsResponse }
     */
    public ApplyHotelGroupActionsResponse createApplyHotelGroupActionsResponse() {
        return new ApplyHotelGroupActionsResponse();
    }

    /**
     * Create an instance of {@link ApplyAssetGroupListingGroupActionsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyAssetGroupListingGroupActionsRequest }
     */
    public ApplyAssetGroupListingGroupActionsRequest createApplyAssetGroupListingGroupActionsRequest() {
        return new ApplyAssetGroupListingGroupActionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupListingGroupAction }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupListingGroupAction }
     */
    public ArrayOfAssetGroupListingGroupAction createArrayOfAssetGroupListingGroupAction() {
        return new ArrayOfAssetGroupListingGroupAction();
    }

    /**
     * Create an instance of {@link AssetGroupListingGroupAction }
     * 
     * @return
     *     the new instance of {@link AssetGroupListingGroupAction }
     */
    public AssetGroupListingGroupAction createAssetGroupListingGroupAction() {
        return new AssetGroupListingGroupAction();
    }

    /**
     * Create an instance of {@link AssetGroupListingGroup }
     * 
     * @return
     *     the new instance of {@link AssetGroupListingGroup }
     */
    public AssetGroupListingGroup createAssetGroupListingGroup() {
        return new AssetGroupListingGroup();
    }

    /**
     * Create an instance of {@link ApplyAssetGroupListingGroupActionsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyAssetGroupListingGroupActionsResponse }
     */
    public ApplyAssetGroupListingGroupActionsResponse createApplyAssetGroupListingGroupActionsResponse() {
        return new ApplyAssetGroupListingGroupActionsResponse();
    }

    /**
     * Create an instance of {@link GetAssetGroupListingGroupsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupListingGroupsByIdsRequest }
     */
    public GetAssetGroupListingGroupsByIdsRequest createGetAssetGroupListingGroupsByIdsRequest() {
        return new GetAssetGroupListingGroupsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAssetGroupListingGroupsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupListingGroupsByIdsResponse }
     */
    public GetAssetGroupListingGroupsByIdsResponse createGetAssetGroupListingGroupsByIdsResponse() {
        return new GetAssetGroupListingGroupsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupListingGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupListingGroup }
     */
    public ArrayOfAssetGroupListingGroup createArrayOfAssetGroupListingGroup() {
        return new ArrayOfAssetGroupListingGroup();
    }

    /**
     * Create an instance of {@link GetBMCStoresByCustomerIdRequest }
     * 
     * @return
     *     the new instance of {@link GetBMCStoresByCustomerIdRequest }
     */
    public GetBMCStoresByCustomerIdRequest createGetBMCStoresByCustomerIdRequest() {
        return new GetBMCStoresByCustomerIdRequest();
    }

    /**
     * Create an instance of {@link GetBMCStoresByCustomerIdResponse }
     * 
     * @return
     *     the new instance of {@link GetBMCStoresByCustomerIdResponse }
     */
    public GetBMCStoresByCustomerIdResponse createGetBMCStoresByCustomerIdResponse() {
        return new GetBMCStoresByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBMCStore }
     * 
     * @return
     *     the new instance of {@link ArrayOfBMCStore }
     */
    public ArrayOfBMCStore createArrayOfBMCStore() {
        return new ArrayOfBMCStore();
    }

    /**
     * Create an instance of {@link BMCStore }
     * 
     * @return
     *     the new instance of {@link BMCStore }
     */
    public BMCStore createBMCStore() {
        return new BMCStore();
    }

    /**
     * Create an instance of {@link AddNegativeKeywordsToEntitiesRequest }
     * 
     * @return
     *     the new instance of {@link AddNegativeKeywordsToEntitiesRequest }
     */
    public AddNegativeKeywordsToEntitiesRequest createAddNegativeKeywordsToEntitiesRequest() {
        return new AddNegativeKeywordsToEntitiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEntityNegativeKeyword }
     * 
     * @return
     *     the new instance of {@link ArrayOfEntityNegativeKeyword }
     */
    public ArrayOfEntityNegativeKeyword createArrayOfEntityNegativeKeyword() {
        return new ArrayOfEntityNegativeKeyword();
    }

    /**
     * Create an instance of {@link EntityNegativeKeyword }
     * 
     * @return
     *     the new instance of {@link EntityNegativeKeyword }
     */
    public EntityNegativeKeyword createEntityNegativeKeyword() {
        return new EntityNegativeKeyword();
    }

    /**
     * Create an instance of {@link ArrayOfNegativeKeyword }
     * 
     * @return
     *     the new instance of {@link ArrayOfNegativeKeyword }
     */
    public ArrayOfNegativeKeyword createArrayOfNegativeKeyword() {
        return new ArrayOfNegativeKeyword();
    }

    /**
     * Create an instance of {@link NegativeKeyword }
     * 
     * @return
     *     the new instance of {@link NegativeKeyword }
     */
    public NegativeKeyword createNegativeKeyword() {
        return new NegativeKeyword();
    }

    /**
     * Create an instance of {@link SharedListItem }
     * 
     * @return
     *     the new instance of {@link SharedListItem }
     */
    public SharedListItem createSharedListItem() {
        return new SharedListItem();
    }

    /**
     * Create an instance of {@link NegativeSite }
     * 
     * @return
     *     the new instance of {@link NegativeSite }
     */
    public NegativeSite createNegativeSite() {
        return new NegativeSite();
    }

    /**
     * Create an instance of {@link BrandItem }
     * 
     * @return
     *     the new instance of {@link BrandItem }
     */
    public BrandItem createBrandItem() {
        return new BrandItem();
    }

    /**
     * Create an instance of {@link AddNegativeKeywordsToEntitiesResponse }
     * 
     * @return
     *     the new instance of {@link AddNegativeKeywordsToEntitiesResponse }
     */
    public AddNegativeKeywordsToEntitiesResponse createAddNegativeKeywordsToEntitiesResponse() {
        return new AddNegativeKeywordsToEntitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIdCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfIdCollection }
     */
    public ArrayOfIdCollection createArrayOfIdCollection() {
        return new ArrayOfIdCollection();
    }

    /**
     * Create an instance of {@link IdCollection }
     * 
     * @return
     *     the new instance of {@link IdCollection }
     */
    public IdCollection createIdCollection() {
        return new IdCollection();
    }

    /**
     * Create an instance of {@link GetNegativeKeywordsByEntityIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetNegativeKeywordsByEntityIdsRequest }
     */
    public GetNegativeKeywordsByEntityIdsRequest createGetNegativeKeywordsByEntityIdsRequest() {
        return new GetNegativeKeywordsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link GetNegativeKeywordsByEntityIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetNegativeKeywordsByEntityIdsResponse }
     */
    public GetNegativeKeywordsByEntityIdsResponse createGetNegativeKeywordsByEntityIdsResponse() {
        return new GetNegativeKeywordsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteNegativeKeywordsFromEntitiesRequest }
     * 
     * @return
     *     the new instance of {@link DeleteNegativeKeywordsFromEntitiesRequest }
     */
    public DeleteNegativeKeywordsFromEntitiesRequest createDeleteNegativeKeywordsFromEntitiesRequest() {
        return new DeleteNegativeKeywordsFromEntitiesRequest();
    }

    /**
     * Create an instance of {@link DeleteNegativeKeywordsFromEntitiesResponse }
     * 
     * @return
     *     the new instance of {@link DeleteNegativeKeywordsFromEntitiesResponse }
     */
    public DeleteNegativeKeywordsFromEntitiesResponse createDeleteNegativeKeywordsFromEntitiesResponse() {
        return new DeleteNegativeKeywordsFromEntitiesResponse();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetSharedEntitiesByAccountIdRequest }
     */
    public GetSharedEntitiesByAccountIdRequest createGetSharedEntitiesByAccountIdRequest() {
        return new GetSharedEntitiesByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetSharedEntitiesByAccountIdResponse }
     */
    public GetSharedEntitiesByAccountIdResponse createGetSharedEntitiesByAccountIdResponse() {
        return new GetSharedEntitiesByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSharedEntity }
     * 
     * @return
     *     the new instance of {@link ArrayOfSharedEntity }
     */
    public ArrayOfSharedEntity createArrayOfSharedEntity() {
        return new ArrayOfSharedEntity();
    }

    /**
     * Create an instance of {@link SharedEntity }
     * 
     * @return
     *     the new instance of {@link SharedEntity }
     */
    public SharedEntity createSharedEntity() {
        return new SharedEntity();
    }

    /**
     * Create an instance of {@link SharedList }
     * 
     * @return
     *     the new instance of {@link SharedList }
     */
    public SharedList createSharedList() {
        return new SharedList();
    }

    /**
     * Create an instance of {@link NegativeKeywordList }
     * 
     * @return
     *     the new instance of {@link NegativeKeywordList }
     */
    public NegativeKeywordList createNegativeKeywordList() {
        return new NegativeKeywordList();
    }

    /**
     * Create an instance of {@link PlacementExclusionList }
     * 
     * @return
     *     the new instance of {@link PlacementExclusionList }
     */
    public PlacementExclusionList createPlacementExclusionList() {
        return new PlacementExclusionList();
    }

    /**
     * Create an instance of {@link AccountNegativeKeywordList }
     * 
     * @return
     *     the new instance of {@link AccountNegativeKeywordList }
     */
    public AccountNegativeKeywordList createAccountNegativeKeywordList() {
        return new AccountNegativeKeywordList();
    }

    /**
     * Create an instance of {@link BrandList }
     * 
     * @return
     *     the new instance of {@link BrandList }
     */
    public BrandList createBrandList() {
        return new BrandList();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesRequest }
     * 
     * @return
     *     the new instance of {@link GetSharedEntitiesRequest }
     */
    public GetSharedEntitiesRequest createGetSharedEntitiesRequest() {
        return new GetSharedEntitiesRequest();
    }

    /**
     * Create an instance of {@link GetSharedEntitiesResponse }
     * 
     * @return
     *     the new instance of {@link GetSharedEntitiesResponse }
     */
    public GetSharedEntitiesResponse createGetSharedEntitiesResponse() {
        return new GetSharedEntitiesResponse();
    }

    /**
     * Create an instance of {@link AddSharedEntityRequest }
     * 
     * @return
     *     the new instance of {@link AddSharedEntityRequest }
     */
    public AddSharedEntityRequest createAddSharedEntityRequest() {
        return new AddSharedEntityRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSharedListItem }
     * 
     * @return
     *     the new instance of {@link ArrayOfSharedListItem }
     */
    public ArrayOfSharedListItem createArrayOfSharedListItem() {
        return new ArrayOfSharedListItem();
    }

    /**
     * Create an instance of {@link AddSharedEntityResponse }
     * 
     * @return
     *     the new instance of {@link AddSharedEntityResponse }
     */
    public AddSharedEntityResponse createAddSharedEntityResponse() {
        return new AddSharedEntityResponse();
    }

    /**
     * Create an instance of {@link GetListItemsBySharedListRequest }
     * 
     * @return
     *     the new instance of {@link GetListItemsBySharedListRequest }
     */
    public GetListItemsBySharedListRequest createGetListItemsBySharedListRequest() {
        return new GetListItemsBySharedListRequest();
    }

    /**
     * Create an instance of {@link GetListItemsBySharedListResponse }
     * 
     * @return
     *     the new instance of {@link GetListItemsBySharedListResponse }
     */
    public GetListItemsBySharedListResponse createGetListItemsBySharedListResponse() {
        return new GetListItemsBySharedListResponse();
    }

    /**
     * Create an instance of {@link AddListItemsToSharedListRequest }
     * 
     * @return
     *     the new instance of {@link AddListItemsToSharedListRequest }
     */
    public AddListItemsToSharedListRequest createAddListItemsToSharedListRequest() {
        return new AddListItemsToSharedListRequest();
    }

    /**
     * Create an instance of {@link AddListItemsToSharedListResponse }
     * 
     * @return
     *     the new instance of {@link AddListItemsToSharedListResponse }
     */
    public AddListItemsToSharedListResponse createAddListItemsToSharedListResponse() {
        return new AddListItemsToSharedListResponse();
    }

    /**
     * Create an instance of {@link UpdateSharedEntitiesRequest }
     * 
     * @return
     *     the new instance of {@link UpdateSharedEntitiesRequest }
     */
    public UpdateSharedEntitiesRequest createUpdateSharedEntitiesRequest() {
        return new UpdateSharedEntitiesRequest();
    }

    /**
     * Create an instance of {@link UpdateSharedEntitiesResponse }
     * 
     * @return
     *     the new instance of {@link UpdateSharedEntitiesResponse }
     */
    public UpdateSharedEntitiesResponse createUpdateSharedEntitiesResponse() {
        return new UpdateSharedEntitiesResponse();
    }

    /**
     * Create an instance of {@link DeleteListItemsFromSharedListRequest }
     * 
     * @return
     *     the new instance of {@link DeleteListItemsFromSharedListRequest }
     */
    public DeleteListItemsFromSharedListRequest createDeleteListItemsFromSharedListRequest() {
        return new DeleteListItemsFromSharedListRequest();
    }

    /**
     * Create an instance of {@link DeleteListItemsFromSharedListResponse }
     * 
     * @return
     *     the new instance of {@link DeleteListItemsFromSharedListResponse }
     */
    public DeleteListItemsFromSharedListResponse createDeleteListItemsFromSharedListResponse() {
        return new DeleteListItemsFromSharedListResponse();
    }

    /**
     * Create an instance of {@link SetSharedEntityAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link SetSharedEntityAssociationsRequest }
     */
    public SetSharedEntityAssociationsRequest createSetSharedEntityAssociationsRequest() {
        return new SetSharedEntityAssociationsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSharedEntityAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfSharedEntityAssociation }
     */
    public ArrayOfSharedEntityAssociation createArrayOfSharedEntityAssociation() {
        return new ArrayOfSharedEntityAssociation();
    }

    /**
     * Create an instance of {@link SharedEntityAssociation }
     * 
     * @return
     *     the new instance of {@link SharedEntityAssociation }
     */
    public SharedEntityAssociation createSharedEntityAssociation() {
        return new SharedEntityAssociation();
    }

    /**
     * Create an instance of {@link SetSharedEntityAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link SetSharedEntityAssociationsResponse }
     */
    public SetSharedEntityAssociationsResponse createSetSharedEntityAssociationsResponse() {
        return new SetSharedEntityAssociationsResponse();
    }

    /**
     * Create an instance of {@link DeleteSharedEntityAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteSharedEntityAssociationsRequest }
     */
    public DeleteSharedEntityAssociationsRequest createDeleteSharedEntityAssociationsRequest() {
        return new DeleteSharedEntityAssociationsRequest();
    }

    /**
     * Create an instance of {@link DeleteSharedEntityAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteSharedEntityAssociationsResponse }
     */
    public DeleteSharedEntityAssociationsResponse createDeleteSharedEntityAssociationsResponse() {
        return new DeleteSharedEntityAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsBySharedEntityIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetSharedEntityAssociationsBySharedEntityIdsRequest }
     */
    public GetSharedEntityAssociationsBySharedEntityIdsRequest createGetSharedEntityAssociationsBySharedEntityIdsRequest() {
        return new GetSharedEntityAssociationsBySharedEntityIdsRequest();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsBySharedEntityIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetSharedEntityAssociationsBySharedEntityIdsResponse }
     */
    public GetSharedEntityAssociationsBySharedEntityIdsResponse createGetSharedEntityAssociationsBySharedEntityIdsResponse() {
        return new GetSharedEntityAssociationsBySharedEntityIdsResponse();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetSharedEntityAssociationsByEntityIdsRequest }
     */
    public GetSharedEntityAssociationsByEntityIdsRequest createGetSharedEntityAssociationsByEntityIdsRequest() {
        return new GetSharedEntityAssociationsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link GetSharedEntityAssociationsByEntityIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetSharedEntityAssociationsByEntityIdsResponse }
     */
    public GetSharedEntityAssociationsByEntityIdsResponse createGetSharedEntityAssociationsByEntityIdsResponse() {
        return new GetSharedEntityAssociationsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteSharedEntitiesRequest }
     * 
     * @return
     *     the new instance of {@link DeleteSharedEntitiesRequest }
     */
    public DeleteSharedEntitiesRequest createDeleteSharedEntitiesRequest() {
        return new DeleteSharedEntitiesRequest();
    }

    /**
     * Create an instance of {@link DeleteSharedEntitiesResponse }
     * 
     * @return
     *     the new instance of {@link DeleteSharedEntitiesResponse }
     */
    public DeleteSharedEntitiesResponse createDeleteSharedEntitiesResponse() {
        return new DeleteSharedEntitiesResponse();
    }

    /**
     * Create an instance of {@link GetCampaignSizesByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignSizesByAccountIdRequest }
     */
    public GetCampaignSizesByAccountIdRequest createGetCampaignSizesByAccountIdRequest() {
        return new GetCampaignSizesByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetCampaignSizesByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignSizesByAccountIdResponse }
     */
    public GetCampaignSizesByAccountIdResponse createGetCampaignSizesByAccountIdResponse() {
        return new GetCampaignSizesByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignSize }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignSize }
     */
    public ArrayOfCampaignSize createArrayOfCampaignSize() {
        return new ArrayOfCampaignSize();
    }

    /**
     * Create an instance of {@link CampaignSize }
     * 
     * @return
     *     the new instance of {@link CampaignSize }
     */
    public CampaignSize createCampaignSize() {
        return new CampaignSize();
    }

    /**
     * Create an instance of {@link AddCampaignCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link AddCampaignCriterionsRequest }
     */
    public AddCampaignCriterionsRequest createAddCampaignCriterionsRequest() {
        return new AddCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignCriterion }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignCriterion }
     */
    public ArrayOfCampaignCriterion createArrayOfCampaignCriterion() {
        return new ArrayOfCampaignCriterion();
    }

    /**
     * Create an instance of {@link CampaignCriterion }
     * 
     * @return
     *     the new instance of {@link CampaignCriterion }
     */
    public CampaignCriterion createCampaignCriterion() {
        return new CampaignCriterion();
    }

    /**
     * Create an instance of {@link NegativeCampaignCriterion }
     * 
     * @return
     *     the new instance of {@link NegativeCampaignCriterion }
     */
    public NegativeCampaignCriterion createNegativeCampaignCriterion() {
        return new NegativeCampaignCriterion();
    }

    /**
     * Create an instance of {@link BiddableCampaignCriterion }
     * 
     * @return
     *     the new instance of {@link BiddableCampaignCriterion }
     */
    public BiddableCampaignCriterion createBiddableCampaignCriterion() {
        return new BiddableCampaignCriterion();
    }

    /**
     * Create an instance of {@link AddCampaignCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link AddCampaignCriterionsResponse }
     */
    public AddCampaignCriterionsResponse createAddCampaignCriterionsResponse() {
        return new AddCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaignCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateCampaignCriterionsRequest }
     */
    public UpdateCampaignCriterionsRequest createUpdateCampaignCriterionsRequest() {
        return new UpdateCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link UpdateCampaignCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateCampaignCriterionsResponse }
     */
    public UpdateCampaignCriterionsResponse createUpdateCampaignCriterionsResponse() {
        return new UpdateCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link DeleteCampaignCriterionsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignCriterionsRequest }
     */
    public DeleteCampaignCriterionsRequest createDeleteCampaignCriterionsRequest() {
        return new DeleteCampaignCriterionsRequest();
    }

    /**
     * Create an instance of {@link DeleteCampaignCriterionsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignCriterionsResponse }
     */
    public DeleteCampaignCriterionsResponse createDeleteCampaignCriterionsResponse() {
        return new DeleteCampaignCriterionsResponse();
    }

    /**
     * Create an instance of {@link GetCampaignCriterionsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignCriterionsByIdsRequest }
     */
    public GetCampaignCriterionsByIdsRequest createGetCampaignCriterionsByIdsRequest() {
        return new GetCampaignCriterionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetCampaignCriterionsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignCriterionsByIdsResponse }
     */
    public GetCampaignCriterionsByIdsResponse createGetCampaignCriterionsByIdsResponse() {
        return new GetCampaignCriterionsByIdsResponse();
    }

    /**
     * Create an instance of {@link AddBudgetsRequest }
     * 
     * @return
     *     the new instance of {@link AddBudgetsRequest }
     */
    public AddBudgetsRequest createAddBudgetsRequest() {
        return new AddBudgetsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBudget }
     * 
     * @return
     *     the new instance of {@link ArrayOfBudget }
     */
    public ArrayOfBudget createArrayOfBudget() {
        return new ArrayOfBudget();
    }

    /**
     * Create an instance of {@link Budget }
     * 
     * @return
     *     the new instance of {@link Budget }
     */
    public Budget createBudget() {
        return new Budget();
    }

    /**
     * Create an instance of {@link AddBudgetsResponse }
     * 
     * @return
     *     the new instance of {@link AddBudgetsResponse }
     */
    public AddBudgetsResponse createAddBudgetsResponse() {
        return new AddBudgetsResponse();
    }

    /**
     * Create an instance of {@link UpdateBudgetsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateBudgetsRequest }
     */
    public UpdateBudgetsRequest createUpdateBudgetsRequest() {
        return new UpdateBudgetsRequest();
    }

    /**
     * Create an instance of {@link UpdateBudgetsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateBudgetsResponse }
     */
    public UpdateBudgetsResponse createUpdateBudgetsResponse() {
        return new UpdateBudgetsResponse();
    }

    /**
     * Create an instance of {@link DeleteBudgetsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteBudgetsRequest }
     */
    public DeleteBudgetsRequest createDeleteBudgetsRequest() {
        return new DeleteBudgetsRequest();
    }

    /**
     * Create an instance of {@link DeleteBudgetsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteBudgetsResponse }
     */
    public DeleteBudgetsResponse createDeleteBudgetsResponse() {
        return new DeleteBudgetsResponse();
    }

    /**
     * Create an instance of {@link GetBudgetsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetBudgetsByIdsRequest }
     */
    public GetBudgetsByIdsRequest createGetBudgetsByIdsRequest() {
        return new GetBudgetsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetBudgetsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetBudgetsByIdsResponse }
     */
    public GetBudgetsByIdsResponse createGetBudgetsByIdsResponse() {
        return new GetBudgetsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBudgetIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignIdsByBudgetIdsRequest }
     */
    public GetCampaignIdsByBudgetIdsRequest createGetCampaignIdsByBudgetIdsRequest() {
        return new GetCampaignIdsByBudgetIdsRequest();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBudgetIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignIdsByBudgetIdsResponse }
     */
    public GetCampaignIdsByBudgetIdsResponse createGetCampaignIdsByBudgetIdsResponse() {
        return new GetCampaignIdsByBudgetIdsResponse();
    }

    /**
     * Create an instance of {@link AddBidStrategiesRequest }
     * 
     * @return
     *     the new instance of {@link AddBidStrategiesRequest }
     */
    public AddBidStrategiesRequest createAddBidStrategiesRequest() {
        return new AddBidStrategiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBidStrategy }
     * 
     * @return
     *     the new instance of {@link ArrayOfBidStrategy }
     */
    public ArrayOfBidStrategy createArrayOfBidStrategy() {
        return new ArrayOfBidStrategy();
    }

    /**
     * Create an instance of {@link BidStrategy }
     * 
     * @return
     *     the new instance of {@link BidStrategy }
     */
    public BidStrategy createBidStrategy() {
        return new BidStrategy();
    }

    /**
     * Create an instance of {@link AddBidStrategiesResponse }
     * 
     * @return
     *     the new instance of {@link AddBidStrategiesResponse }
     */
    public AddBidStrategiesResponse createAddBidStrategiesResponse() {
        return new AddBidStrategiesResponse();
    }

    /**
     * Create an instance of {@link UpdateBidStrategiesRequest }
     * 
     * @return
     *     the new instance of {@link UpdateBidStrategiesRequest }
     */
    public UpdateBidStrategiesRequest createUpdateBidStrategiesRequest() {
        return new UpdateBidStrategiesRequest();
    }

    /**
     * Create an instance of {@link UpdateBidStrategiesResponse }
     * 
     * @return
     *     the new instance of {@link UpdateBidStrategiesResponse }
     */
    public UpdateBidStrategiesResponse createUpdateBidStrategiesResponse() {
        return new UpdateBidStrategiesResponse();
    }

    /**
     * Create an instance of {@link DeleteBidStrategiesRequest }
     * 
     * @return
     *     the new instance of {@link DeleteBidStrategiesRequest }
     */
    public DeleteBidStrategiesRequest createDeleteBidStrategiesRequest() {
        return new DeleteBidStrategiesRequest();
    }

    /**
     * Create an instance of {@link DeleteBidStrategiesResponse }
     * 
     * @return
     *     the new instance of {@link DeleteBidStrategiesResponse }
     */
    public DeleteBidStrategiesResponse createDeleteBidStrategiesResponse() {
        return new DeleteBidStrategiesResponse();
    }

    /**
     * Create an instance of {@link GetBidStrategiesByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetBidStrategiesByIdsRequest }
     */
    public GetBidStrategiesByIdsRequest createGetBidStrategiesByIdsRequest() {
        return new GetBidStrategiesByIdsRequest();
    }

    /**
     * Create an instance of {@link GetBidStrategiesByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetBidStrategiesByIdsResponse }
     */
    public GetBidStrategiesByIdsResponse createGetBidStrategiesByIdsResponse() {
        return new GetBidStrategiesByIdsResponse();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBidStrategyIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetCampaignIdsByBidStrategyIdsRequest }
     */
    public GetCampaignIdsByBidStrategyIdsRequest createGetCampaignIdsByBidStrategyIdsRequest() {
        return new GetCampaignIdsByBidStrategyIdsRequest();
    }

    /**
     * Create an instance of {@link GetCampaignIdsByBidStrategyIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetCampaignIdsByBidStrategyIdsResponse }
     */
    public GetCampaignIdsByBidStrategyIdsResponse createGetCampaignIdsByBidStrategyIdsResponse() {
        return new GetCampaignIdsByBidStrategyIdsResponse();
    }

    /**
     * Create an instance of {@link AddAudienceGroupsRequest }
     * 
     * @return
     *     the new instance of {@link AddAudienceGroupsRequest }
     */
    public AddAudienceGroupsRequest createAddAudienceGroupsRequest() {
        return new AddAudienceGroupsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAudienceGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudienceGroup }
     */
    public ArrayOfAudienceGroup createArrayOfAudienceGroup() {
        return new ArrayOfAudienceGroup();
    }

    /**
     * Create an instance of {@link AudienceGroup }
     * 
     * @return
     *     the new instance of {@link AudienceGroup }
     */
    public AudienceGroup createAudienceGroup() {
        return new AudienceGroup();
    }

    /**
     * Create an instance of {@link ArrayOfAudienceGroupDimension }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudienceGroupDimension }
     */
    public ArrayOfAudienceGroupDimension createArrayOfAudienceGroupDimension() {
        return new ArrayOfAudienceGroupDimension();
    }

    /**
     * Create an instance of {@link AudienceGroupDimension }
     * 
     * @return
     *     the new instance of {@link AudienceGroupDimension }
     */
    public AudienceGroupDimension createAudienceGroupDimension() {
        return new AudienceGroupDimension();
    }

    /**
     * Create an instance of {@link AgeDimension }
     * 
     * @return
     *     the new instance of {@link AgeDimension }
     */
    public AgeDimension createAgeDimension() {
        return new AgeDimension();
    }

    /**
     * Create an instance of {@link ArrayOfAgeRange }
     * 
     * @return
     *     the new instance of {@link ArrayOfAgeRange }
     */
    public ArrayOfAgeRange createArrayOfAgeRange() {
        return new ArrayOfAgeRange();
    }

    /**
     * Create an instance of {@link GenderDimension }
     * 
     * @return
     *     the new instance of {@link GenderDimension }
     */
    public GenderDimension createGenderDimension() {
        return new GenderDimension();
    }

    /**
     * Create an instance of {@link ArrayOfGenderType }
     * 
     * @return
     *     the new instance of {@link ArrayOfGenderType }
     */
    public ArrayOfGenderType createArrayOfGenderType() {
        return new ArrayOfGenderType();
    }

    /**
     * Create an instance of {@link AudienceDimension }
     * 
     * @return
     *     the new instance of {@link AudienceDimension }
     */
    public AudienceDimension createAudienceDimension() {
        return new AudienceDimension();
    }

    /**
     * Create an instance of {@link ArrayOfAudienceInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudienceInfo }
     */
    public ArrayOfAudienceInfo createArrayOfAudienceInfo() {
        return new ArrayOfAudienceInfo();
    }

    /**
     * Create an instance of {@link AudienceInfo }
     * 
     * @return
     *     the new instance of {@link AudienceInfo }
     */
    public AudienceInfo createAudienceInfo() {
        return new AudienceInfo();
    }

    /**
     * Create an instance of {@link AddAudienceGroupsResponse }
     * 
     * @return
     *     the new instance of {@link AddAudienceGroupsResponse }
     */
    public AddAudienceGroupsResponse createAddAudienceGroupsResponse() {
        return new AddAudienceGroupsResponse();
    }

    /**
     * Create an instance of {@link UpdateAudienceGroupsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAudienceGroupsRequest }
     */
    public UpdateAudienceGroupsRequest createUpdateAudienceGroupsRequest() {
        return new UpdateAudienceGroupsRequest();
    }

    /**
     * Create an instance of {@link UpdateAudienceGroupsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAudienceGroupsResponse }
     */
    public UpdateAudienceGroupsResponse createUpdateAudienceGroupsResponse() {
        return new UpdateAudienceGroupsResponse();
    }

    /**
     * Create an instance of {@link DeleteAudienceGroupsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAudienceGroupsRequest }
     */
    public DeleteAudienceGroupsRequest createDeleteAudienceGroupsRequest() {
        return new DeleteAudienceGroupsRequest();
    }

    /**
     * Create an instance of {@link DeleteAudienceGroupsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAudienceGroupsResponse }
     */
    public DeleteAudienceGroupsResponse createDeleteAudienceGroupsResponse() {
        return new DeleteAudienceGroupsResponse();
    }

    /**
     * Create an instance of {@link GetAudienceGroupsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupsByIdsRequest }
     */
    public GetAudienceGroupsByIdsRequest createGetAudienceGroupsByIdsRequest() {
        return new GetAudienceGroupsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAudienceGroupsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupsByIdsResponse }
     */
    public GetAudienceGroupsByIdsResponse createGetAudienceGroupsByIdsResponse() {
        return new GetAudienceGroupsByIdsResponse();
    }

    /**
     * Create an instance of {@link AddAssetGroupsRequest }
     * 
     * @return
     *     the new instance of {@link AddAssetGroupsRequest }
     */
    public AddAssetGroupsRequest createAddAssetGroupsRequest() {
        return new AddAssetGroupsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroup }
     */
    public ArrayOfAssetGroup createArrayOfAssetGroup() {
        return new ArrayOfAssetGroup();
    }

    /**
     * Create an instance of {@link AssetGroup }
     * 
     * @return
     *     the new instance of {@link AssetGroup }
     */
    public AssetGroup createAssetGroup() {
        return new AssetGroup();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupSearchTheme }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupSearchTheme }
     */
    public ArrayOfAssetGroupSearchTheme createArrayOfAssetGroupSearchTheme() {
        return new ArrayOfAssetGroupSearchTheme();
    }

    /**
     * Create an instance of {@link AssetGroupSearchTheme }
     * 
     * @return
     *     the new instance of {@link AssetGroupSearchTheme }
     */
    public AssetGroupSearchTheme createAssetGroupSearchTheme() {
        return new AssetGroupSearchTheme();
    }

    /**
     * Create an instance of {@link AddAssetGroupsResponse }
     * 
     * @return
     *     the new instance of {@link AddAssetGroupsResponse }
     */
    public AddAssetGroupsResponse createAddAssetGroupsResponse() {
        return new AddAssetGroupsResponse();
    }

    /**
     * Create an instance of {@link UpdateAssetGroupsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAssetGroupsRequest }
     */
    public UpdateAssetGroupsRequest createUpdateAssetGroupsRequest() {
        return new UpdateAssetGroupsRequest();
    }

    /**
     * Create an instance of {@link UpdateAssetGroupsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAssetGroupsResponse }
     */
    public UpdateAssetGroupsResponse createUpdateAssetGroupsResponse() {
        return new UpdateAssetGroupsResponse();
    }

    /**
     * Create an instance of {@link DeleteAssetGroupsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAssetGroupsRequest }
     */
    public DeleteAssetGroupsRequest createDeleteAssetGroupsRequest() {
        return new DeleteAssetGroupsRequest();
    }

    /**
     * Create an instance of {@link DeleteAssetGroupsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAssetGroupsResponse }
     */
    public DeleteAssetGroupsResponse createDeleteAssetGroupsResponse() {
        return new DeleteAssetGroupsResponse();
    }

    /**
     * Create an instance of {@link GetAssetGroupsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsByIdsRequest }
     */
    public GetAssetGroupsByIdsRequest createGetAssetGroupsByIdsRequest() {
        return new GetAssetGroupsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAssetGroupsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsByIdsResponse }
     */
    public GetAssetGroupsByIdsResponse createGetAssetGroupsByIdsResponse() {
        return new GetAssetGroupsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetAssetGroupsByCampaignIdRequest }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsByCampaignIdRequest }
     */
    public GetAssetGroupsByCampaignIdRequest createGetAssetGroupsByCampaignIdRequest() {
        return new GetAssetGroupsByCampaignIdRequest();
    }

    /**
     * Create an instance of {@link GetAssetGroupsByCampaignIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsByCampaignIdResponse }
     */
    public GetAssetGroupsByCampaignIdResponse createGetAssetGroupsByCampaignIdResponse() {
        return new GetAssetGroupsByCampaignIdResponse();
    }

    /**
     * Create an instance of {@link GetAssetGroupsEditorialReasonsRequest }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsEditorialReasonsRequest }
     */
    public GetAssetGroupsEditorialReasonsRequest createGetAssetGroupsEditorialReasonsRequest() {
        return new GetAssetGroupsEditorialReasonsRequest();
    }

    /**
     * Create an instance of {@link GetAssetGroupsEditorialReasonsResponse }
     * 
     * @return
     *     the new instance of {@link GetAssetGroupsEditorialReasonsResponse }
     */
    public GetAssetGroupsEditorialReasonsResponse createGetAssetGroupsEditorialReasonsResponse() {
        return new GetAssetGroupsEditorialReasonsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupEditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupEditorialReasonCollection }
     */
    public ArrayOfAssetGroupEditorialReasonCollection createArrayOfAssetGroupEditorialReasonCollection() {
        return new ArrayOfAssetGroupEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link AssetGroupEditorialReasonCollection }
     * 
     * @return
     *     the new instance of {@link AssetGroupEditorialReasonCollection }
     */
    public AssetGroupEditorialReasonCollection createAssetGroupEditorialReasonCollection() {
        return new AssetGroupEditorialReasonCollection();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupEditorialReason }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupEditorialReason }
     */
    public ArrayOfAssetGroupEditorialReason createArrayOfAssetGroupEditorialReason() {
        return new ArrayOfAssetGroupEditorialReason();
    }

    /**
     * Create an instance of {@link AssetGroupEditorialReason }
     * 
     * @return
     *     the new instance of {@link AssetGroupEditorialReason }
     */
    public AssetGroupEditorialReason createAssetGroupEditorialReason() {
        return new AssetGroupEditorialReason();
    }

    /**
     * Create an instance of {@link SetAudienceGroupAssetGroupAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link SetAudienceGroupAssetGroupAssociationsRequest }
     */
    public SetAudienceGroupAssetGroupAssociationsRequest createSetAudienceGroupAssetGroupAssociationsRequest() {
        return new SetAudienceGroupAssetGroupAssociationsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAudienceGroupAssetGroupAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudienceGroupAssetGroupAssociation }
     */
    public ArrayOfAudienceGroupAssetGroupAssociation createArrayOfAudienceGroupAssetGroupAssociation() {
        return new ArrayOfAudienceGroupAssetGroupAssociation();
    }

    /**
     * Create an instance of {@link AudienceGroupAssetGroupAssociation }
     * 
     * @return
     *     the new instance of {@link AudienceGroupAssetGroupAssociation }
     */
    public AudienceGroupAssetGroupAssociation createAudienceGroupAssetGroupAssociation() {
        return new AudienceGroupAssetGroupAssociation();
    }

    /**
     * Create an instance of {@link SetAudienceGroupAssetGroupAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link SetAudienceGroupAssetGroupAssociationsResponse }
     */
    public SetAudienceGroupAssetGroupAssociationsResponse createSetAudienceGroupAssetGroupAssociationsResponse() {
        return new SetAudienceGroupAssetGroupAssociationsResponse();
    }

    /**
     * Create an instance of {@link DeleteAudienceGroupAssetGroupAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAudienceGroupAssetGroupAssociationsRequest }
     */
    public DeleteAudienceGroupAssetGroupAssociationsRequest createDeleteAudienceGroupAssetGroupAssociationsRequest() {
        return new DeleteAudienceGroupAssetGroupAssociationsRequest();
    }

    /**
     * Create an instance of {@link DeleteAudienceGroupAssetGroupAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAudienceGroupAssetGroupAssociationsResponse }
     */
    public DeleteAudienceGroupAssetGroupAssociationsResponse createDeleteAudienceGroupAssetGroupAssociationsResponse() {
        return new DeleteAudienceGroupAssetGroupAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest }
     */
    public GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest createGetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest() {
        return new GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest();
    }

    /**
     * Create an instance of {@link GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse }
     */
    public GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse createGetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse() {
        return new GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse();
    }

    /**
     * Create an instance of {@link GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest }
     */
    public GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest createGetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest() {
        return new GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest();
    }

    /**
     * Create an instance of {@link GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse }
     */
    public GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse createGetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse() {
        return new GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse();
    }

    /**
     * Create an instance of {@link AddAudiencesRequest }
     * 
     * @return
     *     the new instance of {@link AddAudiencesRequest }
     */
    public AddAudiencesRequest createAddAudiencesRequest() {
        return new AddAudiencesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAudience }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudience }
     */
    public ArrayOfAudience createArrayOfAudience() {
        return new ArrayOfAudience();
    }

    /**
     * Create an instance of {@link Audience }
     * 
     * @return
     *     the new instance of {@link Audience }
     */
    public Audience createAudience() {
        return new Audience();
    }

    /**
     * Create an instance of {@link CustomerShare }
     * 
     * @return
     *     the new instance of {@link CustomerShare }
     */
    public CustomerShare createCustomerShare() {
        return new CustomerShare();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerAccountShare }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomerAccountShare }
     */
    public ArrayOfCustomerAccountShare createArrayOfCustomerAccountShare() {
        return new ArrayOfCustomerAccountShare();
    }

    /**
     * Create an instance of {@link CustomerAccountShare }
     * 
     * @return
     *     the new instance of {@link CustomerAccountShare }
     */
    public CustomerAccountShare createCustomerAccountShare() {
        return new CustomerAccountShare();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerAccountShareAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomerAccountShareAssociation }
     */
    public ArrayOfCustomerAccountShareAssociation createArrayOfCustomerAccountShareAssociation() {
        return new ArrayOfCustomerAccountShareAssociation();
    }

    /**
     * Create an instance of {@link CustomerAccountShareAssociation }
     * 
     * @return
     *     the new instance of {@link CustomerAccountShareAssociation }
     */
    public CustomerAccountShareAssociation createCustomerAccountShareAssociation() {
        return new CustomerAccountShareAssociation();
    }

    /**
     * Create an instance of {@link RemarketingList }
     * 
     * @return
     *     the new instance of {@link RemarketingList }
     */
    public RemarketingList createRemarketingList() {
        return new RemarketingList();
    }

    /**
     * Create an instance of {@link RemarketingRule }
     * 
     * @return
     *     the new instance of {@link RemarketingRule }
     */
    public RemarketingRule createRemarketingRule() {
        return new RemarketingRule();
    }

    /**
     * Create an instance of {@link PageVisitorsRule }
     * 
     * @return
     *     the new instance of {@link PageVisitorsRule }
     */
    public PageVisitorsRule createPageVisitorsRule() {
        return new PageVisitorsRule();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItemGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfRuleItemGroup }
     */
    public ArrayOfRuleItemGroup createArrayOfRuleItemGroup() {
        return new ArrayOfRuleItemGroup();
    }

    /**
     * Create an instance of {@link RuleItemGroup }
     * 
     * @return
     *     the new instance of {@link RuleItemGroup }
     */
    public RuleItemGroup createRuleItemGroup() {
        return new RuleItemGroup();
    }

    /**
     * Create an instance of {@link ArrayOfRuleItem }
     * 
     * @return
     *     the new instance of {@link ArrayOfRuleItem }
     */
    public ArrayOfRuleItem createArrayOfRuleItem() {
        return new ArrayOfRuleItem();
    }

    /**
     * Create an instance of {@link RuleItem }
     * 
     * @return
     *     the new instance of {@link RuleItem }
     */
    public RuleItem createRuleItem() {
        return new RuleItem();
    }

    /**
     * Create an instance of {@link StringRuleItem }
     * 
     * @return
     *     the new instance of {@link StringRuleItem }
     */
    public StringRuleItem createStringRuleItem() {
        return new StringRuleItem();
    }

    /**
     * Create an instance of {@link NumberRuleItem }
     * 
     * @return
     *     the new instance of {@link NumberRuleItem }
     */
    public NumberRuleItem createNumberRuleItem() {
        return new NumberRuleItem();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoVisitedAnotherPageRule }
     * 
     * @return
     *     the new instance of {@link PageVisitorsWhoVisitedAnotherPageRule }
     */
    public PageVisitorsWhoVisitedAnotherPageRule createPageVisitorsWhoVisitedAnotherPageRule() {
        return new PageVisitorsWhoVisitedAnotherPageRule();
    }

    /**
     * Create an instance of {@link PageVisitorsWhoDidNotVisitAnotherPageRule }
     * 
     * @return
     *     the new instance of {@link PageVisitorsWhoDidNotVisitAnotherPageRule }
     */
    public PageVisitorsWhoDidNotVisitAnotherPageRule createPageVisitorsWhoDidNotVisitAnotherPageRule() {
        return new PageVisitorsWhoDidNotVisitAnotherPageRule();
    }

    /**
     * Create an instance of {@link CustomEventsRule }
     * 
     * @return
     *     the new instance of {@link CustomEventsRule }
     */
    public CustomEventsRule createCustomEventsRule() {
        return new CustomEventsRule();
    }

    /**
     * Create an instance of {@link CustomAudience }
     * 
     * @return
     *     the new instance of {@link CustomAudience }
     */
    public CustomAudience createCustomAudience() {
        return new CustomAudience();
    }

    /**
     * Create an instance of {@link InMarketAudience }
     * 
     * @return
     *     the new instance of {@link InMarketAudience }
     */
    public InMarketAudience createInMarketAudience() {
        return new InMarketAudience();
    }

    /**
     * Create an instance of {@link ProductAudience }
     * 
     * @return
     *     the new instance of {@link ProductAudience }
     */
    public ProductAudience createProductAudience() {
        return new ProductAudience();
    }

    /**
     * Create an instance of {@link SimilarRemarketingList }
     * 
     * @return
     *     the new instance of {@link SimilarRemarketingList }
     */
    public SimilarRemarketingList createSimilarRemarketingList() {
        return new SimilarRemarketingList();
    }

    /**
     * Create an instance of {@link CombinedList }
     * 
     * @return
     *     the new instance of {@link CombinedList }
     */
    public CombinedList createCombinedList() {
        return new CombinedList();
    }

    /**
     * Create an instance of {@link ArrayOfCombinationRule }
     * 
     * @return
     *     the new instance of {@link ArrayOfCombinationRule }
     */
    public ArrayOfCombinationRule createArrayOfCombinationRule() {
        return new ArrayOfCombinationRule();
    }

    /**
     * Create an instance of {@link CombinationRule }
     * 
     * @return
     *     the new instance of {@link CombinationRule }
     */
    public CombinationRule createCombinationRule() {
        return new CombinationRule();
    }

    /**
     * Create an instance of {@link CustomerList }
     * 
     * @return
     *     the new instance of {@link CustomerList }
     */
    public CustomerList createCustomerList() {
        return new CustomerList();
    }

    /**
     * Create an instance of {@link ImpressionBasedRemarketingList }
     * 
     * @return
     *     the new instance of {@link ImpressionBasedRemarketingList }
     */
    public ImpressionBasedRemarketingList createImpressionBasedRemarketingList() {
        return new ImpressionBasedRemarketingList();
    }

    /**
     * Create an instance of {@link AddAudiencesResponse }
     * 
     * @return
     *     the new instance of {@link AddAudiencesResponse }
     */
    public AddAudiencesResponse createAddAudiencesResponse() {
        return new AddAudiencesResponse();
    }

    /**
     * Create an instance of {@link UpdateAudiencesRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAudiencesRequest }
     */
    public UpdateAudiencesRequest createUpdateAudiencesRequest() {
        return new UpdateAudiencesRequest();
    }

    /**
     * Create an instance of {@link UpdateAudiencesResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAudiencesResponse }
     */
    public UpdateAudiencesResponse createUpdateAudiencesResponse() {
        return new UpdateAudiencesResponse();
    }

    /**
     * Create an instance of {@link DeleteAudiencesRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAudiencesRequest }
     */
    public DeleteAudiencesRequest createDeleteAudiencesRequest() {
        return new DeleteAudiencesRequest();
    }

    /**
     * Create an instance of {@link DeleteAudiencesResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAudiencesResponse }
     */
    public DeleteAudiencesResponse createDeleteAudiencesResponse() {
        return new DeleteAudiencesResponse();
    }

    /**
     * Create an instance of {@link GetAudiencesByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetAudiencesByIdsRequest }
     */
    public GetAudiencesByIdsRequest createGetAudiencesByIdsRequest() {
        return new GetAudiencesByIdsRequest();
    }

    /**
     * Create an instance of {@link GetAudiencesByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudiencesByIdsResponse }
     */
    public GetAudiencesByIdsResponse createGetAudiencesByIdsResponse() {
        return new GetAudiencesByIdsResponse();
    }

    /**
     * Create an instance of {@link ApplyCustomerListItemsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyCustomerListItemsRequest }
     */
    public ApplyCustomerListItemsRequest createApplyCustomerListItemsRequest() {
        return new ApplyCustomerListItemsRequest();
    }

    /**
     * Create an instance of {@link ApplyCustomerListItemsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyCustomerListItemsResponse }
     */
    public ApplyCustomerListItemsResponse createApplyCustomerListItemsResponse() {
        return new ApplyCustomerListItemsResponse();
    }

    /**
     * Create an instance of {@link ApplyCustomerListUserDataRequest }
     * 
     * @return
     *     the new instance of {@link ApplyCustomerListUserDataRequest }
     */
    public ApplyCustomerListUserDataRequest createApplyCustomerListUserDataRequest() {
        return new ApplyCustomerListUserDataRequest();
    }

    /**
     * Create an instance of {@link CustomerListUserData }
     * 
     * @return
     *     the new instance of {@link CustomerListUserData }
     */
    public CustomerListUserData createCustomerListUserData() {
        return new CustomerListUserData();
    }

    /**
     * Create an instance of {@link ApplyCustomerListUserDataResponse }
     * 
     * @return
     *     the new instance of {@link ApplyCustomerListUserDataResponse }
     */
    public ApplyCustomerListUserDataResponse createApplyCustomerListUserDataResponse() {
        return new ApplyCustomerListUserDataResponse();
    }

    /**
     * Create an instance of {@link GetUetTagsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetUetTagsByIdsRequest }
     */
    public GetUetTagsByIdsRequest createGetUetTagsByIdsRequest() {
        return new GetUetTagsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetUetTagsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetUetTagsByIdsResponse }
     */
    public GetUetTagsByIdsResponse createGetUetTagsByIdsResponse() {
        return new GetUetTagsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUetTag }
     * 
     * @return
     *     the new instance of {@link ArrayOfUetTag }
     */
    public ArrayOfUetTag createArrayOfUetTag() {
        return new ArrayOfUetTag();
    }

    /**
     * Create an instance of {@link UetTag }
     * 
     * @return
     *     the new instance of {@link UetTag }
     */
    public UetTag createUetTag() {
        return new UetTag();
    }

    /**
     * Create an instance of {@link AddUetTagsRequest }
     * 
     * @return
     *     the new instance of {@link AddUetTagsRequest }
     */
    public AddUetTagsRequest createAddUetTagsRequest() {
        return new AddUetTagsRequest();
    }

    /**
     * Create an instance of {@link AddUetTagsResponse }
     * 
     * @return
     *     the new instance of {@link AddUetTagsResponse }
     */
    public AddUetTagsResponse createAddUetTagsResponse() {
        return new AddUetTagsResponse();
    }

    /**
     * Create an instance of {@link UpdateUetTagsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateUetTagsRequest }
     */
    public UpdateUetTagsRequest createUpdateUetTagsRequest() {
        return new UpdateUetTagsRequest();
    }

    /**
     * Create an instance of {@link UpdateUetTagsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateUetTagsResponse }
     */
    public UpdateUetTagsResponse createUpdateUetTagsResponse() {
        return new UpdateUetTagsResponse();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetConversionGoalsByIdsRequest }
     */
    public GetConversionGoalsByIdsRequest createGetConversionGoalsByIdsRequest() {
        return new GetConversionGoalsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetConversionGoalsByIdsResponse }
     */
    public GetConversionGoalsByIdsResponse createGetConversionGoalsByIdsResponse() {
        return new GetConversionGoalsByIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConversionGoal }
     * 
     * @return
     *     the new instance of {@link ArrayOfConversionGoal }
     */
    public ArrayOfConversionGoal createArrayOfConversionGoal() {
        return new ArrayOfConversionGoal();
    }

    /**
     * Create an instance of {@link ConversionGoal }
     * 
     * @return
     *     the new instance of {@link ConversionGoal }
     */
    public ConversionGoal createConversionGoal() {
        return new ConversionGoal();
    }

    /**
     * Create an instance of {@link ConversionGoalRevenue }
     * 
     * @return
     *     the new instance of {@link ConversionGoalRevenue }
     */
    public ConversionGoalRevenue createConversionGoalRevenue() {
        return new ConversionGoalRevenue();
    }

    /**
     * Create an instance of {@link UrlGoal }
     * 
     * @return
     *     the new instance of {@link UrlGoal }
     */
    public UrlGoal createUrlGoal() {
        return new UrlGoal();
    }

    /**
     * Create an instance of {@link DurationGoal }
     * 
     * @return
     *     the new instance of {@link DurationGoal }
     */
    public DurationGoal createDurationGoal() {
        return new DurationGoal();
    }

    /**
     * Create an instance of {@link PagesViewedPerVisitGoal }
     * 
     * @return
     *     the new instance of {@link PagesViewedPerVisitGoal }
     */
    public PagesViewedPerVisitGoal createPagesViewedPerVisitGoal() {
        return new PagesViewedPerVisitGoal();
    }

    /**
     * Create an instance of {@link EventGoal }
     * 
     * @return
     *     the new instance of {@link EventGoal }
     */
    public EventGoal createEventGoal() {
        return new EventGoal();
    }

    /**
     * Create an instance of {@link AppInstallGoal }
     * 
     * @return
     *     the new instance of {@link AppInstallGoal }
     */
    public AppInstallGoal createAppInstallGoal() {
        return new AppInstallGoal();
    }

    /**
     * Create an instance of {@link OfflineConversionGoal }
     * 
     * @return
     *     the new instance of {@link OfflineConversionGoal }
     */
    public OfflineConversionGoal createOfflineConversionGoal() {
        return new OfflineConversionGoal();
    }

    /**
     * Create an instance of {@link InStoreTransactionGoal }
     * 
     * @return
     *     the new instance of {@link InStoreTransactionGoal }
     */
    public InStoreTransactionGoal createInStoreTransactionGoal() {
        return new InStoreTransactionGoal();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByTagIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetConversionGoalsByTagIdsRequest }
     */
    public GetConversionGoalsByTagIdsRequest createGetConversionGoalsByTagIdsRequest() {
        return new GetConversionGoalsByTagIdsRequest();
    }

    /**
     * Create an instance of {@link GetConversionGoalsByTagIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetConversionGoalsByTagIdsResponse }
     */
    public GetConversionGoalsByTagIdsResponse createGetConversionGoalsByTagIdsResponse() {
        return new GetConversionGoalsByTagIdsResponse();
    }

    /**
     * Create an instance of {@link AddConversionGoalsRequest }
     * 
     * @return
     *     the new instance of {@link AddConversionGoalsRequest }
     */
    public AddConversionGoalsRequest createAddConversionGoalsRequest() {
        return new AddConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link AddConversionGoalsResponse }
     * 
     * @return
     *     the new instance of {@link AddConversionGoalsResponse }
     */
    public AddConversionGoalsResponse createAddConversionGoalsResponse() {
        return new AddConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link UpdateConversionGoalsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateConversionGoalsRequest }
     */
    public UpdateConversionGoalsRequest createUpdateConversionGoalsRequest() {
        return new UpdateConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link UpdateConversionGoalsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateConversionGoalsResponse }
     */
    public UpdateConversionGoalsResponse createUpdateConversionGoalsResponse() {
        return new UpdateConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyOfflineConversionsRequest }
     */
    public ApplyOfflineConversionsRequest createApplyOfflineConversionsRequest() {
        return new ApplyOfflineConversionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOfflineConversion }
     * 
     * @return
     *     the new instance of {@link ArrayOfOfflineConversion }
     */
    public ArrayOfOfflineConversion createArrayOfOfflineConversion() {
        return new ArrayOfOfflineConversion();
    }

    /**
     * Create an instance of {@link OfflineConversion }
     * 
     * @return
     *     the new instance of {@link OfflineConversion }
     */
    public OfflineConversion createOfflineConversion() {
        return new OfflineConversion();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyOfflineConversionsResponse }
     */
    public ApplyOfflineConversionsResponse createApplyOfflineConversionsResponse() {
        return new ApplyOfflineConversionsResponse();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionAdjustmentsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyOfflineConversionAdjustmentsRequest }
     */
    public ApplyOfflineConversionAdjustmentsRequest createApplyOfflineConversionAdjustmentsRequest() {
        return new ApplyOfflineConversionAdjustmentsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOfflineConversionAdjustment }
     * 
     * @return
     *     the new instance of {@link ArrayOfOfflineConversionAdjustment }
     */
    public ArrayOfOfflineConversionAdjustment createArrayOfOfflineConversionAdjustment() {
        return new ArrayOfOfflineConversionAdjustment();
    }

    /**
     * Create an instance of {@link OfflineConversionAdjustment }
     * 
     * @return
     *     the new instance of {@link OfflineConversionAdjustment }
     */
    public OfflineConversionAdjustment createOfflineConversionAdjustment() {
        return new OfflineConversionAdjustment();
    }

    /**
     * Create an instance of {@link ApplyOfflineConversionAdjustmentsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyOfflineConversionAdjustmentsResponse }
     */
    public ApplyOfflineConversionAdjustmentsResponse createApplyOfflineConversionAdjustmentsResponse() {
        return new ApplyOfflineConversionAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link ApplyOnlineConversionAdjustmentsRequest }
     * 
     * @return
     *     the new instance of {@link ApplyOnlineConversionAdjustmentsRequest }
     */
    public ApplyOnlineConversionAdjustmentsRequest createApplyOnlineConversionAdjustmentsRequest() {
        return new ApplyOnlineConversionAdjustmentsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfOnlineConversionAdjustment }
     * 
     * @return
     *     the new instance of {@link ArrayOfOnlineConversionAdjustment }
     */
    public ArrayOfOnlineConversionAdjustment createArrayOfOnlineConversionAdjustment() {
        return new ArrayOfOnlineConversionAdjustment();
    }

    /**
     * Create an instance of {@link OnlineConversionAdjustment }
     * 
     * @return
     *     the new instance of {@link OnlineConversionAdjustment }
     */
    public OnlineConversionAdjustment createOnlineConversionAdjustment() {
        return new OnlineConversionAdjustment();
    }

    /**
     * Create an instance of {@link ApplyOnlineConversionAdjustmentsResponse }
     * 
     * @return
     *     the new instance of {@link ApplyOnlineConversionAdjustmentsResponse }
     */
    public ApplyOnlineConversionAdjustmentsResponse createApplyOnlineConversionAdjustmentsResponse() {
        return new ApplyOnlineConversionAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link AddLabelsRequest }
     * 
     * @return
     *     the new instance of {@link AddLabelsRequest }
     */
    public AddLabelsRequest createAddLabelsRequest() {
        return new AddLabelsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfLabel }
     * 
     * @return
     *     the new instance of {@link ArrayOfLabel }
     */
    public ArrayOfLabel createArrayOfLabel() {
        return new ArrayOfLabel();
    }

    /**
     * Create an instance of {@link Label }
     * 
     * @return
     *     the new instance of {@link Label }
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link AddLabelsResponse }
     * 
     * @return
     *     the new instance of {@link AddLabelsResponse }
     */
    public AddLabelsResponse createAddLabelsResponse() {
        return new AddLabelsResponse();
    }

    /**
     * Create an instance of {@link DeleteLabelsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteLabelsRequest }
     */
    public DeleteLabelsRequest createDeleteLabelsRequest() {
        return new DeleteLabelsRequest();
    }

    /**
     * Create an instance of {@link DeleteLabelsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteLabelsResponse }
     */
    public DeleteLabelsResponse createDeleteLabelsResponse() {
        return new DeleteLabelsResponse();
    }

    /**
     * Create an instance of {@link UpdateLabelsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateLabelsRequest }
     */
    public UpdateLabelsRequest createUpdateLabelsRequest() {
        return new UpdateLabelsRequest();
    }

    /**
     * Create an instance of {@link UpdateLabelsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateLabelsResponse }
     */
    public UpdateLabelsResponse createUpdateLabelsResponse() {
        return new UpdateLabelsResponse();
    }

    /**
     * Create an instance of {@link GetLabelsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetLabelsByIdsRequest }
     */
    public GetLabelsByIdsRequest createGetLabelsByIdsRequest() {
        return new GetLabelsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetLabelsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetLabelsByIdsResponse }
     */
    public GetLabelsByIdsResponse createGetLabelsByIdsResponse() {
        return new GetLabelsByIdsResponse();
    }

    /**
     * Create an instance of {@link SetLabelAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link SetLabelAssociationsRequest }
     */
    public SetLabelAssociationsRequest createSetLabelAssociationsRequest() {
        return new SetLabelAssociationsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfLabelAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfLabelAssociation }
     */
    public ArrayOfLabelAssociation createArrayOfLabelAssociation() {
        return new ArrayOfLabelAssociation();
    }

    /**
     * Create an instance of {@link LabelAssociation }
     * 
     * @return
     *     the new instance of {@link LabelAssociation }
     */
    public LabelAssociation createLabelAssociation() {
        return new LabelAssociation();
    }

    /**
     * Create an instance of {@link SetLabelAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link SetLabelAssociationsResponse }
     */
    public SetLabelAssociationsResponse createSetLabelAssociationsResponse() {
        return new SetLabelAssociationsResponse();
    }

    /**
     * Create an instance of {@link DeleteLabelAssociationsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteLabelAssociationsRequest }
     */
    public DeleteLabelAssociationsRequest createDeleteLabelAssociationsRequest() {
        return new DeleteLabelAssociationsRequest();
    }

    /**
     * Create an instance of {@link DeleteLabelAssociationsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteLabelAssociationsResponse }
     */
    public DeleteLabelAssociationsResponse createDeleteLabelAssociationsResponse() {
        return new DeleteLabelAssociationsResponse();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByEntityIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetLabelAssociationsByEntityIdsRequest }
     */
    public GetLabelAssociationsByEntityIdsRequest createGetLabelAssociationsByEntityIdsRequest() {
        return new GetLabelAssociationsByEntityIdsRequest();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByEntityIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetLabelAssociationsByEntityIdsResponse }
     */
    public GetLabelAssociationsByEntityIdsResponse createGetLabelAssociationsByEntityIdsResponse() {
        return new GetLabelAssociationsByEntityIdsResponse();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByLabelIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetLabelAssociationsByLabelIdsRequest }
     */
    public GetLabelAssociationsByLabelIdsRequest createGetLabelAssociationsByLabelIdsRequest() {
        return new GetLabelAssociationsByLabelIdsRequest();
    }

    /**
     * Create an instance of {@link GetLabelAssociationsByLabelIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetLabelAssociationsByLabelIdsResponse }
     */
    public GetLabelAssociationsByLabelIdsResponse createGetLabelAssociationsByLabelIdsResponse() {
        return new GetLabelAssociationsByLabelIdsResponse();
    }

    /**
     * Create an instance of {@link AddExperimentsRequest }
     * 
     * @return
     *     the new instance of {@link AddExperimentsRequest }
     */
    public AddExperimentsRequest createAddExperimentsRequest() {
        return new AddExperimentsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfExperiment }
     * 
     * @return
     *     the new instance of {@link ArrayOfExperiment }
     */
    public ArrayOfExperiment createArrayOfExperiment() {
        return new ArrayOfExperiment();
    }

    /**
     * Create an instance of {@link Experiment }
     * 
     * @return
     *     the new instance of {@link Experiment }
     */
    public Experiment createExperiment() {
        return new Experiment();
    }

    /**
     * Create an instance of {@link AddExperimentsResponse }
     * 
     * @return
     *     the new instance of {@link AddExperimentsResponse }
     */
    public AddExperimentsResponse createAddExperimentsResponse() {
        return new AddExperimentsResponse();
    }

    /**
     * Create an instance of {@link DeleteExperimentsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteExperimentsRequest }
     */
    public DeleteExperimentsRequest createDeleteExperimentsRequest() {
        return new DeleteExperimentsRequest();
    }

    /**
     * Create an instance of {@link DeleteExperimentsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteExperimentsResponse }
     */
    public DeleteExperimentsResponse createDeleteExperimentsResponse() {
        return new DeleteExperimentsResponse();
    }

    /**
     * Create an instance of {@link UpdateExperimentsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateExperimentsRequest }
     */
    public UpdateExperimentsRequest createUpdateExperimentsRequest() {
        return new UpdateExperimentsRequest();
    }

    /**
     * Create an instance of {@link UpdateExperimentsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateExperimentsResponse }
     */
    public UpdateExperimentsResponse createUpdateExperimentsResponse() {
        return new UpdateExperimentsResponse();
    }

    /**
     * Create an instance of {@link GetExperimentsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetExperimentsByIdsRequest }
     */
    public GetExperimentsByIdsRequest createGetExperimentsByIdsRequest() {
        return new GetExperimentsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetExperimentsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetExperimentsByIdsResponse }
     */
    public GetExperimentsByIdsResponse createGetExperimentsByIdsResponse() {
        return new GetExperimentsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetProfileDataFileUrlRequest }
     * 
     * @return
     *     the new instance of {@link GetProfileDataFileUrlRequest }
     */
    public GetProfileDataFileUrlRequest createGetProfileDataFileUrlRequest() {
        return new GetProfileDataFileUrlRequest();
    }

    /**
     * Create an instance of {@link GetProfileDataFileUrlResponse }
     * 
     * @return
     *     the new instance of {@link GetProfileDataFileUrlResponse }
     */
    public GetProfileDataFileUrlResponse createGetProfileDataFileUrlResponse() {
        return new GetProfileDataFileUrlResponse();
    }

    /**
     * Create an instance of {@link SearchCompaniesRequest }
     * 
     * @return
     *     the new instance of {@link SearchCompaniesRequest }
     */
    public SearchCompaniesRequest createSearchCompaniesRequest() {
        return new SearchCompaniesRequest();
    }

    /**
     * Create an instance of {@link SearchCompaniesResponse }
     * 
     * @return
     *     the new instance of {@link SearchCompaniesResponse }
     */
    public SearchCompaniesResponse createSearchCompaniesResponse() {
        return new SearchCompaniesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCompany }
     * 
     * @return
     *     the new instance of {@link ArrayOfCompany }
     */
    public ArrayOfCompany createArrayOfCompany() {
        return new ArrayOfCompany();
    }

    /**
     * Create an instance of {@link Company }
     * 
     * @return
     *     the new instance of {@link Company }
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link GetFileImportUploadUrlRequest }
     * 
     * @return
     *     the new instance of {@link GetFileImportUploadUrlRequest }
     */
    public GetFileImportUploadUrlRequest createGetFileImportUploadUrlRequest() {
        return new GetFileImportUploadUrlRequest();
    }

    /**
     * Create an instance of {@link GetFileImportUploadUrlResponse }
     * 
     * @return
     *     the new instance of {@link GetFileImportUploadUrlResponse }
     */
    public GetFileImportUploadUrlResponse createGetFileImportUploadUrlResponse() {
        return new GetFileImportUploadUrlResponse();
    }

    /**
     * Create an instance of {@link AddImportJobsRequest }
     * 
     * @return
     *     the new instance of {@link AddImportJobsRequest }
     */
    public AddImportJobsRequest createAddImportJobsRequest() {
        return new AddImportJobsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfImportJob }
     * 
     * @return
     *     the new instance of {@link ArrayOfImportJob }
     */
    public ArrayOfImportJob createArrayOfImportJob() {
        return new ArrayOfImportJob();
    }

    /**
     * Create an instance of {@link ImportJob }
     * 
     * @return
     *     the new instance of {@link ImportJob }
     */
    public ImportJob createImportJob() {
        return new ImportJob();
    }

    /**
     * Create an instance of {@link Frequency }
     * 
     * @return
     *     the new instance of {@link Frequency }
     */
    public Frequency createFrequency() {
        return new Frequency();
    }

    /**
     * Create an instance of {@link ImportOption }
     * 
     * @return
     *     the new instance of {@link ImportOption }
     */
    public ImportOption createImportOption() {
        return new ImportOption();
    }

    /**
     * Create an instance of {@link GoogleImportOption }
     * 
     * @return
     *     the new instance of {@link GoogleImportOption }
     */
    public GoogleImportOption createGoogleImportOption() {
        return new GoogleImportOption();
    }

    /**
     * Create an instance of {@link ImportSearchAndReplaceForStringProperty }
     * 
     * @return
     *     the new instance of {@link ImportSearchAndReplaceForStringProperty }
     */
    public ImportSearchAndReplaceForStringProperty createImportSearchAndReplaceForStringProperty() {
        return new ImportSearchAndReplaceForStringProperty();
    }

    /**
     * Create an instance of {@link FileImportOption }
     * 
     * @return
     *     the new instance of {@link FileImportOption }
     */
    public FileImportOption createFileImportOption() {
        return new FileImportOption();
    }

    /**
     * Create an instance of {@link GoogleImportJob }
     * 
     * @return
     *     the new instance of {@link GoogleImportJob }
     */
    public GoogleImportJob createGoogleImportJob() {
        return new GoogleImportJob();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignAdGroupIds }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignAdGroupIds }
     */
    public ArrayOfCampaignAdGroupIds createArrayOfCampaignAdGroupIds() {
        return new ArrayOfCampaignAdGroupIds();
    }

    /**
     * Create an instance of {@link CampaignAdGroupIds }
     * 
     * @return
     *     the new instance of {@link CampaignAdGroupIds }
     */
    public CampaignAdGroupIds createCampaignAdGroupIds() {
        return new CampaignAdGroupIds();
    }

    /**
     * Create an instance of {@link FileImportJob }
     * 
     * @return
     *     the new instance of {@link FileImportJob }
     */
    public FileImportJob createFileImportJob() {
        return new FileImportJob();
    }

    /**
     * Create an instance of {@link AddImportJobsResponse }
     * 
     * @return
     *     the new instance of {@link AddImportJobsResponse }
     */
    public AddImportJobsResponse createAddImportJobsResponse() {
        return new AddImportJobsResponse();
    }

    /**
     * Create an instance of {@link GetImportResultsRequest }
     * 
     * @return
     *     the new instance of {@link GetImportResultsRequest }
     */
    public GetImportResultsRequest createGetImportResultsRequest() {
        return new GetImportResultsRequest();
    }

    /**
     * Create an instance of {@link GetImportResultsResponse }
     * 
     * @return
     *     the new instance of {@link GetImportResultsResponse }
     */
    public GetImportResultsResponse createGetImportResultsResponse() {
        return new GetImportResultsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfImportResult }
     * 
     * @return
     *     the new instance of {@link ArrayOfImportResult }
     */
    public ArrayOfImportResult createArrayOfImportResult() {
        return new ArrayOfImportResult();
    }

    /**
     * Create an instance of {@link ImportResult }
     * 
     * @return
     *     the new instance of {@link ImportResult }
     */
    public ImportResult createImportResult() {
        return new ImportResult();
    }

    /**
     * Create an instance of {@link ArrayOfImportEntityStatistics }
     * 
     * @return
     *     the new instance of {@link ArrayOfImportEntityStatistics }
     */
    public ArrayOfImportEntityStatistics createArrayOfImportEntityStatistics() {
        return new ArrayOfImportEntityStatistics();
    }

    /**
     * Create an instance of {@link ImportEntityStatistics }
     * 
     * @return
     *     the new instance of {@link ImportEntityStatistics }
     */
    public ImportEntityStatistics createImportEntityStatistics() {
        return new ImportEntityStatistics();
    }

    /**
     * Create an instance of {@link GetImportJobsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetImportJobsByIdsRequest }
     */
    public GetImportJobsByIdsRequest createGetImportJobsByIdsRequest() {
        return new GetImportJobsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetImportJobsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetImportJobsByIdsResponse }
     */
    public GetImportJobsByIdsResponse createGetImportJobsByIdsResponse() {
        return new GetImportJobsByIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteImportJobsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteImportJobsRequest }
     */
    public DeleteImportJobsRequest createDeleteImportJobsRequest() {
        return new DeleteImportJobsRequest();
    }

    /**
     * Create an instance of {@link DeleteImportJobsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteImportJobsResponse }
     */
    public DeleteImportJobsResponse createDeleteImportJobsResponse() {
        return new DeleteImportJobsResponse();
    }

    /**
     * Create an instance of {@link GetImportEntityIdsMappingRequest }
     * 
     * @return
     *     the new instance of {@link GetImportEntityIdsMappingRequest }
     */
    public GetImportEntityIdsMappingRequest createGetImportEntityIdsMappingRequest() {
        return new GetImportEntityIdsMappingRequest();
    }

    /**
     * Create an instance of {@link GetImportEntityIdsMappingResponse }
     * 
     * @return
     *     the new instance of {@link GetImportEntityIdsMappingResponse }
     */
    public GetImportEntityIdsMappingResponse createGetImportEntityIdsMappingResponse() {
        return new GetImportEntityIdsMappingResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOflonglong }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValuePairOflonglong }
     */
    public ArrayOfKeyValuePairOflonglong createArrayOfKeyValuePairOflonglong() {
        return new ArrayOfKeyValuePairOflonglong();
    }

    /**
     * Create an instance of {@link UpdateImportJobsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateImportJobsRequest }
     */
    public UpdateImportJobsRequest createUpdateImportJobsRequest() {
        return new UpdateImportJobsRequest();
    }

    /**
     * Create an instance of {@link UpdateImportJobsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateImportJobsResponse }
     */
    public UpdateImportJobsResponse createUpdateImportJobsResponse() {
        return new UpdateImportJobsResponse();
    }

    /**
     * Create an instance of {@link AddVideosRequest }
     * 
     * @return
     *     the new instance of {@link AddVideosRequest }
     */
    public AddVideosRequest createAddVideosRequest() {
        return new AddVideosRequest();
    }

    /**
     * Create an instance of {@link ArrayOfVideo }
     * 
     * @return
     *     the new instance of {@link ArrayOfVideo }
     */
    public ArrayOfVideo createArrayOfVideo() {
        return new ArrayOfVideo();
    }

    /**
     * Create an instance of {@link Video }
     * 
     * @return
     *     the new instance of {@link Video }
     */
    public Video createVideo() {
        return new Video();
    }

    /**
     * Create an instance of {@link AddVideosResponse }
     * 
     * @return
     *     the new instance of {@link AddVideosResponse }
     */
    public AddVideosResponse createAddVideosResponse() {
        return new AddVideosResponse();
    }

    /**
     * Create an instance of {@link DeleteVideosRequest }
     * 
     * @return
     *     the new instance of {@link DeleteVideosRequest }
     */
    public DeleteVideosRequest createDeleteVideosRequest() {
        return new DeleteVideosRequest();
    }

    /**
     * Create an instance of {@link DeleteVideosResponse }
     * 
     * @return
     *     the new instance of {@link DeleteVideosResponse }
     */
    public DeleteVideosResponse createDeleteVideosResponse() {
        return new DeleteVideosResponse();
    }

    /**
     * Create an instance of {@link GetVideosByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetVideosByIdsRequest }
     */
    public GetVideosByIdsRequest createGetVideosByIdsRequest() {
        return new GetVideosByIdsRequest();
    }

    /**
     * Create an instance of {@link GetVideosByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetVideosByIdsResponse }
     */
    public GetVideosByIdsResponse createGetVideosByIdsResponse() {
        return new GetVideosByIdsResponse();
    }

    /**
     * Create an instance of {@link UpdateVideosRequest }
     * 
     * @return
     *     the new instance of {@link UpdateVideosRequest }
     */
    public UpdateVideosRequest createUpdateVideosRequest() {
        return new UpdateVideosRequest();
    }

    /**
     * Create an instance of {@link UpdateVideosResponse }
     * 
     * @return
     *     the new instance of {@link UpdateVideosResponse }
     */
    public UpdateVideosResponse createUpdateVideosResponse() {
        return new UpdateVideosResponse();
    }

    /**
     * Create an instance of {@link AddCampaignConversionGoalsRequest }
     * 
     * @return
     *     the new instance of {@link AddCampaignConversionGoalsRequest }
     */
    public AddCampaignConversionGoalsRequest createAddCampaignConversionGoalsRequest() {
        return new AddCampaignConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignConversionGoal }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignConversionGoal }
     */
    public ArrayOfCampaignConversionGoal createArrayOfCampaignConversionGoal() {
        return new ArrayOfCampaignConversionGoal();
    }

    /**
     * Create an instance of {@link CampaignConversionGoal }
     * 
     * @return
     *     the new instance of {@link CampaignConversionGoal }
     */
    public CampaignConversionGoal createCampaignConversionGoal() {
        return new CampaignConversionGoal();
    }

    /**
     * Create an instance of {@link AddCampaignConversionGoalsResponse }
     * 
     * @return
     *     the new instance of {@link AddCampaignConversionGoalsResponse }
     */
    public AddCampaignConversionGoalsResponse createAddCampaignConversionGoalsResponse() {
        return new AddCampaignConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link DeleteCampaignConversionGoalsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignConversionGoalsRequest }
     */
    public DeleteCampaignConversionGoalsRequest createDeleteCampaignConversionGoalsRequest() {
        return new DeleteCampaignConversionGoalsRequest();
    }

    /**
     * Create an instance of {@link DeleteCampaignConversionGoalsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteCampaignConversionGoalsResponse }
     */
    public DeleteCampaignConversionGoalsResponse createDeleteCampaignConversionGoalsResponse() {
        return new DeleteCampaignConversionGoalsResponse();
    }

    /**
     * Create an instance of {@link AddDataExclusionsRequest }
     * 
     * @return
     *     the new instance of {@link AddDataExclusionsRequest }
     */
    public AddDataExclusionsRequest createAddDataExclusionsRequest() {
        return new AddDataExclusionsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDataExclusion }
     * 
     * @return
     *     the new instance of {@link ArrayOfDataExclusion }
     */
    public ArrayOfDataExclusion createArrayOfDataExclusion() {
        return new ArrayOfDataExclusion();
    }

    /**
     * Create an instance of {@link DataExclusion }
     * 
     * @return
     *     the new instance of {@link DataExclusion }
     */
    public DataExclusion createDataExclusion() {
        return new DataExclusion();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignAssociation }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignAssociation }
     */
    public ArrayOfCampaignAssociation createArrayOfCampaignAssociation() {
        return new ArrayOfCampaignAssociation();
    }

    /**
     * Create an instance of {@link CampaignAssociation }
     * 
     * @return
     *     the new instance of {@link CampaignAssociation }
     */
    public CampaignAssociation createCampaignAssociation() {
        return new CampaignAssociation();
    }

    /**
     * Create an instance of {@link AddDataExclusionsResponse }
     * 
     * @return
     *     the new instance of {@link AddDataExclusionsResponse }
     */
    public AddDataExclusionsResponse createAddDataExclusionsResponse() {
        return new AddDataExclusionsResponse();
    }

    /**
     * Create an instance of {@link UpdateDataExclusionsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateDataExclusionsRequest }
     */
    public UpdateDataExclusionsRequest createUpdateDataExclusionsRequest() {
        return new UpdateDataExclusionsRequest();
    }

    /**
     * Create an instance of {@link UpdateDataExclusionsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateDataExclusionsResponse }
     */
    public UpdateDataExclusionsResponse createUpdateDataExclusionsResponse() {
        return new UpdateDataExclusionsResponse();
    }

    /**
     * Create an instance of {@link DeleteDataExclusionsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteDataExclusionsRequest }
     */
    public DeleteDataExclusionsRequest createDeleteDataExclusionsRequest() {
        return new DeleteDataExclusionsRequest();
    }

    /**
     * Create an instance of {@link DeleteDataExclusionsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteDataExclusionsResponse }
     */
    public DeleteDataExclusionsResponse createDeleteDataExclusionsResponse() {
        return new DeleteDataExclusionsResponse();
    }

    /**
     * Create an instance of {@link GetDataExclusionsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetDataExclusionsByIdsRequest }
     */
    public GetDataExclusionsByIdsRequest createGetDataExclusionsByIdsRequest() {
        return new GetDataExclusionsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetDataExclusionsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetDataExclusionsByIdsResponse }
     */
    public GetDataExclusionsByIdsResponse createGetDataExclusionsByIdsResponse() {
        return new GetDataExclusionsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetDataExclusionsByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetDataExclusionsByAccountIdRequest }
     */
    public GetDataExclusionsByAccountIdRequest createGetDataExclusionsByAccountIdRequest() {
        return new GetDataExclusionsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetDataExclusionsByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetDataExclusionsByAccountIdResponse }
     */
    public GetDataExclusionsByAccountIdResponse createGetDataExclusionsByAccountIdResponse() {
        return new GetDataExclusionsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link AddSeasonalityAdjustmentsRequest }
     * 
     * @return
     *     the new instance of {@link AddSeasonalityAdjustmentsRequest }
     */
    public AddSeasonalityAdjustmentsRequest createAddSeasonalityAdjustmentsRequest() {
        return new AddSeasonalityAdjustmentsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSeasonalityAdjustment }
     * 
     * @return
     *     the new instance of {@link ArrayOfSeasonalityAdjustment }
     */
    public ArrayOfSeasonalityAdjustment createArrayOfSeasonalityAdjustment() {
        return new ArrayOfSeasonalityAdjustment();
    }

    /**
     * Create an instance of {@link SeasonalityAdjustment }
     * 
     * @return
     *     the new instance of {@link SeasonalityAdjustment }
     */
    public SeasonalityAdjustment createSeasonalityAdjustment() {
        return new SeasonalityAdjustment();
    }

    /**
     * Create an instance of {@link AddSeasonalityAdjustmentsResponse }
     * 
     * @return
     *     the new instance of {@link AddSeasonalityAdjustmentsResponse }
     */
    public AddSeasonalityAdjustmentsResponse createAddSeasonalityAdjustmentsResponse() {
        return new AddSeasonalityAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link UpdateSeasonalityAdjustmentsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateSeasonalityAdjustmentsRequest }
     */
    public UpdateSeasonalityAdjustmentsRequest createUpdateSeasonalityAdjustmentsRequest() {
        return new UpdateSeasonalityAdjustmentsRequest();
    }

    /**
     * Create an instance of {@link UpdateSeasonalityAdjustmentsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateSeasonalityAdjustmentsResponse }
     */
    public UpdateSeasonalityAdjustmentsResponse createUpdateSeasonalityAdjustmentsResponse() {
        return new UpdateSeasonalityAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link DeleteSeasonalityAdjustmentsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteSeasonalityAdjustmentsRequest }
     */
    public DeleteSeasonalityAdjustmentsRequest createDeleteSeasonalityAdjustmentsRequest() {
        return new DeleteSeasonalityAdjustmentsRequest();
    }

    /**
     * Create an instance of {@link DeleteSeasonalityAdjustmentsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteSeasonalityAdjustmentsResponse }
     */
    public DeleteSeasonalityAdjustmentsResponse createDeleteSeasonalityAdjustmentsResponse() {
        return new DeleteSeasonalityAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link GetSeasonalityAdjustmentsByIdsRequest }
     * 
     * @return
     *     the new instance of {@link GetSeasonalityAdjustmentsByIdsRequest }
     */
    public GetSeasonalityAdjustmentsByIdsRequest createGetSeasonalityAdjustmentsByIdsRequest() {
        return new GetSeasonalityAdjustmentsByIdsRequest();
    }

    /**
     * Create an instance of {@link GetSeasonalityAdjustmentsByIdsResponse }
     * 
     * @return
     *     the new instance of {@link GetSeasonalityAdjustmentsByIdsResponse }
     */
    public GetSeasonalityAdjustmentsByIdsResponse createGetSeasonalityAdjustmentsByIdsResponse() {
        return new GetSeasonalityAdjustmentsByIdsResponse();
    }

    /**
     * Create an instance of {@link GetSeasonalityAdjustmentsByAccountIdRequest }
     * 
     * @return
     *     the new instance of {@link GetSeasonalityAdjustmentsByAccountIdRequest }
     */
    public GetSeasonalityAdjustmentsByAccountIdRequest createGetSeasonalityAdjustmentsByAccountIdRequest() {
        return new GetSeasonalityAdjustmentsByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetSeasonalityAdjustmentsByAccountIdResponse }
     * 
     * @return
     *     the new instance of {@link GetSeasonalityAdjustmentsByAccountIdResponse }
     */
    public GetSeasonalityAdjustmentsByAccountIdResponse createGetSeasonalityAdjustmentsByAccountIdResponse() {
        return new GetSeasonalityAdjustmentsByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfstringstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValuePairOfstringstring }
     */
    public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring() {
        return new ArrayOfKeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringstring }
     * 
     * @return
     *     the new instance of {@link KeyValuePairOfstringstring }
     */
    public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
        return new KeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     */
    public ArrayOfArrayOfKeyValuePairOfstringstring createArrayOfArrayOfKeyValuePairOfstringstring() {
        return new ArrayOfArrayOfKeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link KeyValuePairOflonglong }
     * 
     * @return
     *     the new instance of {@link KeyValuePairOflonglong }
     */
    public KeyValuePairOflonglong createKeyValuePairOflonglong() {
        return new KeyValuePairOflonglong();
    }

    /**
     * Create an instance of {@link Char }
     * 
     * @return
     *     the new instance of {@link Char }
     */
    public Char createChar() {
        return new Char();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     * @return
     *     the new instance of {@link Duration }
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Guid }
     * 
     * @return
     *     the new instance of {@link Guid }
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link AdApiFaultDetail }
     * 
     * @return
     *     the new instance of {@link AdApiFaultDetail }
     */
    public AdApiFaultDetail createAdApiFaultDetail() {
        return new AdApiFaultDetail();
    }

    /**
     * Create an instance of {@link ApplicationFault }
     * 
     * @return
     *     the new instance of {@link ApplicationFault }
     */
    public ApplicationFault createApplicationFault() {
        return new ApplicationFault();
    }

    /**
     * Create an instance of {@link ArrayOfAdApiError }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdApiError }
     */
    public ArrayOfAdApiError createArrayOfAdApiError() {
        return new ArrayOfAdApiError();
    }

    /**
     * Create an instance of {@link AdApiError }
     * 
     * @return
     *     the new instance of {@link AdApiError }
     */
    public AdApiError createAdApiError() {
        return new AdApiError();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TextAd")
    public JAXBElement<TextAd> createTextAd(TextAd value) {
        return new JAXBElement<>(_TextAd_QNAME, TextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ad }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Ad")
    public JAXBElement<Ad> createAd(Ad value) {
        return new JAXBElement<>(_Ad_QNAME, Ad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdEditorialStatus")
    public JAXBElement<AdEditorialStatus> createAdEditorialStatus(AdEditorialStatus value) {
        return new JAXBElement<>(_AdEditorialStatus_QNAME, AdEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppUrl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAppUrl }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAppUrl")
    public JAXBElement<ArrayOfAppUrl> createArrayOfAppUrl(ArrayOfAppUrl value) {
        return new JAXBElement<>(_ArrayOfAppUrl_QNAME, ArrayOfAppUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUrl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppUrl }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AppUrl")
    public JAXBElement<AppUrl> createAppUrl(AppUrl value) {
        return new JAXBElement<>(_AppUrl_QNAME, AppUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdStatus")
    public JAXBElement<AdStatus> createAdStatus(AdStatus value) {
        return new JAXBElement<>(_AdStatus_QNAME, AdStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdType")
    public JAXBElement<AdType> createAdType(AdType value) {
        return new JAXBElement<>(_AdType_QNAME, AdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomParameters }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomParameters")
    public JAXBElement<CustomParameters> createCustomParameters(CustomParameters value) {
        return new JAXBElement<>(_CustomParameters_QNAME, CustomParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomParameter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCustomParameter")
    public JAXBElement<ArrayOfCustomParameter> createArrayOfCustomParameter(ArrayOfCustomParameter value) {
        return new JAXBElement<>(_ArrayOfCustomParameter_QNAME, ArrayOfCustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomParameter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomParameter")
    public JAXBElement<CustomParameter> createCustomParameter(CustomParameter value) {
        return new JAXBElement<>(_CustomParameter_QNAME, CustomParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductAd")
    public JAXBElement<ProductAd> createProductAd(ProductAd value) {
        return new JAXBElement<>(_ProductAd_QNAME, ProductAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelAd")
    public JAXBElement<HotelAd> createHotelAd(HotelAd value) {
        return new JAXBElement<>(_HotelAd_QNAME, HotelAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppInstallAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AppInstallAd")
    public JAXBElement<AppInstallAd> createAppInstallAd(AppInstallAd value) {
        return new JAXBElement<>(_AppInstallAd_QNAME, AppInstallAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpandedTextAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExpandedTextAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ExpandedTextAd")
    public JAXBElement<ExpandedTextAd> createExpandedTextAd(ExpandedTextAd value) {
        return new JAXBElement<>(_ExpandedTextAd_QNAME, ExpandedTextAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DynamicSearchAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DynamicSearchAd")
    public JAXBElement<DynamicSearchAd> createDynamicSearchAd(DynamicSearchAd value) {
        return new JAXBElement<>(_DynamicSearchAd_QNAME, DynamicSearchAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiveAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsiveAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ResponsiveAd")
    public JAXBElement<ResponsiveAd> createResponsiveAd(ResponsiveAd value) {
        return new JAXBElement<>(_ResponsiveAd_QNAME, ResponsiveAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdSubType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdSubType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdSubType")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AdSubType>> createAdSubType(Collection<AdSubType> value) {
        return new JAXBElement<>(_AdSubType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallToAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CallToAction")
    public JAXBElement<CallToAction> createCallToAction(CallToAction value) {
        return new JAXBElement<>(_CallToAction_QNAME, CallToAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanguageName }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LanguageName")
    public JAXBElement<LanguageName> createLanguageName(LanguageName value) {
        return new JAXBElement<>(_LanguageName_QNAME, LanguageName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetLink }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetLink")
    public JAXBElement<ArrayOfAssetLink> createArrayOfAssetLink(ArrayOfAssetLink value) {
        return new JAXBElement<>(_ArrayOfAssetLink_QNAME, ArrayOfAssetLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetLink }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetLink")
    public JAXBElement<AssetLink> createAssetLink(AssetLink value) {
        return new JAXBElement<>(_AssetLink_QNAME, AssetLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Asset")
    public JAXBElement<Asset> createAsset(Asset value) {
        return new JAXBElement<>(_Asset_QNAME, Asset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextAsset }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextAsset }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TextAsset")
    public JAXBElement<TextAsset> createTextAsset(TextAsset value) {
        return new JAXBElement<>(_TextAsset_QNAME, TextAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAsset }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageAsset }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImageAsset")
    public JAXBElement<ImageAsset> createImageAsset(ImageAsset value) {
        return new JAXBElement<>(_ImageAsset_QNAME, ImageAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoAsset }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoAsset }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VideoAsset")
    public JAXBElement<VideoAsset> createVideoAsset(VideoAsset value) {
        return new JAXBElement<>(_VideoAsset_QNAME, VideoAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetLinkEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetLinkEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetLinkEditorialStatus")
    public JAXBElement<AssetLinkEditorialStatus> createAssetLinkEditorialStatus(AssetLinkEditorialStatus value) {
        return new JAXBElement<>(_AssetLinkEditorialStatus_QNAME, AssetLinkEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifiedTrackingSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerifiedTrackingSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VerifiedTrackingSetting")
    public JAXBElement<VerifiedTrackingSetting> createVerifiedTrackingSetting(VerifiedTrackingSetting value) {
        return new JAXBElement<>(_VerifiedTrackingSetting_QNAME, VerifiedTrackingSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Setting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Setting")
    public JAXBElement<Setting> createSetting(Setting value) {
        return new JAXBElement<>(_Setting_QNAME, Setting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShoppingSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ShoppingSetting")
    public JAXBElement<ShoppingSetting> createShoppingSetting(ShoppingSetting value) {
        return new JAXBElement<>(_ShoppingSetting_QNAME, ShoppingSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFeedSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DynamicFeedSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DynamicFeedSetting")
    public JAXBElement<DynamicFeedSetting> createDynamicFeedSetting(DynamicFeedSetting value) {
        return new JAXBElement<>(_DynamicFeedSetting_QNAME, DynamicFeedSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DynamicSearchAdsSetting")
    public JAXBElement<DynamicSearchAdsSetting> createDynamicSearchAdsSetting(DynamicSearchAdsSetting value) {
        return new JAXBElement<>(_DynamicSearchAdsSetting_QNAME, DynamicSearchAdsSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSource }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DynamicSearchAdsSource }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DynamicSearchAdsSource")
    public JAXBElement<DynamicSearchAdsSource> createDynamicSearchAdsSource(DynamicSearchAdsSource value) {
        return new JAXBElement<>(_DynamicSearchAdsSource_QNAME, DynamicSearchAdsSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TargetSetting")
    public JAXBElement<TargetSetting> createTargetSetting(TargetSetting value) {
        return new JAXBElement<>(_TargetSetting_QNAME, TargetSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetSettingDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTargetSettingDetail }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfTargetSettingDetail")
    public JAXBElement<ArrayOfTargetSettingDetail> createArrayOfTargetSettingDetail(ArrayOfTargetSettingDetail value) {
        return new JAXBElement<>(_ArrayOfTargetSettingDetail_QNAME, ArrayOfTargetSettingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetSettingDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetSettingDetail }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TargetSettingDetail")
    public JAXBElement<TargetSettingDetail> createTargetSettingDetail(TargetSettingDetail value) {
        return new JAXBElement<>(_TargetSettingDetail_QNAME, TargetSettingDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionTypeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CriterionTypeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CriterionTypeGroup")
    public JAXBElement<CriterionTypeGroup> createCriterionTypeGroup(CriterionTypeGroup value) {
        return new JAXBElement<>(_CriterionTypeGroup_QNAME, CriterionTypeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoOpSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoOpSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CoOpSetting")
    public JAXBElement<CoOpSetting> createCoOpSetting(CoOpSetting value) {
        return new JAXBElement<>(_CoOpSetting_QNAME, CoOpSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidOption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BidOption")
    public JAXBElement<BidOption> createBidOption(BidOption value) {
        return new JAXBElement<>(_BidOption_QNAME, BidOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclaimerSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisclaimerSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DisclaimerSetting")
    public JAXBElement<DisclaimerSetting> createDisclaimerSetting(DisclaimerSetting value) {
        return new JAXBElement<>(_DisclaimerSetting_QNAME, DisclaimerSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelSetting")
    public JAXBElement<HotelSetting> createHotelSetting(HotelSetting value) {
        return new JAXBElement<>(_HotelSetting_QNAME, HotelSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link HotelAdGroupType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link HotelAdGroupType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelAdGroupType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<HotelAdGroupType>> createHotelAdGroupType(Collection<HotelAdGroupType> value) {
        return new JAXBElement<>(_HotelAdGroupType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiveSearchAdsSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsiveSearchAdsSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ResponsiveSearchAdsSetting")
    public JAXBElement<ResponsiveSearchAdsSetting> createResponsiveSearchAdsSetting(ResponsiveSearchAdsSetting value) {
        return new JAXBElement<>(_ResponsiveSearchAdsSetting_QNAME, ResponsiveSearchAdsSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceMaxSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerformanceMaxSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PerformanceMaxSetting")
    public JAXBElement<PerformanceMaxSetting> createPerformanceMaxSetting(PerformanceMaxSetting value) {
        return new JAXBElement<>(_PerformanceMaxSetting_QNAME, PerformanceMaxSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToActionSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallToActionSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CallToActionSetting")
    public JAXBElement<CallToActionSetting> createCallToActionSetting(CallToActionSetting value) {
        return new JAXBElement<>(_CallToActionSetting_QNAME, CallToActionSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VanityPharmaSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VanityPharmaSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VanityPharmaSetting")
    public JAXBElement<VanityPharmaSetting> createVanityPharmaSetting(VanityPharmaSetting value) {
        return new JAXBElement<>(_VanityPharmaSetting_QNAME, VanityPharmaSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VanityPharmaDisplayUrlMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VanityPharmaDisplayUrlMode }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VanityPharmaDisplayUrlMode")
    public JAXBElement<VanityPharmaDisplayUrlMode> createVanityPharmaDisplayUrlMode(VanityPharmaDisplayUrlMode value) {
        return new JAXBElement<>(_VanityPharmaDisplayUrlMode_QNAME, VanityPharmaDisplayUrlMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VanityPharmaWebsiteDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VanityPharmaWebsiteDescription }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VanityPharmaWebsiteDescription")
    public JAXBElement<VanityPharmaWebsiteDescription> createVanityPharmaWebsiteDescription(VanityPharmaWebsiteDescription value) {
        return new JAXBElement<>(_VanityPharmaWebsiteDescription_QNAME, VanityPharmaWebsiteDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiveSearchAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsiveSearchAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ResponsiveSearchAd")
    public JAXBElement<ResponsiveSearchAd> createResponsiveSearchAd(ResponsiveSearchAd value) {
        return new JAXBElement<>(_ResponsiveSearchAd_QNAME, ResponsiveSearchAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaign }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaign")
    public JAXBElement<ArrayOfCampaign> createArrayOfCampaign(ArrayOfCampaign value) {
        return new JAXBElement<>(_ArrayOfCampaign_QNAME, ArrayOfCampaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Campaign")
    public JAXBElement<Campaign> createCampaign(Campaign value) {
        return new JAXBElement<>(_Campaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BiddingScheme")
    public JAXBElement<BiddingScheme> createBiddingScheme(BiddingScheme value) {
        return new JAXBElement<>(_BiddingScheme_QNAME, BiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxClicksBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaxClicksBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MaxClicksBiddingScheme")
    public JAXBElement<MaxClicksBiddingScheme> createMaxClicksBiddingScheme(MaxClicksBiddingScheme value) {
        return new JAXBElement<>(_MaxClicksBiddingScheme_QNAME, MaxClicksBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bid }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Bid")
    public JAXBElement<Bid> createBid(Bid value) {
        return new JAXBElement<>(_Bid_QNAME, Bid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxConversionsBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaxConversionsBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MaxConversionsBiddingScheme")
    public JAXBElement<MaxConversionsBiddingScheme> createMaxConversionsBiddingScheme(MaxConversionsBiddingScheme value) {
        return new JAXBElement<>(_MaxConversionsBiddingScheme_QNAME, MaxConversionsBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCpaBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetCpaBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TargetCpaBiddingScheme")
    public JAXBElement<TargetCpaBiddingScheme> createTargetCpaBiddingScheme(TargetCpaBiddingScheme value) {
        return new JAXBElement<>(_TargetCpaBiddingScheme_QNAME, TargetCpaBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpcBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManualCpcBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ManualCpcBiddingScheme")
    public JAXBElement<ManualCpcBiddingScheme> createManualCpcBiddingScheme(ManualCpcBiddingScheme value) {
        return new JAXBElement<>(_ManualCpcBiddingScheme_QNAME, ManualCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCpcBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnhancedCpcBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EnhancedCpcBiddingScheme")
    public JAXBElement<EnhancedCpcBiddingScheme> createEnhancedCpcBiddingScheme(EnhancedCpcBiddingScheme value) {
        return new JAXBElement<>(_EnhancedCpcBiddingScheme_QNAME, EnhancedCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpvBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManualCpvBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ManualCpvBiddingScheme")
    public JAXBElement<ManualCpvBiddingScheme> createManualCpvBiddingScheme(ManualCpvBiddingScheme value) {
        return new JAXBElement<>(_ManualCpvBiddingScheme_QNAME, ManualCpvBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpmBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManualCpmBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ManualCpmBiddingScheme")
    public JAXBElement<ManualCpmBiddingScheme> createManualCpmBiddingScheme(ManualCpmBiddingScheme value) {
        return new JAXBElement<>(_ManualCpmBiddingScheme_QNAME, ManualCpmBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InheritFromParentBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InheritFromParentBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "InheritFromParentBiddingScheme")
    public JAXBElement<InheritFromParentBiddingScheme> createInheritFromParentBiddingScheme(InheritFromParentBiddingScheme value) {
        return new JAXBElement<>(_InheritFromParentBiddingScheme_QNAME, InheritFromParentBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetRoasBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetRoasBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TargetRoasBiddingScheme")
    public JAXBElement<TargetRoasBiddingScheme> createTargetRoasBiddingScheme(TargetRoasBiddingScheme value) {
        return new JAXBElement<>(_TargetRoasBiddingScheme_QNAME, TargetRoasBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxRoasBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaxRoasBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MaxRoasBiddingScheme")
    public JAXBElement<MaxRoasBiddingScheme> createMaxRoasBiddingScheme(MaxRoasBiddingScheme value) {
        return new JAXBElement<>(_MaxRoasBiddingScheme_QNAME, MaxRoasBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxConversionValueBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaxConversionValueBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MaxConversionValueBiddingScheme")
    public JAXBElement<MaxConversionValueBiddingScheme> createMaxConversionValueBiddingScheme(MaxConversionValueBiddingScheme value) {
        return new JAXBElement<>(_MaxConversionValueBiddingScheme_QNAME, MaxConversionValueBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetImpressionShareBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TargetImpressionShareBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TargetImpressionShareBiddingScheme")
    public JAXBElement<TargetImpressionShareBiddingScheme> createTargetImpressionShareBiddingScheme(TargetImpressionShareBiddingScheme value) {
        return new JAXBElement<>(_TargetImpressionShareBiddingScheme_QNAME, TargetImpressionShareBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PercentCpcBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PercentCpcBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PercentCpcBiddingScheme")
    public JAXBElement<PercentCpcBiddingScheme> createPercentCpcBiddingScheme(PercentCpcBiddingScheme value) {
        return new JAXBElement<>(_PercentCpcBiddingScheme_QNAME, PercentCpcBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommissionBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CommissionBiddingScheme")
    public JAXBElement<CommissionBiddingScheme> createCommissionBiddingScheme(CommissionBiddingScheme value) {
        return new JAXBElement<>(_CommissionBiddingScheme_QNAME, CommissionBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualCpaBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManualCpaBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ManualCpaBiddingScheme")
    public JAXBElement<ManualCpaBiddingScheme> createManualCpaBiddingScheme(ManualCpaBiddingScheme value) {
        return new JAXBElement<>(_ManualCpaBiddingScheme_QNAME, ManualCpaBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostPerSaleBiddingScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CostPerSaleBiddingScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CostPerSaleBiddingScheme")
    public JAXBElement<CostPerSaleBiddingScheme> createCostPerSaleBiddingScheme(CostPerSaleBiddingScheme value) {
        return new JAXBElement<>(_CostPerSaleBiddingScheme_QNAME, CostPerSaleBiddingScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignStatus")
    public JAXBElement<CampaignStatus> createCampaignStatus(CampaignStatus value) {
        return new JAXBElement<>(_CampaignStatus_QNAME, CampaignStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignType")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<CampaignType>> createCampaignType(Collection<CampaignType> value) {
        return new JAXBElement<>(_CampaignType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSetting }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfSetting")
    public JAXBElement<ArrayOfSetting> createArrayOfSetting(ArrayOfSetting value) {
        return new JAXBElement<>(_ArrayOfSetting_QNAME, ArrayOfSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditorialError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EditorialError")
    public JAXBElement<EditorialError> createEditorialError(EditorialError value) {
        return new JAXBElement<>(_EditorialError_QNAME, EditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignAdditionalField")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<CampaignAdditionalField>> createCampaignAdditionalField(Collection<CampaignAdditionalField> value) {
        return new JAXBElement<>(_CampaignAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignNegativeSites }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignNegativeSites }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignNegativeSites")
    public JAXBElement<ArrayOfCampaignNegativeSites> createArrayOfCampaignNegativeSites(ArrayOfCampaignNegativeSites value) {
        return new JAXBElement<>(_ArrayOfCampaignNegativeSites_QNAME, ArrayOfCampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignNegativeSites }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignNegativeSites }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignNegativeSites")
    public JAXBElement<CampaignNegativeSites> createCampaignNegativeSites(CampaignNegativeSites value) {
        return new JAXBElement<>(_CampaignNegativeSites_QNAME, CampaignNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdGroup")
    public JAXBElement<ArrayOfAdGroup> createArrayOfAdGroup(ArrayOfAdGroup value) {
        return new JAXBElement<>(_ArrayOfAdGroup_QNAME, ArrayOfAdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroup")
    public JAXBElement<AdGroup> createAdGroup(AdGroup value) {
        return new JAXBElement<>(_AdGroup_QNAME, AdGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdRotation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdRotation")
    public JAXBElement<AdRotation> createAdRotation(AdRotation value) {
        return new JAXBElement<>(_AdRotation_QNAME, AdRotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdRotationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdRotationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdRotationType")
    public JAXBElement<AdRotationType> createAdRotationType(AdRotationType value) {
        return new JAXBElement<>(_AdRotationType_QNAME, AdRotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateBid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RateBid }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RateBid")
    public JAXBElement<RateBid> createRateBid(RateBid value) {
        return new JAXBElement<>(_RateBid_QNAME, RateBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionBid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CriterionBid }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CriterionBid")
    public JAXBElement<CriterionBid> createCriterionBid(CriterionBid value) {
        return new JAXBElement<>(_CriterionBid_QNAME, CriterionBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedBid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FixedBid }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FixedBid")
    public JAXBElement<FixedBid> createFixedBid(FixedBid value) {
        return new JAXBElement<>(_FixedBid_QNAME, FixedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidMultiplier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidMultiplier }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BidMultiplier")
    public JAXBElement<BidMultiplier> createBidMultiplier(BidMultiplier value) {
        return new JAXBElement<>(_BidMultiplier_QNAME, BidMultiplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateAmount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RateAmount }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RateAmount")
    public JAXBElement<RateAmount> createRateAmount(RateAmount value) {
        return new JAXBElement<>(_RateAmount_QNAME, RateAmount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFrequencyCapSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFrequencyCapSettings }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfFrequencyCapSettings")
    public JAXBElement<ArrayOfFrequencyCapSettings> createArrayOfFrequencyCapSettings(ArrayOfFrequencyCapSettings value) {
        return new JAXBElement<>(_ArrayOfFrequencyCapSettings_QNAME, ArrayOfFrequencyCapSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyCapSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FrequencyCapSettings }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FrequencyCapSettings")
    public JAXBElement<FrequencyCapSettings> createFrequencyCapSettings(FrequencyCapSettings value) {
        return new JAXBElement<>(_FrequencyCapSettings_QNAME, FrequencyCapSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyCapTimeGranularity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FrequencyCapTimeGranularity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FrequencyCapTimeGranularity")
    public JAXBElement<FrequencyCapTimeGranularity> createFrequencyCapTimeGranularity(FrequencyCapTimeGranularity value) {
        return new JAXBElement<>(_FrequencyCapTimeGranularity_QNAME, FrequencyCapTimeGranularity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Network }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Network }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Network")
    public JAXBElement<Network> createNetwork(Network value) {
        return new JAXBElement<>(_Network_QNAME, Network.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPrivacyStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupPrivacyStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupPrivacyStatus")
    public JAXBElement<AdGroupPrivacyStatus> createAdGroupPrivacyStatus(AdGroupPrivacyStatus value) {
        return new JAXBElement<>(_AdGroupPrivacyStatus_QNAME, AdGroupPrivacyStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupStatus")
    public JAXBElement<AdGroupStatus> createAdGroupStatus(AdGroupStatus value) {
        return new JAXBElement<>(_AdGroupStatus_QNAME, AdGroupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupAdditionalField")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<AdGroupAdditionalField>> createAdGroupAdditionalField(Collection<AdGroupAdditionalField> value) {
        return new JAXBElement<>(_AdGroupAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupNegativeSites }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupNegativeSites }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdGroupNegativeSites")
    public JAXBElement<ArrayOfAdGroupNegativeSites> createArrayOfAdGroupNegativeSites(ArrayOfAdGroupNegativeSites value) {
        return new JAXBElement<>(_ArrayOfAdGroupNegativeSites_QNAME, ArrayOfAdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupNegativeSites }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupNegativeSites }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupNegativeSites")
    public JAXBElement<AdGroupNegativeSites> createAdGroupNegativeSites(AdGroupNegativeSites value) {
        return new JAXBElement<>(_AdGroupNegativeSites_QNAME, AdGroupNegativeSites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompressionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompressionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CompressionType")
    public JAXBElement<CompressionType> createCompressionType(CompressionType value) {
        return new JAXBElement<>(_CompressionType_QNAME, CompressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAd }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAd")
    public JAXBElement<ArrayOfAd> createArrayOfAd(ArrayOfAd value) {
        return new JAXBElement<>(_ArrayOfAd_QNAME, ArrayOfAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialApiFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditorialApiFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EditorialApiFaultDetail")
    public JAXBElement<EditorialApiFaultDetail> createEditorialApiFaultDetail(EditorialApiFaultDetail value) {
        return new JAXBElement<>(_EditorialApiFaultDetail_QNAME, EditorialApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfEditorialError")
    public JAXBElement<ArrayOfEditorialError> createArrayOfEditorialError(ArrayOfEditorialError value) {
        return new JAXBElement<>(_ArrayOfEditorialError_QNAME, ArrayOfEditorialError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdType")
    public JAXBElement<ArrayOfAdType> createArrayOfAdType(ArrayOfAdType value) {
        return new JAXBElement<>(_ArrayOfAdType_QNAME, ArrayOfAdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdAdditionalField")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<AdAdditionalField>> createAdAdditionalField(Collection<AdAdditionalField> value) {
        return new JAXBElement<>(_AdAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfKeyword")
    public JAXBElement<ArrayOfKeyword> createArrayOfKeyword(ArrayOfKeyword value) {
        return new JAXBElement<>(_ArrayOfKeyword_QNAME, ArrayOfKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Keyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Keyword")
    public JAXBElement<Keyword> createKeyword(Keyword value) {
        return new JAXBElement<>(_Keyword_QNAME, Keyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "KeywordEditorialStatus")
    public JAXBElement<KeywordEditorialStatus> createKeywordEditorialStatus(KeywordEditorialStatus value) {
        return new JAXBElement<>(_KeywordEditorialStatus_QNAME, KeywordEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MatchType")
    public JAXBElement<MatchType> createMatchType(MatchType value) {
        return new JAXBElement<>(_MatchType_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "KeywordStatus")
    public JAXBElement<KeywordStatus> createKeywordStatus(KeywordStatus value) {
        return new JAXBElement<>(_KeywordStatus_QNAME, KeywordStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityIdToParentIdAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityIdToParentIdAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfEntityIdToParentIdAssociation")
    public JAXBElement<ArrayOfEntityIdToParentIdAssociation> createArrayOfEntityIdToParentIdAssociation(ArrayOfEntityIdToParentIdAssociation value) {
        return new JAXBElement<>(_ArrayOfEntityIdToParentIdAssociation_QNAME, ArrayOfEntityIdToParentIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdToParentIdAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityIdToParentIdAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EntityIdToParentIdAssociation")
    public JAXBElement<EntityIdToParentIdAssociation> createEntityIdToParentIdAssociation(EntityIdToParentIdAssociation value) {
        return new JAXBElement<>(_EntityIdToParentIdAssociation_QNAME, EntityIdToParentIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EntityType")
    public JAXBElement<EntityType> createEntityType(EntityType value) {
        return new JAXBElement<>(_EntityType_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfEditorialReasonCollection")
    public JAXBElement<ArrayOfEditorialReasonCollection> createArrayOfEditorialReasonCollection(ArrayOfEditorialReasonCollection value) {
        return new JAXBElement<>(_ArrayOfEditorialReasonCollection_QNAME, ArrayOfEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EditorialReasonCollection")
    public JAXBElement<EditorialReasonCollection> createEditorialReasonCollection(EditorialReasonCollection value) {
        return new JAXBElement<>(_EditorialReasonCollection_QNAME, EditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppealStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppealStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AppealStatus")
    public JAXBElement<AppealStatus> createAppealStatus(AppealStatus value) {
        return new JAXBElement<>(_AppealStatus_QNAME, AppealStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfEditorialReason")
    public JAXBElement<ArrayOfEditorialReason> createArrayOfEditorialReason(ArrayOfEditorialReason value) {
        return new JAXBElement<>(_ArrayOfEditorialReason_QNAME, ArrayOfEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EditorialReason")
    public JAXBElement<EditorialReason> createEditorialReason(EditorialReason value) {
        return new JAXBElement<>(_EditorialReason_QNAME, EditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountMigrationStatusesInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountMigrationStatusesInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAccountMigrationStatusesInfo")
    public JAXBElement<ArrayOfAccountMigrationStatusesInfo> createArrayOfAccountMigrationStatusesInfo(ArrayOfAccountMigrationStatusesInfo value) {
        return new JAXBElement<>(_ArrayOfAccountMigrationStatusesInfo_QNAME, ArrayOfAccountMigrationStatusesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountMigrationStatusesInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountMigrationStatusesInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AccountMigrationStatusesInfo")
    public JAXBElement<AccountMigrationStatusesInfo> createAccountMigrationStatusesInfo(AccountMigrationStatusesInfo value) {
        return new JAXBElement<>(_AccountMigrationStatusesInfo_QNAME, AccountMigrationStatusesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMigrationStatusInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMigrationStatusInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfMigrationStatusInfo")
    public JAXBElement<ArrayOfMigrationStatusInfo> createArrayOfMigrationStatusInfo(ArrayOfMigrationStatusInfo value) {
        return new JAXBElement<>(_ArrayOfMigrationStatusInfo_QNAME, ArrayOfMigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatusInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MigrationStatusInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MigrationStatusInfo")
    public JAXBElement<MigrationStatusInfo> createMigrationStatusInfo(MigrationStatusInfo value) {
        return new JAXBElement<>(_MigrationStatusInfo_QNAME, MigrationStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MigrationStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MigrationStatus")
    public JAXBElement<MigrationStatus> createMigrationStatus(MigrationStatus value) {
        return new JAXBElement<>(_MigrationStatus_QNAME, MigrationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountProperty }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAccountProperty")
    public JAXBElement<ArrayOfAccountProperty> createArrayOfAccountProperty(ArrayOfAccountProperty value) {
        return new JAXBElement<>(_ArrayOfAccountProperty_QNAME, ArrayOfAccountProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountProperty }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AccountProperty")
    public JAXBElement<AccountProperty> createAccountProperty(AccountProperty value) {
        return new JAXBElement<>(_AccountProperty_QNAME, AccountProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPropertyName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountPropertyName }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AccountPropertyName")
    public JAXBElement<AccountPropertyName> createAccountPropertyName(AccountPropertyName value) {
        return new JAXBElement<>(_AccountPropertyName_QNAME, AccountPropertyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPropertyName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPropertyName }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAccountPropertyName")
    public JAXBElement<ArrayOfAccountPropertyName> createArrayOfAccountPropertyName(ArrayOfAccountPropertyName value) {
        return new JAXBElement<>(_ArrayOfAccountPropertyName_QNAME, ArrayOfAccountPropertyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtension")
    public JAXBElement<ArrayOfAdExtension> createArrayOfAdExtension(ArrayOfAdExtension value) {
        return new JAXBElement<>(_ArrayOfAdExtension_QNAME, ArrayOfAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtension")
    public JAXBElement<AdExtension> createAdExtension(AdExtension value) {
        return new JAXBElement<>(_AdExtension_QNAME, AdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Schedule")
    public JAXBElement<Schedule> createSchedule(Schedule value) {
        return new JAXBElement<>(_Schedule_QNAME, Schedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTime }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfDayTime")
    public JAXBElement<ArrayOfDayTime> createArrayOfDayTime(ArrayOfDayTime value) {
        return new JAXBElement<>(_ArrayOfDayTime_QNAME, ArrayOfDayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayTime }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DayTime")
    public JAXBElement<DayTime> createDayTime(DayTime value) {
        return new JAXBElement<>(_DayTime_QNAME, DayTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Day }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Day }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Day")
    public JAXBElement<Day> createDay(Day value) {
        return new JAXBElement<>(_Day_QNAME, Day.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Minute }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Minute")
    public JAXBElement<Minute> createMinute(Minute value) {
        return new JAXBElement<>(_Minute_QNAME, Minute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionStatus")
    public JAXBElement<AdExtensionStatus> createAdExtensionStatus(AdExtensionStatus value) {
        return new JAXBElement<>(_AdExtensionStatus_QNAME, AdExtensionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LocationAdExtension")
    public JAXBElement<LocationAdExtension> createLocationAdExtension(LocationAdExtension value) {
        return new JAXBElement<>(_LocationAdExtension_QNAME, LocationAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessGeoCodeStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessGeoCodeStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BusinessGeoCodeStatus")
    public JAXBElement<BusinessGeoCodeStatus> createBusinessGeoCodeStatus(BusinessGeoCodeStatus value) {
        return new JAXBElement<>(_BusinessGeoCodeStatus_QNAME, BusinessGeoCodeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GeoPoint")
    public JAXBElement<GeoPoint> createGeoPoint(GeoPoint value) {
        return new JAXBElement<>(_GeoPoint_QNAME, GeoPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CallAdExtension")
    public JAXBElement<CallAdExtension> createCallAdExtension(CallAdExtension value) {
        return new JAXBElement<>(_CallAdExtension_QNAME, CallAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImageAdExtension")
    public JAXBElement<ImageAdExtension> createImageAdExtension(ImageAdExtension value) {
        return new JAXBElement<>(_ImageAdExtension_QNAME, ImageAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AppAdExtension")
    public JAXBElement<AppAdExtension> createAppAdExtension(AppAdExtension value) {
        return new JAXBElement<>(_AppAdExtension_QNAME, AppAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviewAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReviewAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ReviewAdExtension")
    public JAXBElement<ReviewAdExtension> createReviewAdExtension(ReviewAdExtension value) {
        return new JAXBElement<>(_ReviewAdExtension_QNAME, ReviewAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalloutAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalloutAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CalloutAdExtension")
    public JAXBElement<CalloutAdExtension> createCalloutAdExtension(CalloutAdExtension value) {
        return new JAXBElement<>(_CalloutAdExtension_QNAME, CalloutAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitelinkAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SitelinkAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SitelinkAdExtension")
    public JAXBElement<SitelinkAdExtension> createSitelinkAdExtension(SitelinkAdExtension value) {
        return new JAXBElement<>(_SitelinkAdExtension_QNAME, SitelinkAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActionAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ActionAdExtension")
    public JAXBElement<ActionAdExtension> createActionAdExtension(ActionAdExtension value) {
        return new JAXBElement<>(_ActionAdExtension_QNAME, ActionAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionAdExtensionActionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActionAdExtensionActionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ActionAdExtensionActionType")
    public JAXBElement<ActionAdExtensionActionType> createActionAdExtensionActionType(ActionAdExtensionActionType value) {
        return new JAXBElement<>(_ActionAdExtensionActionType_QNAME, ActionAdExtensionActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSnippetAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructuredSnippetAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "StructuredSnippetAdExtension")
    public JAXBElement<StructuredSnippetAdExtension> createStructuredSnippetAdExtension(StructuredSnippetAdExtension value) {
        return new JAXBElement<>(_StructuredSnippetAdExtension_QNAME, StructuredSnippetAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PriceAdExtension")
    public JAXBElement<PriceAdExtension> createPriceAdExtension(PriceAdExtension value) {
        return new JAXBElement<>(_PriceAdExtension_QNAME, PriceAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PriceExtensionType")
    public JAXBElement<PriceExtensionType> createPriceExtensionType(PriceExtensionType value) {
        return new JAXBElement<>(_PriceExtensionType_QNAME, PriceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceTableRow }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceTableRow }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfPriceTableRow")
    public JAXBElement<ArrayOfPriceTableRow> createArrayOfPriceTableRow(ArrayOfPriceTableRow value) {
        return new JAXBElement<>(_ArrayOfPriceTableRow_QNAME, ArrayOfPriceTableRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceTableRow }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceTableRow }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PriceTableRow")
    public JAXBElement<PriceTableRow> createPriceTableRow(PriceTableRow value) {
        return new JAXBElement<>(_PriceTableRow_QNAME, PriceTableRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceQualifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceQualifier }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PriceQualifier")
    public JAXBElement<PriceQualifier> createPriceQualifier(PriceQualifier value) {
        return new JAXBElement<>(_PriceQualifier_QNAME, PriceQualifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PriceUnit")
    public JAXBElement<PriceUnit> createPriceUnit(PriceUnit value) {
        return new JAXBElement<>(_PriceUnit_QNAME, PriceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PromotionAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PromotionAdExtension")
    public JAXBElement<PromotionAdExtension> createPromotionAdExtension(PromotionAdExtension value) {
        return new JAXBElement<>(_PromotionAdExtension_QNAME, PromotionAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionDiscountModifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PromotionDiscountModifier }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PromotionDiscountModifier")
    public JAXBElement<PromotionDiscountModifier> createPromotionDiscountModifier(PromotionDiscountModifier value) {
        return new JAXBElement<>(_PromotionDiscountModifier_QNAME, PromotionDiscountModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionOccasion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PromotionOccasion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PromotionOccasion")
    public JAXBElement<PromotionOccasion> createPromotionOccasion(PromotionOccasion value) {
        return new JAXBElement<>(_PromotionOccasion_QNAME, PromotionOccasion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterLinkAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterLinkAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FilterLinkAdExtension")
    public JAXBElement<FilterLinkAdExtension> createFilterLinkAdExtension(FilterLinkAdExtension value) {
        return new JAXBElement<>(_FilterLinkAdExtension_QNAME, FilterLinkAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionHeaderType")
    public JAXBElement<AdExtensionHeaderType> createAdExtensionHeaderType(AdExtensionHeaderType value) {
        return new JAXBElement<>(_AdExtensionHeaderType_QNAME, AdExtensionHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlyerAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlyerAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FlyerAdExtension")
    public JAXBElement<FlyerAdExtension> createFlyerAdExtension(FlyerAdExtension value) {
        return new JAXBElement<>(_FlyerAdExtension_QNAME, FlyerAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "VideoAdExtension")
    public JAXBElement<VideoAdExtension> createVideoAdExtension(VideoAdExtension value) {
        return new JAXBElement<>(_VideoAdExtension_QNAME, VideoAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclaimerAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisclaimerAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DisclaimerAdExtension")
    public JAXBElement<DisclaimerAdExtension> createDisclaimerAdExtension(DisclaimerAdExtension value) {
        return new JAXBElement<>(_DisclaimerAdExtension_QNAME, DisclaimerAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoAdExtension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoAdExtension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LogoAdExtension")
    public JAXBElement<LogoAdExtension> createLogoAdExtension(LogoAdExtension value) {
        return new JAXBElement<>(_LogoAdExtension_QNAME, LogoAdExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionIdentity")
    public JAXBElement<ArrayOfAdExtensionIdentity> createArrayOfAdExtensionIdentity(ArrayOfAdExtensionIdentity value) {
        return new JAXBElement<>(_ArrayOfAdExtensionIdentity_QNAME, ArrayOfAdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionIdentity")
    public JAXBElement<AdExtensionIdentity> createAdExtensionIdentity(AdExtensionIdentity value) {
        return new JAXBElement<>(_AdExtensionIdentity_QNAME, AdExtensionIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchErrorCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchErrorCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfBatchErrorCollection")
    public JAXBElement<ArrayOfBatchErrorCollection> createArrayOfBatchErrorCollection(ArrayOfBatchErrorCollection value) {
        return new JAXBElement<>(_ArrayOfBatchErrorCollection_QNAME, ArrayOfBatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchErrorCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchErrorCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BatchErrorCollection")
    public JAXBElement<BatchErrorCollection> createBatchErrorCollection(BatchErrorCollection value) {
        return new JAXBElement<>(_BatchErrorCollection_QNAME, BatchErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditorialErrorCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditorialErrorCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EditorialErrorCollection")
    public JAXBElement<EditorialErrorCollection> createEditorialErrorCollection(EditorialErrorCollection value) {
        return new JAXBElement<>(_EditorialErrorCollection_QNAME, EditorialErrorCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionsTypeFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionsTypeFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionsTypeFilter")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<AdExtensionsTypeFilter>> createAdExtensionsTypeFilter(Collection<AdExtensionsTypeFilter> value) {
        return new JAXBElement<>(_AdExtensionsTypeFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdExtensionAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionAdditionalField")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<AdExtensionAdditionalField>> createAdExtensionAdditionalField(Collection<AdExtensionAdditionalField> value) {
        return new JAXBElement<>(_AdExtensionAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdToEntityIdAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionIdToEntityIdAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionIdToEntityIdAssociation")
    public JAXBElement<ArrayOfAdExtensionIdToEntityIdAssociation> createArrayOfAdExtensionIdToEntityIdAssociation(ArrayOfAdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<>(_ArrayOfAdExtensionIdToEntityIdAssociation_QNAME, ArrayOfAdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionIdToEntityIdAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionIdToEntityIdAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionIdToEntityIdAssociation")
    public JAXBElement<AdExtensionIdToEntityIdAssociation> createAdExtensionIdToEntityIdAssociation(AdExtensionIdToEntityIdAssociation value) {
        return new JAXBElement<>(_AdExtensionIdToEntityIdAssociation_QNAME, AdExtensionIdToEntityIdAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssociationType")
    public JAXBElement<AssociationType> createAssociationType(AssociationType value) {
        return new JAXBElement<>(_AssociationType_QNAME, AssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionEditorialReasonCollection")
    public JAXBElement<ArrayOfAdExtensionEditorialReasonCollection> createArrayOfAdExtensionEditorialReasonCollection(ArrayOfAdExtensionEditorialReasonCollection value) {
        return new JAXBElement<>(_ArrayOfAdExtensionEditorialReasonCollection_QNAME, ArrayOfAdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionEditorialReasonCollection")
    public JAXBElement<AdExtensionEditorialReasonCollection> createAdExtensionEditorialReasonCollection(AdExtensionEditorialReasonCollection value) {
        return new JAXBElement<>(_AdExtensionEditorialReasonCollection_QNAME, AdExtensionEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionEditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionEditorialReason")
    public JAXBElement<ArrayOfAdExtensionEditorialReason> createArrayOfAdExtensionEditorialReason(ArrayOfAdExtensionEditorialReason value) {
        return new JAXBElement<>(_ArrayOfAdExtensionEditorialReason_QNAME, ArrayOfAdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionEditorialReason")
    public JAXBElement<AdExtensionEditorialReason> createAdExtensionEditorialReason(AdExtensionEditorialReason value) {
        return new JAXBElement<>(_AdExtensionEditorialReason_QNAME, AdExtensionEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociationCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociationCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionAssociationCollection")
    public JAXBElement<ArrayOfAdExtensionAssociationCollection> createArrayOfAdExtensionAssociationCollection(ArrayOfAdExtensionAssociationCollection value) {
        return new JAXBElement<>(_ArrayOfAdExtensionAssociationCollection_QNAME, ArrayOfAdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociationCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociationCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionAssociationCollection")
    public JAXBElement<AdExtensionAssociationCollection> createAdExtensionAssociationCollection(AdExtensionAssociationCollection value) {
        return new JAXBElement<>(_AdExtensionAssociationCollection_QNAME, AdExtensionAssociationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdExtensionAssociation")
    public JAXBElement<ArrayOfAdExtensionAssociation> createArrayOfAdExtensionAssociation(ArrayOfAdExtensionAssociation value) {
        return new JAXBElement<>(_ArrayOfAdExtensionAssociation_QNAME, ArrayOfAdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionAssociation")
    public JAXBElement<AdExtensionAssociation> createAdExtensionAssociation(AdExtensionAssociation value) {
        return new JAXBElement<>(_AdExtensionAssociation_QNAME, AdExtensionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdExtensionEditorialStatus")
    public JAXBElement<AdExtensionEditorialStatus> createAdExtensionEditorialStatus(AdExtensionEditorialStatus value) {
        return new JAXBElement<>(_AdExtensionEditorialStatus_QNAME, AdExtensionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMedia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMedia }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfMedia")
    public JAXBElement<ArrayOfMedia> createArrayOfMedia(ArrayOfMedia value) {
        return new JAXBElement<>(_ArrayOfMedia_QNAME, ArrayOfMedia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Media }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Media }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Media")
    public JAXBElement<Media> createMedia(Media value) {
        return new JAXBElement<>(_Media_QNAME, Media.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Image }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaEnabledEntityFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaEnabledEntityFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MediaEnabledEntityFilter")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<MediaEnabledEntityFilter>> createMediaEnabledEntityFilter(Collection<MediaEnabledEntityFilter> value) {
        return new JAXBElement<>(_MediaEnabledEntityFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link MediaAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MediaAdditionalField")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<MediaAdditionalField>> createMediaAdditionalField(Collection<MediaAdditionalField> value) {
        return new JAXBElement<>(_MediaAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaMetaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaMetaData }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfMediaMetaData")
    public JAXBElement<ArrayOfMediaMetaData> createArrayOfMediaMetaData(ArrayOfMediaMetaData value) {
        return new JAXBElement<>(_ArrayOfMediaMetaData_QNAME, ArrayOfMediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaMetaData }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MediaMetaData")
    public JAXBElement<MediaMetaData> createMediaMetaData(MediaMetaData value) {
        return new JAXBElement<>(_MediaMetaData_QNAME, MediaMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaRepresentation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaRepresentation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfMediaRepresentation")
    public JAXBElement<ArrayOfMediaRepresentation> createArrayOfMediaRepresentation(ArrayOfMediaRepresentation value) {
        return new JAXBElement<>(_ArrayOfMediaRepresentation_QNAME, ArrayOfMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaRepresentation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaRepresentation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MediaRepresentation")
    public JAXBElement<MediaRepresentation> createMediaRepresentation(MediaRepresentation value) {
        return new JAXBElement<>(_MediaRepresentation_QNAME, MediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageMediaRepresentation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImageMediaRepresentation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImageMediaRepresentation")
    public JAXBElement<ImageMediaRepresentation> createImageMediaRepresentation(ImageMediaRepresentation value) {
        return new JAXBElement<>(_ImageMediaRepresentation_QNAME, ImageMediaRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMediaAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfMediaAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfArrayOfMediaAssociation")
    public JAXBElement<ArrayOfArrayOfMediaAssociation> createArrayOfArrayOfMediaAssociation(ArrayOfArrayOfMediaAssociation value) {
        return new JAXBElement<>(_ArrayOfArrayOfMediaAssociation_QNAME, ArrayOfArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMediaAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfMediaAssociation")
    public JAXBElement<ArrayOfMediaAssociation> createArrayOfMediaAssociation(ArrayOfMediaAssociation value) {
        return new JAXBElement<>(_ArrayOfMediaAssociation_QNAME, ArrayOfMediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "MediaAssociation")
    public JAXBElement<MediaAssociation> createMediaAssociation(MediaAssociation value) {
        return new JAXBElement<>(_MediaAssociation_QNAME, MediaAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupCriterionType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupCriterionType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupCriterionType")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<AdGroupCriterionType>> createAdGroupCriterionType(Collection<AdGroupCriterionType> value) {
        return new JAXBElement<>(_AdGroupCriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CriterionAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CriterionAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CriterionAdditionalField")
    @XmlJavaTypeAdapter(Adapter13 .class)
    public JAXBElement<Collection<CriterionAdditionalField>> createCriterionAdditionalField(Collection<CriterionAdditionalField> value) {
        return new JAXBElement<>(_CriterionAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdGroupCriterion")
    public JAXBElement<ArrayOfAdGroupCriterion> createArrayOfAdGroupCriterion(ArrayOfAdGroupCriterion value) {
        return new JAXBElement<>(_ArrayOfAdGroupCriterion_QNAME, ArrayOfAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupCriterion")
    public JAXBElement<AdGroupCriterion> createAdGroupCriterion(AdGroupCriterion value) {
        return new JAXBElement<>(_AdGroupCriterion_QNAME, AdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Criterion")
    public JAXBElement<Criterion> createCriterion(Criterion value) {
        return new JAXBElement<>(_Criterion_QNAME, Criterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartition }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductPartition")
    public JAXBElement<ProductPartition> createProductPartition(ProductPartition value) {
        return new JAXBElement<>(_ProductPartition_QNAME, ProductPartition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCondition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductCondition }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductCondition")
    public JAXBElement<ProductCondition> createProductCondition(ProductCondition value) {
        return new JAXBElement<>(_ProductCondition_QNAME, ProductCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductPartitionType")
    public JAXBElement<ProductPartitionType> createProductPartitionType(ProductPartitionType value) {
        return new JAXBElement<>(_ProductPartitionType_QNAME, ProductPartitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelGroup")
    public JAXBElement<HotelGroup> createHotelGroup(HotelGroup value) {
        return new JAXBElement<>(_HotelGroup_QNAME, HotelGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelListing }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelListing }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelListing")
    public JAXBElement<HotelListing> createHotelListing(HotelListing value) {
        return new JAXBElement<>(_HotelListing_QNAME, HotelListing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelListingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelListingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelListingType")
    public JAXBElement<HotelListingType> createHotelListingType(HotelListingType value) {
        return new JAXBElement<>(_HotelListingType_QNAME, HotelListingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAdvanceBookingWindowCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelAdvanceBookingWindowCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelAdvanceBookingWindowCriterion")
    public JAXBElement<HotelAdvanceBookingWindowCriterion> createHotelAdvanceBookingWindowCriterion(HotelAdvanceBookingWindowCriterion value) {
        return new JAXBElement<>(_HotelAdvanceBookingWindowCriterion_QNAME, HotelAdvanceBookingWindowCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelCheckInDateCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelCheckInDateCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelCheckInDateCriterion")
    public JAXBElement<HotelCheckInDateCriterion> createHotelCheckInDateCriterion(HotelCheckInDateCriterion value) {
        return new JAXBElement<>(_HotelCheckInDateCriterion_QNAME, HotelCheckInDateCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelCheckInDayCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelCheckInDayCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelCheckInDayCriterion")
    public JAXBElement<HotelCheckInDayCriterion> createHotelCheckInDayCriterion(HotelCheckInDayCriterion value) {
        return new JAXBElement<>(_HotelCheckInDayCriterion_QNAME, HotelCheckInDayCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDateSelectionTypeCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelDateSelectionTypeCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelDateSelectionTypeCriterion")
    public JAXBElement<HotelDateSelectionTypeCriterion> createHotelDateSelectionTypeCriterion(HotelDateSelectionTypeCriterion value) {
        return new JAXBElement<>(_HotelDateSelectionTypeCriterion_QNAME, HotelDateSelectionTypeCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDateSelectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelDateSelectionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelDateSelectionType")
    public JAXBElement<HotelDateSelectionType> createHotelDateSelectionType(HotelDateSelectionType value) {
        return new JAXBElement<>(_HotelDateSelectionType_QNAME, HotelDateSelectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelLengthOfStayCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelLengthOfStayCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "HotelLengthOfStayCriterion")
    public JAXBElement<HotelLengthOfStayCriterion> createHotelLengthOfStayCriterion(HotelLengthOfStayCriterion value) {
        return new JAXBElement<>(_HotelLengthOfStayCriterion_QNAME, HotelLengthOfStayCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductScope")
    public JAXBElement<ProductScope> createProductScope(ProductScope value) {
        return new JAXBElement<>(_ProductScope_QNAME, ProductScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCondition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCondition }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfProductCondition")
    public JAXBElement<ArrayOfProductCondition> createArrayOfProductCondition(ArrayOfProductCondition value) {
        return new JAXBElement<>(_ArrayOfProductCondition_QNAME, ArrayOfProductCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Webpage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Webpage }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Webpage")
    public JAXBElement<Webpage> createWebpage(Webpage value) {
        return new JAXBElement<>(_Webpage_QNAME, Webpage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebpageParameter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "WebpageParameter")
    public JAXBElement<WebpageParameter> createWebpageParameter(WebpageParameter value) {
        return new JAXBElement<>(_WebpageParameter_QNAME, WebpageParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWebpageCondition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWebpageCondition }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfWebpageCondition")
    public JAXBElement<ArrayOfWebpageCondition> createArrayOfWebpageCondition(ArrayOfWebpageCondition value) {
        return new JAXBElement<>(_ArrayOfWebpageCondition_QNAME, ArrayOfWebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageCondition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebpageCondition }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "WebpageCondition")
    public JAXBElement<WebpageCondition> createWebpageCondition(WebpageCondition value) {
        return new JAXBElement<>(_WebpageCondition_QNAME, WebpageCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperand }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperand }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "WebpageConditionOperand")
    public JAXBElement<WebpageConditionOperand> createWebpageConditionOperand(WebpageConditionOperand value) {
        return new JAXBElement<>(_WebpageConditionOperand_QNAME, WebpageConditionOperand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebpageConditionOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "WebpageConditionOperator")
    public JAXBElement<WebpageConditionOperator> createWebpageConditionOperator(WebpageConditionOperator value) {
        return new JAXBElement<>(_WebpageConditionOperator_QNAME, WebpageConditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AgeCriterion")
    public JAXBElement<AgeCriterion> createAgeCriterion(AgeCriterion value) {
        return new JAXBElement<>(_AgeCriterion_QNAME, AgeCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeRange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeRange }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AgeRange")
    public JAXBElement<AgeRange> createAgeRange(AgeRange value) {
        return new JAXBElement<>(_AgeRange_QNAME, AgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DeviceCriterion")
    public JAXBElement<DeviceCriterion> createDeviceCriterion(DeviceCriterion value) {
        return new JAXBElement<>(_DeviceCriterion_QNAME, DeviceCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTimeCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayTimeCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DayTimeCriterion")
    public JAXBElement<DayTimeCriterion> createDayTimeCriterion(DayTimeCriterion value) {
        return new JAXBElement<>(_DayTimeCriterion_QNAME, DayTimeCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenderCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GenderCriterion")
    public JAXBElement<GenderCriterion> createGenderCriterion(GenderCriterion value) {
        return new JAXBElement<>(_GenderCriterion_QNAME, GenderCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenderType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GenderType")
    public JAXBElement<GenderType> createGenderType(GenderType value) {
        return new JAXBElement<>(_GenderType_QNAME, GenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RadiusCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RadiusCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RadiusCriterion")
    public JAXBElement<RadiusCriterion> createRadiusCriterion(RadiusCriterion value) {
        return new JAXBElement<>(_RadiusCriterion_QNAME, RadiusCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceUnit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DistanceUnit }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DistanceUnit")
    public JAXBElement<DistanceUnit> createDistanceUnit(DistanceUnit value) {
        return new JAXBElement<>(_DistanceUnit_QNAME, DistanceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LocationCriterion")
    public JAXBElement<LocationCriterion> createLocationCriterion(LocationCriterion value) {
        return new JAXBElement<>(_LocationCriterion_QNAME, LocationCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationIntentCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationIntentCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LocationIntentCriterion")
    public JAXBElement<LocationIntentCriterion> createLocationIntentCriterion(LocationIntentCriterion value) {
        return new JAXBElement<>(_LocationIntentCriterion_QNAME, LocationIntentCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntentOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntentOption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "IntentOption")
    public JAXBElement<IntentOption> createIntentOption(IntentOption value) {
        return new JAXBElement<>(_IntentOption_QNAME, IntentOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceCriterion")
    public JAXBElement<AudienceCriterion> createAudienceCriterion(AudienceCriterion value) {
        return new JAXBElement<>(_AudienceCriterion_QNAME, AudienceCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AudienceType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AudienceType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceType")
    @XmlJavaTypeAdapter(Adapter14 .class)
    public JAXBElement<Collection<AudienceType>> createAudienceType(Collection<AudienceType> value) {
        return new JAXBElement<>(_AudienceType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfileCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProfileCriterion")
    public JAXBElement<ProfileCriterion> createProfileCriterion(ProfileCriterion value) {
        return new JAXBElement<>(_ProfileCriterion_QNAME, ProfileCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProfileType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProfileType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProfileType")
    @XmlJavaTypeAdapter(Adapter15 .class)
    public JAXBElement<Collection<ProfileType>> createProfileType(Collection<ProfileType> value) {
        return new JAXBElement<>(_ProfileType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "StoreCriterion")
    public JAXBElement<StoreCriterion> createStoreCriterion(StoreCriterion value) {
        return new JAXBElement<>(_StoreCriterion_QNAME, StoreCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DealCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DealCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DealCriterion")
    public JAXBElement<DealCriterion> createDealCriterion(DealCriterion value) {
        return new JAXBElement<>(_DealCriterion_QNAME, DealCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenreCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenreCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GenreCriterion")
    public JAXBElement<GenreCriterion> createGenreCriterion(GenreCriterion value) {
        return new JAXBElement<>(_GenreCriterion_QNAME, GenreCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupCriterionStatus")
    public JAXBElement<AdGroupCriterionStatus> createAdGroupCriterionStatus(AdGroupCriterionStatus value) {
        return new JAXBElement<>(_AdGroupCriterionStatus_QNAME, AdGroupCriterionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddableAdGroupCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BiddableAdGroupCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BiddableAdGroupCriterion")
    public JAXBElement<BiddableAdGroupCriterion> createBiddableAdGroupCriterion(BiddableAdGroupCriterion value) {
        return new JAXBElement<>(_BiddableAdGroupCriterion_QNAME, BiddableAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupCriterionEditorialStatus")
    public JAXBElement<AdGroupCriterionEditorialStatus> createAdGroupCriterionEditorialStatus(AdGroupCriterionEditorialStatus value) {
        return new JAXBElement<>(_AdGroupCriterionEditorialStatus_QNAME, AdGroupCriterionEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionCashback }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CriterionCashback }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CriterionCashback")
    public JAXBElement<CriterionCashback> createCriterionCashback(CriterionCashback value) {
        return new JAXBElement<>(_CriterionCashback_QNAME, CriterionCashback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashbackAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashbackAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CashbackAdjustment")
    public JAXBElement<CashbackAdjustment> createCashbackAdjustment(CashbackAdjustment value) {
        return new JAXBElement<>(_CashbackAdjustment_QNAME, CashbackAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeAdGroupCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeAdGroupCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NegativeAdGroupCriterion")
    public JAXBElement<NegativeAdGroupCriterion> createNegativeAdGroupCriterion(NegativeAdGroupCriterion value) {
        return new JAXBElement<>(_NegativeAdGroupCriterion_QNAME, NegativeAdGroupCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterionAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupCriterionAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAdGroupCriterionAction")
    public JAXBElement<ArrayOfAdGroupCriterionAction> createArrayOfAdGroupCriterionAction(ArrayOfAdGroupCriterionAction value) {
        return new JAXBElement<>(_ArrayOfAdGroupCriterionAction_QNAME, ArrayOfAdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupCriterionAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AdGroupCriterionAction")
    public JAXBElement<AdGroupCriterionAction> createAdGroupCriterionAction(AdGroupCriterionAction value) {
        return new JAXBElement<>(_AdGroupCriterionAction_QNAME, AdGroupCriterionAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ItemAction")
    public JAXBElement<ItemAction> createItemAction(ItemAction value) {
        return new JAXBElement<>(_ItemAction_QNAME, ItemAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupListingGroupAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupListingGroupAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroupListingGroupAction")
    public JAXBElement<ArrayOfAssetGroupListingGroupAction> createArrayOfAssetGroupListingGroupAction(ArrayOfAssetGroupListingGroupAction value) {
        return new JAXBElement<>(_ArrayOfAssetGroupListingGroupAction_QNAME, ArrayOfAssetGroupListingGroupAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupListingGroupAction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupListingGroupAction }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupListingGroupAction")
    public JAXBElement<AssetGroupListingGroupAction> createAssetGroupListingGroupAction(AssetGroupListingGroupAction value) {
        return new JAXBElement<>(_AssetGroupListingGroupAction_QNAME, AssetGroupListingGroupAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupListingGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupListingGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupListingGroup")
    public JAXBElement<AssetGroupListingGroup> createAssetGroupListingGroup(AssetGroupListingGroup value) {
        return new JAXBElement<>(_AssetGroupListingGroup_QNAME, AssetGroupListingGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupListingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupListingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupListingType")
    public JAXBElement<AssetGroupListingType> createAssetGroupListingType(AssetGroupListingType value) {
        return new JAXBElement<>(_AssetGroupListingType_QNAME, AssetGroupListingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupListingGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupListingGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroupListingGroup")
    public JAXBElement<ArrayOfAssetGroupListingGroup> createArrayOfAssetGroupListingGroup(ArrayOfAssetGroupListingGroup value) {
        return new JAXBElement<>(_ArrayOfAssetGroupListingGroup_QNAME, ArrayOfAssetGroupListingGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BMCStoreAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BMCStoreAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BMCStoreAdditionalField")
    @XmlJavaTypeAdapter(Adapter16 .class)
    public JAXBElement<Collection<BMCStoreAdditionalField>> createBMCStoreAdditionalField(Collection<BMCStoreAdditionalField> value) {
        return new JAXBElement<>(_BMCStoreAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBMCStore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBMCStore }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfBMCStore")
    public JAXBElement<ArrayOfBMCStore> createArrayOfBMCStore(ArrayOfBMCStore value) {
        return new JAXBElement<>(_ArrayOfBMCStore_QNAME, ArrayOfBMCStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCStore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BMCStore }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BMCStore")
    public JAXBElement<BMCStore> createBMCStore(BMCStore value) {
        return new JAXBElement<>(_BMCStore_QNAME, BMCStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCStoreSubType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BMCStoreSubType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BMCStoreSubType")
    public JAXBElement<BMCStoreSubType> createBMCStoreSubType(BMCStoreSubType value) {
        return new JAXBElement<>(_BMCStoreSubType_QNAME, BMCStoreSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityNegativeKeyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityNegativeKeyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfEntityNegativeKeyword")
    public JAXBElement<ArrayOfEntityNegativeKeyword> createArrayOfEntityNegativeKeyword(ArrayOfEntityNegativeKeyword value) {
        return new JAXBElement<>(_ArrayOfEntityNegativeKeyword_QNAME, ArrayOfEntityNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityNegativeKeyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityNegativeKeyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EntityNegativeKeyword")
    public JAXBElement<EntityNegativeKeyword> createEntityNegativeKeyword(EntityNegativeKeyword value) {
        return new JAXBElement<>(_EntityNegativeKeyword_QNAME, EntityNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfNegativeKeyword")
    public JAXBElement<ArrayOfNegativeKeyword> createArrayOfNegativeKeyword(ArrayOfNegativeKeyword value) {
        return new JAXBElement<>(_ArrayOfNegativeKeyword_QNAME, ArrayOfNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeyword }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeKeyword }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NegativeKeyword")
    public JAXBElement<NegativeKeyword> createNegativeKeyword(NegativeKeyword value) {
        return new JAXBElement<>(_NegativeKeyword_QNAME, NegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SharedListItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SharedListItem")
    public JAXBElement<SharedListItem> createSharedListItem(SharedListItem value) {
        return new JAXBElement<>(_SharedListItem_QNAME, SharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeSite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeSite }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NegativeSite")
    public JAXBElement<NegativeSite> createNegativeSite(NegativeSite value) {
        return new JAXBElement<>(_NegativeSite_QNAME, NegativeSite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BrandItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BrandItem")
    public JAXBElement<BrandItem> createBrandItem(BrandItem value) {
        return new JAXBElement<>(_BrandItem_QNAME, BrandItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIdCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfIdCollection")
    public JAXBElement<ArrayOfIdCollection> createArrayOfIdCollection(ArrayOfIdCollection value) {
        return new JAXBElement<>(_ArrayOfIdCollection_QNAME, ArrayOfIdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "IdCollection")
    public JAXBElement<IdCollection> createIdCollection(IdCollection value) {
        return new JAXBElement<>(_IdCollection_QNAME, IdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfSharedEntity")
    public JAXBElement<ArrayOfSharedEntity> createArrayOfSharedEntity(ArrayOfSharedEntity value) {
        return new JAXBElement<>(_ArrayOfSharedEntity_QNAME, ArrayOfSharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SharedEntity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SharedEntity")
    public JAXBElement<SharedEntity> createSharedEntity(SharedEntity value) {
        return new JAXBElement<>(_SharedEntity_QNAME, SharedEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SharedList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SharedList")
    public JAXBElement<SharedList> createSharedList(SharedList value) {
        return new JAXBElement<>(_SharedList_QNAME, SharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeKeywordList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NegativeKeywordList")
    public JAXBElement<NegativeKeywordList> createNegativeKeywordList(NegativeKeywordList value) {
        return new JAXBElement<>(_NegativeKeywordList_QNAME, NegativeKeywordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementExclusionList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlacementExclusionList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PlacementExclusionList")
    public JAXBElement<PlacementExclusionList> createPlacementExclusionList(PlacementExclusionList value) {
        return new JAXBElement<>(_PlacementExclusionList_QNAME, PlacementExclusionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNegativeKeywordList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNegativeKeywordList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AccountNegativeKeywordList")
    public JAXBElement<AccountNegativeKeywordList> createAccountNegativeKeywordList(AccountNegativeKeywordList value) {
        return new JAXBElement<>(_AccountNegativeKeywordList_QNAME, AccountNegativeKeywordList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BrandList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BrandList")
    public JAXBElement<BrandList> createBrandList(BrandList value) {
        return new JAXBElement<>(_BrandList_QNAME, BrandList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EntityScope")
    public JAXBElement<EntityScope> createEntityScope(EntityScope value) {
        return new JAXBElement<>(_EntityScope_QNAME, EntityScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedListItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfSharedListItem")
    public JAXBElement<ArrayOfSharedListItem> createArrayOfSharedListItem(ArrayOfSharedListItem value) {
        return new JAXBElement<>(_ArrayOfSharedListItem_QNAME, ArrayOfSharedListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntityAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSharedEntityAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfSharedEntityAssociation")
    public JAXBElement<ArrayOfSharedEntityAssociation> createArrayOfSharedEntityAssociation(ArrayOfSharedEntityAssociation value) {
        return new JAXBElement<>(_ArrayOfSharedEntityAssociation_QNAME, ArrayOfSharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharedEntityAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SharedEntityAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SharedEntityAssociation")
    public JAXBElement<SharedEntityAssociation> createSharedEntityAssociation(SharedEntityAssociation value) {
        return new JAXBElement<>(_SharedEntityAssociation_QNAME, SharedEntityAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignSize }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignSize")
    public JAXBElement<ArrayOfCampaignSize> createArrayOfCampaignSize(ArrayOfCampaignSize value) {
        return new JAXBElement<>(_ArrayOfCampaignSize_QNAME, ArrayOfCampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignSize }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignSize")
    public JAXBElement<CampaignSize> createCampaignSize(CampaignSize value) {
        return new JAXBElement<>(_CampaignSize_QNAME, CampaignSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignCriterion")
    public JAXBElement<ArrayOfCampaignCriterion> createArrayOfCampaignCriterion(ArrayOfCampaignCriterion value) {
        return new JAXBElement<>(_ArrayOfCampaignCriterion_QNAME, ArrayOfCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignCriterion")
    public JAXBElement<CampaignCriterion> createCampaignCriterion(CampaignCriterion value) {
        return new JAXBElement<>(_CampaignCriterion_QNAME, CampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignCriterionStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignCriterionStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignCriterionStatus")
    public JAXBElement<CampaignCriterionStatus> createCampaignCriterionStatus(CampaignCriterionStatus value) {
        return new JAXBElement<>(_CampaignCriterionStatus_QNAME, CampaignCriterionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeCampaignCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeCampaignCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NegativeCampaignCriterion")
    public JAXBElement<NegativeCampaignCriterion> createNegativeCampaignCriterion(NegativeCampaignCriterion value) {
        return new JAXBElement<>(_NegativeCampaignCriterion_QNAME, NegativeCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiddableCampaignCriterion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BiddableCampaignCriterion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BiddableCampaignCriterion")
    public JAXBElement<BiddableCampaignCriterion> createBiddableCampaignCriterion(BiddableCampaignCriterion value) {
        return new JAXBElement<>(_BiddableCampaignCriterion_QNAME, BiddableCampaignCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignCriterionType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignCriterionType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignCriterionType")
    @XmlJavaTypeAdapter(Adapter17 .class)
    public JAXBElement<Collection<CampaignCriterionType>> createCampaignCriterionType(Collection<CampaignCriterionType> value) {
        return new JAXBElement<>(_CampaignCriterionType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudget }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBudget }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfBudget")
    public JAXBElement<ArrayOfBudget> createArrayOfBudget(ArrayOfBudget value) {
        return new JAXBElement<>(_ArrayOfBudget_QNAME, ArrayOfBudget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Budget }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Budget }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Budget")
    public JAXBElement<Budget> createBudget(Budget value) {
        return new JAXBElement<>(_Budget_QNAME, Budget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidStrategy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBidStrategy }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfBidStrategy")
    public JAXBElement<ArrayOfBidStrategy> createArrayOfBidStrategy(ArrayOfBidStrategy value) {
        return new JAXBElement<>(_ArrayOfBidStrategy_QNAME, ArrayOfBidStrategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidStrategy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidStrategy }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "BidStrategy")
    public JAXBElement<BidStrategy> createBidStrategy(BidStrategy value) {
        return new JAXBElement<>(_BidStrategy_QNAME, BidStrategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAudienceGroup")
    public JAXBElement<ArrayOfAudienceGroup> createArrayOfAudienceGroup(ArrayOfAudienceGroup value) {
        return new JAXBElement<>(_ArrayOfAudienceGroup_QNAME, ArrayOfAudienceGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceGroup")
    public JAXBElement<AudienceGroup> createAudienceGroup(AudienceGroup value) {
        return new JAXBElement<>(_AudienceGroup_QNAME, AudienceGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroupDimension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroupDimension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAudienceGroupDimension")
    public JAXBElement<ArrayOfAudienceGroupDimension> createArrayOfAudienceGroupDimension(ArrayOfAudienceGroupDimension value) {
        return new JAXBElement<>(_ArrayOfAudienceGroupDimension_QNAME, ArrayOfAudienceGroupDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceGroupDimension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceGroupDimension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceGroupDimension")
    public JAXBElement<AudienceGroupDimension> createAudienceGroupDimension(AudienceGroupDimension value) {
        return new JAXBElement<>(_AudienceGroupDimension_QNAME, AudienceGroupDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceGroupDimensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceGroupDimensionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceGroupDimensionType")
    public JAXBElement<AudienceGroupDimensionType> createAudienceGroupDimensionType(AudienceGroupDimensionType value) {
        return new JAXBElement<>(_AudienceGroupDimensionType_QNAME, AudienceGroupDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeDimension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeDimension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AgeDimension")
    public JAXBElement<AgeDimension> createAgeDimension(AgeDimension value) {
        return new JAXBElement<>(_AgeDimension_QNAME, AgeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeRange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeRange }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAgeRange")
    public JAXBElement<ArrayOfAgeRange> createArrayOfAgeRange(ArrayOfAgeRange value) {
        return new JAXBElement<>(_ArrayOfAgeRange_QNAME, ArrayOfAgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenderDimension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenderDimension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GenderDimension")
    public JAXBElement<GenderDimension> createGenderDimension(GenderDimension value) {
        return new JAXBElement<>(_GenderDimension_QNAME, GenderDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGenderType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfGenderType")
    public JAXBElement<ArrayOfGenderType> createArrayOfGenderType(ArrayOfGenderType value) {
        return new JAXBElement<>(_ArrayOfGenderType_QNAME, ArrayOfGenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceDimension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceDimension }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceDimension")
    public JAXBElement<AudienceDimension> createAudienceDimension(AudienceDimension value) {
        return new JAXBElement<>(_AudienceDimension_QNAME, AudienceDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAudienceInfo")
    public JAXBElement<ArrayOfAudienceInfo> createArrayOfAudienceInfo(ArrayOfAudienceInfo value) {
        return new JAXBElement<>(_ArrayOfAudienceInfo_QNAME, ArrayOfAudienceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceInfo")
    public JAXBElement<AudienceInfo> createAudienceInfo(AudienceInfo value) {
        return new JAXBElement<>(_AudienceInfo_QNAME, AudienceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroup")
    public JAXBElement<ArrayOfAssetGroup> createArrayOfAssetGroup(ArrayOfAssetGroup value) {
        return new JAXBElement<>(_ArrayOfAssetGroup_QNAME, ArrayOfAssetGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroup")
    public JAXBElement<AssetGroup> createAssetGroup(AssetGroup value) {
        return new JAXBElement<>(_AssetGroup_QNAME, AssetGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupSearchTheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupSearchTheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroupSearchTheme")
    public JAXBElement<ArrayOfAssetGroupSearchTheme> createArrayOfAssetGroupSearchTheme(ArrayOfAssetGroupSearchTheme value) {
        return new JAXBElement<>(_ArrayOfAssetGroupSearchTheme_QNAME, ArrayOfAssetGroupSearchTheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupSearchTheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupSearchTheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupSearchTheme")
    public JAXBElement<AssetGroupSearchTheme> createAssetGroupSearchTheme(AssetGroupSearchTheme value) {
        return new JAXBElement<>(_AssetGroupSearchTheme_QNAME, AssetGroupSearchTheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupEditorialStatus")
    public JAXBElement<AssetGroupEditorialStatus> createAssetGroupEditorialStatus(AssetGroupEditorialStatus value) {
        return new JAXBElement<>(_AssetGroupEditorialStatus_QNAME, AssetGroupEditorialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupStatus")
    public JAXBElement<AssetGroupStatus> createAssetGroupStatus(AssetGroupStatus value) {
        return new JAXBElement<>(_AssetGroupStatus_QNAME, AssetGroupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AssetGroupAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AssetGroupAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupAdditionalField")
    @XmlJavaTypeAdapter(Adapter18 .class)
    public JAXBElement<Collection<AssetGroupAdditionalField>> createAssetGroupAdditionalField(Collection<AssetGroupAdditionalField> value) {
        return new JAXBElement<>(_AssetGroupAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupEditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupEditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroupEditorialReasonCollection")
    public JAXBElement<ArrayOfAssetGroupEditorialReasonCollection> createArrayOfAssetGroupEditorialReasonCollection(ArrayOfAssetGroupEditorialReasonCollection value) {
        return new JAXBElement<>(_ArrayOfAssetGroupEditorialReasonCollection_QNAME, ArrayOfAssetGroupEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialReasonCollection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialReasonCollection }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupEditorialReasonCollection")
    public JAXBElement<AssetGroupEditorialReasonCollection> createAssetGroupEditorialReasonCollection(AssetGroupEditorialReasonCollection value) {
        return new JAXBElement<>(_AssetGroupEditorialReasonCollection_QNAME, AssetGroupEditorialReasonCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupEditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupEditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAssetGroupEditorialReason")
    public JAXBElement<ArrayOfAssetGroupEditorialReason> createArrayOfAssetGroupEditorialReason(ArrayOfAssetGroupEditorialReason value) {
        return new JAXBElement<>(_ArrayOfAssetGroupEditorialReason_QNAME, ArrayOfAssetGroupEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialReason }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupEditorialReason }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AssetGroupEditorialReason")
    public JAXBElement<AssetGroupEditorialReason> createAssetGroupEditorialReason(AssetGroupEditorialReason value) {
        return new JAXBElement<>(_AssetGroupEditorialReason_QNAME, AssetGroupEditorialReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroupAssetGroupAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudienceGroupAssetGroupAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAudienceGroupAssetGroupAssociation")
    public JAXBElement<ArrayOfAudienceGroupAssetGroupAssociation> createArrayOfAudienceGroupAssetGroupAssociation(ArrayOfAudienceGroupAssetGroupAssociation value) {
        return new JAXBElement<>(_ArrayOfAudienceGroupAssetGroupAssociation_QNAME, ArrayOfAudienceGroupAssetGroupAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceGroupAssetGroupAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceGroupAssetGroupAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceGroupAssetGroupAssociation")
    public JAXBElement<AudienceGroupAssetGroupAssociation> createAudienceGroupAssetGroupAssociation(AudienceGroupAssetGroupAssociation value) {
        return new JAXBElement<>(_AudienceGroupAssetGroupAssociation_QNAME, AudienceGroupAssetGroupAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudience }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudience }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfAudience")
    public JAXBElement<ArrayOfAudience> createArrayOfAudience(ArrayOfAudience value) {
        return new JAXBElement<>(_ArrayOfAudience_QNAME, ArrayOfAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Audience }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Audience }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Audience")
    public JAXBElement<Audience> createAudience(Audience value) {
        return new JAXBElement<>(_Audience_QNAME, Audience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerShare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerShare }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerShare")
    public JAXBElement<CustomerShare> createCustomerShare(CustomerShare value) {
        return new JAXBElement<>(_CustomerShare_QNAME, CustomerShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerAccountShare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerAccountShare }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCustomerAccountShare")
    public JAXBElement<ArrayOfCustomerAccountShare> createArrayOfCustomerAccountShare(ArrayOfCustomerAccountShare value) {
        return new JAXBElement<>(_ArrayOfCustomerAccountShare_QNAME, ArrayOfCustomerAccountShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccountShare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerAccountShare }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerAccountShare")
    public JAXBElement<CustomerAccountShare> createCustomerAccountShare(CustomerAccountShare value) {
        return new JAXBElement<>(_CustomerAccountShare_QNAME, CustomerAccountShare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerAccountShareAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerAccountShareAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCustomerAccountShareAssociation")
    public JAXBElement<ArrayOfCustomerAccountShareAssociation> createArrayOfCustomerAccountShareAssociation(ArrayOfCustomerAccountShareAssociation value) {
        return new JAXBElement<>(_ArrayOfCustomerAccountShareAssociation_QNAME, ArrayOfCustomerAccountShareAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccountShareAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerAccountShareAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerAccountShareAssociation")
    public JAXBElement<CustomerAccountShareAssociation> createCustomerAccountShareAssociation(CustomerAccountShareAssociation value) {
        return new JAXBElement<>(_CustomerAccountShareAssociation_QNAME, CustomerAccountShareAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemarketingList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RemarketingList")
    public JAXBElement<RemarketingList> createRemarketingList(RemarketingList value) {
        return new JAXBElement<>(_RemarketingList_QNAME, RemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarketingRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemarketingRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RemarketingRule")
    public JAXBElement<RemarketingRule> createRemarketingRule(RemarketingRule value) {
        return new JAXBElement<>(_RemarketingRule_QNAME, RemarketingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PageVisitorsRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PageVisitorsRule")
    public JAXBElement<PageVisitorsRule> createPageVisitorsRule(PageVisitorsRule value) {
        return new JAXBElement<>(_PageVisitorsRule_QNAME, PageVisitorsRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormalForm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NormalForm }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NormalForm")
    public JAXBElement<NormalForm> createNormalForm(NormalForm value) {
        return new JAXBElement<>(_NormalForm_QNAME, NormalForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItemGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItemGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfRuleItemGroup")
    public JAXBElement<ArrayOfRuleItemGroup> createArrayOfRuleItemGroup(ArrayOfRuleItemGroup value) {
        return new JAXBElement<>(_ArrayOfRuleItemGroup_QNAME, ArrayOfRuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItemGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleItemGroup }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RuleItemGroup")
    public JAXBElement<RuleItemGroup> createRuleItemGroup(RuleItemGroup value) {
        return new JAXBElement<>(_RuleItemGroup_QNAME, RuleItemGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRuleItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfRuleItem")
    public JAXBElement<ArrayOfRuleItem> createArrayOfRuleItem(ArrayOfRuleItem value) {
        return new JAXBElement<>(_ArrayOfRuleItem_QNAME, ArrayOfRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "RuleItem")
    public JAXBElement<RuleItem> createRuleItem(RuleItem value) {
        return new JAXBElement<>(_RuleItem_QNAME, RuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringRuleItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringRuleItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "StringRuleItem")
    public JAXBElement<StringRuleItem> createStringRuleItem(StringRuleItem value) {
        return new JAXBElement<>(_StringRuleItem_QNAME, StringRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "StringOperator")
    public JAXBElement<StringOperator> createStringOperator(StringOperator value) {
        return new JAXBElement<>(_StringOperator_QNAME, StringOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberRuleItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberRuleItem }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NumberRuleItem")
    public JAXBElement<NumberRuleItem> createNumberRuleItem(NumberRuleItem value) {
        return new JAXBElement<>(_NumberRuleItem_QNAME, NumberRuleItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "NumberOperator")
    public JAXBElement<NumberOperator> createNumberOperator(NumberOperator value) {
        return new JAXBElement<>(_NumberOperator_QNAME, NumberOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoVisitedAnotherPageRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoVisitedAnotherPageRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PageVisitorsWhoVisitedAnotherPageRule")
    public JAXBElement<PageVisitorsWhoVisitedAnotherPageRule> createPageVisitorsWhoVisitedAnotherPageRule(PageVisitorsWhoVisitedAnotherPageRule value) {
        return new JAXBElement<>(_PageVisitorsWhoVisitedAnotherPageRule_QNAME, PageVisitorsWhoVisitedAnotherPageRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoDidNotVisitAnotherPageRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PageVisitorsWhoDidNotVisitAnotherPageRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PageVisitorsWhoDidNotVisitAnotherPageRule")
    public JAXBElement<PageVisitorsWhoDidNotVisitAnotherPageRule> createPageVisitorsWhoDidNotVisitAnotherPageRule(PageVisitorsWhoDidNotVisitAnotherPageRule value) {
        return new JAXBElement<>(_PageVisitorsWhoDidNotVisitAnotherPageRule_QNAME, PageVisitorsWhoDidNotVisitAnotherPageRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomEventsRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomEventsRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomEventsRule")
    public JAXBElement<CustomEventsRule> createCustomEventsRule(CustomEventsRule value) {
        return new JAXBElement<>(_CustomEventsRule_QNAME, CustomEventsRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomAudience }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomAudience }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomAudience")
    public JAXBElement<CustomAudience> createCustomAudience(CustomAudience value) {
        return new JAXBElement<>(_CustomAudience_QNAME, CustomAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InMarketAudience }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InMarketAudience }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "InMarketAudience")
    public JAXBElement<InMarketAudience> createInMarketAudience(InMarketAudience value) {
        return new JAXBElement<>(_InMarketAudience_QNAME, InMarketAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAudience }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductAudience }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductAudience")
    public JAXBElement<ProductAudience> createProductAudience(ProductAudience value) {
        return new JAXBElement<>(_ProductAudience_QNAME, ProductAudience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProductAudienceType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ProductAudienceType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ProductAudienceType")
    @XmlJavaTypeAdapter(Adapter19 .class)
    public JAXBElement<Collection<ProductAudienceType>> createProductAudienceType(Collection<ProductAudienceType> value) {
        return new JAXBElement<>(_ProductAudienceType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimilarRemarketingList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimilarRemarketingList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SimilarRemarketingList")
    public JAXBElement<SimilarRemarketingList> createSimilarRemarketingList(SimilarRemarketingList value) {
        return new JAXBElement<>(_SimilarRemarketingList_QNAME, SimilarRemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinedList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinedList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CombinedList")
    public JAXBElement<CombinedList> createCombinedList(CombinedList value) {
        return new JAXBElement<>(_CombinedList_QNAME, CombinedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCombinationRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCombinationRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCombinationRule")
    public JAXBElement<ArrayOfCombinationRule> createArrayOfCombinationRule(ArrayOfCombinationRule value) {
        return new JAXBElement<>(_ArrayOfCombinationRule_QNAME, ArrayOfCombinationRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationRule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationRule }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CombinationRule")
    public JAXBElement<CombinationRule> createCombinationRule(CombinationRule value) {
        return new JAXBElement<>(_CombinationRule_QNAME, CombinationRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicalOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogicalOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LogicalOperator")
    public JAXBElement<LogicalOperator> createLogicalOperator(LogicalOperator value) {
        return new JAXBElement<>(_LogicalOperator_QNAME, LogicalOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerList")
    public JAXBElement<CustomerList> createCustomerList(CustomerList value) {
        return new JAXBElement<>(_CustomerList_QNAME, CustomerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpressionBasedRemarketingList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImpressionBasedRemarketingList }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImpressionBasedRemarketingList")
    public JAXBElement<ImpressionBasedRemarketingList> createImpressionBasedRemarketingList(ImpressionBasedRemarketingList value) {
        return new JAXBElement<>(_ImpressionBasedRemarketingList_QNAME, ImpressionBasedRemarketingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpressionBasedEntityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImpressionBasedEntityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImpressionBasedEntityType")
    public JAXBElement<ImpressionBasedEntityType> createImpressionBasedEntityType(ImpressionBasedEntityType value) {
        return new JAXBElement<>(_ImpressionBasedEntityType_QNAME, ImpressionBasedEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AudienceAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AudienceAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AudienceAdditionalField")
    @XmlJavaTypeAdapter(Adapter20 .class)
    public JAXBElement<Collection<AudienceAdditionalField>> createAudienceAdditionalField(Collection<AudienceAdditionalField> value) {
        return new JAXBElement<>(_AudienceAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerListUserData }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerListUserData")
    public JAXBElement<CustomerListUserData> createCustomerListUserData(CustomerListUserData value) {
        return new JAXBElement<>(_CustomerListUserData_QNAME, CustomerListUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListActionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerListActionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerListActionType")
    public JAXBElement<CustomerListActionType> createCustomerListActionType(CustomerListActionType value) {
        return new JAXBElement<>(_CustomerListActionType_QNAME, CustomerListActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListItemSubType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerListItemSubType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CustomerListItemSubType")
    public JAXBElement<CustomerListItemSubType> createCustomerListItemSubType(CustomerListItemSubType value) {
        return new JAXBElement<>(_CustomerListItemSubType_QNAME, CustomerListItemSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUetTag }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUetTag }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfUetTag")
    public JAXBElement<ArrayOfUetTag> createArrayOfUetTag(ArrayOfUetTag value) {
        return new JAXBElement<>(_ArrayOfUetTag_QNAME, ArrayOfUetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTag }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UetTag }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "UetTag")
    public JAXBElement<UetTag> createUetTag(UetTag value) {
        return new JAXBElement<>(_UetTag_QNAME, UetTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UetTagTrackingStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UetTagTrackingStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "UetTagTrackingStatus")
    public JAXBElement<UetTagTrackingStatus> createUetTagTrackingStatus(UetTagTrackingStatus value) {
        return new JAXBElement<>(_UetTagTrackingStatus_QNAME, UetTagTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalType")
    @XmlJavaTypeAdapter(Adapter21 .class)
    public JAXBElement<Collection<ConversionGoalType>> createConversionGoalType(Collection<ConversionGoalType> value) {
        return new JAXBElement<>(_ConversionGoalType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ConversionGoalAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalAdditionalField")
    @XmlJavaTypeAdapter(Adapter22 .class)
    public JAXBElement<Collection<ConversionGoalAdditionalField>> createConversionGoalAdditionalField(Collection<ConversionGoalAdditionalField> value) {
        return new JAXBElement<>(_ConversionGoalAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfConversionGoal")
    public JAXBElement<ArrayOfConversionGoal> createArrayOfConversionGoal(ArrayOfConversionGoal value) {
        return new JAXBElement<>(_ArrayOfConversionGoal_QNAME, ArrayOfConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoal")
    public JAXBElement<ConversionGoal> createConversionGoal(ConversionGoal value) {
        return new JAXBElement<>(_ConversionGoal_QNAME, ConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributionModelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributionModelType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AttributionModelType")
    public JAXBElement<AttributionModelType> createAttributionModelType(AttributionModelType value) {
        return new JAXBElement<>(_AttributionModelType_QNAME, AttributionModelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalCountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalCountType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalCountType")
    public JAXBElement<ConversionGoalCountType> createConversionGoalCountType(ConversionGoalCountType value) {
        return new JAXBElement<>(_ConversionGoalCountType_QNAME, ConversionGoalCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalCategory }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalCategory")
    public JAXBElement<ConversionGoalCategory> createConversionGoalCategory(ConversionGoalCategory value) {
        return new JAXBElement<>(_ConversionGoalCategory_QNAME, ConversionGoalCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenue }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalRevenue")
    public JAXBElement<ConversionGoalRevenue> createConversionGoalRevenue(ConversionGoalRevenue value) {
        return new JAXBElement<>(_ConversionGoalRevenue_QNAME, ConversionGoalRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalRevenueType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalRevenueType")
    public JAXBElement<ConversionGoalRevenueType> createConversionGoalRevenueType(ConversionGoalRevenueType value) {
        return new JAXBElement<>(_ConversionGoalRevenueType_QNAME, ConversionGoalRevenueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalStatus")
    public JAXBElement<ConversionGoalStatus> createConversionGoalStatus(ConversionGoalStatus value) {
        return new JAXBElement<>(_ConversionGoalStatus_QNAME, ConversionGoalStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionGoalTrackingStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionGoalTrackingStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ConversionGoalTrackingStatus")
    public JAXBElement<ConversionGoalTrackingStatus> createConversionGoalTrackingStatus(ConversionGoalTrackingStatus value) {
        return new JAXBElement<>(_ConversionGoalTrackingStatus_QNAME, ConversionGoalTrackingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrlGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "UrlGoal")
    public JAXBElement<UrlGoal> createUrlGoal(UrlGoal value) {
        return new JAXBElement<>(_UrlGoal_QNAME, UrlGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressionOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExpressionOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ExpressionOperator")
    public JAXBElement<ExpressionOperator> createExpressionOperator(ExpressionOperator value) {
        return new JAXBElement<>(_ExpressionOperator_QNAME, ExpressionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DurationGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DurationGoal")
    public JAXBElement<DurationGoal> createDurationGoal(DurationGoal value) {
        return new JAXBElement<>(_DurationGoal_QNAME, DurationGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagesViewedPerVisitGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagesViewedPerVisitGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "PagesViewedPerVisitGoal")
    public JAXBElement<PagesViewedPerVisitGoal> createPagesViewedPerVisitGoal(PagesViewedPerVisitGoal value) {
        return new JAXBElement<>(_PagesViewedPerVisitGoal_QNAME, PagesViewedPerVisitGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "EventGoal")
    public JAXBElement<EventGoal> createEventGoal(EventGoal value) {
        return new JAXBElement<>(_EventGoal_QNAME, EventGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValueOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ValueOperator")
    public JAXBElement<ValueOperator> createValueOperator(ValueOperator value) {
        return new JAXBElement<>(_ValueOperator_QNAME, ValueOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppInstallGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppInstallGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "AppInstallGoal")
    public JAXBElement<AppInstallGoal> createAppInstallGoal(AppInstallGoal value) {
        return new JAXBElement<>(_AppInstallGoal_QNAME, AppInstallGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineConversionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfflineConversionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "OfflineConversionGoal")
    public JAXBElement<OfflineConversionGoal> createOfflineConversionGoal(OfflineConversionGoal value) {
        return new JAXBElement<>(_OfflineConversionGoal_QNAME, OfflineConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InStoreTransactionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InStoreTransactionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "InStoreTransactionGoal")
    public JAXBElement<InStoreTransactionGoal> createInStoreTransactionGoal(InStoreTransactionGoal value) {
        return new JAXBElement<>(_InStoreTransactionGoal_QNAME, InStoreTransactionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineConversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineConversion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfOfflineConversion")
    public JAXBElement<ArrayOfOfflineConversion> createArrayOfOfflineConversion(ArrayOfOfflineConversion value) {
        return new JAXBElement<>(_ArrayOfOfflineConversion_QNAME, ArrayOfOfflineConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineConversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfflineConversion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "OfflineConversion")
    public JAXBElement<OfflineConversion> createOfflineConversion(OfflineConversion value) {
        return new JAXBElement<>(_OfflineConversion_QNAME, OfflineConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineConversionAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineConversionAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfOfflineConversionAdjustment")
    public JAXBElement<ArrayOfOfflineConversionAdjustment> createArrayOfOfflineConversionAdjustment(ArrayOfOfflineConversionAdjustment value) {
        return new JAXBElement<>(_ArrayOfOfflineConversionAdjustment_QNAME, ArrayOfOfflineConversionAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineConversionAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfflineConversionAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "OfflineConversionAdjustment")
    public JAXBElement<OfflineConversionAdjustment> createOfflineConversionAdjustment(OfflineConversionAdjustment value) {
        return new JAXBElement<>(_OfflineConversionAdjustment_QNAME, OfflineConversionAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOnlineConversionAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOnlineConversionAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfOnlineConversionAdjustment")
    public JAXBElement<ArrayOfOnlineConversionAdjustment> createArrayOfOnlineConversionAdjustment(ArrayOfOnlineConversionAdjustment value) {
        return new JAXBElement<>(_ArrayOfOnlineConversionAdjustment_QNAME, ArrayOfOnlineConversionAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnlineConversionAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnlineConversionAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "OnlineConversionAdjustment")
    public JAXBElement<OnlineConversionAdjustment> createOnlineConversionAdjustment(OnlineConversionAdjustment value) {
        return new JAXBElement<>(_OnlineConversionAdjustment_QNAME, OnlineConversionAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLabel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLabel }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfLabel")
    public JAXBElement<ArrayOfLabel> createArrayOfLabel(ArrayOfLabel value) {
        return new JAXBElement<>(_ArrayOfLabel_QNAME, ArrayOfLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Label }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Label")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLabelAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLabelAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfLabelAssociation")
    public JAXBElement<ArrayOfLabelAssociation> createArrayOfLabelAssociation(ArrayOfLabelAssociation value) {
        return new JAXBElement<>(_ArrayOfLabelAssociation_QNAME, ArrayOfLabelAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LabelAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "LabelAssociation")
    public JAXBElement<LabelAssociation> createLabelAssociation(LabelAssociation value) {
        return new JAXBElement<>(_LabelAssociation_QNAME, LabelAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExperiment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExperiment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfExperiment")
    public JAXBElement<ArrayOfExperiment> createArrayOfExperiment(ArrayOfExperiment value) {
        return new JAXBElement<>(_ArrayOfExperiment_QNAME, ArrayOfExperiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Experiment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Experiment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Experiment")
    public JAXBElement<Experiment> createExperiment(Experiment value) {
        return new JAXBElement<>(_Experiment_QNAME, Experiment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCompany")
    public JAXBElement<ArrayOfCompany> createArrayOfCompany(ArrayOfCompany value) {
        return new JAXBElement<>(_ArrayOfCompany_QNAME, ArrayOfCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Company")
    public JAXBElement<Company> createCompany(Company value) {
        return new JAXBElement<>(_Company_QNAME, Company.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportJob }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfImportJob }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfImportJob")
    public JAXBElement<ArrayOfImportJob> createArrayOfImportJob(ArrayOfImportJob value) {
        return new JAXBElement<>(_ArrayOfImportJob_QNAME, ArrayOfImportJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportJob }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportJob }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportJob")
    public JAXBElement<ImportJob> createImportJob(ImportJob value) {
        return new JAXBElement<>(_ImportJob_QNAME, ImportJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Frequency }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Frequency }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Frequency")
    public JAXBElement<Frequency> createFrequency(Frequency value) {
        return new JAXBElement<>(_Frequency_QNAME, Frequency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportOption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportOption")
    public JAXBElement<ImportOption> createImportOption(ImportOption value) {
        return new JAXBElement<>(_ImportOption_QNAME, ImportOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoogleImportOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoogleImportOption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GoogleImportOption")
    public JAXBElement<GoogleImportOption> createGoogleImportOption(GoogleImportOption value) {
        return new JAXBElement<>(_GoogleImportOption_QNAME, GoogleImportOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportSearchAndReplaceForStringProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportSearchAndReplaceForStringProperty }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportSearchAndReplaceForStringProperty")
    public JAXBElement<ImportSearchAndReplaceForStringProperty> createImportSearchAndReplaceForStringProperty(ImportSearchAndReplaceForStringProperty value) {
        return new JAXBElement<>(_ImportSearchAndReplaceForStringProperty_QNAME, ImportSearchAndReplaceForStringProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileImportOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileImportOption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FileImportOption")
    public JAXBElement<FileImportOption> createFileImportOption(FileImportOption value) {
        return new JAXBElement<>(_FileImportOption_QNAME, FileImportOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoogleImportJob }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoogleImportJob }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "GoogleImportJob")
    public JAXBElement<GoogleImportJob> createGoogleImportJob(GoogleImportJob value) {
        return new JAXBElement<>(_GoogleImportJob_QNAME, GoogleImportJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignAdGroupIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignAdGroupIds }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignAdGroupIds")
    public JAXBElement<ArrayOfCampaignAdGroupIds> createArrayOfCampaignAdGroupIds(ArrayOfCampaignAdGroupIds value) {
        return new JAXBElement<>(_ArrayOfCampaignAdGroupIds_QNAME, ArrayOfCampaignAdGroupIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignAdGroupIds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignAdGroupIds }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignAdGroupIds")
    public JAXBElement<CampaignAdGroupIds> createCampaignAdGroupIds(CampaignAdGroupIds value) {
        return new JAXBElement<>(_CampaignAdGroupIds_QNAME, CampaignAdGroupIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileImportJob }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileImportJob }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "FileImportJob")
    public JAXBElement<FileImportJob> createFileImportJob(FileImportJob value) {
        return new JAXBElement<>(_FileImportJob_QNAME, FileImportJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ImportAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ImportAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportAdditionalField")
    @XmlJavaTypeAdapter(Adapter23 .class)
    public JAXBElement<Collection<ImportAdditionalField>> createImportAdditionalField(Collection<ImportAdditionalField> value) {
        return new JAXBElement<>(_ImportAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfImportResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfImportResult")
    public JAXBElement<ArrayOfImportResult> createArrayOfImportResult(ArrayOfImportResult value) {
        return new JAXBElement<>(_ArrayOfImportResult_QNAME, ArrayOfImportResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportResult }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportResult")
    public JAXBElement<ImportResult> createImportResult(ImportResult value) {
        return new JAXBElement<>(_ImportResult_QNAME, ImportResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportEntityStatistics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfImportEntityStatistics }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfImportEntityStatistics")
    public JAXBElement<ArrayOfImportEntityStatistics> createArrayOfImportEntityStatistics(ArrayOfImportEntityStatistics value) {
        return new JAXBElement<>(_ArrayOfImportEntityStatistics_QNAME, ArrayOfImportEntityStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportEntityStatistics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportEntityStatistics }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportEntityStatistics")
    public JAXBElement<ImportEntityStatistics> createImportEntityStatistics(ImportEntityStatistics value) {
        return new JAXBElement<>(_ImportEntityStatistics_QNAME, ImportEntityStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportEntityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportEntityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ImportEntityType")
    public JAXBElement<ImportEntityType> createImportEntityType(ImportEntityType value) {
        return new JAXBElement<>(_ImportEntityType_QNAME, ImportEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVideo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVideo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfVideo")
    public JAXBElement<ArrayOfVideo> createArrayOfVideo(ArrayOfVideo value) {
        return new JAXBElement<>(_ArrayOfVideo_QNAME, ArrayOfVideo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Video }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Video }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "Video")
    public JAXBElement<Video> createVideo(Video value) {
        return new JAXBElement<>(_Video_QNAME, Video.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignConversionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignConversionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignConversionGoal")
    public JAXBElement<ArrayOfCampaignConversionGoal> createArrayOfCampaignConversionGoal(ArrayOfCampaignConversionGoal value) {
        return new JAXBElement<>(_ArrayOfCampaignConversionGoal_QNAME, ArrayOfCampaignConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignConversionGoal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignConversionGoal }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignConversionGoal")
    public JAXBElement<CampaignConversionGoal> createCampaignConversionGoal(CampaignConversionGoal value) {
        return new JAXBElement<>(_CampaignConversionGoal_QNAME, CampaignConversionGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataExclusion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataExclusion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfDataExclusion")
    public JAXBElement<ArrayOfDataExclusion> createArrayOfDataExclusion(ArrayOfDataExclusion value) {
        return new JAXBElement<>(_ArrayOfDataExclusion_QNAME, ArrayOfDataExclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataExclusion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataExclusion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DataExclusion")
    public JAXBElement<DataExclusion> createDataExclusion(DataExclusion value) {
        return new JAXBElement<>(_DataExclusion_QNAME, DataExclusion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignAssociation")
    public JAXBElement<ArrayOfCampaignAssociation> createArrayOfCampaignAssociation(ArrayOfCampaignAssociation value) {
        return new JAXBElement<>(_ArrayOfCampaignAssociation_QNAME, ArrayOfCampaignAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignAssociation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignAssociation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignAssociation")
    public JAXBElement<CampaignAssociation> createCampaignAssociation(CampaignAssociation value) {
        return new JAXBElement<>(_CampaignAssociation_QNAME, CampaignAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceType }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceType }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DeviceType")
    @XmlJavaTypeAdapter(Adapter24 .class)
    public JAXBElement<Collection<DeviceType>> createDeviceType(Collection<DeviceType> value) {
        return new JAXBElement<>(_DeviceType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeasonalityAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSeasonalityAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfSeasonalityAdjustment")
    public JAXBElement<ArrayOfSeasonalityAdjustment> createArrayOfSeasonalityAdjustment(ArrayOfSeasonalityAdjustment value) {
        return new JAXBElement<>(_ArrayOfSeasonalityAdjustment_QNAME, ArrayOfSeasonalityAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeasonalityAdjustment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeasonalityAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "SeasonalityAdjustment")
    public JAXBElement<SeasonalityAdjustment> createSeasonalityAdjustment(SeasonalityAdjustment value) {
        return new JAXBElement<>(_SeasonalityAdjustment_QNAME, SeasonalityAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringstring")
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<>(_ArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfKeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringstring")
    public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring value) {
        return new JAXBElement<>(_KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePairOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePairOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfArrayOfKeyValuePairOfstringstring")
    public JAXBElement<ArrayOfArrayOfKeyValuePairOfstringstring> createArrayOfArrayOfKeyValuePairOfstringstring(ArrayOfArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<>(_ArrayOfArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfArrayOfKeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOflonglong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOflonglong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOflonglong")
    public JAXBElement<ArrayOfKeyValuePairOflonglong> createArrayOfKeyValuePairOflonglong(ArrayOfKeyValuePairOflonglong value) {
        return new JAXBElement<>(_ArrayOfKeyValuePairOflonglong_QNAME, ArrayOfKeyValuePairOflonglong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOflonglong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOflonglong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOflonglong")
    public JAXBElement<KeyValuePairOflonglong> createKeyValuePairOflonglong(KeyValuePairOflonglong value) {
        return new JAXBElement<>(_KeyValuePairOflonglong_QNAME, KeyValuePairOflonglong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Calendar> createDateTime(Calendar value) {
        return new JAXBElement<>(_DateTime_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<UnsignedLong> createUnsignedLong(UnsignedLong value) {
        return new JAXBElement<>(_UnsignedLong_QNAME, UnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Char }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Char }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Char> createChar(Char value) {
        return new JAXBElement<>(_Char_QNAME, Char.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<Guid> createGuid(Guid value) {
        return new JAXBElement<>(_Guid_QNAME, Guid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ArrayOfNullableOflong")
    public JAXBElement<ArrayOfNullableOflong> createArrayOfNullableOflong(ArrayOfNullableOflong value) {
        return new JAXBElement<>(_ArrayOfNullableOflong_QNAME, ArrayOfNullableOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdApiFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiFaultDetail")
    public JAXBElement<AdApiFaultDetail> createAdApiFaultDetail(AdApiFaultDetail value) {
        return new JAXBElement<>(_AdApiFaultDetail_QNAME, AdApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ApplicationFault")
    public JAXBElement<ApplicationFault> createApplicationFault(ApplicationFault value) {
        return new JAXBElement<>(_ApplicationFault_QNAME, ApplicationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdApiError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdApiError }{@code >}
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ArrayOfAdApiError")
    public JAXBElement<ArrayOfAdApiError> createArrayOfAdApiError(ArrayOfAdApiError value) {
        return new JAXBElement<>(_ArrayOfAdApiError_QNAME, ArrayOfAdApiError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdApiError }{@code >}
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiError")
    public JAXBElement<AdApiError> createAdApiError(AdApiError value) {
        return new JAXBElement<>(_AdApiError_QNAME, AdApiError.class, null, value);
    }

}
