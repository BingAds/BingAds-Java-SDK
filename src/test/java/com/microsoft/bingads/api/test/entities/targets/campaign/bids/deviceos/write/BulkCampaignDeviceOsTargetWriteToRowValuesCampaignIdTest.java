package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.*;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetWriteToRowValuesCampaignIdTest extends BulkCampaignDeviceOsTargetBidTest {

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
        this.<Long>testWriteProperty("Parent Id", this.datum, this.expectedResult, new BiConsumer<BulkCampaignDeviceOsTargetBid, Long>() {
            @Override
            public void accept(BulkCampaignDeviceOsTargetBid c, Long v) {
                c.setCampaignId(v);
            }
        });
    }
}
