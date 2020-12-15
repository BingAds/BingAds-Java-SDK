package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.BulkFlyerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFlyerAdExtension;

@RunWith(Parameterized.class)
public class BulkFlyerAdExtensionWriteToRowValuesTrackingTemplateTest extends BulkFlyerAdExtensionTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkFlyerAdExtension, String>() {
            @Override
            public void accept(BulkFlyerAdExtension c, String v) {
                c.getFlyerAdExtension().setTrackingUrlTemplate(v);
            }
        });
    }
}
