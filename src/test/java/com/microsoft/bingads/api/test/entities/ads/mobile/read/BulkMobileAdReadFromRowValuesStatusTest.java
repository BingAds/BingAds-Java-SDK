package com.microsoft.bingads.api.test.entities.ads.mobile.read;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.campaignmanagement.AdStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkMobileAdReadFromRowValuesStatusTest extends BulkMobileAdTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdStatus.ACTIVE},
            {"Deleted", AdStatus.DELETED},
            {"Inactive", AdStatus.INACTIVE},
            {"Paused", AdStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkMobileAd, AdStatus>() {
            @Override
            public AdStatus apply(BulkMobileAd c) {
                return c.getMobileAd().getStatus();
            }
        });
    }
}
