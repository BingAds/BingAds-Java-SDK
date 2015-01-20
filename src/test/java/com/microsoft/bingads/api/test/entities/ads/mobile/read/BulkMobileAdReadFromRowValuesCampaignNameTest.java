package com.microsoft.bingads.api.test.entities.ads.mobile.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;

public class BulkMobileAdReadFromRowValuesCampaignNameTest extends BulkMobileAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup 1", "Test AdGroup 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkMobileAd, String>() {
            @Override
            public String apply(BulkMobileAd c) {
                return c.getCampaignName();
            }
        });
    }
}
