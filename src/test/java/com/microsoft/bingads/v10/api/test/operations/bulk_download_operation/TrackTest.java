package com.microsoft.bingads.v10.api.test.operations.bulk_download_operation;

import com.microsoft.bingads.v10.api.test.operations.FakeBulkService;
import com.microsoft.bingads.v10.api.test.operations.TestProgress;
import com.microsoft.bingads.v10.bulk.BulkDownloadOperation;
import com.microsoft.bingads.v10.bulk.BulkOperationStatus;
import com.microsoft.bingads.v10.bulk.DownloadStatus;
import com.microsoft.bingads.v10.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v10.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TrackTest extends BulkDownloadOperationTest {

    @Test
    public void pollsForStatusUntilCompletedAndReturnsCorrectStatusWhenCompleted() throws InterruptedException, ExecutionException {
        BulkDownloadOperation operation = createBulkDownloadOperation(10);
       
        FakeBulkService.setOnGetBulkDownloadStatus(new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest t) {
                assertEquals("request123", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetBulkDownloadStatusResponse(new Supplier<GetBulkDownloadStatusResponse>() {

            Integer pollNumber = 1;

            @Override
            public GetBulkDownloadStatusResponse get() {
                switch (pollNumber++) {
                    case 1:
                        return createStatusResponse(1, "InProgress", null);
                    case 2:
                        return createStatusResponse(25, "InProgress", null);
                    case 3:
                        return createStatusResponse(100, "Completed", "http://downloadurl.com");
                    default:
                        fail("Unexpected polling attempt");
                        return null;
                }
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());

        TestProgress progress = new TestProgress();

        BulkOperationStatus<DownloadStatus> actualStatus = null;

        actualStatus = operation.trackAsync(progress, null).get();

        assertEquals(DownloadStatus.COMPLETED, actualStatus.getStatus());
        assertEquals(100, actualStatus.getPercentComplete());
        assertEquals("http://downloadurl.com", actualStatus.getResultFileUrl());

        List<Integer> expectedProgress = new ArrayList<Integer>();
        expectedProgress.add(1);
        expectedProgress.add(25);
        expectedProgress.add(100);

        progress.AssertReportedProgress(expectedProgress);
    }
}
