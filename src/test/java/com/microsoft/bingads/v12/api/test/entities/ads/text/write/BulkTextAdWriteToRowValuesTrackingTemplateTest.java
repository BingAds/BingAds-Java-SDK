package com.microsoft.bingads.v12.api.test.entities.ads.text.write;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkTextAd;

@RunWith(Parameterized.class)
public class BulkTextAdWriteToRowValuesTrackingTemplateTest extends BulkTextAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
            {"delete_value", ""},
            {"template", "template"},
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, String>() {
            @Override
            public void accept(BulkTextAd c, String v) {
                c.getTextAd().setTrackingUrlTemplate(v);
            }
        });
    }
}
