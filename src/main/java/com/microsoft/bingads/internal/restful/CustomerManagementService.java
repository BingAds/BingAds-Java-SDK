package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.customermanagement.*;

public class CustomerManagementService extends RestfulServiceClient implements ICustomerManagementService {

	public CustomerManagementService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env, ICustomerManagementService.class);
    }
	
	Exception processFaultDetail(ApplicationFault faultDetail, boolean shouldThrow) 
			throws AdApiFaultDetail_Exception, ApiFault_Exception {
		String message = getFaultMessage(faultDetail.getTrackingId());

		if (faultDetail instanceof AdApiFaultDetail) {
			AdApiFaultDetail_Exception ex = new AdApiFaultDetail_Exception(message, (AdApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (faultDetail instanceof ApiFault) {
			ApiFault_Exception ex = new ApiFault_Exception(message, (ApiFault)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (shouldThrow) {
			throw new RuntimeException("Unknown fault type: " + faultDetail.getClass());
		}

		return null;
	}

	protected <Req, Resp> Resp sendRequest(Req request, String entityEndpoint, String verb, Class<Resp> respClass)
			throws AdApiFaultDetail_Exception, ApiFault_Exception {
		ResponseInfo<Resp, ApplicationFault> responseInfo = getResponseInfo(request, entityEndpoint, verb, respClass, ApplicationFault.class);

		if (responseInfo == null) {
			return null;
		}

		ApplicationFault faultDetail = responseInfo.getFaultDetail();

		if (faultDetail != null) {
			processFaultDetail(faultDetail, true);
		}

		return responseInfo.getResponse();
	}

	private Exception getFaultException(ApplicationFault faultDetail) {
		try {
			Exception ex = processFaultDetail(faultDetail, false);

			return ex;
		} catch (Exception ex) {
			throw new InternalException(ex);
		}
	}

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), handler);
	}
		
	public GetAccountsInfoResponse getAccountsInfo(GetAccountsInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountsInfoResponse response = sendRequest(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class);
		
		return response;
	}

    public Response<GetAccountsInfoResponse> getAccountsInfoAsync(GetAccountsInfoRequest request) {
		return sendRequestAsync(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class, null);
	}

	public Future<?> getAccountsInfoAsync(GetAccountsInfoRequest request, AsyncHandler<GetAccountsInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class, asyncHandler);
	}
	
    	
	public FindAccountsResponse findAccounts(FindAccountsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		FindAccountsResponse response = sendRequest(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class);
		
		return response;
	}

    public Response<FindAccountsResponse> findAccountsAsync(FindAccountsRequest request) {
		return sendRequestAsync(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class, null);
	}

	public Future<?> findAccountsAsync(FindAccountsRequest request, AsyncHandler<FindAccountsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class, asyncHandler);
	}
	
    	
	public AddAccountResponse addAccount(AddAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddAccountResponse response = sendRequest(request, "/Account", HttpPost, AddAccountResponse.class);
		
		return response;
	}

    public Response<AddAccountResponse> addAccountAsync(AddAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpPost, AddAccountResponse.class, null);
	}

	public Future<?> addAccountAsync(AddAccountRequest request, AsyncHandler<AddAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpPost, AddAccountResponse.class, asyncHandler);
	}
	
    	
	public UpdateAccountResponse updateAccount(UpdateAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateAccountResponse response = sendRequest(request, "/Account", HttpPut, UpdateAccountResponse.class);
		
		return response;
	}

    public Response<UpdateAccountResponse> updateAccountAsync(UpdateAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpPut, UpdateAccountResponse.class, null);
	}

	public Future<?> updateAccountAsync(UpdateAccountRequest request, AsyncHandler<UpdateAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpPut, UpdateAccountResponse.class, asyncHandler);
	}
	
    	
	public GetCustomerResponse getCustomer(GetCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomerResponse response = sendRequest(request, "/Customer/Query", HttpPost, GetCustomerResponse.class);
		
		return response;
	}

    public Response<GetCustomerResponse> getCustomerAsync(GetCustomerRequest request) {
		return sendRequestAsync(request, "/Customer/Query", HttpPost, GetCustomerResponse.class, null);
	}

	public Future<?> getCustomerAsync(GetCustomerRequest request, AsyncHandler<GetCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/Query", HttpPost, GetCustomerResponse.class, asyncHandler);
	}
	
    	
	public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateCustomerResponse response = sendRequest(request, "/Customer", HttpPut, UpdateCustomerResponse.class);
		
		return response;
	}

    public Response<UpdateCustomerResponse> updateCustomerAsync(UpdateCustomerRequest request) {
		return sendRequestAsync(request, "/Customer", HttpPut, UpdateCustomerResponse.class, null);
	}

	public Future<?> updateCustomerAsync(UpdateCustomerRequest request, AsyncHandler<UpdateCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer", HttpPut, UpdateCustomerResponse.class, asyncHandler);
	}
	
    	
	public SignupCustomerResponse signupCustomer(SignupCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SignupCustomerResponse response = sendRequest(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class);
		
		return response;
	}

    public Response<SignupCustomerResponse> signupCustomerAsync(SignupCustomerRequest request) {
		return sendRequestAsync(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class, null);
	}

	public Future<?> signupCustomerAsync(SignupCustomerRequest request, AsyncHandler<SignupCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class, asyncHandler);
	}
	
    	
	public GetAccountResponse getAccount(GetAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountResponse response = sendRequest(request, "/Account/Query", HttpPost, GetAccountResponse.class);
		
		return response;
	}

    public Response<GetAccountResponse> getAccountAsync(GetAccountRequest request) {
		return sendRequestAsync(request, "/Account/Query", HttpPost, GetAccountResponse.class, null);
	}

	public Future<?> getAccountAsync(GetAccountRequest request, AsyncHandler<GetAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account/Query", HttpPost, GetAccountResponse.class, asyncHandler);
	}
	
    	
	public GetCustomersInfoResponse getCustomersInfo(GetCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomersInfoResponse response = sendRequest(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class);
		
		return response;
	}

    public Response<GetCustomersInfoResponse> getCustomersInfoAsync(GetCustomersInfoRequest request) {
		return sendRequestAsync(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class, null);
	}

	public Future<?> getCustomersInfoAsync(GetCustomersInfoRequest request, AsyncHandler<GetCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class, asyncHandler);
	}
	
    	
	public DeleteAccountResponse deleteAccount(DeleteAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteAccountResponse response = sendRequest(request, "/Account", HttpDelete, DeleteAccountResponse.class);
		
		return response;
	}

    public Response<DeleteAccountResponse> deleteAccountAsync(DeleteAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpDelete, DeleteAccountResponse.class, null);
	}

	public Future<?> deleteAccountAsync(DeleteAccountRequest request, AsyncHandler<DeleteAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpDelete, DeleteAccountResponse.class, asyncHandler);
	}
	
    	
	public DeleteCustomerResponse deleteCustomer(DeleteCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteCustomerResponse response = sendRequest(request, "/Customer", HttpDelete, DeleteCustomerResponse.class);
		
		return response;
	}

    public Response<DeleteCustomerResponse> deleteCustomerAsync(DeleteCustomerRequest request) {
		return sendRequestAsync(request, "/Customer", HttpDelete, DeleteCustomerResponse.class, null);
	}

	public Future<?> deleteCustomerAsync(DeleteCustomerRequest request, AsyncHandler<DeleteCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer", HttpDelete, DeleteCustomerResponse.class, asyncHandler);
	}
	
    	
	public UpdateUserResponse updateUser(UpdateUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateUserResponse response = sendRequest(request, "/User", HttpPut, UpdateUserResponse.class);
		
		return response;
	}

    public Response<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
		return sendRequestAsync(request, "/User", HttpPut, UpdateUserResponse.class, null);
	}

	public Future<?> updateUserAsync(UpdateUserRequest request, AsyncHandler<UpdateUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User", HttpPut, UpdateUserResponse.class, asyncHandler);
	}
	
    	
	public UpdateUserRolesResponse updateUserRoles(UpdateUserRolesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateUserRolesResponse response = sendRequest(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class);
		
		return response;
	}

    public Response<UpdateUserRolesResponse> updateUserRolesAsync(UpdateUserRolesRequest request) {
		return sendRequestAsync(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class, null);
	}

	public Future<?> updateUserRolesAsync(UpdateUserRolesRequest request, AsyncHandler<UpdateUserRolesResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class, asyncHandler);
	}
	
    	
	public GetUserResponse getUser(GetUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUserResponse response = sendRequest(request, "/User/Query", HttpPost, GetUserResponse.class);
		
		return response;
	}

    public Response<GetUserResponse> getUserAsync(GetUserRequest request) {
		return sendRequestAsync(request, "/User/Query", HttpPost, GetUserResponse.class, null);
	}

	public Future<?> getUserAsync(GetUserRequest request, AsyncHandler<GetUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User/Query", HttpPost, GetUserResponse.class, asyncHandler);
	}
	
    	
	public GetCurrentUserResponse getCurrentUser(GetCurrentUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCurrentUserResponse response = sendRequest(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class);
		
		return response;
	}

    public Response<GetCurrentUserResponse> getCurrentUserAsync(GetCurrentUserRequest request) {
		return sendRequestAsync(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class, null);
	}

	public Future<?> getCurrentUserAsync(GetCurrentUserRequest request, AsyncHandler<GetCurrentUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class, asyncHandler);
	}
	
    	
	public DeleteUserResponse deleteUser(DeleteUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteUserResponse response = sendRequest(request, "/User", HttpDelete, DeleteUserResponse.class);
		
		return response;
	}

    public Response<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
		return sendRequestAsync(request, "/User", HttpDelete, DeleteUserResponse.class, null);
	}

	public Future<?> deleteUserAsync(DeleteUserRequest request, AsyncHandler<DeleteUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User", HttpDelete, DeleteUserResponse.class, asyncHandler);
	}
	
    	
	public GetUsersInfoResponse getUsersInfo(GetUsersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUsersInfoResponse response = sendRequest(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class);
		
		return response;
	}

    public Response<GetUsersInfoResponse> getUsersInfoAsync(GetUsersInfoRequest request) {
		return sendRequestAsync(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class, null);
	}

	public Future<?> getUsersInfoAsync(GetUsersInfoRequest request, AsyncHandler<GetUsersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class, asyncHandler);
	}
	
    	
	public GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(GetCustomerPilotFeaturesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomerPilotFeaturesResponse response = sendRequest(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class);
		
		return response;
	}

    public Response<GetCustomerPilotFeaturesResponse> getCustomerPilotFeaturesAsync(GetCustomerPilotFeaturesRequest request) {
		return sendRequestAsync(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class, null);
	}

	public Future<?> getCustomerPilotFeaturesAsync(GetCustomerPilotFeaturesRequest request, AsyncHandler<GetCustomerPilotFeaturesResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class, asyncHandler);
	}
	
    	
	public GetAccountPilotFeaturesResponse getAccountPilotFeatures(GetAccountPilotFeaturesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountPilotFeaturesResponse response = sendRequest(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class);
		
		return response;
	}

    public Response<GetAccountPilotFeaturesResponse> getAccountPilotFeaturesAsync(GetAccountPilotFeaturesRequest request) {
		return sendRequestAsync(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class, null);
	}

	public Future<?> getAccountPilotFeaturesAsync(GetAccountPilotFeaturesRequest request, AsyncHandler<GetAccountPilotFeaturesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class, asyncHandler);
	}
	
    	
	public GetPilotFeaturesCountriesResponse getPilotFeaturesCountries(GetPilotFeaturesCountriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetPilotFeaturesCountriesResponse response = sendRequest(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class);
		
		return response;
	}

    public Response<GetPilotFeaturesCountriesResponse> getPilotFeaturesCountriesAsync(GetPilotFeaturesCountriesRequest request) {
		return sendRequestAsync(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class, null);
	}

	public Future<?> getPilotFeaturesCountriesAsync(GetPilotFeaturesCountriesRequest request, AsyncHandler<GetPilotFeaturesCountriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class, asyncHandler);
	}
	
    	
	public GetAccessibleCustomerResponse getAccessibleCustomer(GetAccessibleCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccessibleCustomerResponse response = sendRequest(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class);
		
		return response;
	}

    public Response<GetAccessibleCustomerResponse> getAccessibleCustomerAsync(GetAccessibleCustomerRequest request) {
		return sendRequestAsync(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class, null);
	}

	public Future<?> getAccessibleCustomerAsync(GetAccessibleCustomerRequest request, AsyncHandler<GetAccessibleCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class, asyncHandler);
	}
	
    	
	public FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(FindAccountsOrCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		FindAccountsOrCustomersInfoResponse response = sendRequest(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class);
		
		return response;
	}

    public Response<FindAccountsOrCustomersInfoResponse> findAccountsOrCustomersInfoAsync(FindAccountsOrCustomersInfoRequest request) {
		return sendRequestAsync(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class, null);
	}

	public Future<?> findAccountsOrCustomersInfoAsync(FindAccountsOrCustomersInfoRequest request, AsyncHandler<FindAccountsOrCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class, asyncHandler);
	}
	
    	
	public UpgradeCustomerToAgencyResponse upgradeCustomerToAgency(UpgradeCustomerToAgencyRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpgradeCustomerToAgencyResponse response = sendRequest(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class);
		
		return response;
	}

    public Response<UpgradeCustomerToAgencyResponse> upgradeCustomerToAgencyAsync(UpgradeCustomerToAgencyRequest request) {
		return sendRequestAsync(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class, null);
	}

	public Future<?> upgradeCustomerToAgencyAsync(UpgradeCustomerToAgencyRequest request, AsyncHandler<UpgradeCustomerToAgencyResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class, asyncHandler);
	}
	
    	
	public AddPrepayAccountResponse addPrepayAccount(AddPrepayAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddPrepayAccountResponse response = sendRequest(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class);
		
		return response;
	}

    public Response<AddPrepayAccountResponse> addPrepayAccountAsync(AddPrepayAccountRequest request) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class, null);
	}

	public Future<?> addPrepayAccountAsync(AddPrepayAccountRequest request, AsyncHandler<AddPrepayAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class, asyncHandler);
	}
	
    	
	public UpdatePrepayAccountResponse updatePrepayAccount(UpdatePrepayAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdatePrepayAccountResponse response = sendRequest(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class);
		
		return response;
	}

    public Response<UpdatePrepayAccountResponse> updatePrepayAccountAsync(UpdatePrepayAccountRequest request) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class, null);
	}

	public Future<?> updatePrepayAccountAsync(UpdatePrepayAccountRequest request, AsyncHandler<UpdatePrepayAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class, asyncHandler);
	}
	
    	
	public MapCustomerIdToExternalCustomerIdResponse mapCustomerIdToExternalCustomerId(MapCustomerIdToExternalCustomerIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		MapCustomerIdToExternalCustomerIdResponse response = sendRequest(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class);
		
		return response;
	}

    public Response<MapCustomerIdToExternalCustomerIdResponse> mapCustomerIdToExternalCustomerIdAsync(MapCustomerIdToExternalCustomerIdRequest request) {
		return sendRequestAsync(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class, null);
	}

	public Future<?> mapCustomerIdToExternalCustomerIdAsync(MapCustomerIdToExternalCustomerIdRequest request, AsyncHandler<MapCustomerIdToExternalCustomerIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class, asyncHandler);
	}
	
    	
	public MapAccountIdToExternalAccountIdsResponse mapAccountIdToExternalAccountIds(MapAccountIdToExternalAccountIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		MapAccountIdToExternalAccountIdsResponse response = sendRequest(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class);
		
		return response;
	}

    public Response<MapAccountIdToExternalAccountIdsResponse> mapAccountIdToExternalAccountIdsAsync(MapAccountIdToExternalAccountIdsRequest request) {
		return sendRequestAsync(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class, null);
	}

	public Future<?> mapAccountIdToExternalAccountIdsAsync(MapAccountIdToExternalAccountIdsRequest request, AsyncHandler<MapAccountIdToExternalAccountIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class, asyncHandler);
	}
	
    	
	public SearchCustomersResponse searchCustomers(SearchCustomersRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchCustomersResponse response = sendRequest(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class);
		
		return response;
	}

    public Response<SearchCustomersResponse> searchCustomersAsync(SearchCustomersRequest request) {
		return sendRequestAsync(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class, null);
	}

	public Future<?> searchCustomersAsync(SearchCustomersRequest request, AsyncHandler<SearchCustomersResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class, asyncHandler);
	}
	
    	
	public AddClientLinksResponse addClientLinks(AddClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddClientLinksResponse response = sendRequest(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class);
		
		return response;
	}

    public Response<AddClientLinksResponse> addClientLinksAsync(AddClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class, null);
	}

	public Future<?> addClientLinksAsync(AddClientLinksRequest request, AsyncHandler<AddClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class, asyncHandler);
	}
	
    	
	public UpdateClientLinksResponse updateClientLinks(UpdateClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateClientLinksResponse response = sendRequest(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class);
		
		return response;
	}

    public Response<UpdateClientLinksResponse> updateClientLinksAsync(UpdateClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class, null);
	}

	public Future<?> updateClientLinksAsync(UpdateClientLinksRequest request, AsyncHandler<UpdateClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class, asyncHandler);
	}
	
    	
	public SearchClientLinksResponse searchClientLinks(SearchClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchClientLinksResponse response = sendRequest(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class);
		
		return response;
	}

    public Response<SearchClientLinksResponse> searchClientLinksAsync(SearchClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class, null);
	}

	public Future<?> searchClientLinksAsync(SearchClientLinksRequest request, AsyncHandler<SearchClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class, asyncHandler);
	}
	
    	
	public SearchAccountsResponse searchAccounts(SearchAccountsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchAccountsResponse response = sendRequest(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class);
		
		return response;
	}

    public Response<SearchAccountsResponse> searchAccountsAsync(SearchAccountsRequest request) {
		return sendRequestAsync(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class, null);
	}

	public Future<?> searchAccountsAsync(SearchAccountsRequest request, AsyncHandler<SearchAccountsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class, asyncHandler);
	}
	
    	
	public SendUserInvitationResponse sendUserInvitation(SendUserInvitationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SendUserInvitationResponse response = sendRequest(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class);
		
		return response;
	}

    public Response<SendUserInvitationResponse> sendUserInvitationAsync(SendUserInvitationRequest request) {
		return sendRequestAsync(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class, null);
	}

	public Future<?> sendUserInvitationAsync(SendUserInvitationRequest request, AsyncHandler<SendUserInvitationResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class, asyncHandler);
	}
	
    	
	public SearchUserInvitationsResponse searchUserInvitations(SearchUserInvitationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchUserInvitationsResponse response = sendRequest(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class);
		
		return response;
	}

    public Response<SearchUserInvitationsResponse> searchUserInvitationsAsync(SearchUserInvitationsRequest request) {
		return sendRequestAsync(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class, null);
	}

	public Future<?> searchUserInvitationsAsync(SearchUserInvitationsRequest request, AsyncHandler<SearchUserInvitationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class, asyncHandler);
	}
	
    	
	public ValidateAddressResponse validateAddress(ValidateAddressRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		ValidateAddressResponse response = sendRequest(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class);
		
		return response;
	}

    public Response<ValidateAddressResponse> validateAddressAsync(ValidateAddressRequest request) {
		return sendRequestAsync(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class, null);
	}

	public Future<?> validateAddressAsync(ValidateAddressRequest request, AsyncHandler<ValidateAddressResponse> asyncHandler) {
		return sendRequestAsync(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class, asyncHandler);
	}
	
    	
	public GetLinkedAccountsAndCustomersInfoResponse getLinkedAccountsAndCustomersInfo(GetLinkedAccountsAndCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetLinkedAccountsAndCustomersInfoResponse response = sendRequest(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class);
		
		return response;
	}

    public Response<GetLinkedAccountsAndCustomersInfoResponse> getLinkedAccountsAndCustomersInfoAsync(GetLinkedAccountsAndCustomersInfoRequest request) {
		return sendRequestAsync(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class, null);
	}

	public Future<?> getLinkedAccountsAndCustomersInfoAsync(GetLinkedAccountsAndCustomersInfoRequest request, AsyncHandler<GetLinkedAccountsAndCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class, asyncHandler);
	}
	
    	
	public GetUserMFAStatusResponse getUserMFAStatus(GetUserMFAStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUserMFAStatusResponse response = sendRequest(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class);
		
		return response;
	}

    public Response<GetUserMFAStatusResponse> getUserMFAStatusAsync(GetUserMFAStatusRequest request) {
		return sendRequestAsync(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class, null);
	}

	public Future<?> getUserMFAStatusAsync(GetUserMFAStatusRequest request, AsyncHandler<GetUserMFAStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class, asyncHandler);
	}
	
    	
	public GetNotificationsResponse getNotifications(GetNotificationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetNotificationsResponse response = sendRequest(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class);
		
		return response;
	}

    public Response<GetNotificationsResponse> getNotificationsAsync(GetNotificationsRequest request) {
		return sendRequestAsync(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class, null);
	}

	public Future<?> getNotificationsAsync(GetNotificationsRequest request, AsyncHandler<GetNotificationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class, asyncHandler);
	}
	
    	
	public DismissNotificationsResponse dismissNotifications(DismissNotificationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DismissNotificationsResponse response = sendRequest(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class);
		
		return response;
	}

    public Response<DismissNotificationsResponse> dismissNotificationsAsync(DismissNotificationsRequest request) {
		return sendRequestAsync(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class, null);
	}

	public Future<?> dismissNotificationsAsync(DismissNotificationsRequest request, AsyncHandler<DismissNotificationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class, asyncHandler);
	}
	
    }