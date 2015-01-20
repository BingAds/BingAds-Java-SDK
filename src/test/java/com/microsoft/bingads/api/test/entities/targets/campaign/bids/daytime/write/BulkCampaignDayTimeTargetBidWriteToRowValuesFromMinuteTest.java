package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.api.test.entities.target.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Minute;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetBidWriteToRowValuesFromMinuteTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Minute propertyValue;

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
    public void testWrite() {
        this.<Minute>testWriteProperty("From Minute", this.datum, this.propertyValue, new BiConsumer<BulkCampaignDayTimeTargetBid, Minute>() {
            @Override
            public void accept(BulkCampaignDayTimeTargetBid c, Minute v) {
                c.getDayTimeTargetBid().setFromMinute(v);
            }
        });
    }
}
