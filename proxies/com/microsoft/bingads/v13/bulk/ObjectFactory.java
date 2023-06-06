
package com.microsoft.bingads.v13.bulk;

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
 * generated in the com.microsoft.bingads.v13.bulk package. 
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

    private static final QName _CompressionType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CompressionType");
    private static final QName _DataScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DataScope");
    private static final QName _ArrayOfDownloadEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfDownloadEntity");
    private static final QName _DownloadEntity_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DownloadEntity");
    private static final QName _DownloadFileType_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DownloadFileType");
    private static final QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ApplicationToken");
    private static final QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "AuthenticationToken");
    private static final QName _CustomerAccountId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerAccountId");
    private static final QName _CustomerId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CustomerId");
    private static final QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "DeveloperToken");
    private static final QName _Password_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "Password");
    private static final QName _UserName_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "UserName");
    private static final QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "TrackingId");
    private static final QName _ApiFaultDetail_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ApiFaultDetail");
    private static final QName _ArrayOfBatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfBatchError");
    private static final QName _BatchError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BatchError");
    private static final QName _EditorialError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "EditorialError");
    private static final QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfOperationError");
    private static final QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "OperationError");
    private static final QName _ArrayOfCampaignScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ArrayOfCampaignScope");
    private static final QName _CampaignScope_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignScope");
    private static final QName _ResponseMode_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "ResponseMode");
    private static final QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private static final QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
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
    private static final QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private static final QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private static final QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private static final QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private static final QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.bulk
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
     * Create an instance of {@link DownloadCampaignsByAccountIdsRequest }
     * 
     * @return
     *     the new instance of {@link DownloadCampaignsByAccountIdsRequest }
     */
    public DownloadCampaignsByAccountIdsRequest createDownloadCampaignsByAccountIdsRequest() {
        return new DownloadCampaignsByAccountIdsRequest();
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
     * Create an instance of {@link ArrayOfDownloadEntity }
     * 
     * @return
     *     the new instance of {@link ArrayOfDownloadEntity }
     */
    public ArrayOfDownloadEntity createArrayOfDownloadEntity() {
        return new ArrayOfDownloadEntity();
    }

    /**
     * Create an instance of {@link DownloadCampaignsByAccountIdsResponse }
     * 
     * @return
     *     the new instance of {@link DownloadCampaignsByAccountIdsResponse }
     */
    public DownloadCampaignsByAccountIdsResponse createDownloadCampaignsByAccountIdsResponse() {
        return new DownloadCampaignsByAccountIdsResponse();
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
     * Create an instance of {@link EditorialError }
     * 
     * @return
     *     the new instance of {@link EditorialError }
     */
    public EditorialError createEditorialError() {
        return new EditorialError();
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
     * Create an instance of {@link DownloadCampaignsByCampaignIdsRequest }
     * 
     * @return
     *     the new instance of {@link DownloadCampaignsByCampaignIdsRequest }
     */
    public DownloadCampaignsByCampaignIdsRequest createDownloadCampaignsByCampaignIdsRequest() {
        return new DownloadCampaignsByCampaignIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignScope }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignScope }
     */
    public ArrayOfCampaignScope createArrayOfCampaignScope() {
        return new ArrayOfCampaignScope();
    }

    /**
     * Create an instance of {@link CampaignScope }
     * 
     * @return
     *     the new instance of {@link CampaignScope }
     */
    public CampaignScope createCampaignScope() {
        return new CampaignScope();
    }

    /**
     * Create an instance of {@link DownloadCampaignsByCampaignIdsResponse }
     * 
     * @return
     *     the new instance of {@link DownloadCampaignsByCampaignIdsResponse }
     */
    public DownloadCampaignsByCampaignIdsResponse createDownloadCampaignsByCampaignIdsResponse() {
        return new DownloadCampaignsByCampaignIdsResponse();
    }

    /**
     * Create an instance of {@link GetBulkDownloadStatusRequest }
     * 
     * @return
     *     the new instance of {@link GetBulkDownloadStatusRequest }
     */
    public GetBulkDownloadStatusRequest createGetBulkDownloadStatusRequest() {
        return new GetBulkDownloadStatusRequest();
    }

    /**
     * Create an instance of {@link GetBulkDownloadStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetBulkDownloadStatusResponse }
     */
    public GetBulkDownloadStatusResponse createGetBulkDownloadStatusResponse() {
        return new GetBulkDownloadStatusResponse();
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
     * Create an instance of {@link GetBulkUploadUrlRequest }
     * 
     * @return
     *     the new instance of {@link GetBulkUploadUrlRequest }
     */
    public GetBulkUploadUrlRequest createGetBulkUploadUrlRequest() {
        return new GetBulkUploadUrlRequest();
    }

    /**
     * Create an instance of {@link GetBulkUploadUrlResponse }
     * 
     * @return
     *     the new instance of {@link GetBulkUploadUrlResponse }
     */
    public GetBulkUploadUrlResponse createGetBulkUploadUrlResponse() {
        return new GetBulkUploadUrlResponse();
    }

    /**
     * Create an instance of {@link GetBulkUploadStatusRequest }
     * 
     * @return
     *     the new instance of {@link GetBulkUploadStatusRequest }
     */
    public GetBulkUploadStatusRequest createGetBulkUploadStatusRequest() {
        return new GetBulkUploadStatusRequest();
    }

    /**
     * Create an instance of {@link GetBulkUploadStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetBulkUploadStatusResponse }
     */
    public GetBulkUploadStatusResponse createGetBulkUploadStatusResponse() {
        return new GetBulkUploadStatusResponse();
    }

    /**
     * Create an instance of {@link UploadEntityRecordsRequest }
     * 
     * @return
     *     the new instance of {@link UploadEntityRecordsRequest }
     */
    public UploadEntityRecordsRequest createUploadEntityRecordsRequest() {
        return new UploadEntityRecordsRequest();
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
     * Create an instance of {@link UploadEntityRecordsResponse }
     * 
     * @return
     *     the new instance of {@link UploadEntityRecordsResponse }
     */
    public UploadEntityRecordsResponse createUploadEntityRecordsResponse() {
        return new UploadEntityRecordsResponse();
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
     * Create an instance of {@link KeyValuePairOfstringstring }
     * 
     * @return
     *     the new instance of {@link KeyValuePairOfstringstring }
     */
    public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
        return new KeyValuePairOfstringstring();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DataScope }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Collection }{@code <}{@link DataScope }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DataScope")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<DataScope>> createDataScope(Collection<DataScope> value) {
        return new JAXBElement<>(_DataScope_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDownloadEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDownloadEntity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfDownloadEntity")
    public JAXBElement<ArrayOfDownloadEntity> createArrayOfDownloadEntity(ArrayOfDownloadEntity value) {
        return new JAXBElement<>(_ArrayOfDownloadEntity_QNAME, ArrayOfDownloadEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadEntity }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DownloadEntity")
    public JAXBElement<DownloadEntity> createDownloadEntity(DownloadEntity value) {
        return new JAXBElement<>(_DownloadEntity_QNAME, DownloadEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadFileType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "DownloadFileType")
    public JAXBElement<DownloadFileType> createDownloadFileType(DownloadFileType value) {
        return new JAXBElement<>(_DownloadFileType_QNAME, DownloadFileType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ArrayOfCampaignScope")
    public JAXBElement<ArrayOfCampaignScope> createArrayOfCampaignScope(ArrayOfCampaignScope value) {
        return new JAXBElement<>(_ArrayOfCampaignScope_QNAME, ArrayOfCampaignScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignScope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CampaignScope }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "CampaignScope")
    public JAXBElement<CampaignScope> createCampaignScope(CampaignScope value) {
        return new JAXBElement<>(_CampaignScope_QNAME, CampaignScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseMode }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/CampaignManagement/v13", name = "ResponseMode")
    public JAXBElement<ResponseMode> createResponseMode(ResponseMode value) {
        return new JAXBElement<>(_ResponseMode_QNAME, ResponseMode.class, null, value);
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

}
