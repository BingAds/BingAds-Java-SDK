package com.microsoft.bingads.v13.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;

public class BulkCampaignReadAdScheduleUseSearcherTimeZone extends BulkCampaignTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"false", false},
            {"true", true},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Ad Schedule Use Searcher Time Zone", this.datum, this.expectedResult, new Function<BulkCampaign, Boolean>() {
            @Override
            public Boolean apply(BulkCampaign c) {
                return c.getCampaign().getAdScheduleUseSearcherTimeZone();
            }
        });
    }
}
