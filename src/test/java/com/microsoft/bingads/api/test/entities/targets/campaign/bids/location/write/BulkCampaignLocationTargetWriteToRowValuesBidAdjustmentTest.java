package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetWriteToRowValuesBidAdjustmentTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123}            
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Bid Adjustment", this.datum, this.expectedResult, new BiConsumer<BulkCampaignLocationTargetBid, Integer>() {
            @Override
            public void accept(BulkCampaignLocationTargetBid c, Integer value) {
                c.setBidAdjustment(value);
            }
        });
    }
}
