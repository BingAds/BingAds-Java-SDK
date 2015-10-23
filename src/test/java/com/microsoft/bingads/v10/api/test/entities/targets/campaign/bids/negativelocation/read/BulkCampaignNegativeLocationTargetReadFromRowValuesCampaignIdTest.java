package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.negativelocation.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.negativelocation.BulkCampaignNegativeLocationTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeLocationTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationTargetReadFromRowValuesCampaignIdTest extends BulkCampaignNegativeLocationTargetBidTest {

    @Parameter(value = 1)
    public Long expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkCampaignNegativeLocationTargetBid, Long>() {
            @Override
            public Long apply(BulkCampaignNegativeLocationTargetBid c) {
                return c.getCampaignId();
            }
        });
    }
}
