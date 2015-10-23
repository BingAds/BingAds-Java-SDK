package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.age.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.age.BulkCampaignAgeTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.AgeRange;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignAgeTargetWriteToRowValuesAgeRangeTest extends BulkCampaignAgeTargetBidTest {

    @Parameter(value = 1)
    public AgeRange expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"EighteenToTwentyFive", com.microsoft.bingads.v10.campaignmanagement.AgeRange.EIGHTEEN_TO_TWENTY_FIVE},
            {"TwentyFiveToThirtyFive", com.microsoft.bingads.v10.campaignmanagement.AgeRange.TWENTY_FIVE_TO_THIRTY_FIVE},
            {"ThirtyFiveToFifty", com.microsoft.bingads.v10.campaignmanagement.AgeRange.THIRTY_FIVE_TO_FIFTY},
            {"FiftyToSixtyFive", com.microsoft.bingads.v10.campaignmanagement.AgeRange.FIFTY_TO_SIXTY_FIVE},
            {"SixtyFiveAndAbove", com.microsoft.bingads.v10.campaignmanagement.AgeRange.SIXTY_FIVE_AND_ABOVE}
        });
    }

    @Test
    public void testWrite() {
        this.<AgeRange>testWriteProperty("Target", this.datum, this.expectedResult, new BiConsumer<BulkCampaignAgeTargetBid, AgeRange>() {
            @Override
            public void accept(BulkCampaignAgeTargetBid c, AgeRange v) {
                c.getAgeTargetBid().setAge(v);
            }
        });
    }        
}
