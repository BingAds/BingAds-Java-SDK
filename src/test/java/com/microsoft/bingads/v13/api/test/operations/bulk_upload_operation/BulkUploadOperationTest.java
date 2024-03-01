package com.microsoft.bingads.v13.api.test.operations.bulk_upload_operation;


import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.v13.api.test.operations.FakeApiTest;
import com.microsoft.bingads.v13.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.bulk.BulkUploadOperation;
import com.microsoft.bingads.v13.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.internal.bulk.Config;

public class BulkUploadOperationTest extends FakeApiTest {

    protected IBulkService service;

    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }

    protected BulkUploadOperation createBulkUploadOperation(Integer statusCheckIntervalInMs) {
        return new BulkUploadOperation("request123", createUserData(),
                statusCheckIntervalInMs != null ? statusCheckIntervalInMs : Config.DEFAULT_STATUS_CHECK_INTERVAL_IN_MS);
    }

    protected GetBulkUploadStatusResponse createStatusResponse(Integer percentComplete, String status, String resultFileUrl) {
        GetBulkUploadStatusResponse response = new GetBulkUploadStatusResponse();
        response.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
        response.setPercentComplete(percentComplete);
        response.setRequestStatus(status);
        response.setResultFileUrl(resultFileUrl);

        return response;
    }

    public BulkUploadOperationTest() {
        super();
    }

}
