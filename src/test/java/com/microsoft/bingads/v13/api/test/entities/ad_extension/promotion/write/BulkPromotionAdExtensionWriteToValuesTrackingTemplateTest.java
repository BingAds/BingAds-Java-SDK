package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;

@RunWith(Parameterized.class)
public class BulkPromotionAdExtensionWriteToValuesTrackingTemplateTest extends BulkPromotionAdExtensionTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, String>() {
            @Override
            public void accept(BulkPromotionAdExtension c, String v) {
                c.getPromotionAdExtension().setTrackingUrlTemplate(v);
            }
        });
    }
}
