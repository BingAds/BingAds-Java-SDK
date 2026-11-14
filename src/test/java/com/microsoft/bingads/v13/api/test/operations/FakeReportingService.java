package com.microsoft.bingads.v13.api.test.operations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import jakarta.xml.ws.AsyncHandler;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.internal.restful.ReportingService;
import com.microsoft.bingads.v13.reporting.IReportingService;
import com.microsoft.bingads.v13.reporting.PollGenerateReportRequest;
import com.microsoft.bingads.v13.reporting.PollGenerateReportResponse;
import com.microsoft.bingads.v13.reporting.SubmitGenerateReportRequest;
import com.microsoft.bingads.v13.reporting.SubmitGenerateReportResponse;

/**
 * Fake reporting service which delivers canned responses to the async handlers
 * on a dedicated thread, like the HTTP client does.
 */
public class FakeReportingService extends ReportingService implements IReportingService {

    /**
     * Name of the thread which delivers the responses to the async handlers.
     */
    public static final String RESPONSE_THREAD_NAME = "fake-reporting-response-thread";

    private static Supplier<SubmitGenerateReportResponse> submitGenerateReportResponse;

    private static Supplier<PollGenerateReportResponse> pollGenerateReportResponse;

    private static Supplier<List<StringHeader>> inboundHeadersSupplier;

    private static ExecutorService responseThread;

    public FakeReportingService(Map<String, String> headers, ApiEnvironment env) {
        super(headers, env);
    }

    public static void reset() {
        submitGenerateReportResponse = new Supplier<SubmitGenerateReportResponse>() {
            @Override
            public SubmitGenerateReportResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };

        pollGenerateReportResponse = new Supplier<PollGenerateReportResponse>() {
            @Override
            public PollGenerateReportResponse get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };

        inboundHeadersSupplier = new Supplier<List<StringHeader>>() {
            @Override
            public List<StringHeader> get() {
                throw new IllegalStateException("This operation hasn't been mocked. Please use corresponding setXXX method to set it up.");
            }
        };

        if (responseThread != null) {
            responseThread.shutdownNow();
        }

        responseThread = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, RESPONSE_THREAD_NAME);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public static void setSubmitGenerateReportResponse(Supplier<SubmitGenerateReportResponse> value) {
        submitGenerateReportResponse = value;
    }

    public static void setPollGenerateReportResponse(Supplier<PollGenerateReportResponse> value) {
        pollGenerateReportResponse = value;
    }

    public static void setInboundHeadersSupplier(Supplier<List<StringHeader>> value) {
        inboundHeadersSupplier = value;
    }

    @Override
    public Future<?> submitGenerateReportAsync(SubmitGenerateReportRequest request, AsyncHandler<SubmitGenerateReportResponse> asyncHandler) {
        return respond(submitGenerateReportResponse, asyncHandler);
    }

    @Override
    public Future<?> pollGenerateReportAsync(PollGenerateReportRequest request, AsyncHandler<PollGenerateReportResponse> asyncHandler) {
        return respond(pollGenerateReportResponse, asyncHandler);
    }

    private static <T> Future<?> respond(final Supplier<T> responseSupplier, final AsyncHandler<T> asyncHandler) {
        final CompleteResponse<T> response = new CompleteResponse<T>(responseSupplier.get(), inboundHeadersSupplier.get());

        // Deliver the response on another thread, like the HTTP client does.
        // Exceptions thrown by the handler get swallowed, like the HTTP client does.
        return responseThread.submit(new Runnable() {
            @Override
            public void run() {
                asyncHandler.handleResponse(response);
            }
        });
    }
}
