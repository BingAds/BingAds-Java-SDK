package com.microsoft.bingads.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class WriteCriterionBidTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public Bid propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
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
                new BiConsumer<BulkAdGroupProductPartition, Bid>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, Bid v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        FixedBid bid = new FixedBid();

                        bid.setBid(v);

                        adGroupCriterion.setCriterionBid(bid);
                    }
                }
        );
    }

}
