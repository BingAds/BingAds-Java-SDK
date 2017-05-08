package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.bulk.entities.PerformanceData;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
