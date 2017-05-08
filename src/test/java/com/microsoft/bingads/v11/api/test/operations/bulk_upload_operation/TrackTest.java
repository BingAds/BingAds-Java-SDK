package com.microsoft.bingads.v11.api.test.operations.bulk_upload_operation;

import com.microsoft.bingads.v11.api.test.operations.FakeBulkService;
import com.microsoft.bingads.v11.api.test.operations.TestProgress;
import com.microsoft.bingads.v11.bulk.BulkOperationStatus;
import com.microsoft.bingads.v11.bulk.BulkUploadOperation;
import com.microsoft.bingads.v11.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v11.bulk.UploadStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TrackTest extends BulkUploadOperationTest {

    @Test
    public void pollsForStatusUntilCompletedAndReturnsCorrectStatusWhenCompleted() throws InterruptedException, ExecutionException {
        BulkUploadOperation operation = createBulkUploadOperation(10);

        FakeBulkService.setGetBulkUploadStatusResponse(new Supplier<GetBulkUploadStatusResponse>() {

            Integer pollNumber = 1;

            @Override
            public GetBulkUploadStatusResponse get() {
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

        BulkOperationStatus<UploadStatus> actualStatus = operation.trackAsync(progress, null).get();

        assertEquals(UploadStatus.COMPLETED, actualStatus.getStatus());
        assertEquals(100, actualStatus.getPercentComplete());
        assertEquals("http://downloadurl.com", actualStatus.getResultFileUrl());

        List<Integer> expectedProgress = new ArrayList<Integer>();
        expectedProgress.add(1);
        expectedProgress.add(25);
        expectedProgress.add(100);

        progress.AssertReportedProgress(expectedProgress);
    }
}
