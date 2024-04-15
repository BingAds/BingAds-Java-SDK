package com.microsoft.bingads.v13.reporting;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ParentCallback;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.utilities.HttpClientHttpFileService;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import com.microsoft.bingads.internal.utilities.SimpleZipExtractor;
import com.microsoft.bingads.internal.utilities.ZipExtractor;

/**
 * Provides high level methods for downloading reporting using the Reporting API functionality. Also provides methods for submitting download operations.
 *
 * <p>
 * Example: {@link ReportingServiceManager#downloadFileAsync} will submit the download request to the reporting service,
 * poll until the status is completed (or returns an error), and downloads the file locally.
 * If instead you want to manage the low level details you would first call {@link ReportingServiceManager#submitDownloadAsync},
 * wait for the results file to be prepared using either {@link ReportingDownloadOperation#getStatusAsync}
 * or {@link ReportingDownloadOperation#trackAsync}, and then download the file with the
 * {@link ReportingDownloadOperation#downloadResultFileAsync} method.
 * 
 * </p>
 *
 */
public class ReportingServiceManager {
	
    private AuthorizationData authorizationData;
    private HttpFileService httpFileService;
    private ZipExtractor zipExtractor;
    private ApiEnvironment apiEnvironment;
    
    /**
     * The time interval in milliseconds between two status polling attempts.
     * */
    private int statusPollIntervalInMilliseconds;
    
    /**
     * The timeout in milliseconds of HttpClient download operation.
     */
    private int downloadHttpTimeoutInMilliseconds;

    private final ServiceClient<IReportingService> serviceClient;

    private File workingDirectory;

    /**
     * Initializes a new instance of this class with the specified {@link AuthorizationData}.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account
     */
    public ReportingServiceManager(AuthorizationData authorizationData) {
        this(authorizationData, null);
    }
    
    public ReportingServiceManager(AuthorizationData authorizationData, ApiEnvironment apiEnvironment) {
        this(authorizationData, new HttpClientHttpFileService(), new SimpleZipExtractor(), apiEnvironment);
    }

    private ReportingServiceManager(AuthorizationData authorizationData,
            HttpFileService httpFileService, ZipExtractor zipExtractor, ApiEnvironment apiEnvironment) {
        this.authorizationData = authorizationData;
        this.httpFileService = httpFileService;
        this.zipExtractor = zipExtractor;
        this.apiEnvironment = apiEnvironment;

        serviceClient = new ServiceClient<IReportingService>(this.authorizationData, apiEnvironment, IReportingService.class);

        workingDirectory = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK");

        statusPollIntervalInMilliseconds = ReportingConfig.DEFAULT_STATUS_CHECK_INTERVAL_IN_MS;
        
        downloadHttpTimeoutInMilliseconds = ReportingConfig.DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS;
    }

