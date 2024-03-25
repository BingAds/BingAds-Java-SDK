package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class CampaignManagementRestfulServiceClient extends RestfulServiceClient {

	public CampaignManagementRestfulServiceClient(AuthorizationData authData, ApiEnvironment env, Class serviceInterface) {
        super(authData, env, serviceInterface);
    }

		
	public AddCampaignsResponse addCampaigns(AddCampaignsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns", HttpPost, AddCampaignsResponse.class);
	}

    public Response<AddCampaignsResponse> addCampaignsAsync(AddCampaignsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class);
	}

	public Future<?> addCampaignsAsync(AddCampaignsRequest request, AsyncHandler<AddCampaignsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpPost, AddCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignsByAccountIdResponse getCampaignsByAccountId(GetCampaignsByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class);
	}

    public Response<GetCampaignsByAccountIdResponse> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class);
	}

	public Future<?> getCampaignsByAccountIdAsync(GetCampaignsByAccountIdRequest request, AsyncHandler<GetCampaignsByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/QueryByAccountId", HttpPost, GetCampaignsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignsByIdsResponse getCampaignsByIds(GetCampaignsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class);
	}

    public Response<GetCampaignsByIdsResponse> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class);
	}

	public Future<?> getCampaignsByIdsAsync(GetCampaignsByIdsRequest request, AsyncHandler<GetCampaignsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/QueryByIds", HttpPost, GetCampaignsByIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignsResponse deleteCampaigns(DeleteCampaignsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class);
	}

    public Response<DeleteCampaignsResponse> deleteCampaignsAsync(DeleteCampaignsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class);
	}

	public Future<?> deleteCampaignsAsync(DeleteCampaignsRequest request, AsyncHandler<DeleteCampaignsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpDelete, DeleteCampaignsResponse.class, asyncHandler);
	}
	
    	
	public UpdateCampaignsResponse updateCampaigns(UpdateCampaignsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class);
	}

    public Response<UpdateCampaignsResponse> updateCampaignsAsync(UpdateCampaignsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class);
	}

	public Future<?> updateCampaignsAsync(UpdateCampaignsRequest request, AsyncHandler<UpdateCampaignsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns", HttpPut, UpdateCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(GetNegativeSitesByCampaignIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class);
	}

    public Response<GetNegativeSitesByCampaignIdsResponse> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class);
	}

	public Future<?> getNegativeSitesByCampaignIdsAsync(GetNegativeSitesByCampaignIdsRequest request, AsyncHandler<GetNegativeSitesByCampaignIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/QueryByCampaignIds", HttpPost, GetNegativeSitesByCampaignIdsResponse.class, asyncHandler);
	}
	
    	
	public SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(SetNegativeSitesToCampaignsRequest request) 
			throws Exception {
		return sendRequest(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class);
	}

    public Response<SetNegativeSitesToCampaignsResponse> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class);
	}

	public Future<?> setNegativeSitesToCampaignsAsync(SetNegativeSitesToCampaignsRequest request, AsyncHandler<SetNegativeSitesToCampaignsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/SetToCampaigns", HttpPost, SetNegativeSitesToCampaignsResponse.class, asyncHandler);
	}
	
    	
	public GetConfigValueResponse getConfigValue(GetConfigValueRequest request) 
			throws Exception {
		return sendRequest(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class);
	}

    public Response<GetConfigValueResponse> getConfigValueAsync(GetConfigValueRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class);
	}

	public Future<?> getConfigValueAsync(GetConfigValueRequest request, AsyncHandler<GetConfigValueResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConfigValue/Query", HttpPost, GetConfigValueResponse.class, asyncHandler);
	}
	
    	
	public GetBSCCountriesResponse getBSCCountries(GetBSCCountriesRequest request) 
			throws Exception {
		return sendRequest(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class);
	}

    public Response<GetBSCCountriesResponse> getBSCCountriesAsync(GetBSCCountriesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class);
	}

	public Future<?> getBSCCountriesAsync(GetBSCCountriesRequest request, AsyncHandler<GetBSCCountriesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BSCCountries/Query", HttpPost, GetBSCCountriesResponse.class, asyncHandler);
	}
	
    	
	public AddAdGroupsResponse addAdGroups(AddAdGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class);
	}

    public Response<AddAdGroupsResponse> addAdGroupsAsync(AddAdGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class);
	}

	public Future<?> addAdGroupsAsync(AddAdGroupsRequest request, AsyncHandler<AddAdGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpPost, AddAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdGroupsResponse deleteAdGroups(DeleteAdGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class);
	}

    public Response<DeleteAdGroupsResponse> deleteAdGroupsAsync(DeleteAdGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class);
	}

	public Future<?> deleteAdGroupsAsync(DeleteAdGroupsRequest request, AsyncHandler<DeleteAdGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpDelete, DeleteAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupsByIdsResponse getAdGroupsByIds(GetAdGroupsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class);
	}

    public Response<GetAdGroupsByIdsResponse> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class);
	}

	public Future<?> getAdGroupsByIdsAsync(GetAdGroupsByIdsRequest request, AsyncHandler<GetAdGroupsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups/QueryByIds", HttpPost, GetAdGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(GetAdGroupsByCampaignIdRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class);
	}

    public Response<GetAdGroupsByCampaignIdResponse> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class);
	}

	public Future<?> getAdGroupsByCampaignIdAsync(GetAdGroupsByCampaignIdRequest request, AsyncHandler<GetAdGroupsByCampaignIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups/QueryByCampaignId", HttpPost, GetAdGroupsByCampaignIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdGroupsResponse updateAdGroups(UpdateAdGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class);
	}

    public Response<UpdateAdGroupsResponse> updateAdGroupsAsync(UpdateAdGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class);
	}

	public Future<?> updateAdGroupsAsync(UpdateAdGroupsRequest request, AsyncHandler<UpdateAdGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroups", HttpPut, UpdateAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(GetNegativeSitesByAdGroupIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class);
	}

    public Response<GetNegativeSitesByAdGroupIdsResponse> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class);
	}

	public Future<?> getNegativeSitesByAdGroupIdsAsync(GetNegativeSitesByAdGroupIdsRequest request, AsyncHandler<GetNegativeSitesByAdGroupIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/QueryByAdGroupIds", HttpPost, GetNegativeSitesByAdGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(SetNegativeSitesToAdGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class);
	}

    public Response<SetNegativeSitesToAdGroupsResponse> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class);
	}

	public Future<?> setNegativeSitesToAdGroupsAsync(SetNegativeSitesToAdGroupsRequest request, AsyncHandler<SetNegativeSitesToAdGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeSites/SetToAdGroups", HttpPost, SetNegativeSitesToAdGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(GetGeoLocationsFileUrlRequest request) 
			throws Exception {
		return sendRequest(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class);
	}

    public Response<GetGeoLocationsFileUrlResponse> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class);
	}

	public Future<?> getGeoLocationsFileUrlAsync(GetGeoLocationsFileUrlRequest request, AsyncHandler<GetGeoLocationsFileUrlResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GeoLocationsFileUrl/Query", HttpPost, GetGeoLocationsFileUrlResponse.class, asyncHandler);
	}
	
    	
	public AddAdsResponse addAds(AddAdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads", HttpPost, AddAdsResponse.class);
	}

    public Response<AddAdsResponse> addAdsAsync(AddAdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class);
	}

	public Future<?> addAdsAsync(AddAdsRequest request, AsyncHandler<AddAdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpPost, AddAdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdsResponse deleteAds(DeleteAdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads", HttpDelete, DeleteAdsResponse.class);
	}

    public Response<DeleteAdsResponse> deleteAdsAsync(DeleteAdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class);
	}

	public Future<?> deleteAdsAsync(DeleteAdsRequest request, AsyncHandler<DeleteAdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpDelete, DeleteAdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByEditorialStatusResponse getAdsByEditorialStatus(GetAdsByEditorialStatusRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class);
	}

    public Response<GetAdsByEditorialStatusResponse> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class);
	}

	public Future<?> getAdsByEditorialStatusAsync(GetAdsByEditorialStatusRequest request, AsyncHandler<GetAdsByEditorialStatusResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByEditorialStatus", HttpPost, GetAdsByEditorialStatusResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByIdsResponse getAdsByIds(GetAdsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class);
	}

    public Response<GetAdsByIdsResponse> getAdsByIdsAsync(GetAdsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class);
	}

	public Future<?> getAdsByIdsAsync(GetAdsByIdsRequest request, AsyncHandler<GetAdsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByIds", HttpPost, GetAdsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAdsByAdGroupIdResponse getAdsByAdGroupId(GetAdsByAdGroupIdRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class);
	}

    public Response<GetAdsByAdGroupIdResponse> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class);
	}

	public Future<?> getAdsByAdGroupIdAsync(GetAdsByAdGroupIdRequest request, AsyncHandler<GetAdsByAdGroupIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads/QueryByAdGroupId", HttpPost, GetAdsByAdGroupIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdsResponse updateAds(UpdateAdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Ads", HttpPut, UpdateAdsResponse.class);
	}

    public Response<UpdateAdsResponse> updateAdsAsync(UpdateAdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class);
	}

	public Future<?> updateAdsAsync(UpdateAdsRequest request, AsyncHandler<UpdateAdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Ads", HttpPut, UpdateAdsResponse.class, asyncHandler);
	}
	
    	
	public AddKeywordsResponse addKeywords(AddKeywordsRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords", HttpPost, AddKeywordsResponse.class);
	}

    public Response<AddKeywordsResponse> addKeywordsAsync(AddKeywordsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class);
	}

	public Future<?> addKeywordsAsync(AddKeywordsRequest request, AsyncHandler<AddKeywordsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpPost, AddKeywordsResponse.class, asyncHandler);
	}
	
    	
	public DeleteKeywordsResponse deleteKeywords(DeleteKeywordsRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class);
	}

    public Response<DeleteKeywordsResponse> deleteKeywordsAsync(DeleteKeywordsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class);
	}

	public Future<?> deleteKeywordsAsync(DeleteKeywordsRequest request, AsyncHandler<DeleteKeywordsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpDelete, DeleteKeywordsResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(GetKeywordsByEditorialStatusRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class);
	}

    public Response<GetKeywordsByEditorialStatusResponse> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class);
	}

	public Future<?> getKeywordsByEditorialStatusAsync(GetKeywordsByEditorialStatusRequest request, AsyncHandler<GetKeywordsByEditorialStatusResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByEditorialStatus", HttpPost, GetKeywordsByEditorialStatusResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByIdsResponse getKeywordsByIds(GetKeywordsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class);
	}

    public Response<GetKeywordsByIdsResponse> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class);
	}

	public Future<?> getKeywordsByIdsAsync(GetKeywordsByIdsRequest request, AsyncHandler<GetKeywordsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByIds", HttpPost, GetKeywordsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(GetKeywordsByAdGroupIdRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class);
	}

    public Response<GetKeywordsByAdGroupIdResponse> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class);
	}

	public Future<?> getKeywordsByAdGroupIdAsync(GetKeywordsByAdGroupIdRequest request, AsyncHandler<GetKeywordsByAdGroupIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords/QueryByAdGroupId", HttpPost, GetKeywordsByAdGroupIdResponse.class, asyncHandler);
	}
	
    	
	public UpdateKeywordsResponse updateKeywords(UpdateKeywordsRequest request) 
			throws Exception {
		return sendRequest(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class);
	}

    public Response<UpdateKeywordsResponse> updateKeywordsAsync(UpdateKeywordsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class);
	}

	public Future<?> updateKeywordsAsync(UpdateKeywordsRequest request, AsyncHandler<UpdateKeywordsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Keywords", HttpPut, UpdateKeywordsResponse.class, asyncHandler);
	}
	
    	
	public AppealEditorialRejectionsResponse appealEditorialRejections(AppealEditorialRejectionsRequest request) 
			throws Exception {
		return sendRequest(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class);
	}

    public Response<AppealEditorialRejectionsResponse> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class);
	}

	public Future<?> appealEditorialRejectionsAsync(AppealEditorialRejectionsRequest request, AsyncHandler<AppealEditorialRejectionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EditorialRejections/Appeal", HttpPost, AppealEditorialRejectionsResponse.class, asyncHandler);
	}
	
    	
	public GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(GetEditorialReasonsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class);
	}

    public Response<GetEditorialReasonsByIdsResponse> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class);
	}

	public Future<?> getEditorialReasonsByIdsAsync(GetEditorialReasonsByIdsRequest request, AsyncHandler<GetEditorialReasonsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EditorialReasons/QueryByIds", HttpPost, GetEditorialReasonsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAccountMigrationStatusesResponse getAccountMigrationStatuses(GetAccountMigrationStatusesRequest request) 
			throws Exception {
		return sendRequest(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class);
	}

    public Response<GetAccountMigrationStatusesResponse> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class);
	}

	public Future<?> getAccountMigrationStatusesAsync(GetAccountMigrationStatusesRequest request, AsyncHandler<GetAccountMigrationStatusesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountMigrationStatuses/Query", HttpPost, GetAccountMigrationStatusesResponse.class, asyncHandler);
	}
	
    	
	public SetAccountPropertiesResponse setAccountProperties(SetAccountPropertiesRequest request) 
			throws Exception {
		return sendRequest(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class);
	}

    public Response<SetAccountPropertiesResponse> setAccountPropertiesAsync(SetAccountPropertiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class);
	}

	public Future<?> setAccountPropertiesAsync(SetAccountPropertiesRequest request, AsyncHandler<SetAccountPropertiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountProperties/Set", HttpPost, SetAccountPropertiesResponse.class, asyncHandler);
	}
	
    	
	public GetAccountPropertiesResponse getAccountProperties(GetAccountPropertiesRequest request) 
			throws Exception {
		return sendRequest(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class);
	}

    public Response<GetAccountPropertiesResponse> getAccountPropertiesAsync(GetAccountPropertiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class);
	}

	public Future<?> getAccountPropertiesAsync(GetAccountPropertiesRequest request, AsyncHandler<GetAccountPropertiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AccountProperties/Query", HttpPost, GetAccountPropertiesResponse.class, asyncHandler);
	}
	
    	
	public AddAdExtensionsResponse addAdExtensions(AddAdExtensionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class);
	}

    public Response<AddAdExtensionsResponse> addAdExtensionsAsync(AddAdExtensionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class);
	}

	public Future<?> addAdExtensionsAsync(AddAdExtensionsRequest request, AsyncHandler<AddAdExtensionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpPost, AddAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsByIdsResponse getAdExtensionsByIds(GetAdExtensionsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class);
	}

    public Response<GetAdExtensionsByIdsResponse> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class);
	}

	public Future<?> getAdExtensionsByIdsAsync(GetAdExtensionsByIdsRequest request, AsyncHandler<GetAdExtensionsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions/QueryByIds", HttpPost, GetAdExtensionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdExtensionsResponse updateAdExtensions(UpdateAdExtensionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class);
	}

    public Response<UpdateAdExtensionsResponse> updateAdExtensionsAsync(UpdateAdExtensionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class);
	}

	public Future<?> updateAdExtensionsAsync(UpdateAdExtensionsRequest request, AsyncHandler<UpdateAdExtensionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpPut, UpdateAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdExtensionsResponse deleteAdExtensions(DeleteAdExtensionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class);
	}

    public Response<DeleteAdExtensionsResponse> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class);
	}

	public Future<?> deleteAdExtensionsAsync(DeleteAdExtensionsRequest request, AsyncHandler<DeleteAdExtensionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensions", HttpDelete, DeleteAdExtensionsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(GetAdExtensionsEditorialReasonsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class);
	}

    public Response<GetAdExtensionsEditorialReasonsResponse> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class);
	}

	public Future<?> getAdExtensionsEditorialReasonsAsync(GetAdExtensionsEditorialReasonsRequest request, AsyncHandler<GetAdExtensionsEditorialReasonsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsEditorialReasons/Query", HttpPost, GetAdExtensionsEditorialReasonsResponse.class, asyncHandler);
	}
	
    	
	public SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(SetAdExtensionsAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class);
	}

    public Response<SetAdExtensionsAssociationsResponse> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class);
	}

	public Future<?> setAdExtensionsAssociationsAsync(SetAdExtensionsAssociationsRequest request, AsyncHandler<SetAdExtensionsAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Set", HttpPost, SetAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(GetAdExtensionsAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class);
	}

    public Response<GetAdExtensionsAssociationsResponse> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class);
	}

	public Future<?> getAdExtensionsAssociationsAsync(GetAdExtensionsAssociationsRequest request, AsyncHandler<GetAdExtensionsAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations/Query", HttpPost, GetAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(DeleteAdExtensionsAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class);
	}

    public Response<DeleteAdExtensionsAssociationsResponse> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class);
	}

	public Future<?> deleteAdExtensionsAssociationsAsync(DeleteAdExtensionsAssociationsRequest request, AsyncHandler<DeleteAdExtensionsAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionsAssociations", HttpDelete, DeleteAdExtensionsAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(GetAdExtensionIdsByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class);
	}

    public Response<GetAdExtensionIdsByAccountIdResponse> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class);
	}

	public Future<?> getAdExtensionIdsByAccountIdAsync(GetAdExtensionIdsByAccountIdRequest request, AsyncHandler<GetAdExtensionIdsByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdExtensionIds/QueryByAccountId", HttpPost, GetAdExtensionIdsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddMediaResponse addMedia(AddMediaRequest request) 
			throws Exception {
		return sendRequest(request, "/Media", HttpPost, AddMediaResponse.class);
	}

    public Response<AddMediaResponse> addMediaAsync(AddMediaRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class);
	}

	public Future<?> addMediaAsync(AddMediaRequest request, AsyncHandler<AddMediaResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Media", HttpPost, AddMediaResponse.class, asyncHandler);
	}
	
    	
	public DeleteMediaResponse deleteMedia(DeleteMediaRequest request) 
			throws Exception {
		return sendRequest(request, "/Media", HttpDelete, DeleteMediaResponse.class);
	}

    public Response<DeleteMediaResponse> deleteMediaAsync(DeleteMediaRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class);
	}

	public Future<?> deleteMediaAsync(DeleteMediaRequest request, AsyncHandler<DeleteMediaResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Media", HttpDelete, DeleteMediaResponse.class, asyncHandler);
	}
	
    	
	public GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(GetMediaMetaDataByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class);
	}

    public Response<GetMediaMetaDataByAccountIdResponse> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class);
	}

	public Future<?> getMediaMetaDataByAccountIdAsync(GetMediaMetaDataByAccountIdRequest request, AsyncHandler<GetMediaMetaDataByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaMetaData/QueryByAccountId", HttpPost, GetMediaMetaDataByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(GetMediaMetaDataByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class);
	}

    public Response<GetMediaMetaDataByIdsResponse> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class);
	}

	public Future<?> getMediaMetaDataByIdsAsync(GetMediaMetaDataByIdsRequest request, AsyncHandler<GetMediaMetaDataByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaMetaData/QueryByIds", HttpPost, GetMediaMetaDataByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetMediaAssociationsResponse getMediaAssociations(GetMediaAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class);
	}

    public Response<GetMediaAssociationsResponse> getMediaAssociationsAsync(GetMediaAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class);
	}

	public Future<?> getMediaAssociationsAsync(GetMediaAssociationsRequest request, AsyncHandler<GetMediaAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/MediaAssociations/Query", HttpPost, GetMediaAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(GetAdGroupCriterionsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class);
	}

    public Response<GetAdGroupCriterionsByIdsResponse> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class);
	}

	public Future<?> getAdGroupCriterionsByIdsAsync(GetAdGroupCriterionsByIdsRequest request, AsyncHandler<GetAdGroupCriterionsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions/QueryByIds", HttpPost, GetAdGroupCriterionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAdGroupCriterionsResponse addAdGroupCriterions(AddAdGroupCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class);
	}

    public Response<AddAdGroupCriterionsResponse> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class);
	}

	public Future<?> addAdGroupCriterionsAsync(AddAdGroupCriterionsRequest request, AsyncHandler<AddAdGroupCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPost, AddAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAdGroupCriterionsResponse updateAdGroupCriterions(UpdateAdGroupCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class);
	}

    public Response<UpdateAdGroupCriterionsResponse> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class);
	}

	public Future<?> updateAdGroupCriterionsAsync(UpdateAdGroupCriterionsRequest request, AsyncHandler<UpdateAdGroupCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpPut, UpdateAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(DeleteAdGroupCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class);
	}

    public Response<DeleteAdGroupCriterionsResponse> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class);
	}

	public Future<?> deleteAdGroupCriterionsAsync(DeleteAdGroupCriterionsRequest request, AsyncHandler<DeleteAdGroupCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AdGroupCriterions", HttpDelete, DeleteAdGroupCriterionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyProductPartitionActionsResponse applyProductPartitionActions(ApplyProductPartitionActionsRequest request) 
			throws Exception {
		return sendRequest(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class);
	}

    public Response<ApplyProductPartitionActionsResponse> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class);
	}

	public Future<?> applyProductPartitionActionsAsync(ApplyProductPartitionActionsRequest request, AsyncHandler<ApplyProductPartitionActionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ProductPartitionActions/Apply", HttpPost, ApplyProductPartitionActionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyHotelGroupActionsResponse applyHotelGroupActions(ApplyHotelGroupActionsRequest request) 
			throws Exception {
		return sendRequest(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class);
	}

    public Response<ApplyHotelGroupActionsResponse> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class);
	}

	public Future<?> applyHotelGroupActionsAsync(ApplyHotelGroupActionsRequest request, AsyncHandler<ApplyHotelGroupActionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/HotelGroupActions/Apply", HttpPost, ApplyHotelGroupActionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyAssetGroupListingGroupActionsResponse applyAssetGroupListingGroupActions(ApplyAssetGroupListingGroupActionsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class);
	}

    public Response<ApplyAssetGroupListingGroupActionsResponse> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class);
	}

	public Future<?> applyAssetGroupListingGroupActionsAsync(ApplyAssetGroupListingGroupActionsRequest request, AsyncHandler<ApplyAssetGroupListingGroupActionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupListingGroupActions/Apply", HttpPost, ApplyAssetGroupListingGroupActionsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupListingGroupsByIdsResponse getAssetGroupListingGroupsByIds(GetAssetGroupListingGroupsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class);
	}

    public Response<GetAssetGroupListingGroupsByIdsResponse> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class);
	}

	public Future<?> getAssetGroupListingGroupsByIdsAsync(GetAssetGroupListingGroupsByIdsRequest request, AsyncHandler<GetAssetGroupListingGroupsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupListingGroups/QueryByIds", HttpPost, GetAssetGroupListingGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(GetBMCStoresByCustomerIdRequest request) 
			throws Exception {
		return sendRequest(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class);
	}

    public Response<GetBMCStoresByCustomerIdResponse> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class);
	}

	public Future<?> getBMCStoresByCustomerIdAsync(GetBMCStoresByCustomerIdRequest request, AsyncHandler<GetBMCStoresByCustomerIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BMCStores/QueryByCustomerId", HttpPost, GetBMCStoresByCustomerIdResponse.class, asyncHandler);
	}
	
    	
	public AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(AddNegativeKeywordsToEntitiesRequest request) 
			throws Exception {
		return sendRequest(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class);
	}

    public Response<AddNegativeKeywordsToEntitiesResponse> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class);
	}

	public Future<?> addNegativeKeywordsToEntitiesAsync(AddNegativeKeywordsToEntitiesRequest request, AsyncHandler<AddNegativeKeywordsToEntitiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpPost, AddNegativeKeywordsToEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(GetNegativeKeywordsByEntityIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class);
	}

    public Response<GetNegativeKeywordsByEntityIdsResponse> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class);
	}

	public Future<?> getNegativeKeywordsByEntityIdsAsync(GetNegativeKeywordsByEntityIdsRequest request, AsyncHandler<GetNegativeKeywordsByEntityIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/NegativeKeywords/QueryByEntityIds", HttpPost, GetNegativeKeywordsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(DeleteNegativeKeywordsFromEntitiesRequest request) 
			throws Exception {
		return sendRequest(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class);
	}

    public Response<DeleteNegativeKeywordsFromEntitiesResponse> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class);
	}

	public Future<?> deleteNegativeKeywordsFromEntitiesAsync(DeleteNegativeKeywordsFromEntitiesRequest request, AsyncHandler<DeleteNegativeKeywordsFromEntitiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityNegativeKeywords", HttpDelete, DeleteNegativeKeywordsFromEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(GetSharedEntitiesByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class);
	}

    public Response<GetSharedEntitiesByAccountIdResponse> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class);
	}

	public Future<?> getSharedEntitiesByAccountIdAsync(GetSharedEntitiesByAccountIdRequest request, AsyncHandler<GetSharedEntitiesByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities/QueryByAccountId", HttpPost, GetSharedEntitiesByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntitiesResponse getSharedEntities(GetSharedEntitiesRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class);
	}

    public Response<GetSharedEntitiesResponse> getSharedEntitiesAsync(GetSharedEntitiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class);
	}

	public Future<?> getSharedEntitiesAsync(GetSharedEntitiesRequest request, AsyncHandler<GetSharedEntitiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities/Query", HttpPost, GetSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public AddSharedEntityResponse addSharedEntity(AddSharedEntityRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class);
	}

    public Response<AddSharedEntityResponse> addSharedEntityAsync(AddSharedEntityRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class);
	}

	public Future<?> addSharedEntityAsync(AddSharedEntityRequest request, AsyncHandler<AddSharedEntityResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntity", HttpPost, AddSharedEntityResponse.class, asyncHandler);
	}
	
    	
	public GetListItemsBySharedListResponse getListItemsBySharedList(GetListItemsBySharedListRequest request) 
			throws Exception {
		return sendRequest(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class);
	}

    public Response<GetListItemsBySharedListResponse> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class);
	}

	public Future<?> getListItemsBySharedListAsync(GetListItemsBySharedListRequest request, AsyncHandler<GetListItemsBySharedListResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems/QueryBySharedList", HttpPost, GetListItemsBySharedListResponse.class, asyncHandler);
	}
	
    	
	public AddListItemsToSharedListResponse addListItemsToSharedList(AddListItemsToSharedListRequest request) 
			throws Exception {
		return sendRequest(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class);
	}

    public Response<AddListItemsToSharedListResponse> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class);
	}

	public Future<?> addListItemsToSharedListAsync(AddListItemsToSharedListRequest request, AsyncHandler<AddListItemsToSharedListResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems", HttpPost, AddListItemsToSharedListResponse.class, asyncHandler);
	}
	
    	
	public UpdateSharedEntitiesResponse updateSharedEntities(UpdateSharedEntitiesRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class);
	}

    public Response<UpdateSharedEntitiesResponse> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class);
	}

	public Future<?> updateSharedEntitiesAsync(UpdateSharedEntitiesRequest request, AsyncHandler<UpdateSharedEntitiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities", HttpPut, UpdateSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(DeleteListItemsFromSharedListRequest request) 
			throws Exception {
		return sendRequest(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class);
	}

    public Response<DeleteListItemsFromSharedListResponse> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class);
	}

	public Future<?> deleteListItemsFromSharedListAsync(DeleteListItemsFromSharedListRequest request, AsyncHandler<DeleteListItemsFromSharedListResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ListItems", HttpDelete, DeleteListItemsFromSharedListResponse.class, asyncHandler);
	}
	
    	
	public SetSharedEntityAssociationsResponse setSharedEntityAssociations(SetSharedEntityAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class);
	}

    public Response<SetSharedEntityAssociationsResponse> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class);
	}

	public Future<?> setSharedEntityAssociationsAsync(SetSharedEntityAssociationsRequest request, AsyncHandler<SetSharedEntityAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/Set", HttpPost, SetSharedEntityAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(DeleteSharedEntityAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class);
	}

    public Response<DeleteSharedEntityAssociationsResponse> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class);
	}

	public Future<?> deleteSharedEntityAssociationsAsync(DeleteSharedEntityAssociationsRequest request, AsyncHandler<DeleteSharedEntityAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations", HttpDelete, DeleteSharedEntityAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(GetSharedEntityAssociationsBySharedEntityIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
	}

    public Response<GetSharedEntityAssociationsBySharedEntityIdsResponse> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class);
	}

	public Future<?> getSharedEntityAssociationsBySharedEntityIdsAsync(GetSharedEntityAssociationsBySharedEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsBySharedEntityIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryBySharedEntityIds", HttpPost, GetSharedEntityAssociationsBySharedEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(GetSharedEntityAssociationsByEntityIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class);
	}

    public Response<GetSharedEntityAssociationsByEntityIdsResponse> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class);
	}

	public Future<?> getSharedEntityAssociationsByEntityIdsAsync(GetSharedEntityAssociationsByEntityIdsRequest request, AsyncHandler<GetSharedEntityAssociationsByEntityIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntityAssociations/QueryByEntityIds", HttpPost, GetSharedEntityAssociationsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSharedEntitiesResponse deleteSharedEntities(DeleteSharedEntitiesRequest request) 
			throws Exception {
		return sendRequest(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class);
	}

    public Response<DeleteSharedEntitiesResponse> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class);
	}

	public Future<?> deleteSharedEntitiesAsync(DeleteSharedEntitiesRequest request, AsyncHandler<DeleteSharedEntitiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SharedEntities", HttpDelete, DeleteSharedEntitiesResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(GetCampaignSizesByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class);
	}

    public Response<GetCampaignSizesByAccountIdResponse> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class);
	}

	public Future<?> getCampaignSizesByAccountIdAsync(GetCampaignSizesByAccountIdRequest request, AsyncHandler<GetCampaignSizesByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignSizes/QueryByAccountId", HttpPost, GetCampaignSizesByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddCampaignCriterionsResponse addCampaignCriterions(AddCampaignCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class);
	}

    public Response<AddCampaignCriterionsResponse> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class);
	}

	public Future<?> addCampaignCriterionsAsync(AddCampaignCriterionsRequest request, AsyncHandler<AddCampaignCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPost, AddCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateCampaignCriterionsResponse updateCampaignCriterions(UpdateCampaignCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class);
	}

    public Response<UpdateCampaignCriterionsResponse> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class);
	}

	public Future<?> updateCampaignCriterionsAsync(UpdateCampaignCriterionsRequest request, AsyncHandler<UpdateCampaignCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpPut, UpdateCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignCriterionsResponse deleteCampaignCriterions(DeleteCampaignCriterionsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class);
	}

    public Response<DeleteCampaignCriterionsResponse> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class);
	}

	public Future<?> deleteCampaignCriterionsAsync(DeleteCampaignCriterionsRequest request, AsyncHandler<DeleteCampaignCriterionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions", HttpDelete, DeleteCampaignCriterionsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(GetCampaignCriterionsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class);
	}

    public Response<GetCampaignCriterionsByIdsResponse> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class);
	}

	public Future<?> getCampaignCriterionsByIdsAsync(GetCampaignCriterionsByIdsRequest request, AsyncHandler<GetCampaignCriterionsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignCriterions/QueryByIds", HttpPost, GetCampaignCriterionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddBudgetsResponse addBudgets(AddBudgetsRequest request) 
			throws Exception {
		return sendRequest(request, "/Budgets", HttpPost, AddBudgetsResponse.class);
	}

    public Response<AddBudgetsResponse> addBudgetsAsync(AddBudgetsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class);
	}

	public Future<?> addBudgetsAsync(AddBudgetsRequest request, AsyncHandler<AddBudgetsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpPost, AddBudgetsResponse.class, asyncHandler);
	}
	
    	
	public UpdateBudgetsResponse updateBudgets(UpdateBudgetsRequest request) 
			throws Exception {
		return sendRequest(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class);
	}

    public Response<UpdateBudgetsResponse> updateBudgetsAsync(UpdateBudgetsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class);
	}

	public Future<?> updateBudgetsAsync(UpdateBudgetsRequest request, AsyncHandler<UpdateBudgetsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpPut, UpdateBudgetsResponse.class, asyncHandler);
	}
	
    	
	public DeleteBudgetsResponse deleteBudgets(DeleteBudgetsRequest request) 
			throws Exception {
		return sendRequest(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class);
	}

    public Response<DeleteBudgetsResponse> deleteBudgetsAsync(DeleteBudgetsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class);
	}

	public Future<?> deleteBudgetsAsync(DeleteBudgetsRequest request, AsyncHandler<DeleteBudgetsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets", HttpDelete, DeleteBudgetsResponse.class, asyncHandler);
	}
	
    	
	public GetBudgetsByIdsResponse getBudgetsByIds(GetBudgetsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class);
	}

    public Response<GetBudgetsByIdsResponse> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class);
	}

	public Future<?> getBudgetsByIdsAsync(GetBudgetsByIdsRequest request, AsyncHandler<GetBudgetsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Budgets/QueryByIds", HttpPost, GetBudgetsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(GetCampaignIdsByBudgetIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class);
	}

    public Response<GetCampaignIdsByBudgetIdsResponse> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class);
	}

	public Future<?> getCampaignIdsByBudgetIdsAsync(GetCampaignIdsByBudgetIdsRequest request, AsyncHandler<GetCampaignIdsByBudgetIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignIds/QueryByBudgetIds", HttpPost, GetCampaignIdsByBudgetIdsResponse.class, asyncHandler);
	}
	
    	
	public AddBidStrategiesResponse addBidStrategies(AddBidStrategiesRequest request) 
			throws Exception {
		return sendRequest(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class);
	}

    public Response<AddBidStrategiesResponse> addBidStrategiesAsync(AddBidStrategiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class);
	}

	public Future<?> addBidStrategiesAsync(AddBidStrategiesRequest request, AsyncHandler<AddBidStrategiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpPost, AddBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public UpdateBidStrategiesResponse updateBidStrategies(UpdateBidStrategiesRequest request) 
			throws Exception {
		return sendRequest(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class);
	}

    public Response<UpdateBidStrategiesResponse> updateBidStrategiesAsync(UpdateBidStrategiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class);
	}

	public Future<?> updateBidStrategiesAsync(UpdateBidStrategiesRequest request, AsyncHandler<UpdateBidStrategiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpPut, UpdateBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public DeleteBidStrategiesResponse deleteBidStrategies(DeleteBidStrategiesRequest request) 
			throws Exception {
		return sendRequest(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class);
	}

    public Response<DeleteBidStrategiesResponse> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class);
	}

	public Future<?> deleteBidStrategiesAsync(DeleteBidStrategiesRequest request, AsyncHandler<DeleteBidStrategiesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies", HttpDelete, DeleteBidStrategiesResponse.class, asyncHandler);
	}
	
    	
	public GetBidStrategiesByIdsResponse getBidStrategiesByIds(GetBidStrategiesByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class);
	}

    public Response<GetBidStrategiesByIdsResponse> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class);
	}

	public Future<?> getBidStrategiesByIdsAsync(GetBidStrategiesByIdsRequest request, AsyncHandler<GetBidStrategiesByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BidStrategies/QueryByIds", HttpPost, GetBidStrategiesByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetCampaignIdsByBidStrategyIdsResponse getCampaignIdsByBidStrategyIds(GetCampaignIdsByBidStrategyIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class);
	}

    public Response<GetCampaignIdsByBidStrategyIdsResponse> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class);
	}

	public Future<?> getCampaignIdsByBidStrategyIdsAsync(GetCampaignIdsByBidStrategyIdsRequest request, AsyncHandler<GetCampaignIdsByBidStrategyIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignIds/QueryByBidStrategyIds", HttpPost, GetCampaignIdsByBidStrategyIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAudienceGroupsResponse addAudienceGroups(AddAudienceGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class);
	}

    public Response<AddAudienceGroupsResponse> addAudienceGroupsAsync(AddAudienceGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class);
	}

	public Future<?> addAudienceGroupsAsync(AddAudienceGroupsRequest request, AsyncHandler<AddAudienceGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpPost, AddAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAudienceGroupsResponse updateAudienceGroups(UpdateAudienceGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class);
	}

    public Response<UpdateAudienceGroupsResponse> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class);
	}

	public Future<?> updateAudienceGroupsAsync(UpdateAudienceGroupsRequest request, AsyncHandler<UpdateAudienceGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpPut, UpdateAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudienceGroupsResponse deleteAudienceGroups(DeleteAudienceGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class);
	}

    public Response<DeleteAudienceGroupsResponse> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class);
	}

	public Future<?> deleteAudienceGroupsAsync(DeleteAudienceGroupsRequest request, AsyncHandler<DeleteAudienceGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups", HttpDelete, DeleteAudienceGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupsByIdsResponse getAudienceGroupsByIds(GetAudienceGroupsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class);
	}

    public Response<GetAudienceGroupsByIdsResponse> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class);
	}

	public Future<?> getAudienceGroupsByIdsAsync(GetAudienceGroupsByIdsRequest request, AsyncHandler<GetAudienceGroupsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroups/QueryByIds", HttpPost, GetAudienceGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAssetGroupsResponse addAssetGroups(AddAssetGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class);
	}

    public Response<AddAssetGroupsResponse> addAssetGroupsAsync(AddAssetGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class);
	}

	public Future<?> addAssetGroupsAsync(AddAssetGroupsRequest request, AsyncHandler<AddAssetGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpPost, AddAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public UpdateAssetGroupsResponse updateAssetGroups(UpdateAssetGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class);
	}

    public Response<UpdateAssetGroupsResponse> updateAssetGroupsAsync(UpdateAssetGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class);
	}

	public Future<?> updateAssetGroupsAsync(UpdateAssetGroupsRequest request, AsyncHandler<UpdateAssetGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpPut, UpdateAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAssetGroupsResponse deleteAssetGroups(DeleteAssetGroupsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class);
	}

    public Response<DeleteAssetGroupsResponse> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class);
	}

	public Future<?> deleteAssetGroupsAsync(DeleteAssetGroupsRequest request, AsyncHandler<DeleteAssetGroupsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups", HttpDelete, DeleteAssetGroupsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsByIdsResponse getAssetGroupsByIds(GetAssetGroupsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class);
	}

    public Response<GetAssetGroupsByIdsResponse> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class);
	}

	public Future<?> getAssetGroupsByIdsAsync(GetAssetGroupsByIdsRequest request, AsyncHandler<GetAssetGroupsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups/QueryByIds", HttpPost, GetAssetGroupsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsByCampaignIdResponse getAssetGroupsByCampaignId(GetAssetGroupsByCampaignIdRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class);
	}

    public Response<GetAssetGroupsByCampaignIdResponse> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class);
	}

	public Future<?> getAssetGroupsByCampaignIdAsync(GetAssetGroupsByCampaignIdRequest request, AsyncHandler<GetAssetGroupsByCampaignIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroups/QueryByCampaignId", HttpPost, GetAssetGroupsByCampaignIdResponse.class, asyncHandler);
	}
	
    	
	public GetAssetGroupsEditorialReasonsResponse getAssetGroupsEditorialReasons(GetAssetGroupsEditorialReasonsRequest request) 
			throws Exception {
		return sendRequest(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class);
	}

    public Response<GetAssetGroupsEditorialReasonsResponse> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class);
	}

	public Future<?> getAssetGroupsEditorialReasonsAsync(GetAssetGroupsEditorialReasonsRequest request, AsyncHandler<GetAssetGroupsEditorialReasonsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AssetGroupsEditorialReasons/Query", HttpPost, GetAssetGroupsEditorialReasonsResponse.class, asyncHandler);
	}
	
    	
	public SetAudienceGroupAssetGroupAssociationsResponse setAudienceGroupAssetGroupAssociations(SetAudienceGroupAssetGroupAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class);
	}

    public Response<SetAudienceGroupAssetGroupAssociationsResponse> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class);
	}

	public Future<?> setAudienceGroupAssetGroupAssociationsAsync(SetAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<SetAudienceGroupAssetGroupAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/Set", HttpPost, SetAudienceGroupAssetGroupAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudienceGroupAssetGroupAssociationsResponse deleteAudienceGroupAssetGroupAssociations(DeleteAudienceGroupAssetGroupAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class);
	}

    public Response<DeleteAudienceGroupAssetGroupAssociationsResponse> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class);
	}

	public Future<?> deleteAudienceGroupAssetGroupAssociationsAsync(DeleteAudienceGroupAssetGroupAssociationsRequest request, AsyncHandler<DeleteAudienceGroupAssetGroupAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations", HttpDelete, DeleteAudienceGroupAssetGroupAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAssetGroupIds(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class);
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAssetGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAssetGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAssetGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse getAudienceGroupAssetGroupAssociationsByAudienceGroupIds(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class);
	}

    public Response<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class);
	}

	public Future<?> getAudienceGroupAssetGroupAssociationsByAudienceGroupIdsAsync(GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsRequest request, AsyncHandler<GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/AudienceGroupAssetGroupAssociations/QueryByAudienceGroupIds", HttpPost, GetAudienceGroupAssetGroupAssociationsByAudienceGroupIdsResponse.class, asyncHandler);
	}
	
    	
	public AddAudiencesResponse addAudiences(AddAudiencesRequest request) 
			throws Exception {
		return sendRequest(request, "/Audiences", HttpPost, AddAudiencesResponse.class);
	}

    public Response<AddAudiencesResponse> addAudiencesAsync(AddAudiencesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class);
	}

	public Future<?> addAudiencesAsync(AddAudiencesRequest request, AsyncHandler<AddAudiencesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpPost, AddAudiencesResponse.class, asyncHandler);
	}
	
    	
	public UpdateAudiencesResponse updateAudiences(UpdateAudiencesRequest request) 
			throws Exception {
		return sendRequest(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class);
	}

    public Response<UpdateAudiencesResponse> updateAudiencesAsync(UpdateAudiencesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class);
	}

	public Future<?> updateAudiencesAsync(UpdateAudiencesRequest request, AsyncHandler<UpdateAudiencesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpPut, UpdateAudiencesResponse.class, asyncHandler);
	}
	
    	
	public DeleteAudiencesResponse deleteAudiences(DeleteAudiencesRequest request) 
			throws Exception {
		return sendRequest(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class);
	}

    public Response<DeleteAudiencesResponse> deleteAudiencesAsync(DeleteAudiencesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class);
	}

	public Future<?> deleteAudiencesAsync(DeleteAudiencesRequest request, AsyncHandler<DeleteAudiencesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences", HttpDelete, DeleteAudiencesResponse.class, asyncHandler);
	}
	
    	
	public GetAudiencesByIdsResponse getAudiencesByIds(GetAudiencesByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class);
	}

    public Response<GetAudiencesByIdsResponse> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class);
	}

	public Future<?> getAudiencesByIdsAsync(GetAudiencesByIdsRequest request, AsyncHandler<GetAudiencesByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Audiences/QueryByIds", HttpPost, GetAudiencesByIdsResponse.class, asyncHandler);
	}
	
    	
	public ApplyCustomerListItemsResponse applyCustomerListItems(ApplyCustomerListItemsRequest request) 
			throws Exception {
		return sendRequest(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class);
	}

    public Response<ApplyCustomerListItemsResponse> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class);
	}

	public Future<?> applyCustomerListItemsAsync(ApplyCustomerListItemsRequest request, AsyncHandler<ApplyCustomerListItemsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CustomerListItems/Apply", HttpPost, ApplyCustomerListItemsResponse.class, asyncHandler);
	}
	
    	
	public ApplyCustomerListUserDataResponse applyCustomerListUserData(ApplyCustomerListUserDataRequest request) 
			throws Exception {
		return sendRequest(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class);
	}

    public Response<ApplyCustomerListUserDataResponse> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class);
	}

	public Future<?> applyCustomerListUserDataAsync(ApplyCustomerListUserDataRequest request, AsyncHandler<ApplyCustomerListUserDataResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CustomerListUserData/Apply", HttpPost, ApplyCustomerListUserDataResponse.class, asyncHandler);
	}
	
    	
	public GetUetTagsByIdsResponse getUetTagsByIds(GetUetTagsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class);
	}

    public Response<GetUetTagsByIdsResponse> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class);
	}

	public Future<?> getUetTagsByIdsAsync(GetUetTagsByIdsRequest request, AsyncHandler<GetUetTagsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags/QueryByIds", HttpPost, GetUetTagsByIdsResponse.class, asyncHandler);
	}
	
    	
	public AddUetTagsResponse addUetTags(AddUetTagsRequest request) 
			throws Exception {
		return sendRequest(request, "/UetTags", HttpPost, AddUetTagsResponse.class);
	}

    public Response<AddUetTagsResponse> addUetTagsAsync(AddUetTagsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class);
	}

	public Future<?> addUetTagsAsync(AddUetTagsRequest request, AsyncHandler<AddUetTagsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags", HttpPost, AddUetTagsResponse.class, asyncHandler);
	}
	
    	
	public UpdateUetTagsResponse updateUetTags(UpdateUetTagsRequest request) 
			throws Exception {
		return sendRequest(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class);
	}

    public Response<UpdateUetTagsResponse> updateUetTagsAsync(UpdateUetTagsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class);
	}

	public Future<?> updateUetTagsAsync(UpdateUetTagsRequest request, AsyncHandler<UpdateUetTagsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/UetTags", HttpPut, UpdateUetTagsResponse.class, asyncHandler);
	}
	
    	
	public GetConversionGoalsByIdsResponse getConversionGoalsByIds(GetConversionGoalsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class);
	}

    public Response<GetConversionGoalsByIdsResponse> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class);
	}

	public Future<?> getConversionGoalsByIdsAsync(GetConversionGoalsByIdsRequest request, AsyncHandler<GetConversionGoalsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals/QueryByIds", HttpPost, GetConversionGoalsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(GetConversionGoalsByTagIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class);
	}

    public Response<GetConversionGoalsByTagIdsResponse> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class);
	}

	public Future<?> getConversionGoalsByTagIdsAsync(GetConversionGoalsByTagIdsRequest request, AsyncHandler<GetConversionGoalsByTagIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals/QueryByTagIds", HttpPost, GetConversionGoalsByTagIdsResponse.class, asyncHandler);
	}
	
    	
	public AddConversionGoalsResponse addConversionGoals(AddConversionGoalsRequest request) 
			throws Exception {
		return sendRequest(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class);
	}

    public Response<AddConversionGoalsResponse> addConversionGoalsAsync(AddConversionGoalsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class);
	}

	public Future<?> addConversionGoalsAsync(AddConversionGoalsRequest request, AsyncHandler<AddConversionGoalsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals", HttpPost, AddConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public UpdateConversionGoalsResponse updateConversionGoals(UpdateConversionGoalsRequest request) 
			throws Exception {
		return sendRequest(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class);
	}

    public Response<UpdateConversionGoalsResponse> updateConversionGoalsAsync(UpdateConversionGoalsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class);
	}

	public Future<?> updateConversionGoalsAsync(UpdateConversionGoalsRequest request, AsyncHandler<UpdateConversionGoalsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ConversionGoals", HttpPut, UpdateConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOfflineConversionsResponse applyOfflineConversions(ApplyOfflineConversionsRequest request) 
			throws Exception {
		return sendRequest(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class);
	}

    public Response<ApplyOfflineConversionsResponse> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class);
	}

	public Future<?> applyOfflineConversionsAsync(ApplyOfflineConversionsRequest request, AsyncHandler<ApplyOfflineConversionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OfflineConversions/Apply", HttpPost, ApplyOfflineConversionsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOfflineConversionAdjustmentsResponse applyOfflineConversionAdjustments(ApplyOfflineConversionAdjustmentsRequest request) 
			throws Exception {
		return sendRequest(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class);
	}

    public Response<ApplyOfflineConversionAdjustmentsResponse> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class);
	}

	public Future<?> applyOfflineConversionAdjustmentsAsync(ApplyOfflineConversionAdjustmentsRequest request, AsyncHandler<ApplyOfflineConversionAdjustmentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OfflineConversionAdjustments/Apply", HttpPost, ApplyOfflineConversionAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public ApplyOnlineConversionAdjustmentsResponse applyOnlineConversionAdjustments(ApplyOnlineConversionAdjustmentsRequest request) 
			throws Exception {
		return sendRequest(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class);
	}

    public Response<ApplyOnlineConversionAdjustmentsResponse> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class);
	}

	public Future<?> applyOnlineConversionAdjustmentsAsync(ApplyOnlineConversionAdjustmentsRequest request, AsyncHandler<ApplyOnlineConversionAdjustmentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/OnlineConversionAdjustments/Apply", HttpPost, ApplyOnlineConversionAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public AddLabelsResponse addLabels(AddLabelsRequest request) 
			throws Exception {
		return sendRequest(request, "/Labels", HttpPost, AddLabelsResponse.class);
	}

    public Response<AddLabelsResponse> addLabelsAsync(AddLabelsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class);
	}

	public Future<?> addLabelsAsync(AddLabelsRequest request, AsyncHandler<AddLabelsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpPost, AddLabelsResponse.class, asyncHandler);
	}
	
    	
	public DeleteLabelsResponse deleteLabels(DeleteLabelsRequest request) 
			throws Exception {
		return sendRequest(request, "/Labels", HttpDelete, DeleteLabelsResponse.class);
	}

    public Response<DeleteLabelsResponse> deleteLabelsAsync(DeleteLabelsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class);
	}

	public Future<?> deleteLabelsAsync(DeleteLabelsRequest request, AsyncHandler<DeleteLabelsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpDelete, DeleteLabelsResponse.class, asyncHandler);
	}
	
    	
	public UpdateLabelsResponse updateLabels(UpdateLabelsRequest request) 
			throws Exception {
		return sendRequest(request, "/Labels", HttpPut, UpdateLabelsResponse.class);
	}

    public Response<UpdateLabelsResponse> updateLabelsAsync(UpdateLabelsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class);
	}

	public Future<?> updateLabelsAsync(UpdateLabelsRequest request, AsyncHandler<UpdateLabelsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels", HttpPut, UpdateLabelsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelsByIdsResponse getLabelsByIds(GetLabelsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class);
	}

    public Response<GetLabelsByIdsResponse> getLabelsByIdsAsync(GetLabelsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class);
	}

	public Future<?> getLabelsByIdsAsync(GetLabelsByIdsRequest request, AsyncHandler<GetLabelsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Labels/QueryByIds", HttpPost, GetLabelsByIdsResponse.class, asyncHandler);
	}
	
    	
	public SetLabelAssociationsResponse setLabelAssociations(SetLabelAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class);
	}

    public Response<SetLabelAssociationsResponse> setLabelAssociationsAsync(SetLabelAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class);
	}

	public Future<?> setLabelAssociationsAsync(SetLabelAssociationsRequest request, AsyncHandler<SetLabelAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/Set", HttpPost, SetLabelAssociationsResponse.class, asyncHandler);
	}
	
    	
	public DeleteLabelAssociationsResponse deleteLabelAssociations(DeleteLabelAssociationsRequest request) 
			throws Exception {
		return sendRequest(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class);
	}

    public Response<DeleteLabelAssociationsResponse> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class);
	}

	public Future<?> deleteLabelAssociationsAsync(DeleteLabelAssociationsRequest request, AsyncHandler<DeleteLabelAssociationsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations", HttpDelete, DeleteLabelAssociationsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(GetLabelAssociationsByEntityIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class);
	}

    public Response<GetLabelAssociationsByEntityIdsResponse> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class);
	}

	public Future<?> getLabelAssociationsByEntityIdsAsync(GetLabelAssociationsByEntityIdsRequest request, AsyncHandler<GetLabelAssociationsByEntityIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/QueryByEntityIds", HttpPost, GetLabelAssociationsByEntityIdsResponse.class, asyncHandler);
	}
	
    	
	public GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(GetLabelAssociationsByLabelIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class);
	}

    public Response<GetLabelAssociationsByLabelIdsResponse> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class);
	}

	public Future<?> getLabelAssociationsByLabelIdsAsync(GetLabelAssociationsByLabelIdsRequest request, AsyncHandler<GetLabelAssociationsByLabelIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/LabelAssociations/QueryByLabelIds", HttpPost, GetLabelAssociationsByLabelIdsResponse.class, asyncHandler);
	}
	
    	
	public AddExperimentsResponse addExperiments(AddExperimentsRequest request) 
			throws Exception {
		return sendRequest(request, "/Experiments", HttpPost, AddExperimentsResponse.class);
	}

    public Response<AddExperimentsResponse> addExperimentsAsync(AddExperimentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class);
	}

	public Future<?> addExperimentsAsync(AddExperimentsRequest request, AsyncHandler<AddExperimentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpPost, AddExperimentsResponse.class, asyncHandler);
	}
	
    	
	public DeleteExperimentsResponse deleteExperiments(DeleteExperimentsRequest request) 
			throws Exception {
		return sendRequest(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class);
	}

    public Response<DeleteExperimentsResponse> deleteExperimentsAsync(DeleteExperimentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class);
	}

	public Future<?> deleteExperimentsAsync(DeleteExperimentsRequest request, AsyncHandler<DeleteExperimentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpDelete, DeleteExperimentsResponse.class, asyncHandler);
	}
	
    	
	public UpdateExperimentsResponse updateExperiments(UpdateExperimentsRequest request) 
			throws Exception {
		return sendRequest(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class);
	}

    public Response<UpdateExperimentsResponse> updateExperimentsAsync(UpdateExperimentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class);
	}

	public Future<?> updateExperimentsAsync(UpdateExperimentsRequest request, AsyncHandler<UpdateExperimentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments", HttpPut, UpdateExperimentsResponse.class, asyncHandler);
	}
	
    	
	public GetExperimentsByIdsResponse getExperimentsByIds(GetExperimentsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class);
	}

    public Response<GetExperimentsByIdsResponse> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class);
	}

	public Future<?> getExperimentsByIdsAsync(GetExperimentsByIdsRequest request, AsyncHandler<GetExperimentsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Experiments/QueryByIds", HttpPost, GetExperimentsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetProfileDataFileUrlResponse getProfileDataFileUrl(GetProfileDataFileUrlRequest request) 
			throws Exception {
		return sendRequest(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class);
	}

    public Response<GetProfileDataFileUrlResponse> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class);
	}

	public Future<?> getProfileDataFileUrlAsync(GetProfileDataFileUrlRequest request, AsyncHandler<GetProfileDataFileUrlResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ProfileDataFileUrl/Query", HttpPost, GetProfileDataFileUrlResponse.class, asyncHandler);
	}
	
    	
	public SearchCompaniesResponse searchCompanies(SearchCompaniesRequest request) 
			throws Exception {
		return sendRequest(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class);
	}

    public Response<SearchCompaniesResponse> searchCompaniesAsync(SearchCompaniesRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class);
	}

	public Future<?> searchCompaniesAsync(SearchCompaniesRequest request, AsyncHandler<SearchCompaniesResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Companies/Search", HttpPost, SearchCompaniesResponse.class, asyncHandler);
	}
	
    	
	public GetFileImportUploadUrlResponse getFileImportUploadUrl(GetFileImportUploadUrlRequest request) 
			throws Exception {
		return sendRequest(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class);
	}

    public Response<GetFileImportUploadUrlResponse> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class);
	}

	public Future<?> getFileImportUploadUrlAsync(GetFileImportUploadUrlRequest request, AsyncHandler<GetFileImportUploadUrlResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/FileImportUploadUrl/Query", HttpPost, GetFileImportUploadUrlResponse.class, asyncHandler);
	}
	
    	
	public AddImportJobsResponse addImportJobs(AddImportJobsRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class);
	}

    public Response<AddImportJobsResponse> addImportJobsAsync(AddImportJobsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class);
	}

	public Future<?> addImportJobsAsync(AddImportJobsRequest request, AsyncHandler<AddImportJobsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpPost, AddImportJobsResponse.class, asyncHandler);
	}
	
    	
	public GetImportResultsResponse getImportResults(GetImportResultsRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class);
	}

    public Response<GetImportResultsResponse> getImportResultsAsync(GetImportResultsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class);
	}

	public Future<?> getImportResultsAsync(GetImportResultsRequest request, AsyncHandler<GetImportResultsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportResults/Query", HttpPost, GetImportResultsResponse.class, asyncHandler);
	}
	
    	
	public GetImportJobsByIdsResponse getImportJobsByIds(GetImportJobsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class);
	}

    public Response<GetImportJobsByIdsResponse> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class);
	}

	public Future<?> getImportJobsByIdsAsync(GetImportJobsByIdsRequest request, AsyncHandler<GetImportJobsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs/QueryByIds", HttpPost, GetImportJobsByIdsResponse.class, asyncHandler);
	}
	
    	
	public DeleteImportJobsResponse deleteImportJobs(DeleteImportJobsRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class);
	}

    public Response<DeleteImportJobsResponse> deleteImportJobsAsync(DeleteImportJobsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class);
	}

	public Future<?> deleteImportJobsAsync(DeleteImportJobsRequest request, AsyncHandler<DeleteImportJobsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpDelete, DeleteImportJobsResponse.class, asyncHandler);
	}
	
    	
	public GetImportEntityIdsMappingResponse getImportEntityIdsMapping(GetImportEntityIdsMappingRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class);
	}

    public Response<GetImportEntityIdsMappingResponse> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class);
	}

	public Future<?> getImportEntityIdsMappingAsync(GetImportEntityIdsMappingRequest request, AsyncHandler<GetImportEntityIdsMappingResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportEntityIdsMapping/Query", HttpPost, GetImportEntityIdsMappingResponse.class, asyncHandler);
	}
	
    	
	public UpdateImportJobsResponse updateImportJobs(UpdateImportJobsRequest request) 
			throws Exception {
		return sendRequest(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class);
	}

    public Response<UpdateImportJobsResponse> updateImportJobsAsync(UpdateImportJobsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class);
	}

	public Future<?> updateImportJobsAsync(UpdateImportJobsRequest request, AsyncHandler<UpdateImportJobsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/ImportJobs", HttpPut, UpdateImportJobsResponse.class, asyncHandler);
	}
	
    	
	public AddVideosResponse addVideos(AddVideosRequest request) 
			throws Exception {
		return sendRequest(request, "/Videos", HttpPost, AddVideosResponse.class);
	}

    public Response<AddVideosResponse> addVideosAsync(AddVideosRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class);
	}

	public Future<?> addVideosAsync(AddVideosRequest request, AsyncHandler<AddVideosResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpPost, AddVideosResponse.class, asyncHandler);
	}
	
    	
	public DeleteVideosResponse deleteVideos(DeleteVideosRequest request) 
			throws Exception {
		return sendRequest(request, "/Videos", HttpDelete, DeleteVideosResponse.class);
	}

    public Response<DeleteVideosResponse> deleteVideosAsync(DeleteVideosRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class);
	}

	public Future<?> deleteVideosAsync(DeleteVideosRequest request, AsyncHandler<DeleteVideosResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpDelete, DeleteVideosResponse.class, asyncHandler);
	}
	
    	
	public GetVideosByIdsResponse getVideosByIds(GetVideosByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class);
	}

    public Response<GetVideosByIdsResponse> getVideosByIdsAsync(GetVideosByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class);
	}

	public Future<?> getVideosByIdsAsync(GetVideosByIdsRequest request, AsyncHandler<GetVideosByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos/QueryByIds", HttpPost, GetVideosByIdsResponse.class, asyncHandler);
	}
	
    	
	public UpdateVideosResponse updateVideos(UpdateVideosRequest request) 
			throws Exception {
		return sendRequest(request, "/Videos", HttpPut, UpdateVideosResponse.class);
	}

    public Response<UpdateVideosResponse> updateVideosAsync(UpdateVideosRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class);
	}

	public Future<?> updateVideosAsync(UpdateVideosRequest request, AsyncHandler<UpdateVideosResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Videos", HttpPut, UpdateVideosResponse.class, asyncHandler);
	}
	
    	
	public AddCampaignConversionGoalsResponse addCampaignConversionGoals(AddCampaignConversionGoalsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class);
	}

    public Response<AddCampaignConversionGoalsResponse> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class);
	}

	public Future<?> addCampaignConversionGoalsAsync(AddCampaignConversionGoalsRequest request, AsyncHandler<AddCampaignConversionGoalsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpPost, AddCampaignConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public DeleteCampaignConversionGoalsResponse deleteCampaignConversionGoals(DeleteCampaignConversionGoalsRequest request) 
			throws Exception {
		return sendRequest(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class);
	}

    public Response<DeleteCampaignConversionGoalsResponse> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class);
	}

	public Future<?> deleteCampaignConversionGoalsAsync(DeleteCampaignConversionGoalsRequest request, AsyncHandler<DeleteCampaignConversionGoalsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/CampaignConversionGoals", HttpDelete, DeleteCampaignConversionGoalsResponse.class, asyncHandler);
	}
	
    	
	public AddDataExclusionsResponse addDataExclusions(AddDataExclusionsRequest request) 
			throws Exception {
		return sendRequest(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class);
	}

    public Response<AddDataExclusionsResponse> addDataExclusionsAsync(AddDataExclusionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class);
	}

	public Future<?> addDataExclusionsAsync(AddDataExclusionsRequest request, AsyncHandler<AddDataExclusionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpPost, AddDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public UpdateDataExclusionsResponse updateDataExclusions(UpdateDataExclusionsRequest request) 
			throws Exception {
		return sendRequest(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class);
	}

    public Response<UpdateDataExclusionsResponse> updateDataExclusionsAsync(UpdateDataExclusionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class);
	}

	public Future<?> updateDataExclusionsAsync(UpdateDataExclusionsRequest request, AsyncHandler<UpdateDataExclusionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpPut, UpdateDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public DeleteDataExclusionsResponse deleteDataExclusions(DeleteDataExclusionsRequest request) 
			throws Exception {
		return sendRequest(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class);
	}

    public Response<DeleteDataExclusionsResponse> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class);
	}

	public Future<?> deleteDataExclusionsAsync(DeleteDataExclusionsRequest request, AsyncHandler<DeleteDataExclusionsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions", HttpDelete, DeleteDataExclusionsResponse.class, asyncHandler);
	}
	
    	
	public GetDataExclusionsByIdsResponse getDataExclusionsByIds(GetDataExclusionsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class);
	}

    public Response<GetDataExclusionsByIdsResponse> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class);
	}

	public Future<?> getDataExclusionsByIdsAsync(GetDataExclusionsByIdsRequest request, AsyncHandler<GetDataExclusionsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions/QueryByIds", HttpPost, GetDataExclusionsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetDataExclusionsByAccountIdResponse getDataExclusionsByAccountId(GetDataExclusionsByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class);
	}

    public Response<GetDataExclusionsByAccountIdResponse> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class);
	}

	public Future<?> getDataExclusionsByAccountIdAsync(GetDataExclusionsByAccountIdRequest request, AsyncHandler<GetDataExclusionsByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/DataExclusions/QueryByAccountId", HttpPost, GetDataExclusionsByAccountIdResponse.class, asyncHandler);
	}
	
    	
	public AddSeasonalityAdjustmentsResponse addSeasonalityAdjustments(AddSeasonalityAdjustmentsRequest request) 
			throws Exception {
		return sendRequest(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class);
	}

    public Response<AddSeasonalityAdjustmentsResponse> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class);
	}

	public Future<?> addSeasonalityAdjustmentsAsync(AddSeasonalityAdjustmentsRequest request, AsyncHandler<AddSeasonalityAdjustmentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPost, AddSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public UpdateSeasonalityAdjustmentsResponse updateSeasonalityAdjustments(UpdateSeasonalityAdjustmentsRequest request) 
			throws Exception {
		return sendRequest(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class);
	}

    public Response<UpdateSeasonalityAdjustmentsResponse> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class);
	}

	public Future<?> updateSeasonalityAdjustmentsAsync(UpdateSeasonalityAdjustmentsRequest request, AsyncHandler<UpdateSeasonalityAdjustmentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpPut, UpdateSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public DeleteSeasonalityAdjustmentsResponse deleteSeasonalityAdjustments(DeleteSeasonalityAdjustmentsRequest request) 
			throws Exception {
		return sendRequest(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class);
	}

    public Response<DeleteSeasonalityAdjustmentsResponse> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class);
	}

	public Future<?> deleteSeasonalityAdjustmentsAsync(DeleteSeasonalityAdjustmentsRequest request, AsyncHandler<DeleteSeasonalityAdjustmentsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments", HttpDelete, DeleteSeasonalityAdjustmentsResponse.class, asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByIdsResponse getSeasonalityAdjustmentsByIds(GetSeasonalityAdjustmentsByIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class);
	}

    public Response<GetSeasonalityAdjustmentsByIdsResponse> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class);
	}

	public Future<?> getSeasonalityAdjustmentsByIdsAsync(GetSeasonalityAdjustmentsByIdsRequest request, AsyncHandler<GetSeasonalityAdjustmentsByIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByIds", HttpPost, GetSeasonalityAdjustmentsByIdsResponse.class, asyncHandler);
	}
	
    	
	public GetSeasonalityAdjustmentsByAccountIdResponse getSeasonalityAdjustmentsByAccountId(GetSeasonalityAdjustmentsByAccountIdRequest request) 
			throws Exception {
		return sendRequest(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class);
	}

    public Response<GetSeasonalityAdjustmentsByAccountIdResponse> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class);
	}

	public Future<?> getSeasonalityAdjustmentsByAccountIdAsync(GetSeasonalityAdjustmentsByAccountIdRequest request, AsyncHandler<GetSeasonalityAdjustmentsByAccountIdResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/SeasonalityAdjustments/QueryByAccountId", HttpPost, GetSeasonalityAdjustmentsByAccountIdResponse.class, asyncHandler);
	}
	
    }