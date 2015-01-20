package com.microsoft.bingads.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesTimeZoneTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Time Zone String", "Time Zone String"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Time Zone", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setTimeZone(v);
            }
        });
    }
}
