package com.microsoft.bingads.v11.api.test.entities.ads.product.write;

import com.microsoft.bingads.v11.api.test.entities.ads.product.BulkProductAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkProductAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkProductAdWriteToRowValuesPromotionalTextTest extends BulkProductAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Test keyword text", "Test keyword text"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Promotion", this.datum, this.propertyValue, new BiConsumer<BulkProductAd, String>() {
            @Override
            public void accept(BulkProductAd c, String v) {
                c.getProductAd().setPromotionalText(v);
            }
        });
    }
}
