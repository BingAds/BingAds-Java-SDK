package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

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
