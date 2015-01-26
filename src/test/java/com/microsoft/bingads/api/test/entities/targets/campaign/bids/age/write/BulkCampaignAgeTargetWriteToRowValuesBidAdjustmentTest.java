package com.microsoft.bingads.api.test.entities.targets.campaign.bids.age.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.age.BulkCampaignAgeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignAgeTargetWriteToRowValuesBidAdjustmentTest extends BulkCampaignAgeTargetBidTest {

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
        this.<Integer>testWriteProperty("Bid Adjustment", this.datum, this.expectedResult, new BiConsumer<BulkCampaignAgeTargetBid, Integer>() {
            @Override
            public void accept(BulkCampaignAgeTargetBid c, Integer value) {
                c.getAgeTargetBid().setBidAdjustment(value);
            }
        });
    }
}
