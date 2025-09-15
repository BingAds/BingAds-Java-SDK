
package com.microsoft.bingads.v13.reporting;

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

    private static final QName _ReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequest");
    private static final QName _ReportFormat_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportFormat");
    private static final QName _AccountPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportRequest");
    private static final QName _ReportAggregation_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportAggregation");
    private static final QName _ArrayOfAccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAccountPerformanceReportColumn");
    private static final QName _AccountPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportColumn");
    private static final QName _AccountPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountPerformanceReportFilter");
    private static final QName _AccountStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountStatusReportFilter");
    private static final QName _AdDistributionReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDistributionReportFilter");
    private static final QName _DeviceOSReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeviceOSReportFilter");
    private static final QName _DeviceTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeviceTypeReportFilter");
    private static final QName _AccountReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountReportScope");
    private static final QName _ReportTime_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTime");
    private static final QName _Date_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "Date");
    private static final QName _ReportTimePeriod_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTimePeriod");
    private static final QName _ReportTimeZone_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportTimeZone");
    private static final QName _CampaignPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportRequest");
    private static final QName _ArrayOfCampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCampaignPerformanceReportColumn");
    private static final QName _CampaignPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportColumn");
    private static final QName _CampaignPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignPerformanceReportFilter");
    private static final QName _CampaignStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignStatusReportFilter");
    private static final QName _AccountThroughCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountThroughCampaignReportScope");
    private static final QName _ArrayOfCampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCampaignReportScope");
    private static final QName _CampaignReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignReportScope");
    private static final QName _AdDynamicTextPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportRequest");
    private static final QName _ArrayOfAdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdDynamicTextPerformanceReportColumn");
    private static final QName _AdDynamicTextPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportColumn");
    private static final QName _AdDynamicTextPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdDynamicTextPerformanceReportFilter");
    private static final QName _AdGroupStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupStatusReportFilter");
    private static final QName _AdStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdStatusReportFilter");
    private static final QName _AdTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdTypeReportFilter");
    private static final QName _KeywordStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordStatusReportFilter");
    private static final QName _LanguageReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "LanguageReportFilter");
    private static final QName _AccountThroughAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountThroughAdGroupReportScope");
    private static final QName _ArrayOfAdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdGroupReportScope");
    private static final QName _AdGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupReportScope");
    private static final QName _AdGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportRequest");
    private static final QName _ArrayOfAdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdGroupPerformanceReportColumn");
    private static final QName _AdGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportColumn");
    private static final QName _AdGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdGroupPerformanceReportFilter");
    private static final QName _AdPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportRequest");
    private static final QName _ArrayOfAdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdPerformanceReportColumn");
    private static final QName _AdPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportColumn");
    private static final QName _AdPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdPerformanceReportFilter");
    private static final QName _KeywordPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportRequest");
    private static final QName _ArrayOfKeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfKeywordPerformanceReportColumn");
    private static final QName _KeywordPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportColumn");
    private static final QName _KeywordPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportFilter");
    private static final QName _BidMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidMatchTypeReportFilter");
    private static final QName _BidStrategyTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidStrategyTypeReportFilter");
    private static final QName _DeliveredMatchTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeliveredMatchTypeReportFilter");
    private static final QName _ArrayOfKeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfKeywordPerformanceReportSort");
    private static final QName _KeywordPerformanceReportSort_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "KeywordPerformanceReportSort");
    private static final QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SortOrder");
    private static final QName _DestinationUrlPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportRequest");
    private static final QName _ArrayOfDestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDestinationUrlPerformanceReportColumn");
    private static final QName _DestinationUrlPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportColumn");
    private static final QName _DestinationUrlPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DestinationUrlPerformanceReportFilter");
    private static final QName _BudgetSummaryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BudgetSummaryReportRequest");
    private static final QName _ArrayOfBudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfBudgetSummaryReportColumn");
    private static final QName _BudgetSummaryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BudgetSummaryReportColumn");
    private static final QName _AgeGenderAudienceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportRequest");
    private static final QName _ArrayOfAgeGenderAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAgeGenderAudienceReportColumn");
    private static final QName _AgeGenderAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportColumn");
    private static final QName _AgeGenderAudienceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AgeGenderAudienceReportFilter");
    private static final QName _ProfessionalDemographicsAudienceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportRequest");
    private static final QName _ArrayOfProfessionalDemographicsAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProfessionalDemographicsAudienceReportColumn");
    private static final QName _ProfessionalDemographicsAudienceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportColumn");
    private static final QName _ProfessionalDemographicsAudienceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProfessionalDemographicsAudienceReportFilter");
    private static final QName _UserLocationPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportRequest");
    private static final QName _ArrayOfUserLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfUserLocationPerformanceReportColumn");
    private static final QName _UserLocationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportColumn");
    private static final QName _UserLocationPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserLocationPerformanceReportFilter");
    private static final QName _PublisherUsagePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportRequest");
    private static final QName _ArrayOfPublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfPublisherUsagePerformanceReportColumn");
    private static final QName _PublisherUsagePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportColumn");
    private static final QName _PublisherUsagePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "PublisherUsagePerformanceReportFilter");
    private static final QName _AssetGroupStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetGroupStatusReportFilter");
    private static final QName _SearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportRequest");
    private static final QName _ArrayOfSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfSearchQueryPerformanceReportColumn");
    private static final QName _SearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportColumn");
    private static final QName _SearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchQueryPerformanceReportFilter");
    private static final QName _ConversionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportRequest");
    private static final QName _ArrayOfConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfConversionPerformanceReportColumn");
    private static final QName _ConversionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportColumn");
    private static final QName _ConversionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ConversionPerformanceReportFilter");
    private static final QName _GoalsAndFunnelsReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportRequest");
    private static final QName _ArrayOfGoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfGoalsAndFunnelsReportColumn");
    private static final QName _GoalsAndFunnelsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportColumn");
    private static final QName _GoalsAndFunnelsReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GoalsAndFunnelsReportFilter");
    private static final QName _NegativeKeywordConflictReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportRequest");
    private static final QName _ArrayOfNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfNegativeKeywordConflictReportColumn");
    private static final QName _NegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportColumn");
    private static final QName _NegativeKeywordConflictReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "NegativeKeywordConflictReportFilter");
    private static final QName _SearchCampaignChangeHistoryReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportRequest");
    private static final QName _ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfSearchCampaignChangeHistoryReportColumn");
    private static final QName _SearchCampaignChangeHistoryReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportColumn");
    private static final QName _SearchCampaignChangeHistoryReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchCampaignChangeHistoryReportFilter");
    private static final QName _ChangeTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ChangeTypeReportFilter");
    private static final QName _ChangeEntityReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ChangeEntityReportFilter");
    private static final QName _AdExtensionByAdReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportRequest");
    private static final QName _ArrayOfAdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionByAdReportColumn");
    private static final QName _AdExtensionByAdReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportColumn");
    private static final QName _AdExtensionByAdReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByAdReportFilter");
    private static final QName _AdExtensionByKeywordReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportRequest");
    private static final QName _ArrayOfAdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionByKeywordReportColumn");
    private static final QName _AdExtensionByKeywordReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportColumn");
    private static final QName _AdExtensionByKeywordReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionByKeywordReportFilter");
    private static final QName _AudiencePerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportRequest");
    private static final QName _ArrayOfAudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAudiencePerformanceReportColumn");
    private static final QName _AudiencePerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportColumn");
    private static final QName _AudiencePerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AudiencePerformanceReportFilter");
    private static final QName _AdExtensionDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportRequest");
    private static final QName _ArrayOfAdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAdExtensionDetailReportColumn");
    private static final QName _AdExtensionDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportColumn");
    private static final QName _AdExtensionDetailReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AdExtensionDetailReportFilter");
    private static final QName _ShareOfVoiceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportRequest");
    private static final QName _ArrayOfShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfShareOfVoiceReportColumn");
    private static final QName _ShareOfVoiceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportColumn");
    private static final QName _ShareOfVoiceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ShareOfVoiceReportFilter");
    private static final QName _ProductDimensionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportRequest");
    private static final QName _ArrayOfProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductDimensionPerformanceReportColumn");
    private static final QName _ProductDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportColumn");
    private static final QName _ProductDimensionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductDimensionPerformanceReportFilter");
    private static final QName _ProductPartitionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportRequest");
    private static final QName _ArrayOfProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductPartitionPerformanceReportColumn");
    private static final QName _ProductPartitionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportColumn");
    private static final QName _ProductPartitionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionPerformanceReportFilter");
    private static final QName _CampaignTypeReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CampaignTypeReportFilter");
    private static final QName _ProductPartitionUnitPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportRequest");
    private static final QName _ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductPartitionUnitPerformanceReportColumn");
    private static final QName _ProductPartitionUnitPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportColumn");
    private static final QName _ProductPartitionUnitPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductPartitionUnitPerformanceReportFilter");
    private static final QName _ProductSearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportRequest");
    private static final QName _ArrayOfProductSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductSearchQueryPerformanceReportColumn");
    private static final QName _ProductSearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportColumn");
    private static final QName _ProductSearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductSearchQueryPerformanceReportFilter");
    private static final QName _ProductMatchCountReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductMatchCountReportRequest");
    private static final QName _ArrayOfProductMatchCountReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductMatchCountReportColumn");
    private static final QName _ProductMatchCountReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductMatchCountReportColumn");
    private static final QName _ProductNegativeKeywordConflictReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportRequest");
    private static final QName _ArrayOfProductNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfProductNegativeKeywordConflictReportColumn");
    private static final QName _ProductNegativeKeywordConflictReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportColumn");
    private static final QName _ProductNegativeKeywordConflictReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ProductNegativeKeywordConflictReportFilter");
    private static final QName _CallDetailReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportRequest");
    private static final QName _ArrayOfCallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCallDetailReportColumn");
    private static final QName _CallDetailReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportColumn");
    private static final QName _CallDetailReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CallDetailReportFilter");
    private static final QName _GeographicPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportRequest");
    private static final QName _ArrayOfGeographicPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfGeographicPerformanceReportColumn");
    private static final QName _GeographicPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportColumn");
    private static final QName _GeographicPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "GeographicPerformanceReportFilter");
    private static final QName _DSASearchQueryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportRequest");
    private static final QName _ArrayOfDSASearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSASearchQueryPerformanceReportColumn");
    private static final QName _DSASearchQueryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportColumn");
    private static final QName _DSASearchQueryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSASearchQueryPerformanceReportFilter");
    private static final QName _DSAAutoTargetPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportRequest");
    private static final QName _ArrayOfDSAAutoTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSAAutoTargetPerformanceReportColumn");
    private static final QName _DSAAutoTargetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportColumn");
    private static final QName _DSAAutoTargetPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSAAutoTargetPerformanceReportFilter");
    private static final QName _DynamicAdTargetStatusReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DynamicAdTargetStatusReportFilter");
    private static final QName _DSACategoryPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportRequest");
    private static final QName _ArrayOfDSACategoryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfDSACategoryPerformanceReportColumn");
    private static final QName _DSACategoryPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportColumn");
    private static final QName _DSACategoryPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DSACategoryPerformanceReportFilter");
    private static final QName _HotelDimensionPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportRequest");
    private static final QName _ArrayOfHotelDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfHotelDimensionPerformanceReportColumn");
    private static final QName _HotelDimensionPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportColumn");
    private static final QName _HotelDimensionPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelDimensionPerformanceReportFilter");
    private static final QName _HotelGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportRequest");
    private static final QName _ArrayOfHotelGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfHotelGroupPerformanceReportColumn");
    private static final QName _HotelGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportColumn");
    private static final QName _HotelGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "HotelGroupPerformanceReportFilter");
    private static final QName _AssetGroupPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetGroupPerformanceReportRequest");
    private static final QName _ArrayOfAssetGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAssetGroupPerformanceReportColumn");
    private static final QName _AssetGroupPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetGroupPerformanceReportColumn");
    private static final QName _AssetGroupPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetGroupPerformanceReportFilter");
    private static final QName _AccountThroughAssetGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AccountThroughAssetGroupReportScope");
    private static final QName _ArrayOfAssetGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAssetGroupReportScope");
    private static final QName _AssetGroupReportScope_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetGroupReportScope");
    private static final QName _SearchInsightPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchInsightPerformanceReportRequest");
    private static final QName _ArrayOfSearchInsightPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfSearchInsightPerformanceReportColumn");
    private static final QName _SearchInsightPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchInsightPerformanceReportColumn");
    private static final QName _SearchInsightPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "SearchInsightPerformanceReportFilter");
    private static final QName _AssetPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetPerformanceReportRequest");
    private static final QName _ArrayOfAssetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAssetPerformanceReportColumn");
    private static final QName _AssetPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AssetPerformanceReportColumn");
    private static final QName _CategoryInsightsReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryInsightsReportRequest");
    private static final QName _ArrayOfCategoryInsightsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCategoryInsightsReportColumn");
    private static final QName _CategoryInsightsReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryInsightsReportColumn");
    private static final QName _CategoryInsightsReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryInsightsReportFilter");
    private static final QName _CategoryClickCoverageReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryClickCoverageReportRequest");
    private static final QName _ArrayOfCategoryClickCoverageReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCategoryClickCoverageReportColumn");
    private static final QName _CategoryClickCoverageReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryClickCoverageReportColumn");
    private static final QName _CategoryClickCoverageReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CategoryClickCoverageReportFilter");
    private static final QName _CombinationPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CombinationPerformanceReportRequest");
    private static final QName _ArrayOfCombinationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfCombinationPerformanceReportColumn");
    private static final QName _CombinationPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CombinationPerformanceReportColumn");
    private static final QName _CombinationPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CombinationPerformanceReportFilter");
    private static final QName _AppsPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AppsPerformanceReportRequest");
    private static final QName _ArrayOfAppsPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfAppsPerformanceReportColumn");
    private static final QName _AppsPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AppsPerformanceReportColumn");
    private static final QName _AppsPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AppsPerformanceReportFilter");
    private static final QName _FeedItemPerformanceReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "FeedItemPerformanceReportRequest");
    private static final QName _ArrayOfFeedItemPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfFeedItemPerformanceReportColumn");
    private static final QName _FeedItemPerformanceReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "FeedItemPerformanceReportColumn");
    private static final QName _FeedItemPerformanceReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "FeedItemPerformanceReportFilter");
    private static final QName _TravelQueryInsightReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "TravelQueryInsightReportRequest");
    private static final QName _ArrayOfTravelQueryInsightReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfTravelQueryInsightReportColumn");
    private static final QName _TravelQueryInsightReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "TravelQueryInsightReportColumn");
    private static final QName _TravelQueryInsightReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "TravelQueryInsightReportFilter");
    private static final QName _BidStrategyReportRequest_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidStrategyReportRequest");
    private static final QName _ArrayOfBidStrategyReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfBidStrategyReportColumn");
    private static final QName _BidStrategyReportColumn_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidStrategyReportColumn");
    private static final QName _BidStrategyReportFilter_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BidStrategyReportFilter");
    private static final QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ApplicationToken");
    private static final QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "AuthenticationToken");
    private static final QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CustomerAccountId");
    private static final QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "CustomerId");
    private static final QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "DeveloperToken");
    private static final QName _Password_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "Password");
    private static final QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "UserName");
    private static final QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "TrackingId");
    private static final QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ApiFaultDetail");
    private static final QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfBatchError");
    private static final QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "BatchError");
    private static final QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ArrayOfOperationError");
    private static final QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "OperationError");
    private static final QName _ReportRequestStatus_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequestStatus");
    private static final QName _ReportRequestStatusType_QNAME = new QName("https://bingads.microsoft.com/Reporting/v13", "ReportRequestStatusType");
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
    private static final QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private static final QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private static final QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private static final QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private static final QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private static final QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.reporting
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link SubmitGenerateReportRequest }
     * 
     * @return
     *     the new instance of {@link SubmitGenerateReportRequest }
     */
    public SubmitGenerateReportRequest createSubmitGenerateReportRequest() {
        return new SubmitGenerateReportRequest();
    }

    /**
     * Create an instance of {@link ReportRequest }
     * 
     * @return
     *     the new instance of {@link ReportRequest }
     */
    public ReportRequest createReportRequest() {
        return new ReportRequest();
    }

    /**
     * Create an instance of {@link AccountPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AccountPerformanceReportRequest }
     */
    public AccountPerformanceReportRequest createAccountPerformanceReportRequest() {
        return new AccountPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAccountPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountPerformanceReportColumn }
     */
    public ArrayOfAccountPerformanceReportColumn createArrayOfAccountPerformanceReportColumn() {
        return new ArrayOfAccountPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AccountPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AccountPerformanceReportFilter }
     */
    public AccountPerformanceReportFilter createAccountPerformanceReportFilter() {
        return new AccountPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountReportScope }
     * 
     * @return
     *     the new instance of {@link AccountReportScope }
     */
    public AccountReportScope createAccountReportScope() {
        return new AccountReportScope();
    }

    /**
     * Create an instance of {@link ReportTime }
     * 
     * @return
     *     the new instance of {@link ReportTime }
     */
    public ReportTime createReportTime() {
        return new ReportTime();
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
     * Create an instance of {@link CampaignPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link CampaignPerformanceReportRequest }
     */
    public CampaignPerformanceReportRequest createCampaignPerformanceReportRequest() {
        return new CampaignPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignPerformanceReportColumn }
     */
    public ArrayOfCampaignPerformanceReportColumn createArrayOfCampaignPerformanceReportColumn() {
        return new ArrayOfCampaignPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link CampaignPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link CampaignPerformanceReportFilter }
     */
    public CampaignPerformanceReportFilter createCampaignPerformanceReportFilter() {
        return new CampaignPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountThroughCampaignReportScope }
     * 
     * @return
     *     the new instance of {@link AccountThroughCampaignReportScope }
     */
    public AccountThroughCampaignReportScope createAccountThroughCampaignReportScope() {
        return new AccountThroughCampaignReportScope();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignReportScope }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignReportScope }
     */
    public ArrayOfCampaignReportScope createArrayOfCampaignReportScope() {
        return new ArrayOfCampaignReportScope();
    }

    /**
     * Create an instance of {@link CampaignReportScope }
     * 
     * @return
     *     the new instance of {@link CampaignReportScope }
     */
    public CampaignReportScope createCampaignReportScope() {
        return new CampaignReportScope();
    }

    /**
     * Create an instance of {@link AdDynamicTextPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AdDynamicTextPerformanceReportRequest }
     */
    public AdDynamicTextPerformanceReportRequest createAdDynamicTextPerformanceReportRequest() {
        return new AdDynamicTextPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdDynamicTextPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdDynamicTextPerformanceReportColumn }
     */
    public ArrayOfAdDynamicTextPerformanceReportColumn createArrayOfAdDynamicTextPerformanceReportColumn() {
        return new ArrayOfAdDynamicTextPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AdDynamicTextPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AdDynamicTextPerformanceReportFilter }
     */
    public AdDynamicTextPerformanceReportFilter createAdDynamicTextPerformanceReportFilter() {
        return new AdDynamicTextPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountThroughAdGroupReportScope }
     * 
     * @return
     *     the new instance of {@link AccountThroughAdGroupReportScope }
     */
    public AccountThroughAdGroupReportScope createAccountThroughAdGroupReportScope() {
        return new AccountThroughAdGroupReportScope();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupReportScope }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroupReportScope }
     */
    public ArrayOfAdGroupReportScope createArrayOfAdGroupReportScope() {
        return new ArrayOfAdGroupReportScope();
    }

    /**
     * Create an instance of {@link AdGroupReportScope }
     * 
     * @return
     *     the new instance of {@link AdGroupReportScope }
     */
    public AdGroupReportScope createAdGroupReportScope() {
        return new AdGroupReportScope();
    }

    /**
     * Create an instance of {@link AdGroupPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AdGroupPerformanceReportRequest }
     */
    public AdGroupPerformanceReportRequest createAdGroupPerformanceReportRequest() {
        return new AdGroupPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdGroupPerformanceReportColumn }
     */
    public ArrayOfAdGroupPerformanceReportColumn createArrayOfAdGroupPerformanceReportColumn() {
        return new ArrayOfAdGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AdGroupPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AdGroupPerformanceReportFilter }
     */
    public AdGroupPerformanceReportFilter createAdGroupPerformanceReportFilter() {
        return new AdGroupPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AdPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AdPerformanceReportRequest }
     */
    public AdPerformanceReportRequest createAdPerformanceReportRequest() {
        return new AdPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdPerformanceReportColumn }
     */
    public ArrayOfAdPerformanceReportColumn createArrayOfAdPerformanceReportColumn() {
        return new ArrayOfAdPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AdPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AdPerformanceReportFilter }
     */
    public AdPerformanceReportFilter createAdPerformanceReportFilter() {
        return new AdPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link KeywordPerformanceReportRequest }
     */
    public KeywordPerformanceReportRequest createKeywordPerformanceReportRequest() {
        return new KeywordPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeywordPerformanceReportColumn }
     */
    public ArrayOfKeywordPerformanceReportColumn createArrayOfKeywordPerformanceReportColumn() {
        return new ArrayOfKeywordPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link KeywordPerformanceReportFilter }
     */
    public KeywordPerformanceReportFilter createKeywordPerformanceReportFilter() {
        return new KeywordPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordPerformanceReportSort }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeywordPerformanceReportSort }
     */
    public ArrayOfKeywordPerformanceReportSort createArrayOfKeywordPerformanceReportSort() {
        return new ArrayOfKeywordPerformanceReportSort();
    }

    /**
     * Create an instance of {@link KeywordPerformanceReportSort }
     * 
     * @return
     *     the new instance of {@link KeywordPerformanceReportSort }
     */
    public KeywordPerformanceReportSort createKeywordPerformanceReportSort() {
        return new KeywordPerformanceReportSort();
    }

    /**
     * Create an instance of {@link DestinationUrlPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link DestinationUrlPerformanceReportRequest }
     */
    public DestinationUrlPerformanceReportRequest createDestinationUrlPerformanceReportRequest() {
        return new DestinationUrlPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDestinationUrlPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfDestinationUrlPerformanceReportColumn }
     */
    public ArrayOfDestinationUrlPerformanceReportColumn createArrayOfDestinationUrlPerformanceReportColumn() {
        return new ArrayOfDestinationUrlPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DestinationUrlPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link DestinationUrlPerformanceReportFilter }
     */
    public DestinationUrlPerformanceReportFilter createDestinationUrlPerformanceReportFilter() {
        return new DestinationUrlPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link BudgetSummaryReportRequest }
     * 
     * @return
     *     the new instance of {@link BudgetSummaryReportRequest }
     */
    public BudgetSummaryReportRequest createBudgetSummaryReportRequest() {
        return new BudgetSummaryReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetSummaryReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfBudgetSummaryReportColumn }
     */
    public ArrayOfBudgetSummaryReportColumn createArrayOfBudgetSummaryReportColumn() {
        return new ArrayOfBudgetSummaryReportColumn();
    }

    /**
     * Create an instance of {@link AgeGenderAudienceReportRequest }
     * 
     * @return
     *     the new instance of {@link AgeGenderAudienceReportRequest }
     */
    public AgeGenderAudienceReportRequest createAgeGenderAudienceReportRequest() {
        return new AgeGenderAudienceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAgeGenderAudienceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAgeGenderAudienceReportColumn }
     */
    public ArrayOfAgeGenderAudienceReportColumn createArrayOfAgeGenderAudienceReportColumn() {
        return new ArrayOfAgeGenderAudienceReportColumn();
    }

    /**
     * Create an instance of {@link AgeGenderAudienceReportFilter }
     * 
     * @return
     *     the new instance of {@link AgeGenderAudienceReportFilter }
     */
    public AgeGenderAudienceReportFilter createAgeGenderAudienceReportFilter() {
        return new AgeGenderAudienceReportFilter();
    }

    /**
     * Create an instance of {@link ProfessionalDemographicsAudienceReportRequest }
     * 
     * @return
     *     the new instance of {@link ProfessionalDemographicsAudienceReportRequest }
     */
    public ProfessionalDemographicsAudienceReportRequest createProfessionalDemographicsAudienceReportRequest() {
        return new ProfessionalDemographicsAudienceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProfessionalDemographicsAudienceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProfessionalDemographicsAudienceReportColumn }
     */
    public ArrayOfProfessionalDemographicsAudienceReportColumn createArrayOfProfessionalDemographicsAudienceReportColumn() {
        return new ArrayOfProfessionalDemographicsAudienceReportColumn();
    }

    /**
     * Create an instance of {@link ProfessionalDemographicsAudienceReportFilter }
     * 
     * @return
     *     the new instance of {@link ProfessionalDemographicsAudienceReportFilter }
     */
    public ProfessionalDemographicsAudienceReportFilter createProfessionalDemographicsAudienceReportFilter() {
        return new ProfessionalDemographicsAudienceReportFilter();
    }

    /**
     * Create an instance of {@link UserLocationPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link UserLocationPerformanceReportRequest }
     */
    public UserLocationPerformanceReportRequest createUserLocationPerformanceReportRequest() {
        return new UserLocationPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfUserLocationPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfUserLocationPerformanceReportColumn }
     */
    public ArrayOfUserLocationPerformanceReportColumn createArrayOfUserLocationPerformanceReportColumn() {
        return new ArrayOfUserLocationPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link UserLocationPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link UserLocationPerformanceReportFilter }
     */
    public UserLocationPerformanceReportFilter createUserLocationPerformanceReportFilter() {
        return new UserLocationPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link PublisherUsagePerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link PublisherUsagePerformanceReportRequest }
     */
    public PublisherUsagePerformanceReportRequest createPublisherUsagePerformanceReportRequest() {
        return new PublisherUsagePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPublisherUsagePerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfPublisherUsagePerformanceReportColumn }
     */
    public ArrayOfPublisherUsagePerformanceReportColumn createArrayOfPublisherUsagePerformanceReportColumn() {
        return new ArrayOfPublisherUsagePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link PublisherUsagePerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link PublisherUsagePerformanceReportFilter }
     */
    public PublisherUsagePerformanceReportFilter createPublisherUsagePerformanceReportFilter() {
        return new PublisherUsagePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link SearchQueryPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link SearchQueryPerformanceReportRequest }
     */
    public SearchQueryPerformanceReportRequest createSearchQueryPerformanceReportRequest() {
        return new SearchQueryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSearchQueryPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfSearchQueryPerformanceReportColumn }
     */
    public ArrayOfSearchQueryPerformanceReportColumn createArrayOfSearchQueryPerformanceReportColumn() {
        return new ArrayOfSearchQueryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link SearchQueryPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link SearchQueryPerformanceReportFilter }
     */
    public SearchQueryPerformanceReportFilter createSearchQueryPerformanceReportFilter() {
        return new SearchQueryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ConversionPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link ConversionPerformanceReportRequest }
     */
    public ConversionPerformanceReportRequest createConversionPerformanceReportRequest() {
        return new ConversionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfConversionPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfConversionPerformanceReportColumn }
     */
    public ArrayOfConversionPerformanceReportColumn createArrayOfConversionPerformanceReportColumn() {
        return new ArrayOfConversionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ConversionPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link ConversionPerformanceReportFilter }
     */
    public ConversionPerformanceReportFilter createConversionPerformanceReportFilter() {
        return new ConversionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link GoalsAndFunnelsReportRequest }
     * 
     * @return
     *     the new instance of {@link GoalsAndFunnelsReportRequest }
     */
    public GoalsAndFunnelsReportRequest createGoalsAndFunnelsReportRequest() {
        return new GoalsAndFunnelsReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGoalsAndFunnelsReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfGoalsAndFunnelsReportColumn }
     */
    public ArrayOfGoalsAndFunnelsReportColumn createArrayOfGoalsAndFunnelsReportColumn() {
        return new ArrayOfGoalsAndFunnelsReportColumn();
    }

    /**
     * Create an instance of {@link GoalsAndFunnelsReportFilter }
     * 
     * @return
     *     the new instance of {@link GoalsAndFunnelsReportFilter }
     */
    public GoalsAndFunnelsReportFilter createGoalsAndFunnelsReportFilter() {
        return new GoalsAndFunnelsReportFilter();
    }

    /**
     * Create an instance of {@link NegativeKeywordConflictReportRequest }
     * 
     * @return
     *     the new instance of {@link NegativeKeywordConflictReportRequest }
     */
    public NegativeKeywordConflictReportRequest createNegativeKeywordConflictReportRequest() {
        return new NegativeKeywordConflictReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfNegativeKeywordConflictReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfNegativeKeywordConflictReportColumn }
     */
    public ArrayOfNegativeKeywordConflictReportColumn createArrayOfNegativeKeywordConflictReportColumn() {
        return new ArrayOfNegativeKeywordConflictReportColumn();
    }

    /**
     * Create an instance of {@link NegativeKeywordConflictReportFilter }
     * 
     * @return
     *     the new instance of {@link NegativeKeywordConflictReportFilter }
     */
    public NegativeKeywordConflictReportFilter createNegativeKeywordConflictReportFilter() {
        return new NegativeKeywordConflictReportFilter();
    }

    /**
     * Create an instance of {@link SearchCampaignChangeHistoryReportRequest }
     * 
     * @return
     *     the new instance of {@link SearchCampaignChangeHistoryReportRequest }
     */
    public SearchCampaignChangeHistoryReportRequest createSearchCampaignChangeHistoryReportRequest() {
        return new SearchCampaignChangeHistoryReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSearchCampaignChangeHistoryReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfSearchCampaignChangeHistoryReportColumn }
     */
    public ArrayOfSearchCampaignChangeHistoryReportColumn createArrayOfSearchCampaignChangeHistoryReportColumn() {
        return new ArrayOfSearchCampaignChangeHistoryReportColumn();
    }

    /**
     * Create an instance of {@link SearchCampaignChangeHistoryReportFilter }
     * 
     * @return
     *     the new instance of {@link SearchCampaignChangeHistoryReportFilter }
     */
    public SearchCampaignChangeHistoryReportFilter createSearchCampaignChangeHistoryReportFilter() {
        return new SearchCampaignChangeHistoryReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionByAdReportRequest }
     * 
     * @return
     *     the new instance of {@link AdExtensionByAdReportRequest }
     */
    public AdExtensionByAdReportRequest createAdExtensionByAdReportRequest() {
        return new AdExtensionByAdReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionByAdReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionByAdReportColumn }
     */
    public ArrayOfAdExtensionByAdReportColumn createArrayOfAdExtensionByAdReportColumn() {
        return new ArrayOfAdExtensionByAdReportColumn();
    }

    /**
     * Create an instance of {@link AdExtensionByAdReportFilter }
     * 
     * @return
     *     the new instance of {@link AdExtensionByAdReportFilter }
     */
    public AdExtensionByAdReportFilter createAdExtensionByAdReportFilter() {
        return new AdExtensionByAdReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionByKeywordReportRequest }
     * 
     * @return
     *     the new instance of {@link AdExtensionByKeywordReportRequest }
     */
    public AdExtensionByKeywordReportRequest createAdExtensionByKeywordReportRequest() {
        return new AdExtensionByKeywordReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionByKeywordReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionByKeywordReportColumn }
     */
    public ArrayOfAdExtensionByKeywordReportColumn createArrayOfAdExtensionByKeywordReportColumn() {
        return new ArrayOfAdExtensionByKeywordReportColumn();
    }

    /**
     * Create an instance of {@link AdExtensionByKeywordReportFilter }
     * 
     * @return
     *     the new instance of {@link AdExtensionByKeywordReportFilter }
     */
    public AdExtensionByKeywordReportFilter createAdExtensionByKeywordReportFilter() {
        return new AdExtensionByKeywordReportFilter();
    }

    /**
     * Create an instance of {@link AudiencePerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AudiencePerformanceReportRequest }
     */
    public AudiencePerformanceReportRequest createAudiencePerformanceReportRequest() {
        return new AudiencePerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAudiencePerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAudiencePerformanceReportColumn }
     */
    public ArrayOfAudiencePerformanceReportColumn createArrayOfAudiencePerformanceReportColumn() {
        return new ArrayOfAudiencePerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AudiencePerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AudiencePerformanceReportFilter }
     */
    public AudiencePerformanceReportFilter createAudiencePerformanceReportFilter() {
        return new AudiencePerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AdExtensionDetailReportRequest }
     * 
     * @return
     *     the new instance of {@link AdExtensionDetailReportRequest }
     */
    public AdExtensionDetailReportRequest createAdExtensionDetailReportRequest() {
        return new AdExtensionDetailReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdExtensionDetailReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdExtensionDetailReportColumn }
     */
    public ArrayOfAdExtensionDetailReportColumn createArrayOfAdExtensionDetailReportColumn() {
        return new ArrayOfAdExtensionDetailReportColumn();
    }

    /**
     * Create an instance of {@link AdExtensionDetailReportFilter }
     * 
     * @return
     *     the new instance of {@link AdExtensionDetailReportFilter }
     */
    public AdExtensionDetailReportFilter createAdExtensionDetailReportFilter() {
        return new AdExtensionDetailReportFilter();
    }

    /**
     * Create an instance of {@link ShareOfVoiceReportRequest }
     * 
     * @return
     *     the new instance of {@link ShareOfVoiceReportRequest }
     */
    public ShareOfVoiceReportRequest createShareOfVoiceReportRequest() {
        return new ShareOfVoiceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfShareOfVoiceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfShareOfVoiceReportColumn }
     */
    public ArrayOfShareOfVoiceReportColumn createArrayOfShareOfVoiceReportColumn() {
        return new ArrayOfShareOfVoiceReportColumn();
    }

    /**
     * Create an instance of {@link ShareOfVoiceReportFilter }
     * 
     * @return
     *     the new instance of {@link ShareOfVoiceReportFilter }
     */
    public ShareOfVoiceReportFilter createShareOfVoiceReportFilter() {
        return new ShareOfVoiceReportFilter();
    }

    /**
     * Create an instance of {@link ProductDimensionPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductDimensionPerformanceReportRequest }
     */
    public ProductDimensionPerformanceReportRequest createProductDimensionPerformanceReportRequest() {
        return new ProductDimensionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductDimensionPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductDimensionPerformanceReportColumn }
     */
    public ArrayOfProductDimensionPerformanceReportColumn createArrayOfProductDimensionPerformanceReportColumn() {
        return new ArrayOfProductDimensionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductDimensionPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link ProductDimensionPerformanceReportFilter }
     */
    public ProductDimensionPerformanceReportFilter createProductDimensionPerformanceReportFilter() {
        return new ProductDimensionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductPartitionPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductPartitionPerformanceReportRequest }
     */
    public ProductPartitionPerformanceReportRequest createProductPartitionPerformanceReportRequest() {
        return new ProductPartitionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductPartitionPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductPartitionPerformanceReportColumn }
     */
    public ArrayOfProductPartitionPerformanceReportColumn createArrayOfProductPartitionPerformanceReportColumn() {
        return new ArrayOfProductPartitionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductPartitionPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link ProductPartitionPerformanceReportFilter }
     */
    public ProductPartitionPerformanceReportFilter createProductPartitionPerformanceReportFilter() {
        return new ProductPartitionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductPartitionUnitPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductPartitionUnitPerformanceReportRequest }
     */
    public ProductPartitionUnitPerformanceReportRequest createProductPartitionUnitPerformanceReportRequest() {
        return new ProductPartitionUnitPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductPartitionUnitPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductPartitionUnitPerformanceReportColumn }
     */
    public ArrayOfProductPartitionUnitPerformanceReportColumn createArrayOfProductPartitionUnitPerformanceReportColumn() {
        return new ArrayOfProductPartitionUnitPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductPartitionUnitPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link ProductPartitionUnitPerformanceReportFilter }
     */
    public ProductPartitionUnitPerformanceReportFilter createProductPartitionUnitPerformanceReportFilter() {
        return new ProductPartitionUnitPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductSearchQueryPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductSearchQueryPerformanceReportRequest }
     */
    public ProductSearchQueryPerformanceReportRequest createProductSearchQueryPerformanceReportRequest() {
        return new ProductSearchQueryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductSearchQueryPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductSearchQueryPerformanceReportColumn }
     */
    public ArrayOfProductSearchQueryPerformanceReportColumn createArrayOfProductSearchQueryPerformanceReportColumn() {
        return new ArrayOfProductSearchQueryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link ProductSearchQueryPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link ProductSearchQueryPerformanceReportFilter }
     */
    public ProductSearchQueryPerformanceReportFilter createProductSearchQueryPerformanceReportFilter() {
        return new ProductSearchQueryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link ProductMatchCountReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductMatchCountReportRequest }
     */
    public ProductMatchCountReportRequest createProductMatchCountReportRequest() {
        return new ProductMatchCountReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductMatchCountReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductMatchCountReportColumn }
     */
    public ArrayOfProductMatchCountReportColumn createArrayOfProductMatchCountReportColumn() {
        return new ArrayOfProductMatchCountReportColumn();
    }

    /**
     * Create an instance of {@link ProductNegativeKeywordConflictReportRequest }
     * 
     * @return
     *     the new instance of {@link ProductNegativeKeywordConflictReportRequest }
     */
    public ProductNegativeKeywordConflictReportRequest createProductNegativeKeywordConflictReportRequest() {
        return new ProductNegativeKeywordConflictReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfProductNegativeKeywordConflictReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfProductNegativeKeywordConflictReportColumn }
     */
    public ArrayOfProductNegativeKeywordConflictReportColumn createArrayOfProductNegativeKeywordConflictReportColumn() {
        return new ArrayOfProductNegativeKeywordConflictReportColumn();
    }

    /**
     * Create an instance of {@link ProductNegativeKeywordConflictReportFilter }
     * 
     * @return
     *     the new instance of {@link ProductNegativeKeywordConflictReportFilter }
     */
    public ProductNegativeKeywordConflictReportFilter createProductNegativeKeywordConflictReportFilter() {
        return new ProductNegativeKeywordConflictReportFilter();
    }

    /**
     * Create an instance of {@link CallDetailReportRequest }
     * 
     * @return
     *     the new instance of {@link CallDetailReportRequest }
     */
    public CallDetailReportRequest createCallDetailReportRequest() {
        return new CallDetailReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCallDetailReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfCallDetailReportColumn }
     */
    public ArrayOfCallDetailReportColumn createArrayOfCallDetailReportColumn() {
        return new ArrayOfCallDetailReportColumn();
    }

    /**
     * Create an instance of {@link CallDetailReportFilter }
     * 
     * @return
     *     the new instance of {@link CallDetailReportFilter }
     */
    public CallDetailReportFilter createCallDetailReportFilter() {
        return new CallDetailReportFilter();
    }

    /**
     * Create an instance of {@link GeographicPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link GeographicPerformanceReportRequest }
     */
    public GeographicPerformanceReportRequest createGeographicPerformanceReportRequest() {
        return new GeographicPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfGeographicPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfGeographicPerformanceReportColumn }
     */
    public ArrayOfGeographicPerformanceReportColumn createArrayOfGeographicPerformanceReportColumn() {
        return new ArrayOfGeographicPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link GeographicPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link GeographicPerformanceReportFilter }
     */
    public GeographicPerformanceReportFilter createGeographicPerformanceReportFilter() {
        return new GeographicPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link DSASearchQueryPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link DSASearchQueryPerformanceReportRequest }
     */
    public DSASearchQueryPerformanceReportRequest createDSASearchQueryPerformanceReportRequest() {
        return new DSASearchQueryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDSASearchQueryPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfDSASearchQueryPerformanceReportColumn }
     */
    public ArrayOfDSASearchQueryPerformanceReportColumn createArrayOfDSASearchQueryPerformanceReportColumn() {
        return new ArrayOfDSASearchQueryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DSASearchQueryPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link DSASearchQueryPerformanceReportFilter }
     */
    public DSASearchQueryPerformanceReportFilter createDSASearchQueryPerformanceReportFilter() {
        return new DSASearchQueryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link DSAAutoTargetPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link DSAAutoTargetPerformanceReportRequest }
     */
    public DSAAutoTargetPerformanceReportRequest createDSAAutoTargetPerformanceReportRequest() {
        return new DSAAutoTargetPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDSAAutoTargetPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfDSAAutoTargetPerformanceReportColumn }
     */
    public ArrayOfDSAAutoTargetPerformanceReportColumn createArrayOfDSAAutoTargetPerformanceReportColumn() {
        return new ArrayOfDSAAutoTargetPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DSAAutoTargetPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link DSAAutoTargetPerformanceReportFilter }
     */
    public DSAAutoTargetPerformanceReportFilter createDSAAutoTargetPerformanceReportFilter() {
        return new DSAAutoTargetPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link DSACategoryPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link DSACategoryPerformanceReportRequest }
     */
    public DSACategoryPerformanceReportRequest createDSACategoryPerformanceReportRequest() {
        return new DSACategoryPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDSACategoryPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfDSACategoryPerformanceReportColumn }
     */
    public ArrayOfDSACategoryPerformanceReportColumn createArrayOfDSACategoryPerformanceReportColumn() {
        return new ArrayOfDSACategoryPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link DSACategoryPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link DSACategoryPerformanceReportFilter }
     */
    public DSACategoryPerformanceReportFilter createDSACategoryPerformanceReportFilter() {
        return new DSACategoryPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link HotelDimensionPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link HotelDimensionPerformanceReportRequest }
     */
    public HotelDimensionPerformanceReportRequest createHotelDimensionPerformanceReportRequest() {
        return new HotelDimensionPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDimensionPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfHotelDimensionPerformanceReportColumn }
     */
    public ArrayOfHotelDimensionPerformanceReportColumn createArrayOfHotelDimensionPerformanceReportColumn() {
        return new ArrayOfHotelDimensionPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link HotelDimensionPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link HotelDimensionPerformanceReportFilter }
     */
    public HotelDimensionPerformanceReportFilter createHotelDimensionPerformanceReportFilter() {
        return new HotelDimensionPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link HotelGroupPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link HotelGroupPerformanceReportRequest }
     */
    public HotelGroupPerformanceReportRequest createHotelGroupPerformanceReportRequest() {
        return new HotelGroupPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGroupPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfHotelGroupPerformanceReportColumn }
     */
    public ArrayOfHotelGroupPerformanceReportColumn createArrayOfHotelGroupPerformanceReportColumn() {
        return new ArrayOfHotelGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link HotelGroupPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link HotelGroupPerformanceReportFilter }
     */
    public HotelGroupPerformanceReportFilter createHotelGroupPerformanceReportFilter() {
        return new HotelGroupPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AssetGroupPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AssetGroupPerformanceReportRequest }
     */
    public AssetGroupPerformanceReportRequest createAssetGroupPerformanceReportRequest() {
        return new AssetGroupPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupPerformanceReportColumn }
     */
    public ArrayOfAssetGroupPerformanceReportColumn createArrayOfAssetGroupPerformanceReportColumn() {
        return new ArrayOfAssetGroupPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AssetGroupPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AssetGroupPerformanceReportFilter }
     */
    public AssetGroupPerformanceReportFilter createAssetGroupPerformanceReportFilter() {
        return new AssetGroupPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AccountThroughAssetGroupReportScope }
     * 
     * @return
     *     the new instance of {@link AccountThroughAssetGroupReportScope }
     */
    public AccountThroughAssetGroupReportScope createAccountThroughAssetGroupReportScope() {
        return new AccountThroughAssetGroupReportScope();
    }

    /**
     * Create an instance of {@link ArrayOfAssetGroupReportScope }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetGroupReportScope }
     */
    public ArrayOfAssetGroupReportScope createArrayOfAssetGroupReportScope() {
        return new ArrayOfAssetGroupReportScope();
    }

    /**
     * Create an instance of {@link AssetGroupReportScope }
     * 
     * @return
     *     the new instance of {@link AssetGroupReportScope }
     */
    public AssetGroupReportScope createAssetGroupReportScope() {
        return new AssetGroupReportScope();
    }

    /**
     * Create an instance of {@link SearchInsightPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link SearchInsightPerformanceReportRequest }
     */
    public SearchInsightPerformanceReportRequest createSearchInsightPerformanceReportRequest() {
        return new SearchInsightPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSearchInsightPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfSearchInsightPerformanceReportColumn }
     */
    public ArrayOfSearchInsightPerformanceReportColumn createArrayOfSearchInsightPerformanceReportColumn() {
        return new ArrayOfSearchInsightPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link SearchInsightPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link SearchInsightPerformanceReportFilter }
     */
    public SearchInsightPerformanceReportFilter createSearchInsightPerformanceReportFilter() {
        return new SearchInsightPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AssetPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AssetPerformanceReportRequest }
     */
    public AssetPerformanceReportRequest createAssetPerformanceReportRequest() {
        return new AssetPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAssetPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAssetPerformanceReportColumn }
     */
    public ArrayOfAssetPerformanceReportColumn createArrayOfAssetPerformanceReportColumn() {
        return new ArrayOfAssetPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link CategoryInsightsReportRequest }
     * 
     * @return
     *     the new instance of {@link CategoryInsightsReportRequest }
     */
    public CategoryInsightsReportRequest createCategoryInsightsReportRequest() {
        return new CategoryInsightsReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryInsightsReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfCategoryInsightsReportColumn }
     */
    public ArrayOfCategoryInsightsReportColumn createArrayOfCategoryInsightsReportColumn() {
        return new ArrayOfCategoryInsightsReportColumn();
    }

    /**
     * Create an instance of {@link CategoryInsightsReportFilter }
     * 
     * @return
     *     the new instance of {@link CategoryInsightsReportFilter }
     */
    public CategoryInsightsReportFilter createCategoryInsightsReportFilter() {
        return new CategoryInsightsReportFilter();
    }

    /**
     * Create an instance of {@link CategoryClickCoverageReportRequest }
     * 
     * @return
     *     the new instance of {@link CategoryClickCoverageReportRequest }
     */
    public CategoryClickCoverageReportRequest createCategoryClickCoverageReportRequest() {
        return new CategoryClickCoverageReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryClickCoverageReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfCategoryClickCoverageReportColumn }
     */
    public ArrayOfCategoryClickCoverageReportColumn createArrayOfCategoryClickCoverageReportColumn() {
        return new ArrayOfCategoryClickCoverageReportColumn();
    }

    /**
     * Create an instance of {@link CategoryClickCoverageReportFilter }
     * 
     * @return
     *     the new instance of {@link CategoryClickCoverageReportFilter }
     */
    public CategoryClickCoverageReportFilter createCategoryClickCoverageReportFilter() {
        return new CategoryClickCoverageReportFilter();
    }

    /**
     * Create an instance of {@link CombinationPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link CombinationPerformanceReportRequest }
     */
    public CombinationPerformanceReportRequest createCombinationPerformanceReportRequest() {
        return new CombinationPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCombinationPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfCombinationPerformanceReportColumn }
     */
    public ArrayOfCombinationPerformanceReportColumn createArrayOfCombinationPerformanceReportColumn() {
        return new ArrayOfCombinationPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link CombinationPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link CombinationPerformanceReportFilter }
     */
    public CombinationPerformanceReportFilter createCombinationPerformanceReportFilter() {
        return new CombinationPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link AppsPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link AppsPerformanceReportRequest }
     */
    public AppsPerformanceReportRequest createAppsPerformanceReportRequest() {
        return new AppsPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAppsPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfAppsPerformanceReportColumn }
     */
    public ArrayOfAppsPerformanceReportColumn createArrayOfAppsPerformanceReportColumn() {
        return new ArrayOfAppsPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link AppsPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link AppsPerformanceReportFilter }
     */
    public AppsPerformanceReportFilter createAppsPerformanceReportFilter() {
        return new AppsPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link FeedItemPerformanceReportRequest }
     * 
     * @return
     *     the new instance of {@link FeedItemPerformanceReportRequest }
     */
    public FeedItemPerformanceReportRequest createFeedItemPerformanceReportRequest() {
        return new FeedItemPerformanceReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfFeedItemPerformanceReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfFeedItemPerformanceReportColumn }
     */
    public ArrayOfFeedItemPerformanceReportColumn createArrayOfFeedItemPerformanceReportColumn() {
        return new ArrayOfFeedItemPerformanceReportColumn();
    }

    /**
     * Create an instance of {@link FeedItemPerformanceReportFilter }
     * 
     * @return
     *     the new instance of {@link FeedItemPerformanceReportFilter }
     */
    public FeedItemPerformanceReportFilter createFeedItemPerformanceReportFilter() {
        return new FeedItemPerformanceReportFilter();
    }

    /**
     * Create an instance of {@link TravelQueryInsightReportRequest }
     * 
     * @return
     *     the new instance of {@link TravelQueryInsightReportRequest }
     */
    public TravelQueryInsightReportRequest createTravelQueryInsightReportRequest() {
        return new TravelQueryInsightReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfTravelQueryInsightReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfTravelQueryInsightReportColumn }
     */
    public ArrayOfTravelQueryInsightReportColumn createArrayOfTravelQueryInsightReportColumn() {
        return new ArrayOfTravelQueryInsightReportColumn();
    }

    /**
     * Create an instance of {@link TravelQueryInsightReportFilter }
     * 
     * @return
     *     the new instance of {@link TravelQueryInsightReportFilter }
     */
    public TravelQueryInsightReportFilter createTravelQueryInsightReportFilter() {
        return new TravelQueryInsightReportFilter();
    }

    /**
     * Create an instance of {@link BidStrategyReportRequest }
     * 
     * @return
     *     the new instance of {@link BidStrategyReportRequest }
     */
    public BidStrategyReportRequest createBidStrategyReportRequest() {
        return new BidStrategyReportRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBidStrategyReportColumn }
     * 
     * @return
     *     the new instance of {@link ArrayOfBidStrategyReportColumn }
     */
    public ArrayOfBidStrategyReportColumn createArrayOfBidStrategyReportColumn() {
        return new ArrayOfBidStrategyReportColumn();
    }

    /**
     * Create an instance of {@link BidStrategyReportFilter }
     * 
     * @return
     *     the new instance of {@link BidStrategyReportFilter }
     */
    public BidStrategyReportFilter createBidStrategyReportFilter() {
        return new BidStrategyReportFilter();
    }

    /**
     * Create an instance of {@link SubmitGenerateReportResponse }
     * 
     * @return
     *     the new instance of {@link SubmitGenerateReportResponse }
     */
    public SubmitGenerateReportResponse createSubmitGenerateReportResponse() {
        return new SubmitGenerateReportResponse();
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
     * Create an instance of {@link PollGenerateReportRequest }
     * 
     * @return
     *     the new instance of {@link PollGenerateReportRequest }
     */
    public PollGenerateReportRequest createPollGenerateReportRequest() {
        return new PollGenerateReportRequest();
    }

    /**
     * Create an instance of {@link PollGenerateReportResponse }
     * 
     * @return
     *     the new instance of {@link PollGenerateReportResponse }
     */
    public PollGenerateReportResponse createPollGenerateReportResponse() {
        return new PollGenerateReportResponse();
    }

    /**
     * Create an instance of {@link ReportRequestStatus }
     * 
     * @return
     *     the new instance of {@link ReportRequestStatus }
     */
    public ReportRequestStatus createReportRequestStatus() {
        return new ReportRequestStatus();
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
     * Create an instance of {@link ArrayOflong }
     * 
     * @return
     *     the new instance of {@link ArrayOflong }
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     * @return
     *     the new instance of {@link ArrayOfint }
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequest")
    public JAXBElement<ReportRequest> createReportRequest(ReportRequest value) {
        return new JAXBElement<>(_ReportRequest_QNAME, ReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportFormat }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportFormat")
    public JAXBElement<ReportFormat> createReportFormat(ReportFormat value) {
        return new JAXBElement<>(_ReportFormat_QNAME, ReportFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportRequest")
    public JAXBElement<AccountPerformanceReportRequest> createAccountPerformanceReportRequest(AccountPerformanceReportRequest value) {
        return new JAXBElement<>(_AccountPerformanceReportRequest_QNAME, AccountPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportAggregation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportAggregation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportAggregation")
    public JAXBElement<ReportAggregation> createReportAggregation(ReportAggregation value) {
        return new JAXBElement<>(_ReportAggregation_QNAME, ReportAggregation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAccountPerformanceReportColumn")
    public JAXBElement<ArrayOfAccountPerformanceReportColumn> createArrayOfAccountPerformanceReportColumn(ArrayOfAccountPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAccountPerformanceReportColumn_QNAME, ArrayOfAccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportColumn")
    public JAXBElement<AccountPerformanceReportColumn> createAccountPerformanceReportColumn(AccountPerformanceReportColumn value) {
        return new JAXBElement<>(_AccountPerformanceReportColumn_QNAME, AccountPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountPerformanceReportFilter")
    public JAXBElement<AccountPerformanceReportFilter> createAccountPerformanceReportFilter(AccountPerformanceReportFilter value) {
        return new JAXBElement<>(_AccountPerformanceReportFilter_QNAME, AccountPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AccountStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AccountStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AccountStatusReportFilter>> createAccountStatusReportFilter(Collection<AccountStatusReportFilter> value) {
        return new JAXBElement<>(_AccountStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdDistributionReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdDistributionReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDistributionReportFilter")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<AdDistributionReportFilter>> createAdDistributionReportFilter(Collection<AdDistributionReportFilter> value) {
        return new JAXBElement<>(_AdDistributionReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceOSReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceOSReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeviceOSReportFilter")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<DeviceOSReportFilter>> createDeviceOSReportFilter(Collection<DeviceOSReportFilter> value) {
        return new JAXBElement<>(_DeviceOSReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeviceTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeviceTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Collection<DeviceTypeReportFilter>> createDeviceTypeReportFilter(Collection<DeviceTypeReportFilter> value) {
        return new JAXBElement<>(_DeviceTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountReportScope")
    public JAXBElement<AccountReportScope> createAccountReportScope(AccountReportScope value) {
        return new JAXBElement<>(_AccountReportScope_QNAME, AccountReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportTime }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTime")
    public JAXBElement<ReportTime> createReportTime(ReportTime value) {
        return new JAXBElement<>(_ReportTime_QNAME, ReportTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Date }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "Date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTimePeriod }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportTimePeriod }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTimePeriod")
    public JAXBElement<ReportTimePeriod> createReportTimePeriod(ReportTimePeriod value) {
        return new JAXBElement<>(_ReportTimePeriod_QNAME, ReportTimePeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTimeZone }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportTimeZone }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportTimeZone")
    public JAXBElement<ReportTimeZone> createReportTimeZone(ReportTimeZone value) {
        return new JAXBElement<>(_ReportTimeZone_QNAME, ReportTimeZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportRequest")
    public JAXBElement<CampaignPerformanceReportRequest> createCampaignPerformanceReportRequest(CampaignPerformanceReportRequest value) {
        return new JAXBElement<>(_CampaignPerformanceReportRequest_QNAME, CampaignPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCampaignPerformanceReportColumn")
    public JAXBElement<ArrayOfCampaignPerformanceReportColumn> createArrayOfCampaignPerformanceReportColumn(ArrayOfCampaignPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfCampaignPerformanceReportColumn_QNAME, ArrayOfCampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportColumn")
    public JAXBElement<CampaignPerformanceReportColumn> createCampaignPerformanceReportColumn(CampaignPerformanceReportColumn value) {
        return new JAXBElement<>(_CampaignPerformanceReportColumn_QNAME, CampaignPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignPerformanceReportFilter")
    public JAXBElement<CampaignPerformanceReportFilter> createCampaignPerformanceReportFilter(CampaignPerformanceReportFilter value) {
        return new JAXBElement<>(_CampaignPerformanceReportFilter_QNAME, CampaignPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Collection<CampaignStatusReportFilter>> createCampaignStatusReportFilter(Collection<CampaignStatusReportFilter> value) {
        return new JAXBElement<>(_CampaignStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughCampaignReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountThroughCampaignReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountThroughCampaignReportScope")
    public JAXBElement<AccountThroughCampaignReportScope> createAccountThroughCampaignReportScope(AccountThroughCampaignReportScope value) {
        return new JAXBElement<>(_AccountThroughCampaignReportScope_QNAME, AccountThroughCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCampaignReportScope")
    public JAXBElement<ArrayOfCampaignReportScope> createArrayOfCampaignReportScope(ArrayOfCampaignReportScope value) {
        return new JAXBElement<>(_ArrayOfCampaignReportScope_QNAME, ArrayOfCampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignReportScope")
    public JAXBElement<CampaignReportScope> createCampaignReportScope(CampaignReportScope value) {
        return new JAXBElement<>(_CampaignReportScope_QNAME, CampaignReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportRequest")
    public JAXBElement<AdDynamicTextPerformanceReportRequest> createAdDynamicTextPerformanceReportRequest(AdDynamicTextPerformanceReportRequest value) {
        return new JAXBElement<>(_AdDynamicTextPerformanceReportRequest_QNAME, AdDynamicTextPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdDynamicTextPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdDynamicTextPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdDynamicTextPerformanceReportColumn")
    public JAXBElement<ArrayOfAdDynamicTextPerformanceReportColumn> createArrayOfAdDynamicTextPerformanceReportColumn(ArrayOfAdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdDynamicTextPerformanceReportColumn_QNAME, ArrayOfAdDynamicTextPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportColumn")
    public JAXBElement<AdDynamicTextPerformanceReportColumn> createAdDynamicTextPerformanceReportColumn(AdDynamicTextPerformanceReportColumn value) {
        return new JAXBElement<>(_AdDynamicTextPerformanceReportColumn_QNAME, AdDynamicTextPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdDynamicTextPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdDynamicTextPerformanceReportFilter")
    public JAXBElement<AdDynamicTextPerformanceReportFilter> createAdDynamicTextPerformanceReportFilter(AdDynamicTextPerformanceReportFilter value) {
        return new JAXBElement<>(_AdDynamicTextPerformanceReportFilter_QNAME, AdDynamicTextPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdGroupStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Collection<AdGroupStatusReportFilter>> createAdGroupStatusReportFilter(Collection<AdGroupStatusReportFilter> value) {
        return new JAXBElement<>(_AdGroupStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Collection<AdStatusReportFilter>> createAdStatusReportFilter(Collection<AdStatusReportFilter> value) {
        return new JAXBElement<>(_AdStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AdTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Collection<AdTypeReportFilter>> createAdTypeReportFilter(Collection<AdTypeReportFilter> value) {
        return new JAXBElement<>(_AdTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Collection<KeywordStatusReportFilter>> createKeywordStatusReportFilter(Collection<KeywordStatusReportFilter> value) {
        return new JAXBElement<>(_KeywordStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link LanguageReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link LanguageReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "LanguageReportFilter")
    @XmlJavaTypeAdapter(Adapter11 .class)
    public JAXBElement<Collection<LanguageReportFilter>> createLanguageReportFilter(Collection<LanguageReportFilter> value) {
        return new JAXBElement<>(_LanguageReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughAdGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountThroughAdGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountThroughAdGroupReportScope")
    public JAXBElement<AccountThroughAdGroupReportScope> createAccountThroughAdGroupReportScope(AccountThroughAdGroupReportScope value) {
        return new JAXBElement<>(_AccountThroughAdGroupReportScope_QNAME, AccountThroughAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdGroupReportScope")
    public JAXBElement<ArrayOfAdGroupReportScope> createArrayOfAdGroupReportScope(ArrayOfAdGroupReportScope value) {
        return new JAXBElement<>(_ArrayOfAdGroupReportScope_QNAME, ArrayOfAdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupReportScope")
    public JAXBElement<AdGroupReportScope> createAdGroupReportScope(AdGroupReportScope value) {
        return new JAXBElement<>(_AdGroupReportScope_QNAME, AdGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportRequest")
    public JAXBElement<AdGroupPerformanceReportRequest> createAdGroupPerformanceReportRequest(AdGroupPerformanceReportRequest value) {
        return new JAXBElement<>(_AdGroupPerformanceReportRequest_QNAME, AdGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfAdGroupPerformanceReportColumn> createArrayOfAdGroupPerformanceReportColumn(ArrayOfAdGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdGroupPerformanceReportColumn_QNAME, ArrayOfAdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportColumn")
    public JAXBElement<AdGroupPerformanceReportColumn> createAdGroupPerformanceReportColumn(AdGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_AdGroupPerformanceReportColumn_QNAME, AdGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdGroupPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdGroupPerformanceReportFilter")
    public JAXBElement<AdGroupPerformanceReportFilter> createAdGroupPerformanceReportFilter(AdGroupPerformanceReportFilter value) {
        return new JAXBElement<>(_AdGroupPerformanceReportFilter_QNAME, AdGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportRequest")
    public JAXBElement<AdPerformanceReportRequest> createAdPerformanceReportRequest(AdPerformanceReportRequest value) {
        return new JAXBElement<>(_AdPerformanceReportRequest_QNAME, AdPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdPerformanceReportColumn")
    public JAXBElement<ArrayOfAdPerformanceReportColumn> createArrayOfAdPerformanceReportColumn(ArrayOfAdPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdPerformanceReportColumn_QNAME, ArrayOfAdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportColumn")
    public JAXBElement<AdPerformanceReportColumn> createAdPerformanceReportColumn(AdPerformanceReportColumn value) {
        return new JAXBElement<>(_AdPerformanceReportColumn_QNAME, AdPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdPerformanceReportFilter")
    public JAXBElement<AdPerformanceReportFilter> createAdPerformanceReportFilter(AdPerformanceReportFilter value) {
        return new JAXBElement<>(_AdPerformanceReportFilter_QNAME, AdPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportRequest")
    public JAXBElement<KeywordPerformanceReportRequest> createKeywordPerformanceReportRequest(KeywordPerformanceReportRequest value) {
        return new JAXBElement<>(_KeywordPerformanceReportRequest_QNAME, KeywordPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfKeywordPerformanceReportColumn")
    public JAXBElement<ArrayOfKeywordPerformanceReportColumn> createArrayOfKeywordPerformanceReportColumn(ArrayOfKeywordPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfKeywordPerformanceReportColumn_QNAME, ArrayOfKeywordPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportColumn")
    public JAXBElement<KeywordPerformanceReportColumn> createKeywordPerformanceReportColumn(KeywordPerformanceReportColumn value) {
        return new JAXBElement<>(_KeywordPerformanceReportColumn_QNAME, KeywordPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportFilter")
    public JAXBElement<KeywordPerformanceReportFilter> createKeywordPerformanceReportFilter(KeywordPerformanceReportFilter value) {
        return new JAXBElement<>(_KeywordPerformanceReportFilter_QNAME, KeywordPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidMatchTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidMatchTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<Collection<BidMatchTypeReportFilter>> createBidMatchTypeReportFilter(Collection<BidMatchTypeReportFilter> value) {
        return new JAXBElement<>(_BidMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidStrategyTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidStrategyTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidStrategyTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter13 .class)
    public JAXBElement<Collection<BidStrategyTypeReportFilter>> createBidStrategyTypeReportFilter(Collection<BidStrategyTypeReportFilter> value) {
        return new JAXBElement<>(_BidStrategyTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeliveredMatchTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DeliveredMatchTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeliveredMatchTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter14 .class)
    public JAXBElement<Collection<DeliveredMatchTypeReportFilter>> createDeliveredMatchTypeReportFilter(Collection<DeliveredMatchTypeReportFilter> value) {
        return new JAXBElement<>(_DeliveredMatchTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportSort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordPerformanceReportSort }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfKeywordPerformanceReportSort")
    public JAXBElement<ArrayOfKeywordPerformanceReportSort> createArrayOfKeywordPerformanceReportSort(ArrayOfKeywordPerformanceReportSort value) {
        return new JAXBElement<>(_ArrayOfKeywordPerformanceReportSort_QNAME, ArrayOfKeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportSort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeywordPerformanceReportSort }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "KeywordPerformanceReportSort")
    public JAXBElement<KeywordPerformanceReportSort> createKeywordPerformanceReportSort(KeywordPerformanceReportSort value) {
        return new JAXBElement<>(_KeywordPerformanceReportSort_QNAME, KeywordPerformanceReportSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportRequest")
    public JAXBElement<DestinationUrlPerformanceReportRequest> createDestinationUrlPerformanceReportRequest(DestinationUrlPerformanceReportRequest value) {
        return new JAXBElement<>(_DestinationUrlPerformanceReportRequest_QNAME, DestinationUrlPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinationUrlPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinationUrlPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDestinationUrlPerformanceReportColumn")
    public JAXBElement<ArrayOfDestinationUrlPerformanceReportColumn> createArrayOfDestinationUrlPerformanceReportColumn(ArrayOfDestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfDestinationUrlPerformanceReportColumn_QNAME, ArrayOfDestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportColumn")
    public JAXBElement<DestinationUrlPerformanceReportColumn> createDestinationUrlPerformanceReportColumn(DestinationUrlPerformanceReportColumn value) {
        return new JAXBElement<>(_DestinationUrlPerformanceReportColumn_QNAME, DestinationUrlPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DestinationUrlPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DestinationUrlPerformanceReportFilter")
    public JAXBElement<DestinationUrlPerformanceReportFilter> createDestinationUrlPerformanceReportFilter(DestinationUrlPerformanceReportFilter value) {
        return new JAXBElement<>(_DestinationUrlPerformanceReportFilter_QNAME, DestinationUrlPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BudgetSummaryReportRequest")
    public JAXBElement<BudgetSummaryReportRequest> createBudgetSummaryReportRequest(BudgetSummaryReportRequest value) {
        return new JAXBElement<>(_BudgetSummaryReportRequest_QNAME, BudgetSummaryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetSummaryReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetSummaryReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfBudgetSummaryReportColumn")
    public JAXBElement<ArrayOfBudgetSummaryReportColumn> createArrayOfBudgetSummaryReportColumn(ArrayOfBudgetSummaryReportColumn value) {
        return new JAXBElement<>(_ArrayOfBudgetSummaryReportColumn_QNAME, ArrayOfBudgetSummaryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BudgetSummaryReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BudgetSummaryReportColumn")
    public JAXBElement<BudgetSummaryReportColumn> createBudgetSummaryReportColumn(BudgetSummaryReportColumn value) {
        return new JAXBElement<>(_BudgetSummaryReportColumn_QNAME, BudgetSummaryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportRequest")
    public JAXBElement<AgeGenderAudienceReportRequest> createAgeGenderAudienceReportRequest(AgeGenderAudienceReportRequest value) {
        return new JAXBElement<>(_AgeGenderAudienceReportRequest_QNAME, AgeGenderAudienceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeGenderAudienceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAgeGenderAudienceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAgeGenderAudienceReportColumn")
    public JAXBElement<ArrayOfAgeGenderAudienceReportColumn> createArrayOfAgeGenderAudienceReportColumn(ArrayOfAgeGenderAudienceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAgeGenderAudienceReportColumn_QNAME, ArrayOfAgeGenderAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportColumn")
    public JAXBElement<AgeGenderAudienceReportColumn> createAgeGenderAudienceReportColumn(AgeGenderAudienceReportColumn value) {
        return new JAXBElement<>(_AgeGenderAudienceReportColumn_QNAME, AgeGenderAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgeGenderAudienceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AgeGenderAudienceReportFilter")
    public JAXBElement<AgeGenderAudienceReportFilter> createAgeGenderAudienceReportFilter(AgeGenderAudienceReportFilter value) {
        return new JAXBElement<>(_AgeGenderAudienceReportFilter_QNAME, AgeGenderAudienceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportRequest")
    public JAXBElement<ProfessionalDemographicsAudienceReportRequest> createProfessionalDemographicsAudienceReportRequest(ProfessionalDemographicsAudienceReportRequest value) {
        return new JAXBElement<>(_ProfessionalDemographicsAudienceReportRequest_QNAME, ProfessionalDemographicsAudienceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionalDemographicsAudienceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionalDemographicsAudienceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProfessionalDemographicsAudienceReportColumn")
    public JAXBElement<ArrayOfProfessionalDemographicsAudienceReportColumn> createArrayOfProfessionalDemographicsAudienceReportColumn(ArrayOfProfessionalDemographicsAudienceReportColumn value) {
        return new JAXBElement<>(_ArrayOfProfessionalDemographicsAudienceReportColumn_QNAME, ArrayOfProfessionalDemographicsAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportColumn")
    public JAXBElement<ProfessionalDemographicsAudienceReportColumn> createProfessionalDemographicsAudienceReportColumn(ProfessionalDemographicsAudienceReportColumn value) {
        return new JAXBElement<>(_ProfessionalDemographicsAudienceReportColumn_QNAME, ProfessionalDemographicsAudienceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfessionalDemographicsAudienceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProfessionalDemographicsAudienceReportFilter")
    public JAXBElement<ProfessionalDemographicsAudienceReportFilter> createProfessionalDemographicsAudienceReportFilter(ProfessionalDemographicsAudienceReportFilter value) {
        return new JAXBElement<>(_ProfessionalDemographicsAudienceReportFilter_QNAME, ProfessionalDemographicsAudienceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportRequest")
    public JAXBElement<UserLocationPerformanceReportRequest> createUserLocationPerformanceReportRequest(UserLocationPerformanceReportRequest value) {
        return new JAXBElement<>(_UserLocationPerformanceReportRequest_QNAME, UserLocationPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserLocationPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserLocationPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfUserLocationPerformanceReportColumn")
    public JAXBElement<ArrayOfUserLocationPerformanceReportColumn> createArrayOfUserLocationPerformanceReportColumn(ArrayOfUserLocationPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfUserLocationPerformanceReportColumn_QNAME, ArrayOfUserLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportColumn")
    public JAXBElement<UserLocationPerformanceReportColumn> createUserLocationPerformanceReportColumn(UserLocationPerformanceReportColumn value) {
        return new JAXBElement<>(_UserLocationPerformanceReportColumn_QNAME, UserLocationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserLocationPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserLocationPerformanceReportFilter")
    public JAXBElement<UserLocationPerformanceReportFilter> createUserLocationPerformanceReportFilter(UserLocationPerformanceReportFilter value) {
        return new JAXBElement<>(_UserLocationPerformanceReportFilter_QNAME, UserLocationPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportRequest")
    public JAXBElement<PublisherUsagePerformanceReportRequest> createPublisherUsagePerformanceReportRequest(PublisherUsagePerformanceReportRequest value) {
        return new JAXBElement<>(_PublisherUsagePerformanceReportRequest_QNAME, PublisherUsagePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPublisherUsagePerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPublisherUsagePerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfPublisherUsagePerformanceReportColumn")
    public JAXBElement<ArrayOfPublisherUsagePerformanceReportColumn> createArrayOfPublisherUsagePerformanceReportColumn(ArrayOfPublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfPublisherUsagePerformanceReportColumn_QNAME, ArrayOfPublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportColumn")
    public JAXBElement<PublisherUsagePerformanceReportColumn> createPublisherUsagePerformanceReportColumn(PublisherUsagePerformanceReportColumn value) {
        return new JAXBElement<>(_PublisherUsagePerformanceReportColumn_QNAME, PublisherUsagePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublisherUsagePerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "PublisherUsagePerformanceReportFilter")
    public JAXBElement<PublisherUsagePerformanceReportFilter> createPublisherUsagePerformanceReportFilter(PublisherUsagePerformanceReportFilter value) {
        return new JAXBElement<>(_PublisherUsagePerformanceReportFilter_QNAME, PublisherUsagePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AssetGroupStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AssetGroupStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetGroupStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter15 .class)
    public JAXBElement<Collection<AssetGroupStatusReportFilter>> createAssetGroupStatusReportFilter(Collection<AssetGroupStatusReportFilter> value) {
        return new JAXBElement<>(_AssetGroupStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportRequest")
    public JAXBElement<SearchQueryPerformanceReportRequest> createSearchQueryPerformanceReportRequest(SearchQueryPerformanceReportRequest value) {
        return new JAXBElement<>(_SearchQueryPerformanceReportRequest_QNAME, SearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfSearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfSearchQueryPerformanceReportColumn> createArrayOfSearchQueryPerformanceReportColumn(ArrayOfSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfSearchQueryPerformanceReportColumn_QNAME, ArrayOfSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportColumn")
    public JAXBElement<SearchQueryPerformanceReportColumn> createSearchQueryPerformanceReportColumn(SearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_SearchQueryPerformanceReportColumn_QNAME, SearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchQueryPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchQueryPerformanceReportFilter")
    public JAXBElement<SearchQueryPerformanceReportFilter> createSearchQueryPerformanceReportFilter(SearchQueryPerformanceReportFilter value) {
        return new JAXBElement<>(_SearchQueryPerformanceReportFilter_QNAME, SearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportRequest")
    public JAXBElement<ConversionPerformanceReportRequest> createConversionPerformanceReportRequest(ConversionPerformanceReportRequest value) {
        return new JAXBElement<>(_ConversionPerformanceReportRequest_QNAME, ConversionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConversionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfConversionPerformanceReportColumn")
    public JAXBElement<ArrayOfConversionPerformanceReportColumn> createArrayOfConversionPerformanceReportColumn(ArrayOfConversionPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfConversionPerformanceReportColumn_QNAME, ArrayOfConversionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportColumn")
    public JAXBElement<ConversionPerformanceReportColumn> createConversionPerformanceReportColumn(ConversionPerformanceReportColumn value) {
        return new JAXBElement<>(_ConversionPerformanceReportColumn_QNAME, ConversionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ConversionPerformanceReportFilter")
    public JAXBElement<ConversionPerformanceReportFilter> createConversionPerformanceReportFilter(ConversionPerformanceReportFilter value) {
        return new JAXBElement<>(_ConversionPerformanceReportFilter_QNAME, ConversionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportRequest")
    public JAXBElement<GoalsAndFunnelsReportRequest> createGoalsAndFunnelsReportRequest(GoalsAndFunnelsReportRequest value) {
        return new JAXBElement<>(_GoalsAndFunnelsReportRequest_QNAME, GoalsAndFunnelsReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGoalsAndFunnelsReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGoalsAndFunnelsReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfGoalsAndFunnelsReportColumn")
    public JAXBElement<ArrayOfGoalsAndFunnelsReportColumn> createArrayOfGoalsAndFunnelsReportColumn(ArrayOfGoalsAndFunnelsReportColumn value) {
        return new JAXBElement<>(_ArrayOfGoalsAndFunnelsReportColumn_QNAME, ArrayOfGoalsAndFunnelsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportColumn")
    public JAXBElement<GoalsAndFunnelsReportColumn> createGoalsAndFunnelsReportColumn(GoalsAndFunnelsReportColumn value) {
        return new JAXBElement<>(_GoalsAndFunnelsReportColumn_QNAME, GoalsAndFunnelsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoalsAndFunnelsReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GoalsAndFunnelsReportFilter")
    public JAXBElement<GoalsAndFunnelsReportFilter> createGoalsAndFunnelsReportFilter(GoalsAndFunnelsReportFilter value) {
        return new JAXBElement<>(_GoalsAndFunnelsReportFilter_QNAME, GoalsAndFunnelsReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportRequest")
    public JAXBElement<NegativeKeywordConflictReportRequest> createNegativeKeywordConflictReportRequest(NegativeKeywordConflictReportRequest value) {
        return new JAXBElement<>(_NegativeKeywordConflictReportRequest_QNAME, NegativeKeywordConflictReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeywordConflictReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeywordConflictReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfNegativeKeywordConflictReportColumn")
    public JAXBElement<ArrayOfNegativeKeywordConflictReportColumn> createArrayOfNegativeKeywordConflictReportColumn(ArrayOfNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<>(_ArrayOfNegativeKeywordConflictReportColumn_QNAME, ArrayOfNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportColumn")
    public JAXBElement<NegativeKeywordConflictReportColumn> createNegativeKeywordConflictReportColumn(NegativeKeywordConflictReportColumn value) {
        return new JAXBElement<>(_NegativeKeywordConflictReportColumn_QNAME, NegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegativeKeywordConflictReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "NegativeKeywordConflictReportFilter")
    public JAXBElement<NegativeKeywordConflictReportFilter> createNegativeKeywordConflictReportFilter(NegativeKeywordConflictReportFilter value) {
        return new JAXBElement<>(_NegativeKeywordConflictReportFilter_QNAME, NegativeKeywordConflictReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportRequest")
    public JAXBElement<SearchCampaignChangeHistoryReportRequest> createSearchCampaignChangeHistoryReportRequest(SearchCampaignChangeHistoryReportRequest value) {
        return new JAXBElement<>(_SearchCampaignChangeHistoryReportRequest_QNAME, SearchCampaignChangeHistoryReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCampaignChangeHistoryReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCampaignChangeHistoryReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfSearchCampaignChangeHistoryReportColumn")
    public JAXBElement<ArrayOfSearchCampaignChangeHistoryReportColumn> createArrayOfSearchCampaignChangeHistoryReportColumn(ArrayOfSearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<>(_ArrayOfSearchCampaignChangeHistoryReportColumn_QNAME, ArrayOfSearchCampaignChangeHistoryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportColumn")
    public JAXBElement<SearchCampaignChangeHistoryReportColumn> createSearchCampaignChangeHistoryReportColumn(SearchCampaignChangeHistoryReportColumn value) {
        return new JAXBElement<>(_SearchCampaignChangeHistoryReportColumn_QNAME, SearchCampaignChangeHistoryReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchCampaignChangeHistoryReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchCampaignChangeHistoryReportFilter")
    public JAXBElement<SearchCampaignChangeHistoryReportFilter> createSearchCampaignChangeHistoryReportFilter(SearchCampaignChangeHistoryReportFilter value) {
        return new JAXBElement<>(_SearchCampaignChangeHistoryReportFilter_QNAME, SearchCampaignChangeHistoryReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ChangeTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter16 .class)
    public JAXBElement<Collection<ChangeTypeReportFilter>> createChangeTypeReportFilter(Collection<ChangeTypeReportFilter> value) {
        return new JAXBElement<>(_ChangeTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeEntityReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link ChangeEntityReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ChangeEntityReportFilter")
    @XmlJavaTypeAdapter(Adapter17 .class)
    public JAXBElement<Collection<ChangeEntityReportFilter>> createChangeEntityReportFilter(Collection<ChangeEntityReportFilter> value) {
        return new JAXBElement<>(_ChangeEntityReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportRequest")
    public JAXBElement<AdExtensionByAdReportRequest> createAdExtensionByAdReportRequest(AdExtensionByAdReportRequest value) {
        return new JAXBElement<>(_AdExtensionByAdReportRequest_QNAME, AdExtensionByAdReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByAdReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByAdReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionByAdReportColumn")
    public JAXBElement<ArrayOfAdExtensionByAdReportColumn> createArrayOfAdExtensionByAdReportColumn(ArrayOfAdExtensionByAdReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdExtensionByAdReportColumn_QNAME, ArrayOfAdExtensionByAdReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportColumn")
    public JAXBElement<AdExtensionByAdReportColumn> createAdExtensionByAdReportColumn(AdExtensionByAdReportColumn value) {
        return new JAXBElement<>(_AdExtensionByAdReportColumn_QNAME, AdExtensionByAdReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByAdReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByAdReportFilter")
    public JAXBElement<AdExtensionByAdReportFilter> createAdExtensionByAdReportFilter(AdExtensionByAdReportFilter value) {
        return new JAXBElement<>(_AdExtensionByAdReportFilter_QNAME, AdExtensionByAdReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportRequest")
    public JAXBElement<AdExtensionByKeywordReportRequest> createAdExtensionByKeywordReportRequest(AdExtensionByKeywordReportRequest value) {
        return new JAXBElement<>(_AdExtensionByKeywordReportRequest_QNAME, AdExtensionByKeywordReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByKeywordReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionByKeywordReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionByKeywordReportColumn")
    public JAXBElement<ArrayOfAdExtensionByKeywordReportColumn> createArrayOfAdExtensionByKeywordReportColumn(ArrayOfAdExtensionByKeywordReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdExtensionByKeywordReportColumn_QNAME, ArrayOfAdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportColumn")
    public JAXBElement<AdExtensionByKeywordReportColumn> createAdExtensionByKeywordReportColumn(AdExtensionByKeywordReportColumn value) {
        return new JAXBElement<>(_AdExtensionByKeywordReportColumn_QNAME, AdExtensionByKeywordReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionByKeywordReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionByKeywordReportFilter")
    public JAXBElement<AdExtensionByKeywordReportFilter> createAdExtensionByKeywordReportFilter(AdExtensionByKeywordReportFilter value) {
        return new JAXBElement<>(_AdExtensionByKeywordReportFilter_QNAME, AdExtensionByKeywordReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportRequest")
    public JAXBElement<AudiencePerformanceReportRequest> createAudiencePerformanceReportRequest(AudiencePerformanceReportRequest value) {
        return new JAXBElement<>(_AudiencePerformanceReportRequest_QNAME, AudiencePerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAudiencePerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAudiencePerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAudiencePerformanceReportColumn")
    public JAXBElement<ArrayOfAudiencePerformanceReportColumn> createArrayOfAudiencePerformanceReportColumn(ArrayOfAudiencePerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAudiencePerformanceReportColumn_QNAME, ArrayOfAudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportColumn")
    public JAXBElement<AudiencePerformanceReportColumn> createAudiencePerformanceReportColumn(AudiencePerformanceReportColumn value) {
        return new JAXBElement<>(_AudiencePerformanceReportColumn_QNAME, AudiencePerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudiencePerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AudiencePerformanceReportFilter")
    public JAXBElement<AudiencePerformanceReportFilter> createAudiencePerformanceReportFilter(AudiencePerformanceReportFilter value) {
        return new JAXBElement<>(_AudiencePerformanceReportFilter_QNAME, AudiencePerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportRequest")
    public JAXBElement<AdExtensionDetailReportRequest> createAdExtensionDetailReportRequest(AdExtensionDetailReportRequest value) {
        return new JAXBElement<>(_AdExtensionDetailReportRequest_QNAME, AdExtensionDetailReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionDetailReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdExtensionDetailReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAdExtensionDetailReportColumn")
    public JAXBElement<ArrayOfAdExtensionDetailReportColumn> createArrayOfAdExtensionDetailReportColumn(ArrayOfAdExtensionDetailReportColumn value) {
        return new JAXBElement<>(_ArrayOfAdExtensionDetailReportColumn_QNAME, ArrayOfAdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportColumn")
    public JAXBElement<AdExtensionDetailReportColumn> createAdExtensionDetailReportColumn(AdExtensionDetailReportColumn value) {
        return new JAXBElement<>(_AdExtensionDetailReportColumn_QNAME, AdExtensionDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdExtensionDetailReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AdExtensionDetailReportFilter")
    public JAXBElement<AdExtensionDetailReportFilter> createAdExtensionDetailReportFilter(AdExtensionDetailReportFilter value) {
        return new JAXBElement<>(_AdExtensionDetailReportFilter_QNAME, AdExtensionDetailReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportRequest")
    public JAXBElement<ShareOfVoiceReportRequest> createShareOfVoiceReportRequest(ShareOfVoiceReportRequest value) {
        return new JAXBElement<>(_ShareOfVoiceReportRequest_QNAME, ShareOfVoiceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShareOfVoiceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfShareOfVoiceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfShareOfVoiceReportColumn")
    public JAXBElement<ArrayOfShareOfVoiceReportColumn> createArrayOfShareOfVoiceReportColumn(ArrayOfShareOfVoiceReportColumn value) {
        return new JAXBElement<>(_ArrayOfShareOfVoiceReportColumn_QNAME, ArrayOfShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportColumn")
    public JAXBElement<ShareOfVoiceReportColumn> createShareOfVoiceReportColumn(ShareOfVoiceReportColumn value) {
        return new JAXBElement<>(_ShareOfVoiceReportColumn_QNAME, ShareOfVoiceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShareOfVoiceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ShareOfVoiceReportFilter")
    public JAXBElement<ShareOfVoiceReportFilter> createShareOfVoiceReportFilter(ShareOfVoiceReportFilter value) {
        return new JAXBElement<>(_ShareOfVoiceReportFilter_QNAME, ShareOfVoiceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportRequest")
    public JAXBElement<ProductDimensionPerformanceReportRequest> createProductDimensionPerformanceReportRequest(ProductDimensionPerformanceReportRequest value) {
        return new JAXBElement<>(_ProductDimensionPerformanceReportRequest_QNAME, ProductDimensionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDimensionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDimensionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductDimensionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductDimensionPerformanceReportColumn> createArrayOfProductDimensionPerformanceReportColumn(ArrayOfProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductDimensionPerformanceReportColumn_QNAME, ArrayOfProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportColumn")
    public JAXBElement<ProductDimensionPerformanceReportColumn> createProductDimensionPerformanceReportColumn(ProductDimensionPerformanceReportColumn value) {
        return new JAXBElement<>(_ProductDimensionPerformanceReportColumn_QNAME, ProductDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductDimensionPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductDimensionPerformanceReportFilter")
    public JAXBElement<ProductDimensionPerformanceReportFilter> createProductDimensionPerformanceReportFilter(ProductDimensionPerformanceReportFilter value) {
        return new JAXBElement<>(_ProductDimensionPerformanceReportFilter_QNAME, ProductDimensionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportRequest")
    public JAXBElement<ProductPartitionPerformanceReportRequest> createProductPartitionPerformanceReportRequest(ProductPartitionPerformanceReportRequest value) {
        return new JAXBElement<>(_ProductPartitionPerformanceReportRequest_QNAME, ProductPartitionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductPartitionPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionPerformanceReportColumn> createArrayOfProductPartitionPerformanceReportColumn(ArrayOfProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductPartitionPerformanceReportColumn_QNAME, ArrayOfProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportColumn")
    public JAXBElement<ProductPartitionPerformanceReportColumn> createProductPartitionPerformanceReportColumn(ProductPartitionPerformanceReportColumn value) {
        return new JAXBElement<>(_ProductPartitionPerformanceReportColumn_QNAME, ProductPartitionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionPerformanceReportFilter")
    public JAXBElement<ProductPartitionPerformanceReportFilter> createProductPartitionPerformanceReportFilter(ProductPartitionPerformanceReportFilter value) {
        return new JAXBElement<>(_ProductPartitionPerformanceReportFilter_QNAME, ProductPartitionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignTypeReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link CampaignTypeReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CampaignTypeReportFilter")
    @XmlJavaTypeAdapter(Adapter18 .class)
    public JAXBElement<Collection<CampaignTypeReportFilter>> createCampaignTypeReportFilter(Collection<CampaignTypeReportFilter> value) {
        return new JAXBElement<>(_CampaignTypeReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportRequest")
    public JAXBElement<ProductPartitionUnitPerformanceReportRequest> createProductPartitionUnitPerformanceReportRequest(ProductPartitionUnitPerformanceReportRequest value) {
        return new JAXBElement<>(_ProductPartitionUnitPerformanceReportRequest_QNAME, ProductPartitionUnitPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionUnitPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductPartitionUnitPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ArrayOfProductPartitionUnitPerformanceReportColumn> createArrayOfProductPartitionUnitPerformanceReportColumn(ArrayOfProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductPartitionUnitPerformanceReportColumn_QNAME, ArrayOfProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportColumn")
    public JAXBElement<ProductPartitionUnitPerformanceReportColumn> createProductPartitionUnitPerformanceReportColumn(ProductPartitionUnitPerformanceReportColumn value) {
        return new JAXBElement<>(_ProductPartitionUnitPerformanceReportColumn_QNAME, ProductPartitionUnitPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductPartitionUnitPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductPartitionUnitPerformanceReportFilter")
    public JAXBElement<ProductPartitionUnitPerformanceReportFilter> createProductPartitionUnitPerformanceReportFilter(ProductPartitionUnitPerformanceReportFilter value) {
        return new JAXBElement<>(_ProductPartitionUnitPerformanceReportFilter_QNAME, ProductPartitionUnitPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportRequest")
    public JAXBElement<ProductSearchQueryPerformanceReportRequest> createProductSearchQueryPerformanceReportRequest(ProductSearchQueryPerformanceReportRequest value) {
        return new JAXBElement<>(_ProductSearchQueryPerformanceReportRequest_QNAME, ProductSearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductSearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductSearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfProductSearchQueryPerformanceReportColumn> createArrayOfProductSearchQueryPerformanceReportColumn(ArrayOfProductSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductSearchQueryPerformanceReportColumn_QNAME, ArrayOfProductSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportColumn")
    public JAXBElement<ProductSearchQueryPerformanceReportColumn> createProductSearchQueryPerformanceReportColumn(ProductSearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_ProductSearchQueryPerformanceReportColumn_QNAME, ProductSearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductSearchQueryPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductSearchQueryPerformanceReportFilter")
    public JAXBElement<ProductSearchQueryPerformanceReportFilter> createProductSearchQueryPerformanceReportFilter(ProductSearchQueryPerformanceReportFilter value) {
        return new JAXBElement<>(_ProductSearchQueryPerformanceReportFilter_QNAME, ProductSearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductMatchCountReportRequest")
    public JAXBElement<ProductMatchCountReportRequest> createProductMatchCountReportRequest(ProductMatchCountReportRequest value) {
        return new JAXBElement<>(_ProductMatchCountReportRequest_QNAME, ProductMatchCountReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductMatchCountReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductMatchCountReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductMatchCountReportColumn")
    public JAXBElement<ArrayOfProductMatchCountReportColumn> createArrayOfProductMatchCountReportColumn(ArrayOfProductMatchCountReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductMatchCountReportColumn_QNAME, ArrayOfProductMatchCountReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductMatchCountReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductMatchCountReportColumn")
    public JAXBElement<ProductMatchCountReportColumn> createProductMatchCountReportColumn(ProductMatchCountReportColumn value) {
        return new JAXBElement<>(_ProductMatchCountReportColumn_QNAME, ProductMatchCountReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportRequest")
    public JAXBElement<ProductNegativeKeywordConflictReportRequest> createProductNegativeKeywordConflictReportRequest(ProductNegativeKeywordConflictReportRequest value) {
        return new JAXBElement<>(_ProductNegativeKeywordConflictReportRequest_QNAME, ProductNegativeKeywordConflictReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductNegativeKeywordConflictReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProductNegativeKeywordConflictReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfProductNegativeKeywordConflictReportColumn")
    public JAXBElement<ArrayOfProductNegativeKeywordConflictReportColumn> createArrayOfProductNegativeKeywordConflictReportColumn(ArrayOfProductNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<>(_ArrayOfProductNegativeKeywordConflictReportColumn_QNAME, ArrayOfProductNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportColumn")
    public JAXBElement<ProductNegativeKeywordConflictReportColumn> createProductNegativeKeywordConflictReportColumn(ProductNegativeKeywordConflictReportColumn value) {
        return new JAXBElement<>(_ProductNegativeKeywordConflictReportColumn_QNAME, ProductNegativeKeywordConflictReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductNegativeKeywordConflictReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ProductNegativeKeywordConflictReportFilter")
    public JAXBElement<ProductNegativeKeywordConflictReportFilter> createProductNegativeKeywordConflictReportFilter(ProductNegativeKeywordConflictReportFilter value) {
        return new JAXBElement<>(_ProductNegativeKeywordConflictReportFilter_QNAME, ProductNegativeKeywordConflictReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallDetailReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportRequest")
    public JAXBElement<CallDetailReportRequest> createCallDetailReportRequest(CallDetailReportRequest value) {
        return new JAXBElement<>(_CallDetailReportRequest_QNAME, CallDetailReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallDetailReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCallDetailReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCallDetailReportColumn")
    public JAXBElement<ArrayOfCallDetailReportColumn> createArrayOfCallDetailReportColumn(ArrayOfCallDetailReportColumn value) {
        return new JAXBElement<>(_ArrayOfCallDetailReportColumn_QNAME, ArrayOfCallDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallDetailReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportColumn")
    public JAXBElement<CallDetailReportColumn> createCallDetailReportColumn(CallDetailReportColumn value) {
        return new JAXBElement<>(_CallDetailReportColumn_QNAME, CallDetailReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDetailReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallDetailReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CallDetailReportFilter")
    public JAXBElement<CallDetailReportFilter> createCallDetailReportFilter(CallDetailReportFilter value) {
        return new JAXBElement<>(_CallDetailReportFilter_QNAME, CallDetailReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportRequest")
    public JAXBElement<GeographicPerformanceReportRequest> createGeographicPerformanceReportRequest(GeographicPerformanceReportRequest value) {
        return new JAXBElement<>(_GeographicPerformanceReportRequest_QNAME, GeographicPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeographicPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGeographicPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfGeographicPerformanceReportColumn")
    public JAXBElement<ArrayOfGeographicPerformanceReportColumn> createArrayOfGeographicPerformanceReportColumn(ArrayOfGeographicPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfGeographicPerformanceReportColumn_QNAME, ArrayOfGeographicPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportColumn")
    public JAXBElement<GeographicPerformanceReportColumn> createGeographicPerformanceReportColumn(GeographicPerformanceReportColumn value) {
        return new JAXBElement<>(_GeographicPerformanceReportColumn_QNAME, GeographicPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeographicPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "GeographicPerformanceReportFilter")
    public JAXBElement<GeographicPerformanceReportFilter> createGeographicPerformanceReportFilter(GeographicPerformanceReportFilter value) {
        return new JAXBElement<>(_GeographicPerformanceReportFilter_QNAME, GeographicPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportRequest")
    public JAXBElement<DSASearchQueryPerformanceReportRequest> createDSASearchQueryPerformanceReportRequest(DSASearchQueryPerformanceReportRequest value) {
        return new JAXBElement<>(_DSASearchQueryPerformanceReportRequest_QNAME, DSASearchQueryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSASearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDSASearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSASearchQueryPerformanceReportColumn")
    public JAXBElement<ArrayOfDSASearchQueryPerformanceReportColumn> createArrayOfDSASearchQueryPerformanceReportColumn(ArrayOfDSASearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfDSASearchQueryPerformanceReportColumn_QNAME, ArrayOfDSASearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportColumn")
    public JAXBElement<DSASearchQueryPerformanceReportColumn> createDSASearchQueryPerformanceReportColumn(DSASearchQueryPerformanceReportColumn value) {
        return new JAXBElement<>(_DSASearchQueryPerformanceReportColumn_QNAME, DSASearchQueryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSASearchQueryPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSASearchQueryPerformanceReportFilter")
    public JAXBElement<DSASearchQueryPerformanceReportFilter> createDSASearchQueryPerformanceReportFilter(DSASearchQueryPerformanceReportFilter value) {
        return new JAXBElement<>(_DSASearchQueryPerformanceReportFilter_QNAME, DSASearchQueryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportRequest")
    public JAXBElement<DSAAutoTargetPerformanceReportRequest> createDSAAutoTargetPerformanceReportRequest(DSAAutoTargetPerformanceReportRequest value) {
        return new JAXBElement<>(_DSAAutoTargetPerformanceReportRequest_QNAME, DSAAutoTargetPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSAAutoTargetPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDSAAutoTargetPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSAAutoTargetPerformanceReportColumn")
    public JAXBElement<ArrayOfDSAAutoTargetPerformanceReportColumn> createArrayOfDSAAutoTargetPerformanceReportColumn(ArrayOfDSAAutoTargetPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfDSAAutoTargetPerformanceReportColumn_QNAME, ArrayOfDSAAutoTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportColumn")
    public JAXBElement<DSAAutoTargetPerformanceReportColumn> createDSAAutoTargetPerformanceReportColumn(DSAAutoTargetPerformanceReportColumn value) {
        return new JAXBElement<>(_DSAAutoTargetPerformanceReportColumn_QNAME, DSAAutoTargetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAAutoTargetPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSAAutoTargetPerformanceReportFilter")
    public JAXBElement<DSAAutoTargetPerformanceReportFilter> createDSAAutoTargetPerformanceReportFilter(DSAAutoTargetPerformanceReportFilter value) {
        return new JAXBElement<>(_DSAAutoTargetPerformanceReportFilter_QNAME, DSAAutoTargetPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DynamicAdTargetStatusReportFilter }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DynamicAdTargetStatusReportFilter }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DynamicAdTargetStatusReportFilter")
    @XmlJavaTypeAdapter(Adapter19 .class)
    public JAXBElement<Collection<DynamicAdTargetStatusReportFilter>> createDynamicAdTargetStatusReportFilter(Collection<DynamicAdTargetStatusReportFilter> value) {
        return new JAXBElement<>(_DynamicAdTargetStatusReportFilter_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportRequest")
    public JAXBElement<DSACategoryPerformanceReportRequest> createDSACategoryPerformanceReportRequest(DSACategoryPerformanceReportRequest value) {
        return new JAXBElement<>(_DSACategoryPerformanceReportRequest_QNAME, DSACategoryPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDSACategoryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDSACategoryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfDSACategoryPerformanceReportColumn")
    public JAXBElement<ArrayOfDSACategoryPerformanceReportColumn> createArrayOfDSACategoryPerformanceReportColumn(ArrayOfDSACategoryPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfDSACategoryPerformanceReportColumn_QNAME, ArrayOfDSACategoryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportColumn")
    public JAXBElement<DSACategoryPerformanceReportColumn> createDSACategoryPerformanceReportColumn(DSACategoryPerformanceReportColumn value) {
        return new JAXBElement<>(_DSACategoryPerformanceReportColumn_QNAME, DSACategoryPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSACategoryPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DSACategoryPerformanceReportFilter")
    public JAXBElement<DSACategoryPerformanceReportFilter> createDSACategoryPerformanceReportFilter(DSACategoryPerformanceReportFilter value) {
        return new JAXBElement<>(_DSACategoryPerformanceReportFilter_QNAME, DSACategoryPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportRequest")
    public JAXBElement<HotelDimensionPerformanceReportRequest> createHotelDimensionPerformanceReportRequest(HotelDimensionPerformanceReportRequest value) {
        return new JAXBElement<>(_HotelDimensionPerformanceReportRequest_QNAME, HotelDimensionPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelDimensionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelDimensionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfHotelDimensionPerformanceReportColumn")
    public JAXBElement<ArrayOfHotelDimensionPerformanceReportColumn> createArrayOfHotelDimensionPerformanceReportColumn(ArrayOfHotelDimensionPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfHotelDimensionPerformanceReportColumn_QNAME, ArrayOfHotelDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportColumn")
    public JAXBElement<HotelDimensionPerformanceReportColumn> createHotelDimensionPerformanceReportColumn(HotelDimensionPerformanceReportColumn value) {
        return new JAXBElement<>(_HotelDimensionPerformanceReportColumn_QNAME, HotelDimensionPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelDimensionPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelDimensionPerformanceReportFilter")
    public JAXBElement<HotelDimensionPerformanceReportFilter> createHotelDimensionPerformanceReportFilter(HotelDimensionPerformanceReportFilter value) {
        return new JAXBElement<>(_HotelDimensionPerformanceReportFilter_QNAME, HotelDimensionPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportRequest")
    public JAXBElement<HotelGroupPerformanceReportRequest> createHotelGroupPerformanceReportRequest(HotelGroupPerformanceReportRequest value) {
        return new JAXBElement<>(_HotelGroupPerformanceReportRequest_QNAME, HotelGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfHotelGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfHotelGroupPerformanceReportColumn> createArrayOfHotelGroupPerformanceReportColumn(ArrayOfHotelGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfHotelGroupPerformanceReportColumn_QNAME, ArrayOfHotelGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportColumn")
    public JAXBElement<HotelGroupPerformanceReportColumn> createHotelGroupPerformanceReportColumn(HotelGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_HotelGroupPerformanceReportColumn_QNAME, HotelGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelGroupPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "HotelGroupPerformanceReportFilter")
    public JAXBElement<HotelGroupPerformanceReportFilter> createHotelGroupPerformanceReportFilter(HotelGroupPerformanceReportFilter value) {
        return new JAXBElement<>(_HotelGroupPerformanceReportFilter_QNAME, HotelGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetGroupPerformanceReportRequest")
    public JAXBElement<AssetGroupPerformanceReportRequest> createAssetGroupPerformanceReportRequest(AssetGroupPerformanceReportRequest value) {
        return new JAXBElement<>(_AssetGroupPerformanceReportRequest_QNAME, AssetGroupPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAssetGroupPerformanceReportColumn")
    public JAXBElement<ArrayOfAssetGroupPerformanceReportColumn> createArrayOfAssetGroupPerformanceReportColumn(ArrayOfAssetGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAssetGroupPerformanceReportColumn_QNAME, ArrayOfAssetGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetGroupPerformanceReportColumn")
    public JAXBElement<AssetGroupPerformanceReportColumn> createAssetGroupPerformanceReportColumn(AssetGroupPerformanceReportColumn value) {
        return new JAXBElement<>(_AssetGroupPerformanceReportColumn_QNAME, AssetGroupPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetGroupPerformanceReportFilter")
    public JAXBElement<AssetGroupPerformanceReportFilter> createAssetGroupPerformanceReportFilter(AssetGroupPerformanceReportFilter value) {
        return new JAXBElement<>(_AssetGroupPerformanceReportFilter_QNAME, AssetGroupPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountThroughAssetGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountThroughAssetGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AccountThroughAssetGroupReportScope")
    public JAXBElement<AccountThroughAssetGroupReportScope> createAccountThroughAssetGroupReportScope(AccountThroughAssetGroupReportScope value) {
        return new JAXBElement<>(_AccountThroughAssetGroupReportScope_QNAME, AccountThroughAssetGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAssetGroupReportScope")
    public JAXBElement<ArrayOfAssetGroupReportScope> createArrayOfAssetGroupReportScope(ArrayOfAssetGroupReportScope value) {
        return new JAXBElement<>(_ArrayOfAssetGroupReportScope_QNAME, ArrayOfAssetGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetGroupReportScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetGroupReportScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetGroupReportScope")
    public JAXBElement<AssetGroupReportScope> createAssetGroupReportScope(AssetGroupReportScope value) {
        return new JAXBElement<>(_AssetGroupReportScope_QNAME, AssetGroupReportScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchInsightPerformanceReportRequest")
    public JAXBElement<SearchInsightPerformanceReportRequest> createSearchInsightPerformanceReportRequest(SearchInsightPerformanceReportRequest value) {
        return new JAXBElement<>(_SearchInsightPerformanceReportRequest_QNAME, SearchInsightPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchInsightPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchInsightPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfSearchInsightPerformanceReportColumn")
    public JAXBElement<ArrayOfSearchInsightPerformanceReportColumn> createArrayOfSearchInsightPerformanceReportColumn(ArrayOfSearchInsightPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfSearchInsightPerformanceReportColumn_QNAME, ArrayOfSearchInsightPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchInsightPerformanceReportColumn")
    public JAXBElement<SearchInsightPerformanceReportColumn> createSearchInsightPerformanceReportColumn(SearchInsightPerformanceReportColumn value) {
        return new JAXBElement<>(_SearchInsightPerformanceReportColumn_QNAME, SearchInsightPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchInsightPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "SearchInsightPerformanceReportFilter")
    public JAXBElement<SearchInsightPerformanceReportFilter> createSearchInsightPerformanceReportFilter(SearchInsightPerformanceReportFilter value) {
        return new JAXBElement<>(_SearchInsightPerformanceReportFilter_QNAME, SearchInsightPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetPerformanceReportRequest")
    public JAXBElement<AssetPerformanceReportRequest> createAssetPerformanceReportRequest(AssetPerformanceReportRequest value) {
        return new JAXBElement<>(_AssetPerformanceReportRequest_QNAME, AssetPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAssetPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAssetPerformanceReportColumn")
    public JAXBElement<ArrayOfAssetPerformanceReportColumn> createArrayOfAssetPerformanceReportColumn(ArrayOfAssetPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAssetPerformanceReportColumn_QNAME, ArrayOfAssetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssetPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AssetPerformanceReportColumn")
    public JAXBElement<AssetPerformanceReportColumn> createAssetPerformanceReportColumn(AssetPerformanceReportColumn value) {
        return new JAXBElement<>(_AssetPerformanceReportColumn_QNAME, AssetPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryInsightsReportRequest")
    public JAXBElement<CategoryInsightsReportRequest> createCategoryInsightsReportRequest(CategoryInsightsReportRequest value) {
        return new JAXBElement<>(_CategoryInsightsReportRequest_QNAME, CategoryInsightsReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryInsightsReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryInsightsReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCategoryInsightsReportColumn")
    public JAXBElement<ArrayOfCategoryInsightsReportColumn> createArrayOfCategoryInsightsReportColumn(ArrayOfCategoryInsightsReportColumn value) {
        return new JAXBElement<>(_ArrayOfCategoryInsightsReportColumn_QNAME, ArrayOfCategoryInsightsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryInsightsReportColumn")
    public JAXBElement<CategoryInsightsReportColumn> createCategoryInsightsReportColumn(CategoryInsightsReportColumn value) {
        return new JAXBElement<>(_CategoryInsightsReportColumn_QNAME, CategoryInsightsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryInsightsReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryInsightsReportFilter")
    public JAXBElement<CategoryInsightsReportFilter> createCategoryInsightsReportFilter(CategoryInsightsReportFilter value) {
        return new JAXBElement<>(_CategoryInsightsReportFilter_QNAME, CategoryInsightsReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryClickCoverageReportRequest")
    public JAXBElement<CategoryClickCoverageReportRequest> createCategoryClickCoverageReportRequest(CategoryClickCoverageReportRequest value) {
        return new JAXBElement<>(_CategoryClickCoverageReportRequest_QNAME, CategoryClickCoverageReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryClickCoverageReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryClickCoverageReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCategoryClickCoverageReportColumn")
    public JAXBElement<ArrayOfCategoryClickCoverageReportColumn> createArrayOfCategoryClickCoverageReportColumn(ArrayOfCategoryClickCoverageReportColumn value) {
        return new JAXBElement<>(_ArrayOfCategoryClickCoverageReportColumn_QNAME, ArrayOfCategoryClickCoverageReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryClickCoverageReportColumn")
    public JAXBElement<CategoryClickCoverageReportColumn> createCategoryClickCoverageReportColumn(CategoryClickCoverageReportColumn value) {
        return new JAXBElement<>(_CategoryClickCoverageReportColumn_QNAME, CategoryClickCoverageReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CategoryClickCoverageReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CategoryClickCoverageReportFilter")
    public JAXBElement<CategoryClickCoverageReportFilter> createCategoryClickCoverageReportFilter(CategoryClickCoverageReportFilter value) {
        return new JAXBElement<>(_CategoryClickCoverageReportFilter_QNAME, CategoryClickCoverageReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CombinationPerformanceReportRequest")
    public JAXBElement<CombinationPerformanceReportRequest> createCombinationPerformanceReportRequest(CombinationPerformanceReportRequest value) {
        return new JAXBElement<>(_CombinationPerformanceReportRequest_QNAME, CombinationPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCombinationPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCombinationPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfCombinationPerformanceReportColumn")
    public JAXBElement<ArrayOfCombinationPerformanceReportColumn> createArrayOfCombinationPerformanceReportColumn(ArrayOfCombinationPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfCombinationPerformanceReportColumn_QNAME, ArrayOfCombinationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CombinationPerformanceReportColumn")
    public JAXBElement<CombinationPerformanceReportColumn> createCombinationPerformanceReportColumn(CombinationPerformanceReportColumn value) {
        return new JAXBElement<>(_CombinationPerformanceReportColumn_QNAME, CombinationPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CombinationPerformanceReportFilter")
    public JAXBElement<CombinationPerformanceReportFilter> createCombinationPerformanceReportFilter(CombinationPerformanceReportFilter value) {
        return new JAXBElement<>(_CombinationPerformanceReportFilter_QNAME, CombinationPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AppsPerformanceReportRequest")
    public JAXBElement<AppsPerformanceReportRequest> createAppsPerformanceReportRequest(AppsPerformanceReportRequest value) {
        return new JAXBElement<>(_AppsPerformanceReportRequest_QNAME, AppsPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppsPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAppsPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfAppsPerformanceReportColumn")
    public JAXBElement<ArrayOfAppsPerformanceReportColumn> createArrayOfAppsPerformanceReportColumn(ArrayOfAppsPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfAppsPerformanceReportColumn_QNAME, ArrayOfAppsPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AppsPerformanceReportColumn")
    public JAXBElement<AppsPerformanceReportColumn> createAppsPerformanceReportColumn(AppsPerformanceReportColumn value) {
        return new JAXBElement<>(_AppsPerformanceReportColumn_QNAME, AppsPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppsPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AppsPerformanceReportFilter")
    public JAXBElement<AppsPerformanceReportFilter> createAppsPerformanceReportFilter(AppsPerformanceReportFilter value) {
        return new JAXBElement<>(_AppsPerformanceReportFilter_QNAME, AppsPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "FeedItemPerformanceReportRequest")
    public JAXBElement<FeedItemPerformanceReportRequest> createFeedItemPerformanceReportRequest(FeedItemPerformanceReportRequest value) {
        return new JAXBElement<>(_FeedItemPerformanceReportRequest_QNAME, FeedItemPerformanceReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeedItemPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFeedItemPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfFeedItemPerformanceReportColumn")
    public JAXBElement<ArrayOfFeedItemPerformanceReportColumn> createArrayOfFeedItemPerformanceReportColumn(ArrayOfFeedItemPerformanceReportColumn value) {
        return new JAXBElement<>(_ArrayOfFeedItemPerformanceReportColumn_QNAME, ArrayOfFeedItemPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "FeedItemPerformanceReportColumn")
    public JAXBElement<FeedItemPerformanceReportColumn> createFeedItemPerformanceReportColumn(FeedItemPerformanceReportColumn value) {
        return new JAXBElement<>(_FeedItemPerformanceReportColumn_QNAME, FeedItemPerformanceReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeedItemPerformanceReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "FeedItemPerformanceReportFilter")
    public JAXBElement<FeedItemPerformanceReportFilter> createFeedItemPerformanceReportFilter(FeedItemPerformanceReportFilter value) {
        return new JAXBElement<>(_FeedItemPerformanceReportFilter_QNAME, FeedItemPerformanceReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "TravelQueryInsightReportRequest")
    public JAXBElement<TravelQueryInsightReportRequest> createTravelQueryInsightReportRequest(TravelQueryInsightReportRequest value) {
        return new JAXBElement<>(_TravelQueryInsightReportRequest_QNAME, TravelQueryInsightReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTravelQueryInsightReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTravelQueryInsightReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfTravelQueryInsightReportColumn")
    public JAXBElement<ArrayOfTravelQueryInsightReportColumn> createArrayOfTravelQueryInsightReportColumn(ArrayOfTravelQueryInsightReportColumn value) {
        return new JAXBElement<>(_ArrayOfTravelQueryInsightReportColumn_QNAME, ArrayOfTravelQueryInsightReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "TravelQueryInsightReportColumn")
    public JAXBElement<TravelQueryInsightReportColumn> createTravelQueryInsightReportColumn(TravelQueryInsightReportColumn value) {
        return new JAXBElement<>(_TravelQueryInsightReportColumn_QNAME, TravelQueryInsightReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelQueryInsightReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "TravelQueryInsightReportFilter")
    public JAXBElement<TravelQueryInsightReportFilter> createTravelQueryInsightReportFilter(TravelQueryInsightReportFilter value) {
        return new JAXBElement<>(_TravelQueryInsightReportFilter_QNAME, TravelQueryInsightReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidStrategyReportRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidStrategyReportRequest }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidStrategyReportRequest")
    public JAXBElement<BidStrategyReportRequest> createBidStrategyReportRequest(BidStrategyReportRequest value) {
        return new JAXBElement<>(_BidStrategyReportRequest_QNAME, BidStrategyReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidStrategyReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBidStrategyReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfBidStrategyReportColumn")
    public JAXBElement<ArrayOfBidStrategyReportColumn> createArrayOfBidStrategyReportColumn(ArrayOfBidStrategyReportColumn value) {
        return new JAXBElement<>(_ArrayOfBidStrategyReportColumn_QNAME, ArrayOfBidStrategyReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidStrategyReportColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidStrategyReportColumn }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidStrategyReportColumn")
    public JAXBElement<BidStrategyReportColumn> createBidStrategyReportColumn(BidStrategyReportColumn value) {
        return new JAXBElement<>(_BidStrategyReportColumn_QNAME, BidStrategyReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidStrategyReportFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BidStrategyReportFilter }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BidStrategyReportFilter")
    public JAXBElement<BidStrategyReportFilter> createBidStrategyReportFilter(BidStrategyReportFilter value) {
        return new JAXBElement<>(_BidStrategyReportFilter_QNAME, BidStrategyReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ApplicationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "AuthenticationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CustomerAccountId")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "CustomerId")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "DeveloperToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "Password")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "TrackingId")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfBatchError")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ArrayOfOperationError")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportRequestStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequestStatus")
    public JAXBElement<ReportRequestStatus> createReportRequestStatus(ReportRequestStatus value) {
        return new JAXBElement<>(_ReportRequestStatus_QNAME, ReportRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportRequestStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportRequestStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Reporting/v13", name = "ReportRequestStatusType")
    public JAXBElement<ReportRequestStatusType> createReportRequestStatusType(ReportRequestStatusType value) {
        return new JAXBElement<>(_ReportRequestStatusType_QNAME, ReportRequestStatusType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
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
