package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProductPartition;

public class WriteStatusTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public AdGroupCriterionStatus propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", AdGroupCriterionStatus.ACTIVE},
                {"Paused", AdGroupCriterionStatus.PAUSED},
                {"Deleted", AdGroupCriterionStatus.DELETED},
                {null, null}
        });
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Status",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, AdGroupCriterionStatus v) {
                        ProductPartition criterion = new ProductPartition();

                        AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        c.getAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Status",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, AdGroupCriterionStatus>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, AdGroupCriterionStatus v) {
                        ProductPartition criterion = new ProductPartition();

                        AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        c.getAdGroupCriterion().setStatus(v);
                    }
                }
        );
    }
}
