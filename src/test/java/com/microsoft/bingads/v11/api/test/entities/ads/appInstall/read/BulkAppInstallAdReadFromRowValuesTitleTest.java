package com.microsoft.bingads.v11.api.test.entities.ads.appInstall.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppInstallAd;

@RunWith(Parameterized.class)
public class BulkAppInstallAdReadFromRowValuesTitleTest extends BulkAppInstallAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Title 1", "Test Title 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Title", this.datum, this.expectedResult, new Function<BulkAppInstallAd, String>() {
            @Override
            public String apply(BulkAppInstallAd c) {
                return c.getAppInstallAd().getTitle();
            }
        });
    }
}
