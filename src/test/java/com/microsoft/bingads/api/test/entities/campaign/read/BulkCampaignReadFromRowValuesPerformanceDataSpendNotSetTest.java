package com.microsoft.bingads.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.bulk.entities.PerformanceData;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesPerformanceDataSpendNotSetTest extends BulkCampaignTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {""},
            {null}
        });
    }

    @Test
    public void testRead() {
        this.<PerformanceData>testReadProperty("Spend", this.datum, null, new Function<BulkCampaign, PerformanceData>() {
            @Override
            public PerformanceData apply(BulkCampaign c) {
                return c.getPerformanceData();
            }
        });
    }
}
