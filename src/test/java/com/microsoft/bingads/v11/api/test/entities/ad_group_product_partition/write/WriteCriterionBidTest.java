package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v11.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class WriteCriterionBidTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public FixedBid propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	FixedBid withValue = new FixedBid();
        withValue.setAmount(12.34);

        FixedBid zeroValue = new FixedBid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"delete_value", zeroValue},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, FixedBid>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, FixedBid v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setCriterionBid(v);
                    }
                }
        );
    }

}
