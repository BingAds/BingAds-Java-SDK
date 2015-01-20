
package com.microsoft.bingads.customermanagement;

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
 * generated in the com.microsoft.bingads.customermanagement package. 
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

    private final static QName _LCID_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "LCID");
    private final static QName _ArrayOfPilotFeature_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfPilotFeature");
    private final static QName _UserRole_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserRole");
    private final static QName _ApplicationToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "ApplicationToken");
    private final static QName _UserLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserLifeCycleStatus");
    private final static QName _PredicateOperator_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "PredicateOperator");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _AuthenticationToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "AuthenticationToken");
    private final static QName _OrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderBy");
    private final static QName _PersonName_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "PersonName");
    private final static QName _PilotFeature_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "PilotFeature");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfAdApiError_QNAME = new QName("https://adapi.microsoft.com", "ArrayOfAdApiError");
    private final static QName _SortOrder_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "SortOrder");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _CustomerFinancialStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "CustomerFinancialStatus");
    private final static QName _AccountType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _CustomerLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "CustomerLifeCycleStatus");
    private final static QName _DateRange_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "DateRange");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfCustomerInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfCustomerInfo");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _TimeZoneType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "TimeZoneType");
    private final static QName _OrderByField_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "OrderByField");
    private final static QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
    private final static QName _AdvertiserAccount_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AdvertiserAccount");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _AccountInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfo");
    private final static QName _ServiceLevel_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ServiceLevel");
    private final static QName _AccountInfoWithCustomerData_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountInfoWithCustomerData");
    private final static QName _User_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "User");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AccountLifeCycleStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountLifeCycleStatus");
    private final static QName _AccountFinancialStatus_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "AccountFinancialStatus");
    private final static QName _UserInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInfo");
    private final static QName _ArrayOfCustomer_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfCustomer");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfClientLink_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfClientLink");
    private final static QName _TrackingId_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "TrackingId");
    private final static QName _LanguageType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "LanguageType");
    private final static QName _ApiFaultElement_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "ApiFault");
    private final static QName _ApplicationType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ApplicationType");
    private final static QName _TaxType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "TaxType");
    private final static QName _ArrayOfAccountInfoWithCustomerData_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccountInfoWithCustomerData");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfUserInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfUserInfo");
    private final static QName _Password_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "Password");
    private final static QName _ArrayOfAccountInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccountInfo");
    private final static QName _CustomerInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "CustomerInfo");
    private final static QName _ClientLinkStatusElement_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLinkStatus");
    private final static QName _CurrencyType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "CurrencyType");
    private final static QName _PaymentMethodType_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "PaymentMethodType");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _OperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Exception", "OperationError");
    private final static QName _Paging_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Paging");
    private final static QName _ArrayOfPredicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfPredicate");
    private final static QName _AdApiError_QNAME = new QName("https://adapi.microsoft.com", "AdApiError");
    private final static QName _SecretQuestion_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "SecretQuestion");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Industry_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Industry");
    private final static QName _ArrayOfUserInvitation_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfUserInvitation");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _AdApiFaultDetail_QNAME = new QName("https://adapi.microsoft.com", "AdApiFaultDetail");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _DeveloperToken_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "DeveloperToken");
    private final static QName _ArrayOfAccount_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfAccount");
    private final static QName _ApplicationFault_QNAME = new QName("https://adapi.microsoft.com", "ApplicationFault");
    private final static QName _ContactInfo_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ContactInfo");
    private final static QName _ApiFault_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Exception", "ApiFault");
    private final static QName _UserInvitation_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "UserInvitation");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _UserNameElement_QNAME = new QName("https://bingads.microsoft.com/Customer/v9", "UserName");
    private final static QName _Account_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Account");
    private final static QName _ClientLink_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ClientLink");
    private final static QName _ArrayOfArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Exception", "ArrayOfArrayOfOperationError");
    private final static QName _Address_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Address");
    private final static QName _Customer_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Customer");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _EmailFormat_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "EmailFormat");
    private final static QName _ArrayOfOrderBy_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "ArrayOfOrderBy");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfOperationError_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Exception", "ArrayOfOperationError");
    private final static QName _Predicate_QNAME = new QName("https://bingads.microsoft.com/Customer/v9/Entities", "Predicate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.bingads.customermanagement
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
     * Create an instance of {@link DeleteAccountRequest }
     * 
     */
    public DeleteAccountRequest createDeleteAccountRequest() {
        return new DeleteAccountRequest();
    }

    /**
     * Create an instance of {@link AddClientLinksRequest }
     * 
     */
    public AddClientLinksRequest createAddClientLinksRequest() {
        return new AddClientLinksRequest();
    }

    /**
     * Create an instance of {@link ArrayOfClientLink }
     * 
     */
    public ArrayOfClientLink createArrayOfClientLink() {
        return new ArrayOfClientLink();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link AddPrepayAccountRequest }
     * 
     */
    public AddPrepayAccountRequest createAddPrepayAccountRequest() {
        return new AddPrepayAccountRequest();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link UpdateClientLinksRequest }
     * 
     */
    public UpdateClientLinksRequest createUpdateClientLinksRequest() {
        return new UpdateClientLinksRequest();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link GetUsersInfoRequest }
     * 
     */
    public GetUsersInfoRequest createGetUsersInfoRequest() {
        return new GetUsersInfoRequest();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetCustomerPilotFeaturesRequest }
     * 
     */
    public GetCustomerPilotFeaturesRequest createGetCustomerPilotFeaturesRequest() {
        return new GetCustomerPilotFeaturesRequest();
    }

    /**
     * Create an instance of {@link SendUserInvitationResponse }
     * 
     */
    public SendUserInvitationResponse createSendUserInvitationResponse() {
        return new SendUserInvitationResponse();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     * 
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link UpgradeCustomerToAgencyResponse }
     * 
     */
    public UpgradeCustomerToAgencyResponse createUpgradeCustomerToAgencyResponse() {
        return new UpgradeCustomerToAgencyResponse();
    }

    /**
     * Create an instance of {@link SearchClientLinksResponse }
     * 
     */
    public SearchClientLinksResponse createSearchClientLinksResponse() {
        return new SearchClientLinksResponse();
    }

    /**
     * Create an instance of {@link GetCurrentUserRequest }
     * 
     */
    public GetCurrentUserRequest createGetCurrentUserRequest() {
        return new GetCurrentUserRequest();
    }

    /**
     * Create an instance of {@link SearchClientLinksRequest }
     * 
     */
    public SearchClientLinksRequest createSearchClientLinksRequest() {
        return new SearchClientLinksRequest();
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
     * Create an instance of {@link GetPilotFeaturesCountriesRequest }
     * 
     */
    public GetPilotFeaturesCountriesRequest createGetPilotFeaturesCountriesRequest() {
        return new GetPilotFeaturesCountriesRequest();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link FindAccountsOrCustomersInfoResponse }
     * 
     */
    public FindAccountsOrCustomersInfoResponse createFindAccountsOrCustomersInfoResponse() {
        return new FindAccountsOrCustomersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountInfoWithCustomerData }
     * 
     */
    public ArrayOfAccountInfoWithCustomerData createArrayOfAccountInfoWithCustomerData() {
        return new ArrayOfAccountInfoWithCustomerData();
    }

    /**
     * Create an instance of {@link AddPrepayAccountResponse }
     * 
     */
    public AddPrepayAccountResponse createAddPrepayAccountResponse() {
        return new AddPrepayAccountResponse();
    }

    /**
     * Create an instance of {@link SearchCustomersResponse }
     * 
     */
    public SearchCustomersResponse createSearchCustomersResponse() {
        return new SearchCustomersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomer }
     * 
     */
    public ArrayOfCustomer createArrayOfCustomer() {
        return new ArrayOfCustomer();
    }

    /**
     * Create an instance of {@link MapCustomerIdToExternalCustomerIdResponse }
     * 
     */
    public MapCustomerIdToExternalCustomerIdResponse createMapCustomerIdToExternalCustomerIdResponse() {
        return new MapCustomerIdToExternalCustomerIdResponse();
    }

    /**
     * Create an instance of {@link SearchUserInvitationsRequest }
     * 
     */
    public SearchUserInvitationsRequest createSearchUserInvitationsRequest() {
        return new SearchUserInvitationsRequest();
    }

    /**
     * Create an instance of {@link AddAccountRequest }
     * 
     */
    public AddAccountRequest createAddAccountRequest() {
        return new AddAccountRequest();
    }

    /**
     * Create an instance of {@link SearchCustomersRequest }
     * 
     */
    public SearchCustomersRequest createSearchCustomersRequest() {
        return new SearchCustomersRequest();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link GetCurrentUserResponse }
     * 
     */
    public GetCurrentUserResponse createGetCurrentUserResponse() {
        return new GetCurrentUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UpgradeCustomerToAgencyRequest }
     * 
     */
    public UpgradeCustomerToAgencyRequest createUpgradeCustomerToAgencyRequest() {
        return new UpgradeCustomerToAgencyRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link UpdateUserRequest }
     * 
     */
    public UpdateUserRequest createUpdateUserRequest() {
        return new UpdateUserRequest();
    }

    /**
     * Create an instance of {@link SearchAccountsRequest }
     * 
     */
    public SearchAccountsRequest createSearchAccountsRequest() {
        return new SearchAccountsRequest();
    }

    /**
     * Create an instance of {@link UpdateAccountRequest }
     * 
     */
    public UpdateAccountRequest createUpdateAccountRequest() {
        return new UpdateAccountRequest();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link MapCustomerIdToExternalCustomerIdRequest }
     * 
     */
    public MapCustomerIdToExternalCustomerIdRequest createMapCustomerIdToExternalCustomerIdRequest() {
        return new MapCustomerIdToExternalCustomerIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomerRequest }
     * 
     */
    public GetCustomerRequest createGetCustomerRequest() {
        return new GetCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateUserRolesRequest }
     * 
     */
    public UpdateUserRolesRequest createUpdateUserRolesRequest() {
        return new UpdateUserRolesRequest();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link GetCustomersInfoRequest }
     * 
     */
    public GetCustomersInfoRequest createGetCustomersInfoRequest() {
        return new GetCustomersInfoRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link GetCustomerPilotFeaturesResponse }
     * 
     */
    public GetCustomerPilotFeaturesResponse createGetCustomerPilotFeaturesResponse() {
        return new GetCustomerPilotFeaturesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link MapAccountIdToExternalAccountIdsRequest }
     * 
     */
    public MapAccountIdToExternalAccountIdsRequest createMapAccountIdToExternalAccountIdsRequest() {
        return new MapAccountIdToExternalAccountIdsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link MapAccountIdToExternalAccountIdsResponse }
     * 
     */
    public MapAccountIdToExternalAccountIdsResponse createMapAccountIdToExternalAccountIdsResponse() {
        return new MapAccountIdToExternalAccountIdsResponse();
    }

    /**
     * Create an instance of {@link AddClientLinksResponse }
     * 
     */
    public AddClientLinksResponse createAddClientLinksResponse() {
        return new AddClientLinksResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOperationError }
     * 
     */
    public ArrayOfOperationError createArrayOfOperationError() {
        return new ArrayOfOperationError();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfOperationError }
     * 
     */
    public ArrayOfArrayOfOperationError createArrayOfArrayOfOperationError() {
        return new ArrayOfArrayOfOperationError();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetAccessibleCustomerResponse }
     * 
     */
    public GetAccessibleCustomerResponse createGetAccessibleCustomerResponse() {
        return new GetAccessibleCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAccessibleCustomerRequest }
     * 
     */
    public GetAccessibleCustomerRequest createGetAccessibleCustomerRequest() {
        return new GetAccessibleCustomerRequest();
    }

    /**
     * Create an instance of {@link SignupCustomerResponse }
     * 
     */
    public SignupCustomerResponse createSignupCustomerResponse() {
        return new SignupCustomerResponse();
    }

    /**
     * Create an instance of {@link GetUsersInfoResponse }
     * 
     */
    public GetUsersInfoResponse createGetUsersInfoResponse() {
        return new GetUsersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserInfo }
     * 
     */
    public ArrayOfUserInfo createArrayOfUserInfo() {
        return new ArrayOfUserInfo();
    }

    /**
     * Create an instance of {@link FindAccountsRequest }
     * 
     */
    public FindAccountsRequest createFindAccountsRequest() {
        return new FindAccountsRequest();
    }

    /**
     * Create an instance of {@link SearchUserInvitationsResponse }
     * 
     */
    public SearchUserInvitationsResponse createSearchUserInvitationsResponse() {
        return new SearchUserInvitationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserInvitation }
     * 
     */
    public ArrayOfUserInvitation createArrayOfUserInvitation() {
        return new ArrayOfUserInvitation();
    }

    /**
     * Create an instance of {@link FindAccountsOrCustomersInfoRequest }
     * 
     */
    public FindAccountsOrCustomersInfoRequest createFindAccountsOrCustomersInfoRequest() {
        return new FindAccountsOrCustomersInfoRequest();
    }

    /**
     * Create an instance of {@link GetAccountsInfoResponse }
     * 
     */
    public GetAccountsInfoResponse createGetAccountsInfoResponse() {
        return new GetAccountsInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountInfo }
     * 
     */
    public ArrayOfAccountInfo createArrayOfAccountInfo() {
        return new ArrayOfAccountInfo();
    }

    /**
     * Create an instance of {@link FindAccountsResponse }
     * 
     */
    public FindAccountsResponse createFindAccountsResponse() {
        return new FindAccountsResponse();
    }

    /**
     * Create an instance of {@link SignupCustomerRequest }
     * 
     */
    public SignupCustomerRequest createSignupCustomerRequest() {
        return new SignupCustomerRequest();
    }

    /**
     * Create an instance of {@link GetAccountsInfoRequest }
     * 
     */
    public GetAccountsInfoRequest createGetAccountsInfoRequest() {
        return new GetAccountsInfoRequest();
    }

    /**
     * Create an instance of {@link GetCustomersInfoResponse }
     * 
     */
    public GetCustomersInfoResponse createGetCustomersInfoResponse() {
        return new GetCustomersInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomerInfo }
     * 
     */
    public ArrayOfCustomerInfo createArrayOfCustomerInfo() {
        return new ArrayOfCustomerInfo();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link SendUserInvitationRequest }
     * 
     */
    public SendUserInvitationRequest createSendUserInvitationRequest() {
        return new SendUserInvitationRequest();
    }

    /**
     * Create an instance of {@link UserInvitation }
     * 
     */
    public UserInvitation createUserInvitation() {
        return new UserInvitation();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserRolesResponse }
     * 
     */
    public UpdateUserRolesResponse createUpdateUserRolesResponse() {
        return new UpdateUserRolesResponse();
    }

    /**
     * Create an instance of {@link SearchAccountsResponse }
     * 
     */
    public SearchAccountsResponse createSearchAccountsResponse() {
        return new SearchAccountsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccount }
     * 
     */
    public ArrayOfAccount createArrayOfAccount() {
        return new ArrayOfAccount();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link GetPilotFeaturesCountriesResponse }
     * 
     */
    public GetPilotFeaturesCountriesResponse createGetPilotFeaturesCountriesResponse() {
        return new GetPilotFeaturesCountriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPilotFeature }
     * 
     */
    public ArrayOfPilotFeature createArrayOfPilotFeature() {
        return new ArrayOfPilotFeature();
    }

    /**
     * Create an instance of {@link UpdatePrepayAccountResponse }
     * 
     */
    public UpdatePrepayAccountResponse createUpdatePrepayAccountResponse() {
        return new UpdatePrepayAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateClientLinksResponse }
     * 
     */
    public UpdateClientLinksResponse createUpdateClientLinksResponse() {
        return new UpdateClientLinksResponse();
    }

    /**
     * Create an instance of {@link UpdatePrepayAccountRequest }
     * 
     */
    public UpdatePrepayAccountRequest createUpdatePrepayAccountRequest() {
        return new UpdatePrepayAccountRequest();
    }

    /**
     * Create an instance of {@link ClientLink }
     * 
     */
    public ClientLink createClientLink() {
        return new ClientLink();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link AccountInfoWithCustomerData }
     * 
     */
    public AccountInfoWithCustomerData createAccountInfoWithCustomerData() {
        return new AccountInfoWithCustomerData();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link AdvertiserAccount }
     * 
     */
    public AdvertiserAccount createAdvertiserAccount() {
        return new AdvertiserAccount();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link OrderBy }
     * 
     */
    public OrderBy createOrderBy() {
        return new OrderBy();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link PilotFeature }
     * 
     */
    public PilotFeature createPilotFeature() {
        return new PilotFeature();
    }

    /**
     * Create an instance of {@link KeyValuePairOfstringstring }
     * 
     */
    public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
        return new KeyValuePairOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePairOfstringstring }
     * 
     */
    public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring() {
        return new ArrayOfKeyValuePairOfstringstring();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LCID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "LCID")
    public JAXBElement<LCID> createLCID(LCID value) {
        return new JAXBElement<LCID>(_LCID_QNAME, LCID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPilotFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfPilotFeature")
    public JAXBElement<ArrayOfPilotFeature> createArrayOfPilotFeature(ArrayOfPilotFeature value) {
        return new JAXBElement<ArrayOfPilotFeature>(_ArrayOfPilotFeature_QNAME, ArrayOfPilotFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "UserRole")
    public JAXBElement<UserRole> createUserRole(UserRole value) {
        return new JAXBElement<UserRole>(_UserRole_QNAME, UserRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "ApplicationToken")
    public JAXBElement<String> createApplicationToken(String value) {
        return new JAXBElement<String>(_ApplicationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLifeCycleStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "UserLifeCycleStatus")
    public JAXBElement<UserLifeCycleStatus> createUserLifeCycleStatus(UserLifeCycleStatus value) {
        return new JAXBElement<UserLifeCycleStatus>(_UserLifeCycleStatus_QNAME, UserLifeCycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredicateOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "PredicateOperator")
    public JAXBElement<PredicateOperator> createPredicateOperator(PredicateOperator value) {
        return new JAXBElement<PredicateOperator>(_PredicateOperator_QNAME, PredicateOperator.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "AuthenticationToken")
    public JAXBElement<String> createAuthenticationToken(String value) {
        return new JAXBElement<String>(_AuthenticationToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "OrderBy")
    public JAXBElement<OrderBy> createOrderBy(OrderBy value) {
        return new JAXBElement<OrderBy>(_OrderBy_QNAME, OrderBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "PersonName")
    public JAXBElement<PersonName> createPersonName(PersonName value) {
        return new JAXBElement<PersonName>(_PersonName_QNAME, PersonName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PilotFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "PilotFeature")
    public JAXBElement<PilotFeature> createPilotFeature(PilotFeature value) {
        return new JAXBElement<PilotFeature>(_PilotFeature_QNAME, PilotFeature.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerFinancialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "CustomerFinancialStatus")
    public JAXBElement<CustomerFinancialStatus> createCustomerFinancialStatus(CustomerFinancialStatus value) {
        return new JAXBElement<CustomerFinancialStatus>(_CustomerFinancialStatus_QNAME, CustomerFinancialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AccountType")
    public JAXBElement<AccountType> createAccountType(AccountType value) {
        return new JAXBElement<AccountType>(_AccountType_QNAME, AccountType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerLifeCycleStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "CustomerLifeCycleStatus")
    public JAXBElement<CustomerLifeCycleStatus> createCustomerLifeCycleStatus(CustomerLifeCycleStatus value) {
        return new JAXBElement<CustomerLifeCycleStatus>(_CustomerLifeCycleStatus_QNAME, CustomerLifeCycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "DateRange")
    public JAXBElement<DateRange> createDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_DateRange_QNAME, DateRange.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfCustomerInfo")
    public JAXBElement<ArrayOfCustomerInfo> createArrayOfCustomerInfo(ArrayOfCustomerInfo value) {
        return new JAXBElement<ArrayOfCustomerInfo>(_ArrayOfCustomerInfo_QNAME, ArrayOfCustomerInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "TimeZoneType")
    public JAXBElement<TimeZoneType> createTimeZoneType(TimeZoneType value) {
        return new JAXBElement<TimeZoneType>(_TimeZoneType_QNAME, TimeZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "OrderByField")
    public JAXBElement<OrderByField> createOrderByField(OrderByField value) {
        return new JAXBElement<OrderByField>(_OrderByField_QNAME, OrderByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringstring")
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_ArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfKeyValuePairOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvertiserAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AdvertiserAccount")
    public JAXBElement<AdvertiserAccount> createAdvertiserAccount(AdvertiserAccount value) {
        return new JAXBElement<AdvertiserAccount>(_AdvertiserAccount_QNAME, AdvertiserAccount.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AccountInfo")
    public JAXBElement<AccountInfo> createAccountInfo(AccountInfo value) {
        return new JAXBElement<AccountInfo>(_AccountInfo_QNAME, AccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ServiceLevel")
    public JAXBElement<ServiceLevel> createServiceLevel(ServiceLevel value) {
        return new JAXBElement<ServiceLevel>(_ServiceLevel_QNAME, ServiceLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInfoWithCustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AccountInfoWithCustomerData")
    public JAXBElement<AccountInfoWithCustomerData> createAccountInfoWithCustomerData(AccountInfoWithCustomerData value) {
        return new JAXBElement<AccountInfoWithCustomerData>(_AccountInfoWithCustomerData_QNAME, AccountInfoWithCustomerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountLifeCycleStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AccountLifeCycleStatus")
    public JAXBElement<AccountLifeCycleStatus> createAccountLifeCycleStatus(AccountLifeCycleStatus value) {
        return new JAXBElement<AccountLifeCycleStatus>(_AccountLifeCycleStatus_QNAME, AccountLifeCycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFinancialStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "AccountFinancialStatus")
    public JAXBElement<AccountFinancialStatus> createAccountFinancialStatus(AccountFinancialStatus value) {
        return new JAXBElement<AccountFinancialStatus>(_AccountFinancialStatus_QNAME, AccountFinancialStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "UserInfo")
    public JAXBElement<UserInfo> createUserInfo(UserInfo value) {
        return new JAXBElement<UserInfo>(_UserInfo_QNAME, UserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfCustomer")
    public JAXBElement<ArrayOfCustomer> createArrayOfCustomer(ArrayOfCustomer value) {
        return new JAXBElement<ArrayOfCustomer>(_ArrayOfCustomer_QNAME, ArrayOfCustomer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringstring")
    public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring value) {
        return new JAXBElement<KeyValuePairOfstringstring>(_KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfClientLink")
    public JAXBElement<ArrayOfClientLink> createArrayOfClientLink(ArrayOfClientLink value) {
        return new JAXBElement<ArrayOfClientLink>(_ArrayOfClientLink_QNAME, ArrayOfClientLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "TrackingId")
    public JAXBElement<String> createTrackingId(String value) {
        return new JAXBElement<String>(_TrackingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "LanguageType")
    public JAXBElement<LanguageType> createLanguageType(LanguageType value) {
        return new JAXBElement<LanguageType>(_LanguageType_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFaultElement(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFaultElement_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ApplicationType")
    public JAXBElement<ApplicationType> createApplicationType(ApplicationType value) {
        return new JAXBElement<ApplicationType>(_ApplicationType_QNAME, ApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "TaxType")
    public JAXBElement<TaxType> createTaxType(TaxType value) {
        return new JAXBElement<TaxType>(_TaxType_QNAME, TaxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfoWithCustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfAccountInfoWithCustomerData")
    public JAXBElement<ArrayOfAccountInfoWithCustomerData> createArrayOfAccountInfoWithCustomerData(ArrayOfAccountInfoWithCustomerData value) {
        return new JAXBElement<ArrayOfAccountInfoWithCustomerData>(_ArrayOfAccountInfoWithCustomerData_QNAME, ArrayOfAccountInfoWithCustomerData.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfUserInfo")
    public JAXBElement<ArrayOfUserInfo> createArrayOfUserInfo(ArrayOfUserInfo value) {
        return new JAXBElement<ArrayOfUserInfo>(_ArrayOfUserInfo_QNAME, ArrayOfUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfAccountInfo")
    public JAXBElement<ArrayOfAccountInfo> createArrayOfAccountInfo(ArrayOfAccountInfo value) {
        return new JAXBElement<ArrayOfAccountInfo>(_ArrayOfAccountInfo_QNAME, ArrayOfAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "CustomerInfo")
    public JAXBElement<CustomerInfo> createCustomerInfo(CustomerInfo value) {
        return new JAXBElement<CustomerInfo>(_CustomerInfo_QNAME, CustomerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientLinkStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ClientLinkStatus")
    public JAXBElement<ClientLinkStatus> createClientLinkStatusElement(ClientLinkStatus value) {
        return new JAXBElement<ClientLinkStatus>(_ClientLinkStatusElement_QNAME, ClientLinkStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "CurrencyType")
    public JAXBElement<CurrencyType> createCurrencyType(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyType_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "PaymentMethodType")
    public JAXBElement<PaymentMethodType> createPaymentMethodType(PaymentMethodType value) {
        return new JAXBElement<PaymentMethodType>(_PaymentMethodType_QNAME, PaymentMethodType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Exception", name = "OperationError")
    public JAXBElement<OperationError> createOperationError(OperationError value) {
        return new JAXBElement<OperationError>(_OperationError_QNAME, OperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paging }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Paging")
    public JAXBElement<Paging> createPaging(Paging value) {
        return new JAXBElement<Paging>(_Paging_QNAME, Paging.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPredicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfPredicate")
    public JAXBElement<ArrayOfPredicate> createArrayOfPredicate(ArrayOfPredicate value) {
        return new JAXBElement<ArrayOfPredicate>(_ArrayOfPredicate_QNAME, ArrayOfPredicate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SecretQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "SecretQuestion")
    public JAXBElement<SecretQuestion> createSecretQuestion(SecretQuestion value) {
        return new JAXBElement<SecretQuestion>(_SecretQuestion_QNAME, SecretQuestion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Industry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Industry")
    public JAXBElement<Industry> createIndustry(Industry value) {
        return new JAXBElement<Industry>(_Industry_QNAME, Industry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserInvitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfUserInvitation")
    public JAXBElement<ArrayOfUserInvitation> createArrayOfUserInvitation(ArrayOfUserInvitation value) {
        return new JAXBElement<ArrayOfUserInvitation>(_ArrayOfUserInvitation_QNAME, ArrayOfUserInvitation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "DeveloperToken")
    public JAXBElement<String> createDeveloperToken(String value) {
        return new JAXBElement<String>(_DeveloperToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfAccount")
    public JAXBElement<ArrayOfAccount> createArrayOfAccount(ArrayOfAccount value) {
        return new JAXBElement<ArrayOfAccount>(_ArrayOfAccount_QNAME, ArrayOfAccount.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ContactInfo")
    public JAXBElement<ContactInfo> createContactInfo(ContactInfo value) {
        return new JAXBElement<ContactInfo>(_ContactInfo_QNAME, ContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Exception", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserInvitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "UserInvitation")
    public JAXBElement<UserInvitation> createUserInvitation(UserInvitation value) {
        return new JAXBElement<UserInvitation>(_UserInvitation_QNAME, UserInvitation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9", name = "UserName")
    public JAXBElement<String> createUserNameElement(String value) {
        return new JAXBElement<String>(_UserNameElement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ClientLink")
    public JAXBElement<ClientLink> createClientLink(ClientLink value) {
        return new JAXBElement<ClientLink>(_ClientLink_QNAME, ClientLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Exception", name = "ArrayOfArrayOfOperationError")
    public JAXBElement<ArrayOfArrayOfOperationError> createArrayOfArrayOfOperationError(ArrayOfArrayOfOperationError value) {
        return new JAXBElement<ArrayOfArrayOfOperationError>(_ArrayOfArrayOfOperationError_QNAME, ArrayOfArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "EmailFormat")
    public JAXBElement<EmailFormat> createEmailFormat(EmailFormat value) {
        return new JAXBElement<EmailFormat>(_EmailFormat_QNAME, EmailFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "ArrayOfOrderBy")
    public JAXBElement<ArrayOfOrderBy> createArrayOfOrderBy(ArrayOfOrderBy value) {
        return new JAXBElement<ArrayOfOrderBy>(_ArrayOfOrderBy_QNAME, ArrayOfOrderBy.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Exception", name = "ArrayOfOperationError")
    public JAXBElement<ArrayOfOperationError> createArrayOfOperationError(ArrayOfOperationError value) {
        return new JAXBElement<ArrayOfOperationError>(_ArrayOfOperationError_QNAME, ArrayOfOperationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Predicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bingads.microsoft.com/Customer/v9/Entities", name = "Predicate")
    public JAXBElement<Predicate> createPredicate(Predicate value) {
        return new JAXBElement<Predicate>(_Predicate_QNAME, Predicate.class, null, value);
    }

}
