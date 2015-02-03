package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetBidWriteToRowValuesToHourTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public int propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"5", 5}            
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("To Hour", this.datum, this.propertyValue, new BiConsumer<BulkCampaignDayTimeTargetBid, Integer>() {
            @Override
            public void accept(BulkCampaignDayTimeTargetBid c, Integer v) {
                c.getDayTimeTargetBid().setToHour(v);
            }
        });
    }
}
