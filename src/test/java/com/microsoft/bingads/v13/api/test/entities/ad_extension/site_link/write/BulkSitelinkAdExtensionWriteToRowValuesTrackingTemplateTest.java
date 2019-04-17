package com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.site_link.BulkSitelinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSitelinkAdExtension;

@RunWith(Parameterized.class)
public class BulkSitelinkAdExtensionWriteToRowValuesTrackingTemplateTest extends BulkSitelinkAdExtensionTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkSitelinkAdExtension, String>() {
            @Override
            public void accept(BulkSitelinkAdExtension c, String v) {
                c.getSitelinkAdExtension().setTrackingUrlTemplate(v);
            }
        });
    }
}
