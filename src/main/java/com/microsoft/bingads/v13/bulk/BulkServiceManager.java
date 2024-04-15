package com.microsoft.bingads.v13.bulk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.HttpHeaders;
import com.microsoft.bingads.internal.MessageHandler;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import com.microsoft.bingads.v13.bulk.entities.BulkEntity;
import com.microsoft.bingads.v13.internal.bulk.BulkEntityReadable;
import com.microsoft.bingads.v13.internal.bulk.BulkEntityReaderFactory;
import com.microsoft.bingads.v13.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v13.internal.bulk.Config;
import com.microsoft.bingads.v13.internal.bulk.CsvBulkEntityReaderFactory;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkObjectWriter;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Provides high level methods for uploading and downloading entities using the Bulk API functionality. Also provides
 * methods for submitting upload or download operations.
 *
 * <p>
 * Example: {@link BulkServiceManager#downloadFileAsync} will submit the download request to the bulk service, poll
 * until the status is completed (or returns an error), and downloads the file locally. If instead you want to manage
 * the low level details you would first call {@link BulkServiceManager#submitDownloadAsync}, wait for the results file
 * to be prepared using either {@link BulkOperation#getStatusAsync} or {@link BulkOperation#trackAsync}, and then
 * download the file with the {@link BulkOperation#downloadResultFileAsync} method.
 * </p>
 *
 */
public class BulkServiceManager implements Closeable {

    private static final int SYNC_THRESHOLD = 1000;
    private static final String FORMAT_VERSION = StringTable.FORMAT_VERSION;
    private AuthorizationData authorizationData;
    private HttpFileService httpFileService;
    private ZipExtractor zipExtractor;
    private BulkEntityReaderFactory bulkEntityReaderFactory;
    private ApiEnvironment apiEnvironment;

    /**
     * The amount of time in milliseconds that the upload and download operations should wait before polling the Bulk
     * service for status.
     */
    private int statusPollIntervalInMilliseconds;

    private final ServiceClient<IBulkService> serviceClient;

    private File workingDirectory;

    /**
     * Initializes a new instance of this class with the specified {@link AuthorizationData}.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     */
    public BulkServiceManager(AuthorizationData authorizationData) {
        this(authorizationData, null);
    }
    
    public BulkServiceManager(AuthorizationData authorizationData, boolean enableRestApi) {
        this(authorizationData, null, enableRestApi);
    }

    public BulkServiceManager(AuthorizationData authorizationData, ApiEnvironment apiEnvironment) {
        this(authorizationData, new HttpClientHttpFileService(), new SimpleZipExtractor(), new CsvBulkEntityReaderFactory(), apiEnvironment, false);
    }
    
    public BulkServiceManager(AuthorizationData authorizationData, ApiEnvironment apiEnvironment, boolean enableRestApi) {
        this(authorizationData, new HttpClientHttpFileService(), new SimpleZipExtractor(), new CsvBulkEntityReaderFactory(), apiEnvironment, enableRestApi);
    }

    private BulkServiceManager(AuthorizationData authorizationData, HttpFileService httpFileService, ZipExtractor zipExtractor,
            BulkEntityReaderFactory factory, ApiEnvironment apiEnvironment, boolean enableRestApi) {
        this.authorizationData = authorizationData;
        this.httpFileService = httpFileService;
        this.zipExtractor = zipExtractor;
        this.bulkEntityReaderFactory = factory;
        this.apiEnvironment = apiEnvironment;

        serviceClient = new ServiceClient<IBulkService>(this.authorizationData, apiEnvironment, IBulkService.class, enableRestApi);

        workingDirectory = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK");

        statusPollIntervalInMilliseconds = Config.DEFAULT_STATUS_CHECK_INTERVAL_IN_MS;
    }

    @Override
    public void close() throws IOException {
        httpFileService.close();
        cleanupTempFiles();
    }

    /**
     * Removes all files from the working directory, whether the files are used by this BulkServiceManager or by another
     * instance.
     */
    public void cleanupTempFiles() {
        for (File file : workingDirectory.listFiles()) {
            file.delete();
        }
    }

    /**
     * Gets the authorization data for the user performing the operation.
     */
    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    /**
     * Downloads the specified Bulk entities.
     *
     * @param parameters Determines the download entities and file path. If a file path is not specified in the download
     *                   parameters, the enumerable of {@link BulkEntity} is read from a temporary file path designated at
     *                   run time.
     * @param callback   a callback to call with an {@link Iterable} of {@link BulkEntity} objects
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> downloadEntitiesAsync(DownloadParameters parameters, AsyncCallback<BulkEntityIterable> callback) {
        return downloadEntitiesAsync(parameters, null, callback);
    }

    /**
     * Downloads the specified Bulk entities.
     *
     * @param parameters Determines the download entities and file path. If a file path is not specified in the download
     *                   parameters, the enumerable of {@link BulkEntity} is read from a temporary file path designated at
     *                   run time.
     * @param progress   an object which is updated with the progress of a bulk operation
     * @param callback   a callback to call with an {@link Iterable} of {@link BulkEntity} objects
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> downloadEntitiesAsync(DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<BulkEntityIterable> callback) {
        this.validateSubmitDownloadParameters(parameters.getSubmitDownloadParameters());

        this.validateUserData();

        return downloadEntitiesAsyncImpl(parameters, progress, callback);
    }

    /**
     * Uploads the specified Bulk entities.
     *
     * @param parameters determines the upload entities parameters
     * @param progress   an object which is updated with the progress of bulk operation
     * @param callback   a callback to call with an {@link Iterable} of {@link BulkEntity} objects
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> uploadEntitiesAsync(EntityUploadParameters parameters, Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<BulkEntityIterable> callback) {
        validateEntityUploadParameters(parameters);

        validateUserData();

        if (needToTryUploadEntityRecordsSyncFirst(parameters)) {
            return uploadEntityRecordsImpl(parameters, progress, callback);
        } else {
            return uploadEntitiesAsyncImpl(createFileUploadParameters(parameters), progress, callback);
        }
    }

    private Future<BulkEntityIterable> uploadEntityRecordsImpl(EntityUploadParameters parameters, Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<BulkEntityIterable> callback) {

        final ResultFuture<BulkEntityIterable> resultFuture = new ResultFuture<BulkEntityIterable>(callback);
        try {
            UploadEntityRecordsRequest request = createUploadEntityRecordsRequest(parameters);

            final IBulkService service = serviceClient.getService();

            service.uploadEntityRecordsAsync(request, new AsyncHandler<UploadEntityRecordsResponse>() {
                @Override
                public void handleResponse(Response<UploadEntityRecordsResponse> res) {
                    try {
                        UploadEntityRecordsResponse result = res.get();
                        if (needToFallBacktoAsync(result)) {
                            BulkUploadOperation operation = new BulkUploadOperation(
                                    result.getRequestId(), ServiceUtils.GetTrackingId(res),
                                    httpFileService, zipExtractor,
                                    serviceClient, statusPollIntervalInMilliseconds);
                            operation.trackAsync(progress, new ParentCallback<BulkOperationStatus<UploadStatus>>(resultFuture) {
                                @Override
                                public void onSuccess(BulkOperationStatus<UploadStatus> status) throws IOException, URISyntaxException {
                                    downloadBulkFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(),
                                            operation, new ParentCallback<File>(resultFuture) {
                                                @Override
                                                public void onSuccess(File localFile) {
                                                    try {
                                                        resultFuture.setResult(bulkEntityReaderFactory
                                                                .createBulkFileReader(localFile, 
                                                                        ResultFileType.UPLOAD, 
                                                                        DownloadFileType.CSV, 
                                                                        parameters.getAutoDeleteTempFile()).getEntities());
                                                    } catch (IOException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            });
                                }
                            });
                            
                        } else {
                            resultFuture.setResult(parseBulkUpsertResult(result.getEntityRecords()));
                        }
                    } catch (Exception ex) {
                        Throwable cause = ex.getCause();
                        String errorCode = "";
                        try {
                            if (cause instanceof ApiFaultDetail_Exception)
                            {
                                errorCode = ((ApiFaultDetail_Exception) cause).getFaultInfo().getOperationErrors().getOperationErrors().get(0).getErrorCode();
                            }
                        } finally {
                            if ("OperationNotSupported".equalsIgnoreCase(errorCode)) {
                                uploadFileAsyncImpl(createFileUploadParameters(parameters), progress, new ParentCallback<File>(resultFuture) {
                                    @Override
                                    public void onSuccess(File resultFile) throws IOException {
                                        resultFuture.setResult(bulkEntityReaderFactory
                                                .createBulkFileReader(resultFile, ResultFileType.UPLOAD, DownloadFileType.CSV, parameters.getAutoDeleteTempFile())
                                                .getEntities());
                                    }
                                });
                            } else {
                                resultFuture.setException(ex);
                            }
                        }
                    }
                }

                private boolean needToFallBacktoAsync(UploadEntityRecordsResponse result) {
                    return result != null 
                            && result.getRequestId() != null
                            && result.getRequestId().length() > 0
                            && "InProgress".equals(result.getRequestStatus());
                }
            });
        } catch (IOException e) {
            resultFuture.setException(e);
        }

        return resultFuture;
    }

    private BulkEntityIterable parseBulkUpsertResult(ArrayOfstring resultRows) throws IOException {
        return bulkEntityReaderFactory.createBulkRowsReader(resultRows.getStrings()).getEntities();
    }

    private UploadEntityRecordsRequest createUploadEntityRecordsRequest(EntityUploadParameters parameters) throws IOException {
        List<String> entitiesPayload = writeUploadEntitiesAsPayload(parameters);
        UploadEntityRecordsRequest request = new UploadEntityRecordsRequest();
        ArrayOfstring payload = new ArrayOfstring();
        payload.getStrings().addAll(entitiesPayload);
        request.setEntityRecords(payload);
        request.setResponseMode(parameters.getResponseMode());
        request.setAccountId(authorizationData.getAccountId());
        return request;
    }

    private List<String> writeUploadEntitiesAsPayload(EntityUploadParameters parameters) throws IOException {
        List<String> entitiesPayload = new ArrayList<String>();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        BulkObjectWriter writer = new SimpleBulkObjectWriter(os, DownloadFileType.CSV);
        writeContent(entitiesPayload, os, () -> {writer.writeHeaders();});
        writeContent(entitiesPayload, os, () -> writer.writeFormatVersion());

        for (BulkEntity entity : parameters.getEntities()) {
            writeContent(entitiesPayload, os, () -> entity.write(writer, false));
        }
        return entitiesPayload;
    }

    private void writeContent(List<String> entitiesPayload, ByteArrayOutputStream os, WriteAction action) throws IOException, UnsupportedEncodingException {
        os.reset();
        action.execute();
        
        String[] arr = (new String(os.toByteArray(), "UTF-8")).split("(\\r\\n|\\n|\\r)");
        
        for (String s : arr) {
            entitiesPayload.add(s);
        }
    }

    private boolean needToTryUploadEntityRecordsSyncFirst(EntityUploadParameters parameters) {
        int count = 0;
        for (BulkEntity entity : parameters.getEntities()) {
            count++;
        }
        return count <= SYNC_THRESHOLD;
    }

    /**
     * Uploads the specified Bulk entities.
     *
     * @param parameters determines the upload entities parameters
     * @param callback   a callback to call with an {@link Iterable} of {@link BulkEntity} objects
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> uploadEntitiesAsync(EntityUploadParameters parameters, AsyncCallback<BulkEntityIterable> callback) {
        return uploadEntitiesAsync(parameters, null, callback);
    }

    /**
     * Uploads the specified Bulk file.
     *
     * @param parameters determines the file upload parameters
     * @param callback   a callback which is called with the file path when the file is downloaded and available
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<File> uploadFileAsync(final FileUploadParameters parameters, AsyncCallback<File> callback) {
        return uploadFileAsync(parameters, null, callback);
    }

    /**
     * Uploads the specified Bulk file.
     *
     * @param parameters determines the file upload parameters
     * @param progress   an object which is updated with the progress of bulk operation
     * @param callback   a callback which is called with the file path when the file is downloaded and available
     *
     * @return a Future indicating whether the operation has been completed
     */
    public Future<File> uploadFileAsync(final FileUploadParameters parameters, final Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<File> callback) {
        validateSubmitUploadParameters(parameters.getSubmitUploadParameters());

        validateUserData();

        return uploadFileAsyncImpl(parameters, progress, callback);
    }

    private void validateEntityUploadParameters(EntityUploadParameters parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must not be null");
        }

        if (parameters.getEntities() == null) {
            throw new NullPointerException("parameters.getEntities() must not be null");
        }

        if (!parameters.getEntities().iterator().hasNext()) {
            throw new IllegalArgumentException("parameters.getEntities() must not be empty");
        }
    }

    private void validateSubmitUploadParameters(SubmitUploadParameters parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must not be null");
        }

        if (parameters.getUploadFilePath() == null) {
            throw new NullPointerException("parameters.getUploadFilePath() must not be null");
        }
    }

    private Future<BulkEntityIterable> uploadEntitiesAsyncImpl(final FileUploadParameters parameters, Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<BulkEntityIterable> callback) {
        final ResultFuture<BulkEntityIterable> resultFuture = new ResultFuture<BulkEntityIterable>(callback);

        uploadFileAsyncImpl(parameters, progress, new ParentCallback<File>(resultFuture) {
            @Override
            public void onSuccess(File resultFile) throws IOException {
                resultFuture.setResult(bulkEntityReaderFactory
                        .createBulkFileReader(resultFile, ResultFileType.UPLOAD, DownloadFileType.CSV, parameters.getAutoDeleteTempFile()).getEntities());
            }
        });

        return resultFuture;
    }

    private Future<File> uploadFileAsyncImpl(final FileUploadParameters parameters, final Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<File> callback) {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        workingDirectory.mkdirs();

        submitUploadAsync(parameters, new ParentCallback<BulkUploadOperation>(resultFuture) {
            @Override
            public void onSuccess(final BulkUploadOperation operation) {
                operation.trackAsync(progress, new ParentCallback<BulkOperationStatus<UploadStatus>>(resultFuture) {
                    @Override
                    public void onSuccess(BulkOperationStatus<UploadStatus> status) throws IOException, URISyntaxException {
                        downloadBulkFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(),
                                operation, new ParentCallback<File>(resultFuture) {
                                    @Override
                                    public void onSuccess(File localFile) {
                                        resultFuture.setResult(localFile);
                                    }
                                });
                    }
                });
            }
        });

        return resultFuture;
    }

    private void validateSubmitDownloadParameters(SubmitDownloadParameters parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must not be null");
        }
    }

    private Future<BulkEntityIterable> downloadEntitiesAsyncImpl(final DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<BulkEntityIterable> callback) {
        final ResultFuture<BulkEntityIterable> resultFuture = new ResultFuture<BulkEntityIterable>(callback);

        this.downloadFileAsyncImpl(parameters, progress, new ParentCallback<File>(resultFuture) {
            @Override
            public void onSuccess(File result) throws IOException {
                ResultFileType resultFileType = parameters.getLastSyncTimeInUTC() != null ? ResultFileType.PARTIAL_DOWNLOAD : ResultFileType.FULL_DOWNLOAD;
                BulkEntityReadable reader = bulkEntityReaderFactory.createBulkFileReader(result, resultFileType, parameters.getFileType(),
                        parameters.getAutoDeleteTempFile());
                resultFuture.setResult(reader.getEntities());
            }
        });

        return resultFuture;
    }

    /**
     * Downloads the specified Bulk entities to a local file.
     *
     * @param parameters Determines the download entities and file path.
     * @param callback   a callback which is called with the file path when the file is downloaded and available
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<File> downloadFileAsync(DownloadParameters parameters, AsyncCallback<File> callback) {
        return this.downloadFileAsync(parameters, null, callback);
    }

    /**
     * Downloads the specified Bulk entities to a local file.
     *
     * @param parameters Determines the download entities and file path.
     * @param progress   An object which is updated with the progress of a bulk operation
     * @param callback   a callback which is called with the file path when the file is downloaded and available
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<File> downloadFileAsync(DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<File> callback) {
        validateUserData();

        validateSubmitDownloadParameters(parameters.getSubmitDownloadParameters());

        return downloadFileAsyncImpl(parameters, progress, callback);
    }

    private Future<File> downloadFileAsyncImpl(final DownloadParameters parameters, final Progress<BulkOperationProgressInfo> progress,
            AsyncCallback<File> callback) {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        workingDirectory.mkdirs();

        // TODO: handle cancellations
        this.submitDownloadAsync(parameters.getSubmitDownloadParameters(), new ParentCallback<BulkDownloadOperation>(resultFuture) {
            @Override
            public void onSuccess(final BulkDownloadOperation operation) {
                operation.trackAsync(progress, new ParentCallback<BulkOperationStatus<DownloadStatus>>(resultFuture) {
                    @Override
                    public void onSuccess(BulkOperationStatus<DownloadStatus> status) throws IOException, URISyntaxException {
                        downloadBulkFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(),
                                operation, new ParentCallback<File>(resultFuture) {
                                    @Override
                                    public void onSuccess(File localFile) {
                                        resultFuture.setResult(localFile);
                                    }
                                });
                    }
                });
            }
        });

        return resultFuture;
    }

    private <T> Future<File> downloadBulkFileAsync(File resultFileDirectory, String resultFileName, boolean overwriteResultFile, BulkOperation<T> operation,
            AsyncCallback<File> callback) throws IOException, URISyntaxException {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        File effectiveResultFileDirectory = resultFileDirectory;

        if (effectiveResultFileDirectory == null) {
            workingDirectory.mkdirs();
            effectiveResultFileDirectory = workingDirectory;
        }

        operation.downloadResultFileAsync(effectiveResultFileDirectory, resultFileName, true, overwriteResultFile, new ParentCallback<File>(resultFuture) {
            @Override
            public void onSuccess(File file) {
                resultFuture.setResult(file);
            }
        });

        return resultFuture;
    }

    private void validateUserData() {
        authorizationData.validate();
    }

    /**
     * Submits a download request to the Bing Ads bulk service with the specified parameters.
     *
     * <p>
     * The {@link DownloadParameters#getResultFileDirectory } and {@link DownloadParameters#getResultFileName } properties
     * are ignored by this method. When the file is ready for download, specify the result file path and name as parameters
     * of the {@link BulkOperation#downloadResultFileAsync} method.
     * </p>
     *
     * @param parameters Describes the type of entities and data scope that you want to download.
     * @param callback   a callback will be called when the {@link BulkDownloadOperation} has been created
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<BulkDownloadOperation> submitDownloadAsync(SubmitDownloadParameters parameters, AsyncCallback<BulkDownloadOperation> callback) {
        Authentication auth = authorizationData.getAuthentication();

        if (auth == null) {
            throw new IllegalArgumentException("Missing authentication");
        }

        final ResultFuture<BulkDownloadOperation> resultFuture = new ResultFuture<BulkDownloadOperation>(callback);

        if (parameters.getCampaignIds() == null) {
            DownloadCampaignsByAccountIdsRequest request = generateCampaignsByAccountIdRequest(parameters);

            final IBulkService service = serviceClient.getService();

            service.downloadCampaignsByAccountIdsAsync(request, new AsyncHandler<DownloadCampaignsByAccountIdsResponse>() {
                @Override
                public void handleResponse(Response<DownloadCampaignsByAccountIdsResponse> res) {
                    try {
                        DownloadCampaignsByAccountIdsResponse response;

                        response = res.get();

                        BulkDownloadOperation operation = new BulkDownloadOperation(
                                response.getDownloadRequestId(), ServiceUtils.GetTrackingId(res),
                                httpFileService, zipExtractor,
                                serviceClient, statusPollIntervalInMilliseconds);

                        resultFuture.setResult(operation);
                    } catch (InterruptedException e) {
                        resultFuture.setException(new CouldNotSubmitBulkDownloadException(e));
                    } catch (ExecutionException e) {
                        resultFuture.setException(new CouldNotSubmitBulkDownloadException(e));
                    }
                }
            });
        } else {
            DownloadCampaignsByCampaignIdsRequest request = generateCampaignsByCampaignIdsRequest(parameters);

            final IBulkService service = serviceClient.getService();

            service.downloadCampaignsByCampaignIdsAsync(request, new AsyncHandler<DownloadCampaignsByCampaignIdsResponse>() {
                @Override
                public void handleResponse(Response<DownloadCampaignsByCampaignIdsResponse> res) {
                    try {
                        DownloadCampaignsByCampaignIdsResponse response;

                        response = res.get();

                        BulkDownloadOperation operation = new BulkDownloadOperation(
                                response.getDownloadRequestId(), ServiceUtils.GetTrackingId(res),
                                httpFileService, zipExtractor,
                                serviceClient, statusPollIntervalInMilliseconds);

                        resultFuture.setResult(operation);
                    } catch (InterruptedException e) {
                        resultFuture.setException(new CouldNotSubmitBulkDownloadException(e));
                    } catch (ExecutionException e) {
                        resultFuture.setException(new CouldNotSubmitBulkDownloadException(e));
                    }
                }
            });
        }

        return resultFuture;
    }

    /**
     * Submits an upload request to the Bing Ads bulk service with the specified parameters.
     *
     * <p>
     * The {@link FileUploadParameters#getResultFileDirectory} and {@link FileUploadParameters#getResultFileName }
     * properties are ignored by this method. When the file is ready for download, specify the result file path and name as
     * parameters of the {@link BulkOperation#downloadResultFileAsync} method.
     * </p>
     *
     * @param parameters Describes the upload response mode and file name.
     * @param callback   a callback will be called when the {@link BulkDownloadOperation} has been created
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<BulkUploadOperation> submitUploadAsync(final FileUploadParameters parameters, AsyncCallback<BulkUploadOperation> callback) {
        GetBulkUploadUrlRequest request = new GetBulkUploadUrlRequest();
        request.setResponseMode(parameters.getResponseMode());
        request.setAccountId(authorizationData.getAccountId());

        final ResultFuture<BulkUploadOperation> resultFuture = new ResultFuture<BulkUploadOperation>(callback);

        final IBulkService service = serviceClient.getService();

        service.getBulkUploadUrlAsync(request, new AsyncHandler<GetBulkUploadUrlResponse>() {
            @Override
            public void handleResponse(Response<GetBulkUploadUrlResponse> res) {
                try {
                    GetBulkUploadUrlResponse response = res.get();

                    String uploadUrl = response.getUploadUrl();

                    File effectiveUploadPath = parameters.getUploadFilePath();

                    if (parameters.getRenameUploadFileToMatchRequestId()) {
                        effectiveUploadPath = renameUploadFileToMatchRequestId(effectiveUploadPath, response.getRequestId());
                    }

                    boolean shouldCompress = parameters.getCompressUploadFile()
                            && !StringExtensions.getFileExtension(effectiveUploadPath.toString()).equals(".zip");

                    File compressedFilePath = null;

                    if (shouldCompress) {
                        compressedFilePath = compressUploadFile(effectiveUploadPath);

                        effectiveUploadPath = compressedFilePath;
                    }

                    Consumer<HttpRequest> addHeaders = new Consumer<HttpRequest>() {
                        @Override
                        public void accept(final HttpRequest request) {
                            request.addHeader(HttpHeaders.DEVELOPER_TOKEN, authorizationData.getDeveloperToken());
                            request.addHeader(HttpHeaders.CUSTOMER_ID, Long.toString(authorizationData.getCustomerId()));
                            request.addHeader(HttpHeaders.ACCOUNT_ID, Long.toString(authorizationData.getAccountId()));
                            authorizationData.getAuthentication().addHeaders(new HeadersImpl() {
                                @Override
                                public void addHeader(String name, String value) {
                                    request.addHeader(name, value);
                                }
                            });
                        }
                    };

                    MessageHandler.getInstance().handleDirectMessage("Bulk Upload... requestId: " + response.getRequestId() + "; UploadFilePath:"
                            + parameters.getUploadFilePath() + "; uploadUrl: " + uploadUrl);

                    httpFileService.uploadFile(new URI(uploadUrl), effectiveUploadPath, addHeaders);

                    if (shouldCompress) {
                        compressedFilePath.delete();
                    }

                    if (parameters.getAutoDeleteTempFile()) {
                        parameters.getUploadFilePath().delete();

                    }
                    BulkUploadOperation operation = new BulkUploadOperation(
                            response.getRequestId(), ServiceUtils.GetTrackingId(res),
                            httpFileService, zipExtractor,
                            serviceClient, statusPollIntervalInMilliseconds);

                    resultFuture.setResult(operation);
                } catch (InterruptedException e) {
                    resultFuture.setException(new CouldNotSubmitBulkUploadException(e));
                } catch (ExecutionException e) {
                    resultFuture.setException(new CouldNotSubmitBulkUploadException(e));
                } catch (URISyntaxException e) {
                    resultFuture.setException(e);
                } catch (CouldNotUploadFileException e) {
                    resultFuture.setException(e);
                }
            }

            private File renameUploadFileToMatchRequestId(File uploadFilePath, String requestId) {
                uploadFilePath.renameTo(uploadFilePath);
                Path path = uploadFilePath.toPath();
                File newFile = path.resolveSibling("upload_" + requestId + ".csv").toFile();
                if (uploadFilePath.renameTo(newFile)) {
                    return newFile;
                }
                return uploadFilePath;
            }
        });

        return resultFuture;
    }

    private File compressUploadFile(File uploadFilePath) {
        workingDirectory.mkdirs();

        File compressedFilePath = new File(workingDirectory, StringExtensions.getFileNameWithoutExtension(uploadFilePath) + "_" + UUID.randomUUID() + ".zip");

        zipExtractor.compressFile(uploadFilePath, compressedFilePath);

        return compressedFilePath;
    }

    private DownloadCampaignsByCampaignIdsRequest generateCampaignsByCampaignIdsRequest(SubmitDownloadParameters parameters) {
        DownloadCampaignsByCampaignIdsRequest request = new DownloadCampaignsByCampaignIdsRequest();

        ArrayOfCampaignScope arrayOfCampaigns = new ArrayOfCampaignScope();

        List<CampaignScope> campaigns = arrayOfCampaigns.getCampaignScopes();
        for (Long campaignId : parameters.getCampaignIds()) {
            CampaignScope scope = new CampaignScope();
            scope.setCampaignId(campaignId);
            scope.setParentAccountId(authorizationData.getAccountId());
            campaigns.add(scope);
        }

        request.setCampaigns(arrayOfCampaigns);

        request.setDataScope(parameters.getDataScope());
        request.setDownloadFileType(parameters.getFileType());
        request.setDownloadEntities(parameters.getDownloadEntities());
        request.setFormatVersion(FORMAT_VERSION);
        request.setLastSyncTimeInUTC(parameters.getLastSyncTimeInUTC());

        return request;
    }

    private DownloadCampaignsByAccountIdsRequest generateCampaignsByAccountIdRequest(SubmitDownloadParameters parameters) {
        DownloadCampaignsByAccountIdsRequest request = new DownloadCampaignsByAccountIdsRequest();

        ArrayOflong accountIds = new ArrayOflong();

        accountIds.getLongs().add(this.authorizationData.getAccountId());

        request.setAccountIds(accountIds);

        request.setDataScope(parameters.getDataScope());
        request.setDownloadFileType(parameters.getFileType());
        request.setDownloadEntities(parameters.getDownloadEntities());
        request.setFormatVersion(FORMAT_VERSION);
        request.setLastSyncTimeInUTC(parameters.getLastSyncTimeInUTC());

        return request;
    }

    private FileUploadParameters createFileUploadParameters(EntityUploadParameters parameters) {
        workingDirectory.mkdirs();

        File tempFilePath = new File(getWorkingDirectory(), UUID.randomUUID() + ".csv");

        BulkFileWriter writer = null;

        try {
            writer = new BulkFileWriter(tempFilePath);

            for (BulkEntity entity : parameters.getEntities()) {
                writer.writeEntity(entity);
            }
        } catch (IOException ex) {
            throw new InternalException(ex);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    throw new InternalException(ex);
                }
            }
        }

        FileUploadParameters fileUploadParameters = new FileUploadParameters();

        fileUploadParameters.setUploadFilePath(tempFilePath);
        fileUploadParameters.setResponseMode(parameters.getResponseMode());
        fileUploadParameters.setResultFileDirectory(parameters.getResultFileDirectory());
        fileUploadParameters.setResultFileName(parameters.getResultFileName());
        fileUploadParameters.setOverwriteResultFile(parameters.getOverwriteResultFile());
        fileUploadParameters.setAutoDeleteTempFile(parameters.getAutoDeleteTempFile());

        return fileUploadParameters;
    }

    /**
     * Reserved for internal use.
     */
    public HttpFileService getHttpFileService() {
        return httpFileService;
    }

    /**
     * Reserved for internal use.
     */
    public void setHttpFileService(HttpFileService httpFileService) {
        this.httpFileService = httpFileService;
    }

    /**
     * Reserved for internal use.
     */
    public ZipExtractor getZipExtractor() {
        return zipExtractor;
    }

    /**
     * Reserved for internal use.
     */
    public void setZipExtractor(ZipExtractor zipExtractor) {
        this.zipExtractor = zipExtractor;
    }

    /**
     * Reserved for internal use.
     */
    public BulkEntityReaderFactory getBulkEntityReaderFactory() {
        return bulkEntityReaderFactory;
    }

    /**
     * Reserved for internal use.
     */
    public void setBulkEntityReaderFactory(BulkEntityReaderFactory bulkEntityReaderFactory) {
        this.bulkEntityReaderFactory = bulkEntityReaderFactory;
    }

    /**
     * Gets the directory for storing temporary files needed for some operations.
     */
    public File getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Sets the directory for storing temporary files needed for some operations.
     */
    public void setWorkingDirectory(File value) {
        this.workingDirectory = value;
    }

    /**
     * Gets the time interval in milliseconds between two status polling attempts. The default value is 1000 (1 second).
     */
    public int getStatusPollIntervalInMilliseconds() {
        return statusPollIntervalInMilliseconds;
    }

    /**
     * Sets the time interval in milliseconds between two status polling attempts. The default value is 1000 (1 second).
     */
    public void setStatusPollIntervalInMilliseconds(int statusPollIntervalInMilliseconds) {
        this.statusPollIntervalInMilliseconds = statusPollIntervalInMilliseconds;
    }
}

interface WriteAction {
    void execute() throws IOException;
}
