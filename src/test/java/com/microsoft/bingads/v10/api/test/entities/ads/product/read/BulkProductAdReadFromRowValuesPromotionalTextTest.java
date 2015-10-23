package com.microsoft.bingads.v10.api.test.entities.ads.product.read;

import com.microsoft.bingads.v10.api.test.entities.ads.product.BulkProductAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkProductAd;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkProductAdReadFromRowValuesPromotionalTextTest extends BulkProductAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Text 1", "Test Text 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Promotion", this.datum, this.expectedResult, new Function<BulkProductAd, String>() {
            @Override
            public String apply(BulkProductAd c) {
                return c.getProductAd().getPromotionalText();
            }
        });
    }
}
