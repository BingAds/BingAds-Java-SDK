package com.microsoft.bingads.api.test.operations.bulk_download_operation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

import com.microsoft.bingads.api.test.operations.FakeBulkService;
import com.microsoft.bingads.api.test.operations.TestProgress;
import com.microsoft.bingads.bulk.BulkDownloadOperation;
import com.microsoft.bingads.bulk.BulkOperationStatus;
import com.microsoft.bingads.bulk.DownloadStatus;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;
import java.util.ArrayList;
import java.util.List;

public class TrackTest extends BulkDownloadOperationTest {

    @Test
    public void pollsForStatusUntilCompletedAndReturnsCorrectStatusWhenCompleted() throws InterruptedException, ExecutionException {
        BulkDownloadOperation operation = createBulkDownloadOperation(10);
       
        FakeBulkService.setOnGetDetailedBulkDownloadStatus(new Consumer<GetDetailedBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetDetailedBulkDownloadStatusRequest t) {
                assertEquals("request123", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetDetailedBulkDownloadStatusResponse(new Supplier<GetDetailedBulkDownloadStatusResponse>() {

            Integer pollNumber = 1;

            @Override
            public GetDetailedBulkDownloadStatusResponse get() {
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
