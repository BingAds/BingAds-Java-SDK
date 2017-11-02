package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkReviewAdExtensionReadFromRowValuesStatusTest extends BulkReviewAdExtensionTest {

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
    public void testRead() {
        this.testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkReviewAdExtension, AdExtensionStatus>() {
            @Override
            public AdExtensionStatus apply(BulkReviewAdExtension c) {
                return c.getReviewAdExtension().getStatus();
            }
        });
    }
}
