package com.microsoft.bingads.v13.api.test.entities.ads.appInstall.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppInstallAd;

public class BulkAppInstallAdWriteFromRowValuesAppPlatformTest extends BulkAppInstallAdTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"App Platform string", "App Platform string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("App Platform", this.datum, this.expectedResult, new BiConsumer<BulkAppInstallAd, String>() {
            @Override
            public void accept(BulkAppInstallAd c, String v) {
                c.getAppInstallAd().setAppPlatform(v);
            }
        });
    }
}
