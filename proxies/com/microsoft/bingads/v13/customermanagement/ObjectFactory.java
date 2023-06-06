
package com.microsoft.bingads.v13.customermanagement;

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
 * generated in the com.microsoft.bingads.v13.customermanagement package. 
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

    private static final QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "ApplicationToken");
    private static final QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "AuthenticationToken");
    private static final QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "DeveloperToken");
    private static final QName _Password_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "Password");
    private static final QName _UserName_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "UserName");
    private static final QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "TrackingId");
    private static final QName _ApiFaultElement_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "ApiFault");
    private static final QName _ArrayOfAccountInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfAccountInfo");
    private static final QName _AccountInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountInfo");
    private static final QName _AccountLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountLifeCycleStatus");
    private static final QName _AdvertiserAccount_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AdvertiserAccount");
    private static final QName _CurrencyCode_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CurrencyCode");
    private static final QName _AccountFinancialStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountFinancialStatus");
    private static final QName _LanguageType_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "LanguageType");
    private static final QName _PaymentMethodType_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "PaymentMethodType");
    private static final QName _TimeZoneType_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "TimeZoneType");
    private static final QName _ArrayOfCustomerInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfCustomerInfo");
    private static final QName _CustomerInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CustomerInfo");
    private static final QName _Address_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Address");
    private static final QName _AutoTagType_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AutoTagType");
    private static final QName _AccountTaxCertificate_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountTaxCertificate");
    private static final QName _TaxCertificateStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "TaxCertificateStatus");
    private static final QName _Customer_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Customer");
    private static final QName _CustomerFinancialStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CustomerFinancialStatus");
    private static final QName _Industry_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Industry");
    private static final QName _ServiceLevel_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ServiceLevel");
    private static final QName _CustomerLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CustomerLifeCycleStatus");
    private static final QName _UserInvitation_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "UserInvitation");
    private static final QName _LCID_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "LCID");
    private static final QName _User_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "User");
    private static final QName _ContactInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ContactInfo");
    private static final QName _EmailFormat_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "EmailFormat");
    private static final QName _PersonName_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "PersonName");
    private static final QName _SecretQuestion_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "SecretQuestion");
    private static final QName _UserLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "UserLifeCycleStatus");
    private static final QName _AccountAdditionalField_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountAdditionalField");
    private static final QName _ArrayOfCustomerRole_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfCustomerRole");
    private static final QName _CustomerRole_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "CustomerRole");
    private static final QName _ArrayOfUserInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfUserInfo");
    private static final QName _UserInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "UserInfo");
    private static final QName _ArrayOfPilotFeature_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfPilotFeature");
    private static final QName _PilotFeature_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "PilotFeature");
    private static final QName _ArrayOfAccountInfoWithCustomerData_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfAccountInfoWithCustomerData");
    private static final QName _AccountInfoWithCustomerData_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "AccountInfoWithCustomerData");
    private static final QName _ArrayOfPredicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfPredicate");
    private static final QName _Predicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Predicate");
    private static final QName _PredicateOperator_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "PredicateOperator");
    private static final QName _DateRange_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "DateRange");
    private static final QName _ArrayOfOrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfOrderBy");
    private static final QName _OrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "OrderBy");
    private static final QName _OrderByField_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "OrderByField");
    private static final QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "SortOrder");
    private static final QName _Paging_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "Paging");
    private static final QName _ArrayOfCustomer_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfCustomer");
    private static final QName _ArrayOfClientLink_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfClientLink");
    private static final QName _ClientLink_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ClientLink");
    private static final QName _ClientLinkStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ClientLinkStatus");
    private static final QName _ArrayOfAdvertiserAccount_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfAdvertiserAccount");
    private static final QName _ArrayOfUserInvitation_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfUserInvitation");
    private static final QName _ArrayOfAddress_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Entities", "ArrayOfAddress");
    private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private static final QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private static final QName _ArrayOfKeyValuePairOfstringbase64Binary_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringbase64Binary");
    private static final QName _KeyValuePairOfstringbase64Binary_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringbase64Binary");
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
    private static final QName _ApiFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ApiFault");
    private static final QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ArrayOfOperationError");
    private static final QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "OperationError");
    private static final QName _ArrayOfArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v13/Exception", "ArrayOfArrayOfOperationError");
    private static final QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private static final QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private static final QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private static final QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.v13.customermanagement
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
     * Create an instance of {@link GetAccountsInfoRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountsInfoRequest }
     */
    public GetAccountsInfoRequest createGetAccountsInfoRequest() {
        return new GetAccountsInfoRequest();
    }

    /**
     * Create an instance of {@link GetAccountsInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsInfoResponse }
     */
    public GetAccountsInfoResponse createGetAccountsInfoResponse() {
        return new GetAccountsInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountInfo }
     */
    public ArrayOfAccountInfo createArrayOfAccountInfo() {
        return new ArrayOfAccountInfo();
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
     * Create an instance of {@link FindAccountsRequest }
     * 
     * @return
     *     the new instance of {@link FindAccountsRequest }
     */
    public FindAccountsRequest createFindAccountsRequest() {
        return new FindAccountsRequest();
    }

    /**
     * Create an instance of {@link FindAccountsResponse }
     * 
     * @return
     *     the new instance of {@link FindAccountsResponse }
     */
    public FindAccountsResponse createFindAccountsResponse() {
        return new FindAccountsResponse();
    }

    /**
     * Create an instance of {@link AddAccountRequest }
     * 
     * @return
     *     the new instance of {@link AddAccountRequest }
     */
    public AddAccountRequest createAddAccountRequest() {
        return new AddAccountRequest();
    }

    /**
     * Create an instance of {@link AdvertiserAccount }
     * 
     * @return
     *     the new instance of {@link AdvertiserAccount }
     */
    public AdvertiserAccount createAdvertiserAccount() {
        return new AdvertiserAccount();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     * @return
     *     the new instance of {@link AddAccountResponse }
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateAccountRequest }
     * 
     * @return
     *     the new instance of {@link UpdateAccountRequest }
     */
    public UpdateAccountRequest createUpdateAccountRequest() {
        return new UpdateAccountRequest();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     * @return
     *     the new instance of {@link UpdateAccountResponse }
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link GetCustomerRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomerRequest }
     */
    public GetCustomerRequest createGetCustomerRequest() {
        return new GetCustomerRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomerResponse }
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     * @return
     *     the new instance of {@link Customer }
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     * @return
     *     the new instance of {@link UpdateCustomerRequest }
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     * @return
     *     the new instance of {@link UpdateCustomerResponse }
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link SignupCustomerRequest }
     * 
     * @return
     *     the new instance of {@link SignupCustomerRequest }
     */
    public SignupCustomerRequest createSignupCustomerRequest() {
        return new SignupCustomerRequest();
    }

    /**
     * Create an instance of {@link UserInvitation }
     * 
     * @return
     *     the new instance of {@link UserInvitation }
     */
    public UserInvitation createUserInvitation() {
        return new UserInvitation();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link SignupCustomerResponse }
     * 
     * @return
     *     the new instance of {@link SignupCustomerResponse }
     */
    public SignupCustomerResponse createSignupCustomerResponse() {
        return new SignupCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountRequest }
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetCustomersInfoRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomersInfoRequest }
     */
    public GetCustomersInfoRequest createGetCustomersInfoRequest() {
        return new GetCustomersInfoRequest();
    }

    /**
     * Create an instance of {@link GetCustomersInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomersInfoResponse }
     */
    public GetCustomersInfoResponse createGetCustomersInfoResponse() {
        return new GetCustomersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomerInfo }
     */
    public ArrayOfCustomerInfo createArrayOfCustomerInfo() {
        return new ArrayOfCustomerInfo();
    }

    /**
     * Create an instance of {@link DeleteAccountRequest }
     * 
     * @return
     *     the new instance of {@link DeleteAccountRequest }
     */
    public DeleteAccountRequest createDeleteAccountRequest() {
        return new DeleteAccountRequest();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     * @return
     *     the new instance of {@link DeleteAccountResponse }
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     * @return
     *     the new instance of {@link DeleteCustomerRequest }
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     * @return
     *     the new instance of {@link DeleteCustomerResponse }
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateUserRequest }
     * 
     * @return
     *     the new instance of {@link UpdateUserRequest }
     */
    public UpdateUserRequest createUpdateUserRequest() {
        return new UpdateUserRequest();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     * @return
     *     the new instance of {@link UpdateUserResponse }
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserRolesRequest }
     * 
     * @return
     *     the new instance of {@link UpdateUserRolesRequest }
     */
    public UpdateUserRolesRequest createUpdateUserRolesRequest() {
        return new UpdateUserRolesRequest();
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
     * Create an instance of {@link UpdateUserRolesResponse }
     * 
     * @return
     *     the new instance of {@link UpdateUserRolesResponse }
     */
    public UpdateUserRolesResponse createUpdateUserRolesResponse() {
        return new UpdateUserRolesResponse();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     * @return
     *     the new instance of {@link GetUserRequest }
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     * @return
     *     the new instance of {@link GetUserResponse }
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerRole }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomerRole }
     */
    public ArrayOfCustomerRole createArrayOfCustomerRole() {
        return new ArrayOfCustomerRole();
    }

    /**
     * Create an instance of {@link GetCurrentUserRequest }
     * 
     * @return
     *     the new instance of {@link GetCurrentUserRequest }
     */
    public GetCurrentUserRequest createGetCurrentUserRequest() {
        return new GetCurrentUserRequest();
    }

    /**
     * Create an instance of {@link GetCurrentUserResponse }
     * 
     * @return
     *     the new instance of {@link GetCurrentUserResponse }
     */
    public GetCurrentUserResponse createGetCurrentUserResponse() {
        return new GetCurrentUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     * 
     * @return
     *     the new instance of {@link DeleteUserRequest }
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     * @return
     *     the new instance of {@link DeleteUserResponse }
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetUsersInfoRequest }
     * 
     * @return
     *     the new instance of {@link GetUsersInfoRequest }
     */
    public GetUsersInfoRequest createGetUsersInfoRequest() {
        return new GetUsersInfoRequest();
    }

    /**
     * Create an instance of {@link GetUsersInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetUsersInfoResponse }
     */
    public GetUsersInfoResponse createGetUsersInfoResponse() {
        return new GetUsersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfUserInfo }
     */
    public ArrayOfUserInfo createArrayOfUserInfo() {
        return new ArrayOfUserInfo();
    }

    /**
     * Create an instance of {@link GetCustomerPilotFeaturesRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomerPilotFeaturesRequest }
     */
    public GetCustomerPilotFeaturesRequest createGetCustomerPilotFeaturesRequest() {
        return new GetCustomerPilotFeaturesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerPilotFeaturesResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomerPilotFeaturesResponse }
     */
    public GetCustomerPilotFeaturesResponse createGetCustomerPilotFeaturesResponse() {
        return new GetCustomerPilotFeaturesResponse();
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
     * Create an instance of {@link GetAccountPilotFeaturesRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountPilotFeaturesRequest }
     */
    public GetAccountPilotFeaturesRequest createGetAccountPilotFeaturesRequest() {
        return new GetAccountPilotFeaturesRequest();
    }

    /**
     * Create an instance of {@link GetAccountPilotFeaturesResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountPilotFeaturesResponse }
     */
    public GetAccountPilotFeaturesResponse createGetAccountPilotFeaturesResponse() {
        return new GetAccountPilotFeaturesResponse();
    }

    /**
     * Create an instance of {@link GetPilotFeaturesCountriesRequest }
     * 
     * @return
     *     the new instance of {@link GetPilotFeaturesCountriesRequest }
     */
    public GetPilotFeaturesCountriesRequest createGetPilotFeaturesCountriesRequest() {
        return new GetPilotFeaturesCountriesRequest();
    }

    /**
     * Create an instance of {@link GetPilotFeaturesCountriesResponse }
     * 
     * @return
     *     the new instance of {@link GetPilotFeaturesCountriesResponse }
     */
    public GetPilotFeaturesCountriesResponse createGetPilotFeaturesCountriesResponse() {
        return new GetPilotFeaturesCountriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPilotFeature }
     * 
     * @return
     *     the new instance of {@link ArrayOfPilotFeature }
     */
    public ArrayOfPilotFeature createArrayOfPilotFeature() {
        return new ArrayOfPilotFeature();
    }

    /**
     * Create an instance of {@link GetAccessibleCustomerRequest }
     * 
     * @return
     *     the new instance of {@link GetAccessibleCustomerRequest }
     */
    public GetAccessibleCustomerRequest createGetAccessibleCustomerRequest() {
        return new GetAccessibleCustomerRequest();
    }

    /**
     * Create an instance of {@link GetAccessibleCustomerResponse }
     * 
     * @return
     *     the new instance of {@link GetAccessibleCustomerResponse }
     */
    public GetAccessibleCustomerResponse createGetAccessibleCustomerResponse() {
        return new GetAccessibleCustomerResponse();
    }

    /**
     * Create an instance of {@link FindAccountsOrCustomersInfoRequest }
     * 
     * @return
     *     the new instance of {@link FindAccountsOrCustomersInfoRequest }
     */
    public FindAccountsOrCustomersInfoRequest createFindAccountsOrCustomersInfoRequest() {
        return new FindAccountsOrCustomersInfoRequest();
    }

    /**
     * Create an instance of {@link FindAccountsOrCustomersInfoResponse }
     * 
     * @return
     *     the new instance of {@link FindAccountsOrCustomersInfoResponse }
     */
    public FindAccountsOrCustomersInfoResponse createFindAccountsOrCustomersInfoResponse() {
        return new FindAccountsOrCustomersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountInfoWithCustomerData }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccountInfoWithCustomerData }
     */
    public ArrayOfAccountInfoWithCustomerData createArrayOfAccountInfoWithCustomerData() {
        return new ArrayOfAccountInfoWithCustomerData();
    }

    /**
     * Create an instance of {@link UpgradeCustomerToAgencyRequest }
     * 
     * @return
     *     the new instance of {@link UpgradeCustomerToAgencyRequest }
     */
    public UpgradeCustomerToAgencyRequest createUpgradeCustomerToAgencyRequest() {
        return new UpgradeCustomerToAgencyRequest();
    }

    /**
     * Create an instance of {@link UpgradeCustomerToAgencyResponse }
     * 
     * @return
     *     the new instance of {@link UpgradeCustomerToAgencyResponse }
     */
    public UpgradeCustomerToAgencyResponse createUpgradeCustomerToAgencyResponse() {
        return new UpgradeCustomerToAgencyResponse();
    }

    /**
     * Create an instance of {@link AddPrepayAccountRequest }
     * 
     * @return
     *     the new instance of {@link AddPrepayAccountRequest }
     */
    public AddPrepayAccountRequest createAddPrepayAccountRequest() {
        return new AddPrepayAccountRequest();
    }

    /**
     * Create an instance of {@link AddPrepayAccountResponse }
     * 
     * @return
     *     the new instance of {@link AddPrepayAccountResponse }
     */
    public AddPrepayAccountResponse createAddPrepayAccountResponse() {
        return new AddPrepayAccountResponse();
    }

    /**
     * Create an instance of {@link UpdatePrepayAccountRequest }
     * 
     * @return
     *     the new instance of {@link UpdatePrepayAccountRequest }
     */
    public UpdatePrepayAccountRequest createUpdatePrepayAccountRequest() {
        return new UpdatePrepayAccountRequest();
    }

    /**
     * Create an instance of {@link UpdatePrepayAccountResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePrepayAccountResponse }
     */
    public UpdatePrepayAccountResponse createUpdatePrepayAccountResponse() {
        return new UpdatePrepayAccountResponse();
    }

    /**
     * Create an instance of {@link MapCustomerIdToExternalCustomerIdRequest }
     * 
     * @return
     *     the new instance of {@link MapCustomerIdToExternalCustomerIdRequest }
     */
    public MapCustomerIdToExternalCustomerIdRequest createMapCustomerIdToExternalCustomerIdRequest() {
        return new MapCustomerIdToExternalCustomerIdRequest();
    }

    /**
     * Create an instance of {@link MapCustomerIdToExternalCustomerIdResponse }
     * 
     * @return
     *     the new instance of {@link MapCustomerIdToExternalCustomerIdResponse }
     */
    public MapCustomerIdToExternalCustomerIdResponse createMapCustomerIdToExternalCustomerIdResponse() {
        return new MapCustomerIdToExternalCustomerIdResponse();
    }

    /**
     * Create an instance of {@link MapAccountIdToExternalAccountIdsRequest }
     * 
     * @return
     *     the new instance of {@link MapAccountIdToExternalAccountIdsRequest }
     */
    public MapAccountIdToExternalAccountIdsRequest createMapAccountIdToExternalAccountIdsRequest() {
        return new MapAccountIdToExternalAccountIdsRequest();
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
     * Create an instance of {@link MapAccountIdToExternalAccountIdsResponse }
     * 
     * @return
     *     the new instance of {@link MapAccountIdToExternalAccountIdsResponse }
     */
    public MapAccountIdToExternalAccountIdsResponse createMapAccountIdToExternalAccountIdsResponse() {
        return new MapAccountIdToExternalAccountIdsResponse();
    }

    /**
     * Create an instance of {@link SearchCustomersRequest }
     * 
     * @return
     *     the new instance of {@link SearchCustomersRequest }
     */
    public SearchCustomersRequest createSearchCustomersRequest() {
        return new SearchCustomersRequest();
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
     * Create an instance of {@link DateRange }
     * 
     * @return
     *     the new instance of {@link DateRange }
     */
    public DateRange createDateRange() {
        return new DateRange();
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
     * Create an instance of {@link SearchCustomersResponse }
     * 
     * @return
     *     the new instance of {@link SearchCustomersResponse }
     */
    public SearchCustomersResponse createSearchCustomersResponse() {
        return new SearchCustomersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomer }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomer }
     */
    public ArrayOfCustomer createArrayOfCustomer() {
        return new ArrayOfCustomer();
    }

    /**
     * Create an instance of {@link AddClientLinksRequest }
     * 
     * @return
     *     the new instance of {@link AddClientLinksRequest }
     */
    public AddClientLinksRequest createAddClientLinksRequest() {
        return new AddClientLinksRequest();
    }

    /**
     * Create an instance of {@link ArrayOfClientLink }
     * 
     * @return
     *     the new instance of {@link ArrayOfClientLink }
     */
    public ArrayOfClientLink createArrayOfClientLink() {
        return new ArrayOfClientLink();
    }

    /**
     * Create an instance of {@link AddClientLinksResponse }
     * 
     * @return
     *     the new instance of {@link AddClientLinksResponse }
     */
    public AddClientLinksResponse createAddClientLinksResponse() {
        return new AddClientLinksResponse();
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
     * Create an instance of {@link UpdateClientLinksRequest }
     * 
     * @return
     *     the new instance of {@link UpdateClientLinksRequest }
     */
    public UpdateClientLinksRequest createUpdateClientLinksRequest() {
        return new UpdateClientLinksRequest();
    }

    /**
     * Create an instance of {@link UpdateClientLinksResponse }
     * 
     * @return
     *     the new instance of {@link UpdateClientLinksResponse }
     */
    public UpdateClientLinksResponse createUpdateClientLinksResponse() {
        return new UpdateClientLinksResponse();
    }

    /**
     * Create an instance of {@link SearchClientLinksRequest }
     * 
     * @return
     *     the new instance of {@link SearchClientLinksRequest }
     */
    public SearchClientLinksRequest createSearchClientLinksRequest() {
        return new SearchClientLinksRequest();
    }

    /**
     * Create an instance of {@link SearchClientLinksResponse }
     * 
     * @return
     *     the new instance of {@link SearchClientLinksResponse }
     */
    public SearchClientLinksResponse createSearchClientLinksResponse() {
        return new SearchClientLinksResponse();
    }

    /**
     * Create an instance of {@link SearchAccountsRequest }
     * 
     * @return
     *     the new instance of {@link SearchAccountsRequest }
     */
    public SearchAccountsRequest createSearchAccountsRequest() {
        return new SearchAccountsRequest();
    }

    /**
     * Create an instance of {@link SearchAccountsResponse }
     * 
     * @return
     *     the new instance of {@link SearchAccountsResponse }
     */
    public SearchAccountsResponse createSearchAccountsResponse() {
        return new SearchAccountsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdvertiserAccount }
     * 
     * @return
     *     the new instance of {@link ArrayOfAdvertiserAccount }
     */
    public ArrayOfAdvertiserAccount createArrayOfAdvertiserAccount() {
        return new ArrayOfAdvertiserAccount();
    }

    /**
     * Create an instance of {@link SendUserInvitationRequest }
     * 
     * @return
     *     the new instance of {@link SendUserInvitationRequest }
     */
    public SendUserInvitationRequest createSendUserInvitationRequest() {
        return new SendUserInvitationRequest();
    }

    /**
     * Create an instance of {@link SendUserInvitationResponse }
     * 
     * @return
     *     the new instance of {@link SendUserInvitationResponse }
     */
    public SendUserInvitationResponse createSendUserInvitationResponse() {
        return new SendUserInvitationResponse();
    }

    /**
     * Create an instance of {@link SearchUserInvitationsRequest }
     * 
     * @return
     *     the new instance of {@link SearchUserInvitationsRequest }
     */
    public SearchUserInvitationsRequest createSearchUserInvitationsRequest() {
        return new SearchUserInvitationsRequest();
    }

    /**
     * Create an instance of {@link SearchUserInvitationsResponse }
     * 
     * @return
     *     the new instance of {@link SearchUserInvitationsResponse }
     */
    public SearchUserInvitationsResponse createSearchUserInvitationsResponse() {
        return new SearchUserInvitationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserInvitation }
     * 
     * @return
     *     the new instance of {@link ArrayOfUserInvitation }
     */
    public ArrayOfUserInvitation createArrayOfUserInvitation() {
        return new ArrayOfUserInvitation();
    }

    /**
     * Create an instance of {@link ValidateAddressRequest }
     * 
     * @return
     *     the new instance of {@link ValidateAddressRequest }
     */
    public ValidateAddressRequest createValidateAddressRequest() {
        return new ValidateAddressRequest();
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
     * Create an instance of {@link ValidateAddressResponse }
     * 
     * @return
     *     the new instance of {@link ValidateAddressResponse }
     */
    public ValidateAddressResponse createValidateAddressResponse() {
        return new ValidateAddressResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     * @return
     *     the new instance of {@link ArrayOfAddress }
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link GetLinkedAccountsAndCustomersInfoRequest }
     * 
     * @return
     *     the new instance of {@link GetLinkedAccountsAndCustomersInfoRequest }
     */
    public GetLinkedAccountsAndCustomersInfoRequest createGetLinkedAccountsAndCustomersInfoRequest() {
        return new GetLinkedAccountsAndCustomersInfoRequest();
    }

    /**
     * Create an instance of {@link GetLinkedAccountsAndCustomersInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetLinkedAccountsAndCustomersInfoResponse }
     */
    public GetLinkedAccountsAndCustomersInfoResponse createGetLinkedAccountsAndCustomersInfoResponse() {
        return new GetLinkedAccountsAndCustomersInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserMFAStatusRequest }
     * 
     * @return
     *     the new instance of {@link GetUserMFAStatusRequest }
     */
    public GetUserMFAStatusRequest createGetUserMFAStatusRequest() {
        return new GetUserMFAStatusRequest();
    }

    /**
     * Create an instance of {@link GetUserMFAStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetUserMFAStatusResponse }
     */
    public GetUserMFAStatusResponse createGetUserMFAStatusResponse() {
        return new GetUserMFAStatusResponse();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     * @return
     *     the new instance of {@link AccountInfo }
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     * @return
     *     the new instance of {@link CustomerInfo }
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link AccountTaxCertificate }
     * 
     * @return
     *     the new instance of {@link AccountTaxCertificate }
     */
    public AccountTaxCertificate createAccountTaxCertificate() {
        return new AccountTaxCertificate();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     * @return
     *     the new instance of {@link ContactInfo }
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     * @return
     *     the new instance of {@link PersonName }
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link CustomerRole }
     * 
     * @return
     *     the new instance of {@link CustomerRole }
     */
    public CustomerRole createCustomerRole() {
        return new CustomerRole();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     * @return
     *     the new instance of {@link UserInfo }
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link PilotFeature }
     * 
     * @return
     *     the new instance of {@link PilotFeature }
     */
    public PilotFeature createPilotFeature() {
        return new PilotFeature();
    }

    /**
     * Create an instance of {@link AccountInfoWithCustomerData }
     * 
     * @return
     *     the new instance of {@link AccountInfoWithCustomerData }
     */
    public AccountInfoWithCustomerData createAccountInfoWithCustomerData() {
        return new AccountInfoWithCustomerData();
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
     * Create an instance of {@link ClientLink }
     * 
     * @return
     *     the new instance of {@link ClientLink }
     */
    public ClientLink createClientLink() {
        return new ClientLink();
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
     * Create an instance of {@link ArrayOfKeyValuePairOfstringbase64Binary }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyValuePairOfstringbase64Binary }
     */
    public ArrayOfKeyValuePairOfstringbase64Binary createArrayOfKeyValuePairOfstringbase64Binary() {
        return new ArrayOfKeyValuePairOfstringbase64Binary();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringbase64Binary }
     * 
     * @return
     *     the new instance of {@link KeyValuePairOfstringbase64Binary }
     */
    public KeyValuePairOfstringbase64Binary createKeyValuePairOfstringbase64Binary() {
        return new KeyValuePairOfstringbase64Binary();
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "ApplicationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "AuthenticationToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "DeveloperToken")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "Password")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "UserName")
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
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFaultElement(ApiFault value) {
        return new JAXBElement<>(_ApiFaultElement_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfAccountInfo")
    public JAXBElement<ArrayOfAccountInfo> createArrayOfAccountInfo(ArrayOfAccountInfo value) {
        return new JAXBElement<>(_ArrayOfAccountInfo_QNAME, ArrayOfAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountInfo")
    public JAXBElement<AccountInfo> createAccountInfo(AccountInfo value) {
        return new JAXBElement<>(_AccountInfo_QNAME, AccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountLifeCycleStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountLifeCycleStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountLifeCycleStatus")
    public JAXBElement<AccountLifeCycleStatus> createAccountLifeCycleStatus(AccountLifeCycleStatus value) {
        return new JAXBElement<>(_AccountLifeCycleStatus_QNAME, AccountLifeCycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvertiserAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdvertiserAccount }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AdvertiserAccount")
    public JAXBElement<AdvertiserAccount> createAdvertiserAccount(AdvertiserAccount value) {
        return new JAXBElement<>(_AdvertiserAccount_QNAME, AdvertiserAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyCode }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CurrencyCode")
    public JAXBElement<CurrencyCode> createCurrencyCode(CurrencyCode value) {
        return new JAXBElement<>(_CurrencyCode_QNAME, CurrencyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFinancialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountFinancialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountFinancialStatus")
    public JAXBElement<AccountFinancialStatus> createAccountFinancialStatus(AccountFinancialStatus value) {
        return new JAXBElement<>(_AccountFinancialStatus_QNAME, AccountFinancialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "LanguageType")
    public JAXBElement<LanguageType> createLanguageType(LanguageType value) {
        return new JAXBElement<>(_LanguageType_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "PaymentMethodType")
    public JAXBElement<PaymentMethodType> createPaymentMethodType(PaymentMethodType value) {
        return new JAXBElement<>(_PaymentMethodType_QNAME, PaymentMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "TimeZoneType")
    public JAXBElement<TimeZoneType> createTimeZoneType(TimeZoneType value) {
        return new JAXBElement<>(_TimeZoneType_QNAME, TimeZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfCustomerInfo")
    public JAXBElement<ArrayOfCustomerInfo> createArrayOfCustomerInfo(ArrayOfCustomerInfo value) {
        return new JAXBElement<>(_ArrayOfCustomerInfo_QNAME, ArrayOfCustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CustomerInfo")
    public JAXBElement<CustomerInfo> createCustomerInfo(CustomerInfo value) {
        return new JAXBElement<>(_CustomerInfo_QNAME, CustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoTagType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoTagType }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AutoTagType")
    public JAXBElement<AutoTagType> createAutoTagType(AutoTagType value) {
        return new JAXBElement<>(_AutoTagType_QNAME, AutoTagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountTaxCertificate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountTaxCertificate }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountTaxCertificate")
    public JAXBElement<AccountTaxCertificate> createAccountTaxCertificate(AccountTaxCertificate value) {
        return new JAXBElement<>(_AccountTaxCertificate_QNAME, AccountTaxCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCertificateStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxCertificateStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "TaxCertificateStatus")
    public JAXBElement<TaxCertificateStatus> createTaxCertificateStatus(TaxCertificateStatus value) {
        return new JAXBElement<>(_TaxCertificateStatus_QNAME, TaxCertificateStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerFinancialStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerFinancialStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CustomerFinancialStatus")
    public JAXBElement<CustomerFinancialStatus> createCustomerFinancialStatus(CustomerFinancialStatus value) {
        return new JAXBElement<>(_CustomerFinancialStatus_QNAME, CustomerFinancialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Industry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Industry }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "Industry")
    public JAXBElement<Industry> createIndustry(Industry value) {
        return new JAXBElement<>(_Industry_QNAME, Industry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLevel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceLevel }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ServiceLevel")
    public JAXBElement<ServiceLevel> createServiceLevel(ServiceLevel value) {
        return new JAXBElement<>(_ServiceLevel_QNAME, ServiceLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerLifeCycleStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerLifeCycleStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CustomerLifeCycleStatus")
    public JAXBElement<CustomerLifeCycleStatus> createCustomerLifeCycleStatus(CustomerLifeCycleStatus value) {
        return new JAXBElement<>(_CustomerLifeCycleStatus_QNAME, CustomerLifeCycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInvitation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserInvitation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "UserInvitation")
    public JAXBElement<UserInvitation> createUserInvitation(UserInvitation value) {
        return new JAXBElement<>(_UserInvitation_QNAME, UserInvitation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LCID }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "LCID")
    public JAXBElement<LCID> createLCID(LCID value) {
        return new JAXBElement<>(_LCID_QNAME, LCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ContactInfo")
    public JAXBElement<ContactInfo> createContactInfo(ContactInfo value) {
        return new JAXBElement<>(_ContactInfo_QNAME, ContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailFormat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailFormat }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "EmailFormat")
    public JAXBElement<EmailFormat> createEmailFormat(EmailFormat value) {
        return new JAXBElement<>(_EmailFormat_QNAME, EmailFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "PersonName")
    public JAXBElement<PersonName> createPersonName(PersonName value) {
        return new JAXBElement<>(_PersonName_QNAME, PersonName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecretQuestion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecretQuestion }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "SecretQuestion")
    public JAXBElement<SecretQuestion> createSecretQuestion(SecretQuestion value) {
        return new JAXBElement<>(_SecretQuestion_QNAME, SecretQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLifeCycleStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserLifeCycleStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "UserLifeCycleStatus")
    public JAXBElement<UserLifeCycleStatus> createUserLifeCycleStatus(UserLifeCycleStatus value) {
        return new JAXBElement<>(_UserLifeCycleStatus_QNAME, UserLifeCycleStatus.class, null, value);
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
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Collection<AccountAdditionalField>> createAccountAdditionalField(Collection<AccountAdditionalField> value) {
        return new JAXBElement<>(_AccountAdditionalField_QNAME, ((Class) Collection.class), null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerRole }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfCustomerRole")
    public JAXBElement<ArrayOfCustomerRole> createArrayOfCustomerRole(ArrayOfCustomerRole value) {
        return new JAXBElement<>(_ArrayOfCustomerRole_QNAME, ArrayOfCustomerRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerRole }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "CustomerRole")
    public JAXBElement<CustomerRole> createCustomerRole(CustomerRole value) {
        return new JAXBElement<>(_CustomerRole_QNAME, CustomerRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfUserInfo")
    public JAXBElement<ArrayOfUserInfo> createArrayOfUserInfo(ArrayOfUserInfo value) {
        return new JAXBElement<>(_ArrayOfUserInfo_QNAME, ArrayOfUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "UserInfo")
    public JAXBElement<UserInfo> createUserInfo(UserInfo value) {
        return new JAXBElement<>(_UserInfo_QNAME, UserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPilotFeature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPilotFeature }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfPilotFeature")
    public JAXBElement<ArrayOfPilotFeature> createArrayOfPilotFeature(ArrayOfPilotFeature value) {
        return new JAXBElement<>(_ArrayOfPilotFeature_QNAME, ArrayOfPilotFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PilotFeature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PilotFeature }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "PilotFeature")
    public JAXBElement<PilotFeature> createPilotFeature(PilotFeature value) {
        return new JAXBElement<>(_PilotFeature_QNAME, PilotFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfoWithCustomerData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfoWithCustomerData }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfAccountInfoWithCustomerData")
    public JAXBElement<ArrayOfAccountInfoWithCustomerData> createArrayOfAccountInfoWithCustomerData(ArrayOfAccountInfoWithCustomerData value) {
        return new JAXBElement<>(_ArrayOfAccountInfoWithCustomerData_QNAME, ArrayOfAccountInfoWithCustomerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfoWithCustomerData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountInfoWithCustomerData }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "AccountInfoWithCustomerData")
    public JAXBElement<AccountInfoWithCustomerData> createAccountInfoWithCustomerData(AccountInfoWithCustomerData value) {
        return new JAXBElement<>(_AccountInfoWithCustomerData_QNAME, AccountInfoWithCustomerData.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "DateRange")
    public JAXBElement<DateRange> createDateRange(DateRange value) {
        return new JAXBElement<>(_DateRange_QNAME, DateRange.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfCustomer")
    public JAXBElement<ArrayOfCustomer> createArrayOfCustomer(ArrayOfCustomer value) {
        return new JAXBElement<>(_ArrayOfCustomer_QNAME, ArrayOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClientLink }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfClientLink")
    public JAXBElement<ArrayOfClientLink> createArrayOfClientLink(ArrayOfClientLink value) {
        return new JAXBElement<>(_ArrayOfClientLink_QNAME, ArrayOfClientLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientLink }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientLink }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ClientLink")
    public JAXBElement<ClientLink> createClientLink(ClientLink value) {
        return new JAXBElement<>(_ClientLink_QNAME, ClientLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientLinkStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientLinkStatus }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ClientLinkStatus")
    public JAXBElement<ClientLinkStatus> createClientLinkStatus(ClientLinkStatus value) {
        return new JAXBElement<>(_ClientLinkStatus_QNAME, ClientLinkStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvertiserAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvertiserAccount }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfAdvertiserAccount")
    public JAXBElement<ArrayOfAdvertiserAccount> createArrayOfAdvertiserAccount(ArrayOfAdvertiserAccount value) {
        return new JAXBElement<>(_ArrayOfAdvertiserAccount_QNAME, ArrayOfAdvertiserAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInvitation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInvitation }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfUserInvitation")
    public JAXBElement<ArrayOfUserInvitation> createArrayOfUserInvitation(ArrayOfUserInvitation value) {
        return new JAXBElement<>(_ArrayOfUserInvitation_QNAME, ArrayOfUserInvitation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v13/Entities", name = "ArrayOfAddress")
    public JAXBElement<ArrayOfAddress> createArrayOfAddress(ArrayOfAddress value) {
        return new JAXBElement<>(_ArrayOfAddress_QNAME, ArrayOfAddress.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringbase64Binary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringbase64Binary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringbase64Binary")
    public JAXBElement<ArrayOfKeyValuePairOfstringbase64Binary> createArrayOfKeyValuePairOfstringbase64Binary(ArrayOfKeyValuePairOfstringbase64Binary value) {
        return new JAXBElement<>(_ArrayOfKeyValuePairOfstringbase64Binary_QNAME, ArrayOfKeyValuePairOfstringbase64Binary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringbase64Binary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringbase64Binary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringbase64Binary")
    public JAXBElement<KeyValuePairOfstringbase64Binary> createKeyValuePairOfstringbase64Binary(KeyValuePairOfstringbase64Binary value) {
        return new JAXBElement<>(_KeyValuePairOfstringbase64Binary_QNAME, KeyValuePairOfstringbase64Binary.class, null, value);
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
