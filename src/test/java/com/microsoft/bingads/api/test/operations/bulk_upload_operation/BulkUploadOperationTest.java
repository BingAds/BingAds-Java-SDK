package com.microsoft.bingads.api.test.operations.bulk_upload_operation;


import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.api.test.operations.FakeApiTest;
import com.microsoft.bingads.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.bulk.BulkUploadOperation;
import com.microsoft.bingads.bulk.GetDetailedBulkUploadStatusResponse;
import com.microsoft.bingads.bulk.IBulkService;

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
        BulkUploadOperation operation = new BulkUploadOperation("request123", createUserData(), service);

        if (statusCheckIntervalInMs != null) {
            operation.setStatusPollIntervalInMilliseconds(statusCheckIntervalInMs);
        }

        return operation;
    }

    protected GetDetailedBulkUploadStatusResponse createStatusResponse(Integer percentComplete, String status, String resultFileUrl) {
        GetDetailedBulkUploadStatusResponse response = new GetDetailedBulkUploadStatusResponse();
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
