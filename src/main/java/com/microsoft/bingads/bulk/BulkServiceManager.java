package com.microsoft.bingads.bulk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.ParentCallback;
import com.microsoft.bingads.ServiceUtils;
import com.microsoft.bingads.internal.ResponseFuture;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.oauth.HttpHeaders;
import com.microsoft.bingads.internal.utilities.BulkFileReaderFactory;
import com.microsoft.bingads.internal.utilities.CSVBulkFileReaderFactory;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.UnsuccessfulFileUpload;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import java.util.UUID;

/**
 * Provides methods for downloading and uploading bulk files. Most of the methods in this class abstract away the low level details such as polling for completion status.
 *
 * Example: {@link BulkServiceManager#downloadFile(DownloadParameters) will submit the download request to the bulk service,
 * poll until the status is completed (or returns an error), and downloads the file locally.
 * If instead you want to manage the low level details you would first call {@link BulkServiceManager#submitDownload(DownloadParameters)},
 * wait for the results file to be prepared using either {@link BulkOperation#getStatus()}
 * or {@link BulkOperation#track(Progress)}, and then download the file with the
 * {@link BulkOperation#downloadResultFile(String, String, boolean)} method.
 *
 */
public class BulkServiceManager {

    private static final String FORMAT_VERSION = "3.0";
    private AuthorizationData authorizationData;
    private HttpFileService httpFileService;
    private ZipExtractor zipExtractor;
    private BulkFileReaderFactory bulkFileReaderFactory;

    private final ServiceClient<IBulkService> serviceClient;

    private File workingDirectory;

    /**
     * Initializes a new instance of this class with the specified {@link AuthorizationData}.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     */
    public BulkServiceManager(AuthorizationData authorizationData) {
        this(authorizationData, new HttpClientHttpFileService(), new SimpleZipExtractor(), new CSVBulkFileReaderFactory());
    }

    private BulkServiceManager(AuthorizationData authorizationData,
            HttpFileService httpFileService, ZipExtractor zipExtractor,
            BulkFileReaderFactory bulkFileReaderFactory) {
        this.authorizationData = authorizationData;
        this.httpFileService = httpFileService;
        this.zipExtractor = zipExtractor;
        this.bulkFileReaderFactory = bulkFileReaderFactory;

        serviceClient = new ServiceClient<IBulkService>(this.authorizationData, IBulkService.class);

        workingDirectory = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK");
    }

    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    /**
     * Downloads the specified Bulk entities.
     *
     * @param parameters Determines the download entities and file path. If a file path is not specified in the download parameters, the enumerable of {@link BulkEntity} is read from a temporary file path designated at run time.
     * @param callback A callback to call with an {@link Iterable} of {@link BulkEntity} objects
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> downloadEntitiesAsync(DownloadParameters parameters, AsyncCallback<BulkEntityIterable> callback) {
        return this.downloadEntitiesAsync(parameters, null, callback);
    }

    /**
     * Downloads the specified Bulk entities.
     *
     * @param parameters Determines the download entities and file path. If a file path is not specified in the download parameters, the enumerable of {@link BulkEntity} is read from a temporary file path designated at run time.
     * @param progress An object which is updated with the progress of a bulk operation
     * @param callback A callback to call with an {@link Iterable} of {@link BulkEntity} objects
     * @return a Future indicating whether the operation has been completed
     */
    public Future<BulkEntityIterable> downloadEntitiesAsync(DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkEntityIterable> callback) {
        this.validateSubmitDownloadParameters(parameters.getSubmitDownloadParameters());

        this.validateUserData();

        return downloadEntitiesAsyncImpl(parameters, progress, callback);
    }

    public Future<BulkEntityIterable> uploadEntitiesAsync(EntityUploadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkEntityIterable> callback) {
        validateEntityUploadParameters(parameters);

        validateUserData();

        return uploadEntitiesAsyncImpl(createFileUploadParameters(parameters), progress, callback);
    }

    public Future<File> uploadFileAsync(final FileUploadParameters parameters, AsyncCallback<File> callback) {        
        return uploadFileAsync(parameters, null, callback);
    }
    
    public Future<File> uploadFileAsync(final FileUploadParameters parameters, final Progress<BulkOperationProgressInfo> progress, AsyncCallback<File> callback) {
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
    }
    
    private void validateSubmitUploadParameters(SubmitUploadParameters parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must not be null");
        }

