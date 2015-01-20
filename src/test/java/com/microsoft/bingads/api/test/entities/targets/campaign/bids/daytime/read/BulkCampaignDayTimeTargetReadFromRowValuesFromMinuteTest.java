package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.read;

import com.microsoft.bingads.api.test.entities.target.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Minute;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetReadFromRowValuesFromMinuteTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Minute expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"0", Minute.ZERO},
            {"15", Minute.FIFTEEN},
            {"30", Minute.THIRTY},
            {"45", Minute.FORTY_FIVE}
        });
    }

    @Test
    public void testRead() {
        this.<Minute>testReadProperty("From Minute", this.datum, this.expectedResult, new Function<BulkCampaignDayTimeTargetBid, Minute>() {
            @Override
            public Minute apply(BulkCampaignDayTimeTargetBid c) {
                return c.getDayTimeTargetBid().getFromMinute();
            }
        });
    }
}
