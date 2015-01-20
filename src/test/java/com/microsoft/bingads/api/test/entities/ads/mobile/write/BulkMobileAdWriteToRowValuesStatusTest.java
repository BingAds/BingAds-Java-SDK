package com.microsoft.bingads.api.test.entities.ads.mobile.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.campaignmanagement.AdStatus;

@RunWith(Parameterized.class)
public class BulkMobileAdWriteToRowValuesStatusTest extends BulkMobileAdTest {

    @Parameter(value = 1)
    public AdStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdStatus.ACTIVE},
            {"Paused", AdStatus.PAUSED},
            {"Inactive", AdStatus.INACTIVE},
            {"Deleted", AdStatus.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<AdStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkMobileAd, AdStatus>() {
            @Override
            public void accept(BulkMobileAd c, AdStatus v) {
                c.getMobileAd().setStatus(v);
            }
        });
    }
}
