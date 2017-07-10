package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.read;

import com.microsoft.bingads.v11.api.test.entities.FixedBidComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.FixedBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(Parameterized.class)
public class BulkAdGroupDynamicSearchAdTargetReadCriterionBidTest extends BulkAdGroupDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public FixedBid expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        FixedBid withValue = new FixedBid();
        withValue.setAmount(12.34);

        FixedBid zeroValue = new FixedBid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"0.0", zeroValue},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Bid", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupDynamicSearchAdTarget, FixedBid>() {
                    @Override
                    public FixedBid apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return ((FixedBid) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid());
                    }
                },
                new Supplier<BulkAdGroupDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupDynamicSearchAdTarget get() {
                        return new BulkAdGroupDynamicSearchAdTarget();
                    }
                },
                new FixedBidComparer()
        );
    }
}
