package com.microsoft.bingads.v10.api.test.entities.ads.text.write;

import com.microsoft.bingads.v10.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkTextAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkTextAdWriteToRowValuesDisplayUrlTest extends BulkTextAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"http://test.url", "http://test.url"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Display Url", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, String>() {
            @Override
            public void accept(BulkTextAd c, String v) {
                c.getTextAd().setDisplayUrl(v);
            }
        });
    }
}
