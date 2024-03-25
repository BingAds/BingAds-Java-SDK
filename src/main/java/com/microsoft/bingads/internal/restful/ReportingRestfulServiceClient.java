package com.microsoft.bingads.internal.restful;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.v13.reporting.*;

public class ReportingRestfulServiceClient extends RestfulServiceClient {

	public ReportingRestfulServiceClient(AuthorizationData authData, ApiEnvironment env, Class serviceInterface) {
        super(authData, env, serviceInterface);
    }

		
	public SubmitGenerateReportResponse submitGenerateReport(SubmitGenerateReportRequest request) 
			throws Exception {
		return sendRequest(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class);
	}

    public Response<SubmitGenerateReportResponse> submitGenerateReportAsync(SubmitGenerateReportRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class);
	}

	public Future<?> submitGenerateReportAsync(SubmitGenerateReportRequest request, AsyncHandler<SubmitGenerateReportResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GenerateReport/Submit", HttpPost, SubmitGenerateReportResponse.class, asyncHandler);
	}
	
    	
	public PollGenerateReportResponse pollGenerateReport(PollGenerateReportRequest request) 
			throws Exception {
		return sendRequest(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class);
	}

    public Response<PollGenerateReportResponse> pollGenerateReportAsync(PollGenerateReportRequest request)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class);
	}

	public Future<?> pollGenerateReportAsync(PollGenerateReportRequest request, AsyncHandler<PollGenerateReportResponse> asyncHandler)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		return sendRequestAsync(request, "/GenerateReport/Poll", HttpPost, PollGenerateReportResponse.class, asyncHandler);
	}
	
    }