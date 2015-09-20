package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.radius.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.radius.BulkCampaignRadiusTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
