
package com.microsoft.bingads.v12.customerbilling;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.bingads.v12.customerbilling package. 
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

    private final static QName _ApiFaultElement_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "ApiFault");
    private final static QName _PredicateOperator_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "PredicateOperator");
    private final static QName _ApiFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "ApiFault");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "Password");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ArrayOfBillingDocumentInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "ArrayOfBillingDocumentInfo");
    private final static QName _ArrayOfInsertionOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "ArrayOfInsertionOrder");
    private final static QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "SortOrder");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _OrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "OrderBy");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "ArrayOfOperationError");
    private final static QName _DataType_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "DataType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "DeveloperToken");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _OrderByField_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "OrderByField");
    private final static QName _BillingDocument_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "BillingDocument");
    private final static QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "UserName");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "OperationError");
    private final static QName _InsertionOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "InsertionOrder");
    private final static QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "ArrayOfBatchError");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "BatchError");
    private final static QName _ApiBatchFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Exception", "ApiBatchFault");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _InsertionOrderPendingChanges_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "InsertionOrderPendingChanges");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "ApplicationToken");
    private final static QName _ApiBatchFaultElement_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "ApiBatchFault");
    private final static QName _ArrayOfBillingDocument_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "ArrayOfBillingDocument");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "AuthenticationToken");
    private final static QName _ArrayOfPredicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "ArrayOfPredicate");
    private final static QName _InsertionOrderStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "InsertionOrderStatus");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _Paging_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "Paging");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _BillingDocumentInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "BillingDocumentInfo");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfOrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "ArrayOfOrderBy");
    private final static QName _InsertionOrderPendingChangesStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "InsertionOrderPendingChangesStatus");
    private final static QName _Predicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v12/Entities", "Predicate");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Billing/v12", "TrackingId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v12.customerbilling
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
     * Create an instance of {@link GetBillingDocumentsInfoRequest }
     * 
     */
    public GetBillingDocumentsInfoRequest createGetBillingDocumentsInfoRequest() {
        return new GetBillingDocumentsInfoRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link GetBillingDocumentsInfoResponse }
     * 
     */
    public GetBillingDocumentsInfoResponse createGetBillingDocumentsInfoResponse() {
        return new GetBillingDocumentsInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingDocumentInfo }
     * 
     */
    public ArrayOfBillingDocumentInfo createArrayOfBillingDocumentInfo() {
        return new ArrayOfBillingDocumentInfo();
    }

    /**
     * Create an instance of {@link GetInsertionOrdersByAccountRequest }
     * 
     */
    public GetInsertionOrdersByAccountRequest createGetInsertionOrdersByAccountRequest() {
        return new GetInsertionOrdersByAccountRequest();
    }

    /**
     * Create an instance of {@link UpdateInsertionOrderRequest }
     * 
     */
    public UpdateInsertionOrderRequest createUpdateInsertionOrderRequest() {
        return new UpdateInsertionOrderRequest();
    }

    /**
     * Create an instance of {@link InsertionOrder }
     * 
     */
    public InsertionOrder createInsertionOrder() {
        return new InsertionOrder();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link GetBillingDocumentsResponse }
     * 
     */
    public GetBillingDocumentsResponse createGetBillingDocumentsResponse() {
        return new GetBillingDocumentsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingDocument }
     * 
     */
    public ArrayOfBillingDocument createArrayOfBillingDocument() {
        return new ArrayOfBillingDocument();
    }

    /**
     * Create an instance of {@link AddInsertionOrderRequest }
     * 
     */
    public AddInsertionOrderRequest createAddInsertionOrderRequest() {
        return new AddInsertionOrderRequest();
    }

    /**
     * Create an instance of {@link GetBillingDocumentsRequest }
     * 
     */
    public GetBillingDocumentsRequest createGetBillingDocumentsRequest() {
        return new GetBillingDocumentsRequest();
    }

    /**
     * Create an instance of {@link GetAccountMonthlySpendResponse }
     * 
     */
    public GetAccountMonthlySpendResponse createGetAccountMonthlySpendResponse() {
        return new GetAccountMonthlySpendResponse();
    }

    /**
     * Create an instance of {@link GetAccountMonthlySpendRequest }
     * 
     */
    public GetAccountMonthlySpendRequest createGetAccountMonthlySpendRequest() {
        return new GetAccountMonthlySpendRequest();
    }

    /**
     * Create an instance of {@link SearchInsertionOrdersRequest }
     * 
     */
    public SearchInsertionOrdersRequest createSearchInsertionOrdersRequest() {
        return new SearchInsertionOrdersRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPredicate }
     * 
     */
    public ArrayOfPredicate createArrayOfPredicate() {
        return new ArrayOfPredicate();
    }

    /**
     * Create an instance of {@link ArrayOfOrderBy }
     * 
     */
    public ArrayOfOrderBy createArrayOfOrderBy() {
        return new ArrayOfOrderBy();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link ApiBatchFault }
     * 
     */
    public ApiBatchFault createApiBatchFault() {
        return new ApiBatchFault();
    }

    /**
     * Create an instance of {@link GetInsertionOrdersByAccountResponse }
     * 
     */
    public GetInsertionOrdersByAccountResponse createGetInsertionOrdersByAccountResponse() {
        return new GetInsertionOrdersByAccountResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInsertionOrder }
     * 
     */
    public ArrayOfInsertionOrder createArrayOfInsertionOrder() {
        return new ArrayOfInsertionOrder();
    }

    /**
     * Create an instance of {@link SearchInsertionOrdersResponse }
     * 
     */
    public SearchInsertionOrdersResponse createSearchInsertionOrdersResponse() {
        return new SearchInsertionOrdersResponse();
    }

    /**
     * Create an instance of {@link AddInsertionOrderResponse }
     * 
     */
    public AddInsertionOrderResponse createAddInsertionOrderResponse() {
        return new AddInsertionOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateInsertionOrderResponse }
     * 
     */
    public UpdateInsertionOrderResponse createUpdateInsertionOrderResponse() {
        return new UpdateInsertionOrderResponse();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link BillingDocument }
     * 
     */
    public BillingDocument createBillingDocument() {
        return new BillingDocument();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

    /**
     * Create an instance of {@link BillingDocumentInfo }
     * 
     */
    public BillingDocumentInfo createBillingDocumentInfo() {
        return new BillingDocumentInfo();
    }

    /**
     * Create an instance of {@link InsertionOrderPendingChanges }
     * 
     */
    public InsertionOrderPendingChanges createInsertionOrderPendingChanges() {
        return new InsertionOrderPendingChanges();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFaultElement(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFaultElement_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredicateOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "PredicateOperator")
    public JAXBElement<PredicateOperator> createPredicateOperator(PredicateOperator value) {
        return new JAXBElement<PredicateOperator>(_PredicateOperator_QNAME, PredicateOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "ArrayOfBillingDocumentInfo")
    public JAXBElement<ArrayOfBillingDocumentInfo> createArrayOfBillingDocumentInfo(ArrayOfBillingDocumentInfo value) {
        return new JAXBElement<ArrayOfBillingDocumentInfo>(_ArrayOfBillingDocumentInfo_QNAME, ArrayOfBillingDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsertionOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "ArrayOfInsertionOrder")
    public JAXBElement<ArrayOfInsertionOrder> createArrayOfInsertionOrder(ArrayOfInsertionOrder value) {
        return new JAXBElement<ArrayOfInsertionOrder>(_ArrayOfInsertionOrder_QNAME, ArrayOfInsertionOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Calendar> createDateTime(Calendar value) {
        return new JAXBElement<Calendar>(_DateTime_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "OrderBy")
    public JAXBElement<OrderBy> createOrderBy(OrderBy value) {
        return new JAXBElement<OrderBy>(_OrderBy_QNAME, OrderBy.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "DataType")
    public JAXBElement<DataType> createDataType(DataType value) {
        return new JAXBElement<DataType>(_DataType_QNAME, DataType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "OrderByField")
    public JAXBElement<OrderByField> createOrderByField(OrderByField value) {
        return new JAXBElement<OrderByField>(_OrderByField_QNAME, OrderByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "BillingDocument")
    public JAXBElement<BillingDocument> createBillingDocument(BillingDocument value) {
        return new JAXBElement<BillingDocument>(_BillingDocument_QNAME, BillingDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "UserName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "InsertionOrder")
    public JAXBElement<InsertionOrder> createInsertionOrder(InsertionOrder value) {
        return new JAXBElement<InsertionOrder>(_InsertionOrder_QNAME, InsertionOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "ArrayOfBatchError")
    public JAXBElement<ArrayOfBatchError> createArrayOfBatchError(ArrayOfBatchError value) {
        return new JAXBElement<ArrayOfBatchError>(_ArrayOfBatchError_QNAME, ArrayOfBatchError.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "BatchError")
    public JAXBElement<BatchError> createBatchError(BatchError value) {
        return new JAXBElement<BatchError>(_BatchError_QNAME, BatchError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Exception", name = "ApiBatchFault")
    public JAXBElement<ApiBatchFault> createApiBatchFault(ApiBatchFault value) {
        return new JAXBElement<ApiBatchFault>(_ApiBatchFault_QNAME, ApiBatchFault.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "InsertionOrderPendingChanges")
    public JAXBElement<InsertionOrderPendingChanges> createInsertionOrderPendingChanges(InsertionOrderPendingChanges value) {
        return new JAXBElement<InsertionOrderPendingChanges>(_InsertionOrderPendingChanges_QNAME, InsertionOrderPendingChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiBatchFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "ApiBatchFault")
    public JAXBElement<ApiBatchFault> createApiBatchFaultElement(ApiBatchFault value) {
        return new JAXBElement<ApiBatchFault>(_ApiBatchFaultElement_QNAME, ApiBatchFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBillingDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "ArrayOfBillingDocument")
    public JAXBElement<ArrayOfBillingDocument> createArrayOfBillingDocument(ArrayOfBillingDocument value) {
        return new JAXBElement<ArrayOfBillingDocument>(_ArrayOfBillingDocument_QNAME, ArrayOfBillingDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPredicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "ArrayOfPredicate")
    public JAXBElement<ArrayOfPredicate> createArrayOfPredicate(ArrayOfPredicate value) {
        return new JAXBElement<ArrayOfPredicate>(_ArrayOfPredicate_QNAME, ArrayOfPredicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "InsertionOrderStatus")
    public JAXBElement<InsertionOrderStatus> createInsertionOrderStatus(InsertionOrderStatus value) {
        return new JAXBElement<InsertionOrderStatus>(_InsertionOrderStatus_QNAME, InsertionOrderStatus.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<Paging>(_Paging_QNAME, Paging.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdApiFaultDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adapi.microsoft.com", name = "AdApiFaultDetail")
    public JAXBElement<AdApiFaultDetail> createAdApiFaultDetail(AdApiFaultDetail value) {
        return new JAXBElement<AdApiFaultDetail>(_AdApiFaultDetail_QNAME, AdApiFaultDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingDocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "BillingDocumentInfo")
    public JAXBElement<BillingDocumentInfo> createBillingDocumentInfo(BillingDocumentInfo value) {
        return new JAXBElement<BillingDocumentInfo>(_BillingDocumentInfo_QNAME, BillingDocumentInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "ArrayOfOrderBy")
    public JAXBElement<ArrayOfOrderBy> createArrayOfOrderBy(ArrayOfOrderBy value) {
        return new JAXBElement<ArrayOfOrderBy>(_ArrayOfOrderBy_QNAME, ArrayOfOrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertionOrderPendingChangesStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "InsertionOrderPendingChangesStatus")
    public JAXBElement<InsertionOrderPendingChangesStatus> createInsertionOrderPendingChangesStatus(InsertionOrderPendingChangesStatus value) {
        return new JAXBElement<InsertionOrderPendingChangesStatus>(_InsertionOrderPendingChangesStatus_QNAME, InsertionOrderPendingChangesStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Predicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v12/Entities", name = "Predicate")
    public JAXBElement<Predicate> createPredicate(Predicate value) {
        return new JAXBElement<Predicate>(_Predicate_QNAME, Predicate.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Billing/v12", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

}
