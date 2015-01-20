package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetWriteToRowValuesStatusTest extends BulkCampaignDeviceOsTargetBidTest {

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
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkCampaignDeviceOsTargetBid, Status>() {
            @Override
            public void accept(BulkCampaignDeviceOsTargetBid c, Status v) {
                c.setStatus(v);
            }
        });
    }        
}
