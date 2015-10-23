package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.Minute;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
