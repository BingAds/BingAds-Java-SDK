package com.microsoft.bingads.api.test.entities.ads.text.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.bulk.entities.BulkTextAd;

@RunWith(Parameterized.class)
public class BulkTextAdWriteToRowValuesDestinationUrlTest extends BulkTextAdTest {

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
        this.<String>testWriteProperty("Destination Url", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, String>() {
            @Override
            public void accept(BulkTextAd c, String v) {
                c.getTextAd().setDestinationUrl(v);
            }
        });
    }
}
