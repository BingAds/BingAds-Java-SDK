package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Minute;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetReadFromRowValuesToMinuteTest extends BulkCampaignDayTimeTargetBidTest {

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
        this.<Minute>testReadProperty("To Minute", this.datum, this.expectedResult, new Function<BulkCampaignDayTimeTargetBid, Minute>() {
            @Override
            public Minute apply(BulkCampaignDayTimeTargetBid c) {
                return c.getDayTimeTargetBid().getToMinute();
            }
        });
    }
}
