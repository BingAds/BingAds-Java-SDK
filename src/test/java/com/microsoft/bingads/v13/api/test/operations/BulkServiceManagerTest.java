package com.microsoft.bingads.v13.api.test.operations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
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
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.bulk.ArrayOfDownloadEntity;
import com.microsoft.bingads.v13.bulk.BulkDownloadOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.bulk.CouldNotGetBulkOperationStatusException;
import com.microsoft.bingads.v13.bulk.CouldNotSubmitBulkDownloadException;
import com.microsoft.bingads.v13.bulk.DataScope;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.v13.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.v13.bulk.DownloadEntity;
import com.microsoft.bingads.v13.bulk.DownloadFileType;
import com.microsoft.bingads.v13.bulk.DownloadParameters;
import com.microsoft.bingads.v13.bulk.FileUploadParameters;
import com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v13.bulk.GetBulkUploadUrlResponse;
import com.microsoft.bingads.v13.bulk.ResponseMode;
import com.microsoft.bingads.v13.bulk.SubmitDownloadParameters;

/**
 * Tests of {@link BulkServiceManager} with responses delivered on a separate thread, like the HTTP client does.
 */
public class BulkServiceManagerTest extends FakeApiTest {

    private static final String DOWNLOAD_URL = "https://example.com/download.zip";

    private static final String UPLOAD_URL = "https://example.com/upload";

