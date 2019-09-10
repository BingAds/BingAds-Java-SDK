package com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BidMultiplierComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;

@RunWith(Parameterized.class)
public class ReadCriterionBidAdjustmentTest extends BulkAdGroupProductPartitionTest {

    @Parameter(value = 1)
    public BidMultiplier expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	BidMultiplier withValue = new BidMultiplier();
        withValue.setMultiplier(12.34);

        BidMultiplier zeroValue = new BidMultiplier();
        zeroValue.setMultiplier(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"delete_value", zeroValue},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Bid Adjustment", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, BidMultiplier>() {
                    @Override
                    public BidMultiplier apply(BulkAdGroupProductPartition c) {
                        return ((BidMultiplier) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid());
                    }
                },
                new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                },
                new BidMultiplierComparer()
        );
    }
}
