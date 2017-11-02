package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkReviewAdExtensionReadFromRowValuesUrlTest extends BulkReviewAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Review Url string", "Review Url string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Url", this.datum, this.expectedResult, new Function<BulkReviewAdExtension, String>() {
            @Override
            public String apply(BulkReviewAdExtension c) {
                return c.getReviewAdExtension().getUrl();
            }
        });
    }
}
