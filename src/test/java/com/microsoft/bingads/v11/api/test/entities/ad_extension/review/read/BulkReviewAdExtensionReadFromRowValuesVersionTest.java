package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

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
