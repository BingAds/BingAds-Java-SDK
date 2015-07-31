package com.microsoft.bingads.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class WritePartitionTypeTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public ProductPartitionType propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Subdivision", ProductPartitionType.SUBDIVISION},
                {"Unit", ProductPartitionType.UNIT},
                {null, null}
        });
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, ProductPartitionType>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, ProductPartitionType v) {
                        ProductPartition criterion = new ProductPartition();

                        AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        criterion.setPartitionType(v);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, ProductPartitionType>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, ProductPartitionType v) {
                        ProductPartition criterion = new ProductPartition();

                        AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        criterion.setPartitionType(v);
                    }
                }
        );
    }
}
