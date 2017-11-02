package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkReviewAdExtensionWriteToRowValuesTextTest extends BulkReviewAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Display Text string", "Display Text string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Text", this.datum, this.expectedResult, new BiConsumer<BulkReviewAdExtension, String>() {
            @Override
            public void accept(BulkReviewAdExtension c, String v) {
                c.getReviewAdExtension().setText(v);
            }
        });
    }
}
