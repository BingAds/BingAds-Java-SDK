package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.bulk.*;

public class BulkService extends RestfulServiceClient implements IBulkService {
	Supplier<IBulkService> fallbackService;

	public BulkService(Authentication authentication, Map<String, String> headers, ApiEnvironment env, Supplier<IBulkService> fallbackService) {
        super(authentication, headers, env, IBulkService.class);

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
		
	public DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(DownloadCampaignsByAccountIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DownloadCampaignsByAccountIdsResponse response = sendRequest(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class);
			
		if (response == null) {
			response = fallbackService.get().downloadCampaignsByAccountIds(request);
		}
		
		return response;
	}

    public Response<DownloadCampaignsByAccountIdsResponse> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest request) {
		return sendRequestAsync(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class, (r, h) -> fallbackService.get().downloadCampaignsByAccountIdsAsync(r, h), null);
	}

	public Future<?> downloadCampaignsByAccountIdsAsync(DownloadCampaignsByAccountIdsRequest request, AsyncHandler<DownloadCampaignsByAccountIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/DownloadByAccountIds", HttpPost, DownloadCampaignsByAccountIdsResponse.class, (r, h) -> fallbackService.get().downloadCampaignsByAccountIdsAsync(r, h), asyncHandler);
	}
	
    	
	public DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(DownloadCampaignsByCampaignIdsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		DownloadCampaignsByCampaignIdsResponse response = sendRequest(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class);
			
		if (response == null) {
			response = fallbackService.get().downloadCampaignsByCampaignIds(request);
		}
		
		return response;
	}

    public Response<DownloadCampaignsByCampaignIdsResponse> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest request) {
		return sendRequestAsync(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class, (r, h) -> fallbackService.get().downloadCampaignsByCampaignIdsAsync(r, h), null);
	}

	public Future<?> downloadCampaignsByCampaignIdsAsync(DownloadCampaignsByCampaignIdsRequest request, AsyncHandler<DownloadCampaignsByCampaignIdsResponse> asyncHandler) {
		return sendRequestAsync(request, "/Campaigns/DownloadByCampaignIds", HttpPost, DownloadCampaignsByCampaignIdsResponse.class, (r, h) -> fallbackService.get().downloadCampaignsByCampaignIdsAsync(r, h), asyncHandler);
	}
	
    	
	public GetBulkDownloadStatusResponse getBulkDownloadStatus(GetBulkDownloadStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBulkDownloadStatusResponse response = sendRequest(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class);
			
		if (response == null) {
			response = fallbackService.get().getBulkDownloadStatus(request);
		}
		
		return response;
	}

    public Response<GetBulkDownloadStatusResponse> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest request) {
		return sendRequestAsync(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class, (r, h) -> fallbackService.get().getBulkDownloadStatusAsync(r, h), null);
	}

	public Future<?> getBulkDownloadStatusAsync(GetBulkDownloadStatusRequest request, AsyncHandler<GetBulkDownloadStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/BulkDownloadStatus/Query", HttpPost, GetBulkDownloadStatusResponse.class, (r, h) -> fallbackService.get().getBulkDownloadStatusAsync(r, h), asyncHandler);
	}
	
    	
	public GetBulkUploadUrlResponse getBulkUploadUrl(GetBulkUploadUrlRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBulkUploadUrlResponse response = sendRequest(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class);
			
		if (response == null) {
			response = fallbackService.get().getBulkUploadUrl(request);
		}
		
		return response;
	}

    public Response<GetBulkUploadUrlResponse> getBulkUploadUrlAsync(GetBulkUploadUrlRequest request) {
		return sendRequestAsync(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class, (r, h) -> fallbackService.get().getBulkUploadUrlAsync(r, h), null);
	}

	public Future<?> getBulkUploadUrlAsync(GetBulkUploadUrlRequest request, AsyncHandler<GetBulkUploadUrlResponse> asyncHandler) {
		return sendRequestAsync(request, "/BulkUploadUrl/Query", HttpPost, GetBulkUploadUrlResponse.class, (r, h) -> fallbackService.get().getBulkUploadUrlAsync(r, h), asyncHandler);
	}
	
    	
	public GetBulkUploadStatusResponse getBulkUploadStatus(GetBulkUploadStatusRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		GetBulkUploadStatusResponse response = sendRequest(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class);
			
		if (response == null) {
			response = fallbackService.get().getBulkUploadStatus(request);
		}
		
		return response;
	}

    public Response<GetBulkUploadStatusResponse> getBulkUploadStatusAsync(GetBulkUploadStatusRequest request) {
		return sendRequestAsync(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class, (r, h) -> fallbackService.get().getBulkUploadStatusAsync(r, h), null);
	}

	public Future<?> getBulkUploadStatusAsync(GetBulkUploadStatusRequest request, AsyncHandler<GetBulkUploadStatusResponse> asyncHandler) {
		return sendRequestAsync(request, "/BulkUploadStatus/Query", HttpPost, GetBulkUploadStatusResponse.class, (r, h) -> fallbackService.get().getBulkUploadStatusAsync(r, h), asyncHandler);
	}
	
    	
	public UploadEntityRecordsResponse uploadEntityRecords(UploadEntityRecordsRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		UploadEntityRecordsResponse response = sendRequest(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class);
			
		if (response == null) {
			response = fallbackService.get().uploadEntityRecords(request);
		}
		
		return response;
	}

    public Response<UploadEntityRecordsResponse> uploadEntityRecordsAsync(UploadEntityRecordsRequest request) {
		return sendRequestAsync(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class, (r, h) -> fallbackService.get().uploadEntityRecordsAsync(r, h), null);
	}

	public Future<?> uploadEntityRecordsAsync(UploadEntityRecordsRequest request, AsyncHandler<UploadEntityRecordsResponse> asyncHandler) {
		return sendRequestAsync(request, "/EntityRecords/Upload", HttpPost, UploadEntityRecordsResponse.class, (r, h) -> fallbackService.get().uploadEntityRecordsAsync(r, h), asyncHandler);
	}
	
    }