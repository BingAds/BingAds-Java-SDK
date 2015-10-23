package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetReadFromRowValuesFromHourTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"5", 5}            
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("From Hour", this.datum, this.expectedResult, new Function<BulkCampaignDayTimeTargetBid, Integer>() {
            @Override
            public Integer apply(BulkCampaignDayTimeTargetBid c) {
                return c.getDayTimeTargetBid().getFromHour();
            }
        });
    }
}
