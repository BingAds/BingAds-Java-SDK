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

	private Supplier<ICustomerManagementService> fallbackService;

	public CustomerManagementService(Map<String, String> headers, ApiEnvironment env, Supplier<ICustomerManagementService> fallbackService) {
        super(headers, env, ICustomerManagementService.class);

        this.fallbackService = fallbackService;
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

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, BiFunction<Req, AsyncHandler<Resp>, Future<?>> soapMethod, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), soapMethod, handler);
	}
		
	public GetAccountsInfoResponse getAccountsInfo(GetAccountsInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountsInfoResponse response = sendRequest(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccountsInfo(request);
		}
		
		return response;
	}

    public Response<GetAccountsInfoResponse> getAccountsInfoAsync(GetAccountsInfoRequest request) {
		return sendRequestAsync(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class, (r, h) -> fallbackService.get().getAccountsInfoAsync(r, h), null);
	}

	public Future<?> getAccountsInfoAsync(GetAccountsInfoRequest request, AsyncHandler<GetAccountsInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountsInfo/Query", HttpPost, GetAccountsInfoResponse.class, (r, h) -> fallbackService.get().getAccountsInfoAsync(r, h), asyncHandler);
	}
	
    	
	public FindAccountsResponse findAccounts(FindAccountsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		FindAccountsResponse response = sendRequest(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().findAccounts(request);
		}
		
		return response;
	}

    public Response<FindAccountsResponse> findAccountsAsync(FindAccountsRequest request) {
		return sendRequestAsync(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class, (r, h) -> fallbackService.get().findAccountsAsync(r, h), null);
	}

	public Future<?> findAccountsAsync(FindAccountsRequest request, AsyncHandler<FindAccountsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Accounts/Find", HttpPost, FindAccountsResponse.class, (r, h) -> fallbackService.get().findAccountsAsync(r, h), asyncHandler);
	}
	
    	
	public AddAccountResponse addAccount(AddAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddAccountResponse response = sendRequest(request, "/Account", HttpPost, AddAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAccount(request);
		}
		
		return response;
	}

    public Response<AddAccountResponse> addAccountAsync(AddAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpPost, AddAccountResponse.class, (r, h) -> fallbackService.get().addAccountAsync(r, h), null);
	}

	public Future<?> addAccountAsync(AddAccountRequest request, AsyncHandler<AddAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpPost, AddAccountResponse.class, (r, h) -> fallbackService.get().addAccountAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAccountResponse updateAccount(UpdateAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateAccountResponse response = sendRequest(request, "/Account", HttpPut, UpdateAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAccount(request);
		}
		
		return response;
	}

    public Response<UpdateAccountResponse> updateAccountAsync(UpdateAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpPut, UpdateAccountResponse.class, (r, h) -> fallbackService.get().updateAccountAsync(r, h), null);
	}

	public Future<?> updateAccountAsync(UpdateAccountRequest request, AsyncHandler<UpdateAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpPut, UpdateAccountResponse.class, (r, h) -> fallbackService.get().updateAccountAsync(r, h), asyncHandler);
	}
	
    	
	public GetCustomerResponse getCustomer(GetCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomerResponse response = sendRequest(request, "/Customer/Query", HttpPost, GetCustomerResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCustomer(request);
		}
		
		return response;
	}

    public Response<GetCustomerResponse> getCustomerAsync(GetCustomerRequest request) {
		return sendRequestAsync(request, "/Customer/Query", HttpPost, GetCustomerResponse.class, (r, h) -> fallbackService.get().getCustomerAsync(r, h), null);
	}

	public Future<?> getCustomerAsync(GetCustomerRequest request, AsyncHandler<GetCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/Query", HttpPost, GetCustomerResponse.class, (r, h) -> fallbackService.get().getCustomerAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateCustomerResponse response = sendRequest(request, "/Customer", HttpPut, UpdateCustomerResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateCustomer(request);
		}
		
		return response;
	}

    public Response<UpdateCustomerResponse> updateCustomerAsync(UpdateCustomerRequest request) {
		return sendRequestAsync(request, "/Customer", HttpPut, UpdateCustomerResponse.class, (r, h) -> fallbackService.get().updateCustomerAsync(r, h), null);
	}

	public Future<?> updateCustomerAsync(UpdateCustomerRequest request, AsyncHandler<UpdateCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer", HttpPut, UpdateCustomerResponse.class, (r, h) -> fallbackService.get().updateCustomerAsync(r, h), asyncHandler);
	}
	
    	
	public SignupCustomerResponse signupCustomer(SignupCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SignupCustomerResponse response = sendRequest(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class);
		
		if (response == null) {
			response = fallbackService.get().signupCustomer(request);
		}
		
		return response;
	}

    public Response<SignupCustomerResponse> signupCustomerAsync(SignupCustomerRequest request) {
		return sendRequestAsync(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class, (r, h) -> fallbackService.get().signupCustomerAsync(r, h), null);
	}

	public Future<?> signupCustomerAsync(SignupCustomerRequest request, AsyncHandler<SignupCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/Signup", HttpPost, SignupCustomerResponse.class, (r, h) -> fallbackService.get().signupCustomerAsync(r, h), asyncHandler);
	}
	
    	
	public GetAccountResponse getAccount(GetAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountResponse response = sendRequest(request, "/Account/Query", HttpPost, GetAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccount(request);
		}
		
		return response;
	}

    public Response<GetAccountResponse> getAccountAsync(GetAccountRequest request) {
		return sendRequestAsync(request, "/Account/Query", HttpPost, GetAccountResponse.class, (r, h) -> fallbackService.get().getAccountAsync(r, h), null);
	}

	public Future<?> getAccountAsync(GetAccountRequest request, AsyncHandler<GetAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account/Query", HttpPost, GetAccountResponse.class, (r, h) -> fallbackService.get().getAccountAsync(r, h), asyncHandler);
	}
	
    	
	public GetCustomersInfoResponse getCustomersInfo(GetCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomersInfoResponse response = sendRequest(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCustomersInfo(request);
		}
		
		return response;
	}

    public Response<GetCustomersInfoResponse> getCustomersInfoAsync(GetCustomersInfoRequest request) {
		return sendRequestAsync(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class, (r, h) -> fallbackService.get().getCustomersInfoAsync(r, h), null);
	}

	public Future<?> getCustomersInfoAsync(GetCustomersInfoRequest request, AsyncHandler<GetCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomersInfo/Query", HttpPost, GetCustomersInfoResponse.class, (r, h) -> fallbackService.get().getCustomersInfoAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAccountResponse deleteAccount(DeleteAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteAccountResponse response = sendRequest(request, "/Account", HttpDelete, DeleteAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAccount(request);
		}
		
		return response;
	}

    public Response<DeleteAccountResponse> deleteAccountAsync(DeleteAccountRequest request) {
		return sendRequestAsync(request, "/Account", HttpDelete, DeleteAccountResponse.class, (r, h) -> fallbackService.get().deleteAccountAsync(r, h), null);
	}

	public Future<?> deleteAccountAsync(DeleteAccountRequest request, AsyncHandler<DeleteAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/Account", HttpDelete, DeleteAccountResponse.class, (r, h) -> fallbackService.get().deleteAccountAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteCustomerResponse deleteCustomer(DeleteCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteCustomerResponse response = sendRequest(request, "/Customer", HttpDelete, DeleteCustomerResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteCustomer(request);
		}
		
		return response;
	}

    public Response<DeleteCustomerResponse> deleteCustomerAsync(DeleteCustomerRequest request) {
		return sendRequestAsync(request, "/Customer", HttpDelete, DeleteCustomerResponse.class, (r, h) -> fallbackService.get().deleteCustomerAsync(r, h), null);
	}

	public Future<?> deleteCustomerAsync(DeleteCustomerRequest request, AsyncHandler<DeleteCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer", HttpDelete, DeleteCustomerResponse.class, (r, h) -> fallbackService.get().deleteCustomerAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateUserResponse updateUser(UpdateUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateUserResponse response = sendRequest(request, "/User", HttpPut, UpdateUserResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateUser(request);
		}
		
		return response;
	}

    public Response<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
		return sendRequestAsync(request, "/User", HttpPut, UpdateUserResponse.class, (r, h) -> fallbackService.get().updateUserAsync(r, h), null);
	}

	public Future<?> updateUserAsync(UpdateUserRequest request, AsyncHandler<UpdateUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User", HttpPut, UpdateUserResponse.class, (r, h) -> fallbackService.get().updateUserAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateUserRolesResponse updateUserRoles(UpdateUserRolesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateUserRolesResponse response = sendRequest(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateUserRoles(request);
		}
		
		return response;
	}

    public Response<UpdateUserRolesResponse> updateUserRolesAsync(UpdateUserRolesRequest request) {
		return sendRequestAsync(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class, (r, h) -> fallbackService.get().updateUserRolesAsync(r, h), null);
	}

	public Future<?> updateUserRolesAsync(UpdateUserRolesRequest request, AsyncHandler<UpdateUserRolesResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserRoles", HttpPut, UpdateUserRolesResponse.class, (r, h) -> fallbackService.get().updateUserRolesAsync(r, h), asyncHandler);
	}
	
    	
	public GetUserResponse getUser(GetUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUserResponse response = sendRequest(request, "/User/Query", HttpPost, GetUserResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getUser(request);
		}
		
		return response;
	}

    public Response<GetUserResponse> getUserAsync(GetUserRequest request) {
		return sendRequestAsync(request, "/User/Query", HttpPost, GetUserResponse.class, (r, h) -> fallbackService.get().getUserAsync(r, h), null);
	}

	public Future<?> getUserAsync(GetUserRequest request, AsyncHandler<GetUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User/Query", HttpPost, GetUserResponse.class, (r, h) -> fallbackService.get().getUserAsync(r, h), asyncHandler);
	}
	
    	
	public GetCurrentUserResponse getCurrentUser(GetCurrentUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCurrentUserResponse response = sendRequest(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCurrentUser(request);
		}
		
		return response;
	}

    public Response<GetCurrentUserResponse> getCurrentUserAsync(GetCurrentUserRequest request) {
		return sendRequestAsync(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class, (r, h) -> fallbackService.get().getCurrentUserAsync(r, h), null);
	}

	public Future<?> getCurrentUserAsync(GetCurrentUserRequest request, AsyncHandler<GetCurrentUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/CurrentUser/Query", HttpPost, GetCurrentUserResponse.class, (r, h) -> fallbackService.get().getCurrentUserAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteUserResponse deleteUser(DeleteUserRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DeleteUserResponse response = sendRequest(request, "/User", HttpDelete, DeleteUserResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteUser(request);
		}
		
		return response;
	}

    public Response<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
		return sendRequestAsync(request, "/User", HttpDelete, DeleteUserResponse.class, (r, h) -> fallbackService.get().deleteUserAsync(r, h), null);
	}

	public Future<?> deleteUserAsync(DeleteUserRequest request, AsyncHandler<DeleteUserResponse> asyncHandler) {
		return sendRequestAsync(request, "/User", HttpDelete, DeleteUserResponse.class, (r, h) -> fallbackService.get().deleteUserAsync(r, h), asyncHandler);
	}
	
    	
	public GetUsersInfoResponse getUsersInfo(GetUsersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUsersInfoResponse response = sendRequest(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getUsersInfo(request);
		}
		
		return response;
	}

    public Response<GetUsersInfoResponse> getUsersInfoAsync(GetUsersInfoRequest request) {
		return sendRequestAsync(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class, (r, h) -> fallbackService.get().getUsersInfoAsync(r, h), null);
	}

	public Future<?> getUsersInfoAsync(GetUsersInfoRequest request, AsyncHandler<GetUsersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/UsersInfo/Query", HttpPost, GetUsersInfoResponse.class, (r, h) -> fallbackService.get().getUsersInfoAsync(r, h), asyncHandler);
	}
	
    	
	public GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(GetCustomerPilotFeaturesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCustomerPilotFeaturesResponse response = sendRequest(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCustomerPilotFeatures(request);
		}
		
		return response;
	}

    public Response<GetCustomerPilotFeaturesResponse> getCustomerPilotFeaturesAsync(GetCustomerPilotFeaturesRequest request) {
		return sendRequestAsync(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class, (r, h) -> fallbackService.get().getCustomerPilotFeaturesAsync(r, h), null);
	}

	public Future<?> getCustomerPilotFeaturesAsync(GetCustomerPilotFeaturesRequest request, AsyncHandler<GetCustomerPilotFeaturesResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerPilotFeatures/Query", HttpPost, GetCustomerPilotFeaturesResponse.class, (r, h) -> fallbackService.get().getCustomerPilotFeaturesAsync(r, h), asyncHandler);
	}
	
    	
	public GetAccountPilotFeaturesResponse getAccountPilotFeatures(GetAccountPilotFeaturesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountPilotFeaturesResponse response = sendRequest(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccountPilotFeatures(request);
		}
		
		return response;
	}

    public Response<GetAccountPilotFeaturesResponse> getAccountPilotFeaturesAsync(GetAccountPilotFeaturesRequest request) {
		return sendRequestAsync(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class, (r, h) -> fallbackService.get().getAccountPilotFeaturesAsync(r, h), null);
	}

	public Future<?> getAccountPilotFeaturesAsync(GetAccountPilotFeaturesRequest request, AsyncHandler<GetAccountPilotFeaturesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountPilotFeatures/Query", HttpPost, GetAccountPilotFeaturesResponse.class, (r, h) -> fallbackService.get().getAccountPilotFeaturesAsync(r, h), asyncHandler);
	}
	
    	
	public GetPilotFeaturesCountriesResponse getPilotFeaturesCountries(GetPilotFeaturesCountriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetPilotFeaturesCountriesResponse response = sendRequest(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getPilotFeaturesCountries(request);
		}
		
		return response;
	}

    public Response<GetPilotFeaturesCountriesResponse> getPilotFeaturesCountriesAsync(GetPilotFeaturesCountriesRequest request) {
		return sendRequestAsync(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class, (r, h) -> fallbackService.get().getPilotFeaturesCountriesAsync(r, h), null);
	}

	public Future<?> getPilotFeaturesCountriesAsync(GetPilotFeaturesCountriesRequest request, AsyncHandler<GetPilotFeaturesCountriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/PilotFeaturesCountries/Query", HttpPost, GetPilotFeaturesCountriesResponse.class, (r, h) -> fallbackService.get().getPilotFeaturesCountriesAsync(r, h), asyncHandler);
	}
	
    	
	public GetAccessibleCustomerResponse getAccessibleCustomer(GetAccessibleCustomerRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccessibleCustomerResponse response = sendRequest(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccessibleCustomer(request);
		}
		
		return response;
	}

    public Response<GetAccessibleCustomerResponse> getAccessibleCustomerAsync(GetAccessibleCustomerRequest request) {
		return sendRequestAsync(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class, (r, h) -> fallbackService.get().getAccessibleCustomerAsync(r, h), null);
	}

	public Future<?> getAccessibleCustomerAsync(GetAccessibleCustomerRequest request, AsyncHandler<GetAccessibleCustomerResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccessibleCustomer/Query", HttpPost, GetAccessibleCustomerResponse.class, (r, h) -> fallbackService.get().getAccessibleCustomerAsync(r, h), asyncHandler);
	}
	
    	
	public FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(FindAccountsOrCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		FindAccountsOrCustomersInfoResponse response = sendRequest(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class);
		
		if (response == null) {
			response = fallbackService.get().findAccountsOrCustomersInfo(request);
		}
		
		return response;
	}

    public Response<FindAccountsOrCustomersInfoResponse> findAccountsOrCustomersInfoAsync(FindAccountsOrCustomersInfoRequest request) {
		return sendRequestAsync(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class, (r, h) -> fallbackService.get().findAccountsOrCustomersInfoAsync(r, h), null);
	}

	public Future<?> findAccountsOrCustomersInfoAsync(FindAccountsOrCustomersInfoRequest request, AsyncHandler<FindAccountsOrCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountsOrCustomersInfo/Find", HttpPost, FindAccountsOrCustomersInfoResponse.class, (r, h) -> fallbackService.get().findAccountsOrCustomersInfoAsync(r, h), asyncHandler);
	}
	
    	
	public UpgradeCustomerToAgencyResponse upgradeCustomerToAgency(UpgradeCustomerToAgencyRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpgradeCustomerToAgencyResponse response = sendRequest(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class);
		
		if (response == null) {
			response = fallbackService.get().upgradeCustomerToAgency(request);
		}
		
		return response;
	}

    public Response<UpgradeCustomerToAgencyResponse> upgradeCustomerToAgencyAsync(UpgradeCustomerToAgencyRequest request) {
		return sendRequestAsync(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class, (r, h) -> fallbackService.get().upgradeCustomerToAgencyAsync(r, h), null);
	}

	public Future<?> upgradeCustomerToAgencyAsync(UpgradeCustomerToAgencyRequest request, AsyncHandler<UpgradeCustomerToAgencyResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customer/UpgradeToAgency", HttpPost, UpgradeCustomerToAgencyResponse.class, (r, h) -> fallbackService.get().upgradeCustomerToAgencyAsync(r, h), asyncHandler);
	}
	
    	
	public AddPrepayAccountResponse addPrepayAccount(AddPrepayAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddPrepayAccountResponse response = sendRequest(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addPrepayAccount(request);
		}
		
		return response;
	}

    public Response<AddPrepayAccountResponse> addPrepayAccountAsync(AddPrepayAccountRequest request) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class, (r, h) -> fallbackService.get().addPrepayAccountAsync(r, h), null);
	}

	public Future<?> addPrepayAccountAsync(AddPrepayAccountRequest request, AsyncHandler<AddPrepayAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPost, AddPrepayAccountResponse.class, (r, h) -> fallbackService.get().addPrepayAccountAsync(r, h), asyncHandler);
	}
	
    	
	public UpdatePrepayAccountResponse updatePrepayAccount(UpdatePrepayAccountRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdatePrepayAccountResponse response = sendRequest(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updatePrepayAccount(request);
		}
		
		return response;
	}

    public Response<UpdatePrepayAccountResponse> updatePrepayAccountAsync(UpdatePrepayAccountRequest request) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class, (r, h) -> fallbackService.get().updatePrepayAccountAsync(r, h), null);
	}

	public Future<?> updatePrepayAccountAsync(UpdatePrepayAccountRequest request, AsyncHandler<UpdatePrepayAccountResponse> asyncHandler) {
		return sendRequestAsync(request, "/PrepayAccount", HttpPut, UpdatePrepayAccountResponse.class, (r, h) -> fallbackService.get().updatePrepayAccountAsync(r, h), asyncHandler);
	}
	
    	
	public MapCustomerIdToExternalCustomerIdResponse mapCustomerIdToExternalCustomerId(MapCustomerIdToExternalCustomerIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		MapCustomerIdToExternalCustomerIdResponse response = sendRequest(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().mapCustomerIdToExternalCustomerId(request);
		}
		
		return response;
	}

    public Response<MapCustomerIdToExternalCustomerIdResponse> mapCustomerIdToExternalCustomerIdAsync(MapCustomerIdToExternalCustomerIdRequest request) {
		return sendRequestAsync(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class, (r, h) -> fallbackService.get().mapCustomerIdToExternalCustomerIdAsync(r, h), null);
	}

	public Future<?> mapCustomerIdToExternalCustomerIdAsync(MapCustomerIdToExternalCustomerIdRequest request, AsyncHandler<MapCustomerIdToExternalCustomerIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerId/MapToExternalCustomerId", HttpPost, MapCustomerIdToExternalCustomerIdResponse.class, (r, h) -> fallbackService.get().mapCustomerIdToExternalCustomerIdAsync(r, h), asyncHandler);
	}
	
    	
	public MapAccountIdToExternalAccountIdsResponse mapAccountIdToExternalAccountIds(MapAccountIdToExternalAccountIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		MapAccountIdToExternalAccountIdsResponse response = sendRequest(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().mapAccountIdToExternalAccountIds(request);
		}
		
		return response;
	}

    public Response<MapAccountIdToExternalAccountIdsResponse> mapAccountIdToExternalAccountIdsAsync(MapAccountIdToExternalAccountIdsRequest request) {
		return sendRequestAsync(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class, (r, h) -> fallbackService.get().mapAccountIdToExternalAccountIdsAsync(r, h), null);
	}

	public Future<?> mapAccountIdToExternalAccountIdsAsync(MapAccountIdToExternalAccountIdsRequest request, AsyncHandler<MapAccountIdToExternalAccountIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountId/MapToExternalAccountIds", HttpPost, MapAccountIdToExternalAccountIdsResponse.class, (r, h) -> fallbackService.get().mapAccountIdToExternalAccountIdsAsync(r, h), asyncHandler);
	}
	
    	
	public SearchCustomersResponse searchCustomers(SearchCustomersRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchCustomersResponse response = sendRequest(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class);
		
		if (response == null) {
			response = fallbackService.get().searchCustomers(request);
		}
		
		return response;
	}

    public Response<SearchCustomersResponse> searchCustomersAsync(SearchCustomersRequest request) {
		return sendRequestAsync(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class, (r, h) -> fallbackService.get().searchCustomersAsync(r, h), null);
	}

	public Future<?> searchCustomersAsync(SearchCustomersRequest request, AsyncHandler<SearchCustomersResponse> asyncHandler) {
		return sendRequestAsync(request, "/Customers/Search", HttpPost, SearchCustomersResponse.class, (r, h) -> fallbackService.get().searchCustomersAsync(r, h), asyncHandler);
	}
	
    	
	public AddClientLinksResponse addClientLinks(AddClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddClientLinksResponse response = sendRequest(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addClientLinks(request);
		}
		
		return response;
	}

    public Response<AddClientLinksResponse> addClientLinksAsync(AddClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class, (r, h) -> fallbackService.get().addClientLinksAsync(r, h), null);
	}

	public Future<?> addClientLinksAsync(AddClientLinksRequest request, AsyncHandler<AddClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks", HttpPost, AddClientLinksResponse.class, (r, h) -> fallbackService.get().addClientLinksAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateClientLinksResponse updateClientLinks(UpdateClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateClientLinksResponse response = sendRequest(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateClientLinks(request);
		}
		
		return response;
	}

    public Response<UpdateClientLinksResponse> updateClientLinksAsync(UpdateClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class, (r, h) -> fallbackService.get().updateClientLinksAsync(r, h), null);
	}

	public Future<?> updateClientLinksAsync(UpdateClientLinksRequest request, AsyncHandler<UpdateClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks", HttpPut, UpdateClientLinksResponse.class, (r, h) -> fallbackService.get().updateClientLinksAsync(r, h), asyncHandler);
	}
	
    	
	public SearchClientLinksResponse searchClientLinks(SearchClientLinksRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchClientLinksResponse response = sendRequest(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class);
		
		if (response == null) {
			response = fallbackService.get().searchClientLinks(request);
		}
		
		return response;
	}

    public Response<SearchClientLinksResponse> searchClientLinksAsync(SearchClientLinksRequest request) {
		return sendRequestAsync(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class, (r, h) -> fallbackService.get().searchClientLinksAsync(r, h), null);
	}

	public Future<?> searchClientLinksAsync(SearchClientLinksRequest request, AsyncHandler<SearchClientLinksResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClientLinks/Search", HttpPost, SearchClientLinksResponse.class, (r, h) -> fallbackService.get().searchClientLinksAsync(r, h), asyncHandler);
	}
	
    	
	public SearchAccountsResponse searchAccounts(SearchAccountsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchAccountsResponse response = sendRequest(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().searchAccounts(request);
		}
		
		return response;
	}

    public Response<SearchAccountsResponse> searchAccountsAsync(SearchAccountsRequest request) {
		return sendRequestAsync(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class, (r, h) -> fallbackService.get().searchAccountsAsync(r, h), null);
	}

	public Future<?> searchAccountsAsync(SearchAccountsRequest request, AsyncHandler<SearchAccountsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Accounts/Search", HttpPost, SearchAccountsResponse.class, (r, h) -> fallbackService.get().searchAccountsAsync(r, h), asyncHandler);
	}
	
    	
	public SendUserInvitationResponse sendUserInvitation(SendUserInvitationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SendUserInvitationResponse response = sendRequest(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class);
		
		if (response == null) {
			response = fallbackService.get().sendUserInvitation(request);
		}
		
		return response;
	}

    public Response<SendUserInvitationResponse> sendUserInvitationAsync(SendUserInvitationRequest request) {
		return sendRequestAsync(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class, (r, h) -> fallbackService.get().sendUserInvitationAsync(r, h), null);
	}

	public Future<?> sendUserInvitationAsync(SendUserInvitationRequest request, AsyncHandler<SendUserInvitationResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserInvitation/Send", HttpPost, SendUserInvitationResponse.class, (r, h) -> fallbackService.get().sendUserInvitationAsync(r, h), asyncHandler);
	}
	
    	
	public SearchUserInvitationsResponse searchUserInvitations(SearchUserInvitationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchUserInvitationsResponse response = sendRequest(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().searchUserInvitations(request);
		}
		
		return response;
	}

    public Response<SearchUserInvitationsResponse> searchUserInvitationsAsync(SearchUserInvitationsRequest request) {
		return sendRequestAsync(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class, (r, h) -> fallbackService.get().searchUserInvitationsAsync(r, h), null);
	}

	public Future<?> searchUserInvitationsAsync(SearchUserInvitationsRequest request, AsyncHandler<SearchUserInvitationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserInvitations/Search", HttpPost, SearchUserInvitationsResponse.class, (r, h) -> fallbackService.get().searchUserInvitationsAsync(r, h), asyncHandler);
	}
	
    	
	public ValidateAddressResponse validateAddress(ValidateAddressRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		ValidateAddressResponse response = sendRequest(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class);
		
		if (response == null) {
			response = fallbackService.get().validateAddress(request);
		}
		
		return response;
	}

    public Response<ValidateAddressResponse> validateAddressAsync(ValidateAddressRequest request) {
		return sendRequestAsync(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class, (r, h) -> fallbackService.get().validateAddressAsync(r, h), null);
	}

	public Future<?> validateAddressAsync(ValidateAddressRequest request, AsyncHandler<ValidateAddressResponse> asyncHandler) {
		return sendRequestAsync(request, "/Address/Validate", HttpPost, ValidateAddressResponse.class, (r, h) -> fallbackService.get().validateAddressAsync(r, h), asyncHandler);
	}
	
    	
	public GetLinkedAccountsAndCustomersInfoResponse getLinkedAccountsAndCustomersInfo(GetLinkedAccountsAndCustomersInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetLinkedAccountsAndCustomersInfoResponse response = sendRequest(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getLinkedAccountsAndCustomersInfo(request);
		}
		
		return response;
	}

    public Response<GetLinkedAccountsAndCustomersInfoResponse> getLinkedAccountsAndCustomersInfoAsync(GetLinkedAccountsAndCustomersInfoRequest request) {
		return sendRequestAsync(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class, (r, h) -> fallbackService.get().getLinkedAccountsAndCustomersInfoAsync(r, h), null);
	}

	public Future<?> getLinkedAccountsAndCustomersInfoAsync(GetLinkedAccountsAndCustomersInfoRequest request, AsyncHandler<GetLinkedAccountsAndCustomersInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/LinkedAccountsAndCustomersInfo/Query", HttpPost, GetLinkedAccountsAndCustomersInfoResponse.class, (r, h) -> fallbackService.get().getLinkedAccountsAndCustomersInfoAsync(r, h), asyncHandler);
	}
	
    	
	public GetUserMFAStatusResponse getUserMFAStatus(GetUserMFAStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetUserMFAStatusResponse response = sendRequest(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getUserMFAStatus(request);
		}
		
		return response;
	}

    public Response<GetUserMFAStatusResponse> getUserMFAStatusAsync(GetUserMFAStatusRequest request) {
		return sendRequestAsync(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class, (r, h) -> fallbackService.get().getUserMFAStatusAsync(r, h), null);
	}

	public Future<?> getUserMFAStatusAsync(GetUserMFAStatusRequest request, AsyncHandler<GetUserMFAStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/UserMFAStatus/Query", HttpPost, GetUserMFAStatusResponse.class, (r, h) -> fallbackService.get().getUserMFAStatusAsync(r, h), asyncHandler);
	}
	
    	
	public GetNotificationsResponse getNotifications(GetNotificationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetNotificationsResponse response = sendRequest(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getNotifications(request);
		}
		
		return response;
	}

    public Response<GetNotificationsResponse> getNotificationsAsync(GetNotificationsRequest request) {
		return sendRequestAsync(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class, (r, h) -> fallbackService.get().getNotificationsAsync(r, h), null);
	}

	public Future<?> getNotificationsAsync(GetNotificationsRequest request, AsyncHandler<GetNotificationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Notifications/Query", HttpPost, GetNotificationsResponse.class, (r, h) -> fallbackService.get().getNotificationsAsync(r, h), asyncHandler);
	}
	
    	
	public DismissNotificationsResponse dismissNotifications(DismissNotificationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DismissNotificationsResponse response = sendRequest(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().dismissNotifications(request);
		}
		
		return response;
	}

    public Response<DismissNotificationsResponse> dismissNotificationsAsync(DismissNotificationsRequest request) {
		return sendRequestAsync(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class, (r, h) -> fallbackService.get().dismissNotificationsAsync(r, h), null);
	}

	public Future<?> dismissNotificationsAsync(DismissNotificationsRequest request, AsyncHandler<DismissNotificationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Notifications/Dismiss", HttpPost, DismissNotificationsResponse.class, (r, h) -> fallbackService.get().dismissNotificationsAsync(r, h), asyncHandler);
	}
	
    }