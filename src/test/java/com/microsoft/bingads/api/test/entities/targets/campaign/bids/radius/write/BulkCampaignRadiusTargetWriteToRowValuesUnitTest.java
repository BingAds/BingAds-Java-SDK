package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.BulkCampaignRadiusTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusTargetWriteToRowValuesUnitTest extends BulkCampaignRadiusTargetBidTest {

    @Parameter(value = 1)
    public DistanceUnit expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Kilometers", DistanceUnit.KILOMETERS},
            {"Miles", DistanceUnit.MILES}
        });
    }

    @Test
    public void testWrite() {
        this.<DistanceUnit>testWriteProperty("Unit", this.datum, this.expectedResult, new BiConsumer<BulkCampaignRadiusTargetBid, DistanceUnit>() {
            @Override
            public void accept(BulkCampaignRadiusTargetBid c, DistanceUnit v) {
                c.getRadiusTargetBid().setRadiusUnit(v);
            }
        });
    }        
}
