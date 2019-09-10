package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProductPartition;

public class WriteCriterionBidAdjustmentTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public BidMultiplier propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	BidMultiplier withValue = new BidMultiplier();
        withValue.setMultiplier(12.34);

        BidMultiplier zeroValue = new BidMultiplier();
        zeroValue.setMultiplier(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"0.0", zeroValue},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid Adjustment",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, BidMultiplier>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, BidMultiplier v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
                        adGroupCriterion.setId(100L);
                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setCriterionBid(v);
                    }
                }
        );
    }

}
