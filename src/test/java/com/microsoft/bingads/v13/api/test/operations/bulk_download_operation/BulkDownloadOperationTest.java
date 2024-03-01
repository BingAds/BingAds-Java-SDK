package com.microsoft.bingads.v13.api.test.operations.bulk_download_operation;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.v13.api.test.operations.FakeApiTest;
import com.microsoft.bingads.v13.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.bulk.BulkDownloadOperation;
import com.microsoft.bingads.v13.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.internal.bulk.Config;

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
        return new BulkDownloadOperation("request123", createUserData(),
                statusCheckIntervalInMs != null ? statusCheckIntervalInMs : Config.DEFAULT_STATUS_CHECK_INTERVAL_IN_MS);
    }

    protected GetBulkDownloadStatusResponse createStatusResponse(Integer percentComplete, String status, String resultFileUrl) {
        GetBulkDownloadStatusResponse response = new GetBulkDownloadStatusResponse();
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
