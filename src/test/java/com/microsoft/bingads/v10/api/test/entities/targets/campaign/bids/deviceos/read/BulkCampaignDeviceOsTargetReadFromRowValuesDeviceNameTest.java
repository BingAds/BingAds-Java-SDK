package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetReadFromRowValuesDeviceNameTest extends BulkCampaignDeviceOsTargetBidTest {

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
    public void testRead() {
        this.<String>testReadProperty("Target", this.datum, this.expectedResult, new Function<BulkCampaignDeviceOsTargetBid, String>() {
            @Override
            public String apply(BulkCampaignDeviceOsTargetBid c) {
                return c.getDeviceOsTargetBid().getDeviceName();
            }
        });
    }        
}
