package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.campaignmanagement.IntentOption;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetReadFromRowValuesPhysicalIntentTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public IntentOption expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"PeopleIn", IntentOption.PEOPLE_IN},
            {"PeopleInOrSearchingForOrViewingPages", IntentOption.PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES},
            {"PeopleSearchingForOrViewingPages", IntentOption.PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES}
        });
    }

    @Test
    public void testRead() {
        this.<IntentOption>testReadProperty("Physical Intent", this.datum, this.expectedResult, new Function<BulkCampaignLocationTargetBid, IntentOption>() {
            @Override
            public IntentOption apply(BulkCampaignLocationTargetBid c) {
                return c.getIntentOption();
            }
        });
    }        
}
