package com.microsoft.bingads.api.test.operations.bulk_download_operation;

import com.microsoft.bingads.api.test.operations.FakeBulkService;
import com.microsoft.bingads.bulk.BulkDownloadOperation;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.DownloadStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
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
public class GetStatusTest extends BulkDownloadOperationTest {

    @Parameter(value = 0)
    public String trackingId;

    @Parameter(value = 1)
    public String status;

    @Parameter(value = 2)
    public DownloadStatus expectedStatus;

    @Parameter(value = 3)
    public int percentComplete;

    @Parameter(value = 4)
    public String resultFileUrl;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"track123", "InProgress", DownloadStatus.IN_PROGRESS, 5, null},
            {"track123", "Completed", DownloadStatus.COMPLETED, 100, "http://downloadurl.com"},});
    }

    @Test
    public void test() throws InterruptedException, ExecutionException {
        BulkDownloadOperation operation = createBulkDownloadOperation(null);

        FakeBulkService.setOnGetDetailedBulkDownloadStatus(new Consumer<GetDetailedBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetDetailedBulkDownloadStatusRequest t) {
                assertEquals("request123", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetDetailedBulkDownloadStatusResponse(new Supplier<GetDetailedBulkDownloadStatusResponse>() {
            @Override
            public GetDetailedBulkDownloadStatusResponse get() {
                return createStatusResponse(percentComplete, status, resultFileUrl);
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());

        BulkOperationStatus<DownloadStatus> actualStatus = operation.getStatusAsync(null).get();

        assertEquals(expectedStatus, actualStatus.getStatus());
        assertEquals(percentComplete, actualStatus.getPercentComplete());

        if (resultFileUrl == null) {
            assertNull(actualStatus.getResultFileUrl());
        } else {
            assertEquals(resultFileUrl, actualStatus.getResultFileUrl());
        }
    }
}
