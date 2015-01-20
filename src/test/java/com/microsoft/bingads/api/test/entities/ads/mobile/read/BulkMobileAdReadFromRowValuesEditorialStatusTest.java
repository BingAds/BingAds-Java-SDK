package com.microsoft.bingads.api.test.entities.ads.mobile.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.campaignmanagement.AdEditorialStatus;

@RunWith(Parameterized.class)
public class BulkMobileAdReadFromRowValuesEditorialStatusTest extends BulkMobileAdTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdEditorialStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdEditorialStatus.ACTIVE},
            {"ActiveLimited", AdEditorialStatus.ACTIVE_LIMITED},
            {"Disapproved", AdEditorialStatus.DISAPPROVED},
            {"Inactive", AdEditorialStatus.INACTIVE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdEditorialStatus>testReadProperty("Editorial Status", this.datum, this.expectedResult, new Function<BulkMobileAd, AdEditorialStatus>() {
            @Override
            public AdEditorialStatus apply(BulkMobileAd c) {
                return c.getMobileAd().getEditorialStatus();
            }
        });
    }
}
