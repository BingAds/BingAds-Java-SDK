
package com.microsoft.bingads.reporting;

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
 * generated in the com.microsoft.bingads.reporting package. 
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

    private final static QName _TacticChannelReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportFilter");
    private final static QName _PublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportColumn");
    private final static QName _AdExtensionByKeywordReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportRequest");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfGeoLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGeoLocationPerformanceReportColumn");
    private final static QName _AdExtensionDimensionReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportRequest");
    private final static QName _RichAdComponentPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportColumn");
    private final static QName _ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSearchCampaignChangeHistoryReportColumn");
    private final static QName _DestinationUrlPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportRequest");
    private final static QName _AdGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportFilter");
    private final static QName _ShareOfVoiceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportRequest");
    private final static QName _AdExtensionDimensionReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportColumn");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _TacticChannelReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportRequest");
    private final static QName _ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductPartitionUnitPerformanceReportColumn");
    private final static QName _DestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportColumn");
    private final static QName _CampaignPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportRequest");
    private final static QName _SitePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportColumn");
    private final static QName _AgeGenderDemographicReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportRequest");
    private final static QName _ChangeTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ChangeTypeReportFilter");
    private final static QName _GeographicalLocationReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportFilter");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupReportScope");
    private final static QName _KeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportSort");
    private final static QName _ArrayOfShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfShareOfVoiceReportColumn");
    private final static QName _ArrayOfCallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCallDetailReportColumn");
    private final static QName _ArrayOfProductOfferPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductOfferPerformanceReportColumn");
    private final static QName _ArrayOfAdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdPerformanceReportColumn");
    private final static QName _AdDynamicTextPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportFilter");
    private final static QName _AdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportColumn");
    private final static QName _AccountPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportFilter");
    private final static QName _ArrayOfAgeGenderDemographicReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAgeGenderDemographicReportColumn");
    private final static QName _ArrayOfDestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfDestinationUrlPerformanceReportColumn");
    private final static QName _ProductPartitionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionPerformanceReportRequest");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CustomerAccountId");
    private final static QName _ProductTargetPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportRequest");
    private final static QName _ReportRequestStatusType_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequestStatusType");
    private final static QName _SearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportFilter");
    private final static QName _ArrayOfAdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdDynamicTextPerformanceReportColumn");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _BrandZonePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BrandZonePerformanceReportRequest");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "Password");
    private final static QName _AdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDetailReportColumn");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "UserName");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _AdExtensionByAdReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportFilter");
    private final static QName _ProductTargetPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportFilter");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _GoalsAndFunnelsReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportFilter");
    private final static QName _BudgetSummaryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportRequest");
    private final static QName _ProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionPerformanceReportColumn");
    private final static QName _AdDistributionReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdDistributionReportFilter");
    private final static QName _AudiencePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AudiencePerformanceReportRequest");
    private final static QName _BudgetSummaryReportTime_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportTime");
    private final static QName _ArrayOfAdExtensionDimensionReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionDimensionReportColumn");
    private final static QName _ArrayOfPublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfPublisherUsagePerformanceReportColumn");
    private final static QName _KeywordPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportFilter");
    private final static QName _ArrayOfBudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBudgetSummaryReportColumn");
    private final static QName _CampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CampaignReportScope");
    private final static QName _ArrayOfCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignReportScope");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AuthenticationToken");
    private final static QName _ArrayOfProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductPartitionPerformanceReportColumn");
    private final static QName _BrandZonePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BrandZonePerformanceReportColumn");
    private final static QName _ArrayOfBrandZonePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBrandZonePerformanceReportColumn");
    private final static QName _ArrayOfGeographicalLocationReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGeographicalLocationReportColumn");
    private final static QName _SearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportColumn");
    private final static QName _GeographicalLocationReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportColumn");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _GoalsAndFunnelsReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportRequest");
    private final static QName _RichAdComponentPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportRequest");
    private final static QName _ArrayOfKeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfKeywordPerformanceReportSort");
    private final static QName _NegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportColumn");
    private final static QName _AccountThroughCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughCampaignReportScope");
    private final static QName _NonHourlyReportAggregation_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "NonHourlyReportAggregation");
    private final static QName _ProductPartitionUnitPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionUnitPerformanceReportRequest");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TrackingId");
    private final static QName _ArrayOfProductTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductTargetPerformanceReportColumn");
    private final static QName _DeviceOSReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DeviceOSReportFilter");
    private final static QName _SearchCampaignChangeHistoryReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportFilter");
    private final static QName _AdExtensionDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDetailReportRequest");
    private final static QName _AccountReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountReportScope");
    private final static QName _ShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportColumn");
    private final static QName _ProductOfferPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductOfferPerformanceReportFilter");
    private final static QName _ReportRequestStatus_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequestStatus");
    private final static QName _AdStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdStatusReportFilter");
    private final static QName _ArrayOfAdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionByKeywordReportColumn");
    private final static QName _CampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportColumn");
    private final static QName _GeoLocationPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeoLocationPerformanceReportFilter");
    private final static QName _SitePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportRequest");
    private final static QName _TrafficSourcesReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportColumn");
    private final static QName _SitePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SitePerformanceReportFilter");
    private final static QName _ProductOfferPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductOfferPerformanceReportRequest");
    private final static QName _ReportTimePeriod_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportTimePeriod");
    private final static QName _ReportAggregation_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportAggregation");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BatchError");
    private final static QName _RichAdComponentPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "RichAdComponentPerformanceReportFilter");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "OperationError");
    private final static QName _ArrayOfCampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfCampaignPerformanceReportColumn");
    private final static QName _AdDynamicTextPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportRequest");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _KeywordPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportRequest");
    private final static QName _ArrayOfRichAdComponentPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfRichAdComponentPerformanceReportColumn");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DeveloperToken");
    private final static QName _ArrayOfTrafficSourcesReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfTrafficSourcesReportColumn");
    private final static QName _AdPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportFilter");
    private final static QName _ProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionUnitPerformanceReportColumn");
    private final static QName _ProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductDimensionPerformanceReportColumn");
    private final static QName _TrafficSourcesReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportFilter");
    private final static QName _GeoLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeoLocationPerformanceReportColumn");
    private final static QName _ProductOfferPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductOfferPerformanceReportColumn");
    private final static QName _BudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportColumn");
    private final static QName _RichAdSubTypeFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "RichAdSubTypeFilter");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _PublisherUsagePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportRequest");
    private final static QName _AccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportColumn");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ApplicationToken");
    private final static QName _CallDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportRequest");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportColumn");
    private final static QName _ReportTime_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportTime");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _DeviceTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DeviceTypeReportFilter");
    private final static QName _AdExtensionByKeywordReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByKeywordReportFilter");
    private final static QName _ArrayOfAccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAccountPerformanceReportColumn");
    private final static QName _AgeGenderDemographicReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportFilter");
    private final static QName _GoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GoalsAndFunnelsReportColumn");
    private final static QName _ArrayOfTacticChannelReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfTacticChannelReportColumn");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _SearchQueryReportAggregation_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryReportAggregation");
    private final static QName _ConversionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportFilter");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfOperationError");
    private final static QName _DeliveredMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DeliveredMatchTypeReportFilter");
    private final static QName _AdExtensionDetailReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDetailReportFilter");
    private final static QName _ProductDimensionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductDimensionPerformanceReportRequest");
    private final static QName _ReportLanguage_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportLanguage");
    private final static QName _ArrayOfProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfProductDimensionPerformanceReportColumn");
    private final static QName _KeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "KeywordPerformanceReportColumn");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _SearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchQueryPerformanceReportRequest");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _AdGroupStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupStatusReportFilter");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfBatchError");
    private final static QName _ArrayOfAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdGroupReportScope");
    private final static QName _AdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdDynamicTextPerformanceReportColumn");
    private final static QName _AudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AudiencePerformanceReportColumn");
    private final static QName _ArrayOfAudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAudiencePerformanceReportColumn");
    private final static QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SortOrder");
    private final static QName _AdPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportRequest");
    private final static QName _ArrayOfNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfNegativeKeywordConflictReportColumn");
    private final static QName _Date_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "Date");
    private final static QName _AdExtensionDimensionReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionDimensionReportFilter");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _BudgetSummaryReportTimePeriod_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BudgetSummaryReportTimePeriod");
    private final static QName _ArrayOfKeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfKeywordPerformanceReportColumn");
    private final static QName _AdGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportRequest");
    private final static QName _ArrayOfAdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionDetailReportColumn");
    private final static QName _ProductPartitionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionPerformanceReportFilter");
    private final static QName _AdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportColumn");
    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ApiFaultDetail");
    private final static QName _SearchCampaignChangeHistoryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "SearchCampaignChangeHistoryReportRequest");
    private final static QName _CampaignPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CampaignPerformanceReportFilter");
    private final static QName _AdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdGroupPerformanceReportColumn");
    private final static QName _ArrayOfSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSearchQueryPerformanceReportColumn");
    private final static QName _ConversionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportRequest");
    private final static QName _ArrayOfGoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfGoalsAndFunnelsReportColumn");
    private final static QName _NegativeKeywordConflictReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "NegativeKeywordConflictReportRequest");
    private final static QName _ProductTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductTargetPerformanceReportColumn");
    private final static QName _GeoLocationPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeoLocationPerformanceReportRequest");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _BidMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BidMatchTypeReportFilter");
    private final static QName _ConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ConversionPerformanceReportColumn");
    private final static QName _ProductPartitionUnitPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductPartitionUnitPerformanceReportFilter");
    private final static QName _ArrayOfSitePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfSitePerformanceReportColumn");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _AdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdPerformanceReportColumn");
    private final static QName _ReportFormat_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportFormat");
    private final static QName _PricingModelReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "PricingModelReportFilter");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CustomerId");
    private final static QName _ChangeEntityReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ChangeEntityReportFilter");
    private final static QName _AdTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdTypeReportFilter");
    private final static QName _ProductDimensionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ProductDimensionPerformanceReportFilter");
    private final static QName _TrafficSourcesReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TrafficSourcesReportRequest");
    private final static QName _ArrayOfConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfConversionPerformanceReportColumn");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _CallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CallDetailReportColumn");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ComponentTypeFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ComponentTypeFilter");
    private final static QName _DestinationUrlPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "DestinationUrlPerformanceReportFilter");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CampaignStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "CampaignStatusReportFilter");
    private final static QName _AccountPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountPerformanceReportRequest");
    private final static QName _GeographicalLocationReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "GeographicalLocationReportRequest");
    private final static QName _AgeGenderDemographicReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AgeGenderDemographicReportColumn");
    private final static QName _AdExtensionByAdReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AdExtensionByAdReportRequest");
    private final static QName _ArrayOfAdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdExtensionByAdReportColumn");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _ReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ReportRequest");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _PublisherUsagePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "PublisherUsagePerformanceReportFilter");
    private final static QName _AccountThroughAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "AccountThroughAdGroupReportScope");
    private final static QName _BrandZonePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "BrandZonePerformanceReportFilter");
    private final static QName _ArrayOfAdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ArrayOfAdGroupPerformanceReportColumn");
    private final static QName _ShareOfVoiceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "ShareOfVoiceReportFilter");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _TacticChannelReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v9", "TacticChannelReportColumn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.reporting
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
     * Create an instance of {@link ArrayOfBudgetSummaryReportColumn }
     * 
     */
    public ArrayOfBudgetSummaryReportColumn createArrayOfBudgetSummaryReportColumn() {
        return new ArrayOfBudgetSummaryReportColumn();
    }

    /**
     * Create an instance of {@link SearchCampaignChangeHistoryReportRequest }
     * 
     */
    public SearchCampaignChangeHistoryReportRequest createSearchCampaignChangeHistoryReportRequest() {
        return new SearchCampaignChangeHistoryReportRequest();
    }

    /**
     * Create an instance of {@link CampaignReportScope }
     * 
     */
    public CampaignReportScope createCampaignReportScope() {
        return new CampaignReportScope();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignReportScope }
     * 
     */
    public ArrayOfCampaignReportScope createArrayOfCampaignReportScope() {
        return new ArrayOfCampaignReportScope();
    }

    /**
     * Create an instance of {@link SubmitGenerateReportResponse }
     * 
     */
    public SubmitGenerateReportResponse createSubmitGenerateReportResponse() {
        return new SubmitGenerateReportResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductPartitionPerformanceReportColumn }
     * 
     */
    public ArrayOfProductPartitionPerformanceReportColumn createArrayOfProductPartitionPerformanceReportColumn() {
        return new ArrayOfProductPartitionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link CampaignPerformanceReportFilter }
     * 
     */
    public CampaignPerformanceReportFilter createCampaignPerformanceReportFilter() {
        return new CampaignPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfBrandZonePerformanceReportColumn }
     * 
     */
    public ArrayOfBrandZonePerformanceReportColumn createArrayOfBrandZonePerformanceReportColumn() {
        return new ArrayOfBrandZonePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfGeographicalLocationReportColumn }
     * 
     */
    public ArrayOfGeographicalLocationReportColumn createArrayOfGeographicalLocationReportColumn() {
        return new ArrayOfGeographicalLocationReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfSearchQueryPerformanceReportColumn }
     * 
     */
    public ArrayOfSearchQueryPerformanceReportColumn createArrayOfSearchQueryPerformanceReportColumn() {
        return new ArrayOfSearchQueryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ConversionPerformanceReportRequest }
     * 
     */
    public ConversionPerformanceReportRequest createConversionPerformanceReportRequest() {
        return new ConversionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGoalsAndFunnelsReportColumn }
     * 
     */
    public ArrayOfGoalsAndFunnelsReportColumn createArrayOfGoalsAndFunnelsReportColumn() {
        return new ArrayOfGoalsAndFunnelsReportColumn();
    }

    /**
     * Create an instance of {@link NegativeKeywordConflictReportRequest }
     * 
     */
    public NegativeKeywordConflictReportRequest createNegativeKeywordConflictReportRequest() {
        return new NegativeKeywordConflictReportRequest();
    }

    /**
     * Create an instance of {@link GoalsAndFunnelsReportRequest }
     * 
     */
    public GoalsAndFunnelsReportRequest createGoalsAndFunnelsReportRequest() {
        return new GoalsAndFunnelsReportRequest();
    }

    /**
     * Create an instance of {@link GeoLocationPerformanceReportRequest }
     * 
     */
    public GeoLocationPerformanceReportRequest createGeoLocationPerformanceReportRequest() {
        return new GeoLocationPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link RichAdComponentPerformanceReportRequest }
     * 
     */
    public RichAdComponentPerformanceReportRequest createRichAdComponentPerformanceReportRequest() {
        return new RichAdComponentPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordPerformanceReportSort }
     * 
     */
    public ArrayOfKeywordPerformanceReportSort createArrayOfKeywordPerformanceReportSort() {
        return new ArrayOfKeywordPerformanceReportSort();
    }

    /**
     * Create an instance of {@link ProductPartitionUnitPerformanceReportFilter }
     * 
     */
    public ProductPartitionUnitPerformanceReportFilter createProductPartitionUnitPerformanceReportFilter() {
        return new ProductPartitionUnitPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfSitePerformanceReportColumn }
     * 
     */
    public ArrayOfSitePerformanceReportColumn createArrayOfSitePerformanceReportColumn() {
        return new ArrayOfSitePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AccountThroughCampaignReportScope }
     * 
     */
    public AccountThroughCampaignReportScope createAccountThroughCampaignReportScope() {
        return new AccountThroughCampaignReportScope();
    }

    /**
     * Create an instance of {@link ProductPartitionUnitPerformanceReportRequest }
     * 
     */
    public ProductPartitionUnitPerformanceReportRequest createProductPartitionUnitPerformanceReportRequest() {
        return new ProductPartitionUnitPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductTargetPerformanceReportColumn }
     * 
     */
    public ArrayOfProductTargetPerformanceReportColumn createArrayOfProductTargetPerformanceReportColumn() {
        return new ArrayOfProductTargetPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductDimensionPerformanceReportFilter }
     * 
     */
    public ProductDimensionPerformanceReportFilter createProductDimensionPerformanceReportFilter() {
        return new ProductDimensionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link TrafficSourcesReportRequest }
     * 
     */
    public TrafficSourcesReportRequest createTrafficSourcesReportRequest() {
        return new TrafficSourcesReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfConversionPerformanceReportColumn }
     * 
     */
    public ArrayOfConversionPerformanceReportColumn createArrayOfConversionPerformanceReportColumn() {
        return new ArrayOfConversionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link SearchCampaignChangeHistoryReportFilter }
     * 
     */
    public SearchCampaignChangeHistoryReportFilter createSearchCampaignChangeHistoryReportFilter() {
        return new SearchCampaignChangeHistoryReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionDetailReportRequest }
     * 
     */
    public AdExtensionDetailReportRequest createAdExtensionDetailReportRequest() {
        return new AdExtensionDetailReportRequest();
    }

    /**
     * Create an instance of {@link DestinationUrlPerformanceReportFilter }
     * 
     */
    public DestinationUrlPerformanceReportFilter createDestinationUrlPerformanceReportFilter() {
        return new DestinationUrlPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountReportScope }
     * 
     */
    public AccountReportScope createAccountReportScope() {
        return new AccountReportScope();
    }

    /**
     * Create an instance of {@link ProductOfferPerformanceReportFilter }
     * 
     */
    public ProductOfferPerformanceReportFilter createProductOfferPerformanceReportFilter() {
        return new ProductOfferPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ReportRequestStatus }
     * 
     */
    public ReportRequestStatus createReportRequestStatus() {
        return new ReportRequestStatus();
    }

    /**
     * Create an instance of {@link AccountPerformanceReportRequest }
     * 
     */
    public AccountPerformanceReportRequest createAccountPerformanceReportRequest() {
        return new AccountPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link GeographicalLocationReportRequest }
     * 
     */
    public GeographicalLocationReportRequest createGeographicalLocationReportRequest() {
        return new GeographicalLocationReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionByKeywordReportColumn }
     * 
     */
    public ArrayOfAdExtensionByKeywordReportColumn createArrayOfAdExtensionByKeywordReportColumn() {
        return new ArrayOfAdExtensionByKeywordReportColumn();
    }

    /**
     * Create an instance of {@link AdExtensionByAdReportRequest }
     * 
     */
    public AdExtensionByAdReportRequest createAdExtensionByAdReportRequest() {
        return new AdExtensionByAdReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionByAdReportColumn }
     * 
     */
    public ArrayOfAdExtensionByAdReportColumn createArrayOfAdExtensionByAdReportColumn() {
        return new ArrayOfAdExtensionByAdReportColumn();
    }

    /**
     * Create an instance of {@link GeoLocationPerformanceReportFilter }
     * 
     */
    public GeoLocationPerformanceReportFilter createGeoLocationPerformanceReportFilter() {
        return new GeoLocationPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link SitePerformanceReportRequest }
     * 
     */
    public SitePerformanceReportRequest createSitePerformanceReportRequest() {
        return new SitePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link PollGenerateReportRequest }
     * 
     */
    public PollGenerateReportRequest createPollGenerateReportRequest() {
        return new PollGenerateReportRequest();
    }

    /**
     * Create an instance of {@link SitePerformanceReportFilter }
     * 
     */
    public SitePerformanceReportFilter createSitePerformanceReportFilter() {
        return new SitePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductOfferPerformanceReportRequest }
     * 
     */
    public ProductOfferPerformanceReportRequest createProductOfferPerformanceReportRequest() {
        return new ProductOfferPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ReportRequest }
     * 
     */
    public ReportRequest createReportRequest() {
        return new ReportRequest();
    }

    /**
     * Create an instance of {@link BatchError }
     * 
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link RichAdComponentPerformanceReportFilter }
     * 
     */
    public RichAdComponentPerformanceReportFilter createRichAdComponentPerformanceReportFilter() {
        return new RichAdComponentPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link PublisherUsagePerformanceReportFilter }
     * 
     */
    public PublisherUsagePerformanceReportFilter createPublisherUsagePerformanceReportFilter() {
        return new PublisherUsagePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link AccountThroughAdGroupReportScope }
     * 
     */
    public AccountThroughAdGroupReportScope createAccountThroughAdGroupReportScope() {
        return new AccountThroughAdGroupReportScope();
    }

    /**
     * Create an instance of {@link BrandZonePerformanceReportFilter }
     * 
     */
    public BrandZonePerformanceReportFilter createBrandZonePerformanceReportFilter() {
        return new BrandZonePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupPerformanceReportColumn }
     * 
     */
    public ArrayOfAdGroupPerformanceReportColumn createArrayOfAdGroupPerformanceReportColumn() {
        return new ArrayOfAdGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ShareOfVoiceReportFilter }
     * 
     */
    public ShareOfVoiceReportFilter createShareOfVoiceReportFilter() {
        return new ShareOfVoiceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignPerformanceReportColumn }
     * 
     */
    public ArrayOfCampaignPerformanceReportColumn createArrayOfCampaignPerformanceReportColumn() {
        return new ArrayOfCampaignPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AdDynamicTextPerformanceReportRequest }
     * 
     */
    public AdDynamicTextPerformanceReportRequest createAdDynamicTextPerformanceReportRequest() {
        return new AdDynamicTextPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportRequest }
     * 
     */
    public KeywordPerformanceReportRequest createKeywordPerformanceReportRequest() {
        return new KeywordPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfRichAdComponentPerformanceReportColumn }
     * 
     */
    public ArrayOfRichAdComponentPerformanceReportColumn createArrayOfRichAdComponentPerformanceReportColumn() {
        return new ArrayOfRichAdComponentPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfTrafficSourcesReportColumn }
     * 
     */
    public ArrayOfTrafficSourcesReportColumn createArrayOfTrafficSourcesReportColumn() {
        return new ArrayOfTrafficSourcesReportColumn();
    }

    /**
     * Create an instance of {@link SubmitGenerateReportRequest }
     * 
     */
    public SubmitGenerateReportRequest createSubmitGenerateReportRequest() {
        return new SubmitGenerateReportRequest();
    }

    /**
     * Create an instance of {@link TacticChannelReportFilter }
     * 
     */
    public TacticChannelReportFilter createTacticChannelReportFilter() {
        return new TacticChannelReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionByKeywordReportRequest }
     * 
     */
    public AdExtensionByKeywordReportRequest createAdExtensionByKeywordReportRequest() {
        return new AdExtensionByKeywordReportRequest();
    }

    /**
     * Create an instance of {@link AdPerformanceReportFilter }
     * 
     */
    public AdPerformanceReportFilter createAdPerformanceReportFilter() {
        return new AdPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfGeoLocationPerformanceReportColumn }
     * 
     */
    public ArrayOfGeoLocationPerformanceReportColumn createArrayOfGeoLocationPerformanceReportColumn() {
        return new ArrayOfGeoLocationPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link TrafficSourcesReportFilter }
     * 
     */
    public TrafficSourcesReportFilter createTrafficSourcesReportFilter() {
        return new TrafficSourcesReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionDimensionReportRequest }
     * 
     */
    public AdExtensionDimensionReportRequest createAdExtensionDimensionReportRequest() {
        return new AdExtensionDimensionReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSearchCampaignChangeHistoryReportColumn }
     * 
     */
    public ArrayOfSearchCampaignChangeHistoryReportColumn createArrayOfSearchCampaignChangeHistoryReportColumn() {
        return new ArrayOfSearchCampaignChangeHistoryReportColumn();
    }

    /**
     * Create an instance of {@link DestinationUrlPerformanceReportRequest }
     * 
     */
    public DestinationUrlPerformanceReportRequest createDestinationUrlPerformanceReportRequest() {
        return new DestinationUrlPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link AdGroupPerformanceReportFilter }
     * 
     */
    public AdGroupPerformanceReportFilter createAdGroupPerformanceReportFilter() {
        return new AdGroupPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ShareOfVoiceReportRequest }
     * 
     */
    public ShareOfVoiceReportRequest createShareOfVoiceReportRequest() {
        return new ShareOfVoiceReportRequest();
    }

    /**
     * Create an instance of {@link PublisherUsagePerformanceReportRequest }
     * 
     */
    public PublisherUsagePerformanceReportRequest createPublisherUsagePerformanceReportRequest() {
        return new PublisherUsagePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link CallDetailReportRequest }
     * 
     */
    public CallDetailReportRequest createCallDetailReportRequest() {
        return new CallDetailReportRequest();
    }

    /**
     * Create an instance of {@link TacticChannelReportRequest }
     * 
     */
    public TacticChannelReportRequest createTacticChannelReportRequest() {
        return new TacticChannelReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductPartitionUnitPerformanceReportColumn }
     * 
     */
    public ArrayOfProductPartitionUnitPerformanceReportColumn createArrayOfProductPartitionUnitPerformanceReportColumn() {
        return new ArrayOfProductPartitionUnitPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link PollGenerateReportResponse }
     * 
     */
    public PollGenerateReportResponse createPollGenerateReportResponse() {
        return new PollGenerateReportResponse();
    }

    /**
     * Create an instance of {@link CampaignPerformanceReportRequest }
     * 
     */
    public CampaignPerformanceReportRequest createCampaignPerformanceReportRequest() {
        return new CampaignPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ReportTime }
     * 
     */
    public ReportTime createReportTime() {
        return new ReportTime();
    }

    /**
     * Create an instance of {@link AgeGenderDemographicReportRequest }
     * 
     */
    public AgeGenderDemographicReportRequest createAgeGenderDemographicReportRequest() {
        return new AgeGenderDemographicReportRequest();
    }

    /**
     * Create an instance of {@link AdExtensionByKeywordReportFilter }
     * 
     */
    public AdExtensionByKeywordReportFilter createAdExtensionByKeywordReportFilter() {
        return new AdExtensionByKeywordReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAccountPerformanceReportColumn }
     * 
     */
    public ArrayOfAccountPerformanceReportColumn createArrayOfAccountPerformanceReportColumn() {
        return new ArrayOfAccountPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link GeographicalLocationReportFilter }
     * 
     */
    public GeographicalLocationReportFilter createGeographicalLocationReportFilter() {
        return new GeographicalLocationReportFilter();
    }

    /**
     * Create an instance of {@link AgeGenderDemographicReportFilter }
     * 
     */
    public AgeGenderDemographicReportFilter createAgeGenderDemographicReportFilter() {
        return new AgeGenderDemographicReportFilter();
    }

    /**
     * Create an instance of {@link AdGroupReportScope }
     * 
     */
    public AdGroupReportScope createAdGroupReportScope() {
        return new AdGroupReportScope();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportSort }
     * 
     */
    public KeywordPerformanceReportSort createKeywordPerformanceReportSort() {
        return new KeywordPerformanceReportSort();
    }

    /**
     * Create an instance of {@link ArrayOfTacticChannelReportColumn }
     * 
     */
    public ArrayOfTacticChannelReportColumn createArrayOfTacticChannelReportColumn() {
        return new ArrayOfTacticChannelReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfShareOfVoiceReportColumn }
     * 
     */
    public ArrayOfShareOfVoiceReportColumn createArrayOfShareOfVoiceReportColumn() {
        return new ArrayOfShareOfVoiceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfCallDetailReportColumn }
     * 
     */
    public ArrayOfCallDetailReportColumn createArrayOfCallDetailReportColumn() {
        return new ArrayOfCallDetailReportColumn();
    }

    /**
     * Create an instance of {@link ConversionPerformanceReportFilter }
     * 
     */
    public ConversionPerformanceReportFilter createConversionPerformanceReportFilter() {
        return new ConversionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfOperationError }
     * 
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
    }

    /**
     * Create an instance of {@link ArrayOfProductOfferPerformanceReportColumn }
     * 
     */
    public ArrayOfProductOfferPerformanceReportColumn createArrayOfProductOfferPerformanceReportColumn() {
        return new ArrayOfProductOfferPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AdExtensionDetailReportFilter }
     * 
     */
    public AdExtensionDetailReportFilter createAdExtensionDetailReportFilter() {
        return new AdExtensionDetailReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAdPerformanceReportColumn }
     * 
     */
    public ArrayOfAdPerformanceReportColumn createArrayOfAdPerformanceReportColumn() {
        return new ArrayOfAdPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductDimensionPerformanceReportRequest }
     * 
     */
    public ProductDimensionPerformanceReportRequest createProductDimensionPerformanceReportRequest() {
        return new ProductDimensionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link AdDynamicTextPerformanceReportFilter }
     * 
     */
    public AdDynamicTextPerformanceReportFilter createAdDynamicTextPerformanceReportFilter() {
        return new AdDynamicTextPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountPerformanceReportFilter }
     * 
     */
    public AccountPerformanceReportFilter createAccountPerformanceReportFilter() {
        return new AccountPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAgeGenderDemographicReportColumn }
     * 
     */
    public ArrayOfAgeGenderDemographicReportColumn createArrayOfAgeGenderDemographicReportColumn() {
        return new ArrayOfAgeGenderDemographicReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfProductDimensionPerformanceReportColumn }
     * 
     */
    public ArrayOfProductDimensionPerformanceReportColumn createArrayOfProductDimensionPerformanceReportColumn() {
        return new ArrayOfProductDimensionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfDestinationUrlPerformanceReportColumn }
     * 
     */
    public ArrayOfDestinationUrlPerformanceReportColumn createArrayOfDestinationUrlPerformanceReportColumn() {
        return new ArrayOfDestinationUrlPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductPartitionPerformanceReportRequest }
     * 
     */
    public ProductPartitionPerformanceReportRequest createProductPartitionPerformanceReportRequest() {
        return new ProductPartitionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link SearchQueryPerformanceReportRequest }
     * 
     */
    public SearchQueryPerformanceReportRequest createSearchQueryPerformanceReportRequest() {
        return new SearchQueryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ProductTargetPerformanceReportRequest }
     * 
     */
    public ProductTargetPerformanceReportRequest createProductTargetPerformanceReportRequest() {
        return new ProductTargetPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link SearchQueryPerformanceReportFilter }
     * 
     */
    public SearchQueryPerformanceReportFilter createSearchQueryPerformanceReportFilter() {
        return new SearchQueryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAdDynamicTextPerformanceReportColumn }
     * 
     */
    public ArrayOfAdDynamicTextPerformanceReportColumn createArrayOfAdDynamicTextPerformanceReportColumn() {
        return new ArrayOfAdDynamicTextPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link BrandZonePerformanceReportRequest }
     * 
     */
    public BrandZonePerformanceReportRequest createBrandZonePerformanceReportRequest() {
        return new BrandZonePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupReportScope }
     * 
     */
    public ArrayOfAdGroupReportScope createArrayOfAdGroupReportScope() {
        return new ArrayOfAdGroupReportScope();
    }

    /**
     * Create an instance of {@link AdExtensionByAdReportFilter }
     * 
     */
    public AdExtensionByAdReportFilter createAdExtensionByAdReportFilter() {
        return new AdExtensionByAdReportFilter();
    }

    /**
     * Create an instance of {@link ProductTargetPerformanceReportFilter }
     * 
     */
    public ProductTargetPerformanceReportFilter createProductTargetPerformanceReportFilter() {
        return new ProductTargetPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAudiencePerformanceReportColumn }
     * 
     */
    public ArrayOfAudiencePerformanceReportColumn createArrayOfAudiencePerformanceReportColumn() {
        return new ArrayOfAudiencePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link GoalsAndFunnelsReportFilter }
     * 
     */
    public GoalsAndFunnelsReportFilter createGoalsAndFunnelsReportFilter() {
        return new GoalsAndFunnelsReportFilter();
    }

    /**
     * Create an instance of {@link AdPerformanceReportRequest }
     * 
     */
    public AdPerformanceReportRequest createAdPerformanceReportRequest() {
        return new AdPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfNegativeKeywordConflictReportColumn }
     * 
     */
    public ArrayOfNegativeKeywordConflictReportColumn createArrayOfNegativeKeywordConflictReportColumn() {
        return new ArrayOfNegativeKeywordConflictReportColumn();
    }

    /**
     * Create an instance of {@link BudgetSummaryReportRequest }
     * 
     */
    public BudgetSummaryReportRequest createBudgetSummaryReportRequest() {
        return new BudgetSummaryReportRequest();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link AdExtensionDimensionReportFilter }
     * 
     */
    public AdExtensionDimensionReportFilter createAdExtensionDimensionReportFilter() {
        return new AdExtensionDimensionReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordPerformanceReportColumn }
     * 
     */
    public ArrayOfKeywordPerformanceReportColumn createArrayOfKeywordPerformanceReportColumn() {
        return new ArrayOfKeywordPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AudiencePerformanceReportRequest }
     * 
     */
    public AudiencePerformanceReportRequest createAudiencePerformanceReportRequest() {
        return new AudiencePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link AdGroupPerformanceReportRequest }
     * 
     */
    public AdGroupPerformanceReportRequest createAdGroupPerformanceReportRequest() {
        return new AdGroupPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link BudgetSummaryReportTime }
     * 
     */
    public BudgetSummaryReportTime createBudgetSummaryReportTime() {
        return new BudgetSummaryReportTime();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionDimensionReportColumn }
     * 
     */
    public ArrayOfAdExtensionDimensionReportColumn createArrayOfAdExtensionDimensionReportColumn() {
        return new ArrayOfAdExtensionDimensionReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfPublisherUsagePerformanceReportColumn }
     * 
     */
    public ArrayOfPublisherUsagePerformanceReportColumn createArrayOfPublisherUsagePerformanceReportColumn() {
        return new ArrayOfPublisherUsagePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionDetailReportColumn }
     * 
     */
    public ArrayOfAdExtensionDetailReportColumn createArrayOfAdExtensionDetailReportColumn() {
        return new ArrayOfAdExtensionDetailReportColumn();
    }

    /**
     * Create an instance of {@link ProductPartitionPerformanceReportFilter }
     * 
     */
    public ProductPartitionPerformanceReportFilter createProductPartitionPerformanceReportFilter() {
        return new ProductPartitionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportFilter }
     * 
     */
    public KeywordPerformanceReportFilter createKeywordPerformanceReportFilter() {
        return new KeywordPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
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
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TacticChannelReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TacticChannelReportFilter")
    public JAXBElement<TacticChannelReportFilter> createTacticChannelReportFilter(TacticChannelReportFilter value) {
        return new JAXBElement<TacticChannelReportFilter>(_TacticChannelReportFilter_QNAME, TacticChannelReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "PublisherUsagePerformanceReportColumn")
    public JAXBElement<PublisherUsagePerformanceReportColumn> createPublisherUsagePerformanceReportColumn(PublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<PublisherUsagePerformanceReportColumn>(_PublisherUsagePerformanceReportColumn_QNAME, PublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByKeywordReportRequest")
    public JAXBElement<AdExtensionByKeywordReportRequest> createAdExtensionByKeywordReportRequest(AdExtensionByKeywordReportRequest value) {
        return new JAXBElement<AdExtensionByKeywordReportRequest>(_AdExtensionByKeywordReportRequest_QNAME, AdExtensionByKeywordReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeoLocationPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfGeoLocationPerformanceReportColumn")
    public JAXBElement<ArrayOfGeoLocationPerformanceReportColumn> createArrayOfGeoLocationPerformanceReportColumn(ArrayOfGeoLocationPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfGeoLocationPerformanceReportColumn>(_ArrayOfGeoLocationPerformanceReportColumn_QNAME, ArrayOfGeoLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDimensionReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDimensionReportRequest")
    public JAXBElement<AdExtensionDimensionReportRequest> createAdExtensionDimensionReportRequest(AdExtensionDimensionReportRequest value) {
        return new JAXBElement<AdExtensionDimensionReportRequest>(_AdExtensionDimensionReportRequest_QNAME, AdExtensionDimensionReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichAdComponentPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "RichAdComponentPerformanceReportColumn")
    public JAXBElement<RichAdComponentPerformanceReportColumn> createRichAdComponentPerformanceReportColumn(RichAdComponentPerformanceReportColumn value) {
        return new JAXBElement<RichAdComponentPerformanceReportColumn>(_RichAdComponentPerformanceReportColumn_QNAME, RichAdComponentPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCampaignChangeHistoryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfSearchCampaignChangeHistoryReportColumn")
    public JAXBElement<ArrayOfSearchCampaignChangeHistoryReportColumn> createArrayOfSearchCampaignChangeHistoryReportColumn(ArrayOfSearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<ArrayOfSearchCampaignChangeHistoryReportColumn>(_ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME, ArrayOfSearchCampaignChangeHistoryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DestinationUrlPerformanceReportRequest")
    public JAXBElement<DestinationUrlPerformanceReportRequest> createDestinationUrlPerformanceReportRequest(DestinationUrlPerformanceReportRequest value) {
        return new JAXBElement<DestinationUrlPerformanceReportRequest>(_DestinationUrlPerformanceReportRequest_QNAME, DestinationUrlPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdGroupPerformanceReportFilter")
    public JAXBElement<AdGroupPerformanceReportFilter> createAdGroupPerformanceReportFilter(AdGroupPerformanceReportFilter value) {
        return new JAXBElement<AdGroupPerformanceReportFilter>(_AdGroupPerformanceReportFilter_QNAME, AdGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ShareOfVoiceReportRequest")
    public JAXBElement<ShareOfVoiceReportRequest> createShareOfVoiceReportRequest(ShareOfVoiceReportRequest value) {
        return new JAXBElement<ShareOfVoiceReportRequest>(_ShareOfVoiceReportRequest_QNAME, ShareOfVoiceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDimensionReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDimensionReportColumn")
    public JAXBElement<AdExtensionDimensionReportColumn> createAdExtensionDimensionReportColumn(AdExtensionDimensionReportColumn value) {
        return new JAXBElement<AdExtensionDimensionReportColumn>(_AdExtensionDimensionReportColumn_QNAME, AdExtensionDimensionReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TacticChannelReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TacticChannelReportRequest")
    public JAXBElement<TacticChannelReportRequest> createTacticChannelReportRequest(TacticChannelReportRequest value) {
        return new JAXBElement<TacticChannelReportRequest>(_TacticChannelReportRequest_QNAME, TacticChannelReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionUnitPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionUnitPerformanceReportColumn> createArrayOfProductPartitionUnitPerformanceReportColumn(ArrayOfProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductPartitionUnitPerformanceReportColumn>(_ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME, ArrayOfProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DestinationUrlPerformanceReportColumn")
    public JAXBElement<DestinationUrlPerformanceReportColumn> createDestinationUrlPerformanceReportColumn(DestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<DestinationUrlPerformanceReportColumn>(_DestinationUrlPerformanceReportColumn_QNAME, DestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CampaignPerformanceReportRequest")
    public JAXBElement<CampaignPerformanceReportRequest> createCampaignPerformanceReportRequest(CampaignPerformanceReportRequest value) {
        return new JAXBElement<CampaignPerformanceReportRequest>(_CampaignPerformanceReportRequest_QNAME, CampaignPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SitePerformanceReportColumn")
    public JAXBElement<SitePerformanceReportColumn> createSitePerformanceReportColumn(SitePerformanceReportColumn value) {
        return new JAXBElement<SitePerformanceReportColumn>(_SitePerformanceReportColumn_QNAME, SitePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderDemographicReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AgeGenderDemographicReportRequest")
    public JAXBElement<AgeGenderDemographicReportRequest> createAgeGenderDemographicReportRequest(AgeGenderDemographicReportRequest value) {
        return new JAXBElement<AgeGenderDemographicReportRequest>(_AgeGenderDemographicReportRequest_QNAME, AgeGenderDemographicReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ChangeTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<ChangeTypeReportFilter>> createChangeTypeReportFilter(Collection<ChangeTypeReportFilter> value) {
        return new JAXBElement<Collection<ChangeTypeReportFilter>>(_ChangeTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicalLocationReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeographicalLocationReportFilter")
    public JAXBElement<GeographicalLocationReportFilter> createGeographicalLocationReportFilter(GeographicalLocationReportFilter value) {
        return new JAXBElement<GeographicalLocationReportFilter>(_GeographicalLocationReportFilter_QNAME, GeographicalLocationReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdGroupReportScope")
    public JAXBElement<AdGroupReportScope> createAdGroupReportScope(AdGroupReportScope value) {
        return new JAXBElement<AdGroupReportScope>(_AdGroupReportScope_QNAME, AdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "KeywordPerformanceReportSort")
    public JAXBElement<KeywordPerformanceReportSort> createKeywordPerformanceReportSort(KeywordPerformanceReportSort value) {
        return new JAXBElement<KeywordPerformanceReportSort>(_KeywordPerformanceReportSort_QNAME, KeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareOfVoiceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfShareOfVoiceReportColumn")
    public JAXBElement<ArrayOfShareOfVoiceReportColumn> createArrayOfShareOfVoiceReportColumn(ArrayOfShareOfVoiceReportColumn value) {
        return new JAXBElement<ArrayOfShareOfVoiceReportColumn>(_ArrayOfShareOfVoiceReportColumn_QNAME, ArrayOfShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfCallDetailReportColumn")
    public JAXBElement<ArrayOfCallDetailReportColumn> createArrayOfCallDetailReportColumn(ArrayOfCallDetailReportColumn value) {
        return new JAXBElement<ArrayOfCallDetailReportColumn>(_ArrayOfCallDetailReportColumn_QNAME, ArrayOfCallDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductOfferPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfProductOfferPerformanceReportColumn")
    public JAXBElement<ArrayOfProductOfferPerformanceReportColumn> createArrayOfProductOfferPerformanceReportColumn(ArrayOfProductOfferPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductOfferPerformanceReportColumn>(_ArrayOfProductOfferPerformanceReportColumn_QNAME, ArrayOfProductOfferPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdPerformanceReportColumn")
    public JAXBElement<ArrayOfAdPerformanceReportColumn> createArrayOfAdPerformanceReportColumn(ArrayOfAdPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdPerformanceReportColumn>(_ArrayOfAdPerformanceReportColumn_QNAME, ArrayOfAdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdDynamicTextPerformanceReportFilter")
    public JAXBElement<AdDynamicTextPerformanceReportFilter> createAdDynamicTextPerformanceReportFilter(AdDynamicTextPerformanceReportFilter value) {
        return new JAXBElement<AdDynamicTextPerformanceReportFilter>(_AdDynamicTextPerformanceReportFilter_QNAME, AdDynamicTextPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByKeywordReportColumn")
    public JAXBElement<AdExtensionByKeywordReportColumn> createAdExtensionByKeywordReportColumn(AdExtensionByKeywordReportColumn value) {
        return new JAXBElement<AdExtensionByKeywordReportColumn>(_AdExtensionByKeywordReportColumn_QNAME, AdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountPerformanceReportFilter")
    public JAXBElement<AccountPerformanceReportFilter> createAccountPerformanceReportFilter(AccountPerformanceReportFilter value) {
        return new JAXBElement<AccountPerformanceReportFilter>(_AccountPerformanceReportFilter_QNAME, AccountPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeGenderDemographicReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAgeGenderDemographicReportColumn")
    public JAXBElement<ArrayOfAgeGenderDemographicReportColumn> createArrayOfAgeGenderDemographicReportColumn(ArrayOfAgeGenderDemographicReportColumn value) {
        return new JAXBElement<ArrayOfAgeGenderDemographicReportColumn>(_ArrayOfAgeGenderDemographicReportColumn_QNAME, ArrayOfAgeGenderDemographicReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinationUrlPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfDestinationUrlPerformanceReportColumn")
    public JAXBElement<ArrayOfDestinationUrlPerformanceReportColumn> createArrayOfDestinationUrlPerformanceReportColumn(ArrayOfDestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfDestinationUrlPerformanceReportColumn>(_ArrayOfDestinationUrlPerformanceReportColumn_QNAME, ArrayOfDestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionPerformanceReportRequest")
    public JAXBElement<ProductPartitionPerformanceReportRequest> createProductPartitionPerformanceReportRequest(ProductPartitionPerformanceReportRequest value) {
        return new JAXBElement<ProductPartitionPerformanceReportRequest>(_ProductPartitionPerformanceReportRequest_QNAME, ProductPartitionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductTargetPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductTargetPerformanceReportRequest")
    public JAXBElement<ProductTargetPerformanceReportRequest> createProductTargetPerformanceReportRequest(ProductTargetPerformanceReportRequest value) {
        return new JAXBElement<ProductTargetPerformanceReportRequest>(_ProductTargetPerformanceReportRequest_QNAME, ProductTargetPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportRequestStatusType")
    public JAXBElement<ReportRequestStatusType> createReportRequestStatusType(ReportRequestStatusType value) {
        return new JAXBElement<ReportRequestStatusType>(_ReportRequestStatusType_QNAME, ReportRequestStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchQueryPerformanceReportFilter")
    public JAXBElement<SearchQueryPerformanceReportFilter> createSearchQueryPerformanceReportFilter(SearchQueryPerformanceReportFilter value) {
        return new JAXBElement<SearchQueryPerformanceReportFilter>(_SearchQueryPerformanceReportFilter_QNAME, SearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdDynamicTextPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdDynamicTextPerformanceReportColumn")
    public JAXBElement<ArrayOfAdDynamicTextPerformanceReportColumn> createArrayOfAdDynamicTextPerformanceReportColumn(ArrayOfAdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdDynamicTextPerformanceReportColumn>(_ArrayOfAdDynamicTextPerformanceReportColumn_QNAME, ArrayOfAdDynamicTextPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandZonePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BrandZonePerformanceReportRequest")
    public JAXBElement<BrandZonePerformanceReportRequest> createBrandZonePerformanceReportRequest(BrandZonePerformanceReportRequest value) {
        return new JAXBElement<BrandZonePerformanceReportRequest>(_BrandZonePerformanceReportRequest_QNAME, BrandZonePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDetailReportColumn")
    public JAXBElement<AdExtensionDetailReportColumn> createAdExtensionDetailReportColumn(AdExtensionDetailReportColumn value) {
        return new JAXBElement<AdExtensionDetailReportColumn>(_AdExtensionDetailReportColumn_QNAME, AdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByAdReportFilter")
    public JAXBElement<AdExtensionByAdReportFilter> createAdExtensionByAdReportFilter(AdExtensionByAdReportFilter value) {
        return new JAXBElement<AdExtensionByAdReportFilter>(_AdExtensionByAdReportFilter_QNAME, AdExtensionByAdReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductTargetPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductTargetPerformanceReportFilter")
    public JAXBElement<ProductTargetPerformanceReportFilter> createProductTargetPerformanceReportFilter(ProductTargetPerformanceReportFilter value) {
        return new JAXBElement<ProductTargetPerformanceReportFilter>(_ProductTargetPerformanceReportFilter_QNAME, ProductTargetPerformanceReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GoalsAndFunnelsReportFilter")
    public JAXBElement<GoalsAndFunnelsReportFilter> createGoalsAndFunnelsReportFilter(GoalsAndFunnelsReportFilter value) {
        return new JAXBElement<GoalsAndFunnelsReportFilter>(_GoalsAndFunnelsReportFilter_QNAME, GoalsAndFunnelsReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BudgetSummaryReportRequest")
    public JAXBElement<BudgetSummaryReportRequest> createBudgetSummaryReportRequest(BudgetSummaryReportRequest value) {
        return new JAXBElement<BudgetSummaryReportRequest>(_BudgetSummaryReportRequest_QNAME, BudgetSummaryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionPerformanceReportColumn")
    public JAXBElement<ProductPartitionPerformanceReportColumn> createProductPartitionPerformanceReportColumn(ProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<ProductPartitionPerformanceReportColumn>(_ProductPartitionPerformanceReportColumn_QNAME, ProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdDistributionReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdDistributionReportFilter")
    @XmlJavaTypeAdapter(Adapter15 .class)
    public JAXBElement<Collection<AdDistributionReportFilter>> createAdDistributionReportFilter(Collection<AdDistributionReportFilter> value) {
        return new JAXBElement<Collection<AdDistributionReportFilter>>(_AdDistributionReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AudiencePerformanceReportRequest")
    public JAXBElement<AudiencePerformanceReportRequest> createAudiencePerformanceReportRequest(AudiencePerformanceReportRequest value) {
        return new JAXBElement<AudiencePerformanceReportRequest>(_AudiencePerformanceReportRequest_QNAME, AudiencePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BudgetSummaryReportTime")
    public JAXBElement<BudgetSummaryReportTime> createBudgetSummaryReportTime(BudgetSummaryReportTime value) {
        return new JAXBElement<BudgetSummaryReportTime>(_BudgetSummaryReportTime_QNAME, BudgetSummaryReportTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionDimensionReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdExtensionDimensionReportColumn")
    public JAXBElement<ArrayOfAdExtensionDimensionReportColumn> createArrayOfAdExtensionDimensionReportColumn(ArrayOfAdExtensionDimensionReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionDimensionReportColumn>(_ArrayOfAdExtensionDimensionReportColumn_QNAME, ArrayOfAdExtensionDimensionReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublisherUsagePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfPublisherUsagePerformanceReportColumn")
    public JAXBElement<ArrayOfPublisherUsagePerformanceReportColumn> createArrayOfPublisherUsagePerformanceReportColumn(ArrayOfPublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfPublisherUsagePerformanceReportColumn>(_ArrayOfPublisherUsagePerformanceReportColumn_QNAME, ArrayOfPublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "KeywordPerformanceReportFilter")
    public JAXBElement<KeywordPerformanceReportFilter> createKeywordPerformanceReportFilter(KeywordPerformanceReportFilter value) {
        return new JAXBElement<KeywordPerformanceReportFilter>(_KeywordPerformanceReportFilter_QNAME, KeywordPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetSummaryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfBudgetSummaryReportColumn")
    public JAXBElement<ArrayOfBudgetSummaryReportColumn> createArrayOfBudgetSummaryReportColumn(ArrayOfBudgetSummaryReportColumn value) {
        return new JAXBElement<ArrayOfBudgetSummaryReportColumn>(_ArrayOfBudgetSummaryReportColumn_QNAME, ArrayOfBudgetSummaryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CampaignReportScope")
    public JAXBElement<CampaignReportScope> createCampaignReportScope(CampaignReportScope value) {
        return new JAXBElement<CampaignReportScope>(_CampaignReportScope_QNAME, CampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfCampaignReportScope")
    public JAXBElement<ArrayOfCampaignReportScope> createArrayOfCampaignReportScope(ArrayOfCampaignReportScope value) {
        return new JAXBElement<ArrayOfCampaignReportScope>(_ArrayOfCampaignReportScope_QNAME, ArrayOfCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfProductPartitionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionPerformanceReportColumn> createArrayOfProductPartitionPerformanceReportColumn(ArrayOfProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductPartitionPerformanceReportColumn>(_ArrayOfProductPartitionPerformanceReportColumn_QNAME, ArrayOfProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandZonePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BrandZonePerformanceReportColumn")
    public JAXBElement<BrandZonePerformanceReportColumn> createBrandZonePerformanceReportColumn(BrandZonePerformanceReportColumn value) {
        return new JAXBElement<BrandZonePerformanceReportColumn>(_BrandZonePerformanceReportColumn_QNAME, BrandZonePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBrandZonePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfBrandZonePerformanceReportColumn")
    public JAXBElement<ArrayOfBrandZonePerformanceReportColumn> createArrayOfBrandZonePerformanceReportColumn(ArrayOfBrandZonePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfBrandZonePerformanceReportColumn>(_ArrayOfBrandZonePerformanceReportColumn_QNAME, ArrayOfBrandZonePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeographicalLocationReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfGeographicalLocationReportColumn")
    public JAXBElement<ArrayOfGeographicalLocationReportColumn> createArrayOfGeographicalLocationReportColumn(ArrayOfGeographicalLocationReportColumn value) {
        return new JAXBElement<ArrayOfGeographicalLocationReportColumn>(_ArrayOfGeographicalLocationReportColumn_QNAME, ArrayOfGeographicalLocationReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchQueryPerformanceReportColumn")
    public JAXBElement<SearchQueryPerformanceReportColumn> createSearchQueryPerformanceReportColumn(SearchQueryPerformanceReportColumn value) {
        return new JAXBElement<SearchQueryPerformanceReportColumn>(_SearchQueryPerformanceReportColumn_QNAME, SearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicalLocationReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeographicalLocationReportColumn")
    public JAXBElement<GeographicalLocationReportColumn> createGeographicalLocationReportColumn(GeographicalLocationReportColumn value) {
        return new JAXBElement<GeographicalLocationReportColumn>(_GeographicalLocationReportColumn_QNAME, GeographicalLocationReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GoalsAndFunnelsReportRequest")
    public JAXBElement<GoalsAndFunnelsReportRequest> createGoalsAndFunnelsReportRequest(GoalsAndFunnelsReportRequest value) {
        return new JAXBElement<GoalsAndFunnelsReportRequest>(_GoalsAndFunnelsReportRequest_QNAME, GoalsAndFunnelsReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichAdComponentPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "RichAdComponentPerformanceReportRequest")
    public JAXBElement<RichAdComponentPerformanceReportRequest> createRichAdComponentPerformanceReportRequest(RichAdComponentPerformanceReportRequest value) {
        return new JAXBElement<RichAdComponentPerformanceReportRequest>(_RichAdComponentPerformanceReportRequest_QNAME, RichAdComponentPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfKeywordPerformanceReportSort")
    public JAXBElement<ArrayOfKeywordPerformanceReportSort> createArrayOfKeywordPerformanceReportSort(ArrayOfKeywordPerformanceReportSort value) {
        return new JAXBElement<ArrayOfKeywordPerformanceReportSort>(_ArrayOfKeywordPerformanceReportSort_QNAME, ArrayOfKeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "NegativeKeywordConflictReportColumn")
    public JAXBElement<NegativeKeywordConflictReportColumn> createNegativeKeywordConflictReportColumn(NegativeKeywordConflictReportColumn value) {
        return new JAXBElement<NegativeKeywordConflictReportColumn>(_NegativeKeywordConflictReportColumn_QNAME, NegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughCampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountThroughCampaignReportScope")
    public JAXBElement<AccountThroughCampaignReportScope> createAccountThroughCampaignReportScope(AccountThroughCampaignReportScope value) {
        return new JAXBElement<AccountThroughCampaignReportScope>(_AccountThroughCampaignReportScope_QNAME, AccountThroughCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonHourlyReportAggregation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "NonHourlyReportAggregation")
    public JAXBElement<NonHourlyReportAggregation> createNonHourlyReportAggregation(NonHourlyReportAggregation value) {
        return new JAXBElement<NonHourlyReportAggregation>(_NonHourlyReportAggregation_QNAME, NonHourlyReportAggregation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionUnitPerformanceReportRequest")
    public JAXBElement<ProductPartitionUnitPerformanceReportRequest> createProductPartitionUnitPerformanceReportRequest(ProductPartitionUnitPerformanceReportRequest value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportRequest>(_ProductPartitionUnitPerformanceReportRequest_QNAME, ProductPartitionUnitPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductTargetPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfProductTargetPerformanceReportColumn")
    public JAXBElement<ArrayOfProductTargetPerformanceReportColumn> createArrayOfProductTargetPerformanceReportColumn(ArrayOfProductTargetPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductTargetPerformanceReportColumn>(_ArrayOfProductTargetPerformanceReportColumn_QNAME, ArrayOfProductTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceOSReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DeviceOSReportFilter")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<DeviceOSReportFilter>> createDeviceOSReportFilter(Collection<DeviceOSReportFilter> value) {
        return new JAXBElement<Collection<DeviceOSReportFilter>>(_DeviceOSReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchCampaignChangeHistoryReportFilter")
    public JAXBElement<SearchCampaignChangeHistoryReportFilter> createSearchCampaignChangeHistoryReportFilter(SearchCampaignChangeHistoryReportFilter value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportFilter>(_SearchCampaignChangeHistoryReportFilter_QNAME, SearchCampaignChangeHistoryReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDetailReportRequest")
    public JAXBElement<AdExtensionDetailReportRequest> createAdExtensionDetailReportRequest(AdExtensionDetailReportRequest value) {
        return new JAXBElement<AdExtensionDetailReportRequest>(_AdExtensionDetailReportRequest_QNAME, AdExtensionDetailReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountReportScope")
    public JAXBElement<AccountReportScope> createAccountReportScope(AccountReportScope value) {
        return new JAXBElement<AccountReportScope>(_AccountReportScope_QNAME, AccountReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ShareOfVoiceReportColumn")
    public JAXBElement<ShareOfVoiceReportColumn> createShareOfVoiceReportColumn(ShareOfVoiceReportColumn value) {
        return new JAXBElement<ShareOfVoiceReportColumn>(_ShareOfVoiceReportColumn_QNAME, ShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOfferPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductOfferPerformanceReportFilter")
    public JAXBElement<ProductOfferPerformanceReportFilter> createProductOfferPerformanceReportFilter(ProductOfferPerformanceReportFilter value) {
        return new JAXBElement<ProductOfferPerformanceReportFilter>(_ProductOfferPerformanceReportFilter_QNAME, ProductOfferPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportRequestStatus")
    public JAXBElement<ReportRequestStatus> createReportRequestStatus(ReportRequestStatus value) {
        return new JAXBElement<ReportRequestStatus>(_ReportRequestStatus_QNAME, ReportRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<AdStatusReportFilter>> createAdStatusReportFilter(Collection<AdStatusReportFilter> value) {
        return new JAXBElement<Collection<AdStatusReportFilter>>(_AdStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByKeywordReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdExtensionByKeywordReportColumn")
    public JAXBElement<ArrayOfAdExtensionByKeywordReportColumn> createArrayOfAdExtensionByKeywordReportColumn(ArrayOfAdExtensionByKeywordReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionByKeywordReportColumn>(_ArrayOfAdExtensionByKeywordReportColumn_QNAME, ArrayOfAdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CampaignPerformanceReportColumn")
    public JAXBElement<CampaignPerformanceReportColumn> createCampaignPerformanceReportColumn(CampaignPerformanceReportColumn value) {
        return new JAXBElement<CampaignPerformanceReportColumn>(_CampaignPerformanceReportColumn_QNAME, CampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeoLocationPerformanceReportFilter")
    public JAXBElement<GeoLocationPerformanceReportFilter> createGeoLocationPerformanceReportFilter(GeoLocationPerformanceReportFilter value) {
        return new JAXBElement<GeoLocationPerformanceReportFilter>(_GeoLocationPerformanceReportFilter_QNAME, GeoLocationPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SitePerformanceReportRequest")
    public JAXBElement<SitePerformanceReportRequest> createSitePerformanceReportRequest(SitePerformanceReportRequest value) {
        return new JAXBElement<SitePerformanceReportRequest>(_SitePerformanceReportRequest_QNAME, SitePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficSourcesReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TrafficSourcesReportColumn")
    public JAXBElement<TrafficSourcesReportColumn> createTrafficSourcesReportColumn(TrafficSourcesReportColumn value) {
        return new JAXBElement<TrafficSourcesReportColumn>(_TrafficSourcesReportColumn_QNAME, TrafficSourcesReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SitePerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SitePerformanceReportFilter")
    public JAXBElement<SitePerformanceReportFilter> createSitePerformanceReportFilter(SitePerformanceReportFilter value) {
        return new JAXBElement<SitePerformanceReportFilter>(_SitePerformanceReportFilter_QNAME, SitePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOfferPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductOfferPerformanceReportRequest")
    public JAXBElement<ProductOfferPerformanceReportRequest> createProductOfferPerformanceReportRequest(ProductOfferPerformanceReportRequest value) {
        return new JAXBElement<ProductOfferPerformanceReportRequest>(_ProductOfferPerformanceReportRequest_QNAME, ProductOfferPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportTimePeriod")
    public JAXBElement<ReportTimePeriod> createReportTimePeriod(ReportTimePeriod value) {
        return new JAXBElement<ReportTimePeriod>(_ReportTimePeriod_QNAME, ReportTimePeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportAggregation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportAggregation")
    public JAXBElement<ReportAggregation> createReportAggregation(ReportAggregation value) {
        return new JAXBElement<ReportAggregation>(_ReportAggregation_QNAME, ReportAggregation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RichAdComponentPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "RichAdComponentPerformanceReportFilter")
    public JAXBElement<RichAdComponentPerformanceReportFilter> createRichAdComponentPerformanceReportFilter(RichAdComponentPerformanceReportFilter value) {
        return new JAXBElement<RichAdComponentPerformanceReportFilter>(_RichAdComponentPerformanceReportFilter_QNAME, RichAdComponentPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfCampaignPerformanceReportColumn")
    public JAXBElement<ArrayOfCampaignPerformanceReportColumn> createArrayOfCampaignPerformanceReportColumn(ArrayOfCampaignPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfCampaignPerformanceReportColumn>(_ArrayOfCampaignPerformanceReportColumn_QNAME, ArrayOfCampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdDynamicTextPerformanceReportRequest")
    public JAXBElement<AdDynamicTextPerformanceReportRequest> createAdDynamicTextPerformanceReportRequest(AdDynamicTextPerformanceReportRequest value) {
        return new JAXBElement<AdDynamicTextPerformanceReportRequest>(_AdDynamicTextPerformanceReportRequest_QNAME, AdDynamicTextPerformanceReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "KeywordPerformanceReportRequest")
    public JAXBElement<KeywordPerformanceReportRequest> createKeywordPerformanceReportRequest(KeywordPerformanceReportRequest value) {
        return new JAXBElement<KeywordPerformanceReportRequest>(_KeywordPerformanceReportRequest_QNAME, KeywordPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRichAdComponentPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfRichAdComponentPerformanceReportColumn")
    public JAXBElement<ArrayOfRichAdComponentPerformanceReportColumn> createArrayOfRichAdComponentPerformanceReportColumn(ArrayOfRichAdComponentPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfRichAdComponentPerformanceReportColumn>(_ArrayOfRichAdComponentPerformanceReportColumn_QNAME, ArrayOfRichAdComponentPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrafficSourcesReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfTrafficSourcesReportColumn")
    public JAXBElement<ArrayOfTrafficSourcesReportColumn> createArrayOfTrafficSourcesReportColumn(ArrayOfTrafficSourcesReportColumn value) {
        return new JAXBElement<ArrayOfTrafficSourcesReportColumn>(_ArrayOfTrafficSourcesReportColumn_QNAME, ArrayOfTrafficSourcesReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdPerformanceReportFilter")
    public JAXBElement<AdPerformanceReportFilter> createAdPerformanceReportFilter(AdPerformanceReportFilter value) {
        return new JAXBElement<AdPerformanceReportFilter>(_AdPerformanceReportFilter_QNAME, AdPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ProductPartitionUnitPerformanceReportColumn> createProductPartitionUnitPerformanceReportColumn(ProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportColumn>(_ProductPartitionUnitPerformanceReportColumn_QNAME, ProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductDimensionPerformanceReportColumn")
    public JAXBElement<ProductDimensionPerformanceReportColumn> createProductDimensionPerformanceReportColumn(ProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<ProductDimensionPerformanceReportColumn>(_ProductDimensionPerformanceReportColumn_QNAME, ProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficSourcesReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TrafficSourcesReportFilter")
    public JAXBElement<TrafficSourcesReportFilter> createTrafficSourcesReportFilter(TrafficSourcesReportFilter value) {
        return new JAXBElement<TrafficSourcesReportFilter>(_TrafficSourcesReportFilter_QNAME, TrafficSourcesReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeoLocationPerformanceReportColumn")
    public JAXBElement<GeoLocationPerformanceReportColumn> createGeoLocationPerformanceReportColumn(GeoLocationPerformanceReportColumn value) {
        return new JAXBElement<GeoLocationPerformanceReportColumn>(_GeoLocationPerformanceReportColumn_QNAME, GeoLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOfferPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductOfferPerformanceReportColumn")
    public JAXBElement<ProductOfferPerformanceReportColumn> createProductOfferPerformanceReportColumn(ProductOfferPerformanceReportColumn value) {
        return new JAXBElement<ProductOfferPerformanceReportColumn>(_ProductOfferPerformanceReportColumn_QNAME, ProductOfferPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BudgetSummaryReportColumn")
    public JAXBElement<BudgetSummaryReportColumn> createBudgetSummaryReportColumn(BudgetSummaryReportColumn value) {
        return new JAXBElement<BudgetSummaryReportColumn>(_BudgetSummaryReportColumn_QNAME, BudgetSummaryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link RichAdSubTypeFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "RichAdSubTypeFilter")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<RichAdSubTypeFilter>> createRichAdSubTypeFilter(Collection<RichAdSubTypeFilter> value) {
        return new JAXBElement<Collection<RichAdSubTypeFilter>>(_RichAdSubTypeFilter_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "PublisherUsagePerformanceReportRequest")
    public JAXBElement<PublisherUsagePerformanceReportRequest> createPublisherUsagePerformanceReportRequest(PublisherUsagePerformanceReportRequest value) {
        return new JAXBElement<PublisherUsagePerformanceReportRequest>(_PublisherUsagePerformanceReportRequest_QNAME, PublisherUsagePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountPerformanceReportColumn")
    public JAXBElement<AccountPerformanceReportColumn> createAccountPerformanceReportColumn(AccountPerformanceReportColumn value) {
        return new JAXBElement<AccountPerformanceReportColumn>(_AccountPerformanceReportColumn_QNAME, AccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CallDetailReportRequest")
    public JAXBElement<CallDetailReportRequest> createCallDetailReportRequest(CallDetailReportRequest value) {
        return new JAXBElement<CallDetailReportRequest>(_CallDetailReportRequest_QNAME, CallDetailReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchCampaignChangeHistoryReportColumn")
    public JAXBElement<SearchCampaignChangeHistoryReportColumn> createSearchCampaignChangeHistoryReportColumn(SearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportColumn>(_SearchCampaignChangeHistoryReportColumn_QNAME, SearchCampaignChangeHistoryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportTime")
    public JAXBElement<ReportTime> createReportTime(ReportTime value) {
        return new JAXBElement<ReportTime>(_ReportTime_QNAME, ReportTime.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DeviceTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<DeviceTypeReportFilter>> createDeviceTypeReportFilter(Collection<DeviceTypeReportFilter> value) {
        return new JAXBElement<Collection<DeviceTypeReportFilter>>(_DeviceTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByKeywordReportFilter")
    public JAXBElement<AdExtensionByKeywordReportFilter> createAdExtensionByKeywordReportFilter(AdExtensionByKeywordReportFilter value) {
        return new JAXBElement<AdExtensionByKeywordReportFilter>(_AdExtensionByKeywordReportFilter_QNAME, AdExtensionByKeywordReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAccountPerformanceReportColumn")
    public JAXBElement<ArrayOfAccountPerformanceReportColumn> createArrayOfAccountPerformanceReportColumn(ArrayOfAccountPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAccountPerformanceReportColumn>(_ArrayOfAccountPerformanceReportColumn_QNAME, ArrayOfAccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderDemographicReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AgeGenderDemographicReportFilter")
    public JAXBElement<AgeGenderDemographicReportFilter> createAgeGenderDemographicReportFilter(AgeGenderDemographicReportFilter value) {
        return new JAXBElement<AgeGenderDemographicReportFilter>(_AgeGenderDemographicReportFilter_QNAME, AgeGenderDemographicReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GoalsAndFunnelsReportColumn")
    public JAXBElement<GoalsAndFunnelsReportColumn> createGoalsAndFunnelsReportColumn(GoalsAndFunnelsReportColumn value) {
        return new JAXBElement<GoalsAndFunnelsReportColumn>(_GoalsAndFunnelsReportColumn_QNAME, GoalsAndFunnelsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTacticChannelReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfTacticChannelReportColumn")
    public JAXBElement<ArrayOfTacticChannelReportColumn> createArrayOfTacticChannelReportColumn(ArrayOfTacticChannelReportColumn value) {
        return new JAXBElement<ArrayOfTacticChannelReportColumn>(_ArrayOfTacticChannelReportColumn_QNAME, ArrayOfTacticChannelReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryReportAggregation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchQueryReportAggregation")
    public JAXBElement<SearchQueryReportAggregation> createSearchQueryReportAggregation(SearchQueryReportAggregation value) {
        return new JAXBElement<SearchQueryReportAggregation>(_SearchQueryReportAggregation_QNAME, SearchQueryReportAggregation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ConversionPerformanceReportFilter")
    public JAXBElement<ConversionPerformanceReportFilter> createConversionPerformanceReportFilter(ConversionPerformanceReportFilter value) {
        return new JAXBElement<ConversionPerformanceReportFilter>(_ConversionPerformanceReportFilter_QNAME, ConversionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeliveredMatchTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DeliveredMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter13 .class)
    public JAXBElement<Collection<DeliveredMatchTypeReportFilter>> createDeliveredMatchTypeReportFilter(Collection<DeliveredMatchTypeReportFilter> value) {
        return new JAXBElement<Collection<DeliveredMatchTypeReportFilter>>(_DeliveredMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDetailReportFilter")
    public JAXBElement<AdExtensionDetailReportFilter> createAdExtensionDetailReportFilter(AdExtensionDetailReportFilter value) {
        return new JAXBElement<AdExtensionDetailReportFilter>(_AdExtensionDetailReportFilter_QNAME, AdExtensionDetailReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductDimensionPerformanceReportRequest")
    public JAXBElement<ProductDimensionPerformanceReportRequest> createProductDimensionPerformanceReportRequest(ProductDimensionPerformanceReportRequest value) {
        return new JAXBElement<ProductDimensionPerformanceReportRequest>(_ProductDimensionPerformanceReportRequest_QNAME, ProductDimensionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportLanguage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportLanguage")
    public JAXBElement<ReportLanguage> createReportLanguage(ReportLanguage value) {
        return new JAXBElement<ReportLanguage>(_ReportLanguage_QNAME, ReportLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfProductDimensionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductDimensionPerformanceReportColumn> createArrayOfProductDimensionPerformanceReportColumn(ArrayOfProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductDimensionPerformanceReportColumn>(_ArrayOfProductDimensionPerformanceReportColumn_QNAME, ArrayOfProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "KeywordPerformanceReportColumn")
    public JAXBElement<KeywordPerformanceReportColumn> createKeywordPerformanceReportColumn(KeywordPerformanceReportColumn value) {
        return new JAXBElement<KeywordPerformanceReportColumn>(_KeywordPerformanceReportColumn_QNAME, KeywordPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchQueryPerformanceReportRequest")
    public JAXBElement<SearchQueryPerformanceReportRequest> createSearchQueryPerformanceReportRequest(SearchQueryPerformanceReportRequest value) {
        return new JAXBElement<SearchQueryPerformanceReportRequest>(_SearchQueryPerformanceReportRequest_QNAME, SearchQueryPerformanceReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdGroupStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter14 .class)
    public JAXBElement<Collection<AdGroupStatusReportFilter>> createAdGroupStatusReportFilter(Collection<AdGroupStatusReportFilter> value) {
        return new JAXBElement<Collection<AdGroupStatusReportFilter>>(_AdGroupStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdGroupReportScope")
    public JAXBElement<ArrayOfAdGroupReportScope> createArrayOfAdGroupReportScope(ArrayOfAdGroupReportScope value) {
        return new JAXBElement<ArrayOfAdGroupReportScope>(_ArrayOfAdGroupReportScope_QNAME, ArrayOfAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdDynamicTextPerformanceReportColumn")
    public JAXBElement<AdDynamicTextPerformanceReportColumn> createAdDynamicTextPerformanceReportColumn(AdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<AdDynamicTextPerformanceReportColumn>(_AdDynamicTextPerformanceReportColumn_QNAME, AdDynamicTextPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AudiencePerformanceReportColumn")
    public JAXBElement<AudiencePerformanceReportColumn> createAudiencePerformanceReportColumn(AudiencePerformanceReportColumn value) {
        return new JAXBElement<AudiencePerformanceReportColumn>(_AudiencePerformanceReportColumn_QNAME, AudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudiencePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAudiencePerformanceReportColumn")
    public JAXBElement<ArrayOfAudiencePerformanceReportColumn> createArrayOfAudiencePerformanceReportColumn(ArrayOfAudiencePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAudiencePerformanceReportColumn>(_ArrayOfAudiencePerformanceReportColumn_QNAME, ArrayOfAudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdPerformanceReportRequest")
    public JAXBElement<AdPerformanceReportRequest> createAdPerformanceReportRequest(AdPerformanceReportRequest value) {
        return new JAXBElement<AdPerformanceReportRequest>(_AdPerformanceReportRequest_QNAME, AdPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfNegativeKeywordConflictReportColumn")
    public JAXBElement<ArrayOfNegativeKeywordConflictReportColumn> createArrayOfNegativeKeywordConflictReportColumn(ArrayOfNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<ArrayOfNegativeKeywordConflictReportColumn>(_ArrayOfNegativeKeywordConflictReportColumn_QNAME, ArrayOfNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDimensionReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionDimensionReportFilter")
    public JAXBElement<AdExtensionDimensionReportFilter> createAdExtensionDimensionReportFilter(AdExtensionDimensionReportFilter value) {
        return new JAXBElement<AdExtensionDimensionReportFilter>(_AdExtensionDimensionReportFilter_QNAME, AdExtensionDimensionReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportTimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BudgetSummaryReportTimePeriod")
    public JAXBElement<BudgetSummaryReportTimePeriod> createBudgetSummaryReportTimePeriod(BudgetSummaryReportTimePeriod value) {
        return new JAXBElement<BudgetSummaryReportTimePeriod>(_BudgetSummaryReportTimePeriod_QNAME, BudgetSummaryReportTimePeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfKeywordPerformanceReportColumn")
    public JAXBElement<ArrayOfKeywordPerformanceReportColumn> createArrayOfKeywordPerformanceReportColumn(ArrayOfKeywordPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfKeywordPerformanceReportColumn>(_ArrayOfKeywordPerformanceReportColumn_QNAME, ArrayOfKeywordPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdGroupPerformanceReportRequest")
    public JAXBElement<AdGroupPerformanceReportRequest> createAdGroupPerformanceReportRequest(AdGroupPerformanceReportRequest value) {
        return new JAXBElement<AdGroupPerformanceReportRequest>(_AdGroupPerformanceReportRequest_QNAME, AdGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdExtensionDetailReportColumn")
    public JAXBElement<ArrayOfAdExtensionDetailReportColumn> createArrayOfAdExtensionDetailReportColumn(ArrayOfAdExtensionDetailReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionDetailReportColumn>(_ArrayOfAdExtensionDetailReportColumn_QNAME, ArrayOfAdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionPerformanceReportFilter")
    public JAXBElement<ProductPartitionPerformanceReportFilter> createProductPartitionPerformanceReportFilter(ProductPartitionPerformanceReportFilter value) {
        return new JAXBElement<ProductPartitionPerformanceReportFilter>(_ProductPartitionPerformanceReportFilter_QNAME, ProductPartitionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByAdReportColumn")
    public JAXBElement<AdExtensionByAdReportColumn> createAdExtensionByAdReportColumn(AdExtensionByAdReportColumn value) {
        return new JAXBElement<AdExtensionByAdReportColumn>(_AdExtensionByAdReportColumn_QNAME, AdExtensionByAdReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "SearchCampaignChangeHistoryReportRequest")
    public JAXBElement<SearchCampaignChangeHistoryReportRequest> createSearchCampaignChangeHistoryReportRequest(SearchCampaignChangeHistoryReportRequest value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportRequest>(_SearchCampaignChangeHistoryReportRequest_QNAME, SearchCampaignChangeHistoryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CampaignPerformanceReportFilter")
    public JAXBElement<CampaignPerformanceReportFilter> createCampaignPerformanceReportFilter(CampaignPerformanceReportFilter value) {
        return new JAXBElement<CampaignPerformanceReportFilter>(_CampaignPerformanceReportFilter_QNAME, CampaignPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdGroupPerformanceReportColumn")
    public JAXBElement<AdGroupPerformanceReportColumn> createAdGroupPerformanceReportColumn(AdGroupPerformanceReportColumn value) {
        return new JAXBElement<AdGroupPerformanceReportColumn>(_AdGroupPerformanceReportColumn_QNAME, AdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfSearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfSearchQueryPerformanceReportColumn> createArrayOfSearchQueryPerformanceReportColumn(ArrayOfSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfSearchQueryPerformanceReportColumn>(_ArrayOfSearchQueryPerformanceReportColumn_QNAME, ArrayOfSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ConversionPerformanceReportRequest")
    public JAXBElement<ConversionPerformanceReportRequest> createConversionPerformanceReportRequest(ConversionPerformanceReportRequest value) {
        return new JAXBElement<ConversionPerformanceReportRequest>(_ConversionPerformanceReportRequest_QNAME, ConversionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoalsAndFunnelsReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfGoalsAndFunnelsReportColumn")
    public JAXBElement<ArrayOfGoalsAndFunnelsReportColumn> createArrayOfGoalsAndFunnelsReportColumn(ArrayOfGoalsAndFunnelsReportColumn value) {
        return new JAXBElement<ArrayOfGoalsAndFunnelsReportColumn>(_ArrayOfGoalsAndFunnelsReportColumn_QNAME, ArrayOfGoalsAndFunnelsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "NegativeKeywordConflictReportRequest")
    public JAXBElement<NegativeKeywordConflictReportRequest> createNegativeKeywordConflictReportRequest(NegativeKeywordConflictReportRequest value) {
        return new JAXBElement<NegativeKeywordConflictReportRequest>(_NegativeKeywordConflictReportRequest_QNAME, NegativeKeywordConflictReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductTargetPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductTargetPerformanceReportColumn")
    public JAXBElement<ProductTargetPerformanceReportColumn> createProductTargetPerformanceReportColumn(ProductTargetPerformanceReportColumn value) {
        return new JAXBElement<ProductTargetPerformanceReportColumn>(_ProductTargetPerformanceReportColumn_QNAME, ProductTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoLocationPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeoLocationPerformanceReportRequest")
    public JAXBElement<GeoLocationPerformanceReportRequest> createGeoLocationPerformanceReportRequest(GeoLocationPerformanceReportRequest value) {
        return new JAXBElement<GeoLocationPerformanceReportRequest>(_GeoLocationPerformanceReportRequest_QNAME, GeoLocationPerformanceReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidMatchTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BidMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<BidMatchTypeReportFilter>> createBidMatchTypeReportFilter(Collection<BidMatchTypeReportFilter> value) {
        return new JAXBElement<Collection<BidMatchTypeReportFilter>>(_BidMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ConversionPerformanceReportColumn")
    public JAXBElement<ConversionPerformanceReportColumn> createConversionPerformanceReportColumn(ConversionPerformanceReportColumn value) {
        return new JAXBElement<ConversionPerformanceReportColumn>(_ConversionPerformanceReportColumn_QNAME, ConversionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductPartitionUnitPerformanceReportFilter")
    public JAXBElement<ProductPartitionUnitPerformanceReportFilter> createProductPartitionUnitPerformanceReportFilter(ProductPartitionUnitPerformanceReportFilter value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportFilter>(_ProductPartitionUnitPerformanceReportFilter_QNAME, ProductPartitionUnitPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSitePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfSitePerformanceReportColumn")
    public JAXBElement<ArrayOfSitePerformanceReportColumn> createArrayOfSitePerformanceReportColumn(ArrayOfSitePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfSitePerformanceReportColumn>(_ArrayOfSitePerformanceReportColumn_QNAME, ArrayOfSitePerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdPerformanceReportColumn")
    public JAXBElement<AdPerformanceReportColumn> createAdPerformanceReportColumn(AdPerformanceReportColumn value) {
        return new JAXBElement<AdPerformanceReportColumn>(_AdPerformanceReportColumn_QNAME, AdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportFormat")
    public JAXBElement<ReportFormat> createReportFormat(ReportFormat value) {
        return new JAXBElement<ReportFormat>(_ReportFormat_QNAME, ReportFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link PricingModelReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "PricingModelReportFilter")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<PricingModelReportFilter>> createPricingModelReportFilter(Collection<PricingModelReportFilter> value) {
        return new JAXBElement<Collection<PricingModelReportFilter>>(_PricingModelReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeEntityReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ChangeEntityReportFilter")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<ChangeEntityReportFilter>> createChangeEntityReportFilter(Collection<ChangeEntityReportFilter> value) {
        return new JAXBElement<Collection<ChangeEntityReportFilter>>(_ChangeEntityReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<AdTypeReportFilter>> createAdTypeReportFilter(Collection<AdTypeReportFilter> value) {
        return new JAXBElement<Collection<AdTypeReportFilter>>(_AdTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ProductDimensionPerformanceReportFilter")
    public JAXBElement<ProductDimensionPerformanceReportFilter> createProductDimensionPerformanceReportFilter(ProductDimensionPerformanceReportFilter value) {
        return new JAXBElement<ProductDimensionPerformanceReportFilter>(_ProductDimensionPerformanceReportFilter_QNAME, ProductDimensionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficSourcesReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TrafficSourcesReportRequest")
    public JAXBElement<TrafficSourcesReportRequest> createTrafficSourcesReportRequest(TrafficSourcesReportRequest value) {
        return new JAXBElement<TrafficSourcesReportRequest>(_TrafficSourcesReportRequest_QNAME, TrafficSourcesReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfConversionPerformanceReportColumn")
    public JAXBElement<ArrayOfConversionPerformanceReportColumn> createArrayOfConversionPerformanceReportColumn(ArrayOfConversionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfConversionPerformanceReportColumn>(_ArrayOfConversionPerformanceReportColumn_QNAME, ArrayOfConversionPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CallDetailReportColumn")
    public JAXBElement<CallDetailReportColumn> createCallDetailReportColumn(CallDetailReportColumn value) {
        return new JAXBElement<CallDetailReportColumn>(_CallDetailReportColumn_QNAME, CallDetailReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ComponentTypeFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ComponentTypeFilter")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<ComponentTypeFilter>> createComponentTypeFilter(Collection<ComponentTypeFilter> value) {
        return new JAXBElement<Collection<ComponentTypeFilter>>(_ComponentTypeFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "DestinationUrlPerformanceReportFilter")
    public JAXBElement<DestinationUrlPerformanceReportFilter> createDestinationUrlPerformanceReportFilter(DestinationUrlPerformanceReportFilter value) {
        return new JAXBElement<DestinationUrlPerformanceReportFilter>(_DestinationUrlPerformanceReportFilter_QNAME, DestinationUrlPerformanceReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "CampaignStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<CampaignStatusReportFilter>> createCampaignStatusReportFilter(Collection<CampaignStatusReportFilter> value) {
        return new JAXBElement<Collection<CampaignStatusReportFilter>>(_CampaignStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountPerformanceReportRequest")
    public JAXBElement<AccountPerformanceReportRequest> createAccountPerformanceReportRequest(AccountPerformanceReportRequest value) {
        return new JAXBElement<AccountPerformanceReportRequest>(_AccountPerformanceReportRequest_QNAME, AccountPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicalLocationReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "GeographicalLocationReportRequest")
    public JAXBElement<GeographicalLocationReportRequest> createGeographicalLocationReportRequest(GeographicalLocationReportRequest value) {
        return new JAXBElement<GeographicalLocationReportRequest>(_GeographicalLocationReportRequest_QNAME, GeographicalLocationReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderDemographicReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AgeGenderDemographicReportColumn")
    public JAXBElement<AgeGenderDemographicReportColumn> createAgeGenderDemographicReportColumn(AgeGenderDemographicReportColumn value) {
        return new JAXBElement<AgeGenderDemographicReportColumn>(_AgeGenderDemographicReportColumn_QNAME, AgeGenderDemographicReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AdExtensionByAdReportRequest")
    public JAXBElement<AdExtensionByAdReportRequest> createAdExtensionByAdReportRequest(AdExtensionByAdReportRequest value) {
        return new JAXBElement<AdExtensionByAdReportRequest>(_AdExtensionByAdReportRequest_QNAME, AdExtensionByAdReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByAdReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdExtensionByAdReportColumn")
    public JAXBElement<ArrayOfAdExtensionByAdReportColumn> createArrayOfAdExtensionByAdReportColumn(ArrayOfAdExtensionByAdReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionByAdReportColumn>(_ArrayOfAdExtensionByAdReportColumn_QNAME, ArrayOfAdExtensionByAdReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequest_QNAME, ReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "PublisherUsagePerformanceReportFilter")
    public JAXBElement<PublisherUsagePerformanceReportFilter> createPublisherUsagePerformanceReportFilter(PublisherUsagePerformanceReportFilter value) {
        return new JAXBElement<PublisherUsagePerformanceReportFilter>(_PublisherUsagePerformanceReportFilter_QNAME, PublisherUsagePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughAdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "AccountThroughAdGroupReportScope")
    public JAXBElement<AccountThroughAdGroupReportScope> createAccountThroughAdGroupReportScope(AccountThroughAdGroupReportScope value) {
        return new JAXBElement<AccountThroughAdGroupReportScope>(_AccountThroughAdGroupReportScope_QNAME, AccountThroughAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandZonePerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "BrandZonePerformanceReportFilter")
    public JAXBElement<BrandZonePerformanceReportFilter> createBrandZonePerformanceReportFilter(BrandZonePerformanceReportFilter value) {
        return new JAXBElement<BrandZonePerformanceReportFilter>(_BrandZonePerformanceReportFilter_QNAME, BrandZonePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ArrayOfAdGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfAdGroupPerformanceReportColumn> createArrayOfAdGroupPerformanceReportColumn(ArrayOfAdGroupPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdGroupPerformanceReportColumn>(_ArrayOfAdGroupPerformanceReportColumn_QNAME, ArrayOfAdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "ShareOfVoiceReportFilter")
    public JAXBElement<ShareOfVoiceReportFilter> createShareOfVoiceReportFilter(ShareOfVoiceReportFilter value) {
        return new JAXBElement<ShareOfVoiceReportFilter>(_ShareOfVoiceReportFilter_QNAME, ShareOfVoiceReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TacticChannelReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v9", name = "TacticChannelReportColumn")
    public JAXBElement<TacticChannelReportColumn> createTacticChannelReportColumn(TacticChannelReportColumn value) {
        return new JAXBElement<TacticChannelReportColumn>(_TacticChannelReportColumn_QNAME, TacticChannelReportColumn.class, null, value);
    }

}
