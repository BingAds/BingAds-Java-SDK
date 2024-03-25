package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.v13.bulk.*;

public class BulkRestfulServiceClient extends RestfulServiceClient {

	public BulkRestfulServiceClient(AuthorizationData authData, ApiEnvironment env, Class serviceInterface) {
        super(authData, env, serviceInterface);
    }

		
	public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(DownloadCampaignsByAccountIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class);
	}

    public Response<DownloadCampaignsByAccountIdsResponse> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class);
	}

	public Future<?> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest request, AsyncHandler<DownloadCampaignsByAccountIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class, asyncHandler);
	}
	
    	
	public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(DownloadCampaignsByCampaignIdsRequest request) 
			throws Exception {
		return sendRequest(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class);
	}

    public Response<DownloadCampaignsByCampaignIdsResponse> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class);
	}

	public Future<?> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest request, AsyncHandler<DownloadCampaignsByCampaignIdsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class, asyncHandler);
	}
	
    	
	public GetBulkDownloadStatusResponse getBulkDownloadStatus(GetBulkDownloadStatusRequest request) 
			throws Exception {
		return sendRequest(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class);
	}

    public Response<GetBulkDownloadStatusResponse> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class);
	}

	public Future<?> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest request, AsyncHandler<GetBulkDownloadStatusResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class, asyncHandler);
	}
	
    	
	public GetBulkUploadUrlResponse getBulkUploadUrl(GetBulkUploadUrlRequest request) 
			throws Exception {
		return sendRequest(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class);
	}

    public Response<GetBulkUploadUrlResponse> getBulkUploadUrlAsync(GetBulkUploadUrlRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class);
	}

	public Future<?> getBulkUploadUrlAsync(GetBulkUploadUrlRequest request, AsyncHandler<GetBulkUploadUrlResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class, asyncHandler);
	}
	
    	
	public GetBulkUploadStatusResponse getBulkUploadStatus(GetBulkUploadStatusRequest request) 
			throws Exception {
		return sendRequest(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class);
	}

    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(GetBulkUploadStatusRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class);
	}

	public Future<?> getBulkUploadStatusAsync(GetBulkUploadStatusRequest request, AsyncHandler<GetBulkUploadStatusResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class, asyncHandler);
	}
	
    	
	public UploadEntityRecordsResponse uploadEntityRecords(UploadEntityRecordsRequest request) 
			throws Exception {
		return sendRequest(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class);
	}

    public Response<UploadEntityRecordsResponse> uploadEntityRecordsAsync(UploadEntityRecordsRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class);
	}

	public Future<?> uploadEntityRecordsAsync(UploadEntityRecordsRequest request, AsyncHandler<UploadEntityRecordsResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class, asyncHandler);
	}
	
    }