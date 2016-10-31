
package com.microsoft.bingads.v10.adinsight;

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
 * generated in the com.microsoft.bingads.v10.adinsight package. 
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

    private final static QName _AdPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdPosition");
    private final static QName _ArrayOfAuctionInsightV2Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAuctionInsightV2Entity");
    private final static QName _AuctionInsightResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightResult");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v10", "ArrayOfOperationError");
    private final static QName _ArrayOfAdGroupBidLandscapeInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAdGroupBidLandscapeInput");
    private final static QName _ApplicationToken_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApplicationToken");
    private final static QName _KeywordEstimatedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedPosition");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfAdGroupBidLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAdGroupBidLandscape");
    private final static QName _ArrayOfSearchCountsByAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfSearchCountsByAttributes");
    private final static QName _OrderBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "OrderBy");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _DomainCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DomainCategory");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v10", "ArrayOfBatchError");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AuctionInsightV2Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightV2Entity");
    private final static QName _MatchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MatchType");
    private final static QName _ArrayOfKeywordSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordSuggestion");
    private final static QName _KeywordDemographicResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographicResult");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AdGroupBidLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscape");
    private final static QName _BidOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunity");
    private final static QName _ArrayOfKeywordIdEstimatedBid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordIdEstimatedBid");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _EstimatedPositionAndTraffic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedPositionAndTraffic");
    private final static QName _ArrayOfKeywordCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordCategory");
    private final static QName _ArrayOfOrderBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfOrderBy");
    private final static QName _DayMonthAndYear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DayMonthAndYear");
    private final static QName _ArrayOfKeywordBidLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordBidLandscape");
    private final static QName _KeywordBidLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordBidLandscape");
    private final static QName _ArrayOfEstimatedBidAndTraffic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfEstimatedBidAndTraffic");
    private final static QName _ArrayOfBudgetOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBudgetOpportunity");
    private final static QName _BroadMatchSearchQueryKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchSearchQueryKPI");
    private final static QName _EstimatedBidAndTraffic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "EstimatedBidAndTraffic");
    private final static QName _Password_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "Password");
    private final static QName _Currency_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Currency");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _BudgetPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPoint");
    private final static QName _ArrayOfAuctionInsightKPINode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfAuctionInsightKPINode");
    private final static QName _KeywordAndMatchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "KeywordAndMatchType");
    private final static QName _ArrayOfKeywordAndConfidence_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordAndConfidence");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _CustomerAccountId_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "CustomerAccountId");
    private final static QName _Selector_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Selector");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _BidLandscapePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidLandscapePoint");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _KeywordCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategory");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _KeywordCategoryResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordCategoryResult");
    private final static QName _UserName_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "UserName");
    private final static QName _KeywordAndConfidence_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordAndConfidence");
    private final static QName _ArrayOfBudgetPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBudgetPoint");
    private final static QName _KeywordHistoricalPerformance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordHistoricalPerformance");
    private final static QName _KeywordOpportunityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunityType");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _BudgetLimitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetLimitType");
    private final static QName _ApiFaultDetail_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "ApiFaultDetail");
    private final static QName _KeywordSuggestion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSuggestion");
    private final static QName _ArrayOfDomainCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfDomainCategory");
    private final static QName _ArrayOfField_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfField");
    private final static QName _ArrayOfBidLandscapePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBidLandscapePoint");
    private final static QName _Operator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Operator");
    private final static QName _AuthenticationToken_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "AuthenticationToken");
    private final static QName _AdGroupBidLandscapeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeType");
    private final static QName _BudgetPointType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetPointType");
    private final static QName _ArrayOfKeywordDemographicResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordDemographicResult");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _KeywordKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordKPI");
    private final static QName _BudgetOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BudgetOpportunity");
    private final static QName _KeywordDemographic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordDemographic");
    private final static QName _DateRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "DateRange");
    private final static QName _Field_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Field");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _KeywordIdEstimatedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedPosition");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Opportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Opportunity");
    private final static QName _ArrayOfHistoricalSearchCountPeriodic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfHistoricalSearchCountPeriodic");
    private final static QName _ArrayOfBidOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBidOpportunity");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _BroadMatchKeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BroadMatchKeywordOpportunity");
    private final static QName _CustomerId_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "CustomerId");
    private final static QName _KeywordEstimatedBid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordEstimatedBid");
    private final static QName _ArrayOfKeywordEstimatedBid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordEstimatedBid");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v10", "OperationError");
    private final static QName _TrackingId_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "TrackingId");
    private final static QName _TimeInterval_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TimeInterval");
    private final static QName _SearchCountsByAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SearchCountsByAttributes");
    private final static QName _SortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "SortOrder");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/AdInsight/v10", "BatchError");
    private final static QName _ArrayOfKeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordOpportunity");
    private final static QName _ArrayOfKeywordLocationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordLocationResult");
    private final static QName _KeywordSearchCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordSearchCount");
    private final static QName _ArrayOfKeywordIdEstimatedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordIdEstimatedPosition");
    private final static QName _AdGroupBidLandscapeInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AdGroupBidLandscapeInput");
    private final static QName _ArrayOfKeywordEstimatedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordEstimatedPosition");
    private final static QName _ArrayOfKeywordAndMatchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", "ArrayOfKeywordAndMatchType");
    private final static QName _MetricData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "MetricData");
    private final static QName _TargetAdPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "TargetAdPosition");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfKeywordKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordKPI");
    private final static QName _KeywordIdEstimatedBid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordIdEstimatedBid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfKeywordSearchCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordSearchCount");
    private final static QName _ArrayOfBroadMatchSearchQueryKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfBroadMatchSearchQueryKPI");
    private final static QName _ArrayOfMatchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfMatchType");
    private final static QName _HistoricalSearchCountPeriodic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "HistoricalSearchCountPeriodic");
    private final static QName _Predicate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Predicate");
    private final static QName _ArrayOfKeywordHistoricalPerformance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordHistoricalPerformance");
    private final static QName _ArrayOfKeywordLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordLocation");
    private final static QName _KeywordLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocation");
    private final static QName _ArrayOfMetricData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfMetricData");
    private final static QName _BidOpportunityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "BidOpportunityType");
    private final static QName _ArrayOfKeywordCategoryResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordCategoryResult");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _Paging_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "Paging");
    private final static QName _KeywordLocationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordLocationResult");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _ArrayOfKeywordDemographic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfKeywordDemographic");
    private final static QName _ArrayOfPredicate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfPredicate");
    private final static QName _DeveloperToken_QNAME = new QName("Microsoft.Advertiser.AdInsight.Api.Service", "DeveloperToken");
    private final static QName _ArrayOfEstimatedPositionAndTraffic_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "ArrayOfEstimatedPositionAndTraffic");
    private final static QName _AuctionInsightKPINode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "AuctionInsightKPINode");
    private final static QName _KeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", "KeywordOpportunity");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v10.adinsight
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
     * Create an instance of {@link GetDomainCategoriesResponse }
     * 
     */
    public GetDomainCategoriesResponse createGetDomainCategoriesResponse() {
        return new GetDomainCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDomainCategory }
     * 
     */
    public ArrayOfDomainCategory createArrayOfDomainCategory() {
        return new ArrayOfDomainCategory();
    }

    /**
     * Create an instance of {@link GetKeywordCategoriesResponse }
     * 
     */
    public GetKeywordCategoriesResponse createGetKeywordCategoriesResponse() {
        return new GetKeywordCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordCategoryResult }
     * 
     */
    public ArrayOfKeywordCategoryResult createArrayOfKeywordCategoryResult() {
        return new ArrayOfKeywordCategoryResult();
    }

    /**
     * Create an instance of {@link SuggestKeywordsForUrlRequest }
     * 
     */
    public SuggestKeywordsForUrlRequest createSuggestKeywordsForUrlRequest() {
        return new SuggestKeywordsForUrlRequest();
    }

    /**
     * Create an instance of {@link GetBudgetOpportunitiesResponse }
     * 
     */
    public GetBudgetOpportunitiesResponse createGetBudgetOpportunitiesResponse() {
        return new GetBudgetOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetOpportunity }
     * 
     */
    public ArrayOfBudgetOpportunity createArrayOfBudgetOpportunity() {
        return new ArrayOfBudgetOpportunity();
    }

    /**
     * Create an instance of {@link GetKeywordCategoriesRequest }
     * 
     */
    public GetKeywordCategoriesRequest createGetKeywordCategoriesRequest() {
        return new GetKeywordCategoriesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetKeywordDemographicsRequest }
     * 
     */
    public GetKeywordDemographicsRequest createGetKeywordDemographicsRequest() {
        return new GetKeywordDemographicsRequest();
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
     * Create an instance of {@link PutMetricDataRequest }
     * 
     */
    public PutMetricDataRequest createPutMetricDataRequest() {
        return new PutMetricDataRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMetricData }
     * 
     */
    public ArrayOfMetricData createArrayOfMetricData() {
        return new ArrayOfMetricData();
    }

    /**
     * Create an instance of {@link PutMetricDataResponse }
     * 
     */
    public PutMetricDataResponse createPutMetricDataResponse() {
        return new PutMetricDataResponse();
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
     * Create an instance of {@link Selector }
     * 
     */
    public Selector createSelector() {
        return new Selector();
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
     * Create an instance of {@link GetKeywordOpportunitiesRequest }
     * 
     */
    public GetKeywordOpportunitiesRequest createGetKeywordOpportunitiesRequest() {
        return new GetKeywordOpportunitiesRequest();
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
     * Create an instance of {@link EstimatedBidAndTraffic }
     * 
     */
    public EstimatedBidAndTraffic createEstimatedBidAndTraffic() {
        return new EstimatedBidAndTraffic();
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
     * Create an instance of {@link GetBidOpportunitiesRequest }
     * 
     */
    public GetBidOpportunitiesRequest createGetBidOpportunitiesRequest() {
        return new GetBidOpportunitiesRequest();
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
     * Create an instance of {@link GetEstimatedPositionByKeywordsRequest }
     * 
     */
    public GetEstimatedPositionByKeywordsRequest createGetEstimatedPositionByKeywordsRequest() {
        return new GetEstimatedPositionByKeywordsRequest();
    }

    /**
     * Create an instance of {@link SuggestKeywordsFromExistingKeywordsRequest }
     * 
     */
    public SuggestKeywordsFromExistingKeywordsRequest createSuggestKeywordsFromExistingKeywordsRequest() {
        return new SuggestKeywordsFromExistingKeywordsRequest();
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
     * Create an instance of {@link GetKeywordLocationsRequest }
     * 
     */
    public GetKeywordLocationsRequest createGetKeywordLocationsRequest() {
        return new GetKeywordLocationsRequest();
    }

    /**
     * Create an instance of {@link GetHistoricalSearchCountRequest }
     * 
     */
    public GetHistoricalSearchCountRequest createGetHistoricalSearchCountRequest() {
        return new GetHistoricalSearchCountRequest();
    }

    /**
     * Create an instance of {@link DayMonthAndYear }
     * 
     */
    public DayMonthAndYear createDayMonthAndYear() {
        return new DayMonthAndYear();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByAdGroupIdsResponse }
     * 
     */
    public GetBidLandscapeByAdGroupIdsResponse createGetBidLandscapeByAdGroupIdsResponse() {
        return new GetBidLandscapeByAdGroupIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdGroupBidLandscape }
     * 
     */
    public ArrayOfAdGroupBidLandscape createArrayOfAdGroupBidLandscape() {
        return new ArrayOfAdGroupBidLandscape();
    }

    /**
     * Create an instance of {@link GetHistoricalSearchCountResponse }
     * 
     */
    public GetHistoricalSearchCountResponse createGetHistoricalSearchCountResponse() {
        return new GetHistoricalSearchCountResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordSearchCount }
     * 
     */
    public ArrayOfKeywordSearchCount createArrayOfKeywordSearchCount() {
        return new ArrayOfKeywordSearchCount();
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
     * Create an instance of {@link GetBidLandscapeByKeywordIdsResponse }
     * 
     */
    public GetBidLandscapeByKeywordIdsResponse createGetBidLandscapeByKeywordIdsResponse() {
        return new GetBidLandscapeByKeywordIdsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordBidLandscape }
     * 
     */
    public ArrayOfKeywordBidLandscape createArrayOfKeywordBidLandscape() {
        return new ArrayOfKeywordBidLandscape();
    }

    /**
     * Create an instance of {@link GetEstimatedPositionByKeywordIdsRequest }
     * 
     */
    public GetEstimatedPositionByKeywordIdsRequest createGetEstimatedPositionByKeywordIdsRequest() {
        return new GetEstimatedPositionByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
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
     * Create an instance of {@link GetAuctionInsightDataResponse }
     * 
     */
    public GetAuctionInsightDataResponse createGetAuctionInsightDataResponse() {
        return new GetAuctionInsightDataResponse();
    }

    /**
     * Create an instance of {@link AuctionInsightResult }
     * 
     */
    public AuctionInsightResult createAuctionInsightResult() {
        return new AuctionInsightResult();
    }

    /**
     * Create an instance of {@link GetBudgetOpportunitiesRequest }
     * 
     */
    public GetBudgetOpportunitiesRequest createGetBudgetOpportunitiesRequest() {
        return new GetBudgetOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link ApiFaultDetail }
     * 
     */
    public ApiFaultDetail createApiFaultDetail() {
        return new ApiFaultDetail();
    }

    /**
     * Create an instance of {@link GetEstimatedBidByKeywordIdsRequest }
     * 
     */
    public GetEstimatedBidByKeywordIdsRequest createGetEstimatedBidByKeywordIdsRequest() {
        return new GetEstimatedBidByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link GetBidLandscapeByKeywordIdsRequest }
     * 
     */
    public GetBidLandscapeByKeywordIdsRequest createGetBidLandscapeByKeywordIdsRequest() {
        return new GetBidLandscapeByKeywordIdsRequest();
    }

    /**
     * Create an instance of {@link EstimatedPositionAndTraffic }
     * 
     */
    public EstimatedPositionAndTraffic createEstimatedPositionAndTraffic() {
        return new EstimatedPositionAndTraffic();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordKPI }
     * 
     */
    public ArrayOfKeywordKPI createArrayOfKeywordKPI() {
        return new ArrayOfKeywordKPI();
    }

    /**
     * Create an instance of {@link BidOpportunity }
     * 
     */
    public BidOpportunity createBidOpportunity() {
        return new BidOpportunity();
    }

    /**
     * Create an instance of {@link KeywordIdEstimatedBid }
     * 
     */
    public KeywordIdEstimatedBid createKeywordIdEstimatedBid() {
        return new KeywordIdEstimatedBid();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordCategory }
     * 
     */
    public ArrayOfKeywordCategory createArrayOfKeywordCategory() {
        return new ArrayOfKeywordCategory();
    }

    /**
     * Create an instance of {@link ArrayOfBroadMatchSearchQueryKPI }
     * 
     */
    public ArrayOfBroadMatchSearchQueryKPI createArrayOfBroadMatchSearchQueryKPI() {
        return new ArrayOfBroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link ArrayOfOrderBy }
     * 
     */
    public ArrayOfOrderBy createArrayOfOrderBy() {
        return new ArrayOfOrderBy();
    }

    /**
     * Create an instance of {@link ArrayOfEstimatedBidAndTraffic }
     * 
     */
    public ArrayOfEstimatedBidAndTraffic createArrayOfEstimatedBidAndTraffic() {
        return new ArrayOfEstimatedBidAndTraffic();
    }

    /**
     * Create an instance of {@link KeywordBidLandscape }
     * 
     */
    public KeywordBidLandscape createKeywordBidLandscape() {
        return new KeywordBidLandscape();
    }

    /**
     * Create an instance of {@link HistoricalSearchCountPeriodic }
     * 
     */
    public HistoricalSearchCountPeriodic createHistoricalSearchCountPeriodic() {
        return new HistoricalSearchCountPeriodic();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

    /**
     * Create an instance of {@link BroadMatchSearchQueryKPI }
     * 
     */
    public BroadMatchSearchQueryKPI createBroadMatchSearchQueryKPI() {
        return new BroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordLocation }
     * 
     */
    public ArrayOfKeywordLocation createArrayOfKeywordLocation() {
        return new ArrayOfKeywordLocation();
    }

    /**
     * Create an instance of {@link KeywordLocation }
     * 
     */
    public KeywordLocation createKeywordLocation() {
        return new KeywordLocation();
    }

    /**
     * Create an instance of {@link BudgetPoint }
     * 
     */
    public BudgetPoint createBudgetPoint() {
        return new BudgetPoint();
    }

    /**
     * Create an instance of {@link ArrayOfAuctionInsightKPINode }
     * 
     */
    public ArrayOfAuctionInsightKPINode createArrayOfAuctionInsightKPINode() {
        return new ArrayOfAuctionInsightKPINode();
    }

    /**
     * Create an instance of {@link BidLandscapePoint }
     * 
     */
    public BidLandscapePoint createBidLandscapePoint() {
        return new BidLandscapePoint();
    }

    /**
     * Create an instance of {@link KeywordCategoryResult }
     * 
     */
    public KeywordCategoryResult createKeywordCategoryResult() {
        return new KeywordCategoryResult();
    }

    /**
     * Create an instance of {@link KeywordCategory }
     * 
     */
    public KeywordCategory createKeywordCategory() {
        return new KeywordCategory();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link ArrayOfKeywordDemographic }
     * 
     */
    public ArrayOfKeywordDemographic createArrayOfKeywordDemographic() {
        return new ArrayOfKeywordDemographic();
    }

    /**
     * Create an instance of {@link ArrayOfPredicate }
     * 
     */
    public ArrayOfPredicate createArrayOfPredicate() {
        return new ArrayOfPredicate();
    }

    /**
     * Create an instance of {@link KeywordLocationResult }
     * 
     */
    public KeywordLocationResult createKeywordLocationResult() {
        return new KeywordLocationResult();
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
     * Create an instance of {@link KeywordHistoricalPerformance }
     * 
     */
    public KeywordHistoricalPerformance createKeywordHistoricalPerformance() {
        return new KeywordHistoricalPerformance();
    }

    /**
     * Create an instance of {@link ArrayOfEstimatedPositionAndTraffic }
     * 
     */
    public ArrayOfEstimatedPositionAndTraffic createArrayOfEstimatedPositionAndTraffic() {
        return new ArrayOfEstimatedPositionAndTraffic();
    }

    /**
     * Create an instance of {@link KeywordOpportunity }
     * 
     */
    public KeywordOpportunity createKeywordOpportunity() {
        return new KeywordOpportunity();
    }

    /**
     * Create an instance of {@link AuctionInsightKPINode }
     * 
     */
    public AuctionInsightKPINode createAuctionInsightKPINode() {
        return new AuctionInsightKPINode();
    }

    /**
     * Create an instance of {@link KeywordSuggestion }
     * 
     */
    public KeywordSuggestion createKeywordSuggestion() {
        return new KeywordSuggestion();
    }

    /**
     * Create an instance of {@link ArrayOfBidLandscapePoint }
     * 
     */
    public ArrayOfBidLandscapePoint createArrayOfBidLandscapePoint() {
        return new ArrayOfBidLandscapePoint();
    }

    /**
     * Create an instance of {@link ArrayOfAuctionInsightV2Entity }
     * 
     */
    public ArrayOfAuctionInsightV2Entity createArrayOfAuctionInsightV2Entity() {
        return new ArrayOfAuctionInsightV2Entity();
    }

    /**
     * Create an instance of {@link ArrayOfField }
     * 
     */
    public ArrayOfField createArrayOfField() {
        return new ArrayOfField();
    }

    /**
     * Create an instance of {@link KeywordKPI }
     * 
     */
    public KeywordKPI createKeywordKPI() {
        return new KeywordKPI();
    }

    /**
     * Create an instance of {@link KeywordEstimatedPosition }
     * 
     */
    public KeywordEstimatedPosition createKeywordEstimatedPosition() {
        return new KeywordEstimatedPosition();
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
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalSearchCountPeriodic }
     * 
     */
    public ArrayOfHistoricalSearchCountPeriodic createArrayOfHistoricalSearchCountPeriodic() {
        return new ArrayOfHistoricalSearchCountPeriodic();
    }

    /**
     * Create an instance of {@link KeywordIdEstimatedPosition }
     * 
     */
    public KeywordIdEstimatedPosition createKeywordIdEstimatedPosition() {
        return new KeywordIdEstimatedPosition();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link ArrayOfSearchCountsByAttributes }
     * 
     */
    public ArrayOfSearchCountsByAttributes createArrayOfSearchCountsByAttributes() {
        return new ArrayOfSearchCountsByAttributes();
    }

    /**
     * Create an instance of {@link BroadMatchKeywordOpportunity }
     * 
     */
    public BroadMatchKeywordOpportunity createBroadMatchKeywordOpportunity() {
        return new BroadMatchKeywordOpportunity();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link KeywordEstimatedBid }
     * 
     */
    public KeywordEstimatedBid createKeywordEstimatedBid() {
        return new KeywordEstimatedBid();
    }

    /**
     * Create an instance of {@link SearchCountsByAttributes }
     * 
     */
    public SearchCountsByAttributes createSearchCountsByAttributes() {
        return new SearchCountsByAttributes();
    }

    /**
     * Create an instance of {@link DomainCategory }
     * 
     */
    public DomainCategory createDomainCategory() {
        return new DomainCategory();
    }

    /**
     * Create an instance of {@link KeywordSearchCount }
     * 
     */
    public KeywordSearchCount createKeywordSearchCount() {
        return new KeywordSearchCount();
    }

    /**
     * Create an instance of {@link AdGroupBidLandscapeInput }
     * 
     */
    public AdGroupBidLandscapeInput createAdGroupBidLandscapeInput() {
        return new AdGroupBidLandscapeInput();
    }

    /**
     * Create an instance of {@link AuctionInsightV2Entity }
     * 
     */
    public AuctionInsightV2Entity createAuctionInsightV2Entity() {
        return new AuctionInsightV2Entity();
    }

    /**
     * Create an instance of {@link KeywordDemographicResult }
     * 
     */
    public KeywordDemographicResult createKeywordDemographicResult() {
        return new KeywordDemographicResult();
    }

    /**
     * Create an instance of {@link AdGroupBidLandscape }
     * 
     */
    public AdGroupBidLandscape createAdGroupBidLandscape() {
        return new AdGroupBidLandscape();
    }

    /**
     * Create an instance of {@link MetricData }
     * 
     */
    public MetricData createMetricData() {
        return new MetricData();
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
     * Create an instance of {@link BatchError }
     * 
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
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
     * Create an instance of {@link KeywordAndMatchType }
     * 
     */
    public KeywordAndMatchType createKeywordAndMatchType() {
        return new KeywordAndMatchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AdPosition")
    public JAXBElement<AdPosition> createAdPosition(AdPosition value) {
        return new JAXBElement<AdPosition>(_AdPosition_QNAME, AdPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuctionInsightV2Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfAuctionInsightV2Entity")
    public JAXBElement<ArrayOfAuctionInsightV2Entity> createArrayOfAuctionInsightV2Entity(ArrayOfAuctionInsightV2Entity value) {
        return new JAXBElement<ArrayOfAuctionInsightV2Entity>(_ArrayOfAuctionInsightV2Entity_QNAME, ArrayOfAuctionInsightV2Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AuctionInsightResult")
    public JAXBElement<AuctionInsightResult> createAuctionInsightResult(AuctionInsightResult value) {
        return new JAXBElement<AuctionInsightResult>(_AuctionInsightResult_QNAME, AuctionInsightResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v10", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupBidLandscapeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfAdGroupBidLandscapeInput")
    public JAXBElement<ArrayOfAdGroupBidLandscapeInput> createArrayOfAdGroupBidLandscapeInput(ArrayOfAdGroupBidLandscapeInput value) {
        return new JAXBElement<ArrayOfAdGroupBidLandscapeInput>(_ArrayOfAdGroupBidLandscapeInput_QNAME, ArrayOfAdGroupBidLandscapeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordEstimatedPosition")
    public JAXBElement<KeywordEstimatedPosition> createKeywordEstimatedPosition(KeywordEstimatedPosition value) {
        return new JAXBElement<KeywordEstimatedPosition>(_KeywordEstimatedPosition_QNAME, KeywordEstimatedPosition.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdGroupBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfAdGroupBidLandscape")
    public JAXBElement<ArrayOfAdGroupBidLandscape> createArrayOfAdGroupBidLandscape(ArrayOfAdGroupBidLandscape value) {
        return new JAXBElement<ArrayOfAdGroupBidLandscape>(_ArrayOfAdGroupBidLandscape_QNAME, ArrayOfAdGroupBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchCountsByAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfSearchCountsByAttributes")
    public JAXBElement<ArrayOfSearchCountsByAttributes> createArrayOfSearchCountsByAttributes(ArrayOfSearchCountsByAttributes value) {
        return new JAXBElement<ArrayOfSearchCountsByAttributes>(_ArrayOfSearchCountsByAttributes_QNAME, ArrayOfSearchCountsByAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "OrderBy")
    public JAXBElement<OrderBy> createOrderBy(OrderBy value) {
        return new JAXBElement<OrderBy>(_OrderBy_QNAME, OrderBy.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "DomainCategory")
    public JAXBElement<DomainCategory> createDomainCategory(DomainCategory value) {
        return new JAXBElement<DomainCategory>(_DomainCategory_QNAME, DomainCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v10", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightV2Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AuctionInsightV2Entity")
    public JAXBElement<AuctionInsightV2Entity> createAuctionInsightV2Entity(AuctionInsightV2Entity value) {
        return new JAXBElement<AuctionInsightV2Entity>(_AuctionInsightV2Entity_QNAME, AuctionInsightV2Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "MatchType")
    public JAXBElement<MatchType> createMatchType(MatchType value) {
        return new JAXBElement<MatchType>(_MatchType_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordSuggestion")
    public JAXBElement<ArrayOfKeywordSuggestion> createArrayOfKeywordSuggestion(ArrayOfKeywordSuggestion value) {
        return new JAXBElement<ArrayOfKeywordSuggestion>(_ArrayOfKeywordSuggestion_QNAME, ArrayOfKeywordSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordDemographicResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordDemographicResult")
    public JAXBElement<KeywordDemographicResult> createKeywordDemographicResult(KeywordDemographicResult value) {
        return new JAXBElement<KeywordDemographicResult>(_KeywordDemographicResult_QNAME, KeywordDemographicResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AdGroupBidLandscape")
    public JAXBElement<AdGroupBidLandscape> createAdGroupBidLandscape(AdGroupBidLandscape value) {
        return new JAXBElement<AdGroupBidLandscape>(_AdGroupBidLandscape_QNAME, AdGroupBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BidOpportunity")
    public JAXBElement<BidOpportunity> createBidOpportunity(BidOpportunity value) {
        return new JAXBElement<BidOpportunity>(_BidOpportunity_QNAME, BidOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordIdEstimatedBid")
    public JAXBElement<ArrayOfKeywordIdEstimatedBid> createArrayOfKeywordIdEstimatedBid(ArrayOfKeywordIdEstimatedBid value) {
        return new JAXBElement<ArrayOfKeywordIdEstimatedBid>(_ArrayOfKeywordIdEstimatedBid_QNAME, ArrayOfKeywordIdEstimatedBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedPositionAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "EstimatedPositionAndTraffic")
    public JAXBElement<EstimatedPositionAndTraffic> createEstimatedPositionAndTraffic(EstimatedPositionAndTraffic value) {
        return new JAXBElement<EstimatedPositionAndTraffic>(_EstimatedPositionAndTraffic_QNAME, EstimatedPositionAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordCategory")
    public JAXBElement<ArrayOfKeywordCategory> createArrayOfKeywordCategory(ArrayOfKeywordCategory value) {
        return new JAXBElement<ArrayOfKeywordCategory>(_ArrayOfKeywordCategory_QNAME, ArrayOfKeywordCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfOrderBy")
    public JAXBElement<ArrayOfOrderBy> createArrayOfOrderBy(ArrayOfOrderBy value) {
        return new JAXBElement<ArrayOfOrderBy>(_ArrayOfOrderBy_QNAME, ArrayOfOrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayMonthAndYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "DayMonthAndYear")
    public JAXBElement<DayMonthAndYear> createDayMonthAndYear(DayMonthAndYear value) {
        return new JAXBElement<DayMonthAndYear>(_DayMonthAndYear_QNAME, DayMonthAndYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordBidLandscape")
    public JAXBElement<ArrayOfKeywordBidLandscape> createArrayOfKeywordBidLandscape(ArrayOfKeywordBidLandscape value) {
        return new JAXBElement<ArrayOfKeywordBidLandscape>(_ArrayOfKeywordBidLandscape_QNAME, ArrayOfKeywordBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordBidLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordBidLandscape")
    public JAXBElement<KeywordBidLandscape> createKeywordBidLandscape(KeywordBidLandscape value) {
        return new JAXBElement<KeywordBidLandscape>(_KeywordBidLandscape_QNAME, KeywordBidLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEstimatedBidAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfEstimatedBidAndTraffic")
    public JAXBElement<ArrayOfEstimatedBidAndTraffic> createArrayOfEstimatedBidAndTraffic(ArrayOfEstimatedBidAndTraffic value) {
        return new JAXBElement<ArrayOfEstimatedBidAndTraffic>(_ArrayOfEstimatedBidAndTraffic_QNAME, ArrayOfEstimatedBidAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfBudgetOpportunity")
    public JAXBElement<ArrayOfBudgetOpportunity> createArrayOfBudgetOpportunity(ArrayOfBudgetOpportunity value) {
        return new JAXBElement<ArrayOfBudgetOpportunity>(_ArrayOfBudgetOpportunity_QNAME, ArrayOfBudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BroadMatchSearchQueryKPI")
    public JAXBElement<BroadMatchSearchQueryKPI> createBroadMatchSearchQueryKPI(BroadMatchSearchQueryKPI value) {
        return new JAXBElement<BroadMatchSearchQueryKPI>(_BroadMatchSearchQueryKPI_QNAME, BroadMatchSearchQueryKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedBidAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "EstimatedBidAndTraffic")
    public JAXBElement<EstimatedBidAndTraffic> createEstimatedBidAndTraffic(EstimatedBidAndTraffic value) {
        return new JAXBElement<EstimatedBidAndTraffic>(_EstimatedBidAndTraffic_QNAME, EstimatedBidAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BudgetPoint")
    public JAXBElement<BudgetPoint> createBudgetPoint(BudgetPoint value) {
        return new JAXBElement<BudgetPoint>(_BudgetPoint_QNAME, BudgetPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuctionInsightKPINode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfAuctionInsightKPINode")
    public JAXBElement<ArrayOfAuctionInsightKPINode> createArrayOfAuctionInsightKPINode(ArrayOfAuctionInsightKPINode value) {
        return new JAXBElement<ArrayOfAuctionInsightKPINode>(_ArrayOfAuctionInsightKPINode_QNAME, ArrayOfAuctionInsightKPINode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordAndMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", name = "KeywordAndMatchType")
    public JAXBElement<KeywordAndMatchType> createKeywordAndMatchType(KeywordAndMatchType value) {
        return new JAXBElement<KeywordAndMatchType>(_KeywordAndMatchType_QNAME, KeywordAndMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordAndConfidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordAndConfidence")
    public JAXBElement<ArrayOfKeywordAndConfidence> createArrayOfKeywordAndConfidence(ArrayOfKeywordAndConfidence value) {
        return new JAXBElement<ArrayOfKeywordAndConfidence>(_ArrayOfKeywordAndConfidence_QNAME, ArrayOfKeywordAndConfidence.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Selector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Selector")
    public JAXBElement<Selector> createSelector(Selector value) {
        return new JAXBElement<Selector>(_Selector_QNAME, Selector.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BidLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BidLandscapePoint")
    public JAXBElement<BidLandscapePoint> createBidLandscapePoint(BidLandscapePoint value) {
        return new JAXBElement<BidLandscapePoint>(_BidLandscapePoint_QNAME, BidLandscapePoint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordCategory")
    public JAXBElement<KeywordCategory> createKeywordCategory(KeywordCategory value) {
        return new JAXBElement<KeywordCategory>(_KeywordCategory_QNAME, KeywordCategory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordCategoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordCategoryResult")
    public JAXBElement<KeywordCategoryResult> createKeywordCategoryResult(KeywordCategoryResult value) {
        return new JAXBElement<KeywordCategoryResult>(_KeywordCategoryResult_QNAME, KeywordCategoryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordAndConfidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordAndConfidence")
    public JAXBElement<KeywordAndConfidence> createKeywordAndConfidence(KeywordAndConfidence value) {
        return new JAXBElement<KeywordAndConfidence>(_KeywordAndConfidence_QNAME, KeywordAndConfidence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfBudgetPoint")
    public JAXBElement<ArrayOfBudgetPoint> createArrayOfBudgetPoint(ArrayOfBudgetPoint value) {
        return new JAXBElement<ArrayOfBudgetPoint>(_ArrayOfBudgetPoint_QNAME, ArrayOfBudgetPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordHistoricalPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordHistoricalPerformance")
    public JAXBElement<KeywordHistoricalPerformance> createKeywordHistoricalPerformance(KeywordHistoricalPerformance value) {
        return new JAXBElement<KeywordHistoricalPerformance>(_KeywordHistoricalPerformance_QNAME, KeywordHistoricalPerformance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordOpportunityType")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<KeywordOpportunityType>> createKeywordOpportunityType(Collection<KeywordOpportunityType> value) {
        return new JAXBElement<Collection<KeywordOpportunityType>>(_KeywordOpportunityType_QNAME, ((Class) Collection.class), null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<BudgetLimitType>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordSuggestion")
    public JAXBElement<KeywordSuggestion> createKeywordSuggestion(KeywordSuggestion value) {
        return new JAXBElement<KeywordSuggestion>(_KeywordSuggestion_QNAME, KeywordSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfDomainCategory")
    public JAXBElement<ArrayOfDomainCategory> createArrayOfDomainCategory(ArrayOfDomainCategory value) {
        return new JAXBElement<ArrayOfDomainCategory>(_ArrayOfDomainCategory_QNAME, ArrayOfDomainCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfField")
    public JAXBElement<ArrayOfField> createArrayOfField(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_ArrayOfField_QNAME, ArrayOfField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfBidLandscapePoint")
    public JAXBElement<ArrayOfBidLandscapePoint> createArrayOfBidLandscapePoint(ArrayOfBidLandscapePoint value) {
        return new JAXBElement<ArrayOfBidLandscapePoint>(_ArrayOfBidLandscapePoint_QNAME, ArrayOfBidLandscapePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Operator")
    public JAXBElement<Operator> createOperator(Operator value) {
        return new JAXBElement<Operator>(_Operator_QNAME, Operator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscapeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AdGroupBidLandscapeType")
    public JAXBElement<AdGroupBidLandscapeType> createAdGroupBidLandscapeType(AdGroupBidLandscapeType value) {
        return new JAXBElement<AdGroupBidLandscapeType>(_AdGroupBidLandscapeType_QNAME, AdGroupBidLandscapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BudgetPointType")
    public JAXBElement<BudgetPointType> createBudgetPointType(BudgetPointType value) {
        return new JAXBElement<BudgetPointType>(_BudgetPointType_QNAME, BudgetPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordDemographicResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordDemographicResult")
    public JAXBElement<ArrayOfKeywordDemographicResult> createArrayOfKeywordDemographicResult(ArrayOfKeywordDemographicResult value) {
        return new JAXBElement<ArrayOfKeywordDemographicResult>(_ArrayOfKeywordDemographicResult_QNAME, ArrayOfKeywordDemographicResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordKPI")
    public JAXBElement<KeywordKPI> createKeywordKPI(KeywordKPI value) {
        return new JAXBElement<KeywordKPI>(_KeywordKPI_QNAME, KeywordKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BudgetOpportunity")
    public JAXBElement<BudgetOpportunity> createBudgetOpportunity(BudgetOpportunity value) {
        return new JAXBElement<BudgetOpportunity>(_BudgetOpportunity_QNAME, BudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordDemographic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordDemographic")
    public JAXBElement<KeywordDemographic> createKeywordDemographic(KeywordDemographic value) {
        return new JAXBElement<KeywordDemographic>(_KeywordDemographic_QNAME, KeywordDemographic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "DateRange")
    public JAXBElement<DateRange> createDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_DateRange_QNAME, DateRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Field")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordIdEstimatedPosition")
    public JAXBElement<KeywordIdEstimatedPosition> createKeywordIdEstimatedPosition(KeywordIdEstimatedPosition value) {
        return new JAXBElement<KeywordIdEstimatedPosition>(_KeywordIdEstimatedPosition_QNAME, KeywordIdEstimatedPosition.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalSearchCountPeriodic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfHistoricalSearchCountPeriodic")
    public JAXBElement<ArrayOfHistoricalSearchCountPeriodic> createArrayOfHistoricalSearchCountPeriodic(ArrayOfHistoricalSearchCountPeriodic value) {
        return new JAXBElement<ArrayOfHistoricalSearchCountPeriodic>(_ArrayOfHistoricalSearchCountPeriodic_QNAME, ArrayOfHistoricalSearchCountPeriodic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfBidOpportunity")
    public JAXBElement<ArrayOfBidOpportunity> createArrayOfBidOpportunity(ArrayOfBidOpportunity value) {
        return new JAXBElement<ArrayOfBidOpportunity>(_ArrayOfBidOpportunity_QNAME, ArrayOfBidOpportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BroadMatchKeywordOpportunity")
    public JAXBElement<BroadMatchKeywordOpportunity> createBroadMatchKeywordOpportunity(BroadMatchKeywordOpportunity value) {
        return new JAXBElement<BroadMatchKeywordOpportunity>(_BroadMatchKeywordOpportunity_QNAME, BroadMatchKeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordEstimatedBid")
    public JAXBElement<KeywordEstimatedBid> createKeywordEstimatedBid(KeywordEstimatedBid value) {
        return new JAXBElement<KeywordEstimatedBid>(_KeywordEstimatedBid_QNAME, KeywordEstimatedBid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordEstimatedBid")
    public JAXBElement<ArrayOfKeywordEstimatedBid> createArrayOfKeywordEstimatedBid(ArrayOfKeywordEstimatedBid value) {
        return new JAXBElement<ArrayOfKeywordEstimatedBid>(_ArrayOfKeywordEstimatedBid_QNAME, ArrayOfKeywordEstimatedBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v10", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "TimeInterval")
    public JAXBElement<TimeInterval> createTimeInterval(TimeInterval value) {
        return new JAXBElement<TimeInterval>(_TimeInterval_QNAME, TimeInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCountsByAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "SearchCountsByAttributes")
    public JAXBElement<SearchCountsByAttributes> createSearchCountsByAttributes(SearchCountsByAttributes value) {
        return new JAXBElement<SearchCountsByAttributes>(_SearchCountsByAttributes_QNAME, SearchCountsByAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/AdInsight/v10", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordOpportunity")
    public JAXBElement<ArrayOfKeywordOpportunity> createArrayOfKeywordOpportunity(ArrayOfKeywordOpportunity value) {
        return new JAXBElement<ArrayOfKeywordOpportunity>(_ArrayOfKeywordOpportunity_QNAME, ArrayOfKeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordLocationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordLocationResult")
    public JAXBElement<ArrayOfKeywordLocationResult> createArrayOfKeywordLocationResult(ArrayOfKeywordLocationResult value) {
        return new JAXBElement<ArrayOfKeywordLocationResult>(_ArrayOfKeywordLocationResult_QNAME, ArrayOfKeywordLocationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSearchCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordSearchCount")
    public JAXBElement<KeywordSearchCount> createKeywordSearchCount(KeywordSearchCount value) {
        return new JAXBElement<KeywordSearchCount>(_KeywordSearchCount_QNAME, KeywordSearchCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordIdEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordIdEstimatedPosition")
    public JAXBElement<ArrayOfKeywordIdEstimatedPosition> createArrayOfKeywordIdEstimatedPosition(ArrayOfKeywordIdEstimatedPosition value) {
        return new JAXBElement<ArrayOfKeywordIdEstimatedPosition>(_ArrayOfKeywordIdEstimatedPosition_QNAME, ArrayOfKeywordIdEstimatedPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdGroupBidLandscapeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AdGroupBidLandscapeInput")
    public JAXBElement<AdGroupBidLandscapeInput> createAdGroupBidLandscapeInput(AdGroupBidLandscapeInput value) {
        return new JAXBElement<AdGroupBidLandscapeInput>(_AdGroupBidLandscapeInput_QNAME, AdGroupBidLandscapeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordEstimatedPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordEstimatedPosition")
    public JAXBElement<ArrayOfKeywordEstimatedPosition> createArrayOfKeywordEstimatedPosition(ArrayOfKeywordEstimatedPosition value) {
        return new JAXBElement<ArrayOfKeywordEstimatedPosition>(_ArrayOfKeywordEstimatedPosition_QNAME, ArrayOfKeywordEstimatedPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordAndMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Message", name = "ArrayOfKeywordAndMatchType")
    public JAXBElement<ArrayOfKeywordAndMatchType> createArrayOfKeywordAndMatchType(ArrayOfKeywordAndMatchType value) {
        return new JAXBElement<ArrayOfKeywordAndMatchType>(_ArrayOfKeywordAndMatchType_QNAME, ArrayOfKeywordAndMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "MetricData")
    public JAXBElement<MetricData> createMetricData(MetricData value) {
        return new JAXBElement<MetricData>(_MetricData_QNAME, MetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetAdPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "TargetAdPosition")
    public JAXBElement<TargetAdPosition> createTargetAdPosition(TargetAdPosition value) {
        return new JAXBElement<TargetAdPosition>(_TargetAdPosition_QNAME, TargetAdPosition.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordKPI")
    public JAXBElement<ArrayOfKeywordKPI> createArrayOfKeywordKPI(ArrayOfKeywordKPI value) {
        return new JAXBElement<ArrayOfKeywordKPI>(_ArrayOfKeywordKPI_QNAME, ArrayOfKeywordKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordIdEstimatedBid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordIdEstimatedBid")
    public JAXBElement<KeywordIdEstimatedBid> createKeywordIdEstimatedBid(KeywordIdEstimatedBid value) {
        return new JAXBElement<KeywordIdEstimatedBid>(_KeywordIdEstimatedBid_QNAME, KeywordIdEstimatedBid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordSearchCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordSearchCount")
    public JAXBElement<ArrayOfKeywordSearchCount> createArrayOfKeywordSearchCount(ArrayOfKeywordSearchCount value) {
        return new JAXBElement<ArrayOfKeywordSearchCount>(_ArrayOfKeywordSearchCount_QNAME, ArrayOfKeywordSearchCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfBroadMatchSearchQueryKPI")
    public JAXBElement<ArrayOfBroadMatchSearchQueryKPI> createArrayOfBroadMatchSearchQueryKPI(ArrayOfBroadMatchSearchQueryKPI value) {
        return new JAXBElement<ArrayOfBroadMatchSearchQueryKPI>(_ArrayOfBroadMatchSearchQueryKPI_QNAME, ArrayOfBroadMatchSearchQueryKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfMatchType")
    public JAXBElement<ArrayOfMatchType> createArrayOfMatchType(ArrayOfMatchType value) {
        return new JAXBElement<ArrayOfMatchType>(_ArrayOfMatchType_QNAME, ArrayOfMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalSearchCountPeriodic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "HistoricalSearchCountPeriodic")
    public JAXBElement<HistoricalSearchCountPeriodic> createHistoricalSearchCountPeriodic(HistoricalSearchCountPeriodic value) {
        return new JAXBElement<HistoricalSearchCountPeriodic>(_HistoricalSearchCountPeriodic_QNAME, HistoricalSearchCountPeriodic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Predicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Predicate")
    public JAXBElement<Predicate> createPredicate(Predicate value) {
        return new JAXBElement<Predicate>(_Predicate_QNAME, Predicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordHistoricalPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordHistoricalPerformance")
    public JAXBElement<ArrayOfKeywordHistoricalPerformance> createArrayOfKeywordHistoricalPerformance(ArrayOfKeywordHistoricalPerformance value) {
        return new JAXBElement<ArrayOfKeywordHistoricalPerformance>(_ArrayOfKeywordHistoricalPerformance_QNAME, ArrayOfKeywordHistoricalPerformance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordLocation")
    public JAXBElement<ArrayOfKeywordLocation> createArrayOfKeywordLocation(ArrayOfKeywordLocation value) {
        return new JAXBElement<ArrayOfKeywordLocation>(_ArrayOfKeywordLocation_QNAME, ArrayOfKeywordLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordLocation")
    public JAXBElement<KeywordLocation> createKeywordLocation(KeywordLocation value) {
        return new JAXBElement<KeywordLocation>(_KeywordLocation_QNAME, KeywordLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfMetricData")
    public JAXBElement<ArrayOfMetricData> createArrayOfMetricData(ArrayOfMetricData value) {
        return new JAXBElement<ArrayOfMetricData>(_ArrayOfMetricData_QNAME, ArrayOfMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "BidOpportunityType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<BidOpportunityType>> createBidOpportunityType(Collection<BidOpportunityType> value) {
        return new JAXBElement<Collection<BidOpportunityType>>(_BidOpportunityType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordCategoryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordCategoryResult")
    public JAXBElement<ArrayOfKeywordCategoryResult> createArrayOfKeywordCategoryResult(ArrayOfKeywordCategoryResult value) {
        return new JAXBElement<ArrayOfKeywordCategoryResult>(_ArrayOfKeywordCategoryResult_QNAME, ArrayOfKeywordCategoryResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<Paging>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordLocationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordLocationResult")
    public JAXBElement<KeywordLocationResult> createKeywordLocationResult(KeywordLocationResult value) {
        return new JAXBElement<KeywordLocationResult>(_KeywordLocationResult_QNAME, KeywordLocationResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordDemographic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfKeywordDemographic")
    public JAXBElement<ArrayOfKeywordDemographic> createArrayOfKeywordDemographic(ArrayOfKeywordDemographic value) {
        return new JAXBElement<ArrayOfKeywordDemographic>(_ArrayOfKeywordDemographic_QNAME, ArrayOfKeywordDemographic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPredicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfPredicate")
    public JAXBElement<ArrayOfPredicate> createArrayOfPredicate(ArrayOfPredicate value) {
        return new JAXBElement<ArrayOfPredicate>(_ArrayOfPredicate_QNAME, ArrayOfPredicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Microsoft.Advertiser.AdInsight.Api.Service", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEstimatedPositionAndTraffic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "ArrayOfEstimatedPositionAndTraffic")
    public JAXBElement<ArrayOfEstimatedPositionAndTraffic> createArrayOfEstimatedPositionAndTraffic(ArrayOfEstimatedPositionAndTraffic value) {
        return new JAXBElement<ArrayOfEstimatedPositionAndTraffic>(_ArrayOfEstimatedPositionAndTraffic_QNAME, ArrayOfEstimatedPositionAndTraffic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuctionInsightKPINode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "AuctionInsightKPINode")
    public JAXBElement<AuctionInsightKPINode> createAuctionInsightKPINode(AuctionInsightKPINode value) {
        return new JAXBElement<AuctionInsightKPINode>(_AuctionInsightKPINode_QNAME, AuctionInsightKPINode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity", name = "KeywordOpportunity")
    public JAXBElement<KeywordOpportunity> createKeywordOpportunity(KeywordOpportunity value) {
        return new JAXBElement<KeywordOpportunity>(_KeywordOpportunity_QNAME, KeywordOpportunity.class, null, value);
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
