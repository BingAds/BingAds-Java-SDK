package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class CampaignManagementService extends RestfulServiceClient implements ICampaignManagementService {

	private Supplier<ICampaignManagementService> fallbackService;

	public CampaignManagementService(Map<String, String> headers, ApiEnvironment env, Supplier<ICampaignManagementService> fallbackService) {
        super(headers, env, ICampaignManagementService.class);

        this.fallbackService = fallbackService;
    }
	
	Exception processFaultDetail(ApplicationFault faultDetail, boolean shouldThrow) 
			throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		String message = getFaultMessage(faultDetail.getTrackingId());

		if (faultDetail instanceof AdApiFaultDetail) {
			AdApiFaultDetail_Exception ex = new AdApiFaultDetail_Exception(message, (AdApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (faultDetail instanceof ApiFaultDetail) {
			ApiFaultDetail_Exception ex = new ApiFaultDetail_Exception(message, (ApiFaultDetail)faultDetail);
			
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

	Exception processFaultDetailEditorialFault(ApplicationFault faultDetail, boolean shouldThrow) 
			throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		String message = getFaultMessage(faultDetail.getTrackingId());

		if (faultDetail instanceof AdApiFaultDetail) {
			AdApiFaultDetail_Exception ex = new AdApiFaultDetail_Exception(message, (AdApiFaultDetail)faultDetail);
			
			if (shouldThrow) {				
				throw ex;
			} 
			
			return ex;
		}

		if (faultDetail instanceof EditorialApiFaultDetail) {
			EditorialApiFaultDetail_Exception ex = new EditorialApiFaultDetail_Exception(message, (EditorialApiFaultDetail)faultDetail);
			
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
			throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
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

	protected <Req, Resp> Resp sendRequestEditorialFault(Req request, String entityEndpoint, String verb, Class<Resp> respClass)
			throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		ResponseInfo<Resp, ApplicationFault> responseInfo = getResponseInfo(request, entityEndpoint, verb, respClass, ApplicationFault.class);

		if (responseInfo == null) {
			return null;
		}

		ApplicationFault faultDetail = responseInfo.getFaultDetail();

		if (faultDetail != null) {
			processFaultDetailEditorialFault(faultDetail, true);
		}

		return responseInfo.getResponse();
	}

	private Exception getFaultException(ApplicationFault faultDetail) {
		try {
			Exception ex = processFaultDetail(faultDetail, false);

			if (ex == null) {
				ex = processFaultDetailEditorialFault(faultDetail, false);
			}

			return ex;
		} catch (Exception ex) {
			throw new InternalException(ex);
		}
	}

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, BiFunction<Req, AsyncHandler<Resp>, Future<?>> soapMethod, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), soapMethod, handler);
	}
		
	public AddCampaignsResponse addCampaigns(AddCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignsResponse response = sendRequest(request, "/Campaigns", HttpPost, AddCampaignsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addCampaigns(request);
		}
		
		return response;
	}

    public Response<AddCampaignsResponse> addCampaignsAsync(AddCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class, (r, h) -> fallbackService.get().addCampaignsAsync(r, h), null);
	}

	public Future<?> addCampaignsAsync(AddCampaignsRequest request, AsyncHandler<AddCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class, (r, h) -> fallbackService.get().addCampaignsAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignsByAccountIdResponse getCampaignsByAccountId(GetCampaignsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignsByAccountIdResponse response = sendRequest(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignsByAccountId(request);
		}
		
		return response;
	}

    public Response<GetCampaignsByAccountIdResponse> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request) {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class, (r, h) -> fallbackService.get().getCampaignsByAccountIdAsync(r, h), null);
	}

	public Future<?> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request, AsyncHandler<GetCampaignsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class, (r, h) -> fallbackService.get().getCampaignsByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignsByIdsResponse getCampaignsByIds(GetCampaignsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignsByIdsResponse response = sendRequest(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignsByIds(request);
		}
		
		return response;
	}

    public Response<GetCampaignsByIdsResponse> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request) {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class, (r, h) -> fallbackService.get().getCampaignsByIdsAsync(r, h), null);
	}

	public Future<?> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request, AsyncHandler<GetCampaignsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class, (r, h) -> fallbackService.get().getCampaignsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteCampaignsResponse deleteCampaigns(DeleteCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignsResponse response = sendRequest(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteCampaigns(request);
		}
		
		return response;
	}

    public Response<DeleteCampaignsResponse> deleteCampaignsAsync(DeleteCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class, (r, h) -> fallbackService.get().deleteCampaignsAsync(r, h), null);
	}

	public Future<?> deleteCampaignsAsync(DeleteCampaignsRequest request, AsyncHandler<DeleteCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class, (r, h) -> fallbackService.get().deleteCampaignsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateCampaignsResponse updateCampaigns(UpdateCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateCampaignsResponse response = sendRequest(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateCampaigns(request);
		}
		
		return response;
	}

    public Response<UpdateCampaignsResponse> updateCampaignsAsync(UpdateCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class, (r, h) -> fallbackService.get().updateCampaignsAsync(r, h), null);
	}

	public Future<?> updateCampaignsAsync(UpdateCampaignsRequest request, AsyncHandler<UpdateCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class, (r, h) -> fallbackService.get().updateCampaignsAsync(r, h), asyncHandler);
	}
	
    	
	public GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(GetNegativeSitesByCampaignIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeSitesByCampaignIdsResponse response = sendRequest(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getNegativeSitesByCampaignIds(request);
		}
		
		return response;
	}

    public Response<GetNegativeSitesByCampaignIdsResponse> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class, (r, h) -> fallbackService.get().getNegativeSitesByCampaignIdsAsync(r, h), null);
	}

	public Future<?> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request, AsyncHandler<GetNegativeSitesByCampaignIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class, (r, h) -> fallbackService.get().getNegativeSitesByCampaignIdsAsync(r, h), asyncHandler);
	}
	
    	
	public SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(SetNegativeSitesToCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetNegativeSitesToCampaignsResponse response = sendRequest(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setNegativeSitesToCampaigns(request);
		}
		
		return response;
	}

    public Response<SetNegativeSitesToCampaignsResponse> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class, (r, h) -> fallbackService.get().setNegativeSitesToCampaignsAsync(r, h), null);
	}

	public Future<?> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request, AsyncHandler<SetNegativeSitesToCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class, (r, h) -> fallbackService.get().setNegativeSitesToCampaignsAsync(r, h), asyncHandler);
	}
	
    	
	public GetConfigValueResponse getConfigValue(GetConfigValueRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConfigValueResponse response = sendRequest(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getConfigValue(request);
		}
		
		return response;
	}

    public Response<GetConfigValueResponse> getConfigValueAsync(GetConfigValueRequest request) {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class, (r, h) -> fallbackService.get().getConfigValueAsync(r, h), null);
	}

	public Future<?> getConfigValueAsync(GetConfigValueRequest request, AsyncHandler<GetConfigValueResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class, (r, h) -> fallbackService.get().getConfigValueAsync(r, h), asyncHandler);
	}
	
    	
	public GetBSCCountriesResponse getBSCCountries(GetBSCCountriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBSCCountriesResponse response = sendRequest(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getBSCCountries(request);
		}
		
		return response;
	}

    public Response<GetBSCCountriesResponse> getBSCCountriesAsync(GetBSCCountriesRequest request) {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class, (r, h) -> fallbackService.get().getBSCCountriesAsync(r, h), null);
	}

	public Future<?> getBSCCountriesAsync(GetBSCCountriesRequest request, AsyncHandler<GetBSCCountriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class, (r, h) -> fallbackService.get().getBSCCountriesAsync(r, h), asyncHandler);
	}
	
    	
	public AddAdGroupsResponse addAdGroups(AddAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAdGroups(request);
		}
		
		return response;
	}

    public Response<AddAdGroupsResponse> addAdGroupsAsync(AddAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class, (r, h) -> fallbackService.get().addAdGroupsAsync(r, h), null);
	}

	public Future<?> addAdGroupsAsync(AddAdGroupsRequest request, AsyncHandler<AddAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class, (r, h) -> fallbackService.get().addAdGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAdGroupsResponse deleteAdGroups(DeleteAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAdGroups(request);
		}
		
		return response;
	}

    public Response<DeleteAdGroupsResponse> deleteAdGroupsAsync(DeleteAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class, (r, h) -> fallbackService.get().deleteAdGroupsAsync(r, h), null);
	}

	public Future<?> deleteAdGroupsAsync(DeleteAdGroupsRequest request, AsyncHandler<DeleteAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class, (r, h) -> fallbackService.get().deleteAdGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdGroupsByIdsResponse getAdGroupsByIds(GetAdGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupsByIdsResponse response = sendRequest(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdGroupsByIds(request);
		}
		
		return response;
	}

    public Response<GetAdGroupsByIdsResponse> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAdGroupsByIdsAsync(r, h), null);
	}

	public Future<?> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request, AsyncHandler<GetAdGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAdGroupsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(GetAdGroupsByCampaignIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupsByCampaignIdResponse response = sendRequest(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdGroupsByCampaignId(request);
		}
		
		return response;
	}

    public Response<GetAdGroupsByCampaignIdResponse> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request) {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class, (r, h) -> fallbackService.get().getAdGroupsByCampaignIdAsync(r, h), null);
	}

	public Future<?> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request, AsyncHandler<GetAdGroupsByCampaignIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class, (r, h) -> fallbackService.get().getAdGroupsByCampaignIdAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAdGroupsResponse updateAdGroups(UpdateAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAdGroups(request);
		}
		
		return response;
	}

    public Response<UpdateAdGroupsResponse> updateAdGroupsAsync(UpdateAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class, (r, h) -> fallbackService.get().updateAdGroupsAsync(r, h), null);
	}

	public Future<?> updateAdGroupsAsync(UpdateAdGroupsRequest request, AsyncHandler<UpdateAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class, (r, h) -> fallbackService.get().updateAdGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(GetNegativeSitesByAdGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeSitesByAdGroupIdsResponse response = sendRequest(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getNegativeSitesByAdGroupIds(request);
		}
		
		return response;
	}

    public Response<GetNegativeSitesByAdGroupIdsResponse> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class, (r, h) -> fallbackService.get().getNegativeSitesByAdGroupIdsAsync(r, h), null);
	}

	public Future<?> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request, AsyncHandler<GetNegativeSitesByAdGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class, (r, h) -> fallbackService.get().getNegativeSitesByAdGroupIdsAsync(r, h), asyncHandler);
	}
	
    	
	public SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(SetNegativeSitesToAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetNegativeSitesToAdGroupsResponse response = sendRequest(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setNegativeSitesToAdGroups(request);
		}
		
		return response;
	}

    public Response<SetNegativeSitesToAdGroupsResponse> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class, (r, h) -> fallbackService.get().setNegativeSitesToAdGroupsAsync(r, h), null);
	}

	public Future<?> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request, AsyncHandler<SetNegativeSitesToAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class, (r, h) -> fallbackService.get().setNegativeSitesToAdGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(GetGeoLocationsFileUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetGeoLocationsFileUrlResponse response = sendRequest(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getGeoLocationsFileUrl(request);
		}
		
		return response;
	}

    public Response<GetGeoLocationsFileUrlResponse> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request) {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class, (r, h) -> fallbackService.get().getGeoLocationsFileUrlAsync(r, h), null);
	}

	public Future<?> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request, AsyncHandler<GetGeoLocationsFileUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class, (r, h) -> fallbackService.get().getGeoLocationsFileUrlAsync(r, h), asyncHandler);
	}
	
    	
	public AddAdsResponse addAds(AddAdsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddAdsResponse response = sendRequestEditorialFault(request, "/Ads", HttpPost, AddAdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAds(request);
		}
		
		return response;
	}

    public Response<AddAdsResponse> addAdsAsync(AddAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class, (r, h) -> fallbackService.get().addAdsAsync(r, h), null);
	}

	public Future<?> addAdsAsync(AddAdsRequest request, AsyncHandler<AddAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class, (r, h) -> fallbackService.get().addAdsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAdsResponse deleteAds(DeleteAdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdsResponse response = sendRequest(request, "/Ads", HttpDelete, DeleteAdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAds(request);
		}
		
		return response;
	}

    public Response<DeleteAdsResponse> deleteAdsAsync(DeleteAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class, (r, h) -> fallbackService.get().deleteAdsAsync(r, h), null);
	}

	public Future<?> deleteAdsAsync(DeleteAdsRequest request, AsyncHandler<DeleteAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class, (r, h) -> fallbackService.get().deleteAdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdsByEditorialStatusResponse getAdsByEditorialStatus(GetAdsByEditorialStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByEditorialStatusResponse response = sendRequest(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdsByEditorialStatus(request);
		}
		
		return response;
	}

    public Response<GetAdsByEditorialStatusResponse> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class, (r, h) -> fallbackService.get().getAdsByEditorialStatusAsync(r, h), null);
	}

	public Future<?> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request, AsyncHandler<GetAdsByEditorialStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class, (r, h) -> fallbackService.get().getAdsByEditorialStatusAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdsByIdsResponse getAdsByIds(GetAdsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByIdsResponse response = sendRequest(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdsByIds(request);
		}
		
		return response;
	}

    public Response<GetAdsByIdsResponse> getAdsByIdsAsync(GetAdsByIdsRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class, (r, h) -> fallbackService.get().getAdsByIdsAsync(r, h), null);
	}

	public Future<?> getAdsByIdsAsync(GetAdsByIdsRequest request, AsyncHandler<GetAdsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class, (r, h) -> fallbackService.get().getAdsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdsByAdGroupIdResponse getAdsByAdGroupId(GetAdsByAdGroupIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByAdGroupIdResponse response = sendRequest(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdsByAdGroupId(request);
		}
		
		return response;
	}

    public Response<GetAdsByAdGroupIdResponse> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class, (r, h) -> fallbackService.get().getAdsByAdGroupIdAsync(r, h), null);
	}

	public Future<?> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request, AsyncHandler<GetAdsByAdGroupIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class, (r, h) -> fallbackService.get().getAdsByAdGroupIdAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAdsResponse updateAds(UpdateAdsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdsResponse response = sendRequestEditorialFault(request, "/Ads", HttpPut, UpdateAdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAds(request);
		}
		
		return response;
	}

    public Response<UpdateAdsResponse> updateAdsAsync(UpdateAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class, (r, h) -> fallbackService.get().updateAdsAsync(r, h), null);
	}

	public Future<?> updateAdsAsync(UpdateAdsRequest request, AsyncHandler<UpdateAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class, (r, h) -> fallbackService.get().updateAdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddKeywordsResponse addKeywords(AddKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddKeywordsResponse response = sendRequestEditorialFault(request, "/Keywords", HttpPost, AddKeywordsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addKeywords(request);
		}
		
		return response;
	}

    public Response<AddKeywordsResponse> addKeywordsAsync(AddKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class, (r, h) -> fallbackService.get().addKeywordsAsync(r, h), null);
	}

	public Future<?> addKeywordsAsync(AddKeywordsRequest request, AsyncHandler<AddKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class, (r, h) -> fallbackService.get().addKeywordsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteKeywordsResponse deleteKeywords(DeleteKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteKeywordsResponse response = sendRequest(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteKeywords(request);
		}
		
		return response;
	}

    public Response<DeleteKeywordsResponse> deleteKeywordsAsync(DeleteKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class, (r, h) -> fallbackService.get().deleteKeywordsAsync(r, h), null);
	}

	public Future<?> deleteKeywordsAsync(DeleteKeywordsRequest request, AsyncHandler<DeleteKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class, (r, h) -> fallbackService.get().deleteKeywordsAsync(r, h), asyncHandler);
	}
	
    	
	public GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(GetKeywordsByEditorialStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByEditorialStatusResponse response = sendRequest(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getKeywordsByEditorialStatus(request);
		}
		
		return response;
	}

    public Response<GetKeywordsByEditorialStatusResponse> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class, (r, h) -> fallbackService.get().getKeywordsByEditorialStatusAsync(r, h), null);
	}

	public Future<?> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request, AsyncHandler<GetKeywordsByEditorialStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class, (r, h) -> fallbackService.get().getKeywordsByEditorialStatusAsync(r, h), asyncHandler);
	}
	
    	
	public GetKeywordsByIdsResponse getKeywordsByIds(GetKeywordsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByIdsResponse response = sendRequest(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getKeywordsByIds(request);
		}
		
		return response;
	}

    public Response<GetKeywordsByIdsResponse> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class, (r, h) -> fallbackService.get().getKeywordsByIdsAsync(r, h), null);
	}

	public Future<?> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request, AsyncHandler<GetKeywordsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class, (r, h) -> fallbackService.get().getKeywordsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(GetKeywordsByAdGroupIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByAdGroupIdResponse response = sendRequest(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getKeywordsByAdGroupId(request);
		}
		
		return response;
	}

    public Response<GetKeywordsByAdGroupIdResponse> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class, (r, h) -> fallbackService.get().getKeywordsByAdGroupIdAsync(r, h), null);
	}

	public Future<?> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request, AsyncHandler<GetKeywordsByAdGroupIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class, (r, h) -> fallbackService.get().getKeywordsByAdGroupIdAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateKeywordsResponse updateKeywords(UpdateKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateKeywordsResponse response = sendRequestEditorialFault(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateKeywords(request);
		}
		
		return response;
	}

    public Response<UpdateKeywordsResponse> updateKeywordsAsync(UpdateKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class, (r, h) -> fallbackService.get().updateKeywordsAsync(r, h), null);
	}

	public Future<?> updateKeywordsAsync(UpdateKeywordsRequest request, AsyncHandler<UpdateKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class, (r, h) -> fallbackService.get().updateKeywordsAsync(r, h), asyncHandler);
	}
	
    	
	public AppealEditorialRejectionsResponse appealEditorialRejections(AppealEditorialRejectionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AppealEditorialRejectionsResponse response = sendRequest(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().appealEditorialRejections(request);
		}
		
		return response;
	}

    public Response<AppealEditorialRejectionsResponse> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request) {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class, (r, h) -> fallbackService.get().appealEditorialRejectionsAsync(r, h), null);
	}

	public Future<?> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request, AsyncHandler<AppealEditorialRejectionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class, (r, h) -> fallbackService.get().appealEditorialRejectionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(GetEditorialReasonsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEditorialReasonsByIdsResponse response = sendRequest(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getEditorialReasonsByIds(request);
		}
		
		return response;
	}

    public Response<GetEditorialReasonsByIdsResponse> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request) {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class, (r, h) -> fallbackService.get().getEditorialReasonsByIdsAsync(r, h), null);
	}

	public Future<?> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request, AsyncHandler<GetEditorialReasonsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class, (r, h) -> fallbackService.get().getEditorialReasonsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAccountMigrationStatusesResponse getAccountMigrationStatuses(GetAccountMigrationStatusesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAccountMigrationStatusesResponse response = sendRequest(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccountMigrationStatuses(request);
		}
		
		return response;
	}

    public Response<GetAccountMigrationStatusesResponse> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request) {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class, (r, h) -> fallbackService.get().getAccountMigrationStatusesAsync(r, h), null);
	}

	public Future<?> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request, AsyncHandler<GetAccountMigrationStatusesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class, (r, h) -> fallbackService.get().getAccountMigrationStatusesAsync(r, h), asyncHandler);
	}
	
    	
	public SetAccountPropertiesResponse setAccountProperties(SetAccountPropertiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetAccountPropertiesResponse response = sendRequest(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setAccountProperties(request);
		}
		
		return response;
	}

    public Response<SetAccountPropertiesResponse> setAccountPropertiesAsync(SetAccountPropertiesRequest request) {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class, (r, h) -> fallbackService.get().setAccountPropertiesAsync(r, h), null);
	}

	public Future<?> setAccountPropertiesAsync(SetAccountPropertiesRequest request, AsyncHandler<SetAccountPropertiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class, (r, h) -> fallbackService.get().setAccountPropertiesAsync(r, h), asyncHandler);
	}
	
    	
	public GetAccountPropertiesResponse getAccountProperties(GetAccountPropertiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAccountPropertiesResponse response = sendRequest(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAccountProperties(request);
		}
		
		return response;
	}

    public Response<GetAccountPropertiesResponse> getAccountPropertiesAsync(GetAccountPropertiesRequest request) {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class, (r, h) -> fallbackService.get().getAccountPropertiesAsync(r, h), null);
	}

	public Future<?> getAccountPropertiesAsync(GetAccountPropertiesRequest request, AsyncHandler<GetAccountPropertiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class, (r, h) -> fallbackService.get().getAccountPropertiesAsync(r, h), asyncHandler);
	}
	
    	
	public AddAdExtensionsResponse addAdExtensions(AddAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAdExtensionsResponse response = sendRequest(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAdExtensions(request);
		}
		
		return response;
	}

    public Response<AddAdExtensionsResponse> addAdExtensionsAsync(AddAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class, (r, h) -> fallbackService.get().addAdExtensionsAsync(r, h), null);
	}

	public Future<?> addAdExtensionsAsync(AddAdExtensionsRequest request, AsyncHandler<AddAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class, (r, h) -> fallbackService.get().addAdExtensionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdExtensionsByIdsResponse getAdExtensionsByIds(GetAdExtensionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsByIdsResponse response = sendRequest(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdExtensionsByIds(request);
		}
		
		return response;
	}

    public Response<GetAdExtensionsByIdsResponse> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request) {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsByIdsAsync(r, h), null);
	}

	public Future<?> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request, AsyncHandler<GetAdExtensionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAdExtensionsResponse updateAdExtensions(UpdateAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdExtensionsResponse response = sendRequestEditorialFault(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAdExtensions(request);
		}
		
		return response;
	}

    public Response<UpdateAdExtensionsResponse> updateAdExtensionsAsync(UpdateAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class, (r, h) -> fallbackService.get().updateAdExtensionsAsync(r, h), null);
	}

	public Future<?> updateAdExtensionsAsync(UpdateAdExtensionsRequest request, AsyncHandler<UpdateAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class, (r, h) -> fallbackService.get().updateAdExtensionsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAdExtensionsResponse deleteAdExtensions(DeleteAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdExtensionsResponse response = sendRequest(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAdExtensions(request);
		}
		
		return response;
	}

    public Response<DeleteAdExtensionsResponse> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class, (r, h) -> fallbackService.get().deleteAdExtensionsAsync(r, h), null);
	}

	public Future<?> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request, AsyncHandler<DeleteAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class, (r, h) -> fallbackService.get().deleteAdExtensionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(GetAdExtensionsEditorialReasonsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsEditorialReasonsResponse response = sendRequest(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdExtensionsEditorialReasons(request);
		}
		
		return response;
	}

    public Response<GetAdExtensionsEditorialReasonsResponse> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsEditorialReasonsAsync(r, h), null);
	}

	public Future<?> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request, AsyncHandler<GetAdExtensionsEditorialReasonsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsEditorialReasonsAsync(r, h), asyncHandler);
	}
	
    	
	public SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(SetAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		SetAdExtensionsAssociationsResponse response = sendRequestEditorialFault(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setAdExtensionsAssociations(request);
		}
		
		return response;
	}

    public Response<SetAdExtensionsAssociationsResponse> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().setAdExtensionsAssociationsAsync(r, h), null);
	}

	public Future<?> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request, AsyncHandler<SetAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().setAdExtensionsAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(GetAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsAssociationsResponse response = sendRequest(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdExtensionsAssociations(request);
		}
		
		return response;
	}

    public Response<GetAdExtensionsAssociationsResponse> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsAssociationsAsync(r, h), null);
	}

	public Future<?> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request, AsyncHandler<GetAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().getAdExtensionsAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(DeleteAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdExtensionsAssociationsResponse response = sendRequest(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAdExtensionsAssociations(request);
		}
		
		return response;
	}

    public Response<DeleteAdExtensionsAssociationsResponse> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().deleteAdExtensionsAssociationsAsync(r, h), null);
	}

	public Future<?> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request, AsyncHandler<DeleteAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class, (r, h) -> fallbackService.get().deleteAdExtensionsAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(GetAdExtensionIdsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionIdsByAccountIdResponse response = sendRequest(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdExtensionIdsByAccountId(request);
		}
		
		return response;
	}

    public Response<GetAdExtensionIdsByAccountIdResponse> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request) {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class, (r, h) -> fallbackService.get().getAdExtensionIdsByAccountIdAsync(r, h), null);
	}

	public Future<?> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request, AsyncHandler<GetAdExtensionIdsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class, (r, h) -> fallbackService.get().getAdExtensionIdsByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public AddMediaResponse addMedia(AddMediaRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddMediaResponse response = sendRequest(request, "/Media", HttpPost, AddMediaResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addMedia(request);
		}
		
		return response;
	}

    public Response<AddMediaResponse> addMediaAsync(AddMediaRequest request) {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class, (r, h) -> fallbackService.get().addMediaAsync(r, h), null);
	}

	public Future<?> addMediaAsync(AddMediaRequest request, AsyncHandler<AddMediaResponse> asyncHandler) {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class, (r, h) -> fallbackService.get().addMediaAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteMediaResponse deleteMedia(DeleteMediaRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteMediaResponse response = sendRequest(request, "/Media", HttpDelete, DeleteMediaResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteMedia(request);
		}
		
		return response;
	}

    public Response<DeleteMediaResponse> deleteMediaAsync(DeleteMediaRequest request) {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class, (r, h) -> fallbackService.get().deleteMediaAsync(r, h), null);
	}

	public Future<?> deleteMediaAsync(DeleteMediaRequest request, AsyncHandler<DeleteMediaResponse> asyncHandler) {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class, (r, h) -> fallbackService.get().deleteMediaAsync(r, h), asyncHandler);
	}
	
    	
	public GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(GetMediaMetaDataByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaMetaDataByAccountIdResponse response = sendRequest(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getMediaMetaDataByAccountId(request);
		}
		
		return response;
	}

    public Response<GetMediaMetaDataByAccountIdResponse> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class, (r, h) -> fallbackService.get().getMediaMetaDataByAccountIdAsync(r, h), null);
	}

	public Future<?> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request, AsyncHandler<GetMediaMetaDataByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class, (r, h) -> fallbackService.get().getMediaMetaDataByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(GetMediaMetaDataByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaMetaDataByIdsResponse response = sendRequest(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getMediaMetaDataByIds(request);
		}
		
		return response;
	}

    public Response<GetMediaMetaDataByIdsResponse> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class, (r, h) -> fallbackService.get().getMediaMetaDataByIdsAsync(r, h), null);
	}

	public Future<?> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request, AsyncHandler<GetMediaMetaDataByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class, (r, h) -> fallbackService.get().getMediaMetaDataByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetMediaAssociationsResponse getMediaAssociations(GetMediaAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaAssociationsResponse response = sendRequest(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getMediaAssociations(request);
		}
		
		return response;
	}

    public Response<GetMediaAssociationsResponse> getMediaAssociationsAsync(GetMediaAssociationsRequest request) {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class, (r, h) -> fallbackService.get().getMediaAssociationsAsync(r, h), null);
	}

	public Future<?> getMediaAssociationsAsync(GetMediaAssociationsRequest request, AsyncHandler<GetMediaAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class, (r, h) -> fallbackService.get().getMediaAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(GetAdGroupCriterionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupCriterionsByIdsResponse response = sendRequest(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAdGroupCriterionsByIds(request);
		}
		
		return response;
	}

    public Response<GetAdGroupCriterionsByIdsResponse> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class, (r, h) -> fallbackService.get().getAdGroupCriterionsByIdsAsync(r, h), null);
	}

	public Future<?> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request, AsyncHandler<GetAdGroupCriterionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class, (r, h) -> fallbackService.get().getAdGroupCriterionsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddAdGroupCriterionsResponse addAdGroupCriterions(AddAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddAdGroupCriterionsResponse response = sendRequestEditorialFault(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAdGroupCriterions(request);
		}
		
		return response;
	}

    public Response<AddAdGroupCriterionsResponse> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().addAdGroupCriterionsAsync(r, h), null);
	}

	public Future<?> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request, AsyncHandler<AddAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().addAdGroupCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAdGroupCriterionsResponse updateAdGroupCriterions(UpdateAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdGroupCriterionsResponse response = sendRequestEditorialFault(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAdGroupCriterions(request);
		}
		
		return response;
	}

    public Response<UpdateAdGroupCriterionsResponse> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().updateAdGroupCriterionsAsync(r, h), null);
	}

	public Future<?> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request, AsyncHandler<UpdateAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().updateAdGroupCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(DeleteAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdGroupCriterionsResponse response = sendRequest(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAdGroupCriterions(request);
		}
		
		return response;
	}

    public Response<DeleteAdGroupCriterionsResponse> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().deleteAdGroupCriterionsAsync(r, h), null);
	}

	public Future<?> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request, AsyncHandler<DeleteAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class, (r, h) -> fallbackService.get().deleteAdGroupCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyProductPartitionActionsResponse applyProductPartitionActions(ApplyProductPartitionActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyProductPartitionActionsResponse response = sendRequest(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyProductPartitionActions(request);
		}
		
		return response;
	}

    public Response<ApplyProductPartitionActionsResponse> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request) {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class, (r, h) -> fallbackService.get().applyProductPartitionActionsAsync(r, h), null);
	}

	public Future<?> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request, AsyncHandler<ApplyProductPartitionActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class, (r, h) -> fallbackService.get().applyProductPartitionActionsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyHotelGroupActionsResponse applyHotelGroupActions(ApplyHotelGroupActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyHotelGroupActionsResponse response = sendRequest(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyHotelGroupActions(request);
		}
		
		return response;
	}

    public Response<ApplyHotelGroupActionsResponse> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request) {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class, (r, h) -> fallbackService.get().applyHotelGroupActionsAsync(r, h), null);
	}

	public Future<?> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request, AsyncHandler<ApplyHotelGroupActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class, (r, h) -> fallbackService.get().applyHotelGroupActionsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyAssetGroupListingGroupActionsResponse applyAssetGroupListingGroupActions(ApplyAssetGroupListingGroupActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyAssetGroupListingGroupActionsResponse response = sendRequest(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyAssetGroupListingGroupActions(request);
		}
		
		return response;
	}

    public Response<ApplyAssetGroupListingGroupActionsResponse> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request) {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class, (r, h) -> fallbackService.get().applyAssetGroupListingGroupActionsAsync(r, h), null);
	}

	public Future<?> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request, AsyncHandler<ApplyAssetGroupListingGroupActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class, (r, h) -> fallbackService.get().applyAssetGroupListingGroupActionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAssetGroupListingGroupsByIdsResponse getAssetGroupListingGroupsByIds(GetAssetGroupListingGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupListingGroupsByIdsResponse response = sendRequest(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAssetGroupListingGroupsByIds(request);
		}
		
		return response;
	}

    public Response<GetAssetGroupListingGroupsByIdsResponse> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAssetGroupListingGroupsByIdsAsync(r, h), null);
	}

	public Future<?> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request, AsyncHandler<GetAssetGroupListingGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAssetGroupListingGroupsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(GetBMCStoresByCustomerIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBMCStoresByCustomerIdResponse response = sendRequest(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getBMCStoresByCustomerId(request);
		}
		
		return response;
	}

    public Response<GetBMCStoresByCustomerIdResponse> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request) {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class, (r, h) -> fallbackService.get().getBMCStoresByCustomerIdAsync(r, h), null);
	}

	public Future<?> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request, AsyncHandler<GetBMCStoresByCustomerIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class, (r, h) -> fallbackService.get().getBMCStoresByCustomerIdAsync(r, h), asyncHandler);
	}
	
    	
	public AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(AddNegativeKeywordsToEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddNegativeKeywordsToEntitiesResponse response = sendRequest(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addNegativeKeywordsToEntities(request);
		}
		
		return response;
	}

    public Response<AddNegativeKeywordsToEntitiesResponse> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class, (r, h) -> fallbackService.get().addNegativeKeywordsToEntitiesAsync(r, h), null);
	}

	public Future<?> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request, AsyncHandler<AddNegativeKeywordsToEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class, (r, h) -> fallbackService.get().addNegativeKeywordsToEntitiesAsync(r, h), asyncHandler);
	}
	
    	
	public GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(GetNegativeKeywordsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeKeywordsByEntityIdsResponse response = sendRequest(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getNegativeKeywordsByEntityIds(request);
		}
		
		return response;
	}

    public Response<GetNegativeKeywordsByEntityIdsResponse> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getNegativeKeywordsByEntityIdsAsync(r, h), null);
	}

	public Future<?> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request, AsyncHandler<GetNegativeKeywordsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getNegativeKeywordsByEntityIdsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(DeleteNegativeKeywordsFromEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteNegativeKeywordsFromEntitiesResponse response = sendRequest(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteNegativeKeywordsFromEntities(request);
		}
		
		return response;
	}

    public Response<DeleteNegativeKeywordsFromEntitiesResponse> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class, (r, h) -> fallbackService.get().deleteNegativeKeywordsFromEntitiesAsync(r, h), null);
	}

	public Future<?> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request, AsyncHandler<DeleteNegativeKeywordsFromEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class, (r, h) -> fallbackService.get().deleteNegativeKeywordsFromEntitiesAsync(r, h), asyncHandler);
	}
	
    	
	public GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(GetSharedEntitiesByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntitiesByAccountIdResponse response = sendRequest(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSharedEntitiesByAccountId(request);
		}
		
		return response;
	}

    public Response<GetSharedEntitiesByAccountIdResponse> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request) {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class, (r, h) -> fallbackService.get().getSharedEntitiesByAccountIdAsync(r, h), null);
	}

	public Future<?> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request, AsyncHandler<GetSharedEntitiesByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class, (r, h) -> fallbackService.get().getSharedEntitiesByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public GetSharedEntitiesResponse getSharedEntities(GetSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntitiesResponse response = sendRequest(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSharedEntities(request);
		}
		
		return response;
	}

    public Response<GetSharedEntitiesResponse> getSharedEntitiesAsync(GetSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class, (r, h) -> fallbackService.get().getSharedEntitiesAsync(r, h), null);
	}

	public Future<?> getSharedEntitiesAsync(GetSharedEntitiesRequest request, AsyncHandler<GetSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class, (r, h) -> fallbackService.get().getSharedEntitiesAsync(r, h), asyncHandler);
	}
	
    	
	public AddSharedEntityResponse addSharedEntity(AddSharedEntityRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddSharedEntityResponse response = sendRequest(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addSharedEntity(request);
		}
		
		return response;
	}

    public Response<AddSharedEntityResponse> addSharedEntityAsync(AddSharedEntityRequest request) {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class, (r, h) -> fallbackService.get().addSharedEntityAsync(r, h), null);
	}

	public Future<?> addSharedEntityAsync(AddSharedEntityRequest request, AsyncHandler<AddSharedEntityResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class, (r, h) -> fallbackService.get().addSharedEntityAsync(r, h), asyncHandler);
	}
	
    	
	public GetListItemsBySharedListResponse getListItemsBySharedList(GetListItemsBySharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetListItemsBySharedListResponse response = sendRequest(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getListItemsBySharedList(request);
		}
		
		return response;
	}

    public Response<GetListItemsBySharedListResponse> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request) {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class, (r, h) -> fallbackService.get().getListItemsBySharedListAsync(r, h), null);
	}

	public Future<?> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request, AsyncHandler<GetListItemsBySharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class, (r, h) -> fallbackService.get().getListItemsBySharedListAsync(r, h), asyncHandler);
	}
	
    	
	public AddListItemsToSharedListResponse addListItemsToSharedList(AddListItemsToSharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddListItemsToSharedListResponse response = sendRequest(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addListItemsToSharedList(request);
		}
		
		return response;
	}

    public Response<AddListItemsToSharedListResponse> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request) {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class, (r, h) -> fallbackService.get().addListItemsToSharedListAsync(r, h), null);
	}

	public Future<?> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request, AsyncHandler<AddListItemsToSharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class, (r, h) -> fallbackService.get().addListItemsToSharedListAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateSharedEntitiesResponse updateSharedEntities(UpdateSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateSharedEntitiesResponse response = sendRequest(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateSharedEntities(request);
		}
		
		return response;
	}

    public Response<UpdateSharedEntitiesResponse> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class, (r, h) -> fallbackService.get().updateSharedEntitiesAsync(r, h), null);
	}

	public Future<?> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request, AsyncHandler<UpdateSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class, (r, h) -> fallbackService.get().updateSharedEntitiesAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(DeleteListItemsFromSharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteListItemsFromSharedListResponse response = sendRequest(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteListItemsFromSharedList(request);
		}
		
		return response;
	}

    public Response<DeleteListItemsFromSharedListResponse> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request) {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class, (r, h) -> fallbackService.get().deleteListItemsFromSharedListAsync(r, h), null);
	}

	public Future<?> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request, AsyncHandler<DeleteListItemsFromSharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class, (r, h) -> fallbackService.get().deleteListItemsFromSharedListAsync(r, h), asyncHandler);
	}
	
    	
	public SetSharedEntityAssociationsResponse setSharedEntityAssociations(SetSharedEntityAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetSharedEntityAssociationsResponse response = sendRequest(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setSharedEntityAssociations(request);
		}
		
		return response;
	}

    public Response<SetSharedEntityAssociationsResponse> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class, (r, h) -> fallbackService.get().setSharedEntityAssociationsAsync(r, h), null);
	}

	public Future<?> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request, AsyncHandler<SetSharedEntityAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class, (r, h) -> fallbackService.get().setSharedEntityAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(DeleteSharedEntityAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSharedEntityAssociationsResponse response = sendRequest(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteSharedEntityAssociations(request);
		}
		
		return response;
	}

    public Response<DeleteSharedEntityAssociationsResponse> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class, (r, h) -> fallbackService.get().deleteSharedEntityAssociationsAsync(r, h), null);
	}

	public Future<?> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request, AsyncHandler<DeleteSharedEntityAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class, (r, h) -> fallbackService.get().deleteSharedEntityAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(GetSharedEntityAssociationsBySharedEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntityAssociationsBySharedEntityIdsResponse response = sendRequest(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSharedEntityAssociationsBySharedEntityIds(request);
		}
		
		return response;
	}

    public Response<GetSharedEntityAssociationsBySharedEntityIdsResponse> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class, (r, h) -> fallbackService.get().getSharedEntityAssociationsBySharedEntityIdsAsync(r, h), null);
	}

	public Future<?> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsBySharedEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class, (r, h) -> fallbackService.get().getSharedEntityAssociationsBySharedEntityIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(GetSharedEntityAssociationsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntityAssociationsByEntityIdsResponse response = sendRequest(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSharedEntityAssociationsByEntityIds(request);
		}
		
		return response;
	}

    public Response<GetSharedEntityAssociationsByEntityIdsResponse> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getSharedEntityAssociationsByEntityIdsAsync(r, h), null);
	}

	public Future<?> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getSharedEntityAssociationsByEntityIdsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteSharedEntitiesResponse deleteSharedEntities(DeleteSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSharedEntitiesResponse response = sendRequest(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteSharedEntities(request);
		}
		
		return response;
	}

    public Response<DeleteSharedEntitiesResponse> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class, (r, h) -> fallbackService.get().deleteSharedEntitiesAsync(r, h), null);
	}

	public Future<?> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request, AsyncHandler<DeleteSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class, (r, h) -> fallbackService.get().deleteSharedEntitiesAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(GetCampaignSizesByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignSizesByAccountIdResponse response = sendRequest(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignSizesByAccountId(request);
		}
		
		return response;
	}

    public Response<GetCampaignSizesByAccountIdResponse> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request) {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class, (r, h) -> fallbackService.get().getCampaignSizesByAccountIdAsync(r, h), null);
	}

	public Future<?> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request, AsyncHandler<GetCampaignSizesByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class, (r, h) -> fallbackService.get().getCampaignSizesByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public AddCampaignCriterionsResponse addCampaignCriterions(AddCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addCampaignCriterions(request);
		}
		
		return response;
	}

    public Response<AddCampaignCriterionsResponse> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().addCampaignCriterionsAsync(r, h), null);
	}

	public Future<?> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request, AsyncHandler<AddCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().addCampaignCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateCampaignCriterionsResponse updateCampaignCriterions(UpdateCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateCampaignCriterions(request);
		}
		
		return response;
	}

    public Response<UpdateCampaignCriterionsResponse> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().updateCampaignCriterionsAsync(r, h), null);
	}

	public Future<?> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request, AsyncHandler<UpdateCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().updateCampaignCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteCampaignCriterionsResponse deleteCampaignCriterions(DeleteCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteCampaignCriterions(request);
		}
		
		return response;
	}

    public Response<DeleteCampaignCriterionsResponse> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().deleteCampaignCriterionsAsync(r, h), null);
	}

	public Future<?> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request, AsyncHandler<DeleteCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class, (r, h) -> fallbackService.get().deleteCampaignCriterionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(GetCampaignCriterionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignCriterionsByIdsResponse response = sendRequest(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignCriterionsByIds(request);
		}
		
		return response;
	}

    public Response<GetCampaignCriterionsByIdsResponse> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class, (r, h) -> fallbackService.get().getCampaignCriterionsByIdsAsync(r, h), null);
	}

	public Future<?> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request, AsyncHandler<GetCampaignCriterionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class, (r, h) -> fallbackService.get().getCampaignCriterionsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddBudgetsResponse addBudgets(AddBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddBudgetsResponse response = sendRequest(request, "/Budgets", HttpPost, AddBudgetsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addBudgets(request);
		}
		
		return response;
	}

    public Response<AddBudgetsResponse> addBudgetsAsync(AddBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class, (r, h) -> fallbackService.get().addBudgetsAsync(r, h), null);
	}

	public Future<?> addBudgetsAsync(AddBudgetsRequest request, AsyncHandler<AddBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class, (r, h) -> fallbackService.get().addBudgetsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateBudgetsResponse updateBudgets(UpdateBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateBudgetsResponse response = sendRequest(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateBudgets(request);
		}
		
		return response;
	}

    public Response<UpdateBudgetsResponse> updateBudgetsAsync(UpdateBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class, (r, h) -> fallbackService.get().updateBudgetsAsync(r, h), null);
	}

	public Future<?> updateBudgetsAsync(UpdateBudgetsRequest request, AsyncHandler<UpdateBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class, (r, h) -> fallbackService.get().updateBudgetsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteBudgetsResponse deleteBudgets(DeleteBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteBudgetsResponse response = sendRequest(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteBudgets(request);
		}
		
		return response;
	}

    public Response<DeleteBudgetsResponse> deleteBudgetsAsync(DeleteBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class, (r, h) -> fallbackService.get().deleteBudgetsAsync(r, h), null);
	}

	public Future<?> deleteBudgetsAsync(DeleteBudgetsRequest request, AsyncHandler<DeleteBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class, (r, h) -> fallbackService.get().deleteBudgetsAsync(r, h), asyncHandler);
	}
	
    	
	public GetBudgetsByIdsResponse getBudgetsByIds(GetBudgetsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBudgetsByIdsResponse response = sendRequest(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getBudgetsByIds(request);
		}
		
		return response;
	}

    public Response<GetBudgetsByIdsResponse> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request) {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class, (r, h) -> fallbackService.get().getBudgetsByIdsAsync(r, h), null);
	}

	public Future<?> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request, AsyncHandler<GetBudgetsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class, (r, h) -> fallbackService.get().getBudgetsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(GetCampaignIdsByBudgetIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignIdsByBudgetIdsResponse response = sendRequest(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignIdsByBudgetIds(request);
		}
		
		return response;
	}

    public Response<GetCampaignIdsByBudgetIdsResponse> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class, (r, h) -> fallbackService.get().getCampaignIdsByBudgetIdsAsync(r, h), null);
	}

	public Future<?> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request, AsyncHandler<GetCampaignIdsByBudgetIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class, (r, h) -> fallbackService.get().getCampaignIdsByBudgetIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddBidStrategiesResponse addBidStrategies(AddBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addBidStrategies(request);
		}
		
		return response;
	}

    public Response<AddBidStrategiesResponse> addBidStrategiesAsync(AddBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class, (r, h) -> fallbackService.get().addBidStrategiesAsync(r, h), null);
	}

	public Future<?> addBidStrategiesAsync(AddBidStrategiesRequest request, AsyncHandler<AddBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class, (r, h) -> fallbackService.get().addBidStrategiesAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateBidStrategiesResponse updateBidStrategies(UpdateBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateBidStrategies(request);
		}
		
		return response;
	}

    public Response<UpdateBidStrategiesResponse> updateBidStrategiesAsync(UpdateBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class, (r, h) -> fallbackService.get().updateBidStrategiesAsync(r, h), null);
	}

	public Future<?> updateBidStrategiesAsync(UpdateBidStrategiesRequest request, AsyncHandler<UpdateBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class, (r, h) -> fallbackService.get().updateBidStrategiesAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteBidStrategiesResponse deleteBidStrategies(DeleteBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteBidStrategies(request);
		}
		
		return response;
	}

    public Response<DeleteBidStrategiesResponse> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class, (r, h) -> fallbackService.get().deleteBidStrategiesAsync(r, h), null);
	}

	public Future<?> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request, AsyncHandler<DeleteBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class, (r, h) -> fallbackService.get().deleteBidStrategiesAsync(r, h), asyncHandler);
	}
	
    	
	public GetBidStrategiesByIdsResponse getBidStrategiesByIds(GetBidStrategiesByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBidStrategiesByIdsResponse response = sendRequest(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getBidStrategiesByIds(request);
		}
		
		return response;
	}

    public Response<GetBidStrategiesByIdsResponse> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request) {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class, (r, h) -> fallbackService.get().getBidStrategiesByIdsAsync(r, h), null);
	}

	public Future<?> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request, AsyncHandler<GetBidStrategiesByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class, (r, h) -> fallbackService.get().getBidStrategiesByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetCampaignIdsByBidStrategyIdsResponse getCampaignIdsByBidStrategyIds(GetCampaignIdsByBidStrategyIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignIdsByBidStrategyIdsResponse response = sendRequest(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getCampaignIdsByBidStrategyIds(request);
		}
		
		return response;
	}

    public Response<GetCampaignIdsByBidStrategyIdsResponse> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class, (r, h) -> fallbackService.get().getCampaignIdsByBidStrategyIdsAsync(r, h), null);
	}

	public Future<?> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request, AsyncHandler<GetCampaignIdsByBidStrategyIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class, (r, h) -> fallbackService.get().getCampaignIdsByBidStrategyIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddAudienceGroupsResponse addAudienceGroups(AddAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAudienceGroups(request);
		}
		
		return response;
	}

    public Response<AddAudienceGroupsResponse> addAudienceGroupsAsync(AddAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class, (r, h) -> fallbackService.get().addAudienceGroupsAsync(r, h), null);
	}

	public Future<?> addAudienceGroupsAsync(AddAudienceGroupsRequest request, AsyncHandler<AddAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class, (r, h) -> fallbackService.get().addAudienceGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAudienceGroupsResponse updateAudienceGroups(UpdateAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAudienceGroups(request);
		}
		
		return response;
	}

    public Response<UpdateAudienceGroupsResponse> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class, (r, h) -> fallbackService.get().updateAudienceGroupsAsync(r, h), null);
	}

	public Future<?> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request, AsyncHandler<UpdateAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class, (r, h) -> fallbackService.get().updateAudienceGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAudienceGroupsResponse deleteAudienceGroups(DeleteAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAudienceGroups(request);
		}
		
		return response;
	}

    public Response<DeleteAudienceGroupsResponse> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class, (r, h) -> fallbackService.get().deleteAudienceGroupsAsync(r, h), null);
	}

	public Future<?> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request, AsyncHandler<DeleteAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class, (r, h) -> fallbackService.get().deleteAudienceGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAudienceGroupsByIdsResponse getAudienceGroupsByIds(GetAudienceGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupsByIdsResponse response = sendRequest(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAudienceGroupsByIds(request);
		}
		
		return response;
	}

    public Response<GetAudienceGroupsByIdsResponse> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupsByIdsAsync(r, h), null);
	}

	public Future<?> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request, AsyncHandler<GetAudienceGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddAssetGroupsResponse addAssetGroups(AddAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAssetGroups(request);
		}
		
		return response;
	}

    public Response<AddAssetGroupsResponse> addAssetGroupsAsync(AddAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class, (r, h) -> fallbackService.get().addAssetGroupsAsync(r, h), null);
	}

	public Future<?> addAssetGroupsAsync(AddAssetGroupsRequest request, AsyncHandler<AddAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class, (r, h) -> fallbackService.get().addAssetGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAssetGroupsResponse updateAssetGroups(UpdateAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAssetGroups(request);
		}
		
		return response;
	}

    public Response<UpdateAssetGroupsResponse> updateAssetGroupsAsync(UpdateAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class, (r, h) -> fallbackService.get().updateAssetGroupsAsync(r, h), null);
	}

	public Future<?> updateAssetGroupsAsync(UpdateAssetGroupsRequest request, AsyncHandler<UpdateAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class, (r, h) -> fallbackService.get().updateAssetGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAssetGroupsResponse deleteAssetGroups(DeleteAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAssetGroups(request);
		}
		
		return response;
	}

    public Response<DeleteAssetGroupsResponse> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class, (r, h) -> fallbackService.get().deleteAssetGroupsAsync(r, h), null);
	}

	public Future<?> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request, AsyncHandler<DeleteAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class, (r, h) -> fallbackService.get().deleteAssetGroupsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAssetGroupsByIdsResponse getAssetGroupsByIds(GetAssetGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsByIdsResponse response = sendRequest(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAssetGroupsByIds(request);
		}
		
		return response;
	}

    public Response<GetAssetGroupsByIdsResponse> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAssetGroupsByIdsAsync(r, h), null);
	}

	public Future<?> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request, AsyncHandler<GetAssetGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class, (r, h) -> fallbackService.get().getAssetGroupsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAssetGroupsByCampaignIdResponse getAssetGroupsByCampaignId(GetAssetGroupsByCampaignIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsByCampaignIdResponse response = sendRequest(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAssetGroupsByCampaignId(request);
		}
		
		return response;
	}

    public Response<GetAssetGroupsByCampaignIdResponse> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request) {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class, (r, h) -> fallbackService.get().getAssetGroupsByCampaignIdAsync(r, h), null);
	}

	public Future<?> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request, AsyncHandler<GetAssetGroupsByCampaignIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class, (r, h) -> fallbackService.get().getAssetGroupsByCampaignIdAsync(r, h), asyncHandler);
	}
	
    	
	public GetAssetGroupsEditorialReasonsResponse getAssetGroupsEditorialReasons(GetAssetGroupsEditorialReasonsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsEditorialReasonsResponse response = sendRequest(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAssetGroupsEditorialReasons(request);
		}
		
		return response;
	}

    public Response<GetAssetGroupsEditorialReasonsResponse> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request) {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class, (r, h) -> fallbackService.get().getAssetGroupsEditorialReasonsAsync(r, h), null);
	}

	public Future<?> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request, AsyncHandler<GetAssetGroupsEditorialReasonsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class, (r, h) -> fallbackService.get().getAssetGroupsEditorialReasonsAsync(r, h), asyncHandler);
	}
	
    	
	public SetAudienceGroupAssetGroupAssociationsResponse setAudienceGroupAssetGroupAssociations(SetAudienceGroupAssetGroupAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetAudienceGroupAssetGroupAssociationsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setAudienceGroupAssetGroupAssociations(request);
		}
		
		return response;
	}

    public Response<SetAudienceGroupAssetGroupAssociationsResponse> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class, (r, h) -> fallbackService.get().setAudienceGroupAssetGroupAssociationsAsync(r, h), null);
	}

	public Future<?> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<SetAudienceGroupAssetGroupAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class, (r, h) -> fallbackService.get().setAudienceGroupAssetGroupAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAudienceGroupAssetGroupAssociationsResponse deleteAudienceGroupAssetGroupAssociations(DeleteAudienceGroupAssetGroupAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudienceGroupAssetGroupAssociationsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAudienceGroupAssetGroupAssociations(request);
		}
		
		return response;
	}

    public Response<DeleteAudienceGroupAssetGroupAssociationsResponse> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class, (r, h) -> fallbackService.get().deleteAudienceGroupAssetGroupAssociationsAsync(r, h), null);
	}

	public Future<?> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<DeleteAudienceGroupAssetGroupAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class, (r, h) -> fallbackService.get().deleteAudienceGroupAssetGroupAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAssetGroupIds(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAudienceGroupAssetGroupAssociationsByAssetGroupIds(request);
		}
		
		return response;
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(r, h), null);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAudienceGroupIds(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAudienceGroupAssetGroupAssociationsByAudienceGroupIds(request);
		}
		
		return response;
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(r, h), null);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class, (r, h) -> fallbackService.get().getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddAudiencesResponse addAudiences(AddAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAudiencesResponse response = sendRequest(request, "/Audiences", HttpPost, AddAudiencesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addAudiences(request);
		}
		
		return response;
	}

    public Response<AddAudiencesResponse> addAudiencesAsync(AddAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class, (r, h) -> fallbackService.get().addAudiencesAsync(r, h), null);
	}

	public Future<?> addAudiencesAsync(AddAudiencesRequest request, AsyncHandler<AddAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class, (r, h) -> fallbackService.get().addAudiencesAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateAudiencesResponse updateAudiences(UpdateAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAudiencesResponse response = sendRequest(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateAudiences(request);
		}
		
		return response;
	}

    public Response<UpdateAudiencesResponse> updateAudiencesAsync(UpdateAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class, (r, h) -> fallbackService.get().updateAudiencesAsync(r, h), null);
	}

	public Future<?> updateAudiencesAsync(UpdateAudiencesRequest request, AsyncHandler<UpdateAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class, (r, h) -> fallbackService.get().updateAudiencesAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteAudiencesResponse deleteAudiences(DeleteAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudiencesResponse response = sendRequest(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteAudiences(request);
		}
		
		return response;
	}

    public Response<DeleteAudiencesResponse> deleteAudiencesAsync(DeleteAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class, (r, h) -> fallbackService.get().deleteAudiencesAsync(r, h), null);
	}

	public Future<?> deleteAudiencesAsync(DeleteAudiencesRequest request, AsyncHandler<DeleteAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class, (r, h) -> fallbackService.get().deleteAudiencesAsync(r, h), asyncHandler);
	}
	
    	
	public GetAudiencesByIdsResponse getAudiencesByIds(GetAudiencesByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudiencesByIdsResponse response = sendRequest(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getAudiencesByIds(request);
		}
		
		return response;
	}

    public Response<GetAudiencesByIdsResponse> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request) {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class, (r, h) -> fallbackService.get().getAudiencesByIdsAsync(r, h), null);
	}

	public Future<?> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request, AsyncHandler<GetAudiencesByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class, (r, h) -> fallbackService.get().getAudiencesByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyCustomerListItemsResponse applyCustomerListItems(ApplyCustomerListItemsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyCustomerListItemsResponse response = sendRequest(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyCustomerListItems(request);
		}
		
		return response;
	}

    public Response<ApplyCustomerListItemsResponse> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request) {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class, (r, h) -> fallbackService.get().applyCustomerListItemsAsync(r, h), null);
	}

	public Future<?> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request, AsyncHandler<ApplyCustomerListItemsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class, (r, h) -> fallbackService.get().applyCustomerListItemsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyCustomerListUserDataResponse applyCustomerListUserData(ApplyCustomerListUserDataRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyCustomerListUserDataResponse response = sendRequest(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyCustomerListUserData(request);
		}
		
		return response;
	}

    public Response<ApplyCustomerListUserDataResponse> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request) {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class, (r, h) -> fallbackService.get().applyCustomerListUserDataAsync(r, h), null);
	}

	public Future<?> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request, AsyncHandler<ApplyCustomerListUserDataResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class, (r, h) -> fallbackService.get().applyCustomerListUserDataAsync(r, h), asyncHandler);
	}
	
    	
	public GetUetTagsByIdsResponse getUetTagsByIds(GetUetTagsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetUetTagsByIdsResponse response = sendRequest(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getUetTagsByIds(request);
		}
		
		return response;
	}

    public Response<GetUetTagsByIdsResponse> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request) {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class, (r, h) -> fallbackService.get().getUetTagsByIdsAsync(r, h), null);
	}

	public Future<?> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request, AsyncHandler<GetUetTagsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class, (r, h) -> fallbackService.get().getUetTagsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddUetTagsResponse addUetTags(AddUetTagsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddUetTagsResponse response = sendRequest(request, "/UetTags", HttpPost, AddUetTagsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addUetTags(request);
		}
		
		return response;
	}

    public Response<AddUetTagsResponse> addUetTagsAsync(AddUetTagsRequest request) {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class, (r, h) -> fallbackService.get().addUetTagsAsync(r, h), null);
	}

	public Future<?> addUetTagsAsync(AddUetTagsRequest request, AsyncHandler<AddUetTagsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class, (r, h) -> fallbackService.get().addUetTagsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateUetTagsResponse updateUetTags(UpdateUetTagsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateUetTagsResponse response = sendRequest(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateUetTags(request);
		}
		
		return response;
	}

    public Response<UpdateUetTagsResponse> updateUetTagsAsync(UpdateUetTagsRequest request) {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class, (r, h) -> fallbackService.get().updateUetTagsAsync(r, h), null);
	}

	public Future<?> updateUetTagsAsync(UpdateUetTagsRequest request, AsyncHandler<UpdateUetTagsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class, (r, h) -> fallbackService.get().updateUetTagsAsync(r, h), asyncHandler);
	}
	
    	
	public GetConversionGoalsByIdsResponse getConversionGoalsByIds(GetConversionGoalsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionGoalsByIdsResponse response = sendRequest(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getConversionGoalsByIds(request);
		}
		
		return response;
	}

    public Response<GetConversionGoalsByIdsResponse> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class, (r, h) -> fallbackService.get().getConversionGoalsByIdsAsync(r, h), null);
	}

	public Future<?> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request, AsyncHandler<GetConversionGoalsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class, (r, h) -> fallbackService.get().getConversionGoalsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(GetConversionGoalsByTagIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionGoalsByTagIdsResponse response = sendRequest(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getConversionGoalsByTagIds(request);
		}
		
		return response;
	}

    public Response<GetConversionGoalsByTagIdsResponse> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class, (r, h) -> fallbackService.get().getConversionGoalsByTagIdsAsync(r, h), null);
	}

	public Future<?> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request, AsyncHandler<GetConversionGoalsByTagIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class, (r, h) -> fallbackService.get().getConversionGoalsByTagIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddConversionGoalsResponse addConversionGoals(AddConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddConversionGoalsResponse response = sendRequest(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addConversionGoals(request);
		}
		
		return response;
	}

    public Response<AddConversionGoalsResponse> addConversionGoalsAsync(AddConversionGoalsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class, (r, h) -> fallbackService.get().addConversionGoalsAsync(r, h), null);
	}

	public Future<?> addConversionGoalsAsync(AddConversionGoalsRequest request, AsyncHandler<AddConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class, (r, h) -> fallbackService.get().addConversionGoalsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateConversionGoalsResponse updateConversionGoals(UpdateConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateConversionGoalsResponse response = sendRequest(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateConversionGoals(request);
		}
		
		return response;
	}

    public Response<UpdateConversionGoalsResponse> updateConversionGoalsAsync(UpdateConversionGoalsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class, (r, h) -> fallbackService.get().updateConversionGoalsAsync(r, h), null);
	}

	public Future<?> updateConversionGoalsAsync(UpdateConversionGoalsRequest request, AsyncHandler<UpdateConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class, (r, h) -> fallbackService.get().updateConversionGoalsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyOfflineConversionsResponse applyOfflineConversions(ApplyOfflineConversionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOfflineConversionsResponse response = sendRequest(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyOfflineConversions(request);
		}
		
		return response;
	}

    public Response<ApplyOfflineConversionsResponse> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request) {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class, (r, h) -> fallbackService.get().applyOfflineConversionsAsync(r, h), null);
	}

	public Future<?> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request, AsyncHandler<ApplyOfflineConversionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class, (r, h) -> fallbackService.get().applyOfflineConversionsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyOfflineConversionAdjustmentsResponse applyOfflineConversionAdjustments(ApplyOfflineConversionAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOfflineConversionAdjustmentsResponse response = sendRequest(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyOfflineConversionAdjustments(request);
		}
		
		return response;
	}

    public Response<ApplyOfflineConversionAdjustmentsResponse> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request) {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class, (r, h) -> fallbackService.get().applyOfflineConversionAdjustmentsAsync(r, h), null);
	}

	public Future<?> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request, AsyncHandler<ApplyOfflineConversionAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class, (r, h) -> fallbackService.get().applyOfflineConversionAdjustmentsAsync(r, h), asyncHandler);
	}
	
    	
	public ApplyOnlineConversionAdjustmentsResponse applyOnlineConversionAdjustments(ApplyOnlineConversionAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOnlineConversionAdjustmentsResponse response = sendRequest(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().applyOnlineConversionAdjustments(request);
		}
		
		return response;
	}

    public Response<ApplyOnlineConversionAdjustmentsResponse> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request) {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class, (r, h) -> fallbackService.get().applyOnlineConversionAdjustmentsAsync(r, h), null);
	}

	public Future<?> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request, AsyncHandler<ApplyOnlineConversionAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class, (r, h) -> fallbackService.get().applyOnlineConversionAdjustmentsAsync(r, h), asyncHandler);
	}
	
    	
	public AddLabelsResponse addLabels(AddLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddLabelsResponse response = sendRequest(request, "/Labels", HttpPost, AddLabelsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addLabels(request);
		}
		
		return response;
	}

    public Response<AddLabelsResponse> addLabelsAsync(AddLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class, (r, h) -> fallbackService.get().addLabelsAsync(r, h), null);
	}

	public Future<?> addLabelsAsync(AddLabelsRequest request, AsyncHandler<AddLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class, (r, h) -> fallbackService.get().addLabelsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteLabelsResponse response = sendRequest(request, "/Labels", HttpDelete, DeleteLabelsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteLabels(request);
		}
		
		return response;
	}

    public Response<DeleteLabelsResponse> deleteLabelsAsync(DeleteLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class, (r, h) -> fallbackService.get().deleteLabelsAsync(r, h), null);
	}

	public Future<?> deleteLabelsAsync(DeleteLabelsRequest request, AsyncHandler<DeleteLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class, (r, h) -> fallbackService.get().deleteLabelsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateLabelsResponse updateLabels(UpdateLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateLabelsResponse response = sendRequest(request, "/Labels", HttpPut, UpdateLabelsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateLabels(request);
		}
		
		return response;
	}

    public Response<UpdateLabelsResponse> updateLabelsAsync(UpdateLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class, (r, h) -> fallbackService.get().updateLabelsAsync(r, h), null);
	}

	public Future<?> updateLabelsAsync(UpdateLabelsRequest request, AsyncHandler<UpdateLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class, (r, h) -> fallbackService.get().updateLabelsAsync(r, h), asyncHandler);
	}
	
    	
	public GetLabelsByIdsResponse getLabelsByIds(GetLabelsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelsByIdsResponse response = sendRequest(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getLabelsByIds(request);
		}
		
		return response;
	}

    public Response<GetLabelsByIdsResponse> getLabelsByIdsAsync(GetLabelsByIdsRequest request) {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class, (r, h) -> fallbackService.get().getLabelsByIdsAsync(r, h), null);
	}

	public Future<?> getLabelsByIdsAsync(GetLabelsByIdsRequest request, AsyncHandler<GetLabelsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class, (r, h) -> fallbackService.get().getLabelsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public SetLabelAssociationsResponse setLabelAssociations(SetLabelAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetLabelAssociationsResponse response = sendRequest(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().setLabelAssociations(request);
		}
		
		return response;
	}

    public Response<SetLabelAssociationsResponse> setLabelAssociationsAsync(SetLabelAssociationsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class, (r, h) -> fallbackService.get().setLabelAssociationsAsync(r, h), null);
	}

	public Future<?> setLabelAssociationsAsync(SetLabelAssociationsRequest request, AsyncHandler<SetLabelAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class, (r, h) -> fallbackService.get().setLabelAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteLabelAssociationsResponse deleteLabelAssociations(DeleteLabelAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteLabelAssociationsResponse response = sendRequest(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteLabelAssociations(request);
		}
		
		return response;
	}

    public Response<DeleteLabelAssociationsResponse> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class, (r, h) -> fallbackService.get().deleteLabelAssociationsAsync(r, h), null);
	}

	public Future<?> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request, AsyncHandler<DeleteLabelAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class, (r, h) -> fallbackService.get().deleteLabelAssociationsAsync(r, h), asyncHandler);
	}
	
    	
	public GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(GetLabelAssociationsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelAssociationsByEntityIdsResponse response = sendRequest(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getLabelAssociationsByEntityIds(request);
		}
		
		return response;
	}

    public Response<GetLabelAssociationsByEntityIdsResponse> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getLabelAssociationsByEntityIdsAsync(r, h), null);
	}

	public Future<?> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request, AsyncHandler<GetLabelAssociationsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class, (r, h) -> fallbackService.get().getLabelAssociationsByEntityIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(GetLabelAssociationsByLabelIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelAssociationsByLabelIdsResponse response = sendRequest(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getLabelAssociationsByLabelIds(request);
		}
		
		return response;
	}

    public Response<GetLabelAssociationsByLabelIdsResponse> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class, (r, h) -> fallbackService.get().getLabelAssociationsByLabelIdsAsync(r, h), null);
	}

	public Future<?> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request, AsyncHandler<GetLabelAssociationsByLabelIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class, (r, h) -> fallbackService.get().getLabelAssociationsByLabelIdsAsync(r, h), asyncHandler);
	}
	
    	
	public AddExperimentsResponse addExperiments(AddExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddExperimentsResponse response = sendRequest(request, "/Experiments", HttpPost, AddExperimentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addExperiments(request);
		}
		
		return response;
	}

    public Response<AddExperimentsResponse> addExperimentsAsync(AddExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class, (r, h) -> fallbackService.get().addExperimentsAsync(r, h), null);
	}

	public Future<?> addExperimentsAsync(AddExperimentsRequest request, AsyncHandler<AddExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class, (r, h) -> fallbackService.get().addExperimentsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteExperimentsResponse deleteExperiments(DeleteExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteExperimentsResponse response = sendRequest(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteExperiments(request);
		}
		
		return response;
	}

    public Response<DeleteExperimentsResponse> deleteExperimentsAsync(DeleteExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class, (r, h) -> fallbackService.get().deleteExperimentsAsync(r, h), null);
	}

	public Future<?> deleteExperimentsAsync(DeleteExperimentsRequest request, AsyncHandler<DeleteExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class, (r, h) -> fallbackService.get().deleteExperimentsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateExperimentsResponse updateExperiments(UpdateExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateExperimentsResponse response = sendRequest(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateExperiments(request);
		}
		
		return response;
	}

    public Response<UpdateExperimentsResponse> updateExperimentsAsync(UpdateExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class, (r, h) -> fallbackService.get().updateExperimentsAsync(r, h), null);
	}

	public Future<?> updateExperimentsAsync(UpdateExperimentsRequest request, AsyncHandler<UpdateExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class, (r, h) -> fallbackService.get().updateExperimentsAsync(r, h), asyncHandler);
	}
	
    	
	public GetExperimentsByIdsResponse getExperimentsByIds(GetExperimentsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetExperimentsByIdsResponse response = sendRequest(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getExperimentsByIds(request);
		}
		
		return response;
	}

    public Response<GetExperimentsByIdsResponse> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request) {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class, (r, h) -> fallbackService.get().getExperimentsByIdsAsync(r, h), null);
	}

	public Future<?> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request, AsyncHandler<GetExperimentsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class, (r, h) -> fallbackService.get().getExperimentsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetProfileDataFileUrlResponse getProfileDataFileUrl(GetProfileDataFileUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetProfileDataFileUrlResponse response = sendRequest(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getProfileDataFileUrl(request);
		}
		
		return response;
	}

    public Response<GetProfileDataFileUrlResponse> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request) {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class, (r, h) -> fallbackService.get().getProfileDataFileUrlAsync(r, h), null);
	}

	public Future<?> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request, AsyncHandler<GetProfileDataFileUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class, (r, h) -> fallbackService.get().getProfileDataFileUrlAsync(r, h), asyncHandler);
	}
	
    	
	public SearchCompaniesResponse searchCompanies(SearchCompaniesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SearchCompaniesResponse response = sendRequest(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class);
		
		if (response == null) {
			response = fallbackService.get().searchCompanies(request);
		}
		
		return response;
	}

    public Response<SearchCompaniesResponse> searchCompaniesAsync(SearchCompaniesRequest request) {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class, (r, h) -> fallbackService.get().searchCompaniesAsync(r, h), null);
	}

	public Future<?> searchCompaniesAsync(SearchCompaniesRequest request, AsyncHandler<SearchCompaniesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class, (r, h) -> fallbackService.get().searchCompaniesAsync(r, h), asyncHandler);
	}
	
    	
	public GetFileImportUploadUrlResponse getFileImportUploadUrl(GetFileImportUploadUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetFileImportUploadUrlResponse response = sendRequest(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getFileImportUploadUrl(request);
		}
		
		return response;
	}

    public Response<GetFileImportUploadUrlResponse> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request) {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class, (r, h) -> fallbackService.get().getFileImportUploadUrlAsync(r, h), null);
	}

	public Future<?> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request, AsyncHandler<GetFileImportUploadUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class, (r, h) -> fallbackService.get().getFileImportUploadUrlAsync(r, h), asyncHandler);
	}
	
    	
	public AddImportJobsResponse addImportJobs(AddImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addImportJobs(request);
		}
		
		return response;
	}

    public Response<AddImportJobsResponse> addImportJobsAsync(AddImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class, (r, h) -> fallbackService.get().addImportJobsAsync(r, h), null);
	}

	public Future<?> addImportJobsAsync(AddImportJobsRequest request, AsyncHandler<AddImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class, (r, h) -> fallbackService.get().addImportJobsAsync(r, h), asyncHandler);
	}
	
    	
	public GetImportResultsResponse getImportResults(GetImportResultsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportResultsResponse response = sendRequest(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getImportResults(request);
		}
		
		return response;
	}

    public Response<GetImportResultsResponse> getImportResultsAsync(GetImportResultsRequest request) {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class, (r, h) -> fallbackService.get().getImportResultsAsync(r, h), null);
	}

	public Future<?> getImportResultsAsync(GetImportResultsRequest request, AsyncHandler<GetImportResultsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class, (r, h) -> fallbackService.get().getImportResultsAsync(r, h), asyncHandler);
	}
	
    	
	public GetImportJobsByIdsResponse getImportJobsByIds(GetImportJobsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportJobsByIdsResponse response = sendRequest(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getImportJobsByIds(request);
		}
		
		return response;
	}

    public Response<GetImportJobsByIdsResponse> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request) {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class, (r, h) -> fallbackService.get().getImportJobsByIdsAsync(r, h), null);
	}

	public Future<?> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request, AsyncHandler<GetImportJobsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class, (r, h) -> fallbackService.get().getImportJobsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteImportJobsResponse deleteImportJobs(DeleteImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteImportJobs(request);
		}
		
		return response;
	}

    public Response<DeleteImportJobsResponse> deleteImportJobsAsync(DeleteImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class, (r, h) -> fallbackService.get().deleteImportJobsAsync(r, h), null);
	}

	public Future<?> deleteImportJobsAsync(DeleteImportJobsRequest request, AsyncHandler<DeleteImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class, (r, h) -> fallbackService.get().deleteImportJobsAsync(r, h), asyncHandler);
	}
	
    	
	public GetImportEntityIdsMappingResponse getImportEntityIdsMapping(GetImportEntityIdsMappingRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportEntityIdsMappingResponse response = sendRequest(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getImportEntityIdsMapping(request);
		}
		
		return response;
	}

    public Response<GetImportEntityIdsMappingResponse> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request) {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class, (r, h) -> fallbackService.get().getImportEntityIdsMappingAsync(r, h), null);
	}

	public Future<?> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request, AsyncHandler<GetImportEntityIdsMappingResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class, (r, h) -> fallbackService.get().getImportEntityIdsMappingAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateImportJobsResponse updateImportJobs(UpdateImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateImportJobs(request);
		}
		
		return response;
	}

    public Response<UpdateImportJobsResponse> updateImportJobsAsync(UpdateImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class, (r, h) -> fallbackService.get().updateImportJobsAsync(r, h), null);
	}

	public Future<?> updateImportJobsAsync(UpdateImportJobsRequest request, AsyncHandler<UpdateImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class, (r, h) -> fallbackService.get().updateImportJobsAsync(r, h), asyncHandler);
	}
	
    	
	public AddVideosResponse addVideos(AddVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddVideosResponse response = sendRequest(request, "/Videos", HttpPost, AddVideosResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addVideos(request);
		}
		
		return response;
	}

    public Response<AddVideosResponse> addVideosAsync(AddVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class, (r, h) -> fallbackService.get().addVideosAsync(r, h), null);
	}

	public Future<?> addVideosAsync(AddVideosRequest request, AsyncHandler<AddVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class, (r, h) -> fallbackService.get().addVideosAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteVideosResponse deleteVideos(DeleteVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteVideosResponse response = sendRequest(request, "/Videos", HttpDelete, DeleteVideosResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteVideos(request);
		}
		
		return response;
	}

    public Response<DeleteVideosResponse> deleteVideosAsync(DeleteVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class, (r, h) -> fallbackService.get().deleteVideosAsync(r, h), null);
	}

	public Future<?> deleteVideosAsync(DeleteVideosRequest request, AsyncHandler<DeleteVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class, (r, h) -> fallbackService.get().deleteVideosAsync(r, h), asyncHandler);
	}
	
    	
	public GetVideosByIdsResponse getVideosByIds(GetVideosByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetVideosByIdsResponse response = sendRequest(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getVideosByIds(request);
		}
		
		return response;
	}

    public Response<GetVideosByIdsResponse> getVideosByIdsAsync(GetVideosByIdsRequest request) {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class, (r, h) -> fallbackService.get().getVideosByIdsAsync(r, h), null);
	}

	public Future<?> getVideosByIdsAsync(GetVideosByIdsRequest request, AsyncHandler<GetVideosByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class, (r, h) -> fallbackService.get().getVideosByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateVideosResponse updateVideos(UpdateVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateVideosResponse response = sendRequest(request, "/Videos", HttpPut, UpdateVideosResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateVideos(request);
		}
		
		return response;
	}

    public Response<UpdateVideosResponse> updateVideosAsync(UpdateVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class, (r, h) -> fallbackService.get().updateVideosAsync(r, h), null);
	}

	public Future<?> updateVideosAsync(UpdateVideosRequest request, AsyncHandler<UpdateVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class, (r, h) -> fallbackService.get().updateVideosAsync(r, h), asyncHandler);
	}
	
    	
	public AddCampaignConversionGoalsResponse addCampaignConversionGoals(AddCampaignConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignConversionGoalsResponse response = sendRequest(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addCampaignConversionGoals(request);
		}
		
		return response;
	}

    public Response<AddCampaignConversionGoalsResponse> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class, (r, h) -> fallbackService.get().addCampaignConversionGoalsAsync(r, h), null);
	}

	public Future<?> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request, AsyncHandler<AddCampaignConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class, (r, h) -> fallbackService.get().addCampaignConversionGoalsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteCampaignConversionGoalsResponse deleteCampaignConversionGoals(DeleteCampaignConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignConversionGoalsResponse response = sendRequest(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteCampaignConversionGoals(request);
		}
		
		return response;
	}

    public Response<DeleteCampaignConversionGoalsResponse> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class, (r, h) -> fallbackService.get().deleteCampaignConversionGoalsAsync(r, h), null);
	}

	public Future<?> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request, AsyncHandler<DeleteCampaignConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class, (r, h) -> fallbackService.get().deleteCampaignConversionGoalsAsync(r, h), asyncHandler);
	}
	
    	
	public AddDataExclusionsResponse addDataExclusions(AddDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addDataExclusions(request);
		}
		
		return response;
	}

    public Response<AddDataExclusionsResponse> addDataExclusionsAsync(AddDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class, (r, h) -> fallbackService.get().addDataExclusionsAsync(r, h), null);
	}

	public Future<?> addDataExclusionsAsync(AddDataExclusionsRequest request, AsyncHandler<AddDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class, (r, h) -> fallbackService.get().addDataExclusionsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateDataExclusionsResponse updateDataExclusions(UpdateDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateDataExclusions(request);
		}
		
		return response;
	}

    public Response<UpdateDataExclusionsResponse> updateDataExclusionsAsync(UpdateDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class, (r, h) -> fallbackService.get().updateDataExclusionsAsync(r, h), null);
	}

	public Future<?> updateDataExclusionsAsync(UpdateDataExclusionsRequest request, AsyncHandler<UpdateDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class, (r, h) -> fallbackService.get().updateDataExclusionsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteDataExclusionsResponse deleteDataExclusions(DeleteDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteDataExclusions(request);
		}
		
		return response;
	}

    public Response<DeleteDataExclusionsResponse> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class, (r, h) -> fallbackService.get().deleteDataExclusionsAsync(r, h), null);
	}

	public Future<?> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request, AsyncHandler<DeleteDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class, (r, h) -> fallbackService.get().deleteDataExclusionsAsync(r, h), asyncHandler);
	}
	
    	
	public GetDataExclusionsByIdsResponse getDataExclusionsByIds(GetDataExclusionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDataExclusionsByIdsResponse response = sendRequest(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getDataExclusionsByIds(request);
		}
		
		return response;
	}

    public Response<GetDataExclusionsByIdsResponse> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request) {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class, (r, h) -> fallbackService.get().getDataExclusionsByIdsAsync(r, h), null);
	}

	public Future<?> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request, AsyncHandler<GetDataExclusionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class, (r, h) -> fallbackService.get().getDataExclusionsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetDataExclusionsByAccountIdResponse getDataExclusionsByAccountId(GetDataExclusionsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDataExclusionsByAccountIdResponse response = sendRequest(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getDataExclusionsByAccountId(request);
		}
		
		return response;
	}

    public Response<GetDataExclusionsByAccountIdResponse> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request) {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class, (r, h) -> fallbackService.get().getDataExclusionsByAccountIdAsync(r, h), null);
	}

	public Future<?> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request, AsyncHandler<GetDataExclusionsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class, (r, h) -> fallbackService.get().getDataExclusionsByAccountIdAsync(r, h), asyncHandler);
	}
	
    	
	public AddSeasonalityAdjustmentsResponse addSeasonalityAdjustments(AddSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().addSeasonalityAdjustments(request);
		}
		
		return response;
	}

    public Response<AddSeasonalityAdjustmentsResponse> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().addSeasonalityAdjustmentsAsync(r, h), null);
	}

	public Future<?> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request, AsyncHandler<AddSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().addSeasonalityAdjustmentsAsync(r, h), asyncHandler);
	}
	
    	
	public UpdateSeasonalityAdjustmentsResponse updateSeasonalityAdjustments(UpdateSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().updateSeasonalityAdjustments(request);
		}
		
		return response;
	}

    public Response<UpdateSeasonalityAdjustmentsResponse> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().updateSeasonalityAdjustmentsAsync(r, h), null);
	}

	public Future<?> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request, AsyncHandler<UpdateSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().updateSeasonalityAdjustmentsAsync(r, h), asyncHandler);
	}
	
    	
	public DeleteSeasonalityAdjustmentsResponse deleteSeasonalityAdjustments(DeleteSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().deleteSeasonalityAdjustments(request);
		}
		
		return response;
	}

    public Response<DeleteSeasonalityAdjustmentsResponse> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().deleteSeasonalityAdjustmentsAsync(r, h), null);
	}

	public Future<?> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request, AsyncHandler<DeleteSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class, (r, h) -> fallbackService.get().deleteSeasonalityAdjustmentsAsync(r, h), asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByIdsResponse getSeasonalityAdjustmentsByIds(GetSeasonalityAdjustmentsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSeasonalityAdjustmentsByIdsResponse response = sendRequest(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSeasonalityAdjustmentsByIds(request);
		}
		
		return response;
	}

    public Response<GetSeasonalityAdjustmentsByIdsResponse> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class, (r, h) -> fallbackService.get().getSeasonalityAdjustmentsByIdsAsync(r, h), null);
	}

	public Future<?> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request, AsyncHandler<GetSeasonalityAdjustmentsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class, (r, h) -> fallbackService.get().getSeasonalityAdjustmentsByIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByAccountIdResponse getSeasonalityAdjustmentsByAccountId(GetSeasonalityAdjustmentsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSeasonalityAdjustmentsByAccountIdResponse response = sendRequest(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class);
		
		if (response == null) {
			response = fallbackService.get().getSeasonalityAdjustmentsByAccountId(request);
		}
		
		return response;
	}

    public Response<GetSeasonalityAdjustmentsByAccountIdResponse> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class, (r, h) -> fallbackService.get().getSeasonalityAdjustmentsByAccountIdAsync(r, h), null);
	}

	public Future<?> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request, AsyncHandler<GetSeasonalityAdjustmentsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class, (r, h) -> fallbackService.get().getSeasonalityAdjustmentsByAccountIdAsync(r, h), asyncHandler);
	}
	
    }