        if (parameters.getUploadFilePath() == null) {
            throw new NullPointerException("parameters.getUploadFilePath() must not be null");
        }
    }

    private Future<BulkEntityIterable> uploadEntitiesAsyncImpl(FileUploadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkEntityIterable> callback) {
        final ResponseFuture<BulkEntityIterable> responseFuture = new ResponseFuture<BulkEntityIterable>(callback);

        uploadFileAsyncImpl(parameters, progress, new ParentCallback<File>(responseFuture) {
            @Override
            public void onSuccess(File resultFile) throws FileNotFoundException, UnsupportedEncodingException {
                responseFuture.setResult(bulkFileReaderFactory.createBulkFileReader(resultFile, ResultFileType.UPLOAD, DownloadFileType.CSV).getEntities());
            }
        });

        return responseFuture;
    }

    private Future<File> uploadFileAsyncImpl(final FileUploadParameters parameters, final Progress<BulkOperationProgressInfo> progress, AsyncCallback<File> callback) {
        final ResponseFuture<File> responseFuture = new ResponseFuture<File>(callback);
        
        workingDirectory.mkdirs();

        submitUpload(parameters, new ParentCallback<BulkUploadOperation>(responseFuture) {
            @Override
            public void onSuccess(final BulkUploadOperation operation) {
                operation.trackAsync(progress, new ParentCallback<BulkOperationStatus<UploadStatus>>(responseFuture) {
                    @Override
                    public void onSuccess(BulkOperationStatus<UploadStatus> status) throws StatusNotReceived, IOException, URISyntaxException {
                        downloadBulkFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(), operation, new ParentCallback<File>(responseFuture) {
                            @Override
                            public void onSuccess(File localFile) {
                                responseFuture.setResult(localFile);
                            }
                        });
                    }
                });
            }
        });

        return responseFuture;
    }

    private void validateSubmitDownloadParameters(SubmitDownloadParameters parameters) {
        if (parameters == null) {
            throw new NullPointerException("parameters must not be null");
        }
    }

    private Future<BulkEntityIterable> downloadEntitiesAsyncImpl(final DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<BulkEntityIterable> callback) {
        final ResponseFuture<BulkEntityIterable> responseFuture = new ResponseFuture<BulkEntityIterable>(callback);

        this.downloadFileAsyncImpl(parameters, progress, new ParentCallback<File>(responseFuture) {
            @Override
            public void onSuccess(File result) throws FileNotFoundException, UnsupportedEncodingException {
                ResultFileType resultFileType = parameters.getLastSyncTimeInUTC() != null ? ResultFileType.PARTIAL_DOWNLOAD : ResultFileType.FULL_DOWNLOAD;

                BulkFileReader reader = bulkFileReaderFactory.createBulkFileReader(result, resultFileType, parameters.getFileType());

                responseFuture.setResult(reader.getEntities());
            }
        });

        return responseFuture;
    }

    /**
     * Downloads the specified Bulk entities to the specified file path asynchronously.
     *
     * @param parameters Determines the download entities and file path.
     * @param a callback which is called with the file path when the file is downloaded and available
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<File> downloadFileAsync(DownloadParameters parameters, AsyncCallback<File> callback) {
        return this.downloadFileAsync(parameters, null, callback);
    }

    /**
     * Downloads the specified Bulk entities to the specified file path asynchronously.
     *
     * @param parameters Determines the download entities and file path.
     * @param progress An object which is updated with the progress of a bulk operation
     * @param a callback which is called with the file path when the file is downloaded and available
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<File> downloadFileAsync(DownloadParameters parameters, Progress<BulkOperationProgressInfo> progress, AsyncCallback<File> callback) {
        validateUserData();

        validateSubmitDownloadParameters(parameters.getSubmitDownloadParameters());

        return downloadFileAsyncImpl(parameters, progress, callback);
    }

    private Future<File> downloadFileAsyncImpl(final DownloadParameters parameters, final Progress<BulkOperationProgressInfo> progress, AsyncCallback<File> callback) {
        final ResponseFuture<File> responseFuture = new ResponseFuture<File>(callback);
        
        workingDirectory.mkdirs();
        
        // TODO: handle cancellations
        this.submitDownloadAsync(parameters.getSubmitDownloadParameters(), new ParentCallback<BulkDownloadOperation>(responseFuture) {
            @Override
            public void onSuccess(final BulkDownloadOperation operation) {
                operation.trackAsync(progress, new ParentCallback<BulkOperationStatus<DownloadStatus>>(responseFuture) {
                    @Override
                    public void onSuccess(BulkOperationStatus<DownloadStatus> status) throws StatusNotReceived, IOException, URISyntaxException {
                        downloadBulkFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(), operation, new ParentCallback<File>(responseFuture) {
                            @Override
                            public void onSuccess(File localFile) {
                                responseFuture.setResult(localFile);
                            }
                        });
                    }
                });
            }
        });

        return responseFuture;
    }

    private <T> Future<File> downloadBulkFileAsync(File resultFileDirectory, String resultFileName, boolean overwriteResultFile, BulkOperation<T> operation, AsyncCallback<File> callback) throws StatusNotReceived, IOException, URISyntaxException {
        operation.setHttpFileService(this.httpFileService);
        operation.setZipExtractor(this.zipExtractor);

        final ResponseFuture<File> responseFuture = new ResponseFuture<File>(callback);

        File effectiveResultFileDirectory = resultFileDirectory;

        if (effectiveResultFileDirectory == null) {
            effectiveResultFileDirectory = workingDirectory;
        }

        operation.downloadResultFileAsync(effectiveResultFileDirectory, resultFileName, true, overwriteResultFile, new ParentCallback<File>(responseFuture) {
            @Override
            public void onSuccess(File file) {
                responseFuture.setResult(file);
            }
        });

        return responseFuture;
    }

    private void validateUserData() {
        authorizationData.validate();
    }

    /**
     * Submits the specified download request parameters to the Bing Ads bulk service. First call {@link submitDownloadAsync}, wait for the results file to be prepared using either {@link BulkOperation#getStatus() }
     * or {@link BulkOperation#complete() }, and then get the download result file with the {@link BulkOperation#downloadResultFile(String, String, boolean)
     * } method.
     *
     * The {@link DownloadParameters#getResultFileDirectory() } and {@link DownloadParameters#getResultFileName()
     * } properties are ignored by this method. When the file is ready for download, specify the result file path and name as parameters of the {@link BulkOperation#downloadResultFile(String, String, boolean) }
     * method.
     *
     * @param parameters Describes the type of entities and data scope that you want to download.
     * @throws DownloadNotSubmitted
     */
    public Future<BulkDownloadOperation> submitDownloadAsync(SubmitDownloadParameters parameters, AsyncCallback<BulkDownloadOperation> callback) {
        Authentication auth = authorizationData.getAuthentication();

        if (auth == null) {
            throw new IllegalArgumentException("Missing authentication");
        }

        final ResponseFuture<BulkDownloadOperation> responseFuture = new ResponseFuture<BulkDownloadOperation>(callback);

        if (parameters.getCampaignIds() == null) {
            DownloadCampaignsByAccountIdsRequest request = generateCampaignsByAccountIdRequest(parameters);

            final IBulkService service = serviceClient.getService();

            service.downloadCampaignsByAccountIdsAsync(request, new AsyncHandler<DownloadCampaignsByAccountIdsResponse>() {
                @Override
                public void handleResponse(Response<DownloadCampaignsByAccountIdsResponse> res) {
                    try {
                        DownloadCampaignsByAccountIdsResponse response;

                        response = res.get();

                        String trackingId = ServiceUtils.GetTrackingId(res);

                        responseFuture.setResult(new BulkDownloadOperation(response.getDownloadRequestId(), authorizationData, trackingId));
                    } catch (Throwable e) {
                        responseFuture.setException(e);
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

                        responseFuture.setResult(new BulkDownloadOperation(response.getDownloadRequestId(), authorizationData, ServiceUtils.GetTrackingId(res)));
                    } catch (Throwable e) {
                        responseFuture.setException(e);
                    }
                }
            });
        }

        return responseFuture;
    }

    /**
     * Submits the specified upload request parameters to the Bing Ads bulk service. First call {@link BulkServiceManager#submitUpload }, wait for the results file to be prepared using either {@link BulkOperation#getStatus()
     * }
     * or {@link BulkOperation#complete() }, and then get the download result file with the {@link BulkOperation#downloadResultFile(String, String, boolean)
     * } method.
     *
     * The {@link UploadParameters#getResultFileDirectory() } and {@link UploadParameters#getResultFileName()
     * } properties are ignored by this method. When the file is ready for download, specify the result file path and name as parameters of the {@link BulkOperation#downloadResultFile(String, String, boolean) }
     * method.
     *
     * @param parameters Describes the upload response mode and file name.
     * @return
     * @throws UploadNotSubmitted
     * @throws FileNotFoundException
     * @throws IOException
     * @throws UnsuccessfulFileUpload
     * @throws URISyntaxException
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public Future<BulkUploadOperation> submitUpload(final FileUploadParameters parameters, AsyncCallback<BulkUploadOperation> callback) {
        GetBulkUploadUrlRequest request = new GetBulkUploadUrlRequest();
        request.setResponseMode(parameters.getResponseMode());
        request.setAccountId(authorizationData.getAccountId());

        final ResponseFuture<BulkUploadOperation> responseFuture = new ResponseFuture<BulkUploadOperation>(callback);

        final IBulkService service = serviceClient.getService();

        service.getBulkUploadUrlAsync(request, new AsyncHandler<GetBulkUploadUrlResponse>() {
            @Override
            public void handleResponse(Response<GetBulkUploadUrlResponse> res) {
                try {
                    GetBulkUploadUrlResponse response = res.get();                   

                    String trackingId = ServiceUtils.GetTrackingId(res);

                    String uploadUrl = response.getUploadUrl();

                    File effectiveUploadPath = parameters.getUploadFilePath();

                    boolean shouldCompress = parameters.getCompressUploadFile() && !StringExtensions.getFileExtension(effectiveUploadPath.toString()).equals(".zip");

                    File compressedFilePath = null;

                    if (shouldCompress) {
                        compressedFilePath = compressUploadFile(effectiveUploadPath);

                        effectiveUploadPath = compressedFilePath;
                    }

                    Consumer<HttpRequest> addHeaders = new Consumer<HttpRequest>() {
                        @Override
                        public void accept(HttpRequest request) {
                            request.addHeader(HttpHeaders.DEVELOPER_TOKEN, authorizationData.getDeveloperToken());
                            request.addHeader(HttpHeaders.CUSTOMER_ID, authorizationData.getCustomerId().toString());
                            request.addHeader(HttpHeaders.ACCOUNT_ID, authorizationData.getAccountId().toString());
                            authorizationData.getAuthentication().addAuthenticationHeadersToFileUploadRequest(request);
                        }
                    };

                    httpFileService.uploadFile(new URI(uploadUrl), effectiveUploadPath, addHeaders);

                    if (shouldCompress) {
                        compressedFilePath.delete();
                    }
                    
                    responseFuture.setResult(new BulkUploadOperation(response.getRequestId(), authorizationData, service, trackingId));
                } catch (Throwable e) {
                    responseFuture.setException(e);
                }
            }
        });

        return responseFuture;
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
        request.setEntities(parameters.getEntities());
        request.setFormatVersion(FORMAT_VERSION);
        request.setLastSyncTimeInUTC(parameters.getLastSyncTimeInUTC());
        request.setLocationTargetVersion(null);
        request.setPerformanceStatsDateRange(parameters.getPerformanceStatsDateRange());

        return request;
    }

    private DownloadCampaignsByAccountIdsRequest generateCampaignsByAccountIdRequest(SubmitDownloadParameters parameters) {
        DownloadCampaignsByAccountIdsRequest request = new DownloadCampaignsByAccountIdsRequest();

        ArrayOflong accountIds = new ArrayOflong();

        accountIds.getLongs().add(this.authorizationData.getAccountId());

        request.setAccountIds(accountIds);

        request.setDataScope(parameters.getDataScope());
        request.setDownloadFileType(parameters.getFileType());
        request.setEntities(parameters.getEntities());
        request.setFormatVersion(FORMAT_VERSION);
        request.setLastSyncTimeInUTC(parameters.getLastSyncTimeInUTC());
        request.setLocationTargetVersion(null);
        request.setPerformanceStatsDateRange(parameters.getPerformanceStatsDateRange());

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

        return fileUploadParameters;
    }

    public HttpFileService getHttpFileService() {
        return httpFileService;
    }

    public void setHttpFileService(HttpFileService httpFileService) {
        this.httpFileService = httpFileService;
    }

    public ZipExtractor getZipExtractor() {
        return zipExtractor;
    }

    public void setZipExtractor(ZipExtractor zipExtractor) {
        this.zipExtractor = zipExtractor;
    }

    public BulkFileReaderFactory getBulkFileReaderFactory() {
        return bulkFileReaderFactory;
    }

    public void setBulkFileReaderFactory(BulkFileReaderFactory bulkFileReaderFactory) {
        this.bulkFileReaderFactory = bulkFileReaderFactory;
    }

    public File getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(File value) {
        this.workingDirectory = value;
    }
}
