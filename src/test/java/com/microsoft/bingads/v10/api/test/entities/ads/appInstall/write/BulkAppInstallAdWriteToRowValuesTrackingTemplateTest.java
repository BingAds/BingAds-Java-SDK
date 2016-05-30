package com.microsoft.bingads.v10.api.test.entities.ads.appInstall.write;


import com.microsoft.bingads.v10.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAppInstallAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAppInstallAdWriteToRowValuesTrackingTemplateTest extends BulkAppInstallAdTest {

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
        this.<String>testWriteProperty("Tracking Template", this.datum, this.propertyValue, new BiConsumer<BulkAppInstallAd, String>() {
            @Override
            public void accept(BulkAppInstallAd c, String v) {
                c.getAppInstallAd().setTrackingUrlTemplate(v);
            }
        });
    }
}
