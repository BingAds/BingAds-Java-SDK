package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetReadFromRowValuesStatusTest extends BulkCampaignDeviceOsTargetBidTest {

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
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignDeviceOsTargetBid, Status>() {
            @Override
            public Status apply(BulkCampaignDeviceOsTargetBid c) {
                return c.getStatus();
            }
        });
    }        
}
