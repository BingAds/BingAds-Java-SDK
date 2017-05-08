package com.microsoft.bingads.v11.api.test.entities.ads.appInstall.read;

import com.microsoft.bingads.v11.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppInstallAd;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkAppInstallAdReadFromRowValuesAppPlatformTest extends BulkAppInstallAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"App platform string", "App platform string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("App Platform", this.datum, this.expectedResult, new Function<BulkAppInstallAd, String>() {
            @Override
            public String apply(BulkAppInstallAd c) {
                return c.getAppInstallAd().getAppPlatform();
            }
        });
    }
}
