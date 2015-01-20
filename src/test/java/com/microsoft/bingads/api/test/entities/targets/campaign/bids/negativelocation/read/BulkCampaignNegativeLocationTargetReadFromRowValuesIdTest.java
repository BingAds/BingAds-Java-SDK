package com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.read.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.*;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeLocationTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationTargetReadFromRowValuesIdTest extends BulkCampaignNegativeLocationTargetBidTest {

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
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkCampaignNegativeLocationTargetBid, Long>() {
            @Override
            public Long apply(BulkCampaignNegativeLocationTargetBid c) {
                return c.getTargetId();
            }
        });
    }
}
