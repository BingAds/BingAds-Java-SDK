package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read;

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
import com.microsoft.bingads.v12.api.test.entities.FixedBidComparer;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.FixedBid;

@RunWith(Parameterized.class)
public class ReadCriterionBidTest extends BulkAdGroupProductPartitionTest {

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
                        {"delete_value", zeroValue},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Bid", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, FixedBid>() {
                    @Override
                    public FixedBid apply(BulkAdGroupProductPartition c) {
                        return ((FixedBid) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid());
                    }
                },
                new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                },
                new FixedBidComparer()
        );
    }
}
