package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.customermanagement.*;

class CustomerManagementExampleHelper
{
    static ServiceClient<ICustomerManagementService> CustomerManagementService;
    static AddAccountResponse addAccount(
        Account account) throws RemoteException, Exception
    {
        AddAccountRequest request = new AddAccountRequest();

        request.setAccount(account);

        return CustomerManagementService.getService().addAccount(request);
    }
    static AddClientLinksResponse addClientLinks(
        ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        AddClientLinksRequest request = new AddClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerManagementService.getService().addClientLinks(request);
    }
    static DeleteAccountResponse deleteAccount(
        java.lang.Long accountId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteAccountRequest request = new DeleteAccountRequest();

        request.setAccountId(accountId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteAccount(request);
    }
    static DeleteCustomerResponse deleteCustomer(
        java.lang.Long customerId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteCustomerRequest request = new DeleteCustomerRequest();

        request.setCustomerId(customerId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteCustomer(request);
    }
    static DeleteUserResponse deleteUser(
        java.lang.Long userId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteUserRequest request = new DeleteUserRequest();

        request.setUserId(userId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteUser(request);
    }
    static FindAccountsResponse findAccounts(
        java.lang.Long customerId,
        java.lang.String accountFilter,
        java.lang.Integer topN,
        ApplicationType applicationScope) throws RemoteException, Exception
    {
        FindAccountsRequest request = new FindAccountsRequest();

        request.setCustomerId(customerId);
        request.setAccountFilter(accountFilter);
        request.setTopN(topN);
        request.setApplicationScope(applicationScope);

        return CustomerManagementService.getService().findAccounts(request);
    }
    static FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(
        java.lang.String filter,
        java.lang.Integer topN,
        ApplicationType applicationScope) throws RemoteException, Exception
    {
        FindAccountsOrCustomersInfoRequest request = new FindAccountsOrCustomersInfoRequest();

        request.setFilter(filter);
        request.setTopN(topN);
        request.setApplicationScope(applicationScope);

        return CustomerManagementService.getService().findAccountsOrCustomersInfo(request);
    }
    static GetAccountResponse getAccount(
        java.lang.Long accountId) throws RemoteException, Exception
    {
        GetAccountRequest request = new GetAccountRequest();

        request.setAccountId(accountId);

        return CustomerManagementService.getService().getAccount(request);
    }
    static GetAccountsInfoResponse getAccountsInfo(
        java.lang.Long customerId,
        java.lang.Boolean onlyParentAccounts) throws RemoteException, Exception
    {
        GetAccountsInfoRequest request = new GetAccountsInfoRequest();

        request.setCustomerId(customerId);
        request.setOnlyParentAccounts(onlyParentAccounts);

        return CustomerManagementService.getService().getAccountsInfo(request);
    }
    static GetCustomerResponse getCustomer(
        java.lang.Long customerId) throws RemoteException, Exception
    {
        GetCustomerRequest request = new GetCustomerRequest();

        request.setCustomerId(customerId);

        return CustomerManagementService.getService().getCustomer(request);
    }
    static GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(
        java.lang.Long customerId) throws RemoteException, Exception
    {
        GetCustomerPilotFeaturesRequest request = new GetCustomerPilotFeaturesRequest();

        request.setCustomerId(customerId);

        return CustomerManagementService.getService().getCustomerPilotFeatures(request);
    }
    static GetCustomersInfoResponse getCustomersInfo(
        java.lang.String customerNameFilter,
        java.lang.Integer topN,
        ApplicationType applicationScope) throws RemoteException, Exception
    {
        GetCustomersInfoRequest request = new GetCustomersInfoRequest();

        request.setCustomerNameFilter(customerNameFilter);
        request.setTopN(topN);
        request.setApplicationScope(applicationScope);

        return CustomerManagementService.getService().getCustomersInfo(request);
    }
    static GetUserResponse getUser(
        java.lang.Long userId) throws RemoteException, Exception
    {
        GetUserRequest request = new GetUserRequest();

        request.setUserId(userId);

        return CustomerManagementService.getService().getUser(request);
    }
    static GetUsersInfoResponse getUsersInfo(
        java.lang.Long customerId,
        UserLifeCycleStatus statusFilter) throws RemoteException, Exception
    {
        GetUsersInfoRequest request = new GetUsersInfoRequest();

        request.setCustomerId(customerId);
        request.setStatusFilter(statusFilter);

        return CustomerManagementService.getService().getUsersInfo(request);
    }
    static SearchAccountsResponse searchAccounts(
        ArrayOfPredicate predicates,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchAccountsRequest request = new SearchAccountsRequest();

        request.setPredicates(predicates);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchAccounts(request);
    }
    static SearchClientLinksResponse searchClientLinks(
        ArrayOfPredicate predicates,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchClientLinksRequest request = new SearchClientLinksRequest();

        request.setPredicates(predicates);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchClientLinks(request);
    }
    static SearchCustomersResponse searchCustomers(
        ApplicationType applicationScope,
        ArrayOfPredicate predicates,
        DateRange dateRange,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchCustomersRequest request = new SearchCustomersRequest();

        request.setApplicationScope(applicationScope);
        request.setPredicates(predicates);
        request.setDateRange(dateRange);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchCustomers(request);
    }
    static SearchUserInvitationsResponse searchUserInvitations(
        ArrayOfPredicate predicates) throws RemoteException, Exception
    {
        SearchUserInvitationsRequest request = new SearchUserInvitationsRequest();

        request.setPredicates(predicates);

        return CustomerManagementService.getService().searchUserInvitations(request);
    }
    static SendUserInvitationResponse sendUserInvitation(
        UserInvitation userInvitation) throws RemoteException, Exception
    {
        SendUserInvitationRequest request = new SendUserInvitationRequest();

        request.setUserInvitation(userInvitation);

        return CustomerManagementService.getService().sendUserInvitation(request);
    }
    static SignupCustomerResponse signupCustomer(
        Customer customer,
        Account account,
        java.lang.Long parentCustomerId,
        ApplicationType applicationScope) throws RemoteException, Exception
    {
        SignupCustomerRequest request = new SignupCustomerRequest();

        request.setCustomer(customer);
        request.setAccount(account);
        request.setParentCustomerId(parentCustomerId);
        request.setApplicationScope(applicationScope);

        return CustomerManagementService.getService().signupCustomer(request);
    }
    static UpdateAccountResponse updateAccount(
        Account account) throws RemoteException, Exception
    {
        UpdateAccountRequest request = new UpdateAccountRequest();

        request.setAccount(account);

        return CustomerManagementService.getService().updateAccount(request);
    }
    static UpdateClientLinksResponse updateClientLinks(
        ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        UpdateClientLinksRequest request = new UpdateClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerManagementService.getService().updateClientLinks(request);
    }
    static UpdateCustomerResponse updateCustomer(
        Customer customer) throws RemoteException, Exception
    {
        UpdateCustomerRequest request = new UpdateCustomerRequest();

        request.setCustomer(customer);

        return CustomerManagementService.getService().updateCustomer(request);
    }
    static UpdateUserResponse updateUser(
        User user) throws RemoteException, Exception
    {
        UpdateUserRequest request = new UpdateUserRequest();

        request.setUser(user);

        return CustomerManagementService.getService().updateUser(request);
    }
    static UpdateUserRolesResponse updateUserRoles(
        java.lang.Long customerId,
        java.lang.Long userId,
        java.lang.Integer newRoleId,
        ArrayOflong newAccountIds,
        ArrayOflong newCustomerIds,
        java.lang.Integer deleteRoleId,
        ArrayOflong deleteAccountIds,
        ArrayOflong deleteCustomerIds) throws RemoteException, Exception
    {
        UpdateUserRolesRequest request = new UpdateUserRolesRequest();

        request.setCustomerId(customerId);
        request.setUserId(userId);
        request.setNewRoleId(newRoleId);
        request.setNewAccountIds(newAccountIds);
        request.setNewCustomerIds(newCustomerIds);
        request.setDeleteRoleId(deleteRoleId);
        request.setDeleteAccountIds(deleteAccountIds);
        request.setDeleteCustomerIds(deleteCustomerIds);

        return CustomerManagementService.getService().updateUserRoles(request);
    }
    static void outputAccount(Account dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountType: %s", dataObject.getAccountType()));
            outputStatusMessage(String.format("BillToCustomerId: %s", dataObject.getBillToCustomerId()));
            outputStatusMessage(String.format("CountryCode: %s", dataObject.getCountryCode()));
            outputStatusMessage(String.format("CurrencyType: %s", dataObject.getCurrencyType()));
            outputStatusMessage(String.format("AccountFinancialStatus: %s", dataObject.getAccountFinancialStatus()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
            outputStatusMessage(String.format("ParentCustomerId: %s", dataObject.getParentCustomerId()));
            outputStatusMessage(String.format("PaymentMethodId: %s", dataObject.getPaymentMethodId()));
            outputStatusMessage(String.format("PaymentMethodType: %s", dataObject.getPaymentMethodType()));
            outputStatusMessage(String.format("PrimaryUserId: %s", dataObject.getPrimaryUserId()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("TimeZone: %s", dataObject.getTimeZone()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
            if(dataObject instanceof AdvertiserAccount)
            {
                outputAdvertiserAccount((AdvertiserAccount)dataObject);
            }
        }
    }
    static void outputArrayOfAccount(ArrayOfAccount dataObjects)
    {
        if (null != dataObjects)
        {
            for (Account dataObject : dataObjects.getAccounts())
            {
                outputAccount(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountInfo(AccountInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
        }
    }
    static void outputArrayOfAccountInfo(ArrayOfAccountInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountInfo dataObject : dataObjects.getAccountInfos())
            {
                outputAccountInfo(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountInfoWithCustomerData(AccountInfoWithCustomerData dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("CustomerName: %s", dataObject.getCustomerName()));
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("AccountName: %s", dataObject.getAccountName()));
            outputStatusMessage(String.format("AccountNumber: %s", dataObject.getAccountNumber()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
        }
    }
    static void outputArrayOfAccountInfoWithCustomerData(ArrayOfAccountInfoWithCustomerData dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountInfoWithCustomerData dataObject : dataObjects.getAccountInfoWithCustomerDatas())
            {
                outputAccountInfoWithCustomerData(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfAdApiError(dataObject.getErrors());
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAddress(Address dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("City: %s", dataObject.getCity()));
            outputStatusMessage(String.format("CountryCode: %s", dataObject.getCountryCode()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Line1: %s", dataObject.getLine1()));
            outputStatusMessage(String.format("Line2: %s", dataObject.getLine2()));
            outputStatusMessage(String.format("Line3: %s", dataObject.getLine3()));
            outputStatusMessage(String.format("Line4: %s", dataObject.getLine4()));
            outputStatusMessage(String.format("PostalCode: %s", dataObject.getPostalCode()));
            outputStatusMessage(String.format("StateOrProvince: %s", dataObject.getStateOrProvince()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
        }
    }
    static void outputArrayOfAddress(ArrayList<Address> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Address dataObject : dataObjects)
            {
                outputAddress(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdvertiserAccount(AdvertiserAccount dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfCustomerInfo(dataObject.getLinkedAgencies());
            outputStatusMessage(String.format("SalesHouseCustomerId: %s", dataObject.getSalesHouseCustomerId()));
            outputArrayOfKeyValuePairOfstringstring(dataObject.getTaxInformation());
            outputStatusMessage(String.format("BackUpPaymentInstrumentId: %s", dataObject.getBackUpPaymentInstrumentId()));
            outputStatusMessage(String.format("BillingThresholdAmount: %s", dataObject.getBillingThresholdAmount()));
            outputAddress(dataObject.getBusinessAddress());
        }
    }
    static void outputArrayOfAdvertiserAccount(ArrayList<AdvertiserAccount> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdvertiserAccount dataObject : dataObjects)
            {
                outputAdvertiserAccount(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApiFault(ApiFault dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfOperationError(dataObject.getOperationErrors());
        }
    }
    static void outputArrayOfApiFault(ArrayList<ApiFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFault dataObject : dataObjects)
            {
                outputApiFault(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFault)
            {
                outputApiFault((ApiFault)dataObject);
            }
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputClientLink(ClientLink dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("ClientAccountId: %s", dataObject.getClientAccountId()));
            outputStatusMessage(String.format("ClientAccountNumber: %s", dataObject.getClientAccountNumber()));
            outputStatusMessage(String.format("ManagingCustomerId: %s", dataObject.getManagingCustomerId()));
            outputStatusMessage(String.format("ManagingCustomerNumber: %s", dataObject.getManagingCustomerNumber()));
            outputStatusMessage(String.format("Note: %s", dataObject.getNote()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("InviterEmail: %s", dataObject.getInviterEmail()));
            outputStatusMessage(String.format("InviterName: %s", dataObject.getInviterName()));
            outputStatusMessage(String.format("InviterPhone: %s", dataObject.getInviterPhone()));
            outputStatusMessage(String.format("IsBillToClient: %s", dataObject.getIsBillToClient()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("SuppressNotification: %s", dataObject.getSuppressNotification()));
            outputStatusMessage(String.format("LastModifiedDateTime: %s", dataObject.getLastModifiedDateTime()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("Timestamp: %s", dataObject.getTimestamp()));
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
        }
    }
    static void outputArrayOfClientLink(ArrayOfClientLink dataObjects)
    {
        if (null != dataObjects)
        {
            for (ClientLink dataObject : dataObjects.getClientLinks())
            {
                outputClientLink(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputContactInfo(ContactInfo dataObject)
    {
        if (null != dataObject)
        {
            outputAddress(dataObject.getAddress());
            outputStatusMessage(String.format("ContactByPhone: %s", dataObject.getContactByPhone()));
            outputStatusMessage(String.format("ContactByPostalMail: %s", dataObject.getContactByPostalMail()));
            outputStatusMessage(String.format("Email: %s", dataObject.getEmail()));
            outputStatusMessage(String.format("EmailFormat: %s", dataObject.getEmailFormat()));
            outputStatusMessage(String.format("Fax: %s", dataObject.getFax()));
            outputStatusMessage(String.format("HomePhone: %s", dataObject.getHomePhone()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Mobile: %s", dataObject.getMobile()));
            outputStatusMessage(String.format("Phone1: %s", dataObject.getPhone1()));
            outputStatusMessage(String.format("Phone2: %s", dataObject.getPhone2()));
        }
    }
    static void outputArrayOfContactInfo(ArrayList<ContactInfo> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ContactInfo dataObject : dataObjects)
            {
                outputContactInfo(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCustomer(Customer dataObject)
    {
        if (null != dataObject)
        {
            outputAddress(dataObject.getCustomerAddress());
            outputStatusMessage(String.format("CustomerFinancialStatus: %s", dataObject.getCustomerFinancialStatus()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Industry: %s", dataObject.getIndustry()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("MarketCountry: %s", dataObject.getMarketCountry()));
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("MarketLanguage: %s", dataObject.getMarketLanguage()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("ServiceLevel: %s", dataObject.getServiceLevel()));
            outputStatusMessage(String.format("CustomerLifeCycleStatus: %s", dataObject.getCustomerLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
        }
    }
    static void outputArrayOfCustomer(ArrayOfCustomer dataObjects)
    {
        if (null != dataObjects)
        {
            for (Customer dataObject : dataObjects.getCustomers())
            {
                outputCustomer(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCustomerInfo(CustomerInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
        }
    }
    static void outputArrayOfCustomerInfo(ArrayOfCustomerInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomerInfo dataObject : dataObjects.getCustomerInfos())
            {
                outputCustomerInfo(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDateRange(DateRange dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("MinDate: %s", dataObject.getMinDate()));
            outputStatusMessage(String.format("MaxDate: %s", dataObject.getMaxDate()));
        }
    }
    static void outputArrayOfDateRange(ArrayList<DateRange> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DateRange dataObject : dataObjects)
            {
                outputDateRange(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeyValuePairOfstringstring(KeyValuePairOfstringstring dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
        }
    }
    static void outputArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeyValuePairOfstringstring dataObject : dataObjects.getKeyValuePairOfstringstrings())
            {
                outputKeyValuePairOfstringstring(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOrderBy(OrderBy dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Order: %s", dataObject.getOrder()));
        }
    }
    static void outputArrayOfOrderBy(ArrayOfOrderBy dataObjects)
    {
        if (null != dataObjects)
        {
            for (OrderBy dataObject : dataObjects.getOrderBies())
            {
                outputOrderBy(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPersonName(PersonName dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("FirstName: %s", dataObject.getFirstName()));
            outputStatusMessage(String.format("LastName: %s", dataObject.getLastName()));
            outputStatusMessage(String.format("MiddleInitial: %s", dataObject.getMiddleInitial()));
        }
    }
    static void outputArrayOfPersonName(ArrayList<PersonName> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PersonName dataObject : dataObjects)
            {
                outputPersonName(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPredicate(Predicate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
        }
    }
    static void outputArrayOfPredicate(ArrayOfPredicate dataObjects)
    {
        if (null != dataObjects)
        {
            for (Predicate dataObject : dataObjects.getPredicates())
            {
                outputPredicate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUser(User dataObject)
    {
        if (null != dataObject)
        {
            outputContactInfo(dataObject.getContactInfo());
            outputStatusMessage(String.format("CustomerAppScope: %s", dataObject.getCustomerAppScope()));
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("JobTitle: %s", dataObject.getJobTitle()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("Lcid: %s", dataObject.getLcid()));
            outputPersonName(dataObject.getName());
            outputStatusMessage(String.format("Password: %s", dataObject.getPassword()));
            outputStatusMessage(String.format("SecretAnswer: %s", dataObject.getSecretAnswer()));
            outputStatusMessage(String.format("SecretQuestion: %s", dataObject.getSecretQuestion()));
            outputStatusMessage(String.format("UserLifeCycleStatus: %s", dataObject.getUserLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("UserName: %s", dataObject.getUserName()));
            outputStatusMessage(String.format("IsMigratedToMicrosoftAccount: %s", dataObject.getIsMigratedToMicrosoftAccount()));
        }
    }
    static void outputArrayOfUser(ArrayList<User> dataObjects)
    {
        if (null != dataObjects)
        {
            for (User dataObject : dataObjects)
            {
                outputUser(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUserInfo(UserInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("UserName: %s", dataObject.getUserName()));
        }
    }
    static void outputArrayOfUserInfo(ArrayOfUserInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserInfo dataObject : dataObjects.getUserInfos())
            {
                outputUserInfo(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUserInvitation(UserInvitation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("FirstName: %s", dataObject.getFirstName()));
            outputStatusMessage(String.format("LastName: %s", dataObject.getLastName()));
            outputStatusMessage(String.format("Email: %s", dataObject.getEmail()));
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("Role: %s", dataObject.getRole()));
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage(String.format("ExpirationDate: %s", dataObject.getExpirationDate()));
            outputStatusMessage(String.format("Lcid: %s", dataObject.getLcid()));
        }
    }
    static void outputArrayOfUserInvitation(ArrayOfUserInvitation dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserInvitation dataObject : dataObjects.getUserInvitations())
            {
                outputUserInvitation(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountLifeCycleStatus(AccountLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountLifeCycleStatus value : AccountLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountLifeCycleStatus(ArrayList<AccountLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountLifeCycleStatus valueSet : valueSets)
            {
                outputAccountLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputApplicationType(ApplicationType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ApplicationType value : ApplicationType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfApplicationType(ArrayList<ApplicationType> valueSets)
    {
        if (null != valueSets)
        {
            for (ApplicationType valueSet : valueSets)
            {
                outputApplicationType(valueSet);
            }
        }
    }
    static void outputAccountType(AccountType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountType value : AccountType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountType(ArrayList<AccountType> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountType valueSet : valueSets)
            {
                outputAccountType(valueSet);
            }
        }
    }
    static void outputCurrencyType(CurrencyType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CurrencyType value : CurrencyType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCurrencyType(ArrayList<CurrencyType> valueSets)
    {
        if (null != valueSets)
        {
            for (CurrencyType valueSet : valueSets)
            {
                outputCurrencyType(valueSet);
            }
        }
    }
    static void outputAccountFinancialStatus(AccountFinancialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountFinancialStatus value : AccountFinancialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountFinancialStatus(ArrayList<AccountFinancialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountFinancialStatus valueSet : valueSets)
            {
                outputAccountFinancialStatus(valueSet);
            }
        }
    }
    static void outputLanguageType(LanguageType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (LanguageType value : LanguageType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfLanguageType(ArrayList<LanguageType> valueSets)
    {
        if (null != valueSets)
        {
            for (LanguageType valueSet : valueSets)
            {
                outputLanguageType(valueSet);
            }
        }
    }
    static void outputPaymentMethodType(PaymentMethodType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PaymentMethodType value : PaymentMethodType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPaymentMethodType(ArrayList<PaymentMethodType> valueSets)
    {
        if (null != valueSets)
        {
            for (PaymentMethodType valueSet : valueSets)
            {
                outputPaymentMethodType(valueSet);
            }
        }
    }
    static void outputTimeZoneType(TimeZoneType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (TimeZoneType value : TimeZoneType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfTimeZoneType(ArrayList<TimeZoneType> valueSets)
    {
        if (null != valueSets)
        {
            for (TimeZoneType valueSet : valueSets)
            {
                outputTimeZoneType(valueSet);
            }
        }
    }
    static void outputCustomerFinancialStatus(CustomerFinancialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CustomerFinancialStatus value : CustomerFinancialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCustomerFinancialStatus(ArrayList<CustomerFinancialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CustomerFinancialStatus valueSet : valueSets)
            {
                outputCustomerFinancialStatus(valueSet);
            }
        }
    }
    static void outputIndustry(Industry valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Industry value : Industry.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfIndustry(ArrayList<Industry> valueSets)
    {
        if (null != valueSets)
        {
            for (Industry valueSet : valueSets)
            {
                outputIndustry(valueSet);
            }
        }
    }
    static void outputServiceLevel(ServiceLevel valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ServiceLevel value : ServiceLevel.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfServiceLevel(ArrayList<ServiceLevel> valueSets)
    {
        if (null != valueSets)
        {
            for (ServiceLevel valueSet : valueSets)
            {
                outputServiceLevel(valueSet);
            }
        }
    }
    static void outputCustomerLifeCycleStatus(CustomerLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CustomerLifeCycleStatus value : CustomerLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCustomerLifeCycleStatus(ArrayList<CustomerLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CustomerLifeCycleStatus valueSet : valueSets)
            {
                outputCustomerLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputEmailFormat(EmailFormat valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (EmailFormat value : EmailFormat.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfEmailFormat(ArrayList<EmailFormat> valueSets)
    {
        if (null != valueSets)
        {
            for (EmailFormat valueSet : valueSets)
            {
                outputEmailFormat(valueSet);
            }
        }
    }
    static void outputLCID(LCID valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (LCID value : LCID.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfLCID(ArrayList<LCID> valueSets)
    {
        if (null != valueSets)
        {
            for (LCID valueSet : valueSets)
            {
                outputLCID(valueSet);
            }
        }
    }
    static void outputSecretQuestion(SecretQuestion valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SecretQuestion value : SecretQuestion.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSecretQuestion(ArrayList<SecretQuestion> valueSets)
    {
        if (null != valueSets)
        {
            for (SecretQuestion valueSet : valueSets)
            {
                outputSecretQuestion(valueSet);
            }
        }
    }
    static void outputUserLifeCycleStatus(UserLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (UserLifeCycleStatus value : UserLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfUserLifeCycleStatus(ArrayList<UserLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (UserLifeCycleStatus valueSet : valueSets)
            {
                outputUserLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputPredicateOperator(PredicateOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PredicateOperator value : PredicateOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPredicateOperator(ArrayList<PredicateOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (PredicateOperator valueSet : valueSets)
            {
                outputPredicateOperator(valueSet);
            }
        }
    }
    static void outputOrderByField(OrderByField valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (OrderByField value : OrderByField.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfOrderByField(ArrayList<OrderByField> valueSets)
    {
        if (null != valueSets)
        {
            for (OrderByField valueSet : valueSets)
            {
                outputOrderByField(valueSet);
            }
        }
    }
    static void outputSortOrder(SortOrder valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SortOrder value : SortOrder.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSortOrder(ArrayList<SortOrder> valueSets)
    {
        if (null != valueSets)
        {
            for (SortOrder valueSet : valueSets)
            {
                outputSortOrder(valueSet);
            }
        }
    }
    static void outputClientLinkStatus(ClientLinkStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ClientLinkStatus value : ClientLinkStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfClientLinkStatus(ArrayList<ClientLinkStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (ClientLinkStatus valueSet : valueSets)
            {
                outputClientLinkStatus(valueSet);
            }
        }
    }
    static void outputUserRole(UserRole valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (UserRole value : UserRole.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfUserRole(ArrayList<UserRole> valueSets)
    {
        if (null != valueSets)
        {
            for (UserRole valueSet : valueSets)
            {
                outputUserRole(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
    static void outputArrayOfstring(ArrayOfstring items)
    {
        if (null != items)
        {
            for (java.lang.String item : items.getStrings())
            {
                outputStatusMessage(String.format("Value of the string: %s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("Value of the long: %s", item));
            }
        }
    }
}