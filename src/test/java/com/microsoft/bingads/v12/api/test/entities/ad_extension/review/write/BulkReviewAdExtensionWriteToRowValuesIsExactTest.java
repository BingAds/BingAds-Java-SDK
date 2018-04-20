package com.microsoft.bingads.v12.api.test.entities.ad_extension.review.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkReviewAdExtension;

public class BulkReviewAdExtensionWriteToRowValuesIsExactTest extends BulkReviewAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public Boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"True", true},
                {"False", false},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Is Exact", this.datum, this.expectedResult, new BiConsumer<BulkReviewAdExtension, Boolean>() {
            @Override
            public void accept(BulkReviewAdExtension c, Boolean v) {
                c.getReviewAdExtension().setIsExact(v);
            }
        });
    }
}
