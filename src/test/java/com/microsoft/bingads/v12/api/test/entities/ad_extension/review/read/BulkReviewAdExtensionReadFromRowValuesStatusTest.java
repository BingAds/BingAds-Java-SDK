package com.microsoft.bingads.v12.api.test.entities.ad_extension.review.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkReviewAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.AdExtensionStatus;

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
