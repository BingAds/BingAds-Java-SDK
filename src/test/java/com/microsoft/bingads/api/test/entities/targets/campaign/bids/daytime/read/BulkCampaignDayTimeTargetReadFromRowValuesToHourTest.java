package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.read;

import com.microsoft.bingads.api.test.entities.target.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetReadFromRowValuesToHourTest extends BulkCampaignDayTimeTargetBidTest {

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
        this.<Integer>testReadProperty("To Hour", this.datum, this.expectedResult, new Function<BulkCampaignDayTimeTargetBid, Integer>() {
            @Override
            public Integer apply(BulkCampaignDayTimeTargetBid c) {
                return c.getDayTimeTargetBid().getToHour();
            }
        });
    }
}
