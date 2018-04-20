package com.microsoft.bingads.v12.api.test.entities.ads.appInstall.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppInstallAd;

@RunWith(Parameterized.class)
public class BulkAppInstallAdWriteToRowValuesTitleTest extends BulkAppInstallAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test ad title", "Test ad title"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Title", this.datum, this.propertyValue, new BiConsumer<BulkAppInstallAd, String>() {
            @Override
            public void accept(BulkAppInstallAd c, String v) {
                c.getAppInstallAd().setTitle(v);
            }
        });
    }
}
