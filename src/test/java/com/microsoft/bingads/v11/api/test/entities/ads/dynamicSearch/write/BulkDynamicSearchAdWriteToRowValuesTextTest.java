package com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch.BulkDynamicSearchAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkDynamicSearchAd;

@RunWith(Parameterized.class)
public class BulkDynamicSearchAdWriteToRowValuesTextTest extends BulkDynamicSearchAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Text", this.datum, this.propertyValue, new BiConsumer<BulkDynamicSearchAd, String>() {
            @Override
            public void accept(BulkDynamicSearchAd c, String v) {
                c.getDynamicSearchAd().setText(v);
            }
        });
    }
}
