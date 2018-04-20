package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesNativeBidAdjustmentTest extends BulkCampaignTest {

    @Parameterized.Parameter
    public String datum;

    @Parameterized.Parameter(value = 1)
    public Integer expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"1", 1},
                        {"2147483647", Integer.MAX_VALUE},
                        {"0", 0},
                        {"-1", -1},
                        {"-2147483648", Integer.MIN_VALUE},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Bid Adjustment",
                datum,
                expectedResult,
                new Function<BulkCampaign, Integer>() {
                    @Override
                    public Integer apply(BulkCampaign c) {
                        return c.getCampaign().getNativeBidAdjustment();
                    }
                }
        );
    }
}
