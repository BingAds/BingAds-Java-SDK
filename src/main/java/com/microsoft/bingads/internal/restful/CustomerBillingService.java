package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.customerbilling.*;

public class CustomerBillingService extends RestfulServiceClient implements ICustomerBillingService {

	public CustomerBillingService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env, ICustomerBillingService.class);

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

	Exception processFaultDetailApiBatchFault(ApplicationFault faultDetail, boolean shouldThrow) 
			throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception {
		String message = getFaultMessage(faultDetail.getTrackingId());

		if (faultDetail instanceof AdApiFaultDetail) {
			AdApiFaultDetail_Exception ex = new AdApiFaultDetail_Exception(message, (AdApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (faultDetail instanceof ApiBatchFault) {
			ApiBatchFault_Exception ex = new ApiBatchFault_Exception(message, (ApiBatchFault)faultDetail);
			
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

	protected <Req, Resp> Resp sendRequestApiBatchFault(Req request, String entityEndpoint, String verb, Class<Resp> respClass)
			throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception {
		ResponseInfo<Resp, ApplicationFault> responseInfo = getResponseInfo(request, entityEndpoint, verb, respClass, ApplicationFault.class);

		if (responseInfo == null) {
			return null;
		}

		ApplicationFault faultDetail = responseInfo.getFaultDetail();

		if (faultDetail != null) {
			processFaultDetailApiBatchFault(faultDetail, true);
		}

		return responseInfo.getResponse();
	}

	private Exception getFaultException(ApplicationFault faultDetail) {
		try {
			Exception ex = processFaultDetail(faultDetail, false);

			if (ex == null) {
				ex = processFaultDetailApiBatchFault(faultDetail, false);
			}

			return ex;
		} catch (Exception ex) {
			throw new InternalException(ex);
		}
	}

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), handler);
	}
		
	public GetBillingDocumentsInfoResponse getBillingDocumentsInfo(GetBillingDocumentsInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception {
		GetBillingDocumentsInfoResponse response = sendRequestApiBatchFault(request, "/BillingDocumentsInfo/Query", HttpPost, GetBillingDocumentsInfoResponse.class);
		
		return response;
	}

    public Response<GetBillingDocumentsInfoResponse> getBillingDocumentsInfoAsync(GetBillingDocumentsInfoRequest request) {
		return sendRequestAsync(request, "/BillingDocumentsInfo/Query", HttpPost, GetBillingDocumentsInfoResponse.class, null);
	}

	public Future<?> getBillingDocumentsInfoAsync(GetBillingDocumentsInfoRequest request, AsyncHandler<GetBillingDocumentsInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/BillingDocumentsInfo/Query", HttpPost, GetBillingDocumentsInfoResponse.class, asyncHandler);
	}
	
    	
	public GetBillingDocumentsResponse getBillingDocuments(GetBillingDocumentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception {
		GetBillingDocumentsResponse response = sendRequestApiBatchFault(request, "/BillingDocuments/Query", HttpPost, GetBillingDocumentsResponse.class);
		
		return response;
	}

    public Response<GetBillingDocumentsResponse> getBillingDocumentsAsync(GetBillingDocumentsRequest request) {
		return sendRequestAsync(request, "/BillingDocuments/Query", HttpPost, GetBillingDocumentsResponse.class, null);
	}

	public Future<?> getBillingDocumentsAsync(GetBillingDocumentsRequest request, AsyncHandler<GetBillingDocumentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BillingDocuments/Query", HttpPost, GetBillingDocumentsResponse.class, asyncHandler);
	}
	
    	
	public AddInsertionOrderResponse addInsertionOrder(AddInsertionOrderRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		AddInsertionOrderResponse response = sendRequest(request, "/InsertionOrder", HttpPost, AddInsertionOrderResponse.class);
		
		return response;
	}

    public Response<AddInsertionOrderResponse> addInsertionOrderAsync(AddInsertionOrderRequest request) {
		return sendRequestAsync(request, "/InsertionOrder", HttpPost, AddInsertionOrderResponse.class, null);
	}

	public Future<?> addInsertionOrderAsync(AddInsertionOrderRequest request, AsyncHandler<AddInsertionOrderResponse> asyncHandler) {
		return sendRequestAsync(request, "/InsertionOrder", HttpPost, AddInsertionOrderResponse.class, asyncHandler);
	}
	
    	
	public UpdateInsertionOrderResponse updateInsertionOrder(UpdateInsertionOrderRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		UpdateInsertionOrderResponse response = sendRequest(request, "/InsertionOrder", HttpPut, UpdateInsertionOrderResponse.class);
		
		return response;
	}

    public Response<UpdateInsertionOrderResponse> updateInsertionOrderAsync(UpdateInsertionOrderRequest request) {
		return sendRequestAsync(request, "/InsertionOrder", HttpPut, UpdateInsertionOrderResponse.class, null);
	}

	public Future<?> updateInsertionOrderAsync(UpdateInsertionOrderRequest request, AsyncHandler<UpdateInsertionOrderResponse> asyncHandler) {
		return sendRequestAsync(request, "/InsertionOrder", HttpPut, UpdateInsertionOrderResponse.class, asyncHandler);
	}
	
    	
	public SearchInsertionOrdersResponse searchInsertionOrders(SearchInsertionOrdersRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchInsertionOrdersResponse response = sendRequest(request, "/InsertionOrders/Search", HttpPost, SearchInsertionOrdersResponse.class);
		
		return response;
	}

    public Response<SearchInsertionOrdersResponse> searchInsertionOrdersAsync(SearchInsertionOrdersRequest request) {
		return sendRequestAsync(request, "/InsertionOrders/Search", HttpPost, SearchInsertionOrdersResponse.class, null);
	}

	public Future<?> searchInsertionOrdersAsync(SearchInsertionOrdersRequest request, AsyncHandler<SearchInsertionOrdersResponse> asyncHandler) {
		return sendRequestAsync(request, "/InsertionOrders/Search", HttpPost, SearchInsertionOrdersResponse.class, asyncHandler);
	}
	
    	
	public GetAccountMonthlySpendResponse getAccountMonthlySpend(GetAccountMonthlySpendRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetAccountMonthlySpendResponse response = sendRequest(request, "/AccountMonthlySpend/Query", HttpPost, GetAccountMonthlySpendResponse.class);
		
		return response;
	}

    public Response<GetAccountMonthlySpendResponse> getAccountMonthlySpendAsync(GetAccountMonthlySpendRequest request) {
		return sendRequestAsync(request, "/AccountMonthlySpend/Query", HttpPost, GetAccountMonthlySpendResponse.class, null);
	}

	public Future<?> getAccountMonthlySpendAsync(GetAccountMonthlySpendRequest request, AsyncHandler<GetAccountMonthlySpendResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountMonthlySpend/Query", HttpPost, GetAccountMonthlySpendResponse.class, asyncHandler);
	}
	
    	
	public DispatchCouponsResponse dispatchCoupons(DispatchCouponsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		DispatchCouponsResponse response = sendRequest(request, "/Coupons/Dispatch", HttpPost, DispatchCouponsResponse.class);
		
		return response;
	}

    public Response<DispatchCouponsResponse> dispatchCouponsAsync(DispatchCouponsRequest request) {
		return sendRequestAsync(request, "/Coupons/Dispatch", HttpPost, DispatchCouponsResponse.class, null);
	}

	public Future<?> dispatchCouponsAsync(DispatchCouponsRequest request, AsyncHandler<DispatchCouponsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Coupons/Dispatch", HttpPost, DispatchCouponsResponse.class, asyncHandler);
	}
	
    	
	public RedeemCouponResponse redeemCoupon(RedeemCouponRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		RedeemCouponResponse response = sendRequest(request, "/Coupon/Redeem", HttpPost, RedeemCouponResponse.class);
		
		return response;
	}

    public Response<RedeemCouponResponse> redeemCouponAsync(RedeemCouponRequest request) {
		return sendRequestAsync(request, "/Coupon/Redeem", HttpPost, RedeemCouponResponse.class, null);
	}

	public Future<?> redeemCouponAsync(RedeemCouponRequest request, AsyncHandler<RedeemCouponResponse> asyncHandler) {
		return sendRequestAsync(request, "/Coupon/Redeem", HttpPost, RedeemCouponResponse.class, asyncHandler);
	}
	
    	
	public SearchCouponsResponse searchCoupons(SearchCouponsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		SearchCouponsResponse response = sendRequest(request, "/Coupons/Search", HttpPost, SearchCouponsResponse.class);
		
		return response;
	}

    public Response<SearchCouponsResponse> searchCouponsAsync(SearchCouponsRequest request) {
		return sendRequestAsync(request, "/Coupons/Search", HttpPost, SearchCouponsResponse.class, null);
	}

	public Future<?> searchCouponsAsync(SearchCouponsRequest request, AsyncHandler<SearchCouponsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Coupons/Search", HttpPost, SearchCouponsResponse.class, asyncHandler);
	}
	
    	
	public CheckFeatureAdoptionCouponEligibilityResponse checkFeatureAdoptionCouponEligibility(CheckFeatureAdoptionCouponEligibilityRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		CheckFeatureAdoptionCouponEligibilityResponse response = sendRequest(request, "/FeatureAdoptionCouponEligibility/Check", HttpPost, CheckFeatureAdoptionCouponEligibilityResponse.class);
		
		return response;
	}

    public Response<CheckFeatureAdoptionCouponEligibilityResponse> checkFeatureAdoptionCouponEligibilityAsync(CheckFeatureAdoptionCouponEligibilityRequest request) {
		return sendRequestAsync(request, "/FeatureAdoptionCouponEligibility/Check", HttpPost, CheckFeatureAdoptionCouponEligibilityResponse.class, null);
	}

	public Future<?> checkFeatureAdoptionCouponEligibilityAsync(CheckFeatureAdoptionCouponEligibilityRequest request, AsyncHandler<CheckFeatureAdoptionCouponEligibilityResponse> asyncHandler) {
		return sendRequestAsync(request, "/FeatureAdoptionCouponEligibility/Check", HttpPost, CheckFeatureAdoptionCouponEligibilityResponse.class, asyncHandler);
	}
	
    	
	public ClaimFeatureAdoptionCouponsResponse claimFeatureAdoptionCoupons(ClaimFeatureAdoptionCouponsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		ClaimFeatureAdoptionCouponsResponse response = sendRequest(request, "/FeatureAdoptionCoupons/Claim", HttpPost, ClaimFeatureAdoptionCouponsResponse.class);
		
		return response;
	}

    public Response<ClaimFeatureAdoptionCouponsResponse> claimFeatureAdoptionCouponsAsync(ClaimFeatureAdoptionCouponsRequest request) {
		return sendRequestAsync(request, "/FeatureAdoptionCoupons/Claim", HttpPost, ClaimFeatureAdoptionCouponsResponse.class, null);
	}

	public Future<?> claimFeatureAdoptionCouponsAsync(ClaimFeatureAdoptionCouponsRequest request, AsyncHandler<ClaimFeatureAdoptionCouponsResponse> asyncHandler) {
		return sendRequestAsync(request, "/FeatureAdoptionCoupons/Claim", HttpPost, ClaimFeatureAdoptionCouponsResponse.class, asyncHandler);
	}
	
    	
	public GetCouponInfoResponse getCouponInfo(GetCouponInfoRequest request)
		  throws AdApiFaultDetail_Exception, ApiFault_Exception {
		GetCouponInfoResponse response = sendRequest(request, "/CouponInfo/Query", HttpPost, GetCouponInfoResponse.class);
		
		return response;
	}

    public Response<GetCouponInfoResponse> getCouponInfoAsync(GetCouponInfoRequest request) {
		return sendRequestAsync(request, "/CouponInfo/Query", HttpPost, GetCouponInfoResponse.class, null);
	}

	public Future<?> getCouponInfoAsync(GetCouponInfoRequest request, AsyncHandler<GetCouponInfoResponse> asyncHandler) {
		return sendRequestAsync(request, "/CouponInfo/Query", HttpPost, GetCouponInfoResponse.class, asyncHandler);
	}
	
    }