package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.BulkCampaignRadiusTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusTargetWriteToRowValuesBidAdjustmentTest extends BulkCampaignRadiusTargetBidTest {

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
        this.<Integer>testWriteProperty("Bid Adjustment", this.datum, this.expectedResult, new BiConsumer<BulkCampaignRadiusTargetBid, Integer>() {
            @Override
            public void accept(BulkCampaignRadiusTargetBid c, Integer value) {
                c.getRadiusTargetBid().setBidAdjustment(value);
            }
        });
    }
}
