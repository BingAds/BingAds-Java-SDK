package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.location.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetWriteToRowValuesIdTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public Long expectedResult;
    
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
        this.<Long>testWriteProperty("Id", this.datum, this.expectedResult, new BiConsumer<BulkCampaignLocationTargetBid, Long>() {
            @Override
            public void accept(BulkCampaignLocationTargetBid c, Long v) {
                c.setTargetId(v);
            }
        });
    }
}
