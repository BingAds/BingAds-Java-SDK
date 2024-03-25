
package com.microsoft.bingads.v13.customerbilling;

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
 * generated in the com.microsoft.bingads.v13.customerbilling package. 
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

    private static final QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "ApplicationToken");
    private static final QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "AuthenticationToken");
    private static final QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "DeveloperToken");
    private static final QName _Password_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "Password");
    private static final QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "UserName");
    private static final QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "TrackingId");
    private static final QName _ApiBatchFaultElement_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "ApiBatchFault");
    private static final QName _ApiFaultElement_QNAME = new QName("https://bingads.microsoft.com/Billing/v13", "ApiFault");
    private static final QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private static final QName _ArrayOfBillingDocumentInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfBillingDocumentInfo");
    private static final QName _BillingDocumentInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "BillingDocumentInfo");
    private static final QName _DataType_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "DataType");
    private static final QName _ArrayOfBillingDocument_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfBillingDocument");
    private static final QName _BillingDocument_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "BillingDocument");
    private static final QName _InsertionOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "InsertionOrder");
    private static final QName _InsertionOrderStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "InsertionOrderStatus");
    private static final QName _InsertionOrderPendingChanges_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "InsertionOrderPendingChanges");
    private static final QName _InsertionOrderPendingChangesStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "InsertionOrderPendingChangesStatus");
    private static final QName _ArrayOfPredicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfPredicate");
    private static final QName _Predicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Predicate");
    private static final QName _PredicateOperator_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "PredicateOperator");
    private static final QName _ArrayOfOrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfOrderBy");
    private static final QName _OrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "OrderBy");
    private static final QName _OrderByField_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "OrderByField");
    private static final QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "SortOrder");
    private static final QName _Paging_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Paging");
    private static final QName _InsertionOrderAdditionalField_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "InsertionOrderAdditionalField");
    private static final QName _ArrayOfInsertionOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfInsertionOrder");
    private static final QName _AccountAdditionalField_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountAdditionalField");
    private static final QName _ArrayOfCoupon_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfCoupon");
    private static final QName _Coupon_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Coupon");
    private static final QName _CouponRedemption_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CouponRedemption");
    private static final QName _CouponClaimInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CouponClaimInfo");
    private static final QName _ArrayOfKeyValueEntityOflongstring_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfKeyValueEntityOflongstring");
    private static final QName _KeyValueEntityOflongstring_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "KeyValueEntityOflongstring");
    private static final QName _ArrayOfKeyValueEntityOflongdateTime_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfKeyValueEntityOflongdateTime");
    private static final QName _KeyValueEntityOflongdateTime_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "KeyValueEntityOflongdateTime");
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
    private static final QName _ApiBatchFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ApiBatchFault");
    private static final QName _ApiFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ApiFault");
    private static final QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ArrayOfOperationError");
    private static final QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "OperationError");
    private static final QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ArrayOfBatchError");
    private static final QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "BatchError");
    private static final QName _ArrayOfArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ArrayOfArrayOfOperationError");
    private static final QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private static final QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private static final QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private static final QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.customerbilling
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
     * Create an instance of {@link GetBillingDocumentsInfoRequest }
     * 
     * @return
     *     the new instance of {@link GetBillingDocumentsInfoRequest }
     */
    public GetBillingDocumentsInfoRequest createGetBillingDocumentsInfoRequest() {
        return new GetBillingDocumentsInfoRequest();
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
     * Create an instance of {@link GetBillingDocumentsInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetBillingDocumentsInfoResponse }
     */
    public GetBillingDocumentsInfoResponse createGetBillingDocumentsInfoResponse() {
        return new GetBillingDocumentsInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingDocumentInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfBillingDocumentInfo }
     */
    public ArrayOfBillingDocumentInfo createArrayOfBillingDocumentInfo() {
        return new ArrayOfBillingDocumentInfo();
    }

    /**
     * Create an instance of {@link ApiBatchFault }
     * 
     * @return
     *     the new instance of {@link ApiBatchFault }
     */
    public ApiBatchFault createApiBatchFault() {
        return new ApiBatchFault();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     * @return
     *     the new instance of {@link ApiFault }
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link GetBillingDocumentsRequest }
     * 
     * @return
     *     the new instance of {@link GetBillingDocumentsRequest }
     */
    public GetBillingDocumentsRequest createGetBillingDocumentsRequest() {
        return new GetBillingDocumentsRequest();
    }

    /**
     * Create an instance of {@link GetBillingDocumentsResponse }
     * 
     * @return
     *     the new instance of {@link GetBillingDocumentsResponse }
     */
    public GetBillingDocumentsResponse createGetBillingDocumentsResponse() {
        return new GetBillingDocumentsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingDocument }
     * 
     * @return
     *     the new instance of {@link ArrayOfBillingDocument }
     */
    public ArrayOfBillingDocument createArrayOfBillingDocument() {
        return new ArrayOfBillingDocument();
    }

    /**
     * Create an instance of {@link AddInsertionOrderRequest }
     * 
     * @return
     *     the new instance of {@link AddInsertionOrderRequest }
     */
    public AddInsertionOrderRequest createAddInsertionOrderRequest() {
        return new AddInsertionOrderRequest();
    }

    /**
     * Create an instance of {@link InsertionOrder }
     * 
     * @return
     *     the new instance of {@link InsertionOrder }
     */
    public InsertionOrder createInsertionOrder() {
        return new InsertionOrder();
    }

    /**
     * Create an instance of {@link AddInsertionOrderResponse }
     * 
     * @return
     *     the new instance of {@link AddInsertionOrderResponse }
     */
    public AddInsertionOrderResponse createAddInsertionOrderResponse() {
        return new AddInsertionOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateInsertionOrderRequest }
     * 
     * @return
     *     the new instance of {@link UpdateInsertionOrderRequest }
     */
    public UpdateInsertionOrderRequest createUpdateInsertionOrderRequest() {
        return new UpdateInsertionOrderRequest();
    }

    /**
     * Create an instance of {@link UpdateInsertionOrderResponse }
     * 
     * @return
     *     the new instance of {@link UpdateInsertionOrderResponse }
     */
    public UpdateInsertionOrderResponse createUpdateInsertionOrderResponse() {
        return new UpdateInsertionOrderResponse();
    }

    /**
     * Create an instance of {@link SearchInsertionOrdersRequest }
     * 
     * @return
     *     the new instance of {@link SearchInsertionOrdersRequest }
     */
    public SearchInsertionOrdersRequest createSearchInsertionOrdersRequest() {
        return new SearchInsertionOrdersRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPredicate }
     * 
     * @return
     *     the new instance of {@link ArrayOfPredicate }
     */
    public ArrayOfPredicate createArrayOfPredicate() {
        return new ArrayOfPredicate();
    }

    /**
     * Create an instance of {@link ArrayOfOrderBy }
     * 
     * @return
     *     the new instance of {@link ArrayOfOrderBy }
     */
    public ArrayOfOrderBy createArrayOfOrderBy() {
        return new ArrayOfOrderBy();
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
     * Create an instance of {@link SearchInsertionOrdersResponse }
     * 
     * @return
     *     the new instance of {@link SearchInsertionOrdersResponse }
     */
    public SearchInsertionOrdersResponse createSearchInsertionOrdersResponse() {
        return new SearchInsertionOrdersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInsertionOrder }
     * 
     * @return
     *     the new instance of {@link ArrayOfInsertionOrder }
     */
    public ArrayOfInsertionOrder createArrayOfInsertionOrder() {
        return new ArrayOfInsertionOrder();
    }

    /**
     * Create an instance of {@link GetAccountMonthlySpendRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountMonthlySpendRequest }
     */
    public GetAccountMonthlySpendRequest createGetAccountMonthlySpendRequest() {
        return new GetAccountMonthlySpendRequest();
    }

    /**
     * Create an instance of {@link GetAccountMonthlySpendResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountMonthlySpendResponse }
     */
    public GetAccountMonthlySpendResponse createGetAccountMonthlySpendResponse() {
        return new GetAccountMonthlySpendResponse();
    }

    /**
     * Create an instance of {@link DispatchCouponsRequest }
     * 
     * @return
     *     the new instance of {@link DispatchCouponsRequest }
     */
    public DispatchCouponsRequest createDispatchCouponsRequest() {
        return new DispatchCouponsRequest();
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
     * Create an instance of {@link DispatchCouponsResponse }
     * 
     * @return
     *     the new instance of {@link DispatchCouponsResponse }
     */
    public DispatchCouponsResponse createDispatchCouponsResponse() {
        return new DispatchCouponsResponse();
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
     * Create an instance of {@link RedeemCouponRequest }
     * 
     * @return
     *     the new instance of {@link RedeemCouponRequest }
     */
    public RedeemCouponRequest createRedeemCouponRequest() {
        return new RedeemCouponRequest();
    }

    /**
     * Create an instance of {@link RedeemCouponResponse }
     * 
     * @return
     *     the new instance of {@link RedeemCouponResponse }
     */
    public RedeemCouponResponse createRedeemCouponResponse() {
        return new RedeemCouponResponse();
    }

    /**
     * Create an instance of {@link SearchCouponsRequest }
     * 
     * @return
     *     the new instance of {@link SearchCouponsRequest }
     */
    public SearchCouponsRequest createSearchCouponsRequest() {
        return new SearchCouponsRequest();
    }

    /**
     * Create an instance of {@link SearchCouponsResponse }
     * 
     * @return
     *     the new instance of {@link SearchCouponsResponse }
     */
    public SearchCouponsResponse createSearchCouponsResponse() {
        return new SearchCouponsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCoupon }
     * 
     * @return
     *     the new instance of {@link ArrayOfCoupon }
     */
    public ArrayOfCoupon createArrayOfCoupon() {
        return new ArrayOfCoupon();
    }

    /**
     * Create an instance of {@link CheckFeatureAdoptionCouponEligibilityRequest }
     * 
     * @return
     *     the new instance of {@link CheckFeatureAdoptionCouponEligibilityRequest }
     */
    public CheckFeatureAdoptionCouponEligibilityRequest createCheckFeatureAdoptionCouponEligibilityRequest() {
        return new CheckFeatureAdoptionCouponEligibilityRequest();
    }

    /**
     * Create an instance of {@link CheckFeatureAdoptionCouponEligibilityResponse }
     * 
     * @return
     *     the new instance of {@link CheckFeatureAdoptionCouponEligibilityResponse }
     */
    public CheckFeatureAdoptionCouponEligibilityResponse createCheckFeatureAdoptionCouponEligibilityResponse() {
        return new CheckFeatureAdoptionCouponEligibilityResponse();
    }

    /**
     * Create an instance of {@link ClaimFeatureAdoptionCouponsRequest }
     * 
     * @return
     *     the new instance of {@link ClaimFeatureAdoptionCouponsRequest }
     */
    public ClaimFeatureAdoptionCouponsRequest createClaimFeatureAdoptionCouponsRequest() {
        return new ClaimFeatureAdoptionCouponsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueEntityOflongstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValueEntityOflongstring }
     */
    public ArrayOfKeyValueEntityOflongstring createArrayOfKeyValueEntityOflongstring() {
        return new ArrayOfKeyValueEntityOflongstring();
    }

    /**
     * Create an instance of {@link ClaimFeatureAdoptionCouponsResponse }
     * 
     * @return
     *     the new instance of {@link ClaimFeatureAdoptionCouponsResponse }
     */
    public ClaimFeatureAdoptionCouponsResponse createClaimFeatureAdoptionCouponsResponse() {
        return new ClaimFeatureAdoptionCouponsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueEntityOflongdateTime }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValueEntityOflongdateTime }
     */
    public ArrayOfKeyValueEntityOflongdateTime createArrayOfKeyValueEntityOflongdateTime() {
        return new ArrayOfKeyValueEntityOflongdateTime();
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
     * Create an instance of {@link ArrayOfArrayOfOperationError }
     * 
     * @return
     *     the new instance of {@link ArrayOfArrayOfOperationError }
     */
    public ArrayOfArrayOfOperationError createArrayOfArrayOfOperationError() {
        return new ArrayOfArrayOfOperationError();
    }

    /**
     * Create an instance of {@link BillingDocumentInfo }
     * 
     * @return
     *     the new instance of {@link BillingDocumentInfo }
     */
    public BillingDocumentInfo createBillingDocumentInfo() {
        return new BillingDocumentInfo();
    }

    /**
     * Create an instance of {@link BillingDocument }
     * 
     * @return
     *     the new instance of {@link BillingDocument }
     */
    public BillingDocument createBillingDocument() {
        return new BillingDocument();
    }

    /**
     * Create an instance of {@link InsertionOrderPendingChanges }
     * 
     * @return
     *     the new instance of {@link InsertionOrderPendingChanges }
     */
    public InsertionOrderPendingChanges createInsertionOrderPendingChanges() {
        return new InsertionOrderPendingChanges();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     * @return
     *     the new instance of {@link Predicate }
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     * @return
     *     the new instance of {@link OrderBy }
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     * @return
     *     the new instance of {@link Coupon }
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link CouponRedemption }
     * 
     * @return
     *     the new instance of {@link CouponRedemption }
     */
    public CouponRedemption createCouponRedemption() {
        return new CouponRedemption();
    }

    /**
     * Create an instance of {@link CouponClaimInfo }
     * 
     * @return
     *     the new instance of {@link CouponClaimInfo }
     */
    public CouponClaimInfo createCouponClaimInfo() {
        return new CouponClaimInfo();
    }

    /**
     * Create an instance of {@link KeyValueEntityOflongstring }
     * 
     * @return
     *     the new instance of {@link KeyValueEntityOflongstring }
     */
    public KeyValueEntityOflongstring createKeyValueEntityOflongstring() {
        return new KeyValueEntityOflongstring();
    }

    /**
     * Create an instance of {@link KeyValueEntityOflongdateTime }
     * 
     * @return
     *     the new instance of {@link KeyValueEntityOflongdateTime }
     */
    public KeyValueEntityOflongdateTime createKeyValueEntityOflongdateTime() {
        return new KeyValueEntityOflongdateTime();
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
     * Create an instance of {@link OperationError }
     * 
     * @return
     *     the new instance of {@link OperationError }
     */
    public OperationError createOperationError() {
        return new OperationError();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "ApplicationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "AuthenticationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "DeveloperToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "Password")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "UserName")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "ApiBatchFault")
    public JAXBElement<ApiBatchFault> createApiBatchFaultElement(ApiBatchFault value) {
        return new JAXBElement<>(_ApiBatchFaultElement_QNAME, ApiBatchFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v13", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFaultElement(ApiFault value) {
        return new JAXBElement<>(_ApiFaultElement_QNAME, ApiFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfBillingDocumentInfo")
    public JAXBElement<ArrayOfBillingDocumentInfo> createArrayOfBillingDocumentInfo(ArrayOfBillingDocumentInfo value) {
        return new JAXBElement<>(_ArrayOfBillingDocumentInfo_QNAME, ArrayOfBillingDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillingDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "BillingDocumentInfo")
    public JAXBElement<BillingDocumentInfo> createBillingDocumentInfo(BillingDocumentInfo value) {
        return new JAXBElement<>(_BillingDocumentInfo_QNAME, BillingDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "DataType")
    public JAXBElement<DataType> createDataType(DataType value) {
        return new JAXBElement<>(_DataType_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfBillingDocument")
    public JAXBElement<ArrayOfBillingDocument> createArrayOfBillingDocument(ArrayOfBillingDocument value) {
        return new JAXBElement<>(_ArrayOfBillingDocument_QNAME, ArrayOfBillingDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillingDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "BillingDocument")
    public JAXBElement<BillingDocument> createBillingDocument(BillingDocument value) {
        return new JAXBElement<>(_BillingDocument_QNAME, BillingDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertionOrder }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "InsertionOrder")
    public JAXBElement<InsertionOrder> createInsertionOrder(InsertionOrder value) {
        return new JAXBElement<>(_InsertionOrder_QNAME, InsertionOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertionOrderStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "InsertionOrderStatus")
    public JAXBElement<InsertionOrderStatus> createInsertionOrderStatus(InsertionOrderStatus value) {
        return new JAXBElement<>(_InsertionOrderStatus_QNAME, InsertionOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChanges }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChanges }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "InsertionOrderPendingChanges")
    public JAXBElement<InsertionOrderPendingChanges> createInsertionOrderPendingChanges(InsertionOrderPendingChanges value) {
        return new JAXBElement<>(_InsertionOrderPendingChanges_QNAME, InsertionOrderPendingChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChangesStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChangesStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "InsertionOrderPendingChangesStatus")
    public JAXBElement<InsertionOrderPendingChangesStatus> createInsertionOrderPendingChangesStatus(InsertionOrderPendingChangesStatus value) {
        return new JAXBElement<>(_InsertionOrderPendingChangesStatus_QNAME, InsertionOrderPendingChangesStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPredicate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPredicate }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfPredicate")
    public JAXBElement<ArrayOfPredicate> createArrayOfPredicate(ArrayOfPredicate value) {
        return new JAXBElement<>(_ArrayOfPredicate_QNAME, ArrayOfPredicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Predicate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Predicate }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Predicate")
    public JAXBElement<Predicate> createPredicate(Predicate value) {
        return new JAXBElement<>(_Predicate_QNAME, Predicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredicateOperator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PredicateOperator }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "PredicateOperator")
    public JAXBElement<PredicateOperator> createPredicateOperator(PredicateOperator value) {
        return new JAXBElement<>(_PredicateOperator_QNAME, PredicateOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfOrderBy")
    public JAXBElement<ArrayOfOrderBy> createArrayOfOrderBy(ArrayOfOrderBy value) {
        return new JAXBElement<>(_ArrayOfOrderBy_QNAME, ArrayOfOrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "OrderBy")
    public JAXBElement<OrderBy> createOrderBy(OrderBy value) {
        return new JAXBElement<>(_OrderBy_QNAME, OrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderByField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderByField }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "OrderByField")
    public JAXBElement<OrderByField> createOrderByField(OrderByField value) {
        return new JAXBElement<>(_OrderByField_QNAME, OrderByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link InsertionOrderAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link InsertionOrderAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "InsertionOrderAdditionalField")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<InsertionOrderAdditionalField>> createInsertionOrderAdditionalField(Collection<InsertionOrderAdditionalField> value) {
        return new JAXBElement<>(_InsertionOrderAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsertionOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInsertionOrder }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfInsertionOrder")
    public JAXBElement<ArrayOfInsertionOrder> createArrayOfInsertionOrder(ArrayOfInsertionOrder value) {
        return new JAXBElement<>(_ArrayOfInsertionOrder_QNAME, ArrayOfInsertionOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AccountAdditionalField }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link AccountAdditionalField }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountAdditionalField")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Collection<AccountAdditionalField>> createAccountAdditionalField(Collection<AccountAdditionalField> value) {
        return new JAXBElement<>(_AccountAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoupon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCoupon }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfCoupon")
    public JAXBElement<ArrayOfCoupon> createArrayOfCoupon(ArrayOfCoupon value) {
        return new JAXBElement<>(_ArrayOfCoupon_QNAME, ArrayOfCoupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Coupon }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Coupon")
    public JAXBElement<Coupon> createCoupon(Coupon value) {
        return new JAXBElement<>(_Coupon_QNAME, Coupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponRedemption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CouponRedemption }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CouponRedemption")
    public JAXBElement<CouponRedemption> createCouponRedemption(CouponRedemption value) {
        return new JAXBElement<>(_CouponRedemption_QNAME, CouponRedemption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponClaimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CouponClaimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CouponClaimInfo")
    public JAXBElement<CouponClaimInfo> createCouponClaimInfo(CouponClaimInfo value) {
        return new JAXBElement<>(_CouponClaimInfo_QNAME, CouponClaimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueEntityOflongstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueEntityOflongstring }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfKeyValueEntityOflongstring")
    public JAXBElement<ArrayOfKeyValueEntityOflongstring> createArrayOfKeyValueEntityOflongstring(ArrayOfKeyValueEntityOflongstring value) {
        return new JAXBElement<>(_ArrayOfKeyValueEntityOflongstring_QNAME, ArrayOfKeyValueEntityOflongstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueEntityOflongstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValueEntityOflongstring }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "KeyValueEntityOflongstring")
    public JAXBElement<KeyValueEntityOflongstring> createKeyValueEntityOflongstring(KeyValueEntityOflongstring value) {
        return new JAXBElement<>(_KeyValueEntityOflongstring_QNAME, KeyValueEntityOflongstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueEntityOflongdateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueEntityOflongdateTime }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfKeyValueEntityOflongdateTime")
    public JAXBElement<ArrayOfKeyValueEntityOflongdateTime> createArrayOfKeyValueEntityOflongdateTime(ArrayOfKeyValueEntityOflongdateTime value) {
        return new JAXBElement<>(_ArrayOfKeyValueEntityOflongdateTime_QNAME, ArrayOfKeyValueEntityOflongdateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueEntityOflongdateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValueEntityOflongdateTime }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "KeyValueEntityOflongdateTime")
    public JAXBElement<KeyValueEntityOflongdateTime> createKeyValueEntityOflongdateTime(KeyValueEntityOflongdateTime value) {
        return new JAXBElement<>(_KeyValueEntityOflongdateTime_QNAME, KeyValueEntityOflongdateTime.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "ApiBatchFault")
    public JAXBElement<ApiBatchFault> createApiBatchFault(ApiBatchFault value) {
        return new JAXBElement<>(_ApiBatchFault_QNAME, ApiBatchFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "ArrayOfOperationError")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "ArrayOfBatchError")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfOperationError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfOperationError }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Exception", name = "ArrayOfArrayOfOperationError")
    public JAXBElement<ArrayOfArrayOfOperationError> createArrayOfArrayOfOperationError(ArrayOfArrayOfOperationError value) {
        return new JAXBElement<>(_ArrayOfArrayOfOperationError_QNAME, ArrayOfArrayOfOperationError.class, null, value);
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
