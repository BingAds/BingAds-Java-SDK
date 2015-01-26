package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.BulkCampaignRadiusTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusTargetReadFromRowValuesUnitTest extends BulkCampaignRadiusTargetBidTest {

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
    public void testRead() {
        this.<DistanceUnit>testReadProperty("Unit", this.datum, this.expectedResult, new Function<BulkCampaignRadiusTargetBid, DistanceUnit>() {
            @Override
            public DistanceUnit apply(BulkCampaignRadiusTargetBid c) {
                return c.getRadiusTargetBid().getRadiusUnit();
            }
        });
    }        
}
