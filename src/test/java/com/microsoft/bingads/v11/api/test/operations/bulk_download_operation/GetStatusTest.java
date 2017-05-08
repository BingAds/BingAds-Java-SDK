package com.microsoft.bingads.v11.api.test.operations.bulk_download_operation;

import com.microsoft.bingads.v11.api.test.operations.FakeBulkService;
import com.microsoft.bingads.v11.bulk.BulkDownloadOperation;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.DownloadStatus;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusResponse;
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

        FakeBulkService.setOnGetBulkDownloadStatus(new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest t) {
                assertEquals("request123", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetBulkDownloadStatusResponse(new Supplier<GetBulkDownloadStatusResponse>() {
            @Override
            public GetBulkDownloadStatusResponse get() {
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
