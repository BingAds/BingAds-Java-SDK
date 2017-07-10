package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.read;

import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime.BulkAdGroupDayTimeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDayTimeCriterionReadBidAdjustmentTest extends BulkAdGroupDayTimeCriterionTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"0.58", 0.58},
                        {"0.0", 0.0},
                        {"", null},
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
                new Function<BulkAdGroupDayTimeCriterion, Double>() {
                    @Override
                    public Double apply(BulkAdGroupDayTimeCriterion c) {
                        return ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).getMultiplier();
                    }
                }
        );
    }
}
