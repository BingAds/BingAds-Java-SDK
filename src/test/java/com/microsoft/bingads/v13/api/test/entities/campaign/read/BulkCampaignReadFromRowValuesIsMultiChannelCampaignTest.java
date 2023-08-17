package com.microsoft.bingads.v13.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesIsMultiChannelCampaignTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
        	{"False", false},
            {"True", true},
            {"", false}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Is Multi Channel Campaign", this.datum, this.expectedResult, new Function<BulkCampaign, Boolean>() {
            @Override
            public Boolean apply(BulkCampaign c) {
                return c.getIsMultiChannelCampaign();
            }
        });
    }
}
