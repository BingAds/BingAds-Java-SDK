package com.microsoft.bingads.api.test.operations.bulk_download_operation;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.api.test.operations.FakeApiTest;
import com.microsoft.bingads.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.bulk.BulkDownloadOperation;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;

public class BulkDownloadOperationTest extends FakeApiTest {

    protected IBulkService service;

    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }

    protected BulkDownloadOperation createBulkDownloadOperation(Integer statusCheckIntervalInMs) {
        BulkDownloadOperation operation = new BulkDownloadOperation("request123", createUserData());

        if (statusCheckIntervalInMs != null) {
            operation.setStatusCheckIntervalInMs(statusCheckIntervalInMs);
        }

        return operation;
    }

    protected GetDetailedBulkDownloadStatusResponse createStatusResponse(Integer percentComplete, String status, String resultFileUrl) {
        GetDetailedBulkDownloadStatusResponse response = new GetDetailedBulkDownloadStatusResponse();
        response.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
        response.setPercentComplete(percentComplete);
        response.setRequestStatus(status);
        response.setResultFileUrl(resultFileUrl);

        return response;
    }

    public BulkDownloadOperationTest() {
        super();
    }

}
