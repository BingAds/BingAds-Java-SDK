package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.*;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusTargetWriteToRowValuesLatitudeTest extends BulkCampaignRadiusTargetBidTest {

    @Parameter(value = 1)
    public Double expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", 12.34},
        });
    }

    @Test
    public void testWrite() {
        this.<Double>testWriteProperty("Latitude", this.datum, this.expectedResult, new BiConsumer<BulkCampaignRadiusTargetBid, Double>() {
            @Override
            public void accept(BulkCampaignRadiusTargetBid c, Double v) {
                c.getRadiusTargetBid().setLatitudeDegrees(v);
            }
        });
    }
}
