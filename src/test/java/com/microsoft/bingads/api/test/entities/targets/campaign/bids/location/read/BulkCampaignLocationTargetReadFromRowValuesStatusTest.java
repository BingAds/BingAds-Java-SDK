package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetReadFromRowValuesStatusTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public Status expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignLocationTargetBid, Status>() {
            @Override
            public Status apply(BulkCampaignLocationTargetBid c) {
                return c.getStatus();
            }
        });
    }        
}
