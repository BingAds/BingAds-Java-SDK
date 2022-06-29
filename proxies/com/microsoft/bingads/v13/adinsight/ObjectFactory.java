
package com.microsoft.bingads.v13.adinsight;

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
 * generated in the com.microsoft.bingads.v13.adinsight package. 
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

    private final static QName _QuerySearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "QuerySearchParameter");
    private final static QName _ArrayOfKeywordDemographicResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordDemographicResult");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfAuctionInsightEntry_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAuctionInsightEntry");
    private final static QName _ArrayOfDomainCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfDomainCategory");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "Password");
    private final static QName _CompetitionSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CompetitionSearchParameter");
    private final static QName _BroadMatchKeywordOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BroadMatchKeywordOpportunity");
    private final static QName _Criterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "Criterion");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CustomerAccountId");
    private final static QName _Opportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "Opportunity");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfCompetitionLevel_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfCompetitionLevel");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _AutoApplyRecommendationsInfo_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AutoApplyRecommendationsInfo");
    private final static QName _ArrayOfKeywordLocationResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordLocationResult");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "UserName");
    private final static QName _TimeInterval_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "TimeInterval");
    private final static QName _ArrayOfAdGroupEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAdGroupEstimate");
    private final static QName _ArrayOfCampaignEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfCampaignEstimator");
    private final static QName _TargetAdPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "TargetAdPosition");
    private final static QName _KPIType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KPIType");
    private final static QName _KeywordEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordEstimate");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AdGroupBidLandscapeInput_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdGroupBidLandscapeInput");
    private final static QName _PerformanceInsightsMessageParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsMessageParameter");
    private final static QName _ArrayOfAdGroupEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAdGroupEstimator");
    private final static QName _HistoricalSearchCountPeriodic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "HistoricalSearchCountPeriodic");
    private final static QName _ArrayOfEntityDetail_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfEntityDetail");
    private final static QName _IdeaTextSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "IdeaTextSearchParameter");
    private final static QName _ArrayOfKeywordSearchCount_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordSearchCount");
    private final static QName _SourceType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "SourceType");
    private final static QName _ArrayOfNegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfNegativeKeyword");
    private final static QName _ArrayOfKeywordLocation_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordLocation");
    private final static QName _ArrayOfKeywordHistoricalPerformance_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordHistoricalPerformance");
    private final static QName _ArrayOfCampaignEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfCampaignEstimate");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfKeywordDemographic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordDemographic");
    private final static QName _UrlSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "UrlSearchParameter");
    private final static QName _KeywordLocationResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordLocationResult");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfKeywordCategoryResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordCategoryResult");
    private final static QName _AuctionInsightKpi_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionInsightKpi");
    private final static QName _ArrayOfKeywordIdea_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordIdea");
    private final static QName _LanguageCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "LanguageCriterion");
    private final static QName _KeywordOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordOpportunity");
    private final static QName _AuctionInsightResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionInsightResult");
    private final static QName _AuctionInsightEntry_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionInsightEntry");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ArrayOfKeywordIdeaAttribute_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordIdeaAttribute");
    private final static QName _ArrayOfPerformanceInsightsMessageParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfPerformanceInsightsMessageParameter");
    private final static QName _PerformanceInsightsUrlCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsUrlCategory");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfAdGroupBidLandscape_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAdGroupBidLandscape");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _TextParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "TextParameter");
    private final static QName _CampaignEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CampaignEstimate");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "OperationError");
    private final static QName _DateRangeSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DateRangeSearchParameter");
    private final static QName _AuctionSegment_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionSegment");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BatchError");
    private final static QName _PerformanceInsightsEntityType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsEntityType");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DeveloperToken");
    private final static QName _NetworkCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "NetworkCriterion");
    private final static QName _AdGroupBidLandscape_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdGroupBidLandscape");
    private final static QName _ArrayOfKeyword_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeyword");
    private final static QName _MatchType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "MatchType");
    private final static QName _ArrayOfKeywordEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordEstimator");
    private final static QName _CompetitionLevel_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CompetitionLevel");
    private final static QName _KeywordBidLandscape_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordBidLandscape");
    private final static QName _ImpressionShareSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ImpressionShareSearchParameter");
    private final static QName _ArrayOfKeywordBidLandscape_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordBidLandscape");
    private final static QName _EstimatedPositionAndTraffic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "EstimatedPositionAndTraffic");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuthenticationToken");
    private final static QName _DeviceCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DeviceCriterion");
    private final static QName _ArrayOfKeywordCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordCategory");
    private final static QName _ArrayOfKeywordAndConfidence_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordAndConfidence");
    private final static QName _ArrayOfSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfSearchParameter");
    private final static QName _EstimatedBidAndTraffic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "EstimatedBidAndTraffic");
    private final static QName _CurrencyCode_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CurrencyCode");
    private final static QName _EntityParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "EntityParameter");
    private final static QName _ArrayOfBudgetPoint_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBudgetPoint");
    private final static QName _KeywordAndConfidence_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordAndConfidence");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "TrackingId");
    private final static QName _PerformanceInsightsMessageTemplateId_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsMessageTemplateId");
    private final static QName _KeywordCategoryResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordCategoryResult");
    private final static QName _KeywordSuggestion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordSuggestion");
    private final static QName _DeviceSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DeviceSearchParameter");
    private final static QName _PerformanceInsightsDetail_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsDetail");
    private final static QName _ArrayOfKeywordEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordEstimate");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _AuctionSegmentSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionSegmentSearchParameter");
    private final static QName _KeywordIdeaAttribute_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordIdeaAttribute");
    private final static QName _KeywordAndMatchType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordAndMatchType");
    private final static QName _BudgetLimitType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BudgetLimitType");
    private final static QName _CategorySearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CategorySearchParameter");
    private final static QName _ArrayOfAuctionSegment_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAuctionSegment");
    private final static QName _AdGroupBidLandscapeType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdGroupBidLandscapeType");
    private final static QName _KeywordKPI_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordKPI");
    private final static QName _ArrayOfPerformanceInsightsDetail_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfPerformanceInsightsDetail");
    private final static QName _BudgetPointType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BudgetPointType");
    private final static QName _ArrayOfBidLandscapePoint_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBidLandscapePoint");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfOperationError");
    private final static QName _AdGroupEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdGroupEstimate");
    private final static QName _ArrayOfCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfCriterion");
    private final static QName _PerformanceInsightsMessage_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsMessage");
    private final static QName _ArrayOfBidOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBidOpportunity");
    private final static QName _UrlParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "UrlParameter");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _BudgetOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BudgetOpportunity");
    private final static QName _ArrayOfKeywordAndMatchType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordAndMatchType");
    private final static QName _KeywordDemographic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordDemographic");
    private final static QName _ArrayOfHistoricalSearchCountPeriodic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfHistoricalSearchCountPeriodic");
    private final static QName _TrafficEstimate_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "TrafficEstimate");
    private final static QName _KeywordIdEstimatedPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordIdEstimatedPosition");
    private final static QName _NetworkType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "NetworkType");
    private final static QName _NetworkSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "NetworkSearchParameter");
    private final static QName _SearchCountsByAttributes_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "SearchCountsByAttributes");
    private final static QName _KeywordSearchCount_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordSearchCount");
    private final static QName _ArrayOfKeywordOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordOpportunity");
    private final static QName _ArrayOfKeywordEstimatedBid_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordEstimatedBid");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _KeywordEstimatedBid_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordEstimatedBid");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBatchError");
    private final static QName _NegativeKeyword_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "NegativeKeyword");
    private final static QName _ArrayOfKeywordEstimatedPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordEstimatedPosition");
    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ApiFaultDetail");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _MetricData_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "MetricData");
    private final static QName _ArrayOfPerformanceInsightsMessage_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfPerformanceInsightsMessage");
    private final static QName _ArrayOfKeywordIdEstimatedPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordIdEstimatedPosition");
    private final static QName _ArrayOfLanguageCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfLanguageCriterion");
    private final static QName _ArrayOfKeywordIdeaCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordIdeaCategory");
    private final static QName _ArrayOfBroadMatchSearchQueryKPI_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBroadMatchSearchQueryKPI");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfMatchType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfMatchType");
    private final static QName _ArrayOfKeywordKPI_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordKPI");
    private final static QName _PerformanceInsightsUrlId_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "PerformanceInsightsUrlId");
    private final static QName _ArrayOfAuctionInsightKpi_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAuctionInsightKpi");
    private final static QName _KeywordIdEstimatedBid_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordIdEstimatedBid");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ApplicationToken");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _KeywordIdea_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordIdea");
    private final static QName _ArrayOfMetricData_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfMetricData");
    private final static QName _KeywordLocation_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordLocation");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _LocationCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "LocationCriterion");
    private final static QName _LanguageSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "LanguageSearchParameter");
    private final static QName _BidOpportunityType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BidOpportunityType");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _CampaignEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CampaignEstimator");
    private final static QName _ArrayOfEstimatedPositionAndTraffic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfEstimatedPositionAndTraffic");
    private final static QName _EntityType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "EntityType");
    private final static QName _ArrayOfAdGroupBidLandscapeInput_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAdGroupBidLandscapeInput");
    private final static QName _ExcludeAccountKeywordsSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ExcludeAccountKeywordsSearchParameter");
    private final static QName _AdPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdPosition");
    private final static QName _ArrayOfSearchCountsByAttributes_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfSearchCountsByAttributes");
    private final static QName _SearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "SearchParameter");
    private final static QName _SearchVolumeSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "SearchVolumeSearchParameter");
    private final static QName _AuctionInsightKpiAdditionalField_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AuctionInsightKpiAdditionalField");
    private final static QName _KeywordEstimatedPosition_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordEstimatedPosition");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfLocationCriterion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfLocationCriterion");
    private final static QName _KeywordEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordEstimator");
    private final static QName _ArrayOfAutoApplyRecommendationsInfo_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfAutoApplyRecommendationsInfo");
    private final static QName _AdGroupEstimator_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "AdGroupEstimator");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DomainCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DomainCategory");
    private final static QName _SuggestedBidSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "SuggestedBidSearchParameter");
    private final static QName _ParameterType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ParameterType");
    private final static QName _Keyword_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "Keyword");
    private final static QName _LocationSearchParameter_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "LocationSearchParameter");
    private final static QName _KeywordDemographicResult_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordDemographicResult");
    private final static QName _ArrayOfKeywordSuggestion_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordSuggestion");
    private final static QName _DayMonthAndYear_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "DayMonthAndYear");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfEstimatedBidAndTraffic_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfEstimatedBidAndTraffic");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BidOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BidOpportunity");
    private final static QName _ArrayOfKeywordIdEstimatedBid_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfKeywordIdEstimatedBid");
    private final static QName _EntityDetail_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "EntityDetail");
    private final static QName _ArrayOfBudgetOpportunity_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "ArrayOfBudgetOpportunity");
    private final static QName _BroadMatchSearchQueryKPI_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BroadMatchSearchQueryKPI");
    private final static QName _BudgetPoint_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BudgetPoint");
    private final static QName _KeywordIdeaCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordIdeaCategory");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "CustomerId");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _KeywordOpportunityType_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordOpportunityType");
    private final static QName _KeywordHistoricalPerformance_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordHistoricalPerformance");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _BidLandscapePoint_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "BidLandscapePoint");
    private final static QName _KeywordCategory_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v13", "KeywordCategory");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.adinsight
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
     * Create an instance of {@link EstimatedPositionAndTraffic }
     * 
     */
    public EstimatedPositionAndTraffic createEstimatedPositionAndTraffic() {
        return new EstimatedPositionAndTraffic();
    }

    /**
     * Create an instance of {@link DeviceCriterion }
     * 
     */
    public DeviceCriterion createDeviceCriterion() {
        return new DeviceCriterion();
    }

    /**
     * Create an instance of {@link SuggestKeywordsForUrlRequest }
     * 
     */
    public SuggestKeywordsForUrlRequest createSuggestKeywordsForUrlRequest() {
        return new SuggestKeywordsForUrlRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordCategory }
     * 
     */
    public ArrayOfKeywordCategory createArrayOfKeywordCategory() {
        return new ArrayOfKeywordCategory();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordEstimator }
     * 
     */
    public ArrayOfKeywordEstimator createArrayOfKeywordEstimator() {
        return new ArrayOfKeywordEstimator();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordBidLandscape }
     * 
     */
    public ArrayOfKeywordBidLandscape createArrayOfKeywordBidLandscape() {
        return new ArrayOfKeywordBidLandscape();
    }

    /**
     * Create an instance of {@link KeywordBidLandscape }
     * 
     */
    public KeywordBidLandscape createKeywordBidLandscape() {
        return new KeywordBidLandscape();
    }

    /**
     * Create an instance of {@link ImpressionShareSearchParameter }
     * 
     */
    public ImpressionShareSearchParameter createImpressionShareSearchParameter() {
        return new ImpressionShareSearchParameter();
    }

    /**
     * Create an instance of {@link EstimatedBidAndTraffic }
     * 
     */
    public EstimatedBidAndTraffic createEstimatedBidAndTraffic() {
        return new EstimatedBidAndTraffic();
    }

    /**
     * Create an instance of {@link EntityParameter }
     * 
     */
    public EntityParameter createEntityParameter() {
        return new EntityParameter();
    }

    /**
     * Create an instance of {@link SuggestKeywordsForUrlResponse }
     * 
     */
    public SuggestKeywordsForUrlResponse createSuggestKeywordsForUrlResponse() {
        return new SuggestKeywordsForUrlResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordAndConfidence }
     * 
     */
    public ArrayOfKeywordAndConfidence createArrayOfKeywordAndConfidence() {
        return new ArrayOfKeywordAndConfidence();
    }

    /**
     * Create an instance of {@link GetAuctionInsightDataRequest }
     * 
     */
    public GetAuctionInsightDataRequest createGetAuctionInsightDataRequest() {
        return new GetAuctionInsightDataRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link ArrayOfSearchParameter }
     * 
     */
    public ArrayOfSearchParameter createArrayOfSearchParameter() {
        return new ArrayOfSearchParameter();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByAdGroupIdsRequest }
     * 
     */
    public GetBidLandscapeByAdGroupIdsRequest createGetBidLandscapeByAdGroupIdsRequest() {
        return new GetBidLandscapeByAdGroupIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupBidLandscapeInput }
     * 
     */
    public ArrayOfAdGroupBidLandscapeInput createArrayOfAdGroupBidLandscapeInput() {
        return new ArrayOfAdGroupBidLandscapeInput();
    }

    /**
     * Create an instance of {@link GetDomainCategoriesRequest }
     * 
     */
    public GetDomainCategoriesRequest createGetDomainCategoriesRequest() {
        return new GetDomainCategoriesRequest();
    }

    /**
     * Create an instance of {@link GetEstimatedBidByKeywordsResponse }
     * 
     */
    public GetEstimatedBidByKeywordsResponse createGetEstimatedBidByKeywordsResponse() {
        return new GetEstimatedBidByKeywordsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordEstimatedBid }
     * 
     */
    public ArrayOfKeywordEstimatedBid createArrayOfKeywordEstimatedBid() {
        return new ArrayOfKeywordEstimatedBid();
    }

    /**
     * Create an instance of {@link KeywordCategoryResult }
     * 
     */
    public KeywordCategoryResult createKeywordCategoryResult() {
        return new KeywordCategoryResult();
    }

    /**
     * Create an instance of {@link GetKeywordDemographicsResponse }
     * 
     */
    public GetKeywordDemographicsResponse createGetKeywordDemographicsResponse() {
        return new GetKeywordDemographicsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordDemographicResult }
     * 
     */
    public ArrayOfKeywordDemographicResult createArrayOfKeywordDemographicResult() {
        return new ArrayOfKeywordDemographicResult();
    }

    /**
     * Create an instance of {@link KeywordAndConfidence }
     * 
     */
    public KeywordAndConfidence createKeywordAndConfidence() {
        return new KeywordAndConfidence();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetPoint }
     * 
     */
    public ArrayOfBudgetPoint createArrayOfBudgetPoint() {
        return new ArrayOfBudgetPoint();
    }

    /**
     * Create an instance of {@link KeywordAndMatchType }
     * 
     */
    public KeywordAndMatchType createKeywordAndMatchType() {
        return new KeywordAndMatchType();
    }

    /**
     * Create an instance of {@link CategorySearchParameter }
     * 
     */
    public CategorySearchParameter createCategorySearchParameter() {
        return new CategorySearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfAuctionSegment }
     * 
     */
    public ArrayOfAuctionSegment createArrayOfAuctionSegment() {
        return new ArrayOfAuctionSegment();
    }

    /**
     * Create an instance of {@link KeywordSuggestion }
     * 
     */
    public KeywordSuggestion createKeywordSuggestion() {
        return new KeywordSuggestion();
    }

    /**
     * Create an instance of {@link DeviceSearchParameter }
     * 
     */
    public DeviceSearchParameter createDeviceSearchParameter() {
        return new DeviceSearchParameter();
    }

    /**
     * Create an instance of {@link PerformanceInsightsDetail }
     * 
     */
    public PerformanceInsightsDetail createPerformanceInsightsDetail() {
        return new PerformanceInsightsDetail();
    }

    /**
     * Create an instance of {@link GetEstimatedBidByKeywordIdsRequest }
     * 
     */
    public GetEstimatedBidByKeywordIdsRequest createGetEstimatedBidByKeywordIdsRequest() {
        return new GetEstimatedBidByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link AuctionSegmentSearchParameter }
     * 
     */
    public AuctionSegmentSearchParameter createAuctionSegmentSearchParameter() {
        return new AuctionSegmentSearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordEstimate }
     * 
     */
    public ArrayOfKeywordEstimate createArrayOfKeywordEstimate() {
        return new ArrayOfKeywordEstimate();
    }

    /**
     * Create an instance of {@link AuctionInsightResult }
     * 
     */
    public AuctionInsightResult createAuctionInsightResult() {
        return new AuctionInsightResult();
    }

    /**
     * Create an instance of {@link AuctionInsightEntry }
     * 
     */
    public AuctionInsightEntry createAuctionInsightEntry() {
        return new AuctionInsightEntry();
    }

    /**
     * Create an instance of {@link GetKeywordDemographicsRequest }
     * 
     */
    public GetKeywordDemographicsRequest createGetKeywordDemographicsRequest() {
        return new GetKeywordDemographicsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetKeywordOpportunitiesResponse }
     * 
     */
    public GetKeywordOpportunitiesResponse createGetKeywordOpportunitiesResponse() {
        return new GetKeywordOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordOpportunity }
     * 
     */
    public ArrayOfKeywordOpportunity createArrayOfKeywordOpportunity() {
        return new ArrayOfKeywordOpportunity();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordIdeaAttribute }
     * 
     */
    public ArrayOfKeywordIdeaAttribute createArrayOfKeywordIdeaAttribute() {
        return new ArrayOfKeywordIdeaAttribute();
    }

    /**
     * Create an instance of {@link CampaignEstimate }
     * 
     */
    public CampaignEstimate createCampaignEstimate() {
        return new CampaignEstimate();
    }

    /**
     * Create an instance of {@link ArrayOfPerformanceInsightsMessageParameter }
     * 
     */
    public ArrayOfPerformanceInsightsMessageParameter createArrayOfPerformanceInsightsMessageParameter() {
        return new ArrayOfPerformanceInsightsMessageParameter();
    }

    /**
     * Create an instance of {@link GetHistoricalKeywordPerformanceResponse }
     * 
     */
    public GetHistoricalKeywordPerformanceResponse createGetHistoricalKeywordPerformanceResponse() {
        return new GetHistoricalKeywordPerformanceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordHistoricalPerformance }
     * 
     */
    public ArrayOfKeywordHistoricalPerformance createArrayOfKeywordHistoricalPerformance() {
        return new ArrayOfKeywordHistoricalPerformance();
    }

    /**
     * Create an instance of {@link TextParameter }
     * 
     */
    public TextParameter createTextParameter() {
        return new TextParameter();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupBidLandscape }
     * 
     */
    public ArrayOfAdGroupBidLandscape createArrayOfAdGroupBidLandscape() {
        return new ArrayOfAdGroupBidLandscape();
    }

    /**
     * Create an instance of {@link GetPerformanceInsightsDetailDataByAccountIdRequest }
     * 
     */
    public GetPerformanceInsightsDetailDataByAccountIdRequest createGetPerformanceInsightsDetailDataByAccountIdRequest() {
        return new GetPerformanceInsightsDetailDataByAccountIdRequest();
    }

    /**
     * Create an instance of {@link DayMonthAndYear }
     * 
     */
    public DayMonthAndYear createDayMonthAndYear() {
        return new DayMonthAndYear();
    }

    /**
     * Create an instance of {@link GetKeywordLocationsResponse }
     * 
     */
    public GetKeywordLocationsResponse createGetKeywordLocationsResponse() {
        return new GetKeywordLocationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordLocationResult }
     * 
     */
    public ArrayOfKeywordLocationResult createArrayOfKeywordLocationResult() {
        return new ArrayOfKeywordLocationResult();
    }

    /**
     * Create an instance of {@link BatchError }
     * 
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link GetKeywordLocationsRequest }
     * 
     */
    public GetKeywordLocationsRequest createGetKeywordLocationsRequest() {
        return new GetKeywordLocationsRequest();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link DateRangeSearchParameter }
     * 
     */
    public DateRangeSearchParameter createDateRangeSearchParameter() {
        return new DateRangeSearchParameter();
    }

    /**
     * Create an instance of {@link GetEstimatedBidByKeywordIdsResponse }
     * 
     */
    public GetEstimatedBidByKeywordIdsResponse createGetEstimatedBidByKeywordIdsResponse() {
        return new GetEstimatedBidByKeywordIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordIdEstimatedBid }
     * 
     */
    public ArrayOfKeywordIdEstimatedBid createArrayOfKeywordIdEstimatedBid() {
        return new ArrayOfKeywordIdEstimatedBid();
    }

    /**
     * Create an instance of {@link GetEstimatedPositionByKeywordIdsRequest }
     * 
     */
    public GetEstimatedPositionByKeywordIdsRequest createGetEstimatedPositionByKeywordIdsRequest() {
        return new GetEstimatedPositionByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link NetworkCriterion }
     * 
     */
    public NetworkCriterion createNetworkCriterion() {
        return new NetworkCriterion();
    }

    /**
     * Create an instance of {@link AdGroupBidLandscape }
     * 
     */
    public AdGroupBidLandscape createAdGroupBidLandscape() {
        return new AdGroupBidLandscape();
    }

    /**
     * Create an instance of {@link ArrayOfKeyword }
     * 
     */
    public ArrayOfKeyword createArrayOfKeyword() {
        return new ArrayOfKeyword();
    }

    /**
     * Create an instance of {@link ArrayOfEntityDetail }
     * 
     */
    public ArrayOfEntityDetail createArrayOfEntityDetail() {
        return new ArrayOfEntityDetail();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordSearchCount }
     * 
     */
    public ArrayOfKeywordSearchCount createArrayOfKeywordSearchCount() {
        return new ArrayOfKeywordSearchCount();
    }

    /**
     * Create an instance of {@link IdeaTextSearchParameter }
     * 
     */
    public IdeaTextSearchParameter createIdeaTextSearchParameter() {
        return new IdeaTextSearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfNegativeKeyword }
     * 
     */
    public ArrayOfNegativeKeyword createArrayOfNegativeKeyword() {
        return new ArrayOfNegativeKeyword();
    }

    /**
     * Create an instance of {@link PerformanceInsightsMessageParameter }
     * 
     */
    public PerformanceInsightsMessageParameter createPerformanceInsightsMessageParameter() {
        return new PerformanceInsightsMessageParameter();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupEstimator }
     * 
     */
    public ArrayOfAdGroupEstimator createArrayOfAdGroupEstimator() {
        return new ArrayOfAdGroupEstimator();
    }

    /**
     * Create an instance of {@link HistoricalSearchCountPeriodic }
     * 
     */
    public HistoricalSearchCountPeriodic createHistoricalSearchCountPeriodic() {
        return new HistoricalSearchCountPeriodic();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordLocation }
     * 
     */
    public ArrayOfKeywordLocation createArrayOfKeywordLocation() {
        return new ArrayOfKeywordLocation();
    }

    /**
     * Create an instance of {@link GetHistoricalKeywordPerformanceRequest }
     * 
     */
    public GetHistoricalKeywordPerformanceRequest createGetHistoricalKeywordPerformanceRequest() {
        return new GetHistoricalKeywordPerformanceRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMatchType }
     * 
     */
    public ArrayOfMatchType createArrayOfMatchType() {
        return new ArrayOfMatchType();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignEstimate }
     * 
     */
    public ArrayOfCampaignEstimate createArrayOfCampaignEstimate() {
        return new ArrayOfCampaignEstimate();
    }

    /**
     * Create an instance of {@link GetBidOpportunitiesRequest }
     * 
     */
    public GetBidOpportunitiesRequest createGetBidOpportunitiesRequest() {
        return new GetBidOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link AuctionInsightKpi }
     * 
     */
    public AuctionInsightKpi createAuctionInsightKpi() {
        return new AuctionInsightKpi();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordIdea }
     * 
     */
    public ArrayOfKeywordIdea createArrayOfKeywordIdea() {
        return new ArrayOfKeywordIdea();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordCategoryResult }
     * 
     */
    public ArrayOfKeywordCategoryResult createArrayOfKeywordCategoryResult() {
        return new ArrayOfKeywordCategoryResult();
    }

    /**
     * Create an instance of {@link GetEstimatedPositionByKeywordsRequest }
     * 
     */
    public GetEstimatedPositionByKeywordsRequest createGetEstimatedPositionByKeywordsRequest() {
        return new GetEstimatedPositionByKeywordsRequest();
    }

    /**
     * Create an instance of {@link GetKeywordTrafficEstimatesResponse }
     * 
     */
    public GetKeywordTrafficEstimatesResponse createGetKeywordTrafficEstimatesResponse() {
        return new GetKeywordTrafficEstimatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordDemographic }
     * 
     */
    public ArrayOfKeywordDemographic createArrayOfKeywordDemographic() {
        return new ArrayOfKeywordDemographic();
    }

    /**
     * Create an instance of {@link UrlSearchParameter }
     * 
     */
    public UrlSearchParameter createUrlSearchParameter() {
        return new UrlSearchParameter();
    }

    /**
     * Create an instance of {@link KeywordLocationResult }
     * 
     */
    public KeywordLocationResult createKeywordLocationResult() {
        return new KeywordLocationResult();
    }

    /**
     * Create an instance of {@link LanguageCriterion }
     * 
     */
    public LanguageCriterion createLanguageCriterion() {
        return new LanguageCriterion();
    }

    /**
     * Create an instance of {@link KeywordOpportunity }
     * 
     */
    public KeywordOpportunity createKeywordOpportunity() {
        return new KeywordOpportunity();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByKeywordIdsResponse }
     * 
     */
    public GetBidLandscapeByKeywordIdsResponse createGetBidLandscapeByKeywordIdsResponse() {
        return new GetBidLandscapeByKeywordIdsResponse();
    }

    /**
     * Create an instance of {@link GetAutoApplyOptInStatusRequest }
     * 
     */
    public GetAutoApplyOptInStatusRequest createGetAutoApplyOptInStatusRequest() {
        return new GetAutoApplyOptInStatusRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAuctionInsightEntry }
     * 
     */
    public ArrayOfAuctionInsightEntry createArrayOfAuctionInsightEntry() {
        return new ArrayOfAuctionInsightEntry();
    }

    /**
     * Create an instance of {@link ArrayOfDomainCategory }
     * 
     */
    public ArrayOfDomainCategory createArrayOfDomainCategory() {
        return new ArrayOfDomainCategory();
    }

    /**
     * Create an instance of {@link GetKeywordCategoriesRequest }
     * 
     */
    public GetKeywordCategoriesRequest createGetKeywordCategoriesRequest() {
        return new GetKeywordCategoriesRequest();
    }

    /**
     * Create an instance of {@link PutMetricDataResponse }
     * 
     */
    public PutMetricDataResponse createPutMetricDataResponse() {
        return new PutMetricDataResponse();
    }

    /**
     * Create an instance of {@link QuerySearchParameter }
     * 
     */
    public QuerySearchParameter createQuerySearchParameter() {
        return new QuerySearchParameter();
    }

    /**
     * Create an instance of {@link Criterion }
     * 
     */
    public Criterion createCriterion() {
        return new Criterion();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link BroadMatchKeywordOpportunity }
     * 
     */
    public BroadMatchKeywordOpportunity createBroadMatchKeywordOpportunity() {
        return new BroadMatchKeywordOpportunity();
    }

    /**
     * Create an instance of {@link CompetitionSearchParameter }
     * 
     */
    public CompetitionSearchParameter createCompetitionSearchParameter() {
        return new CompetitionSearchParameter();
    }

    /**
     * Create an instance of {@link SuggestKeywordsFromExistingKeywordsResponse }
     * 
     */
    public SuggestKeywordsFromExistingKeywordsResponse createSuggestKeywordsFromExistingKeywordsResponse() {
        return new SuggestKeywordsFromExistingKeywordsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordSuggestion }
     * 
     */
    public ArrayOfKeywordSuggestion createArrayOfKeywordSuggestion() {
        return new ArrayOfKeywordSuggestion();
    }

    /**
     * Create an instance of {@link GetBidOpportunitiesResponse }
     * 
     */
    public GetBidOpportunitiesResponse createGetBidOpportunitiesResponse() {
        return new GetBidOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBidOpportunity }
     * 
     */
    public ArrayOfBidOpportunity createArrayOfBidOpportunity() {
        return new ArrayOfBidOpportunity();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupEstimate }
     * 
     */
    public ArrayOfAdGroupEstimate createArrayOfAdGroupEstimate() {
        return new ArrayOfAdGroupEstimate();
    }

    /**
     * Create an instance of {@link ArrayOfCompetitionLevel }
     * 
     */
    public ArrayOfCompetitionLevel createArrayOfCompetitionLevel() {
        return new ArrayOfCompetitionLevel();
    }

    /**
     * Create an instance of {@link GetHistoricalSearchCountRequest }
     * 
     */
    public GetHistoricalSearchCountRequest createGetHistoricalSearchCountRequest() {
        return new GetHistoricalSearchCountRequest();
    }

    /**
     * Create an instance of {@link AutoApplyRecommendationsInfo }
     * 
     */
    public AutoApplyRecommendationsInfo createAutoApplyRecommendationsInfo() {
        return new AutoApplyRecommendationsInfo();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByAdGroupIdsResponse }
     * 
     */
    public GetBidLandscapeByAdGroupIdsResponse createGetBidLandscapeByAdGroupIdsResponse() {
        return new GetBidLandscapeByAdGroupIdsResponse();
    }

    /**
     * Create an instance of {@link AdGroupBidLandscapeInput }
     * 
     */
    public AdGroupBidLandscapeInput createAdGroupBidLandscapeInput() {
        return new AdGroupBidLandscapeInput();
    }

    /**
     * Create an instance of {@link GetKeywordIdeasRequest }
     * 
     */
    public GetKeywordIdeasRequest createGetKeywordIdeasRequest() {
        return new GetKeywordIdeasRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignEstimator }
     * 
     */
    public ArrayOfCampaignEstimator createArrayOfCampaignEstimator() {
        return new ArrayOfCampaignEstimator();
    }

    /**
     * Create an instance of {@link KeywordEstimate }
     * 
     */
    public KeywordEstimate createKeywordEstimate() {
        return new KeywordEstimate();
    }

    /**
     * Create an instance of {@link BidOpportunity }
     * 
     */
    public BidOpportunity createBidOpportunity() {
        return new BidOpportunity();
    }

    /**
     * Create an instance of {@link SetAutoApplyOptInStatusRequest }
     * 
     */
    public SetAutoApplyOptInStatusRequest createSetAutoApplyOptInStatusRequest() {
        return new SetAutoApplyOptInStatusRequest();
    }

    /**
     * Create an instance of {@link ArrayOfEstimatedBidAndTraffic }
     * 
     */
    public ArrayOfEstimatedBidAndTraffic createArrayOfEstimatedBidAndTraffic() {
        return new ArrayOfEstimatedBidAndTraffic();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetOpportunity }
     * 
     */
    public ArrayOfBudgetOpportunity createArrayOfBudgetOpportunity() {
        return new ArrayOfBudgetOpportunity();
    }

    /**
     * Create an instance of {@link BroadMatchSearchQueryKPI }
     * 
     */
    public BroadMatchSearchQueryKPI createBroadMatchSearchQueryKPI() {
        return new BroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link BudgetPoint }
     * 
     */
    public BudgetPoint createBudgetPoint() {
        return new BudgetPoint();
    }

    /**
     * Create an instance of {@link KeywordIdeaCategory }
     * 
     */
    public KeywordIdeaCategory createKeywordIdeaCategory() {
        return new KeywordIdeaCategory();
    }

    /**
     * Create an instance of {@link GetEstimatedPositionByKeywordIdsResponse }
     * 
     */
    public GetEstimatedPositionByKeywordIdsResponse createGetEstimatedPositionByKeywordIdsResponse() {
        return new GetEstimatedPositionByKeywordIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordIdEstimatedPosition }
     * 
     */
    public ArrayOfKeywordIdEstimatedPosition createArrayOfKeywordIdEstimatedPosition() {
        return new ArrayOfKeywordIdEstimatedPosition();
    }

    /**
     * Create an instance of {@link EntityDetail }
     * 
     */
    public EntityDetail createEntityDetail() {
        return new EntityDetail();
    }

    /**
     * Create an instance of {@link BidLandscapePoint }
     * 
     */
    public BidLandscapePoint createBidLandscapePoint() {
        return new BidLandscapePoint();
    }

    /**
     * Create an instance of {@link KeywordCategory }
     * 
     */
    public KeywordCategory createKeywordCategory() {
        return new KeywordCategory();
    }

    /**
     * Create an instance of {@link GetKeywordIdeaCategoriesRequest }
     * 
     */
    public GetKeywordIdeaCategoriesRequest createGetKeywordIdeaCategoriesRequest() {
        return new GetKeywordIdeaCategoriesRequest();
    }

    /**
     * Create an instance of {@link KeywordHistoricalPerformance }
     * 
     */
    public KeywordHistoricalPerformance createKeywordHistoricalPerformance() {
        return new KeywordHistoricalPerformance();
    }

    /**
     * Create an instance of {@link GetBudgetOpportunitiesRequest }
     * 
     */
    public GetBudgetOpportunitiesRequest createGetBudgetOpportunitiesRequest() {
        return new GetBudgetOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link GetDomainCategoriesResponse }
     * 
     */
    public GetDomainCategoriesResponse createGetDomainCategoriesResponse() {
        return new GetDomainCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetPerformanceInsightsDetailDataByAccountIdResponse }
     * 
     */
    public GetPerformanceInsightsDetailDataByAccountIdResponse createGetPerformanceInsightsDetailDataByAccountIdResponse() {
        return new GetPerformanceInsightsDetailDataByAccountIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPerformanceInsightsDetail }
     * 
     */
    public ArrayOfPerformanceInsightsDetail createArrayOfPerformanceInsightsDetail() {
        return new ArrayOfPerformanceInsightsDetail();
    }

    /**
     * Create an instance of {@link ExcludeAccountKeywordsSearchParameter }
     * 
     */
    public ExcludeAccountKeywordsSearchParameter createExcludeAccountKeywordsSearchParameter() {
        return new ExcludeAccountKeywordsSearchParameter();
    }

    /**
     * Create an instance of {@link KeywordEstimatedPosition }
     * 
     */
    public KeywordEstimatedPosition createKeywordEstimatedPosition() {
        return new KeywordEstimatedPosition();
    }

    /**
     * Create an instance of {@link ArrayOfLocationCriterion }
     * 
     */
    public ArrayOfLocationCriterion createArrayOfLocationCriterion() {
        return new ArrayOfLocationCriterion();
    }

    /**
     * Create an instance of {@link GetKeywordOpportunitiesRequest }
     * 
     */
    public GetKeywordOpportunitiesRequest createGetKeywordOpportunitiesRequest() {
        return new GetKeywordOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link SearchParameter }
     * 
     */
    public SearchParameter createSearchParameter() {
        return new SearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfSearchCountsByAttributes }
     * 
     */
    public ArrayOfSearchCountsByAttributes createArrayOfSearchCountsByAttributes() {
        return new ArrayOfSearchCountsByAttributes();
    }

    /**
     * Create an instance of {@link SearchVolumeSearchParameter }
     * 
     */
    public SearchVolumeSearchParameter createSearchVolumeSearchParameter() {
        return new SearchVolumeSearchParameter();
    }

    /**
     * Create an instance of {@link SuggestedBidSearchParameter }
     * 
     */
    public SuggestedBidSearchParameter createSuggestedBidSearchParameter() {
        return new SuggestedBidSearchParameter();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link LocationSearchParameter }
     * 
     */
    public LocationSearchParameter createLocationSearchParameter() {
        return new LocationSearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfAutoApplyRecommendationsInfo }
     * 
     */
    public ArrayOfAutoApplyRecommendationsInfo createArrayOfAutoApplyRecommendationsInfo() {
        return new ArrayOfAutoApplyRecommendationsInfo();
    }

    /**
     * Create an instance of {@link KeywordEstimator }
     * 
     */
    public KeywordEstimator createKeywordEstimator() {
        return new KeywordEstimator();
    }

    /**
     * Create an instance of {@link DomainCategory }
     * 
     */
    public DomainCategory createDomainCategory() {
        return new DomainCategory();
    }

    /**
     * Create an instance of {@link AdGroupEstimator }
     * 
     */
    public AdGroupEstimator createAdGroupEstimator() {
        return new AdGroupEstimator();
    }

    /**
     * Create an instance of {@link GetHistoricalSearchCountResponse }
     * 
     */
    public GetHistoricalSearchCountResponse createGetHistoricalSearchCountResponse() {
        return new GetHistoricalSearchCountResponse();
    }

    /**
     * Create an instance of {@link KeywordDemographicResult }
     * 
     */
    public KeywordDemographicResult createKeywordDemographicResult() {
        return new KeywordDemographicResult();
    }

    /**
     * Create an instance of {@link GetAuctionInsightDataResponse }
     * 
     */
    public GetAuctionInsightDataResponse createGetAuctionInsightDataResponse() {
        return new GetAuctionInsightDataResponse();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByKeywordIdsRequest }
     * 
     */
    public GetBidLandscapeByKeywordIdsRequest createGetBidLandscapeByKeywordIdsRequest() {
        return new GetBidLandscapeByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAuctionInsightKpi }
     * 
     */
    public ArrayOfAuctionInsightKpi createArrayOfAuctionInsightKpi() {
        return new ArrayOfAuctionInsightKpi();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordKPI }
     * 
     */
    public ArrayOfKeywordKPI createArrayOfKeywordKPI() {
        return new ArrayOfKeywordKPI();
    }

    /**
     * Create an instance of {@link GetKeywordCategoriesResponse }
     * 
     */
    public GetKeywordCategoriesResponse createGetKeywordCategoriesResponse() {
        return new GetKeywordCategoriesResponse();
    }

    /**
     * Create an instance of {@link KeywordIdEstimatedBid }
     * 
     */
    public KeywordIdEstimatedBid createKeywordIdEstimatedBid() {
        return new KeywordIdEstimatedBid();
    }

    /**
     * Create an instance of {@link ArrayOfBroadMatchSearchQueryKPI }
     * 
     */
    public ArrayOfBroadMatchSearchQueryKPI createArrayOfBroadMatchSearchQueryKPI() {
        return new ArrayOfBroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link ArrayOfMetricData }
     * 
     */
    public ArrayOfMetricData createArrayOfMetricData() {
        return new ArrayOfMetricData();
    }

    /**
     * Create an instance of {@link KeywordLocation }
     * 
     */
    public KeywordLocation createKeywordLocation() {
        return new KeywordLocation();
    }

    /**
     * Create an instance of {@link LocationCriterion }
     * 
     */
    public LocationCriterion createLocationCriterion() {
        return new LocationCriterion();
    }

    /**
     * Create an instance of {@link GetEstimatedPositionByKeywordsResponse }
     * 
     */
    public GetEstimatedPositionByKeywordsResponse createGetEstimatedPositionByKeywordsResponse() {
        return new GetEstimatedPositionByKeywordsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordEstimatedPosition }
     * 
     */
    public ArrayOfKeywordEstimatedPosition createArrayOfKeywordEstimatedPosition() {
        return new ArrayOfKeywordEstimatedPosition();
    }

    /**
     * Create an instance of {@link KeywordIdea }
     * 
     */
    public KeywordIdea createKeywordIdea() {
        return new KeywordIdea();
    }

    /**
     * Create an instance of {@link SuggestKeywordsFromExistingKeywordsRequest }
     * 
     */
    public SuggestKeywordsFromExistingKeywordsRequest createSuggestKeywordsFromExistingKeywordsRequest() {
        return new SuggestKeywordsFromExistingKeywordsRequest();
    }

    /**
     * Create an instance of {@link LanguageSearchParameter }
     * 
     */
    public LanguageSearchParameter createLanguageSearchParameter() {
        return new LanguageSearchParameter();
    }

    /**
     * Create an instance of {@link ArrayOfEstimatedPositionAndTraffic }
     * 
     */
    public ArrayOfEstimatedPositionAndTraffic createArrayOfEstimatedPositionAndTraffic() {
        return new ArrayOfEstimatedPositionAndTraffic();
    }

    /**
     * Create an instance of {@link GetEstimatedBidByKeywordsRequest }
     * 
     */
    public GetEstimatedBidByKeywordsRequest createGetEstimatedBidByKeywordsRequest() {
        return new GetEstimatedBidByKeywordsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordAndMatchType }
     * 
     */
    public ArrayOfKeywordAndMatchType createArrayOfKeywordAndMatchType() {
        return new ArrayOfKeywordAndMatchType();
    }

    /**
     * Create an instance of {@link CampaignEstimator }
     * 
     */
    public CampaignEstimator createCampaignEstimator() {
        return new CampaignEstimator();
    }

    /**
     * Create an instance of {@link GetKeywordIdeasResponse }
     * 
     */
    public GetKeywordIdeasResponse createGetKeywordIdeasResponse() {
        return new GetKeywordIdeasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBidLandscapePoint }
     * 
     */
    public ArrayOfBidLandscapePoint createArrayOfBidLandscapePoint() {
        return new ArrayOfBidLandscapePoint();
    }

    /**
     * Create an instance of {@link SetAutoApplyOptInStatusResponse }
     * 
     */
    public SetAutoApplyOptInStatusResponse createSetAutoApplyOptInStatusResponse() {
        return new SetAutoApplyOptInStatusResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
    }

    /**
     * Create an instance of {@link ArrayOfOperationError }
     * 
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
    }

    /**
     * Create an instance of {@link GetBudgetOpportunitiesResponse }
     * 
     */
    public GetBudgetOpportunitiesResponse createGetBudgetOpportunitiesResponse() {
        return new GetBudgetOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link AdGroupEstimate }
     * 
     */
    public AdGroupEstimate createAdGroupEstimate() {
        return new AdGroupEstimate();
    }

    /**
     * Create an instance of {@link PutMetricDataRequest }
     * 
     */
    public PutMetricDataRequest createPutMetricDataRequest() {
        return new PutMetricDataRequest();
    }

    /**
     * Create an instance of {@link KeywordKPI }
     * 
     */
    public KeywordKPI createKeywordKPI() {
        return new KeywordKPI();
    }

    /**
     * Create an instance of {@link BudgetOpportunity }
     * 
     */
    public BudgetOpportunity createBudgetOpportunity() {
        return new BudgetOpportunity();
    }

    /**
     * Create an instance of {@link KeywordDemographic }
     * 
     */
    public KeywordDemographic createKeywordDemographic() {
        return new KeywordDemographic();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalSearchCountPeriodic }
     * 
     */
    public ArrayOfHistoricalSearchCountPeriodic createArrayOfHistoricalSearchCountPeriodic() {
        return new ArrayOfHistoricalSearchCountPeriodic();
    }

    /**
     * Create an instance of {@link TrafficEstimate }
     * 
     */
    public TrafficEstimate createTrafficEstimate() {
        return new TrafficEstimate();
    }

    /**
     * Create an instance of {@link KeywordIdEstimatedPosition }
     * 
     */
    public KeywordIdEstimatedPosition createKeywordIdEstimatedPosition() {
        return new KeywordIdEstimatedPosition();
    }

    /**
     * Create an instance of {@link ArrayOfCriterion }
     * 
     */
    public ArrayOfCriterion createArrayOfCriterion() {
        return new ArrayOfCriterion();
    }

    /**
     * Create an instance of {@link UrlParameter }
     * 
     */
    public UrlParameter createUrlParameter() {
        return new UrlParameter();
    }

    /**
     * Create an instance of {@link GetKeywordTrafficEstimatesRequest }
     * 
     */
    public GetKeywordTrafficEstimatesRequest createGetKeywordTrafficEstimatesRequest() {
        return new GetKeywordTrafficEstimatesRequest();
    }

    /**
     * Create an instance of {@link PerformanceInsightsMessage }
     * 
     */
    public PerformanceInsightsMessage createPerformanceInsightsMessage() {
        return new PerformanceInsightsMessage();
    }

    /**
     * Create an instance of {@link KeywordEstimatedBid }
     * 
     */
    public KeywordEstimatedBid createKeywordEstimatedBid() {
        return new KeywordEstimatedBid();
    }

    /**
     * Create an instance of {@link NegativeKeyword }
     * 
     */
    public NegativeKeyword createNegativeKeyword() {
        return new NegativeKeyword();
    }

    /**
     * Create an instance of {@link GetAutoApplyOptInStatusResponse }
     * 
     */
    public GetAutoApplyOptInStatusResponse createGetAutoApplyOptInStatusResponse() {
        return new GetAutoApplyOptInStatusResponse();
    }

    /**
     * Create an instance of {@link NetworkSearchParameter }
     * 
     */
    public NetworkSearchParameter createNetworkSearchParameter() {
        return new NetworkSearchParameter();
    }

    /**
     * Create an instance of {@link SearchCountsByAttributes }
     * 
     */
    public SearchCountsByAttributes createSearchCountsByAttributes() {
        return new SearchCountsByAttributes();
    }

    /**
     * Create an instance of {@link GetKeywordIdeaCategoriesResponse }
     * 
     */
    public GetKeywordIdeaCategoriesResponse createGetKeywordIdeaCategoriesResponse() {
        return new GetKeywordIdeaCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordIdeaCategory }
     * 
     */
    public ArrayOfKeywordIdeaCategory createArrayOfKeywordIdeaCategory() {
        return new ArrayOfKeywordIdeaCategory();
    }

    /**
     * Create an instance of {@link KeywordSearchCount }
     * 
     */
    public KeywordSearchCount createKeywordSearchCount() {
        return new KeywordSearchCount();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageCriterion }
     * 
     */
    public ArrayOfLanguageCriterion createArrayOfLanguageCriterion() {
        return new ArrayOfLanguageCriterion();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPerformanceInsightsMessage }
     * 
     */
    public ArrayOfPerformanceInsightsMessage createArrayOfPerformanceInsightsMessage() {
        return new ArrayOfPerformanceInsightsMessage();
    }

    /**
     * Create an instance of {@link MetricData }
     * 
     */
    public MetricData createMetricData() {
        return new MetricData();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "QuerySearchParameter")
    public JAXBElement<QuerySearchParameter> createQuerySearchParameter(QuerySearchParameter value) {
        return new JAXBElement<QuerySearchParameter>(_QuerySearchParameter_QNAME, QuerySearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordDemographicResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordDemographicResult")
    public JAXBElement<ArrayOfKeywordDemographicResult> createArrayOfKeywordDemographicResult(ArrayOfKeywordDemographicResult value) {
        return new JAXBElement<ArrayOfKeywordDemographicResult>(_ArrayOfKeywordDemographicResult_QNAME, ArrayOfKeywordDemographicResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuctionInsightEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAuctionInsightEntry")
    public JAXBElement<ArrayOfAuctionInsightEntry> createArrayOfAuctionInsightEntry(ArrayOfAuctionInsightEntry value) {
        return new JAXBElement<ArrayOfAuctionInsightEntry>(_ArrayOfAuctionInsightEntry_QNAME, ArrayOfAuctionInsightEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfDomainCategory")
    public JAXBElement<ArrayOfDomainCategory> createArrayOfDomainCategory(ArrayOfDomainCategory value) {
        return new JAXBElement<ArrayOfDomainCategory>(_ArrayOfDomainCategory_QNAME, ArrayOfDomainCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CompetitionSearchParameter")
    public JAXBElement<CompetitionSearchParameter> createCompetitionSearchParameter(CompetitionSearchParameter value) {
        return new JAXBElement<CompetitionSearchParameter>(_CompetitionSearchParameter_QNAME, CompetitionSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BroadMatchKeywordOpportunity")
    public JAXBElement<BroadMatchKeywordOpportunity> createBroadMatchKeywordOpportunity(BroadMatchKeywordOpportunity value) {
        return new JAXBElement<BroadMatchKeywordOpportunity>(_BroadMatchKeywordOpportunity_QNAME, BroadMatchKeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "Criterion")
    public JAXBElement<Criterion> createCriterion(Criterion value) {
        return new JAXBElement<Criterion>(_Criterion_QNAME, Criterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "Opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompetitionLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfCompetitionLevel")
    public JAXBElement<ArrayOfCompetitionLevel> createArrayOfCompetitionLevel(ArrayOfCompetitionLevel value) {
        return new JAXBElement<ArrayOfCompetitionLevel>(_ArrayOfCompetitionLevel_QNAME, ArrayOfCompetitionLevel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoApplyRecommendationsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AutoApplyRecommendationsInfo")
    public JAXBElement<AutoApplyRecommendationsInfo> createAutoApplyRecommendationsInfo(AutoApplyRecommendationsInfo value) {
        return new JAXBElement<AutoApplyRecommendationsInfo>(_AutoApplyRecommendationsInfo_QNAME, AutoApplyRecommendationsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordLocationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordLocationResult")
    public JAXBElement<ArrayOfKeywordLocationResult> createArrayOfKeywordLocationResult(ArrayOfKeywordLocationResult value) {
        return new JAXBElement<ArrayOfKeywordLocationResult>(_ArrayOfKeywordLocationResult_QNAME, ArrayOfKeywordLocationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "TimeInterval")
    public JAXBElement<TimeInterval> createTimeInterval(TimeInterval value) {
        return new JAXBElement<TimeInterval>(_TimeInterval_QNAME, TimeInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAdGroupEstimate")
    public JAXBElement<ArrayOfAdGroupEstimate> createArrayOfAdGroupEstimate(ArrayOfAdGroupEstimate value) {
        return new JAXBElement<ArrayOfAdGroupEstimate>(_ArrayOfAdGroupEstimate_QNAME, ArrayOfAdGroupEstimate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfCampaignEstimator")
    public JAXBElement<ArrayOfCampaignEstimator> createArrayOfCampaignEstimator(ArrayOfCampaignEstimator value) {
        return new JAXBElement<ArrayOfCampaignEstimator>(_ArrayOfCampaignEstimator_QNAME, ArrayOfCampaignEstimator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetAdPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "TargetAdPosition")
    public JAXBElement<TargetAdPosition> createTargetAdPosition(TargetAdPosition value) {
        return new JAXBElement<TargetAdPosition>(_TargetAdPosition_QNAME, TargetAdPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KPIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KPIType")
    public JAXBElement<KPIType> createKPIType(KPIType value) {
        return new JAXBElement<KPIType>(_KPIType_QNAME, KPIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordEstimate")
    public JAXBElement<KeywordEstimate> createKeywordEstimate(KeywordEstimate value) {
        return new JAXBElement<KeywordEstimate>(_KeywordEstimate_QNAME, KeywordEstimate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscapeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdGroupBidLandscapeInput")
    public JAXBElement<AdGroupBidLandscapeInput> createAdGroupBidLandscapeInput(AdGroupBidLandscapeInput value) {
        return new JAXBElement<AdGroupBidLandscapeInput>(_AdGroupBidLandscapeInput_QNAME, AdGroupBidLandscapeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsMessageParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsMessageParameter")
    public JAXBElement<PerformanceInsightsMessageParameter> createPerformanceInsightsMessageParameter(PerformanceInsightsMessageParameter value) {
        return new JAXBElement<PerformanceInsightsMessageParameter>(_PerformanceInsightsMessageParameter_QNAME, PerformanceInsightsMessageParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAdGroupEstimator")
    public JAXBElement<ArrayOfAdGroupEstimator> createArrayOfAdGroupEstimator(ArrayOfAdGroupEstimator value) {
        return new JAXBElement<ArrayOfAdGroupEstimator>(_ArrayOfAdGroupEstimator_QNAME, ArrayOfAdGroupEstimator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalSearchCountPeriodic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "HistoricalSearchCountPeriodic")
    public JAXBElement<HistoricalSearchCountPeriodic> createHistoricalSearchCountPeriodic(HistoricalSearchCountPeriodic value) {
        return new JAXBElement<HistoricalSearchCountPeriodic>(_HistoricalSearchCountPeriodic_QNAME, HistoricalSearchCountPeriodic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfEntityDetail")
    public JAXBElement<ArrayOfEntityDetail> createArrayOfEntityDetail(ArrayOfEntityDetail value) {
        return new JAXBElement<ArrayOfEntityDetail>(_ArrayOfEntityDetail_QNAME, ArrayOfEntityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdeaTextSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "IdeaTextSearchParameter")
    public JAXBElement<IdeaTextSearchParameter> createIdeaTextSearchParameter(IdeaTextSearchParameter value) {
        return new JAXBElement<IdeaTextSearchParameter>(_IdeaTextSearchParameter_QNAME, IdeaTextSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordSearchCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordSearchCount")
    public JAXBElement<ArrayOfKeywordSearchCount> createArrayOfKeywordSearchCount(ArrayOfKeywordSearchCount value) {
        return new JAXBElement<ArrayOfKeywordSearchCount>(_ArrayOfKeywordSearchCount_QNAME, ArrayOfKeywordSearchCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "SourceType")
    public JAXBElement<SourceType> createSourceType(SourceType value) {
        return new JAXBElement<SourceType>(_SourceType_QNAME, SourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfNegativeKeyword")
    public JAXBElement<ArrayOfNegativeKeyword> createArrayOfNegativeKeyword(ArrayOfNegativeKeyword value) {
        return new JAXBElement<ArrayOfNegativeKeyword>(_ArrayOfNegativeKeyword_QNAME, ArrayOfNegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordLocation")
    public JAXBElement<ArrayOfKeywordLocation> createArrayOfKeywordLocation(ArrayOfKeywordLocation value) {
        return new JAXBElement<ArrayOfKeywordLocation>(_ArrayOfKeywordLocation_QNAME, ArrayOfKeywordLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordHistoricalPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordHistoricalPerformance")
    public JAXBElement<ArrayOfKeywordHistoricalPerformance> createArrayOfKeywordHistoricalPerformance(ArrayOfKeywordHistoricalPerformance value) {
        return new JAXBElement<ArrayOfKeywordHistoricalPerformance>(_ArrayOfKeywordHistoricalPerformance_QNAME, ArrayOfKeywordHistoricalPerformance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfCampaignEstimate")
    public JAXBElement<ArrayOfCampaignEstimate> createArrayOfCampaignEstimate(ArrayOfCampaignEstimate value) {
        return new JAXBElement<ArrayOfCampaignEstimate>(_ArrayOfCampaignEstimate_QNAME, ArrayOfCampaignEstimate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordDemographic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordDemographic")
    public JAXBElement<ArrayOfKeywordDemographic> createArrayOfKeywordDemographic(ArrayOfKeywordDemographic value) {
        return new JAXBElement<ArrayOfKeywordDemographic>(_ArrayOfKeywordDemographic_QNAME, ArrayOfKeywordDemographic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "UrlSearchParameter")
    public JAXBElement<UrlSearchParameter> createUrlSearchParameter(UrlSearchParameter value) {
        return new JAXBElement<UrlSearchParameter>(_UrlSearchParameter_QNAME, UrlSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordLocationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordLocationResult")
    public JAXBElement<KeywordLocationResult> createKeywordLocationResult(KeywordLocationResult value) {
        return new JAXBElement<KeywordLocationResult>(_KeywordLocationResult_QNAME, KeywordLocationResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordCategoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordCategoryResult")
    public JAXBElement<ArrayOfKeywordCategoryResult> createArrayOfKeywordCategoryResult(ArrayOfKeywordCategoryResult value) {
        return new JAXBElement<ArrayOfKeywordCategoryResult>(_ArrayOfKeywordCategoryResult_QNAME, ArrayOfKeywordCategoryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightKpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionInsightKpi")
    public JAXBElement<AuctionInsightKpi> createAuctionInsightKpi(AuctionInsightKpi value) {
        return new JAXBElement<AuctionInsightKpi>(_AuctionInsightKpi_QNAME, AuctionInsightKpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordIdea")
    public JAXBElement<ArrayOfKeywordIdea> createArrayOfKeywordIdea(ArrayOfKeywordIdea value) {
        return new JAXBElement<ArrayOfKeywordIdea>(_ArrayOfKeywordIdea_QNAME, ArrayOfKeywordIdea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "LanguageCriterion")
    public JAXBElement<LanguageCriterion> createLanguageCriterion(LanguageCriterion value) {
        return new JAXBElement<LanguageCriterion>(_LanguageCriterion_QNAME, LanguageCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordOpportunity")
    public JAXBElement<KeywordOpportunity> createKeywordOpportunity(KeywordOpportunity value) {
        return new JAXBElement<KeywordOpportunity>(_KeywordOpportunity_QNAME, KeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionInsightResult")
    public JAXBElement<AuctionInsightResult> createAuctionInsightResult(AuctionInsightResult value) {
        return new JAXBElement<AuctionInsightResult>(_AuctionInsightResult_QNAME, AuctionInsightResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionInsightEntry")
    public JAXBElement<AuctionInsightEntry> createAuctionInsightEntry(AuctionInsightEntry value) {
        return new JAXBElement<AuctionInsightEntry>(_AuctionInsightEntry_QNAME, AuctionInsightEntry.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdeaAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordIdeaAttribute")
    public JAXBElement<ArrayOfKeywordIdeaAttribute> createArrayOfKeywordIdeaAttribute(ArrayOfKeywordIdeaAttribute value) {
        return new JAXBElement<ArrayOfKeywordIdeaAttribute>(_ArrayOfKeywordIdeaAttribute_QNAME, ArrayOfKeywordIdeaAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerformanceInsightsMessageParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfPerformanceInsightsMessageParameter")
    public JAXBElement<ArrayOfPerformanceInsightsMessageParameter> createArrayOfPerformanceInsightsMessageParameter(ArrayOfPerformanceInsightsMessageParameter value) {
        return new JAXBElement<ArrayOfPerformanceInsightsMessageParameter>(_ArrayOfPerformanceInsightsMessageParameter_QNAME, ArrayOfPerformanceInsightsMessageParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsUrlCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsUrlCategory")
    public JAXBElement<PerformanceInsightsUrlCategory> createPerformanceInsightsUrlCategory(PerformanceInsightsUrlCategory value) {
        return new JAXBElement<PerformanceInsightsUrlCategory>(_PerformanceInsightsUrlCategory_QNAME, PerformanceInsightsUrlCategory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAdGroupBidLandscape")
    public JAXBElement<ArrayOfAdGroupBidLandscape> createArrayOfAdGroupBidLandscape(ArrayOfAdGroupBidLandscape value) {
        return new JAXBElement<ArrayOfAdGroupBidLandscape>(_ArrayOfAdGroupBidLandscape_QNAME, ArrayOfAdGroupBidLandscape.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TextParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "TextParameter")
    public JAXBElement<TextParameter> createTextParameter(TextParameter value) {
        return new JAXBElement<TextParameter>(_TextParameter_QNAME, TextParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CampaignEstimate")
    public JAXBElement<CampaignEstimate> createCampaignEstimate(CampaignEstimate value) {
        return new JAXBElement<CampaignEstimate>(_CampaignEstimate_QNAME, CampaignEstimate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRangeSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DateRangeSearchParameter")
    public JAXBElement<DateRangeSearchParameter> createDateRangeSearchParameter(DateRangeSearchParameter value) {
        return new JAXBElement<DateRangeSearchParameter>(_DateRangeSearchParameter_QNAME, DateRangeSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionSegment")
    public JAXBElement<AuctionSegment> createAuctionSegment(AuctionSegment value) {
        return new JAXBElement<AuctionSegment>(_AuctionSegment_QNAME, AuctionSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsEntityType")
    public JAXBElement<PerformanceInsightsEntityType> createPerformanceInsightsEntityType(PerformanceInsightsEntityType value) {
        return new JAXBElement<PerformanceInsightsEntityType>(_PerformanceInsightsEntityType_QNAME, PerformanceInsightsEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "NetworkCriterion")
    public JAXBElement<NetworkCriterion> createNetworkCriterion(NetworkCriterion value) {
        return new JAXBElement<NetworkCriterion>(_NetworkCriterion_QNAME, NetworkCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdGroupBidLandscape")
    public JAXBElement<AdGroupBidLandscape> createAdGroupBidLandscape(AdGroupBidLandscape value) {
        return new JAXBElement<AdGroupBidLandscape>(_AdGroupBidLandscape_QNAME, AdGroupBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeyword")
    public JAXBElement<ArrayOfKeyword> createArrayOfKeyword(ArrayOfKeyword value) {
        return new JAXBElement<ArrayOfKeyword>(_ArrayOfKeyword_QNAME, ArrayOfKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "MatchType")
    public JAXBElement<MatchType> createMatchType(MatchType value) {
        return new JAXBElement<MatchType>(_MatchType_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordEstimator")
    public JAXBElement<ArrayOfKeywordEstimator> createArrayOfKeywordEstimator(ArrayOfKeywordEstimator value) {
        return new JAXBElement<ArrayOfKeywordEstimator>(_ArrayOfKeywordEstimator_QNAME, ArrayOfKeywordEstimator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CompetitionLevel")
    public JAXBElement<CompetitionLevel> createCompetitionLevel(CompetitionLevel value) {
        return new JAXBElement<CompetitionLevel>(_CompetitionLevel_QNAME, CompetitionLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordBidLandscape")
    public JAXBElement<KeywordBidLandscape> createKeywordBidLandscape(KeywordBidLandscape value) {
        return new JAXBElement<KeywordBidLandscape>(_KeywordBidLandscape_QNAME, KeywordBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpressionShareSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ImpressionShareSearchParameter")
    public JAXBElement<ImpressionShareSearchParameter> createImpressionShareSearchParameter(ImpressionShareSearchParameter value) {
        return new JAXBElement<ImpressionShareSearchParameter>(_ImpressionShareSearchParameter_QNAME, ImpressionShareSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordBidLandscape")
    public JAXBElement<ArrayOfKeywordBidLandscape> createArrayOfKeywordBidLandscape(ArrayOfKeywordBidLandscape value) {
        return new JAXBElement<ArrayOfKeywordBidLandscape>(_ArrayOfKeywordBidLandscape_QNAME, ArrayOfKeywordBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedPositionAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "EstimatedPositionAndTraffic")
    public JAXBElement<EstimatedPositionAndTraffic> createEstimatedPositionAndTraffic(EstimatedPositionAndTraffic value) {
        return new JAXBElement<EstimatedPositionAndTraffic>(_EstimatedPositionAndTraffic_QNAME, EstimatedPositionAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DeviceCriterion")
    public JAXBElement<DeviceCriterion> createDeviceCriterion(DeviceCriterion value) {
        return new JAXBElement<DeviceCriterion>(_DeviceCriterion_QNAME, DeviceCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordCategory")
    public JAXBElement<ArrayOfKeywordCategory> createArrayOfKeywordCategory(ArrayOfKeywordCategory value) {
        return new JAXBElement<ArrayOfKeywordCategory>(_ArrayOfKeywordCategory_QNAME, ArrayOfKeywordCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordAndConfidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordAndConfidence")
    public JAXBElement<ArrayOfKeywordAndConfidence> createArrayOfKeywordAndConfidence(ArrayOfKeywordAndConfidence value) {
        return new JAXBElement<ArrayOfKeywordAndConfidence>(_ArrayOfKeywordAndConfidence_QNAME, ArrayOfKeywordAndConfidence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfSearchParameter")
    public JAXBElement<ArrayOfSearchParameter> createArrayOfSearchParameter(ArrayOfSearchParameter value) {
        return new JAXBElement<ArrayOfSearchParameter>(_ArrayOfSearchParameter_QNAME, ArrayOfSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedBidAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "EstimatedBidAndTraffic")
    public JAXBElement<EstimatedBidAndTraffic> createEstimatedBidAndTraffic(EstimatedBidAndTraffic value) {
        return new JAXBElement<EstimatedBidAndTraffic>(_EstimatedBidAndTraffic_QNAME, EstimatedBidAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CurrencyCode")
    public JAXBElement<CurrencyCode> createCurrencyCode(CurrencyCode value) {
        return new JAXBElement<CurrencyCode>(_CurrencyCode_QNAME, CurrencyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "EntityParameter")
    public JAXBElement<EntityParameter> createEntityParameter(EntityParameter value) {
        return new JAXBElement<EntityParameter>(_EntityParameter_QNAME, EntityParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBudgetPoint")
    public JAXBElement<ArrayOfBudgetPoint> createArrayOfBudgetPoint(ArrayOfBudgetPoint value) {
        return new JAXBElement<ArrayOfBudgetPoint>(_ArrayOfBudgetPoint_QNAME, ArrayOfBudgetPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordAndConfidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordAndConfidence")
    public JAXBElement<KeywordAndConfidence> createKeywordAndConfidence(KeywordAndConfidence value) {
        return new JAXBElement<KeywordAndConfidence>(_KeywordAndConfidence_QNAME, KeywordAndConfidence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsMessageTemplateId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsMessageTemplateId")
    public JAXBElement<PerformanceInsightsMessageTemplateId> createPerformanceInsightsMessageTemplateId(PerformanceInsightsMessageTemplateId value) {
        return new JAXBElement<PerformanceInsightsMessageTemplateId>(_PerformanceInsightsMessageTemplateId_QNAME, PerformanceInsightsMessageTemplateId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordCategoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordCategoryResult")
    public JAXBElement<KeywordCategoryResult> createKeywordCategoryResult(KeywordCategoryResult value) {
        return new JAXBElement<KeywordCategoryResult>(_KeywordCategoryResult_QNAME, KeywordCategoryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordSuggestion")
    public JAXBElement<KeywordSuggestion> createKeywordSuggestion(KeywordSuggestion value) {
        return new JAXBElement<KeywordSuggestion>(_KeywordSuggestion_QNAME, KeywordSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DeviceSearchParameter")
    public JAXBElement<DeviceSearchParameter> createDeviceSearchParameter(DeviceSearchParameter value) {
        return new JAXBElement<DeviceSearchParameter>(_DeviceSearchParameter_QNAME, DeviceSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsDetail")
    public JAXBElement<PerformanceInsightsDetail> createPerformanceInsightsDetail(PerformanceInsightsDetail value) {
        return new JAXBElement<PerformanceInsightsDetail>(_PerformanceInsightsDetail_QNAME, PerformanceInsightsDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordEstimate")
    public JAXBElement<ArrayOfKeywordEstimate> createArrayOfKeywordEstimate(ArrayOfKeywordEstimate value) {
        return new JAXBElement<ArrayOfKeywordEstimate>(_ArrayOfKeywordEstimate_QNAME, ArrayOfKeywordEstimate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionSegmentSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionSegmentSearchParameter")
    public JAXBElement<AuctionSegmentSearchParameter> createAuctionSegmentSearchParameter(AuctionSegmentSearchParameter value) {
        return new JAXBElement<AuctionSegmentSearchParameter>(_AuctionSegmentSearchParameter_QNAME, AuctionSegmentSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdeaAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordIdeaAttribute")
    public JAXBElement<KeywordIdeaAttribute> createKeywordIdeaAttribute(KeywordIdeaAttribute value) {
        return new JAXBElement<KeywordIdeaAttribute>(_KeywordIdeaAttribute_QNAME, KeywordIdeaAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordAndMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordAndMatchType")
    public JAXBElement<KeywordAndMatchType> createKeywordAndMatchType(KeywordAndMatchType value) {
        return new JAXBElement<KeywordAndMatchType>(_KeywordAndMatchType_QNAME, KeywordAndMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<BudgetLimitType>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CategorySearchParameter")
    public JAXBElement<CategorySearchParameter> createCategorySearchParameter(CategorySearchParameter value) {
        return new JAXBElement<CategorySearchParameter>(_CategorySearchParameter_QNAME, CategorySearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuctionSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAuctionSegment")
    public JAXBElement<ArrayOfAuctionSegment> createArrayOfAuctionSegment(ArrayOfAuctionSegment value) {
        return new JAXBElement<ArrayOfAuctionSegment>(_ArrayOfAuctionSegment_QNAME, ArrayOfAuctionSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscapeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdGroupBidLandscapeType")
    public JAXBElement<AdGroupBidLandscapeType> createAdGroupBidLandscapeType(AdGroupBidLandscapeType value) {
        return new JAXBElement<AdGroupBidLandscapeType>(_AdGroupBidLandscapeType_QNAME, AdGroupBidLandscapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordKPI")
    public JAXBElement<KeywordKPI> createKeywordKPI(KeywordKPI value) {
        return new JAXBElement<KeywordKPI>(_KeywordKPI_QNAME, KeywordKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerformanceInsightsDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfPerformanceInsightsDetail")
    public JAXBElement<ArrayOfPerformanceInsightsDetail> createArrayOfPerformanceInsightsDetail(ArrayOfPerformanceInsightsDetail value) {
        return new JAXBElement<ArrayOfPerformanceInsightsDetail>(_ArrayOfPerformanceInsightsDetail_QNAME, ArrayOfPerformanceInsightsDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BudgetPointType")
    public JAXBElement<BudgetPointType> createBudgetPointType(BudgetPointType value) {
        return new JAXBElement<BudgetPointType>(_BudgetPointType_QNAME, BudgetPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBidLandscapePoint")
    public JAXBElement<ArrayOfBidLandscapePoint> createArrayOfBidLandscapePoint(ArrayOfBidLandscapePoint value) {
        return new JAXBElement<ArrayOfBidLandscapePoint>(_ArrayOfBidLandscapePoint_QNAME, ArrayOfBidLandscapePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdGroupEstimate")
    public JAXBElement<AdGroupEstimate> createAdGroupEstimate(AdGroupEstimate value) {
        return new JAXBElement<AdGroupEstimate>(_AdGroupEstimate_QNAME, AdGroupEstimate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfCriterion")
    public JAXBElement<ArrayOfCriterion> createArrayOfCriterion(ArrayOfCriterion value) {
        return new JAXBElement<ArrayOfCriterion>(_ArrayOfCriterion_QNAME, ArrayOfCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsMessage")
    public JAXBElement<PerformanceInsightsMessage> createPerformanceInsightsMessage(PerformanceInsightsMessage value) {
        return new JAXBElement<PerformanceInsightsMessage>(_PerformanceInsightsMessage_QNAME, PerformanceInsightsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBidOpportunity")
    public JAXBElement<ArrayOfBidOpportunity> createArrayOfBidOpportunity(ArrayOfBidOpportunity value) {
        return new JAXBElement<ArrayOfBidOpportunity>(_ArrayOfBidOpportunity_QNAME, ArrayOfBidOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrlParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "UrlParameter")
    public JAXBElement<UrlParameter> createUrlParameter(UrlParameter value) {
        return new JAXBElement<UrlParameter>(_UrlParameter_QNAME, UrlParameter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BudgetOpportunity")
    public JAXBElement<BudgetOpportunity> createBudgetOpportunity(BudgetOpportunity value) {
        return new JAXBElement<BudgetOpportunity>(_BudgetOpportunity_QNAME, BudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordAndMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordAndMatchType")
    public JAXBElement<ArrayOfKeywordAndMatchType> createArrayOfKeywordAndMatchType(ArrayOfKeywordAndMatchType value) {
        return new JAXBElement<ArrayOfKeywordAndMatchType>(_ArrayOfKeywordAndMatchType_QNAME, ArrayOfKeywordAndMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordDemographic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordDemographic")
    public JAXBElement<KeywordDemographic> createKeywordDemographic(KeywordDemographic value) {
        return new JAXBElement<KeywordDemographic>(_KeywordDemographic_QNAME, KeywordDemographic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalSearchCountPeriodic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfHistoricalSearchCountPeriodic")
    public JAXBElement<ArrayOfHistoricalSearchCountPeriodic> createArrayOfHistoricalSearchCountPeriodic(ArrayOfHistoricalSearchCountPeriodic value) {
        return new JAXBElement<ArrayOfHistoricalSearchCountPeriodic>(_ArrayOfHistoricalSearchCountPeriodic_QNAME, ArrayOfHistoricalSearchCountPeriodic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficEstimate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "TrafficEstimate")
    public JAXBElement<TrafficEstimate> createTrafficEstimate(TrafficEstimate value) {
        return new JAXBElement<TrafficEstimate>(_TrafficEstimate_QNAME, TrafficEstimate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordIdEstimatedPosition")
    public JAXBElement<KeywordIdEstimatedPosition> createKeywordIdEstimatedPosition(KeywordIdEstimatedPosition value) {
        return new JAXBElement<KeywordIdEstimatedPosition>(_KeywordIdEstimatedPosition_QNAME, KeywordIdEstimatedPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "NetworkType")
    public JAXBElement<NetworkType> createNetworkType(NetworkType value) {
        return new JAXBElement<NetworkType>(_NetworkType_QNAME, NetworkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "NetworkSearchParameter")
    public JAXBElement<NetworkSearchParameter> createNetworkSearchParameter(NetworkSearchParameter value) {
        return new JAXBElement<NetworkSearchParameter>(_NetworkSearchParameter_QNAME, NetworkSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCountsByAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "SearchCountsByAttributes")
    public JAXBElement<SearchCountsByAttributes> createSearchCountsByAttributes(SearchCountsByAttributes value) {
        return new JAXBElement<SearchCountsByAttributes>(_SearchCountsByAttributes_QNAME, SearchCountsByAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSearchCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordSearchCount")
    public JAXBElement<KeywordSearchCount> createKeywordSearchCount(KeywordSearchCount value) {
        return new JAXBElement<KeywordSearchCount>(_KeywordSearchCount_QNAME, KeywordSearchCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordOpportunity")
    public JAXBElement<ArrayOfKeywordOpportunity> createArrayOfKeywordOpportunity(ArrayOfKeywordOpportunity value) {
        return new JAXBElement<ArrayOfKeywordOpportunity>(_ArrayOfKeywordOpportunity_QNAME, ArrayOfKeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordEstimatedBid")
    public JAXBElement<ArrayOfKeywordEstimatedBid> createArrayOfKeywordEstimatedBid(ArrayOfKeywordEstimatedBid value) {
        return new JAXBElement<ArrayOfKeywordEstimatedBid>(_ArrayOfKeywordEstimatedBid_QNAME, ArrayOfKeywordEstimatedBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordEstimatedBid")
    public JAXBElement<KeywordEstimatedBid> createKeywordEstimatedBid(KeywordEstimatedBid value) {
        return new JAXBElement<KeywordEstimatedBid>(_KeywordEstimatedBid_QNAME, KeywordEstimatedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "NegativeKeyword")
    public JAXBElement<NegativeKeyword> createNegativeKeyword(NegativeKeyword value) {
        return new JAXBElement<NegativeKeyword>(_NegativeKeyword_QNAME, NegativeKeyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordEstimatedPosition")
    public JAXBElement<ArrayOfKeywordEstimatedPosition> createArrayOfKeywordEstimatedPosition(ArrayOfKeywordEstimatedPosition value) {
        return new JAXBElement<ArrayOfKeywordEstimatedPosition>(_ArrayOfKeywordEstimatedPosition_QNAME, ArrayOfKeywordEstimatedPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "MetricData")
    public JAXBElement<MetricData> createMetricData(MetricData value) {
        return new JAXBElement<MetricData>(_MetricData_QNAME, MetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerformanceInsightsMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfPerformanceInsightsMessage")
    public JAXBElement<ArrayOfPerformanceInsightsMessage> createArrayOfPerformanceInsightsMessage(ArrayOfPerformanceInsightsMessage value) {
        return new JAXBElement<ArrayOfPerformanceInsightsMessage>(_ArrayOfPerformanceInsightsMessage_QNAME, ArrayOfPerformanceInsightsMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordIdEstimatedPosition")
    public JAXBElement<ArrayOfKeywordIdEstimatedPosition> createArrayOfKeywordIdEstimatedPosition(ArrayOfKeywordIdEstimatedPosition value) {
        return new JAXBElement<ArrayOfKeywordIdEstimatedPosition>(_ArrayOfKeywordIdEstimatedPosition_QNAME, ArrayOfKeywordIdEstimatedPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguageCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfLanguageCriterion")
    public JAXBElement<ArrayOfLanguageCriterion> createArrayOfLanguageCriterion(ArrayOfLanguageCriterion value) {
        return new JAXBElement<ArrayOfLanguageCriterion>(_ArrayOfLanguageCriterion_QNAME, ArrayOfLanguageCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdeaCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordIdeaCategory")
    public JAXBElement<ArrayOfKeywordIdeaCategory> createArrayOfKeywordIdeaCategory(ArrayOfKeywordIdeaCategory value) {
        return new JAXBElement<ArrayOfKeywordIdeaCategory>(_ArrayOfKeywordIdeaCategory_QNAME, ArrayOfKeywordIdeaCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBroadMatchSearchQueryKPI")
    public JAXBElement<ArrayOfBroadMatchSearchQueryKPI> createArrayOfBroadMatchSearchQueryKPI(ArrayOfBroadMatchSearchQueryKPI value) {
        return new JAXBElement<ArrayOfBroadMatchSearchQueryKPI>(_ArrayOfBroadMatchSearchQueryKPI_QNAME, ArrayOfBroadMatchSearchQueryKPI.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfMatchType")
    public JAXBElement<ArrayOfMatchType> createArrayOfMatchType(ArrayOfMatchType value) {
        return new JAXBElement<ArrayOfMatchType>(_ArrayOfMatchType_QNAME, ArrayOfMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordKPI")
    public JAXBElement<ArrayOfKeywordKPI> createArrayOfKeywordKPI(ArrayOfKeywordKPI value) {
        return new JAXBElement<ArrayOfKeywordKPI>(_ArrayOfKeywordKPI_QNAME, ArrayOfKeywordKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceInsightsUrlId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "PerformanceInsightsUrlId")
    public JAXBElement<PerformanceInsightsUrlId> createPerformanceInsightsUrlId(PerformanceInsightsUrlId value) {
        return new JAXBElement<PerformanceInsightsUrlId>(_PerformanceInsightsUrlId_QNAME, PerformanceInsightsUrlId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuctionInsightKpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAuctionInsightKpi")
    public JAXBElement<ArrayOfAuctionInsightKpi> createArrayOfAuctionInsightKpi(ArrayOfAuctionInsightKpi value) {
        return new JAXBElement<ArrayOfAuctionInsightKpi>(_ArrayOfAuctionInsightKpi_QNAME, ArrayOfAuctionInsightKpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordIdEstimatedBid")
    public JAXBElement<KeywordIdEstimatedBid> createKeywordIdEstimatedBid(KeywordIdEstimatedBid value) {
        return new JAXBElement<KeywordIdEstimatedBid>(_KeywordIdEstimatedBid_QNAME, KeywordIdEstimatedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordIdea")
    public JAXBElement<KeywordIdea> createKeywordIdea(KeywordIdea value) {
        return new JAXBElement<KeywordIdea>(_KeywordIdea_QNAME, KeywordIdea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfMetricData")
    public JAXBElement<ArrayOfMetricData> createArrayOfMetricData(ArrayOfMetricData value) {
        return new JAXBElement<ArrayOfMetricData>(_ArrayOfMetricData_QNAME, ArrayOfMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordLocation")
    public JAXBElement<KeywordLocation> createKeywordLocation(KeywordLocation value) {
        return new JAXBElement<KeywordLocation>(_KeywordLocation_QNAME, KeywordLocation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "LocationCriterion")
    public JAXBElement<LocationCriterion> createLocationCriterion(LocationCriterion value) {
        return new JAXBElement<LocationCriterion>(_LocationCriterion_QNAME, LocationCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "LanguageSearchParameter")
    public JAXBElement<LanguageSearchParameter> createLanguageSearchParameter(LanguageSearchParameter value) {
        return new JAXBElement<LanguageSearchParameter>(_LanguageSearchParameter_QNAME, LanguageSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BidOpportunityType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<BidOpportunityType>> createBidOpportunityType(Collection<BidOpportunityType> value) {
        return new JAXBElement<Collection<BidOpportunityType>>(_BidOpportunityType_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CampaignEstimator")
    public JAXBElement<CampaignEstimator> createCampaignEstimator(CampaignEstimator value) {
        return new JAXBElement<CampaignEstimator>(_CampaignEstimator_QNAME, CampaignEstimator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEstimatedPositionAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfEstimatedPositionAndTraffic")
    public JAXBElement<ArrayOfEstimatedPositionAndTraffic> createArrayOfEstimatedPositionAndTraffic(ArrayOfEstimatedPositionAndTraffic value) {
        return new JAXBElement<ArrayOfEstimatedPositionAndTraffic>(_ArrayOfEstimatedPositionAndTraffic_QNAME, ArrayOfEstimatedPositionAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "EntityType")
    public JAXBElement<EntityType> createEntityType(EntityType value) {
        return new JAXBElement<EntityType>(_EntityType_QNAME, EntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupBidLandscapeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAdGroupBidLandscapeInput")
    public JAXBElement<ArrayOfAdGroupBidLandscapeInput> createArrayOfAdGroupBidLandscapeInput(ArrayOfAdGroupBidLandscapeInput value) {
        return new JAXBElement<ArrayOfAdGroupBidLandscapeInput>(_ArrayOfAdGroupBidLandscapeInput_QNAME, ArrayOfAdGroupBidLandscapeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcludeAccountKeywordsSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ExcludeAccountKeywordsSearchParameter")
    public JAXBElement<ExcludeAccountKeywordsSearchParameter> createExcludeAccountKeywordsSearchParameter(ExcludeAccountKeywordsSearchParameter value) {
        return new JAXBElement<ExcludeAccountKeywordsSearchParameter>(_ExcludeAccountKeywordsSearchParameter_QNAME, ExcludeAccountKeywordsSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdPosition")
    public JAXBElement<AdPosition> createAdPosition(AdPosition value) {
        return new JAXBElement<AdPosition>(_AdPosition_QNAME, AdPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCountsByAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfSearchCountsByAttributes")
    public JAXBElement<ArrayOfSearchCountsByAttributes> createArrayOfSearchCountsByAttributes(ArrayOfSearchCountsByAttributes value) {
        return new JAXBElement<ArrayOfSearchCountsByAttributes>(_ArrayOfSearchCountsByAttributes_QNAME, ArrayOfSearchCountsByAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "SearchParameter")
    public JAXBElement<SearchParameter> createSearchParameter(SearchParameter value) {
        return new JAXBElement<SearchParameter>(_SearchParameter_QNAME, SearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVolumeSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "SearchVolumeSearchParameter")
    public JAXBElement<SearchVolumeSearchParameter> createSearchVolumeSearchParameter(SearchVolumeSearchParameter value) {
        return new JAXBElement<SearchVolumeSearchParameter>(_SearchVolumeSearchParameter_QNAME, SearchVolumeSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AuctionInsightKpiAdditionalField }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AuctionInsightKpiAdditionalField")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AuctionInsightKpiAdditionalField>> createAuctionInsightKpiAdditionalField(Collection<AuctionInsightKpiAdditionalField> value) {
        return new JAXBElement<Collection<AuctionInsightKpiAdditionalField>>(_AuctionInsightKpiAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordEstimatedPosition")
    public JAXBElement<KeywordEstimatedPosition> createKeywordEstimatedPosition(KeywordEstimatedPosition value) {
        return new JAXBElement<KeywordEstimatedPosition>(_KeywordEstimatedPosition_QNAME, KeywordEstimatedPosition.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfLocationCriterion")
    public JAXBElement<ArrayOfLocationCriterion> createArrayOfLocationCriterion(ArrayOfLocationCriterion value) {
        return new JAXBElement<ArrayOfLocationCriterion>(_ArrayOfLocationCriterion_QNAME, ArrayOfLocationCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordEstimator")
    public JAXBElement<KeywordEstimator> createKeywordEstimator(KeywordEstimator value) {
        return new JAXBElement<KeywordEstimator>(_KeywordEstimator_QNAME, KeywordEstimator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAutoApplyRecommendationsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfAutoApplyRecommendationsInfo")
    public JAXBElement<ArrayOfAutoApplyRecommendationsInfo> createArrayOfAutoApplyRecommendationsInfo(ArrayOfAutoApplyRecommendationsInfo value) {
        return new JAXBElement<ArrayOfAutoApplyRecommendationsInfo>(_ArrayOfAutoApplyRecommendationsInfo_QNAME, ArrayOfAutoApplyRecommendationsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupEstimator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "AdGroupEstimator")
    public JAXBElement<AdGroupEstimator> createAdGroupEstimator(AdGroupEstimator value) {
        return new JAXBElement<AdGroupEstimator>(_AdGroupEstimator_QNAME, AdGroupEstimator.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DomainCategory")
    public JAXBElement<DomainCategory> createDomainCategory(DomainCategory value) {
        return new JAXBElement<DomainCategory>(_DomainCategory_QNAME, DomainCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestedBidSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "SuggestedBidSearchParameter")
    public JAXBElement<SuggestedBidSearchParameter> createSuggestedBidSearchParameter(SuggestedBidSearchParameter value) {
        return new JAXBElement<SuggestedBidSearchParameter>(_SuggestedBidSearchParameter_QNAME, SuggestedBidSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ParameterType")
    public JAXBElement<ParameterType> createParameterType(ParameterType value) {
        return new JAXBElement<ParameterType>(_ParameterType_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Keyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "Keyword")
    public JAXBElement<Keyword> createKeyword(Keyword value) {
        return new JAXBElement<Keyword>(_Keyword_QNAME, Keyword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationSearchParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "LocationSearchParameter")
    public JAXBElement<LocationSearchParameter> createLocationSearchParameter(LocationSearchParameter value) {
        return new JAXBElement<LocationSearchParameter>(_LocationSearchParameter_QNAME, LocationSearchParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordDemographicResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordDemographicResult")
    public JAXBElement<KeywordDemographicResult> createKeywordDemographicResult(KeywordDemographicResult value) {
        return new JAXBElement<KeywordDemographicResult>(_KeywordDemographicResult_QNAME, KeywordDemographicResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordSuggestion")
    public JAXBElement<ArrayOfKeywordSuggestion> createArrayOfKeywordSuggestion(ArrayOfKeywordSuggestion value) {
        return new JAXBElement<ArrayOfKeywordSuggestion>(_ArrayOfKeywordSuggestion_QNAME, ArrayOfKeywordSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayMonthAndYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "DayMonthAndYear")
    public JAXBElement<DayMonthAndYear> createDayMonthAndYear(DayMonthAndYear value) {
        return new JAXBElement<DayMonthAndYear>(_DayMonthAndYear_QNAME, DayMonthAndYear.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEstimatedBidAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfEstimatedBidAndTraffic")
    public JAXBElement<ArrayOfEstimatedBidAndTraffic> createArrayOfEstimatedBidAndTraffic(ArrayOfEstimatedBidAndTraffic value) {
        return new JAXBElement<ArrayOfEstimatedBidAndTraffic>(_ArrayOfEstimatedBidAndTraffic_QNAME, ArrayOfEstimatedBidAndTraffic.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BidOpportunity")
    public JAXBElement<BidOpportunity> createBidOpportunity(BidOpportunity value) {
        return new JAXBElement<BidOpportunity>(_BidOpportunity_QNAME, BidOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfKeywordIdEstimatedBid")
    public JAXBElement<ArrayOfKeywordIdEstimatedBid> createArrayOfKeywordIdEstimatedBid(ArrayOfKeywordIdEstimatedBid value) {
        return new JAXBElement<ArrayOfKeywordIdEstimatedBid>(_ArrayOfKeywordIdEstimatedBid_QNAME, ArrayOfKeywordIdEstimatedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "EntityDetail")
    public JAXBElement<EntityDetail> createEntityDetail(EntityDetail value) {
        return new JAXBElement<EntityDetail>(_EntityDetail_QNAME, EntityDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "ArrayOfBudgetOpportunity")
    public JAXBElement<ArrayOfBudgetOpportunity> createArrayOfBudgetOpportunity(ArrayOfBudgetOpportunity value) {
        return new JAXBElement<ArrayOfBudgetOpportunity>(_ArrayOfBudgetOpportunity_QNAME, ArrayOfBudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BroadMatchSearchQueryKPI")
    public JAXBElement<BroadMatchSearchQueryKPI> createBroadMatchSearchQueryKPI(BroadMatchSearchQueryKPI value) {
        return new JAXBElement<BroadMatchSearchQueryKPI>(_BroadMatchSearchQueryKPI_QNAME, BroadMatchSearchQueryKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BudgetPoint")
    public JAXBElement<BudgetPoint> createBudgetPoint(BudgetPoint value) {
        return new JAXBElement<BudgetPoint>(_BudgetPoint_QNAME, BudgetPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdeaCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordIdeaCategory")
    public JAXBElement<KeywordIdeaCategory> createKeywordIdeaCategory(KeywordIdeaCategory value) {
        return new JAXBElement<KeywordIdeaCategory>(_KeywordIdeaCategory_QNAME, KeywordIdeaCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordOpportunityType")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Collection<KeywordOpportunityType>> createKeywordOpportunityType(Collection<KeywordOpportunityType> value) {
        return new JAXBElement<Collection<KeywordOpportunityType>>(_KeywordOpportunityType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordHistoricalPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordHistoricalPerformance")
    public JAXBElement<KeywordHistoricalPerformance> createKeywordHistoricalPerformance(KeywordHistoricalPerformance value) {
        return new JAXBElement<KeywordHistoricalPerformance>(_KeywordHistoricalPerformance_QNAME, KeywordHistoricalPerformance.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BidLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "BidLandscapePoint")
    public JAXBElement<BidLandscapePoint> createBidLandscapePoint(BidLandscapePoint value) {
        return new JAXBElement<BidLandscapePoint>(_BidLandscapePoint_QNAME, BidLandscapePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v13", name = "KeywordCategory")
    public JAXBElement<KeywordCategory> createKeywordCategory(KeywordCategory value) {
        return new JAXBElement<KeywordCategory>(_KeywordCategory_QNAME, KeywordCategory.class, null, value);
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

}
