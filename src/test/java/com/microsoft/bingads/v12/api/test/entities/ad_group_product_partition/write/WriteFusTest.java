package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProductPartition;

public class WriteFusTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                    {"delete_value", ""},
                    {null, null},
                    {"Final Url Suffix", "Final Url Suffix"},
                    {"?src=bing&param=123", "?src=bing&param=123"},
                }
        );
    }


    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Final Url Suffix",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, String>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, String v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);
                        adGroupCriterion.setFinalUrlSuffix(v);
                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);
                    }
                }
        );
    }
}
