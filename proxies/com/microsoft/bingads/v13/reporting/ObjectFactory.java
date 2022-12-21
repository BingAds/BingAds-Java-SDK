
package com.microsoft.bingads.v13.reporting;

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
 * generated in the com.microsoft.bingads.v13.reporting package. 
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

    private final static QName _ArrayOfKeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfKeywordPerformanceReportColumn");
    private final static QName _DSASearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportFilter");
    private final static QName _KeywordStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordStatusReportFilter");
    private final static QName _DSACategoryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportFilter");
    private final static QName _AdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportColumn");
    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ApiFaultDetail");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfAdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionDetailReportColumn");
    private final static QName _ProductPartitionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportFilter");
    private final static QName _ArrayOfDSACategoryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSACategoryPerformanceReportColumn");
    private final static QName _AdGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportRequest");
    private final static QName _ArrayOfAgeGenderAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAgeGenderAudienceReportColumn");
    private final static QName _ArrayOfAudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAudiencePerformanceReportColumn");
    private final static QName _NegativeKeywordConflictReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportFilter");
    private final static QName _AdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportColumn");
    private final static QName _ArrayOfAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdGroupReportScope");
    private final static QName _AudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportColumn");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfBatchError");
    private final static QName _Date_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "Date");
    private final static QName _AgeGenderAudienceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportFilter");
    private final static QName _AdPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportRequest");
    private final static QName _ArrayOfNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfNegativeKeywordConflictReportColumn");
    private final static QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SortOrder");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _KeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportColumn");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductDimensionPerformanceReportColumn");
    private final static QName _AdGroupStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupStatusReportFilter");
    private final static QName _SearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportRequest");
    private final static QName _AdExtensionDetailReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportFilter");
    private final static QName _DeliveredMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeliveredMatchTypeReportFilter");
    private final static QName _ConversionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportFilter");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfOperationError");
    private final static QName _GoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportColumn");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ProductDimensionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportRequest");
    private final static QName _DeviceTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeviceTypeReportFilter");
    private final static QName _AdExtensionByKeywordReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportFilter");
    private final static QName _GeographicPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportFilter");
    private final static QName _ReportTime_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTime");
    private final static QName _ProfessionalDemographicsAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportColumn");
    private final static QName _ArrayOfAccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAccountPerformanceReportColumn");
    private final static QName _ArrayOfProfessionalDemographicsAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProfessionalDemographicsAudienceReportColumn");
    private final static QName _HotelGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportFilter");
    private final static QName _SearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportColumn");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _BudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BudgetSummaryReportColumn");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CallDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportRequest");
    private final static QName _AccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportColumn");
    private final static QName _PublisherUsagePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportRequest");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ApplicationToken");
    private final static QName _AdPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportFilter");
    private final static QName _UserLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportColumn");
    private final static QName _ProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportColumn");
    private final static QName _HotelDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportColumn");
    private final static QName _ProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportColumn");
    private final static QName _ShareOfVoiceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportFilter");
    private final static QName _AccountThroughAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountThroughAdGroupReportScope");
    private final static QName _ArrayOfAdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdGroupPerformanceReportColumn");
    private final static QName _ArrayOfProductMatchCountReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductMatchCountReportColumn");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ProductNegativeKeywordConflictReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportRequest");
    private final static QName _ReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequest");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DSAAutoTargetPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportFilter");
    private final static QName _PublisherUsagePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportFilter");
    private final static QName _ProductSearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportRequest");
    private final static QName _ArrayOfDSAAutoTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSAAutoTargetPerformanceReportColumn");
    private final static QName _DynamicAdTargetStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DynamicAdTargetStatusReportFilter");
    private final static QName _ProductMatchCountReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductMatchCountReportRequest");
    private final static QName _CampaignStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignStatusReportFilter");
    private final static QName _DestinationUrlPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportFilter");
    private final static QName _ArrayOfDSASearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSASearchQueryPerformanceReportColumn");
    private final static QName _AdExtensionByAdReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportRequest");
    private final static QName _ArrayOfAdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionByAdReportColumn");
    private final static QName _AccountPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportRequest");
    private final static QName _ProductDimensionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportFilter");
    private final static QName _CallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportColumn");
    private final static QName _ArrayOfHotelGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfHotelGroupPerformanceReportColumn");
    private final static QName _ArrayOfConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfConversionPerformanceReportColumn");
    private final static QName _ReportFormat_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportFormat");
    private final static QName _AdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportColumn");
    private final static QName _ProductPartitionUnitPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportFilter");
    private final static QName _AdTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdTypeReportFilter");
    private final static QName _ChangeEntityReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ChangeEntityReportFilter");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CustomerId");
    private final static QName _ArrayOfGoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfGoalsAndFunnelsReportColumn");
    private final static QName _NegativeKeywordConflictReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportRequest");
    private final static QName _ConversionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportRequest");
    private final static QName _DSASearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportColumn");
    private final static QName _BidMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidMatchTypeReportFilter");
    private final static QName _ConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportColumn");
    private final static QName _ProductSearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportFilter");
    private final static QName _AccountStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountStatusReportFilter");
    private final static QName _HotelGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportColumn");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _SearchCampaignChangeHistoryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportRequest");
    private final static QName _ArrayOfSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfSearchQueryPerformanceReportColumn");
    private final static QName _AdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportColumn");
    private final static QName _CampaignPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportFilter");
    private final static QName _AudiencePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportRequest");
    private final static QName _AdDistributionReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDistributionReportFilter");
    private final static QName _KeywordPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportFilter");
    private final static QName _ArrayOfPublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfPublisherUsagePerformanceReportColumn");
    private final static QName _AdExtensionByAdReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportFilter");
    private final static QName _AdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportColumn");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserName");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _ProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportColumn");
    private final static QName _BudgetSummaryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BudgetSummaryReportRequest");
    private final static QName _GoalsAndFunnelsReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportFilter");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CustomerAccountId");
    private final static QName _ArrayOfDestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDestinationUrlPerformanceReportColumn");
    private final static QName _ProductPartitionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportRequest");
    private final static QName _GeographicPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportRequest");
    private final static QName _ReportTimeZone_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTimeZone");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "Password");
    private final static QName _ArrayOfAdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdDynamicTextPerformanceReportColumn");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _AgeGenderAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportColumn");
    private final static QName _SearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportFilter");
    private final static QName _DSACategoryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportColumn");
    private final static QName _ReportRequestStatusType_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequestStatusType");
    private final static QName _AudiencePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportFilter");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfShareOfVoiceReportColumn");
    private final static QName _ArrayOfCallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCallDetailReportColumn");
    private final static QName _AccountPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportFilter");
    private final static QName _AdDynamicTextPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportFilter");
    private final static QName _AdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportColumn");
    private final static QName _ArrayOfAdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdPerformanceReportColumn");
    private final static QName _HotelDimensionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportRequest");
    private final static QName _ChangeTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ChangeTypeReportFilter");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _CampaignPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportRequest");
    private final static QName _ArrayOfProductSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductSearchQueryPerformanceReportColumn");
    private final static QName _KeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportSort");
    private final static QName _AdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupReportScope");
    private final static QName _ProfessionalDemographicsAudienceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportFilter");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _DestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportColumn");
    private final static QName _ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductPartitionUnitPerformanceReportColumn");
    private final static QName _ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfSearchCampaignChangeHistoryReportColumn");
    private final static QName _AdGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportFilter");
    private final static QName _ShareOfVoiceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportRequest");
    private final static QName _BidStrategyTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidStrategyTypeReportFilter");
    private final static QName _DestinationUrlPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportRequest");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AdExtensionByKeywordReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportRequest");
    private final static QName _PublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportColumn");
    private final static QName _DSASearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportRequest");
    private final static QName _CallDetailReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportFilter");
    private final static QName _KeywordPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportRequest");
    private final static QName _AdDynamicTextPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportRequest");
    private final static QName _ArrayOfUserLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfUserLocationPerformanceReportColumn");
    private final static QName _DSAAutoTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportColumn");
    private final static QName _ArrayOfCampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCampaignPerformanceReportColumn");
    private final static QName _ProductNegativeKeywordConflictReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportFilter");
    private final static QName _ProductMatchCountReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductMatchCountReportColumn");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeveloperToken");
    private final static QName _ProfessionalDemographicsAudienceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportRequest");
    private final static QName _ReportAggregation_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportAggregation");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BatchError");
    private final static QName _ReportTimePeriod_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTimePeriod");
    private final static QName _ProductSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportColumn");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "OperationError");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfHotelDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfHotelDimensionPerformanceReportColumn");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _CampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportColumn");
    private final static QName _UserLocationPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportFilter");
    private final static QName _ArrayOfProductNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductNegativeKeywordConflictReportColumn");
    private final static QName _AccountReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountReportScope");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfAdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionByKeywordReportColumn");
    private final static QName _AdStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdStatusReportFilter");
    private final static QName _ShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportColumn");
    private final static QName _ProductNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportColumn");
    private final static QName _ReportRequestStatus_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequestStatus");
    private final static QName _LanguageReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "LanguageReportFilter");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _DSAAutoTargetPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportRequest");
    private final static QName _ArrayOfGeographicPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfGeographicPerformanceReportColumn");
    private final static QName _SearchCampaignChangeHistoryReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportFilter");
    private final static QName _AdExtensionDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportRequest");
    private final static QName _DeviceOSReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeviceOSReportFilter");
    private final static QName _AccountThroughCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountThroughCampaignReportScope");
    private final static QName _HotelDimensionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportFilter");
    private final static QName _HotelGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportRequest");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "TrackingId");
    private final static QName _ProductPartitionUnitPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportRequest");
    private final static QName _GoalsAndFunnelsReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportRequest");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _AgeGenderAudienceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportRequest");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _ArrayOfKeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfKeywordPerformanceReportSort");
    private final static QName _NegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportColumn");
    private final static QName _ArrayOfProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductPartitionPerformanceReportColumn");
    private final static QName _UserLocationPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportRequest");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AuthenticationToken");
    private final static QName _ArrayOfCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCampaignReportScope");
    private final static QName _CampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignReportScope");
    private final static QName _ArrayOfBudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfBudgetSummaryReportColumn");
    private final static QName _GeographicPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportColumn");
    private final static QName _SearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportColumn");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DSACategoryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.reporting
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
     * Create an instance of {@link UserLocationPerformanceReportRequest }
     * 
     */
    public UserLocationPerformanceReportRequest createUserLocationPerformanceReportRequest() {
        return new UserLocationPerformanceReportRequest();
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
     * Create an instance of {@link DSACategoryPerformanceReportRequest }
     * 
     */
    public DSACategoryPerformanceReportRequest createDSACategoryPerformanceReportRequest() {
        return new DSACategoryPerformanceReportRequest();
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
     * Create an instance of {@link AgeGenderAudienceReportRequest }
     * 
     */
    public AgeGenderAudienceReportRequest createAgeGenderAudienceReportRequest() {
        return new AgeGenderAudienceReportRequest();
    }

    /**
     * Create an instance of {@link GoalsAndFunnelsReportRequest }
     * 
     */
    public GoalsAndFunnelsReportRequest createGoalsAndFunnelsReportRequest() {
        return new GoalsAndFunnelsReportRequest();
    }

    /**
     * Create an instance of {@link ProductSearchQueryPerformanceReportFilter }
     * 
     */
    public ProductSearchQueryPerformanceReportFilter createProductSearchQueryPerformanceReportFilter() {
        return new ProductSearchQueryPerformanceReportFilter();
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
     * Create an instance of {@link HotelGroupPerformanceReportRequest }
     * 
     */
    public HotelGroupPerformanceReportRequest createHotelGroupPerformanceReportRequest() {
        return new HotelGroupPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link HotelDimensionPerformanceReportFilter }
     * 
     */
    public HotelDimensionPerformanceReportFilter createHotelDimensionPerformanceReportFilter() {
        return new HotelDimensionPerformanceReportFilter();
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
     * Create an instance of {@link ArrayOfGeographicPerformanceReportColumn }
     * 
     */
    public ArrayOfGeographicPerformanceReportColumn createArrayOfGeographicPerformanceReportColumn() {
        return new ArrayOfGeographicPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DSAAutoTargetPerformanceReportRequest }
     * 
     */
    public DSAAutoTargetPerformanceReportRequest createDSAAutoTargetPerformanceReportRequest() {
        return new DSAAutoTargetPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ProductDimensionPerformanceReportFilter }
     * 
     */
    public ProductDimensionPerformanceReportFilter createProductDimensionPerformanceReportFilter() {
        return new ProductDimensionPerformanceReportFilter();
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
     * Create an instance of {@link ArrayOfHotelGroupPerformanceReportColumn }
     * 
     */
    public ArrayOfHotelGroupPerformanceReportColumn createArrayOfHotelGroupPerformanceReportColumn() {
        return new ArrayOfHotelGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfDSASearchQueryPerformanceReportColumn }
     * 
     */
    public ArrayOfDSASearchQueryPerformanceReportColumn createArrayOfDSASearchQueryPerformanceReportColumn() {
        return new ArrayOfDSASearchQueryPerformanceReportColumn();
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
     * Create an instance of {@link ProductMatchCountReportRequest }
     * 
     */
    public ProductMatchCountReportRequest createProductMatchCountReportRequest() {
        return new ProductMatchCountReportRequest();
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
     * Create an instance of {@link ArrayOfHotelDimensionPerformanceReportColumn }
     * 
     */
    public ArrayOfHotelDimensionPerformanceReportColumn createArrayOfHotelDimensionPerformanceReportColumn() {
        return new ArrayOfHotelDimensionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfProductNegativeKeywordConflictReportColumn }
     * 
     */
    public ArrayOfProductNegativeKeywordConflictReportColumn createArrayOfProductNegativeKeywordConflictReportColumn() {
        return new ArrayOfProductNegativeKeywordConflictReportColumn();
    }

    /**
     * Create an instance of {@link PollGenerateReportRequest }
     * 
     */
    public PollGenerateReportRequest createPollGenerateReportRequest() {
        return new PollGenerateReportRequest();
    }

    /**
     * Create an instance of {@link UserLocationPerformanceReportFilter }
     * 
     */
    public UserLocationPerformanceReportFilter createUserLocationPerformanceReportFilter() {
        return new UserLocationPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfDSAAutoTargetPerformanceReportColumn }
     * 
     */
    public ArrayOfDSAAutoTargetPerformanceReportColumn createArrayOfDSAAutoTargetPerformanceReportColumn() {
        return new ArrayOfDSAAutoTargetPerformanceReportColumn();
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
     * Create an instance of {@link PublisherUsagePerformanceReportFilter }
     * 
     */
    public PublisherUsagePerformanceReportFilter createPublisherUsagePerformanceReportFilter() {
        return new PublisherUsagePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductSearchQueryPerformanceReportRequest }
     * 
     */
    public ProductSearchQueryPerformanceReportRequest createProductSearchQueryPerformanceReportRequest() {
        return new ProductSearchQueryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link DSAAutoTargetPerformanceReportFilter }
     * 
     */
    public DSAAutoTargetPerformanceReportFilter createDSAAutoTargetPerformanceReportFilter() {
        return new DSAAutoTargetPerformanceReportFilter();
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
     * Create an instance of {@link ArrayOfAdGroupPerformanceReportColumn }
     * 
     */
    public ArrayOfAdGroupPerformanceReportColumn createArrayOfAdGroupPerformanceReportColumn() {
        return new ArrayOfAdGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfProductMatchCountReportColumn }
     * 
     */
    public ArrayOfProductMatchCountReportColumn createArrayOfProductMatchCountReportColumn() {
        return new ArrayOfProductMatchCountReportColumn();
    }

    /**
     * Create an instance of {@link ShareOfVoiceReportFilter }
     * 
     */
    public ShareOfVoiceReportFilter createShareOfVoiceReportFilter() {
        return new ShareOfVoiceReportFilter();
    }

    /**
     * Create an instance of {@link ProductNegativeKeywordConflictReportFilter }
     * 
     */
    public ProductNegativeKeywordConflictReportFilter createProductNegativeKeywordConflictReportFilter() {
        return new ProductNegativeKeywordConflictReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignPerformanceReportColumn }
     * 
     */
    public ArrayOfCampaignPerformanceReportColumn createArrayOfCampaignPerformanceReportColumn() {
        return new ArrayOfCampaignPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ArrayOfUserLocationPerformanceReportColumn }
     * 
     */
    public ArrayOfUserLocationPerformanceReportColumn createArrayOfUserLocationPerformanceReportColumn() {
        return new ArrayOfUserLocationPerformanceReportColumn();
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
     * Create an instance of {@link ProfessionalDemographicsAudienceReportRequest }
     * 
     */
    public ProfessionalDemographicsAudienceReportRequest createProfessionalDemographicsAudienceReportRequest() {
        return new ProfessionalDemographicsAudienceReportRequest();
    }

    /**
     * Create an instance of {@link ProductNegativeKeywordConflictReportRequest }
     * 
     */
    public ProductNegativeKeywordConflictReportRequest createProductNegativeKeywordConflictReportRequest() {
        return new ProductNegativeKeywordConflictReportRequest();
    }

    /**
     * Create an instance of {@link SubmitGenerateReportRequest }
     * 
     */
    public SubmitGenerateReportRequest createSubmitGenerateReportRequest() {
        return new SubmitGenerateReportRequest();
    }

    /**
     * Create an instance of {@link DSASearchQueryPerformanceReportRequest }
     * 
     */
    public DSASearchQueryPerformanceReportRequest createDSASearchQueryPerformanceReportRequest() {
        return new DSASearchQueryPerformanceReportRequest();
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
     * Create an instance of {@link CallDetailReportFilter }
     * 
     */
    public CallDetailReportFilter createCallDetailReportFilter() {
        return new CallDetailReportFilter();
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
     * Create an instance of {@link ProfessionalDemographicsAudienceReportFilter }
     * 
     */
    public ProfessionalDemographicsAudienceReportFilter createProfessionalDemographicsAudienceReportFilter() {
        return new ProfessionalDemographicsAudienceReportFilter();
    }

    /**
     * Create an instance of {@link HotelGroupPerformanceReportFilter }
     * 
     */
    public HotelGroupPerformanceReportFilter createHotelGroupPerformanceReportFilter() {
        return new HotelGroupPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfProfessionalDemographicsAudienceReportColumn }
     * 
     */
    public ArrayOfProfessionalDemographicsAudienceReportColumn createArrayOfProfessionalDemographicsAudienceReportColumn() {
        return new ArrayOfProfessionalDemographicsAudienceReportColumn();
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
     * Create an instance of {@link ArrayOfProductSearchQueryPerformanceReportColumn }
     * 
     */
    public ArrayOfProductSearchQueryPerformanceReportColumn createArrayOfProductSearchQueryPerformanceReportColumn() {
        return new ArrayOfProductSearchQueryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ReportTime }
     * 
     */
    public ReportTime createReportTime() {
        return new ReportTime();
    }

    /**
     * Create an instance of {@link GeographicPerformanceReportFilter }
     * 
     */
    public GeographicPerformanceReportFilter createGeographicPerformanceReportFilter() {
        return new GeographicPerformanceReportFilter();
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
     * Create an instance of {@link AudiencePerformanceReportFilter }
     * 
     */
    public AudiencePerformanceReportFilter createAudiencePerformanceReportFilter() {
        return new AudiencePerformanceReportFilter();
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
     * Create an instance of {@link HotelDimensionPerformanceReportRequest }
     * 
     */
    public HotelDimensionPerformanceReportRequest createHotelDimensionPerformanceReportRequest() {
        return new HotelDimensionPerformanceReportRequest();
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
     * Create an instance of {@link ArrayOfProductDimensionPerformanceReportColumn }
     * 
     */
    public ArrayOfProductDimensionPerformanceReportColumn createArrayOfProductDimensionPerformanceReportColumn() {
        return new ArrayOfProductDimensionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link GeographicPerformanceReportRequest }
     * 
     */
    public GeographicPerformanceReportRequest createGeographicPerformanceReportRequest() {
        return new GeographicPerformanceReportRequest();
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
     * Create an instance of {@link NegativeKeywordConflictReportFilter }
     * 
     */
    public NegativeKeywordConflictReportFilter createNegativeKeywordConflictReportFilter() {
        return new NegativeKeywordConflictReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfAgeGenderAudienceReportColumn }
     * 
     */
    public ArrayOfAgeGenderAudienceReportColumn createArrayOfAgeGenderAudienceReportColumn() {
        return new ArrayOfAgeGenderAudienceReportColumn();
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
     * Create an instance of {@link AgeGenderAudienceReportFilter }
     * 
     */
    public AgeGenderAudienceReportFilter createAgeGenderAudienceReportFilter() {
        return new AgeGenderAudienceReportFilter();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link DSACategoryPerformanceReportFilter }
     * 
     */
    public DSACategoryPerformanceReportFilter createDSACategoryPerformanceReportFilter() {
        return new DSACategoryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordPerformanceReportColumn }
     * 
     */
    public ArrayOfKeywordPerformanceReportColumn createArrayOfKeywordPerformanceReportColumn() {
        return new ArrayOfKeywordPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DSASearchQueryPerformanceReportFilter }
     * 
     */
    public DSASearchQueryPerformanceReportFilter createDSASearchQueryPerformanceReportFilter() {
        return new DSASearchQueryPerformanceReportFilter();
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
     * Create an instance of {@link ArrayOfDSACategoryPerformanceReportColumn }
     * 
     */
    public ArrayOfDSACategoryPerformanceReportColumn createArrayOfDSACategoryPerformanceReportColumn() {
        return new ArrayOfDSACategoryPerformanceReportColumn();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfKeywordPerformanceReportColumn")
    public JAXBElement<ArrayOfKeywordPerformanceReportColumn> createArrayOfKeywordPerformanceReportColumn(ArrayOfKeywordPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfKeywordPerformanceReportColumn>(_ArrayOfKeywordPerformanceReportColumn_QNAME, ArrayOfKeywordPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportFilter")
    public JAXBElement<DSASearchQueryPerformanceReportFilter> createDSASearchQueryPerformanceReportFilter(DSASearchQueryPerformanceReportFilter value) {
        return new JAXBElement<DSASearchQueryPerformanceReportFilter>(_DSASearchQueryPerformanceReportFilter_QNAME, DSASearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter17 .class)
    public JAXBElement<Collection<KeywordStatusReportFilter>> createKeywordStatusReportFilter(Collection<KeywordStatusReportFilter> value) {
        return new JAXBElement<Collection<KeywordStatusReportFilter>>(_KeywordStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportFilter")
    public JAXBElement<DSACategoryPerformanceReportFilter> createDSACategoryPerformanceReportFilter(DSACategoryPerformanceReportFilter value) {
        return new JAXBElement<DSACategoryPerformanceReportFilter>(_DSACategoryPerformanceReportFilter_QNAME, DSACategoryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportColumn")
    public JAXBElement<AdExtensionByAdReportColumn> createAdExtensionByAdReportColumn(AdExtensionByAdReportColumn value) {
        return new JAXBElement<AdExtensionByAdReportColumn>(_AdExtensionByAdReportColumn_QNAME, AdExtensionByAdReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionDetailReportColumn")
    public JAXBElement<ArrayOfAdExtensionDetailReportColumn> createArrayOfAdExtensionDetailReportColumn(ArrayOfAdExtensionDetailReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionDetailReportColumn>(_ArrayOfAdExtensionDetailReportColumn_QNAME, ArrayOfAdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportFilter")
    public JAXBElement<ProductPartitionPerformanceReportFilter> createProductPartitionPerformanceReportFilter(ProductPartitionPerformanceReportFilter value) {
        return new JAXBElement<ProductPartitionPerformanceReportFilter>(_ProductPartitionPerformanceReportFilter_QNAME, ProductPartitionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSACategoryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSACategoryPerformanceReportColumn")
    public JAXBElement<ArrayOfDSACategoryPerformanceReportColumn> createArrayOfDSACategoryPerformanceReportColumn(ArrayOfDSACategoryPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfDSACategoryPerformanceReportColumn>(_ArrayOfDSACategoryPerformanceReportColumn_QNAME, ArrayOfDSACategoryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportRequest")
    public JAXBElement<AdGroupPerformanceReportRequest> createAdGroupPerformanceReportRequest(AdGroupPerformanceReportRequest value) {
        return new JAXBElement<AdGroupPerformanceReportRequest>(_AdGroupPerformanceReportRequest_QNAME, AdGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeGenderAudienceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAgeGenderAudienceReportColumn")
    public JAXBElement<ArrayOfAgeGenderAudienceReportColumn> createArrayOfAgeGenderAudienceReportColumn(ArrayOfAgeGenderAudienceReportColumn value) {
        return new JAXBElement<ArrayOfAgeGenderAudienceReportColumn>(_ArrayOfAgeGenderAudienceReportColumn_QNAME, ArrayOfAgeGenderAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudiencePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAudiencePerformanceReportColumn")
    public JAXBElement<ArrayOfAudiencePerformanceReportColumn> createArrayOfAudiencePerformanceReportColumn(ArrayOfAudiencePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAudiencePerformanceReportColumn>(_ArrayOfAudiencePerformanceReportColumn_QNAME, ArrayOfAudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportFilter")
    public JAXBElement<NegativeKeywordConflictReportFilter> createNegativeKeywordConflictReportFilter(NegativeKeywordConflictReportFilter value) {
        return new JAXBElement<NegativeKeywordConflictReportFilter>(_NegativeKeywordConflictReportFilter_QNAME, NegativeKeywordConflictReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportColumn")
    public JAXBElement<AdDynamicTextPerformanceReportColumn> createAdDynamicTextPerformanceReportColumn(AdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<AdDynamicTextPerformanceReportColumn>(_AdDynamicTextPerformanceReportColumn_QNAME, AdDynamicTextPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdGroupReportScope")
    public JAXBElement<ArrayOfAdGroupReportScope> createArrayOfAdGroupReportScope(ArrayOfAdGroupReportScope value) {
        return new JAXBElement<ArrayOfAdGroupReportScope>(_ArrayOfAdGroupReportScope_QNAME, ArrayOfAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportColumn")
    public JAXBElement<AudiencePerformanceReportColumn> createAudiencePerformanceReportColumn(AudiencePerformanceReportColumn value) {
        return new JAXBElement<AudiencePerformanceReportColumn>(_AudiencePerformanceReportColumn_QNAME, AudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportFilter")
    public JAXBElement<AgeGenderAudienceReportFilter> createAgeGenderAudienceReportFilter(AgeGenderAudienceReportFilter value) {
        return new JAXBElement<AgeGenderAudienceReportFilter>(_AgeGenderAudienceReportFilter_QNAME, AgeGenderAudienceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportRequest")
    public JAXBElement<AdPerformanceReportRequest> createAdPerformanceReportRequest(AdPerformanceReportRequest value) {
        return new JAXBElement<AdPerformanceReportRequest>(_AdPerformanceReportRequest_QNAME, AdPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfNegativeKeywordConflictReportColumn")
    public JAXBElement<ArrayOfNegativeKeywordConflictReportColumn> createArrayOfNegativeKeywordConflictReportColumn(ArrayOfNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<ArrayOfNegativeKeywordConflictReportColumn>(_ArrayOfNegativeKeywordConflictReportColumn_QNAME, ArrayOfNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportColumn")
    public JAXBElement<KeywordPerformanceReportColumn> createKeywordPerformanceReportColumn(KeywordPerformanceReportColumn value) {
        return new JAXBElement<KeywordPerformanceReportColumn>(_KeywordPerformanceReportColumn_QNAME, KeywordPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductDimensionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductDimensionPerformanceReportColumn> createArrayOfProductDimensionPerformanceReportColumn(ArrayOfProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductDimensionPerformanceReportColumn>(_ArrayOfProductDimensionPerformanceReportColumn_QNAME, ArrayOfProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter15 .class)
    public JAXBElement<Collection<AdGroupStatusReportFilter>> createAdGroupStatusReportFilter(Collection<AdGroupStatusReportFilter> value) {
        return new JAXBElement<Collection<AdGroupStatusReportFilter>>(_AdGroupStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportRequest")
    public JAXBElement<SearchQueryPerformanceReportRequest> createSearchQueryPerformanceReportRequest(SearchQueryPerformanceReportRequest value) {
        return new JAXBElement<SearchQueryPerformanceReportRequest>(_SearchQueryPerformanceReportRequest_QNAME, SearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportFilter")
    public JAXBElement<AdExtensionDetailReportFilter> createAdExtensionDetailReportFilter(AdExtensionDetailReportFilter value) {
        return new JAXBElement<AdExtensionDetailReportFilter>(_AdExtensionDetailReportFilter_QNAME, AdExtensionDetailReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeliveredMatchTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeliveredMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter14 .class)
    public JAXBElement<Collection<DeliveredMatchTypeReportFilter>> createDeliveredMatchTypeReportFilter(Collection<DeliveredMatchTypeReportFilter> value) {
        return new JAXBElement<Collection<DeliveredMatchTypeReportFilter>>(_DeliveredMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportFilter")
    public JAXBElement<ConversionPerformanceReportFilter> createConversionPerformanceReportFilter(ConversionPerformanceReportFilter value) {
        return new JAXBElement<ConversionPerformanceReportFilter>(_ConversionPerformanceReportFilter_QNAME, ConversionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportColumn")
    public JAXBElement<GoalsAndFunnelsReportColumn> createGoalsAndFunnelsReportColumn(GoalsAndFunnelsReportColumn value) {
        return new JAXBElement<GoalsAndFunnelsReportColumn>(_GoalsAndFunnelsReportColumn_QNAME, GoalsAndFunnelsReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportRequest")
    public JAXBElement<ProductDimensionPerformanceReportRequest> createProductDimensionPerformanceReportRequest(ProductDimensionPerformanceReportRequest value) {
        return new JAXBElement<ProductDimensionPerformanceReportRequest>(_ProductDimensionPerformanceReportRequest_QNAME, ProductDimensionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeviceTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<DeviceTypeReportFilter>> createDeviceTypeReportFilter(Collection<DeviceTypeReportFilter> value) {
        return new JAXBElement<Collection<DeviceTypeReportFilter>>(_DeviceTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportFilter")
    public JAXBElement<AdExtensionByKeywordReportFilter> createAdExtensionByKeywordReportFilter(AdExtensionByKeywordReportFilter value) {
        return new JAXBElement<AdExtensionByKeywordReportFilter>(_AdExtensionByKeywordReportFilter_QNAME, AdExtensionByKeywordReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportFilter")
    public JAXBElement<GeographicPerformanceReportFilter> createGeographicPerformanceReportFilter(GeographicPerformanceReportFilter value) {
        return new JAXBElement<GeographicPerformanceReportFilter>(_GeographicPerformanceReportFilter_QNAME, GeographicPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTime")
    public JAXBElement<ReportTime> createReportTime(ReportTime value) {
        return new JAXBElement<ReportTime>(_ReportTime_QNAME, ReportTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportColumn")
    public JAXBElement<ProfessionalDemographicsAudienceReportColumn> createProfessionalDemographicsAudienceReportColumn(ProfessionalDemographicsAudienceReportColumn value) {
        return new JAXBElement<ProfessionalDemographicsAudienceReportColumn>(_ProfessionalDemographicsAudienceReportColumn_QNAME, ProfessionalDemographicsAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAccountPerformanceReportColumn")
    public JAXBElement<ArrayOfAccountPerformanceReportColumn> createArrayOfAccountPerformanceReportColumn(ArrayOfAccountPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAccountPerformanceReportColumn>(_ArrayOfAccountPerformanceReportColumn_QNAME, ArrayOfAccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionalDemographicsAudienceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProfessionalDemographicsAudienceReportColumn")
    public JAXBElement<ArrayOfProfessionalDemographicsAudienceReportColumn> createArrayOfProfessionalDemographicsAudienceReportColumn(ArrayOfProfessionalDemographicsAudienceReportColumn value) {
        return new JAXBElement<ArrayOfProfessionalDemographicsAudienceReportColumn>(_ArrayOfProfessionalDemographicsAudienceReportColumn_QNAME, ArrayOfProfessionalDemographicsAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportFilter")
    public JAXBElement<HotelGroupPerformanceReportFilter> createHotelGroupPerformanceReportFilter(HotelGroupPerformanceReportFilter value) {
        return new JAXBElement<HotelGroupPerformanceReportFilter>(_HotelGroupPerformanceReportFilter_QNAME, HotelGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportColumn")
    public JAXBElement<SearchCampaignChangeHistoryReportColumn> createSearchCampaignChangeHistoryReportColumn(SearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportColumn>(_SearchCampaignChangeHistoryReportColumn_QNAME, SearchCampaignChangeHistoryReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BudgetSummaryReportColumn")
    public JAXBElement<BudgetSummaryReportColumn> createBudgetSummaryReportColumn(BudgetSummaryReportColumn value) {
        return new JAXBElement<BudgetSummaryReportColumn>(_BudgetSummaryReportColumn_QNAME, BudgetSummaryReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportRequest")
    public JAXBElement<CallDetailReportRequest> createCallDetailReportRequest(CallDetailReportRequest value) {
        return new JAXBElement<CallDetailReportRequest>(_CallDetailReportRequest_QNAME, CallDetailReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportColumn")
    public JAXBElement<AccountPerformanceReportColumn> createAccountPerformanceReportColumn(AccountPerformanceReportColumn value) {
        return new JAXBElement<AccountPerformanceReportColumn>(_AccountPerformanceReportColumn_QNAME, AccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportRequest")
    public JAXBElement<PublisherUsagePerformanceReportRequest> createPublisherUsagePerformanceReportRequest(PublisherUsagePerformanceReportRequest value) {
        return new JAXBElement<PublisherUsagePerformanceReportRequest>(_PublisherUsagePerformanceReportRequest_QNAME, PublisherUsagePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportFilter")
    public JAXBElement<AdPerformanceReportFilter> createAdPerformanceReportFilter(AdPerformanceReportFilter value) {
        return new JAXBElement<AdPerformanceReportFilter>(_AdPerformanceReportFilter_QNAME, AdPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportColumn")
    public JAXBElement<UserLocationPerformanceReportColumn> createUserLocationPerformanceReportColumn(UserLocationPerformanceReportColumn value) {
        return new JAXBElement<UserLocationPerformanceReportColumn>(_UserLocationPerformanceReportColumn_QNAME, UserLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportColumn")
    public JAXBElement<ProductDimensionPerformanceReportColumn> createProductDimensionPerformanceReportColumn(ProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<ProductDimensionPerformanceReportColumn>(_ProductDimensionPerformanceReportColumn_QNAME, ProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportColumn")
    public JAXBElement<HotelDimensionPerformanceReportColumn> createHotelDimensionPerformanceReportColumn(HotelDimensionPerformanceReportColumn value) {
        return new JAXBElement<HotelDimensionPerformanceReportColumn>(_HotelDimensionPerformanceReportColumn_QNAME, HotelDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ProductPartitionUnitPerformanceReportColumn> createProductPartitionUnitPerformanceReportColumn(ProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportColumn>(_ProductPartitionUnitPerformanceReportColumn_QNAME, ProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportFilter")
    public JAXBElement<ShareOfVoiceReportFilter> createShareOfVoiceReportFilter(ShareOfVoiceReportFilter value) {
        return new JAXBElement<ShareOfVoiceReportFilter>(_ShareOfVoiceReportFilter_QNAME, ShareOfVoiceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughAdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountThroughAdGroupReportScope")
    public JAXBElement<AccountThroughAdGroupReportScope> createAccountThroughAdGroupReportScope(AccountThroughAdGroupReportScope value) {
        return new JAXBElement<AccountThroughAdGroupReportScope>(_AccountThroughAdGroupReportScope_QNAME, AccountThroughAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfAdGroupPerformanceReportColumn> createArrayOfAdGroupPerformanceReportColumn(ArrayOfAdGroupPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdGroupPerformanceReportColumn>(_ArrayOfAdGroupPerformanceReportColumn_QNAME, ArrayOfAdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductMatchCountReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductMatchCountReportColumn")
    public JAXBElement<ArrayOfProductMatchCountReportColumn> createArrayOfProductMatchCountReportColumn(ArrayOfProductMatchCountReportColumn value) {
        return new JAXBElement<ArrayOfProductMatchCountReportColumn>(_ArrayOfProductMatchCountReportColumn_QNAME, ArrayOfProductMatchCountReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportRequest")
    public JAXBElement<ProductNegativeKeywordConflictReportRequest> createProductNegativeKeywordConflictReportRequest(ProductNegativeKeywordConflictReportRequest value) {
        return new JAXBElement<ProductNegativeKeywordConflictReportRequest>(_ProductNegativeKeywordConflictReportRequest_QNAME, ProductNegativeKeywordConflictReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<ReportRequest>(_ReportRequest_QNAME, ReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportFilter")
    public JAXBElement<DSAAutoTargetPerformanceReportFilter> createDSAAutoTargetPerformanceReportFilter(DSAAutoTargetPerformanceReportFilter value) {
        return new JAXBElement<DSAAutoTargetPerformanceReportFilter>(_DSAAutoTargetPerformanceReportFilter_QNAME, DSAAutoTargetPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportFilter")
    public JAXBElement<PublisherUsagePerformanceReportFilter> createPublisherUsagePerformanceReportFilter(PublisherUsagePerformanceReportFilter value) {
        return new JAXBElement<PublisherUsagePerformanceReportFilter>(_PublisherUsagePerformanceReportFilter_QNAME, PublisherUsagePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportRequest")
    public JAXBElement<ProductSearchQueryPerformanceReportRequest> createProductSearchQueryPerformanceReportRequest(ProductSearchQueryPerformanceReportRequest value) {
        return new JAXBElement<ProductSearchQueryPerformanceReportRequest>(_ProductSearchQueryPerformanceReportRequest_QNAME, ProductSearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSAAutoTargetPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSAAutoTargetPerformanceReportColumn")
    public JAXBElement<ArrayOfDSAAutoTargetPerformanceReportColumn> createArrayOfDSAAutoTargetPerformanceReportColumn(ArrayOfDSAAutoTargetPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfDSAAutoTargetPerformanceReportColumn>(_ArrayOfDSAAutoTargetPerformanceReportColumn_QNAME, ArrayOfDSAAutoTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DynamicAdTargetStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DynamicAdTargetStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<DynamicAdTargetStatusReportFilter>> createDynamicAdTargetStatusReportFilter(Collection<DynamicAdTargetStatusReportFilter> value) {
        return new JAXBElement<Collection<DynamicAdTargetStatusReportFilter>>(_DynamicAdTargetStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductMatchCountReportRequest")
    public JAXBElement<ProductMatchCountReportRequest> createProductMatchCountReportRequest(ProductMatchCountReportRequest value) {
        return new JAXBElement<ProductMatchCountReportRequest>(_ProductMatchCountReportRequest_QNAME, ProductMatchCountReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<CampaignStatusReportFilter>> createCampaignStatusReportFilter(Collection<CampaignStatusReportFilter> value) {
        return new JAXBElement<Collection<CampaignStatusReportFilter>>(_CampaignStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportFilter")
    public JAXBElement<DestinationUrlPerformanceReportFilter> createDestinationUrlPerformanceReportFilter(DestinationUrlPerformanceReportFilter value) {
        return new JAXBElement<DestinationUrlPerformanceReportFilter>(_DestinationUrlPerformanceReportFilter_QNAME, DestinationUrlPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSASearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSASearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfDSASearchQueryPerformanceReportColumn> createArrayOfDSASearchQueryPerformanceReportColumn(ArrayOfDSASearchQueryPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfDSASearchQueryPerformanceReportColumn>(_ArrayOfDSASearchQueryPerformanceReportColumn_QNAME, ArrayOfDSASearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportRequest")
    public JAXBElement<AdExtensionByAdReportRequest> createAdExtensionByAdReportRequest(AdExtensionByAdReportRequest value) {
        return new JAXBElement<AdExtensionByAdReportRequest>(_AdExtensionByAdReportRequest_QNAME, AdExtensionByAdReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByAdReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionByAdReportColumn")
    public JAXBElement<ArrayOfAdExtensionByAdReportColumn> createArrayOfAdExtensionByAdReportColumn(ArrayOfAdExtensionByAdReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionByAdReportColumn>(_ArrayOfAdExtensionByAdReportColumn_QNAME, ArrayOfAdExtensionByAdReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportRequest")
    public JAXBElement<AccountPerformanceReportRequest> createAccountPerformanceReportRequest(AccountPerformanceReportRequest value) {
        return new JAXBElement<AccountPerformanceReportRequest>(_AccountPerformanceReportRequest_QNAME, AccountPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportFilter")
    public JAXBElement<ProductDimensionPerformanceReportFilter> createProductDimensionPerformanceReportFilter(ProductDimensionPerformanceReportFilter value) {
        return new JAXBElement<ProductDimensionPerformanceReportFilter>(_ProductDimensionPerformanceReportFilter_QNAME, ProductDimensionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportColumn")
    public JAXBElement<CallDetailReportColumn> createCallDetailReportColumn(CallDetailReportColumn value) {
        return new JAXBElement<CallDetailReportColumn>(_CallDetailReportColumn_QNAME, CallDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfHotelGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfHotelGroupPerformanceReportColumn> createArrayOfHotelGroupPerformanceReportColumn(ArrayOfHotelGroupPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfHotelGroupPerformanceReportColumn>(_ArrayOfHotelGroupPerformanceReportColumn_QNAME, ArrayOfHotelGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfConversionPerformanceReportColumn")
    public JAXBElement<ArrayOfConversionPerformanceReportColumn> createArrayOfConversionPerformanceReportColumn(ArrayOfConversionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfConversionPerformanceReportColumn>(_ArrayOfConversionPerformanceReportColumn_QNAME, ArrayOfConversionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportFormat")
    public JAXBElement<ReportFormat> createReportFormat(ReportFormat value) {
        return new JAXBElement<ReportFormat>(_ReportFormat_QNAME, ReportFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportColumn")
    public JAXBElement<AdPerformanceReportColumn> createAdPerformanceReportColumn(AdPerformanceReportColumn value) {
        return new JAXBElement<AdPerformanceReportColumn>(_AdPerformanceReportColumn_QNAME, AdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportFilter")
    public JAXBElement<ProductPartitionUnitPerformanceReportFilter> createProductPartitionUnitPerformanceReportFilter(ProductPartitionUnitPerformanceReportFilter value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportFilter>(_ProductPartitionUnitPerformanceReportFilter_QNAME, ProductPartitionUnitPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<AdTypeReportFilter>> createAdTypeReportFilter(Collection<AdTypeReportFilter> value) {
        return new JAXBElement<Collection<AdTypeReportFilter>>(_AdTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeEntityReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ChangeEntityReportFilter")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<ChangeEntityReportFilter>> createChangeEntityReportFilter(Collection<ChangeEntityReportFilter> value) {
        return new JAXBElement<Collection<ChangeEntityReportFilter>>(_ChangeEntityReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoalsAndFunnelsReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfGoalsAndFunnelsReportColumn")
    public JAXBElement<ArrayOfGoalsAndFunnelsReportColumn> createArrayOfGoalsAndFunnelsReportColumn(ArrayOfGoalsAndFunnelsReportColumn value) {
        return new JAXBElement<ArrayOfGoalsAndFunnelsReportColumn>(_ArrayOfGoalsAndFunnelsReportColumn_QNAME, ArrayOfGoalsAndFunnelsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportRequest")
    public JAXBElement<NegativeKeywordConflictReportRequest> createNegativeKeywordConflictReportRequest(NegativeKeywordConflictReportRequest value) {
        return new JAXBElement<NegativeKeywordConflictReportRequest>(_NegativeKeywordConflictReportRequest_QNAME, NegativeKeywordConflictReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportRequest")
    public JAXBElement<ConversionPerformanceReportRequest> createConversionPerformanceReportRequest(ConversionPerformanceReportRequest value) {
        return new JAXBElement<ConversionPerformanceReportRequest>(_ConversionPerformanceReportRequest_QNAME, ConversionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportColumn")
    public JAXBElement<DSASearchQueryPerformanceReportColumn> createDSASearchQueryPerformanceReportColumn(DSASearchQueryPerformanceReportColumn value) {
        return new JAXBElement<DSASearchQueryPerformanceReportColumn>(_DSASearchQueryPerformanceReportColumn_QNAME, DSASearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidMatchTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<BidMatchTypeReportFilter>> createBidMatchTypeReportFilter(Collection<BidMatchTypeReportFilter> value) {
        return new JAXBElement<Collection<BidMatchTypeReportFilter>>(_BidMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportColumn")
    public JAXBElement<ConversionPerformanceReportColumn> createConversionPerformanceReportColumn(ConversionPerformanceReportColumn value) {
        return new JAXBElement<ConversionPerformanceReportColumn>(_ConversionPerformanceReportColumn_QNAME, ConversionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportFilter")
    public JAXBElement<ProductSearchQueryPerformanceReportFilter> createProductSearchQueryPerformanceReportFilter(ProductSearchQueryPerformanceReportFilter value) {
        return new JAXBElement<ProductSearchQueryPerformanceReportFilter>(_ProductSearchQueryPerformanceReportFilter_QNAME, ProductSearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AccountStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AccountStatusReportFilter>> createAccountStatusReportFilter(Collection<AccountStatusReportFilter> value) {
        return new JAXBElement<Collection<AccountStatusReportFilter>>(_AccountStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportColumn")
    public JAXBElement<HotelGroupPerformanceReportColumn> createHotelGroupPerformanceReportColumn(HotelGroupPerformanceReportColumn value) {
        return new JAXBElement<HotelGroupPerformanceReportColumn>(_HotelGroupPerformanceReportColumn_QNAME, HotelGroupPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportRequest")
    public JAXBElement<SearchCampaignChangeHistoryReportRequest> createSearchCampaignChangeHistoryReportRequest(SearchCampaignChangeHistoryReportRequest value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportRequest>(_SearchCampaignChangeHistoryReportRequest_QNAME, SearchCampaignChangeHistoryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfSearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfSearchQueryPerformanceReportColumn> createArrayOfSearchQueryPerformanceReportColumn(ArrayOfSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfSearchQueryPerformanceReportColumn>(_ArrayOfSearchQueryPerformanceReportColumn_QNAME, ArrayOfSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportColumn")
    public JAXBElement<AdGroupPerformanceReportColumn> createAdGroupPerformanceReportColumn(AdGroupPerformanceReportColumn value) {
        return new JAXBElement<AdGroupPerformanceReportColumn>(_AdGroupPerformanceReportColumn_QNAME, AdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportFilter")
    public JAXBElement<CampaignPerformanceReportFilter> createCampaignPerformanceReportFilter(CampaignPerformanceReportFilter value) {
        return new JAXBElement<CampaignPerformanceReportFilter>(_CampaignPerformanceReportFilter_QNAME, CampaignPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportRequest")
    public JAXBElement<AudiencePerformanceReportRequest> createAudiencePerformanceReportRequest(AudiencePerformanceReportRequest value) {
        return new JAXBElement<AudiencePerformanceReportRequest>(_AudiencePerformanceReportRequest_QNAME, AudiencePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdDistributionReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDistributionReportFilter")
    @XmlJavaTypeAdapter(Adapter16 .class)
    public JAXBElement<Collection<AdDistributionReportFilter>> createAdDistributionReportFilter(Collection<AdDistributionReportFilter> value) {
        return new JAXBElement<Collection<AdDistributionReportFilter>>(_AdDistributionReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportFilter")
    public JAXBElement<KeywordPerformanceReportFilter> createKeywordPerformanceReportFilter(KeywordPerformanceReportFilter value) {
        return new JAXBElement<KeywordPerformanceReportFilter>(_KeywordPerformanceReportFilter_QNAME, KeywordPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublisherUsagePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfPublisherUsagePerformanceReportColumn")
    public JAXBElement<ArrayOfPublisherUsagePerformanceReportColumn> createArrayOfPublisherUsagePerformanceReportColumn(ArrayOfPublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<ArrayOfPublisherUsagePerformanceReportColumn>(_ArrayOfPublisherUsagePerformanceReportColumn_QNAME, ArrayOfPublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportFilter")
    public JAXBElement<AdExtensionByAdReportFilter> createAdExtensionByAdReportFilter(AdExtensionByAdReportFilter value) {
        return new JAXBElement<AdExtensionByAdReportFilter>(_AdExtensionByAdReportFilter_QNAME, AdExtensionByAdReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportColumn")
    public JAXBElement<AdExtensionDetailReportColumn> createAdExtensionDetailReportColumn(AdExtensionDetailReportColumn value) {
        return new JAXBElement<AdExtensionDetailReportColumn>(_AdExtensionDetailReportColumn_QNAME, AdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportColumn")
    public JAXBElement<ProductPartitionPerformanceReportColumn> createProductPartitionPerformanceReportColumn(ProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<ProductPartitionPerformanceReportColumn>(_ProductPartitionPerformanceReportColumn_QNAME, ProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BudgetSummaryReportRequest")
    public JAXBElement<BudgetSummaryReportRequest> createBudgetSummaryReportRequest(BudgetSummaryReportRequest value) {
        return new JAXBElement<BudgetSummaryReportRequest>(_BudgetSummaryReportRequest_QNAME, BudgetSummaryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportFilter")
    public JAXBElement<GoalsAndFunnelsReportFilter> createGoalsAndFunnelsReportFilter(GoalsAndFunnelsReportFilter value) {
        return new JAXBElement<GoalsAndFunnelsReportFilter>(_GoalsAndFunnelsReportFilter_QNAME, GoalsAndFunnelsReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinationUrlPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDestinationUrlPerformanceReportColumn")
    public JAXBElement<ArrayOfDestinationUrlPerformanceReportColumn> createArrayOfDestinationUrlPerformanceReportColumn(ArrayOfDestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfDestinationUrlPerformanceReportColumn>(_ArrayOfDestinationUrlPerformanceReportColumn_QNAME, ArrayOfDestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportRequest")
    public JAXBElement<ProductPartitionPerformanceReportRequest> createProductPartitionPerformanceReportRequest(ProductPartitionPerformanceReportRequest value) {
        return new JAXBElement<ProductPartitionPerformanceReportRequest>(_ProductPartitionPerformanceReportRequest_QNAME, ProductPartitionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportRequest")
    public JAXBElement<GeographicPerformanceReportRequest> createGeographicPerformanceReportRequest(GeographicPerformanceReportRequest value) {
        return new JAXBElement<GeographicPerformanceReportRequest>(_GeographicPerformanceReportRequest_QNAME, GeographicPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTimeZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTimeZone")
    public JAXBElement<ReportTimeZone> createReportTimeZone(ReportTimeZone value) {
        return new JAXBElement<ReportTimeZone>(_ReportTimeZone_QNAME, ReportTimeZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdDynamicTextPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdDynamicTextPerformanceReportColumn")
    public JAXBElement<ArrayOfAdDynamicTextPerformanceReportColumn> createArrayOfAdDynamicTextPerformanceReportColumn(ArrayOfAdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdDynamicTextPerformanceReportColumn>(_ArrayOfAdDynamicTextPerformanceReportColumn_QNAME, ArrayOfAdDynamicTextPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportColumn")
    public JAXBElement<AgeGenderAudienceReportColumn> createAgeGenderAudienceReportColumn(AgeGenderAudienceReportColumn value) {
        return new JAXBElement<AgeGenderAudienceReportColumn>(_AgeGenderAudienceReportColumn_QNAME, AgeGenderAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportFilter")
    public JAXBElement<SearchQueryPerformanceReportFilter> createSearchQueryPerformanceReportFilter(SearchQueryPerformanceReportFilter value) {
        return new JAXBElement<SearchQueryPerformanceReportFilter>(_SearchQueryPerformanceReportFilter_QNAME, SearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportColumn")
    public JAXBElement<DSACategoryPerformanceReportColumn> createDSACategoryPerformanceReportColumn(DSACategoryPerformanceReportColumn value) {
        return new JAXBElement<DSACategoryPerformanceReportColumn>(_DSACategoryPerformanceReportColumn_QNAME, DSACategoryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequestStatusType")
    public JAXBElement<ReportRequestStatusType> createReportRequestStatusType(ReportRequestStatusType value) {
        return new JAXBElement<ReportRequestStatusType>(_ReportRequestStatusType_QNAME, ReportRequestStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportFilter")
    public JAXBElement<AudiencePerformanceReportFilter> createAudiencePerformanceReportFilter(AudiencePerformanceReportFilter value) {
        return new JAXBElement<AudiencePerformanceReportFilter>(_AudiencePerformanceReportFilter_QNAME, AudiencePerformanceReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareOfVoiceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfShareOfVoiceReportColumn")
    public JAXBElement<ArrayOfShareOfVoiceReportColumn> createArrayOfShareOfVoiceReportColumn(ArrayOfShareOfVoiceReportColumn value) {
        return new JAXBElement<ArrayOfShareOfVoiceReportColumn>(_ArrayOfShareOfVoiceReportColumn_QNAME, ArrayOfShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallDetailReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCallDetailReportColumn")
    public JAXBElement<ArrayOfCallDetailReportColumn> createArrayOfCallDetailReportColumn(ArrayOfCallDetailReportColumn value) {
        return new JAXBElement<ArrayOfCallDetailReportColumn>(_ArrayOfCallDetailReportColumn_QNAME, ArrayOfCallDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportFilter")
    public JAXBElement<AccountPerformanceReportFilter> createAccountPerformanceReportFilter(AccountPerformanceReportFilter value) {
        return new JAXBElement<AccountPerformanceReportFilter>(_AccountPerformanceReportFilter_QNAME, AccountPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportFilter")
    public JAXBElement<AdDynamicTextPerformanceReportFilter> createAdDynamicTextPerformanceReportFilter(AdDynamicTextPerformanceReportFilter value) {
        return new JAXBElement<AdDynamicTextPerformanceReportFilter>(_AdDynamicTextPerformanceReportFilter_QNAME, AdDynamicTextPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportColumn")
    public JAXBElement<AdExtensionByKeywordReportColumn> createAdExtensionByKeywordReportColumn(AdExtensionByKeywordReportColumn value) {
        return new JAXBElement<AdExtensionByKeywordReportColumn>(_AdExtensionByKeywordReportColumn_QNAME, AdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdPerformanceReportColumn")
    public JAXBElement<ArrayOfAdPerformanceReportColumn> createArrayOfAdPerformanceReportColumn(ArrayOfAdPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfAdPerformanceReportColumn>(_ArrayOfAdPerformanceReportColumn_QNAME, ArrayOfAdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportRequest")
    public JAXBElement<HotelDimensionPerformanceReportRequest> createHotelDimensionPerformanceReportRequest(HotelDimensionPerformanceReportRequest value) {
        return new JAXBElement<HotelDimensionPerformanceReportRequest>(_HotelDimensionPerformanceReportRequest_QNAME, HotelDimensionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ChangeTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter13 .class)
    public JAXBElement<Collection<ChangeTypeReportFilter>> createChangeTypeReportFilter(Collection<ChangeTypeReportFilter> value) {
        return new JAXBElement<Collection<ChangeTypeReportFilter>>(_ChangeTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportRequest")
    public JAXBElement<CampaignPerformanceReportRequest> createCampaignPerformanceReportRequest(CampaignPerformanceReportRequest value) {
        return new JAXBElement<CampaignPerformanceReportRequest>(_CampaignPerformanceReportRequest_QNAME, CampaignPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductSearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfProductSearchQueryPerformanceReportColumn> createArrayOfProductSearchQueryPerformanceReportColumn(ArrayOfProductSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductSearchQueryPerformanceReportColumn>(_ArrayOfProductSearchQueryPerformanceReportColumn_QNAME, ArrayOfProductSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportSort")
    public JAXBElement<KeywordPerformanceReportSort> createKeywordPerformanceReportSort(KeywordPerformanceReportSort value) {
        return new JAXBElement<KeywordPerformanceReportSort>(_KeywordPerformanceReportSort_QNAME, KeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupReportScope")
    public JAXBElement<AdGroupReportScope> createAdGroupReportScope(AdGroupReportScope value) {
        return new JAXBElement<AdGroupReportScope>(_AdGroupReportScope_QNAME, AdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportFilter")
    public JAXBElement<ProfessionalDemographicsAudienceReportFilter> createProfessionalDemographicsAudienceReportFilter(ProfessionalDemographicsAudienceReportFilter value) {
        return new JAXBElement<ProfessionalDemographicsAudienceReportFilter>(_ProfessionalDemographicsAudienceReportFilter_QNAME, ProfessionalDemographicsAudienceReportFilter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiError")
    public JAXBElement<AdApiError> createAdApiError(AdApiError value) {
        return new JAXBElement<AdApiError>(_AdApiError_QNAME, AdApiError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportColumn")
    public JAXBElement<DestinationUrlPerformanceReportColumn> createDestinationUrlPerformanceReportColumn(DestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<DestinationUrlPerformanceReportColumn>(_DestinationUrlPerformanceReportColumn_QNAME, DestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionUnitPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionUnitPerformanceReportColumn> createArrayOfProductPartitionUnitPerformanceReportColumn(ArrayOfProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductPartitionUnitPerformanceReportColumn>(_ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME, ArrayOfProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCampaignChangeHistoryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfSearchCampaignChangeHistoryReportColumn")
    public JAXBElement<ArrayOfSearchCampaignChangeHistoryReportColumn> createArrayOfSearchCampaignChangeHistoryReportColumn(ArrayOfSearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<ArrayOfSearchCampaignChangeHistoryReportColumn>(_ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME, ArrayOfSearchCampaignChangeHistoryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportFilter")
    public JAXBElement<AdGroupPerformanceReportFilter> createAdGroupPerformanceReportFilter(AdGroupPerformanceReportFilter value) {
        return new JAXBElement<AdGroupPerformanceReportFilter>(_AdGroupPerformanceReportFilter_QNAME, AdGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportRequest")
    public JAXBElement<ShareOfVoiceReportRequest> createShareOfVoiceReportRequest(ShareOfVoiceReportRequest value) {
        return new JAXBElement<ShareOfVoiceReportRequest>(_ShareOfVoiceReportRequest_QNAME, ShareOfVoiceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidStrategyTypeReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidStrategyTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<BidStrategyTypeReportFilter>> createBidStrategyTypeReportFilter(Collection<BidStrategyTypeReportFilter> value) {
        return new JAXBElement<Collection<BidStrategyTypeReportFilter>>(_BidStrategyTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportRequest")
    public JAXBElement<DestinationUrlPerformanceReportRequest> createDestinationUrlPerformanceReportRequest(DestinationUrlPerformanceReportRequest value) {
        return new JAXBElement<DestinationUrlPerformanceReportRequest>(_DestinationUrlPerformanceReportRequest_QNAME, DestinationUrlPerformanceReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportRequest")
    public JAXBElement<AdExtensionByKeywordReportRequest> createAdExtensionByKeywordReportRequest(AdExtensionByKeywordReportRequest value) {
        return new JAXBElement<AdExtensionByKeywordReportRequest>(_AdExtensionByKeywordReportRequest_QNAME, AdExtensionByKeywordReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportColumn")
    public JAXBElement<PublisherUsagePerformanceReportColumn> createPublisherUsagePerformanceReportColumn(PublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<PublisherUsagePerformanceReportColumn>(_PublisherUsagePerformanceReportColumn_QNAME, PublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportRequest")
    public JAXBElement<DSASearchQueryPerformanceReportRequest> createDSASearchQueryPerformanceReportRequest(DSASearchQueryPerformanceReportRequest value) {
        return new JAXBElement<DSASearchQueryPerformanceReportRequest>(_DSASearchQueryPerformanceReportRequest_QNAME, DSASearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportFilter")
    public JAXBElement<CallDetailReportFilter> createCallDetailReportFilter(CallDetailReportFilter value) {
        return new JAXBElement<CallDetailReportFilter>(_CallDetailReportFilter_QNAME, CallDetailReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportRequest")
    public JAXBElement<KeywordPerformanceReportRequest> createKeywordPerformanceReportRequest(KeywordPerformanceReportRequest value) {
        return new JAXBElement<KeywordPerformanceReportRequest>(_KeywordPerformanceReportRequest_QNAME, KeywordPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportRequest")
    public JAXBElement<AdDynamicTextPerformanceReportRequest> createAdDynamicTextPerformanceReportRequest(AdDynamicTextPerformanceReportRequest value) {
        return new JAXBElement<AdDynamicTextPerformanceReportRequest>(_AdDynamicTextPerformanceReportRequest_QNAME, AdDynamicTextPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserLocationPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfUserLocationPerformanceReportColumn")
    public JAXBElement<ArrayOfUserLocationPerformanceReportColumn> createArrayOfUserLocationPerformanceReportColumn(ArrayOfUserLocationPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfUserLocationPerformanceReportColumn>(_ArrayOfUserLocationPerformanceReportColumn_QNAME, ArrayOfUserLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportColumn")
    public JAXBElement<DSAAutoTargetPerformanceReportColumn> createDSAAutoTargetPerformanceReportColumn(DSAAutoTargetPerformanceReportColumn value) {
        return new JAXBElement<DSAAutoTargetPerformanceReportColumn>(_DSAAutoTargetPerformanceReportColumn_QNAME, DSAAutoTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCampaignPerformanceReportColumn")
    public JAXBElement<ArrayOfCampaignPerformanceReportColumn> createArrayOfCampaignPerformanceReportColumn(ArrayOfCampaignPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfCampaignPerformanceReportColumn>(_ArrayOfCampaignPerformanceReportColumn_QNAME, ArrayOfCampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportFilter")
    public JAXBElement<ProductNegativeKeywordConflictReportFilter> createProductNegativeKeywordConflictReportFilter(ProductNegativeKeywordConflictReportFilter value) {
        return new JAXBElement<ProductNegativeKeywordConflictReportFilter>(_ProductNegativeKeywordConflictReportFilter_QNAME, ProductNegativeKeywordConflictReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductMatchCountReportColumn")
    public JAXBElement<ProductMatchCountReportColumn> createProductMatchCountReportColumn(ProductMatchCountReportColumn value) {
        return new JAXBElement<ProductMatchCountReportColumn>(_ProductMatchCountReportColumn_QNAME, ProductMatchCountReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportRequest")
    public JAXBElement<ProfessionalDemographicsAudienceReportRequest> createProfessionalDemographicsAudienceReportRequest(ProfessionalDemographicsAudienceReportRequest value) {
        return new JAXBElement<ProfessionalDemographicsAudienceReportRequest>(_ProfessionalDemographicsAudienceReportRequest_QNAME, ProfessionalDemographicsAudienceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportAggregation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportAggregation")
    public JAXBElement<ReportAggregation> createReportAggregation(ReportAggregation value) {
        return new JAXBElement<ReportAggregation>(_ReportAggregation_QNAME, ReportAggregation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTimePeriod")
    public JAXBElement<ReportTimePeriod> createReportTimePeriod(ReportTimePeriod value) {
        return new JAXBElement<ReportTimePeriod>(_ReportTimePeriod_QNAME, ReportTimePeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportColumn")
    public JAXBElement<ProductSearchQueryPerformanceReportColumn> createProductSearchQueryPerformanceReportColumn(ProductSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<ProductSearchQueryPerformanceReportColumn>(_ProductSearchQueryPerformanceReportColumn_QNAME, ProductSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelDimensionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfHotelDimensionPerformanceReportColumn")
    public JAXBElement<ArrayOfHotelDimensionPerformanceReportColumn> createArrayOfHotelDimensionPerformanceReportColumn(ArrayOfHotelDimensionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfHotelDimensionPerformanceReportColumn>(_ArrayOfHotelDimensionPerformanceReportColumn_QNAME, ArrayOfHotelDimensionPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportColumn")
    public JAXBElement<CampaignPerformanceReportColumn> createCampaignPerformanceReportColumn(CampaignPerformanceReportColumn value) {
        return new JAXBElement<CampaignPerformanceReportColumn>(_CampaignPerformanceReportColumn_QNAME, CampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportFilter")
    public JAXBElement<UserLocationPerformanceReportFilter> createUserLocationPerformanceReportFilter(UserLocationPerformanceReportFilter value) {
        return new JAXBElement<UserLocationPerformanceReportFilter>(_UserLocationPerformanceReportFilter_QNAME, UserLocationPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductNegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductNegativeKeywordConflictReportColumn")
    public JAXBElement<ArrayOfProductNegativeKeywordConflictReportColumn> createArrayOfProductNegativeKeywordConflictReportColumn(ArrayOfProductNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<ArrayOfProductNegativeKeywordConflictReportColumn>(_ArrayOfProductNegativeKeywordConflictReportColumn_QNAME, ArrayOfProductNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountReportScope")
    public JAXBElement<AccountReportScope> createAccountReportScope(AccountReportScope value) {
        return new JAXBElement<AccountReportScope>(_AccountReportScope_QNAME, AccountReportScope.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByKeywordReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionByKeywordReportColumn")
    public JAXBElement<ArrayOfAdExtensionByKeywordReportColumn> createArrayOfAdExtensionByKeywordReportColumn(ArrayOfAdExtensionByKeywordReportColumn value) {
        return new JAXBElement<ArrayOfAdExtensionByKeywordReportColumn>(_ArrayOfAdExtensionByKeywordReportColumn_QNAME, ArrayOfAdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdStatusReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<AdStatusReportFilter>> createAdStatusReportFilter(Collection<AdStatusReportFilter> value) {
        return new JAXBElement<Collection<AdStatusReportFilter>>(_AdStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportColumn")
    public JAXBElement<ShareOfVoiceReportColumn> createShareOfVoiceReportColumn(ShareOfVoiceReportColumn value) {
        return new JAXBElement<ShareOfVoiceReportColumn>(_ShareOfVoiceReportColumn_QNAME, ShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportColumn")
    public JAXBElement<ProductNegativeKeywordConflictReportColumn> createProductNegativeKeywordConflictReportColumn(ProductNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<ProductNegativeKeywordConflictReportColumn>(_ProductNegativeKeywordConflictReportColumn_QNAME, ProductNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequestStatus")
    public JAXBElement<ReportRequestStatus> createReportRequestStatus(ReportRequestStatus value) {
        return new JAXBElement<ReportRequestStatus>(_ReportRequestStatus_QNAME, ReportRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link LanguageReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "LanguageReportFilter")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<LanguageReportFilter>> createLanguageReportFilter(Collection<LanguageReportFilter> value) {
        return new JAXBElement<Collection<LanguageReportFilter>>(_LanguageReportFilter_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportRequest")
    public JAXBElement<DSAAutoTargetPerformanceReportRequest> createDSAAutoTargetPerformanceReportRequest(DSAAutoTargetPerformanceReportRequest value) {
        return new JAXBElement<DSAAutoTargetPerformanceReportRequest>(_DSAAutoTargetPerformanceReportRequest_QNAME, DSAAutoTargetPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeographicPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfGeographicPerformanceReportColumn")
    public JAXBElement<ArrayOfGeographicPerformanceReportColumn> createArrayOfGeographicPerformanceReportColumn(ArrayOfGeographicPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfGeographicPerformanceReportColumn>(_ArrayOfGeographicPerformanceReportColumn_QNAME, ArrayOfGeographicPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportFilter")
    public JAXBElement<SearchCampaignChangeHistoryReportFilter> createSearchCampaignChangeHistoryReportFilter(SearchCampaignChangeHistoryReportFilter value) {
        return new JAXBElement<SearchCampaignChangeHistoryReportFilter>(_SearchCampaignChangeHistoryReportFilter_QNAME, SearchCampaignChangeHistoryReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportRequest")
    public JAXBElement<AdExtensionDetailReportRequest> createAdExtensionDetailReportRequest(AdExtensionDetailReportRequest value) {
        return new JAXBElement<AdExtensionDetailReportRequest>(_AdExtensionDetailReportRequest_QNAME, AdExtensionDetailReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceOSReportFilter }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeviceOSReportFilter")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<DeviceOSReportFilter>> createDeviceOSReportFilter(Collection<DeviceOSReportFilter> value) {
        return new JAXBElement<Collection<DeviceOSReportFilter>>(_DeviceOSReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughCampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountThroughCampaignReportScope")
    public JAXBElement<AccountThroughCampaignReportScope> createAccountThroughCampaignReportScope(AccountThroughCampaignReportScope value) {
        return new JAXBElement<AccountThroughCampaignReportScope>(_AccountThroughCampaignReportScope_QNAME, AccountThroughCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportFilter")
    public JAXBElement<HotelDimensionPerformanceReportFilter> createHotelDimensionPerformanceReportFilter(HotelDimensionPerformanceReportFilter value) {
        return new JAXBElement<HotelDimensionPerformanceReportFilter>(_HotelDimensionPerformanceReportFilter_QNAME, HotelDimensionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportRequest")
    public JAXBElement<HotelGroupPerformanceReportRequest> createHotelGroupPerformanceReportRequest(HotelGroupPerformanceReportRequest value) {
        return new JAXBElement<HotelGroupPerformanceReportRequest>(_HotelGroupPerformanceReportRequest_QNAME, HotelGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportRequest")
    public JAXBElement<ProductPartitionUnitPerformanceReportRequest> createProductPartitionUnitPerformanceReportRequest(ProductPartitionUnitPerformanceReportRequest value) {
        return new JAXBElement<ProductPartitionUnitPerformanceReportRequest>(_ProductPartitionUnitPerformanceReportRequest_QNAME, ProductPartitionUnitPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportRequest")
    public JAXBElement<GoalsAndFunnelsReportRequest> createGoalsAndFunnelsReportRequest(GoalsAndFunnelsReportRequest value) {
        return new JAXBElement<GoalsAndFunnelsReportRequest>(_GoalsAndFunnelsReportRequest_QNAME, GoalsAndFunnelsReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportRequest")
    public JAXBElement<AgeGenderAudienceReportRequest> createAgeGenderAudienceReportRequest(AgeGenderAudienceReportRequest value) {
        return new JAXBElement<AgeGenderAudienceReportRequest>(_AgeGenderAudienceReportRequest_QNAME, AgeGenderAudienceReportRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfKeywordPerformanceReportSort")
    public JAXBElement<ArrayOfKeywordPerformanceReportSort> createArrayOfKeywordPerformanceReportSort(ArrayOfKeywordPerformanceReportSort value) {
        return new JAXBElement<ArrayOfKeywordPerformanceReportSort>(_ArrayOfKeywordPerformanceReportSort_QNAME, ArrayOfKeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportColumn")
    public JAXBElement<NegativeKeywordConflictReportColumn> createNegativeKeywordConflictReportColumn(NegativeKeywordConflictReportColumn value) {
        return new JAXBElement<NegativeKeywordConflictReportColumn>(_NegativeKeywordConflictReportColumn_QNAME, NegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductPartitionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionPerformanceReportColumn> createArrayOfProductPartitionPerformanceReportColumn(ArrayOfProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<ArrayOfProductPartitionPerformanceReportColumn>(_ArrayOfProductPartitionPerformanceReportColumn_QNAME, ArrayOfProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportRequest")
    public JAXBElement<UserLocationPerformanceReportRequest> createUserLocationPerformanceReportRequest(UserLocationPerformanceReportRequest value) {
        return new JAXBElement<UserLocationPerformanceReportRequest>(_UserLocationPerformanceReportRequest_QNAME, UserLocationPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCampaignReportScope")
    public JAXBElement<ArrayOfCampaignReportScope> createArrayOfCampaignReportScope(ArrayOfCampaignReportScope value) {
        return new JAXBElement<ArrayOfCampaignReportScope>(_ArrayOfCampaignReportScope_QNAME, ArrayOfCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignReportScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignReportScope")
    public JAXBElement<CampaignReportScope> createCampaignReportScope(CampaignReportScope value) {
        return new JAXBElement<CampaignReportScope>(_CampaignReportScope_QNAME, CampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetSummaryReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfBudgetSummaryReportColumn")
    public JAXBElement<ArrayOfBudgetSummaryReportColumn> createArrayOfBudgetSummaryReportColumn(ArrayOfBudgetSummaryReportColumn value) {
        return new JAXBElement<ArrayOfBudgetSummaryReportColumn>(_ArrayOfBudgetSummaryReportColumn_QNAME, ArrayOfBudgetSummaryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportColumn")
    public JAXBElement<GeographicPerformanceReportColumn> createGeographicPerformanceReportColumn(GeographicPerformanceReportColumn value) {
        return new JAXBElement<GeographicPerformanceReportColumn>(_GeographicPerformanceReportColumn_QNAME, GeographicPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportColumn")
    public JAXBElement<SearchQueryPerformanceReportColumn> createSearchQueryPerformanceReportColumn(SearchQueryPerformanceReportColumn value) {
        return new JAXBElement<SearchQueryPerformanceReportColumn>(_SearchQueryPerformanceReportColumn_QNAME, SearchQueryPerformanceReportColumn.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportRequest")
    public JAXBElement<DSACategoryPerformanceReportRequest> createDSACategoryPerformanceReportRequest(DSACategoryPerformanceReportRequest value) {
        return new JAXBElement<DSACategoryPerformanceReportRequest>(_DSACategoryPerformanceReportRequest_QNAME, DSACategoryPerformanceReportRequest.class, null, value);
    }

}
