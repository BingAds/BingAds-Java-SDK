package com.microsoft.bingads.api.test.entities.targets.campaign.bids.age.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.age.BulkCampaignAgeTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.campaignmanagement.AgeRange;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignAgeTargetReadFromRowValuesAgeRangeTest extends BulkCampaignAgeTargetBidTest {

    @Parameter(value = 1)
    public AgeRange expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"EighteenToTwentyFive", AgeRange.EIGHTEEN_TO_TWENTY_FIVE},
            {"TwentyFiveToThirtyFive", AgeRange.TWENTY_FIVE_TO_THIRTY_FIVE},
            {"ThirtyFiveToFifty", AgeRange.THIRTY_FIVE_TO_FIFTY},
            {"FiftyToSixtyFive", AgeRange.FIFTY_TO_SIXTY_FIVE},
            {"SixtyFiveAndAbove", AgeRange.SIXTY_FIVE_AND_ABOVE}
        });
    }

    @Test
    public void testRead() {
        this.<AgeRange>testReadProperty("Target", this.datum, this.expectedResult, new Function<BulkCampaignAgeTargetBid, AgeRange>() {
            @Override
            public AgeRange apply(BulkCampaignAgeTargetBid c) {
                return c.getAgeTargetBid().getAge();
            }
        });
    }        
}
