package com.microsoft.bingads.v13.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;

public class BulkCampaignReadFromRowValuesDestinationChannelTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"MicrosoftAdvertising", "MicrosoftAdvertising"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Destination Channel", this.datum, this.expectedResult, new Function<BulkCampaign, String>() {
            @Override
            public String apply(BulkCampaign c) {
                return c.getDestinationChannel();
            }
        });
    }
}
