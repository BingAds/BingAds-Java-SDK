package com.microsoft.bingads.internal.restful;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.reporting.*;

public class ReportingService extends RestfulServiceClient implements IReportingService {

	public ReportingService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env, IReportingService.class);

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

	protected <Req, Resp> Response<Resp> sendRequestAsync(Req request, String entityEndpoint, String verb, Class<Resp> respClass, AsyncHandler<Resp> handler) {
		return processRequestAsync(request, entityEndpoint, verb, respClass, ApplicationFault.class, x -> getFaultException(x), handler);
	}
		
	public SubmitGenerateReportResponse submitGenerateReport(SubmitGenerateReportRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		SubmitGenerateReportResponse response = sendRequest(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class);
		
		return response;
	}

    public Response<SubmitGenerateReportResponse> submitGenerateReportAsync(SubmitGenerateReportRequest request) {
		return sendRequestAsync(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class, null);
	}

	public Future<?> submitGenerateReportAsync(SubmitGenerateReportRequest request, AsyncHandler<SubmitGenerateReportResponse> asyncHandler) {
		return sendRequestAsync(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class, asyncHandler);
	}
	
    	
	public PollGenerateReportResponse pollGenerateReport(PollGenerateReportRequest request)
		  throws AdApiFaultDetail_Exception, ApiFaultDetail_Exception {
		PollGenerateReportResponse response = sendRequest(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class);
		
		return response;
	}

    public Response<PollGenerateReportResponse> pollGenerateReportAsync(PollGenerateReportRequest request) {
		return sendRequestAsync(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class, null);
	}

	public Future<?> pollGenerateReportAsync(PollGenerateReportRequest request, AsyncHandler<PollGenerateReportResponse> asyncHandler) {
		return sendRequestAsync(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class, asyncHandler);
	}
	
    }