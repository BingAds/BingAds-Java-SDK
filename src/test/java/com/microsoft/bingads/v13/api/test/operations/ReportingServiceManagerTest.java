package com.microsoft.bingads.v13.api.test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.reporting.AccountPerformanceReportRequest;
import com.microsoft.bingads.v13.reporting.CouldNotGetReportingDownloadStatusException;
import com.microsoft.bingads.v13.reporting.CouldNotSubmitReportingDownloadException;
import com.microsoft.bingads.v13.reporting.PollGenerateReportResponse;
import com.microsoft.bingads.v13.reporting.ReportFormat;
import com.microsoft.bingads.v13.reporting.ReportRequest;
import com.microsoft.bingads.v13.reporting.ReportRequestStatus;
import com.microsoft.bingads.v13.reporting.ReportRequestStatusType;
import com.microsoft.bingads.v13.reporting.ReportingDownloadOperation;
import com.microsoft.bingads.v13.reporting.ReportingDownloadParameters;
import com.microsoft.bingads.v13.reporting.ReportingServiceManager;
import com.microsoft.bingads.v13.reporting.SubmitGenerateReportResponse;

public class ReportingServiceManagerTest extends FakeApiTest {

    private static final String REPORT_URL = "https://example.com/report.zip";

    private static final String REPORT_CONTENT = "a,b\n1,2\n";

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUpReporting() {
        FakeReportingService.reset();
    }

    @Test
    public void ReportingService_DownloadFile_DownloadsOffTheResponseThread() throws Exception {
        mockSubmitResponse("req123");
        mockPollResponse(ReportRequestStatusType.SUCCESS, REPORT_URL);
        FakeReportingService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());

        final AtomicReference<String> downloadThreadName = new AtomicReference<String>();

        FakeHttpFileService fileService = new FakeHttpFileService();
        fileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File zipFile) {
                downloadThreadName.set(Thread.currentThread().getName());
                assertEquals(REPORT_URL, url);
                writeZip(zipFile, "report.csv", REPORT_CONTENT);
            }
        });

        ReportingServiceManager manager = createManager(fileService);

        File resultDirectory = folder.newFolder();
        ReportingDownloadParameters parameters = createParameters(resultDirectory);

        File file = manager.downloadFileAsync(parameters, null).get(30, TimeUnit.SECONDS);

        assertTrue(fileService.getDownloadWasCalled());
        assertEquals(new File(resultDirectory, "report.csv"), file);
        assertEquals(REPORT_CONTENT, new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8));
        assertNotNull(downloadThreadName.get());
        assertNotEquals("The download must not block the thread which delivers the responses",
                FakeReportingService.RESPONSE_THREAD_NAME, downloadThreadName.get());
    }

    @Test
    public void ReportingService_SubmitDownload_CompletesExceptionallyIfResponseHandlingFails() throws Exception {
        mockSubmitResponse("req123");
        // Without headers, reading the tracking id of the response fails with a runtime exception.
        FakeReportingService.setInboundHeadersSupplier(new Supplier<List<StringHeader>>() {
            @Override
            public List<StringHeader> get() {
                return new ArrayList<StringHeader>();
            }
        });

        ReportingServiceManager manager = createManager(new FakeHttpFileService());

        Future<ReportingDownloadOperation> future = manager.submitDownloadAsync(createReportRequest(), null);

        try {
            future.get(10, TimeUnit.SECONDS);
            fail("Expected the future to complete exceptionally");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof CouldNotSubmitReportingDownloadException);
        }
    }

    @Test
    public void ReportingService_DownloadFile_CompletesExceptionallyIfStatusResponseHandlingFails() throws Exception {
        mockSubmitResponse("req123");
        // A poll response without status fails with a runtime exception when being handled.
        FakeReportingService.setPollGenerateReportResponse(new Supplier<PollGenerateReportResponse>() {
            @Override
            public PollGenerateReportResponse get() {
                return new PollGenerateReportResponse();
            }
        });
        FakeReportingService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());

        ReportingServiceManager manager = createManager(new FakeHttpFileService());

        Future<File> future = manager.downloadFileAsync(createParameters(folder.newFolder()), null);

        try {
            // The status polling retries a few times with a delay of a second before giving up.
            future.get(30, TimeUnit.SECONDS);
            fail("Expected the future to complete exceptionally");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof CouldNotGetReportingDownloadStatusException);
        }
    }

    private static void mockSubmitResponse(final String reportRequestId) {
        FakeReportingService.setSubmitGenerateReportResponse(new Supplier<SubmitGenerateReportResponse>() {
            @Override
            public SubmitGenerateReportResponse get() {
                SubmitGenerateReportResponse response = new SubmitGenerateReportResponse();
                response.setReportRequestId(reportRequestId);
                return response;
            }
        });
    }

    private static void mockPollResponse(final ReportRequestStatusType statusType, final String downloadUrl) {
        FakeReportingService.setPollGenerateReportResponse(new Supplier<PollGenerateReportResponse>() {
            @Override
            public PollGenerateReportResponse get() {
                ReportRequestStatus status = new ReportRequestStatus();
                status.setStatus(statusType);
                status.setReportDownloadUrl(downloadUrl);
                PollGenerateReportResponse response = new PollGenerateReportResponse();
                response.setReportRequestStatus(status);
                return response;
            }
        });
    }

    private ReportingServiceManager createManager(FakeHttpFileService fileService) throws IOException {
        ReportingServiceManager manager = new ReportingServiceManager(createUserData());
        manager.setHttpFileService(fileService);
        manager.setWorkingDirectory(folder.newFolder());
        manager.setStatusPollIntervalInMilliseconds(100);
        return manager;
    }

    private static ReportingDownloadParameters createParameters(File resultDirectory) {
        ReportingDownloadParameters parameters = new ReportingDownloadParameters();
        parameters.setReportRequest(createReportRequest());
        parameters.setResultFileDirectory(resultDirectory);
        parameters.setResultFileName("report.csv");
        parameters.setOverwriteResultFile(true);
        return parameters;
    }

    private static ReportRequest createReportRequest() {
        AccountPerformanceReportRequest request = new AccountPerformanceReportRequest();
        request.setReportName("Test report");
        request.setFormat(ReportFormat.CSV);
        return request;
    }

    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");
        return authorizationData;
    }

    private static void writeZip(File zipFile, String entryName, String content) {
        try {
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile));
            try {
                zip.putNextEntry(new ZipEntry(entryName));
                zip.write(content.getBytes(StandardCharsets.UTF_8));
                zip.closeEntry();
            } finally {
                zip.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
