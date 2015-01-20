package com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.*;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeLocationTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationTargetWriteToRowValuesIdTest extends BulkCampaignNegativeLocationTargetBidTest {

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
        this.<Long>testWriteProperty("Id", this.datum, this.expectedResult, new BiConsumer<BulkCampaignNegativeLocationTargetBid, Long>() {
            @Override
            public void accept(BulkCampaignNegativeLocationTargetBid c, Long v) {
                c.setTargetId(v);
            }
        });
    }
}
