package com.microsoft.bingads.v13.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImageAdExtension;

@RunWith(Parameterized.class)
public class BulkImageAdExtensionWriteToRowValuesTrackingTemplateTest extends BulkImageAdExtensionTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkImageAdExtension, String>() {
            @Override
            public void accept(BulkImageAdExtension c, String v) {
                c.getImageAdExtension().setTrackingUrlTemplate(v);
            }
        });
    }
}