    private static final String FILE_CONTENT = "Type,Status\nCampaign,Active\n";

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUpBulk() {
        FakeBulkService.setDeliverResponsesOnSeparateThread(true);
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
            }
        });
        FakeBulkService.setOnGetBulkDownloadStatus(new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest request) {
            }
        });
    }

    @Test
    public void BulkService_DownloadFile_DownloadsOffTheResponseThread() throws Exception {
        mockSubmitDownloadResponse("req456");
        mockDownloadStatusResponse("Completed", DOWNLOAD_URL);

        final AtomicReference<String> downloadThreadName = new AtomicReference<String>();

        FakeHttpFileService fileService = new FakeHttpFileService();
        fileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File zipFile) {
                downloadThreadName.set(Thread.currentThread().getName());
                assertEquals(DOWNLOAD_URL, url);
                writeZip(zipFile, "download.csv", FILE_CONTENT);
            }
        });

        BulkServiceManager manager = createManager(fileService);

        File resultDirectory = folder.newFolder();

        File file = manager.downloadFileAsync(createDownloadParameters(resultDirectory), null).get(30, TimeUnit.SECONDS);

        assertTrue(fileService.getDownloadWasCalled());
        assertEquals(new File(resultDirectory, "download.csv"), file);
        assertEquals(FILE_CONTENT, new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8));
        assertNotNull(downloadThreadName.get());
        assertNotEquals("The download must not block the thread which delivers the responses",
                FakeBulkService.RESPONSE_THREAD_NAME, downloadThreadName.get());
    }

    @Test
    public void BulkService_UploadFile_UploadsAndDownloadsOffTheResponseThread() throws Exception {
        mockUploadUrlResponse("req789", UPLOAD_URL);
        mockUploadStatusResponse("Completed", DOWNLOAD_URL);

        final AtomicReference<String> uploadThreadName = new AtomicReference<String>();
        final AtomicReference<String> downloadThreadName = new AtomicReference<String>();

        FakeHttpFileService fileService = new FakeHttpFileService();
        fileService.setOnUploadFile(new BiConsumer<URI, File>() {
            @Override
            public void accept(URI uri, File uploadFile) {
                uploadThreadName.set(Thread.currentThread().getName());
                assertEquals(UPLOAD_URL, uri.toString());
                assertTrue(uploadFile.isFile());
            }
        });
        fileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File zipFile) {
                downloadThreadName.set(Thread.currentThread().getName());
                assertEquals(DOWNLOAD_URL, url);
                writeZip(zipFile, "result.csv", FILE_CONTENT);
            }
        });

        BulkServiceManager manager = createManager(fileService);

        File uploadFile = folder.newFile("upload.csv");
        Files.write(uploadFile.toPath(), FILE_CONTENT.getBytes(StandardCharsets.UTF_8));
        File resultDirectory = folder.newFolder();

        File file = manager.uploadFileAsync(createUploadParameters(uploadFile, resultDirectory), null).get(30, TimeUnit.SECONDS);

        assertTrue(fileService.getUploadWasCalled());
        assertTrue(fileService.getDownloadWasCalled());
        assertEquals(new File(resultDirectory, "result.csv"), file);
        assertEquals(FILE_CONTENT, new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8));
        assertNotNull(uploadThreadName.get());
        assertNotEquals("The upload must not block the thread which delivers the responses",
                FakeBulkService.RESPONSE_THREAD_NAME, uploadThreadName.get());
        assertNotNull(downloadThreadName.get());
        assertNotEquals("The download must not block the thread which delivers the responses",
                FakeBulkService.RESPONSE_THREAD_NAME, downloadThreadName.get());
    }

    @Test
    public void BulkService_SubmitDownload_CompletesExceptionallyIfResponseHandlingFails() throws Exception {
        mockSubmitDownloadResponse("req456");
        // Without headers, reading the tracking id of the response fails with a runtime exception.
        FakeBulkService.setInboundHeadersSupplier(new Supplier<List<StringHeader>>() {
            @Override
            public List<StringHeader> get() {
                return new ArrayList<StringHeader>();
            }
        });

        BulkServiceManager manager = createManager(new FakeHttpFileService());

        Future<BulkDownloadOperation> future = manager.submitDownloadAsync(createSubmitDownloadParameters(), null);

        try {
            future.get(10, TimeUnit.SECONDS);
            fail("Expected the future to complete exceptionally");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof CouldNotSubmitBulkDownloadException);
        }
    }

    @Test
    public void BulkService_DownloadFile_CompletesExceptionallyIfStatusResponseHandlingFails() throws Exception {
        mockSubmitDownloadResponse("req456");
        // A status response without request status fails with a runtime exception when being handled.
        mockDownloadStatusResponse(null, null);

        BulkServiceManager manager = createManager(new FakeHttpFileService());

        Future<File> future = manager.downloadFileAsync(createDownloadParameters(folder.newFolder()), null);

        try {
            // The status polling retries a few times with a delay of a second before giving up.
            future.get(30, TimeUnit.SECONDS);
            fail("Expected the future to complete exceptionally");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof CouldNotGetBulkOperationStatusException);
        }
    }

    @Test
    public void BulkService_DownloadFile_CompletesExceptionallyIfDownloadFails() throws Exception {
        mockSubmitDownloadResponse("req456");
        mockDownloadStatusResponse("Completed", DOWNLOAD_URL);

        FakeHttpFileService fileService = new FakeHttpFileService();
        fileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File zipFile) {
                throw new IllegalStateException("Download failed");
            }
        });

        BulkServiceManager manager = createManager(fileService);

        Future<File> future = manager.downloadFileAsync(createDownloadParameters(folder.newFolder()), null);

        try {
            future.get(30, TimeUnit.SECONDS);
            fail("Expected the future to complete exceptionally");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof IllegalStateException);
            assertEquals("Download failed", e.getCause().getMessage());
        }
    }

    private static void mockSubmitDownloadResponse(final String requestId) {
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                DownloadCampaignsByAccountIdsResponse response = new DownloadCampaignsByAccountIdsResponse();
                response.setDownloadRequestId(requestId);
                return response;
            }
        });
    }

    private static void mockDownloadStatusResponse(final String requestStatus, final String resultFileUrl) {
        FakeBulkService.setGetBulkDownloadStatusResponse(new Supplier<GetBulkDownloadStatusResponse>() {
            @Override
            public GetBulkDownloadStatusResponse get() {
                GetBulkDownloadStatusResponse response = new GetBulkDownloadStatusResponse();
                response.setPercentComplete(100);
                response.setRequestStatus(requestStatus);
                response.setResultFileUrl(resultFileUrl);
                return response;
            }
        });
    }

    private static void mockUploadUrlResponse(final String requestId, final String uploadUrl) {
        FakeBulkService.setGetBulkUploadUrlResponse(new Supplier<GetBulkUploadUrlResponse>() {
            @Override
            public GetBulkUploadUrlResponse get() {
                GetBulkUploadUrlResponse response = new GetBulkUploadUrlResponse();
                response.setRequestId(requestId);
                response.setUploadUrl(uploadUrl);
                return response;
            }
        });
    }

    private static void mockUploadStatusResponse(final String requestStatus, final String resultFileUrl) {
        FakeBulkService.setGetBulkUploadStatusResponse(new Supplier<GetBulkUploadStatusResponse>() {
            @Override
            public GetBulkUploadStatusResponse get() {
                GetBulkUploadStatusResponse response = new GetBulkUploadStatusResponse();
                response.setPercentComplete(100);
                response.setRequestStatus(requestStatus);
                response.setResultFileUrl(resultFileUrl);
                return response;
            }
        });
    }

    private BulkServiceManager createManager(FakeHttpFileService fileService) throws IOException {
        BulkServiceManager manager = new BulkServiceManager(createUserData());
        manager.setHttpFileService(fileService);
        manager.setWorkingDirectory(folder.newFolder());
        manager.setStatusPollIntervalInMilliseconds(100);
        return manager;
    }

    private static DownloadParameters createDownloadParameters(File resultDirectory) {
        DownloadParameters parameters = new DownloadParameters();
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        parameters.getDownloadEntities().getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        parameters.setFileType(DownloadFileType.CSV);
        parameters.setResultFileDirectory(resultDirectory);
        parameters.setResultFileName("download.csv");
        parameters.setOverwriteResultFile(true);
        return parameters;
    }

    private static SubmitDownloadParameters createSubmitDownloadParameters() {
        SubmitDownloadParameters parameters = new SubmitDownloadParameters();
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        parameters.getDownloadEntities().getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        parameters.setFileType(DownloadFileType.CSV);
        return parameters;
    }

    private static FileUploadParameters createUploadParameters(File uploadFile, File resultDirectory) {
        FileUploadParameters parameters = new FileUploadParameters();
        parameters.setUploadFilePath(uploadFile);
        parameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
        parameters.setCompressUploadFile(false);
        parameters.setResultFileDirectory(resultDirectory);
        parameters.setResultFileName("result.csv");
        parameters.setOverwriteResultFile(true);
        return parameters;
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
