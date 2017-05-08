package com.microsoft.bingads.v11.api.test.operations.bulk_upload_operation;

import com.microsoft.bingads.v11.api.test.operations.FakeBulkService;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.BulkUploadOperation;
import com.microsoft.bingads.v11.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v11.bulk.UploadStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GetStatusTest extends BulkUploadOperationTest {

    @Parameter(value = 0)
    public String trackingId;

    @Parameter(value = 1)
    public String status;

    @Parameter(value = 2)
    public UploadStatus expectedStatus;

    @Parameter(value = 3)
    public int percentComplete;

    @Parameter(value = 4)
    public String resultFileUrl;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"track123", "InProgress", UploadStatus.IN_PROGRESS, 5, null},
            //{"track123", "Completed", UploadStatus.COMPLETED, 100, "http://downloadurl.com"},
            //{"track123", "CompletedWithErrors", UploadStatus.COMPLETED_WITH_ERRORS, 100, "http://downloadurl.com"}
        });
    }

    @Test
    public void test() throws InterruptedException, ExecutionException {
        BulkUploadOperation operation = createBulkUploadOperation(null);

        FakeBulkService.setGetBulkUploadStatusResponse(new Supplier<GetBulkUploadStatusResponse>() {
            @Override
            public GetBulkUploadStatusResponse get() {
                return createStatusResponse(percentComplete, status, resultFileUrl);
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());

        BulkOperationStatus<UploadStatus> actualStatus = operation.getStatusAsync(null).get();

        assertEquals(expectedStatus, actualStatus.getStatus());
        assertEquals(percentComplete, actualStatus.getPercentComplete());

        if (resultFileUrl == null) {
            assertNull(actualStatus.getResultFileUrl());
        } else {
            assertEquals(resultFileUrl, actualStatus.getResultFileUrl());
        }
    }
}
