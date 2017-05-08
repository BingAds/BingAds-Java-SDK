package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesPerformanceDataSpendTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", 12.34},});
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Spend", this.datum, this.expectedResult, new Function<BulkCampaign, Double>() {
            @Override
            public Double apply(BulkCampaign c) {
                return c.getPerformanceData().getSpend();
            }
        });
    }
}
