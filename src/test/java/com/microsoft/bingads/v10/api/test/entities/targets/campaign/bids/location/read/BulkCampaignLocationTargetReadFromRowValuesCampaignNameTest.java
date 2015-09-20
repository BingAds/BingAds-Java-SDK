package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.location.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetReadFromRowValuesCampaignNameTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public String expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Test Campaign 1", "Test Campaign 1"},            
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignLocationTargetBid, String>() {
            @Override
            public String apply(BulkCampaignLocationTargetBid c) {
                return c.getCampaignName();
            }
        });
    }
}
