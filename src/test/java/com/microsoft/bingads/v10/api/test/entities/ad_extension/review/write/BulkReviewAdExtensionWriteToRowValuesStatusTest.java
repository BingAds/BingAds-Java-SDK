package com.microsoft.bingads.v10.api.test.entities.ad_extension.review.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkReviewAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkReviewAdExtensionWriteToRowValuesStatusTest extends BulkReviewAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", AdExtensionStatus.ACTIVE},
                {"Deleted", AdExtensionStatus.DELETED},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkReviewAdExtension, AdExtensionStatus>() {
            @Override
            public void accept(BulkReviewAdExtension c, AdExtensionStatus v) {
                c.getReviewAdExtension().setStatus(v);
            }
        });
    }
}
