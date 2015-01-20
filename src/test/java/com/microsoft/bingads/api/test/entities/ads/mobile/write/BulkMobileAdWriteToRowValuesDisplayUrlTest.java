package com.microsoft.bingads.api.test.entities.ads.mobile.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;

@RunWith(Parameterized.class)
public class BulkMobileAdWriteToRowValuesDisplayUrlTest extends BulkMobileAdTest {

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
        this.<String>testWriteProperty("Display Url", this.datum, this.propertyValue, new BiConsumer<BulkMobileAd, String>() {
            @Override
            public void accept(BulkMobileAd c, String v) {
                c.getMobileAd().setDisplayUrl(v);
            }
        });
    }
}