    /**
     * Gets the authorization data for the user performing the operation.
     */
    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }


    private void validateSubmitReportingDownloadParameters(ReportRequest reportRequest) {
        if (reportRequest == null) {
            throw new NullPointerException("parameters must not be null");
        }
    }
    

    /**
     * Downloads the reporting file to a Report Object in async mode.
     *
     * @param parameters
     *            Determines the download request and file path.
     * @param callback
     *            a callback which is called with the report object when the report file is
     *            downloaded and available
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<Report> downloadReportAsync(ReportingDownloadParameters parameters, AsyncCallback<Report> callback) {
        final ResultFuture<Report> resultFuture = new ResultFuture<Report>(callback);
        
        downloadFileAsync(parameters, new ParentCallback<File>(resultFuture) {
            @Override
            public void onSuccess(File result) throws Exception {
                if (result == null) {
                    resultFuture.setResult(null);
                } else {
                    resultFuture.setResult(new ReportFileReader(result, parameters.getReportRequest().getFormat()).getReport());
                }
            }
        });

        return resultFuture;
    }

    /**
     * Downloads the reporting file to a local file.
     *
     * @param parameters Determines the download request and file path.
     * @param callback a callback which is called with the file path when the file is downloaded and available
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<File> downloadFileAsync(ReportingDownloadParameters parameters, AsyncCallback<File> callback) {
        validateUserData();

        validateSubmitReportingDownloadParameters(parameters.getReportRequest());

        return downloadFileAsyncImpl(parameters,callback);
    }

    private Future<File> downloadFileAsyncImpl(final ReportingDownloadParameters parameters, AsyncCallback<File> callback) {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);
        
        workingDirectory.mkdirs();

        this.submitDownloadAsync(parameters.getReportRequest(), new ParentCallback<ReportingDownloadOperation>(resultFuture) {
            @Override
            public void onSuccess(final ReportingDownloadOperation operation) {
                operation.trackAsync(new ParentCallback<ReportingOperationStatus>(resultFuture) {
                    @Override
                    public void onSuccess(ReportingOperationStatus status) throws IOException, URISyntaxException {
                        downloadReportingFileAsync(parameters.getResultFileDirectory(), parameters.getResultFileName(), parameters.getOverwriteResultFile(), operation, new ParentCallback<File>(resultFuture) {
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

    private <T> Future<File> downloadReportingFileAsync(File resultFileDirectory, String resultFileName, boolean overwriteResultFile, ReportingDownloadOperation operation, AsyncCallback<File> callback) throws IOException, URISyntaxException {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        File effectiveResultFileDirectory = resultFileDirectory;

        if (effectiveResultFileDirectory == null) {
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
     * Submits a download request to the Bing Ads reporting service with the specified parameters.
     *
     * <p>
     * The {@link ReportingDownloadParameters#getResultFileDirectory } and {@link ReportingDownloadParameters#getResultFileName
     * } properties are ignored by this method.
     * When the file is ready for download, specify the result file path and name as parameters of the
     * {@link ReportingDownloadOperation#downloadResultFileAsync} method.
     * </p>
     *
     * @param reportRequest Describes the type of entities and data scope that you want to download    
     * @param callback a callback will be called when the {@link ReportingDownloadOperation} has been created
     *
     * @return a {@link Future} that will indicate completion of the operation
     */
    public Future<ReportingDownloadOperation> submitDownloadAsync(ReportRequest reportRequest, AsyncCallback<ReportingDownloadOperation> callback) {
        Authentication auth = authorizationData.getAuthentication();

        if (auth == null) {
            throw new IllegalArgumentException("Missing authentication");
        }

        final ResultFuture<ReportingDownloadOperation> resultFuture = new ResultFuture<ReportingDownloadOperation>(callback);
        
        final IReportingService service = serviceClient.getService();
        SubmitGenerateReportRequest submitRequest = new SubmitGenerateReportRequest();
        submitRequest.setReportRequest(reportRequest);
        
        service.submitGenerateReportAsync(submitRequest, new AsyncHandler<SubmitGenerateReportResponse>() {
            @Override
            public void handleResponse(Response<SubmitGenerateReportResponse> res) {
                try {
                	SubmitGenerateReportResponse response;

                    response = res.get();
                    
                    ReportingDownloadOperation operation = new ReportingDownloadOperation(
                            response.getReportRequestId(), ServiceUtils.GetTrackingId(res),
                            httpFileService, downloadHttpTimeoutInMilliseconds, zipExtractor,
                            serviceClient, statusPollIntervalInMilliseconds);

                    resultFuture.setResult(operation);
                } catch (InterruptedException e) {
                    resultFuture.setException(new CouldNotSubmitReportingDownloadException(e));
                } catch (ExecutionException e) {
                    resultFuture.setException(new CouldNotSubmitReportingDownloadException(e));
                }
            }
        });
       

        return resultFuture;
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
    
    /**
     * Gets the timeout of HttpClient download operation. The default value is 100000(100s).
     */
	public int getDownloadHttpTimeoutInMilliseconds() {
		return downloadHttpTimeoutInMilliseconds;
	}

	/**
     * Sets the timeout of HttpClient download operation. The default value is 100000(100s).
     */
	public void setDownloadHttpTimeoutInMilliseconds(int downloadHttpTimeoutInMilliseconds) {
		this.downloadHttpTimeoutInMilliseconds = downloadHttpTimeoutInMilliseconds;
	}
	
    /**
     * Removes all files from the working directory, whether the files are used by this BulkServiceManager or by another instance.
     */
    public void cleanupTempFiles() {
        for(File file : workingDirectory.listFiles()) {
            file.delete();
        }
    }
}
