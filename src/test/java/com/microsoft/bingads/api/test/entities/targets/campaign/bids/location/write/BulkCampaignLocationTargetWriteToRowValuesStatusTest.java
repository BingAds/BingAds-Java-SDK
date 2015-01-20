package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetWriteToRowValuesStatusTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public Status expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},            
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkCampaignLocationTargetBid, Status>() {
            @Override
            public void accept(BulkCampaignLocationTargetBid c, Status v) {
                c.setStatus(v);
            }
        });
    }        
}
