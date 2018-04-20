package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;

public class BulkReviewAdExtensionWriteToRowValuesSourceTest extends BulkReviewAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Display Source string", "Display Source string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Source", this.datum, this.expectedResult, new BiConsumer<BulkReviewAdExtension, String>() {
            @Override
            public void accept(BulkReviewAdExtension c, String v) {
                c.getReviewAdExtension().setSource(v);
            }
        });
    }
}
