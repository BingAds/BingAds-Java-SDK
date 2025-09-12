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

	public CampaignManagementService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env, ICampaignManagementService.class);
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

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), handler);
	}
		
	public AddCampaignsResponse addCampaigns(AddCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignsResponse response = sendRequest(request, "/Campaigns", HttpPost, AddCampaignsResponse.class);
		
		return response;
	}

    public Response<AddCampaignsResponse> addCampaignsAsync(AddCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class, null);
	}

	public Future<?> addCampaignsAsync(AddCampaignsRequest request, AsyncHandler<AddCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignsByAccountIdResponse getCampaignsByAccountId(GetCampaignsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignsByAccountIdResponse response = sendRequest(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetCampaignsByAccountIdResponse> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request) {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class, null);
	}

	public Future<?> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request, AsyncHandler<GetCampaignsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignsByIdsResponse getCampaignsByIds(GetCampaignsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignsByIdsResponse response = sendRequest(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class);
		
		return response;
	}

    public Response<GetCampaignsByIdsResponse> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request) {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class, null);
	}

	public Future<?> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request, AsyncHandler<GetCampaignsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignsResponse deleteCampaigns(DeleteCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignsResponse response = sendRequest(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class);
		
		return response;
	}

    public Response<DeleteCampaignsResponse> deleteCampaignsAsync(DeleteCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class, null);
	}

	public Future<?> deleteCampaignsAsync(DeleteCampaignsRequest request, AsyncHandler<DeleteCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class, asyncHandler);
	}
	
    	
	public UpdateCampaignsResponse updateCampaigns(UpdateCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateCampaignsResponse response = sendRequest(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class);
		
		return response;
	}

    public Response<UpdateCampaignsResponse> updateCampaignsAsync(UpdateCampaignsRequest request) {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class, null);
	}

	public Future<?> updateCampaignsAsync(UpdateCampaignsRequest request, AsyncHandler<UpdateCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(GetNegativeSitesByCampaignIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeSitesByCampaignIdsResponse response = sendRequest(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class);
		
		return response;
	}

    public Response<GetNegativeSitesByCampaignIdsResponse> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class, null);
	}

	public Future<?> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request, AsyncHandler<GetNegativeSitesByCampaignIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class, asyncHandler);
	}
	
    	
	public SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(SetNegativeSitesToCampaignsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetNegativeSitesToCampaignsResponse response = sendRequest(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class);
		
		return response;
	}

    public Response<SetNegativeSitesToCampaignsResponse> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class, null);
	}

	public Future<?> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request, AsyncHandler<SetNegativeSitesToCampaignsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetConfigValueResponse getConfigValue(GetConfigValueRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConfigValueResponse response = sendRequest(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class);
		
		return response;
	}

    public Response<GetConfigValueResponse> getConfigValueAsync(GetConfigValueRequest request) {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class, null);
	}

	public Future<?> getConfigValueAsync(GetConfigValueRequest request, AsyncHandler<GetConfigValueResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class, asyncHandler);
	}
	
    	
	public GetBSCCountriesResponse getBSCCountries(GetBSCCountriesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBSCCountriesResponse response = sendRequest(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class);
		
		return response;
	}

    public Response<GetBSCCountriesResponse> getBSCCountriesAsync(GetBSCCountriesRequest request) {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class, null);
	}

	public Future<?> getBSCCountriesAsync(GetBSCCountriesRequest request, AsyncHandler<GetBSCCountriesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class, asyncHandler);
	}
	
    	
	public AddAdGroupsResponse addAdGroups(AddAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class);
		
		return response;
	}

    public Response<AddAdGroupsResponse> addAdGroupsAsync(AddAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class, null);
	}

	public Future<?> addAdGroupsAsync(AddAdGroupsRequest request, AsyncHandler<AddAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdGroupsResponse deleteAdGroups(DeleteAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class);
		
		return response;
	}

    public Response<DeleteAdGroupsResponse> deleteAdGroupsAsync(DeleteAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class, null);
	}

	public Future<?> deleteAdGroupsAsync(DeleteAdGroupsRequest request, AsyncHandler<DeleteAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupsByIdsResponse getAdGroupsByIds(GetAdGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupsByIdsResponse response = sendRequest(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAdGroupsByIdsResponse> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class, null);
	}

	public Future<?> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request, AsyncHandler<GetAdGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(GetAdGroupsByCampaignIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupsByCampaignIdResponse response = sendRequest(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class);
		
		return response;
	}

    public Response<GetAdGroupsByCampaignIdResponse> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request) {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class, null);
	}

	public Future<?> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request, AsyncHandler<GetAdGroupsByCampaignIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdGroupsResponse updateAdGroups(UpdateAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAdGroupsResponse response = sendRequest(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class);
		
		return response;
	}

    public Response<UpdateAdGroupsResponse> updateAdGroupsAsync(UpdateAdGroupsRequest request) {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class, null);
	}

	public Future<?> updateAdGroupsAsync(UpdateAdGroupsRequest request, AsyncHandler<UpdateAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(GetNegativeSitesByAdGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeSitesByAdGroupIdsResponse response = sendRequest(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class);
		
		return response;
	}

    public Response<GetNegativeSitesByAdGroupIdsResponse> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class, null);
	}

	public Future<?> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request, AsyncHandler<GetNegativeSitesByAdGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(SetNegativeSitesToAdGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetNegativeSitesToAdGroupsResponse response = sendRequest(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class);
		
		return response;
	}

    public Response<SetNegativeSitesToAdGroupsResponse> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request) {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class, null);
	}

	public Future<?> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request, AsyncHandler<SetNegativeSitesToAdGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(GetGeoLocationsFileUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetGeoLocationsFileUrlResponse response = sendRequest(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class);
		
		return response;
	}

    public Response<GetGeoLocationsFileUrlResponse> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request) {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class, null);
	}

	public Future<?> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request, AsyncHandler<GetGeoLocationsFileUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class, asyncHandler);
	}
	
    	
	public AddAdsResponse addAds(AddAdsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddAdsResponse response = sendRequestEditorialFault(request, "/Ads", HttpPost, AddAdsResponse.class);
		
		return response;
	}

    public Response<AddAdsResponse> addAdsAsync(AddAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class, null);
	}

	public Future<?> addAdsAsync(AddAdsRequest request, AsyncHandler<AddAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdsResponse deleteAds(DeleteAdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdsResponse response = sendRequest(request, "/Ads", HttpDelete, DeleteAdsResponse.class);
		
		return response;
	}

    public Response<DeleteAdsResponse> deleteAdsAsync(DeleteAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class, null);
	}

	public Future<?> deleteAdsAsync(DeleteAdsRequest request, AsyncHandler<DeleteAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByEditorialStatusResponse getAdsByEditorialStatus(GetAdsByEditorialStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByEditorialStatusResponse response = sendRequest(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class);
		
		return response;
	}

    public Response<GetAdsByEditorialStatusResponse> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class, null);
	}

	public Future<?> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request, AsyncHandler<GetAdsByEditorialStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByIdsResponse getAdsByIds(GetAdsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByIdsResponse response = sendRequest(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAdsByIdsResponse> getAdsByIdsAsync(GetAdsByIdsRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class, null);
	}

	public Future<?> getAdsByIdsAsync(GetAdsByIdsRequest request, AsyncHandler<GetAdsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByAdGroupIdResponse getAdsByAdGroupId(GetAdsByAdGroupIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdsByAdGroupIdResponse response = sendRequest(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class);
		
		return response;
	}

    public Response<GetAdsByAdGroupIdResponse> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request) {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class, null);
	}

	public Future<?> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request, AsyncHandler<GetAdsByAdGroupIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdsResponse updateAds(UpdateAdsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdsResponse response = sendRequestEditorialFault(request, "/Ads", HttpPut, UpdateAdsResponse.class);
		
		return response;
	}

    public Response<UpdateAdsResponse> updateAdsAsync(UpdateAdsRequest request) {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class, null);
	}

	public Future<?> updateAdsAsync(UpdateAdsRequest request, AsyncHandler<UpdateAdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class, asyncHandler);
	}
	
    	
	public AddKeywordsResponse addKeywords(AddKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddKeywordsResponse response = sendRequestEditorialFault(request, "/Keywords", HttpPost, AddKeywordsResponse.class);
		
		return response;
	}

    public Response<AddKeywordsResponse> addKeywordsAsync(AddKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class, null);
	}

	public Future<?> addKeywordsAsync(AddKeywordsRequest request, AsyncHandler<AddKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class, asyncHandler);
	}
	
    	
	public DeleteKeywordsResponse deleteKeywords(DeleteKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteKeywordsResponse response = sendRequest(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class);
		
		return response;
	}

    public Response<DeleteKeywordsResponse> deleteKeywordsAsync(DeleteKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class, null);
	}

	public Future<?> deleteKeywordsAsync(DeleteKeywordsRequest request, AsyncHandler<DeleteKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(GetKeywordsByEditorialStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByEditorialStatusResponse response = sendRequest(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class);
		
		return response;
	}

    public Response<GetKeywordsByEditorialStatusResponse> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class, null);
	}

	public Future<?> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request, AsyncHandler<GetKeywordsByEditorialStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByIdsResponse getKeywordsByIds(GetKeywordsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByIdsResponse response = sendRequest(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class);
		
		return response;
	}

    public Response<GetKeywordsByIdsResponse> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class, null);
	}

	public Future<?> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request, AsyncHandler<GetKeywordsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(GetKeywordsByAdGroupIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetKeywordsByAdGroupIdResponse response = sendRequest(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class);
		
		return response;
	}

    public Response<GetKeywordsByAdGroupIdResponse> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request) {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class, null);
	}

	public Future<?> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request, AsyncHandler<GetKeywordsByAdGroupIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateKeywordsResponse updateKeywords(UpdateKeywordsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateKeywordsResponse response = sendRequestEditorialFault(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class);
		
		return response;
	}

    public Response<UpdateKeywordsResponse> updateKeywordsAsync(UpdateKeywordsRequest request) {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class, null);
	}

	public Future<?> updateKeywordsAsync(UpdateKeywordsRequest request, AsyncHandler<UpdateKeywordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class, asyncHandler);
	}
	
    	
	public AppealEditorialRejectionsResponse appealEditorialRejections(AppealEditorialRejectionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AppealEditorialRejectionsResponse response = sendRequest(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class);
		
		return response;
	}

    public Response<AppealEditorialRejectionsResponse> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request) {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class, null);
	}

	public Future<?> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request, AsyncHandler<AppealEditorialRejectionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class, asyncHandler);
	}
	
    	
	public GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(GetEditorialReasonsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetEditorialReasonsByIdsResponse response = sendRequest(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class);
		
		return response;
	}

    public Response<GetEditorialReasonsByIdsResponse> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request) {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class, null);
	}

	public Future<?> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request, AsyncHandler<GetEditorialReasonsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAccountMigrationStatusesResponse getAccountMigrationStatuses(GetAccountMigrationStatusesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAccountMigrationStatusesResponse response = sendRequest(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class);
		
		return response;
	}

    public Response<GetAccountMigrationStatusesResponse> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request) {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class, null);
	}

	public Future<?> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request, AsyncHandler<GetAccountMigrationStatusesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class, asyncHandler);
	}
	
    	
	public SetAccountPropertiesResponse setAccountProperties(SetAccountPropertiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetAccountPropertiesResponse response = sendRequest(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class);
		
		return response;
	}

    public Response<SetAccountPropertiesResponse> setAccountPropertiesAsync(SetAccountPropertiesRequest request) {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class, null);
	}

	public Future<?> setAccountPropertiesAsync(SetAccountPropertiesRequest request, AsyncHandler<SetAccountPropertiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class, asyncHandler);
	}
	
    	
	public GetAccountPropertiesResponse getAccountProperties(GetAccountPropertiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAccountPropertiesResponse response = sendRequest(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class);
		
		return response;
	}

    public Response<GetAccountPropertiesResponse> getAccountPropertiesAsync(GetAccountPropertiesRequest request) {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class, null);
	}

	public Future<?> getAccountPropertiesAsync(GetAccountPropertiesRequest request, AsyncHandler<GetAccountPropertiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class, asyncHandler);
	}
	
    	
	public AddAdExtensionsResponse addAdExtensions(AddAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAdExtensionsResponse response = sendRequest(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class);
		
		return response;
	}

    public Response<AddAdExtensionsResponse> addAdExtensionsAsync(AddAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class, null);
	}

	public Future<?> addAdExtensionsAsync(AddAdExtensionsRequest request, AsyncHandler<AddAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsByIdsResponse getAdExtensionsByIds(GetAdExtensionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsByIdsResponse response = sendRequest(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAdExtensionsByIdsResponse> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request) {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class, null);
	}

	public Future<?> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request, AsyncHandler<GetAdExtensionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdExtensionsResponse updateAdExtensions(UpdateAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdExtensionsResponse response = sendRequestEditorialFault(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class);
		
		return response;
	}

    public Response<UpdateAdExtensionsResponse> updateAdExtensionsAsync(UpdateAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class, null);
	}

	public Future<?> updateAdExtensionsAsync(UpdateAdExtensionsRequest request, AsyncHandler<UpdateAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdExtensionsResponse deleteAdExtensions(DeleteAdExtensionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdExtensionsResponse response = sendRequest(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class);
		
		return response;
	}

    public Response<DeleteAdExtensionsResponse> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request) {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class, null);
	}

	public Future<?> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request, AsyncHandler<DeleteAdExtensionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(GetAdExtensionsEditorialReasonsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsEditorialReasonsResponse response = sendRequest(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class);
		
		return response;
	}

    public Response<GetAdExtensionsEditorialReasonsResponse> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class, null);
	}

	public Future<?> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request, AsyncHandler<GetAdExtensionsEditorialReasonsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class, asyncHandler);
	}
	
    	
	public SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(SetAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		SetAdExtensionsAssociationsResponse response = sendRequestEditorialFault(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class);
		
		return response;
	}

    public Response<SetAdExtensionsAssociationsResponse> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class, null);
	}

	public Future<?> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request, AsyncHandler<SetAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(GetAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionsAssociationsResponse response = sendRequest(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class);
		
		return response;
	}

    public Response<GetAdExtensionsAssociationsResponse> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class, null);
	}

	public Future<?> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request, AsyncHandler<GetAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(DeleteAdExtensionsAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdExtensionsAssociationsResponse response = sendRequest(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class);
		
		return response;
	}

    public Response<DeleteAdExtensionsAssociationsResponse> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request) {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class, null);
	}

	public Future<?> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request, AsyncHandler<DeleteAdExtensionsAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(GetAdExtensionIdsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdExtensionIdsByAccountIdResponse response = sendRequest(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetAdExtensionIdsByAccountIdResponse> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request) {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class, null);
	}

	public Future<?> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request, AsyncHandler<GetAdExtensionIdsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddMediaResponse addMedia(AddMediaRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddMediaResponse response = sendRequest(request, "/Media", HttpPost, AddMediaResponse.class);
		
		return response;
	}

    public Response<AddMediaResponse> addMediaAsync(AddMediaRequest request) {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class, null);
	}

	public Future<?> addMediaAsync(AddMediaRequest request, AsyncHandler<AddMediaResponse> asyncHandler) {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class, asyncHandler);
	}
	
    	
	public DeleteMediaResponse deleteMedia(DeleteMediaRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteMediaResponse response = sendRequest(request, "/Media", HttpDelete, DeleteMediaResponse.class);
		
		return response;
	}

    public Response<DeleteMediaResponse> deleteMediaAsync(DeleteMediaRequest request) {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class, null);
	}

	public Future<?> deleteMediaAsync(DeleteMediaRequest request, AsyncHandler<DeleteMediaResponse> asyncHandler) {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class, asyncHandler);
	}
	
    	
	public GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(GetMediaMetaDataByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaMetaDataByAccountIdResponse response = sendRequest(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetMediaMetaDataByAccountIdResponse> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class, null);
	}

	public Future<?> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request, AsyncHandler<GetMediaMetaDataByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(GetMediaMetaDataByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaMetaDataByIdsResponse response = sendRequest(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class);
		
		return response;
	}

    public Response<GetMediaMetaDataByIdsResponse> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class, null);
	}

	public Future<?> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request, AsyncHandler<GetMediaMetaDataByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetMediaAssociationsResponse getMediaAssociations(GetMediaAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetMediaAssociationsResponse response = sendRequest(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class);
		
		return response;
	}

    public Response<GetMediaAssociationsResponse> getMediaAssociationsAsync(GetMediaAssociationsRequest request) {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class, null);
	}

	public Future<?> getMediaAssociationsAsync(GetMediaAssociationsRequest request, AsyncHandler<GetMediaAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(GetAdGroupCriterionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAdGroupCriterionsByIdsResponse response = sendRequest(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAdGroupCriterionsByIdsResponse> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class, null);
	}

	public Future<?> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request, AsyncHandler<GetAdGroupCriterionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAdGroupCriterionsResponse addAdGroupCriterions(AddAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		AddAdGroupCriterionsResponse response = sendRequestEditorialFault(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class);
		
		return response;
	}

    public Response<AddAdGroupCriterionsResponse> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class, null);
	}

	public Future<?> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request, AsyncHandler<AddAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdGroupCriterionsResponse updateAdGroupCriterions(UpdateAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, EditorialApiFaultDetail_Exception {
		UpdateAdGroupCriterionsResponse response = sendRequestEditorialFault(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class);
		
		return response;
	}

    public Response<UpdateAdGroupCriterionsResponse> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class, null);
	}

	public Future<?> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request, AsyncHandler<UpdateAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(DeleteAdGroupCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAdGroupCriterionsResponse response = sendRequest(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class);
		
		return response;
	}

    public Response<DeleteAdGroupCriterionsResponse> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class, null);
	}

	public Future<?> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request, AsyncHandler<DeleteAdGroupCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyProductPartitionActionsResponse applyProductPartitionActions(ApplyProductPartitionActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyProductPartitionActionsResponse response = sendRequest(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class);
		
		return response;
	}

    public Response<ApplyProductPartitionActionsResponse> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request) {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class, null);
	}

	public Future<?> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request, AsyncHandler<ApplyProductPartitionActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyHotelGroupActionsResponse applyHotelGroupActions(ApplyHotelGroupActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyHotelGroupActionsResponse response = sendRequest(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class);
		
		return response;
	}

    public Response<ApplyHotelGroupActionsResponse> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request) {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class, null);
	}

	public Future<?> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request, AsyncHandler<ApplyHotelGroupActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyAssetGroupListingGroupActionsResponse applyAssetGroupListingGroupActions(ApplyAssetGroupListingGroupActionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyAssetGroupListingGroupActionsResponse response = sendRequest(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class);
		
		return response;
	}

    public Response<ApplyAssetGroupListingGroupActionsResponse> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request) {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class, null);
	}

	public Future<?> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request, AsyncHandler<ApplyAssetGroupListingGroupActionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupListingGroupsByIdsResponse getAssetGroupListingGroupsByIds(GetAssetGroupListingGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupListingGroupsByIdsResponse response = sendRequest(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAssetGroupListingGroupsByIdsResponse> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class, null);
	}

	public Future<?> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request, AsyncHandler<GetAssetGroupListingGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(GetBMCStoresByCustomerIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBMCStoresByCustomerIdResponse response = sendRequest(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class);
		
		return response;
	}

    public Response<GetBMCStoresByCustomerIdResponse> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request) {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class, null);
	}

	public Future<?> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request, AsyncHandler<GetBMCStoresByCustomerIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class, asyncHandler);
	}
	
    	
	public AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(AddNegativeKeywordsToEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddNegativeKeywordsToEntitiesResponse response = sendRequest(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class);
		
		return response;
	}

    public Response<AddNegativeKeywordsToEntitiesResponse> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class, null);
	}

	public Future<?> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request, AsyncHandler<AddNegativeKeywordsToEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(GetNegativeKeywordsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNegativeKeywordsByEntityIdsResponse response = sendRequest(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class);
		
		return response;
	}

    public Response<GetNegativeKeywordsByEntityIdsResponse> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class, null);
	}

	public Future<?> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request, AsyncHandler<GetNegativeKeywordsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(DeleteNegativeKeywordsFromEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteNegativeKeywordsFromEntitiesResponse response = sendRequest(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class);
		
		return response;
	}

    public Response<DeleteNegativeKeywordsFromEntitiesResponse> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class, null);
	}

	public Future<?> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request, AsyncHandler<DeleteNegativeKeywordsFromEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(GetSharedEntitiesByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntitiesByAccountIdResponse response = sendRequest(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetSharedEntitiesByAccountIdResponse> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request) {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class, null);
	}

	public Future<?> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request, AsyncHandler<GetSharedEntitiesByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntitiesResponse getSharedEntities(GetSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntitiesResponse response = sendRequest(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class);
		
		return response;
	}

    public Response<GetSharedEntitiesResponse> getSharedEntitiesAsync(GetSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class, null);
	}

	public Future<?> getSharedEntitiesAsync(GetSharedEntitiesRequest request, AsyncHandler<GetSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public AddSharedEntityResponse addSharedEntity(AddSharedEntityRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddSharedEntityResponse response = sendRequest(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class);
		
		return response;
	}

    public Response<AddSharedEntityResponse> addSharedEntityAsync(AddSharedEntityRequest request) {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class, null);
	}

	public Future<?> addSharedEntityAsync(AddSharedEntityRequest request, AsyncHandler<AddSharedEntityResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class, asyncHandler);
	}
	
    	
	public GetListItemsBySharedListResponse getListItemsBySharedList(GetListItemsBySharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetListItemsBySharedListResponse response = sendRequest(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class);
		
		return response;
	}

    public Response<GetListItemsBySharedListResponse> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request) {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class, null);
	}

	public Future<?> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request, AsyncHandler<GetListItemsBySharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class, asyncHandler);
	}
	
    	
	public AddListItemsToSharedListResponse addListItemsToSharedList(AddListItemsToSharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddListItemsToSharedListResponse response = sendRequest(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class);
		
		return response;
	}

    public Response<AddListItemsToSharedListResponse> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request) {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class, null);
	}

	public Future<?> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request, AsyncHandler<AddListItemsToSharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class, asyncHandler);
	}
	
    	
	public UpdateSharedEntitiesResponse updateSharedEntities(UpdateSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateSharedEntitiesResponse response = sendRequest(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class);
		
		return response;
	}

    public Response<UpdateSharedEntitiesResponse> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class, null);
	}

	public Future<?> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request, AsyncHandler<UpdateSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(DeleteListItemsFromSharedListRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteListItemsFromSharedListResponse response = sendRequest(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class);
		
		return response;
	}

    public Response<DeleteListItemsFromSharedListResponse> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request) {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class, null);
	}

	public Future<?> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request, AsyncHandler<DeleteListItemsFromSharedListResponse> asyncHandler) {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class, asyncHandler);
	}
	
    	
	public SetSharedEntityAssociationsResponse setSharedEntityAssociations(SetSharedEntityAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetSharedEntityAssociationsResponse response = sendRequest(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class);
		
		return response;
	}

    public Response<SetSharedEntityAssociationsResponse> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class, null);
	}

	public Future<?> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request, AsyncHandler<SetSharedEntityAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(DeleteSharedEntityAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSharedEntityAssociationsResponse response = sendRequest(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class);
		
		return response;
	}

    public Response<DeleteSharedEntityAssociationsResponse> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class, null);
	}

	public Future<?> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request, AsyncHandler<DeleteSharedEntityAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(GetSharedEntityAssociationsBySharedEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntityAssociationsBySharedEntityIdsResponse response = sendRequest(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
		
		return response;
	}

    public Response<GetSharedEntityAssociationsBySharedEntityIdsResponse> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class, null);
	}

	public Future<?> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsBySharedEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(GetSharedEntityAssociationsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSharedEntityAssociationsByEntityIdsResponse response = sendRequest(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class);
		
		return response;
	}

    public Response<GetSharedEntityAssociationsByEntityIdsResponse> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class, null);
	}

	public Future<?> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSharedEntitiesResponse deleteSharedEntities(DeleteSharedEntitiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSharedEntitiesResponse response = sendRequest(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class);
		
		return response;
	}

    public Response<DeleteSharedEntitiesResponse> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request) {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class, null);
	}

	public Future<?> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request, AsyncHandler<DeleteSharedEntitiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(GetCampaignSizesByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignSizesByAccountIdResponse response = sendRequest(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetCampaignSizesByAccountIdResponse> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request) {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class, null);
	}

	public Future<?> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request, AsyncHandler<GetCampaignSizesByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddCampaignCriterionsResponse addCampaignCriterions(AddCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class);
		
		return response;
	}

    public Response<AddCampaignCriterionsResponse> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class, null);
	}

	public Future<?> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request, AsyncHandler<AddCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateCampaignCriterionsResponse updateCampaignCriterions(UpdateCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class);
		
		return response;
	}

    public Response<UpdateCampaignCriterionsResponse> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class, null);
	}

	public Future<?> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request, AsyncHandler<UpdateCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignCriterionsResponse deleteCampaignCriterions(DeleteCampaignCriterionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignCriterionsResponse response = sendRequest(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class);
		
		return response;
	}

    public Response<DeleteCampaignCriterionsResponse> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class, null);
	}

	public Future<?> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request, AsyncHandler<DeleteCampaignCriterionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(GetCampaignCriterionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignCriterionsByIdsResponse response = sendRequest(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class);
		
		return response;
	}

    public Response<GetCampaignCriterionsByIdsResponse> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request) {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class, null);
	}

	public Future<?> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request, AsyncHandler<GetCampaignCriterionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddBudgetsResponse addBudgets(AddBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddBudgetsResponse response = sendRequest(request, "/Budgets", HttpPost, AddBudgetsResponse.class);
		
		return response;
	}

    public Response<AddBudgetsResponse> addBudgetsAsync(AddBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class, null);
	}

	public Future<?> addBudgetsAsync(AddBudgetsRequest request, AsyncHandler<AddBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class, asyncHandler);
	}
	
    	
	public UpdateBudgetsResponse updateBudgets(UpdateBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateBudgetsResponse response = sendRequest(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class);
		
		return response;
	}

    public Response<UpdateBudgetsResponse> updateBudgetsAsync(UpdateBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class, null);
	}

	public Future<?> updateBudgetsAsync(UpdateBudgetsRequest request, AsyncHandler<UpdateBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class, asyncHandler);
	}
	
    	
	public DeleteBudgetsResponse deleteBudgets(DeleteBudgetsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteBudgetsResponse response = sendRequest(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class);
		
		return response;
	}

    public Response<DeleteBudgetsResponse> deleteBudgetsAsync(DeleteBudgetsRequest request) {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class, null);
	}

	public Future<?> deleteBudgetsAsync(DeleteBudgetsRequest request, AsyncHandler<DeleteBudgetsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class, asyncHandler);
	}
	
    	
	public GetBudgetsByIdsResponse getBudgetsByIds(GetBudgetsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBudgetsByIdsResponse response = sendRequest(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class);
		
		return response;
	}

    public Response<GetBudgetsByIdsResponse> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request) {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class, null);
	}

	public Future<?> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request, AsyncHandler<GetBudgetsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(GetCampaignIdsByBudgetIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignIdsByBudgetIdsResponse response = sendRequest(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class);
		
		return response;
	}

    public Response<GetCampaignIdsByBudgetIdsResponse> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class, null);
	}

	public Future<?> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request, AsyncHandler<GetCampaignIdsByBudgetIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class, asyncHandler);
	}
	
    	
	public AddBidStrategiesResponse addBidStrategies(AddBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class);
		
		return response;
	}

    public Response<AddBidStrategiesResponse> addBidStrategiesAsync(AddBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class, null);
	}

	public Future<?> addBidStrategiesAsync(AddBidStrategiesRequest request, AsyncHandler<AddBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public UpdateBidStrategiesResponse updateBidStrategies(UpdateBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class);
		
		return response;
	}

    public Response<UpdateBidStrategiesResponse> updateBidStrategiesAsync(UpdateBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class, null);
	}

	public Future<?> updateBidStrategiesAsync(UpdateBidStrategiesRequest request, AsyncHandler<UpdateBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public DeleteBidStrategiesResponse deleteBidStrategies(DeleteBidStrategiesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteBidStrategiesResponse response = sendRequest(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class);
		
		return response;
	}

    public Response<DeleteBidStrategiesResponse> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request) {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class, null);
	}

	public Future<?> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request, AsyncHandler<DeleteBidStrategiesResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public GetBidStrategiesByIdsResponse getBidStrategiesByIds(GetBidStrategiesByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBidStrategiesByIdsResponse response = sendRequest(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class);
		
		return response;
	}

    public Response<GetBidStrategiesByIdsResponse> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request) {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class, null);
	}

	public Future<?> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request, AsyncHandler<GetBidStrategiesByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignIdsByBidStrategyIdsResponse getCampaignIdsByBidStrategyIds(GetCampaignIdsByBidStrategyIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetCampaignIdsByBidStrategyIdsResponse response = sendRequest(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class);
		
		return response;
	}

    public Response<GetCampaignIdsByBidStrategyIdsResponse> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class, null);
	}

	public Future<?> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request, AsyncHandler<GetCampaignIdsByBidStrategyIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAudienceGroupsResponse addAudienceGroups(AddAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class);
		
		return response;
	}

    public Response<AddAudienceGroupsResponse> addAudienceGroupsAsync(AddAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class, null);
	}

	public Future<?> addAudienceGroupsAsync(AddAudienceGroupsRequest request, AsyncHandler<AddAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAudienceGroupsResponse updateAudienceGroups(UpdateAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class);
		
		return response;
	}

    public Response<UpdateAudienceGroupsResponse> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class, null);
	}

	public Future<?> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request, AsyncHandler<UpdateAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudienceGroupsResponse deleteAudienceGroups(DeleteAudienceGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudienceGroupsResponse response = sendRequest(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class);
		
		return response;
	}

    public Response<DeleteAudienceGroupsResponse> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class, null);
	}

	public Future<?> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request, AsyncHandler<DeleteAudienceGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupsByIdsResponse getAudienceGroupsByIds(GetAudienceGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupsByIdsResponse response = sendRequest(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAudienceGroupsByIdsResponse> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class, null);
	}

	public Future<?> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request, AsyncHandler<GetAudienceGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAssetGroupsResponse addAssetGroups(AddAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class);
		
		return response;
	}

    public Response<AddAssetGroupsResponse> addAssetGroupsAsync(AddAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class, null);
	}

	public Future<?> addAssetGroupsAsync(AddAssetGroupsRequest request, AsyncHandler<AddAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAssetGroupsResponse updateAssetGroups(UpdateAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class);
		
		return response;
	}

    public Response<UpdateAssetGroupsResponse> updateAssetGroupsAsync(UpdateAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class, null);
	}

	public Future<?> updateAssetGroupsAsync(UpdateAssetGroupsRequest request, AsyncHandler<UpdateAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAssetGroupsResponse deleteAssetGroups(DeleteAssetGroupsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAssetGroupsResponse response = sendRequest(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class);
		
		return response;
	}

    public Response<DeleteAssetGroupsResponse> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request) {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class, null);
	}

	public Future<?> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request, AsyncHandler<DeleteAssetGroupsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsByIdsResponse getAssetGroupsByIds(GetAssetGroupsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsByIdsResponse response = sendRequest(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class);
		
		return response;
	}

    public Response<GetAssetGroupsByIdsResponse> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request) {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class, null);
	}

	public Future<?> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request, AsyncHandler<GetAssetGroupsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsByCampaignIdResponse getAssetGroupsByCampaignId(GetAssetGroupsByCampaignIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsByCampaignIdResponse response = sendRequest(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class);
		
		return response;
	}

    public Response<GetAssetGroupsByCampaignIdResponse> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request) {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class, null);
	}

	public Future<?> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request, AsyncHandler<GetAssetGroupsByCampaignIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsEditorialReasonsResponse getAssetGroupsEditorialReasons(GetAssetGroupsEditorialReasonsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAssetGroupsEditorialReasonsResponse response = sendRequest(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class);
		
		return response;
	}

    public Response<GetAssetGroupsEditorialReasonsResponse> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request) {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class, null);
	}

	public Future<?> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request, AsyncHandler<GetAssetGroupsEditorialReasonsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class, asyncHandler);
	}
	
    	
	public SetAudienceGroupAssetGroupAssociationsResponse setAudienceGroupAssetGroupAssociations(SetAudienceGroupAssetGroupAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetAudienceGroupAssetGroupAssociationsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class);
		
		return response;
	}

    public Response<SetAudienceGroupAssetGroupAssociationsResponse> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class, null);
	}

	public Future<?> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<SetAudienceGroupAssetGroupAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudienceGroupAssetGroupAssociationsResponse deleteAudienceGroupAssetGroupAssociations(DeleteAudienceGroupAssetGroupAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudienceGroupAssetGroupAssociationsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class);
		
		return response;
	}

    public Response<DeleteAudienceGroupAssetGroupAssociationsResponse> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class, null);
	}

	public Future<?> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<DeleteAudienceGroupAssetGroupAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAssetGroupIds(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class);
		
		return response;
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class, null);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAudienceGroupIds(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse response = sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class);
		
		return response;
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class, null);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAudiencesResponse addAudiences(AddAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddAudiencesResponse response = sendRequest(request, "/Audiences", HttpPost, AddAudiencesResponse.class);
		
		return response;
	}

    public Response<AddAudiencesResponse> addAudiencesAsync(AddAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class, null);
	}

	public Future<?> addAudiencesAsync(AddAudiencesRequest request, AsyncHandler<AddAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class, asyncHandler);
	}
	
    	
	public UpdateAudiencesResponse updateAudiences(UpdateAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAudiencesResponse response = sendRequest(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class);
		
		return response;
	}

    public Response<UpdateAudiencesResponse> updateAudiencesAsync(UpdateAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class, null);
	}

	public Future<?> updateAudiencesAsync(UpdateAudiencesRequest request, AsyncHandler<UpdateAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudiencesResponse deleteAudiences(DeleteAudiencesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteAudiencesResponse response = sendRequest(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class);
		
		return response;
	}

    public Response<DeleteAudiencesResponse> deleteAudiencesAsync(DeleteAudiencesRequest request) {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class, null);
	}

	public Future<?> deleteAudiencesAsync(DeleteAudiencesRequest request, AsyncHandler<DeleteAudiencesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class, asyncHandler);
	}
	
    	
	public GetAudiencesByIdsResponse getAudiencesByIds(GetAudiencesByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAudiencesByIdsResponse response = sendRequest(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class);
		
		return response;
	}

    public Response<GetAudiencesByIdsResponse> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request) {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class, null);
	}

	public Future<?> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request, AsyncHandler<GetAudiencesByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class, asyncHandler);
	}
	
    	
	public ApplyCustomerListItemsResponse applyCustomerListItems(ApplyCustomerListItemsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyCustomerListItemsResponse response = sendRequest(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class);
		
		return response;
	}

    public Response<ApplyCustomerListItemsResponse> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request) {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class, null);
	}

	public Future<?> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request, AsyncHandler<ApplyCustomerListItemsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class, asyncHandler);
	}
	
    	
	public ApplyCustomerListUserDataResponse applyCustomerListUserData(ApplyCustomerListUserDataRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyCustomerListUserDataResponse response = sendRequest(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class);
		
		return response;
	}

    public Response<ApplyCustomerListUserDataResponse> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request) {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class, null);
	}

	public Future<?> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request, AsyncHandler<ApplyCustomerListUserDataResponse> asyncHandler) {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class, asyncHandler);
	}
	
    	
	public GetUetTagsByIdsResponse getUetTagsByIds(GetUetTagsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetUetTagsByIdsResponse response = sendRequest(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class);
		
		return response;
	}

    public Response<GetUetTagsByIdsResponse> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request) {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class, null);
	}

	public Future<?> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request, AsyncHandler<GetUetTagsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddUetTagsResponse addUetTags(AddUetTagsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddUetTagsResponse response = sendRequest(request, "/UetTags", HttpPost, AddUetTagsResponse.class);
		
		return response;
	}

    public Response<AddUetTagsResponse> addUetTagsAsync(AddUetTagsRequest request) {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class, null);
	}

	public Future<?> addUetTagsAsync(AddUetTagsRequest request, AsyncHandler<AddUetTagsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class, asyncHandler);
	}
	
    	
	public UpdateUetTagsResponse updateUetTags(UpdateUetTagsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateUetTagsResponse response = sendRequest(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class);
		
		return response;
	}

    public Response<UpdateUetTagsResponse> updateUetTagsAsync(UpdateUetTagsRequest request) {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class, null);
	}

	public Future<?> updateUetTagsAsync(UpdateUetTagsRequest request, AsyncHandler<UpdateUetTagsResponse> asyncHandler) {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class, asyncHandler);
	}
	
    	
	public GetConversionGoalsByIdsResponse getConversionGoalsByIds(GetConversionGoalsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionGoalsByIdsResponse response = sendRequest(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class);
		
		return response;
	}

    public Response<GetConversionGoalsByIdsResponse> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class, null);
	}

	public Future<?> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request, AsyncHandler<GetConversionGoalsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(GetConversionGoalsByTagIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionGoalsByTagIdsResponse response = sendRequest(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class);
		
		return response;
	}

    public Response<GetConversionGoalsByTagIdsResponse> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class, null);
	}

	public Future<?> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request, AsyncHandler<GetConversionGoalsByTagIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class, asyncHandler);
	}
	
    	
	public AddConversionGoalsResponse addConversionGoals(AddConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddConversionGoalsResponse response = sendRequest(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class);
		
		return response;
	}

    public Response<AddConversionGoalsResponse> addConversionGoalsAsync(AddConversionGoalsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class, null);
	}

	public Future<?> addConversionGoalsAsync(AddConversionGoalsRequest request, AsyncHandler<AddConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public UpdateConversionGoalsResponse updateConversionGoals(UpdateConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateConversionGoalsResponse response = sendRequest(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class);
		
		return response;
	}

    public Response<UpdateConversionGoalsResponse> updateConversionGoalsAsync(UpdateConversionGoalsRequest request) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class, null);
	}

	public Future<?> updateConversionGoalsAsync(UpdateConversionGoalsRequest request, AsyncHandler<UpdateConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOfflineConversionsResponse applyOfflineConversions(ApplyOfflineConversionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOfflineConversionsResponse response = sendRequest(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class);
		
		return response;
	}

    public Response<ApplyOfflineConversionsResponse> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request) {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class, null);
	}

	public Future<?> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request, AsyncHandler<ApplyOfflineConversionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOfflineConversionAdjustmentsResponse applyOfflineConversionAdjustments(ApplyOfflineConversionAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOfflineConversionAdjustmentsResponse response = sendRequest(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class);
		
		return response;
	}

    public Response<ApplyOfflineConversionAdjustmentsResponse> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request) {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class, null);
	}

	public Future<?> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request, AsyncHandler<ApplyOfflineConversionAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOnlineConversionAdjustmentsResponse applyOnlineConversionAdjustments(ApplyOnlineConversionAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		ApplyOnlineConversionAdjustmentsResponse response = sendRequest(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class);
		
		return response;
	}

    public Response<ApplyOnlineConversionAdjustmentsResponse> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request) {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class, null);
	}

	public Future<?> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request, AsyncHandler<ApplyOnlineConversionAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public GetOfflineConversionReportsResponse getOfflineConversionReports(GetOfflineConversionReportsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetOfflineConversionReportsResponse response = sendRequest(request, "/OfflineConversionReports/Query", HttpPost, GetOfflineConversionReportsResponse.class);
		
		return response;
	}

    public Response<GetOfflineConversionReportsResponse> getOfflineConversionReportsAsync(GetOfflineConversionReportsRequest request) {
		return sendRequestAsync(request, "/OfflineConversionReports/Query", HttpPost, GetOfflineConversionReportsResponse.class, null);
	}

	public Future<?> getOfflineConversionReportsAsync(GetOfflineConversionReportsRequest request, AsyncHandler<GetOfflineConversionReportsResponse> asyncHandler) {
		return sendRequestAsync(request, "/OfflineConversionReports/Query", HttpPost, GetOfflineConversionReportsResponse.class, asyncHandler);
	}
	
    	
	public AddLabelsResponse addLabels(AddLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddLabelsResponse response = sendRequest(request, "/Labels", HttpPost, AddLabelsResponse.class);
		
		return response;
	}

    public Response<AddLabelsResponse> addLabelsAsync(AddLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class, null);
	}

	public Future<?> addLabelsAsync(AddLabelsRequest request, AsyncHandler<AddLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class, asyncHandler);
	}
	
    	
	public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteLabelsResponse response = sendRequest(request, "/Labels", HttpDelete, DeleteLabelsResponse.class);
		
		return response;
	}

    public Response<DeleteLabelsResponse> deleteLabelsAsync(DeleteLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class, null);
	}

	public Future<?> deleteLabelsAsync(DeleteLabelsRequest request, AsyncHandler<DeleteLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class, asyncHandler);
	}
	
    	
	public UpdateLabelsResponse updateLabels(UpdateLabelsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateLabelsResponse response = sendRequest(request, "/Labels", HttpPut, UpdateLabelsResponse.class);
		
		return response;
	}

    public Response<UpdateLabelsResponse> updateLabelsAsync(UpdateLabelsRequest request) {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class, null);
	}

	public Future<?> updateLabelsAsync(UpdateLabelsRequest request, AsyncHandler<UpdateLabelsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelsByIdsResponse getLabelsByIds(GetLabelsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelsByIdsResponse response = sendRequest(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class);
		
		return response;
	}

    public Response<GetLabelsByIdsResponse> getLabelsByIdsAsync(GetLabelsByIdsRequest request) {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class, null);
	}

	public Future<?> getLabelsByIdsAsync(GetLabelsByIdsRequest request, AsyncHandler<GetLabelsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class, asyncHandler);
	}
	
    	
	public SetLabelAssociationsResponse setLabelAssociations(SetLabelAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SetLabelAssociationsResponse response = sendRequest(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class);
		
		return response;
	}

    public Response<SetLabelAssociationsResponse> setLabelAssociationsAsync(SetLabelAssociationsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class, null);
	}

	public Future<?> setLabelAssociationsAsync(SetLabelAssociationsRequest request, AsyncHandler<SetLabelAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteLabelAssociationsResponse deleteLabelAssociations(DeleteLabelAssociationsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteLabelAssociationsResponse response = sendRequest(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class);
		
		return response;
	}

    public Response<DeleteLabelAssociationsResponse> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class, null);
	}

	public Future<?> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request, AsyncHandler<DeleteLabelAssociationsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(GetLabelAssociationsByEntityIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelAssociationsByEntityIdsResponse response = sendRequest(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class);
		
		return response;
	}

    public Response<GetLabelAssociationsByEntityIdsResponse> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class, null);
	}

	public Future<?> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request, AsyncHandler<GetLabelAssociationsByEntityIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(GetLabelAssociationsByLabelIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetLabelAssociationsByLabelIdsResponse response = sendRequest(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class);
		
		return response;
	}

    public Response<GetLabelAssociationsByLabelIdsResponse> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class, null);
	}

	public Future<?> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request, AsyncHandler<GetLabelAssociationsByLabelIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class, asyncHandler);
	}
	
    	
	public AddExperimentsResponse addExperiments(AddExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddExperimentsResponse response = sendRequest(request, "/Experiments", HttpPost, AddExperimentsResponse.class);
		
		return response;
	}

    public Response<AddExperimentsResponse> addExperimentsAsync(AddExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class, null);
	}

	public Future<?> addExperimentsAsync(AddExperimentsRequest request, AsyncHandler<AddExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class, asyncHandler);
	}
	
    	
	public DeleteExperimentsResponse deleteExperiments(DeleteExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteExperimentsResponse response = sendRequest(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class);
		
		return response;
	}

    public Response<DeleteExperimentsResponse> deleteExperimentsAsync(DeleteExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class, null);
	}

	public Future<?> deleteExperimentsAsync(DeleteExperimentsRequest request, AsyncHandler<DeleteExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class, asyncHandler);
	}
	
    	
	public UpdateExperimentsResponse updateExperiments(UpdateExperimentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateExperimentsResponse response = sendRequest(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class);
		
		return response;
	}

    public Response<UpdateExperimentsResponse> updateExperimentsAsync(UpdateExperimentsRequest request) {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class, null);
	}

	public Future<?> updateExperimentsAsync(UpdateExperimentsRequest request, AsyncHandler<UpdateExperimentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class, asyncHandler);
	}
	
    	
	public GetExperimentsByIdsResponse getExperimentsByIds(GetExperimentsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetExperimentsByIdsResponse response = sendRequest(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class);
		
		return response;
	}

    public Response<GetExperimentsByIdsResponse> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request) {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class, null);
	}

	public Future<?> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request, AsyncHandler<GetExperimentsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetProfileDataFileUrlResponse getProfileDataFileUrl(GetProfileDataFileUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetProfileDataFileUrlResponse response = sendRequest(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class);
		
		return response;
	}

    public Response<GetProfileDataFileUrlResponse> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request) {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class, null);
	}

	public Future<?> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request, AsyncHandler<GetProfileDataFileUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class, asyncHandler);
	}
	
    	
	public SearchCompaniesResponse searchCompanies(SearchCompaniesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SearchCompaniesResponse response = sendRequest(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class);
		
		return response;
	}

    public Response<SearchCompaniesResponse> searchCompaniesAsync(SearchCompaniesRequest request) {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class, null);
	}

	public Future<?> searchCompaniesAsync(SearchCompaniesRequest request, AsyncHandler<SearchCompaniesResponse> asyncHandler) {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class, asyncHandler);
	}
	
    	
	public GetFileImportUploadUrlResponse getFileImportUploadUrl(GetFileImportUploadUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetFileImportUploadUrlResponse response = sendRequest(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class);
		
		return response;
	}

    public Response<GetFileImportUploadUrlResponse> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request) {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class, null);
	}

	public Future<?> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request, AsyncHandler<GetFileImportUploadUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class, asyncHandler);
	}
	
    	
	public AddImportJobsResponse addImportJobs(AddImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class);
		
		return response;
	}

    public Response<AddImportJobsResponse> addImportJobsAsync(AddImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class, null);
	}

	public Future<?> addImportJobsAsync(AddImportJobsRequest request, AsyncHandler<AddImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class, asyncHandler);
	}
	
    	
	public GetImportResultsResponse getImportResults(GetImportResultsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportResultsResponse response = sendRequest(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class);
		
		return response;
	}

    public Response<GetImportResultsResponse> getImportResultsAsync(GetImportResultsRequest request) {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class, null);
	}

	public Future<?> getImportResultsAsync(GetImportResultsRequest request, AsyncHandler<GetImportResultsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class, asyncHandler);
	}
	
    	
	public GetImportJobsByIdsResponse getImportJobsByIds(GetImportJobsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportJobsByIdsResponse response = sendRequest(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class);
		
		return response;
	}

    public Response<GetImportJobsByIdsResponse> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request) {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class, null);
	}

	public Future<?> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request, AsyncHandler<GetImportJobsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteImportJobsResponse deleteImportJobs(DeleteImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class);
		
		return response;
	}

    public Response<DeleteImportJobsResponse> deleteImportJobsAsync(DeleteImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class, null);
	}

	public Future<?> deleteImportJobsAsync(DeleteImportJobsRequest request, AsyncHandler<DeleteImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class, asyncHandler);
	}
	
    	
	public GetImportEntityIdsMappingResponse getImportEntityIdsMapping(GetImportEntityIdsMappingRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetImportEntityIdsMappingResponse response = sendRequest(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class);
		
		return response;
	}

    public Response<GetImportEntityIdsMappingResponse> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request) {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class, null);
	}

	public Future<?> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request, AsyncHandler<GetImportEntityIdsMappingResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class, asyncHandler);
	}
	
    	
	public UpdateImportJobsResponse updateImportJobs(UpdateImportJobsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateImportJobsResponse response = sendRequest(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class);
		
		return response;
	}

    public Response<UpdateImportJobsResponse> updateImportJobsAsync(UpdateImportJobsRequest request) {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class, null);
	}

	public Future<?> updateImportJobsAsync(UpdateImportJobsRequest request, AsyncHandler<UpdateImportJobsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class, asyncHandler);
	}
	
    	
	public AddVideosResponse addVideos(AddVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddVideosResponse response = sendRequest(request, "/Videos", HttpPost, AddVideosResponse.class);
		
		return response;
	}

    public Response<AddVideosResponse> addVideosAsync(AddVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class, null);
	}

	public Future<?> addVideosAsync(AddVideosRequest request, AsyncHandler<AddVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class, asyncHandler);
	}
	
    	
	public DeleteVideosResponse deleteVideos(DeleteVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteVideosResponse response = sendRequest(request, "/Videos", HttpDelete, DeleteVideosResponse.class);
		
		return response;
	}

    public Response<DeleteVideosResponse> deleteVideosAsync(DeleteVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class, null);
	}

	public Future<?> deleteVideosAsync(DeleteVideosRequest request, AsyncHandler<DeleteVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class, asyncHandler);
	}
	
    	
	public GetVideosByIdsResponse getVideosByIds(GetVideosByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetVideosByIdsResponse response = sendRequest(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class);
		
		return response;
	}

    public Response<GetVideosByIdsResponse> getVideosByIdsAsync(GetVideosByIdsRequest request) {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class, null);
	}

	public Future<?> getVideosByIdsAsync(GetVideosByIdsRequest request, AsyncHandler<GetVideosByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class, asyncHandler);
	}
	
    	
	public UpdateVideosResponse updateVideos(UpdateVideosRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateVideosResponse response = sendRequest(request, "/Videos", HttpPut, UpdateVideosResponse.class);
		
		return response;
	}

    public Response<UpdateVideosResponse> updateVideosAsync(UpdateVideosRequest request) {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class, null);
	}

	public Future<?> updateVideosAsync(UpdateVideosRequest request, AsyncHandler<UpdateVideosResponse> asyncHandler) {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class, asyncHandler);
	}
	
    	
	public AddHTML5SResponse addHTML5S(AddHTML5SRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddHTML5SResponse response = sendRequest(request, "/HTML5s", HttpPost, AddHTML5SResponse.class);
		
		return response;
	}

    public Response<AddHTML5SResponse> addHTML5SAsync(AddHTML5SRequest request) {
		return sendRequestAsync(request, "/HTML5s", HttpPost, AddHTML5SResponse.class, null);
	}

	public Future<?> addHTML5SAsync(AddHTML5SRequest request, AsyncHandler<AddHTML5SResponse> asyncHandler) {
		return sendRequestAsync(request, "/HTML5s", HttpPost, AddHTML5SResponse.class, asyncHandler);
	}
	
    	
	public GetHTML5SByIdsResponse getHTML5SByIds(GetHTML5SByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetHTML5SByIdsResponse response = sendRequest(request, "/HTML5s/QueryByIds", HttpPost, GetHTML5SByIdsResponse.class);
		
		return response;
	}

    public Response<GetHTML5SByIdsResponse> getHTML5SByIdsAsync(GetHTML5SByIdsRequest request) {
		return sendRequestAsync(request, "/HTML5s/QueryByIds", HttpPost, GetHTML5SByIdsResponse.class, null);
	}

	public Future<?> getHTML5SByIdsAsync(GetHTML5SByIdsRequest request, AsyncHandler<GetHTML5SByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/HTML5s/QueryByIds", HttpPost, GetHTML5SByIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteHTML5SResponse deleteHTML5S(DeleteHTML5SRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteHTML5SResponse response = sendRequest(request, "/HTML5s", HttpDelete, DeleteHTML5SResponse.class);
		
		return response;
	}

    public Response<DeleteHTML5SResponse> deleteHTML5SAsync(DeleteHTML5SRequest request) {
		return sendRequestAsync(request, "/HTML5s", HttpDelete, DeleteHTML5SResponse.class, null);
	}

	public Future<?> deleteHTML5SAsync(DeleteHTML5SRequest request, AsyncHandler<DeleteHTML5SResponse> asyncHandler) {
		return sendRequestAsync(request, "/HTML5s", HttpDelete, DeleteHTML5SResponse.class, asyncHandler);
	}
	
    	
	public AddCampaignConversionGoalsResponse addCampaignConversionGoals(AddCampaignConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddCampaignConversionGoalsResponse response = sendRequest(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class);
		
		return response;
	}

    public Response<AddCampaignConversionGoalsResponse> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class, null);
	}

	public Future<?> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request, AsyncHandler<AddCampaignConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignConversionGoalsResponse deleteCampaignConversionGoals(DeleteCampaignConversionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteCampaignConversionGoalsResponse response = sendRequest(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class);
		
		return response;
	}

    public Response<DeleteCampaignConversionGoalsResponse> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class, null);
	}

	public Future<?> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request, AsyncHandler<DeleteCampaignConversionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public AddDataExclusionsResponse addDataExclusions(AddDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class);
		
		return response;
	}

    public Response<AddDataExclusionsResponse> addDataExclusionsAsync(AddDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class, null);
	}

	public Future<?> addDataExclusionsAsync(AddDataExclusionsRequest request, AsyncHandler<AddDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateDataExclusionsResponse updateDataExclusions(UpdateDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class);
		
		return response;
	}

    public Response<UpdateDataExclusionsResponse> updateDataExclusionsAsync(UpdateDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class, null);
	}

	public Future<?> updateDataExclusionsAsync(UpdateDataExclusionsRequest request, AsyncHandler<UpdateDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteDataExclusionsResponse deleteDataExclusions(DeleteDataExclusionsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteDataExclusionsResponse response = sendRequest(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class);
		
		return response;
	}

    public Response<DeleteDataExclusionsResponse> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request) {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class, null);
	}

	public Future<?> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request, AsyncHandler<DeleteDataExclusionsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public GetDataExclusionsByIdsResponse getDataExclusionsByIds(GetDataExclusionsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDataExclusionsByIdsResponse response = sendRequest(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class);
		
		return response;
	}

    public Response<GetDataExclusionsByIdsResponse> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request) {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class, null);
	}

	public Future<?> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request, AsyncHandler<GetDataExclusionsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetDataExclusionsByAccountIdResponse getDataExclusionsByAccountId(GetDataExclusionsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDataExclusionsByAccountIdResponse response = sendRequest(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetDataExclusionsByAccountIdResponse> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request) {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class, null);
	}

	public Future<?> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request, AsyncHandler<GetDataExclusionsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddSeasonalityAdjustmentsResponse addSeasonalityAdjustments(AddSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class);
		
		return response;
	}

    public Response<AddSeasonalityAdjustmentsResponse> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class, null);
	}

	public Future<?> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request, AsyncHandler<AddSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public UpdateSeasonalityAdjustmentsResponse updateSeasonalityAdjustments(UpdateSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class);
		
		return response;
	}

    public Response<UpdateSeasonalityAdjustmentsResponse> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class, null);
	}

	public Future<?> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request, AsyncHandler<UpdateSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSeasonalityAdjustmentsResponse deleteSeasonalityAdjustments(DeleteSeasonalityAdjustmentsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteSeasonalityAdjustmentsResponse response = sendRequest(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class);
		
		return response;
	}

    public Response<DeleteSeasonalityAdjustmentsResponse> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class, null);
	}

	public Future<?> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request, AsyncHandler<DeleteSeasonalityAdjustmentsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByIdsResponse getSeasonalityAdjustmentsByIds(GetSeasonalityAdjustmentsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSeasonalityAdjustmentsByIdsResponse response = sendRequest(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class);
		
		return response;
	}

    public Response<GetSeasonalityAdjustmentsByIdsResponse> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class, null);
	}

	public Future<?> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request, AsyncHandler<GetSeasonalityAdjustmentsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByAccountIdResponse getSeasonalityAdjustmentsByAccountId(GetSeasonalityAdjustmentsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSeasonalityAdjustmentsByAccountIdResponse response = sendRequest(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetSeasonalityAdjustmentsByAccountIdResponse> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class, null);
	}

	public Future<?> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request, AsyncHandler<GetSeasonalityAdjustmentsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public CreateAssetGroupRecommendationResponse createAssetGroupRecommendation(CreateAssetGroupRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		CreateAssetGroupRecommendationResponse response = sendRequest(request, "/AssetGroupRecommendation/Create", HttpPost, CreateAssetGroupRecommendationResponse.class);
		
		return response;
	}

    public Response<CreateAssetGroupRecommendationResponse> createAssetGroupRecommendationAsync(CreateAssetGroupRecommendationRequest request) {
		return sendRequestAsync(request, "/AssetGroupRecommendation/Create", HttpPost, CreateAssetGroupRecommendationResponse.class, null);
	}

	public Future<?> createAssetGroupRecommendationAsync(CreateAssetGroupRecommendationRequest request, AsyncHandler<CreateAssetGroupRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupRecommendation/Create", HttpPost, CreateAssetGroupRecommendationResponse.class, asyncHandler);
	}
	
    	
	public CreateResponsiveAdRecommendationResponse createResponsiveAdRecommendation(CreateResponsiveAdRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		CreateResponsiveAdRecommendationResponse response = sendRequest(request, "/ResponsiveAdRecommendation/Create", HttpPost, CreateResponsiveAdRecommendationResponse.class);
		
		return response;
	}

    public Response<CreateResponsiveAdRecommendationResponse> createResponsiveAdRecommendationAsync(CreateResponsiveAdRecommendationRequest request) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendation/Create", HttpPost, CreateResponsiveAdRecommendationResponse.class, null);
	}

	public Future<?> createResponsiveAdRecommendationAsync(CreateResponsiveAdRecommendationRequest request, AsyncHandler<CreateResponsiveAdRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendation/Create", HttpPost, CreateResponsiveAdRecommendationResponse.class, asyncHandler);
	}
	
    	
	public CreateResponsiveSearchAdRecommendationResponse createResponsiveSearchAdRecommendation(CreateResponsiveSearchAdRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		CreateResponsiveSearchAdRecommendationResponse response = sendRequest(request, "/ResponsiveSearchAdRecommendation/Create", HttpPost, CreateResponsiveSearchAdRecommendationResponse.class);
		
		return response;
	}

    public Response<CreateResponsiveSearchAdRecommendationResponse> createResponsiveSearchAdRecommendationAsync(CreateResponsiveSearchAdRecommendationRequest request) {
		return sendRequestAsync(request, "/ResponsiveSearchAdRecommendation/Create", HttpPost, CreateResponsiveSearchAdRecommendationResponse.class, null);
	}

	public Future<?> createResponsiveSearchAdRecommendationAsync(CreateResponsiveSearchAdRecommendationRequest request, AsyncHandler<CreateResponsiveSearchAdRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/ResponsiveSearchAdRecommendation/Create", HttpPost, CreateResponsiveSearchAdRecommendationResponse.class, asyncHandler);
	}
	
    	
	public RefineAssetGroupRecommendationResponse refineAssetGroupRecommendation(RefineAssetGroupRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		RefineAssetGroupRecommendationResponse response = sendRequest(request, "/AssetGroupRecommendation/Refine", HttpPost, RefineAssetGroupRecommendationResponse.class);
		
		return response;
	}

    public Response<RefineAssetGroupRecommendationResponse> refineAssetGroupRecommendationAsync(RefineAssetGroupRecommendationRequest request) {
		return sendRequestAsync(request, "/AssetGroupRecommendation/Refine", HttpPost, RefineAssetGroupRecommendationResponse.class, null);
	}

	public Future<?> refineAssetGroupRecommendationAsync(RefineAssetGroupRecommendationRequest request, AsyncHandler<RefineAssetGroupRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/AssetGroupRecommendation/Refine", HttpPost, RefineAssetGroupRecommendationResponse.class, asyncHandler);
	}
	
    	
	public RefineResponsiveAdRecommendationResponse refineResponsiveAdRecommendation(RefineResponsiveAdRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		RefineResponsiveAdRecommendationResponse response = sendRequest(request, "/ResponsiveAdRecommendation/Refine", HttpPost, RefineResponsiveAdRecommendationResponse.class);
		
		return response;
	}

    public Response<RefineResponsiveAdRecommendationResponse> refineResponsiveAdRecommendationAsync(RefineResponsiveAdRecommendationRequest request) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendation/Refine", HttpPost, RefineResponsiveAdRecommendationResponse.class, null);
	}

	public Future<?> refineResponsiveAdRecommendationAsync(RefineResponsiveAdRecommendationRequest request, AsyncHandler<RefineResponsiveAdRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendation/Refine", HttpPost, RefineResponsiveAdRecommendationResponse.class, asyncHandler);
	}
	
    	
	public RefineResponsiveSearchAdRecommendationResponse refineResponsiveSearchAdRecommendation(RefineResponsiveSearchAdRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		RefineResponsiveSearchAdRecommendationResponse response = sendRequest(request, "/ResponsiveSearchAdRecommendation/Refine", HttpPost, RefineResponsiveSearchAdRecommendationResponse.class);
		
		return response;
	}

    public Response<RefineResponsiveSearchAdRecommendationResponse> refineResponsiveSearchAdRecommendationAsync(RefineResponsiveSearchAdRecommendationRequest request) {
		return sendRequestAsync(request, "/ResponsiveSearchAdRecommendation/Refine", HttpPost, RefineResponsiveSearchAdRecommendationResponse.class, null);
	}

	public Future<?> refineResponsiveSearchAdRecommendationAsync(RefineResponsiveSearchAdRecommendationRequest request, AsyncHandler<RefineResponsiveSearchAdRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/ResponsiveSearchAdRecommendation/Refine", HttpPost, RefineResponsiveSearchAdRecommendationResponse.class, asyncHandler);
	}
	
    	
	public GetResponsiveAdRecommendationJobResponse getResponsiveAdRecommendationJob(GetResponsiveAdRecommendationJobRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetResponsiveAdRecommendationJobResponse response = sendRequest(request, "/ResponsiveAdRecommendationJob/Query", HttpPost, GetResponsiveAdRecommendationJobResponse.class);
		
		return response;
	}

    public Response<GetResponsiveAdRecommendationJobResponse> getResponsiveAdRecommendationJobAsync(GetResponsiveAdRecommendationJobRequest request) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendationJob/Query", HttpPost, GetResponsiveAdRecommendationJobResponse.class, null);
	}

	public Future<?> getResponsiveAdRecommendationJobAsync(GetResponsiveAdRecommendationJobRequest request, AsyncHandler<GetResponsiveAdRecommendationJobResponse> asyncHandler) {
		return sendRequestAsync(request, "/ResponsiveAdRecommendationJob/Query", HttpPost, GetResponsiveAdRecommendationJobResponse.class, asyncHandler);
	}
	
    	
	public UpdateConversionValueRulesResponse updateConversionValueRules(UpdateConversionValueRulesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateConversionValueRulesResponse response = sendRequest(request, "/ConversionValueRules", HttpPut, UpdateConversionValueRulesResponse.class);
		
		return response;
	}

    public Response<UpdateConversionValueRulesResponse> updateConversionValueRulesAsync(UpdateConversionValueRulesRequest request) {
		return sendRequestAsync(request, "/ConversionValueRules", HttpPut, UpdateConversionValueRulesResponse.class, null);
	}

	public Future<?> updateConversionValueRulesAsync(UpdateConversionValueRulesRequest request, AsyncHandler<UpdateConversionValueRulesResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionValueRules", HttpPut, UpdateConversionValueRulesResponse.class, asyncHandler);
	}
	
    	
	public UpdateConversionValueRulesStatusResponse updateConversionValueRulesStatus(UpdateConversionValueRulesStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateConversionValueRulesStatusResponse response = sendRequest(request, "/ConversionValueRulesStatus", HttpPut, UpdateConversionValueRulesStatusResponse.class);
		
		return response;
	}

    public Response<UpdateConversionValueRulesStatusResponse> updateConversionValueRulesStatusAsync(UpdateConversionValueRulesStatusRequest request) {
		return sendRequestAsync(request, "/ConversionValueRulesStatus", HttpPut, UpdateConversionValueRulesStatusResponse.class, null);
	}

	public Future<?> updateConversionValueRulesStatusAsync(UpdateConversionValueRulesStatusRequest request, AsyncHandler<UpdateConversionValueRulesStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionValueRulesStatus", HttpPut, UpdateConversionValueRulesStatusResponse.class, asyncHandler);
	}
	
    	
	public AddConversionValueRulesResponse addConversionValueRules(AddConversionValueRulesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddConversionValueRulesResponse response = sendRequest(request, "/ConversionValueRules", HttpPost, AddConversionValueRulesResponse.class);
		
		return response;
	}

    public Response<AddConversionValueRulesResponse> addConversionValueRulesAsync(AddConversionValueRulesRequest request) {
		return sendRequestAsync(request, "/ConversionValueRules", HttpPost, AddConversionValueRulesResponse.class, null);
	}

	public Future<?> addConversionValueRulesAsync(AddConversionValueRulesRequest request, AsyncHandler<AddConversionValueRulesResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionValueRules", HttpPost, AddConversionValueRulesResponse.class, asyncHandler);
	}
	
    	
	public GetConversionValueRulesByAccountIdResponse getConversionValueRulesByAccountId(GetConversionValueRulesByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionValueRulesByAccountIdResponse response = sendRequest(request, "/ConversionValueRules/QueryByAccountId", HttpPost, GetConversionValueRulesByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetConversionValueRulesByAccountIdResponse> getConversionValueRulesByAccountIdAsync(GetConversionValueRulesByAccountIdRequest request) {
		return sendRequestAsync(request, "/ConversionValueRules/QueryByAccountId", HttpPost, GetConversionValueRulesByAccountIdResponse.class, null);
	}

	public Future<?> getConversionValueRulesByAccountIdAsync(GetConversionValueRulesByAccountIdRequest request, AsyncHandler<GetConversionValueRulesByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionValueRules/QueryByAccountId", HttpPost, GetConversionValueRulesByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetConversionValueRulesByIdsResponse getConversionValueRulesByIds(GetConversionValueRulesByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetConversionValueRulesByIdsResponse response = sendRequest(request, "/ConversionValueRules/QueryByIds", HttpPost, GetConversionValueRulesByIdsResponse.class);
		
		return response;
	}

    public Response<GetConversionValueRulesByIdsResponse> getConversionValueRulesByIdsAsync(GetConversionValueRulesByIdsRequest request) {
		return sendRequestAsync(request, "/ConversionValueRules/QueryByIds", HttpPost, GetConversionValueRulesByIdsResponse.class, null);
	}

	public Future<?> getConversionValueRulesByIdsAsync(GetConversionValueRulesByIdsRequest request, AsyncHandler<GetConversionValueRulesByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/ConversionValueRules/QueryByIds", HttpPost, GetConversionValueRulesByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddBrandKitsResponse addBrandKits(AddBrandKitsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddBrandKitsResponse response = sendRequest(request, "/BrandKits", HttpPost, AddBrandKitsResponse.class);
		
		return response;
	}

    public Response<AddBrandKitsResponse> addBrandKitsAsync(AddBrandKitsRequest request) {
		return sendRequestAsync(request, "/BrandKits", HttpPost, AddBrandKitsResponse.class, null);
	}

	public Future<?> addBrandKitsAsync(AddBrandKitsRequest request, AsyncHandler<AddBrandKitsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKits", HttpPost, AddBrandKitsResponse.class, asyncHandler);
	}
	
    	
	public UpdateBrandKitsResponse updateBrandKits(UpdateBrandKitsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateBrandKitsResponse response = sendRequest(request, "/BrandKits", HttpPut, UpdateBrandKitsResponse.class);
		
		return response;
	}

    public Response<UpdateBrandKitsResponse> updateBrandKitsAsync(UpdateBrandKitsRequest request) {
		return sendRequestAsync(request, "/BrandKits", HttpPut, UpdateBrandKitsResponse.class, null);
	}

	public Future<?> updateBrandKitsAsync(UpdateBrandKitsRequest request, AsyncHandler<UpdateBrandKitsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKits", HttpPut, UpdateBrandKitsResponse.class, asyncHandler);
	}
	
    	
	public DeleteBrandKitsResponse deleteBrandKits(DeleteBrandKitsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DeleteBrandKitsResponse response = sendRequest(request, "/BrandKits", HttpDelete, DeleteBrandKitsResponse.class);
		
		return response;
	}

    public Response<DeleteBrandKitsResponse> deleteBrandKitsAsync(DeleteBrandKitsRequest request) {
		return sendRequestAsync(request, "/BrandKits", HttpDelete, DeleteBrandKitsResponse.class, null);
	}

	public Future<?> deleteBrandKitsAsync(DeleteBrandKitsRequest request, AsyncHandler<DeleteBrandKitsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKits", HttpDelete, DeleteBrandKitsResponse.class, asyncHandler);
	}
	
    	
	public CreateBrandKitRecommendationResponse createBrandKitRecommendation(CreateBrandKitRecommendationRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		CreateBrandKitRecommendationResponse response = sendRequest(request, "/BrandKitRecommendation/Create", HttpPost, CreateBrandKitRecommendationResponse.class);
		
		return response;
	}

    public Response<CreateBrandKitRecommendationResponse> createBrandKitRecommendationAsync(CreateBrandKitRecommendationRequest request) {
		return sendRequestAsync(request, "/BrandKitRecommendation/Create", HttpPost, CreateBrandKitRecommendationResponse.class, null);
	}

	public Future<?> createBrandKitRecommendationAsync(CreateBrandKitRecommendationRequest request, AsyncHandler<CreateBrandKitRecommendationResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKitRecommendation/Create", HttpPost, CreateBrandKitRecommendationResponse.class, asyncHandler);
	}
	
    	
	public AddNewCustomerAcquisitionGoalsResponse addNewCustomerAcquisitionGoals(AddNewCustomerAcquisitionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		AddNewCustomerAcquisitionGoalsResponse response = sendRequest(request, "/NewCustomerAcquisitionGoals", HttpPost, AddNewCustomerAcquisitionGoalsResponse.class);
		
		return response;
	}

    public Response<AddNewCustomerAcquisitionGoalsResponse> addNewCustomerAcquisitionGoalsAsync(AddNewCustomerAcquisitionGoalsRequest request) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals", HttpPost, AddNewCustomerAcquisitionGoalsResponse.class, null);
	}

	public Future<?> addNewCustomerAcquisitionGoalsAsync(AddNewCustomerAcquisitionGoalsRequest request, AsyncHandler<AddNewCustomerAcquisitionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals", HttpPost, AddNewCustomerAcquisitionGoalsResponse.class, asyncHandler);
	}
	
    	
	public UpdateNewCustomerAcquisitionGoalsResponse updateNewCustomerAcquisitionGoals(UpdateNewCustomerAcquisitionGoalsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateNewCustomerAcquisitionGoalsResponse response = sendRequest(request, "/NewCustomerAcquisitionGoals", HttpPut, UpdateNewCustomerAcquisitionGoalsResponse.class);
		
		return response;
	}

    public Response<UpdateNewCustomerAcquisitionGoalsResponse> updateNewCustomerAcquisitionGoalsAsync(UpdateNewCustomerAcquisitionGoalsRequest request) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals", HttpPut, UpdateNewCustomerAcquisitionGoalsResponse.class, null);
	}

	public Future<?> updateNewCustomerAcquisitionGoalsAsync(UpdateNewCustomerAcquisitionGoalsRequest request, AsyncHandler<UpdateNewCustomerAcquisitionGoalsResponse> asyncHandler) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals", HttpPut, UpdateNewCustomerAcquisitionGoalsResponse.class, asyncHandler);
	}
	
    	
	public GetNewCustomerAcquisitionGoalsByAccountIdResponse getNewCustomerAcquisitionGoalsByAccountId(GetNewCustomerAcquisitionGoalsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetNewCustomerAcquisitionGoalsByAccountIdResponse response = sendRequest(request, "/NewCustomerAcquisitionGoals/QueryByAccountId", HttpPost, GetNewCustomerAcquisitionGoalsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetNewCustomerAcquisitionGoalsByAccountIdResponse> getNewCustomerAcquisitionGoalsByAccountIdAsync(GetNewCustomerAcquisitionGoalsByAccountIdRequest request) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals/QueryByAccountId", HttpPost, GetNewCustomerAcquisitionGoalsByAccountIdResponse.class, null);
	}

	public Future<?> getNewCustomerAcquisitionGoalsByAccountIdAsync(GetNewCustomerAcquisitionGoalsByAccountIdRequest request, AsyncHandler<GetNewCustomerAcquisitionGoalsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/NewCustomerAcquisitionGoals/QueryByAccountId", HttpPost, GetNewCustomerAcquisitionGoalsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetBrandKitsByAccountIdResponse getBrandKitsByAccountId(GetBrandKitsByAccountIdRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBrandKitsByAccountIdResponse response = sendRequest(request, "/BrandKits/QueryByAccountId", HttpPost, GetBrandKitsByAccountIdResponse.class);
		
		return response;
	}

    public Response<GetBrandKitsByAccountIdResponse> getBrandKitsByAccountIdAsync(GetBrandKitsByAccountIdRequest request) {
		return sendRequestAsync(request, "/BrandKits/QueryByAccountId", HttpPost, GetBrandKitsByAccountIdResponse.class, null);
	}

	public Future<?> getBrandKitsByAccountIdAsync(GetBrandKitsByAccountIdRequest request, AsyncHandler<GetBrandKitsByAccountIdResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKits/QueryByAccountId", HttpPost, GetBrandKitsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetBrandKitsByIdsResponse getBrandKitsByIds(GetBrandKitsByIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBrandKitsByIdsResponse response = sendRequest(request, "/BrandKits/QueryByIds", HttpPost, GetBrandKitsByIdsResponse.class);
		
		return response;
	}

    public Response<GetBrandKitsByIdsResponse> getBrandKitsByIdsAsync(GetBrandKitsByIdsRequest request) {
		return sendRequestAsync(request, "/BrandKits/QueryByIds", HttpPost, GetBrandKitsByIdsResponse.class, null);
	}

	public Future<?> getBrandKitsByIdsAsync(GetBrandKitsByIdsRequest request, AsyncHandler<GetBrandKitsByIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/BrandKits/QueryByIds", HttpPost, GetBrandKitsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetClipchampTemplatesResponse getClipchampTemplates(GetClipchampTemplatesRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetClipchampTemplatesResponse response = sendRequest(request, "/ClipchampTemplates/Query", HttpPost, GetClipchampTemplatesResponse.class);
		
		return response;
	}

    public Response<GetClipchampTemplatesResponse> getClipchampTemplatesAsync(GetClipchampTemplatesRequest request) {
		return sendRequestAsync(request, "/ClipchampTemplates/Query", HttpPost, GetClipchampTemplatesResponse.class, null);
	}

	public Future<?> getClipchampTemplatesAsync(GetClipchampTemplatesRequest request, AsyncHandler<GetClipchampTemplatesResponse> asyncHandler) {
		return sendRequestAsync(request, "/ClipchampTemplates/Query", HttpPost, GetClipchampTemplatesResponse.class, asyncHandler);
	}
	
    	
	public GetSupportedClipchampAudioResponse getSupportedClipchampAudio(GetSupportedClipchampAudioRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSupportedClipchampAudioResponse response = sendRequest(request, "/SupportedClipchampAudio/Query", HttpPost, GetSupportedClipchampAudioResponse.class);
		
		return response;
	}

    public Response<GetSupportedClipchampAudioResponse> getSupportedClipchampAudioAsync(GetSupportedClipchampAudioRequest request) {
		return sendRequestAsync(request, "/SupportedClipchampAudio/Query", HttpPost, GetSupportedClipchampAudioResponse.class, null);
	}

	public Future<?> getSupportedClipchampAudioAsync(GetSupportedClipchampAudioRequest request, AsyncHandler<GetSupportedClipchampAudioResponse> asyncHandler) {
		return sendRequestAsync(request, "/SupportedClipchampAudio/Query", HttpPost, GetSupportedClipchampAudioResponse.class, asyncHandler);
	}
	
    	
	public GetSupportedFontsResponse getSupportedFonts(GetSupportedFontsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetSupportedFontsResponse response = sendRequest(request, "/SupportedFonts/Query", HttpPost, GetSupportedFontsResponse.class);
		
		return response;
	}

    public Response<GetSupportedFontsResponse> getSupportedFontsAsync(GetSupportedFontsRequest request) {
		return sendRequestAsync(request, "/SupportedFonts/Query", HttpPost, GetSupportedFontsResponse.class, null);
	}

	public Future<?> getSupportedFontsAsync(GetSupportedFontsRequest request, AsyncHandler<GetSupportedFontsResponse> asyncHandler) {
		return sendRequestAsync(request, "/SupportedFonts/Query", HttpPost, GetSupportedFontsResponse.class, asyncHandler);
	}
	
    	
	public GetHealthCheckResponse getHealthCheck(GetHealthCheckRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetHealthCheckResponse response = sendRequest(request, "/HealthCheck/Query", HttpPost, GetHealthCheckResponse.class);
		
		return response;
	}

    public Response<GetHealthCheckResponse> getHealthCheckAsync(GetHealthCheckRequest request) {
		return sendRequestAsync(request, "/HealthCheck/Query", HttpPost, GetHealthCheckResponse.class, null);
	}

	public Future<?> getHealthCheckAsync(GetHealthCheckRequest request, AsyncHandler<GetHealthCheckResponse> asyncHandler) {
		return sendRequestAsync(request, "/HealthCheck/Query", HttpPost, GetHealthCheckResponse.class, asyncHandler);
	}
	
    	
	public GetDiagnosticsResponse getDiagnostics(GetDiagnosticsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetDiagnosticsResponse response = sendRequest(request, "/Diagnostics/Query", HttpPost, GetDiagnosticsResponse.class);
		
		return response;
	}

    public Response<GetDiagnosticsResponse> getDiagnosticsAsync(GetDiagnosticsRequest request) {
		return sendRequestAsync(request, "/Diagnostics/Query", HttpPost, GetDiagnosticsResponse.class, null);
	}

	public Future<?> getDiagnosticsAsync(GetDiagnosticsRequest request, AsyncHandler<GetDiagnosticsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Diagnostics/Query", HttpPost, GetDiagnosticsResponse.class, asyncHandler);
	}
	
    	
	public GetAnnotationOptOutResponse getAnnotationOptOut(GetAnnotationOptOutRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetAnnotationOptOutResponse response = sendRequest(request, "/AnnotationOptOut/Query", HttpPost, GetAnnotationOptOutResponse.class);
		
		return response;
	}

    public Response<GetAnnotationOptOutResponse> getAnnotationOptOutAsync(GetAnnotationOptOutRequest request) {
		return sendRequestAsync(request, "/AnnotationOptOut/Query", HttpPost, GetAnnotationOptOutResponse.class, null);
	}

	public Future<?> getAnnotationOptOutAsync(GetAnnotationOptOutRequest request, AsyncHandler<GetAnnotationOptOutResponse> asyncHandler) {
		return sendRequestAsync(request, "/AnnotationOptOut/Query", HttpPost, GetAnnotationOptOutResponse.class, asyncHandler);
	}
	
    	
	public UpdateAnnotationOptOutResponse updateAnnotationOptOut(UpdateAnnotationOptOutRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UpdateAnnotationOptOutResponse response = sendRequest(request, "/AnnotationOptOut", HttpPut, UpdateAnnotationOptOutResponse.class);
		
		return response;
	}

    public Response<UpdateAnnotationOptOutResponse> updateAnnotationOptOutAsync(UpdateAnnotationOptOutRequest request) {
		return sendRequestAsync(request, "/AnnotationOptOut", HttpPut, UpdateAnnotationOptOutResponse.class, null);
	}

	public Future<?> updateAnnotationOptOutAsync(UpdateAnnotationOptOutRequest request, AsyncHandler<UpdateAnnotationOptOutResponse> asyncHandler) {
		return sendRequestAsync(request, "/AnnotationOptOut", HttpPut, UpdateAnnotationOptOutResponse.class, asyncHandler);
	}
	
    }