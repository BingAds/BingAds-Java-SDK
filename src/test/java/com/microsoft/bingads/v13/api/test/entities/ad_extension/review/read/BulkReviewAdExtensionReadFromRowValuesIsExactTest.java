package com.microsoft.bingads.v13.api.test.entities.ad_extension.review.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkReviewAdExtension;

public class BulkReviewAdExtensionReadFromRowValuesIsExactTest extends BulkReviewAdExtensionTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"True", true},
                {"False", false}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Is Exact", this.datum, this.expectedResult, new Function<BulkReviewAdExtension, Boolean>() {
            @Override
            public Boolean apply(BulkReviewAdExtension c) {
                return c.getReviewAdExtension().getIsExact();
            }
        });
    }
}
