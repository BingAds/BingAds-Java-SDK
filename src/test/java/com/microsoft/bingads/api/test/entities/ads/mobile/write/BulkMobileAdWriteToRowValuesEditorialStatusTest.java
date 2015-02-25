package com.microsoft.bingads.api.test.entities.ads.mobile.write;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.campaignmanagement.AdEditorialStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkMobileAdWriteToRowValuesEditorialStatusTest extends BulkMobileAdTest {

    @Parameter(value = 1)
    public AdEditorialStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdEditorialStatus.ACTIVE},
            {"ActiveLimited", AdEditorialStatus.ACTIVE_LIMITED},
            {"Disapproved", AdEditorialStatus.DISAPPROVED},
            {"Inactive", AdEditorialStatus.INACTIVE},
            {null, null}});
    }

    @Test
    public void testWrite() {
        this.<AdEditorialStatus>testWriteProperty("Editorial Status", this.datum, this.propertyValue, new BiConsumer<BulkMobileAd, AdEditorialStatus>() {
            @Override
            public void accept(BulkMobileAd c, AdEditorialStatus v) {
                c.getMobileAd().setEditorialStatus(v);
            }
        });
    }
}
