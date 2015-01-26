package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.api.test.entities.target.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Day;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetBidWriteToRowValuesDayTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Day propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Monday", Day.MONDAY},
            {"Tuesday", Day.TUESDAY},
            {"Wednesday", Day.WEDNESDAY},
            {"Thursday", Day.THURSDAY},
            {"Friday", Day.FRIDAY},
            {"Saturday", Day.SATURDAY},
            {"Sunday", Day.SUNDAY},
        });
    }

    @Test
    public void testWrite() {
        this.<Day>testWriteProperty("Target", this.datum, this.propertyValue, new BiConsumer<BulkCampaignDayTimeTargetBid, Day>() {
            @Override
            public void accept(BulkCampaignDayTimeTargetBid c, Day v) {
                c.getDayTimeTargetBid().setDay(v);
            }
        });
    }
}
