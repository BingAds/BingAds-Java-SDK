package com.microsoft.bingads.v13.api.test.entities.ad_extension.review.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkReviewAdExtension;

@RunWith(Parameterized.class)
public class BulkReviewAdExtensionReadFromRowValuesVersionTest extends BulkReviewAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123},
                {"2147483647", 2147483647},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkReviewAdExtension, Integer>() {
            @Override
            public Integer apply(BulkReviewAdExtension c) {
                return c.getReviewAdExtension().getVersion();
            }
        });
    }
}
