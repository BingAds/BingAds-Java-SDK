package com.microsoft.bingads.v10.api.test.entities.ads.text.write;

import com.microsoft.bingads.v10.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v10.campaignmanagement.AdEditorialStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkTextAdWriteToRowValuesEditorialStatusTest extends BulkTextAdTest {

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
        this.<AdEditorialStatus>testWriteProperty("Editorial Status", this.datum, this.propertyValue, new BiConsumer<BulkTextAd, AdEditorialStatus>() {
            @Override
            public void accept(BulkTextAd c, AdEditorialStatus v) {
                c.getTextAd().setEditorialStatus(v);
            }
        });
    }
}
