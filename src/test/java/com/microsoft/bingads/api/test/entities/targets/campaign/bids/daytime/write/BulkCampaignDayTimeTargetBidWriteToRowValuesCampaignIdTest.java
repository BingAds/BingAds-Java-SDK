package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.api.test.entities.target.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetBidWriteToRowValuesCampaignIdTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {        
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},            
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignDayTimeTargetBid, Long>() {
            @Override
            public void accept(BulkCampaignDayTimeTargetBid c, Long v) {
                c.setCampaignId(v);
            }
        });
    }
}
