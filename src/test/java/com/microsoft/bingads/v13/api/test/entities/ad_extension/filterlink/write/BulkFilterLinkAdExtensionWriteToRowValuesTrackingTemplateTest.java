package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;

@RunWith(Parameterized.class)
public class BulkFilterLinkAdExtensionWriteToRowValuesTrackingTemplateTest extends BulkFilterLinkAdExtensionTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkFilterLinkAdExtension, String>() {
            @Override
            public void accept(BulkFilterLinkAdExtension c, String v) {
                c.getFilterLinkAdExtension().setTrackingUrlTemplate(v);
            }
        });
    }
}
