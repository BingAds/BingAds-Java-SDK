
package com.microsoft.bingads.optimizer;

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
 * generated in the com.microsoft.bingads.optimizer package. 
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

    private final static QName _ArrayOfBroadMatchSearchQueryKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchSearchQueryKPI");
    private final static QName _ArrayOfAppliedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfAppliedResult");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "ApplicationToken");
    private final static QName _BroadMatchOpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunityModifier");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _BidOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunity");
    private final static QName _OpportunityAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityAction");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _KeywordOpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunityModifier");
    private final static QName _BroadMatchOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchOpportunity");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfBudgetOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetOpportunity");
    private final static QName _BroadMatchSearchQueryKPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQueryKPI");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "AuthenticationToken");
    private final static QName _BudgetPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPoint");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _BudgetLimitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts", "BudgetLimitType");
    private final static QName _ArrayOfBudgetPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetPoint");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _KeywordOpportunityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunityType");
    private final static QName _BroadMatchSearchQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchSearchQuery");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _BidOpportunityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunityType");
    private final static QName _BudgetOpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunityModifier");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "TrackingId");
    private final static QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "CustomerId");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfBroadMatchOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchOpportunity");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _KeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "KeywordOpportunity");
    private final static QName _ArrayOfOpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfOpportunityModifier");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "Password");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _AppliedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "AppliedResult");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BudgetPointType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetPointType");
    private final static QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "CustomerAccountId");
    private final static QName _BidOpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BidOpportunityModifier");
    private final static QName _BudgetLandscapePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetLandscapePoint");
    private final static QName _ArrayOfBidOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBidOpportunity");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _BroadMatchKeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchKeywordOpportunity");
    private final static QName _OpportunityModifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "OpportunityModifier");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "ArrayOfOperationError");
    private final static QName _BudgetOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BudgetOpportunity");
    private final static QName _BroadMatchAppliedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "BroadMatchAppliedResult");
    private final static QName _Opportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "Opportunity");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "ApiFaultDetail");
    private final static QName _ArrayOfBudgetLandscapePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBudgetLandscapePoint");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "DeveloperToken");
    private final static QName _ArrayOfKeywordOpportunity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfKeywordOpportunity");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _ArrayOfBroadMatchSearchQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfBroadMatchSearchQuery");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "OperationError");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "BatchError");
    private final static QName _ArrayOfCampaignBudgetLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "ArrayOfCampaignBudgetLandscape");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "UserName");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Optimizer/v9", "ArrayOfBatchError");
    private final static QName _CampaignBudgetLandscape_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", "CampaignBudgetLandscape");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.optimizer
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
     * Create an instance of {@link ArrayOfOperationError }
     * 
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
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
     * Create an instance of {@link ApplyOpportunityModifiersResponse }
     * 
     */
    public ApplyOpportunityModifiersResponse createApplyOpportunityModifiersResponse() {
        return new ApplyOpportunityModifiersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAppliedResult }
     * 
     */
    public ArrayOfAppliedResult createArrayOfAppliedResult() {
        return new ArrayOfAppliedResult();
    }

    /**
     * Create an instance of {@link GetKeywordOpportunitiesRequest }
     * 
     */
    public GetKeywordOpportunitiesRequest createGetKeywordOpportunitiesRequest() {
        return new GetKeywordOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link GetBroadMatchOpportunitiesRequest }
     * 
     */
    public GetBroadMatchOpportunitiesRequest createGetBroadMatchOpportunitiesRequest() {
        return new GetBroadMatchOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link GetBidOpportunitiesRequest }
     * 
     */
    public GetBidOpportunitiesRequest createGetBidOpportunitiesRequest() {
        return new GetBidOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link GetBroadMatchOpportunitiesResponse }
     * 
     */
    public GetBroadMatchOpportunitiesResponse createGetBroadMatchOpportunitiesResponse() {
        return new GetBroadMatchOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBroadMatchOpportunity }
     * 
     */
    public ArrayOfBroadMatchOpportunity createArrayOfBroadMatchOpportunity() {
        return new ArrayOfBroadMatchOpportunity();
    }

    /**
     * Create an instance of {@link ArrayOfBatchError }
     * 
     */
    public ArrayOfBatchError createArrayOfBatchError() {
        return new ArrayOfBatchError();
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
     * Create an instance of {@link ApplyOpportunitiesRequest }
     * 
     */
    public ApplyOpportunitiesRequest createApplyOpportunitiesRequest() {
        return new ApplyOpportunitiesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfOpportunityModifier }
     * 
     */
    public ArrayOfOpportunityModifier createArrayOfOpportunityModifier() {
        return new ArrayOfOpportunityModifier();
    }

    /**
     * Create an instance of {@link BatchError }
     * 
     */
    public BatchError createBatchError() {
        return new BatchError();
    }

    /**
     * Create an instance of {@link GetBudgetLandscapeResponse }
     * 
     */
    public GetBudgetLandscapeResponse createGetBudgetLandscapeResponse() {
        return new GetBudgetLandscapeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignBudgetLandscape }
     * 
     */
    public ArrayOfCampaignBudgetLandscape createArrayOfCampaignBudgetLandscape() {
        return new ArrayOfCampaignBudgetLandscape();
    }

    /**
     * Create an instance of {@link GetBroadMatchSearchQueriesResponse }
     * 
     */
    public GetBroadMatchSearchQueriesResponse createGetBroadMatchSearchQueriesResponse() {
        return new GetBroadMatchSearchQueriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBroadMatchSearchQuery }
     * 
     */
    public ArrayOfBroadMatchSearchQuery createArrayOfBroadMatchSearchQuery() {
        return new ArrayOfBroadMatchSearchQuery();
    }

    /**
     * Create an instance of {@link OperationError }
     * 
     */
    public OperationError createOperationError() {
        return new OperationError();
    }

    /**
     * Create an instance of {@link ApplyOpportunityModifiersRequest }
     * 
     */
    public ApplyOpportunityModifiersRequest createApplyOpportunityModifiersRequest() {
        return new ApplyOpportunityModifiersRequest();
    }

    /**
     * Create an instance of {@link ApplyOpportunitiesResponse }
     * 
     */
    public ApplyOpportunitiesResponse createApplyOpportunitiesResponse() {
        return new ApplyOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link GetBudgetLandscapeRequest }
     * 
     */
    public GetBudgetLandscapeRequest createGetBudgetLandscapeRequest() {
        return new GetBudgetLandscapeRequest();
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
     * Create an instance of {@link GetBroadMatchSearchQueriesRequest }
     * 
     */
    public GetBroadMatchSearchQueriesRequest createGetBroadMatchSearchQueriesRequest() {
        return new GetBroadMatchSearchQueriesRequest();
    }

    /**
     * Create an instance of {@link BroadMatchOpportunityModifier }
     * 
     */
    public BroadMatchOpportunityModifier createBroadMatchOpportunityModifier() {
        return new BroadMatchOpportunityModifier();
    }

    /**
     * Create an instance of {@link BidOpportunity }
     * 
     */
    public BidOpportunity createBidOpportunity() {
        return new BidOpportunity();
    }

    /**
     * Create an instance of {@link BidOpportunityModifier }
     * 
     */
    public BidOpportunityModifier createBidOpportunityModifier() {
        return new BidOpportunityModifier();
    }

    /**
     * Create an instance of {@link ArrayOfBroadMatchSearchQueryKPI }
     * 
     */
    public ArrayOfBroadMatchSearchQueryKPI createArrayOfBroadMatchSearchQueryKPI() {
        return new ArrayOfBroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link AppliedResult }
     * 
     */
    public AppliedResult createAppliedResult() {
        return new AppliedResult();
    }

    /**
     * Create an instance of {@link BroadMatchOpportunity }
     * 
     */
    public BroadMatchOpportunity createBroadMatchOpportunity() {
        return new BroadMatchOpportunity();
    }

    /**
     * Create an instance of {@link OpportunityModifier }
     * 
     */
    public OpportunityModifier createOpportunityModifier() {
        return new OpportunityModifier();
    }

    /**
     * Create an instance of {@link KeywordOpportunityModifier }
     * 
     */
    public KeywordOpportunityModifier createKeywordOpportunityModifier() {
        return new KeywordOpportunityModifier();
    }

    /**
     * Create an instance of {@link BudgetOpportunity }
     * 
     */
    public BudgetOpportunity createBudgetOpportunity() {
        return new BudgetOpportunity();
    }

    /**
     * Create an instance of {@link BroadMatchSearchQueryKPI }
     * 
     */
    public BroadMatchSearchQueryKPI createBroadMatchSearchQueryKPI() {
        return new BroadMatchSearchQueryKPI();
    }

    /**
     * Create an instance of {@link BroadMatchAppliedResult }
     * 
     */
    public BroadMatchAppliedResult createBroadMatchAppliedResult() {
        return new BroadMatchAppliedResult();
    }

    /**
     * Create an instance of {@link BudgetPoint }
     * 
     */
    public BudgetPoint createBudgetPoint() {
        return new BudgetPoint();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link BudgetLandscapePoint }
     * 
     */
    public BudgetLandscapePoint createBudgetLandscapePoint() {
        return new BudgetLandscapePoint();
    }

    /**
     * Create an instance of {@link BroadMatchKeywordOpportunity }
     * 
     */
    public BroadMatchKeywordOpportunity createBroadMatchKeywordOpportunity() {
        return new BroadMatchKeywordOpportunity();
    }

    /**
     * Create an instance of {@link BroadMatchSearchQuery }
     * 
     */
    public BroadMatchSearchQuery createBroadMatchSearchQuery() {
        return new BroadMatchSearchQuery();
    }

    /**
     * Create an instance of {@link BudgetOpportunityModifier }
     * 
     */
    public BudgetOpportunityModifier createBudgetOpportunityModifier() {
        return new BudgetOpportunityModifier();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetLandscapePoint }
     * 
     */
    public ArrayOfBudgetLandscapePoint createArrayOfBudgetLandscapePoint() {
        return new ArrayOfBudgetLandscapePoint();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetPoint }
     * 
     */
    public ArrayOfBudgetPoint createArrayOfBudgetPoint() {
        return new ArrayOfBudgetPoint();
    }

    /**
     * Create an instance of {@link KeywordOpportunity }
     * 
     */
    public KeywordOpportunity createKeywordOpportunity() {
        return new KeywordOpportunity();
    }

    /**
     * Create an instance of {@link CampaignBudgetLandscape }
     * 
     */
    public CampaignBudgetLandscape createCampaignBudgetLandscape() {
        return new CampaignBudgetLandscape();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBroadMatchSearchQueryKPI")
    public JAXBElement<ArrayOfBroadMatchSearchQueryKPI> createArrayOfBroadMatchSearchQueryKPI(ArrayOfBroadMatchSearchQueryKPI value) {
        return new JAXBElement<ArrayOfBroadMatchSearchQueryKPI>(_ArrayOfBroadMatchSearchQueryKPI_QNAME, ArrayOfBroadMatchSearchQueryKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAppliedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfAppliedResult")
    public JAXBElement<ArrayOfAppliedResult> createArrayOfAppliedResult(ArrayOfAppliedResult value) {
        return new JAXBElement<ArrayOfAppliedResult>(_ArrayOfAppliedResult_QNAME, ArrayOfAppliedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchOpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchOpportunityModifier")
    public JAXBElement<BroadMatchOpportunityModifier> createBroadMatchOpportunityModifier(BroadMatchOpportunityModifier value) {
        return new JAXBElement<BroadMatchOpportunityModifier>(_BroadMatchOpportunityModifier_QNAME, BroadMatchOpportunityModifier.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BidOpportunity")
    public JAXBElement<BidOpportunity> createBidOpportunity(BidOpportunity value) {
        return new JAXBElement<BidOpportunity>(_BidOpportunity_QNAME, BidOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "OpportunityAction")
    public JAXBElement<OpportunityAction> createOpportunityAction(OpportunityAction value) {
        return new JAXBElement<OpportunityAction>(_OpportunityAction_QNAME, OpportunityAction.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdApiError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ArrayOfAdApiError")
    public JAXBElement<ArrayOfAdApiError> createArrayOfAdApiError(ArrayOfAdApiError value) {
        return new JAXBElement<ArrayOfAdApiError>(_ArrayOfAdApiError_QNAME, ArrayOfAdApiError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordOpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "KeywordOpportunityModifier")
    public JAXBElement<KeywordOpportunityModifier> createKeywordOpportunityModifier(KeywordOpportunityModifier value) {
        return new JAXBElement<KeywordOpportunityModifier>(_KeywordOpportunityModifier_QNAME, KeywordOpportunityModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchOpportunity")
    public JAXBElement<BroadMatchOpportunity> createBroadMatchOpportunity(BroadMatchOpportunity value) {
        return new JAXBElement<BroadMatchOpportunity>(_BroadMatchOpportunity_QNAME, BroadMatchOpportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBudgetOpportunity")
    public JAXBElement<ArrayOfBudgetOpportunity> createArrayOfBudgetOpportunity(ArrayOfBudgetOpportunity value) {
        return new JAXBElement<ArrayOfBudgetOpportunity>(_ArrayOfBudgetOpportunity_QNAME, ArrayOfBudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchSearchQueryKPI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchSearchQueryKPI")
    public JAXBElement<BroadMatchSearchQueryKPI> createBroadMatchSearchQueryKPI(BroadMatchSearchQueryKPI value) {
        return new JAXBElement<BroadMatchSearchQueryKPI>(_BroadMatchSearchQueryKPI_QNAME, BroadMatchSearchQueryKPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BudgetPoint")
    public JAXBElement<BudgetPoint> createBudgetPoint(BudgetPoint value) {
        return new JAXBElement<BudgetPoint>(_BudgetPoint_QNAME, BudgetPoint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts", name = "BudgetLimitType")
    public JAXBElement<BudgetLimitType> createBudgetLimitType(BudgetLimitType value) {
        return new JAXBElement<BudgetLimitType>(_BudgetLimitType_QNAME, BudgetLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBudgetPoint")
    public JAXBElement<ArrayOfBudgetPoint> createArrayOfBudgetPoint(ArrayOfBudgetPoint value) {
        return new JAXBElement<ArrayOfBudgetPoint>(_ArrayOfBudgetPoint_QNAME, ArrayOfBudgetPoint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Char }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Char> createChar(Char value) {
        return new JAXBElement<Char>(_Char_QNAME, Char.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link KeywordOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "KeywordOpportunityType")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<KeywordOpportunityType>> createKeywordOpportunityType(Collection<KeywordOpportunityType> value) {
        return new JAXBElement<Collection<KeywordOpportunityType>>(_KeywordOpportunityType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchSearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchSearchQuery")
    public JAXBElement<BroadMatchSearchQuery> createBroadMatchSearchQuery(BroadMatchSearchQuery value) {
        return new JAXBElement<BroadMatchSearchQuery>(_BroadMatchSearchQuery_QNAME, BroadMatchSearchQuery.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link BidOpportunityType }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BidOpportunityType")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<BidOpportunityType>> createBidOpportunityType(Collection<BidOpportunityType> value) {
        return new JAXBElement<Collection<BidOpportunityType>>(_BidOpportunityType_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetOpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BudgetOpportunityModifier")
    public JAXBElement<BudgetOpportunityModifier> createBudgetOpportunityModifier(BudgetOpportunityModifier value) {
        return new JAXBElement<BudgetOpportunityModifier>(_BudgetOpportunityModifier_QNAME, BudgetOpportunityModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBroadMatchOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBroadMatchOpportunity")
    public JAXBElement<ArrayOfBroadMatchOpportunity> createArrayOfBroadMatchOpportunity(ArrayOfBroadMatchOpportunity value) {
        return new JAXBElement<ArrayOfBroadMatchOpportunity>(_ArrayOfBroadMatchOpportunity_QNAME, ArrayOfBroadMatchOpportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "KeywordOpportunity")
    public JAXBElement<KeywordOpportunity> createKeywordOpportunity(KeywordOpportunity value) {
        return new JAXBElement<KeywordOpportunity>(_KeywordOpportunity_QNAME, KeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfOpportunityModifier")
    public JAXBElement<ArrayOfOpportunityModifier> createArrayOfOpportunityModifier(ArrayOfOpportunityModifier value) {
        return new JAXBElement<ArrayOfOpportunityModifier>(_ArrayOfOpportunityModifier_QNAME, ArrayOfOpportunityModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AppliedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "AppliedResult")
    public JAXBElement<AppliedResult> createAppliedResult(AppliedResult value) {
        return new JAXBElement<AppliedResult>(_AppliedResult_QNAME, AppliedResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BudgetPointType")
    public JAXBElement<BudgetPointType> createBudgetPointType(BudgetPointType value) {
        return new JAXBElement<BudgetPointType>(_BudgetPointType_QNAME, BudgetPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "CustomerAccountId")
    public JAXBElement<String> createCustomerAccountId(String value) {
        return new JAXBElement<String>(_CustomerAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidOpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BidOpportunityModifier")
    public JAXBElement<BidOpportunityModifier> createBidOpportunityModifier(BidOpportunityModifier value) {
        return new JAXBElement<BidOpportunityModifier>(_BidOpportunityModifier_QNAME, BidOpportunityModifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BudgetLandscapePoint")
    public JAXBElement<BudgetLandscapePoint> createBudgetLandscapePoint(BudgetLandscapePoint value) {
        return new JAXBElement<BudgetLandscapePoint>(_BudgetLandscapePoint_QNAME, BudgetLandscapePoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBidOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBidOpportunity")
    public JAXBElement<ArrayOfBidOpportunity> createArrayOfBidOpportunity(ArrayOfBidOpportunity value) {
        return new JAXBElement<ArrayOfBidOpportunity>(_ArrayOfBidOpportunity_QNAME, ArrayOfBidOpportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchKeywordOpportunity")
    public JAXBElement<BroadMatchKeywordOpportunity> createBroadMatchKeywordOpportunity(BroadMatchKeywordOpportunity value) {
        return new JAXBElement<BroadMatchKeywordOpportunity>(_BroadMatchKeywordOpportunity_QNAME, BroadMatchKeywordOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityModifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "OpportunityModifier")
    public JAXBElement<OpportunityModifier> createOpportunityModifier(OpportunityModifier value) {
        return new JAXBElement<OpportunityModifier>(_OpportunityModifier_QNAME, OpportunityModifier.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BudgetOpportunity")
    public JAXBElement<BudgetOpportunity> createBudgetOpportunity(BudgetOpportunity value) {
        return new JAXBElement<BudgetOpportunity>(_BudgetOpportunity_QNAME, BudgetOpportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadMatchAppliedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "BroadMatchAppliedResult")
    public JAXBElement<BroadMatchAppliedResult> createBroadMatchAppliedResult(BroadMatchAppliedResult value) {
        return new JAXBElement<BroadMatchAppliedResult>(_BroadMatchAppliedResult_QNAME, BroadMatchAppliedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "Opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "ApiFaultDetail")
    public JAXBElement<ApiFaultDetail> createApiFaultDetail(ApiFaultDetail value) {
        return new JAXBElement<ApiFaultDetail>(_ApiFaultDetail_QNAME, ApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBudgetLandscapePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBudgetLandscapePoint")
    public JAXBElement<ArrayOfBudgetLandscapePoint> createArrayOfBudgetLandscapePoint(ArrayOfBudgetLandscapePoint value) {
        return new JAXBElement<ArrayOfBudgetLandscapePoint>(_ArrayOfBudgetLandscapePoint_QNAME, ArrayOfBudgetLandscapePoint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiFaultDetail")
    public JAXBElement<AdApiFaultDetail> createAdApiFaultDetail(AdApiFaultDetail value) {
        return new JAXBElement<AdApiFaultDetail>(_AdApiFaultDetail_QNAME, AdApiFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeywordOpportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfKeywordOpportunity")
    public JAXBElement<ArrayOfKeywordOpportunity> createArrayOfKeywordOpportunity(ArrayOfKeywordOpportunity value) {
        return new JAXBElement<ArrayOfKeywordOpportunity>(_ArrayOfKeywordOpportunity_QNAME, ArrayOfKeywordOpportunity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "ApplicationFault")
    public JAXBElement<ApplicationFault> createApplicationFault(ApplicationFault value) {
        return new JAXBElement<ApplicationFault>(_ApplicationFault_QNAME, ApplicationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBroadMatchSearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfBroadMatchSearchQuery")
    public JAXBElement<ArrayOfBroadMatchSearchQuery> createArrayOfBroadMatchSearchQuery(ArrayOfBroadMatchSearchQuery value) {
        return new JAXBElement<ArrayOfBroadMatchSearchQuery>(_ArrayOfBroadMatchSearchQuery_QNAME, ArrayOfBroadMatchSearchQuery.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignBudgetLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "ArrayOfCampaignBudgetLandscape")
    public JAXBElement<ArrayOfCampaignBudgetLandscape> createArrayOfCampaignBudgetLandscape(ArrayOfCampaignBudgetLandscape value) {
        return new JAXBElement<ArrayOfCampaignBudgetLandscape>(_ArrayOfCampaignBudgetLandscape_QNAME, ArrayOfCampaignBudgetLandscape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Optimizer/v9", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignBudgetLandscape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities", name = "CampaignBudgetLandscape")
    public JAXBElement<CampaignBudgetLandscape> createCampaignBudgetLandscape(CampaignBudgetLandscape value) {
        return new JAXBElement<CampaignBudgetLandscape>(_CampaignBudgetLandscape_QNAME, CampaignBudgetLandscape.class, null, value);
    }

}
