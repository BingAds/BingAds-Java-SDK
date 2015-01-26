package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetWriteToRowValuesDeviceNameTest extends BulkCampaignDeviceOsTargetBidTest {

    @Parameter(value = 1)
    public String expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Device 1", "Device 1"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Target", this.datum, this.expectedResult, new BiConsumer<BulkCampaignDeviceOsTargetBid, String>() {
            @Override
            public void accept(BulkCampaignDeviceOsTargetBid c, String v) {
                c.getDeviceOsTargetBid().setDeviceName(v);
            }
        });
    }
}
