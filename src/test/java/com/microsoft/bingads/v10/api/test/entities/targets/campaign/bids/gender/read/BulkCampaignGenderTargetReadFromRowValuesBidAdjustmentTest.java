package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.BulkCampaignGenderTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignGenderTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignGenderTargetReadFromRowValuesBidAdjustmentTest extends BulkCampaignGenderTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123}            
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Bid Adjustment", this.datum, this.expectedResult, new Function<BulkCampaignGenderTargetBid, Integer>() {
            @Override
            public Integer apply(BulkCampaignGenderTargetBid c) {
                return c.getGenderTargetBid().getBidAdjustment();
            }
        });
    }
}
