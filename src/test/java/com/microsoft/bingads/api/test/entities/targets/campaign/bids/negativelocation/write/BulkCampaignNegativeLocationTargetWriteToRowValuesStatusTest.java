package com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.BulkCampaignNegativeLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeLocationTargetBid;
import com.microsoft.bingads.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationTargetWriteToRowValuesStatusTest extends BulkCampaignNegativeLocationTargetBidTest {

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
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkCampaignNegativeLocationTargetBid, Status>() {
            @Override
            public void accept(BulkCampaignNegativeLocationTargetBid c, Status v) {
                c.setStatus(v);
            }
        });
    }        
}
