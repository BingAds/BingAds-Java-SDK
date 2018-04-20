package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v12.campaignmanagement.Bid;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProductPartition;

public class WriteDestinationUrlTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"http://testDestUrl.com", "http://testDestUrl.com"},
                        {"delete_value", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Destination Url",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, String>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, String v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setDestinationUrl(v);
                    }
                }
        );
    }

}
