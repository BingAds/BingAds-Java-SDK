package com.microsoft.bingads.api.test.entities.campaign.write;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesNativeBidAdjustmentTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public Integer propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"1", 1},
                        {"2147483647", Integer.MAX_VALUE},
                        {"0", 0},
                        {"-1", -1},
                        {"-2147483648", Integer.MIN_VALUE},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid Adjustment",
                this.datum,
                this.propertyValue,
                new BiConsumer<BulkCampaign, Integer>() {
                    @Override
                    public void accept(BulkCampaign c, Integer v) {
                        c.getCampaign().setNativeBidAdjustment(v);
                    }
                }
        );
    }
}
