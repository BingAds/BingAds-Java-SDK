package com.microsoft.bingads.v11.api.test.entities.ad_extension.review.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.BulkReviewAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkReviewAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkReviewAdExtensionWriteToRowValuesUrlTest extends BulkReviewAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Display Url string", "Display Url string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Url", this.datum, this.expectedResult, new BiConsumer<BulkReviewAdExtension, String>() {
            @Override
            public void accept(BulkReviewAdExtension c, String v) {
                c.getReviewAdExtension().setUrl(v);
            }
        });
    }
}
