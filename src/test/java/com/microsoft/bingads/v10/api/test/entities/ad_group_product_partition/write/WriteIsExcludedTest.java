package com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.ProductPartition;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class WriteIsExcludedTest extends BulkAdGroupProductPartitionTest {

    @Parameterized.Parameter(value = 1)
    public Boolean propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"True", true},
                        {"False", false},
                }
        );
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Is Excluded",
                datum,
                propertyValue, new BiConsumer<BulkAdGroupProductPartition, Boolean>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, Boolean v) {
                        if (v) {
                            ProductPartition criterion = new ProductPartition();

                            AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                            adGroupCriterion.setCriterion(criterion);

                            c.setAdGroupCriterion(adGroupCriterion);
                        } else {
                            ProductPartition criterion = new ProductPartition();

                            AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                            adGroupCriterion.setCriterion(criterion);

                            c.setAdGroupCriterion(adGroupCriterion);
                        }
                    }
                }
        );
    }

}
